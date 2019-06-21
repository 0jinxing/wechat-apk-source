package com.tencent.mm.plugin.ipcall.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.sdk.platformtools.az.a;

final class d$3
  implements az.a
{
  d$3(d paramd, String paramString1, ImageView paramImageView, String paramString2)
  {
  }

  public final boolean acf()
  {
    AppMethodBeat.i(22018);
    Bitmap localBitmap = a.aH(this.nAR.context, this.nAQ);
    d.a(this.nAR, this.mAX, this.val$key, localBitmap);
    AppMethodBeat.o(22018);
    return true;
  }

  public final boolean acg()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.d.3
 * JD-Core Version:    0.6.2
 */