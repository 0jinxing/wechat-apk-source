package com.tencent.mm.plugin.appbrand.menu;

import a.f.b.j;
import a.l;
import com.tencent.magicbrush.MBRuntime;
import com.tencent.magicbrush.MBRuntime.MBParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.b;
import com.tencent.mm.plugin.appbrand.q;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/menu/ShowPkgInfoKt;", "", "()V", "showWAGameInfoIfNeeded", "", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "service", "Lcom/tencent/mm/plugin/appbrand/AppBrandService;", "plugin-appbrand-integration_release"})
public final class p
{
  public static final p inf;

  static
  {
    AppMethodBeat.i(134756);
    inf = new p();
    AppMethodBeat.o(134756);
  }

  public static void a(StringBuilder paramStringBuilder, q paramq)
  {
    AppMethodBeat.i(134755);
    j.p(paramStringBuilder, "sb");
    if ((paramq == null) || (!(paramq instanceof b)))
      AppMethodBeat.o(134755);
    MBRuntime localMBRuntime;
    while (true)
    {
      return;
      localMBRuntime = ((b)paramq).getMBRuntime();
      if (localMBRuntime != null)
        break;
      paramStringBuilder.append("\n[renderer] ").append("unknown");
      AppMethodBeat.o(134755);
    }
    paramStringBuilder.append("\n[renderer] ").append("mbruntime");
    if (localMBRuntime.getParams().use_command_buffer)
      paramStringBuilder.append(" commandbuffer");
    paramq = paramStringBuilder.append("\n[renderer] ").append("antialias ");
    if (localMBRuntime.getParams().allow_antialias_);
    for (paramStringBuilder = "allowed"; ; paramStringBuilder = "disallowed")
    {
      paramq.append(paramStringBuilder);
      AppMethodBeat.o(134755);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.p
 * JD-Core Version:    0.6.2
 */