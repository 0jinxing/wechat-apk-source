package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
{
  public static m uuj;
  private String bssid;
  private String cvF;
  boolean foa = false;
  com.tencent.mm.plugin.webview.stub.d icy = null;
  private int networkType;
  String qTK;
  private String ssid;
  String uuk;

  static
  {
    AppMethodBeat.i(7712);
    uuj = new m();
    AppMethodBeat.o(7712);
  }

  public final void Jq(int paramInt)
  {
    AppMethodBeat.i(7708);
    ab.v("MicroMsg.WebViewReportUtil", "onReceivedError traceid %s", new Object[] { this.qTK });
    if (bo.isNullOrNil(this.qTK))
      AppMethodBeat.o(7708);
    while (true)
    {
      return;
      h(3, "", paramInt);
      AppMethodBeat.o(7708);
    }
  }

  public final void close()
  {
    AppMethodBeat.i(7709);
    ab.v("MicroMsg.WebViewReportUtil", "close traceid %s", new Object[] { this.qTK });
    this.foa = true;
    if (bo.isNullOrNil(this.qTK))
      AppMethodBeat.o(7709);
    while (true)
    {
      return;
      kT(4);
      this.qTK = null;
      AppMethodBeat.o(7709);
    }
  }

  final void h(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(7711);
    com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
    locald.l("20adInfo", this.qTK + ",");
    locald.l("21optype", paramInt1 + ",");
    locald.l("22sessionId", this.cvF + ",");
    locald.l("23currURL", this.uuk + ",");
    locald.l("24referURL", paramString + ",");
    locald.l("25errCode", paramInt2 + ",");
    locald.l("26networkType", this.networkType + ",");
    locald.l("27timeStamp", bo.anU() + ",");
    locald.l("28ssid", this.ssid + ",");
    locald.l("29bssid", this.bssid + ",");
    ab.i("MicroMsg.WebViewReportUtil", "report logbuffer adPageOp(13791): optype:%d, sessionId:%s, currUrl:%s, referUrl:%s, errCode:%d, networkType:%d", new Object[] { Integer.valueOf(paramInt1), this.cvF, this.uuk, paramString, Integer.valueOf(paramInt2), Integer.valueOf(this.networkType) });
    h.pYm.e(13791, new Object[] { locald });
    if (this.icy == null)
    {
      ab.e("MicroMsg.WebViewReportUtil", "report invoker null");
      AppMethodBeat.o(7711);
    }
    while (true)
    {
      return;
      paramString = new Bundle();
      paramString.putString("ad_report_data_str", locald.toString());
      try
      {
        this.icy.s(1295, paramString);
        AppMethodBeat.o(7711);
      }
      catch (RemoteException paramString)
      {
        ab.e("MicroMsg.WebViewReportUtil", "report: exp:%s", new Object[] { paramString });
        AppMethodBeat.o(7711);
      }
    }
  }

  public final void hg(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7707);
    ab.i("MicroMsg.WebViewReportUtil", "setting traceid " + paramString1 + ",usename " + paramString2);
    this.qTK = paramString1;
    this.networkType = aq.aEn();
    this.cvF = ag.ck(paramString2 + bo.anU());
    this.ssid = at.gE(ah.getContext());
    this.bssid = at.gF(ah.getContext());
    this.foa = false;
    AppMethodBeat.o(7707);
  }

  final void kT(int paramInt)
  {
    AppMethodBeat.i(7710);
    h(paramInt, "", 0);
    AppMethodBeat.o(7710);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.m
 * JD-Core Version:    0.6.2
 */