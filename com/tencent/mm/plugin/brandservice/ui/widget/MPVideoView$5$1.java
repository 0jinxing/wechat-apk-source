package com.tencent.mm.plugin.brandservice.ui.widget;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MPVideoView$5$1
  implements Runnable
{
  MPVideoView$5$1(MPVideoView.5 param5, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14490);
    if ((this.val$bitmap != null) && (!this.val$bitmap.isRecycled()))
      MPVideoView.a(this.jZA.jZz).setImageBitmap(this.val$bitmap);
    AppMethodBeat.o(14490);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.5.1
 * JD-Core Version:    0.6.2
 */