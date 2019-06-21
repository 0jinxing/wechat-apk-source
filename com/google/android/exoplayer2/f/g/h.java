package com.google.android.exoplayer2.f.g;

import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h
{
  private static final Pattern boP;
  private static final Pattern boQ;

  static
  {
    AppMethodBeat.i(95748);
    boP = Pattern.compile("^NOTE(( |\t).*)?$");
    boQ = Pattern.compile("^﻿?WEBVTT(( |\t).*)?$");
    AppMethodBeat.o(95748);
  }

  public static void I(l paraml)
  {
    AppMethodBeat.i(95744);
    paraml = paraml.readLine();
    if ((paraml == null) || (!boQ.matcher(paraml).matches()))
    {
      paraml = new com.google.android.exoplayer2.f.f("Expected WEBVTT. Got ".concat(String.valueOf(paraml)));
      AppMethodBeat.o(95744);
      throw paraml;
    }
    AppMethodBeat.o(95744);
  }

  public static Matcher J(l paraml)
  {
    AppMethodBeat.i(95747);
    Object localObject;
    do
    {
      localObject = paraml.readLine();
      if (localObject == null)
        break;
      if (boP.matcher((CharSequence)localObject).matches())
        while (true)
        {
          localObject = paraml.readLine();
          if ((localObject == null) || (((String)localObject).isEmpty()))
            break;
        }
      localObject = f.boE.matcher((CharSequence)localObject);
    }
    while (!((Matcher)localObject).matches());
    AppMethodBeat.o(95747);
    paraml = (l)localObject;
    while (true)
    {
      return paraml;
      paraml = null;
      AppMethodBeat.o(95747);
    }
  }

  public static long aD(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(95745);
    long l1 = 0L;
    String[] arrayOfString = paramString.split("\\.", 2);
    paramString = arrayOfString[0].split(":");
    int j = paramString.length;
    while (i < j)
    {
      l1 = l1 * 60L + Long.parseLong(paramString[i]);
      i++;
    }
    long l2 = Long.parseLong(arrayOfString[1]);
    AppMethodBeat.o(95745);
    return (l2 + l1 * 1000L) * 1000L;
  }

  public static float aE(String paramString)
  {
    AppMethodBeat.i(95746);
    if (!paramString.endsWith("%"))
    {
      paramString = new NumberFormatException("Percentages must end with %");
      AppMethodBeat.o(95746);
      throw paramString;
    }
    float f = Float.parseFloat(paramString.substring(0, paramString.length() - 1)) / 100.0F;
    AppMethodBeat.o(95746);
    return f;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.g.h
 * JD-Core Version:    0.6.2
 */