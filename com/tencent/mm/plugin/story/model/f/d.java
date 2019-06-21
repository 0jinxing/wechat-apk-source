package com.tencent.mm.plugin.story.model.f;

import a.o;
import a.v;
import a.y;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.protocal.protobuf.cdt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/sync/StoryStateFetcher;", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "talker", "", "(Ljava/lang/String;)V", "blackTagList", "", "chatRoomStgListener", "friendUnreadList", "", "Lkotlin/Pair;", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "kotlin.jvm.PlatformType", "handler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "hasStory", "", "hasUnread", "isPause", "listener", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher$ChatRoomStateListener;", "nextFetchTime", "", "normalUnreadList", "readList", "roomMember", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "roomMemberReady", "snsPermissionNotifyListener", "com/tencent/mm/plugin/story/model/sync/StoryStateFetcher$snsPermissionNotifyListener$1", "Lcom/tencent/mm/plugin/story/model/sync/StoryStateFetcher$snsPermissionNotifyListener$1;", "tryStartFetchRunnable", "Ljava/lang/Runnable;", "userUpdateMap", "", "", "addNewUserStory", "", "username", "extInfo", "checkChatRoomState", "checkExpire", "checkFetch", "checkStoryUnread", "destroy", "isRoomMember", "userName", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "onSceneEnd", "errType", "", "errCode", "errMsg", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "pause", "registerNotifyListener", "removeUserStory", "resume", "start", "tryStartFetch", "updateChatRoomState", "updateGalleryUserList", "updateUserState", "Companion", "plugin-story_release"})
public final class d
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.story.api.k, com.tencent.mm.sdk.e.k.a
{
  private static final String TAG = "MicroMsg.StoryStateFetcher";
  public static final a rXt;
  private boolean cAY;
  private final ak handler;
  private boolean pls;
  private List<String> qGk;
  public com.tencent.mm.plugin.story.api.k.a rXb;
  private boolean rXd;
  private final List<o<String, com.tencent.mm.plugin.story.h.f>> rXj;
  private final List<o<String, com.tencent.mm.plugin.story.h.f>> rXk;
  private final List<o<String, com.tencent.mm.plugin.story.h.f>> rXl;
  private long rXm;
  private final Map<String, com.tencent.mm.plugin.story.h.f> rXn;
  private final Runnable rXo;
  private final ArrayList<String> rXp;
  private boolean rXq;
  private final com.tencent.mm.sdk.e.k.a rXr;
  private final d.d rXs;
  private final String talker;

  static
  {
    AppMethodBeat.i(109416);
    rXt = new a((byte)0);
    TAG = "MicroMsg.StoryStateFetcher";
    AppMethodBeat.o(109416);
  }

  public d(String paramString)
  {
    AppMethodBeat.i(109415);
    this.talker = paramString;
    this.rXj = Collections.synchronizedList((List)new ArrayList());
    this.rXk = Collections.synchronizedList((List)new ArrayList());
    this.rXl = Collections.synchronizedList((List)new ArrayList());
    this.rXn = Collections.synchronizedMap((Map)new HashMap());
    paramString = com.tencent.mm.kernel.g.RS();
    a.f.b.j.o(paramString, "MMKernel.getPizzaWorkerThread()");
    this.handler = new ak(paramString.getLooper());
    this.rXo = ((Runnable)new d.f(this));
    this.qGk = ((List)new LinkedList());
    this.rXp = new ArrayList();
    this.rXr = ((com.tencent.mm.sdk.e.k.a)new d.b(this));
    this.rXs = new d.d(this);
    AppMethodBeat.o(109415);
  }

  private final void a(String paramString, com.tencent.mm.plugin.story.h.f paramf)
  {
    AppMethodBeat.i(109410);
    if (this.qGk.contains(paramString))
      AppMethodBeat.o(109410);
    while (true)
    {
      return;
      com.tencent.mm.plugin.story.api.k.a locala = this.rXb;
      if (locala != null)
        locala.bs(paramString, paramf.cBN());
      aaL(paramString);
      b(paramString, paramf);
      czr();
      czs();
      AppMethodBeat.o(109410);
    }
  }

  // ERROR //
  private final void aaL(String paramString)
  {
    // Byte code:
    //   0: ldc_w 300
    //   3: invokestatic 128	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 167	com/tencent/mm/plugin/story/model/f/d:rXk	Ljava/util/List;
    //   10: astore_2
    //   11: aload_2
    //   12: ldc_w 301
    //   15: invokestatic 190	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   18: aload_2
    //   19: monitorenter
    //   20: aload_0
    //   21: getfield 167	com/tencent/mm/plugin/story/model/f/d:rXk	Ljava/util/List;
    //   24: astore_3
    //   25: aload_3
    //   26: ldc_w 301
    //   29: invokestatic 190	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   32: aload_3
    //   33: checkcast 280	java/lang/Iterable
    //   36: invokeinterface 284 1 0
    //   41: astore 4
    //   43: aload 4
    //   45: invokeinterface 289 1 0
    //   50: ifeq +247 -> 297
    //   53: aload 4
    //   55: invokeinterface 293 1 0
    //   60: astore_3
    //   61: aload_3
    //   62: checkcast 303	a/o
    //   65: getfield 307	a/o:first	Ljava/lang/Object;
    //   68: checkcast 295	java/lang/String
    //   71: aload_1
    //   72: invokestatic 299	a/f/b/j:j	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   75: ifeq -32 -> 43
    //   78: aload_3
    //   79: checkcast 303	a/o
    //   82: astore_3
    //   83: aload_3
    //   84: ifnull +14 -> 98
    //   87: aload_0
    //   88: getfield 167	com/tencent/mm/plugin/story/model/f/d:rXk	Ljava/util/List;
    //   91: aload_3
    //   92: invokeinterface 310 2 0
    //   97: pop
    //   98: aload_2
    //   99: monitorexit
    //   100: aload_0
    //   101: getfield 169	com/tencent/mm/plugin/story/model/f/d:rXl	Ljava/util/List;
    //   104: astore_2
    //   105: aload_2
    //   106: ldc_w 311
    //   109: invokestatic 190	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   112: aload_2
    //   113: monitorenter
    //   114: aload_0
    //   115: getfield 169	com/tencent/mm/plugin/story/model/f/d:rXl	Ljava/util/List;
    //   118: astore_3
    //   119: aload_3
    //   120: ldc_w 311
    //   123: invokestatic 190	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   126: aload_3
    //   127: checkcast 280	java/lang/Iterable
    //   130: invokeinterface 284 1 0
    //   135: astore 4
    //   137: aload 4
    //   139: invokeinterface 289 1 0
    //   144: ifeq +169 -> 313
    //   147: aload 4
    //   149: invokeinterface 293 1 0
    //   154: astore_3
    //   155: aload_3
    //   156: checkcast 303	a/o
    //   159: getfield 307	a/o:first	Ljava/lang/Object;
    //   162: checkcast 295	java/lang/String
    //   165: aload_1
    //   166: invokestatic 299	a/f/b/j:j	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   169: ifeq -32 -> 137
    //   172: aload_3
    //   173: checkcast 303	a/o
    //   176: astore_3
    //   177: aload_3
    //   178: ifnull +14 -> 192
    //   181: aload_0
    //   182: getfield 169	com/tencent/mm/plugin/story/model/f/d:rXl	Ljava/util/List;
    //   185: aload_3
    //   186: invokeinterface 310 2 0
    //   191: pop
    //   192: aload_2
    //   193: monitorexit
    //   194: aload_0
    //   195: getfield 165	com/tencent/mm/plugin/story/model/f/d:rXj	Ljava/util/List;
    //   198: astore_2
    //   199: aload_2
    //   200: ldc_w 312
    //   203: invokestatic 190	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   206: aload_2
    //   207: monitorenter
    //   208: aload_0
    //   209: getfield 165	com/tencent/mm/plugin/story/model/f/d:rXj	Ljava/util/List;
    //   212: astore_3
    //   213: aload_3
    //   214: ldc_w 312
    //   217: invokestatic 190	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   220: aload_3
    //   221: checkcast 280	java/lang/Iterable
    //   224: invokeinterface 284 1 0
    //   229: astore 4
    //   231: aload 4
    //   233: invokeinterface 289 1 0
    //   238: ifeq +91 -> 329
    //   241: aload 4
    //   243: invokeinterface 293 1 0
    //   248: astore_3
    //   249: aload_3
    //   250: checkcast 303	a/o
    //   253: getfield 307	a/o:first	Ljava/lang/Object;
    //   256: checkcast 295	java/lang/String
    //   259: aload_1
    //   260: invokestatic 299	a/f/b/j:j	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   263: ifeq -32 -> 231
    //   266: aload_3
    //   267: astore_1
    //   268: aload_1
    //   269: checkcast 303	a/o
    //   272: astore_1
    //   273: aload_1
    //   274: ifnull +14 -> 288
    //   277: aload_0
    //   278: getfield 165	com/tencent/mm/plugin/story/model/f/d:rXj	Ljava/util/List;
    //   281: aload_1
    //   282: invokeinterface 310 2 0
    //   287: pop
    //   288: aload_2
    //   289: monitorexit
    //   290: ldc_w 300
    //   293: invokestatic 139	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   296: return
    //   297: aconst_null
    //   298: astore_3
    //   299: goto -221 -> 78
    //   302: astore_1
    //   303: aload_2
    //   304: monitorexit
    //   305: ldc_w 300
    //   308: invokestatic 139	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   311: aload_1
    //   312: athrow
    //   313: aconst_null
    //   314: astore_3
    //   315: goto -143 -> 172
    //   318: astore_1
    //   319: aload_2
    //   320: monitorexit
    //   321: ldc_w 300
    //   324: invokestatic 139	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   327: aload_1
    //   328: athrow
    //   329: aconst_null
    //   330: astore_1
    //   331: goto -63 -> 268
    //   334: astore_1
    //   335: aload_2
    //   336: monitorexit
    //   337: ldc_w 300
    //   340: invokestatic 139	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   343: aload_1
    //   344: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   20	43	302	finally
    //   43	78	302	finally
    //   78	83	302	finally
    //   87	98	302	finally
    //   114	137	318	finally
    //   137	172	318	finally
    //   172	177	318	finally
    //   181	192	318	finally
    //   208	231	334	finally
    //   231	266	334	finally
    //   268	273	334	finally
    //   277	288	334	finally
  }

  private final void b(String paramString, com.tencent.mm.plugin.story.h.f paramf)
  {
    AppMethodBeat.i(109412);
    Object localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(localObject, "service(IMessengerStorage::class.java)");
    localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramString);
    boolean bool;
    if (localObject != null)
    {
      bool = ((ad)localObject).NX();
      if (!paramf.cBN())
        break label118;
      if (!bool)
        break label90;
      this.rXl.add(new o(paramString, paramf));
      AppMethodBeat.o(109412);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label90: this.rXk.add(new o(paramString, paramf));
      AppMethodBeat.o(109412);
      continue;
      label118: if (paramf.isValid())
        this.rXj.add(new o(paramString, paramf));
      AppMethodBeat.o(109412);
    }
  }

  private final void czr()
  {
    AppMethodBeat.i(109407);
    Object localObject = this.rXk;
    a.f.b.j.o(localObject, "normalUnreadList");
    int i;
    label62: boolean bool1;
    label68: label98: boolean bool2;
    if (!((Collection)localObject).isEmpty())
    {
      i = 1;
      if (i == 0)
      {
        localObject = this.rXl;
        a.f.b.j.o(localObject, "friendUnreadList");
        if (((Collection)localObject).isEmpty())
          break label152;
        i = 1;
        if (i == 0)
          break label157;
      }
      bool1 = true;
      if (!bool1)
      {
        localObject = this.rXj;
        a.f.b.j.o(localObject, "readList");
        if (((Collection)localObject).isEmpty())
          break label162;
        i = 1;
        if (i == 0)
          break label167;
      }
      bool2 = true;
      label105: if ((this.pls == bool2) && (this.rXd == bool1))
        break label173;
      localObject = this.rXb;
      if (localObject == null)
        break label173;
      ((com.tencent.mm.plugin.story.api.k.a)localObject).L(bool2, bool1);
      AppMethodBeat.o(109407);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label152: i = 0;
      break label62;
      label157: bool1 = false;
      break label68;
      label162: i = 0;
      break label98;
      label167: bool2 = false;
      break label105;
      label173: AppMethodBeat.o(109407);
    }
  }

  private final void czs()
  {
    AppMethodBeat.i(109408);
    ArrayList localArrayList = new ArrayList();
    Object localObject3 = this.rXl;
    a.f.b.j.o(localObject3, "friendUnreadList");
    if (((List)localObject3).size() > 1)
      a.a.j.a((List)localObject3, (Comparator)new d.g());
    localObject3 = this.rXk;
    a.f.b.j.o(localObject3, "normalUnreadList");
    if (((List)localObject3).size() > 1)
      a.a.j.a((List)localObject3, (Comparator)new d.h());
    localObject3 = "";
    ??? = ((d)this).rXk;
    a.f.b.j.o(???, "normalUnreadList");
    while (true)
    {
      synchronized ((Iterable)???)
      {
        ??? = ((Iterable)???).iterator();
        i = 0;
        if (((Iterator)???).hasNext())
        {
          o localo = (o)((Iterator)???).next();
          localObject11 = new java/lang/StringBuilder;
          ((StringBuilder)localObject11).<init>();
          localObject3 = (String)localObject3 + "unRead:" + i + ' ' + bo.ga(((com.tencent.mm.plugin.story.h.f)localo.second).cBL()) + "  userName:" + ((com.tencent.mm.plugin.story.h.f)localo.second).getUserName() + " |, ";
          if (i > 2)
          {
            ab.i(TAG, "unRead preLoadCache: ".concat(String.valueOf(localObject3)));
            ??? = new ArrayList();
            localObject3 = this.rXl;
            a.f.b.j.o(localObject3, "friendUnreadList");
            if (((Collection)localObject3).isEmpty())
              break label484;
            i = 1;
            if (i == 0)
              break label1028;
            if (((com.tencent.mm.plugin.story.h.f)((o)this.rXl.get(0)).second).cBL() <= 0L)
              break label1023;
            localObject3 = (o)this.rXl.get(0);
            this.rXl.remove(localObject3);
            ??? = this.rXl;
            a.f.b.j.o(???, "friendUnreadList");
            Collections.shuffle((List)???, new Random());
            if (localObject3 != null)
              this.rXl.add(0, localObject3);
            ??? = this.rXl;
            a.f.b.j.o(???, "friendUnreadList");
            synchronized ((Iterable)???)
            {
              localObject11 = ((Iterable)???).iterator();
              if (!((Iterator)localObject11).hasNext())
                break label490;
              ((ArrayList)???).add(((o)((Iterator)localObject11).next()).first);
            }
          }
          i++;
          continue;
        }
        ??? = y.AUy;
      }
      label484: int i = 0;
      continue;
      label490: Object localObject11 = y.AUy;
      if (((ArrayList)???).isEmpty())
      {
        ??? = this.rXk;
        a.f.b.j.o(???, "normalUnreadList");
        if (((Collection)???).isEmpty())
          break label676;
        i = 1;
        if (i != 0)
        {
          if (((com.tencent.mm.plugin.story.h.f)((o)this.rXk.get(0)).second).cBL() <= 0L)
            break label1020;
          ??? = (o)this.rXk.get(0);
          this.rXk.remove(???);
        }
      }
      label676: label682: label1020: 
      while (true)
      {
        if (??? != null)
          this.rXk.add(0, ???);
        ??? = this.rXk;
        a.f.b.j.o(???, "normalUnreadList");
        synchronized ((Iterable)???)
        {
          ??? = ((Iterable)???).iterator();
          if (!((Iterator)???).hasNext())
            break label682;
          ((ArrayList)???).add(((o)((Iterator)???).next()).first);
        }
        i = 0;
        break;
        ??? = y.AUy;
        ??? = new ArrayList();
        ??? = this.rXj;
        a.f.b.j.o(???, "readList");
        synchronized ((Iterable)???)
        {
          localObject11 = ((Iterable)???).iterator();
          if (((Iterator)localObject11).hasNext())
            ((ArrayList)???).add((o)((Iterator)localObject11).next());
        }
        localObject11 = y.AUy;
        ??? = new ArrayList();
        localObject11 = (List)???;
        if (((List)localObject11).size() > 1)
          a.a.j.a((List)localObject11, (Comparator)new d.i());
        synchronized ((Iterable)???)
        {
          localObject11 = ((Iterable)???).iterator();
          if (((Iterator)localObject11).hasNext())
            ((ArrayList)???).add(((o)((Iterator)localObject11).next()).first);
        }
        localObject11 = y.AUy;
        ??? = ((Iterable)???).iterator();
        while (((Iterator)???).hasNext())
        {
          localObject11 = (String)((Iterator)???).next();
          if (!localObject2.contains(localObject11))
            localObject2.add(localObject11);
        }
        localObject8 = ((Iterable)localObject7).iterator();
        while (((Iterator)localObject8).hasNext())
        {
          ??? = (String)((Iterator)localObject8).next();
          if (!localObject2.contains(???))
            localObject2.add(???);
        }
        localObject8 = this.rXb;
        if (localObject8 != null)
        {
          ((com.tencent.mm.plugin.story.api.k.a)localObject8).a((List)localObject2, (ArrayList)???);
          AppMethodBeat.o(109408);
        }
        while (true)
        {
          return;
          AppMethodBeat.o(109408);
        }
      }
      label1023: Object localObject8 = null;
      continue;
      label1028: localObject8 = null;
    }
  }

  private final void czt()
  {
    long l1 = 0L;
    AppMethodBeat.i(109409);
    long l2 = this.rXm - System.currentTimeMillis();
    if (l2 < 0L)
    {
      this.rXm = System.currentTimeMillis();
      l2 = l1;
    }
    while (true)
    {
      this.handler.removeCallbacks(this.rXo);
      this.handler.postDelayed(this.rXo, l2);
      AppMethodBeat.o(109409);
      return;
    }
  }

  public final boolean ZW(String paramString)
  {
    AppMethodBeat.i(109406);
    a.f.b.j.p(paramString, "username");
    if (this.rXn.get(paramString) == null)
    {
      Map localMap = this.rXn;
      a.f.b.j.o(localMap, "userUpdateMap");
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      localMap.put(paramString, j.a.cxU().aap(paramString));
    }
    paramString = (com.tencent.mm.plugin.story.h.f)this.rXn.get(paramString);
    boolean bool;
    if ((paramString != null) && (paramString.cBN()))
    {
      bool = true;
      AppMethodBeat.o(109406);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109406);
    }
  }

  public final void a(com.tencent.mm.plugin.story.api.k.a parama)
  {
    this.rXb = parama;
  }

  public final void a(String paramString, com.tencent.mm.sdk.e.m paramm)
  {
    AppMethodBeat.i(109413);
    if ((paramString != null) && (paramm != null) && ((paramm.obj instanceof com.tencent.mm.plugin.story.h.f)))
    {
      paramm = paramm.obj;
      if (paramm == null)
      {
        paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
        AppMethodBeat.o(109413);
        throw paramString;
      }
      paramm = (com.tencent.mm.plugin.story.h.f)paramm;
      if (!this.rXp.contains(paramm.getUserName()))
        AppMethodBeat.o(109413);
    }
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.sns.e.a.Xv(paramm.getUserName()))
      {
        AppMethodBeat.o(109413);
      }
      else
      {
        Map localMap = this.rXn;
        a.f.b.j.o(localMap, "userUpdateMap");
        localMap.put(paramm.getUserName(), paramm);
        if (a.f.b.j.j(paramString, "notify_story_read"))
        {
          ab.i(TAG, "update user " + paramm.getUserName() + ' ' + paramm.field_syncId + " as read");
          a(paramm.getUserName(), paramm);
          AppMethodBeat.o(109413);
        }
        else if (a.f.b.j.j(paramString, "notify_story_unread"))
        {
          ab.i(TAG, "update user " + paramm.getUserName() + ' ' + paramm.field_syncId + " as unread");
          a(paramm.getUserName(), paramm);
          AppMethodBeat.o(109413);
        }
        else if (a.f.b.j.j(paramString, "notify_story_preload"))
        {
          ab.i(TAG, "update user " + paramm.getUserName() + ' ' + paramm.field_syncId + " as preload " + paramm.cBL());
          a(paramm.getUserName(), paramm);
          AppMethodBeat.o(109413);
        }
        else if (a.f.b.j.j(paramString, "notify_story_invalid"))
        {
          ab.i(TAG, "update user " + paramm.getUserName() + " as invalid");
          a(paramm.getUserName(), paramm);
          AppMethodBeat.o(109413);
        }
        else
        {
          if (a.f.b.j.j(paramString, "notify_story_valid"))
          {
            ab.i(TAG, "update user " + paramm.getUserName() + " as valid");
            a(paramm.getUserName(), paramm);
          }
          AppMethodBeat.o(109413);
        }
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(109405);
    ab.i(TAG, "endSession " + this.talker + ' ' + hashCode());
    Object localObject = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject, "network()");
    ((com.tencent.mm.kernel.b)localObject).Rg().b(998, (com.tencent.mm.sdk.e.k.a)this);
    localObject = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().d((com.tencent.mm.sdk.e.k.a)this);
    localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class);
    a.f.b.j.o(localObject, "MMKernel.service(IChatroomService::class.java)");
    ((com.tencent.mm.plugin.chatroom.a.c)localObject).XV().d(this.rXr);
    this.handler.removeCallbacks(this.rXo);
    this.rXs.dead();
    AppMethodBeat.o(109405);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(109414);
    a.f.b.j.p(paramm, "scene");
    ab.i(TAG, "onSceneEnd " + paramInt1 + ", " + paramInt2 + ", " + paramString + ", " + paramm.getType());
    if ((paramm.getType() == 998) && ((paramm instanceof com.tencent.mm.plugin.story.model.a.c)))
      if ((a.f.b.j.j(((com.tencent.mm.plugin.story.model.a.c)paramm).gpx, this.talker) ^ true))
        AppMethodBeat.o(109414);
    while (true)
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((com.tencent.mm.plugin.story.model.a.c)paramm).ehh.acA();
        if (paramString == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryChatRoomSyncResponse");
          AppMethodBeat.o(109414);
          throw paramString;
        }
        paramString = (cdt)paramString;
        ab.i(TAG, "response: count " + paramString.xdu + ", interval " + paramString.xdw);
        paramString = com.tencent.mm.plugin.story.model.j.rST;
        this.rXm = j.a.cxV().abc(this.talker).field_nextSyncTime;
        czt();
        AppMethodBeat.o(109414);
      }
      else
      {
        paramString = com.tencent.mm.plugin.story.model.j.rST;
        this.rXm = j.a.cxV().abc(this.talker).field_nextSyncTime;
        czt();
        AppMethodBeat.o(109414);
      }
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(109404);
    this.cAY = true;
    this.handler.removeCallbacks(this.rXo);
    AppMethodBeat.o(109404);
  }

  public final void resume()
  {
    AppMethodBeat.i(109403);
    this.cAY = false;
    czt();
    com.tencent.mm.ab.b.a("StoryStateFetcher_checkExpire", (a.f.a.a)new c(this));
    AppMethodBeat.o(109403);
  }

  public final void start()
  {
    AppMethodBeat.i(109402);
    com.tencent.mm.ab.b.a("StoryStateFetcher_start", (a.f.a.a)new d.e(this));
    this.rXs.dnU();
    Object localObject = com.tencent.mm.kernel.g.RO();
    a.f.b.j.o(localObject, "network()");
    ((com.tencent.mm.kernel.b)localObject).Rg().a(998, (com.tencent.mm.sdk.e.k.a)this);
    localObject = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().a((com.tencent.mm.sdk.e.k.a)this, Looper.getMainLooper());
    localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.chatroom.a.c.class);
    a.f.b.j.o(localObject, "MMKernel.service(IChatroomService::class.java)");
    ((com.tencent.mm.plugin.chatroom.a.c)localObject).XV().c(this.rXr);
    AppMethodBeat.o(109402);
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/sync/StoryStateFetcher$Companion;", "", "()V", "TAG", "", "plugin-story_release"})
  public static final class a
  {
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class c extends a.f.b.k
    implements a.f.a.a<y>
  {
    c(d paramd)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.d
 * JD-Core Version:    0.6.2
 */