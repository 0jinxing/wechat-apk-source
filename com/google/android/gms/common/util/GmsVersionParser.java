package com.google.android.gms.common.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GmsVersionParser
{
  public static final int UNKNOWN = -1;
  private static Pattern zzzy = null;

  public static int parseBuildMajorVersion(int paramInt)
  {
    int i = -1;
    if (paramInt == -1)
      paramInt = i;
    while (true)
    {
      return paramInt;
      paramInt /= 100000;
    }
  }

  public static long parseBuildNumber(String paramString)
  {
    long l1 = -1L;
    AppMethodBeat.i(90197);
    if (paramString == null)
      AppMethodBeat.o(90197);
    while (true)
    {
      return l1;
      paramString = zzdc().matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group(2);
        try
        {
          long l2 = Long.parseLong(paramString);
          l1 = l2;
          AppMethodBeat.o(90197);
        }
        catch (NumberFormatException paramString)
        {
        }
      }
      else
      {
        AppMethodBeat.o(90197);
      }
    }
  }

  public static int parseBuildType(String paramString)
  {
    AppMethodBeat.i(90199);
    long l = parseVariantCode(paramString);
    int i;
    if (l == -1L)
    {
      i = -1;
      AppMethodBeat.o(90199);
    }
    while (true)
    {
      return i;
      i = (int)(l / 10000L);
      AppMethodBeat.o(90199);
    }
  }

  public static int parseBuildVersion(int paramInt)
  {
    int i = -1;
    if (paramInt == -1)
      paramInt = i;
    while (true)
    {
      return paramInt;
      paramInt /= 1000;
    }
  }

  public static int parseScreenDensity(String paramString)
  {
    AppMethodBeat.i(90201);
    long l = parseVariantCode(paramString);
    int i;
    if (l == -1L)
    {
      i = -1;
      AppMethodBeat.o(90201);
    }
    while (true)
    {
      return i;
      i = (int)(l % 100L);
      AppMethodBeat.o(90201);
    }
  }

  public static int parseTargetArchitecture(String paramString)
  {
    AppMethodBeat.i(90200);
    long l = parseVariantCode(paramString);
    int i;
    if (l == -1L)
    {
      i = -1;
      AppMethodBeat.o(90200);
    }
    while (true)
    {
      return i;
      i = (int)(l / 100L % 100L);
      AppMethodBeat.o(90200);
    }
  }

  public static long parseVariantCode(String paramString)
  {
    long l1 = -1L;
    AppMethodBeat.i(90198);
    if (paramString == null)
      AppMethodBeat.o(90198);
    while (true)
    {
      return l1;
      paramString = zzdc().matcher(paramString);
      if (paramString.find())
      {
        paramString = paramString.group(1);
        try
        {
          long l2 = Long.parseLong(paramString);
          l1 = l2;
          AppMethodBeat.o(90198);
        }
        catch (NumberFormatException paramString)
        {
        }
      }
      else
      {
        AppMethodBeat.o(90198);
      }
    }
  }

  private static Pattern zzdc()
  {
    AppMethodBeat.i(90196);
    if (zzzy == null)
      zzzy = Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
    Pattern localPattern = zzzy;
    AppMethodBeat.o(90196);
    return localPattern;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.GmsVersionParser
 * JD-Core Version:    0.6.2
 */