package com.tencent.mm.pluginsdk.ui.applet;

import android.graphics.Bitmap;
import android.widget.PopupWindow.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$8
  implements PopupWindow.OnDismissListener
{
  g$8(Bitmap paramBitmap)
  {
  }

  public final void onDismiss()
  {
    AppMethodBeat.i(27646);
    if ((this.val$bmp == null) || (this.val$bmp.isRecycled()))
      AppMethodBeat.o(27646);
    while (true)
    {
      return;
      AppMethodBeat.o(27646);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.8
 * JD-Core Version:    0.6.2
 */