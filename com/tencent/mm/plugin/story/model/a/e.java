package com.tencent.mm.plugin.story.model.a;

import a.f.b.j;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.protocal.protobuf.ceb;
import com.tencent.mm.protocal.protobuf.cec;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryDateDetail;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "userName", "", "maxId", "", "date", "(Ljava/lang/String;JLjava/lang/String;)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "forSameMd5Count", "", "fp", "", "getFp", "()Z", "setFp", "(Z)V", "getMaxId", "()J", "setMaxId", "(J)V", "minId", "getMinId", "setMinId", "originMaxId", "recentLimitID", "getRecentLimitID", "setRecentLimitID", "requestMd5", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "sourceType", "getUserName", "setUserName", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getType", "insertList", "", "resp", "Lcom/tencent/mm/protocal/protobuf/StoryDateDetailResponse;", "onGYNetEnd", "netId", "errType", "errCode", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class e extends m
  implements k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStoryDateDetail";
  public static final e.a rUQ;
  private int cvp;
  private b ehh;
  private f ehi;
  private boolean qIW;
  private long qIX;
  private long qIY;
  private String qJA;
  private long qKi;
  private String qkq;
  private long rUP;
  public String userName;

  static
  {
    AppMethodBeat.i(109220);
    rUQ = new e.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStoryDateDetail";
    AppMethodBeat.o(109220);
  }

  public e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109219);
    this.userName = paramString1;
    this.qIX = 0L;
    this.qkq = paramString2;
    this.qJA = "";
    if (this.qIX == 0L)
      ab.i(TAG, "fp mUserName " + this.userName);
    while (true)
    {
      paramString1 = com.tencent.mm.plugin.story.h.a.sdm;
      this.cvp = com.tencent.mm.plugin.story.h.a.cAO();
      paramString1 = new b.a();
      paramString1.a((com.tencent.mm.bt.a)new ceb());
      paramString1.b((com.tencent.mm.bt.a)new cec());
      paramString1.qq("/cgi-bin/micromsg-bin/mmstorydatedetail");
      paramString1.kU(529);
      paramString1.kV(0);
      paramString1.kW(0);
      paramString1 = paramString1.acD();
      j.o(paramString1, "builder.buildInstance()");
      this.ehh = paramString1;
      paramString1 = this.ehh.acz();
      if (paramString1 != null)
        break;
      paramString1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailRequest");
      AppMethodBeat.o(109219);
      throw paramString1;
      ab.i(TAG, "np mUserName " + this.userName);
    }
    paramString1 = (ceb)paramString1;
    paramString1.jBB = this.userName;
    paramString1.wZU = this.qIX;
    try
    {
      paramString2 = bo.dpA();
      j.o(paramString2, "Util.getTimeZoneOffset()");
      float f = Float.parseFloat(paramString2);
      i = (int)f;
      paramString1.lvg = i;
      paramString1.xdK = this.qkq;
      if (this.qIX == 0L)
        bool = true;
      this.qIW = bool;
      this.rUP = this.qIX;
      ab.i(TAG, "req.mUserName:" + paramString1.jBB + " req.MaxId:" + paramString1.wZU + " req.TimeZone:" + paramString1.lvg + " req.Date:" + paramString1.xdK);
      AppMethodBeat.o(109219);
      return;
    }
    catch (Exception paramString2)
    {
      while (true)
        int i = 0;
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(109217);
    j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (k)this);
    AppMethodBeat.o(109217);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109218);
    ab.d(TAG, "netId=" + paramInt1 + " errType=" + paramInt2 + " errCode=" + paramInt3 + " errMsg=" + paramString);
    paramq = this.ehh.acA();
    if (paramq == null)
    {
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryDateDetailResponse");
      AppMethodBeat.o(109218);
      throw paramString;
    }
    paramArrayOfByte = (cec)paramq;
    this.qKi = paramArrayOfByte.xdM;
    ab.i(TAG, "objCount: " + paramArrayOfByte.xds + ", expiredTime: " + paramArrayOfByte.vAR);
    if (paramArrayOfByte.xdL.isEmpty())
    {
      ab.d(TAG, "error: server give size zero");
      paramq = this.ehi;
      if (paramq == null)
        j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109218);
    }
    while (true)
    {
      return;
      paramq = n.rTi;
      n.a.b(this.userName, (List)paramArrayOfByte.xdL, this.cvp);
      if (this.qIX == 0L)
      {
        paramq = paramArrayOfByte.xdL;
        j.o(paramq, "resp.StoryList");
        this.qIX = ((cer)paramq.getFirst()).vQE;
      }
      ab.i(TAG, "insertList mUserName %s maxId %s minId %s", new Object[] { this.userName, Long.valueOf(this.qIX), Long.valueOf(this.qIY) });
      paramq = this.ehi;
      if (paramq == null)
        j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109218);
    }
  }

  public final int getType()
  {
    return 529;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.e
 * JD-Core Version:    0.6.2
 */