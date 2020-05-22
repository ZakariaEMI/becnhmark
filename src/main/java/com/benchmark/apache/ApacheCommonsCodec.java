package com.benchmark.apache;

import org.apache.commons.codec.binary.Base64;

/**
 * @author ZakariaEMI
 * How to use some methods of Apache Commons Codec
 */
public final class ApacheCommonsCodec {

    public ApacheCommonsCodec() {
        throw new UnsupportedOperationException();
    }

    /**
     * Test some examples of apache commons codec
     */
    public static void encode() {
        Base64 lBase64 = new Base64();
        String lStringToEncode = "First String";
        String lEncodedVersion = new String(lBase64.encode(lStringToEncode.getBytes()));
        String lDecodedVersion = new String(lBase64.decode(lEncodedVersion.getBytes()));
    }
}