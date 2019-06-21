package com.tencent.mm.plugin.story.ui.view.gallery;

import a.k.m;
import a.l;
import a.o;
import a.y;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.C2CDownloadRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.i.g.a;
import com.tencent.mm.i.g.b;
import com.tencent.mm.i.h;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr;", "", "()V", "MAX_PRELOAD_TASK_LIMIT", "", "TAG", "", "clicfg_story_preload_force_canload", "getClicfg_story_preload_force_canload", "()I", "setClicfg_story_preload_force_canload", "(I)V", "clicfg_story_preload_force_preload", "getClicfg_story_preload_force_preload", "setClicfg_story_preload_force_preload", "clicfg_story_preload_strategy", "getClicfg_story_preload_strategy", "setClicfg_story_preload_strategy", "groupData", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$GroupData;", "lastFinishStoryId", "", "getLastFinishStoryId", "()J", "setLastFinishStoryId", "(J)V", "lastStoryId", "getLastStoryId", "setLastStoryId", "playingMediaId", "preLoadConfig", "Lcom/tencent/mm/plugin/story/ui/view/gallery/PreLoadConfig;", "getPreLoadConfig", "()Lcom/tencent/mm/plugin/story/ui/view/gallery/PreLoadConfig;", "setPreLoadConfig", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/PreLoadConfig;)V", "preloadFinishSet", "", "preloadInfoRatioSet", "", "preloadInfoSet", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "preloadRunningSet", "", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$TaskInfo;", "runningMediaId", "Ljava/lang/Long;", "selectMediaId", "totalPreLoadOneItemSelect", "getTotalPreLoadOneItemSelect", "setTotalPreLoadOneItemSelect", "addPreLoadTask", "", "quota", "fromTag", "connectionCount", "addPreloadVideo", "", "videoItemList", "", "downloadExpect", "calcPreloadPercent", "mediaId", "media", "Lcom/tencent/mm/protocal/protobuf/StoryMediaObj;", "cacheSecondsDowngrade", "isGoodNetwork", "cancelAllPreloadTask", "cancelPreloadTask", "videoItem", "checkCanPlay", "item", "checkPreLoad", "checkPreloadOnVideoPlay", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$MoovReadyInfo;", "createVideoPreloadCDNTask", "Lcom/tencent/mm/cdn/keep_VideoTaskInfo;", "url", "path", "preloadPercent", "getNetworkSpeed", "isBadNetwork", "isLocalVideo", "makrFinish", "storyId", "markCurrentPlay", "markOnVideoFirstFrameDraw", "needPreLoad", "onVideoSourceChange", "preloadVideoWithPercent", "percent", "taskInfo", "queryQuota", "setPreloadQueueFromGallery", "groupItems", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "positionV", "positionH", "skipPosition", "startPreLoad", "checkNet", "taskConnectionCount", "index", "upgrades", "GroupData", "MoovReadyInfo", "TaskInfo", "VideoPreloadTaskCallback", "VideoTaskCallTask", "plugin-story_release"})
public final class n
{
  private static long sbh;
  private static k spU;
  private static int spV;
  private static int spW;
  private static int spX;
  private static final Map<String, i> spY;
  private static final Map<String, Integer> spZ;
  private static final Set<String> sqa;
  private static final List<n.c> sqb;
  private static int sqc;
  private static n.a sqd;
  private static volatile String sqe;
  private static volatile Long sqf;
  private static long sqg;
  private static long sqh;
  public static final n sqi;

  static
  {
    AppMethodBeat.i(110904);
    sqi = new n();
    spU = new k();
    Object localObject = Collections.synchronizedMap((Map)new HashMap());
    a.f.b.j.o(localObject, "Collections.synchronized…tring, StoryVideoItem>())");
    spY = (Map)localObject;
    localObject = Collections.synchronizedMap((Map)new HashMap());
    a.f.b.j.o(localObject, "Collections.synchronized…p(HashMap<String, Int>())");
    spZ = (Map)localObject;
    localObject = Collections.synchronizedSet((Set)new HashSet());
    a.f.b.j.o(localObject, "Collections.synchronizedSet(HashSet<String>())");
    sqa = (Set)localObject;
    localObject = Collections.synchronizedList((List)new LinkedList());
    a.f.b.j.o(localObject, "Collections.synchronized…t(LinkedList<TaskInfo>())");
    sqb = (List)localObject;
    sqc = 3;
    sqd = new n.a((List)new ArrayList());
    AppMethodBeat.o(110904);
  }

  private static int Fl(int paramInt)
  {
    AppMethodBeat.i(110894);
    ab.i("MicroMsg.StoryVideoPreloadMgr", "taskConnectionCount: ".concat(String.valueOf(paramInt)));
    List localList = spU.soV;
    if (paramInt < spU.soV.size());
    while (true)
    {
      paramInt = ((Number)localList.get(paramInt)).intValue();
      AppMethodBeat.o(110894);
      return paramInt;
      paramInt = spU.soV.size() - 1;
    }
  }

  private static int a(String paramString, cek paramcek, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(110899);
    float f = paramcek.duration;
    ab.i("MicroMsg.StoryVideoPreloadMgr", "calcPreloadPercent, cacheSecondsDowngrade:" + paramInt + ", mediaId:" + paramString + ", duration:" + f + ", isGoodNetwork:" + paramBoolean + " media:" + paramcek.duration);
    int i;
    if (paramBoolean)
    {
      i = 5;
      if (f > 0.0F)
        break label135;
      paramInt = spU.soQ;
    }
    while (true)
    {
      i = paramInt;
      if (paramInt <= spU.soQ)
        i = spU.soQ;
      AppMethodBeat.o(110899);
      return i;
      i = 3;
      break;
      label135: if ((f <= i) && (paramInt <= 0))
        paramInt = 100;
      else
        paramInt = (int)(Math.max(3, paramInt) / f * 100.0D);
    }
  }

  private boolean a(i parami, int paramInt1, int paramInt2, n.c paramc)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(110893);
        a.f.b.j.p(parami, "videoItem");
        a.f.b.j.p(paramc, "taskInfo");
        if ((parami.cze()) || (bo.isNullOrNil(parami.rWj.Url)))
        {
          AppMethodBeat.o(110893);
          bool = false;
          return bool;
        }
        if (g(parami))
        {
          paramc = new java/lang/StringBuilder;
          paramc.<init>("preloadVideoWithPercent, isLocalVideo: ");
          ab.i("MicroMsg.StoryVideoPreloadMgr", parami.rWj.Url);
          AppMethodBeat.o(110893);
          bool = false;
          continue;
        }
        Object localObject1 = parami.rWj.Url;
        String str = paramc.fUL;
        Object localObject2 = s.rTV;
        localObject2 = s.a(parami);
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("preloadVideoWithPercent, ");
        ab.i("MicroMsg.StoryVideoPreloadMgr", str + ", " + paramInt1 + ", playingMediaId:" + sqe + ", " + ((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath + ", " + (String)localObject1 + "  videoCache " + localObject2);
        if ((str == null) || (m.I(sqe, str, false)))
          break label676;
        localObject3 = s.rTV;
        e.tf(s.aaF(parami.username));
        a.f.b.j.o(localObject1, "url");
        localObject2 = ((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath;
        a.f.b.j.o(localObject2, "videoCache.field_filePath");
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("createVideoPreloadCDNTask, mediaId:");
        ab.i("MicroMsg.StoryVideoPreloadMgr", str + ", path:" + (String)localObject2 + ", url:" + (String)localObject1 + ", preloadPercent:" + paramInt1 + ", connectionCount:" + paramInt2);
        localObject3 = new com/tencent/mm/i/h;
        ((h)localObject3).<init>();
        ((h)localObject3).field_mediaId = str;
        ((h)localObject3).url = ((String)localObject1);
        ((h)localObject3).egx = 2;
        ((h)localObject3).egD = 2;
        ((h)localObject3).egy = 6;
        ((h)localObject3).egI = paramInt1;
        ((h)localObject3).field_preloadRatio = paramInt1;
        ((h)localObject3).concurrentCount = 4;
        ((h)localObject3).field_fullpath = ((String)localObject2);
        localObject1 = new com/tencent/mm/plugin/story/ui/view/gallery/n$e;
        ((n.e)localObject1).<init>();
        ((h)localObject3).egl = ((g.a)localObject1);
        localObject1 = new com/tencent/mm/plugin/story/ui/view/gallery/n$d;
        ((n.d)localObject1).<init>(bo.yz());
        ((h)localObject3).egz = ((g.b)localObject1);
        ((h)localObject3).connectionCount = paramInt2;
        ((h)localObject3).field_fileType = com.tencent.mm.i.a.efK;
        ((h)localObject3).field_requestVideoFormat = d.v(2, (String)localObject2);
        f.afx().d((com.tencent.mm.i.g)localObject3);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>("preloadVideoWithPercent:");
        ab.i("MicroMsg.StoryVideoPreloadMgr", localObject3 + ", currentSpeed:" + CdnLogic.getRecentAverageSpeed(2));
        spY.put(str, parami);
        spZ.put(str, Integer.valueOf(paramInt1));
        parami = sqb.iterator();
        paramInt1 = 0;
        if (!parami.hasNext())
          break label657;
        if (a.f.b.j.j(((n.c)parami.next()).fUL, paramc.fUL))
        {
          if (paramInt1 <= 0)
            break label662;
          sqb.set(paramInt1, paramc);
          sqa.remove(str);
          bool = true;
          AppMethodBeat.o(110893);
          continue;
        }
      }
      finally
      {
      }
      paramInt1++;
      continue;
      label657: paramInt1 = -1;
      continue;
      label662: sqb.add(paramc);
      continue;
      label676: AppMethodBeat.o(110893);
      boolean bool = false;
    }
  }

  private static int b(i parami)
  {
    int i = 1;
    AppMethodBeat.i(110886);
    a.f.b.j.p(parami, "item");
    Object localObject = s.rTV;
    localObject = s.a(parami);
    if (((com.tencent.mm.plugin.story.h.n)localObject).cCd())
    {
      ab.v("MicroMsg.StoryVideoPreloadMgr", "z checkCanPlay downloadFinish " + parami.rUJ);
      AppMethodBeat.o(110886);
    }
    while (true)
    {
      return i;
      if (((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize <= 0)
      {
        AppMethodBeat.o(110886);
        i = 0;
      }
      else if (((com.tencent.mm.plugin.story.h.n)localObject).field_cacheSize / ((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize * 100.0F >= spU.soQ)
      {
        ab.v("MicroMsg.StoryVideoPreloadMgr", "z checkCanPlay cachesize " + ((com.tencent.mm.plugin.story.h.n)localObject).field_cacheSize + " totalSize: " + ((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize);
        AppMethodBeat.o(110886);
      }
      else
      {
        AppMethodBeat.o(110886);
        i = 0;
      }
    }
  }

  public static k cCM()
  {
    return spU;
  }

  private static List<Integer> cCN()
  {
    AppMethodBeat.i(110880);
    List localList;
    if (cCQ())
    {
      localList = spU.soU;
      AppMethodBeat.o(110880);
    }
    while (true)
    {
      return localList;
      localList = spU.soT;
      AppMethodBeat.o(110880);
    }
  }

  public static void cCO()
  {
    AppMethodBeat.i(110898);
    ab.c("MicroMsg.StoryVideoPreloadMgr", "cancelAllPreloadTask", new Object[0]);
    Iterator localIterator = spY.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ab.i("MicroMsg.StoryVideoPreloadMgr", "cancelAllPreloadTask ".concat(String.valueOf(str)));
      f.afx().rO(str);
    }
    spY.clear();
    spZ.clear();
    sqd = new n.a((List)new ArrayList());
    sqb.clear();
    AppMethodBeat.o(110898);
  }

  private static boolean cCP()
  {
    AppMethodBeat.i(110900);
    boolean bool;
    if (CdnLogic.getRecentAverageSpeed(2) >= spU.soR)
    {
      bool = true;
      AppMethodBeat.o(110900);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(110900);
    }
  }

  private static boolean cCQ()
  {
    boolean bool = true;
    AppMethodBeat.i(110901);
    int i = spU.soS;
    int j = CdnLogic.getRecentAverageSpeed(2);
    if (1 > j)
    {
      bool = false;
      AppMethodBeat.o(110901);
    }
    while (true)
    {
      return bool;
      if (i < j)
        break;
      AppMethodBeat.o(110901);
    }
  }

  public static int cCR()
  {
    AppMethodBeat.i(138954);
    int i = CdnLogic.getRecentAverageSpeed(2);
    AppMethodBeat.o(138954);
    return i;
  }

  private static boolean d(List<? extends List<com.tencent.mm.plugin.story.model.d.g>> arg0, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110881);
    a.f.b.j.p(???, "groupItems");
    ab.i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery, galleryItems size:" + ???.size() + ", positionV:" + paramInt1 + "  positionH:" + paramInt2 + ", skipPosition:true");
    Object localObject1 = sqd;
    a.f.b.j.p(???, "galleryItems");
    int i;
    if (((n.a)localObject1).dL(???))
    {
      i = 0;
      if (i == 0)
        break label129;
      AppMethodBeat.o(110881);
    }
    while (true)
    {
      return false;
      if ((((n.a)localObject1).sqs != paramInt2) || (((n.a)localObject1).sqr != paramInt1))
      {
        i = 0;
        break;
      }
      i = 1;
      break;
      label129: if ((paramInt1 >= 0) && (paramInt2 >= 0) && (paramInt1 < ???.size()) && (paramInt2 < ((List)???.get(paramInt1)).size()))
      {
        localObject1 = (com.tencent.mm.plugin.story.model.d.g)((List)???.get(paramInt1)).get(paramInt2);
        if (localObject1 != null)
        {
          localObject1 = ((com.tencent.mm.plugin.story.model.d.g)localObject1).rVZ;
          if (localObject1 != null)
            sqg = ((i)localObject1).rUJ;
        }
      }
      sbh = 0L;
      sqc = 0;
      sqd = new n.a(???, paramInt1, paramInt2, sqd);
      localObject1 = new ArrayList();
      Object localObject5;
      synchronized ((Iterable)???)
      {
        localObject4 = ((Iterable)???).iterator();
        for (i = 0; ((Iterator)localObject4).hasNext(); i++)
        {
          localObject5 = ((Iterator)localObject4).next();
          if (i < 0)
            a.a.j.dWs();
          localObject5 = (List)localObject5;
          if ((i >= paramInt1) && (((List)localObject5).size() > 0))
            ((ArrayList)localObject1).add(Integer.valueOf(((com.tencent.mm.plugin.story.model.d.g)((List)localObject5).get(0)).rVZ.cNE));
        }
        localObject4 = y.AUy;
        ??? = new ArrayList();
        if ((paramInt1 < ???.size()) && (paramInt2 < ((List)???.get(paramInt1)).size()))
        {
          i = ((List)???.get(paramInt1)).size();
          if (paramInt2 < i)
          {
            ((ArrayList)???).add(Integer.valueOf(((com.tencent.mm.plugin.story.model.d.g)((List)???.get(paramInt1)).get(paramInt2)).rVZ.cNE));
            paramInt2++;
          }
        }
      }
      Object localObject4 = (Iterable)sqb;
      ??? = (Collection)new ArrayList();
      Iterator localIterator = ((Iterable)localObject4).iterator();
      label573: 
      while (localIterator.hasNext())
      {
        localObject4 = localIterator.next();
        localObject5 = (n.c)localObject4;
        if ((!((ArrayList)localObject1).contains(Integer.valueOf(((n.c)localObject5).sqy.cNE))) && (!((ArrayList)???).contains(Integer.valueOf(((n.c)localObject5).sqy.cNE))));
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          if (paramInt1 == 0)
            break label573;
          ???.add(localObject4);
          break;
        }
      }
      synchronized ((Iterable)???)
      {
        localObject1 = ???.iterator();
        if (((Iterator)localObject1).hasNext())
          j(((n.c)((Iterator)localObject1).next()).sqy);
      }
      y localy = y.AUy;
      spV = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFZ, 1);
      paramInt2 = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGa, 450);
      i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGb, 200);
      spW = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGc, 0);
      spX = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGg, 100);
      spU.soR = paramInt2;
      spU.soS = i;
      paramInt1 = CdnLogic.getRecentAverageSpeed(2);
      ab.i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery clicfg_story_preload_strategy " + spV + " clicfg_story_preload_speed_good:" + paramInt2 + " clicfg_story_preload_speed_bad:" + i + " clicfg_story_preload_force_preload " + spW + "  clicfg_story_preload_force_canload: " + spX + " speed:" + paramInt1);
      if ((paramInt1 > 0) && (spX > 0) && (paramInt1 < spX))
      {
        ab.w("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery speed too low then pass " + paramInt1 + " clicfg_story_preload_force_canload: " + spX);
        ??? = new LinkedList();
        ???.addAll((Collection)sqb);
        ??? = ???.iterator();
        while (???.hasNext())
          j(((n.c)???.next()).sqy);
      }
      AppMethodBeat.o(110881);
    }
  }

  private static boolean g(i parami)
  {
    boolean bool = true;
    AppMethodBeat.i(110892);
    if (parami.cze())
      AppMethodBeat.o(110892);
    while (true)
    {
      return bool;
      s locals = s.rTV;
      if (e.asZ(s.a(parami.rWj)) > 0L)
      {
        ab.i("MicroMsg.StoryVideoPreloadMgr", "isLocalVideo video downloadDone " + parami.rWj.cNE + " username:" + parami.username);
        AppMethodBeat.o(110892);
      }
      else
      {
        locals = s.rTV;
        if (s.a(parami).cCd())
        {
          ab.i("MicroMsg.StoryVideoPreloadMgr", " isLocalVideo video download finish " + parami.rWj.cNE + " username:" + parami.username);
          AppMethodBeat.o(110892);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(110892);
        }
      }
    }
  }

  public static void h(i parami)
  {
    AppMethodBeat.i(110895);
    a.f.b.j.p(parami, "videoItem");
    Object localObject = s.rTV;
    localObject = s.be(parami.fDG, parami.rWj.Url);
    sqe = (String)localObject;
    sqf = Long.valueOf(parami.rUJ);
    ab.i("MicroMsg.StoryVideoPreloadMgr", "markCurrentPlay:" + sqe + " then remove it from preload");
    Iterator localIterator = ((Iterable)sqb).iterator();
    while (localIterator.hasNext())
    {
      parami = localIterator.next();
      if (a.f.b.j.j(localObject, ((n.c)parami).fUL))
      {
        parami = (n.c)parami;
        if (parami == null)
          break label156;
        sqb.remove(parami);
        j(parami.sqy);
        AppMethodBeat.o(110895);
      }
    }
    while (true)
    {
      return;
      parami = null;
      break;
      label156: AppMethodBeat.o(110895);
    }
  }

  public static n.b i(i parami)
  {
    AppMethodBeat.i(110896);
    a.f.b.j.p(parami, "videoItem");
    Object localObject1 = s.rTV;
    localObject1 = s.be(parami.fDG, parami.rWj.Url);
    ab.i("MicroMsg.StoryVideoPreloadMgr", "checkPreloadOnVideoPlay:".concat(String.valueOf(localObject1)));
    Object localObject2 = s.rTV;
    localObject2 = s.a(parami);
    if ((((com.tencent.mm.plugin.story.h.n)localObject2).field_cacheSize > 0) && (((com.tencent.mm.plugin.story.h.n)localObject2).field_totalSize > 0))
    {
      float f = ((com.tencent.mm.plugin.story.h.n)localObject2).field_cacheSize / ((com.tencent.mm.plugin.story.h.n)localObject2).field_totalSize;
      ab.i("MicroMsg.StoryVideoPreloadMgr", "hit cache, mediaId:" + (String)localObject1 + ", cachePercent:" + f + ", filePath:" + ((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath);
      String str = ((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath;
      CdnLogic.C2CDownloadRequest localC2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
      localObject2 = new long[2];
      localC2CDownloadRequest.fileKey = ((String)localObject1);
      localC2CDownloadRequest.fileType = 6;
      localC2CDownloadRequest.url = parami.rWj.Url;
      localC2CDownloadRequest.savePath = str;
      boolean bool = CdnLogic.queryVideoMoovInfo(localC2CDownloadRequest, (long[])localObject2);
      ab.i("MicroMsg.StoryVideoPreloadMgr", (String)localObject1 + " queryMoovReady: " + bool + ", offset:" + localObject2[0] + ", length:" + localObject2[1] + ", preloadFinish:" + a.a.j.a((Iterable)sqa, localObject1));
      parami = new n.b(true, localObject2[0], localObject2[1], a.a.j.a((Iterable)sqa, localObject1));
      AppMethodBeat.o(110896);
    }
    while (true)
    {
      return parami;
      ab.i("MicroMsg.StoryVideoPreloadMgr", (String)localObject1 + " not hit cache or moov not ready");
      parami = new n.b(false, 0L, 0L, false);
      AppMethodBeat.o(110896);
    }
  }

  private static void j(i parami)
  {
    AppMethodBeat.i(110897);
    a.f.b.j.p(parami, "videoItem");
    Object localObject = s.rTV;
    localObject = s.be(parami.fDG, parami.rWj.Url);
    ab.i("MicroMsg.StoryVideoPreloadMgr", "cancelPreloadTask, videoItem:".concat(String.valueOf(localObject)));
    f.afx().rO((String)localObject);
    Iterator localIterator = ((Iterable)sqb).iterator();
    while (localIterator.hasNext())
    {
      parami = localIterator.next();
      if (a.f.b.j.j(((n.c)parami).fUL, localObject))
      {
        parami = (n.c)parami;
        if (parami == null)
          break label142;
        sqb.remove(parami);
        if (sqc > 0)
          sqc -= 1;
        AppMethodBeat.o(110897);
      }
    }
    while (true)
    {
      return;
      parami = null;
      break;
      label142: AppMethodBeat.o(110897);
    }
  }

  private static boolean k(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(110903);
    if ((g(parami)) || (parami.cze()))
    {
      ab.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo fail, " + parami + " isLocalVideo or fake video");
      AppMethodBeat.o(110903);
    }
    while (true)
    {
      return bool;
      Object localObject = s.rTV;
      localObject = s.be(parami.fDG, parami.rWj.Url);
      if ((!bo.isNullOrNil((String)localObject)) && (!bo.isNullOrNil(parami.rWj.Url)) && (!m.I(sqe, (String)localObject, false)))
      {
        bool = true;
        AppMethodBeat.o(110903);
      }
      else
      {
        ab.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo:" + (String)localObject + ", already request preload or url " + parami.rWj.Url);
        AppMethodBeat.o(110903);
      }
    }
  }

  private final boolean l(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(110888);
    n localn = (n)this;
    Object localObject1 = sqd;
    int i = 0;
    o localo = null;
    while ((i < ((n.a)localObject1).sqq.size()) && (localo == null))
    {
      localo = ((n.a)localObject1).cCV();
      ab.i(n.a.TAG, "produceVideoItem walkVertical:" + ((n.a)localObject1).sqk + "  walkHorizontal:" + ((n.a)localObject1).sqm + " positionV:" + ((n.a)localObject1).sqr + " positionH:" + ((n.a)localObject1).sqs + ", ret:" + localo);
      i++;
    }
    boolean bool;
    if (localo == null)
    {
      bool = false;
      AppMethodBeat.o(110888);
    }
    while (true)
    {
      return bool;
      i locali = (i)localo.first;
      String str = ((n.c)localo.second).fUL;
      localObject1 = new StringBuilder("try preload mediaId ").append(str).append(" videoItem:").append(locali).append(" pos:").append((n.c)localo.second).append("  groupinfo ");
      Object localObject2 = sqd;
      ab.i("MicroMsg.StoryVideoPreloadMgr", new StringBuilder("positionV:").append(((n.a)localObject2).sqr).append(", positionH:").append(((n.a)localObject2).sqs).append(", walkVertical:").append(((n.a)localObject2).sqk).append(", walkHorizontal:").append(((n.a)localObject2).sqm).toString() + " quota:" + paramInt1 + "  fromTag:" + paramString);
      localObject2 = ((Iterable)sqb).iterator();
      do
      {
        if (!((Iterator)localObject2).hasNext())
          break;
        localObject1 = ((Iterator)localObject2).next();
      }
      while (!a.f.b.j.j(((n.c)localObject1).fUL, str));
      while (true)
      {
        localObject1 = (n.c)localObject1;
        if ((localObject1 == null) || (paramInt1 > ((n.c)localObject1).ehE))
          break label452;
        ab.i("MicroMsg.StoryVideoPreloadMgr", "no need add quota " + paramInt1 + " cur:" + ((n.c)localObject1).ehE + " fromTag:" + paramString);
        break;
        localObject1 = null;
      }
      label452: if (((CharSequence)str).length() == 0)
      {
        i = 1;
        label468: if (i != 0)
          break label638;
      }
      label638: for (localObject1 = str; ; localObject1 = null)
      {
        if (localObject1 == null)
          break label642;
        i = a(str, locali.rWj, paramInt1, cCP());
        localObject1 = s.rTV;
        localObject1 = s.a(locali);
        if ((!((com.tencent.mm.plugin.story.h.n)localObject1).cCd()) && (((com.tencent.mm.plugin.story.h.n)localObject1).field_cacheSize / ((com.tencent.mm.plugin.story.h.n)localObject1).field_totalSize * 100.0F < i))
          break label644;
        ab.i("MicroMsg.StoryVideoPreloadMgr", "pull preload video, " + str + ", already reach cache size! cacheSize:" + ((com.tencent.mm.plugin.story.h.n)localObject1).field_cacheSize + ", totalSize:" + ((com.tencent.mm.plugin.story.h.n)localObject1).field_totalSize + ", cachePercent:" + ((com.tencent.mm.plugin.story.h.n)localObject1).field_cacheSize / ((com.tencent.mm.plugin.story.h.n)localObject1).field_totalSize * 100.0F + "  fromTag:" + paramString);
        break;
        i = 0;
        break label468;
      }
      label642: break;
      label644: if (!localn.a(locali, i, paramInt2, (n.c)localo.second))
        break;
      ((n.c)localo.second).ehE = paramInt1;
      bool = true;
      AppMethodBeat.o(110888);
    }
  }

  private final void lV(boolean paramBoolean)
  {
    int i = 1;
    AppMethodBeat.i(110887);
    boolean bool1 = cCP();
    boolean bool2 = cCQ();
    int j = CdnLogic.getRecentAverageSpeed(2);
    if ((paramBoolean) && (j > 0) && (spX > 0) && (j < spX))
    {
      ab.w("MicroMsg.StoryVideoPreloadMgr", "speed too low then pass " + j + " clicfg_story_preload_force_canload: " + spX + " callerFrom " + an.doQ());
      AppMethodBeat.o(110887);
      return;
    }
    int k = 0;
    if (bool2);
    for (j = 1; ; j = 3)
    {
      if (spV == 1)
        j = i;
      while (true)
      {
        ab.i("MicroMsg.StoryVideoPreloadMgr", "startPreloadQueue, isGoodNetwork:" + bool1 + ", isBadNetwork:" + bool2 + ", currentSpeed:" + CdnLogic.getRecentAverageSpeed(2) + " preloadRunningSet " + sqb.size() + " maxTaskNum " + j + " totalPreLoadOneItemSelect " + sqc + " checkNet " + paramBoolean + " callerFrom " + an.doQ());
        List localList = cCN();
        while ((sqb.size() < j) && (k < localList.size()) && (sqc < 3) && (l(((Number)localList.get(k)).intValue(), "startPreLoad", Fl(k))))
        {
          sqc += 1;
          k++;
        }
        ab.i("MicroMsg.StoryVideoPreloadMgr", "startPreloadQueue finish loop preload queue, current queue size: " + sqb.size() + ", pullPreloadTaskNum:0, preloadVideoNum:" + k + " preloadRunningSet " + sqb.size() + " totalPreLoadOneItemSelect " + sqc + ' ');
        AppMethodBeat.o(110887);
        break;
      }
    }
  }

  public static void q(List<i> paramList, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(110890);
    a.f.b.j.p(paramList, "videoItemList");
    ab.c("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList " + paramList.size(), new Object[0]);
    boolean bool1 = cCP();
    boolean bool2 = cCQ();
    ab.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, isGoodNetwork:" + bool1 + ", isBadNetwork:" + bool2 + ", currentSpeed:" + CdnLogic.getRecentAverageSpeed(2) + " preloadRunningSet " + sqb.size() + " downloadExpect " + paramInt);
    List localList = cCN();
    while (true)
    {
      i locali;
      int j;
      int k;
      String str;
      int m;
      com.tencent.mm.plugin.story.h.n localn;
      synchronized ((Iterable)paramList)
      {
        Iterator localIterator1 = ???.iterator();
        if (!localIterator1.hasNext())
          break;
        locali = (i)localIterator1.next();
        if (!k(locali))
          continue;
        if (paramInt > 0)
        {
          j = paramInt;
          k = Fl(i);
          paramList = s.rTV;
          str = s.be(locali.fDG, locali.rWj.Url);
          m = a(str, locali.rWj, j, cCP());
          paramList = s.rTV;
          localn = s.a(locali);
          Iterator localIterator2 = ((Iterable)sqb).iterator();
          if (!localIterator2.hasNext())
            break label386;
          paramList = localIterator2.next();
          if (!a.f.b.j.j(((n.c)paramList).fUL, str))
            continue;
          if (paramList == null)
            break label391;
          paramList = new java/lang/StringBuilder;
          paramList.<init>("addPreloadVideo withList, ");
          ab.i("MicroMsg.StoryVideoPreloadMgr", str + ", already prealoding!");
        }
      }
      if (i < localList.size())
      {
        j = ((Number)localList.get(i)).intValue();
      }
      else
      {
        j = ((Number)a.a.j.fL(localList)).intValue();
        continue;
        label386: paramList = null;
        continue;
        label391: if ((localn.cCd()) || (localn.field_cacheSize / localn.field_totalSize * 100.0F >= m))
        {
          paramList = new java/lang/StringBuilder;
          paramList.<init>("addPreloadVideo withList, ");
          ab.i("MicroMsg.StoryVideoPreloadMgr", str + ", already reach cache size! cacheSize:" + localn.field_cacheSize + ", totalSize:" + localn.field_totalSize + ", cachePercent:" + localn.field_cacheSize / localn.field_totalSize * 100.0F);
        }
        else
        {
          paramList = new com/tencent/mm/plugin/story/ui/view/gallery/n$c;
          paramList.<init>(0, i, locali, j, k);
          if (sqi.a(locali, m, k, paramList))
            i++;
        }
      }
    }
    paramList = y.AUy;
    ab.i("MicroMsg.StoryVideoPreloadMgr", "finish addPreloadVideo withList, total pull video task:" + i + " preloadRunningSet " + sqb.size());
    AppMethodBeat.o(110890);
  }

  public final void f(i parami)
  {
    AppMethodBeat.i(110885);
    a.f.b.j.p(parami, "item");
    ab.i("MicroMsg.StoryVideoPreloadMgr", "checkPreLoad " + parami + ' ' + an.doQ());
    if (g(parami))
    {
      ab.i("MicroMsg.StoryVideoPreloadMgr", "checkPreLoad checkCanPlay isLocalVideo");
      lV(false);
      AppMethodBeat.o(110885);
    }
    while (true)
    {
      return;
      if (b(parami) == 1)
      {
        ab.i("MicroMsg.StoryVideoPreloadMgr", "checkPreLoad checkCanPlay true");
        lV(true);
        AppMethodBeat.o(110885);
      }
      else
      {
        if (spW == 1)
          lV(true);
        ab.i("MicroMsg.StoryVideoPreloadMgr", "nothing can checkPreLoad");
        AppMethodBeat.o(110885);
      }
    }
  }

  public final void lA(long paramLong)
  {
    AppMethodBeat.i(110883);
    if (sbh == paramLong)
      AppMethodBeat.o(110883);
    while (true)
    {
      return;
      sbh = paramLong;
      if (spV == 0)
      {
        AppMethodBeat.o(110883);
      }
      else
      {
        n.a locala = sqd;
        if (locala != null)
          locala.cCW();
        lV(true);
        AppMethodBeat.o(110883);
      }
    }
  }

  public final void lB(long paramLong)
  {
    AppMethodBeat.i(110884);
    Object localObject = sqf;
    if (localObject == null);
    label126: 
    while (true)
    {
      if (sqh == paramLong)
        AppMethodBeat.o(110884);
      while (true)
      {
        return;
        if (((Long)localObject).longValue() != paramLong)
          break label126;
        sqf = Long.valueOf(0L);
        break;
        sqh = paramLong;
        if (spV == 0)
        {
          AppMethodBeat.o(110884);
        }
        else if (spX == 0)
        {
          AppMethodBeat.o(110884);
        }
        else if (sqb.size() > 0)
        {
          AppMethodBeat.o(110884);
        }
        else
        {
          localObject = sqd;
          if (localObject != null)
            ((n.a)localObject).cCW();
          lV(false);
          AppMethodBeat.o(110884);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.n
 * JD-Core Version:    0.6.2
 */