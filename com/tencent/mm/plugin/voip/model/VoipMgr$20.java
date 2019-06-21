package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;

final class VoipMgr$20
  implements Runnable
{
  VoipMgr$20(VoipMgr paramVoipMgr)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(4482);
    VoipMgr localVoipMgr = this.sSn;
    ab.i("MicroMsg.Voip.VoipMgr", "it is uninit voip report");
    localVoipMgr.sSe.removeCallbacksAndMessages(null);
    localVoipMgr.sSd = null;
    if (!localVoipMgr.sSa)
    {
      if (localVoipMgr.sSl == 0)
        localVoipMgr.Gp(localVoipMgr.sRZ);
      if (localVoipMgr.sSl != 0)
      {
        localVoipMgr.sSa = true;
        if (!localVoipMgr.sRm)
          break label175;
      }
    }
    label175: for (int i = 0; ; i = 1)
    {
      a.a(i, System.currentTimeMillis(), localVoipMgr.sRZ, localVoipMgr.sRZ, 0, 0, VoipMgr.idk / localVoipMgr.sSl);
      VoipMgr.idk = 0;
      VoipMgr.sSf[0] = 0;
      VoipMgr.sSf[1] = 0;
      localVoipMgr.sSl = 0;
      if (localVoipMgr.sSg != null)
        localVoipMgr.sSg.listen(localVoipMgr.sSc, 0);
      if (localVoipMgr.sSb != null)
      {
        ah.getContext().unregisterReceiver(localVoipMgr.sSb);
        localVoipMgr.sSb = null;
      }
      VoipMgr.r(this.sSn);
      AppMethodBeat.o(4482);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.20
 * JD-Core Version:    0.6.2
 */