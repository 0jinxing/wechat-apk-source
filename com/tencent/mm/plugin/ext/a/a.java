package com.tencent.mm.plugin.ext.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public final class a
{
  private static char[] fuo = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  private static SecretKey lPz = null;

  private static byte[] Fu(String paramString)
  {
    AppMethodBeat.i(20296);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(20296);
    }
    while (true)
    {
      return paramString;
      byte[] arrayOfByte = new byte[paramString.length() / 2];
      for (int i = 0; i < arrayOfByte.length; i++)
        arrayOfByte[i] = ((byte)(byte)Integer.parseInt(paramString.substring(i * 2, i * 2 + 2), 16));
      AppMethodBeat.o(20296);
      paramString = arrayOfByte;
    }
  }

  private static byte[] Ld(String paramString)
  {
    AppMethodBeat.i(20292);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(20292);
    }
    while (true)
    {
      return paramString;
      brG();
      Cipher localCipher = Cipher.getInstance("AES");
      localCipher.init(1, lPz);
      paramString = localCipher.doFinal(paramString.getBytes("UTF8"));
      AppMethodBeat.o(20292);
    }
  }

  public static long Le(String paramString)
  {
    AppMethodBeat.i(20295);
    long l = Long.valueOf(decrypt(paramString).trim()).longValue();
    AppMethodBeat.o(20295);
    return l;
  }

  private static void brG()
  {
    AppMethodBeat.i(20291);
    try
    {
      if (lPz == null)
      {
        ObjectInputStream localObjectInputStream = new java/io/ObjectInputStream;
        ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
        localByteArrayInputStream.<init>(Fu("aced00057372001f6a617661782e63727970746f2e737065632e5365637265744b6579537065635b470b66e230614d0200024c0009616c676f726974686d7400124c6a6176612f6c616e672f537472696e673b5b00036b65797400025b427870740003414553757200025b42acf317f8060854e0020000787000000010402a2173bd6f2542e5e71ee414b2e1e8"));
        localObjectInputStream.<init>(localByteArrayInputStream);
        lPz = (SecretKey)localObjectInputStream.readObject();
        localObjectInputStream.close();
      }
      AppMethodBeat.o(20291);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AESUtil", localException, "", new Object[0]);
        AppMethodBeat.o(20291);
      }
    }
  }

  private static String decrypt(String paramString)
  {
    AppMethodBeat.i(20294);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(20294);
    }
    while (true)
    {
      return paramString;
      brG();
      Cipher localCipher = Cipher.getInstance("AES");
      localCipher.init(2, lPz);
      paramString = new String(localCipher.doFinal(Fu(paramString)), "UTF8");
      AppMethodBeat.o(20294);
    }
  }

  public static String ii(long paramLong)
  {
    AppMethodBeat.i(20293);
    byte[] arrayOfByte = Ld(String.valueOf(paramLong));
    Object localObject;
    if (arrayOfByte == null)
    {
      localObject = null;
      AppMethodBeat.o(20293);
    }
    while (true)
    {
      return localObject;
      localObject = new StringBuilder(arrayOfByte.length * 2);
      for (int i = 0; i < arrayOfByte.length; i++)
      {
        ((StringBuilder)localObject).append(fuo[((arrayOfByte[i] & 0xF0) >>> 4)]);
        ((StringBuilder)localObject).append(fuo[(arrayOfByte[i] & 0xF)]);
      }
      localObject = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(20293);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.a.a
 * JD-Core Version:    0.6.2
 */