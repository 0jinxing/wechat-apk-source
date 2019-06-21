package com.tencent.mm.audio.mix.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;

public final class c
{
  protected static char[] caT;
  protected static ThreadLocal<MessageDigest> cok;

  static
  {
    AppMethodBeat.i(137222);
    caT = new char[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
    cok = new c.1();
    AppMethodBeat.o(137222);
  }

  public static String ck(String paramString)
  {
    AppMethodBeat.i(137221);
    paramString = paramString.getBytes();
    paramString = ((MessageDigest)cok.get()).digest(paramString);
    int i = paramString.length;
    StringBuffer localStringBuffer = new StringBuffer(i * 2);
    for (int j = 0; j < i + 0; j++)
    {
      int k = paramString[j];
      char c1 = caT[((k & 0xF0) >> 4)];
      char c2 = caT[(k & 0xF)];
      localStringBuffer.append(c1);
      localStringBuffer.append(c2);
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(137221);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.h.c
 * JD-Core Version:    0.6.2
 */