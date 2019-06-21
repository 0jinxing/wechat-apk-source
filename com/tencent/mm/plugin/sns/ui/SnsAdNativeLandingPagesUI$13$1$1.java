package com.tencent.mm.plugin.sns.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

final class SnsAdNativeLandingPagesUI$13$1$1
  implements Runnable
{
  SnsAdNativeLandingPagesUI$13$1$1(SnsAdNativeLandingPagesUI.13.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38641);
    Bitmap localBitmap = d.eA(SnsAdNativeLandingPagesUI.e(this.roR.roQ.roM));
    if (localBitmap != null)
    {
      SnsAdNativeLandingPagesUI.e(this.roR.roQ.roM).setVisibility(4);
      SnsAdNativeLandingPagesUI.b(this.roR.roQ.roM).setAlpha(1.0F);
      SnsAdNativeLandingPagesUI.f(this.roR.roQ.roM).setImageBitmap(localBitmap);
      SnsAdNativeLandingPagesUI.g(this.roR.roQ.roM);
      AppMethodBeat.o(38641);
    }
    while (true)
    {
      return;
      SnsAdNativeLandingPagesUI.b(this.roR.roQ.roM).setAlpha(1.0F);
      AppMethodBeat.o(38641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.13.1.1
 * JD-Core Version:    0.6.2
 */