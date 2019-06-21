package com.tencent.mm.plugin.setting.ui.setting;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.vfs.e;

final class PreviewHdHeadImg$1$1
  implements n.c
{
  PreviewHdHeadImg$1$1(PreviewHdHeadImg.1 param1)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(126987);
    paraml.hi(1, 2131303049);
    Bitmap localBitmap = b.a(PreviewHdHeadImg.a(this.qlp.qlo), true, -1);
    o.acd();
    if (e.ct(d.D(r.Yz() + ".last", true)))
      paraml.hi(3, 2131303246);
    if (localBitmap != null)
      paraml.hi(2, 2131300409);
    AppMethodBeat.o(126987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.1.1
 * JD-Core Version:    0.6.2
 */