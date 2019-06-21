package com.tencent.mm.plugin.story.model.b;

import a.f.a.r;
import a.f.b.u.c;
import a.l;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.api.h;
import com.tencent.mm.plugin.story.model.i;
import com.tencent.mm.plugin.story.model.i.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.protocal.protobuf.cdu;
import com.tencent.mm.protocal.protobuf.cdv;
import com.tencent.mm.protocal.protobuf.cdw;
import com.tencent.mm.protocal.protobuf.cdy;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cex;
import com.tencent.mm.protocal.protobuf.cey;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/comment/StoryCommentLogic;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "Lcom/tencent/mm/plugin/story/api/IStoryComment;", "()V", "CacheFilePath", "", "MaxCacheSize", "", "MaxRetryCount", "StateDeleted", "StateDeleting", "StateNone", "StatePosted", "StatePosting", "TAG", "commentCache", "Lcom/tencent/mm/protocal/protobuf/StoryCommentCache;", "getCommentCache", "()Lcom/tencent/mm/protocal/protobuf/StoryCommentCache;", "commentChangeListeners", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/story/api/IStoryComment$CommentChangeListener;", "currentCommentOp", "Lcom/tencent/mm/protocal/protobuf/StoryCommentOp;", "currentPostCommentItem", "Lcom/tencent/mm/plugin/story/model/comment/StoryCommentItem;", "opIndex", "storyCommentChangeListeners", "Ljava/util/ArrayList;", "Lkotlin/Function4;", "", "", "", "Lkotlin/collections/ArrayList;", "addCommentChangeListener", "listener", "addStoryCommentChangeListener", "addSyncComment", "syncMsg", "Lcom/tencent/mm/protocal/protobuf/StorySyncMsg;", "delSyncComment", "deleteComment", "storyId", "commentId", "sessionId", "content", "deleteCommentToRemote", "commentOp", "deleteCommentToStoryInfo", "destroy", "init", "initCommentSync", "commentItem", "onSceneEnd", "errType", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "opToDetail", "Lcom/tencent/mm/protocal/protobuf/StoryCommentDetail;", "postBubble", "toUsername", "doubleClick", "storyOwner", "postComment", "replyCommentId", "postCommentOrBubble", "enhance", "postCommentToRemote", "removeCommentChangeListener", "removeStoryCommentChangeListener", "saveCommentToStoryInfo", "commentDetail", "saveCommentToStoryInfoWithObj", "setAllCommentRead", "setCommentRead", "syncMsgToDetail", "tryStart", "updateCommentRead", "hasUnread", "force", "updateLastCommentSync", "updateStoryInfoByComment", "storyObj", "Lcom/tencent/mm/protocal/protobuf/StoryObject;", "writeCacheToFile", "plugin-story_release"})
public final class b
  implements f, h
{
  public static final String TAG = "MicroMsg.StoryCommentLogic";
  private static final int mzJ = 2147483647;
  public static final String rVo;
  private static final int rVp = 50;
  public static final cdu rVq;
  private static cdw rVr;
  private static a rVs;
  private static int rVt;
  private static final ArrayList<r<Long, Boolean, String, String, y>> rVu;
  private static final LinkedList<Object> rVv;
  public static final b rVw;

  static
  {
    AppMethodBeat.i(109281);
    rVw = new b();
    StringBuilder localStringBuilder = new StringBuilder();
    i.a locala = i.rSv;
    rVo = i.cxJ() + "commentCache.proto";
    rVp = 50;
    mzJ = 2147483647;
    TAG = "MicroMsg.StoryCommentLogic";
    rVq = new cdu();
    rVt = -1;
    rVu = new ArrayList();
    rVv = new LinkedList();
    AppMethodBeat.o(109281);
  }

  public static void M(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(109274);
    boolean bool = com.tencent.mm.x.c.PK().bX(352279, 266241);
    ab.i(TAG, "updateCommentRead: " + bool + ", " + paramBoolean1);
    if ((bool != paramBoolean1) || (paramBoolean2))
      com.tencent.mm.ab.b.a((a.f.a.a)new b.i(paramBoolean1));
    AppMethodBeat.o(109274);
  }

  public static a a(long paramLong, String paramString1, String paramString2, boolean paramBoolean, String paramString3, String paramString4, int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(138761);
    Object localObject1 = new StringBuilder();
    Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cnk() + bo.yz();
    localObject2 = a.k.d.UTF_8;
    if (localObject1 == null)
    {
      paramString1 = new v("null cannot be cast to non-null type java.lang.String");
      AppMethodBeat.o(138761);
      throw paramString1;
    }
    localObject2 = ((String)localObject1).getBytes((Charset)localObject2);
    a.f.b.j.o(localObject2, "(this as java.lang.String).getBytes(charset)");
    localObject1 = com.tencent.xweb.util.d.x((byte[])localObject2);
    localObject2 = new cdw();
    ((cdw)localObject2).clientId = ((String)localObject1);
    ((cdw)localObject2).rUJ = paramLong;
    ((cdw)localObject2).content = paramString2;
    paramString2 = com.tencent.mm.plugin.story.model.j.rST;
    ((cdw)localObject2).cEV = j.a.cnk();
    ((cdw)localObject2).toUser = paramString1;
    ((cdw)localObject2).fDG = cb.aaF();
    ((cdw)localObject2).state = 1;
    ((cdw)localObject2).xdD = 0;
    if (paramBoolean);
    while (true)
    {
      ((cdw)localObject2).xdE = i;
      ((cdw)localObject2).cvF = paramString3;
      ((cdw)localObject2).rVl = paramString4;
      ((cdw)localObject2).rVm = paramInt;
      rVq.xdx.add(localObject2);
      rVs = new a((cdw)localObject2);
      col();
      paramString1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().post((Runnable)new f((cdw)localObject2));
      paramString1 = rVs;
      if (paramString1 == null)
        a.f.b.j.dWJ();
      AppMethodBeat.o(138761);
      return paramString1;
      i = 0;
    }
  }

  private static cdv a(cdw paramcdw)
  {
    AppMethodBeat.i(109277);
    cdv localcdv = new cdv();
    localcdv.vQE = paramcdw.rUJ;
    localcdv.wZG = paramcdw.rVd;
    localcdv.ndG = paramcdw.cEV;
    localcdv.ndF = paramcdw.toUser;
    localcdv.ncM = paramcdw.content;
    localcdv.pcX = paramcdw.fDG;
    localcdv.xdB = paramcdw.xdD;
    localcdv.xdC = paramcdw.xdE;
    localcdv.wZF = paramcdw.rVm;
    AppMethodBeat.o(109277);
    return localcdv;
  }

  public static void a(long paramLong, a parama)
  {
    AppMethodBeat.i(109272);
    a.f.b.j.p(parama, "commentItem");
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    com.tencent.mm.plugin.story.h.c localc = j.a.cxW().lr(paramLong);
    localObject = localc;
    if (localc == null)
    {
      localObject = new com.tencent.mm.plugin.story.h.c();
      ((com.tencent.mm.plugin.story.h.c)localObject).field_storyId = paramLong;
    }
    ((com.tencent.mm.plugin.story.h.c)localObject).field_readCommentId = parama.rVd;
    ((com.tencent.mm.plugin.story.h.c)localObject).field_readCommentTime = parama.fDG;
    parama = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxW().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    AppMethodBeat.o(109272);
  }

  public static void a(r<? super Long, ? super Boolean, ? super String, ? super String, y> paramr)
  {
    AppMethodBeat.i(138758);
    a.f.b.j.p(paramr, "listener");
    if (!rVu.contains(paramr))
      rVu.add(paramr);
    AppMethodBeat.o(138758);
  }

  private static void a(cer paramcer)
  {
    AppMethodBeat.i(138762);
    Object localObject2;
    int i;
    if (paramcer != null)
    {
      Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject2 = j.a.cxT().lx(paramcer.vQE);
      localObject1 = localObject2;
      if (localObject2 == null)
        localObject1 = new com.tencent.mm.plugin.story.h.j();
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
      if (bo.isEqual(j.a.cnk(), paramcer.jBB))
      {
        localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
        i = com.tencent.mm.plugin.story.h.a.cAO();
        localObject2 = n.rTi;
        n.a.a((com.tencent.mm.plugin.story.h.j)localObject1, paramcer, i);
        AppMethodBeat.o(138762);
      }
    }
    while (true)
    {
      return;
      localObject2 = com.tencent.mm.plugin.story.h.a.sdm;
      i = com.tencent.mm.plugin.story.h.a.cAP();
      break;
      AppMethodBeat.o(138762);
    }
  }

  public static void a(cex paramcex)
  {
    AppMethodBeat.i(138763);
    cdv localcdv = new cdv();
    localcdv.vQE = paramcex.vQE;
    localcdv.wZG = paramcex.xex.wZG;
    localcdv.ndG = paramcex.xex.ndG;
    localcdv.ndF = paramcex.xex.ndF;
    localcdv.ncM = paramcex.xex.ncM;
    localcdv.pcX = paramcex.xex.pcX;
    localcdv.xdB = paramcex.xex.xdB;
    localcdv.wZF = paramcex.xex.wZF;
    long l = localcdv.vQE;
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxT().lx(l);
    if (localObject == null)
    {
      a(paramcex.xex.xdJ);
      AppMethodBeat.o(138763);
    }
    while (true)
    {
      return;
      cer localcer = new cer();
      try
      {
        localcer.parseFrom(((com.tencent.mm.plugin.story.h.j)localObject).field_attrBuf);
        Iterator localIterator;
        if (bo.isNullOrNil(localcdv.ncM))
          if (localcdv.wZG != 0)
          {
            paramcex = localcer.xeq;
            a.f.b.j.o(paramcex, "storyObj.BubbleList");
            localIterator = ((Iterable)paramcex).iterator();
            while (true)
              if (localIterator.hasNext())
              {
                paramcex = localIterator.next();
                if (((cdv)paramcex).wZG == localcdv.wZG)
                {
                  i = 1;
                  label236: if (i == 0)
                    continue;
                  label241: if ((cdv)paramcex != null)
                    break label481;
                  localcer.xeq.add(localcdv);
                  i = 1;
                  label261: if (i != 0)
                  {
                    localcer.xar = localcer.xeo.size();
                    localcer.xep = localcer.xeq.size();
                  }
                }
              }
          }
        try
        {
          ((com.tencent.mm.plugin.story.h.j)localObject).field_attrBuf = localcer.toByteArray();
          label302: paramcex = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cxT().a(l, (com.tencent.mm.plugin.story.h.j)localObject);
          AppMethodBeat.o(138763);
          continue;
          i = 0;
          break label236;
          paramcex = null;
          break label241;
          localcer.xeq.add(localcdv);
          i = 1;
          break label261;
          if (localcdv.wZG != 0)
          {
            paramcex = localcer.xeo;
            a.f.b.j.o(paramcex, "storyObj.CommentList");
            localIterator = ((Iterable)paramcex).iterator();
            label383: if (localIterator.hasNext())
            {
              paramcex = localIterator.next();
              if (((cdv)paramcex).wZG == localcdv.wZG)
              {
                i = 1;
                if (i == 0)
                  break label450;
              }
            }
            while (true)
            {
              label418: if ((cdv)paramcex != null)
                break label481;
              localcer.xeo.add(localcdv);
              i = 1;
              break;
              i = 0;
              break label418;
              label450: break label383;
              paramcex = null;
            }
          }
          localcer.xeo.add(localcdv);
          i = 1;
        }
        catch (Exception paramcex)
        {
          break label302;
        }
      }
      catch (Exception paramcex)
      {
        while (true)
        {
          continue;
          label481: int i = 0;
        }
      }
    }
  }

  public static void b(r<? super Long, ? super Boolean, ? super String, ? super String, y> paramr)
  {
    AppMethodBeat.i(138759);
    a.f.b.j.p(paramr, "listener");
    rVu.remove(paramr);
    AppMethodBeat.o(138759);
  }

  public static boolean b(long paramLong, a parama)
  {
    AppMethodBeat.i(109273);
    a.f.b.j.p(parama, "commentDetail");
    u.c localc = new u.c();
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    localc.AVE = j.a.cxW().lr(paramLong);
    if ((com.tencent.mm.plugin.story.h.c)localc.AVE == null)
    {
      localc.AVE = new com.tencent.mm.plugin.story.h.c();
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_storyId = paramLong;
    }
    boolean bool;
    if ((((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentId != parama.rVd) && (((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentTime < parama.fDG))
    {
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentId = parama.rVd;
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentTime = parama.fDG;
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).aaS(parama.cEV);
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).aaG(parama.rVl);
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).cBE();
      parama = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxW().c((com.tencent.mm.sdk.e.c)localc.AVE, new String[0]);
      com.tencent.mm.ab.b.a((a.f.a.a)new b.h(localc));
      bool = true;
      AppMethodBeat.o(109273);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(109273);
      bool = false;
    }
  }

  public static void col()
  {
    int i = 0;
    AppMethodBeat.i(109275);
    Object localObject1 = new ArrayList();
    int j = rVq.xdx.size();
    Object localObject2;
    for (int k = 0; k < j; k++)
    {
      localObject2 = (cdw)rVq.xdx.get(k);
      if (((((cdw)localObject2).state == 1) || (((cdw)localObject2).state == 3)) && (((cdw)localObject2).fDG > cb.aaF() - 86400))
        ((ArrayList)localObject1).add(localObject2);
    }
    rVq.xdx.clear();
    rVq.xdx.addAll((Collection)localObject1);
    rVt += 1;
    if (((ArrayList)localObject1).size() == 0)
    {
      rVt = -1;
      AppMethodBeat.o(109275);
    }
    while (true)
    {
      return;
      rVt %= ((ArrayList)localObject1).size();
      localObject2 = (Iterable)localObject1;
      localObject1 = (Collection)new ArrayList();
      Object localObject3 = ((Iterable)localObject2).iterator();
      k = 0;
      Object localObject4;
      if (((Iterator)localObject3).hasNext())
      {
        localObject2 = ((Iterator)localObject3).next();
        if (k < 0)
          a.a.j.dWs();
        localObject4 = (cdw)localObject2;
        if ((k >= rVt) && (((cdw)localObject4).retryCount < mzJ));
        for (j = 1; ; j = 0)
        {
          if (j != 0)
            ((Collection)localObject1).add(localObject2);
          k++;
          break;
        }
      }
      localObject1 = (cdw)a.a.j.fK((List)localObject1);
      if ((localObject1 != null) && (((cdw)localObject1).state == 1))
      {
        ab.i(TAG, "postCommentToRemote " + ((cdw)localObject1).toUser + ' ' + ((cdw)localObject1).rUJ + ' ' + ((cdw)localObject1).xdD + ' ' + ((cdw)localObject1).fDG);
        rVr = (cdw)localObject1;
        localObject2 = a((cdw)localObject1);
        localObject3 = (CharSequence)((cdv)localObject2).ncM;
        if (localObject3 != null)
        {
          k = i;
          if (((CharSequence)localObject3).length() != 0);
        }
        else
        {
          k = 1;
        }
        if (k != 0)
        {
          localObject3 = com.tencent.mm.plugin.story.g.e.sbS;
          com.tencent.mm.plugin.story.g.e.czZ();
        }
        while (true)
        {
          localObject3 = com.tencent.mm.kernel.g.RO();
          a.f.b.j.o(localObject3, "network()");
          localObject4 = ((com.tencent.mm.kernel.b)localObject3).Rg();
          localObject3 = ((cdw)localObject1).clientId;
          a.f.b.j.o(localObject3, "commentOp.clientId");
          ((p)localObject4).d((m)new com.tencent.mm.plugin.story.model.a.d((String)localObject3, (cdv)localObject2, ((cdw)localObject1).cvF, rVs));
          AppMethodBeat.o(109275);
          break;
          localObject3 = com.tencent.mm.plugin.story.g.e.sbS;
          com.tencent.mm.plugin.story.g.e.cAa();
        }
      }
      if ((localObject1 != null) && (((cdw)localObject1).state == 3))
      {
        ab.i(TAG, "deleteCommentToRemote " + ((cdw)localObject1).toUser + ' ' + ((cdw)localObject1).rUJ + ' ' + ((cdw)localObject1).rVd + ' ' + ((cdw)localObject1).fDG);
        rVr = (cdw)localObject1;
        localObject2 = new ArrayList();
        long l = ((cdw)localObject1).rUJ;
        localObject3 = com.tencent.mm.plugin.story.h.a.sdm;
        ((ArrayList)localObject2).add(new com.tencent.mm.plugin.story.model.a.k(l, com.tencent.mm.plugin.story.h.a.cBa(), ((cdw)localObject1).rVd));
        localObject1 = com.tencent.mm.kernel.g.RO();
        a.f.b.j.o(localObject1, "network()");
        ((com.tencent.mm.kernel.b)localObject1).Rg().d((m)new com.tencent.mm.plugin.story.model.a.g((List)localObject2, 0));
      }
      AppMethodBeat.o(109275);
    }
  }

  public static void cyZ()
  {
    AppMethodBeat.i(109268);
    byte[] arrayOfByte = rVq.toByteArray();
    com.tencent.mm.vfs.e.q(rVo, arrayOfByte);
    AppMethodBeat.o(109268);
  }

  public static void g(long paramLong, int paramInt, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(138764);
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cxT().lx(paramLong);
    if (localObject1 == null)
      AppMethodBeat.o(138764);
    while (true)
    {
      return;
      cer localcer = new cer();
      try
      {
        localcer.parseFrom(((com.tencent.mm.plugin.story.h.j)localObject1).field_attrBuf);
        label55: label85: int j;
        if (paramInt != 0)
        {
          paramString = localcer.xeo;
          a.f.b.j.o(paramString, "storyObj.CommentList");
          paramString = ((List)paramString).iterator();
          i = 0;
          if (paramString.hasNext())
            if (((cdv)paramString.next()).wZG == paramInt)
            {
              j = 1;
              label113: if (j == 0)
                break label187;
              label118: if (i != -1)
              {
                localcer.xeo.remove(i);
                localcer.xar = localcer.xeo.size();
              }
            }
        }
        try
        {
          ((com.tencent.mm.plugin.story.h.j)localObject1).field_attrBuf = localcer.toByteArray();
          label158: paramString = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cxT().a(paramLong, (com.tencent.mm.plugin.story.h.j)localObject1);
          AppMethodBeat.o(138764);
          continue;
          j = 0;
          break label113;
          label187: i++;
          break label85;
          i = -1;
          break label118;
          Object localObject2 = localcer.xeo;
          a.f.b.j.o(localObject2, "storyObj.CommentList");
          localObject2 = ((List)localObject2).iterator();
          paramInt = i;
          label229: if (((Iterator)localObject2).hasNext())
            if (!bo.isEqual(((cdv)((Iterator)localObject2).next()).ncM, paramString));
          while (true)
          {
            i = paramInt;
            break;
            paramInt++;
            break label229;
            paramInt = -1;
          }
        }
        catch (Exception paramString)
        {
          break label158;
        }
      }
      catch (Exception localException)
      {
        break label55;
      }
    }
  }

  public static void lc(long paramLong)
  {
    AppMethodBeat.i(138760);
    u.c localc = new u.c();
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localc.AVE = j.a.cxW().lr(paramLong);
    if ((com.tencent.mm.plugin.story.h.c)localc.AVE == null)
    {
      localc.AVE = new com.tencent.mm.plugin.story.h.c();
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_storyId = paramLong;
    }
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    com.tencent.mm.plugin.story.h.j localj = j.a.cxT().lx(paramLong);
    if (localj == null)
      AppMethodBeat.o(138760);
    while (true)
    {
      return;
      Object localObject2 = new cer();
      if (localj != null);
      try
      {
        localObject1 = localj.field_attrBuf;
        label106: ((cer)localObject2).parseFrom((byte[])localObject1);
        label113: localObject1 = ((cer)localObject2).xeo;
        a.f.b.j.o(localObject1, "storyObj.CommentList");
        localObject1 = (List)localObject1;
        localObject2 = ((List)localObject1).listIterator(((List)localObject1).size());
        label145: int i;
        if (((ListIterator)localObject2).hasPrevious())
        {
          localObject1 = ((ListIterator)localObject2).previous();
          if (((cdv)localObject1).wZG != 0)
          {
            i = 1;
            label176: if (i == 0)
              break label390;
          }
        }
        while (true)
        {
          localObject2 = (cdv)localObject1;
          if (localObject2 == null)
            break label397;
          if ((((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentId != ((cdv)localObject2).wZG) && (((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentTime < ((cdv)localObject2).pcX))
          {
            ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentId = ((cdv)localObject2).wZG;
            ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentTime = ((cdv)localObject2).pcX;
            localObject1 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
            localObject2 = ((cdv)localObject2).ndG;
            a.f.b.j.o(localObject2, "it.FromUserName");
            ((com.tencent.mm.plugin.story.h.c)localObject1).aaS((String)localObject2);
            com.tencent.mm.plugin.story.h.c localc1 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
            localObject2 = localj.field_userName;
            localObject1 = localObject2;
            if (localObject2 == null)
              localObject1 = "";
            localc1.aaG((String)localObject1);
            ((com.tencent.mm.plugin.story.h.c)localc.AVE).cBE();
            localObject1 = com.tencent.mm.plugin.story.model.j.rST;
            j.a.cxW().c((com.tencent.mm.sdk.e.c)localc.AVE, new String[0]);
            com.tencent.mm.ab.b.a((a.f.a.a)new b.g(localc, localj));
          }
          AppMethodBeat.o(138760);
          break;
          localObject1 = null;
          break label106;
          i = 0;
          break label176;
          label390: break label145;
          localObject1 = null;
        }
        label397: AppMethodBeat.o(138760);
      }
      catch (Exception localException)
      {
        break label113;
      }
    }
  }

  public static void ld(long paramLong)
  {
    String str = null;
    int i = 0;
    AppMethodBeat.i(138765);
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    com.tencent.mm.plugin.story.h.j localj = j.a.cxT().lx(paramLong);
    u.c localc = new u.c();
    localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cxW().lr(paramLong);
    if (localObject1 == null)
    {
      AppMethodBeat.o(138765);
      return;
    }
    localc.AVE = localObject1;
    if (localj == null)
    {
      ab.i(TAG, "updateLastCommentSync will reset to 0 0");
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentTime = 0;
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentId = 0;
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_syncCommentTime = 0;
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_syncCommentId = 0;
      ((com.tencent.mm.plugin.story.h.c)localc.AVE).aaS("");
    }
    while (true)
    {
      Object localObject2 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
      if (localj != null)
      {
        str = localj.field_userName;
        localObject1 = str;
        if (str != null);
      }
      else
      {
        localObject1 = "";
      }
      ((com.tencent.mm.plugin.story.h.c)localObject2).aaG((String)localObject1);
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cxW().a((com.tencent.mm.sdk.e.c)localc.AVE);
      com.tencent.mm.ab.b.a((a.f.a.a)new b.j(localc));
      AppMethodBeat.o(138765);
      break;
      localObject2 = new cer();
      try
      {
        ((cer)localObject2).parseFrom(localj.field_attrBuf);
        label249: localObject1 = ((cer)localObject2).xeo;
        a.f.b.j.o(localObject1, "storyObj.CommentList");
        localObject1 = (List)localObject1;
        localObject2 = ((List)localObject1).listIterator(((List)localObject1).size());
        label287: Object localObject3;
        if (((ListIterator)localObject2).hasPrevious())
        {
          localObject1 = ((ListIterator)localObject2).previous();
          localObject3 = (cdv)localObject1;
          if ((((cdv)localObject3).wZG != 0) && (((cdv)localObject3).pcX <= ((com.tencent.mm.plugin.story.h.c)localc.AVE).field_readCommentTime))
          {
            j = 1;
            label343: if (j == 0)
              break label600;
            label348: localObject2 = (cdv)localObject1;
            localObject3 = TAG;
            StringBuilder localStringBuilder = new StringBuilder("updateLastCommentSync will reset to ");
            if (localObject2 == null)
              break label608;
            localObject1 = Integer.valueOf(((cdv)localObject2).pcX);
            label387: localStringBuilder = localStringBuilder.append(localObject1).append(' ');
            localObject1 = str;
            if (localObject2 != null)
              localObject1 = Integer.valueOf(((cdv)localObject2).wZG);
            ab.i((String)localObject3, localObject1);
            localObject1 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
            if (localObject2 == null)
              break label614;
            j = ((cdv)localObject2).pcX;
            label456: ((com.tencent.mm.plugin.story.h.c)localObject1).field_readCommentTime = j;
            localObject1 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
            if (localObject2 == null)
              break label620;
            j = ((cdv)localObject2).wZG;
            label485: ((com.tencent.mm.plugin.story.h.c)localObject1).field_readCommentId = j;
            localObject1 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
            if (localObject2 == null)
              break label626;
          }
        }
        label600: label608: label614: label620: label626: for (int j = ((cdv)localObject2).pcX; ; j = 0)
        {
          ((com.tencent.mm.plugin.story.h.c)localObject1).field_syncCommentTime = j;
          localObject1 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
          j = i;
          if (localObject2 != null)
            j = ((cdv)localObject2).wZG;
          ((com.tencent.mm.plugin.story.h.c)localObject1).field_syncCommentId = j;
          localObject3 = (com.tencent.mm.plugin.story.h.c)localc.AVE;
          if (localObject2 != null)
          {
            str = ((cdv)localObject2).ndG;
            localObject1 = str;
            if (str != null);
          }
          else
          {
            localObject1 = "";
          }
          ((com.tencent.mm.plugin.story.h.c)localObject3).aaS((String)localObject1);
          break;
          j = 0;
          break label343;
          break label287;
          localObject1 = null;
          break label348;
          localObject1 = null;
          break label387;
          j = 0;
          break label456;
          j = 0;
          break label485;
        }
      }
      catch (Exception localException)
      {
        break label249;
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    long l = 100L;
    int i = 0;
    AppMethodBeat.i(109280);
    a.f.b.j.p(paramm, "scene");
    int j = paramm.getType();
    ab.i(TAG, "onSceneEnd " + paramInt1 + ", " + paramInt2 + ", " + paramString + ", " + j);
    if (j == 354)
    {
      paramString = ((com.tencent.mm.plugin.story.model.a.d)paramm).ehh.acA();
      if (paramString == null)
      {
        paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryCommentResponse");
        AppMethodBeat.o(109280);
        throw paramString;
      }
      localObject = (cdy)paramString;
      paramm = ((com.tencent.mm.plugin.story.model.a.d)paramm).rUN;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        String str = TAG;
        StringBuilder localStringBuilder = new StringBuilder("post comment success ");
        paramString = rVr;
        if (paramString != null);
        for (paramString = paramString.content; ; paramString = null)
        {
          ab.i(str, paramString + ' ' + ((cdy)localObject).wZG);
          paramString = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cno().post((Runnable)new b.c((cdy)localObject));
          if (paramm != null)
            paramm.rVd = ((cdy)localObject).wZG;
          paramString = rVr;
          if (paramString != null)
            paramString.rVd = ((cdy)localObject).wZG;
          paramString = rVr;
          if (paramString != null)
            paramString.state = 2;
          rVr = null;
          l = 100L;
          paramString = com.tencent.mm.plugin.story.model.j.rST;
          j.a.cno().postDelayed((Runnable)b.d.rVC, l);
          AppMethodBeat.o(109280);
          return;
        }
      }
      localObject = TAG;
      paramm = new StringBuilder("post comment fail ");
      paramString = rVr;
      if (paramString != null)
      {
        paramString = paramString.content;
        label342: ab.i((String)localObject, paramString);
        paramString = rVr;
        paramInt2 = i;
        if (paramString != null)
          paramInt2 = paramString.retryCount;
        if (paramInt1 != 4)
          break label409;
        paramString = rVr;
        if (paramString != null)
          paramString.retryCount = mzJ;
      }
      while (true)
      {
        rVr = null;
        l = 300000L;
        break;
        paramString = null;
        break label342;
        label409: paramString = rVr;
        if (paramString != null)
          paramString.retryCount = (paramInt2 + 1);
      }
    }
    if ((j == 764) && ((((com.tencent.mm.plugin.story.model.a.g)paramm).cyX() instanceof com.tencent.mm.plugin.story.model.a.k)))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label551;
      localObject = TAG;
      paramm = new StringBuilder("delete comment success ");
      paramString = rVr;
      if (paramString == null)
        break label546;
    }
    label546: for (paramString = paramString.content; ; paramString = null)
    {
      ab.i((String)localObject, paramString);
      paramString = rVr;
      if (paramString != null)
        paramString.state = 4;
      rVr = null;
      paramString = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cno().postDelayed((Runnable)b.e.rVD, l);
      AppMethodBeat.o(109280);
      break;
    }
    label551: Object localObject = TAG;
    paramm = new StringBuilder("delete comment fail ");
    paramString = rVr;
    if (paramString != null)
    {
      paramString = paramString.content;
      label581: ab.i((String)localObject, paramString);
      paramString = rVr;
      if (paramString == null)
        break label645;
      paramInt2 = paramString.retryCount;
      label608: if (paramInt1 != 4)
        break label650;
      paramString = rVr;
      if (paramString != null)
        paramString.retryCount = mzJ;
    }
    while (true)
    {
      rVr = null;
      l = 60000L;
      break;
      paramString = null;
      break label581;
      label645: paramInt2 = 0;
      break label608;
      label650: paramString = rVr;
      if (paramString != null)
        paramString.retryCount = (paramInt2 + 1);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class f
    implements Runnable
  {
    f(cdw paramcdw)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(109265);
      b localb = b.rVw;
      b.a(b.b(this.rVE));
      AppMethodBeat.o(109265);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.b.b
 * JD-Core Version:    0.6.2
 */