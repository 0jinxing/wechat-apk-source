package com.tencent.mm.plugin.mmsight.ui;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class b$1$1$4
  implements Runnable
{
  b$1$1$4(b.1.1 param1, Bitmap paramBitmap)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(55130);
    b.a(this.oBX.oBW.oBV, h.b(b.e(this.oBX.oBW.oBV), b.e(this.oBX.oBW.oBV).getString(2131301448), false, null));
    b.f(this.oBX.oBW.oBV).pause();
    b.a(this.oBX.oBW.oBV, this.val$bitmap);
    AppMethodBeat.o(55130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.b.1.1.4
 * JD-Core Version:    0.6.2
 */