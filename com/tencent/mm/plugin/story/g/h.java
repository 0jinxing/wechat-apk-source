package com.tencent.mm.plugin.story.g;

import a.f.b.j;
import a.l;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.b.a.aj;
import com.tencent.mm.g.b.a.ak;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.g.b.a.am;
import com.tencent.mm.g.b.a.an;
import com.tencent.mm.g.b.a.ap;
import com.tencent.mm.g.b.a.aq;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.g.b.a.as;
import com.tencent.mm.g.b.a.at;
import com.tencent.mm.g.b.a.au;
import com.tencent.mm.g.b.a.ax;
import com.tencent.mm.g.b.a.ay;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.plugin.story.h.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryReporter;", "", "()V", "STORY_COMMENT_KV_ID", "", "cameraDot", "", "getCameraDot", "()J", "setCameraDot", "(J)V", "currentEntranceExposeTime", "getCurrentEntranceExposeTime", "()I", "setCurrentEntranceExposeTime", "(I)V", "currentProfileTabVideoObjectId", "getCurrentProfileTabVideoObjectId", "setCurrentProfileTabVideoObjectId", "lastTrace", "getLastTrace", "setLastTrace", "moreTabDot", "getMoreTabDot", "setMoreTabDot", "nameSet", "", "", "kotlin.jvm.PlatformType", "", "storyChatTopBarEntranceExpose", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryChatTopBarEntranceExposeStruct;", "storyCommentDot", "getStoryCommentDot", "setStoryCommentDot", "storyDoPublishStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryDoPublishStruct;", "storyDoubleTapHeadView", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryDoubleTapHeadViewStruct;", "storyDownloadReport", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryDownloadReportStruct;", "storyEntranceExposeReportStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryEntranceExposeReportStruct;", "storyFailTraceStruct", "Lcom/tencent/mm/plugin/story/report/StoryBehaviorTraceData;", "storyPageExposeStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryPageExposeStruct;", "storyPreviewReportStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryPreviewReportStruct;", "storyPreviewTraceStruct", "storyProfileTabExposeReport", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryProfileTabExposeStruct;", "storyQuitPublishStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryQuitPublishStruct;", "storySinglePreviewReport", "Lcom/tencent/mm/autogen/mmdata/rpt/StorySinglePreviewReportStruct;", "storyStatusChangeStruct", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryStatusChangeStruct;", "getStoryStatusChangeStruct", "()Lcom/tencent/mm/autogen/mmdata/rpt/StoryStatusChangeStruct;", "setStoryStatusChangeStruct", "(Lcom/tencent/mm/autogen/mmdata/rpt/StoryStatusChangeStruct;)V", "storyTraceStruct", "storyUploadMap", "Ljava/util/HashMap;", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryUploadReportStruct;", "storyVideoPublish", "Lcom/tencent/mm/autogen/mmdata/rpt/StoryComposeReportStruct;", "tag", "videoIdSet", "addPreviewTrace", "", "aid", "addTrace", "checkRepeatUser", "", "name", "checkRepeatVideo", "doBehaviorReport", "doFailBehaviorReport", "doStoryChatTopBarEntranceExposeReport", "doStoryCommentReport", "doStoryDoubleTapHeadViewReport", "doStoryDownloadReport", "doStoryEntranceReport", "doStoryPageReport", "doStoryPreviewReport", "doStoryProfileTabExposeReport", "doStorySinglePreviewReport", "doStoryStatusChangeReport", "doStoryUploadReport", "storyLocalId", "doStoryVideoPublishReport", "getBehaviorReporter", "getFailBehaviorReporter", "getLastStoryUploadReporter", "getStoryChatTopBarEntranceExposeReporter", "getStoryDoubleTapHeadViewReporter", "getStoryDownloadReporter", "getStoryEntranceReport", "getStoryPageExposeReporter", "getStoryPreviewReporter", "getStoryProfileTabExposeReport", "getStorySinglePreviewReporter", "getStoryVideoPublishReporter", "reportStoryStatusChange", "status", "storyId", "previewEnterScene", "profileSource", "isAlbumStarButton", "resetBehaviorReporter", "resetFailBehaviorReporter", "resetStoryPreviewReporter", "resetStoryPreviewTraceData", "resetStoryProfileTabExposeReport", "storyUploadReportCPMediaInfo", "path", "storyUploadReportOriMediaInfo", "isCaptureVideo", "plugin-story_release"})
public final class h
{
  private static al sbV;
  private static a sbW;
  private static aq sbX;
  private static at sbY;
  private static a sbZ;
  private static int sca = 0;
  private static ar scb;
  private static a scc;
  private static Set<String> scd;
  private static Set<String> sce;
  private static aj scf;
  private static am scg;
  private static ak sch;
  private static an sci;
  private static final HashMap<Integer, ay> scj;
  private static au sck;
  private static as scl;
  private static long scm = 0L;
  private static long scn = 0L;
  private static long sco = 0L;
  private static long scp = 0L;
  private static int scq = 0;
  private static ap scr;
  private static ax scs;
  private static final int sct = 16649;
  public static final h scu;

  static
  {
    AppMethodBeat.i(109847);
    scu = new h();
    sbV = new al();
    sbW = new a();
    sbX = new aq();
    sbY = new at();
    sbZ = new a();
    sca = -1;
    scb = new ar();
    scc = new a();
    scd = Collections.synchronizedSet((Set)new HashSet());
    sce = Collections.synchronizedSet((Set)new HashSet());
    scf = new aj();
    scg = new am();
    sch = new ak();
    sci = new an();
    scj = new HashMap();
    sck = new au();
    scl = new as();
    scr = new ap();
    scs = new ax();
    sct = 16649;
    AppMethodBeat.o(109847);
  }

  public static void EU(int paramInt)
  {
    AppMethodBeat.i(109824);
    if ((paramInt == 15) && ((sca == 4) || (sca == 10)))
    {
      sca = paramInt;
      AppMethodBeat.o(109824);
    }
    while (true)
    {
      return;
      sca = paramInt;
      sbW.EU(paramInt);
      sbZ.EU(paramInt);
      AppMethodBeat.o(109824);
    }
  }

  public static void EX(int paramInt)
  {
    AppMethodBeat.i(109831);
    if ((sca == -1) && (paramInt == 4))
    {
      sca = paramInt;
      AppMethodBeat.o(109831);
    }
    while (true)
    {
      return;
      if ((sca == 10) && (paramInt == 11))
      {
        sca = paramInt;
        AppMethodBeat.o(109831);
      }
      else
      {
        sca = paramInt;
        scc.EU(paramInt);
        AppMethodBeat.o(109831);
      }
    }
  }

  public static ay EY(int paramInt)
  {
    AppMethodBeat.i(109840);
    ay localay1 = (ay)scj.get(Integer.valueOf(paramInt));
    ay localay2 = localay1;
    if (localay1 == null)
    {
      localay2 = new ay();
      ((Map)scj).put(Integer.valueOf(paramInt), localay2);
    }
    AppMethodBeat.o(109840);
    return localay2;
  }

  public static void EZ(int paramInt)
  {
    AppMethodBeat.i(109843);
    ay localay = (ay)scj.get(Integer.valueOf(paramInt));
    if (localay != null)
    {
      ab.d("MicroMsg.StoryReporter", "basic:\n" + localay.Gv() + ' ' + localay.Gf() + ' ' + localay.Gg() + ' ' + localay.Gt() + ' ' + localay.Ge() + ' ' + localay.Gc() + ' ' + localay.Gd());
      ab.d("MicroMsg.StoryReporter", "origin:\n" + localay.Gj() + ' ' + localay.Gh() + ' ' + localay.Gu() + ' ' + localay.Gm() + ' ' + localay.Gl() + ' ' + localay.Gk() + ' ' + localay.Gi());
      ab.d("MicroMsg.StoryReporter", "cp:\n" + localay.Gp() + ' ' + localay.Gn() + ' ' + localay.Gs() + ' ' + localay.Gr() + ' ' + localay.Gq() + ' ' + localay.Go());
      localay.ajK();
      scj.remove(Integer.valueOf(paramInt));
    }
    AppMethodBeat.o(109843);
  }

  public static void Fa(int paramInt)
  {
    scq = paramInt;
  }

  public static void a(long paramLong1, String paramString, long paramLong2, long paramLong3, long paramLong4)
  {
    AppMethodBeat.i(138837);
    j.p(paramString, "storyId");
    scs.fN(paramString);
    scs.ck(paramLong1);
    scs.cn(paramLong4);
    scs.cl(paramLong2);
    scs.cm(paramLong3);
    scs.ajK();
    scs = new ax();
    AppMethodBeat.o(138837);
  }

  public static boolean aaP(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(109829);
    if (paramString == null)
      AppMethodBeat.o(109829);
    while (true)
    {
      return bool;
      if (scd.contains(paramString))
      {
        AppMethodBeat.o(109829);
      }
      else
      {
        scd.add(paramString);
        bool = false;
        AppMethodBeat.o(109829);
      }
    }
  }

  public static boolean aaQ(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(109830);
    if (paramString == null)
      AppMethodBeat.o(109830);
    while (true)
    {
      return bool;
      if (sce.contains(paramString))
      {
        AppMethodBeat.o(109830);
      }
      else
      {
        sce.add(paramString);
        bool = false;
        AppMethodBeat.o(109830);
      }
    }
  }

  public static void bl(int paramInt, String paramString)
  {
    AppMethodBeat.i(109842);
    j.p(paramString, "path");
    com.tencent.mm.plugin.sight.base.a locala = d.WR(paramString);
    EY(paramInt).cx(e.asZ(paramString));
    EY(paramInt).fP(g.cz(paramString));
    if (locala != null)
    {
      EY(paramInt);
      EY(paramInt).cD(locala.height);
      EY(paramInt).cC(locala.width);
      EY(paramInt).cz(locala.videoBitrate);
      EY(paramInt).cA(locala.fzS);
      EY(paramInt).cy(locala.eWK);
      EY(paramInt).cB(locala.eTk);
      AppMethodBeat.o(109842);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109842);
    }
  }

  public static am cAA()
  {
    return scg;
  }

  public static void cAB()
  {
    AppMethodBeat.i(109837);
    scg.ajK();
    AppMethodBeat.o(109837);
  }

  public static ak cAC()
  {
    return sch;
  }

  public static void cAD()
  {
    AppMethodBeat.i(109838);
    sch.ajK();
    sch = new ak();
    AppMethodBeat.o(109838);
  }

  public static an cAE()
  {
    return sci;
  }

  public static void cAF()
  {
    AppMethodBeat.i(109839);
    sci.ajK();
    sci = new an();
    AppMethodBeat.o(109839);
  }

  public static au cAG()
  {
    return sck;
  }

  public static void cAH()
  {
    AppMethodBeat.i(109844);
    if (sck.FH() == 0L)
    {
      sck = new au();
      AppMethodBeat.o(109844);
    }
    while (true)
    {
      return;
      sck.ajK();
      sck = new au();
      AppMethodBeat.o(109844);
    }
  }

  public static long cAI()
  {
    return scp;
  }

  public static as cAJ()
  {
    return scl;
  }

  public static void cAK()
  {
    AppMethodBeat.i(109845);
    if (scl.FU() != 0L)
    {
      scl.ajK();
      scl.FT();
      scl.FR();
      scl.FQ();
      scl.FS();
      scl.bS(scm);
      scl.bT(scn);
      scl.bU(sco);
    }
    AppMethodBeat.o(109845);
  }

  public static int cAL()
  {
    return scq;
  }

  public static ap cAM()
  {
    return scr;
  }

  public static void cAN()
  {
    AppMethodBeat.i(109846);
    scr.ajK();
    scr = new ap();
    AppMethodBeat.o(109846);
  }

  public static void cAl()
  {
    sca = 1;
  }

  public static al cAm()
  {
    return sbV;
  }

  public static void cAn()
  {
    AppMethodBeat.i(109825);
    sbV.fr(sbW.czP());
    sbV.ajK();
    cAo();
    sca = -1;
    AppMethodBeat.o(109825);
  }

  public static void cAo()
  {
    AppMethodBeat.i(109826);
    sbV = new al();
    sbW = new a();
    AppMethodBeat.o(109826);
  }

  public static void cAp()
  {
    AppMethodBeat.i(109827);
    sbY = new at();
    sbZ = new a();
    AppMethodBeat.o(109827);
  }

  public static at cAq()
  {
    return sbY;
  }

  public static void cAr()
  {
    AppMethodBeat.i(109828);
    sbY.bY(System.currentTimeMillis());
    sbY.fE(sbZ.czP());
    sbY.ajK();
    sbY = new at();
    sbZ = new a();
    AppMethodBeat.o(109828);
  }

  public static ar cAs()
  {
    return scb;
  }

  public static void cAt()
  {
    AppMethodBeat.i(109832);
    if (0L == scb.FK())
    {
      cAv();
      AppMethodBeat.o(109832);
    }
    while (true)
    {
      return;
      scb.fB(scc.czP());
      ar localar = scb;
      localar.bQ(localar.FO() + scb.FM());
      scb.ajK();
      scb.bK(0L);
      scb.bO(0L);
      scb.bN(0L);
      scb.bL(0L);
      scb.bP(0L);
      scb.bH(0L);
      scb.bQ(0L);
      scb.fC("");
      cAv();
      AppMethodBeat.o(109832);
    }
  }

  public static void cAu()
  {
    AppMethodBeat.i(109833);
    scb = new ar();
    cAv();
    AppMethodBeat.o(109833);
  }

  public static void cAv()
  {
    AppMethodBeat.i(109834);
    scc = new a();
    sca = -1;
    scd.clear();
    sce.clear();
    AppMethodBeat.o(109834);
  }

  public static aq cAw()
  {
    return sbX;
  }

  public static void cAx()
  {
    AppMethodBeat.i(109835);
    sbX.ajK();
    sbX = new aq();
    AppMethodBeat.o(109835);
  }

  public static aj cAy()
  {
    return scf;
  }

  public static void cAz()
  {
    AppMethodBeat.i(109836);
    if (TextUtils.isEmpty((CharSequence)scf.getUserName()))
      AppMethodBeat.o(109836);
    while (true)
    {
      return;
      scf.ajK();
      AppMethodBeat.o(109836);
    }
  }

  public static void g(int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109841);
    j.p(paramString, "path");
    com.tencent.mm.plugin.sight.base.a locala = d.WR(paramString);
    EY(paramInt).cq(e.asZ(paramString));
    paramString = EY(paramInt);
    a.a locala1;
    long l;
    if (paramBoolean)
    {
      locala1 = com.tencent.mm.plugin.story.h.a.sdm;
      l = com.tencent.mm.plugin.story.h.a.cBl();
      paramString.cE(l);
      if (locala == null)
        break label171;
      EY(paramInt).cv(locala.width);
      EY(paramInt).cw(locala.height);
      EY(paramInt).cs(locala.videoBitrate);
      EY(paramInt).ct(locala.fzS);
      EY(paramInt).cr(locala.eWK);
      EY(paramInt).cu(locala.eTk);
      EY(paramInt).cF(locala.qwV);
      AppMethodBeat.o(109841);
    }
    while (true)
    {
      return;
      locala1 = com.tencent.mm.plugin.story.h.a.sdm;
      l = com.tencent.mm.plugin.story.h.a.cBk();
      break;
      label171: AppMethodBeat.o(109841);
    }
  }

  public static void ln(long paramLong)
  {
    scm = paramLong;
  }

  public static void lo(long paramLong)
  {
    scn = paramLong;
  }

  public static void lp(long paramLong)
  {
    sco = paramLong;
  }

  public static void lq(long paramLong)
  {
    scp = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.h
 * JD-Core Version:    0.6.2
 */