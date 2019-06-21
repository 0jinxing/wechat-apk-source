package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.f.b.t;
import a.l;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.i;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.r;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.plugin.bizui.widget.BizKeyboardLinearLayout;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b.b;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f.a;
import com.tencent.mm.plugin.brandservice.ui.widget.MPSmileyFooter;
import com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView;
import com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.a;
import com.tencent.mm.plugin.brandservice.ui.widget.MPVideoView.b;
import com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi;
import com.tencent.mm.protocal.protobuf.bac;
import com.tencent.mm.protocal.protobuf.cns;
import com.tencent.mm.protocal.protobuf.dw;
import com.tencent.mm.protocal.protobuf.ed;
import com.tencent.mm.protocal.protobuf.ee;
import com.tencent.mm.protocal.protobuf.eg;
import com.tencent.mm.protocal.protobuf.eh;
import com.tencent.mm.protocal.protobuf.ei;
import com.tencent.mm.protocal.protobuf.ej;
import com.tencent.mm.protocal.protobuf.ek;
import com.tencent.mm.protocal.protobuf.en;
import com.tencent.mm.protocal.protobuf.eo;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.protocal.protobuf.ew;
import com.tencent.mm.protocal.protobuf.jz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.KeyboardLinearLayout.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.e.b;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "()V", "TAG", "", "adView", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "getAdView", "()Landroid/widget/FrameLayout;", "adView$delegate", "Lkotlin/Lazy;", "adWebView", "Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithJsApi;", "getAdWebView", "()Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithJsApi;", "adWebView$delegate", "animationHelper", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPVideoImageAnimationHelper;", "animationIv", "Landroid/widget/ImageView;", "getAnimationIv", "()Landroid/widget/ImageView;", "animationIv$delegate", "animationLayout", "Landroid/view/View;", "getAnimationLayout", "()Landroid/view/View;", "animationLayout$delegate", "animationMaskView", "getAnimationMaskView", "animationMaskView$delegate", "commentListView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoMRecyclerView;", "getCommentListView", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoMRecyclerView;", "commentListView$delegate", "commentView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView;", "getCommentView", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView;", "commentView$delegate", "commentViewHeader", "getCommentViewHeader", "commentViewHeader$delegate", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "debugAD", "", "density", "", "enterPageTime", "", "fullscreenImpl", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPFullscreenImpl;", "fullscreenStatusListener", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPFullscreenStatusListener;", "getA8KeyScene", "", "getGetA8KeyScene", "()I", "getA8KeyScene$delegate", "headerView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoHeaderView;", "getHeaderView", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoHeaderView;", "headerView$delegate", "isInFullScreen", "kbLayout", "Lcom/tencent/mm/plugin/bizui/widget/BizKeyboardLinearLayout;", "getKbLayout", "()Lcom/tencent/mm/plugin/bizui/widget/BizKeyboardLinearLayout;", "kbLayout$delegate", "kbTouchLayout", "getKbTouchLayout", "kbTouchLayout$delegate", "mOnForegroundListener", "com/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI$mOnForegroundListener$1", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI$mOnForegroundListener$1;", "maxVideoHeight", "getMaxVideoHeight", "setMaxVideoHeight", "(I)V", "menuHelper", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MpMenuHelper;", "minVideoHeight", "getMinVideoHeight", "setMinVideoHeight", "msgInfo", "Lcom/tencent/mm/message/MPMsgInfo;", "getMsgInfo", "()Lcom/tencent/mm/message/MPMsgInfo;", "msgInfo$delegate", "needToDoHeightAnimation", "getNeedToDoHeightAnimation", "()Z", "setNeedToDoHeightAnimation", "(Z)V", "orientationHelper", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoOrientationHelper;", "pageStayTime", "previewBar", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPPreviewBar;", "getPreviewBar", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPPreviewBar;", "previewBar$delegate", "publishId", "getPublishId", "()Ljava/lang/String;", "publishId$delegate", "resumePageTime", "rootView", "Landroid/widget/RelativeLayout;", "getRootView", "()Landroid/widget/RelativeLayout;", "rootView$delegate", "saveBundle", "Landroid/os/Bundle;", "scene", "getScene", "scene$delegate", "screenHeight", "getScreenHeight", "setScreenHeight", "screenWidth", "getScreenWidth", "setScreenWidth", "subScene", "getSubScene", "subScene$delegate", "videoErrView", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoErrorView;", "getVideoErrView", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoErrorView;", "videoErrView$delegate", "videoHeight", "getVideoHeight", "setVideoHeight", "videoView", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView;", "getVideoView", "()Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView;", "videoView$delegate", "videoViewContainer", "getVideoViewContainer", "videoViewContainer$delegate", "writeCommentContainer", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout;", "getWriteCommentContainer", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout;", "writeCommentContainer$delegate", "addNetSceneListener", "", "destroyReport", "destroyWebView", "doPlayVideo", "urlInfo", "Lcom/tencent/mm/protocal/protobuf/AppMsgVideoUrlInfo;", "doVideoHeightAnimation", "enableOrientationListener", "enable", "finish", "getForceOrientation", "getFullscreenImpl", "getLayoutId", "goneVideoErrorView", "init", "initActionBar", "initAd", "initCommentContainer", "initHeader", "initOrientationHelper", "initVideoBaseParam", "initVideoParam", "initVideoView", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onAppMsgGet", "resp", "Lcom/tencent/mm/protocal/protobuf/AppMsgGetResp;", "onBackPressed", "onCreate", "savedInstanceState", "onDestroy", "onGetAdData", "appMsgAdvert", "Lcom/tencent/mm/protocal/protobuf/AppMsgAdvert;", "onGetExtData", "Lcom/tencent/mm/protocal/protobuf/AppMsgGetExtResp;", "onPause", "onResume", "onSceneEnd", "errType", "errCode", "errMsg", "Lcom/tencent/mm/modelbase/NetSceneBase;", "onStart", "removeNetSceneListener", "sendScrollEvent", "setTouchListener", "view", "height", "showVideoErrorView", "updateAdHeight", "plugin-brandservice_release"})
@com.tencent.mm.ui.base.a(6)
public class BizVideoDetailUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private final String TAG;
  private int bpm;
  private float density;
  private int ieu;
  private int iev;
  private long ism;
  private final boolean jVT;
  private final a.f jVU;
  private final a.f jVV;
  private final a.f jVW;
  private final a.f jVX;
  private final a.f jVY;
  private final a.f jVZ;
  boolean jWA;
  private com.tencent.mm.plugin.brandservice.ui.widget.b jWB;
  private final BizVideoDetailUI.t jWC;
  private final a.f jWa;
  private final a.f jWb;
  private final a.f jWc;
  private final a.f jWd;
  private final a.f jWe;
  private final a.f jWf;
  private final a.f jWg;
  private final a.f jWh;
  private final a.f jWi;
  private final a.f jWj;
  private com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g jWk;
  private com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b jWl;
  private boolean jWm;
  private com.tencent.mm.plugin.brandservice.ui.widget.a jWn;
  private long jWo;
  private long jWp;
  private final a.f jWq;
  private final a.f jWr;
  private final a.f jWs;
  private final a.f jWt;
  private final a.f jWu;
  private final a.f jWv;
  int jWw;
  private b jWx;
  private Bundle jWy;
  private com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f jWz;
  private int videoHeight;

  static
  {
    AppMethodBeat.i(15179);
    eQB = new a.i.k[] { (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "rootView", "getRootView()Landroid/widget/RelativeLayout;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "animationMaskView", "getAnimationMaskView()Landroid/view/View;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "kbLayout", "getKbLayout()Lcom/tencent/mm/plugin/bizui/widget/BizKeyboardLinearLayout;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "kbTouchLayout", "getKbTouchLayout()Landroid/view/View;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "videoView", "getVideoView()Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "videoErrView", "getVideoErrView()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoErrorView;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "videoViewContainer", "getVideoViewContainer()Landroid/widget/FrameLayout;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "commentViewHeader", "getCommentViewHeader()Landroid/view/View;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "headerView", "getHeaderView()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoHeaderView;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "adView", "getAdView()Landroid/widget/FrameLayout;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "commentView", "getCommentView()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoCommentView;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "commentListView", "getCommentListView()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoMRecyclerView;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "writeCommentContainer", "getWriteCommentContainer()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPVideoWriteCommentLayout;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "previewBar", "getPreviewBar()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/MPPreviewBar;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "animationIv", "getAnimationIv()Landroid/widget/ImageView;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "animationLayout", "getAnimationLayout()Landroid/view/View;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "adWebView", "getAdWebView()Lcom/tencent/mm/plugin/webview/ui/tools/widget/MMWebViewWithJsApi;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "scene", "getScene()I")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "subScene", "getSubScene()I")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "publishId", "getPublishId()Ljava/lang/String;")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "getA8KeyScene", "getGetA8KeyScene()I")), (a.i.k)a.f.b.v.a(new t(a.f.b.v.aN(BizVideoDetailUI.class), "msgInfo", "getMsgInfo()Lcom/tencent/mm/message/MPMsgInfo;")) };
    AppMethodBeat.o(15179);
  }

  public BizVideoDetailUI()
  {
    AppMethodBeat.i(15211);
    this.TAG = "MicroMsg.BizVideoDetailUI";
    this.jVU = a.g.g((a.f.a.a)new BizVideoDetailUI.aa(this));
    this.jVV = a.g.g((a.f.a.a)new BizVideoDetailUI.e(this));
    this.jVW = a.g.g((a.f.a.a)new r(this));
    this.jVX = a.g.g((a.f.a.a)new s(this));
    this.jVY = a.g.g((a.f.a.a)new BizVideoDetailUI.af(this));
    this.jVZ = a.g.g((a.f.a.a)new BizVideoDetailUI.ae(this));
    this.jWa = a.g.g((a.f.a.a)new BizVideoDetailUI.ag(this));
    this.jWb = a.g.g((a.f.a.a)new BizVideoDetailUI.h(this));
    this.jWc = a.g.g((a.f.a.a)new BizVideoDetailUI.l(this));
    this.jWd = a.g.g((a.f.a.a)new BizVideoDetailUI.a(this));
    this.jWe = a.g.g((a.f.a.a)new BizVideoDetailUI.g(this));
    this.jWf = a.g.g((a.f.a.a)new BizVideoDetailUI.f(this));
    this.jWg = a.g.g((a.f.a.a)new BizVideoDetailUI.ah(this));
    this.jWh = a.g.g((a.f.a.a)new BizVideoDetailUI.y(this));
    this.jWi = a.g.g((a.f.a.a)new BizVideoDetailUI.c(this));
    this.jWj = a.g.g((a.f.a.a)new BizVideoDetailUI.d(this));
    this.jWk = new com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g();
    this.jWq = a.g.g((a.f.a.a)new BizVideoDetailUI.b(this));
    this.jWr = a.g.g((a.f.a.a)new BizVideoDetailUI.ab(this));
    this.jWs = a.g.g((a.f.a.a)new BizVideoDetailUI.ad(this));
    this.jWt = a.g.g((a.f.a.a)new BizVideoDetailUI.z(this));
    this.jWu = a.g.g((a.f.a.a)new k(this));
    this.jWv = a.g.g((a.f.a.a)new BizVideoDetailUI.u(this));
    this.jWx = new b();
    this.jWz = new com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f();
    this.jWB = ((com.tencent.mm.plugin.brandservice.ui.widget.b)new BizVideoDetailUI.j(this));
    this.jWC = new BizVideoDetailUI.t(this);
    AppMethodBeat.o(15211);
  }

  private static void P(View paramView, int paramInt)
  {
    AppMethodBeat.i(15198);
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
    {
      paramView = new a.v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
      AppMethodBeat.o(15198);
      throw paramView;
    }
    localLayoutParams.height = paramInt;
    paramView.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(15198);
  }

  private void a(ek paramek)
  {
    int i = 0;
    AppMethodBeat.i(15206);
    if (paramek == null)
      AppMethodBeat.o(15206);
    while (true)
    {
      return;
      if (paramek.vGj != 0)
      {
        localObject1 = (MPPreviewBar)this.jWh.getValue();
        j.o(localObject1, "previewBar");
        ((MPPreviewBar)localObject1).setVisibility(0);
      }
      if ((paramek.vGq != null) && (r.ks(aYD().fgc)))
      {
        localObject1 = aYv();
        localObject2 = paramek.vGq;
        j.o(localObject2, "resp.base_appmsg_info");
        ((MPVideoHeaderView)localObject1).setOriginInfo((eg)localObject2);
      }
      Object localObject2 = this.jWx;
      ((b)localObject2).fgc = paramek.vGl;
      if (((b)localObject2).aYp())
      {
        localObject1 = ((b)localObject2).jVG;
        if (localObject1 == null)
          j.avw("msgInfo");
        localObject2 = ((b)localObject2).jVG;
        if (localObject2 == null)
          j.avw("msgInfo");
        ((r)localObject2).fgc |= 1;
      }
      if ((paramek.vGp != null) && (this.jWx.aYp()))
      {
        this.jWx.jVI = paramek.vGp;
        localObject1 = aYv();
        localObject2 = paramek.vGp;
        j.o(localObject2, "resp.malicious_title_info");
        ((MPVideoHeaderView)localObject1).setMaliciousInfo((bac)localObject2);
      }
      this.jWx.fgd = paramek.fgd;
      localObject2 = this.jWx;
      Object localObject1 = paramek.vGo;
      j.o(localObject1, "resp.copy_url");
      j.p(localObject1, "<set-?>");
      ((b)localObject2).jVB = ((String)localObject1);
      this.jWx.Gd(paramek.url);
      aYx().setTmpUrl(paramek.vGj);
      if ((paramek.vGn != null) && (paramek.vGn.cCJ != 0))
      {
        ab.i(this.TAG, "play_error_info msg:" + paramek.vGn.cCK + " errCode:" + paramek.vGn.cCJ);
        aYs().setPlayError$505cff1c(paramek.vGn.cCK);
        aYJ();
        AppMethodBeat.o(15206);
      }
      else
      {
        aYI();
        if (bo.ek((List)paramek.vGg))
        {
          AppMethodBeat.o(15206);
        }
        else
        {
          localObject1 = (ew)paramek.vGg.get(0);
          localObject2 = aYr();
          if ((paramek.vGk & 0x1) != 0);
          for (boolean bool = true; ; bool = false)
          {
            ((MPVideoView)localObject2).setAutoPlay(bool);
            aYr().setInitialTime(com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c.Gg(aYD().HE() + "_" + paramek.fgd));
            j.o(localObject1, "urlInfo");
            aYr().bL(((ew)localObject1).url, ((ew)localObject1).vGL / 1000);
            paramek = aYr();
            if (((ew)localObject1).width > ((ew)localObject1).height)
              i = 90;
            paramek.setFullScreenDirection(i);
            if (((ew)localObject1).width > ((ew)localObject1).height)
              aYH();
            if ((((ew)localObject1).width <= 0) || (((ew)localObject1).height <= 0) || (aYD().fjT.videoWidth > 0) || (aYD().fjT.videoHeight > 0))
              break label644;
            aYD().fjT.videoWidth = ((ew)localObject1).width;
            aYD().fjT.videoHeight = ((ew)localObject1).height;
            if (!this.jWz.jYI)
              break label639;
            aYG();
            AppMethodBeat.o(15206);
            break;
          }
          label639: this.jWA = true;
          label644: AppMethodBeat.o(15206);
        }
      }
    }
  }

  private final ImageView aYA()
  {
    AppMethodBeat.i(15190);
    ImageView localImageView = (ImageView)this.jWi.getValue();
    AppMethodBeat.o(15190);
    return localImageView;
  }

  private final View aYB()
  {
    AppMethodBeat.i(15191);
    View localView = (View)this.jWj.getValue();
    AppMethodBeat.o(15191);
    return localView;
  }

  private final MMWebViewWithJsApi aYC()
  {
    AppMethodBeat.i(15192);
    MMWebViewWithJsApi localMMWebViewWithJsApi = (MMWebViewWithJsApi)this.jWq.getValue();
    AppMethodBeat.o(15192);
    return localMMWebViewWithJsApi;
  }

  private final r aYD()
  {
    AppMethodBeat.i(15193);
    r localr = (r)this.jWv.getValue();
    AppMethodBeat.o(15193);
    return localr;
  }

  private final void aYE()
  {
    AppMethodBeat.i(15195);
    this.ieu = com.tencent.mm.bz.a.gd((Context)dxU());
    this.iev = com.tencent.mm.bz.a.ge((Context)dxU());
    this.bpm = ((int)(0.65D * this.iev));
    this.jWw = (this.ieu * 9 / 16);
    this.bpm = Math.max(this.bpm, this.jWw);
    this.videoHeight = this.jWw;
    AppMethodBeat.o(15195);
  }

  private final void aYF()
  {
    AppMethodBeat.i(15196);
    if ((aYD().fjT.videoWidth > 0) && (aYD().fjT.videoHeight > 0))
    {
      i = this.ieu * aYD().fjT.videoHeight / aYD().fjT.videoWidth;
      if (i <= this.bpm)
        break label328;
      this.videoHeight = this.bpm;
      if (aYD().fjT.videoWidth > aYD().fjT.videoHeight)
        aYH();
    }
    if ((aYD().fjT.videoWidth > 0) && (aYD().fjT.videoHeight > 0));
    for (int i = this.videoHeight; ; i = this.jWw)
    {
      this.bpm = i;
      if (this.bpm - this.jWw < 10)
        this.jWw = this.bpm;
      Object localObject1 = aYy();
      Object localObject2 = aYr();
      j.o(localObject2, "videoView");
      Object localObject3 = aYt();
      j.o(localObject3, "videoViewContainer");
      Object localObject4 = aYB();
      j.o(localObject4, "animationLayout");
      ((MPVideoMRecyclerView)localObject1).a((MPVideoView)localObject2, (FrameLayout)localObject3, (View)localObject4, this.bpm, this.jWw);
      localObject1 = this.jWz;
      localObject3 = getIntent();
      j.o(localObject3, "intent");
      localObject4 = dxU();
      j.o(localObject4, "context");
      localObject2 = (Context)localObject4;
      localObject4 = aYB();
      j.o(localObject4, "animationLayout");
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f)localObject1).a((Intent)localObject3, (Context)localObject2, (View)localObject4, aYq());
      aYr().a(aYA(), aYD().fjT.fjx, this.ieu, this.videoHeight, aYD());
      AppMethodBeat.o(15196);
      return;
      label328: if (i < this.jWw)
      {
        this.videoHeight = this.jWw;
        break;
      }
      this.videoHeight = i;
      break;
    }
  }

  private final void aYH()
  {
    AppMethodBeat.i(15200);
    if (this.jWl != null)
      AppMethodBeat.o(15200);
    while (true)
    {
      return;
      Object localObject = dxU();
      j.o(localObject, "context");
      localObject = (Context)localObject;
      MPVideoView localMPVideoView = aYr();
      j.o(localMPVideoView, "videoView");
      this.jWl = new com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b((Context)localObject, localMPVideoView);
      localObject = this.jWl;
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b)localObject).fB(true);
        AppMethodBeat.o(15200);
      }
      else
      {
        AppMethodBeat.o(15200);
      }
    }
  }

  private final void aYI()
  {
    AppMethodBeat.i(15207);
    MPVideoErrorView localMPVideoErrorView = aYs();
    j.o(localMPVideoErrorView, "videoErrView");
    localMPVideoErrorView.setVisibility(8);
    fz(true);
    AppMethodBeat.o(15207);
  }

  private final void aYJ()
  {
    AppMethodBeat.i(15208);
    MPVideoErrorView localMPVideoErrorView = aYs();
    j.o(localMPVideoErrorView, "videoErrView");
    localMPVideoErrorView.setVisibility(0);
    fz(false);
    AppMethodBeat.o(15208);
  }

  private final View aYq()
  {
    AppMethodBeat.i(15180);
    View localView = (View)this.jVV.getValue();
    AppMethodBeat.o(15180);
    return localView;
  }

  private final MPVideoView aYr()
  {
    AppMethodBeat.i(15181);
    MPVideoView localMPVideoView = (MPVideoView)this.jVY.getValue();
    AppMethodBeat.o(15181);
    return localMPVideoView;
  }

  private final MPVideoErrorView aYs()
  {
    AppMethodBeat.i(15182);
    MPVideoErrorView localMPVideoErrorView = (MPVideoErrorView)this.jVZ.getValue();
    AppMethodBeat.o(15182);
    return localMPVideoErrorView;
  }

  private final View aYu()
  {
    AppMethodBeat.i(15184);
    View localView = (View)this.jWb.getValue();
    AppMethodBeat.o(15184);
    return localView;
  }

  private final MPVideoHeaderView aYv()
  {
    AppMethodBeat.i(15185);
    MPVideoHeaderView localMPVideoHeaderView = (MPVideoHeaderView)this.jWc.getValue();
    AppMethodBeat.o(15185);
    return localMPVideoHeaderView;
  }

  private final FrameLayout aYw()
  {
    AppMethodBeat.i(15186);
    FrameLayout localFrameLayout = (FrameLayout)this.jWd.getValue();
    AppMethodBeat.o(15186);
    return localFrameLayout;
  }

  private final MPVideoCommentView aYx()
  {
    AppMethodBeat.i(15187);
    MPVideoCommentView localMPVideoCommentView = (MPVideoCommentView)this.jWe.getValue();
    AppMethodBeat.o(15187);
    return localMPVideoCommentView;
  }

  private final MPVideoMRecyclerView aYy()
  {
    AppMethodBeat.i(15188);
    MPVideoMRecyclerView localMPVideoMRecyclerView = (MPVideoMRecyclerView)this.jWf.getValue();
    AppMethodBeat.o(15188);
    return localMPVideoMRecyclerView;
  }

  private final MPVideoWriteCommentLayout aYz()
  {
    AppMethodBeat.i(15189);
    MPVideoWriteCommentLayout localMPVideoWriteCommentLayout = (MPVideoWriteCommentLayout)this.jWg.getValue();
    AppMethodBeat.o(15189);
    return localMPVideoWriteCommentLayout;
  }

  public final void aYG()
  {
    AppMethodBeat.i(15197);
    int i = this.videoHeight;
    aYE();
    aYF();
    ab.i(this.TAG, "initVideoParam with cgi: width " + aYD().fjT.videoWidth + " height " + aYD().fjT.videoHeight);
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { i, this.videoHeight });
    localValueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new BizVideoDetailUI.i(this));
    j.o(localValueAnimator, "va");
    localValueAnimator.setDuration(100L);
    localValueAnimator.start();
    AppMethodBeat.o(15197);
  }

  public final FrameLayout aYt()
  {
    AppMethodBeat.i(15183);
    FrameLayout localFrameLayout = (FrameLayout)this.jWa.getValue();
    AppMethodBeat.o(15183);
    return localFrameLayout;
  }

  public void finish()
  {
    AppMethodBeat.i(138061);
    super.finish();
    overridePendingTransition(2131034130, 2131034227);
    AppMethodBeat.o(138061);
  }

  public final void fz(boolean paramBoolean)
  {
    AppMethodBeat.i(15199);
    if (this.jWl != null)
    {
      com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b localb = this.jWl;
      if (localb != null)
      {
        localb.fB(paramBoolean);
        AppMethodBeat.o(15199);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(15199);
    }
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130968880;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Context localContext = null;
    Object localObject1 = null;
    AppMethodBeat.i(15209);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g localg = this.jWk;
    Object localObject2;
    if (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        localContext = (Context)localg.aYo();
        localObject2 = localg.aYo();
        paramIntent = (Intent)localObject1;
        if (localObject2 != null)
          paramIntent = ((BizVideoDetailUI)localObject2).getString(2131305839);
        h.bN(localContext, paramIntent);
        paramIntent = localg.jWx;
        if (paramIntent == null)
          j.avw("controller");
        paramIntent.jVC.sF(2);
      }
      paramInt1 = 1;
      if (paramInt1 == 0)
        break label288;
      AppMethodBeat.o(15209);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 2) && (paramInt2 == -1))
      {
        if (paramIntent == null)
          break label277;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        label136: if (paramIntent == null)
          break label283;
      }
      label277: label283: for (paramIntent = paramIntent.getStringExtra("custom_send_text"); ; paramIntent = null)
      {
        if (localObject1 != null)
        {
          localObject2 = com.tencent.mm.plugin.brandservice.ui.timeline.video.a.a.jYp;
          localObject2 = localg.jVG;
          if (localObject2 == null)
            j.avw("msgInfo");
          b localb = localg.jWx;
          if (localb == null)
            j.avw("controller");
          if (com.tencent.mm.plugin.brandservice.ui.timeline.video.a.a.a((String)localObject1, (r)localObject2, paramIntent, localb))
          {
            localObject1 = (Context)localg.aYo();
            localObject2 = localg.aYo();
            paramIntent = localContext;
            if (localObject2 != null)
              paramIntent = ((BizVideoDetailUI)localObject2).getString(2131305839);
            h.bN((Context)localObject1, paramIntent);
            paramIntent = localg.jWx;
            if (paramIntent == null)
              j.avw("controller");
            paramIntent.jVC.sF(1);
          }
        }
        paramInt1 = 0;
        break;
        localObject1 = null;
        break label136;
      }
      label288: AppMethodBeat.o(15209);
    }
  }

  public void onBackPressed()
  {
    int i = 1;
    AppMethodBeat.i(15205);
    if (this.jWm)
    {
      aYr().j(false, 0);
      AppMethodBeat.o(15205);
      return;
    }
    MPVideoWriteCommentLayout localMPVideoWriteCommentLayout = aYz();
    if ((localMPVideoWriteCommentLayout.jXV.aYU()) && (localMPVideoWriteCommentLayout.aFF()))
      localMPVideoWriteCommentLayout.jXV.aYW();
    while (true)
    {
      if (i == 0)
        super.onBackPressed();
      AppMethodBeat.o(15205);
      break;
      if ((localMPVideoWriteCommentLayout.jYe != -3) && (localMPVideoWriteCommentLayout.aFF()))
        localMPVideoWriteCommentLayout.hide();
      else
        i = 0;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(15194);
    com.tencent.mm.pluginsdk.f.m((MMActivity)this);
    this.jWy = paramBundle;
    super.onCreate(paramBundle);
    if (aYD().fjT == null)
    {
      finish();
      ab.w(this.TAG, "onCreate msgInfo.item is null");
      AppMethodBeat.o(15194);
    }
    while (true)
    {
      return;
      Object localObject1 = this.TAG;
      Object localObject2 = new StringBuilder("onCreate rawUrl is ");
      paramBundle = aYD().fjT;
      if (paramBundle == null)
        j.dWJ();
      ab.i((String)localObject1, paramBundle.url);
      com.tencent.mm.kernel.g.Rg().a(1179, (com.tencent.mm.ai.f)this);
      com.tencent.mm.kernel.g.Rg().a(2866, (com.tencent.mm.ai.f)this);
      com.tencent.mm.kernel.g.Rg().a(2776, (com.tencent.mm.ai.f)this);
      com.tencent.mm.kernel.g.Rg().a(2759, (com.tencent.mm.ai.f)this);
      com.tencent.mm.kernel.g.Rg().a(2691, (com.tencent.mm.ai.f)this);
      com.tencent.mm.kernel.g.Rg().a(2617, (com.tencent.mm.ai.f)this);
      paramBundle = this.jWk;
      localObject1 = aYD();
      localObject2 = this.jWx;
      j.p(this, "ui");
      j.p(localObject1, "msgInfo");
      j.p(localObject2, "controller");
      paramBundle.hiC = new WeakReference(this);
      paramBundle.jVG = ((r)localObject1);
      paramBundle.jWx = ((b)localObject2);
      xE(com.tencent.mm.bz.a.i((Context)dxU(), 2131690597));
      setBackBtn((MenuItem.OnMenuItemClickListener)new BizVideoDetailUI.m(this), 2131230746);
      getController().l((Activity)this, -16777216);
      a(2131230747, (MenuItem.OnMenuItemClickListener)new BizVideoDetailUI.n(this), (View.OnLongClickListener)BizVideoDetailUI.o.jWF);
      setMMTitle("");
      paramBundle = aYx();
      localObject1 = aYy();
      j.o(localObject1, "commentListView");
      MRecyclerView localMRecyclerView = (MRecyclerView)localObject1;
      View localView = aYu();
      j.o(localView, "commentViewHeader");
      b localb = this.jWx;
      j.p(localMRecyclerView, "recyclerView");
      j.p(localView, "header");
      j.p(localb, "controller");
      paramBundle.jWJ = localMRecyclerView;
      localObject1 = new LinkedList();
      localObject2 = paramBundle.getContext();
      j.o(localObject2, "context");
      paramBundle.jWM = new MPVideoCommentView.a((Context)localObject2, (LinkedList)localObject1, localb);
      localMRecyclerView.setAdapter((RecyclerView.a)paramBundle.jWM);
      localMRecyclerView.addHeaderView(localView);
      paramBundle.getContext();
      localMRecyclerView.setLayoutManager((RecyclerView.i)new LinearLayoutManager());
      localMRecyclerView.setNestedScrollingEnabled(false);
      paramBundle = aYx();
      localObject1 = aYz();
      j.o(localObject1, "writeCommentContainer");
      paramBundle.setWriteCommentLayout((MPVideoWriteCommentLayout)localObject1);
      paramBundle = aYz();
      localObject1 = (BizKeyboardLinearLayout)this.jVW.getValue();
      j.o(localObject1, "kbLayout");
      j.p(localObject1, "kbLayout");
      paramBundle.jXU = ((BizKeyboardLinearLayout)localObject1);
      ((BizKeyboardLinearLayout)localObject1).setOnkbdStateListener((KeyboardLinearLayout.a)new MPVideoWriteCommentLayout.c(paramBundle, (BizKeyboardLinearLayout)localObject1));
      aYz().setController(this.jWx);
      paramBundle = this.jWx;
      int i = ((Number)this.jWr.getValue()).intValue();
      int j = ((Number)this.jWs.getValue()).intValue();
      localObject2 = aYD().fjT;
      if (localObject2 == null)
        j.dWJ();
      localObject1 = aYD();
      j.p(this, "ui");
      j.p(localObject2, "readerItem");
      j.p(localObject1, "msgInfo");
      paramBundle.hiC = new WeakReference(this);
      paramBundle.scene = i;
      paramBundle.jSW = j;
      paramBundle.Gd(((com.tencent.mm.af.p)localObject2).url);
      paramBundle.jVH = ((com.tencent.mm.af.p)localObject2);
      paramBundle.jVG = ((r)localObject1);
      paramBundle.ffZ = ((com.tencent.mm.af.p)localObject2).type;
      paramBundle.cwG = ((r)localObject1).cwG;
      paramBundle.jVz = ((r)localObject1).fjR;
      paramBundle.fgd = ((r)localObject1).fjT.fgd;
      localObject2 = paramBundle.jVC;
      j.p(paramBundle, "controller");
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.e)localObject2).jWx = paramBundle;
      localObject2 = paramBundle.jVJ;
      j.p(paramBundle, "controller");
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d)localObject2).jWx = paramBundle;
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d)localObject2).sE(1);
      try
      {
        localObject1 = Uri.parse(((r)localObject1).fjT.url);
        paramBundle.jVD = bo.getLong(((Uri)localObject1).getQueryParameter("mid"), 0L);
        paramBundle.jVE = bo.getInt(((Uri)localObject1).getQueryParameter("idx"), 0);
        ab.i(paramBundle.TAG, "init vid=" + paramBundle.fgd);
        this.jWx.aYm();
        this.jWx.sB(1);
        localObject1 = this.jWx;
        paramBundle = new eh();
        paramBundle.url = ((b)localObject1).url;
        paramBundle.scene = ((b)localObject1).scene;
        paramBundle.vFQ = ((b)localObject1).jSW;
        paramBundle.vFO = ((b)localObject1).ffZ;
        paramBundle.session_id = s.getSessionId();
        paramBundle.vFP = ((b)localObject1).jVF;
        localObject1 = new b.a();
        ((b.a)localObject1).a((com.tencent.mm.bt.a)paramBundle);
        ((b.a)localObject1).b((com.tencent.mm.bt.a)new ei());
        ((b.a)localObject1).qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_getext");
        ((b.a)localObject1).kU(2776);
        ((b.a)localObject1).kV(0);
        ((b.a)localObject1).kW(0);
        w.a(((b.a)localObject1).acD(), (w.a)b.g.jVR);
        paramBundle = aYv();
        localObject2 = aYD();
        localObject1 = this.jWx;
        j.p(localObject2, "msgInfo");
        j.p(localObject1, "controller");
        paramBundle.jVG = ((r)localObject2);
        paramBundle.talker = ((b)localObject1).HE();
        localObject2 = ((r)localObject2).fjT;
        j.o(localObject2, "msgInfo.item");
        paramBundle.jVH = ((com.tencent.mm.af.p)localObject2);
        paramBundle.jWx = ((b)localObject1);
        paramBundle.initView();
        paramBundle = aYv();
        localObject1 = aYz();
        j.o(localObject1, "writeCommentContainer");
        paramBundle.setWriteCommentLayout((MPVideoWriteCommentLayout)localObject1);
        paramBundle = findViewById(2131821884);
        j.o(paramBundle, "findViewById(R.id.biz_video_wow_edu_view)");
        paramBundle = (MPVideoWowEduView)paramBundle;
        aYv().setWowEduView(paramBundle);
        aYw().addView((View)aYC(), 0);
        aYr().setBizVideoControlBar(this.jWx);
        aYE();
        ab.i(this.TAG, "initVideoParam width " + aYD().fjT.videoWidth + " height " + aYD().fjT.videoHeight);
        if ((aYD().fjT.videoWidth <= 0) || (aYD().fjT.videoHeight <= 0))
        {
          aYr();
          localObject1 = MPVideoView.a(aYD());
          if (com.tencent.mm.vfs.e.ct((String)localObject1))
          {
            paramBundle = new BitmapFactory.Options();
            paramBundle.inJustDecodeBounds = true;
            localObject1 = com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject1, paramBundle);
            if ((paramBundle.outWidth > 0) && (paramBundle.outHeight > 0))
            {
              aYD().fjT.videoWidth = paramBundle.outWidth;
              aYD().fjT.videoHeight = paramBundle.outHeight;
              ab.i(this.TAG, "initVideoParam with cover: width " + aYD().fjT.videoWidth + " height " + aYD().fjT.videoHeight);
            }
            if (localObject1 != null)
              ((Bitmap)localObject1).recycle();
          }
        }
        aYF();
        paramBundle = aYt();
        j.o(paramBundle, "videoViewContainer");
        P((View)paramBundle, this.videoHeight);
        paramBundle = aYB();
        j.o(paramBundle, "animationLayout");
        P(paramBundle, this.videoHeight);
        ab.i(this.TAG, "initVideoParam minVideoHeight " + this.jWw + " maxVideoHeight " + this.bpm);
        aYr().setFullScreenDelegate((MPVideoView.a)new p(this));
        aYr().setMPVideoViewCallBack((MPVideoView.b)new q(this));
        aYr().setTitle(aYD().fjT.title);
        localObject1 = aYs();
        localObject2 = this.jWx;
        paramBundle = this.jWz;
        j.p(localObject2, "controller");
        ((MPVideoErrorView)localObject1).jWH.setOnClickListener((View.OnClickListener)new MPVideoErrorView.a((MPVideoErrorView)localObject1, (b)localObject2, paramBundle));
        ((View)this.jVX.getValue()).setOnTouchListener((View.OnTouchListener)new BizVideoDetailUI.ac(this));
        this.jWo = System.currentTimeMillis();
        com.tencent.mm.sdk.b.a.xxA.c((com.tencent.mm.sdk.b.c)this.jWC);
        AppMethodBeat.o(15194);
      }
      catch (UnsupportedOperationException localUnsupportedOperationException)
      {
        while (true)
          ab.w(paramBundle.TAG, "init parse url exp %s", new Object[] { localUnsupportedOperationException.getMessage() });
      }
      catch (Exception localException)
      {
        while (true)
          ab.w(paramBundle.TAG, "init parse url exp %s", new Object[] { localException.getMessage() });
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(15204);
    super.onDestroy();
    com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d locald = this.jWx.jVJ;
    Object localObject = aYr();
    j.o(localObject, "videoView");
    locald.jYy = ((MPVideoView)localObject).getEndPlayTime();
    if (this.jWo != 0L)
    {
      long l1 = System.currentTimeMillis();
      long l2 = this.ism;
      this.ism = (l1 - this.jWp + l2);
      this.jWx.jVJ.jYz = ((int)(this.ism / 1000L));
    }
    locald = this.jWx.jVJ;
    localObject = aYr();
    j.o(localObject, "videoView");
    locald.jYx = ((int)((MPVideoView)localObject).getRealPlayTime());
    this.jWx.jVJ.sE(2);
    com.tencent.mm.kernel.g.Rg().b(1179, (com.tencent.mm.ai.f)this);
    com.tencent.mm.kernel.g.Rg().b(2866, (com.tencent.mm.ai.f)this);
    com.tencent.mm.kernel.g.Rg().b(2776, (com.tencent.mm.ai.f)this);
    com.tencent.mm.kernel.g.Rg().b(2759, (com.tencent.mm.ai.f)this);
    com.tencent.mm.kernel.g.Rg().b(2691, (com.tencent.mm.ai.f)this);
    com.tencent.mm.kernel.g.Rg().b(2617, (com.tencent.mm.ai.f)this);
    localObject = aYr();
    if (localObject != null)
    {
      localObject = Integer.valueOf(((MPVideoView)localObject).getCurrPosSec());
      if (localObject == null)
        j.dWJ();
      int i = ((Integer)localObject).intValue();
      localObject = aYr();
      int j = i;
      if (localObject != null)
      {
        j = i;
        if (i == ((MPVideoView)localObject).getDuration())
          j = 0;
      }
      com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c.e(aYD().HE() + "_" + this.jWx.fgd, j);
      aYr().aEX();
      if (this.jWn != null)
      {
        localObject = this.jWn;
        if (localObject == null)
          j.dWJ();
        ((com.tencent.mm.plugin.brandservice.ui.widget.a)localObject).b(this.jWB);
      }
      com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)this.jWC);
      this.jWx.onDestroy();
      aYC().destroy();
      aYC().setWebChromeClient(null);
      aYC().setWebViewClient(null);
      aYC().setOnTouchListener(null);
      aYC().setOnLongClickListener(null);
      aYC().setVisibility(8);
      aYC().removeAllViews();
      aYC().clearView();
      localObject = this.jWl;
      if (localObject == null)
        break label453;
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.b)localObject).jYr.disable();
      AppMethodBeat.o(15204);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label453: AppMethodBeat.o(15204);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(15203);
    super.onPause();
    aYr().akV();
    long l = System.currentTimeMillis();
    this.ism += l - this.jWp;
    this.jWp = l;
    AppMethodBeat.o(15203);
  }

  public void onResume()
  {
    AppMethodBeat.i(15201);
    super.onResume();
    aYr().akW();
    this.jWp = System.currentTimeMillis();
    AppMethodBeat.o(15201);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(15210);
    this.jWx.aYn();
    if ((paramm == null) || (paramm.acN() == null))
      AppMethodBeat.o(15210);
    while (true)
    {
      return;
      ab.i(this.TAG, "onSceneEnd errType " + paramInt1 + ", errCode " + paramInt2 + ", errMsg " + paramString + ", type: " + paramm.getType());
      localObject1 = paramm.acN();
      if (localObject1 == null)
      {
        paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
        AppMethodBeat.o(15210);
        throw paramString;
      }
      localObject1 = ((com.tencent.mm.ai.b)localObject1).acz();
      if ((((localObject1 instanceof ej)) && (((ej)localObject1).vFP != this.jWx.jVF)) || (((localObject1 instanceof ed)) && (((ed)localObject1).vFP != this.jWx.jVF)) || (((localObject1 instanceof eh)) && (((eh)localObject1).vFP != this.jWx.jVF)) || (((localObject1 instanceof en)) && (((en)localObject1).vFP != this.jWx.jVF)) || (((localObject1 instanceof ep)) && (((ep)localObject1).vFP != this.jWx.jVF)))
      {
        AppMethodBeat.o(15210);
      }
      else
      {
        if (((paramm.getType() != 2691) && (paramm.getType() != 2617)) || (paramInt2 == 0) || (bo.isNullOrNil(paramString)))
          break;
        h.a((Context)dxU(), paramString, "", dxU().getString(2131296994), null);
        AppMethodBeat.o(15210);
      }
    }
    Object localObject1 = paramm.acN();
    j.o(localObject1, "scene.reqResp");
    Object localObject2;
    if (((com.tencent.mm.network.q)localObject1).getType() == 1179)
    {
      localObject1 = this.jWz;
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f)localObject1).jYH = true;
      ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f)localObject1).aYP();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        aYI();
        paramString = paramm.acN();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = ((com.tencent.mm.ai.b)paramString).acA();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgGetResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = (ek)paramString;
        paramm = this.TAG;
        localObject1 = new StringBuilder("url_info size is ");
        if (paramString.vGg != null)
        {
          localObject2 = paramString.vGg;
          if (localObject2 == null)
            j.dWJ();
        }
        for (paramInt1 = ((LinkedList)localObject2).size(); ; paramInt1 = 0)
        {
          ab.i(paramm, paramInt1);
          if ((paramString.vGh == 0) || (bo.isNullOrNil(paramString.vGi)))
            break label636;
          ab.i(this.TAG, "onSceneEnd redirect %s", new Object[] { paramString.vGi });
          paramm = dxU();
          j.o(paramm, "context");
          paramm = (Context)paramm;
          localObject1 = aYD();
          paramString = paramString.vGi;
          j.o(paramString, "resp.redirect_url");
          com.tencent.mm.plugin.brandservice.ui.timeline.video.a.c.a(paramm, (r)localObject1, paramString);
          al.n((Runnable)new BizVideoDetailUI.w(this), 500L);
          AppMethodBeat.o(15210);
          break;
        }
        label636: a(paramString);
        paramm = paramString.vGm;
        if (((paramm == null) || (paramm.enabled != 1)) && ((!this.jVT) || ((!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (!com.tencent.mm.sdk.platformtools.f.DEBUG))))
          break label996;
        j.o(paramm, "appMsgAdvert");
        paramString = "https://mp.weixin.qq.com/s?__biz=MjM5NDE1ODg2MQ==&mid=2663410252&idx=1&sn=2d23c198e56a8de51135dd6fff2a3424&chksm=bdb8ca2e8acf4338c6185291f34f8ad945e7b21ddc58b917f1421e2275830366fe83b405ba33&scene=90&xtrack=1&render_type=ad&ascene=1&devicetype=android-26&version=27000400&nettype=WIFI&abtest_cookie=BAABAAoACwASABMABQAjlx4AVpkeAMWZHgDVmR4A3JkeAAAA&lang=zh_CN&pass_ticket=HuAnleAdesPJYvj8VdGnM5iy840UzEsUCPB4f9wpHi2EEZwaCr%2BDkfL1p50iY8au&wx_header=1&mock=-1#test";
        if (!this.jVT)
        {
          paramString = paramm.url;
          j.o(paramString, "appMsgAdvert.url");
        }
        if (a.k.m.a((CharSequence)paramString, '#', 0, 6) == -1)
          break label3653;
        paramm = "#" + a.k.m.jf(paramString, "#");
        paramInt1 = paramString.length();
        paramInt2 = paramm.length();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type java.lang.String");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = paramString.substring(0, paramInt1 - paramInt2);
        j.o(paramString, "(this as java.lang.Strin…ing(startIndex, endIndex)");
      }
    }
    while (true)
    {
      paramString = paramString + "&adWidth=" + (int)(aYC().getMeasuredWidth() / this.density) + paramm;
      ab.i(this.TAG, "load ad url:".concat(String.valueOf(paramString)));
      aYC().loadUrl(paramString);
      paramString = aYy();
      j.o(paramString, "commentListView");
      paramString.getViewTreeObserver().addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)new BizVideoDetailUI.v(this));
      AppMethodBeat.o(15210);
      break;
      a(null);
      aYJ();
      paramm = aYs();
      paramm.jXq.setBackgroundResource(2130837961);
      if (!bo.isNullOrNil(paramString))
        paramm.jXp.setText((CharSequence)(paramm.getContext().getString(2131305924) + ' ' + paramString));
      while (true)
      {
        paramm.jWH.setClickable(true);
        label996: AppMethodBeat.o(15210);
        break;
        paramm.jXp.setText((CharSequence)paramm.getContext().getString(2131305924));
      }
      paramString = paramm.acN();
      j.o(paramString, "scene.reqResp");
      Object localObject3;
      if (paramString.getType() == 2866)
      {
        paramString = paramm.acN();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = ((com.tencent.mm.ai.b)paramString).acz();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListReq");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        localObject1 = (ed)paramString;
        paramString = paramm.acN();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = ((com.tencent.mm.ai.b)paramString).acA();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgCommentListResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = (ee)paramString;
        localObject3 = this.TAG;
        paramm = new StringBuilder("url_info size is ");
        if (paramString.vFR != null)
        {
          localObject2 = paramString.vFR;
          if (localObject2 == null)
            j.dWJ();
          paramInt1 = ((LinkedList)localObject2).size();
          label1231: ab.i((String)localObject3, paramInt1);
          if (((ed)localObject1).kdC != 1)
            break label1742;
          this.jWx.jVx = paramString.kKI;
          paramm = aYx();
          j.p(paramString, "resp");
          if (!bo.ek((List)paramString.vFR))
          {
            localObject1 = paramm.jWM;
            if (localObject1 != null)
            {
              localObject2 = paramString.vFR;
              j.o(localObject2, "resp.comment");
              localObject2 = (List)localObject2;
              j.p(localObject2, "items");
              ab.i(MPVideoCommentView.a.TAG, "update: " + ((List)localObject2).size());
              ((MPVideoCommentView.a)localObject1).eow.addAll((Collection)localObject2);
              ((MPVideoCommentView.a)localObject1).notifyDataSetChanged();
            }
          }
          paramm.erD = paramString.enabled;
          paramm.jWO = paramString.vFT;
          paramm.jWP = paramString.vFS;
          paramInt2 = 0;
          paramInt1 = paramInt2;
          if (paramm.jWM != null)
          {
            paramString = paramm.jWM;
            if (paramString == null)
              break label1548;
            paramString = Integer.valueOf(paramString.getItemCount());
            label1437: if (paramString == null)
              j.dWJ();
            if (paramString.intValue() <= 0)
              break label1553;
            paramm.jWL.setVisibility(0);
            paramInt1 = 1;
          }
          label1462: if (paramm.erD != 1)
            break label1580;
          paramm.jWK.setVisibility(0);
          if (paramInt1 == 0)
            break label1568;
          paramm.jWK.setGravity(5);
        }
        while (true)
        {
          if ((paramm.jWO == 1) || (!paramm.jWP))
            break label1593;
          paramString = paramm.getContext().getString(2131305925);
          paramm.jWK.setText((CharSequence)paramString);
          AppMethodBeat.o(15210);
          break;
          paramInt1 = 0;
          break label1231;
          label1548: paramString = null;
          break label1437;
          label1553: paramm.jWL.setVisibility(8);
          paramInt1 = paramInt2;
          break label1462;
          label1568: paramm.jWK.setGravity(1);
          continue;
          label1580: paramm.jWK.setVisibility(8);
        }
        label1593: paramString = paramm.getContext().getString(2131305842);
        localObject1 = paramm.getContext();
        j.o(localObject1, "context");
        localObject1 = ((Context)localObject1).getResources().getDrawable(2130837947);
        paramInt1 = (int)(paramm.jWK.getTextSize() * 1.2D);
        ((Drawable)localObject1).setBounds(0, 0, paramInt1, paramInt1);
        localObject1 = new com.tencent.mm.ui.widget.a((Drawable)localObject1);
        localObject2 = new SpannableString((CharSequence)"@");
        ((SpannableString)localObject2).setSpan(localObject1, 0, 1, 33);
        paramm.jWK.setText(TextUtils.concat(new CharSequence[] { (CharSequence)localObject2, (CharSequence)" ", (CharSequence)paramString }));
        AppMethodBeat.o(15210);
        break;
        label1742: paramInt1 = this.jWx.jVy;
        this.jWx.jVy = paramString.kKI;
        paramm = aYz();
        if (paramInt1 == 0);
        for (paramInt1 = 1; ; paramInt1 = 0)
        {
          j.p(paramString, "resp");
          if (paramm.jYf)
            break label2081;
          if (!bo.ek((List)paramString.vFR))
            break label1820;
          paramm.aYM();
          AppMethodBeat.o(15210);
          break;
        }
        label1820: localObject1 = paramm.jYa;
        localObject2 = paramm.getContext();
        j.o(localObject2, "context");
        ((View)localObject1).setBackgroundColor(((Context)localObject2).getResources().getColor(2131689755));
        paramm.jYb.setVisibility(0);
        if (paramm.jYd == null)
        {
          localObject1 = paramm.getContext();
          j.o(localObject1, "context");
          paramString = paramString.vFR;
          j.o(paramString, "resp.comment");
          localObject2 = paramm.jWx;
          if (localObject2 == null)
            j.avw("controller");
          paramm.jYd = new MPVideoWriteCommentLayout.a((Context)localObject1, paramString, (b)localObject2);
          paramm.jXZ.setAdapter((ListAdapter)paramm.jYd);
          AppMethodBeat.o(15210);
          break;
        }
        paramm = paramm.jYd;
        if (paramm != null)
        {
          paramString = paramString.vFR;
          j.o(paramString, "resp.comment");
          paramString = (List)paramString;
          j.p(paramString, "items");
          ab.i(MPVideoWriteCommentLayout.a.TAG, "update: " + paramString.size());
          if (paramInt1 != 0)
          {
            paramm.eow.clear();
            paramm.eow.addAll((Collection)paramString);
          }
          while (true)
          {
            paramm.notifyDataSetChanged();
            AppMethodBeat.o(15210);
            break;
            paramm.eow.addAll((Collection)paramString);
          }
        }
        label2081: AppMethodBeat.o(15210);
        break;
      }
      paramString = paramm.acN();
      j.o(paramString, "scene.reqResp");
      if (paramString.getType() == 2776)
      {
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramString = paramm.acN();
          if (paramString == null)
          {
            paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            AppMethodBeat.o(15210);
            throw paramString;
          }
          paramString = ((com.tencent.mm.ai.b)paramString).acA();
          if (paramString == null)
          {
            paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgGetExtResp");
            AppMethodBeat.o(15210);
            throw paramString;
          }
          paramString = (ei)paramString;
          if (paramString.vGd != null)
          {
            paramm = aYv();
            localObject1 = paramString.vGd;
            j.o(localObject1, "resp.appmsgstat");
            paramm.a((jz)localObject1);
            localObject1 = this.jWk;
            paramm = paramString.vGd;
            j.o(paramm, "resp.appmsgstat");
            j.p(paramm, "appMsgStat");
            ((com.tencent.mm.plugin.brandservice.ui.timeline.video.a.g)localObject1).jXv = paramm;
            this.jWx.jVA = paramString.vGd.jVA;
          }
        }
        AppMethodBeat.o(15210);
        break;
      }
      paramString = paramm.acN();
      j.o(paramString, "scene.reqResp");
      if (paramString.getType() == 2691)
      {
        paramString = paramm.acN();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = ((com.tencent.mm.ai.b)paramString).acz();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgLikeReq");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = (en)paramString;
        paramm = paramm.acN();
        if (paramm == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramm = ((com.tencent.mm.ai.b)paramm).acA();
        if (paramm == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgLikeResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramm = (eo)paramm;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramString.kdC != 4)
          {
            localObject1 = aYv();
            localObject2 = ((MPVideoHeaderView)localObject1).jXv;
            if (localObject2 == null)
              j.avw("appMsgStat");
            if (localObject2 != null)
            {
              localObject2 = ((MPVideoHeaderView)localObject1).jXv;
              if (localObject2 == null)
                j.avw("appMsgStat");
              if (((jz)localObject2).vMP != 1)
                break label2716;
              localObject2 = ((MPVideoHeaderView)localObject1).jXv;
              if (localObject2 == null)
                j.avw("appMsgStat");
              ((jz)localObject2).vMP = 0;
              localObject2 = ((MPVideoHeaderView)localObject1).jXv;
              if (localObject2 == null)
                j.avw("appMsgStat");
              ((jz)localObject2).vMO -= 1;
              ((MPVideoHeaderView)localObject1).jXG.setVisibility(8);
              label2578: localObject3 = ((MPVideoHeaderView)localObject1).jXv;
              if (localObject3 == null)
                j.avw("appMsgStat");
              localObject2 = ((MPVideoHeaderView)localObject1).jXv;
              if (localObject2 == null)
                j.avw("appMsgStat");
              ((jz)localObject3).vMO = Math.max(0, ((jz)localObject2).vMO);
              localObject2 = ((MPVideoHeaderView)localObject1).jXv;
              if (localObject2 == null)
                j.avw("appMsgStat");
              ((MPVideoHeaderView)localObject1).a((jz)localObject2);
            }
          }
          while (true)
          {
            if ((paramString.kdC == 1) || (paramString.kdC == 5))
              this.jWx.jVC.sF(9);
            if (paramString.kdC == 2)
              break label3168;
            h.bN((Context)dxU(), getString(2131297044));
            AppMethodBeat.o(15210);
            break;
            label2716: localObject2 = ((MPVideoHeaderView)localObject1).jXv;
            if (localObject2 == null)
              j.avw("appMsgStat");
            ((jz)localObject2).vMP = 1;
            localObject2 = ((MPVideoHeaderView)localObject1).jXv;
            if (localObject2 == null)
              j.avw("appMsgStat");
            ((jz)localObject2).vMO += 1;
            if (!((MPVideoHeaderView)localObject1).jXu)
              break label2578;
            ((MPVideoHeaderView)localObject1).jXG.setVisibility(0);
            ((MPVideoHeaderView)localObject1).jXu = false;
            paramInt1 = (int)((MPVideoHeaderView)localObject1).jXH.getTextSize();
            localObject2 = ((MPVideoHeaderView)localObject1).jXI.getLayoutParams();
            if (localObject2 == null)
            {
              paramString = new a.v("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
              AppMethodBeat.o(15210);
              throw paramString;
            }
            ((ViewGroup.LayoutParams)localObject2).height = ((int)(paramInt1 * 1.2D));
            ((ViewGroup.LayoutParams)localObject2).width = ((int)(paramInt1 * 1.2D));
            ((MPVideoHeaderView)localObject1).jXI.setLayoutParams((ViewGroup.LayoutParams)localObject2);
            localObject2 = ((MPVideoHeaderView)localObject1).getContext().getString(2131305841);
            localObject3 = ((MPVideoHeaderView)localObject1).getContext();
            j.o(localObject3, "context");
            localObject3 = ((Context)localObject3).getResources().getDrawable(2130837944);
            ((Drawable)localObject3).setBounds(0, 0, paramInt1 / 2, paramInt1);
            localObject3 = new com.tencent.mm.ui.widget.a((Drawable)localObject3);
            SpannableString localSpannableString = new SpannableString((CharSequence)"@");
            localSpannableString.setSpan(localObject3, 0, 1, 33);
            ((MPVideoHeaderView)localObject1).jXH.setText(TextUtils.concat(new CharSequence[] { (CharSequence)localObject2, (CharSequence)"  ", (CharSequence)localSpannableString }));
            ((MPVideoHeaderView)localObject1).jXH.setOnClickListener((View.OnClickListener)new MPVideoHeaderView.e((MPVideoHeaderView)localObject1));
            localObject2 = as.eg("key_webview_menu_haokan", 2);
            if (localObject2 == null)
              j.dWJ();
            if (!((as)localObject2).decodeBool("show_first_tips", true))
              break label2578;
            localObject3 = ((MPVideoHeaderView)localObject1).jXK;
            if (localObject3 == null)
              j.avw("wowEduLayout");
            if (localObject3 == null)
              break label2578;
            localObject3 = ((MPVideoHeaderView)localObject1).jWx;
            if (localObject3 == null)
              j.avw("controller");
            if (((b)localObject3).jVA == 1)
              break label2578;
            ((as)localObject2).encode("show_first_tips", false);
            ((as)localObject2).apply();
            localObject2 = ((MPVideoHeaderView)localObject1).jXK;
            if (localObject2 == null)
              j.avw("wowEduLayout");
            ((MPVideoWowEduView)localObject2).setPosition(((MPVideoHeaderView)localObject1).jXJ.getY() + ((MPVideoHeaderView)localObject1).jXJ.getHeight());
            break label2578;
            aYz().aYN();
          }
          label3168: if (paramm.vGw == 1)
          {
            h.a((Context)dxU(), dxU().getString(2131305922), "", dxU().getString(2131296994), null);
            AppMethodBeat.o(15210);
            break;
          }
          h.bN((Context)dxU(), getString(2131305921));
          AppMethodBeat.o(15210);
          break;
        }
        h.bN((Context)dxU(), getString(2131305837, new Object[] { Integer.valueOf(paramInt2) }));
        AppMethodBeat.o(15210);
        break;
      }
      paramString = paramm.acN();
      j.o(paramString, "scene.reqResp");
      if (paramString.getType() == 2617)
      {
        paramString = paramm.acN();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramString = ((com.tencent.mm.ai.b)paramString).acz();
        if (paramString == null)
        {
          paramString = new a.v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AppMsgOperateCommentReq");
          AppMethodBeat.o(15210);
          throw paramString;
        }
        paramm = (ep)paramString;
        if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          if (paramm.kdC == 1)
          {
            h.bN((Context)dxU(), getString(2131305845));
            aYz().aYN();
            AppMethodBeat.o(15210);
            break;
          }
          h.bN((Context)dxU(), getString(2131305831));
          localObject1 = aYz();
          j.p(paramm, "req");
          paramString = ((MPVideoWriteCommentLayout)localObject1).jYd;
          if (paramString != null);
          for (paramString = paramString.b(paramm); ; paramString = null)
          {
            localObject2 = ((MPVideoWriteCommentLayout)localObject1).jYd;
            if ((localObject2 != null) && (((MPVideoWriteCommentLayout.a)localObject2).getCount() == 0))
              ((MPVideoWriteCommentLayout)localObject1).aYM();
            localObject1 = aYx();
            j.p(paramm, "req");
            localObject1 = ((MPVideoCommentView)localObject1).jWM;
            if (localObject1 == null)
              break label3550;
            ((MPVideoCommentView.a)localObject1).a(paramm, paramString);
            AppMethodBeat.o(15210);
            break;
          }
          label3550: AppMethodBeat.o(15210);
          break;
        }
        if (paramm.kdC == 1)
        {
          h.bN((Context)dxU(), getString(2131305843, new Object[] { Integer.valueOf(paramInt2) }));
          AppMethodBeat.o(15210);
          break;
        }
        h.bN((Context)dxU(), getString(2131305830, new Object[] { Integer.valueOf(paramInt2) }));
        AppMethodBeat.o(15210);
        break;
      }
      AppMethodBeat.o(15210);
      break;
      label3653: paramm = "";
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(15202);
    super.onStart();
    com.tencent.mm.plugin.brandservice.ui.timeline.video.a.f localf = this.jWz;
    boolean bool;
    Object localObject1;
    Object localObject2;
    if (!r.ks(aYD().fgc))
    {
      bool = true;
      localf.enable = bool;
      localf = this.jWz;
      localObject1 = this.jWy;
      localObject2 = (e.b)new BizVideoDetailUI.x(this);
      j.p(localObject2, "callBack");
      com.tencent.mm.ui.tools.e locale = localf.jYE;
      if (locale == null)
        j.avw("imagePreviewAnimation");
      locale.L(localf.xJ, localf.xL, localf.mWidth, localf.mHeight);
      if ((!localf.jYD) && (localf.mWidth != 0) && (localf.mHeight != 0) && (localf.enable) && (localObject1 == null))
        break label226;
      ab.i(localf.TAG, "handleAnimation return " + localf.jYD + ',' + localf.mWidth + ',' + localf.mHeight);
      localObject2 = localf.jYG;
      if (localObject2 != null)
        ((View)localObject2).setVisibility(8);
      localf.jYI = true;
      localf.aYP();
      AppMethodBeat.o(15202);
    }
    while (true)
    {
      return;
      bool = false;
      break;
      label226: localf.jYD = true;
      localObject1 = localf.jYF;
      if (localObject1 == null)
        j.avw("animationView");
      localObject1 = ((View)localObject1).getViewTreeObserver();
      if (localObject1 != null)
      {
        ((ViewTreeObserver)localObject1).addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)new f.a(localf, (e.b)localObject2));
        AppMethodBeat.o(15202);
      }
      else
      {
        AppMethodBeat.o(15202);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "invoke"})
  static final class k extends a.f.b.k
    implements a.f.a.a<Integer>
  {
    k(BizVideoDetailUI paramBizVideoDetailUI)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI$initVideoView$1", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView$FullScreenDelegate;", "enterFullScreen", "", "direction", "", "isFullScreen", "", "quitFullScreen", "plugin-brandservice_release"})
  public static final class p
    implements MPVideoView.a
  {
    public final void aDF()
    {
      AppMethodBeat.i(15159);
      BizVideoDetailUI.e(this.jWD).aIZ();
      this.jWD.setRequestedOrientation(1);
      BizVideoDetailUI.f(this.jWD).jVJ.sE(6);
      AppMethodBeat.o(15159);
    }

    public final boolean isFullScreen()
    {
      AppMethodBeat.i(15160);
      boolean bool = BizVideoDetailUI.d(this.jWD);
      AppMethodBeat.o(15160);
      return bool;
    }

    public final void on(int paramInt)
    {
      AppMethodBeat.i(15158);
      this.jWD.aYt().removeView((View)BizVideoDetailUI.c(this.jWD));
      BizVideoDetailUI.a(this.jWD, true);
      BizVideoDetailUI.e(this.jWD).G((View)BizVideoDetailUI.c(this.jWD), paramInt);
      if ((paramInt == 0) || (paramInt == 180))
        BizVideoDetailUI.c(this.jWD).setPageGestureInFullscreen(false);
      while (true)
      {
        BizVideoDetailUI.f(this.jWD).jVJ.sE(5);
        AppMethodBeat.o(15158);
        return;
        BizVideoDetailUI.c(this.jWD).setPageGestureInFullscreen(true);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI$initVideoView$2", "Lcom/tencent/mm/plugin/brandservice/ui/widget/MPVideoView$MPVideoViewCallBack;", "onPlayError", "", "errorMsg", "", "errorCode", "", "plugin-brandservice_release"})
  public static final class q
    implements MPVideoView.b
  {
    public final void Gf(String paramString)
    {
      AppMethodBeat.i(15161);
      BizVideoDetailUI.g(this.jWD).setPlayError$505cff1c(paramString);
      BizVideoDetailUI.h(this.jWD);
      AppMethodBeat.o(15161);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Lcom/tencent/mm/plugin/bizui/widget/BizKeyboardLinearLayout;", "kotlin.jvm.PlatformType", "invoke"})
  static final class r extends a.f.b.k
    implements a.f.a.a<BizKeyboardLinearLayout>
  {
    r(BizVideoDetailUI paramBizVideoDetailUI)
    {
      super();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "invoke"})
  static final class s extends a.f.b.k
    implements a.f.a.a<View>
  {
    s(BizVideoDetailUI paramBizVideoDetailUI)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI
 * JD-Core Version:    0.6.2
 */