package com.tencent.mm.plugin.story.model.a;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.model.cb;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.story.h.g;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cfd;
import com.tencent.mm.protocal.protobuf.cfe;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStoryUserPage;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "userName", "", "maxId", "", "isSelf", "", "mRoomId", "source", "", "(Ljava/lang/String;JZLjava/lang/String;I)V", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "forSameMd5Count", "fp", "getFp", "()Z", "setFp", "(Z)V", "setSelf", "getMRoomId", "()Ljava/lang/String;", "getMaxId", "()J", "setMaxId", "(J)V", "minId", "getMinId", "setMinId", "originMaxId", "recentLimitID", "getRecentLimitID", "setRecentLimitID", "requestMd5", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "getSource", "()I", "sourceType", "getUserName", "setUserName", "(Ljava/lang/String;)V", "deleteDeprecatedData", "", "storyId", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getInfo", "getType", "insertList", "", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "resp", "Lcom/tencent/mm/protocal/protobuf/StoryUserPageResponse;", "onGYNetEnd", "netId", "errType", "errCode", "errMsg", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "Companion", "plugin-story_release"})
public final class j extends com.tencent.mm.ai.m
  implements com.tencent.mm.network.k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStoryUserPage";
  private static final Vector<String> qKd;
  public static final j.a rVc;
  public final int cvd;
  private int cvp;
  private boolean czr;
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  private final String ejD;
  public boolean qIW;
  private long qIX;
  private long qIY;
  private String qJA;
  private int qJa;
  public long qKi;
  private long rUP;
  public String userName;

  static
  {
    AppMethodBeat.i(109258);
    rVc = new j.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStoryUserPage";
    qKd = new Vector();
    AppMethodBeat.o(109258);
  }

  public j(String paramString1, long paramLong, boolean paramBoolean, String paramString2, int paramInt)
  {
    AppMethodBeat.i(109256);
    this.userName = paramString1;
    this.qIX = paramLong;
    this.czr = paramBoolean;
    this.ejD = paramString2;
    this.cvd = paramInt;
    this.qJA = "";
    if (this.qIX == 0L)
    {
      ab.i(TAG, "fp mUserName " + this.userName);
      if (!this.czr)
        break label247;
      paramString1 = com.tencent.mm.plugin.story.h.a.sdm;
    }
    for (paramInt = com.tencent.mm.plugin.story.h.a.cAO(); ; paramInt = com.tencent.mm.plugin.story.h.a.cAP())
    {
      this.cvp = paramInt;
      paramString1 = new b.a();
      paramString1.a((com.tencent.mm.bt.a)new cfd());
      paramString1.b((com.tencent.mm.bt.a)new cfe());
      paramString1.qq("/cgi-bin/micromsg-bin/mmstoryuserpage");
      paramString1.kU(273);
      paramString1.kV(400);
      paramString1.kW(1000000400);
      paramString1 = paramString1.acD();
      a.f.b.j.o(paramString1, "builder.buildInstance()");
      this.ehh = paramString1;
      paramString1 = this.ehh.acz();
      if (paramString1 != null)
        break label259;
      paramString1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryUserPageRequest");
      AppMethodBeat.o(109256);
      throw paramString1;
      ab.i(TAG, "np mUserName " + this.userName);
      break;
      label247: paramString1 = com.tencent.mm.plugin.story.h.a.sdm;
    }
    label259: cfd localcfd = (cfd)paramString1;
    localcfd.jBB = this.userName;
    localcfd.wZU = this.qIX;
    localcfd.vFH = this.cvd;
    if (this.qIX == 0L);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      this.qIW = paramBoolean;
      localcfd.xbw = 0L;
      if (a.k.m.a((CharSequence)this.ejD, "@", 0, false, 6) <= 0)
        break label412;
      paramString1 = this.ejD;
      paramInt = a.k.m.a((CharSequence)this.ejD, "@", 0, false, 6);
      if (paramString1 != null)
        break;
      paramString1 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(109256);
      throw paramString1;
    }
    paramString1 = paramString1.substring(0, paramInt);
    a.f.b.j.o(paramString1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
    localcfd.xeF = bo.anl(paramString1);
    label412: localcfd.xbx = 0;
    localcfd.vEf = this.ejD;
    if (this.qIW)
    {
      paramInt = this.cvd;
      paramString1 = com.tencent.mm.plugin.story.h.a.sdm;
      if (paramInt != com.tencent.mm.plugin.story.h.a.cBs())
        break label652;
      paramString1 = com.tencent.mm.plugin.story.model.j.rST;
      paramString1 = com.tencent.mm.plugin.story.model.j.a.cxU();
      paramString2 = this.userName;
      a.f.b.j.p(paramString2, "userName");
      paramString2 = paramString1.aaU(paramString2).field_favoriteMd5;
      paramString1 = paramString2;
      if (paramString2 != null);
    }
    for (paramString1 = ""; ; paramString1 = com.tencent.mm.plugin.story.model.j.a.cxU().aaV(this.userName))
    {
      this.qJA = paramString1;
      if (this.qJA == null)
        this.qJA = "";
      localcfd.wZT = this.qJA;
      this.rUP = this.qIX;
      ab.i(TAG, this + " req.mUserName:" + localcfd.jBB + " req.MaxId:" + localcfd.wZU + " req.MinFilterId:" + localcfd.xbw + " req.LastRequestTime:" + localcfd.xbx + " ChatRoomName " + this.ejD + " req.FirstPageMd5:" + localcfd.wZT + " souorce:" + this.cvd);
      AppMethodBeat.o(109256);
      return;
      label652: paramString1 = com.tencent.mm.plugin.story.model.j.rST;
    }
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(109254);
    a.f.b.j.p(parame, "dispatcher");
    a.f.b.j.p(paramf, "callback");
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (com.tencent.mm.network.k)this);
    AppMethodBeat.o(109254);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109255);
    ab.i(TAG, this + " netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString + " source:" + this.cvd);
    paramq = this.ehh.acA();
    if (paramq == null)
    {
      paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryUserPageResponse");
      AppMethodBeat.o(109255);
      throw paramString;
    }
    cfe localcfe = (cfe)paramq;
    this.qKi = localcfe.xdM;
    if ((paramInt2 != 0) && (paramInt2 != 4))
    {
      ab.w(TAG, "onGYNetEnd errorType:" + paramInt2 + " errorCode:" + paramInt3 + ", return");
      paramq = this.ehi;
      if (paramq == null)
        a.f.b.j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
      AppMethodBeat.o(109255);
      return;
    }
    paramArrayOfByte = localcfe.wZT;
    paramq = paramArrayOfByte;
    if (paramArrayOfByte == null)
      paramq = "";
    ab.i(TAG, "onGYNetEnd resp: ObjCount " + localcfe.xeG + ", size " + localcfe.xeH.size() + "; md5 req " + this.qJA + ", resp " + paramq + ", source: " + this.cvd + ", expiredTime:" + localcfe.vAR);
    label363: label382: long l;
    if (paramInt2 == 0)
    {
      paramArrayOfByte = (CharSequence)this.qJA;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length() == 0))
      {
        paramInt1 = 1;
        if (paramInt1 != 0)
          break label516;
        if (((CharSequence)paramq).length() != 0)
          break label502;
        paramInt1 = 1;
        if ((paramInt1 != 0) || (!bo.isEqual(this.qJA, paramq)))
          break label516;
        paramq = com.tencent.mm.plugin.story.model.j.rST;
        paramq = com.tencent.mm.plugin.story.model.j.a.cxT();
        if (!this.qIW)
          break label507;
        l = 0L;
        label418: this.qIY = paramq.b(l, this.qJa, this.userName, this.czr);
        ab.i(TAG, "md5 is nochange");
        paramInt1 = 1;
      }
    }
    while (true)
    {
      if (paramInt1 != 0)
      {
        paramq = this.ehi;
        if (paramq == null)
          a.f.b.j.avw("callback");
        paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
        AppMethodBeat.o(109255);
        break;
        paramInt1 = 0;
        break label363;
        label502: paramInt1 = 0;
        break label382;
        label507: l = this.rUP;
        break label418;
        label516: paramInt1 = this.cvd;
        paramArrayOfByte = com.tencent.mm.plugin.story.h.a.sdm;
        if (paramInt1 == com.tencent.mm.plugin.story.h.a.cBs())
        {
          paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
          com.tencent.mm.plugin.story.model.j.a.cxU().gC(this.userName, paramq);
          paramInt1 = 0;
          continue;
        }
        paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
        com.tencent.mm.plugin.story.model.j.a.cxU().gB(this.userName, paramq);
        paramInt1 = 0;
        continue;
        if (paramInt2 != 4)
          break label1349;
        paramq = com.tencent.mm.plugin.story.h.a.sdm;
        if (paramInt3 != com.tencent.mm.plugin.story.h.a.cAV())
          break label1349;
        paramInt1 = 1;
        continue;
      }
      paramq = localcfe.xeH;
      a.f.b.j.o(paramq, "resp.ObjList");
      paramq = (cer)a.a.j.fK((List)paramq);
      if (paramq != null)
      {
        l = paramq.vQE;
        this.qIX = l;
        paramq = localcfe.xeH;
        a.f.b.j.o(paramq, "resp.ObjList");
        paramq = (cer)a.a.j.fM((List)paramq);
        if (paramq == null)
          break label910;
        l = paramq.vQE;
        label687: this.qIY = l;
        if (!this.czr)
          break label916;
        paramq = com.tencent.mm.plugin.story.model.j.rST;
      }
      Object localObject2;
      for (paramq = com.tencent.mm.plugin.story.model.j.a.cxT().a(this.userName, true, cb.aaF() - 86400, true); ; paramq = com.tencent.mm.plugin.story.model.j.a.cxT().bw(this.userName, false))
      {
        ab.i(TAG, "determin clear fav: " + this.cvd + ", " + paramInt3 + ", " + this.qIW);
        paramInt1 = this.cvd;
        paramArrayOfByte = com.tencent.mm.plugin.story.h.a.sdm;
        if ((paramInt1 != com.tencent.mm.plugin.story.h.a.cBs()) || (paramInt3 != 0) || (!this.qIW))
          break label937;
        ab.i(TAG, "fetch first page, clear all fav");
        paramArrayOfByte = com.tencent.mm.plugin.story.model.j.rST;
        paramArrayOfByte = com.tencent.mm.plugin.story.model.j.a.cxT();
        localObject1 = this.userName;
        String str = this.userName;
        localObject2 = com.tencent.mm.plugin.story.model.j.rST;
        paramArrayOfByte = ((Iterable)paramArrayOfByte.bx((String)localObject1, bo.isEqual(str, com.tencent.mm.plugin.story.model.j.a.cnk()))).iterator();
        while (paramArrayOfByte.hasNext())
        {
          localObject2 = (com.tencent.mm.plugin.story.h.j)paramArrayOfByte.next();
          localObject1 = n.rTi;
          n.a.fK((int)((com.tencent.mm.plugin.story.h.j)localObject2).xDa, 0);
        }
        l = 0L;
        break;
        label910: l = 0L;
        break label687;
        label916: paramq = com.tencent.mm.plugin.story.model.j.rST;
      }
      label937: paramArrayOfByte = n.rTi;
      paramArrayOfByte = n.a.b(this.userName, (List)localcfe.xeH, this.cvp);
      ab.i(TAG, "onGYNetEnd replace insert " + paramArrayOfByte.size() + ", max " + this.qIX + ", min " + this.qIY);
      paramInt1 = this.cvd;
      Object localObject1 = com.tencent.mm.plugin.story.h.a.sdm;
      if (paramInt1 == com.tencent.mm.plugin.story.h.a.cBq())
      {
        paramq = ((Iterable)paramq).iterator();
        label1163: label1204: label1209: 
        while (paramq.hasNext())
        {
          localObject1 = (com.tencent.mm.plugin.story.h.j)paramq.next();
          if (((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID != 0L)
          {
            localObject2 = localcfe.xeH;
            a.f.b.j.o(localObject2, "resp.ObjList");
            localObject2 = (Iterable)localObject2;
            if ((!(localObject2 instanceof Collection)) || (!((Collection)localObject2).isEmpty()))
            {
              localObject2 = ((Iterable)localObject2).iterator();
              label1129: if (((Iterator)localObject2).hasNext())
                if (((cer)((Iterator)localObject2).next()).vQE == ((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID)
                {
                  paramInt1 = 1;
                  if (paramInt1 == 0)
                    break label1204;
                }
            }
            for (paramInt1 = 0; ; paramInt1 = 1)
            {
              if ((paramInt1 == 0) || (((com.tencent.mm.plugin.story.h.j)localObject1).cBW()))
                break label1209;
              localObject2 = com.tencent.mm.plugin.story.model.j.rST;
              com.tencent.mm.plugin.story.model.j.a.cxT().lw(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID);
              break;
              paramInt1 = 0;
              break label1163;
              break label1129;
            }
          }
        }
        paramArrayOfByte = (com.tencent.mm.plugin.story.h.j)a.a.j.x((List)paramArrayOfByte, 0);
        if (paramArrayOfByte != null)
          break label1292;
        ab.i(TAG, "onGYNetEnd clear ext sync");
        paramq = com.tencent.mm.plugin.story.model.k.rTc;
        com.tencent.mm.plugin.story.model.k.aan(this.userName);
      }
      while (true)
      {
        paramq = this.ehi;
        if (paramq == null)
          a.f.b.j.avw("callback");
        paramq.onSceneEnd(paramInt2, paramInt3, paramString, (com.tencent.mm.ai.m)this);
        AppMethodBeat.o(109255);
        break;
        label1292: ab.i(TAG, "onGYNetEnd update ext sync, " + paramArrayOfByte.field_storyID + ' ' + paramArrayOfByte.field_createTime);
        paramq = com.tencent.mm.plugin.story.model.k.rTc;
        com.tencent.mm.plugin.story.model.k.a(this.userName, paramArrayOfByte);
      }
      label1349: paramInt1 = 0;
    }
  }

  public final String getInfo()
  {
    return this.userName;
  }

  public final int getType()
  {
    return 273;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.j
 * JD-Core Version:    0.6.2
 */