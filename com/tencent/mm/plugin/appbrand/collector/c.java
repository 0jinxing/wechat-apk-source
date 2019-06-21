package com.tencent.mm.plugin.appbrand.collector;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static b heE;
  private static boolean heF;
  private static final Set<String> heG;

  static
  {
    AppMethodBeat.i(57040);
    heE = new h();
    heG = new HashSet();
    AppMethodBeat.o(57040);
  }

  public static void a(CollectSession paramCollectSession)
  {
    AppMethodBeat.i(57032);
    if (paramCollectSession == null)
      AppMethodBeat.o(57032);
    while (true)
    {
      return;
      if (!yN(paramCollectSession.groupId))
      {
        AppMethodBeat.o(57032);
      }
      else
      {
        heE.a(paramCollectSession);
        AppMethodBeat.o(57032);
      }
    }
  }

  public static boolean ayt()
  {
    return heF;
  }

  public static CollectSession bD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57033);
    if (!yO(paramString1))
    {
      paramString1 = null;
      AppMethodBeat.o(57033);
    }
    while (true)
    {
      return paramString1;
      paramString1 = heE.bD(paramString1, paramString2);
      AppMethodBeat.o(57033);
    }
  }

  public static void bE(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57031);
    if (!yO(paramString1))
      AppMethodBeat.o(57031);
    while (true)
    {
      return;
      heE.bE(paramString1, paramString2);
      AppMethodBeat.o(57031);
    }
  }

  public static int bF(String paramString1, String paramString2)
  {
    AppMethodBeat.i(57038);
    int i;
    if (!yN(paramString1))
    {
      i = 0;
      AppMethodBeat.o(57038);
    }
    while (true)
    {
      return i;
      i = heE.bF(paramString1, paramString2);
      AppMethodBeat.o(57038);
    }
  }

  public static void clear()
  {
    AppMethodBeat.i(57029);
    if (!heF)
      AppMethodBeat.o(57029);
    while (true)
    {
      return;
      heE.clear();
      AppMethodBeat.o(57029);
    }
  }

  public static void d(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(57030);
    if (!yN(paramString1))
      AppMethodBeat.o(57030);
    while (true)
    {
      return;
      heE.d(paramString1, paramString2, paramString3, paramBoolean);
      AppMethodBeat.o(57030);
    }
  }

  public static void dG(boolean paramBoolean)
  {
    heF = paramBoolean;
  }

  public static void l(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(57034);
    if (!yO(paramString1))
      AppMethodBeat.o(57034);
    while (true)
    {
      return;
      heE.l(paramString1, paramString2, paramBoolean);
      AppMethodBeat.o(57034);
    }
  }

  public static void print(String paramString)
  {
    AppMethodBeat.i(57037);
    if (!yO(paramString))
      AppMethodBeat.o(57037);
    while (true)
    {
      return;
      heE.print(paramString);
      AppMethodBeat.o(57037);
    }
  }

  public static CollectSession yH(String paramString)
  {
    AppMethodBeat.i(57035);
    if (!yO(paramString))
    {
      paramString = null;
      AppMethodBeat.o(57035);
    }
    while (true)
    {
      return paramString;
      paramString = heE.yH(paramString);
      AppMethodBeat.o(57035);
    }
  }

  public static CollectSession yI(String paramString)
  {
    AppMethodBeat.i(57036);
    if (!heF)
    {
      paramString = null;
      AppMethodBeat.o(57036);
    }
    while (true)
    {
      return paramString;
      paramString = heE.yI(paramString);
      AppMethodBeat.o(57036);
    }
  }

  public static StringBuilder yJ(String paramString)
  {
    AppMethodBeat.i(57039);
    if (!yN(paramString))
    {
      paramString = new StringBuilder();
      AppMethodBeat.o(57039);
    }
    while (true)
    {
      return paramString;
      paramString = heE.yJ(paramString);
      AppMethodBeat.o(57039);
    }
  }

  public static void yK(String paramString)
  {
    AppMethodBeat.i(57024);
    if (paramString.length() == 0)
      AppMethodBeat.o(57024);
    while (true)
    {
      return;
      heG.add(paramString);
      AppMethodBeat.o(57024);
    }
  }

  public static void yL(String paramString)
  {
    AppMethodBeat.i(57025);
    if (paramString.length() == 0)
      AppMethodBeat.o(57025);
    while (true)
    {
      return;
      heG.remove(paramString);
      AppMethodBeat.o(57025);
    }
  }

  public static boolean yM(String paramString)
  {
    AppMethodBeat.i(57026);
    boolean bool;
    if (paramString.length() == 0)
    {
      bool = false;
      AppMethodBeat.o(57026);
    }
    while (true)
    {
      return bool;
      bool = heG.contains(paramString);
      AppMethodBeat.o(57026);
    }
  }

  private static boolean yN(String paramString)
  {
    AppMethodBeat.i(57027);
    boolean bool;
    if ((heF) && (heG.contains(paramString)))
    {
      bool = true;
      AppMethodBeat.o(57027);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(57027);
    }
  }

  private static boolean yO(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(57028);
    if (!heF)
      AppMethodBeat.o(57028);
    while (true)
    {
      return bool;
      paramString = heE.yH(paramString);
      if (paramString == null)
      {
        AppMethodBeat.o(57028);
      }
      else if (!heG.contains(paramString.groupId))
      {
        AppMethodBeat.o(57028);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(57028);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.collector.c
 * JD-Core Version:    0.6.2
 */