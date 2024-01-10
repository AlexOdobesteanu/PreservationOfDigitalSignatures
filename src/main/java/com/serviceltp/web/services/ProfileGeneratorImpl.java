package com.serviceltp.web.services;

import com.serviceltp.web.base.*;
import com.serviceltp.web.services.ProfileGenerator;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ProfileGeneratorImpl extends ProfileGenerator {
    public PresProfileType getProfile(String type) throws URISyntaxException, ParseException {
        List<MdOperationType> opList= new ArrayList<MdOperationType>();
        //Added List of MdOperationType s
        opList.add(new MdOperationType("http://localhost:8080/RetrieveInfo", null,null, null,
                null, null, null, null, null));
        opList.add(new MdOperationType("http://localhost:8080/PreservePO", null,null, null,
                null, null, null, null, null));
        ///////////////////////////////////////////
        //Added list of MdPolicyType
        List<MdPolicyType> polList=new ArrayList<MdPolicyType>();

        polList.add(new MdPolicyType(new URI("http://uri.etsi.org/19512/policy/preservation-evidence"),
                new MdPolicyByRefType("http://uri.etsi.org/19512/policy/preservation-evidence","http://uri.etsi.org/19512/policy/preservation-evidence",null)
                ,null, null, null, null));
        //////////////////////////////////////////
        //Added list of ExtensionType
        List<MdExtensionType> extList= new ArrayList<MdExtensionType>();
        extList.add(new MdExtensionType("#/definitions/md-ExtensionType","#/definitions/md-ExtensionType",null));
        //////////////////////////////////////////
        // Added Preservation goal
        List<String> pGoalList= new ArrayList<String>();
        pGoalList.add( "http://uri.etsi.org/19512/goal/pds");
        ///////////////////////////
        //Added evidence format
        List<MdFormatType> ef = new ArrayList<MdFormatType>();
        ef.add(new MdFormatType("http://uri.etsi.org/ades/PAdES/document-time-stamp",null,null,null,null,
                null,null,null));
        ///////////////////////////
        if(type.equals("active"))
        {

            //Create PresProfileValidityPeriodType
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

            String dateInString = "7-Jun-2020";
            Date dateFrom = formatter.parse(dateInString);
            Date dateUntil=formatter.parse("7-Jun-2030");
            PresProfileValidityPeriodType validity=new PresProfileValidityPeriodType(dateFrom,dateUntil,null);


            PresProfileType prof=new PresProfileType("http://link.catre.identifier1",null, null,opList,polList,extList,
                    "http://uri.etsi.org/19512/scheme/pds+wos+aug",validity,"WithoutStorage",pGoalList,ef, "One Year", null,null);
            return prof;
        }
        else {
            //Create PresProfileValidityPeriodType
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

            String dateInString = "7-Jun-2020";
            Date dateFrom = formatter.parse(dateInString);
            Date dateUntil=formatter.parse("7-Jun-2021");
            PresProfileValidityPeriodType validity=new PresProfileValidityPeriodType(dateFrom,dateUntil,null);

            PresProfileType prof=new PresProfileType("http://link.catre.identifier2",null, null,opList,polList,extList,
                    "http://uri.etsi.org/19512/scheme/pds+wos+aug",validity,"WithoutStorage",pGoalList,ef, "One Year", null,null);
            return prof;
        }
    }
}
