package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VoipMgr$5
  implements DialogInterface.OnClickListener
{
  VoipMgr$5(VoipMgr paramVoipMgr)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4463);
    paramDialogInterface = VoipMgr.g(this.sSn).getSharedPreferences("voip_plugin_prefs", 0);
    VoipMgr.a(this.sSn, paramDialogInterface);
    if (4096 != VoipMgr.D(this.sSn))
    {
      VoipMgr.f(this.sSn, VoipMgr.D(this.sSn));
      VoipMgr.E(this.sSn);
    }
    if (VoipMgr.F(this.sSn) != null)
      VoipMgr.F(this.sSn).post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(4462);
          VoipMgr.r(VoipMgr.5.this.sSn);
          AppMethodBeat.o(4462);
        }
      });
    AppMethodBeat.o(4463);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.5
 * JD-Core Version:    0.6.2
 */