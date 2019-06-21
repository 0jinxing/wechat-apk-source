package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.protocal.protobuf.h;
import com.tencent.mm.protocal.protobuf.i;
import com.tencent.mm.protocal.protobuf.j;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class g extends m
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  private f ehi;
  private b gme;
  private h gmj;
  public i gmk;

  public g(String paramString1, long paramLong1, List<j> paramList, int paramInt, String paramString2, long paramLong2)
  {
    AppMethodBeat.i(40651);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new h();
    ((b.a)localObject).fsK = new i();
    ((b.a)localObject).fsI = 1655;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/newaalaunchbyperson";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    this.gmj = ((h)this.gme.fsG.fsP);
    this.gme.ftb = true;
    try
    {
      this.gmj.title = com.tencent.mm.compatible.util.q.encode(paramString1, "UTF-8");
      this.gmj.vzU = paramLong1;
      paramString1 = this.gmj;
      localObject = new java/util/LinkedList;
      ((LinkedList)localObject).<init>();
      paramString1.vzQ = ((LinkedList)localObject);
      this.gmj.vzQ.addAll(paramList);
      this.gmj.scene = paramInt;
      this.gmj.vzM = paramString2;
      this.gmj.vzR = com.tencent.mm.plugin.wallet_core.model.k.cPy();
      this.gmj.vzS = paramLong2;
      ab.d("MicroMsg.NetSceneAALaunchByPerson", "location %s", new Object[] { this.gmj.vzR });
      this.chatroomName = paramString2;
      ab.i("MicroMsg.NetSceneAALaunchByPerson", "NetSceneAALaunchByPerson, title: %s, total_pay_amount: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s", new Object[] { this.gmj.title, Long.valueOf(this.gmj.vzU), this.gmj.vzQ, Integer.valueOf(this.gmj.scene), this.gmj.vzM, Long.valueOf(this.gmj.vzS) });
      AppMethodBeat.o(40651);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        ab.e("MicroMsg.NetSceneAALaunchByPerson", "build NetSceneAALaunchByPerson request error: %s", new Object[] { paramString1.getMessage() });
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(40652);
    ab.d("MicroMsg.NetSceneAALaunchByPerson", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40652);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40653);
    ab.i("MicroMsg.NetSceneAALaunchByPerson", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gmk = ((i)((b)paramq).fsH.fsP);
    paramInt1 = this.gmk.kCl;
    paramq = this.gmk.kCm;
    paramArrayOfByte = this.gmk.vzL;
    if (this.gmk.vzN == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.NetSceneAALaunchByPerson", "retcode: %s, retmsg: %s, bill_no: %s, msgxml==null: %s", new Object[] { Integer.valueOf(paramInt1), paramq, paramArrayOfByte, Boolean.valueOf(bool) });
      ab.d("MicroMsg.NetSceneAALaunchByPerson", "msgxml: %s", new Object[] { this.gmk.vzN });
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(40653);
      return;
    }
  }

  public final int getType()
  {
    return 1655;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.g
 * JD-Core Version:    0.6.2
 */