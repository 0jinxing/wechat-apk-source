package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class l
{
  private String cst;
  public b iBL;
  public int iBM;
  public String iBN;
  private long iBO;
  public l.a iBP;

  public final void IF()
  {
    AppMethodBeat.i(132644);
    if ((this.iBL == null) || (this.iBP == null))
      AppMethodBeat.o(132644);
    while (true)
    {
      return;
      ab.i("MicroMsg.AppBrand.kv_13917", "report " + toString());
      this.iBO = bo.anU();
      h.pYm.e(13917, i.k(new Object[] { Integer.valueOf(this.iBL.value), Integer.valueOf(this.iBM), this.iBN, Long.valueOf(this.iBO), this.cst, Integer.valueOf(this.iBP.value) }));
      AppMethodBeat.o(132644);
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(132643);
    String str = "kv_13917{scene=" + this.iBL.value + ", appCount=" + this.iBM + ", nearbyListId='" + this.iBN + '\'' + ", clickTime=" + this.iBO + ", sceneNote='" + this.cst + '\'' + ", openType=" + this.iBP.value + '}';
    AppMethodBeat.o(132643);
    return str;
  }

  public static enum b
  {
    public final int value;

    static
    {
      AppMethodBeat.i(132642);
      iBV = new b("DESKTOP_SEARCH", 0, 1);
      iBW = new b("RESUME_FROM_WEAPP_EXIT", 1, 2);
      iBX = new b("BOTTOM_ENTRANCE_IN_DESKTOP", 2, 3);
      iBY = new b("TOP_ENTRANCE_IN_DESKTOP", 3, 4);
      iBZ = new b[] { iBV, iBW, iBX, iBY };
      AppMethodBeat.o(132642);
    }

    private b(int paramInt)
    {
      this.value = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.l
 * JD-Core Version:    0.6.2
 */