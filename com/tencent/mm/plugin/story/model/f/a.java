package com.tencent.mm.plugin.story.model.f;

import a.f.a.r;
import a.l;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.k.b;
import com.tencent.mm.plugin.story.api.k.c;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.h.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.cdv;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/sync/ContactSyncFetcher;", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher$IContactSyncFetcher;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "()V", "TAG", "", "displayOlderUserList", "", "kotlin.jvm.PlatformType", "", "displayUnreadUserList", "listeners", "Ljava/util/LinkedList;", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher$ContactSyncStateListener;", "snsPermissionNotifyListener", "com/tencent/mm/plugin/story/model/sync/ContactSyncFetcher$snsPermissionNotifyListener$1", "Lcom/tencent/mm/plugin/story/model/sync/ContactSyncFetcher$snsPermissionNotifyListener$1;", "storyCommentChangeListener", "Lkotlin/Function4;", "", "", "", "userReplyStateMap", "", "Lcom/tencent/mm/plugin/story/model/sync/StoryCommentReply;", "", "userStateMap", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "addNotifyListener", "listener", "checkCommentState", "checkContactState", "checkRefreshUserList", "checkState", "checkStoryUnread", "username", "destroy", "filterOut", "user", "filterUnreadComment", "comment", "Lcom/tencent/mm/protocal/protobuf/StoryCommentDetail;", "commentSync", "Lcom/tencent/mm/plugin/story/storage/StoryCommentSync;", "getNewReplyCount", "", "storyOwner", "getNewReplyMap", "Ljava/util/LinkedHashMap;", "Ljava/util/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "Lkotlin/collections/ArrayList;", "getNewReplyTotalCount", "getOlderList", "getReadList", "getUnreadList", "init", "notifyStoryList", "notifyUserList", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "pullTest", "removeNotifyListener", "updateUnreadList", "updateUser", "plugin-story_release"})
public final class a
  implements k.c, k.a
{
  public static final String TAG = "MicroMsg.ContactSyncFetcher";
  public static final LinkedList<k.b> ilQ;
  private static final Map<String, f> rWF;
  private static final Map<String, c> rWG;
  private static final List<String> rWH;
  private static final List<String> rWI;
  public static final a.i rWJ;
  public static final r<Long, Boolean, String, String, y> rWK;
  public static final a rWL;

  static
  {
    AppMethodBeat.i(109374);
    rWL = new a();
    TAG = "MicroMsg.ContactSyncFetcher";
    rWF = Collections.synchronizedMap((Map)new ConcurrentHashMap());
    rWG = Collections.synchronizedMap((Map)new ConcurrentHashMap());
    rWH = Collections.synchronizedList((List)new LinkedList());
    rWI = Collections.synchronizedList((List)new LinkedList());
    ilQ = new LinkedList();
    rWJ = new a.i();
    rWK = (r)a.j.rWX;
    AppMethodBeat.o(109374);
  }

  private static boolean a(cdv paramcdv, com.tencent.mm.plugin.story.h.c paramc)
  {
    AppMethodBeat.i(138790);
    boolean bool;
    if ((paramcdv.wZG != 0) && (paramcdv.pcX > paramc.field_readCommentTime))
    {
      paramcdv = paramcdv.ndG;
      paramc = com.tencent.mm.plugin.story.model.j.rST;
      if (!bo.isEqual(paramcdv, j.a.cnk()))
      {
        bool = true;
        AppMethodBeat.o(138790);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(138790);
    }
  }

  private static boolean aaI(String paramString)
  {
    AppMethodBeat.i(109371);
    Object localObject = (CharSequence)paramString;
    int i;
    if ((localObject == null) || (((CharSequence)localObject).length() == 0))
    {
      i = 1;
      if (i == 0)
      {
        localObject = com.tencent.mm.plugin.story.model.j.rST;
        if (!a.f.b.j.j(paramString, j.a.cnk()))
          break label57;
      }
      AppMethodBeat.o(109371);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      i = 0;
      break;
      label57: AppMethodBeat.o(109371);
    }
  }

  public static void czg()
  {
    AppMethodBeat.i(109364);
    com.tencent.mm.ab.b.a("ContactSyncFetcher_pullTest", (a.f.a.a)a.h.rWV);
    AppMethodBeat.o(109364);
  }

  public static void czh()
  {
    AppMethodBeat.i(109372);
    com.tencent.mm.ab.b.a("ContactSyncFetcher_checkContactState", (a.f.a.a)e.rWQ);
    AppMethodBeat.o(109372);
  }

  public final void a(k.b paramb)
  {
    AppMethodBeat.i(109365);
    if (!ilQ.contains(paramb))
      ilQ.add(paramb);
    AppMethodBeat.o(109365);
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(109373);
    if ((paramString != null) && (paramm != null) && ((paramm.obj instanceof f)))
      switch (paramString.hashCode())
      {
      default:
        ab.i(TAG, "[StoryExtInfo] unknown event ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(109373);
      case 632036207:
      case 356729399:
      case -533270468:
      case 398324054:
      case -1921532343:
      }
    while (true)
    {
      return;
      if (!paramString.equals("notify_story_unread"))
        break;
      while (true)
      {
        paramm = paramm.obj;
        if (paramm != null)
          break label193;
        paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
        AppMethodBeat.o(109373);
        throw paramString;
        if (!paramString.equals("notify_story_invalid"))
          break;
        continue;
        if (!paramString.equals("notify_story_valid"))
          break;
        continue;
        if (!paramString.equals("notify_story_read"))
          break;
        continue;
        if (!paramString.equals("notify_story_preload"))
          break;
      }
      label193: paramm = (f)paramm;
      String str = paramm.getUserName();
      ab.i(TAG, "[StoryExtInfo] onNotifyChange: event " + paramString + ' ' + str);
      if (paramm.isValid())
      {
        Map localMap = rWF;
        a.f.b.j.o(localMap, "userStateMap");
        localMap.put(str, paramm);
      }
      while (true)
        if ((a.f.b.j.j(paramString, "notify_story_preload") ^ true))
        {
          if ((a.f.b.j.j(paramString, "notify_story_read")) || (a.f.b.j.j(paramString, "notify_story_invalid")))
          {
            rWI.remove(str);
            rWH.remove(str);
            AppMethodBeat.o(109373);
            break;
            rWF.remove(str);
            continue;
          }
          com.tencent.mm.ab.b.a("ContactSyncFetcher_checkContactState", (a.f.a.a)new a.f(str));
          AppMethodBeat.o(109373);
          break;
          if ((paramString != null) && (paramm != null) && ((paramm.obj instanceof com.tencent.mm.plugin.story.h.j)))
            switch (paramString.hashCode())
            {
            default:
            case 317345436:
            }
        }
      do
      {
        ab.i(TAG, "[StoryInfo] unknown event ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(109373);
        break;
      }
      while (!paramString.equals("notify_story_info_delete"));
      com.tencent.mm.ab.b.a("ContactSyncFetcher_checkContactState", (a.f.a.a)new a.g(paramm));
      AppMethodBeat.o(109373);
    }
  }

  public final int aaH(String paramString)
  {
    AppMethodBeat.i(138789);
    a.f.b.j.p(paramString, "storyOwner");
    ab.i(TAG, "getNewReplyCount: storyOwner ".concat(String.valueOf(paramString)));
    int i = 0;
    try
    {
      paramString = (c)rWG.get(paramString);
      if (paramString != null)
      {
        paramString = paramString.rXi;
        if (paramString != null)
        {
          paramString = ((Map)paramString).entrySet().iterator();
          while (paramString.hasNext())
            i += ((Number)((Map.Entry)paramString.next()).getValue()).intValue();
          paramString = y.AUy;
        }
      }
      while (true)
      {
        return i;
        i = 0;
      }
    }
    finally
    {
      AppMethodBeat.o(138789);
    }
    throw paramString;
  }

  public final void b(k.b paramb)
  {
    AppMethodBeat.i(109366);
    ilQ.remove(paramb);
    AppMethodBeat.o(109366);
  }

  public final List<String> cwY()
  {
    AppMethodBeat.i(109368);
    ab.i(TAG, "getUnreadList: size " + rWI.size());
    List localList = (List)new LinkedList((Collection)rWI);
    AppMethodBeat.o(109368);
    return localList;
  }

  public final List<String> cwZ()
  {
    AppMethodBeat.i(109369);
    ab.i(TAG, "getOlderList: size " + rWH.size());
    List localList = (List)new LinkedList((Collection)rWH);
    AppMethodBeat.o(109369);
    return localList;
  }

  public final LinkedHashMap<String, ArrayList<Long>> cxa()
  {
    AppMethodBeat.i(138787);
    ab.i(TAG, "getNewReplyList: size " + rWG.size());
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    try
    {
      localObject1 = rWG;
      a.f.b.j.o(localObject1, "userReplyStateMap");
      Iterator localIterator = ((Map)localObject1).entrySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = (Map.Entry)localIterator.next();
        localObject1 = (String)((Map.Entry)localObject2).getKey();
        Object localObject3 = (c)((Map.Entry)localObject2).getValue();
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        ((ArrayList)localObject2).addAll((Collection)((c)localObject3).rXi.keySet());
        localObject3 = (Map)localLinkedHashMap;
        a.f.b.j.o(localObject1, "storyOwner");
        ((Map)localObject3).put(localObject1, localObject2);
      }
    }
    finally
    {
      AppMethodBeat.o(138787);
    }
    Object localObject1 = y.AUy;
    AppMethodBeat.o(138787);
    return localLinkedHashMap1;
  }

  public final int cxb()
  {
    AppMethodBeat.i(138788);
    int i = 0;
    synchronized ((Iterable)rWG.entrySet())
    {
      Iterator localIterator = ???.iterator();
      if (localIterator.hasNext())
      {
        localObject1 = ((Map)((c)((Map.Entry)localIterator.next()).getValue()).rXi).entrySet().iterator();
        for (int j = i; ; j = ((Number)((Map.Entry)((Iterator)localObject1).next()).getValue()).intValue() + j)
        {
          i = j;
          if (!((Iterator)localObject1).hasNext())
            break;
        }
      }
      Object localObject1 = y.AUy;
      AppMethodBeat.o(138788);
      return i;
    }
  }

  public final List<String> cxc()
  {
    AppMethodBeat.i(109367);
    LinkedList localLinkedList = new LinkedList();
    synchronized ((Iterable)rWF.entrySet())
    {
      localObject4 = ((Iterable)???).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject4).next();
        if ((!aaI((String)localEntry.getKey())) && (((f)localEntry.getValue()).isValid()) && (!((f)localEntry.getValue()).cBN()))
          localLinkedList.add(localEntry.getValue());
      }
    }
    Object localObject4 = y.AUy;
    ??? = (List)localObject1;
    if (((List)???).size() > 1)
      a.a.j.a((List)???, (Comparator)new a.c());
    ab.i(TAG, "getReadList: size " + localObject1.size());
    Object localObject2 = (Iterable)localObject1;
    ??? = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      ((Collection)???).add(((f)((Iterator)localObject2).next()).getUserName());
    ??? = (List)???;
    AppMethodBeat.o(109367);
    return ???;
  }

  public final void cxd()
  {
    AppMethodBeat.i(109370);
    com.tencent.mm.ab.b.a("ContactSyncFetcher_checkContactState", (a.f.a.a)a.a.rWM);
    AppMethodBeat.o(109370);
  }

  public final void init()
  {
    AppMethodBeat.i(109363);
    ab.i(TAG, "init: ");
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().c((k.a)this);
    localObject = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxT().c((k.a)this);
    com.tencent.mm.ab.b.a(1000L, (a.f.a.a)a.d.rWP);
    rWJ.dnU();
    localObject = com.tencent.mm.plugin.story.model.b.b.rVw;
    com.tencent.mm.plugin.story.model.b.b.a(rWK);
    AppMethodBeat.o(109363);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class b extends a.f.b.k
    implements a.f.a.a<y>
  {
    public static final b rWO;

    static
    {
      AppMethodBeat.i(138778);
      rWO = new b();
      AppMethodBeat.o(138778);
    }

    b()
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class e extends a.f.b.k
    implements a.f.a.a<y>
  {
    public static final e rWQ;

    static
    {
      AppMethodBeat.i(109355);
      rWQ = new e();
      AppMethodBeat.o(109355);
    }

    e()
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.a
 * JD-Core Version:    0.6.2
 */