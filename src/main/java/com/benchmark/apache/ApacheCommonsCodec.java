package com.benchmark.apache;

import org.apache.commons.codec.binary.Base64;

/**
 * @author ZakariaEMI
 * How to use some methods of Apache Common Codec
 */
public final class ApacheCommonsCodec {

    /**
     * Test some examples of apache common codec
     */
    public static void encode() {
        Base64 lBase64 = new Base64();
        String lStringToEncode = "First String";
        String lEncodedVersion = new String(lBase64.encode(lStringToEncode.getBytes()));
        String lDecodedVersion = new String(lBase64.decode(lEncodedVersion.getBytes()));
    }
}