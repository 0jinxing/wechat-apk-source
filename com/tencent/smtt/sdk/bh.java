package com.tencent.smtt.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.export.external.DexLoader;

class bh extends FrameLayout
  implements MediaPlayer.OnErrorListener
{
  private Object a;
  private bj b;
  private VideoView c;
  private Context d;
  private String e;

  public bh(Context paramContext)
  {
    super(paramContext.getApplicationContext());
    AppMethodBeat.i(64633);
    this.d = null;
    this.d = paramContext;
    AppMethodBeat.o(64633);
  }

  private void b(Bundle paramBundle, Object paramObject)
  {
    AppMethodBeat.i(64635);
    a();
    boolean bool = false;
    if (b())
    {
      paramBundle.putInt("callMode", paramBundle.getInt("callMode"));
      bool = this.b.a(this.a, paramBundle, this, paramObject);
    }
    if (!bool)
    {
      if (this.c != null)
        this.c.stopPlayback();
      if (this.c == null)
        this.c = new VideoView(getContext());
      this.e = paramBundle.getString("videoUrl");
      this.c.setVideoURI(Uri.parse(this.e));
      this.c.setOnErrorListener(this);
      paramObject = new Intent("com.tencent.smtt.tbs.video.PLAY");
      paramObject.addFlags(268435456);
      paramBundle = getContext().getApplicationContext();
      paramObject.setPackage(paramBundle.getPackageName());
      paramBundle.startActivity(paramObject);
    }
    AppMethodBeat.o(64635);
  }

  void a()
  {
    DexLoader localDexLoader = null;
    AppMethodBeat.i(64636);
    setBackgroundColor(-16777216);
    if (this.b == null)
    {
      o.a(true).a(getContext().getApplicationContext(), false, false, null);
      bi localbi = o.a(true).a();
      if (localbi != null)
        localDexLoader = localbi.b();
      if ((localDexLoader != null) && (QbSdk.canLoadVideo(getContext())))
        this.b = new bj(localDexLoader);
    }
    if ((this.b != null) && (this.a == null))
      this.a = this.b.a(getContext().getApplicationContext());
    AppMethodBeat.o(64636);
  }

  public void a(Activity paramActivity)
  {
    AppMethodBeat.i(64637);
    if ((!b()) && (this.c != null))
    {
      if (this.c.getParent() == null)
      {
        Window localWindow = paramActivity.getWindow();
        FrameLayout localFrameLayout = (FrameLayout)localWindow.getDecorView();
        localWindow.addFlags(1024);
        localWindow.addFlags(128);
        localFrameLayout.setBackgroundColor(-16777216);
        paramActivity = new MediaController(paramActivity);
        paramActivity.setMediaPlayer(this.c);
        this.c.setMediaController(paramActivity);
        paramActivity = new FrameLayout.LayoutParams(-1, -1);
        paramActivity.gravity = 17;
        localFrameLayout.addView(this.c, paramActivity);
      }
      if (Build.VERSION.SDK_INT >= 8)
        this.c.start();
    }
    AppMethodBeat.o(64637);
  }

  void a(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(64638);
    if ((paramInt == 3) && (!b()) && (this.c != null))
      this.c.pause();
    if (paramInt == 4)
    {
      this.d = null;
      if ((!b()) && (this.c != null))
      {
        this.c.stopPlayback();
        this.c = null;
      }
    }
    if ((paramInt == 2) && (!b()))
    {
      this.d = paramActivity;
      a(paramActivity);
    }
    if (b())
      this.b.a(this.a, paramActivity, paramInt);
    AppMethodBeat.o(64638);
  }

  void a(Bundle paramBundle, Object paramObject)
  {
    AppMethodBeat.i(64634);
    b(paramBundle, paramObject);
    AppMethodBeat.o(64634);
  }

  public boolean b()
  {
    if ((this.b != null) && (this.a != null));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void c()
  {
    AppMethodBeat.i(64640);
    if (b())
      this.b.a(this.a);
    AppMethodBeat.o(64640);
  }

  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(64639);
    try
    {
      if ((this.d instanceof Activity))
      {
        paramMediaPlayer = (Activity)this.d;
        if (!paramMediaPlayer.isFinishing())
          paramMediaPlayer.finish();
      }
      paramMediaPlayer = getContext();
      if (paramMediaPlayer != null)
      {
        Toast.makeText(paramMediaPlayer, "播放失败，请选择其它播放器播放", 1).show();
        Context localContext = paramMediaPlayer.getApplicationContext();
        paramMediaPlayer = new android/content/Intent;
        paramMediaPlayer.<init>("android.intent.action.VIEW");
        paramMediaPlayer.addFlags(268435456);
        paramMediaPlayer.setDataAndType(Uri.parse(this.e), "video/*");
        localContext.startActivity(paramMediaPlayer);
      }
      AppMethodBeat.o(64639);
      bool = true;
      return bool;
    }
    catch (Throwable paramMediaPlayer)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(64639);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bh
 * JD-Core Version:    0.6.2
 */