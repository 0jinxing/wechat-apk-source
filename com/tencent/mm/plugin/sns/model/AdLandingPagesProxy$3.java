package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.storage.b;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;

final class AdLandingPagesProxy$3
  implements Runnable
{
  AdLandingPagesProxy$3(AdLandingPagesProxy paramAdLandingPagesProxy, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(35918);
    if (!g.RN().QY())
      AppMethodBeat.o(35918);
    while (true)
    {
      return;
      Object localObject = af.cnF().YS(this.fWy);
      if (localObject != null)
      {
        localObject = ((n)localObject).cqo();
        if (localObject != null)
        {
          AdLandingPagesProxy.Xy(((b)localObject).coT());
          AdLandingPagesProxy.Xy(((b)localObject).coU());
        }
      }
      AppMethodBeat.o(35918);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.3
 * JD-Core Version:    0.6.2
 */