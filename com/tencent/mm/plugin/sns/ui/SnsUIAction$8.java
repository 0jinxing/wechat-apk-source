package com.tencent.mm.plugin.sns.ui;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class SnsUIAction$8
  implements SnsHeader.b
{
  SnsUIAction$8(SnsUIAction paramSnsUIAction)
  {
  }

  public final void aa(Bitmap paramBitmap)
  {
    AppMethodBeat.i(39646);
    if (paramBitmap != null)
    {
      int i = a.fromDPToPix(SnsUIAction.a(this.rCe), 65);
      int j = i;
      if (i > paramBitmap.getHeight())
        j = paramBitmap.getHeight();
      j = com.tencent.mm.ui.ae.ao(Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), j))[0];
      if (this.rCe.miL != null)
        this.rCe.miL.setBackgroundColor(j);
    }
    AppMethodBeat.o(39646);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.8
 * JD-Core Version:    0.6.2
 */