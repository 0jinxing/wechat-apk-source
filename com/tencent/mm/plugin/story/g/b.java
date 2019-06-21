package com.tencent.mm.plugin.story.g;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.plugin.story.ui.view.gallery.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryBrowseDetailIDKeyStat;", "", "()V", "ID", "", "TAG", "", "isWaiting", "", "isWifi", "lastStoryId", "last_selectedColumn", "", "last_selectedRow", "markGalleryItem", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "markStoryId", "onClickTime", "onCreateTime", "onPlayUser", "onResumeTime", "onSelectItemReport", "onStoryLauncherTime", "preLoadInfo", "Lcom/tencent/mm/plugin/story/report/StoryBrowseDetailIDKeyStat$Info;", "storyIdsState", "", "unReadList", "Ljava/util/ArrayList;", "withCache", "canPlay", "", "user", "storyId", "chatting", "clickScene", "checkCanPlay", "item", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "cacheSecondsDowngrade", "checkReport", "checkStayTime", "checkUnRead", "clean", "downloadEnd", "enter", "list", "", "finish", "initID", "markInit", "markResumeTime", "netSpeed", "speed", "onDestroy", "onSelectItem", "group", "selectedRow", "selectedColumn", "onVideoEnd", "onVideoPlay", "onVideoWaiting", "playUser", "preLoadVideo", "galleryItem", "extinfo", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "preloadWithCache", "report", "IID", "key", "mval", "startDownload", "isAll", "startHttp", "Info", "State", "plugin-story_release"})
public final class b
{
  private static boolean isWaiting;
  public static long lhy;
  public static boolean mgU;
  public static long sbh;
  public static final Map<Long, b.a> sbi;
  public static b.a sbj;
  public static long sbk;
  private static long sbl;
  private static long sbm;
  public static com.tencent.mm.plugin.story.model.d.g sbn;
  public static boolean sbo;
  public static long sbp;
  private static long sbq;
  private static long sbr;
  private static int sbs;
  private static int sbt;
  private static boolean sbu;
  private static ArrayList<String> sbv;
  public static final b sbw;

  static
  {
    AppMethodBeat.i(109780);
    sbw = new b();
    lhy = 998L;
    mgU = true;
    Map localMap = Collections.synchronizedMap((Map)new HashMap());
    a.f.b.j.o(localMap, "Collections.synchronizedMap(HashMap<Long, Info>())");
    sbi = localMap;
    AppMethodBeat.o(109780);
  }

  public static void EV(int paramInt)
  {
    if ((paramInt == 1) || (paramInt == 2))
      lhy = 998L;
    while (true)
    {
      return;
      if (paramInt == 3)
        lhy = 1006L;
      else
        lhy = -1L;
    }
  }

  public static void EW(int paramInt)
  {
    AppMethodBeat.i(109771);
    long l = bo.gb(sbr);
    ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "cur speed " + paramInt + " cur: " + l);
    if (l > 5000L)
      if (paramInt < 10)
      {
        l(lhy, 82L, 1L);
        AppMethodBeat.o(109771);
      }
    while (true)
    {
      return;
      if (paramInt < 100)
      {
        l(lhy, 83L, 1L);
        AppMethodBeat.o(109771);
      }
      else if (paramInt < 200)
      {
        l(lhy, 89L, 1L);
        AppMethodBeat.o(109771);
      }
      else if (paramInt < 250)
      {
        l(lhy, 84L, 1L);
        AppMethodBeat.o(109771);
      }
      else if (paramInt < 450)
      {
        l(lhy, 85L, 1L);
        AppMethodBeat.o(109771);
      }
      else if (paramInt < 900)
      {
        l(lhy, 86L, 1L);
        AppMethodBeat.o(109771);
      }
      else if (paramInt < 1350)
      {
        l(lhy, 87L, 1L);
        AppMethodBeat.o(109771);
      }
      else
      {
        if (paramInt < 1800)
          l(lhy, 88L, 1L);
        AppMethodBeat.o(109771);
      }
    }
  }

  public static boolean aiG()
  {
    boolean bool = false;
    if (sbr <= 0L);
    while (true)
    {
      return bool;
      if (mgU)
        bool = true;
    }
  }

  private static int b(i parami)
  {
    int i = 1;
    AppMethodBeat.i(109773);
    Object localObject = s.rTV;
    localObject = s.a(parami);
    if (((com.tencent.mm.plugin.story.h.n)localObject).cCd())
    {
      ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "z checkCanPlay downloadFinish " + parami.rUJ);
      AppMethodBeat.o(109773);
    }
    while (true)
    {
      return i;
      if (((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize <= 0)
      {
        AppMethodBeat.o(109773);
        i = 0;
      }
      else
      {
        float f = ((com.tencent.mm.plugin.story.h.n)localObject).field_cacheSize / ((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize;
        parami = com.tencent.mm.plugin.story.ui.view.gallery.n.sqi;
        if (f * 100.0F >= com.tencent.mm.plugin.story.ui.view.gallery.n.cCM().soQ)
        {
          ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "z checkCanPlay cachesize " + ((com.tencent.mm.plugin.story.h.n)localObject).field_cacheSize + " totalSize: " + ((com.tencent.mm.plugin.story.h.n)localObject).field_totalSize);
          AppMethodBeat.o(109773);
        }
        else
        {
          AppMethodBeat.o(109773);
          i = 0;
        }
      }
    }
  }

  public static void b(ArrayList<ArrayList<com.tencent.mm.plugin.story.model.d.g>> paramArrayList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109772);
    a.f.b.j.p(paramArrayList, "group");
    if (!aiG())
    {
      AppMethodBeat.o(109772);
      return;
    }
    ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", " last_selectedColumn:" + sbt + ",last_selectedRow:" + sbs + " selectedRow:" + paramInt1 + ",selectedColumn:" + paramInt2);
    int i;
    label138: int j;
    if (paramArrayList.size() > 0)
      if ((((ArrayList)paramArrayList.get(paramInt1)).size() > 0) && (paramInt2 + 1 < ((ArrayList)paramArrayList.get(paramInt1)).size()))
      {
        if (!sbu)
          l(lhy, 101L, 1L);
        i = 1;
        if (paramInt1 + 1 < paramArrayList.size())
        {
          if (!sbu)
            l(lhy, 102L, 1L);
          j = 1;
          label167: sbu = true;
        }
      }
    while (true)
    {
      if ((sbt != -1) && (sbs != -1))
      {
        if (isWaiting)
        {
          l(lhy, 100L, 1L);
          isWaiting = false;
        }
        if (paramInt1 != sbs)
        {
          if (i != 0)
            l(lhy, 105L, 1L);
          l(lhy, 106L, 1L);
          i = paramInt1 - sbs;
          if (i == 1)
          {
            l(lhy, 110L, 1L);
            if (paramArrayList.size() <= 0)
              break label584;
            i = 0;
            label266: if (i >= 3)
              break label584;
            if ((paramInt1 + i < paramArrayList.size()) && (((ArrayList)paramArrayList.get(paramInt1 + i)).size() > 0))
            {
              i locali = ((com.tencent.mm.plugin.story.model.d.g)((ArrayList)paramArrayList.get(paramInt1 + i)).get(0)).rVZ;
              if ((locali != null) && (locali.username != null) && (sbv != null))
              {
                ArrayList localArrayList = sbv;
                if ((localArrayList != null) && (localArrayList.contains(locali.username) == true))
                {
                  if (b(locali) == 1)
                  {
                    if (i != 0)
                      break label459;
                    l(lhy, 120L, 1L);
                  }
                  label385: if (i != 0)
                    break label495;
                  l(lhy, 125L, 1L);
                }
              }
            }
          }
          while (true)
          {
            i++;
            break label266;
            if (i == 2)
            {
              l(lhy, 111L, 1L);
              break;
            }
            if (i == 3)
            {
              l(lhy, 112L, 1L);
              break;
            }
            if (i < 4)
              break;
            l(lhy, 113L, 1L);
            break;
            label459: if (i == 1)
            {
              l(lhy, 121L, 1L);
              break label385;
            }
            if (i != 2)
              break label385;
            l(lhy, 122L, 1L);
            break label385;
            label495: if (i == 1)
              l(lhy, 126L, 1L);
            else if (i == 2)
              l(lhy, 127L, 1L);
          }
        }
        else if (paramInt2 != sbt)
        {
          if (j != 0)
            l(lhy, 103L, 1L);
          l(lhy, 104L, 1L);
          i = paramInt2 - sbt;
          if (i != 1)
            break label958;
          l(lhy, 115L, 1L);
        }
      }
      while (true)
      {
        label584: if ((sbs >= 0) && (sbs < paramArrayList.size()) && (sbt >= 0) && (sbt < ((ArrayList)paramArrayList.get(sbs)).size()) && ((sbt != paramInt2) || (sbs != paramInt1)))
        {
          long l = ((com.tencent.mm.plugin.story.model.d.g)((ArrayList)paramArrayList.get(sbs)).get(sbt)).rVZ.rUJ;
          ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "checkStayTime storyId " + l + " lastStoryId " + sbh);
          if ((aiG()) && (sbi.containsKey(Long.valueOf(l))))
          {
            paramArrayList = (b.a)sbi.get(Long.valueOf(l));
            if ((paramArrayList != null) && (paramArrayList.sbx <= 0L) && (!paramArrayList.rmk) && (paramArrayList.sby >= 0L))
            {
              paramArrayList.sbx = bo.gb(paramArrayList.sby);
              ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "checkStayTime onStayTime " + l + ' ' + paramArrayList.sbx + " hasHttp:" + paramArrayList.sbA + "  isWaiting:" + paramArrayList.isWaiting);
              if (paramArrayList.sbA)
              {
                l(lhy, 21L, 1L);
                l(lhy, 20L, paramArrayList.sbx);
              }
              if (paramArrayList.isWaiting)
              {
                l(lhy, 23L, 1L);
                l(lhy, 22L, paramArrayList.sbx);
              }
              l(lhy, 25L, 1L);
              l(lhy, 24L, paramArrayList.sbx);
              if (paramArrayList.eTf)
                l(lhy, 26L, 1L);
            }
          }
        }
        sbt = paramInt2;
        sbs = paramInt1;
        AppMethodBeat.o(109772);
        break;
        label958: if (i == 2)
          l(lhy, 116L, 1L);
        else if (i == 3)
          l(lhy, 117L, 1L);
        else if (i >= 4)
          l(lhy, 118L, 1L);
      }
      j = 0;
      break label167;
      i = 0;
      break label138;
      j = 0;
      i = 0;
    }
  }

  public static void clean()
  {
    AppMethodBeat.i(109769);
    sbl = 0L;
    sbm = 0L;
    sbr = 0L;
    sbu = false;
    sbs = -1;
    sbt = -1;
    sbp = 0L;
    sbq = 0L;
    sbi.clear();
    sbo = false;
    sbn = null;
    isWaiting = false;
    sbv = new ArrayList();
    sbj = null;
    AppMethodBeat.o(109769);
  }

  public static void czQ()
  {
    sbo = true;
  }

  public static void czR()
  {
    AppMethodBeat.i(109777);
    ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "makeResumeTime onResumeTime " + sbl + " onPlayUser " + sbm);
    sbl = bo.anU();
    AppMethodBeat.o(109777);
  }

  public static void czS()
  {
    AppMethodBeat.i(109779);
    sbr = bo.anU();
    AppMethodBeat.o(109779);
  }

  public static void dF(List<String> paramList)
  {
    AppMethodBeat.i(109770);
    a.f.b.j.p(paramList, "list");
    ArrayList localArrayList = new ArrayList();
    sbv = localArrayList;
    localArrayList.addAll((Collection)paramList);
    AppMethodBeat.o(109770);
  }

  public static void j(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(109778);
    a.f.b.j.p(paramString, "user");
    if (!aiG())
      AppMethodBeat.o(109778);
    while (true)
    {
      return;
      if ((sbp > 0L) && (sbq <= 0L))
      {
        sbq = bo.gb(sbp);
        l(lhy, 130L, 1L);
        l(lhy, 131L, sbq);
      }
      ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "playUser user " + paramString + " storyId " + paramLong + " selectedColumn " + paramInt + " lastStoryId:" + sbh + " onStoryLauncherTime " + sbq);
      int i = 0;
      int j = i;
      if (sbh != paramLong)
      {
        j = i;
        if (sbh != 0L)
          j = 1;
      }
      long l = sbh;
      sbh = paramLong;
      a.f.b.j.p(paramString, "user");
      Object localObject = sbv;
      if ((localObject != null) && (((ArrayList)localObject).contains(paramString) == true));
      for (i = 1; ; i = 0)
      {
        if (i != 0)
          break label228;
        AppMethodBeat.o(109778);
        break;
      }
      label228: if ((sbi.containsKey(Long.valueOf(l))) && (j != 0))
      {
        localObject = (b.a)sbi.get(Long.valueOf(l));
        if (localObject != null)
          ((b.a)localObject).rmk = true;
      }
      if (paramInt > 0)
      {
        AppMethodBeat.o(109778);
      }
      else
      {
        Map localMap = sbi;
        localObject = new b.a(paramString, b.b.sbE);
        ((b.a)localObject).sby = bo.anU();
        localMap.put(Long.valueOf(paramLong), localObject);
        sbm = bo.anU();
        ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "playUser onResumeTime " + sbm);
        localObject = com.tencent.mm.plugin.story.model.j.rST;
        localObject = j.a.cxU().aap(paramString);
        ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "preLoadCache > 0 then " + paramString + " preload " + bo.ga(((f)localObject).cBL()));
        l(lhy, 2L, 1L);
        if (((f)localObject).cBL() > 0L)
          l(lhy, 3L, 1L);
        if (paramLong == sbk)
        {
          if (sbo)
          {
            l(lhy, 6L, 1L);
            label468: if (((f)localObject).cBL() > 0L)
            {
              if (!sbo)
                break label551;
              l(lhy, 7L, 1L);
            }
          }
          while (true)
          {
            paramString = sbn;
            if (paramString == null)
              break label583;
            if (b(paramString.rVZ) != 1)
              break label574;
            if (!sbo)
              break label564;
            l(lhy, 8L, 1L);
            AppMethodBeat.o(109778);
            break;
            l(lhy, 9L, 1L);
            break label468;
            label551: l(lhy, 10L, 1L);
          }
          label564: l(lhy, 11L, 1L);
          label574: AppMethodBeat.o(109778);
        }
        else
        {
          label583: AppMethodBeat.o(109778);
        }
      }
    }
  }

  public static void l(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(109768);
    if (paramLong1 < 0L)
      AppMethodBeat.o(109768);
    while (true)
    {
      return;
      h.pYm.k(paramLong1, paramLong2, paramLong3);
      AppMethodBeat.o(109768);
    }
  }

  public static void lj(long paramLong)
  {
    sbk = paramLong;
  }

  public static void lk(long paramLong)
  {
    AppMethodBeat.i(109776);
    if (!sbi.containsKey(Long.valueOf(paramLong)))
      AppMethodBeat.o(109776);
    while (true)
    {
      return;
      b.a locala = (b.a)sbi.get(Long.valueOf(paramLong));
      if ((locala != null) && (locala.rmk))
      {
        AppMethodBeat.o(109776);
      }
      else if (paramLong == sbk)
      {
        locala = sbj;
        if (locala != null)
        {
          if (locala.sbB <= 0L)
          {
            AppMethodBeat.o(109776);
          }
          else
          {
            paramLong = bo.gb(locala.sbB);
            ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "downloadEnd1 ".concat(String.valueOf(paramLong)));
            if (locala.koC)
            {
              l(lhy, 62L, 1L);
              l(lhy, 63L, paramLong);
            }
            l(lhy, 60L, 1L);
            l(lhy, 61L, paramLong);
            AppMethodBeat.o(109776);
          }
        }
        else
          AppMethodBeat.o(109776);
      }
      else
      {
        locala = (b.a)sbi.get(Long.valueOf(paramLong));
        if (locala != null)
        {
          if (locala.sbB <= 0L)
          {
            AppMethodBeat.o(109776);
          }
          else
          {
            paramLong = bo.gb(locala.sbB);
            ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "downloadEnd2 ".concat(String.valueOf(paramLong)));
            if (locala.koC)
            {
              l(lhy, 62L, 1L);
              l(lhy, 63L, paramLong);
            }
            l(lhy, 60L, 1L);
            l(lhy, 61L, paramLong);
            AppMethodBeat.o(109776);
          }
        }
        else
          AppMethodBeat.o(109776);
      }
    }
  }

  public static void z(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(109775);
    if (!sbi.containsKey(Long.valueOf(paramLong)))
      AppMethodBeat.o(109775);
    while (true)
    {
      return;
      b.a locala = (b.a)sbi.get(Long.valueOf(paramLong));
      if (locala != null)
      {
        locala.sbB = bo.anU();
        locala.koC = paramBoolean;
        AppMethodBeat.o(109775);
      }
      else
      {
        AppMethodBeat.o(109775);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.b
 * JD-Core Version:    0.6.2
 */