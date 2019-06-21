package com.tencent.mm.plugin.wear.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class a
{
  public static final HashMap<String, Object> cUE()
  {
    AppMethodBeat.i(26457);
    Object localObject1 = KeyPairGenerator.getInstance("RSA");
    ((KeyPairGenerator)localObject1).initialize(1024);
    Object localObject2 = ((KeyPairGenerator)localObject1).generateKeyPair();
    localObject1 = (RSAPublicKey)((KeyPair)localObject2).getPublic();
    RSAPrivateKey localRSAPrivateKey = (RSAPrivateKey)((KeyPair)localObject2).getPrivate();
    localObject2 = new HashMap(2);
    ((HashMap)localObject2).put("RSAPublicKey", localObject1);
    ((HashMap)localObject2).put("RSAPrivateKey", localRSAPrivateKey);
    AppMethodBeat.o(26457);
    return localObject2;
  }

  public static final byte[] cUF()
  {
    AppMethodBeat.i(26459);
    try
    {
      Object localObject1 = KeyGenerator.getInstance("AES");
      ((KeyGenerator)localObject1).init(128);
      localObject1 = ((KeyGenerator)localObject1).generateKey().getEncoded();
      AppMethodBeat.o(26459);
      return localObject1;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(26459);
      }
    }
  }

  public static final byte[] i(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(26458);
    paramArrayOfByte2 = new SecretKeySpec(paramArrayOfByte2, "AES");
    Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
    localCipher.init(1, paramArrayOfByte2);
    paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte1);
    AppMethodBeat.o(26458);
    return paramArrayOfByte1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.a.a
 * JD-Core Version:    0.6.2
 */