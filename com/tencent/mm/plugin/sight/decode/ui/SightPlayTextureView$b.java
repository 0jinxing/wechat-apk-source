package com.tencent.mm.plugin.sight.decode.ui;

import android.graphics.Bitmap;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.sight.decode.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.lang.ref.WeakReference;

final class SightPlayTextureView$b extends b
{
  private WeakReference<SightPlayTextureView> qyP;

  public SightPlayTextureView$b(SightPlayTextureView paramSightPlayTextureView)
  {
    super(1, paramSightPlayTextureView);
    AppMethodBeat.i(24978);
    this.qyP = new WeakReference(paramSightPlayTextureView);
    AppMethodBeat.o(24978);
  }

  public final void U(Bitmap paramBitmap)
  {
  }

  public final int ckZ()
  {
    return 2131034257;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(24979);
    if (this.qyP.get() == null)
    {
      ab.e("MicroMsg.SightPlayTextureView", "onGetVideoSizeEnd, textureView is null, do clear");
      clear();
      AppMethodBeat.o(24979);
      return;
    }
    SightPlayTextureView.a((SightPlayTextureView)this.qyP.get(), paramInt1);
    SightPlayTextureView.b((SightPlayTextureView)this.qyP.get(), paramInt2);
    ab.d("MicroMsg.SightPlayTextureView", "on get video size %d*%d, needAutoResizeChatting: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(SightPlayTextureView.a((SightPlayTextureView)this.qyP.get())) });
    final ViewGroup.LayoutParams localLayoutParams = ((SightPlayTextureView)this.qyP.get()).getLayoutParams();
    if ((SightPlayTextureView.a((SightPlayTextureView)this.qyP.get())) && (paramInt1 > 0) && (paramInt2 > 0))
    {
      if (paramInt1 >= paramInt2)
        SightPlayTextureView.c((SightPlayTextureView)this.qyP.get(), a.fromDPToPix(((SightPlayTextureView)this.qyP.get()).getContext(), 150));
    }
    else
      label184: if (localLayoutParams.height != SightPlayTextureView.b((SightPlayTextureView)this.qyP.get()) * paramInt2 / paramInt1)
      {
        localLayoutParams.width = SightPlayTextureView.b((SightPlayTextureView)this.qyP.get());
        localLayoutParams.height = (SightPlayTextureView.b((SightPlayTextureView)this.qyP.get()) * paramInt2 / paramInt1);
        if ((SightPlayTextureView.a((SightPlayTextureView)this.qyP.get())) && (localLayoutParams.height < a.fromDPToPix(((SightPlayTextureView)this.qyP.get()).getContext(), 50)))
          localLayoutParams.height = a.fromDPToPix(((SightPlayTextureView)this.qyP.get()).getContext(), 50);
        ab.i("MicroMsg.SightPlayTextureView", "params width %d height %d", new Object[] { Integer.valueOf(localLayoutParams.width), Integer.valueOf(localLayoutParams.height) });
        if (!al.isMainThread())
          break label452;
        ((SightPlayTextureView)this.qyP.get()).setLayoutParams(localLayoutParams);
      }
    while (true)
    {
      this.qxs = b.b(((SightPlayTextureView)this.qyP.get()).getContext(), SightPlayTextureView.c((SightPlayTextureView)this.qyP.get()), SightPlayTextureView.b((SightPlayTextureView)this.qyP.get()), paramInt1, paramInt2);
      AppMethodBeat.o(24979);
      break;
      SightPlayTextureView.c((SightPlayTextureView)this.qyP.get(), a.fromDPToPix(((SightPlayTextureView)this.qyP.get()).getContext(), 85));
      break label184;
      label452: al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(24977);
          ((SightPlayTextureView)SightPlayTextureView.b.a(SightPlayTextureView.b.this).get()).setLayoutParams(localLayoutParams);
          AppMethodBeat.o(24977);
        }
      });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SightPlayTextureView.b
 * JD-Core Version:    0.6.2
 */