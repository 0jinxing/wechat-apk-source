package com.tencent.mm.plugin.appbrand.share.widget;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaShareMessagePage$1$1
  implements Runnable
{
  WxaShareMessagePage$1$1(WxaShareMessagePage.1 param1, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132755);
    this.iEc.iEb.iDX.setImageBitmap(this.val$bitmap);
    this.iEc.iEb.iDU.setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(132755);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage.1.1
 * JD-Core Version:    0.6.2
 */