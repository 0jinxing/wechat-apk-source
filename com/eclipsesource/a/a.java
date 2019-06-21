package com.eclipsesource.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;

public final class a
{
  public static final h aLi;
  public static final h aLj;
  public static final h aLk;

  static
  {
    AppMethodBeat.i(70496);
    aLi = new c("null");
    aLj = new c("true");
    aLk = new c("false");
    AppMethodBeat.o(70496);
  }

  public static h T(float paramFloat)
  {
    AppMethodBeat.i(70491);
    if ((Float.isInfinite(paramFloat)) || (Float.isNaN(paramFloat)))
    {
      localObject = new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
      AppMethodBeat.o(70491);
      throw ((Throwable)localObject);
    }
    Object localObject = new d(ai(Float.toString(paramFloat)));
    AppMethodBeat.o(70491);
    return localObject;
  }

  public static h aB(boolean paramBoolean)
  {
    if (paramBoolean);
    for (h localh = aLj; ; localh = aLk)
      return localh;
  }

  public static h ag(String paramString)
  {
    AppMethodBeat.i(70493);
    if (paramString == null)
    {
      paramString = aLi;
      AppMethodBeat.o(70493);
    }
    while (true)
    {
      return paramString;
      paramString = new g(paramString);
      AppMethodBeat.o(70493);
    }
  }

  public static h ah(String paramString)
  {
    AppMethodBeat.i(70494);
    if (paramString == null)
    {
      paramString = new NullPointerException("string is null");
      AppMethodBeat.o(70494);
      throw paramString;
    }
    try
    {
      f localf = new com/eclipsesource/a/f;
      localf.<init>(paramString);
      localf.pi();
      localf.ph();
      paramString = localf.oT();
      localf.ph();
      if (!localf.pp())
      {
        paramString = localf.am("Unexpected character");
        AppMethodBeat.o(70494);
        throw paramString;
      }
    }
    catch (IOException paramString)
    {
      paramString = new RuntimeException(paramString);
      AppMethodBeat.o(70494);
      throw paramString;
    }
    AppMethodBeat.o(70494);
    return paramString;
  }

  private static String ai(String paramString)
  {
    AppMethodBeat.i(70495);
    if (paramString.endsWith(".0"))
    {
      paramString = paramString.substring(0, paramString.length() - 2);
      AppMethodBeat.o(70495);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(70495);
    }
  }

  public static h dr(int paramInt)
  {
    AppMethodBeat.i(70489);
    d locald = new d(Integer.toString(paramInt, 10));
    AppMethodBeat.o(70489);
    return locald;
  }

  public static h m(double paramDouble)
  {
    AppMethodBeat.i(70492);
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
    {
      localObject = new IllegalArgumentException("Infinite and NaN values not permitted in JSON");
      AppMethodBeat.o(70492);
      throw ((Throwable)localObject);
    }
    Object localObject = new d(ai(Double.toString(paramDouble)));
    AppMethodBeat.o(70492);
    return localObject;
  }

  public static h t(long paramLong)
  {
    AppMethodBeat.i(70490);
    d locald = new d(Long.toString(paramLong, 10));
    AppMethodBeat.o(70490);
    return locald;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.eclipsesource.a.a
 * JD-Core Version:    0.6.2
 */