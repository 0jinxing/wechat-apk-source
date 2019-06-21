package com.tencent.mm.plugin.sysvideo.ui.video;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.video.VideoView;

public class VideoRecorderPreviewUI extends MMActivity
{
  private long duration;
  private VideoView swA;
  private String swB;
  private final int swC;
  private ak swD;

  public VideoRecorderPreviewUI()
  {
    AppMethodBeat.i(25636);
    this.swB = null;
    this.duration = -1L;
    this.swC = 3000;
    this.swD = new VideoRecorderPreviewUI.2(this);
    AppMethodBeat.o(25636);
  }

  private void bSZ()
  {
    AppMethodBeat.i(25642);
    this.swA = ((VideoView)findViewById(2131828419));
    this.swA.setOnErrorListener(new VideoRecorderPreviewUI.3(this));
    this.swA.setOnPreparedListener(new VideoRecorderPreviewUI.4(this));
    findViewById(2131828418).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(25634);
        VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).removeMessages(0);
        if (VideoRecorderPreviewUI.this.mController.isTitleShowing())
        {
          VideoRecorderPreviewUI.this.getWindow().setFlags(1024, 1024);
          VideoRecorderPreviewUI.this.mController.hideTitleView();
          AppMethodBeat.o(25634);
        }
        while (true)
        {
          return;
          VideoRecorderPreviewUI.this.getWindow().clearFlags(1024);
          VideoRecorderPreviewUI.this.mController.showTitleView();
          VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).removeMessages(0);
          VideoRecorderPreviewUI.b(VideoRecorderPreviewUI.this).sendEmptyMessageDelayed(0, 3000L);
          AppMethodBeat.o(25634);
        }
      }
    });
    this.swA.setOnCompletionListener(new VideoRecorderPreviewUI.6(this));
    if (this.swB != null)
    {
      this.swA.stopPlayback();
      this.swA.setVideoURI(this.swB);
    }
    AppMethodBeat.o(25642);
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(25641);
    ae.h(ae.a(getWindow(), null), this.mController.ylv);
    ((ViewGroup)this.mController.ylv.getParent()).removeView(this.mController.ylv);
    ((ViewGroup)getWindow().getDecorView()).addView(this.mController.ylv, 0);
    AppMethodBeat.o(25641);
  }

  public final int getLayoutId()
  {
    return 2130970996;
  }

  public final void initView()
  {
    AppMethodBeat.i(138617);
    bSZ();
    AppMethodBeat.o(138617);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25637);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.mController.hideTitleView();
    this.swB = getIntent().getStringExtra("VideoRecorder_VideoFullPath");
    setMMTitle(2131304266);
    setBackBtn(new VideoRecorderPreviewUI.1(this));
    bSZ();
    AppMethodBeat.o(25637);
  }

  public void onPause()
  {
    AppMethodBeat.i(25640);
    super.onPause();
    if (this.swA.isPlaying())
    {
      VideoView localVideoView = this.swA;
      if ((localVideoView.ieC != null) && (localVideoView.vvE) && (localVideoView.ieC.isPlaying()))
        localVideoView.ieC.pause();
      localVideoView.ief = false;
    }
    finish();
    overridePendingTransition(0, 0);
    this.swD.removeMessages(0);
    AppMethodBeat.o(25640);
  }

  public void onStart()
  {
    AppMethodBeat.i(25638);
    super.onStart();
    AppMethodBeat.o(25638);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sysvideo.ui.video.VideoRecorderPreviewUI
 * JD-Core Version:    0.6.2
 */