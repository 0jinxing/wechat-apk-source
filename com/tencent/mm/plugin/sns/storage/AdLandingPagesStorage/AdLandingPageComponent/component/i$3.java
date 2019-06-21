package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class i$3
  implements f.a
{
  i$3(i parami, ImageView paramImageView)
  {
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37080);
    try
    {
      paramString = BitmapFactory.decodeFile(paramString);
      this.qZA.setImageBitmap(paramString);
      this.qZA.setVisibility(0);
      AppMethodBeat.o(37080);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AdLandingPageBottomSheet", "%s" + bo.l(paramString));
        AppMethodBeat.o(37080);
      }
    }
  }

  public final void cmD()
  {
  }

  public final void cpu()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i.3
 * JD-Core Version:    0.6.2
 */