package com.tencent.mm.plugin.voip.model;

import android.content.Context;
import android.media.AudioManager;
import android.telephony.PhoneStateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.voip.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

final class VoipMgr$4 extends PhoneStateListener
{
  VoipMgr$4(VoipMgr paramVoipMgr)
  {
  }

  public final void onCallStateChanged(int paramInt, String paramString)
  {
    int i = 1;
    AppMethodBeat.i(4461);
    super.onCallStateChanged(paramInt, paramString);
    ab.i("MicroMsg.Voip.VoipMgr", "onCallStateChanged :%d, isStartVoip: %b,oldState:%d", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(VoipMgr.w(this.sSn)), Integer.valueOf(VoipMgr.x(this.sSn)) });
    if (!VoipMgr.w(this.sSn))
      AppMethodBeat.o(4461);
    while (true)
    {
      return;
      if (((VoipMgr.x(this.sSn) == 0) && (paramInt == 1)) || ((VoipMgr.x(this.sSn) == 0) && (paramInt == 2)))
        VoipMgr.y(this.sSn);
      if (paramInt == 1)
      {
        VoipMgr.d(this.sSn, true);
        if (VoipMgr.x(this.sSn) == 0)
          VoipMgr.c(this.sSn, System.currentTimeMillis());
        VoipMgr.e(this.sSn, 1);
        com.tencent.mm.plugin.voip.b.cIj().Gj(1);
        VoipMgr.e(this.sSn, true);
        AppMethodBeat.o(4461);
      }
      else
      {
        if (paramInt == 2)
        {
          VoipMgr.d(this.sSn, false);
          if (VoipMgr.x(this.sSn) == 1)
            VoipMgr.d(this.sSn, System.currentTimeMillis());
          VoipMgr.e(this.sSn, 2);
          ab.i("MicroMsg.Voip.VoipMgr", "phone call coming now!");
          if ((VoipMgr.b(this.sSn)) && (!com.tencent.mm.plugin.voip.a.b.GN(VoipMgr.a(this.sSn).mState)))
          {
            paramString = com.tencent.mm.plugin.voip.b.cIj().sSP;
            ab.i("MicroMsg.Voip.VoipServiceEx", "cancelCallByPhoneInter, roomId:" + paramString.sNl.sPp.nwu);
            if (paramString.sNl.sPp.nwu != 0)
            {
              paramString.sNl.sPp.sVH.sQe = 102;
              paramString.sNl.sPp.sVH.sQq = 6;
              if (com.tencent.mm.plugin.voip.b.cIj().sSQ != null)
              {
                paramString.sNl.sPp.sVH.sQR = com.tencent.mm.plugin.voip.b.cIj().sSQ.sRT;
                paramString.sNl.sPp.sVH.sQP = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQP / 1000L);
                paramString.sNl.sPp.sVH.sQQ = (com.tencent.mm.plugin.voip.b.cIj().sSQ.sQQ / 1000L);
              }
              com.tencent.mm.plugin.report.service.h.pYm.a(11521, true, true, new Object[] { Integer.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwu), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.sPp.nwv), Long.valueOf(com.tencent.mm.plugin.voip.b.cIj().sSP.sNl.cIK()), Integer.valueOf(3), Long.valueOf(System.currentTimeMillis()), Long.valueOf(System.currentTimeMillis()) });
              paramString.cKk();
            }
          }
          label574: Object localObject;
          label619: String str;
          if (com.tencent.mm.plugin.voip.a.b.GN(VoipMgr.a(this.sSn).mState))
          {
            paramString = ah.getContext().getString(2131304361, new Object[] { VoipMgr.lH(bo.fp(VoipMgr.z(this.sSn))) });
            localObject = com.tencent.mm.plugin.voip.b.cIj().sSP;
            ab.i("MicroMsg.Voip.VoipServiceEx", "hangUpByPhoneInter");
            if (((s)localObject).sNl.sPp.nwu != 0)
              break label893;
            ((s)localObject).sNl.sPr.cIY();
            ((s)localObject).reset();
            str = VoipMgr.A(this.sSn).field_username;
            if (!VoipMgr.e(this.sSn))
              break label933;
            localObject = bi.xZc;
            label646: if (!VoipMgr.b(this.sSn))
              break label941;
          }
          label933: label941: for (paramInt = i; ; paramInt = 0)
          {
            q.a(str, (String)localObject, paramInt, 6, paramString);
            VoipMgr.f(this.sSn, 4107);
            VoipMgr.B(this.sSn);
            paramString = new bi();
            paramString.setType(10000);
            paramString.eJ(System.currentTimeMillis());
            paramString.setStatus(6);
            paramString.setContent(ah.getContext().getString(2131304359) + ", <a href=\"weixin://voip/callagain/?username=" + VoipMgr.d(this.sSn) + "&isvideocall=" + VoipMgr.e(this.sSn) + "\">" + ah.getContext().getString(2131304354) + "</a>");
            if ((VoipMgr.d(this.sSn) != null) && (!VoipMgr.d(this.sSn).equals("")))
            {
              paramString.ju(VoipMgr.d(this.sSn));
              ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Z(paramString);
            }
            com.tencent.mm.plugin.voip.b.cIj().Gj(2);
            VoipMgr.e(this.sSn, false);
            AppMethodBeat.o(4461);
            break;
            paramString = ah.getContext().getString(2131304357);
            break label574;
            label893: ((s)localObject).sNl.sPp.sVH.sQe = 109;
            ((s)localObject).sNl.sPp.sVH.sQw = 4;
            ((s)localObject).cKn();
            break label619;
            localObject = bi.xZb;
            break label646;
          }
        }
        if (paramInt == 0)
        {
          if ((VoipMgr.x(this.sSn) == 1) || (VoipMgr.x(this.sSn) == 2))
            VoipMgr.d(this.sSn, System.currentTimeMillis());
          VoipMgr.e(this.sSn, 0);
          com.tencent.mm.plugin.voip.b.cIj().Gj(2);
          if ((1 == VoipMgr.f(this.sSn)) && (com.tencent.mm.plugin.voip.a.b.GN(VoipMgr.a(this.sSn).mState)) && (VoipMgr.C(this.sSn)))
            al.d(new VoipMgr.4.1(this));
          VoipMgr.d(this.sSn, false);
          if ((com.tencent.mm.compatible.b.g.KK() != null) && (com.tencent.mm.compatible.b.g.KK().eoY.isBluetoothScoOn()))
          {
            ab.i("MicroMsg.Voip.VoipMgr", "is bluetooth can use and start bluetooth");
            com.tencent.mm.compatible.b.g.KK().KM();
          }
          VoipMgr.e(this.sSn, false);
        }
        AppMethodBeat.o(4461);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.VoipMgr.4
 * JD-Core Version:    0.6.2
 */