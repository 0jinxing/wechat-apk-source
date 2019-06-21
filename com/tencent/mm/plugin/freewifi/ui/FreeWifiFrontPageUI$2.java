package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiFrontPageUI$2
  implements DialogInterface.OnClickListener
{
  FreeWifiFrontPageUI$2(FreeWifiFrontPageUI paramFreeWifiFrontPageUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(20960);
    this.mze.finish();
    AppMethodBeat.o(20960);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI.2
 * JD-Core Version:    0.6.2
 */