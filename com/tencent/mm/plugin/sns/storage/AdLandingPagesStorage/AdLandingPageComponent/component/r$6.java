package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ma;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.z;
import com.tencent.mm.sdk.b.a;

final class r$6
  implements AdLandingVideoWrapper.a
{
  r$6(r paramr)
  {
  }

  public final void Dq(int paramInt)
  {
    AppMethodBeat.i(37209);
    if ((r.a(this.rbn).qWM != null) && (paramInt * 1000 >= r.a(this.rbn).qWM.qXt) && (!this.rbn.raO))
    {
      this.rbn.raO = true;
      ma localma = new ma();
      localma.cHQ.cHR = r.a(this.rbn).qWM.cHR;
      a.xxA.m(localma);
    }
    AppMethodBeat.o(37209);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r.6
 * JD-Core Version:    0.6.2
 */