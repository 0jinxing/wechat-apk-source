package com.tencent.mm.sdk.platformtools;

import android.util.Base64;
import com.tencent.mm.a.l;
import java.io.UnsupportedEncodingException;
import java.util.regex.Pattern;

public final class ac
{
  private static final Pattern xyR = Pattern.compile(c + "⍆[0-9]+@".substring(1));
  private byte[] key;
  private final ae<String, String> xyS = new ae(256);
  public final bl xyT;

  static
  {
    char c = (char)("⍆[0-9]+@".charAt(0) ^ 0xDCBA);
  }

  public ac(String paramString)
  {
    try
    {
      this.key = paramString.getBytes("UTF-8");
      this.xyT = new bl(paramString);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        this.key = paramString.getBytes();
    }
  }

  public final String ef(String paramString, int paramInt)
  {
    String str = paramString.substring(0, paramInt);
    if (this.xyS.ak(str))
      paramString = (String)this.xyS.get(str);
    while (true)
    {
      return paramString;
      paramInt = paramString.indexOf('@', 1);
      int i = paramInt + 1;
      paramString = paramString.substring(i, Integer.parseInt(paramString.substring(1, paramInt)) + i);
      try
      {
        byte[] arrayOfByte = l.c(Base64.decode(paramString, 0), this.key);
        paramString = new java/lang/String;
        paramString.<init>(arrayOfByte, "UTF-8");
        this.xyS.put(str, paramString);
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("MicroMsg.LogDecryptor", paramString, "", new Object[0]);
        paramString = "[TD]".concat(String.valueOf(str));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.ac
 * JD-Core Version:    0.6.2
 */