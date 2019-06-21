package com.tencent.mm.plugin.story.f;

import a.l;
import android.support.v7.h.c;
import android.support.v7.h.c.a;
import android.support.v7.h.c.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ab.a;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.e.b;
import com.tencent.mm.plugin.story.e.b.a;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.d.g;
import com.tencent.mm.plugin.story.model.d.g.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.q;
import com.tencent.mm.plugin.story.model.q.a;
import com.tencent.mm.protocal.protobuf.cea;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.protocal.protobuf.cel;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/presenter/IGalleryPresenter$Companion;", "", "()V", "GalleryStateImage", "", "GalleryStateVideo", "TAG", "", "calculateDiff", "Landroid/support/v7/util/DiffUtil$DiffResult;", "oldItems", "", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "newItems", "getFavGalleryItemsFromDb", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "username", "getGalleryItemsFromDb", "isForSns", "", "getGalleryItemsFromDbByDate", "date", "getGalleryItemsFromDbByStoryId", "isSelf", "storyIds", "", "loadSyncData", "plugin-story_release"})
public final class h$a
{
  public static ArrayList<g> b(String paramString, boolean paramBoolean, ArrayList<Long> paramArrayList)
  {
    AppMethodBeat.i(138806);
    a.f.b.j.p(paramString, "username");
    a locala = new a("getGalleryItemsFromDbByStoryId");
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = (Iterable)j.a.cxT().bw(paramString, paramBoolean);
    paramString = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject1).iterator();
    Object localObject2;
    label130: 
    while (localIterator.hasNext())
    {
      localObject2 = localIterator.next();
      localObject1 = (com.tencent.mm.plugin.story.h.j)localObject2;
      if (paramArrayList != null);
      for (paramBoolean = paramArrayList.contains(Long.valueOf(((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID)); ; paramBoolean = true)
      {
        if (!paramBoolean)
          break label130;
        paramString.add(localObject2);
        break;
      }
    }
    localObject1 = ((Iterable)paramString).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.plugin.story.h.j)((Iterator)localObject1).next();
      paramString = ((com.tencent.mm.plugin.story.h.j)localObject2).cBR();
      if ((paramString.xeA != null) && (paramString.xeA.wbK.size() != 0))
      {
        paramArrayList = g.rWe;
        localArrayList.add(g.a.a((com.tencent.mm.plugin.story.h.j)localObject2, com.tencent.mm.plugin.story.model.d.h.rWg));
        ab.i(h.access$getTAG$cp(), "getGalleryItemsFromDbByStoryId story:" + localObject2 + ", content:" + ((cek)paramString.xeA.wbK.get(0)).wEH + ' ' + "and " + ((cek)paramString.xeA.wbK.get(0)).Url + ", id:" + ((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID + ", storyUsername:" + ((com.tencent.mm.plugin.story.h.j)localObject2).field_userName);
      }
    }
    locala.SW();
    AppMethodBeat.o(138806);
    return localArrayList;
  }

  public static g bt(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109584);
    a.f.b.j.p(paramString, "username");
    ab.i(h.access$getTAG$cp(), "LogStory: loadSyncData ".concat(String.valueOf(paramString)));
    Object localObject1 = com.tencent.mm.plugin.story.model.k.rTc;
    paramString = com.tencent.mm.plugin.story.model.k.aap(paramString);
    int i;
    if (paramString.field_syncId == 0L)
    {
      i = 1;
      if (i != 0)
        break label283;
      if (!paramBoolean)
        break label266;
      localObject1 = g.rWe;
      a.f.b.j.p(paramString, "extInfo");
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      Object localObject2 = j.a.cxT().lx(paramString.field_syncId);
      localObject1 = new com.tencent.mm.plugin.story.h.j();
      ((com.tencent.mm.plugin.story.h.j)localObject1).field_storyID = paramString.field_syncId;
      ((com.tencent.mm.plugin.story.h.j)localObject1).field_createTime = paramString.field_storyPostTime;
      ((com.tencent.mm.plugin.story.h.j)localObject1).field_userName = paramString.getUserName();
      Object localObject3 = q.rTk;
      localObject3 = q.a.cyq();
      ((cfb)localObject3).jBB = paramString.getUserName();
      ((cfb)localObject3).pcX = paramString.field_storyPostTime;
      Object localObject4 = q.rTk;
      localObject4 = new cek();
      ((cek)localObject4).Id = ("empty_" + cb.aaE());
      if (localObject2 != null)
      {
        localObject2 = ((com.tencent.mm.plugin.story.h.j)localObject2).cBR();
        if ((localObject2 != null) && (((cfb)localObject2).xeC == 0))
        {
          ((cek)localObject4).wEH = paramString.cBK();
          ((cek)localObject4).Url = paramString.cBJ();
        }
      }
      ((cfb)localObject3).xeA.wbK.add(localObject4);
      ((com.tencent.mm.plugin.story.h.j)localObject1).c((cfb)localObject3);
      paramString = new g((com.tencent.mm.plugin.story.h.j)localObject1, (cfb)localObject3);
      AppMethodBeat.o(109584);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label266: localObject1 = g.rWe;
      paramString = g.a.a(paramString);
      AppMethodBeat.o(109584);
      continue;
      label283: paramString = null;
      AppMethodBeat.o(109584);
    }
  }

  public static ArrayList<g> bu(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109585);
    a.f.b.j.p(paramString, "username");
    ArrayList localArrayList = new ArrayList();
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT();
      localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    }
    for (Object localObject1 = ((com.tencent.mm.plugin.story.h.k)localObject1).h(paramString, bo.isEqual(j.a.cnk(), paramString), cb.aaF() - 86400); ; localObject1 = ((com.tencent.mm.plugin.story.h.k)localObject2).a(paramString, bo.isEqual(j.a.cnk(), paramString), cb.aaF() - 86400, true))
    {
      Iterator localIterator = ((List)localObject1).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.story.h.j)localIterator.next();
        cfb localcfb = ((com.tencent.mm.plugin.story.h.j)localObject2).cBR();
        if ((localcfb.xeA != null) && (localcfb.xeA.wbK.size() != 0))
        {
          localObject1 = g.rWe;
          localArrayList.add(g.a.c((com.tencent.mm.plugin.story.h.j)localObject2));
          ab.i(h.access$getTAG$cp(), "getGalleryItemsFromDb story username " + paramString + ' ' + localArrayList.size() + ' ' + "content " + ((cek)localcfb.xeA.wbK.get(0)).wEH + ' ' + "and " + ((cek)localcfb.xeA.wbK.get(0)).Url + " id:" + ((com.tencent.mm.plugin.story.h.j)localObject2).field_storyID + " storyUsername: " + ((com.tencent.mm.plugin.story.h.j)localObject2).field_userName + " tryCount:" + ((com.tencent.mm.plugin.story.h.j)localObject2).cBU().eRu + " flag:" + ((com.tencent.mm.plugin.story.h.j)localObject2).field_localFlag);
        }
      }
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject2 = j.a.cxT();
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    }
    AppMethodBeat.o(109585);
    return localArrayList;
  }

  public static ArrayList<g> gz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109586);
    a.f.b.j.p(paramString1, "username");
    a.f.b.j.p(paramString2, "date");
    ArrayList localArrayList = new ArrayList();
    Object localObject = b.rRO;
    int i = b.a.aah(paramString2);
    paramString2 = com.tencent.mm.plugin.story.model.j.rST;
    Iterator localIterator = j.a.cxT().dm(paramString1, i).iterator();
    while (localIterator.hasNext())
    {
      localObject = (com.tencent.mm.plugin.story.h.j)localIterator.next();
      paramString2 = ((com.tencent.mm.plugin.story.h.j)localObject).cBR();
      if ((paramString2.xeA != null) && (paramString2.xeA.wbK.size() != 0))
      {
        g.a locala = g.rWe;
        localArrayList.add(g.a.c((com.tencent.mm.plugin.story.h.j)localObject));
        ab.i(h.access$getTAG$cp(), "getGalleryItemsFromDbByDate story username " + paramString1 + ' ' + localArrayList.size() + ' ' + "content " + ((cek)paramString2.xeA.wbK.get(0)).wEH + ' ' + "and " + ((cek)paramString2.xeA.wbK.get(0)).Url + " id:" + ((com.tencent.mm.plugin.story.h.j)localObject).field_storyID + " storyUsername: " + ((com.tencent.mm.plugin.story.h.j)localObject).field_userName);
      }
    }
    AppMethodBeat.o(109586);
    return localArrayList;
  }

  public static c.b m(List<g> paramList1, List<g> paramList2)
  {
    AppMethodBeat.i(109587);
    a.f.b.j.p(paramList1, "oldItems");
    a.f.b.j.p(paramList2, "newItems");
    paramList1 = c.a((c.a)new h.a.a(paramList1, paramList2), false);
    a.f.b.j.o(paramList1, "DiffUtil.calculateDiff(o…  }\n            }, false)");
    AppMethodBeat.o(109587);
    return paramList1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.h.a
 * JD-Core Version:    0.6.2
 */