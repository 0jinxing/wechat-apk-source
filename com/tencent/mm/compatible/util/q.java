package com.tencent.mm.compatible.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.BitSet;

public final class q
{
  static BitSet evK;
  static String evL;

  static
  {
    AppMethodBeat.i(93112);
    evL = null;
    evK = new BitSet(256);
    for (int i = 97; i <= 122; i++)
      evK.set(i);
    for (i = 65; i <= 90; i++)
      evK.set(i);
    for (i = 48; i <= 57; i++)
      evK.set(i);
    evK.set(45);
    evK.set(95);
    evK.set(46);
    evK.set(42);
    evL = (String)AccessController.doPrivileged(new i("file.encoding"));
    AppMethodBeat.o(93112);
  }

  @Deprecated
  public static String encode(String paramString)
  {
    AppMethodBeat.i(93110);
    Object localObject = null;
    try
    {
      paramString = encode(paramString, evL);
      AppMethodBeat.o(93110);
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      while (true)
        paramString = localObject;
    }
  }

  public static String encode(String paramString1, String paramString2)
  {
    AppMethodBeat.i(93111);
    StringBuffer localStringBuffer = new StringBuffer(paramString1.length());
    CharArrayWriter localCharArrayWriter = new CharArrayWriter();
    if (paramString2 == null)
    {
      paramString1 = new NullPointerException("charsetName");
      AppMethodBeat.o(93111);
      throw paramString1;
    }
    int i;
    while (true)
    {
      Charset localCharset;
      int k;
      try
      {
        localCharset = Charset.forName(paramString2);
        i = 0;
        j = 0;
        if (j >= paramString1.length())
          break;
        k = paramString1.charAt(j);
        if (evK.get(k))
        {
          if (k == 32)
            i = 1;
          localStringBuffer.append((char)k);
          j++;
          continue;
        }
      }
      catch (IllegalCharsetNameException paramString1)
      {
        paramString1 = new UnsupportedEncodingException(paramString2);
        AppMethodBeat.o(93111);
        throw paramString1;
      }
      catch (UnsupportedCharsetException paramString1)
      {
        paramString1 = new UnsupportedEncodingException(paramString2);
        AppMethodBeat.o(93111);
        throw paramString1;
      }
      i = k;
      int m;
      do
      {
        localCharArrayWriter.write(i);
        k = j;
        if (i >= 55296)
        {
          k = j;
          if (i <= 56319)
          {
            k = j;
            if (j + 1 < paramString1.length())
            {
              i = paramString1.charAt(j + 1);
              k = j;
              if (i >= 56320)
              {
                k = j;
                if (i <= 57343)
                {
                  localCharArrayWriter.write(i);
                  k = j + 1;
                }
              }
            }
          }
        }
        k++;
        if (k >= paramString1.length())
          break;
        paramString2 = evK;
        m = paramString1.charAt(k);
        i = m;
        j = k;
      }
      while (!paramString2.get(m));
      localCharArrayWriter.flush();
      String str = new String(localCharArrayWriter.toCharArray());
      new p();
      byte[] arrayOfByte = str.getBytes(localCharset);
      paramString2 = arrayOfByte;
      if (arrayOfByte == null)
        paramString2 = str.getBytes();
      for (int j = 0; j < paramString2.length; j++)
      {
        localStringBuffer.append('%');
        char c1 = Character.forDigit(paramString2[j] >> 4 & 0xF, 16);
        char c2 = c1;
        if (Character.isLetter(c1))
        {
          i = (char)(c1 - ' ');
          c2 = i;
        }
        localStringBuffer.append(c2);
        c2 = Character.forDigit(paramString2[j] & 0xF, 16);
        c1 = c2;
        if (Character.isLetter(c2))
        {
          i = (char)(c2 - ' ');
          c1 = i;
        }
        localStringBuffer.append(c1);
      }
      localCharArrayWriter.reset();
      i = 1;
      j = k;
    }
    if (i != 0)
    {
      paramString1 = localStringBuffer.toString();
      AppMethodBeat.o(93111);
    }
    while (true)
    {
      return paramString1;
      AppMethodBeat.o(93111);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.util.q
 * JD-Core Version:    0.6.2
 */