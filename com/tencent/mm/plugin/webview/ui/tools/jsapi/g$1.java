package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.preload.e;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.protocal.protobuf.cmu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;
import java.util.Map;

final class g$1 extends c.c
{
  g$1(g paramg, i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper, c.g paramg1)
  {
  }

  public final void a(c.a.a parama, String paramString, LinkedList<cmu> paramLinkedList, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9037);
    this.uqf.dcO().put("baseErrorCode", Integer.valueOf(paramInt1));
    this.uqf.dcO().put("jsapiErrorCode", Integer.valueOf(paramInt2));
    paramLinkedList = parama;
    if (this.uHd.agx(this.uqf.uIJ))
    {
      ab.i("MicroMsg.MsgHandler", "current jsapi(%s) invoked is came from menu event.(original retCode : %s)", new Object[] { this.uqf.uIJ, parama });
      paramLinkedList = c.a.a.uFg;
    }
    ab.i("MicroMsg.MsgHandler", "onJSVerifyEnd, put webviewID = %d", new Object[] { Integer.valueOf(g.a(this.uHd)) });
    this.uqf.puc.put("webview_instance_id", Integer.valueOf(g.a(this.uHd)));
    boolean bool;
    if (paramLinkedList == c.a.a.uFg)
    {
      if (this.uqf.uIJ.equals("sendAppMessage"))
      {
        nY(g.a(this.uHd, this.uqf, this.uHb));
        bool = true;
      }
      while (true)
      {
        parama = this.uqf.dcO().get("Internal@AsyncReport");
        if ((parama == null) || (!(parama instanceof Boolean)) || (!((Boolean)parama).booleanValue()))
          g.d(this.uHd, this.uqf, bool);
        if (!bool)
          g.b(this.uHd, this.uqf, paramLinkedList.getCode());
        AppMethodBeat.o(9037);
        label262: return;
        if (this.uqf.uIJ.equals("profile"))
        {
          nY(g.a(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("shareWeibo"))
        {
          nY(g.b(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("shareTimeline"))
        {
          nY(g.b(this.uHd, this.uqf, this.uHb));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("updateTimelineShareData"))
        {
          nY(g.c(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("updateAppMessageShareData"))
        {
          nY(g.d(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("adDataReport"))
        {
          nY(g.e(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("streamingVideoPlay"))
        {
          nY(g.f(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("addContact"))
        {
          nY(g.c(this.uHd, this.uqf, this.uHb));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getWidgetCaptureImgUrl"))
        {
          nY(g.g(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("imagePreview"))
        {
          nY(g.h(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("log"))
        {
          nY(g.i(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("hideOptionMenu"))
        {
          nY(g.b(this.uHd));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("showOptionMenu"))
        {
          nY(g.c(this.uHd));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getNetworkType"))
        {
          nY(g.j(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("closeWindow"))
        {
          nY(g.k(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getInstallState"))
        {
          nY(g.l(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("scanQRCode"))
        {
          nY(g.m(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("setFontSizeCallback"))
        {
          nY(g.n(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("jumpToInstallUrl"))
        {
          nY(g.o(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getBrandWCPayRequest"))
        {
          nY(g.p(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("secureTunnel"))
        {
          nY(g.q(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("editAddress"))
        {
          nY(g.r(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getLatestAddress"))
        {
          nY(g.d(this.uHd));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getHeadingAndPitch"))
        {
          nY(g.s(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("sendEmail"))
        {
          nY(g.t(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("addDownloadTask"))
        {
          nY(g.u(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("cancelDownloadTask"))
        {
          nY(g.v(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("pauseDownloadTask"))
        {
          nY(g.w(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("resumeDownloadTask"))
        {
          nY(g.d(this.uHd, this.uqf, this.uHb));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("queryDownloadTask"))
        {
          nY(g.x(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("installDownloadTask"))
        {
          nY(g.y(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openSpecificView"))
        {
          nY(g.z(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("launch3rdApp"))
        {
          nY(g.A(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("jumpWCMall"))
        {
          nY(g.B(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("writeCommData"))
        {
          nY(g.C(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openUrlByExtBrowser"))
        {
          nY(g.D(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openProductView"))
        {
          nY(g.E(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openProductViewWithPid"))
        {
          nY(g.F(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getBrandWCPayBindCardRequest"))
        {
          nY(g.G(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("geoLocation"))
        {
          nY(g.H(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("jumpToBizProfile"))
        {
          nY(g.I(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openTimelineCheckInList"))
        {
          nY(g.J(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openLocation"))
        {
          nY(g.K(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("timelineCheckIn"))
        {
          nY(g.L(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getBrandWCPayCreateCreditCardRequest"))
        {
          nY(g.M(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("sendServiceAppMessage"))
        {
          nY(g.N(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("mmsf0001"))
        {
          nY(g.O(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("musicPlay"))
        {
          nY(g.P(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("connectToWiFi"))
        {
          nY(g.Q(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getTransferMoneyRequest"))
        {
          nY(g.R(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openWCPaySpecificView"))
        {
          nY(g.S(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("chooseCard"))
        {
          nY(g.T(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("chooseInvoice"))
        {
          nY(g.U(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("batchAddCard"))
        {
          nY(g.V(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setCloseWindowConfirmDialogInfo"))
        {
          nY(g.W(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("preVerifyJSAPI"))
        {
          nY(g.X(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("startRecord"))
        {
          nY(g.Y(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("stopRecord"))
        {
          nY(g.Z(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("playVoice"))
        {
          nY(g.aa(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("pauseVoice"))
        {
          nY(g.ab(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("stopVoice"))
        {
          nY(g.ac(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("uploadVoice"))
        {
          nY(g.ad(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("downloadVoice"))
        {
          nY(g.ae(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("chooseImage"))
        {
          nY(g.af(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("uploadImage"))
        {
          nY(g.ag(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("downloadImage"))
        {
          nY(g.ah(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("hideMenuItems"))
        {
          nY(g.ai(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("showMenuItems"))
        {
          nY(g.aj(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("hideAllNonBaseMenuItem"))
        {
          nY(g.ak(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("showAllNonBaseMenuItem"))
        {
          nY(g.al(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("checkJsApi"))
        {
          nY(g.am(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("translateVoice"))
        {
          nY(g.an(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("shareQQ"))
        {
          nY(g.ao(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("shareWeiboApp"))
        {
          nY(g.ap(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("configWXDeviceWiFi"))
        {
          nY(g.aq(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getCurrentSSID"))
        {
          nY(g.ar(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getPaymentOrderRequest"))
        {
          nY(g.as(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("verifyWCPayPassword"))
        {
          nY(g.at(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("startMonitoringBeacons"))
        {
          g.e(this.uHd);
          nY(g.a(this.uHd, this.uqf, new int[0]));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("stopMonitoringBeacons"))
        {
          g.e(this.uHd);
          nY(g.b(this.uHd, this.uqf, new int[0]));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSendC2CMessageRequest"))
        {
          nY(g.au(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("batchViewCard"))
        {
          nY(g.av(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("connectToFreeWifi"))
        {
          nY(g.aw(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setFreeWifiOwner"))
        {
          nY(g.ax(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setPageOwner"))
        {
          nY(g.ay(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getWechatVerifyTicket"))
        {
          nY(g.az(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openWXDeviceLib"))
        {
          nY(g.aA(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("closeWXDeviceLib"))
        {
          nY(g.aB(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("startScanWXDevice"))
        {
          nY(g.aC(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("stopScanWXDevice"))
        {
          nY(g.aD(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("connectWXDevice"))
        {
          nY(g.aE(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("disconnectWXDevice"))
        {
          nY(g.aF(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getWXDeviceTicket"))
        {
          nY(g.aG(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getWXDeviceInfos"))
        {
          nY(g.aH(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("sendDataToWXDevice"))
        {
          nY(g.aI(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setSendDataDirection"))
        {
          nY(g.aJ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openGameDetail"))
        {
          nY(g.aK(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openGameCenter"))
        {
          nY(g.aL(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setGameDebugConfig"))
        {
          nY(g.aM(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("shareQZone"))
        {
          nY(g.ao(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("startTempSession"))
        {
          nY(g.aN(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getRecevieBizHongBaoRequest"))
        {
          nY(g.aO(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openMyDeviceProfile"))
        {
          nY(g.aP(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("selectPedometerSource"))
        {
          nY(this.uHd.au(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getH5PrepayRequest"))
        {
          nY(g.aQ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getH5TransactionRequest"))
        {
          nY(g.aR(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("jumpToWXWallet"))
        {
          nY(g.aS(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("scanCover"))
        {
          nY(g.aT(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcIsConnect"))
        {
          nY(g.aU(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcConnect"))
        {
          nY(g.aV(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcTransceive"))
        {
          nY(g.aW(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcBatchTransceive"))
        {
          nY(g.aX(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcGetId"))
        {
          nY(g.aY(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcGetInfo"))
        {
          nY(g.aZ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("nfcCheckState"))
        {
          nY(g.ba(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("videoProxyInit"))
        {
          nY(g.bb(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("videoProxyStartPlay"))
        {
          nY(g.bc(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("videoProxyStopPlay"))
        {
          nY(g.bd(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("videoProxySetPlayerState"))
        {
          nY(g.be(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("videoProxySetRemainTime"))
        {
          nY(g.bf(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchData"))
        {
          nY(g.bg(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getPoiInfo"))
        {
          nY(g.bh(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("updateReddotTimeStamps"))
        {
          nY(g.bi(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reloadSearchWAWidgetData"))
        {
          nY(g.bj(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("insertSearchWAWidgetView"))
        {
          nY(g.bk(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("removeSearchWAWidgetView"))
        {
          nY(g.bl(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("updateSearchWAWidgetView"))
        {
          nY(g.bm(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getTeachSearchData"))
        {
          nY(g.bn(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchGuideData"))
        {
          nY(g.bo(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchAvatarList"))
        {
          nY(g.bp(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchSnsImageList"))
        {
          nY(g.bq(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchImageList"))
        {
          nY(g.br(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchDisplayNameList"))
        {
          nY(g.bs(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("startSearchItemDetailPage"))
        {
          nY(g.bt(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reportSearchStatistics"))
        {
          nY(g.bu(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reportSearchRealTimeStatistics"))
        {
          nY(g.bv(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("searchDataHasResult"))
        {
          nY(g.bw(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchSuggestionData"))
        {
          nY(g.bx(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openEmotionPage"))
        {
          nY(g.by(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setSearchInputWord"))
        {
          nY(g.bz(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openWeAppPage"))
        {
          nY(g.bA(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reportWeAppSearchRealtime"))
        {
          nY(g.bB(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("doSearchOperation"))
        {
          nY(g.bC(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("operateGameCenterMsg"))
        {
          nY(g.bD(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getWebPayCheckoutCounterRequst"))
        {
          nY(g.bE(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setSnsObjectXmlDescList"))
        {
          nY(g.bF(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("clickSnsMusicPlayButton"))
        {
          nY(g.bG(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("addCustomMenuItems"))
        {
          nY(g.bH(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openEnterpriseChat"))
        {
          nY(g.bI(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openEnterpriseContact"))
        {
          nY(g.bJ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("selectEnterpriseContact"))
        {
          nY(g.bK(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("sendEnterpriseChat"))
        {
          nY(g.bL(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("enterEnterpriseChat"))
        {
          nY(g.bM(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getEnterpriseChat"))
        {
          nY(g.bN(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reportActionInfo"))
        {
          nY(g.bO(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("showSearchOfBizHistory"))
        {
          nY(g.bP(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("cache"))
        {
          nY(g.bQ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("publicCache"))
        {
          nY(g.bR(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("changePayActivityView"))
        {
          nY(g.bS(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("scanLicence"))
        {
          nY(g.bT(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openWeApp"))
        {
          nY(g.bU(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openECard"))
        {
          nY(g.bV(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("sendDataToMiniProgram"))
        {
          nY(g.bW(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("preloadMiniProgramEnv"))
        {
          nY(g.bX(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("preloadMiniProgramContacts"))
        {
          nY(g.bY(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("enablePullDownRefresh"))
        {
          nY(this.uHd.bH(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("startPullDownRefresh"))
        {
          nY(this.uHd.bI(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("stopPullDownRefresh"))
        {
          nY(this.uHd.bJ(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("disablePullDownRefresh"))
        {
          nY(this.uHd.dcI());
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("disableBounceScroll"))
        {
          nY(this.uHd.bM(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("clearBounceBackground"))
        {
          nY(this.uHd.bN(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("showKeyboard"))
        {
          nY(this.uHd.bK(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("showSmileyPanel"))
        {
          nY(this.uHd.bL(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openMapNavigateMenu"))
        {
          nY(this.uHd.bQ(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setNavigationBarButtons"))
        {
          nY(g.bZ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("enableFullScreen"))
        {
          nY(g.ca(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reportMiniProgramPageData"))
        {
          nY(g.cb(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setPageTitle"))
        {
          nY(g.cc(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setStatusBarStyle"))
        {
          nY(g.cd(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("forceUpdateWxaAttr"))
        {
          nY(g.ce(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("launchMiniProgram"))
        {
          nY(g.cf(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openBusinessView"))
        {
          nY(g.cg(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("reportIDKey"))
        {
          nY(g.ch(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("quicklyAddBrandContact"))
        {
          nY(g.ci(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("consumedShareCard"))
        {
          nY(g.cj(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("kvReport"))
        {
          nY(this.uHd.bz(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("realtimeReport"))
        {
          nY(this.uHd.bP(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openUrlWithExtraWebview"))
        {
          nY(g.ck(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("videoProxyPreload"))
        {
          nY(g.cl(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getLocalData"))
        {
          nY(g.cm(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setLocalData"))
        {
          nY(g.cn(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("clearLocalData"))
        {
          nY(g.co(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("selectSingleContact"))
        {
          nY(g.cp(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("sendAppMessageToSpecifiedContact"))
        {
          nY(g.cq(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("deleteAccountSuccess"))
        {
          nY(g.f(this.uHd));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("chooseVideo"))
        {
          nY(g.cr(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("uploadVideo"))
        {
          nY(g.cs(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("setNavigationBarColor"))
        {
          nY(g.ct(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openDesignerEmojiView"))
        {
          nY(g.a(this.uHd, this.uqf, false));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openDesignerProfile"))
        {
          nY(g.b(this.uHd, this.uqf, false));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openEmoticonTopicList"))
        {
          nY(g.cu(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openDesignerEmojiViewLocal"))
        {
          nY(g.a(this.uHd, this.uqf, true));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openDesignerProfileLocal"))
        {
          nY(g.b(this.uHd, this.uqf, true));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openEmotionDetailViewLocal"))
        {
          nY(g.cv(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openNewPage"))
        {
          nY(g.cw(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getSearchEmotionData"))
        {
          nY(g.cx(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openEmotionUrl"))
        {
          nY(g.cy(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getWCPayRealnameVerify"))
        {
          nY(this.uHd.aU(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("selectWalletCurrency"))
        {
          nY(this.uHd.dcG());
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("operateMusicPlayer"))
        {
          nY(g.cz(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getMusicPlayerState"))
        {
          nY(g.cA(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("clearWebviewCache"))
        {
          nY(g.cB(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("requireSoterBiometricAuthentication"))
        {
          nY(g.cC(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getSupportSoter"))
        {
          nY(g.cD(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("unbindBankCard"))
        {
          nY(g.cE(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("setBounceBackground"))
        {
          nY(this.uHd.bO(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("doExposePreparation"))
        {
          nY(g.cF(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getMsgProofItems"))
        {
          nY(g.cG(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("uploadMediaFile"))
        {
          nY(g.cH(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openSecurityView"))
        {
          nY(g.cI(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("startVoipCall"))
        {
          nY(g.cJ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getOpenDeviceId"))
        {
          nY(g.cK(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("getRouteUrl"))
        {
          nY(g.cL(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("idCardRealnameVerify"))
        {
          nY(this.uHd.aW(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("uploadIdCardSuccess"))
        {
          nY(this.uHd.aX(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getGameCommInfo"))
        {
          nY(this.uHd.aY(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openGameRegion"))
        {
          nY(this.uHd.dcH());
          bool = true;
        }
        else if (this.uqf.uIJ.equals("chooseIdCard"))
        {
          nY(this.uHd.aZ(this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("showDatePickerView"))
        {
          nY(g.cM(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openLuckyMoneyDetailView"))
        {
          nY(g.cN(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("resendRemittanceMsg"))
        {
          nY(g.cO(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getLocalImgData"))
        {
          nY(g.cP(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("recordVideo"))
        {
          nY(g.cQ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("previewVideo"))
        {
          nY(g.cR(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("uploadEncryptMediaFile"))
        {
          nY(g.cS(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openCustomWebview"))
        {
          nY(g.cT(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("chooseMedia"))
        {
          nY(g.cU(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openLuckyMoneyHistory"))
        {
          nY(g.cV(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("requestWxFacePictureVerify"))
        {
          nY(g.c(this.uHd, this.uqf, false));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getWePkgAuthResult"))
        {
          nY(g.cW(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getLocalWePkgInfo"))
        {
          nY(g.cX(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openGameWebView"))
        {
          nY(g.cY(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("launchApplication"))
        {
          nY(g.cZ(this.uHd, this.uqf));
          bool = true;
        }
        else if ((this.uqf.uIJ.equals("login")) || (this.uqf.uIJ.equals("authorize")))
        {
          nY(g.da(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("requestWxFacePictureVerifyUnionVideo"))
        {
          nY(g.c(this.uHd, this.uqf, true));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("checkIsSupportFaceDetect"))
        {
          nY(g.db(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("operateBackgroundAudio"))
        {
          nY(g.dc(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("setBackgroundAudioState"))
        {
          nY(g.e(this.uHd, this.uqf, this.uHb));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getBackgroundAudioState"))
        {
          nY(g.dd(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("addDownloadTaskStraight"))
        {
          nY(g.f(this.uHd, this.uqf, this.uHb));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("setScreenOrientation"))
        {
          nY(g.de(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("addToEmoticon"))
        {
          nY(g.df(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("shareEmoticon"))
        {
          nY(g.dg(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("requestWxFaceRegisterInternal"))
        {
          nY(g.dh(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("requestWxFaceVerifyInternal"))
        {
          nY(g.di(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openADCanvas"))
        {
          nY(g.a(this.uHd, this.uqf, 0));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openSearchCanvas"))
        {
          nY(g.a(this.uHd, this.uqf, 1));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("opVoteAdData"))
        {
          nY(g.dj(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("selectContact"))
        {
          nY(g.dk(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("makePhoneCall"))
        {
          nY(g.dl(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("setWCPayPassword"))
        {
          nY(g.dm(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("chooseInvoiceTitle"))
        {
          nY(g.dn(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("showSearchActionSheet"))
        {
          nY(g.jdMethod_do(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("cancelSearchActionSheet"))
        {
          nY(g.dp(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("showSearchToast"))
        {
          nY(g.dq(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("showSearchLoading"))
        {
          nY(g.dr(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("hideSearchLoading"))
        {
          nY(g.ds(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("updateWASearchTemplate"))
        {
          nY(g.dt(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("preloadSearchWeapp"))
        {
          nY(g.du(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("uxSearchOpLog"))
        {
          nY(g.dv(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openSearchWAWidgetLogView"))
        {
          nY(g.dw(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openBizChat"))
        {
          nY(g.dx(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("tapSearchWAWidgetView"))
        {
          nY(g.dy(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getMatchContactList"))
        {
          nY(g.dz(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openSearchWebView"))
        {
          nY(g.dA(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equalsIgnoreCase("openWXSearchPage"))
        {
          nY(g.dB(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("viewTypeChange"))
        {
          nY(g.dC(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openGameUrlWithExtraWebView"))
        {
          nY(g.dD(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("requestWxVoicePrintVerifyInternal"))
        {
          nY(g.dE(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("closeWindowAndGoNext"))
        {
          nY(g.dF(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("invokeMiniProgramAPI"))
        {
          nY(g.dG(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("setGameData"))
        {
          nY(g.dH(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getGameData"))
        {
          nY(g.dI(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("clearGameData"))
        {
          nY(g.dJ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("handleWCPayWalletBuffer"))
        {
          nY(g.dK(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("reportGamePageTime"))
        {
          nY(g.dL(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("insertVideoPlayer"))
        {
          nY(g.dM(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("updateVideoPlayer"))
        {
          nY(g.dN(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("removeVideoPlayer"))
        {
          nY(g.dO(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("operateVideoPlayer"))
        {
          nY(g.dP(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getSearchHistory"))
        {
          nY(g.g(this.uHd));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("deleteSearchHistory"))
        {
          nY(g.dQ(this.uHd, this.uqf));
          bool = true;
        }
        else if ((this.uqf.uIJ.equals("doGoToRecVideoList")) || (this.uqf.uIJ.equals("jumpWSRecVideoList")))
        {
          nY(g.dR(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("recordHistory"))
        {
          nY(g.dS(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openOfflinePayView"))
        {
          nY(g.dT(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openWCPayCardList"))
        {
          nY(g.dU(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("bindEmail"))
        {
          nY(g.h(this.uHd));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getSystemInfo"))
        {
          nY(g.dV(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("serviceClick"))
        {
          nY(g.dW(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openRealnameAuth"))
        {
          nY(g.dX(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("sendSingleAppMessage"))
        {
          nY(g.dY(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openWebSearchOutLinkItem"))
        {
          nY(g.dZ(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("wcPrivacyPolicyResult"))
        {
          nY(g.ea(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("currentMpInfo"))
        {
          nY(g.eb(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("faceVerifyForPay"))
        {
          nY(g.ec(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("jumpDownloaderWidget"))
        {
          nY(g.ed(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("batchUpdateWepkg"))
        {
          nY(g.ee(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("privateOpenWeappFunctionalPage"))
        {
          nY(g.ef(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("privateCommonApi"))
        {
          nY(g.eg(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("internelWxFaceVerify"))
        {
          nY(g.eh(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("openWebViewUseFastLoad"))
        {
          nY(g.ei(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("handleHaokanAction"))
        {
          nY(g.ej(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("confirmDialog"))
        {
          nY(g.ek(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("getCCData"))
        {
          nY(g.el(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("calRqt"))
        {
          nY(g.em(this.uHd, this.uqf));
          bool = true;
        }
        else if (e.afb(this.uqf.uIJ))
        {
          nY(g.en(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("addGameDownloadTask"))
        {
          nY(g.eo(this.uHd, this.uqf));
          bool = true;
        }
        else if (this.uqf.uIJ.equals("reportGameWeb"))
        {
          nY(g.ep(this.uHd, this.uqf));
          bool = true;
        }
        else
        {
          if (!this.uqf.uIJ.equals("getDownloadWidgetTaskInfos"))
            break;
          nY(g.eq(this.uHd, this.uqf));
          bool = true;
        }
      }
      ab.e("MicroMsg.MsgHandler", "unknown function = " + this.uqf.uIJ);
      g.a(this.uHd, this.uqf, "system:function_not_exist", null);
    }
    while (true)
    {
      nY(true);
      bool = false;
      break;
      if (paramLinkedList == c.a.a.uFj)
      {
        ab.e("MicroMsg.MsgHandler", "handleMsg access denied %s", new Object[] { this.uHc.getName() });
        if (this.uqf.uIJ.equalsIgnoreCase("getBrandWCPayRequest"))
          h.pYm.a(157L, 1L, 1L, false);
        g.a(this.uHd, this.uqf, "system:access_denied", null);
      }
      else if (paramLinkedList == c.a.a.uFi)
      {
        g.a(this.uHd, this.uqf, this.uHc.dma() + ":" + paramString, null);
      }
      else
      {
        if (bo.isNullOrNil(this.uHc.dma()))
        {
          this.uHd.eBB = false;
          nY(false);
          g.d(this.uHd, this.uqf, false);
          AppMethodBeat.o(9037);
          break label262;
        }
        if (bo.isNullOrNil(paramString))
          g.a(this.uHd, this.uqf, this.uHc.dma() + ":fail", null);
        else
          g.a(this.uHd, this.uqf, this.uHc.dma() + ":fail_" + paramString, null);
      }
    }
  }

  public final boolean dcf()
  {
    return this.uFl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.1
 * JD-Core Version:    0.6.2
 */