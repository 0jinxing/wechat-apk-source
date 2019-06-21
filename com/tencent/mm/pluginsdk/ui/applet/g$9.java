package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$9
  implements DialogInterface.OnDismissListener
{
  g$9(Bitmap paramBitmap)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27647);
    if ((this.val$bmp == null) || (this.val$bmp.isRecycled()))
      AppMethodBeat.o(27647);
    while (true)
    {
      return;
      AppMethodBeat.o(27647);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.9
 * JD-Core Version:    0.6.2
 */