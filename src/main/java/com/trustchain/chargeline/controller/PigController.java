package com.trustchain.chargeline.controller;

import com.trustchain.chargeline.domain.*;
import com.trustchain.chargeline.solidity.Pig.Pig;
import com.trustchain.chargeline.util.ContractUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.admin.Admin;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tuples.generated.Tuple6;
import org.web3j.tx.ClientTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;
import org.web3j.tx.gas.DefaultGasProvider;

import java.math.BigInteger;

@Controller
public class PigController {

    @Autowired
    ContractUtil contractUtil;


    @RequestMapping({"/CreatePig"})
    @ResponseBody
    public JsonResult CreatePig(@RequestBody CreatPig creatpig)throws  Exception{
        JsonResult jsonResult  = new JsonResult();
        Pig pig = contractUtil.PigLoad();
        TransactionReceipt transactionReceipt = pig.createPig(BigInteger.valueOf(Long.parseLong(creatpig.getBreed())), BigInteger.valueOf(Long.parseLong(creatpig.getWeight())), BigInteger.valueOf(Long.parseLong(creatpig.getBigchainDB_id()))).send();
        return jsonResult;
        }

    @RequestMapping({"/ConfirmBuy"})
    @ResponseBody
    public JsonResult ConfirmBuy(@RequestBody ConfirmBuy confirmbuy)throws Exception{
        JsonResult jsonResult = new JsonResult();
        Pig pig = contractUtil.PigLoad();
        TransactionReceipt transactionReceipt = pig.confirmBuy(BigInteger.valueOf(Long.parseLong(confirmbuy.getToken_id())), BigInteger.valueOf(Long.parseLong(confirmbuy.getValue()))).send();
        return jsonResult;
    }

    @RequestMapping({"/Transfer"})
    @ResponseBody
    public JsonResult Transfer(@RequestBody Transfer transfer)throws Exception{
        JsonResult jsonResult = new JsonResult();
        Pig pig = contractUtil.PigLoad();
        TransactionReceipt transactionReceipt = pig.transfer(transfer.getTo(), BigInteger.valueOf(Long.parseLong(transfer.getToken_id()))).send();
        return jsonResult;
    }


    @RequestMapping({"/ChangeStatus"})
    @ResponseBody
    public JsonResult ChangeStatus(@RequestBody ChangeStatus changestatus)throws Exception{
        JsonResult jsonResult  = new JsonResult();
        Pig pig = contractUtil.PigLoad();
        TransactionReceipt transactionReceipt = pig.changeStatus(changestatus.getTo(), BigInteger.valueOf(Long.parseLong(changestatus.getToken_id())),BigInteger.valueOf(Long.parseLong(changestatus.getValue()))).send();
        return jsonResult;
    }


    @RequestMapping({"/BalanceOf"})
    @ResponseBody
    public JsonResult BalanceOf(@RequestBody BalanceOf balanceof)throws Exception{
        JsonResult jsonResult = new JsonResult();
        Pig pig = contractUtil.PigLoad();
        //
        return jsonResult;
    }


    @RequestMapping({"/GetPig"})
    @ResponseBody
    public JsonResult GetPig (@RequestBody GetPig getpig)throws Exception{
        JsonResult jsonResult = new JsonResult();
        Pig pig = contractUtil.PigLoad();
        Tuple6<String, BigInteger, BigInteger, BigInteger, BigInteger, BigInteger> a = pig.getPig(BigInteger.valueOf(Long.parseLong(getpig.getToken_id()))).send();
        return jsonResult;
    }

    

    public static void main(String[] args) throws Exception {
        Web3j web3j = Admin.build(new HttpService("http://192.168.188.132:8545"));
        TransactionManager clientTransactionManager = new ClientTransactionManager(web3j, "0x2d5d11df42a9c262430db7b3415cbb01cd3301bb");
        ContractGasProvider contractGasProvider = new DefaultGasProvider();

        Pig pig= (Pig) Pig.load("0x590e1784ed17db7067b8bb5c3528124ad4439461",web3j,clientTransactionManager,contractGasProvider.getGasPrice(),contractGasProvider.getGasLimit());
        TransactionReceipt receipt=pig.createPig(BigInteger.valueOf(115),BigInteger.valueOf(1), BigInteger.valueOf(222)).send();
        System.out.println(pig.totalSupply());

    }

}
