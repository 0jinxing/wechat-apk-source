package com.tencent.mm.bg;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bh.d;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.a.kc.b;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

public final class e
{
  public static c a(Context paramContext, int paramInt, Runnable paramRunnable)
  {
    AppMethodBeat.i(78818);
    paramContext = new c.a(paramContext);
    paramContext.PV(2131297061);
    paramContext.PZ(paramInt);
    paramContext.Qc(2131296955).a(new e.1(paramRunnable));
    paramContext.rc(true);
    paramContext.f(new e.2(paramRunnable));
    paramContext = paramContext.aMb();
    paramContext.show();
    AppMethodBeat.o(78818);
    return paramContext;
  }

  public static boolean akI()
  {
    AppMethodBeat.i(78815);
    kc localkc = new kc();
    localkc.cFw.action = 2;
    com.tencent.mm.sdk.b.a.xxA.m(localkc);
    boolean bool = localkc.cFx.cFy;
    AppMethodBeat.o(78815);
    return bool;
  }

  public static boolean akJ()
  {
    AppMethodBeat.i(78816);
    boolean bool;
    if ((g.fUs != null) && (g.fUs.akv()))
    {
      bool = true;
      AppMethodBeat.o(78816);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78816);
    }
  }

  public static boolean akK()
  {
    AppMethodBeat.i(78817);
    boolean bool;
    if ((d.fUu != null) && (d.fUu.akL()))
    {
      bool = true;
      AppMethodBeat.o(78817);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78817);
    }
  }

  public static boolean bH(Context paramContext)
  {
    AppMethodBeat.i(78814);
    boolean bool = com.tencent.mm.r.a.bH(paramContext);
    AppMethodBeat.o(78814);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bg.e
 * JD-Core Version:    0.6.2
 */