package com.tencent.mm.sandbox.updater;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;

final class AppUpdaterUI$6
  implements DialogInterface.OnClickListener
{
  AppUpdaterUI$6(AppUpdaterUI paramAppUpdaterUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(28819);
    if ((AppUpdaterUI.b(this.xvL) != null) && (!AppUpdaterUI.b(this.xvL).isShowing()))
      AppUpdaterUI.b(this.xvL).show();
    AppMethodBeat.o(28819);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.AppUpdaterUI.6
 * JD-Core Version:    0.6.2
 */