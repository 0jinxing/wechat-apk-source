package com.tencent.luggage.sdk.b;

import android.app.Activity;
import android.text.TextUtils;
import com.tencent.luggage.g.d;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.a.a.b;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.widget.input.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

final class a$1
  implements Runnable
{
  a$1(a parama, com.tencent.mm.plugin.appbrand.i parami, AppBrandInitConfigLU paramAppBrandInitConfigLU, AppBrandStatObject paramAppBrandStatObject)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(101682);
    n.w(this.bRm.gNy);
    if (this.bRj == null)
      this.bRm.atx();
    Object localObject1 = this.bRm;
    Object localObject2 = this.bRk.appId;
    Object localObject3 = ((k)localObject1).gOB.iterator();
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject4 = (com.tencent.mm.plugin.appbrand.i)((Iterator)localObject3).next();
      if (((com.tencent.mm.plugin.appbrand.i)localObject4).mAppId.equals(localObject2))
      {
        localObject4 = (b)localObject4;
        this.bRk.bQn = this.bRl;
        if (localObject4 != null)
          break label276;
        localObject4 = (b)this.bRm.e(this.bRk);
        localObject2 = this.bRm;
        localObject3 = this.bRk;
        if (!TextUtils.isEmpty(((AppBrandInitConfigLU)localObject3).hfh))
        {
          localObject1 = ((k)localObject2).gOD.getContext();
          if ((localObject1 != null) && (!((Activity)localObject1).isFinishing()))
            break label227;
        }
        label162: this.bRm.a(this.bRj, (com.tencent.mm.plugin.appbrand.i)localObject4, this.bRk);
      }
    }
    while (true)
    {
      if ((this.bRm.e((com.tencent.mm.plugin.appbrand.i)localObject4)) && (((b)localObject4).asU() != null))
        ((com.tencent.mm.plugin.appbrand.i)localObject4).gNS = true;
      AppMethodBeat.o(101682);
      return;
      localObject4 = (com.tencent.mm.plugin.appbrand.i)((k)localObject1).gOC.get(localObject2);
      break;
      label227: d.i("Luggage.AppBrandRuntimeContainerLU", "tryRequestOrientation appId[%s] orientation[%s]", new Object[] { ((AppBrandInitConfigLU)localObject3).appId, ((AppBrandInitConfigLU)localObject3).hfh });
      localObject3 = com.tencent.mm.plugin.appbrand.config.a.a.g((AppBrandInitConfig)localObject3);
      com.tencent.mm.plugin.appbrand.config.a.a.t((Activity)localObject1).a((a.b)localObject3, new a.2((a)localObject2));
      break label162;
      label276: if (this.bRj == localObject4)
      {
        this.bRm.b(null, (com.tencent.mm.plugin.appbrand.i)localObject4, this.bRk);
        this.bRm.onResume();
      }
      else
      {
        this.bRm.b(this.bRj, (com.tencent.mm.plugin.appbrand.i)localObject4, this.bRk);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.b.a.1
 * JD-Core Version:    0.6.2
 */