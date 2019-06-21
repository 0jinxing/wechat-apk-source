package com.tencent.mm.plugin.story.model.a;

import a.k.d;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.story.h.a.c;
import com.tencent.mm.plugin.story.h.n;
import com.tencent.mm.plugin.story.h.o;
import com.tencent.mm.plugin.story.model.g.c;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.q.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cev;
import com.tencent.mm.protocal.protobuf.cew;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryPost;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "content", "", "clientId", "localId", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "TAG", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "isDel", "", "()Z", "setDel", "(Z)V", "getLocalId", "()I", "setLocalId", "(I)V", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "storyId", "", "getStoryId", "()J", "setStoryId", "(J)V", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getStoryLocalId", "getType", "onError", "", "onErrorServer", "errCode", "storyPostResponse", "Lcom/tencent/mm/protocal/protobuf/StoryPostResponse;", "onGYNetEnd", "netId", "errType", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "updateMediaFileName", "old", "Lcom/tencent/mm/protocal/protobuf/StoryTimelineObject;", "cnt", "plugin-story_release"})
public final class h extends m
  implements com.tencent.mm.network.k
{
  private final String TAG;
  public int cNE;
  private final com.tencent.mm.ai.b ehh;
  private com.tencent.mm.ai.f ehi;
  private long rUJ;

  public h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(109238);
    this.cNE = paramInt;
    this.TAG = "MicroMsg.StoryCgi.StoryNetSceneStoryPost";
    Object localObject = new b.a();
    ((b.a)localObject).a((com.tencent.mm.bt.a)new cev());
    ((b.a)localObject).b((com.tencent.mm.bt.a)new cew());
    ((b.a)localObject).qq("/cgi-bin/micromsg-bin/mmstorypost");
    ((b.a)localObject).kU(351);
    ((b.a)localObject).kV(0);
    ((b.a)localObject).kW(0);
    localObject = ((b.a)localObject).acD();
    a.f.b.j.o(localObject, "builder.buildInstance()");
    this.ehh = ((com.tencent.mm.ai.b)localObject);
    localObject = this.ehh.acz();
    if (localObject == null)
    {
      paramString1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryPostRequest");
      AppMethodBeat.o(109238);
      throw paramString1;
    }
    localObject = (cev)localObject;
    SKBuiltinBuffer_t localSKBuiltinBuffer_t = new SKBuiltinBuffer_t();
    paramString1 = paramString1.getBytes(d.UTF_8);
    a.f.b.j.o(paramString1, "(this as java.lang.String).getBytes(charset)");
    localSKBuiltinBuffer_t.setBuffer(paramString1);
    ((cev)localObject).xen = localSKBuiltinBuffer_t;
    ((cev)localObject).ptv = paramString2;
    ((cev)localObject).vIl = new SKBuiltinBuffer_t().setBuffer(com.tencent.mm.plugin.normsg.a.b.oTO.bVS());
    AppMethodBeat.o(109238);
  }

  private final boolean a(long paramLong, cfb paramcfb1, cfb paramcfb2)
  {
    boolean bool = false;
    AppMethodBeat.i(109237);
    if ((paramcfb1 == null) || (paramcfb2 == null) || (paramcfb1.xeA == null) || (paramcfb2.xeA == null))
      AppMethodBeat.o(109237);
    while (true)
    {
      return bool;
      Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.getAccStoryPath();
      localObject1 = paramcfb2.jBB;
      for (int i = 0; (i < paramcfb1.xeA.wbK.size()) && (i < paramcfb2.xeA.wbK.size()); i++)
      {
        Object localObject2 = (cek)paramcfb1.xeA.wbK.get(i);
        Object localObject3 = (cek)paramcfb2.xeA.wbK.get(i);
        Object localObject4 = com.tencent.mm.plugin.story.model.l.rTg;
        localObject4 = com.tencent.mm.plugin.story.model.l.aas(((cek)localObject2).Id);
        Object localObject5 = com.tencent.mm.plugin.story.model.l.rTg;
        localObject2 = com.tencent.mm.plugin.story.model.l.aat(((cek)localObject2).Id);
        localObject5 = com.tencent.mm.plugin.story.model.l.rTg;
        localObject5 = com.tencent.mm.plugin.story.model.l.gx(((cek)localObject3).Url, (String)localObject1);
        Object localObject6 = com.tencent.mm.plugin.story.model.l.rTg;
        localObject6 = com.tencent.mm.plugin.story.model.l.gy(((cek)localObject3).Url, (String)localObject1);
        ab.d(this.TAG, "updateMediaFileName " + (String)localObject4 + " to " + (String)localObject5);
        ab.d(this.TAG, "updateMediaFileName " + (String)localObject2 + " to " + (String)localObject6);
        com.tencent.mm.vfs.e.tf(com.tencent.mm.vfs.e.atb((String)localObject6));
        com.tencent.mm.vfs.e.aQ((String)localObject4, (String)localObject5);
        com.tencent.mm.vfs.e.y((String)localObject2, (String)localObject6);
        localObject4 = s.rTV;
        a.f.b.j.o(localObject3, "mediaObjCnt");
        a.f.b.j.p(localObject3, "media");
        localObject2 = s.a((cek)localObject3, (String)localObject1);
        int j = (int)com.tencent.mm.vfs.e.asZ((String)localObject2);
        localObject4 = com.tencent.mm.plugin.story.model.j.rST;
        if (j.a.cxX().lz(paramLong) == null)
        {
          localObject4 = new n();
          ((n)localObject4).field_storyId = paramLong;
          ((n)localObject4).field_url = ((cek)localObject3).Url;
          ((n)localObject4).field_cacheSize = j;
          ((n)localObject4).field_totalSize = j;
          ((n)localObject4).field_filePath = ((String)localObject2);
          localObject3 = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cxX().a((n)localObject4);
        }
      }
      bool = true;
      AppMethodBeat.o(109237);
    }
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(109235);
    a.f.b.j.p(parame, "dispatcher");
    a.f.b.j.p(paramf, "callback");
    this.ehi = paramf;
    ab.d(this.TAG, "doScene");
    int i = a(parame, (com.tencent.mm.network.q)this.ehh, (com.tencent.mm.network.k)this);
    AppMethodBeat.o(109235);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109236);
    ab.d(this.TAG, "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    paramq = this.ehh.acA();
    if (paramq == null)
    {
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryPostResponse");
      AppMethodBeat.o(109236);
      throw paramString;
    }
    cew localcew = (cew)paramq;
    if (paramInt2 == 4)
    {
      paramq = com.tencent.mm.plugin.story.model.j.rST;
      paramq = j.a.cxT().Fe(this.cNE);
      if (paramq != null)
      {
        try
        {
          paramArrayOfByte = new com/tencent/mm/protocal/protobuf/cel;
          paramArrayOfByte.<init>();
          paramArrayOfByte = paramArrayOfByte.parseFrom(paramq.field_postBuf);
          if (paramArrayOfByte != null)
            break label259;
          paramArrayOfByte = new a/v;
          paramArrayOfByte.<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryMediaPostInfo");
          AppMethodBeat.o(109236);
          throw paramArrayOfByte;
        }
        catch (Exception paramArrayOfByte)
        {
        }
        paramq.cqY();
        paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxT().a(this.cNE, paramq);
        paramq = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cyb().CT(this.cNE);
      }
      else
      {
        paramq = this.ehi;
        if (paramq == null)
          a.f.b.j.avw("callback");
        paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
        AppMethodBeat.o(109236);
      }
    }
    label259: label387: label416: label569: label575: label581: cfb localcfb;
    while (true)
    {
      return;
      paramArrayOfByte = (cel)paramArrayOfByte;
      paramArrayOfByte.wFm = paramInt3;
      paramArrayOfByte = paramArrayOfByte.toByteArray();
      a.f.b.j.o(paramArrayOfByte, "postinfo.toByteArray()");
      paramq.bk(paramArrayOfByte);
      break;
      if (paramInt3 != 0)
      {
        paramq = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cyb().CT(this.cNE);
        paramq = this.ehi;
        if (paramq == null)
          a.f.b.j.avw("callback");
        paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
        AppMethodBeat.o(109236);
      }
      else
      {
        paramq = this.TAG;
        paramArrayOfByte = new StringBuilder("resp.StoryObject==null ");
        if (localcew.xdJ == null)
        {
          bool = true;
          paramArrayOfByte = paramArrayOfByte.append(bool).append(" resp.StoryObject.ObjDesc==null ");
          if (localcew.xdJ.xen != null)
            break label569;
          bool = true;
          paramArrayOfByte = paramArrayOfByte.append(bool).append(" resp.StoryObject.ObjDesc.getBuffer()==null ");
          if (localcew.xdJ.xen.getBuffer() != null)
            break label575;
        }
        for (boolean bool = true; ; bool = false)
        {
          ab.d(paramq, bool);
          if ((localcew.xdJ != null) && (localcew.xdJ.xen != null) && (localcew.xdJ.xen.getBuffer() != null))
            break label581;
          ab.e(this.TAG, "err respone buffer is null ignore");
          paramq = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cxT().DL(this.cNE);
          paramq = this.ehi;
          if (paramq == null)
            a.f.b.j.avw("callback");
          paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
          AppMethodBeat.o(109236);
          break;
          bool = false;
          break label387;
          bool = false;
          break label416;
        }
        paramq = com.tencent.mm.plugin.story.g.f.sbT;
        com.tencent.mm.plugin.story.g.f.cAi();
        paramq = localcew.xdJ.xen.getBuffer().toByteArray();
        a.f.b.j.o(paramq, "resp.StoryObject.ObjDesc.getBuffer().toByteArray()");
        paramq = new String(paramq, d.UTF_8);
        ab.d(this.TAG, "resp.xml:\n ".concat(String.valueOf(paramq)));
        paramArrayOfByte = com.tencent.mm.plugin.story.model.q.rTk;
        localcfb = q.a.aaE(paramq);
        if (localcfb != null)
          break label703;
        paramq = this.ehi;
        if (paramq == null)
          a.f.b.j.avw("callback");
        paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
        AppMethodBeat.o(109236);
      }
    }
    label703: paramq = com.tencent.mm.plugin.story.model.j.rST;
    paramArrayOfByte = j.a.cxT().Fe(this.cNE);
    paramq = paramArrayOfByte;
    if (paramArrayOfByte == null)
      paramq = new com.tencent.mm.plugin.story.h.j();
    a(localcew.xdJ.vQE, paramq.cBR(), localcfb);
    if (localcew.xdJ.xek == 1)
    {
      paramArrayOfByte = com.tencent.mm.plugin.story.h.a.sdm;
      paramq.Fc(com.tencent.mm.plugin.story.h.a.cBn());
    }
    while (true)
    {
      paramq.field_createTime = localcew.xdJ.pcX;
      paramq.c(localcfb);
      paramInt1 = paramq.field_localFlag;
      paramArrayOfByte = a.c.sds;
      paramq.field_localFlag = (paramInt1 & (a.c.cBu() ^ 0xFFFFFFFF));
      paramq.field_storyID = localcew.xdJ.vQE;
      paramArrayOfByte = localcew.xdJ;
      paramArrayOfByte.xen.setBuffer(new byte[0]);
      this.rUJ = localcew.xdJ.vQE;
      paramq.field_attrBuf = paramArrayOfByte.toByteArray();
      paramq.cqX();
      paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxT().a(this.cNE, paramq);
      paramq = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cyb().CT(this.cNE);
      paramq = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().checkPost();
      paramq = this.ehi;
      if (paramq == null)
        a.f.b.j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109236);
      break;
      paramArrayOfByte = com.tencent.mm.plugin.story.h.a.sdm;
      paramq.Fd(com.tencent.mm.plugin.story.h.a.cBn());
    }
  }

  public final int getType()
  {
    return 351;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.h
 * JD-Core Version:    0.6.2
 */