package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VoipMgr$6
  implements DialogInterface.OnClickListener
{
  VoipMgr$6(VoipMgr paramVoipMgr, CheckBox paramCheckBox)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4465);
    if (this.sSq != null)
      VoipMgr.g(this.sSn).getSharedPreferences("voip_plugin_prefs", 0).edit().putBoolean("voip_shortcut_never_show_anymore", this.sSq.isChecked()).commit();
    if (4096 != VoipMgr.D(this.sSn))
    {
      VoipMgr.f(this.sSn, VoipMgr.D(this.sSn));
      VoipMgr.E(this.sSn);
    }
    if (VoipMgr.F(this.sSn) != null)
      VoipMgr.F(this.sSn).post(new VoipMgr.6.1(this));
    AppMethodBeat.o(4465);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.6
 * JD-Core Version:    0.6.2
 */