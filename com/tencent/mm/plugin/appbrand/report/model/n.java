package com.tencent.mm.plugin.appbrand.report.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.sdk.platformtools.bo;

public final class n
{
  public String appId;
  public int axy;
  public int css;
  public final String cvF;
  public final o htn;
  public String iBz;
  public volatile long iCb;
  public volatile boolean iCc;
  public int iCd;
  public int iCe;
  public long iCf;
  public long iCg;
  public int scene;

  public n(o paramo)
  {
    AppMethodBeat.i(132650);
    this.iCc = false;
    this.htn = paramo;
    this.cvF = paramo.atI().xz();
    AppMethodBeat.o(132650);
  }

  public final String toString()
  {
    AppMethodBeat.i(132651);
    String str = "kv_14576{, networkType='" + this.iBz + '\'' + ", appId='" + this.appId + '\'' + ", appVersion=" + this.axy + ", appState=" + this.css + ", scene=" + this.scene + ", sessionId='" + this.cvF + '\'' + ", is_download_code=" + this.iCd + ", is_load_x5=" + this.iCe + ", cost_time=" + this.iCf + ", event_time=" + this.iCg + ", load_time=" + this.iCb + ", real_time=" + bo.yz() + '}';
    AppMethodBeat.o(132651);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.model.n
 * JD-Core Version:    0.6.2
 */