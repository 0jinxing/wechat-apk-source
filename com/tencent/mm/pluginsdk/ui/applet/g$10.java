package com.tencent.mm.pluginsdk.ui.applet;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$10
  implements DialogInterface.OnDismissListener
{
  g$10(Bitmap paramBitmap)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(27648);
    if ((this.val$bmp == null) || (this.val$bmp.isRecycled()))
      AppMethodBeat.o(27648);
    while (true)
    {
      return;
      ab.i("MicroMsg.MMConfirmDialog", "bitmap recycle %s", new Object[] { this.val$bmp.toString() });
      this.val$bmp.recycle();
      AppMethodBeat.o(27648);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.g.10
 * JD-Core Version:    0.6.2
 */