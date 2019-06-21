package com.tencent.mm.plugin.forcenotify.ui;

import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Looper;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.forcenotify.c.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/ui/ForceNotifyShowUI;", "Lcom/tencent/mm/plugin/forcenotify/ui/BaseForceNotifyShowUI;", "()V", "UIHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "audioFocusChangeListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "info", "Lcom/tencent/mm/plugin/forcenotify/model/ForceNotifyInfo;", "mAudioManager", "Landroid/media/AudioManager;", "mSoundPlay", "Landroid/media/MediaPlayer;", "mVibrator", "Landroid/os/Vibrator;", "stopSoundRunnable", "Ljava/lang/Runnable;", "finish", "", "getLayoutId", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onStop", "reset", "setBlurBg", "view", "Landroid/view/View;", "plugin-force-notify_release"})
@com.tencent.mm.ui.base.a(3)
public final class ForceNotifyShowUI extends BaseForceNotifyShowUI
{
  private AudioManager euK;
  private Vibrator iVt;
  private MediaPlayer mtv;
  private Runnable mtw;
  private AudioManager.OnAudioFocusChangeListener mtx;
  private final ak mty;
  private b mtz;

  public ForceNotifyShowUI()
  {
    AppMethodBeat.i(51095);
    this.mty = new ak(Looper.getMainLooper());
    this.mtz = new b();
    AppMethodBeat.o(51095);
  }

  private final void reset()
  {
    AppMethodBeat.i(51094);
    Object localObject = getWindow();
    a.f.b.j.o(localObject, "window");
    localObject = ((Window)localObject).getDecorView();
    a.f.b.j.o(localObject, "window.decorView");
    ((View)localObject).setKeepScreenOn(false);
    this.mty.removeCallbacksAndMessages(null);
    localObject = this.iVt;
    if (localObject != null)
      ((Vibrator)localObject).cancel();
    localObject = this.euK;
    if (localObject != null)
      ((AudioManager)localObject).abandonAudioFocus(this.mtx);
    try
    {
      localObject = getWindow();
      a.f.b.j.o(localObject, "window");
      ((Window)localObject).getDecorView().removeCallbacks(this.mtw);
      this.mtw = null;
      localObject = this.mtv;
      if (localObject != null)
        ((MediaPlayer)localObject).pause();
      localObject = this.mtv;
      if (localObject != null)
        ((MediaPlayer)localObject).stop();
      localObject = this.mtv;
      if (localObject != null)
      {
        ((MediaPlayer)localObject).release();
        AppMethodBeat.o(51094);
      }
      while (true)
      {
        return;
        AppMethodBeat.o(51094);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
        AppMethodBeat.o(51094);
    }
  }

  public final void finish()
  {
    AppMethodBeat.i(51093);
    super.finish();
    reset();
    AppMethodBeat.o(51093);
  }

  public final int getLayoutId()
  {
    return 2130969588;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(51089);
    super.onBackPressed();
    ab.i(this.TAG, "[onBackPressed]");
    String str = String.valueOf(this.mtz.field_CreateTime / 1000L) + this.mtz.field_UserName;
    ((com.tencent.mm.plugin.forcenotify.a.a)g.K(com.tencent.mm.plugin.forcenotify.a.a.class)).b(this.username, str, 8, cb.aaE() / 1000L);
    AppMethodBeat.o(51089);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(51088);
    super.onCreate(paramBundle);
    this.mtz.field_UserName = this.username;
    com.tencent.mm.plugin.forcenotify.d.a.mth.b((com.tencent.mm.sdk.e.c)this.mtz, new String[0]);
    paramBundle = getSystemService("audio");
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.media.AudioManager");
      AppMethodBeat.o(51088);
      throw paramBundle;
    }
    this.euK = ((AudioManager)paramBundle);
    paramBundle = dxU().getSystemService("vibrator");
    if (paramBundle == null)
    {
      paramBundle = new v("null cannot be cast to non-null type android.os.Vibrator");
      AppMethodBeat.o(51088);
      throw paramBundle;
    }
    this.iVt = ((Vibrator)paramBundle);
    paramBundle = this.euK;
    Object localObject1;
    label153: Object localObject2;
    label170: label229: label502: int i;
    if (paramBundle != null)
    {
      paramBundle = Integer.valueOf(paramBundle.getVibrateSetting(1));
      localObject1 = this.euK;
      if (localObject1 == null)
        break label650;
      localObject1 = Integer.valueOf(((AudioManager)localObject1).getVibrateSetting(0));
      localObject2 = this.euK;
      if (localObject2 == null)
        break label655;
      localObject2 = Integer.valueOf(((AudioManager)localObject2).getRingerMode());
      ab.i(this.TAG, "V:%s V1:%s  R:%s", new Object[] { paramBundle, localObject1, localObject2 });
      this.mtx = ((AudioManager.OnAudioFocusChangeListener)ForceNotifyShowUI.a.mtA);
      paramBundle = this.euK;
      if (paramBundle == null)
        break label660;
      paramBundle = Integer.valueOf(paramBundle.requestAudioFocus(this.mtx, 3, 2));
      this.mty.postDelayed((Runnable)new ForceNotifyShowUI.b(this), 1000L);
      localObject1 = getWindow();
      a.f.b.j.o(localObject1, "window");
      localObject1 = ((Window)localObject1).getDecorView();
      a.f.b.j.o(localObject1, "window.decorView");
      ((View)localObject1).setKeepScreenOn(true);
      a.f.b.j.o(findViewById(2131821019), "findViewById(R.id.content)");
      getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(getResources().getColor(2131690065)));
      ab.i(this.TAG, "[onCreate] username:%s requestAudioFocus:%s", new Object[] { this.username, paramBundle });
      localObject1 = (TextView)findViewById(2131823149);
      paramBundle = (ImageView)findViewById(2131821183);
      findViewById(2131824119).setOnClickListener((View.OnClickListener)new ForceNotifyShowUI.c(this));
      this.mtw = ((Runnable)new ForceNotifyShowUI.d(this));
      this.mty.postDelayed(this.mtw, 60000L);
      b localb = this.mtz;
      localObject2 = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject2, "MMKernel.service(IMessengerStorage::class.java)");
      localb.ehM = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject2).XM().aoO(this.username);
      a.b.b(paramBundle, this.mtz.field_UserName, 0.1F);
      a.f.b.j.o(localObject1, "titleView");
      localObject2 = getBaseContext();
      paramBundle = this.mtz.ehM;
      if (paramBundle == null)
        break label665;
      paramBundle = paramBundle.Oj();
      ((TextView)localObject1).setText((CharSequence)com.tencent.mm.pluginsdk.ui.e.j.a((Context)localObject2, (CharSequence)paramBundle, (int)((TextView)localObject1).getTextSize(), 0, null, null));
      localObject1 = (com.tencent.mm.plugin.forcenotify.a.a)g.K(com.tencent.mm.plugin.forcenotify.a.a.class);
      paramBundle = this.username;
      localObject2 = com.tencent.mm.plugin.forcenotify.b.c.mtf;
      localObject2 = dxU();
      a.f.b.j.o(localObject2, "context");
      if (!com.tencent.mm.plugin.forcenotify.b.c.isSilentMode((Context)localObject2))
        break label676;
      localObject2 = com.tencent.mm.plugin.forcenotify.b.c.mtf;
      localObject2 = dxU();
      a.f.b.j.o(localObject2, "context");
      if (!com.tencent.mm.plugin.forcenotify.b.c.dT((Context)localObject2))
        break label670;
      i = 1;
    }
    while (true)
    {
      ((com.tencent.mm.plugin.forcenotify.a.a)localObject1).d(paramBundle, i, cb.aaE() / 1000L);
      if (this.username != null)
      {
        paramBundle = com.tencent.mm.plugin.forcenotify.d.a.mth;
        localObject1 = this.username;
        if (localObject1 == null)
          a.f.b.j.dWJ();
        paramBundle.pI((String)localObject1);
      }
      AppMethodBeat.o(51088);
      return;
      paramBundle = null;
      break;
      label650: localObject1 = null;
      break label153;
      label655: localObject2 = null;
      break label170;
      label660: paramBundle = null;
      break label229;
      label665: paramBundle = null;
      break label502;
      label670: i = 4;
      continue;
      label676: localObject2 = com.tencent.mm.plugin.forcenotify.b.c.mtf;
      localObject2 = dxU();
      a.f.b.j.o(localObject2, "context");
      if (com.tencent.mm.plugin.forcenotify.b.c.dT((Context)localObject2))
        i = 3;
      else
        i = 2;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(51092);
    super.onDestroy();
    reset();
    AppMethodBeat.o(51092);
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(51090);
    a.f.b.j.p(paramKeyEvent, "event");
    switch (paramInt)
    {
    default:
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(51090);
    case 24:
    case 25:
    }
    while (true)
    {
      return bool;
      reset();
      AppMethodBeat.o(51090);
      continue;
      reset();
      AppMethodBeat.o(51090);
    }
  }

  public final void onStop()
  {
    AppMethodBeat.i(51091);
    super.onStop();
    reset();
    AppMethodBeat.o(51091);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.ui.ForceNotifyShowUI
 * JD-Core Version:    0.6.2
 */