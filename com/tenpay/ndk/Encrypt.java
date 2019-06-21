package com.tenpay.ndk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;

public class Encrypt
{
  private static final String CHARSET = "UTF-8";
  private byte[] dec_buf;
  private byte[] enc_buf;
  private byte[] enc_passwd;
  private byte[] key_buf;
  private byte[] raw_buf;
  private byte[] raw_passwd;
  private String server_time_stamp = "0";
  private int time_stamp;

  private native boolean decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  private native boolean encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);

  private native boolean encryptPasswd(byte paramByte, byte[] paramArrayOfByte);

  private native boolean encryptPasswdWithRSA2048(byte paramByte, byte[] paramArrayOfByte, int paramInt);

  private native boolean encryptVerifyCode(byte[] paramArrayOfByte);

  private native byte[] getRandom();

  public String desedeDecode(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(49569);
    if ((paramString1 != null) && (paramString2 != null) && (paramString1.length() > 0))
      try
      {
        this.raw_buf = paramString1.getBytes("UTF-8");
        this.key_buf = paramString2.getBytes("UTF-8");
        decrypt(this.key_buf, this.raw_buf);
        if (this.dec_buf == null)
        {
          AppMethodBeat.o(49569);
          paramString1 = localObject;
          return paramString1;
        }
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          AppMethodBeat.o(49569);
          paramString1 = localObject;
        }
      }
    while (true)
    {
      try
      {
        paramString1 = new java/lang/String;
        paramString1.<init>(this.dec_buf, "UTF-8");
        AppMethodBeat.o(49569);
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(49569);
        paramString1 = localObject;
      }
      break;
      paramString1 = null;
    }
  }

  public String desedeEncode(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(49566);
    if ((paramString != null) && (paramString.length() > 0))
      try
      {
        this.raw_buf = paramString.getBytes("UTF-8");
        encrypt(null, this.raw_buf);
        if (this.enc_buf == null)
        {
          AppMethodBeat.o(49566);
          paramString = localObject;
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          AppMethodBeat.o(49566);
          paramString = localObject;
        }
      }
    while (true)
    {
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(this.enc_buf, "UTF-8");
        AppMethodBeat.o(49566);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49566);
        paramString = localObject;
      }
      break;
      paramString = null;
    }
  }

  public String desedeEncode(String paramString1, String paramString2)
  {
    Object localObject = null;
    AppMethodBeat.i(49568);
    if ((paramString1 != null) && (paramString2 != null) && (paramString1.length() > 0))
      try
      {
        this.raw_buf = paramString1.getBytes("UTF-8");
        this.key_buf = paramString2.getBytes("UTF-8");
        encrypt(this.key_buf, this.raw_buf);
        if (this.enc_buf == null)
        {
          AppMethodBeat.o(49568);
          paramString1 = localObject;
          return paramString1;
        }
      }
      catch (Exception paramString1)
      {
        while (true)
        {
          AppMethodBeat.o(49568);
          paramString1 = localObject;
        }
      }
    while (true)
    {
      try
      {
        paramString1 = new java/lang/String;
        paramString1.<init>(this.enc_buf, "UTF-8");
        AppMethodBeat.o(49568);
      }
      catch (Exception paramString1)
      {
        AppMethodBeat.o(49568);
        paramString1 = localObject;
      }
      break;
      paramString1 = null;
    }
  }

  public String desedeVerifyCode(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(49567);
    if ((paramString != null) && (paramString.length() > 0))
      try
      {
        this.raw_buf = paramString.getBytes("UTF-8");
        encryptVerifyCode(this.raw_buf);
        if (this.enc_buf == null)
        {
          AppMethodBeat.o(49567);
          paramString = localObject;
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          AppMethodBeat.o(49567);
          paramString = localObject;
        }
      }
    while (true)
    {
      try
      {
        paramString = new java/lang/String;
        paramString.<init>(this.enc_buf, "UTF-8");
        AppMethodBeat.o(49567);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49567);
        paramString = localObject;
      }
      break;
      paramString = null;
    }
  }

  public String encryptPasswd(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(49572);
    if ((paramString != null) && (paramString.length() > 0))
      try
      {
        this.raw_passwd = paramString.getBytes("UTF-8");
        encryptPasswd((byte)2, this.raw_passwd);
        if (this.enc_passwd == null)
        {
          AppMethodBeat.o(49572);
          paramString = localObject;
          return paramString;
        }
      }
      catch (Exception paramString)
      {
        while (true)
        {
          AppMethodBeat.o(49572);
          paramString = localObject;
        }
      }
    while (true)
    {
      try
      {
        int i = this.enc_passwd.length / 2;
        byte[] arrayOfByte = new byte[i];
        System.arraycopy(this.enc_passwd, i, arrayOfByte, 0, i);
        paramString = new java/lang/String;
        paramString.<init>(arrayOfByte, "UTF-8");
        AppMethodBeat.o(49572);
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49572);
        paramString = localObject;
      }
      break;
      paramString = null;
    }
  }

  public String encryptPasswdWithRSA2048(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(49571);
    Object localObject3 = localObject1;
    if (paramString != null)
    {
      localObject3 = localObject1;
      if (paramString.length() > 0)
      {
        this.raw_passwd = null;
        this.enc_passwd = null;
        if (paramString.length() <= 0);
      }
    }
    while (true)
    {
      try
      {
        this.raw_passwd = paramString.getBytes("UTF-8");
        if (!encryptPasswdWithRSA2048((byte)2, this.raw_passwd, 1))
        {
          AppMethodBeat.o(49571);
          localObject3 = localObject2;
          return localObject3;
        }
      }
      catch (Exception paramString)
      {
        AppMethodBeat.o(49571);
        localObject3 = localObject2;
        continue;
      }
      if (this.enc_passwd == null)
      {
        AppMethodBeat.o(49571);
        localObject3 = localObject2;
      }
      else
      {
        try
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>("V01_");
          localObject3 = new java/lang/String;
          ((String)localObject3).<init>(this.enc_passwd, "UTF-8");
          localObject3 = (String)localObject3;
          AppMethodBeat.o(49571);
        }
        catch (Exception paramString)
        {
          AppMethodBeat.o(49571);
          localObject3 = localObject2;
        }
      }
    }
  }

  public String getPasswdTimeStamp()
  {
    AppMethodBeat.i(49570);
    int i = this.time_stamp;
    AppMethodBeat.o(49570);
    return String.valueOf(i);
  }

  public String getRandomKey()
  {
    AppMethodBeat.i(49573);
    byte[] arrayOfByte = getRandom();
    if (arrayOfByte != null);
    while (true)
    {
      try
      {
        String str = new java/lang/String;
        str.<init>(arrayOfByte, "UTF-8");
        AppMethodBeat.o(49573);
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
      }
      Object localObject = null;
    }
  }

  public void setTimeStamp(String paramString)
  {
    this.server_time_stamp = paramString;
  }

  public native byte[] sm4BCDDecryptCBC(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);

  public native byte[] sm4BCDEncryptCBC(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tenpay.ndk.Encrypt
 * JD-Core Version:    0.6.2
 */