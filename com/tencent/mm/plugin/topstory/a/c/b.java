package com.tencent.mm.plugin.topstory.a.c;

import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.protocal.protobuf.chn;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.protocal.protobuf.cvd;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.protocal.protobuf.tn;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  public chn cPu;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private long sAZ;

  public b(chn paramchn, int paramInt)
  {
    AppMethodBeat.i(96383);
    ab.i("MicroMsg.TopStory.NetSceneTopStory", "Create NetSceneTopStory Home channelId:%s, %s %s %s", new Object[] { Integer.valueOf(paramchn.cdf), Integer.valueOf(paramInt), paramchn.xgj, paramchn.cvF });
    this.sAZ = System.currentTimeMillis();
    this.cPu = paramchn;
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsI = 1943;
    ((b.a)localObject1).uri = "/cgi-bin/mmsearch-bin/mmwebrecommend";
    ((b.a)localObject1).fsJ = new cvd();
    ((b.a)localObject1).fsK = new cve();
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (cvd)this.ehh.fsG.fsP;
    ((cvd)localObject1).vOq = paramchn.offset;
    ((cvd)localObject1).wDH = aa.HV(1);
    ((cvd)localObject1).wkD = paramchn.ctj;
    ((cvd)localObject1).wDI = aa.abJ();
    ((cvd)localObject1).Scene = paramchn.scene;
    ((cvd)localObject1).vQg = paramchn.hlm;
    ((cvd)localObject1).xqa.addAll(paramchn.tZG);
    ((cvd)localObject1).xfr = paramchn.cdf;
    ((cvd)localObject1).xrf = paramInt;
    Object localObject2;
    if (((cvd)localObject1).xfr == 110)
    {
      localObject2 = ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cEP();
      if (localObject2 != null)
        ((cvd)localObject1).wSi = ((cht)localObject2).cJb;
    }
    while (true)
    {
      ((cvd)localObject1).xrd = paramchn.tZP;
      ((cvd)localObject1).xgp = paramchn.xgp;
      paramchn = new tn();
      paramchn.key = "client_system_version";
      paramchn.waD = Build.VERSION.SDK_INT;
      ((cvd)localObject1).xqa.add(paramchn);
      paramchn = new tn();
      paramchn.key = "netType";
      paramchn.waE = aa.bVP();
      ((cvd)localObject1).xqa.add(paramchn);
      paramchn = new tn();
      paramchn.key = "client_request_time";
      paramchn.waE = String.valueOf(System.currentTimeMillis());
      ((cvd)localObject1).xqa.add(paramchn);
      paramchn = ((cvd)localObject1).xqa.iterator();
      while (paramchn.hasNext())
      {
        localObject2 = (tn)paramchn.next();
        ab.i("MicroMsg.TopStory.NetSceneTopStory", "key: %s unit_value %s text_value %s", new Object[] { ((tn)localObject2).key, Long.valueOf(((tn)localObject2).waD), ((tn)localObject2).waE });
      }
      if (((cvd)localObject1).xfr == 100)
        ((cvd)localObject1).wSi = ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().cFc();
      else
        ((cvd)localObject1).wSi = "";
    }
    ab.i("MicroMsg.TopStory.NetSceneTopStory", "request params offset %d h5Version %d CheckDocListSize: %d", new Object[] { Integer.valueOf(((cvd)localObject1).vOq), Integer.valueOf(((cvd)localObject1).wDH), Integer.valueOf(((cvd)localObject1).xgp.size()) });
    AppMethodBeat.o(96383);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(96384);
    an.reportIdKey649ForLook(this.cPu.scene, 2);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(96384);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(96385);
    ab.i("MicroMsg.TopStory.NetSceneTopStory", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, Long.valueOf(System.currentTimeMillis() - this.sAZ) });
    if (paramInt3 == -1)
      an.reportIdKey649ForLook(this.cPu.scene, 4);
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(96385);
      return;
      if ((paramInt2 != 0) || (paramInt3 != 0))
        an.reportIdKey649ForLook(this.cPu.scene, 8);
      else
        an.reportIdKey649ForLook(this.cPu.scene, 3);
    }
  }

  public final cve cFt()
  {
    return (cve)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 1943;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.a.c.b
 * JD-Core Version:    0.6.2
 */