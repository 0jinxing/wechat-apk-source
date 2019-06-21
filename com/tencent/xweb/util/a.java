package com.tencent.xweb.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.xwalk.core.Log;

public final class a
{
  private static String TAG = "AESUtil";

  public static String a(String paramString, SecretKey paramSecretKey)
  {
    AppMethodBeat.i(3997);
    paramString = a(avk(paramString), paramSecretKey);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(3997);
    }
    while (true)
    {
      return paramString;
      paramString = new String(paramString);
      AppMethodBeat.o(3997);
    }
  }

  private static byte[] a(byte[] paramArrayOfByte, SecretKey paramSecretKey)
  {
    AppMethodBeat.i(3996);
    try
    {
      Object localObject = paramSecretKey.getEncoded();
      paramSecretKey = new javax/crypto/spec/SecretKeySpec;
      paramSecretKey.<init>((byte[])localObject, "AES");
      localObject = Cipher.getInstance("AES/ECB/PKCS5Padding");
      ((Cipher)localObject).init(2, paramSecretKey);
      paramArrayOfByte = ((Cipher)localObject).doFinal(paramArrayOfByte);
      AppMethodBeat.o(3996);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      while (true)
      {
        Log.e(TAG, "decrypt exp:" + paramArrayOfByte.getMessage());
        paramArrayOfByte = null;
        AppMethodBeat.o(3996);
      }
    }
  }

  public static SecretKey avj(String paramString)
  {
    AppMethodBeat.i(3995);
    try
    {
      byte[] arrayOfByte = avk(paramString);
      paramString = new javax/crypto/spec/SecretKeySpec;
      paramString.<init>(arrayOfByte, "AES");
      AppMethodBeat.o(3995);
      return paramString;
    }
    catch (Throwable paramString)
    {
      while (true)
      {
        Log.e(TAG, "makekey exp:" + paramString.getMessage());
        paramString = null;
        AppMethodBeat.o(3995);
      }
    }
  }

  private static byte[] avk(String paramString)
  {
    AppMethodBeat.i(3998);
    int i = paramString.length();
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; j < i; j += 2)
      arrayOfByte[(j / 2)] = ((byte)(byte)((Character.digit(paramString.charAt(j), 16) << 4) + Character.digit(paramString.charAt(j + 1), 16)));
    AppMethodBeat.o(3998);
    return arrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.util.a
 * JD-Core Version:    0.6.2
 */