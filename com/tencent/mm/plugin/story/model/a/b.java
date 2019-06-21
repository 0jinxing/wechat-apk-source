package com.tencent.mm.plugin.story.model.a;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bt.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bqk;
import com.tencent.mm.protocal.protobuf.bsh;
import com.tencent.mm.protocal.protobuf.bsi;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryAudioReport;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "requestId", "", "feedbackList", "", "Lcom/tencent/mm/protocal/protobuf/RecommendedMusicFeedback;", "(JLjava/util/List;)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class b extends m
  implements k
{
  private static final String TAG = "MicroMsg.NetSceneStoryAudioReport";
  public static final b.a rUK;
  private final com.tencent.mm.ai.b ehh;
  private f ehi;

  static
  {
    AppMethodBeat.i(109208);
    rUK = new b.a((byte)0);
    TAG = "MicroMsg.NetSceneStoryAudioReport";
    AppMethodBeat.o(109208);
  }

  public b(long paramLong, List<? extends bqk> paramList)
  {
    AppMethodBeat.i(109207);
    Object localObject = new com.tencent.mm.ai.b.a();
    ((com.tencent.mm.ai.b.a)localObject).a((a)new bsh());
    ((com.tencent.mm.ai.b.a)localObject).b((a)new bsi());
    ((com.tencent.mm.ai.b.a)localObject).qq("/cgi-bin/micromsg-bin/reportrecommendedmusicfeedback");
    ((com.tencent.mm.ai.b.a)localObject).kU(298);
    localObject = ((com.tencent.mm.ai.b.a)localObject).acD();
    j.o(localObject, "builder.buildInstance()");
    this.ehh = ((com.tencent.mm.ai.b)localObject);
    localObject = this.ehh.acz();
    if (localObject == null)
    {
      paramList = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ReportRecommendedMusicFeedbackRequest");
      AppMethodBeat.o(109207);
      throw paramList;
    }
    localObject = (bsh)localObject;
    ((bsh)localObject).rUb = paramLong;
    ((bsh)localObject).wUm.addAll((Collection)paramList);
    ab.i(TAG, "LogStory: report music " + paramLong + ' ' + paramList.size());
    AppMethodBeat.o(109207);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(109205);
    j.p(parame, "dispatcher");
    j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (k)this);
    AppMethodBeat.o(109205);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109206);
    ab.i(TAG, "onGYNetEnd " + paramInt1 + ", " + paramInt2 + ", " + paramInt3 + ", " + paramString);
    paramq = this.ehi;
    if (paramq != null)
    {
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109206);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109206);
    }
  }

  public final int getType()
  {
    return 298;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.b
 * JD-Core Version:    0.6.2
 */