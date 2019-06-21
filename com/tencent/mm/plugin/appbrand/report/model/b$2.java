package com.tencent.mm.plugin.appbrand.report.model;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.r;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

final class b$2
  implements Runnable
{
  b$2(b paramb, w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132580);
    Object localObject1 = this.iAP.iAJ;
    Object localObject2 = this.iAQ;
    Object localObject3 = n.cY(((u)localObject2).mContext);
    if ((localObject3 != null) && (((Activity)localObject3).isFinishing()))
      ((k)localObject1).iBy = true;
    ((k)localObject1).o((w)localObject2);
    ((k)localObject1).IF();
    localObject2 = this.iAP.iAL;
    localObject1 = this.iAQ;
    ((p)localObject2).iBB = ((String)((p)localObject2).iCy.peekFirst());
    ((p)localObject2).iBD = null;
    Intent localIntent;
    switch (p.2.gWZ[com.tencent.mm.plugin.appbrand.g.wV(localObject2.appId).ordinal()])
    {
    default:
      localIntent = ((p)localObject2).gOq.atJ().getReporter().aHY();
      if (localIntent != null)
        if (localIntent.getComponent() == null)
        {
          localObject3 = "";
          ab.e("MicroMsg.AppBrand.Report.kv_14992", "onBackground, intent %s, get null cmp name", new Object[] { localIntent });
          ((p)localObject2).iBC = 8;
          ((p)localObject2).iBD = bo.bc(localIntent.getStringExtra(AppBrandProcessProxyUI.huZ), (String)localObject3);
          localObject3 = ((p)localObject2).iBD;
          ((p)localObject2).iCy.pollFirst();
          ((p)localObject2).iCy.push(bo.nullAsNil((String)localObject3));
        }
      break;
    case 3:
    case 1:
    case 2:
    }
    while (true)
    {
      localObject3 = n.cY(((u)localObject1).mContext);
      if ((localObject3 != null) && (((Activity)localObject3).isFinishing()))
        ((p)localObject2).iBy = true;
      ((p)localObject2).q((w)localObject1);
      AppMethodBeat.o(132580);
      return;
      ((p)localObject2).iBC = 3;
      continue;
      ((p)localObject2).iBC = 6;
      continue;
      localObject3 = localIntent.getComponent().getClassName();
      break;
      ((p)localObject2).iBC = 7;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.b.2
 * JD-Core Version:    0.6.2
 */