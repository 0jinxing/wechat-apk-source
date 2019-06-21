package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.sdk.platformtools.ab;

final class VoipMgr$14
  implements DialogInterface.OnClickListener
{
  VoipMgr$14(VoipMgr paramVoipMgr, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4476);
    ab.i("MicroMsg.Voip.VoipMgr", "show Permission settings");
    b.bE(this.sSy);
    if (!VoipMgr.b(this.sSn))
      if (VoipMgr.e(this.sSn))
      {
        this.sSn.cJm();
        AppMethodBeat.o(4476);
      }
    while (true)
    {
      return;
      this.sSn.cJp();
      AppMethodBeat.o(4476);
      continue;
      if (VoipMgr.e(this.sSn))
      {
        this.sSn.cJr();
        AppMethodBeat.o(4476);
      }
      else
      {
        this.sSn.cJs();
        AppMethodBeat.o(4476);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.14
 * JD-Core Version:    0.6.2
 */