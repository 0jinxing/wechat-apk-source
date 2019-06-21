package com.tencent.mm.game.report;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.game.report.api.b;
import com.tencent.mm.game.report.api.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

public final class a extends b
{
  private HashMap<Long, com.tencent.mm.game.report.api.a> eBw;

  public a()
  {
    AppMethodBeat.i(59566);
    this.eBw = new HashMap();
    AppMethodBeat.o(59566);
  }

  public final void a(long paramLong, com.tencent.mm.game.report.api.a parama)
  {
    AppMethodBeat.i(59570);
    this.eBw.put(Long.valueOf(paramLong), parama);
    AppMethodBeat.o(59570);
  }

  public final void a(String paramString1, int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, String paramString2, int paramInt3, int paramInt4, String paramString3, long paramLong4, int paramInt5, long paramLong5, String paramString4, int paramInt6)
  {
    AppMethodBeat.i(59568);
    long l = paramLong2;
    if (paramLong2 < 0L)
      l = 0L;
    paramLong2 = paramLong4;
    if (paramLong4 < 0L)
      paramLong2 = 0L;
    ab.i("MicroMsg.GameDownloadReportImpl", "report_14567, appId = %s, scene = %d, opId = %d, startSize = %d, downloadedSize = %d, totalSize = %d, downloadUrl = %s, errCode = %d, downloaderType = %d, chanelId = %s, costTime = %d, startState = %d, downloadId = %d, extInfo = %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong1), Long.valueOf(l), Long.valueOf(paramLong3), paramString2, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong2), Integer.valueOf(paramInt5), Long.valueOf(paramLong5), paramString4 });
    c.a(d.b(14567, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l), Long.valueOf(paramLong3), com.tencent.mm.game.report.b.a.kY(paramString2), Integer.valueOf(com.tencent.mm.game.report.b.a.getNetworkType(ah.getContext())), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong2), Integer.valueOf(paramInt5), Long.valueOf(paramLong5), paramString4, com.tencent.mm.game.report.b.a.getDeviceInfo(), Long.valueOf(paramLong1), Integer.valueOf(paramInt6) }));
    h.pYm.e(15015, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(l), Long.valueOf(paramLong3), com.tencent.mm.game.report.b.a.kY(paramString2), Integer.valueOf(com.tencent.mm.game.report.b.a.getNetworkType(ah.getContext())), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString3, Long.valueOf(paramLong2), Integer.valueOf(paramInt5), Long.valueOf(paramLong5), paramString4 });
    AppMethodBeat.o(59568);
  }

  public final void a(String paramString1, int paramInt1, int paramInt2, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(59567);
    long l = System.currentTimeMillis();
    c.a(d.b(10737, new Object[] { Long.valueOf(l), Long.valueOf(l), Integer.valueOf(1), paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(0), paramString2, "", paramString3, Integer.valueOf(com.tencent.mm.game.report.b.a.getNetworkType(ah.getContext())), Integer.valueOf(0), Integer.valueOf(1), paramString4, paramString5 }));
    AppMethodBeat.o(59567);
  }

  public final com.tencent.mm.game.report.api.a eZ(long paramLong)
  {
    AppMethodBeat.i(59571);
    com.tencent.mm.game.report.api.a locala;
    if (this.eBw.containsKey(Long.valueOf(paramLong)))
    {
      locala = (com.tencent.mm.game.report.api.a)this.eBw.remove(Long.valueOf(paramLong));
      AppMethodBeat.o(59571);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(59571);
    }
  }

  public final void j(String paramString, long paramLong)
  {
    AppMethodBeat.i(59569);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(59569);
    while (true)
    {
      return;
      if ("appid_is_empty".equals(paramString))
      {
        h.pYm.a(860L, paramLong, 1L, false);
        AppMethodBeat.o(59569);
      }
      else
      {
        com.tencent.mm.ce.a.post(new a.1(this, paramString, paramLong));
        AppMethodBeat.o(59569);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.a
 * JD-Core Version:    0.6.2
 */