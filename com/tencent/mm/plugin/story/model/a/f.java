package com.tencent.mm.plugin.story.model.a;

import a.k.d;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.plugin.story.h.g;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.plugin.story.h.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.plugin.story.model.o.a;
import com.tencent.mm.plugin.story.model.q.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cef;
import com.tencent.mm.protocal.protobuf.ceg;
import com.tencent.mm.protocal.protobuf.ceh;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryHistoryPage;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "userName", "", "maxId", "", "isSelf", "", "(Ljava/lang/String;JZ)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "forSameMd5Count", "", "fp", "getFp", "()Z", "setFp", "(Z)V", "setSelf", "getMaxId", "()J", "setMaxId", "(J)V", "minId", "getMinId", "setMinId", "originMaxId", "recentLimitID", "getRecentLimitID", "setRecentLimitID", "requestMd5", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "sourceType", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "deleteFaultdData", "", "storyId", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "existFaultData", "getType", "insertList", "resp", "Lcom/tencent/mm/protocal/protobuf/StoryHistoryPageResponse;", "onGYNetEnd", "netId", "errType", "errCode", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class f extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStoryHistoryPage";
  public static final f.a rUR;
  private int cvp;
  private boolean czr;
  private com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  public boolean qIW;
  private long qIX;
  private long qIY;
  private String qJA;
  public long qKi;
  private long rUP;
  public String userName;

  static
  {
    AppMethodBeat.i(109229);
    rUR = new f.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStoryHistoryPage";
    AppMethodBeat.o(109229);
  }

  public f(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(109228);
    this.userName = paramString;
    this.qIX = paramLong;
    this.czr = paramBoolean;
    this.qJA = "";
    if (this.qIX == 0L)
      ab.i(TAG, "fp mUserName " + this.userName);
    int j;
    while (true)
    {
      paramString = com.tencent.mm.plugin.story.h.a.sdm;
      j = com.tencent.mm.plugin.story.h.a.cAQ();
      paramString = com.tencent.mm.plugin.story.h.a.sdm;
      this.cvp = (j | com.tencent.mm.plugin.story.h.a.cAO());
      paramString = new b.a();
      paramString.a((com.tencent.mm.bt.a)new ceg());
      paramString.b((com.tencent.mm.bt.a)new ceh());
      paramString.qq("/cgi-bin/micromsg-bin/mmstoryhistorypage");
      paramString.kU(191);
      paramString.kV(0);
      paramString.kW(0);
      paramString = paramString.acD();
      a.f.b.j.o(paramString, "builder.buildInstance()");
      this.ehh = paramString;
      paramString = this.ehh.acz();
      if (paramString != null)
        break;
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageRequest");
      AppMethodBeat.o(109228);
      throw paramString;
      ab.i(TAG, "np mUserName " + this.userName);
    }
    paramString = (ceg)paramString;
    paramString.jBB = this.userName;
    paramString.wZU = this.qIX;
    if (this.qIX == 0L)
      paramBoolean = true;
    while (true)
    {
      this.qIW = paramBoolean;
      Object localObject = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cyd();
      j = o.a.aaC(this.userName);
      localObject = com.tencent.mm.plugin.story.model.j.rST;
      localObject = j.a.cxT();
      if (this.qIW)
      {
        paramLong = l;
        this.qIY = ((com.tencent.mm.plugin.story.h.k)localObject).E(paramLong, j);
        paramString.xbw = this.qIY;
        paramString.xbx = 0;
      }
      try
      {
        localObject = bo.dpA();
        a.f.b.j.o(localObject, "Util.getTimeZoneOffset()");
        float f = Float.parseFloat((String)localObject);
        i = (int)f;
        label359: paramString.lvg = i;
        if (this.qIW)
        {
          localObject = com.tencent.mm.plugin.story.model.j.rST;
          g localg = j.a.cxU();
          localObject = com.tencent.mm.plugin.story.h.a.sdm;
          this.qJA = localg.aaV(com.tencent.mm.plugin.story.h.a.cAT());
          if (this.qJA == null)
            this.qJA = "";
          paramString.wZT = this.qJA;
        }
        this.rUP = this.qIX;
        ab.i(TAG, "req.mUserName:" + paramString.jBB + " req.MaxId:" + paramString.wZU + " req.MinFilterId:" + paramString.xbw + " req.LastRequestTime:" + paramString.xbx + " req.FirstPageMd5:" + paramString.wZT + " req.TimeZone:" + paramString.lvg);
        AppMethodBeat.o(109228);
        return;
        paramBoolean = false;
        continue;
        paramLong = this.qIX;
      }
      catch (Exception localException)
      {
        break label359;
      }
    }
  }

  private final void a(ceh paramceh)
  {
    AppMethodBeat.i(109227);
    Object localObject1 = paramceh.xed;
    a.f.b.j.o(localObject1, "resp.HistoryItemList");
    Iterator localIterator = ((Iterable)localObject1).iterator();
    if (localIterator.hasNext())
    {
      cef localcef = (cef)localIterator.next();
      ab.d(TAG, "date=" + localcef.xdK + " count=" + localcef.xds + " id=" + localcef.vQE);
      localObject1 = n.rTi;
      Object localObject2 = this.userName;
      Object localObject3 = localcef.xdJ;
      a.f.b.j.o(localObject3, "it.StoryObject");
      int i = this.cvp;
      a.f.b.j.p(localObject2, "userName");
      a.f.b.j.p(localObject3, "storyObj");
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT();
      ab.d(n.access$getTAG$cp(), "insertStory storyObj.id:" + ((cer)localObject3).vQE);
      Object localObject4 = ((com.tencent.mm.plugin.story.h.k)localObject1).lt(((cer)localObject3).vQE);
      localObject1 = localObject4;
      if (localObject4 == null)
        localObject1 = new com.tencent.mm.plugin.story.h.j();
      a.f.b.j.p(localObject1, "storyInfo");
      a.f.b.j.p(localObject3, "storyObj");
      a.f.b.j.p(localObject2, "userName");
      if ((((cer)localObject3).xen == null) || (((cer)localObject3).xen.getBuffer() == null))
        ab.i(n.access$getTAG$cp(), "object desc is null");
      while (true)
      {
        localObject1 = com.tencent.mm.plugin.story.model.m.rTh;
        a.f.b.j.o(localcef, "it");
        a.f.b.j.p(localcef, "item");
        localObject1 = h.sdT;
        a.f.b.j.p(localcef, "item");
        localObject3 = new h();
        localObject4 = localcef.xdK;
        localObject1 = localObject4;
        if (localObject4 == null)
          localObject1 = "";
        ((h)localObject3).field_date = ((String)localObject1);
        ((h)localObject3).field_count = localcef.xds;
        localObject1 = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxZ().a((h)localObject3);
        break;
        localObject4 = ((cer)localObject3).xen.getBuffer().toByteArray();
        a.f.b.j.o(localObject4, "storyObj.ObjDesc.getBuffer().toByteArray()");
        localObject4 = new String((byte[])localObject4, d.UTF_8);
        ab.d(n.access$getTAG$cp(), "from server %d \n%s", new Object[] { Long.valueOf(((cer)localObject3).vQE), localObject4 });
        localObject2 = com.tencent.mm.plugin.story.model.q.rTk;
        localObject2 = q.a.aaE((String)localObject4);
        if ((!bo.isNullOrNil((String)localObject4)) && (localObject2 != null) && (((com.tencent.mm.plugin.story.h.j)localObject1).c((cfb)localObject2)))
        {
          ab.d(n.access$getTAG$cp(), "from server xml ok %d \n ".concat(String.valueOf(localObject4)), new Object[] { Long.valueOf(((cer)localObject3).vQE) });
          ((cer)localObject3).xen.setBuffer(new byte[0]);
          ((com.tencent.mm.plugin.story.h.j)localObject1).field_userName = ((cer)localObject3).jBB;
          ((com.tencent.mm.plugin.story.h.j)localObject1).field_createTime = ((cer)localObject3).pcX;
          ((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID = ((cer)localObject3).vQE;
          if (!((cer)localObject3).xeo.isEmpty())
            ((com.tencent.mm.plugin.story.h.j)localObject1).field_attrBuf = ((cer)localObject3).toByteArray();
          ab.i(n.access$getTAG$cp(), "id:" + ((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID + " createTime:" + ((com.tencent.mm.plugin.story.h.j)localObject1).field_createTime + " CommentListSize:" + ((cer)localObject3).xeo.size() + " BubbleListSize:" + ((cer)localObject3).xeq.size());
          ((com.tencent.mm.plugin.story.h.j)localObject1).DF(i);
          localObject4 = ((com.tencent.mm.plugin.story.h.j)localObject1).cBR();
          ((cfb)localObject4).jBB = ((cer)localObject3).jBB;
          ((com.tencent.mm.plugin.story.h.j)localObject1).b((cfb)localObject4);
          localObject4 = com.tencent.mm.plugin.story.model.j.rST;
          if (j.a.cxT().kv(((cer)localObject3).vQE))
          {
            localObject4 = com.tencent.mm.plugin.story.model.j.rST;
            j.a.cxT().b(((cer)localObject3).vQE, (com.tencent.mm.plugin.story.h.j)localObject1);
            localObject1 = com.tencent.mm.plugin.story.model.j.rST;
            j.a.cxT().lx(((cer)localObject3).vQE);
          }
          else
          {
            localObject4 = com.tencent.mm.plugin.story.model.j.rST;
            j.a.cxT().d((com.tencent.mm.plugin.story.h.j)localObject1);
          }
        }
      }
    }
    if (this.qIX == 0L)
    {
      localObject1 = paramceh.xed;
      a.f.b.j.o(localObject1, "resp.HistoryItemList");
      this.qIX = ((cef)((LinkedList)localObject1).getFirst()).vQE;
    }
    localObject1 = paramceh.xed;
    a.f.b.j.o(localObject1, "resp.HistoryItemList");
    this.qIY = ((cef)((LinkedList)localObject1).getLast()).vQE;
    ab.i(TAG, "insertList mUserName %s maxId %s minId %s NewRequestTime %s", new Object[] { this.userName, Long.valueOf(this.qIX), Long.valueOf(this.qIY), Integer.valueOf(paramceh.xbC) });
    AppMethodBeat.o(109227);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(109225);
    a.f.b.j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (com.tencent.mm.network.q)this.ehh, (com.tencent.mm.network.k)this);
    AppMethodBeat.o(109225);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109226);
    ab.d(TAG, "netId=" + paramInt1 + " errType=" + paramInt2 + " errCode=" + paramInt3 + " errMsg=" + paramString);
    paramq = this.ehh.acA();
    if (paramq == null)
    {
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryHistoryPageResponse");
      AppMethodBeat.o(109226);
      throw paramString;
    }
    ceh localceh = (ceh)paramq;
    this.qKi = localceh.xdM;
    paramArrayOfByte = localceh.wZT;
    paramq = paramArrayOfByte;
    if (paramArrayOfByte == null)
      paramq = "";
    ab.i(TAG, "objCount:" + localceh.xec + " firstPageMd5:" + paramq + ", expiredTime:" + localceh.vAR);
    if (localceh.xed.isEmpty())
    {
      ab.d(TAG, "error: server give size zero");
      paramq = this.ehi;
      if (paramq == null)
        a.f.b.j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
      AppMethodBeat.o(109226);
      return;
    }
    paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
    paramArrayOfByte = j.a.cxU();
    Object localObject = com.tencent.mm.plugin.story.h.a.sdm;
    paramArrayOfByte.gB(com.tencent.mm.plugin.story.h.a.cAT(), paramq);
    long l;
    if (this.qIX == 0L)
    {
      l = ((cef)localceh.xed.get(localceh.xed.size() - 1)).vQE;
      paramq = n.rTi;
      if (l <= n.a.aaB(this.userName).field_storyID)
        break label592;
    }
    label592: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if (paramInt1 != 0)
      {
        l = ((cef)localceh.xed.get(localceh.xed.size() - 1)).vQE;
        paramArrayOfByte = this.userName;
        paramq = com.tencent.mm.plugin.story.model.j.rST;
        if (bo.isEqual(paramArrayOfByte, j.a.cnk()))
        {
          paramq = n.rTi;
          paramq = this.userName;
          a.f.b.j.p(paramq, "userName");
          paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
          localObject = j.a.cxT();
          a.f.b.j.p(paramq, "userName");
          paramArrayOfByte = "DELETE FROM " + com.tencent.mm.plugin.story.h.k.sdP + " where " + com.tencent.mm.plugin.story.h.k.sdP + ".userName='" + bo.vA(paramq) + "' AND " + com.tencent.mm.plugin.story.h.k.sdP + ".storyID<" + l;
          boolean bool = ((com.tencent.mm.plugin.story.h.k)localObject).bSd.hY(com.tencent.mm.plugin.story.h.k.sdP, paramArrayOfByte);
          ab.d(com.tencent.mm.plugin.story.h.k.TAG, "deleteStoryByIdBefore " + paramq + ' ' + l + " res " + bool);
        }
      }
      a(localceh);
      paramq = this.ehi;
      if (paramq == null)
        a.f.b.j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
      AppMethodBeat.o(109226);
      break;
    }
  }

  public final int getType()
  {
    return 191;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.f
 * JD-Core Version:    0.6.2
 */