package com.tencent.mm.plugin.aa.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.g;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;

public final class f extends m
  implements com.tencent.mm.network.k
{
  public String chatroomName;
  private com.tencent.mm.ai.f ehi;
  private b gme;
  private com.tencent.mm.protocal.protobuf.f gmh;
  public g gmi;

  public f(long paramLong1, String paramString1, int paramInt1, int paramInt2, long paramLong2, String paramString2)
  {
    AppMethodBeat.i(40648);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new com.tencent.mm.protocal.protobuf.f();
    ((b.a)localObject).fsK = new g();
    ((b.a)localObject).fsI = 1624;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.gme = ((b.a)localObject).acD();
    this.gmh = ((com.tencent.mm.protocal.protobuf.f)this.gme.fsG.fsP);
    this.chatroomName = paramString2;
    try
    {
      this.gmh.vzO = paramInt1;
      this.gmh.vzP = paramLong1;
      this.gmh.title = URLEncoder.encode(paramString1, "UTF-8");
      localObject = this.gmh;
      paramString1 = new java/util/LinkedList;
      paramString1.<init>();
      ((com.tencent.mm.protocal.protobuf.f)localObject).vzQ = paramString1;
      this.gmh.scene = paramInt2;
      this.gmh.vzM = paramString2;
      this.gmh.vzR = com.tencent.mm.plugin.wallet_core.model.k.cPy();
      ab.d("MicroMsg.NetSceneAALaunchByMoney", "location %s", new Object[] { this.gmh.vzR });
      this.gmh.vzS = paramLong2;
      ab.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp", new Object[] { Integer.valueOf(this.gmh.vzO), Long.valueOf(this.gmh.vzP), this.gmh.title, this.gmh.vzQ, Integer.valueOf(this.gmh.scene), this.gmh.vzM, Long.valueOf(this.gmh.vzS) });
      AppMethodBeat.o(40648);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        ab.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", new Object[] { paramString1.getMessage() });
    }
  }

  public f(long paramLong1, String paramString1, List<String> paramList, int paramInt, long paramLong2, String paramString2)
  {
    AppMethodBeat.i(40647);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new com.tencent.mm.protocal.protobuf.f();
    ((b.a)localObject).fsK = new g();
    ((b.a)localObject).fsI = 1624;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/newaalaunchbymoney";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.chatroomName = paramString2;
    this.gme = ((b.a)localObject).acD();
    this.gmh = ((com.tencent.mm.protocal.protobuf.f)this.gme.fsG.fsP);
    this.gme.ftb = true;
    if (paramList != null);
    try
    {
      if (paramList.size() > 0)
      {
        this.gmh.vzO = paramList.size();
        this.gmh.vzP = paramLong1;
        this.gmh.title = URLEncoder.encode(paramString1, "UTF-8");
        paramString1 = this.gmh;
        localObject = new java/util/LinkedList;
        ((LinkedList)localObject).<init>();
        paramString1.vzQ = ((LinkedList)localObject);
        this.gmh.vzQ.addAll(paramList);
        this.gmh.scene = paramInt;
        this.gmh.vzM = paramString2;
        this.gmh.vzR = com.tencent.mm.plugin.wallet_core.model.k.cPy();
        this.gmh.vzS = paramLong2;
        ab.d("MicroMsg.NetSceneAALaunchByMoney", "location %s", new Object[] { this.gmh.vzR });
      }
      ab.i("MicroMsg.NetSceneAALaunchByMoney", "NetSceneAALaunchByMoney, total_num: %s, per_amount: %s, title: %s, payer_list: %s, scene: %s, groupid: %s, timestamp: %s", new Object[] { Integer.valueOf(this.gmh.vzO), Long.valueOf(this.gmh.vzP), this.gmh.title, this.gmh.vzQ, Integer.valueOf(this.gmh.scene), this.gmh.vzM, Long.valueOf(this.gmh.vzS) });
      AppMethodBeat.o(40647);
      return;
    }
    catch (Exception paramString1)
    {
      while (true)
        ab.e("MicroMsg.NetSceneAALaunchByMoney", "build NetSceneAALaunchByMoney request error: %s", new Object[] { paramString1.getMessage() });
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(40649);
    ab.i("MicroMsg.NetSceneAALaunchByMoney", "doScene");
    this.ehi = paramf;
    int i = a(parame, this.gme, this);
    AppMethodBeat.o(40649);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(40650);
    ab.i("MicroMsg.NetSceneAALaunchByMoney", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.gmi = ((g)((b)paramq).fsH.fsP);
    paramInt1 = this.gmi.kCl;
    paramq = this.gmi.kCm;
    if (this.gmi.vzN == null);
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.NetSceneAALaunchByMoney", "retcode: %s, retmsg: %s, msgxml==null: %s, billNo: %s", new Object[] { Integer.valueOf(paramInt1), paramq, Boolean.valueOf(bool), this.gmi.vzL });
      ab.d("MicroMsg.NetSceneAALaunchByMoney", "msgxml: %s", new Object[] { this.gmi.vzN });
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(40650);
      return;
    }
  }

  public final int getType()
  {
    return 1624;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.a.f
 * JD-Core Version:    0.6.2
 */