package com.example.listing_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.listing_api.Model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    // Additional custom queries can be added here if needed
    
}
