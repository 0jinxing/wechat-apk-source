package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.ui.FacebookAuthUI;

final class HomeUI$36
  implements DialogInterface.OnClickListener
{
  HomeUI$36(HomeUI paramHomeUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29383);
    HomeUI.i(this.yjm).startActivity(new Intent(HomeUI.i(this.yjm), FacebookAuthUI.class));
    AppMethodBeat.o(29383);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.HomeUI.36
 * JD-Core Version:    0.6.2
 */