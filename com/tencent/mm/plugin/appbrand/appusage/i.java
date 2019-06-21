package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qp;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public enum i
{
  public static final c<qp> gZa;

  static
  {
    AppMethodBeat.i(129546);
    gZb = new i[0];
    gZa = new i.1();
    AppMethodBeat.o(129546);
  }

  public static boolean axb()
  {
    boolean bool = false;
    AppMethodBeat.i(129537);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(129537);
    while (true)
    {
      return bool;
      if (com.tencent.mm.m.g.Nu().getInt("WeAppForbiddenSwitch", 0) == 1)
      {
        ab.i("MicroMsg.AppBrandEntranceLogic", "showInFindMore, WeAppForbiddenSwitch == 1, not show");
        AppMethodBeat.o(129537);
      }
      else if ((axg()) || (r.axt()))
      {
        AppMethodBeat.o(129537);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(129537);
      }
    }
  }

  public static void axc()
  {
    AppMethodBeat.i(129538);
    if (!com.tencent.mm.kernel.g.RK())
      AppMethodBeat.o(129538);
    while (true)
    {
      return;
      if (axd())
      {
        r.e locale = r.e.hab;
        r.e.a("", 0L, 2, 1);
      }
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOk, Boolean.FALSE);
      AppMethodBeat.o(129538);
    }
  }

  static boolean axd()
  {
    AppMethodBeat.i(129539);
    boolean bool;
    if (!com.tencent.mm.kernel.g.RK())
    {
      bool = false;
      AppMethodBeat.o(129539);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xOk, Boolean.FALSE)).booleanValue();
      AppMethodBeat.o(129539);
    }
  }

  public static boolean axe()
  {
    AppMethodBeat.i(129543);
    boolean bool;
    if (!com.tencent.mm.kernel.g.RK())
    {
      bool = false;
      AppMethodBeat.o(129543);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNZ, Boolean.FALSE)).booleanValue();
      AppMethodBeat.o(129543);
    }
  }

  public static boolean axf()
  {
    AppMethodBeat.i(129544);
    t.axG();
    boolean bool;
    if (!com.tencent.mm.kernel.g.RK())
    {
      bool = false;
      AppMethodBeat.o(129544);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNY, Boolean.FALSE)).booleanValue();
      AppMethodBeat.o(129544);
    }
  }

  public static boolean axg()
  {
    AppMethodBeat.i(129545);
    boolean bool;
    if ((axf()) || (axe()))
    {
      bool = true;
      AppMethodBeat.o(129545);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129545);
    }
  }

  private static void g(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(129541);
    if (!com.tencent.mm.kernel.g.RK())
    {
      AppMethodBeat.o(129541);
      return;
    }
    Object localObject = (Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xNZ, null);
    if ((localObject != null) && (!((Boolean)localObject).booleanValue()) && (paramBoolean))
    {
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOk, Boolean.TRUE);
      localObject = r.e.hab;
      r.e.axD();
    }
    for (int i = 1; ; i = 0)
    {
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xNZ, Boolean.valueOf(paramBoolean));
      if (i != 0)
      {
        localObject = f.auN();
        if (localObject != null)
          ((AppBrandGuideUI.a)localObject).DV(paramString);
      }
      AppMethodBeat.o(129541);
      break;
    }
  }

  static void nx(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(129540);
    if (!com.tencent.mm.kernel.g.RK())
    {
      AppMethodBeat.o(129540);
      return;
    }
    z localz = com.tencent.mm.kernel.g.RP().Ry();
    label34: ac.a locala;
    if ((paramInt & 0x2) > 0)
    {
      bool2 = true;
      g(bool2, "");
      locala = ac.a.xNY;
      if ((paramInt & 0x1) <= 0)
        break label76;
    }
    label76: for (boolean bool2 = bool1; ; bool2 = false)
    {
      localz.set(locala, Boolean.valueOf(bool2));
      AppMethodBeat.o(129540);
      break;
      bool2 = false;
      break label34;
    }
  }

  static void yt(String paramString)
  {
    AppMethodBeat.i(129542);
    g(true, paramString);
    AppMethodBeat.o(129542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.i
 * JD-Core Version:    0.6.2
 */