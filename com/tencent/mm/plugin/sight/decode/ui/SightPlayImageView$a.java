package com.tencent.mm.plugin.sight.decode.ui;

import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;

final class SightPlayImageView$a extends b
{
  private WeakReference<SightPlayImageView> qyB;

  public SightPlayImageView$a(SightPlayImageView paramSightPlayImageView)
  {
    super(0, paramSightPlayImageView);
    AppMethodBeat.i(70253);
    this.qyB = new WeakReference(paramSightPlayImageView);
    AppMethodBeat.o(70253);
  }

  public final void U(Bitmap paramBitmap)
  {
    AppMethodBeat.i(70255);
    SightPlayImageView localSightPlayImageView = (SightPlayImageView)this.qyB.get();
    if (localSightPlayImageView == null)
    {
      ab.e("MicroMsg.SightPlayImageView", "onGetFrameBmp, imageView is null, do clear");
      clear();
      AppMethodBeat.o(70255);
    }
    while (true)
    {
      return;
      localSightPlayImageView.setImageBitmap(paramBitmap);
      AppMethodBeat.o(70255);
    }
  }

  public final int ckZ()
  {
    return 2131034257;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70254);
    SightPlayImageView localSightPlayImageView = (SightPlayImageView)this.qyB.get();
    if (localSightPlayImageView == null)
    {
      ab.e("MicroMsg.SightPlayImageView", "onGetVideoSizeEnd, imageView is null, do clear");
      clear();
      AppMethodBeat.o(70254);
    }
    while (true)
    {
      return;
      if (!SightPlayImageView.a(localSightPlayImageView))
        break;
      AppMethodBeat.o(70254);
    }
    SightPlayImageView.a(localSightPlayImageView, paramInt1);
    SightPlayImageView.b(localSightPlayImageView, paramInt2);
    if (localSightPlayImageView.llE != null)
      localSightPlayImageView.llE.dH(paramInt1, paramInt2);
    if (SightPlayImageView.b(localSightPlayImageView))
    {
      if (SightPlayImageView.c(localSightPlayImageView) < SightPlayImageView.d(localSightPlayImageView))
        break label272;
      SightPlayImageView.c(localSightPlayImageView, a.fromDPToPix(localSightPlayImageView.getContext(), 150));
    }
    while (true)
    {
      if (SightPlayImageView.e(localSightPlayImageView) > 0)
      {
        ViewGroup.LayoutParams localLayoutParams = localSightPlayImageView.getLayoutParams();
        if ((localLayoutParams.width != SightPlayImageView.e(localSightPlayImageView)) || (localLayoutParams.height != SightPlayImageView.e(localSightPlayImageView) * paramInt2 / paramInt1))
        {
          localLayoutParams.width = SightPlayImageView.e(localSightPlayImageView);
          localLayoutParams.height = (SightPlayImageView.e(localSightPlayImageView) * paramInt2 / paramInt1);
          al.d(new SightPlayImageView.a.1(this, localSightPlayImageView, localLayoutParams));
          localSightPlayImageView.postInvalidate();
        }
        ab.i("MicroMsg.SightPlayImageView", "onGetVideoSize::params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
      }
      ab.i("MicroMsg.SightPlayImageView", "onGetVideoSize::DrawWidth %d, video size %d*%d", new Object[] { Integer.valueOf(SightPlayImageView.e(localSightPlayImageView)), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      AppMethodBeat.o(70254);
      break;
      label272: SightPlayImageView.c(localSightPlayImageView, a.fromDPToPix(localSightPlayImageView.getContext(), 85));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView.a
 * JD-Core Version:    0.6.2
 */