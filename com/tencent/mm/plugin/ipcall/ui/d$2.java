package com.tencent.mm.plugin.ipcall.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.ah.o;
import com.tencent.mm.sdk.platformtools.az.a;

final class d$2
  implements az.a
{
  d$2(d paramd, String paramString1, ImageView paramImageView, String paramString2)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(22017);
    Bitmap localBitmap1 = b.a(this.eiH, false, -1);
    Bitmap localBitmap2 = localBitmap1;
    if (localBitmap1 == null)
    {
      o.acd();
      localBitmap2 = com.tencent.mm.ah.d.qf(this.eiH);
    }
    d.a(this.nAR, this.mAX, this.val$key, localBitmap2);
    AppMethodBeat.o(22017);
    return true;
  }

  public final boolean acg()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.d.2
 * JD-Core Version:    0.6.2
 */