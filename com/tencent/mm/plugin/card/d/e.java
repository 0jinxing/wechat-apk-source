package com.tencent.mm.plugin.card.d;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class e
{
  private static byte[] He(String paramString)
  {
    AppMethodBeat.i(88847);
    int i = paramString.length() / 2;
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++)
      arrayOfByte[j] = Integer.valueOf(paramString.substring(j * 2, j * 2 + 2), 16).byteValue();
    AppMethodBeat.o(88847);
    return arrayOfByte;
  }

  private static String ax(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88846);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = "";
      AppMethodBeat.o(88846);
    }
    while (true)
    {
      return paramArrayOfByte;
      StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
      for (int i = 0; i < paramArrayOfByte.length; i++)
        localStringBuilder.append("0123456789ABCDEF".charAt(paramArrayOfByte[i] >> 4 & 0xF)).append("0123456789ABCDEF".charAt(paramArrayOfByte[i] & 0xF));
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(88846);
    }
  }

  private static byte[] ay(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(88848);
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
    SecureRandom localSecureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
    localSecureRandom.setSeed(paramArrayOfByte);
    localKeyGenerator.init(128, localSecureRandom);
    paramArrayOfByte = localKeyGenerator.generateKey().getEncoded();
    AppMethodBeat.o(88848);
    return paramArrayOfByte;
  }

  public static String ds(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88844);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      AppMethodBeat.o(88844);
      paramString1 = null;
    }
    while (true)
    {
      return paramString1;
      g.RN();
      int i = a.QF();
      paramString1 = "CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + i + "_" + paramString1;
      try
      {
        Object localObject = ay(paramString1.getBytes());
        paramString2 = He(paramString2);
        paramString1 = new javax/crypto/spec/SecretKeySpec;
        paramString1.<init>((byte[])localObject, "AES");
        localObject = Cipher.getInstance("AES");
        ((Cipher)localObject).init(2, paramString1);
        paramString2 = ((Cipher)localObject).doFinal(paramString2);
        paramString1 = new java/lang/String;
        paramString1.<init>(paramString2);
        AppMethodBeat.o(88844);
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
          paramString1 = null;
        }
      }
    }
  }

  public static String dt(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(88845);
    if ((paramString2 == null) || (paramString2.length() <= 0))
    {
      AppMethodBeat.o(88845);
      paramString1 = (String)localObject2;
    }
    while (true)
    {
      return paramString1;
      g.RN();
      int i = a.QF();
      paramString1 = "CbW9HMPiil38ldOjZp5WkwlIfzvLwiX6_" + i + "_" + paramString1;
      try
      {
        localObject2 = ay(paramString1.getBytes());
        paramString2 = paramString2.getBytes();
        paramString1 = new javax/crypto/spec/SecretKeySpec;
        paramString1.<init>((byte[])localObject2, "AES");
        localObject2 = Cipher.getInstance("AES");
        ((Cipher)localObject2).init(1, paramString1);
        paramString1 = ax(((Cipher)localObject2).doFinal(paramString2));
        AppMethodBeat.o(88845);
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
          paramString1 = localObject1;
        }
      }
    }
  }

  public static String du(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88849);
    if ((paramString1 == null) || (paramString1.length() <= 0))
    {
      paramString1 = null;
      AppMethodBeat.o(88849);
    }
    while (true)
    {
      return paramString1;
      long l = System.currentTimeMillis() / 1000L;
      StringBuilder localStringBuilder1 = new StringBuilder();
      StringBuilder localStringBuilder2 = new StringBuilder();
      localStringBuilder1.append(paramString1);
      localStringBuilder1.append("&");
      localStringBuilder1.append(l);
      localStringBuilder1.append("&");
      localStringBuilder1.append(paramString2);
      try
      {
        paramString2 = dv(localStringBuilder1.toString(), paramString2);
        localStringBuilder2.append(paramString1);
        localStringBuilder2.append("&");
        localStringBuilder2.append(l);
        localStringBuilder2.append("&");
        localStringBuilder2.append(paramString2);
        paramString1 = localStringBuilder2.toString();
        AppMethodBeat.o(88849);
      }
      catch (Exception paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
      }
    }
  }

  private static String dv(String paramString1, String paramString2)
  {
    AppMethodBeat.i(88850);
    try
    {
      Mac localMac = Mac.getInstance("HmacSHA256");
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(paramString2.getBytes(), "HmacSHA256");
      localMac.init(localSecretKeySpec);
      paramString1 = Base64.encodeToString(localMac.doFinal(paramString1.getBytes()), 2);
      ab.i("MicroMsg.CardDymanicQrcodeOfflineHelper", "hash is: ".concat(String.valueOf(paramString1)));
      AppMethodBeat.o(88850);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CardDymanicQrcodeOfflineHelper", paramString1, "", new Object[0]);
        paramString1 = "";
        AppMethodBeat.o(88850);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.e
 * JD-Core Version:    0.6.2
 */