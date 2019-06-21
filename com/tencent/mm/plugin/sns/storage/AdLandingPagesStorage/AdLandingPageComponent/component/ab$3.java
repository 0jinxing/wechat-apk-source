package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.CountDownLatch;

final class ab$3
  implements f.a
{
  ab$3(ab paramab)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37350);
    try
    {
      ab.b(this.rca, MMBitmapFactory.decodeFile(paramString));
      ab.a(this.rca).countDown();
      AppMethodBeat.o(37350);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("AdlandingRadarChartComp", "%s" + bo.l(paramString));
        AppMethodBeat.o(37350);
      }
    }
  }

  public final void cmD()
  {
    AppMethodBeat.i(37349);
    ab.b(this.rca, null);
    ab.a(this.rca).countDown();
    AppMethodBeat.o(37349);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.3
 * JD-Core Version:    0.6.2
 */