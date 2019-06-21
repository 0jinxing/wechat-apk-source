package com.tencent.mm.plugin.appbrand.ui;

import a.l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoViewControlBar;
import com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoWrapper;
import com.tencent.mm.plugin.appbrand.jsapi.video.d.a;
import com.tencent.mm.pluginsdk.ui.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/AppBrandVideoPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "mVideoUrl", "", "mVideoView", "Lcom/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView;", "getLayoutId", "", "initVideoView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onSwipeBackFinish", "", "plugin-appbrand-integration_release"})
public final class AppBrandVideoPreviewUI extends MMActivity
{
  private String iJx;
  private AppBrandVideoView iJy;

  public final boolean apx()
  {
    return true;
  }

  public final int getLayoutId()
  {
    return 2130968744;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(135004);
    super.onCreate(paramBundle);
    this.iJx = getIntent().getStringExtra("key_video_url");
    if (bo.isNullOrNil(this.iJx))
    {
      finish();
      AppMethodBeat.o(135004);
    }
    while (true)
    {
      return;
      setBackBtn((MenuItem.OnMenuItemClickListener)new AppBrandVideoPreviewUI.a(this));
      setMMTitle("");
      dyb();
      xE(-16777216);
      paramBundle = new AppBrandVideoWrapper((Context)this);
      this.iJy = new AppBrandVideoView((Context)this, (View)paramBundle);
      AppBrandVideoViewControlBar localAppBrandVideoViewControlBar = new AppBrandVideoViewControlBar((Context)this);
      AppBrandVideoView localAppBrandVideoView = this.iJy;
      if (localAppBrandVideoView != null)
        localAppBrandVideoView.a((d.a)localAppBrandVideoViewControlBar);
      paramBundle.setVideoFooterView((g)localAppBrandVideoViewControlBar);
      ((FrameLayout)findViewById(2131821416)).addView((View)this.iJy, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2));
      if ((!bo.isNullOrNil(this.iJx)) && (this.iJy != null))
      {
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setAutoPlay(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setLoop(false);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setMute(false);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setCookieData(null);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setCover$16da05f7(null);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowDanmakuBtn(false);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowMuteBtn(false);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowPlayBtn(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowProgress(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowFullScreenBtn(false);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setIsShowBasicControls(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowCenterPlayBtn(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setShowControlProgress(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.setPageGesture(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
          paramBundle.eq(true);
        paramBundle = this.iJy;
        if (paramBundle != null)
        {
          paramBundle.e(this.iJx, false, 0);
          AppMethodBeat.o(135004);
        }
      }
      else
      {
        AppMethodBeat.o(135004);
      }
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(135007);
    super.onDestroy();
    AppBrandVideoView localAppBrandVideoView = this.iJy;
    if (localAppBrandVideoView != null)
    {
      localAppBrandVideoView.aEX();
      AppMethodBeat.o(135007);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135007);
    }
  }

  public final void onPause()
  {
    AppMethodBeat.i(135006);
    super.onPause();
    AppBrandVideoView localAppBrandVideoView = this.iJy;
    if (localAppBrandVideoView != null)
    {
      localAppBrandVideoView.ow(3);
      AppMethodBeat.o(135006);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135006);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(135005);
    super.onResume();
    AppBrandVideoView localAppBrandVideoView = this.iJy;
    if (localAppBrandVideoView != null)
    {
      localAppBrandVideoView.akW();
      AppMethodBeat.o(135005);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(135005);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandVideoPreviewUI
 * JD-Core Version:    0.6.2
 */