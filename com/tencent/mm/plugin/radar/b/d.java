package com.tencent.mm.plugin.radar.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/radar/model/RadarKvStatReport;", "", "()V", "TAG", "", "enterStartAt", "", "kRadarEnterKey", "kRadarID", "memberCount", "", "memberTotalCount", "searchCount", "searchStartAt", "searchTotalDuring", "FoundFirstFriendTimeSpent", "", "fFoundFirstFriendTimeSpent", "", "FoundFriendsCnt", "nFoundFriendsCnt", "RadarAddFriendStat", "nUserCount", "nTouchTotalCnt", "fTimeSpent", "nFoundFriendsTotalCnt", "fStayTimeSpent", "current", "enterReset", "radarEnter", "radarQuit", "radarReceiveMember", "count", "radarSearchStart", "radarSearchStop", "reportRadarEnterIDKey", "searchReset", "plugin-radar_release"})
public final class d
{
  public static final String TAG = "MicroMsg.RadarKvStatReport";
  public static int cEX = 0;
  public static int pBj = 0;
  public static long pBk = 0L;
  public static long pBl = 0L;
  public static long pBm = 0L;
  public static int pBn = 0;
  private static final long pBo = 759L;
  private static final long pBp = 0L;
  public static final d pBq;

  static
  {
    AppMethodBeat.i(102903);
    pBq = new d();
    TAG = "MicroMsg.RadarKvStatReport";
    pBo = 759L;
    AppMethodBeat.o(102903);
  }

  public static void cdx()
  {
    AppMethodBeat.i(102900);
    cEX = 0;
    pBm = 0L;
    pBm = System.currentTimeMillis();
    AppMethodBeat.o(102900);
  }

  public static void cdy()
  {
    AppMethodBeat.i(102901);
    pBn = 0;
    pBl = 0L;
    pBj = 0;
    pBk = 0L;
    pBl = System.currentTimeMillis();
    h.pYm.a(pBo, pBp, 1L, false);
    AppMethodBeat.o(102901);
  }

  public static long cdz()
  {
    AppMethodBeat.i(138668);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(138668);
    return l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.d
 * JD-Core Version:    0.6.2
 */