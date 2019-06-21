package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.pluginsdk.model.app.l.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.n;
import com.tencent.mm.ui.base.MultiTouchImageView;

final class c$1$1
  implements l.a
{
  c$1$1(c.1 param1)
  {
  }

  public final void gK(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(31960);
    if (paramInt1 == paramInt2)
    {
      ab.d("MicroMsg.ImageGalleryAdapter", "appmsgImg download finish! msgid: %s", new Object[] { Long.valueOf(this.yTW.fku.field_msgId) });
      k.am(this.yTW.yTU.yXx, 8);
    }
    try
    {
      Bitmap localBitmap1 = x.vw(this.yTW.hWl);
      if (localBitmap1 != null)
      {
        this.yTW.yTU.yXB.setEnableHorLongBmpMode(false);
        n.w(this.yTW.yTU.yXB, localBitmap1.getWidth(), localBitmap1.getHeight());
        this.yTW.yTU.yXB.bW(localBitmap1.getWidth(), localBitmap1.getHeight());
        this.yTW.yTU.yXB.setImageBitmap(localBitmap1);
        this.yTW.yTU.yXB.invalidate();
      }
      AppMethodBeat.o(31960);
      return;
    }
    catch (OutOfMemoryError localOutOfMemoryError)
    {
      while (true)
      {
        ab.w("MicroMsg.ImageGalleryAdapter", "[tomys] Oops, app img [%s] is too large, use resample version.", new Object[] { this.yTW.hWl });
        Runtime.getRuntime().gc();
        Runtime.getRuntime().runFinalization();
        Bitmap localBitmap2 = x.vv(this.yTW.hWl);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.c.1.1
 * JD-Core Version:    0.6.2
 */