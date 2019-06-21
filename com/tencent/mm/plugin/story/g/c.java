package com.tencent.mm.plugin.story.g;

import a.l;
import com.tencent.mars.comm.NetStatusUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.plugin.story.ui.view.gallery.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryBrowseIDKeyStat;", "", "()V", "ID", "", "TAG", "", "canReport", "", "currentUser", "Lcom/tencent/mm/plugin/story/report/StoryBrowseIDKeyStat$CurrentPlayer;", "enterFromDoubleClick", "enterWithCache", "hasStartHttp", "hascanPlayCall", "isWaiting", "last_selectedColumn", "", "last_selectedRow", "markStoryId", "noCachecurrentUser", "onCreateTime", "onPlayCostTime", "onPlayUser", "onResumeTime", "onSelectItemReport", "onStayTime", "onVideoPlay", "unReadList", "", "canPlay", "", "user", "storyId", "chattingDoubleCheck", "chattingDoubleCheckHasCache", "chattingDoubleCheckNoCache", "chattingRight", "chattingRightHasCache", "chattingRightNoCache", "checkCanPlay", "item", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "cacheSecondsDowngrade", "checkStayTime", "clean", "enter", "unreadList", "finish", "markInit", "markResumeTime", "onDestroy", "onSelectItem", "group", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/model/gallery/StoryGalleryItem;", "selectedRow", "selectedColumn", "onVideoWaiting", "playUser", "preLoadVideo", "startHttp", "CurrentPlayer", "plugin-story_release"})
public final class c
{
  private static boolean eDk;
  private static boolean isWaiting;
  public static c.a sbH;
  private static c.a sbI;
  private static boolean sbJ;
  private static long sbK;
  private static boolean sbL;
  public static boolean sbM;
  private static long sbN;
  private static boolean sbO;
  private static List<String> sbP;
  public static final c sbQ;
  private static long sbk;
  private static long sbl;
  private static long sbm;
  private static long sbr;
  private static int sbs;
  private static int sbt;
  private static boolean sbu;
  private static long sbx;

  static
  {
    AppMethodBeat.i(109796);
    sbQ = new c();
    AppMethodBeat.o(109796);
  }

  public static void aaN(String paramString)
  {
    AppMethodBeat.i(109786);
    a.f.b.j.p(paramString, "user");
    ab.i("MicroMsg.StoryBrowseIDKeyStat", "chattingRightNoCache ".concat(String.valueOf(paramString)));
    sbJ = false;
    sbI = new c.a(paramString, 1);
    h.pYm.k(988L, 15L, 1L);
    AppMethodBeat.o(109786);
  }

  public static void aaO(String paramString)
  {
    AppMethodBeat.i(109787);
    a.f.b.j.p(paramString, "user");
    ab.i("MicroMsg.StoryBrowseIDKeyStat", "chattingDoubleCheckNoCache ".concat(String.valueOf(paramString)));
    sbJ = false;
    sbI = new c.a(paramString, 2);
    h.pYm.k(988L, 16L, 1L);
    AppMethodBeat.o(109787);
  }

  public static void ar(String paramString, long paramLong)
  {
    AppMethodBeat.i(109794);
    a.f.b.j.p(paramString, "user");
    if (sbr <= 0L)
      AppMethodBeat.o(109794);
    while (true)
    {
      return;
      if (sbk == paramLong)
        break;
      sbk = 0L;
      ab.i("MicroMsg.StoryBrowseIDKeyStat", "reset storyId markStoryId: " + sbk + " storyId " + paramLong);
      AppMethodBeat.o(109794);
    }
    sbm = bo.anU();
    ab.v("MicroMsg.StoryBrowseIDKeyStat", "playUser onResumeTime " + sbm);
    c.a locala = sbI;
    if ((locala != null) && (a.f.b.j.j(locala.cIS, paramString)))
    {
      Object localObject = com.tencent.mm.plugin.story.model.j.rST;
      localObject = j.a.cxU().aap(paramString);
      ab.i("MicroMsg.StoryBrowseIDKeyStat", "preLoadCache > 0 then " + paramString + " preload " + bo.ga(((f)localObject).cBL()) + " canPlay: " + sbL);
      if (((f)localObject).cBL() > 0L)
      {
        if (locala.scene != 1)
          break label253;
        h.pYm.k(988L, 21L, 1L);
        if (sbL)
          h.pYm.k(988L, 27L, 1L);
      }
    }
    while (true)
    {
      sbH = null;
      sbI = null;
      AppMethodBeat.o(109794);
      break;
      label253: if (locala.scene == 2)
      {
        h.pYm.k(988L, 22L, 1L);
        if (sbL)
          h.pYm.k(988L, 28L, 1L);
      }
    }
  }

  public static void b(ArrayList<ArrayList<com.tencent.mm.plugin.story.model.d.g>> paramArrayList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109789);
    a.f.b.j.p(paramArrayList, "group");
    if (sbr <= 0L)
    {
      AppMethodBeat.o(109789);
      return;
    }
    ab.v("MicroMsg.StoryBrowseIDKeyStat", " last_selectedColumn:" + sbt + ",last_selectedRow:" + sbs + " selectedRow:" + paramInt1 + ",selectedColumn:" + paramInt2);
    int i;
    label143: int j;
    if (paramArrayList.size() > 0)
      if ((((ArrayList)paramArrayList.get(paramInt1)).size() > 0) && (paramInt2 + 1 < ((ArrayList)paramArrayList.get(paramInt1)).size()))
      {
        if (!sbu)
          h.pYm.k(988L, 42L, 1L);
        i = 1;
        if (paramInt1 + 1 < paramArrayList.size())
        {
          if (!sbu)
            h.pYm.k(988L, 43L, 1L);
          j = 1;
          label175: sbu = true;
        }
      }
    while (true)
    {
      if ((sbt != -1) && (sbs != -1))
      {
        if (isWaiting)
        {
          h.pYm.k(988L, 40L, 1L);
          isWaiting = false;
        }
        if (paramInt1 != sbs)
        {
          if (i != 0)
            h.pYm.k(988L, 46L, 1L);
          h.pYm.k(988L, 47L, 1L);
          i = paramInt1 - sbs;
          if (i == 1)
          {
            h.pYm.k(988L, 90L, 1L);
            if (paramArrayList.size() <= 0)
              break label713;
            i = 0;
            label286: if (i >= 3)
              break label713;
            if ((paramInt1 + i < paramArrayList.size()) && (((ArrayList)paramArrayList.get(paramInt1 + i)).size() > 0))
            {
              Object localObject1 = ((com.tencent.mm.plugin.story.model.d.g)((ArrayList)paramArrayList.get(paramInt1 + i)).get(0)).rVZ;
              if ((localObject1 != null) && (((i)localObject1).username != null) && (sbP != null))
              {
                Object localObject2 = sbP;
                if ((localObject2 != null) && (((List)localObject2).contains(((i)localObject1).username) == true))
                {
                  localObject2 = s.rTV;
                  localObject1 = s.a((i)localObject1);
                  if (!((com.tencent.mm.plugin.story.h.n)localObject1).cCd())
                  {
                    if (((com.tencent.mm.plugin.story.h.n)localObject1).field_totalSize <= 0)
                      break label561;
                    float f = ((com.tencent.mm.plugin.story.h.n)localObject1).field_cacheSize / ((com.tencent.mm.plugin.story.h.n)localObject1).field_totalSize;
                    localObject1 = com.tencent.mm.plugin.story.ui.view.gallery.n.sqi;
                    if (f * 100.0F < com.tencent.mm.plugin.story.ui.view.gallery.n.cCM().soQ)
                      break label561;
                  }
                  j = 1;
                  label452: if (j == 1)
                  {
                    if (i != 0)
                      break label567;
                    h.pYm.k(988L, 80L, 1L);
                  }
                  label475: if (i != 0)
                    break label609;
                  h.pYm.k(988L, 84L, 1L);
                }
              }
            }
          }
          while (true)
          {
            i++;
            break label286;
            if (i == 2)
            {
              h.pYm.k(988L, 91L, 1L);
              break;
            }
            if (i == 3)
            {
              h.pYm.k(988L, 92L, 1L);
              break;
            }
            if (i < 4)
              break;
            h.pYm.k(988L, 93L, 1L);
            break;
            label561: j = 0;
            break label452;
            label567: if (i == 1)
            {
              h.pYm.k(988L, 81L, 1L);
              break label475;
            }
            if (i != 2)
              break label475;
            h.pYm.k(988L, 82L, 1L);
            break label475;
            label609: if (i == 1)
              h.pYm.k(988L, 85L, 1L);
            else if (i == 2)
              h.pYm.k(988L, 86L, 1L);
          }
        }
        else if (paramInt2 != sbt)
        {
          if (j != 0)
            h.pYm.k(988L, 44L, 1L);
          h.pYm.k(988L, 45L, 1L);
          i = paramInt2 - sbt;
          if (i != 1)
            break label733;
          h.pYm.k(988L, 94L, 1L);
        }
      }
      while (true)
      {
        label713: czV();
        sbt = paramInt2;
        sbs = paramInt1;
        AppMethodBeat.o(109789);
        break;
        label733: if (i == 2)
          h.pYm.k(988L, 95L, 1L);
        else if (i == 3)
          h.pYm.k(988L, 96L, 1L);
        else if (i >= 4)
          h.pYm.k(988L, 97L, 1L);
      }
      j = 0;
      break label175;
      i = 0;
      break label143;
      j = 0;
      i = 0;
    }
  }

  public static void clean()
  {
    AppMethodBeat.i(109782);
    sbM = false;
    eDk = true;
    sbl = 0L;
    sbL = false;
    sbK = 0L;
    sbm = 0L;
    sbr = 0L;
    sbu = false;
    sbs = -1;
    sbt = -1;
    sbx = 0L;
    sbO = false;
    isWaiting = false;
    sbP = (List)new ArrayList();
    sbH = new c.a("", 1);
    AppMethodBeat.o(109782);
  }

  public static void czR()
  {
    AppMethodBeat.i(109793);
    ab.v("MicroMsg.StoryBrowseIDKeyStat", "makeResumeTime onResumeTime " + sbl + " onPlayUser " + sbm);
    sbl = bo.anU();
    AppMethodBeat.o(109793);
  }

  public static void czS()
  {
    AppMethodBeat.i(109795);
    sbr = bo.anU();
    AppMethodBeat.o(109795);
  }

  public static void czT()
  {
    AppMethodBeat.i(109784);
    ab.i("MicroMsg.StoryBrowseIDKeyStat", "chattingRightHasCache");
    sbJ = true;
    h.pYm.k(988L, 11L, 1L);
    AppMethodBeat.o(109784);
  }

  public static void czU()
  {
    AppMethodBeat.i(109785);
    ab.i("MicroMsg.StoryBrowseIDKeyStat", "chattingDoubleCheckHasCache");
    sbJ = true;
    h.pYm.k(988L, 12L, 1L);
    AppMethodBeat.o(109785);
  }

  private static void czV()
  {
    AppMethodBeat.i(109790);
    ab.v("MicroMsg.StoryBrowseIDKeyStat", "checkStayTime1 onStayTime " + sbx + " hasStartHttp " + sbO + " onPlayCostTime: " + sbK);
    if ((sbx == 0L) && (sbO))
      if (sbK == 0L)
      {
        sbx = bo.gb(sbl);
        h.pYm.k(988L, 63L, 1L);
        h.pYm.k(988L, 62L, sbx);
        AppMethodBeat.o(109790);
      }
    while (true)
    {
      return;
      sbx = bo.gb(sbN);
      h.pYm.k(988L, 61L, 1L);
      h.pYm.k(988L, 60L, sbx);
      AppMethodBeat.o(109790);
    }
  }

  public static void czW()
  {
    AppMethodBeat.i(109792);
    if (sbr <= 0L)
      AppMethodBeat.o(109792);
    while (true)
    {
      return;
      ab.i("MicroMsg.StoryBrowseIDKeyStat", "startHttp");
      sbO = true;
      AppMethodBeat.o(109792);
    }
  }

  public static void dF(List<String> paramList)
  {
    AppMethodBeat.i(109783);
    a.f.b.j.p(paramList, "unreadList");
    sbP = paramList;
    AppMethodBeat.o(109783);
  }

  public static void lj(long paramLong)
  {
    sbk = paramLong;
  }

  public static void ll(long paramLong)
  {
    if (sbr <= 0L);
    while (true)
    {
      return;
      if ((paramLong != 0L) && (paramLong == sbk) && (sbK <= 0L) && (sbl > 0L))
        isWaiting = true;
    }
  }

  public static void lm(long paramLong)
  {
    AppMethodBeat.i(109788);
    if (sbr <= 0L)
      AppMethodBeat.o(109788);
    while (true)
    {
      return;
      sbL = true;
      if (sbK <= 0L)
        ab.v("MicroMsg.StoryBrowseIDKeyStat", "storyId  " + paramLong + " markStoryId " + sbk + " onPlayCostTime " + sbK + " onResumeTime " + sbl + "  onPlayUser " + sbm);
      if ((paramLong != 0L) && (paramLong == sbk) && (sbK <= 0L) && (sbl > 0L))
      {
        sbK = bo.gb(sbl);
        sbN = bo.anU();
        ab.i("MicroMsg.StoryBrowseIDKeyStat", "canPlay " + sbK);
        isWaiting = false;
        if (sbM)
          if (sbJ)
          {
            h.pYm.k(988L, 32L, sbK);
            h.pYm.k(988L, 33L, 1L);
          }
        while (true)
        {
          h.pYm.k(988L, 71L, sbK);
          h.pYm.k(988L, 70L, 1L);
          if ((NetStatusUtil.isWifi(ah.getContext())) || (NetStatusUtil.is4G(ah.getContext())))
          {
            h.pYm.k(988L, 73L, sbK);
            h.pYm.k(988L, 72L, 1L);
          }
          if (sbK > 400L)
            break label423;
          h.pYm.k(988L, 100L, sbK);
          AppMethodBeat.o(109788);
          break;
          h.pYm.k(988L, 36L, sbK);
          h.pYm.k(988L, 37L, 1L);
          continue;
          if (sbJ)
          {
            h.pYm.k(988L, 30L, sbK);
            h.pYm.k(988L, 31L, 1L);
          }
          else
          {
            h.pYm.k(988L, 34L, sbK);
            h.pYm.k(988L, 35L, 1L);
          }
        }
        label423: if (sbK <= 800L)
        {
          h.pYm.k(988L, 101L, sbK);
          AppMethodBeat.o(109788);
        }
        else if (sbK <= 1600L)
        {
          h.pYm.k(988L, 102L, sbK);
          AppMethodBeat.o(109788);
        }
        else if (sbK <= 3200L)
        {
          h.pYm.k(988L, 103L, sbK);
          AppMethodBeat.o(109788);
        }
        else if (sbK <= 5000L)
        {
          h.pYm.k(988L, 104L, sbK);
          AppMethodBeat.o(109788);
        }
        else
        {
          h.pYm.k(988L, 105L, sbK);
        }
      }
      else
      {
        AppMethodBeat.o(109788);
      }
    }
  }

  public static void onDestroy()
  {
    AppMethodBeat.i(109791);
    if (sbr <= 0L)
      AppMethodBeat.o(109791);
    while (true)
    {
      return;
      czV();
      AppMethodBeat.o(109791);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.c
 * JD-Core Version:    0.6.2
 */