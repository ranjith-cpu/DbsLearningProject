package com.example.demo.TransactionRepo;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.demo.TransactionModel.CustomerDetails;
import com.example.demo.TransactionModel.TerrorList;

public interface TerrorListRepo extends JpaRepository<TerrorList, Integer>{



	TerrorList findByraccountno(long accountno);

}
