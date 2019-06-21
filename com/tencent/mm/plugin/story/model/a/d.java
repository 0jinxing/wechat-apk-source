package com.tencent.mm.plugin.story.model.a;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.protocal.protobuf.cdv;
import com.tencent.mm.protocal.protobuf.cdx;
import com.tencent.mm.protocal.protobuf.cdy;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryComment;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "clientId", "", "commentDetail", "Lcom/tencent/mm/protocal/protobuf/StoryCommentDetail;", "sessionId", "currentCommentItem", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "(Ljava/lang/String;Lcom/tencent/mm/protocal/protobuf/StoryCommentDetail;Ljava/lang/String;Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "getCallback", "()Lcom/tencent/mm/modelbase/IOnSceneEnd;", "setCallback", "(Lcom/tencent/mm/modelbase/IOnSceneEnd;)V", "getCurrentCommentItem", "()Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getCurCommentItem", "getResp", "Lcom/tencent/mm/protocal/protobuf/StoryCommentResponse;", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class d extends m
  implements k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStoryComment";
  public static final d.a rUO;
  public final b ehh;
  public f ehi;
  private cdv rUM;
  public final com.tencent.mm.plugin.story.model.b.a rUN;

  static
  {
    AppMethodBeat.i(109216);
    rUO = new d.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStoryComment";
    AppMethodBeat.o(109216);
  }

  public d(String paramString1, cdv paramcdv, String paramString2, com.tencent.mm.plugin.story.model.b.a parama)
  {
    AppMethodBeat.i(138749);
    this.rUM = paramcdv;
    this.rUN = parama;
    paramcdv = new b.a();
    paramcdv.a((com.tencent.mm.bt.a)new cdx());
    paramcdv.b((com.tencent.mm.bt.a)new cdy());
    paramcdv.qq("/cgi-bin/micromsg-bin/mmstorycomment");
    paramcdv.kU(354);
    paramcdv.kV(0);
    paramcdv.kW(0);
    paramcdv = paramcdv.acD();
    j.o(paramcdv, "builder.buildInstance()");
    this.ehh = paramcdv;
    paramcdv = this.ehh.acz();
    if (paramcdv == null)
    {
      paramString1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentRequest");
      AppMethodBeat.o(138749);
      throw paramString1;
    }
    paramcdv = (cdx)paramcdv;
    paramcdv.ptv = paramString1;
    paramcdv.xdF = this.rUM;
    paramString1 = h.scu;
    paramcdv.xdH = ((int)h.cAs().FF());
    paramString1 = h.scu;
    paramcdv.xdI = ((int)h.cAs().FG());
    paramcdv.vGA = paramString2;
    ab.i(TAG, "ClientId " + paramcdv.ptv + " PreviewEnterScene " + paramcdv.xdH + " sessionID: " + paramcdv.vGA + ' ');
    AppMethodBeat.o(138749);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(109213);
    j.p(parame, "dispatcher");
    j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (k)this);
    AppMethodBeat.o(109213);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(109214);
    ab.i(TAG, "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      paramq = (CharSequence)this.rUM.ncM;
      if (paramq != null)
      {
        paramInt1 = i;
        if (paramq.length() != 0);
      }
      else
      {
        paramInt1 = 1;
      }
      if (paramInt1 != 0)
      {
        paramq = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.cAd();
        if (paramInt2 == 4)
        {
          paramq = com.tencent.mm.plugin.story.g.e.sbS;
          com.tencent.mm.plugin.story.g.e.cAf();
        }
      }
    }
    while (true)
    {
      paramq = this.ehi;
      if (paramq == null)
        j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109214);
      return;
      paramq = com.tencent.mm.plugin.story.g.e.sbS;
      com.tencent.mm.plugin.story.g.e.cAe();
      if (paramInt2 == 4)
      {
        paramq = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.cAg();
        continue;
        paramq = (CharSequence)this.rUM.ncM;
        if ((paramq == null) || (paramq.length() == 0));
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 == 0)
            break label233;
          paramq = com.tencent.mm.plugin.story.g.e.sbS;
          com.tencent.mm.plugin.story.g.e.cAb();
          break;
        }
        label233: paramq = com.tencent.mm.plugin.story.g.e.sbS;
        com.tencent.mm.plugin.story.g.e.cAc();
      }
    }
  }

  public final int getType()
  {
    return 354;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.d
 * JD-Core Version:    0.6.2
 */