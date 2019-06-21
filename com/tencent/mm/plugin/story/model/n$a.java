package com.tencent.mm.plugin.story.model;

import a.k.d;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.h.a;
import com.tencent.mm.plugin.story.h.a.a;
import com.tencent.mm.plugin.story.h.h;
import com.tencent.mm.plugin.story.h.i;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cer;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryInfoStorageLogic$Companion;", "", "()V", "TAG", "", "cancelDeleteStory", "", "deleteByUsername", "", "username", "deleteDiedStoryByTime", "deleteLocalStory", "localId", "deleteRemoteStory", "storyId", "", "deleteStoryByIdBefore", "", "userName", "deleteStoryByTimeBefore", "timeStamp", "getLastStory", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "getMergeStoryObjectWithCache", "Lcom/tencent/mm/protocal/protobuf/StoryObject;", "info", "insertStoryForHistory", "storyObj", "sourceType", "insertStoryList", "Ljava/util/LinkedList;", "list", "", "isStoryExist", "isValidStoryId", "loadFavStoryFromRemote", "replace", "storyInfo", "replaceForHistory", "setStoryFavLocal", "favorite", "setStoryFavRemote", "setStoryPrivacyLocal", "visibility", "setStoryPrivacyRemote", "privacy", "deprecated", "updateNextAlbumSourceType", "date", "updateStoryBySync", "createTime", "isDelete", "plugin-story_release"})
public final class n$a
{
  public static void D(long paramLong, int paramInt)
  {
    AppMethodBeat.i(109122);
    ab.d(n.access$getTAG$cp(), "delete story item: " + paramInt + ' ' + paramLong);
    ArrayList localArrayList = new ArrayList();
    Object localObject = a.sdm;
    localArrayList.add(new com.tencent.mm.plugin.story.model.a.m(paramLong, a.cAZ()));
    localObject = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject, "MMKernel.network()");
    ((com.tencent.mm.kernel.b)localObject).Rg().d((com.tencent.mm.ai.m)new com.tencent.mm.plugin.story.model.a.g((List)localArrayList, paramInt));
    AppMethodBeat.o(109122);
  }

  public static void EL(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(109123);
    Object localObject2 = j.rST;
    Object localObject3 = j.a.cxT().Fe(paramInt);
    localObject2 = com.tencent.mm.plugin.story.e.b.rRO;
    if (localObject3 != null);
    Object localObject4;
    h localh;
    for (localObject2 = Integer.valueOf(((com.tencent.mm.plugin.story.h.j)localObject3).field_createTime); ; localObject2 = null)
    {
      localObject4 = b.a.j((Integer)localObject2);
      localObject2 = j.rST;
      j.a.cxT().DL(paramInt);
      localObject2 = j.rST;
      localh = j.a.cxZ().aaZ((String)localObject4);
      if (localh == null)
        break label178;
      localh.field_count -= 1;
      if (localh.field_count > 0)
        break;
      localObject2 = j.rST;
      localObject2 = j.a.cxZ();
      a.f.b.j.p(localObject4, "date");
      ((i)localObject2).bSd.delete(i.sdP, "date=?", new String[] { String.valueOf(localObject4) });
      AppMethodBeat.o(109123);
      return;
    }
    localObject2 = localObject1;
    if (localObject3 != null)
      localObject2 = ((com.tencent.mm.plugin.story.h.j)localObject3).field_userName;
    if ((localObject2 == null) || (localObject4 == null));
    while (true)
    {
      localObject2 = j.rST;
      j.a.cxZ().a(localh);
      label178: AppMethodBeat.o(109123);
      break;
      localObject1 = j.rST;
      localObject1 = j.a.cxT();
      localObject3 = com.tencent.mm.plugin.story.e.b.rRO;
      localObject2 = ((k)localObject1).dm((String)localObject2, b.a.aah((String)localObject4));
      if (!((List)localObject2).isEmpty())
      {
        localObject4 = (com.tencent.mm.plugin.story.h.j)((List)localObject2).get(0);
        localObject1 = a.sdm;
        ((com.tencent.mm.plugin.story.h.j)localObject4).DF(a.cAQ());
        localObject1 = j.rST;
        j.a.cxT().a((int)((com.tencent.mm.plugin.story.h.j)((List)localObject2).get(0)).xDa, (com.tencent.mm.plugin.story.h.j)((List)localObject2).get(0));
        ab.d(n.access$getTAG$cp(), "update " + (int)((com.tencent.mm.plugin.story.h.j)((List)localObject2).get(0)).xDa + "'s sourceType to " + ((com.tencent.mm.plugin.story.h.j)((List)localObject2).get(0)).field_sourceType + ' ');
      }
    }
  }

  public static long a(com.tencent.mm.plugin.story.h.j paramj, cer paramcer, int paramInt)
  {
    AppMethodBeat.i(138748);
    a.f.b.j.p(paramj, "storyInfo");
    a.f.b.j.p(paramcer, "storyObj");
    long l;
    if ((paramcer.xen == null) || (paramcer.xen.getBuffer() == null))
    {
      ab.i(n.access$getTAG$cp(), "object desc is null");
      l = paramcer.vQE;
      AppMethodBeat.o(138748);
    }
    Object localObject1;
    while (true)
    {
      return l;
      localObject1 = paramcer.xen.getBuffer().toByteArray();
      a.f.b.j.o(localObject1, "storyObj.ObjDesc.getBuffer().toByteArray()");
      localObject1 = new String((byte[])localObject1, d.UTF_8);
      ab.d(n.access$getTAG$cp(), "from server %d \n%s", new Object[] { Long.valueOf(paramcer.vQE), localObject1 });
      Object localObject2 = q.rTk;
      localObject2 = q.a.aaE((String)localObject1);
      if ((bo.isNullOrNil((String)localObject1)) || (localObject2 == null))
      {
        l = paramcer.vQE;
        AppMethodBeat.o(138748);
      }
      else
      {
        if (paramj.c((cfb)localObject2))
          break;
        l = paramcer.vQE;
        AppMethodBeat.o(138748);
      }
    }
    ab.d(n.access$getTAG$cp(), "from server xml ok %d \n ".concat(String.valueOf(localObject1)), new Object[] { Long.valueOf(paramcer.vQE) });
    paramcer.xen.setBuffer(new byte[0]);
    paramj.field_userName = paramcer.jBB;
    paramj.field_createTime = paramcer.pcX;
    paramj.field_storyID = paramcer.vQE;
    paramj.field_attrBuf = paramcer.toByteArray();
    if (paramcer.xer == 1)
    {
      localObject1 = a.sdm;
      paramj.Fc(a.cBm());
      label277: if (paramcer.xek != 1)
        break label403;
      localObject1 = a.sdm;
      paramj.Fc(a.cBn());
    }
    while (true)
    {
      paramj.field_favoriteTime = paramcer.xes;
      paramj.DF(paramInt);
      localObject1 = paramj.cBR();
      ((cfb)localObject1).jBB = paramcer.jBB;
      paramj.b((cfb)localObject1);
      ab.d(n.access$getTAG$cp(), "will replaceUserByPcId " + paramcer.vQE);
      localObject1 = j.rST;
      j.a.cxT().c(paramcer.vQE, paramj);
      l = paramcer.vQE;
      AppMethodBeat.o(138748);
      break;
      localObject1 = a.sdm;
      paramj.Fd(a.cBm());
      break label277;
      label403: localObject1 = a.sdm;
      paramj.Fd(a.cBn());
    }
  }

  public static com.tencent.mm.plugin.story.h.j a(String paramString, long paramLong, int paramInt, cer paramcer, boolean paramBoolean)
  {
    AppMethodBeat.i(109129);
    a.f.b.j.p(paramString, "username");
    if (paramBoolean)
    {
      paramcer = j.rST;
      localObject1 = j.a.cxT();
      a.f.b.j.p(paramString, "username");
      ((k)localObject1).lw(paramLong);
      paramcer = new com.tencent.mm.plugin.story.h.j();
      paramcer.field_userName = paramString;
      paramcer.field_storyID = paramLong;
      ((k)localObject1).b("notify_story_info_delete", 1, paramcer);
      localObject1 = null;
      AppMethodBeat.o(109129);
      return localObject1;
    }
    Object localObject1 = j.rST;
    Object localObject2 = j.a.cxT().lt(paramLong);
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = new com.tencent.mm.plugin.story.h.j();
    ((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID = paramLong;
    ((com.tencent.mm.plugin.story.h.j)localObject1).field_createTime = paramInt;
    ((com.tencent.mm.plugin.story.h.j)localObject1).field_userName = paramString;
    localObject2 = j.rST;
    if (bo.isEqual(paramString, j.a.cnk()))
    {
      paramString = a.sdm;
      paramInt = a.cAO();
      label159: ((com.tencent.mm.plugin.story.h.j)localObject1).DF(paramInt);
      if (paramcer == null)
        break label203;
      a((com.tencent.mm.plugin.story.h.j)localObject1, paramcer, ((com.tencent.mm.plugin.story.h.j)localObject1).field_sourceType);
    }
    while (true)
    {
      AppMethodBeat.o(109129);
      break;
      paramString = a.sdm;
      paramInt = a.cAP();
      break label159;
      label203: paramString = j.rST;
      ((com.tencent.mm.plugin.story.h.j)localObject1).cNE = j.a.cxT().d((com.tencent.mm.plugin.story.h.j)localObject1);
    }
  }

  public static com.tencent.mm.plugin.story.h.j aaB(String paramString)
  {
    AppMethodBeat.i(109130);
    a.f.b.j.p(paramString, "username");
    Object localObject1 = j.rST;
    localObject1 = j.a.cxT();
    Object localObject2 = j.rST;
    boolean bool = bo.isEqual(j.a.cnk(), paramString);
    a.f.b.j.p(paramString, "userName");
    localObject2 = new com.tencent.mm.plugin.story.h.j();
    paramString = "select *,rowid from MMStoryInfo " + k.bm(paramString, bool);
    StringBuilder localStringBuilder = new StringBuilder().append(paramString);
    if (bool);
    for (paramString = k.rfn; ; paramString = " AND " + k.seg + k.rfn)
    {
      paramString = paramString;
      paramString = paramString + " limit 1";
      paramString = ((k)localObject1).bSd.a(paramString, null, 2);
      if (paramString.moveToFirst())
      {
        a.f.b.j.o(paramString, "cu");
        ((com.tencent.mm.plugin.story.h.j)localObject2).d(paramString);
      }
      paramString.close();
      AppMethodBeat.o(109130);
      return localObject2;
    }
  }

  public static LinkedList<com.tencent.mm.plugin.story.h.j> b(String paramString, List<? extends cer> paramList, int paramInt)
  {
    AppMethodBeat.i(109119);
    a.f.b.j.p(paramString, "userName");
    if ((paramList == null) || (paramList.isEmpty()))
    {
      paramString = new LinkedList();
      AppMethodBeat.o(109119);
    }
    while (true)
    {
      return paramString;
      LinkedList localLinkedList = new LinkedList();
      paramString = j.rST;
      k localk = j.a.cxT();
      int i = ((Collection)paramList).size();
      for (int j = 0; j < i; j++)
      {
        cer localcer = (cer)paramList.get(j);
        ab.d(n.access$getTAG$cp(), "storyObj.id:" + localcer.vQE);
        com.tencent.mm.plugin.story.h.j localj = localk.lt(localcer.vQE);
        paramString = localj;
        if (localj == null)
          paramString = new com.tencent.mm.plugin.story.h.j();
        if ((a(paramString, localcer, paramInt) != 0L) && (paramString.field_storyID != 0L))
          localLinkedList.add(paramString);
      }
      AppMethodBeat.o(109119);
      paramString = localLinkedList;
    }
  }

  public static void b(long paramLong, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(109124);
    ab.d(n.access$getTAG$cp(), "setPrivacyRemote story item: " + paramLong + " to " + paramBoolean1);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean1);
    for (int i = 1; ; i = 0)
    {
      Object localObject = a.sdm;
      localArrayList.add(new com.tencent.mm.plugin.story.model.a.n(paramLong, a.cBb(), i, paramBoolean2));
      localObject = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(localObject, "MMKernel.network()");
      ((com.tencent.mm.kernel.b)localObject).Rg().d((com.tencent.mm.ai.m)new com.tencent.mm.plugin.story.model.a.g((List)localArrayList, paramInt));
      AppMethodBeat.o(109124);
      return;
    }
  }

  public static void cyo()
  {
    AppMethodBeat.i(109128);
    com.tencent.mm.kernel.b localb = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localb, "MMKernel.network()");
    localb.Rg().cancel(764);
    AppMethodBeat.o(109128);
  }

  public static boolean dl(String paramString, int paramInt)
  {
    AppMethodBeat.i(109121);
    a.f.b.j.p(paramString, "userName");
    boolean bool = false;
    Object localObject = j.rST;
    localObject = j.a.cxT();
    j.a locala = j.rST;
    localObject = ((Iterable)((k)localObject).a(paramString, bo.isEqual(paramString, j.a.cnk()), paramInt, true)).iterator();
    if (((Iterator)localObject).hasNext())
    {
      paramString = ((com.tencent.mm.plugin.story.h.j)((Iterator)localObject).next()).cBR();
      if ((paramString.xeA == null) || (paramString.xeA.wbK.size() == 0))
        break label106;
      bool = true;
    }
    label106: 
    while (true)
    {
      break;
      AppMethodBeat.o(109121);
      return bool;
    }
  }

  public static void fJ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109126);
    ab.d(n.access$getTAG$cp(), "setPrivacyLocal story item: " + paramInt1 + " to " + paramInt2);
    Object localObject = j.rST;
    k localk = j.a.cxT();
    localObject = localk.Fe(paramInt1);
    a.a locala;
    if (localObject != null)
      if (paramInt2 == 1)
      {
        locala = a.sdm;
        ((com.tencent.mm.plugin.story.h.j)localObject).Fc(a.cBm());
        localk.a((c)localObject);
        AppMethodBeat.o(109126);
      }
    while (true)
    {
      return;
      locala = a.sdm;
      ((com.tencent.mm.plugin.story.h.j)localObject).Fd(a.cBm());
      break;
      AppMethodBeat.o(109126);
    }
  }

  public static void fK(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109127);
    ab.d(n.access$getTAG$cp(), "setStoryFavLocal story item: " + paramInt1 + " to " + paramInt2);
    Object localObject = j.rST;
    localObject = j.a.cxT();
    com.tencent.mm.plugin.story.h.j localj = ((k)localObject).Fe(paramInt1);
    a.a locala;
    if (localj != null)
      if (paramInt2 == 1)
      {
        locala = a.sdm;
        localj.Fc(a.cBn());
        localj.field_favoriteTime = cb.aaF();
        ((k)localObject).a((c)localj);
        AppMethodBeat.o(109127);
      }
    while (true)
    {
      return;
      locala = a.sdm;
      localj.Fd(a.cBn());
      localj.field_favoriteTime = 0;
      break;
      AppMethodBeat.o(109127);
    }
  }

  public static void h(long paramLong, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(109125);
    ab.d(n.access$getTAG$cp(), "setStoryFavRemote story item: " + paramLong + " to " + paramBoolean);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      Object localObject = a.sdm;
      localArrayList.add(new com.tencent.mm.plugin.story.model.a.l(paramLong, a.cBc(), i));
      localObject = com.tencent.mm.kernel.g.RO();
      a.f.b.j.o(localObject, "MMKernel.network()");
      ((com.tencent.mm.kernel.b)localObject).Rg().d((com.tencent.mm.ai.m)new com.tencent.mm.plugin.story.model.a.g((List)localArrayList, paramInt));
      AppMethodBeat.o(109125);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.n.a
 * JD-Core Version:    0.6.2
 */