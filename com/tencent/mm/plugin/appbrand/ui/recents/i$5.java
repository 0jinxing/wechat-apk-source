package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.q;
import com.tencent.mm.plugin.appbrand.launching.precondition.f;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.model.l;
import com.tencent.mm.plugin.appbrand.report.model.l.a;
import com.tencent.mm.plugin.appbrand.report.model.l.b;
import com.tencent.mm.protocal.protobuf.are;
import com.tencent.mm.protocal.protobuf.bdt;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class i$5
  implements Runnable
{
  i$5(i parami)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(133449);
    if (i.f(this.iOq) == null)
    {
      AppMethodBeat.o(133449);
      return;
    }
    Object localObject1 = q.axq();
    Object localObject2;
    if (localObject1 != null)
    {
      int j;
      if (((are)localObject1).wvf == 1)
        j = 1;
      while (true)
        if (j != 0)
        {
          localObject2 = ((are)localObject1).wvg;
          if (localObject2 == null)
          {
            ab.e("MicroMsg.AppBrandLauncherRecentsListHeader", "onCellClicked, useMiniProgram but invalid appInfo, just return");
            AppMethodBeat.o(133449);
            break;
            j = 0;
            continue;
          }
          if (b.dnO())
            i = ((bdt)localObject2).type;
          AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
          localAppBrandStatObject.scene = 1001;
          f.ijT.a(i.f(this.iOq), ((bdt)localObject2).username, null, ((bdt)localObject2).path, i, ((bdt)localObject2).vOP, localAppBrandStatObject, null, null);
          label142: i.g(this.iOq);
          localObject2 = new l();
          ((l)localObject2).iBL = l.b.iBY;
          ((l)localObject2).iBM = ((are)localObject1).jsN;
          ((l)localObject2).iBN = ((are)localObject1).wuS;
          if (j == 0)
            break label263;
        }
    }
    label263: for (localObject1 = l.a.iBT; ; localObject1 = l.a.iBQ)
    {
      ((l)localObject2).iBP = ((l.a)localObject1);
      ((l)localObject2).IF();
      AppMethodBeat.o(133449);
      break;
      if (!bo.isNullOrNil(((are)localObject1).wuU))
      {
        ((com.tencent.mm.plugin.appbrand.compat.a.a)g.K(com.tencent.mm.plugin.appbrand.compat.a.a.class)).T(i.f(this.iOq), ((are)localObject1).wuU);
        break label142;
      }
      ab.e("MicroMsg.AppBrandLauncherRecentsListHeader", "onCellClicked, useMiniProgram false, url empty, just return");
      AppMethodBeat.o(133449);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.i.5
 * JD-Core Version:    0.6.2
 */