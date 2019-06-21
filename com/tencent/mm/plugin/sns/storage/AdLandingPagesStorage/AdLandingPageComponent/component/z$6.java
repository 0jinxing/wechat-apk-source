package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ma;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.w;
import com.tencent.mm.sdk.b.a;

final class z$6
  implements AdLandingVideoWrapper.a
{
  z$6(z paramz)
  {
  }

  public final void Dq(int paramInt)
  {
    AppMethodBeat.i(37307);
    if ((z.a(this.rbO).qWM != null) && (paramInt * 1000 >= z.a(this.rbO).qWM.qXt) && (!this.rbO.raO))
    {
      this.rbO.raO = true;
      ma localma = new ma();
      localma.cHQ.cHR = z.a(this.rbO).qWM.cHR;
      a.xxA.m(localma);
    }
    AppMethodBeat.o(37307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z.6
 * JD-Core Version:    0.6.2
 */