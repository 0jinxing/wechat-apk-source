package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bt.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.radar.ui.g;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.protocal.protobuf.bpc;
import com.tencent.mm.protocal.protobuf.bpd;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/NetSceneRadarSearch;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "opCode", "", "latitude", "", "longitude", "precision", "gpsSource", "macAddr", "", "cellId", "(IFFIILjava/lang/String;Ljava/lang/String;)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "getOpCode", "()I", "radarSearchMembers", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/RadarSearchMember;", "getRadarSearchMembers", "()Ljava/util/LinkedList;", "radarSearchMembersCount", "getRadarSearchMembersCount", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-radar_release"})
public final class b extends m
  implements k
{
  private static final String TAG = "MicroMsg.NetSceneRadarSearch";
  public static final b.a pAL;
  private final float cEB;
  private final float cGm;
  private final int cGn;
  private final int cGo;
  private final String cGp;
  private final String cGq;
  final int czE;
  com.tencent.mm.ai.b ehh;
  private f ehi;

  static
  {
    AppMethodBeat.i(102868);
    pAL = new b.a((byte)0);
    TAG = "MicroMsg.NetSceneRadarSearch";
    AppMethodBeat.o(102868);
  }

  public b(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2, int paramInt3, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102866);
    this.czE = paramInt1;
    this.cEB = paramFloat1;
    this.cGm = paramFloat2;
    this.cGn = paramInt2;
    this.cGo = paramInt3;
    this.cGp = paramString1;
    this.cGq = paramString2;
    if (this.czE == 0)
      ab.e(TAG, "opcode is wrong!");
    AppMethodBeat.o(102866);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(102865);
    j.p(parame, "dispatcher");
    j.p(paramf, "callback");
    this.ehi = paramf;
    paramf = new com.tencent.mm.ai.b.a();
    paramf.a((a)new bpc());
    paramf.b((a)new bpd());
    paramf.qq("/cgi-bin/micromsg-bin/mmradarsearch");
    paramf.kU(425);
    paramf.kV(209);
    paramf.kW(1000000209);
    this.ehh = paramf.acD();
    paramf = this.ehh;
    if (paramf == null)
      j.dWJ();
    paramf = paramf.acz();
    if (paramf == null)
    {
      parame = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RadarSearchRequest");
      AppMethodBeat.o(102865);
      throw parame;
    }
    paramf = (bpc)paramf;
    paramf.OpCode = this.czE;
    paramf.wfI = this.cGq;
    paramf.wfJ = this.cGo;
    paramf.vRq = this.cEB;
    paramf.vRp = this.cGm;
    paramf.wfH = this.cGp;
    paramf.wfG = this.cGn;
    int i = a(parame, (q)this.ehh, (k)this);
    AppMethodBeat.o(102865);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102864);
    ab.d(TAG, "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((this.czE == 1) && (paramInt2 == 0))
    {
      ArrayList localArrayList = new ArrayList();
      paramq = this.ehh;
      if (paramq != null);
      for (paramq = paramq.acA(); ; paramq = null)
      {
        paramArrayOfByte = paramq;
        if (!(paramq instanceof bpd))
          paramArrayOfByte = null;
        paramq = (bpd)paramArrayOfByte;
        if (paramq == null)
          break;
        paramq = paramq.vEh;
        if (paramq == null)
          break;
        paramArrayOfByte = ((Iterable)paramq).iterator();
        while (paramArrayOfByte.hasNext())
        {
          paramq = (bpb)paramArrayOfByte.next();
          h localh = new h();
          g localg = g.pDK;
          j.o(paramq, "member");
          localh.setUsername(g.b(paramq));
          localh.qn(paramq.SmallImgUrl);
          localh.cB(true);
          localArrayList.add(localh);
        }
      }
      o.act().aa((List)localArrayList);
    }
    paramq = this.ehi;
    if (paramq != null)
    {
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(102864);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102864);
    }
  }

  public final int getType()
  {
    return 425;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.b
 * JD-Core Version:    0.6.2
 */