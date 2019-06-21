package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.c;

public final class a extends View
{
  private c qYw;

  public a(Context paramContext, c paramc)
  {
    super(paramContext);
    this.qYw = paramc;
  }

  public final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(36964);
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = getWidth();
    int k = (int)(Math.min(i, j) / 2.0F * 0.8D);
    j = (int)(j / 2.0F);
    i = (int)(i / 2.0F);
    Bitmap localBitmap = this.qYw.qYe;
    if (localBitmap != null)
    {
      k = (int)(k * 2 + this.qYw.qYf * 2.0F);
      int m = localBitmap.getWidth() * k / localBitmap.getHeight();
      paramCanvas.drawBitmap(Bitmap.createScaledBitmap(localBitmap, m, k, false), j - (m >>> 1), i - (k >>> 1), null);
    }
    AppMethodBeat.o(36964);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.view.a
 * JD-Core Version:    0.6.2
 */