package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioStateWC;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication;
import com.tencent.mm.plugin.appbrand.jsapi.camera.AppBrandCameraView;
import com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact;
import com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument;
import com.tencent.mm.plugin.appbrand.jsapi.file.ah;
import com.tencent.mm.plugin.appbrand.jsapi.file.aj;
import com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiGetLabInfo;
import com.tencent.mm.plugin.appbrand.jsapi.lab.JsApiSetLabInfo;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCETransparentUI;
import com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton;
import com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class q
{
  private final Map<String, m> hwk;
  private final Map<String, m> hwl;

  static
  {
    AppMethodBeat.i(130370);
    AppBrandVideoWrapper.aDc();
    AppBrandCameraView.aDc();
    bp.aCp();
    AppMethodBeat.o(130370);
  }

  private q()
  {
    AppMethodBeat.i(130362);
    this.hwk = new HashMap();
    this.hwl = new HashMap();
    AppMethodBeat.o(130362);
  }

  public static Map<String, m> aCh()
  {
    AppMethodBeat.i(130363);
    q localq = new q();
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.n());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.o());
    localq.b(new JsApiLogin());
    localq.b(new JsApiAuthorize());
    localq.b(new JsApiOperateWXData());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.q());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.g());
    localq.b(new bf());
    localq.b(new JsApiChooseImage());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.media.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.media.d());
    localq.b(new JsApiChooseVideo());
    localq.b(new JsApiStartRecordVoice());
    localq.b(new JsApiStopRecordVoice());
    localq.b(new JsApiStartPlayVoice());
    localq.b(new JsApiPausePlayVoice());
    localq.b(new JsApiStopPlayVoice());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.e.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.e.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.e());
    localq.b(new JsApiGetMusicPlayerState());
    localq.b(new JsApiOperateMusicPlayer());
    localq.b(new JsApiScanCode());
    localq.b(new ay());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.e());
    localq.b(new at());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.o.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.aa());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.x());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.w());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.b.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.f());
    localq.b(new com.tencent.mm.plugin.appbrand.game.e.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.o.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.o.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.o.f());
    localq.b(new bk());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.d.g());
    localq.b(new ao());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.d.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.p.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.p.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.p.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.p.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.p.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.k());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.b.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.b.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.n.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.n.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.n.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.n.a());
    localq.b(new ai());
    localq.b(new as());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.e.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.media.e());
    localq.b(new JsApiRefreshSession());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.ab());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.g());
    localq.b(new com.tencent.mm.plugin.appbrand.weishi.f());
    localq.b(new aa());
    localq.b(new au());
    localq.b(new JsApiMakeVoIPCall());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.c());
    localq.b(new JsApiSetClipboardDataWC());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k());
    localq.b(new JsApiLaunchMiniProgram());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.i());
    localq.b(new JsApiChooseWeChatContact());
    localq.b(new JsApiChooseMedia());
    localq.b(new JsApiUploadEncryptedFileToCDN());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d());
    localq.b(new az());
    localq.b(new bm());
    localq.b(new JsApiGetBackgroundAudioState());
    localq.b(new JsApiSetBackgroundAudioStateWC());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.b());
    localq.b(new ba());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.contact.b());
    localq.b(new JsApiOpenWeRunSetting());
    localq.b(new JsApiUploadWeRunData());
    localq.b(new ab());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.k());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.m());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.n());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.k());
    localq.b(new JsApiShowUpdatableMessageSubscribeButton());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.c.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.c.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.c.d());
    localq.b(new JsApiCheckIsSupportFaceDetect());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.video.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.live.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.media.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.media.h());
    localq.b(new ap());
    localq.b(new av());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.r.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.j());
    localq.b(new ad());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.b.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.op_report.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.p());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.ad());
    localq.b(new bj());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.s());
    localq.b(new bl());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.o());
    localq.b(new JsApiCheckIsSupportSoterAuthentication());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.c());
    localq.b(new af());
    localq.b(new ae());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.l());
    localq.b(new bn());
    localq.b(new JsApiBatchGetContact());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.camera.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.z());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.audio.m());
    localq.b(new JsApiNavigateBackApplication());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.e.e());
    localq.b(new JsApiCheckBioEnrollment());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.wifi.a());
    localq.b(new JsApiNavigateToDevMiniProgram());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.d(HCEService.class, HCETransparentUI.class));
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.nfc.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.t());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.v());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.u());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.y());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.r.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.r.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.r.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.r.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.ac());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.f(com.tencent.mm.plugin.appbrand.jsapi.i.f.hRA, com.tencent.mm.plugin.appbrand.af.auy()));
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.k(com.tencent.mm.plugin.appbrand.af.auy()));
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.n());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ae());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.af());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.o());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.p());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.q());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.z());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.y());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ak());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.u());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.w());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ad());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.h());
    localq.b(new ah());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.s());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.n());
    localq.b(new JsApiOpenDocument());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.x());
    localq.b(new aj());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.t());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.v());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ac());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ag());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.r());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.m());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ai());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.k());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.aa());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.ab());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.file.j());
    localq.b(new JsApiGetLabInfo());
    localq.b(new JsApiSetLabInfo());
    localq.b(new JsApiUpdateApp());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.b.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.b.b());
    localq.b(new ax());
    localq.b(new bb());
    localq.b(new bc());
    localq.b(new bd());
    localq.b(new be());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.q.b());
    localq.b(new JsApiLaunchApplication());
    localq.b(new JsApiLaunchApplicationDirectly());
    localq.b(new JsApiAddNativeDownloadTask());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.l.d());
    localq.b(new JsApiAddDownloadTask());
    localq.b(new JsApiAddDownloadTaskStraight());
    localq.b(new JsApiQueryDownloadTask());
    localq.b(new JsApiInstallDownloadTask());
    localq.b(new JsApiPauseDownloadTask());
    localq.b(new JsApiResumeDownloadTask());
    localq.b(new JsApiGetInstallState());
    localq.b(new JsApiCancelDownloadTask());
    localq.b(new JsApiWriteCommData());
    localq.b(new ak());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.l());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.m());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.f.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.f.b());
    Object localObject = new ArrayList();
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.h());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.p());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.u());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.l());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.j());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.k());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.m());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.i());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.t());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.g());
    localq.aI((List)localObject);
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.b());
    localq.b(new JsApiOpenAdCanvas());
    localq.b(new ag());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.profile.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.profile.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.profile.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.h.a());
    localq.b(new am());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.offlinevoice.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.j.a());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.j.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.j.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.m());
    localq.b(new JsApiGetABTestConfig());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.i.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.k());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.h());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.d());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.video.f());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.video.j());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.video.i());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.video.g());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.b());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.e());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.d());
    localq.b(new bg());
    localq.b(new JsApiPrivateAddContact());
    localq.b(new z());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.media.c());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.ae());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.k.r());
    localq.b(new com.tencent.mm.plugin.appbrand.jsapi.share.e());
    localq.b(new JsApiChooseMultiMedia());
    localObject = localq.hwk;
    AppMethodBeat.o(130363);
    return localObject;
  }

  public static Map<String, m> aCi()
  {
    AppMethodBeat.i(130364);
    q localq = new q();
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.profile.c());
    localq.c(new aw());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.h());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.i());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.j());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.d.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.o.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.o.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.o.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.o.f());
    localq.c(new bi());
    localq.c(new bk());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.m.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.m.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.b());
    localq.c(new ao());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.video.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.video.j());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.video.i());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.video.h());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.video.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.h());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.a());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.live.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.b.a.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.i());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.k());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.contact.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.contact.e());
    localq.c(new JsApiPrivateAddContact());
    localq.c(new bh());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.a());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.a.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.a.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.a.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.a.f());
    localq.c(new bm());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.q.n());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.container.a());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.container.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.container.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.a.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.a.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.m.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.m.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.m.h());
    localq.c(new bl());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.k());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.h());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.i());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.camera.j());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.camera.n());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.camera.m());
    localq.c(new com.tencent.mm.plugin.appbrand.debugger.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.t.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.t.h());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.t.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.l());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.b.j());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.k());
    localq.c(new bg());
    localq.c(new z());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.j());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.coverview.g());
    Object localObject = new ArrayList();
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.o());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.q());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.v());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.b());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.e());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.s());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.d());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.r());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.n());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.c());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.f());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.i());
    ((List)localObject).add(new com.tencent.mm.plugin.appbrand.jsapi.g.t());
    localq.aJ((List)localObject);
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.r.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.r.a());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.w());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.c());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.r.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.r.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.l.e());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.p());
    localq.c(new com.tencent.mm.plugin.appbrand.weishi.f());
    localq.c(new JsApiOperateWXData());
    localq.c(new JsApiLogin());
    localq.c(new JsApiAuthorize());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.q.f());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.q.k());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.q.h());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.q.l());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.k.ac());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.j());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.m());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.storage.e());
    localq.c(new at());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.a.a.b());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.a.a.d());
    localq.c(new com.tencent.mm.plugin.appbrand.jsapi.u.a.a.c());
    localq.c(new JsApiShowImageOperateSheet());
    localObject = localq.hwl;
    AppMethodBeat.o(130364);
    return localObject;
  }

  private void aI(List<m> paramList)
  {
    AppMethodBeat.i(130365);
    if (paramList.size() <= 0)
      AppMethodBeat.o(130365);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        b((m)paramList.next());
      AppMethodBeat.o(130365);
    }
  }

  private void aJ(List<m> paramList)
  {
    AppMethodBeat.i(130367);
    if (paramList.size() <= 0)
      AppMethodBeat.o(130367);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        c((m)paramList.next());
      AppMethodBeat.o(130367);
    }
  }

  private void b(m paramm)
  {
    AppMethodBeat.i(130366);
    if ((paramm == null) || (bo.isNullOrNil(paramm.getName())))
      AppMethodBeat.o(130366);
    while (true)
    {
      return;
      if ((m)this.hwk.put(paramm.getName(), paramm) != null)
      {
        paramm = new IllegalAccessError("Duplicated api instance " + d(paramm));
        AppMethodBeat.o(130366);
        throw paramm;
      }
      AppMethodBeat.o(130366);
    }
  }

  private void c(m paramm)
  {
    AppMethodBeat.i(130368);
    if ((paramm == null) || (bo.isNullOrNil(paramm.getName())))
      AppMethodBeat.o(130368);
    while (true)
    {
      return;
      if ((m)this.hwl.put(paramm.getName(), paramm) != null)
      {
        paramm = new IllegalAccessError("Duplicated api instance " + d(paramm));
        AppMethodBeat.o(130368);
        throw paramm;
      }
      AppMethodBeat.o(130368);
    }
  }

  private static String d(m paramm)
  {
    AppMethodBeat.i(130369);
    paramm = String.format(Locale.US, "[%s->%s]", new Object[] { paramm.getName(), paramm.getClass().getSimpleName() });
    AppMethodBeat.o(130369);
    return paramm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.q
 * JD-Core Version:    0.6.2
 */