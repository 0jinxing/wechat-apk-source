package com.tencent.mm.plugin.appbrand.launching.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ce;
import com.tencent.mm.g.b.a.ce.a;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.c;
import com.tencent.mm.plugin.appbrand.report.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  private String appId;
  private int axy;
  private String bIy;
  private int css;
  private int ijY;
  public boolean ijZ;
  private List<Integer> ika;

  public a(String paramString, int paramInt1, int paramInt2, List<WxaAttributes.c> paramList)
  {
    AppMethodBeat.i(132084);
    this.ika = new ArrayList();
    this.appId = paramString;
    this.axy = paramInt1;
    switch (paramInt2)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      if ((paramList != null) && (paramList.size() > 0))
      {
        this.bIy = ((WxaAttributes.c)paramList.get(0)).bIy;
        this.ijY = ((WxaAttributes.c)paramList.get(0)).version;
      }
      ab.i("MicroMsg.LaunchPrepareSplitCodeLibReporter", "appid:%s,appVersion:%s,appState:%s", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(this.css) });
      AppMethodBeat.o(132084);
      return;
      this.css = 1;
      continue;
      this.css = 2;
      continue;
      this.css = 3;
    }
  }

  public static void pc(int paramInt)
  {
    AppMethodBeat.i(132085);
    ab.i("MicroMsg.LaunchPrepareSplitCodeLibReporter", "idkeyReport id:%d,key:%d", new Object[] { Integer.valueOf(1027), Integer.valueOf(paramInt) });
    h.pYm.a(1027L, paramInt, 1L, false);
    AppMethodBeat.o(132085);
  }

  public final void IF()
  {
    AppMethodBeat.i(132087);
    if (this.ijZ)
    {
      if ((this.ika == null) || (this.ika.size() <= 0))
        break label181;
      Iterator localIterator = this.ika.iterator();
      while (localIterator.hasNext())
      {
        int i = ((Integer)localIterator.next()).intValue();
        ce localce = new ce();
        localce.gW(this.appId);
        localce.ddd = this.axy;
        localce.dfv = ce.a.he(this.css);
        localce.ddz = 1004L;
        localce.gX(this.bIy);
        localce.dfx = this.ijY;
        localce.dfy = i;
        localce.gY(j.cW(ah.getContext()));
        localce.ajK();
        ab.i("MicroMsg.LaunchPrepareSplitCodeLibReporter", "kvReportStatis report:%s", new Object[] { localce.Fk() });
      }
      AppMethodBeat.o(132087);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.LaunchPrepareSplitCodeLibReporter", "hot startUp!");
      label181: AppMethodBeat.o(132087);
    }
  }

  public final void pd(int paramInt)
  {
    AppMethodBeat.i(132086);
    if ((bo.isNullOrNil(this.appId)) || (bo.isNullOrNil(this.bIy)))
    {
      ab.i("MicroMsg.LaunchPrepareSplitCodeLibReporter", "kvReportStatis appId or provider null!");
      AppMethodBeat.o(132086);
    }
    while (true)
    {
      return;
      this.ika.add(Integer.valueOf(paramInt));
      AppMethodBeat.o(132086);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.c.a
 * JD-Core Version:    0.6.2
 */