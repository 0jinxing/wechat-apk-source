package com.tencent.mm.plugin.appbrand.widget.i;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.InputStream;

final class h$1
  implements Runnable
{
  h$1(h paramh, i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87568);
    InputStream localInputStream = aw.d(this.gVf, this.jpB.jpu);
    Bitmap localBitmap = BitmapFactory.decodeStream(localInputStream);
    if (localBitmap == null)
      this.jpB.jpv.a("Failed to load icon via package path", this.jpB);
    while (true)
    {
      if (localInputStream != null)
        bo.b(localInputStream);
      AppMethodBeat.o(87568);
      return;
      this.jpB.I(localBitmap);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.h.1
 * JD-Core Version:    0.6.2
 */