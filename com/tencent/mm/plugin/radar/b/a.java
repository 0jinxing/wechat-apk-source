package com.tencent.mm.plugin.radar.b;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/NetSceneRadarRelationChain;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "memberList", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/RadarChatRoomMember;", "(Ljava/util/LinkedList;)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "radarRelationChainResponse", "Lcom/tencent/mm/protocal/protobuf/RadarRelationChainResponse;", "getRadarRelationChainResponse", "()Lcom/tencent/mm/protocal/protobuf/RadarRelationChainResponse;", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-radar_release"})
public final class a extends m
  implements k
{
  private static final String TAG = "MicroMsg.Radar.NetSceneRadarRelationChain";
  public static final a.a pAK;
  final b ehh;
  private f ehi;

  static
  {
    AppMethodBeat.i(102863);
    pAK = new a.a((byte)0);
    TAG = "MicroMsg.Radar.NetSceneRadarRelationChain";
    AppMethodBeat.o(102863);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(102861);
    j.p(parame, "dispatcher");
    j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (k)this);
    AppMethodBeat.o(102861);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(102862);
    ab.d(TAG, "netId:%d errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = this.ehi;
    if (paramq != null)
    {
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(102862);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(102862);
    }
  }

  public final int getType()
  {
    return 602;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.a
 * JD-Core Version:    0.6.2
 */