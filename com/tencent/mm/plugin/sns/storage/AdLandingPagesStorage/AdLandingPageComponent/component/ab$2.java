package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.CountDownLatch;

final class ab$2
  implements f.a
{
  ab$2(ab paramab)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37348);
    try
    {
      paramString = MMBitmapFactory.decodeFile(paramString);
      ab.a(this.rca, paramString);
      ab.a(this.rca).countDown();
      AppMethodBeat.o(37348);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("AdlandingRadarChartComp", "%s" + bo.l(paramString));
        AppMethodBeat.o(37348);
      }
    }
  }

  public final void cmD()
  {
    AppMethodBeat.i(37347);
    ab.a(this.rca, null);
    ab.a(this.rca).countDown();
    AppMethodBeat.o(37347);
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ab.2
 * JD-Core Version:    0.6.2
 */