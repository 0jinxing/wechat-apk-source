package com.tencent.mm.plugin.game.f;

import android.graphics.Bitmap;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;

final class e$4 extends e.b
{
  e$4(e parame, e.b paramb, int paramInt1, int paramInt2, String paramString)
  {
  }

  public final void a(View paramView, Bitmap paramBitmap)
  {
    AppMethodBeat.i(112332);
    ab.d("MicroMsg.GameImageUtil", "getBitmapWithWH, onFinish");
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      Bitmap localBitmap = e.c(paramBitmap, this.val$width, this.val$height);
      ab.d("MicroMsg.GameImageUtil", "getBitmapWithWH, resizeBitmap end");
      paramBitmap = localBitmap;
      if (this.nnN != 0)
        paramBitmap = d.a(localBitmap, true, this.nnN);
      e.b(this.nnF).k(this.val$url, paramBitmap);
      if (this.nnM != null)
        this.nnM.a(paramView, paramBitmap);
    }
    AppMethodBeat.o(112332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.f.e.4
 * JD-Core Version:    0.6.2
 */