package com.tencent.mm.plugin.story.model.a;

import a.f.b.u.c;
import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.story.h.a.b;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.protocal.aa;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cdv;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cex;
import com.tencent.mm.protocal.protobuf.cey;
import com.tencent.mm.protocal.protobuf.cez;
import com.tencent.mm.protocal.protobuf.cfa;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.protocal.protobuf.tb;
import com.tencent.mm.protocal.protobuf.tc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStorySync;", "Lcom/tencent/mm/modelbase/NetSceneBase;", "Lcom/tencent/mm/network/IOnGYNetEnd;", "selector", "", "(I)V", "MAX_SYNC_COUNT", "callback", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "respHandler", "Lcom/tencent/mm/plugin/story/model/cgi/NetSceneStorySync$RespHandler;", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "doScene", "dispatcher", "Lcom/tencent/mm/network/IDispatcher;", "getType", "onGYNetEnd", "", "netId", "errType", "errCode", "errMsg", "", "irr", "Lcom/tencent/mm/network/IReqResp;", "cookie", "", "processEnd", "processStoryComment", "", "item", "Lcom/tencent/mm/protocal/protobuf/CmdItem;", "h", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "processStoryCommentDel", "processStoryPost", "processStoryPostDel", "securityLimitCount", "securityVerificationChecked", "Lcom/tencent/mm/modelbase/NetSceneBase$SecurityCheckStatus;", "Companion", "RespHandler", "plugin-story_release"})
public final class i extends m
  implements com.tencent.mm.network.k
{
  private static final String TAG = "MicroMsg.StoryCgi.NetSceneStorySync";
  private static final LinkedList<Object> rUW;
  public static final i.a rUX;
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  private i.b rUU;
  private final int rUV;

  static
  {
    AppMethodBeat.i(109253);
    rUX = new i.a((byte)0);
    TAG = "MicroMsg.StoryCgi.NetSceneStorySync";
    rUW = new LinkedList();
    AppMethodBeat.o(109253);
  }

  public i()
  {
    AppMethodBeat.i(109252);
    this.rUU = new i.b(this);
    this.rUV = 10;
    Object localObject = new com.tencent.mm.ai.b.a();
    ((com.tencent.mm.ai.b.a)localObject).a((com.tencent.mm.bt.a)new cez());
    ((com.tencent.mm.ai.b.a)localObject).b((com.tencent.mm.bt.a)new cfa());
    ((com.tencent.mm.ai.b.a)localObject).qq("/cgi-bin/micromsg-bin/mmstorysync");
    ((com.tencent.mm.ai.b.a)localObject).kU(513);
    ((com.tencent.mm.ai.b.a)localObject).kV(0);
    ((com.tencent.mm.ai.b.a)localObject).kW(0);
    localObject = ((com.tencent.mm.ai.b.a)localObject).acD();
    a.f.b.j.o(localObject, "builder.buildInstance()");
    this.ehh = ((com.tencent.mm.ai.b)localObject);
    localObject = this.ehh.acz();
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
      AppMethodBeat.o(109252);
      throw ((Throwable)localObject);
    }
    ((cez)localObject).vTN = 128;
    AppMethodBeat.o(109252);
  }

  public static boolean c(tb paramtb, ak paramak)
  {
    AppMethodBeat.i(109245);
    a.f.b.j.p(paramtb, "item");
    a.f.b.j.p(paramak, "h");
    Object localObject1;
    boolean bool;
    try
    {
      localObject1 = new com/tencent/mm/protocal/protobuf/cex;
      ((cex)localObject1).<init>();
      paramtb = paramtb.wau;
      a.f.b.j.o(paramtb, "item.CmdBuf");
      paramtb = ((cex)localObject1).parseFrom(paramtb.getBuffer().toByteArray());
      if (paramtb == null)
      {
        paramtb = new a/v;
        paramtb.<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg");
        AppMethodBeat.o(109245);
        throw paramtb;
      }
    }
    catch (Exception paramtb)
    {
      ab.w(TAG, "StorySyncMsg parse error!");
      AppMethodBeat.o(109245);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramtb = (cex)paramtb;
      localObject1 = paramtb.xex.ndG;
      int i = paramtb.xex.pcX;
      long l = paramtb.vQE;
      Object localObject2 = n.rTi;
      a.f.b.j.o(localObject1, "username");
      com.tencent.mm.plugin.story.h.j localj = n.a.a((String)localObject1, l, i, paramtb.xex.xdJ, false);
      localObject2 = com.tencent.mm.plugin.story.model.k.rTc;
      com.tencent.mm.plugin.story.model.k.a((String)localObject1, localj);
      localObject1 = TAG;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("processStoryPost username:");
      localObject2 = ((StringBuilder)localObject2).append(paramtb.xex.ndG).append(" createTime:").append(paramtb.xex.pcX).append(" id:").append(paramtb.vQE).append(" scope:");
      if (localj != null)
      {
        paramtb = localj.cBR();
        if (paramtb == null);
      }
      for (paramtb = Integer.valueOf(paramtb.xeC); ; paramtb = null)
      {
        ab.i((String)localObject1, paramtb);
        paramtb = rUW.iterator();
        while (paramtb.hasNext())
          paramtb.next();
      }
      paramak.sendEmptyMessage(0);
      bool = true;
      AppMethodBeat.o(109245);
    }
  }

  public static boolean d(tb paramtb, ak paramak)
  {
    AppMethodBeat.i(109246);
    a.f.b.j.p(paramtb, "item");
    a.f.b.j.p(paramak, "h");
    Object localObject1;
    boolean bool;
    try
    {
      localObject1 = new com/tencent/mm/protocal/protobuf/cex;
      ((cex)localObject1).<init>();
      paramtb = paramtb.wau;
      a.f.b.j.o(paramtb, "item.CmdBuf");
      paramtb = ((cex)localObject1).parseFrom(paramtb.getBuffer().toByteArray());
      if (paramtb == null)
      {
        paramtb = new a/v;
        paramtb.<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg");
        AppMethodBeat.o(109246);
        throw paramtb;
      }
    }
    catch (Exception paramtb)
    {
      ab.w(TAG, "StorySyncMsg parse error!");
      bool = false;
      AppMethodBeat.o(109246);
    }
    while (true)
    {
      return bool;
      paramtb = (cex)paramtb;
      String str = paramtb.xex.ndG;
      int i = paramtb.xex.pcX;
      long l = paramtb.vQE;
      paramtb = n.rTi;
      a.f.b.j.o(str, "username");
      n.a.a(str, l, i, null, true);
      paramtb = n.rTi;
      com.tencent.mm.plugin.story.h.j localj = n.a.aaB(str);
      Object localObject2 = localj.cBR();
      paramtb = ((cfb)localObject2).xeA;
      if (paramtb != null)
      {
        paramtb = paramtb.wbK;
        if (paramtb != null)
        {
          paramtb = (cek)a.a.j.x((List)paramtb, 0);
          if (paramtb != null)
          {
            paramtb = paramtb.wEH;
            localObject1 = ((cfb)localObject2).xeA;
            if (localObject1 == null)
              break label442;
            localObject1 = ((cea)localObject1).wbK;
            if (localObject1 == null)
              break label442;
            localObject1 = (cek)a.a.j.x((List)localObject1, 0);
            if (localObject1 == null)
              break label442;
            localObject1 = ((cek)localObject1).Url;
            label240: localObject2 = ((cfb)localObject2).xeA;
            if (localObject2 == null)
              break label447;
            localObject2 = ((cea)localObject2).wbK;
            if (localObject2 == null)
              break label447;
            localObject2 = (cek)a.a.j.x((List)localObject2, 0);
            if (localObject2 == null)
              break label447;
          }
        }
      }
      label442: label447: for (float f = ((cek)localObject2).duration; ; f = 0.0F)
      {
        localObject2 = com.tencent.mm.plugin.story.model.k.rTc;
        com.tencent.mm.plugin.story.model.k.a(str, localj.field_storyID, localj.field_createTime, paramtb, (String)localObject1, ()(f * 1000.0F));
        localObject1 = TAG;
        paramtb = new java/lang/StringBuilder;
        paramtb.<init>("processStoryPostDel username:");
        ab.i((String)localObject1, str + " createTime:" + i + " id:" + l + " lastCreateTime:" + localj.field_createTime + " lastId:" + localj.field_storyID + "   ulonglong " + com.tencent.mm.ab.b.fe(l));
        paramtb = rUW.iterator();
        while (paramtb.hasNext())
          paramtb.next();
        paramtb = null;
        break;
        localObject1 = null;
        break label240;
      }
      paramak.sendEmptyMessage(0);
      bool = true;
      AppMethodBeat.o(109246);
    }
  }

  public static boolean e(tb paramtb, ak paramak)
  {
    AppMethodBeat.i(109247);
    a.f.b.j.p(paramtb, "item");
    a.f.b.j.p(paramak, "h");
    Object localObject1;
    boolean bool;
    try
    {
      localObject1 = new com/tencent/mm/protocal/protobuf/cex;
      ((cex)localObject1).<init>();
      paramtb = paramtb.wau;
      a.f.b.j.o(paramtb, "item.CmdBuf");
      paramtb = ((cex)localObject1).parseFrom(paramtb.getBuffer().toByteArray());
      if (paramtb == null)
      {
        paramtb = new a/v;
        paramtb.<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg");
        AppMethodBeat.o(109247);
        throw paramtb;
      }
    }
    catch (Exception paramtb)
    {
      ab.w(TAG, "StorySyncMsg parse error!");
      AppMethodBeat.o(109247);
      bool = false;
    }
    while (true)
    {
      return bool;
      localObject1 = (cex)paramtb;
      Object localObject2 = ((cex)localObject1).xex.ndG;
      int i = ((cex)localObject1).xex.pcX;
      long l = ((cex)localObject1).vQE;
      Object localObject3 = TAG;
      paramtb = new java/lang/StringBuilder;
      paramtb.<init>("processStoryComment username:");
      ab.i((String)localObject3, (String)localObject2 + " createTime:" + i + " id:" + l + " ulonglong " + com.tencent.mm.ab.b.fe(l));
      paramtb = com.tencent.mm.plugin.story.model.b.b.rVw;
      a.f.b.j.p(localObject1, "syncMsg");
      paramtb = com.tencent.mm.plugin.story.model.b.b.TAG;
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>("addSyncComment ");
      ab.i(paramtb, ((cex)localObject1).vQE + ' ' + ((cex)localObject1).xex.wZG + ' ' + ((cex)localObject1).xex.pcX);
      localObject3 = new a/f/b/u$c;
      ((u.c)localObject3).<init>();
      paramtb = com.tencent.mm.plugin.story.model.j.rST;
      ((u.c)localObject3).AVE = j.a.cxW().lr(((cex)localObject1).xex.vQE);
      if ((com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE == null)
      {
        paramtb = new com/tencent/mm/plugin/story/h/c;
        paramtb.<init>();
        ((u.c)localObject3).AVE = paramtb;
        ((com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE).field_storyId = ((cex)localObject1).vQE;
      }
      com.tencent.mm.plugin.story.model.b.b.a((cex)localObject1);
      if (((com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE).field_readCommentTime == 0)
      {
        if (!bo.isNullOrNil(((cex)localObject1).xex.ncM))
          break label637;
        paramtb = ((cex)localObject1).xex.xdJ.xeq;
        a.f.b.j.o(paramtb, "bubbleList");
        paramtb = (cdv)a.a.j.x((List)paramtb, paramtb.size() - 2);
        if (paramtb == null)
          break label632;
        paramtb = Integer.valueOf(paramtb.pcX);
        localObject2 = (com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE;
        if (paramtb == null)
          break label696;
      }
      label696: for (i = paramtb.intValue(); ; i = 1)
      {
        ((com.tencent.mm.plugin.story.h.c)localObject2).field_readCommentTime = i;
        localObject2 = (com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE;
        paramtb = ((cex)localObject1).xex.ndG;
        a.f.b.j.o(paramtb, "syncMsg.SyncMsgDetail.FromUserName");
        ((com.tencent.mm.plugin.story.h.c)localObject2).aaS(paramtb);
        paramtb = (com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE;
        localObject2 = ((cex)localObject1).xex.xdJ.jBB;
        a.f.b.j.o(localObject2, "syncMsg.SyncMsgDetail.StoryObject.UserName");
        paramtb.aaG((String)localObject2);
        ((com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE).field_syncCommentId = ((cex)localObject1).xex.wZG;
        ((com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE).field_syncCommentTime = ((cex)localObject1).xex.pcX;
        localObject1 = (com.tencent.mm.plugin.story.h.c)((u.c)localObject3).AVE;
        i = ((com.tencent.mm.plugin.story.h.c)localObject1).field_commentFlag;
        paramtb = a.b.sdo;
        ((com.tencent.mm.plugin.story.h.c)localObject1).field_commentFlag = (i | a.b.cBt());
        paramtb = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxW().a((com.tencent.mm.sdk.e.c)((u.c)localObject3).AVE);
        paramtb = new com/tencent/mm/plugin/story/model/b/b$a;
        paramtb.<init>((u.c)localObject3);
        com.tencent.mm.ab.b.a((a.f.a.a)paramtb);
        paramtb = rUW.iterator();
        while (paramtb.hasNext())
          paramtb.next();
        label632: paramtb = null;
        break;
        label637: paramtb = ((cex)localObject1).xex.xdJ.xeo;
        a.f.b.j.o(paramtb, "commentList");
        paramtb = (cdv)a.a.j.x((List)paramtb, paramtb.size() - 2);
        if (paramtb != null)
        {
          i = paramtb.pcX;
          paramtb = Integer.valueOf(i);
          break;
        }
        paramtb = null;
        break;
      }
      paramak.sendEmptyMessage(0);
      AppMethodBeat.o(109247);
      bool = true;
    }
  }

  public static boolean f(tb paramtb, ak paramak)
  {
    AppMethodBeat.i(109248);
    a.f.b.j.p(paramtb, "item");
    a.f.b.j.p(paramak, "h");
    Object localObject;
    boolean bool;
    try
    {
      localObject = new com/tencent/mm/protocal/protobuf/cex;
      ((cex)localObject).<init>();
      paramtb = paramtb.wau;
      a.f.b.j.o(paramtb, "item.CmdBuf");
      paramtb = ((cex)localObject).parseFrom(paramtb.getBuffer().toByteArray());
      if (paramtb == null)
      {
        paramtb = new a/v;
        paramtb.<init>("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncMsg");
        AppMethodBeat.o(109248);
        throw paramtb;
      }
    }
    catch (Exception paramtb)
    {
      ab.w(TAG, "StorySyncMsg parse error!");
      AppMethodBeat.o(109248);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramtb = (cex)paramtb;
      String str1 = paramtb.xex.ndG;
      int i = paramtb.xex.pcX;
      long l = paramtb.vQE;
      String str2 = TAG;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("processStoryCommentDel username:");
      ab.i(str2, str1 + " createTime:" + i + " id:" + l);
      localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
      a.f.b.j.p(paramtb, "syncMsg");
      str1 = com.tencent.mm.plugin.story.model.b.b.TAG;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("delSyncComment ");
      ab.i(str1, paramtb.vQE + ' ' + paramtb.xex.wZG);
      com.tencent.mm.plugin.story.model.b.b.g(paramtb.xex.vQE, paramtb.xex.wZG, paramtb.xex.ncM);
      com.tencent.mm.plugin.story.model.b.b.ld(paramtb.xex.vQE);
      paramtb = rUW.iterator();
      while (paramtb.hasNext())
        paramtb.next();
      paramak.sendEmptyMessage(0);
      bool = true;
      AppMethodBeat.o(109248);
    }
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(109250);
    a.f.b.j.p(parame, "dispatcher");
    a.f.b.j.p(paramf, "callback");
    Object localObject1 = g.RP();
    a.f.b.j.o(localObject1, "MMKernel.storage()");
    Object localObject2 = bo.anf(bo.nullAsNil((String)((com.tencent.mm.kernel.e)localObject1).Ry().get(8195)));
    localObject1 = new SKBuiltinBuffer_t();
    ((SKBuiltinBuffer_t)localObject1).setBuffer((byte[])localObject2);
    localObject2 = this.ehh.acz();
    if (localObject2 == null)
    {
      parame = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
      AppMethodBeat.o(109250);
      throw parame;
    }
    ((cez)localObject2).vTO = ((SKBuiltinBuffer_t)localObject1);
    this.ehi = paramf;
    int i = a(parame, (q)this.ehh, (com.tencent.mm.network.k)this);
    AppMethodBeat.o(109250);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(109251);
    ab.d(TAG, "netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      paramq = this.ehi;
      if (paramq == null)
        a.f.b.j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109251);
    }
    cfa localcfa;
    while (true)
    {
      return;
      paramq = this.ehh.acA();
      if (paramq == null)
      {
        paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
        AppMethodBeat.o(109251);
        throw paramString;
      }
      localcfa = (cfa)paramq;
      paramq = localcfa.vTR;
      if (paramq != null)
      {
        paramArrayOfByte = paramq.jBw;
        paramq = paramArrayOfByte;
        if (paramArrayOfByte != null);
      }
      else
      {
        paramq = new LinkedList();
      }
      if (paramq.size() <= 0)
        break;
      paramString = this.rUU;
      a.f.b.j.p(paramq, "cmdList");
      paramString.mgm = paramq;
      paramString.mgn.sendEmptyMessage(0);
      AppMethodBeat.o(109251);
    }
    if (localcfa.vTO != null)
    {
      paramq = localcfa.vTO;
      a.f.b.j.o(paramq, "resp.KeyBuf");
      if (paramq.getBuffer() != null)
      {
        paramq = localcfa.vTO;
        a.f.b.j.o(paramq, "resp.KeyBuf");
        paramArrayOfByte = paramq.getBuffer().toByteArray();
        paramq = this.ehh.acz();
        if (paramq == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
          AppMethodBeat.o(109251);
          throw paramString;
        }
        paramArrayOfByte = aa.j(((cez)paramq).vTO.getBuffer().toByteArray(), paramArrayOfByte);
        if (paramArrayOfByte != null)
        {
          if (paramArrayOfByte.length != 0)
            break label438;
          paramInt1 = 1;
          label358: if (paramInt1 != 0)
            break label443;
        }
      }
    }
    label438: label443: for (paramInt1 = 1; ; paramInt1 = 0)
    {
      if (paramInt1 != 0)
      {
        paramq = g.RP();
        a.f.b.j.o(paramq, "MMKernel.storage()");
        paramq.Ry().set(8195, bo.cd(paramArrayOfByte));
      }
      paramq = this.ehi;
      if (paramq == null)
        a.f.b.j.avw("callback");
      paramq.onSceneEnd(paramInt2, paramInt3, paramString, (m)this);
      AppMethodBeat.o(109251);
      break;
      paramInt1 = 0;
      break label358;
    }
  }

  public final int acn()
  {
    return this.rUV;
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final void cyY()
  {
    AppMethodBeat.i(109249);
    Object localObject1 = this.ehh.acA();
    if (localObject1 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
      AppMethodBeat.o(109249);
      throw ((Throwable)localObject1);
    }
    localObject1 = (cfa)localObject1;
    Object localObject2 = this.ehh.acz();
    if (localObject2 == null)
    {
      localObject1 = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
      AppMethodBeat.o(109249);
      throw ((Throwable)localObject1);
    }
    localObject2 = (cez)localObject2;
    Object localObject3 = ((cfa)localObject1).vTO.getBuffer().toByteArray();
    byte[] arrayOfByte = aa.j(((cez)localObject2).vTO.getBuffer().toByteArray(), (byte[])localObject3);
    if ((arrayOfByte != null) && (arrayOfByte.length > 0))
    {
      localObject3 = g.RP();
      a.f.b.j.o(localObject3, "MMKernel.storage()");
      ((com.tencent.mm.kernel.e)localObject3).Ry().set(8195, bo.cd(arrayOfByte));
    }
    ((cez)localObject2).vTO.setBuffer(arrayOfByte);
    if ((((cfa)localObject1).vQe & ((cez)localObject2).vTN) == 0)
    {
      localObject1 = this.ehi;
      if (localObject1 == null)
        a.f.b.j.avw("callback");
      ((f)localObject1).onSceneEnd(0, 0, "", (m)this);
      AppMethodBeat.o(109249);
    }
    while (true)
    {
      return;
      localObject2 = acL();
      a.f.b.j.o(localObject2, "dispatcher()");
      localObject1 = this.ehi;
      if (localObject1 == null)
        a.f.b.j.avw("callback");
      a((com.tencent.mm.network.e)localObject2, (f)localObject1);
      AppMethodBeat.o(109249);
    }
  }

  public final int getType()
  {
    return 513;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.a.i
 * JD-Core Version:    0.6.2
 */