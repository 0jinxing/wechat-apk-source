package com.tencent.mm.plugin.sight.decode.ui;

import android.graphics.Bitmap;
import android.widget.ImageView.ScaleType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

final class SightPlayAutoSizeImageView$a extends b
{
  private WeakReference<SightPlayAutoSizeImageView> qyB;

  public SightPlayAutoSizeImageView$a(SightPlayAutoSizeImageView paramSightPlayAutoSizeImageView)
  {
    super(0, paramSightPlayAutoSizeImageView);
    AppMethodBeat.i(24956);
    this.qyB = new WeakReference(paramSightPlayAutoSizeImageView);
    AppMethodBeat.o(24956);
  }

  public final void U(Bitmap paramBitmap)
  {
    AppMethodBeat.i(24957);
    SightPlayAutoSizeImageView localSightPlayAutoSizeImageView = (SightPlayAutoSizeImageView)this.qyB.get();
    if (localSightPlayAutoSizeImageView == null)
    {
      ab.e("MicroMsg.SightPlayAutoSizeImageView", "onGetFrameBmp, imageView is null, do clear");
      clear();
      AppMethodBeat.o(24957);
    }
    while (true)
    {
      return;
      localSightPlayAutoSizeImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
      localSightPlayAutoSizeImageView.setImageBitmap(paramBitmap);
      AppMethodBeat.o(24957);
    }
  }

  public final int ckZ()
  {
    return 2131034257;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayAutoSizeImageView.a
 * JD-Core Version:    0.6.2
 */