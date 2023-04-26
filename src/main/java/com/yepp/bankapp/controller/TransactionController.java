package com.yepp.bankapp.controller;

import com.yepp.bankapp.model.Transaction;
import com.yepp.bankapp.model.User;
import com.yepp.bankapp.service.TransactionService;
import com.yepp.bankapp.service.TransactionServiceImpl;
import com.yepp.bankapp.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;


@CrossOrigin(origins = "http://localhost:4200/", exposedHeaders="Access-Control-Allow-Origin")
@RestController
public class TransactionController {
    @Autowired
    TransactionService transactionService;

    @Autowired
    UserService userService;

    @GetMapping("/transactions")
    public ResponseEntity<ResponseEntity<Transaction>> listTransaction(Principal principal) {
        User currentUser = userService.findUsersByName(principal.getName()).get(0);
        return new ResponseEntity(transactionService.
                listTransactions(currentUser.getId()), HttpStatus.OK);
    }

    @GetMapping("/transaction/{transactionId}")
    public ResponseEntity<Transaction> listTransactionById(@PathVariable Integer transactionId) {
        return new ResponseEntity(transactionService.findTransactionById(transactionId), HttpStatus.OK);
    }

//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public void redirect(HttpServletResponse httpResponse) throws Exception {
//
//        httpResponse.sendRedirect("/login");
//    }
}
