package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class ab
{
  private static String a = "fdea30d4-c4f3-11e7-ae5f-6c0b84ab3a9e";

  public static final byte[] a(String paramString)
  {
    AppMethodBeat.i(101256);
    Object localObject = null;
    try
    {
      Mac localMac = Mac.getInstance("HmacSHA256");
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(a.getBytes("UTF-8"), "HmacSHA256");
      localMac.init(localSecretKeySpec);
      paramString = localMac.doFinal(paramString.getBytes());
      AppMethodBeat.o(101256);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
      {
        i.a("sha256Encode failed with error:" + paramString.getMessage());
        paramString = localObject;
      }
    }
    catch (NoSuchAlgorithmException paramString)
    {
      while (true)
      {
        i.a("sha256Encode failed with error:" + paramString.getMessage());
        paramString = localObject;
      }
    }
    catch (InvalidKeyException paramString)
    {
      while (true)
      {
        i.a("sha256Encode failed with error:" + paramString.getMessage());
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.ab
 * JD-Core Version:    0.6.2
 */