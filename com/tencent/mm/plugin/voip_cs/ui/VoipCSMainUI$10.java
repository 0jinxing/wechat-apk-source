package com.tencent.mm.plugin.voip_cs.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.plugin.voip_cs.b.c;
import com.tencent.mm.plugin.voip_cs.b.c.d;
import com.tencent.mm.plugin.voip_cs.b.e;
import com.tencent.mm.protocal.protobuf.cmm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class VoipCSMainUI$10 extends n.a
{
  VoipCSMainUI$10(VoipCSMainUI paramVoipCSMainUI)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(135398);
    ab.d("MicroMsg.voipcs.VoipCSMainUI", "network status change from ".concat(String.valueOf(paramInt)));
    Object localObject1;
    com.tencent.mm.plugin.voip_cs.b.a locala;
    if ((c.cMf().tdM == 2) && ((paramInt == 4) || (paramInt == 6)))
    {
      localObject1 = c.cMf();
      locala = c.cMe().tew;
      if (((e)localObject1).sPz == 0)
        ((e)localObject1).sPz = locala.sTX;
      paramInt = com.tencent.mm.plugin.voip.a.a.getNetType(ah.getContext());
      if (paramInt != ((e)localObject1).sPz)
        ab.i("MicroMsg.voipcs.VoipCSService", "steve: onVoipLocalNetTypeChange: local network type change from " + ((e)localObject1).sPz + " to " + paramInt);
    }
    try
    {
      byte[] arrayOfByte = new byte[4];
      arrayOfByte[0] = ((byte)(byte)paramInt);
      int i = locala.setAppCmd(301, arrayOfByte, 4);
      if (i < 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type");
        ab.i("MicroMsg.voipcs.VoipCSService", paramInt + "fail:" + i + ", [roomid=" + locala.nwC + ", roomkey=" + locala.nwv + "]");
      }
      Object localObject2 = new com/tencent/mm/protocal/protobuf/cmm;
      ((cmm)localObject2).<init>();
      ((cmm)localObject2).xko = 3;
      b localb = new com/tencent/mm/bt/b;
      localb.<init>(arrayOfByte, 0, 1);
      ((cmm)localObject2).xkp = localb;
      locala.SendRUDP(((cmm)localObject2).toByteArray(), ((cmm)localObject2).toByteArray().length);
      ((e)localObject1).sPz = paramInt;
      localObject1 = c.cMf();
      ab.i("MicroMsg.voipcs.VoipCSService", "now doRedirect+,csroomId:" + c.cMe().tew.sTZ + "roomkey:" + c.cMe().tew.nwv);
      g.Rg().a(285, (f)localObject1);
      localObject1 = c.cMe().tew;
      localObject1 = new d(((v2protocal)localObject1).sTZ, ((v2protocal)localObject1).nwv);
      g.Rg().a((m)localObject1, 0);
      AppMethodBeat.o(135398);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.voipcs.VoipCSService", "onVoipLocalNetTypeChange Error");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip_cs.ui.VoipCSMainUI.10
 * JD-Core Version:    0.6.2
 */