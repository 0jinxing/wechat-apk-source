package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import android.app.Activity;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;

final class b$2
  implements Runnable
{
  b$2(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(117373);
    Object localObject1;
    Object localObject2;
    if (this.idQ.hcM != null)
    {
      localObject1 = null;
      if (!(this.idQ.hcM instanceof q))
        break label73;
      localObject2 = ((q)this.idQ.hcM).ad(Activity.class);
    }
    while (true)
    {
      if (localObject2 != null)
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "startKeepScreenOn");
        ((Activity)localObject2).getWindow().addFlags(128);
      }
      AppMethodBeat.o(117373);
      return;
      label73: localObject2 = localObject1;
      if ((this.idQ.hcM instanceof u))
      {
        localObject2 = localObject1;
        if ((this.idQ.hcM.getContext() instanceof Activity))
          localObject2 = (Activity)this.idQ.hcM.getContext();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b.2
 * JD-Core Version:    0.6.2
 */