package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.BitmapFactory;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class u$1
  implements f.a
{
  u$1(u paramu)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37246);
    try
    {
      paramString = BitmapFactory.decodeFile(paramString);
      this.rbA.setImage(paramString);
      AppMethodBeat.o(37246);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Sns.AdLandingPagePanoramaImageComponent", "%s" + bo.l(paramString));
        AppMethodBeat.o(37246);
      }
    }
  }

  public final void cmD()
  {
    AppMethodBeat.i(37245);
    this.rbA.progressBar.setVisibility(8);
    AppMethodBeat.o(37245);
  }

  public final void cpu()
  {
    AppMethodBeat.i(37244);
    this.rbA.startLoading();
    AppMethodBeat.o(37244);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u.1
 * JD-Core Version:    0.6.2
 */