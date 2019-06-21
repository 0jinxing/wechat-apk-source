package com.tencent.mm.ui.chatting.gallery;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class j$16$1
  implements DialogInterface.OnClickListener
{
  j$16$1(j.16 param16)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32332);
    if (paramDialogInterface != null)
      paramDialogInterface.cancel();
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(32331);
        if ((j.16.1.this.yXc.yWZ.yTG != null) && (j.16.1.this.yXc.yWZ.yTG.yTI != null))
          j.16.1.this.yXc.yWZ.yTG.yTI.onBackPressed();
        AppMethodBeat.o(32331);
      }
    });
    AppMethodBeat.o(32332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.16.1
 * JD-Core Version:    0.6.2
 */