package com.tencent.mm.sandbox.updater;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.f;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.api;
import com.tencent.mm.protocal.protobuf.hl;
import com.tencent.mm.sandbox.monitor.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends c
{
  private String[] bQQ;
  private byte[] cPB;
  private byte[] gcA;
  private byte[] gcE;
  private int uin;
  private int woP;
  private int xvP;
  private final int xvQ;
  private com.tencent.mm.sandbox.b.a xvR;
  private b.a xvS;
  private com.tencent.mm.sandbox.b.a xvT;

  public b(int paramInt1, String paramString, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String[] paramArrayOfString, boolean paramBoolean)
  {
    super(paramInt1, paramString, paramInt2, paramBoolean);
    AppMethodBeat.i(28851);
    this.xvP = 0;
    this.xvQ = 5;
    this.woP = 0;
    this.xvS = null;
    this.xvT = new b.1(this);
    this.bQQ = paramArrayOfString;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      this.bQQ = new String[] { "short.weixin.qq.com" };
    this.uin = paramInt3;
    this.gcA = paramArrayOfByte1;
    this.cPB = paramArrayOfByte2;
    AppMethodBeat.o(28851);
  }

  public final void a(com.tencent.mm.sandbox.b.a parama)
  {
    AppMethodBeat.i(28852);
    this.xvR = parama;
    int i = this.xvP + 1;
    this.xvP = i;
    if (i > 1000)
    {
      ab.d("MicroMsg.NetSceneGetUpdatePack", "doSceneCnt > DOSCENE_LIMIT, return");
      this.xvR.b(-1, -1, null);
      AppMethodBeat.o(28852);
    }
    while (true)
    {
      return;
      if (!f.eW(this.xvx))
      {
        ab.e("MicroMsg.NetSceneGetUpdatePack", "SDCard full, packSize=[%s]", new Object[] { Integer.valueOf(this.xvx) });
        parama.b(-1, -1, null);
        AppMethodBeat.o(28852);
      }
      else
      {
        parama = new api();
        Object localObject = new hl();
        ((hl)localObject).vKd = d.vxo;
        ((hl)localObject).Scene = 0;
        ((hl)localObject).luF = this.uin;
        ((hl)localObject).vKc = com.tencent.mm.bt.b.bI(q.LM().getBytes());
        if (((hl)localObject).vKc.wR.length >= 16)
          ((hl)localObject).vKc = ((hl)localObject).vKc.Lv(16);
        ((hl)localObject).vKe = com.tencent.mm.bt.b.bI(d.eSg.getBytes());
        if (((hl)localObject).vKe.wR.length >= 132)
          ((hl)localObject).vKe = ((hl)localObject).vKe.Lv(132);
        ((hl)localObject).vKb = com.tencent.mm.bt.b.bI(this.gcA);
        if (((hl)localObject).vKb.wR.length >= 36)
          ((hl)localObject).vKb = ((hl)localObject).vKb.Lv(36);
        parama.setBaseRequest((hl)localObject);
        parama.wth = this.xvw;
        parama.ptx = this.xvy;
        parama.ptw = this.xvx;
        localObject = new b.a(this, this.bQQ[(this.woP / 5)], this.xvT);
        this.xvS = ((b.a)localObject);
        ((b.a)localObject).execute(new api[] { parama });
        AppMethodBeat.o(28852);
      }
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(28853);
    ab.i("MicroMsg.NetSceneGetUpdatePack", "do cancel, updateType = " + this.xvw);
    if ((this.xvS != null) && (!this.xvS.isCancelled()))
      this.xvS.cancel(true);
    AppMethodBeat.o(28853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.b
 * JD-Core Version:    0.6.2
 */