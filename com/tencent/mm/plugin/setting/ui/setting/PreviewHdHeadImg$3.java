package com.tencent.mm.plugin.setting.ui.setting;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.e;
import com.tencent.mm.ah.e.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.ab;

final class PreviewHdHeadImg$3
  implements e.c
{
  PreviewHdHeadImg$3(PreviewHdHeadImg paramPreviewHdHeadImg, Bitmap paramBitmap)
  {
  }

  public final int cr(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126991);
    PreviewHdHeadImg.c(this.qlo).ach();
    ab.i("MicroMsg.PreviewHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      o.acd();
      Bitmap localBitmap = d.qg(PreviewHdHeadImg.a(this.qlo));
      if (localBitmap != null)
      {
        PreviewHdHeadImg localPreviewHdHeadImg = this.qlo;
        o.acd();
        PreviewHdHeadImg.a(localPreviewHdHeadImg, localBitmap, d.C(PreviewHdHeadImg.a(this.qlo), true));
        AppMethodBeat.o(126991);
      }
    }
    while (true)
    {
      return 0;
      PreviewHdHeadImg.a(this.qlo, this.qlq, null);
      break;
      PreviewHdHeadImg.a(this.qlo, this.qlq, null);
      AppMethodBeat.o(126991);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.3
 * JD-Core Version:    0.6.2
 */