package com.tencent.liteav.basic.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

public final class a
{
  private static String a = "RSA";

  public static PrivateKey a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(66133);
    paramArrayOfByte = new PKCS8EncodedKeySpec(paramArrayOfByte);
    paramArrayOfByte = KeyFactory.getInstance(a).generatePrivate(paramArrayOfByte);
    AppMethodBeat.o(66133);
    return paramArrayOfByte;
  }

  public static byte[] a(byte[] paramArrayOfByte, PrivateKey paramPrivateKey)
  {
    AppMethodBeat.i(66132);
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(2, paramPrivateKey);
    int i = paramArrayOfByte.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int j = 0;
    if (i - j > 0)
    {
      if (i - j >= localCipher.getBlockSize());
      for (paramPrivateKey = localCipher.doFinal(paramArrayOfByte, j, localCipher.getBlockSize()); ; paramPrivateKey = localCipher.doFinal(paramArrayOfByte, j, i - j))
      {
        localByteArrayOutputStream.write(paramPrivateKey);
        j = localCipher.getBlockSize() + j;
        break;
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    AppMethodBeat.o(66132);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.f.a
 * JD-Core Version:    0.6.2
 */