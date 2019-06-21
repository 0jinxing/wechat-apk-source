package com.tencent.mm.plugin.expt.hellhound;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.expt.a.b.a;
import com.tencent.mm.plugin.expt.hellhound.a.a.b;
import com.tencent.mm.plugin.expt.hellhound.a.c.d;
import com.tencent.mm.sdk.platformtools.ab;

final class b$1
  implements b.a
{
  public final void B(Activity paramActivity)
  {
    AppMethodBeat.i(73329);
    String str = paramActivity.getClass().getCanonicalName();
    b.s(100, str, String.valueOf(paramActivity.hashCode()));
    d.a(0, str, paramActivity);
    AppMethodBeat.o(73329);
  }

  public final void C(Activity paramActivity)
  {
    AppMethodBeat.i(73330);
    if (paramActivity == null)
      AppMethodBeat.o(73330);
    while (true)
    {
      return;
      String str = paramActivity.getClass().getCanonicalName();
      b.s(101, str, String.valueOf(paramActivity.hashCode()));
      d.a(1, str, paramActivity);
      AppMethodBeat.o(73330);
    }
  }

  public final void D(Activity paramActivity)
  {
    AppMethodBeat.i(73331);
    if (paramActivity == null)
      AppMethodBeat.o(73331);
    while (true)
    {
      return;
      b.s(102, paramActivity.getClass().getCanonicalName(), String.valueOf(paramActivity.hashCode()));
      AppMethodBeat.o(73331);
    }
  }

  public final void E(Activity paramActivity)
  {
    AppMethodBeat.i(73332);
    if (paramActivity == null)
      AppMethodBeat.o(73332);
    while (true)
    {
      return;
      d.a(2, paramActivity.getClass().getCanonicalName(), paramActivity);
      AppMethodBeat.o(73332);
    }
  }

  public final void KM(String paramString)
  {
    AppMethodBeat.i(73326);
    ab.d("HellhoundService", "habbyge-mali, callback, startActivity: ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(73326);
  }

  public final void ea(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73327);
    b.s(103, paramString1, paramString2);
    AppMethodBeat.o(73327);
  }

  public final void eb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73328);
    b.s(103, paramString1, paramString2);
    AppMethodBeat.o(73328);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.hellhound.b.1
 * JD-Core Version:    0.6.2
 */