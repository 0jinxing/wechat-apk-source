package com.tencent.mm.plugin.appbrand.ui;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.preload.e;
import com.tencent.mm.sdk.platformtools.bo;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, Bitmap paramBitmap, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132933);
    if (this.val$bitmap != null)
    {
      c.b(this.iGu.iGs).setImageBitmap(this.val$bitmap);
      if (c.c(this.iGu.iGs))
        c.d(this.iGu.iGs);
      e.aBD().cY(1002, (int)bo.az(this.iGu.iGr));
      e.aBD().cY(1001, (int)this.iGt);
    }
    AppMethodBeat.o(132933);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.1.1
 * JD-Core Version:    0.6.2
 */