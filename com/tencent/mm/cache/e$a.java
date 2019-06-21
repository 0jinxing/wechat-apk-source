package com.tencent.mm.cache;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;

public final class e$a
{
  private static Map<String, e> eft;

  static
  {
    AppMethodBeat.i(57826);
    eft = new HashMap();
    AppMethodBeat.o(57826);
  }

  public static <T> T J(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57821);
    paramString1 = a(kc(paramString1), paramString2);
    AppMethodBeat.o(57821);
    return paramString1;
  }

  public static <T> void K(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57823);
    b(kc(paramString1), paramString2);
    AppMethodBeat.o(57823);
  }

  private static <T> T a(e parame, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(57824);
    if (parame == null)
    {
      ab.e("MicroMsg.ICacheService.Factory", "null service");
      AppMethodBeat.o(57824);
      parame = localObject;
    }
    while (true)
    {
      return parame;
      try
      {
        parame = parame.get(paramString);
        AppMethodBeat.o(57824);
      }
      catch (Exception parame)
      {
        ab.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
        ab.e("MicroMsg.ICacheService.Factory", "exception:%s", new Object[] { bo.l(parame) });
        AppMethodBeat.o(57824);
        parame = localObject;
      }
    }
  }

  public static void a(String paramString, e parame)
  {
    AppMethodBeat.i(57819);
    eft.put(paramString, parame);
    AppMethodBeat.o(57819);
  }

  public static <T> void a(String paramString1, String paramString2, T paramT)
  {
    AppMethodBeat.i(57822);
    paramString1 = kc(paramString1);
    if (paramString1 == null)
    {
      ab.e("MicroMsg.ICacheService.Factory", "null service");
      AppMethodBeat.o(57822);
    }
    while (true)
    {
      return;
      paramString1.f(paramString2, paramT);
      AppMethodBeat.o(57822);
    }
  }

  private static <T> T b(e parame, String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(57825);
    if (parame == null)
    {
      ab.e("MicroMsg.ICacheService.Factory", "null service");
      AppMethodBeat.o(57825);
      parame = localObject;
    }
    while (true)
    {
      return parame;
      try
      {
        parame = parame.remove(paramString);
        AppMethodBeat.o(57825);
      }
      catch (Exception parame)
      {
        ab.e("MicroMsg.ICacheService.Factory", "cast failed, different type ?");
        ab.e("MicroMsg.ICacheService.Factory", "exception:%s", new Object[] { bo.l(parame) });
        AppMethodBeat.o(57825);
        parame = localObject;
      }
    }
  }

  private static e kc(String paramString)
  {
    AppMethodBeat.i(57820);
    paramString = (e)eft.get(paramString);
    AppMethodBeat.o(57820);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cache.e.a
 * JD-Core Version:    0.6.2
 */