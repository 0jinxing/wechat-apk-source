package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.a.h;
import com.tencent.mm.protocal.protobuf.cmm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class r$1 extends n.a
{
  r$1(r paramr)
  {
  }

  public final void gl(int paramInt)
  {
    AppMethodBeat.i(4601);
    ab.d("MicroMsg.Voip.VoipService", "network status change from ".concat(String.valueOf(paramInt)));
    Object localObject1;
    if ((r.a(this.sTg)) && (paramInt == 4))
    {
      localObject1 = this.sTg.sSP.sNl;
      if (((k)localObject1).sPz == 0)
        ((k)localObject1).sPz = ((k)localObject1).sPp.sTX;
      paramInt = a.getNetType(ah.getContext());
      if (paramInt != ((k)localObject1).sPz)
        a.Logi("MicroMsg.Voip.VoipContext", "steve: onVoipLocalNetTypeChange: local network type change from " + ((k)localObject1).sPz + " to " + paramInt);
    }
    try
    {
      byte[] arrayOfByte = new byte[4];
      arrayOfByte[0] = ((byte)(byte)paramInt);
      int i = ((k)localObject1).sPp.setAppCmd(301, arrayOfByte, 4);
      if (i < 0)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("steve:[ENGINE]IMVQQEngine::SetAppCmd[EMethodSetLocalNetType] update local network type");
        a.Logi("MicroMsg.Voip.VoipContext", paramInt + "fail:" + i + ", [roomid=" + ((k)localObject1).sPp.nwC + ", roomkey=" + ((k)localObject1).sPp.nwv + "]");
      }
      Object localObject2 = new com/tencent/mm/protocal/protobuf/cmm;
      ((cmm)localObject2).<init>();
      ((cmm)localObject2).xko = 3;
      b localb = new com/tencent/mm/bt/b;
      localb.<init>(arrayOfByte, 0, 1);
      ((cmm)localObject2).xkp = localb;
      ((k)localObject1).sPp.SendRUDP(((cmm)localObject2).toByteArray(), ((cmm)localObject2).toByteArray().length);
      ((k)localObject1).sPz = paramInt;
      localObject1 = this.sTg.sSP;
      new h(((s)localObject1).sNl.sPp.nwu, ((s)localObject1).sNl.sPp.nwv, ((s)localObject1).sNl.sPp.nwC, 0, 0, null).cKw();
      AppMethodBeat.o(4601);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        a.Logi("MicroMsg.Voip.VoipContext", "onVoipLocalNetTypeChange Error");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.r.1
 * JD-Core Version:    0.6.2
 */