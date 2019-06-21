package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.f.a;
import com.tencent.mm.sdk.platformtools.ab;

final class k$1
  implements f.a
{
  k$1(k paramk)
  {
  }

  @TargetApi(16)
  public final void YJ(String paramString)
  {
    AppMethodBeat.i(37086);
    try
    {
      paramString = Drawable.createFromPath(paramString);
      this.qZD.qZB.setBackground(paramString);
      if ((paramString != null) && (this.qZD.cpI().height > 0.0F) && (paramString.getIntrinsicHeight() > 0))
      {
        float f = this.qZD.cpI().height * paramString.getIntrinsicWidth() / paramString.getIntrinsicHeight();
        paramString = this.qZD.qZB;
        RelativeLayout.LayoutParams localLayoutParams = new android/widget/RelativeLayout$LayoutParams;
        localLayoutParams.<init>((int)f, (int)this.qZD.cpI().height);
        paramString.setLayoutParams(localLayoutParams);
      }
      AppMethodBeat.o(37086);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.Sns.AdLandingPageBtnComponent", "the backgroundCoverUrl is set error ,because " + paramString.toString());
        AppMethodBeat.o(37086);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k.1
 * JD-Core Version:    0.6.2
 */