package com.tencent.mm.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMAppMgr$3
  implements DialogInterface.OnClickListener
{
  MMAppMgr$3(CheckBox paramCheckBox, SharedPreferences paramSharedPreferences, Activity paramActivity, DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29550);
    if (this.ymR.isChecked())
    {
      SharedPreferences.Editor localEditor = this.tVg.edit();
      localEditor.putBoolean("gprs_alert", false);
      localEditor.commit();
    }
    com.tencent.mm.sdk.platformtools.g.xye = false;
    paramDialogInterface.dismiss();
    MMAppMgr.hs(this.ghG);
    if (this.ymS != null)
      this.ymS.onClick(paramDialogInterface, paramInt);
    AppMethodBeat.o(29550);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.3
 * JD-Core Version:    0.6.2
 */