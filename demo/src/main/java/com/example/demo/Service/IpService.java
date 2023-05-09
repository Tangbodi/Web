package com.example.demo.Service;

import org.apache.commons.validator.routines.InetAddressValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.net.UnknownHostException;

@Service
public class IpService {
    private static final Logger logger = LoggerFactory.getLogger(IpService.class);
    private static final InetAddressValidator VALIDATOR = InetAddressValidator.getInstance();

    public boolean isValidInet4Address(String ip){
        return VALIDATOR.isValidInet4Address(ip);
    }
    public boolean isValidInet6Address(String ip){
        return VALIDATOR.isValidInet6Address(ip);
    }
}