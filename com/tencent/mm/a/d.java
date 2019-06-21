package com.tencent.mm.a;

import android.util.Base64;
import com.tencent.mm.sdk.platformtools.ab;
import java.security.Key;
import java.security.spec.KeySpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class d
{
  private Cipher cbW;
  private Cipher cbX;

  public d(String paramString)
  {
    try
    {
      Object localObject = new javax/crypto/spec/DESKeySpec;
      ((DESKeySpec)localObject).<init>(paramString.getBytes("UTF8"));
      localObject = SecretKeyFactory.getInstance("DES").generateSecret((KeySpec)localObject);
      paramString = new javax/crypto/spec/IvParameterSpec;
      paramString.<init>("manifest".getBytes("UTF8"));
      this.cbW = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.cbW.init(1, (Key)localObject, paramString);
      this.cbX = Cipher.getInstance("DES/CBC/PKCS5Padding");
      this.cbX.init(2, (Key)localObject, paramString);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.DESUtil", paramString, "", new Object[0]);
    }
  }

  public final String cr(String paramString)
  {
    try
    {
      Object localObject = Base64.decode(paramString, 0);
      byte[] arrayOfByte = this.cbX.doFinal((byte[])localObject);
      localObject = new java/lang/String;
      ((String)localObject).<init>(arrayOfByte, "UTF8");
      paramString = (String)localObject;
      return paramString;
    }
    catch (Exception localException)
    {
      while (true)
        paramString = "[des]" + paramString + "|" + localException.toString();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.d
 * JD-Core Version:    0.6.2
 */