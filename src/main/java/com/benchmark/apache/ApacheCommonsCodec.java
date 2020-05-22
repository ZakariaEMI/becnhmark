package com.benchmark.apache;

import org.apache.commons.codec.binary.Base64;

/**
 * @author ZakariaEMI
 * How to use some methods of Apache Common Codec
 */
public class ApacheCommonsCodec {

    public static void main(String[] args) {
        Base64 lBase64 = new Base64();
        String lStringToEncode = "First String";
        String lEncodedVersion = new String(lBase64.encode(lStringToEncode.getBytes()));
        String lDecodedVersion = new String(lBase64.decode(lEncodedVersion.getBytes()));

        System.out.println(lStringToEncode);
        System.out.println(lEncodedVersion);
        System.out.println(lDecodedVersion);
    }
}