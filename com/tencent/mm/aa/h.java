package com.tencent.mm.aa;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;
import org.json.JSONObject;

public final class h
{
  private static volatile int eIB = 0;
  private static volatile boolean eIC = false;
  private static e eID;

  public static c QC()
  {
    AppMethodBeat.i(117626);
    Object localObject;
    if (eIB == 1)
    {
      localObject = new l();
      AppMethodBeat.o(117626);
    }
    while (true)
    {
      return localObject;
      localObject = new d();
      AppMethodBeat.o(117626);
    }
  }

  public static a QD()
  {
    AppMethodBeat.i(117629);
    Object localObject;
    if (eIB == 1)
    {
      localObject = new k();
      AppMethodBeat.o(117629);
    }
    while (true)
    {
      return localObject;
      localObject = new b();
      AppMethodBeat.o(117629);
    }
  }

  public static int QE()
  {
    return eIB;
  }

  public static void a(e parame)
  {
    eID = parame;
  }

  public static void initialize()
  {
  }

  public static c j(Map paramMap)
  {
    AppMethodBeat.i(117627);
    if (eIB == 1)
    {
      paramMap = new l(paramMap);
      AppMethodBeat.o(117627);
    }
    while (true)
    {
      return paramMap;
      paramMap = new d(paramMap);
      AppMethodBeat.o(117627);
    }
  }

  public static void jM(int paramInt)
  {
    eIB = paramInt;
    eIC = true;
  }

  public static JSONObject lw(String paramString)
  {
    AppMethodBeat.i(117625);
    if (eIB == 1)
    {
      paramString = new i(paramString);
      AppMethodBeat.o(117625);
    }
    while (true)
    {
      return paramString;
      paramString = new JSONObject(paramString);
      AppMethodBeat.o(117625);
    }
  }

  public static c lx(String paramString)
  {
    AppMethodBeat.i(117628);
    if (eIB == 1)
    {
      paramString = new l(paramString);
      AppMethodBeat.o(117628);
    }
    while (true)
    {
      return paramString;
      paramString = new d(paramString);
      AppMethodBeat.o(117628);
    }
  }

  public static a ly(String paramString)
  {
    AppMethodBeat.i(117630);
    if (eIB == 1)
    {
      paramString = new k(paramString);
      AppMethodBeat.o(117630);
    }
    while (true)
    {
      return paramString;
      paramString = new b(paramString);
      AppMethodBeat.o(117630);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.h
 * JD-Core Version:    0.6.2
 */