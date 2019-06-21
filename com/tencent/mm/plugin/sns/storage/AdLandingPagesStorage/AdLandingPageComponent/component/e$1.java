package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$1
  implements f.a
{
  e$1(e parame)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37051);
    try
    {
      this.qZi.stopLoading();
      localBitmap = BitmapFactory.decodeFile(paramString);
      paramString = this.qZi;
      if (localBitmap == null)
      {
        ab.e("AdLandingImageComp", "when set image the bmp is null!");
        AppMethodBeat.o(37051);
      }
      while (true)
      {
        return;
        if (paramString.cAw != null)
          break;
        ab.e("AdLandingImageComp", "when set image the imageView is null!");
        AppMethodBeat.o(37051);
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        Bitmap localBitmap;
        ab.e("AdLandingImageComp", "%s" + bo.l(paramString));
        AppMethodBeat.o(37051);
        continue;
        if (localBitmap.getWidth() == 0)
        {
          ab.e("AdLandingImageComp", "when set image the bmp.getWidth is 0!");
          AppMethodBeat.o(37051);
        }
        else
        {
          paramString.cAw.setImageBitmap(localBitmap);
          paramString.progressBar.setVisibility(8);
          AppMethodBeat.o(37051);
        }
      }
    }
  }

  public final void cmD()
  {
    AppMethodBeat.i(37050);
    this.qZi.stopLoading();
    AppMethodBeat.o(37050);
  }

  public final void cpu()
  {
    AppMethodBeat.i(37049);
    this.qZi.startLoading();
    AppMethodBeat.o(37049);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e.1
 * JD-Core Version:    0.6.2
 */