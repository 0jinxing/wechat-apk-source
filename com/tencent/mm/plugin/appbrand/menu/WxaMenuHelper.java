package com.tencent.mm.plugin.appbrand.menu;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

public final class WxaMenuHelper
{
  private final SparseArray<com.tencent.mm.plugin.appbrand.menu.a.a> ing;

  private WxaMenuHelper()
  {
    AppMethodBeat.i(132261);
    this.ing = new SparseArray();
    a(new c());
    a(new b());
    a(new i());
    a(new a());
    a(new h());
    a(new d());
    a(new g());
    a(new MenuDelegate_SendToDesktop());
    a(new j());
    a(new l());
    a(new m());
    a(new MenuDelegate_EnableDebug());
    a(new k());
    a(new f());
    a(new e());
    AppMethodBeat.o(132261);
  }

  private void a(com.tencent.mm.plugin.appbrand.menu.a.a parama)
  {
    AppMethodBeat.i(132263);
    this.ing.put(parama.inj, parama);
    AppMethodBeat.o(132263);
  }

  public static void c(List<n> paramList, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(132262);
    n localn = new n(paramInt, (com.tencent.mm.plugin.appbrand.menu.a.a)WxaMenuHelper.a.ini.ing.get(paramInt));
    localn.imK = paramBoolean;
    paramList.add(localn);
    AppMethodBeat.o(132262);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.WxaMenuHelper
 * JD-Core Version:    0.6.2
 */