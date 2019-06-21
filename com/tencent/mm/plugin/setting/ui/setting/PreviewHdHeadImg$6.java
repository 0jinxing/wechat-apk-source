package com.tencent.mm.plugin.setting.ui.setting;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.av;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;

final class PreviewHdHeadImg$6
  implements Runnable
{
  PreviewHdHeadImg$6(PreviewHdHeadImg paramPreviewHdHeadImg, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126994);
    ab.d("MicroMsg.PreviewHdHeadImg", "updateHeadImg hasUin:%b user:%s", new Object[] { Boolean.valueOf(g.RK()), r.Yz() });
    if (g.RK())
    {
      if (this.val$bitmap != null)
      {
        o.acd();
        str = d.D(r.Yz() + ".last", true);
        PreviewHdHeadImg.e(this.val$bitmap, str);
      }
      String str = b.pX(r.Yz());
      av.fly.ou(str);
    }
    PreviewHdHeadImg.d(this.qlo);
    AppMethodBeat.o(126994);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.6
 * JD-Core Version:    0.6.2
 */