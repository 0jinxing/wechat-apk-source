package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;

final class HomeUI$19
  implements DialogInterface.OnClickListener
{
  HomeUI$19(HomeUI paramHomeUI, int paramInt)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29365);
    try
    {
      at.startSettingItent(HomeUI.b(this.yjm), this.bVv);
      AppMethodBeat.o(29365);
      return;
    }
    catch (Exception paramDialogInterface)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.LauncherUI.HomeUI", paramDialogInterface, "", new Object[0]);
        AppMethodBeat.o(29365);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.19
 * JD-Core Version:    0.6.2
 */