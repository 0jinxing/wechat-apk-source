package com.tencent.mm.plugin.appbrand.ui.recommend;

import a.f.b.j;
import a.l;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.CommonVideoView;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/ui/recommend/AppBrandRecommendVideoUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "videoUrl", "", "getVideoUrl", "()Ljava/lang/String;", "setVideoUrl", "(Ljava/lang/String;)V", "videoView", "Lcom/tencent/mm/pluginsdk/ui/CommonVideoView;", "finish", "", "getLayoutId", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "Companion", "plugin-appbrand-integration_release"})
@a(19)
public final class AppBrandRecommendVideoUI extends MMActivity
{
  public static final AppBrandRecommendVideoUI.a iQM;
  private CommonVideoView iQL;
  public String videoUrl;

  static
  {
    AppMethodBeat.i(135211);
    iQM = new AppBrandRecommendVideoUI.a((byte)0);
    AppMethodBeat.o(135211);
  }

  public final void finish()
  {
    AppMethodBeat.i(135209);
    CommonVideoView localCommonVideoView = this.iQL;
    if (localCommonVideoView == null)
      j.avw("videoView");
    if (localCommonVideoView.isPlaying())
    {
      localCommonVideoView = this.iQL;
      if (localCommonVideoView == null)
        j.avw("videoView");
      localCommonVideoView.pause();
    }
    super.finish();
    AppMethodBeat.o(135209);
  }

  public final int getLayoutId()
  {
    return 2130968727;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(135208);
    super.onCreate(paramBundle);
    hideTitleView();
    getWindow().setFlags(1024, 1024);
    paramBundle = findViewById(2131821352);
    j.o(paramBundle, "findViewById(R.id.app_brand_recommend_player)");
    this.iQL = ((CommonVideoView)paramBundle);
    paramBundle = getIntent().getStringExtra("1");
    j.o(paramBundle, "intent.getStringExtra(KEY_VIDEO_URL)");
    this.videoUrl = paramBundle;
    CommonVideoView localCommonVideoView = this.iQL;
    if (localCommonVideoView == null)
      j.avw("videoView");
    paramBundle = this.videoUrl;
    if (paramBundle == null)
      j.avw("videoUrl");
    localCommonVideoView.c(true, paramBundle, 1000);
    paramBundle = this.iQL;
    if (paramBundle == null)
      j.avw("videoView");
    paramBundle.start();
    AppMethodBeat.o(135208);
  }

  public final void onPause()
  {
    AppMethodBeat.i(135210);
    super.onPause();
    AppMethodBeat.o(135210);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recommend.AppBrandRecommendVideoUI
 * JD-Core Version:    0.6.2
 */