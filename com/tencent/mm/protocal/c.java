package com.tencent.mm.protocal;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class c
{
  private static Map<String, c.g> vxd = null;

  public static Bundle akC(String paramString)
  {
    AppMethodBeat.i(79962);
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("handle", true);
    localBundle.putString("handle_result", paramString);
    AppMethodBeat.o(79962);
    return localBundle;
  }

  public static c.g akD(String paramString)
  {
    AppMethodBeat.i(79963);
    if ((vxd == null) || (vxd.size() <= 0))
    {
      Object localObject = new HashMap(128);
      vxd = (Map)localObject;
      ((Map)localObject).put("log", new c.eg());
      vxd.put("imagePreview", new c.dp());
      vxd.put("profile", new c.gw());
      vxd.put("shareWeibo", new c.li());
      vxd.put("shareTimeline", new c.kh());
      vxd.put("adDataReport", new c.n());
      vxd.put("streamingVideoPlay", new c.ke());
      vxd.put("addContact", new c.h());
      vxd.put("getWidgetCaptureImgUrl", new c.de());
      vxd.put("sendAppMessage", new c.ia());
      vxd.put("scanQRCode", new c.hs());
      vxd.put("hideOptionMenu", new c.dm());
      vxd.put("showOptionMenu", new c.jk());
      vxd.put("getNetworkType", new c.ci());
      vxd.put("closeWindow", new c.ak());
      vxd.put("getInstallState", new c.cd());
      vxd.put("setFontSizeCallback", new c.io());
      vxd.put("jumpToInstallUrl", new c.dw());
      vxd.put("launchApp", new ec());
      vxd.put("getBrandWCPayRequest", new c.bs());
      vxd.put("secureTunnel", new hu());
      vxd.put("editAddress", new c.bd());
      vxd.put("getHeadingAndPitch", new c.ca());
      vxd.put("sendEmail", new if());
      vxd.put("addDownloadTask", new c.j());
      vxd.put("cancelDownloadTask", new c.t());
      vxd.put("pauseDownloadTask", new c.gm());
      vxd.put("resumeDownloadTask", new c.hq());
      vxd.put("queryDownloadTask", new c.gx());
      vxd.put("installDownloadTask", new c.ds());
      vxd.put("getLatestAddress", new cl());
      vxd.put("openSpecificView", new c.fy());
      vxd.put("jumpWCMall", new dy());
      vxd.put("launch3rdApp", new c.eb());
      vxd.put("writeCommData", new c.lp());
      vxd.put("openUrlByExtBrowser", new c.fz());
      vxd.put("geoLocation", new bp());
      vxd.put("getBrandWCPayBindCardRequest", new br());
      vxd.put("openProductView", new c.fs());
      vxd.put("openProductViewWithPid", new c.ft());
      vxd.put("jumpToBizProfile", new dx());
      vxd.put("openTimelineCheckInList", new c.em());
      vxd.put("openLocation", new el());
      vxd.put("timelineCheckIn", new c.ek());
      vxd.put("getBrandWCPayCreateCreditCardRequest", new c.gf());
      vxd.put("chooseCard", new y());
      vxd.put("chooseInvoice", new c.ab());
      vxd.put("sendServiceAppMessage", new c.ig());
      vxd.put("musicPlay", new c.ej());
      vxd.put("mmsf0001", new c.bv());
      vxd.put("connectToWiFi", new c.aq());
      vxd.put("getTransferMoneyRequest", new c.da());
      vxd.put("openWCPaySpecificView", new c.gb());
      vxd.put("setCloseWindowConfirmDialogInfo", new c.im());
      vxd.put("batchAddCard", new p());
      vxd.put("preVerifyJSAPI", new c.gt());
      vxd.put("startRecord", new ju());
      vxd.put("stopRecord", new c.kb());
      vxd.put("playVoice", new go());
      vxd.put("pauseVoice", new c.gn());
      vxd.put("stopVoice", new kd());
      vxd.put("uploadVoice", new c.kv());
      vxd.put("downloadVoice", new c.ba());
      vxd.put("chooseImage", new c.aa());
      vxd.put("uploadImage", new c.ks());
      vxd.put("downloadImage", new c.az());
      vxd.put("uploadMediaFile", new c.kt());
      vxd.put("hideMenuItems", new c.dk());
      vxd.put("showMenuItems", new ji());
      vxd.put("hideAllNonBaseMenuItem", new c.dj());
      vxd.put("showAllNonBaseMenuItem", new c.jf());
      vxd.put("checkJsApi", new c.x());
      vxd.put("translateVoice", new c.ki());
      vxd.put("shareQQ", new c.jc());
      vxd.put("shareWeiboApp", new c.je());
      vxd.put("shareQZone", new c.jd());
      vxd.put("connectToFreeWifi", new c.ap());
      vxd.put("getSendC2CMessageRequest", new c.cx());
      vxd.put("batchViewCard", new c.r());
      vxd.put("configWXDeviceWiFi", new c.an());
      vxd.put("getCurrentSSID", new c.bt());
      vxd.put("setPageOwner", new c.iu());
      vxd.put("getWechatVerifyTicket", new c.dc());
      vxd.put("openWXDeviceLib", new gg());
      vxd.put("startScanWXDevice", new c.jv());
      vxd.put("stopScanWXDevice", new c.kc());
      vxd.put("connectWXDevice", new c.ar());
      vxd.put("disconnectWXDevice", new c.ay());
      vxd.put("getWXDeviceTicket", new c.dg());
      vxd.put("getWXDeviceInfos", new c.df());
      vxd.put("sendDataToWXDevice", new c.ic());
      vxd.put("closeWXDeviceLib", new c.am());
      vxd.put("setSendDataDirection", new c.iy());
      vxd.put("verifyWCPayPassword", new kx());
      vxd.put("getPaymentOrderRequest", new c.ck());
      vxd.put("openGameDetail", new c.fi());
      vxd.put("openGameCenter", new c.fh());
      vxd.put("setGameDebugConfig", new c.iq());
      vxd.put("startTempSession", new c.jx());
      vxd.put("getH5PrepayRequest", new c.cb());
      vxd.put("getH5TransactionRequest", new c.cc());
      vxd.put("menu:share:timeline", new c.ma());
      vxd.put("menu:share:appmessage", new c.lx());
      vxd.put("menu:share:qq", new c.ly());
      vxd.put("menu:share:weiboApp", new c.mb());
      vxd.put("menu:setfont", new c.lw());
      vxd.put("menu:share:weibo", new c.mb());
      vxd.put("menu:share:QZone", new c.lz());
      vxd.put("getRecevieBizHongBaoRequest", new c.e());
      vxd.put("insertVideoPlayer", new c.dr());
      vxd.put("updateVideoPlayer", new c.kp());
      vxd.put("removeVideoPlayer", new c.hd());
      vxd.put("operateVideoPlayer", new c.gk());
      vxd.put("deleteSearchHistory", new c.av());
      vxd.put("getSearchHistory", new c.ct());
      vxd.put("getSearchData", new c.cp());
      vxd.put("getPoiInfo", new c.bz());
      vxd.put("updateReddotTimeStamps", new kl());
      vxd.put("getTeachSearchData", new c.cz());
      vxd.put("getSearchGuideData", new c.cs());
      vxd.put("getSearchAvatarList", new c.co());
      vxd.put("getSearchSnsImageList", new c.cv());
      vxd.put("getSearchImageList", new c.cu());
      vxd.put("getSearchDisplayNameList", new c.cq());
      vxd.put("startSearchItemDetailPage", new c.jw());
      vxd.put("reportSearchStatistics", new c.hk());
      vxd.put("reportSearchRealTimeStatistics", new c.hj());
      vxd.put("searchDataHasResult", new c.ht());
      vxd.put("openEmotionPage", new c.bm());
      vxd.put("getSearchSuggestionData", new c.cw());
      vxd.put("setSearchInputWord", new c.ix());
      vxd.put("setSnsObjectXmlDescList", new c.iz());
      vxd.put("clickSnsMusicPlayButton", new c.aj());
      vxd.put("openWeAppPage", new c.ge());
      vxd.put("reportWeAppSearchRealtime", new c.lj());
      vxd.put("doSearchOperation", new c.bc());
      vxd.put("insertSearchWAWidgetView", new c.dq());
      vxd.put("removeSearchWAWidgetView", new hc());
      vxd.put("updateSearchWAWidgetView", new c.kn());
      vxd.put("showSearchActionSheet", new jl());
      vxd.put("cancelSearchActionSheet", new c.u());
      vxd.put("showSearchToast", new c.jo());
      vxd.put("showSearchLoading", new c.jm());
      vxd.put("hideSearchLoading", new c.dn());
      vxd.put("updateWASearchTemplate", new c.kq());
      vxd.put("preloadSearchWeapp", new c.gr());
      vxd.put("uxSearchOpLog", new c.kw());
      vxd.put("jumpToWXWallet", new c.dz());
      vxd.put("scanCover", new f());
      vxd.put("reportActionInfo", new c.he());
      vxd.put("openMyDeviceProfile", new c.fp());
      vxd.put("selectPedometerSource", new c.hx());
      vxd.put("nfcIsConnect", new c.es());
      vxd.put("nfcConnect", new c.ep());
      vxd.put("nfcTransceive", new c.et());
      vxd.put("nfcBatchTransceive", new c.en());
      vxd.put("nfcGetId", new c.eq());
      vxd.put("nfcGetInfo", new c.er());
      vxd.put("startMonitoringBeacons", new js());
      vxd.put("stopMonitoringBeacons", new c.jz());
      vxd.put("nfcCheckState", new c.eo());
      vxd.put("videoProxyInit", new c.lb());
      vxd.put("videoProxyStartPlay", new c.le());
      vxd.put("videoProxyStopPlay", new c.lf());
      vxd.put("videoProxySetPlayerState", new c.lc());
      vxd.put("videoProxySetRemainTime", new c.ld());
      vxd.put("videoProxyPreload", new c.lh());
      vxd.put("getWebPayCheckoutCounterRequst", new c.ef());
      vxd.put("addCustomMenuItems", new c.i());
      vxd.put("operateGameCenterMsg", new c.gj());
      vxd.put("openEnterpriseChat", new c.ff());
      vxd.put("enterEnterpriseChat", new c.bh());
      vxd.put("openEnterpriseContact", new c.fg());
      vxd.put("selectEnterpriseContact", new c.hw());
      vxd.put("getEnterpriseChat", new c.bx());
      vxd.put("reportIDKey", new c.hh());
      vxd.put("quicklyAddBrandContact", new c.gy());
      vxd.put("consumedShareCard", new c.as());
      vxd.put("cache", new c.la());
      vxd.put("publicCache", new c.lg());
      vxd.put("kvReport", new c.ea());
      vxd.put("realtimeReport", new c.gz());
      vxd.put("openUrlWithExtraWebview", new c.ga());
      vxd.put("setFreeWifiOwner", new c.ip());
      vxd.put("selectSingleContact", new c.hy());
      vxd.put("sendAppMessageToSpecifiedContact", new c.hz());
      vxd.put("setLocalData", new c.ir());
      vxd.put("getLocalData", new c.ce());
      vxd.put("clearLocalData", new c.ah());
      vxd.put("showKeyboard", new c.jh());
      vxd.put("showSmileyPanel", new c.jp());
      vxd.put("disableBounceScroll", new c.aw());
      vxd.put("clearBounceBackground", new af());
      vxd.put("setNavigationBarButtons", new c.is());
      vxd.put("enableFullScreen", new bf());
      vxd.put("showNavigationBarLoading", new jj());
      vxd.put("hideNavigationBarLoading", new c.dl());
      vxd.put("enablePullDownRefresh", new bg());
      vxd.put("startPullDownRefresh", new c.jt());
      vxd.put("stopPullDownRefresh", new c.ka());
      vxd.put("disablePullDownRefresh", new c.ax());
      vxd.put("setPageTitle", new c.iv());
      vxd.put("setStatusBarStyle", new ja());
      vxd.put("deleteAccountSuccess", new c.au());
      vxd.put("chooseVideo", new c.ae());
      vxd.put("uploadVideo", new c.ku());
      vxd.put("openMapNavigateMenu", new fo());
      vxd.put("setNavigationBarColor", new c.it());
      vxd.put("getWCPayRealnameVerify", new c.db());
      vxd.put("openDesignerEmojiView", new c.ez());
      vxd.put("openDesignerProfile", new c.fb());
      vxd.put("openEmoticonTopicList", new fe());
      vxd.put("openDesignerEmojiViewLocal", new c.fa());
      vxd.put("openDesignerProfileLocal", new fc());
      vxd.put("openEmotionDetailViewLocal", new d());
      vxd.put("openNewPage", new c.fq());
      vxd.put("getSearchEmotionData", new c.cr());
      vxd.put("openEmotionUrl", new c.be());
      vxd.put("WNNativeCallbackOnClick", new c.ln());
      vxd.put("WNNativeCallbackOnLongClick", new c.lo());
      vxd.put("WNNativeCallbackOnCaretChange", new c.lm());
      vxd.put("WNNativeCallbackInitData", new c.ll());
      vxd.put("WNNativeAsyncCallback", new c.lk());
      vxd.put("WNNativeCallbackOnBecomeEditing", new c.lt());
      vxd.put("WNNativeCallbackOnBecomeEdited", new c.lu());
      vxd.put("changePayActivityView", new c.v());
      vxd.put("selectWalletCurrency", new kf());
      vxd.put("scanLicence", new c.hr());
      vxd.put("operateMusicPlayer", new c.b());
      vxd.put("getMusicPlayerState", new c.a());
      vxd.put("clearWebviewCache", new c.ai());
      vxd.put("requireSoterBiometricAuthentication", new c.jq());
      vxd.put("getSupportSoter", new c.jr());
      vxd.put("unbindBankCard", new c.kj());
      vxd.put("setBounceBackground", new c.il());
      vxd.put("sendEnterpriseChat", new c.id());
      vxd.put("doExposePreparation", new c.bb());
      vxd.put("getMsgProofItems", new c.ch());
      vxd.put("openSecurityView", new c.fx());
      vxd.put("startVoipCall", new c.jy());
      vxd.put("chooseInvoiceTitle", new c.ac());
      vxd.put("getOpenDeviceId", new cj());
      vxd.put("getRouteUrl", new c.cn());
      vxd.put("idCardRealnameVerify", new c.do());
      vxd.put("uploadIdCardSuccess", new c.md());
      vxd.put("showDatePickerView", new c.jg());
      vxd.put("openLuckyMoneyDetailView", new fm());
      vxd.put("resendRemittanceMsg", new c.hp());
      vxd.put("getGameCommInfo", new by());
      vxd.put("openGameRegion", new c.fj());
      vxd.put("chooseIdCard", new c.z());
      vxd.put("getLocalImgData", new c.c());
      vxd.put("openWeApp", new c.gd());
      vxd.put("recordVideo", new c.ha());
      vxd.put("previewVideo", new c.gs());
      vxd.put("uploadEncryptMediaFile", new c.kr());
      vxd.put("chooseMedia", new c.ad());
      vxd.put("requestWxFacePictureVerify", new c.bi());
      vxd.put("openCustomWebview", new c.ey());
      vxd.put("forceUpdateWxaAttr", new c.bl());
      vxd.put("openLuckyMoneyHistory", new c.fn());
      vxd.put("menuitem:gameSendDesktop", new c.ie());
      vxd.put("getWePkgAuthResult", new c.dd());
      vxd.put("getLocalWePkgInfo", new c.cf());
      vxd.put("openGameWebView", new fl());
      vxd.put("reportGameWeb", new c.hg());
      vxd.put("launchApplication", new c.ed());
      vxd.put("showSearchOfBizHistory", new c.jn());
      vxd.put("login", new c.eh());
      vxd.put("authorize", new o());
      vxd.put("requestWxFacePictureVerifyUnionVideo", new c.bj());
      vxd.put("checkIsSupportFaceDetect", new w());
      vxd.put("operateBackgroundAudio", new gi());
      vxd.put("setBackgroundAudioState", new c.ik());
      vxd.put("getBackgroundAudioState", new c.bq());
      vxd.put("addDownloadTaskStraight", new c.k());
      vxd.put("setScreenOrientation", new c.iw());
      vxd.put("addToEmoticon", new c.m());
      vxd.put("shareEmoticon", new c.jb());
      vxd.put("makePhoneCall", new ei());
      vxd.put("openADCanvas", new c.ex());
      vxd.put("openSearchCanvas", new c.fu());
      vxd.put("opVoteAdData", new c.gl());
      vxd.put("requestWxFaceRegisterInternal", new c.hm());
      vxd.put("requestWxFaceVerifyInternal", new c.hn());
      vxd.put("launchMiniProgram", new c.ee());
      vxd.put("reportMiniProgramPageData", new c.hi());
      vxd.put("selectContact", new hv());
      vxd.put("openSearchWAWidgetLogView", new fv());
      vxd.put("reloadSearchWAWidgetData", new c.hb());
      vxd.put("closeWindowAndGoNext", new al());
      vxd.put("requestWxVoicePrintVerifyInternal", new c.ho());
      vxd.put("openBizChat", new c.ew());
      vxd.put("handleWCPayWalletBuffer", new c.di());
      vxd.put("tapSearchWAWidgetView", new c.kg());
      vxd.put("getMatchContactList", new c.cg());
      vxd.put("openSearchWebView", new c.fw());
      vxd.put("openWXSearchPage", new c.gh());
      vxd.put("viewTypeChange", new c.ky());
      vxd.put("invokeMiniProgramAPI", new c.du());
      vxd.put("openGameUrlWithExtraWebView", new c.fk());
      vxd.put("setGameData", new c.in());
      vxd.put("getGameData", new c.bu());
      vxd.put("clearGameData", new c.ag());
      vxd.put("openECard", new fd());
      vxd.put("reportGamePageTime", new c.hf());
      vxd.put("setWCPayPassword", new c.ij());
      vxd.put("openWCPayCardList", new c.ev());
      vxd.put("bindEmail", new c.s());
      vxd.put("openOfflinePayView", new c.fr());
      vxd.put("bindEmail", new c.s());
      vxd.put("doGoToRecVideoList", new c.cm());
      vxd.put("jumpWSRecVideoList", new c.lv());
      vxd.put("openWebSearchOutLinkItem", new mc());
      vxd.put("recordHistory", new bo());
      localObject = new LinkedList();
      ((List)localObject).add(new c.gq());
      ((List)localObject).add(new c.gp());
      ((List)localObject).add(new c.ib());
      ((List)localObject).add(new c.dh());
      ((List)localObject).add(new c.gv());
      ((List)localObject).add(new c.gu());
      ((List)localObject).add(new c.bn());
      ((List)localObject).add(new c.gc());
      ((List)localObject).add(new ao());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        c.g localg = (c.g)((Iterator)localObject).next();
        vxd.put(localg.getName(), localg);
      }
      vxd.put("getSystemInfo", new c.cy());
      vxd.put("serviceClick", new ii());
      vxd.put("openRealnameAuth", new ls());
      vxd.put("sendSingleAppMessage", new c.ih());
      vxd.put("wcPrivacyPolicyResult", new c.kz());
      vxd.put("currentMpInfo", new c.at());
      vxd.put("updateAppMessageShareData", new c.km());
      vxd.put("updateTimelineShareData", new c.ko());
      vxd.put("getCCData", new lr());
      vxd.put("calRqt", new c.lq());
      vxd.put("faceVerifyForPay", new c.bk());
      vxd.put("request", new c.hl());
      vxd.put("notifyPageInfo", new c.eu());
      vxd.put("updatePageAuth", new c.kk());
      vxd.put("jumpDownloaderWidget", new dv());
      vxd.put("batchUpdateWepkg", new c.q());
      vxd.put("addGameDownloadTask", new c.l());
      vxd.put("internelWxFaceVerify", new c.dt());
      vxd.put("getDownloadWidgetTaskInfos", new c.bw());
    }
    paramString = (c.g)vxd.get(paramString);
    AppMethodBeat.o(79963);
    return paramString;
  }

  public static final class af extends c.g
  {
    public af()
    {
      super("clearBounceBackground", 189, false);
    }
  }

  static final class al extends c.g
  {
    al()
    {
      super("closeWindowAndGoNext", 293, false);
    }
  }

  static final class ao extends c.g
  {
    ao()
    {
      super("confirmDialog", 343, true);
    }
  }

  public static final class bf extends c.g
  {
    public bf()
    {
      super("enableFullScreen", 196, false);
    }
  }

  public static final class bg extends c.g
  {
    public bg()
    {
      super("enablePullDownRefresh", 199, false);
    }
  }

  static final class bo extends c.g
  {
    bo()
    {
      super("recordHistory", 219, false);
    }
  }

  public static final class bp extends c.g
  {
    public bp()
    {
      super("geo_location", 57, false);
    }
  }

  public static final class br extends c.g
  {
    public br()
    {
      super("get_brand_WCPay_bind_card_request", 58, true);
    }
  }

  public static final class by extends c.g
  {
    public by()
    {
      super("getGameCommInfo", 241, false);
    }
  }

  public static final class cj extends c.g
  {
    public cj()
    {
      super("getOpenDeviceId", 227, false);
    }
  }

  public static final class cl extends c.g
  {
    public cl()
    {
      super("get_recently_used_address", 46, true);
    }
  }

  public static final class d extends c.g
  {
    public d()
    {
      super("openEmotionDetailViewLocal", 20000, false);
    }
  }

  static final class dv extends c.g
  {
    dv()
    {
      super("jumpDownloaderWidget", 339, true);
    }
  }

  public static final class dx extends c.g
  {
    public dx()
    {
      super("jump_to_biz_profile", 61, true);
    }
  }

  public static final class dy extends c.g
  {
    public dy()
    {
      super("jump_wcmall", 51, true);
    }
  }

  public static final class ec extends c.g
  {
    public ec()
    {
      super("", 27, false);
    }
  }

  static final class ei extends c.g
  {
    ei()
    {
      super("makePhoneCall", 10000, true);
    }
  }

  public static final class el extends c.g
  {
    public el()
    {
      super("open_location", 63, true);
    }
  }

  public static final class f extends c.g
  {
    public f()
    {
      super("scanCover", 136, true);
    }
  }

  public static final class fc extends c.g
  {
    public fc()
    {
      super("openDesignerProfileLocal", 20000, false);
    }
  }

  static final class fd extends c.g
  {
    fd()
    {
      super("openECard", 268, true);
    }
  }

  public static final class fe extends c.g
  {
    public fe()
    {
      super("openEmoticonTopicList", 212, true);
    }
  }

  static final class fl extends c.g
  {
    fl()
    {
      super("openGameWebView", 287, false);
    }
  }

  public static final class fm extends c.g
  {
    public fm()
    {
      super("openLuckyMoneyDetailView", 245, false);
    }
  }

  public static final class fo extends c.g
  {
    public fo()
    {
      super("openMapNavigateMenu", 184, true);
    }
  }

  static final class fv extends c.g
  {
    fv()
    {
      super("openSearchWAWidgetLogView", 10000, true);
    }
  }

  public static final class gg extends c.g
  {
    public gg()
    {
      super("openWXDeviceLib", 117, false);
    }
  }

  static final class gi extends c.g
  {
    gi()
    {
      super("operateBackgroundAudio", 261, false);
    }
  }

  public static final class go extends c.g
  {
    public go()
    {
      super("playVoice", 99, false);
    }
  }

  public static final class hc extends c.g
  {
    public hc()
    {
      super("", 10000, false);
    }
  }

  public static final class hu extends c.g
  {
    public hu()
    {
      super("", 329, false);
    }
  }

  static final class hv extends c.g
  {
    hv()
    {
      super("selectContact", 10000, true);
    }
  }

  public static final class if extends c.g
  {
    public if()
    {
      super("send_email", 35, false);
    }
  }

  static final class ii extends c.g
  {
    ii()
    {
      super("serviceClick", 304, false);
    }
  }

  public static final class ja extends c.g
  {
    public ja()
    {
      super("setStatusBarStyle", 206, false);
    }
  }

  public static final class ji extends c.g
  {
    public ji()
    {
      super("showMenuItems", 86, false);
    }
  }

  public static final class jj extends c.g
  {
    public jj()
    {
      super("showNavigationBarLoading", 197, false);
    }
  }

  public static final class jl extends c.g
  {
    public jl()
    {
      super("showSearchActionSheet", 10000, false);
    }
  }

  public static final class js extends c.g
  {
    public js()
    {
      super("startMonitoringBeacons", 151, false);
    }
  }

  public static final class ju extends c.g
  {
    public ju()
    {
      super("startRecord", 96, false);
    }
  }

  public static final class kd extends c.g
  {
    public kd()
    {
      super("stopVoice", 101, false);
    }
  }

  public static final class kf extends c.g
  {
    public kf()
    {
      super("selectWalletCurrency", 201, true);
    }
  }

  public static final class kl extends c.g
  {
    public kl()
    {
      super("", 10000, false);
    }
  }

  public static final class kx extends c.g
  {
    public kx()
    {
      super("verifyWCPayPassword", 115, true);
    }
  }

  static final class lr extends c.g
  {
    lr()
    {
      super("getCCData", 312, false);
    }
  }

  static final class ls extends c.g
  {
    ls()
    {
      super("openRealnameAuth", 314, true);
    }
  }

  public static final class mc extends c.g
  {
    public mc()
    {
      super("", 320, true);
    }
  }

  static final class o extends c.g
  {
    o()
    {
      super("authorize", 232, true);
    }
  }

  public static final class p extends c.g
  {
    public p()
    {
      super("batch_add_card", 82, true);
    }
  }

  static final class w extends c.g
  {
    w()
    {
      super("checkIsSupportFaceDetect", 265, false);
    }
  }

  public static final class y extends c.g
  {
    public y()
    {
      super("choose_card", 70, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.c
 * JD-Core Version:    0.6.2
 */