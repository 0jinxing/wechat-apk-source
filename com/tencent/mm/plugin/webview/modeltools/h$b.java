package com.tencent.mm.plugin.webview.modeltools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;
import java.util.Locale;

final class h$b
  implements Runnable
{
  private Bitmap mBitmap;

  public h$b(h paramh, Bitmap paramBitmap)
  {
    this.mBitmap = paramBitmap;
  }

  public final void run()
  {
    AppMethodBeat.i(7010);
    this.upu.upr = String.format(Locale.US, "%s%s_%08x.jpg", new Object[] { e.eSn, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.mBitmap.hashCode()) });
    try
    {
      d.a(this.mBitmap, 100, Bitmap.CompressFormat.JPEG, this.upu.upr, true);
      ab.i("MicroMsg.ViewCaptureHelper", "bitmap recycle %s", new Object[] { this.mBitmap.toString() });
      this.mBitmap.recycle();
      this.upu.iGP.sendEmptyMessage(2);
      AppMethodBeat.o(7010);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.e("MicroMsg.ViewCaptureHelper", "saveBitmapToImage failed, " + localIOException.getMessage());
        this.upu.upr = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.h.b
 * JD-Core Version:    0.6.2
 */