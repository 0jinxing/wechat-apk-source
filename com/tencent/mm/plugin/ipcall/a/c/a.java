package com.tencent.mm.plugin.ipcall.a.c;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.ipcall.a.g;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.protocal.protobuf.cpu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public final class a
{
  public boolean nxA;
  public boolean nxB;
  public a.a nxC;
  public v2protocal nxx;
  private ak nxy;
  private boolean nxz;

  public a()
  {
    AppMethodBeat.i(21823);
    this.nxz = false;
    this.nxA = false;
    this.nxB = false;
    this.nxC = null;
    this.nxy = new a.1(this, Looper.getMainLooper());
    this.nxx = new v2protocal(this.nxy);
    AppMethodBeat.o(21823);
  }

  public final void bHK()
  {
    AppMethodBeat.i(21824);
    ab.d("MicroMsg.IPCallEngineManager", "setChannelActiveAfterAccept");
    if (!this.nxA)
      ab.d("MicroMsg.IPCallEngineManager", "channel not connect now");
    this.nxx.setActive();
    AppMethodBeat.o(21824);
  }

  public final void bHL()
  {
    AppMethodBeat.i(21825);
    if (this.nxz)
    {
      ab.d("MicroMsg.IPCallEngineManager", "requestChannelConnect, already request channel connect");
      AppMethodBeat.o(21825);
      return;
    }
    ab.i("MicroMsg.IPCallEngineManager", "requestChannelConnect");
    com.tencent.mm.plugin.ipcall.a.a.c localc = i.bHq().nvN;
    if (localc != null)
    {
      if (localc.jud != null)
      {
        cok localcok1 = com.tencent.mm.plugin.ipcall.b.c.af(localc.jud);
        cok localcok2 = com.tencent.mm.plugin.ipcall.b.c.af(localc.nwS);
        cpu localcpu = new cpu();
        localcpu.xnK = 0;
        localcpu.xnL = 0;
        localcpu.xnM = 0;
        localcpu.userName = "";
        localcpu.gDC = "";
        this.nxx.a(localcok1, localcok1, localcok2, localcpu, null);
      }
      ab.d("MicroMsg.IPCallEngineManager", "finish set svr addr");
      this.nxx.sUd = localc.nwN;
      this.nxx.sUY = localc.nwQ;
      if (localc.nwR != null)
        this.nxx.sUZ = localc.nwR.toByteArray();
      if (localc.nwO != null)
        this.nxx.sUe = localc.nwO.toByteArray();
      this.nxx.nwu = localc.nwu;
      this.nxx.nwv = localc.nwv;
      this.nxx.nwC = localc.nwC;
      this.nxx.sUg = localc.nwL;
      this.nxx.sUf = localc.nwM;
      this.nxx.sUh = localc.nwT;
      if (this.nxx.sUe != null)
        break label472;
    }
    label472: for (int i = 0; ; i = this.nxx.sUe.length)
    {
      int j = this.nxx.setConfigInfo(this.nxx.sTY, this.nxx.nwu, this.nxx.nwC, this.nxx.nwv, this.nxx.field_peerId, 1, this.nxx.sUf, this.nxx.sUg, this.nxx.sUd, i, this.nxx.sUe, this.nxx.sUh, 0, 0, this.nxx.sUY, this.nxx.sUZ, 255, 0, 0, null, 0);
      ab.d("MicroMsg.IPCallEngineManager", "setConfigInfo, ret: %d", new Object[] { Integer.valueOf(j) });
      i = j;
      if (j == 0)
        i = this.nxx.connectToPeer();
      if (i < 0)
      {
        ab.e("MicroMsg.IPCallEngineManager", "setConfigInfo failed, ret: %d", new Object[] { Integer.valueOf(i) });
        if (this.nxC != null)
          this.nxC.xe(21);
      }
      this.nxz = true;
      AppMethodBeat.o(21825);
      break;
    }
  }

  public final void bHM()
  {
    this.nxA = false;
    this.nxz = false;
    this.nxB = false;
  }

  public final void io(boolean paramBoolean)
  {
    AppMethodBeat.i(21827);
    if (paramBoolean);
    for (int i = this.nxx.setAppCmd(401); ; i = this.nxx.setAppCmd(402))
    {
      if (i < 0)
        ab.e("MicroMsg.IPCallEngineManager", "setSpeakerPhoneOn, failed, ret: %d", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(21827);
      return;
    }
  }

  public final void xk(int paramInt)
  {
    AppMethodBeat.i(21826);
    if (!this.nxA)
      AppMethodBeat.o(21826);
    while (true)
    {
      return;
      ab.d("MicroMsg.IPCallEngineManager", "setDtmfPayloadType: %d", new Object[] { Integer.valueOf(paramInt) });
      paramInt = this.nxx.SetDTMFPayload(paramInt);
      if (paramInt < 0)
        ab.i("MicroMsg.IPCallEngineManager", "setDtmfPayloadType failed, ret: %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(21826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.c.a
 * JD-Core Version:    0.6.2
 */