package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.BitmapFactory;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class w$1
  implements f.a
{
  w$1(w paramw)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37265);
    try
    {
      paramString = BitmapFactory.decodeFile(paramString);
      this.rbE.Y(paramString);
      AppMethodBeat.o(37265);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("AdLandingPagePureImageComponet", "%s" + bo.l(paramString));
        AppMethodBeat.o(37265);
      }
    }
  }

  public final void cmD()
  {
    AppMethodBeat.i(37264);
    this.rbE.progressBar.setVisibility(8);
    AppMethodBeat.o(37264);
  }

  public final void cpu()
  {
    AppMethodBeat.i(37263);
    this.rbE.startLoading();
    AppMethodBeat.o(37263);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.w.1
 * JD-Core Version:    0.6.2
 */