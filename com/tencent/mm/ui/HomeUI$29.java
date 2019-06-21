package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HomeUI$29
  implements DialogInterface.OnClickListener
{
  HomeUI$29(HomeUI paramHomeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29376);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(29376);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.29
 * JD-Core Version:    0.6.2
 */