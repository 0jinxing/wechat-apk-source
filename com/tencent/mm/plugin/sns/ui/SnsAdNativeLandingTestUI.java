package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.pluginsdk.ui.tools.VideoSightView;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.io.File;

public class SnsAdNativeLandingTestUI extends MMActivity
{
  private int duration;
  private ak fbD;
  private double qzd;
  private int rbG;
  private VideoSightView roV;
  SnsAdNativeLandingPagesVideoPlayerLoadingBar roW;
  private int videoHeight;
  private int videoWidth;

  public SnsAdNativeLandingTestUI()
  {
    AppMethodBeat.i(38728);
    this.qzd = 0.0D;
    this.duration = 0;
    this.fbD = new ak();
    AppMethodBeat.o(38728);
  }

  public final int getLayoutId()
  {
    return 2130970735;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38729);
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    getWindow().setFlags(1024, 1024);
    ((Button)findViewById(2131827655)).setOnClickListener(new SnsAdNativeLandingTestUI.1(this));
    paramBundle = (ViewGroup)findViewById(2131827654);
    Object localObject1 = (LayoutInflater)this.mController.ylL.getSystemService("layout_inflater");
    Object localObject2 = (WindowManager)this.mController.ylL.getSystemService("window");
    int i = ((WindowManager)localObject2).getDefaultDisplay().getWidth();
    int j = ((WindowManager)localObject2).getDefaultDisplay().getHeight();
    String str1 = Environment.getExternalStorageDirectory().toString() + "/tencent/MicroMsg/sns_ad_landingpages";
    localObject2 = "adId" + "_image_" + ag.ck("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150");
    String str2 = "adId" + "_stream_" + ag.ck("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400");
    localObject1 = ((LayoutInflater)localObject1).inflate(2130970729, null);
    ((View)localObject1).setMinimumHeight(j);
    Object localObject3 = (ViewGroup)((View)localObject1).findViewById(2131827642);
    this.roV = new VideoSightView(this.mController.ylL);
    this.roV.setLoop(false);
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-1, -1);
    ((ViewGroup)localObject3).addView(this.roV, 0, localLayoutParams);
    localObject3 = new RelativeLayout.LayoutParams(-1, -2);
    ((RelativeLayout.LayoutParams)localObject3).addRule(12);
    ((RelativeLayout.LayoutParams)localObject3).bottomMargin = BackwardSupportUtil.b.b(this.mController.ylL, this.mController.ylL.getResources().getDimension(2131427802));
    this.roW = new SnsAdNativeLandingPagesVideoPlayerLoadingBar(this.mController.ylL);
    this.roW.setVisibility(0);
    this.roV.setPlayProgressCallback(true);
    ((ViewGroup)localObject1).addView(this.roW, (ViewGroup.LayoutParams)localObject3);
    this.roW.setIplaySeekCallback(new SnsAdNativeLandingTestUI.3(this));
    this.roW.setOnPlayButtonClickListener(new SnsAdNativeLandingTestUI.4(this));
    this.roW.setIsPlay(this.roV.isPlaying());
    this.roW.setVisibility(0);
    this.roW.seek(0);
    this.roV.setVideoCallback(new SnsAdNativeLandingTestUI.5(this));
    this.roV.setEnableConfigChanged(false);
    this.roV.setOnClickListener(new SnsAdNativeLandingTestUI.6(this));
    paramBundle.addView((View)localObject1, new LinearLayout.LayoutParams(i, j));
    this.roV.post(new SnsAdNativeLandingTestUI.7(this));
    new SnsAdNativeLandingTestUI.a(str1, (String)localObject2, af.bCo(), new SnsAdNativeLandingTestUI.8(this)).execute(new String[] { "http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150" });
    new SnsAdNativeLandingTestUI.a(str1, str2, af.bCo(), new SnsAdNativeLandingTestUI.9(this), 409600).execute(new String[] { "http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400" });
    AppMethodBeat.o(38729);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI
 * JD-Core Version:    0.6.2
 */