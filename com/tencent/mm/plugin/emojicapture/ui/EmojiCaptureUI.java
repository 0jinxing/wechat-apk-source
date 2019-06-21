package com.tencent.mm.plugin.emojicapture.ui;

import a.l;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.g.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.a.a;
import com.tencent.mm.plugin.emojicapture.c.b.a;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy.a;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureReceiver;
import com.tencent.mm.plugin.emojicapture.ui.b.f;
import com.tencent.mm.plugin.emojicapture.ui.b.h;
import com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer;
import com.tencent.mm.plugin.emojicapture.ui.capture.CaptureDecoration;
import com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer;
import com.tencent.mm.plugin.emojicapture.ui.editor.TextEditorItemView;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.ttpic.cache.VideoMemoryManager;
import com.tencent.ttpic.util.VideoGlobalContext;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI;", "Lcom/tencent/mm/ui/MMActivity;", "()V", "TAG", "", "captureContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer;", "capturePresenter", "Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IPresenter;", "captureReceiver", "Lcom/tencent/mm/plugin/emojicapture/proxy/EmojiCaptureReceiver;", "editorContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/CaptureEditorContainer;", "editorPresenter", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorContract$IPresenter;", "hardCoderSystemEventListener", "com/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$hardCoderSystemEventListener$1", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$hardCoderSystemEventListener$1;", "reporter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "scene", "", "state", "timeEnter", "", "uiNavigation", "com/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$uiNavigation$1", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureUI$uiNavigation$1;", "checkPermission", "", "finish", "getForceOrientation", "getLayoutId", "initOnCreateAfterConnected", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "", "keyCode", "event", "Landroid/view/KeyEvent;", "onPause", "onResume", "Companion", "UINavigation", "plugin-emojicapture_release"})
@com.tencent.mm.ui.base.a(3)
public final class EmojiCaptureUI extends MMActivity
{
  public static final EmojiCaptureUI.a llj;
  private final String TAG;
  private long ezZ;
  private final EmojiCaptureReporter lha;
  private CaptureContainer llc;
  private CaptureEditorContainer lld;
  private a.a lle;
  private b.a llf;
  private EmojiCaptureReceiver llg;
  private final EmojiCaptureUI.f llh;
  private final EmojiCaptureUI.d lli;
  private int scene;
  private int state;

  static
  {
    AppMethodBeat.i(2885);
    llj = new EmojiCaptureUI.a((byte)0);
    AppMethodBeat.o(2885);
  }

  public EmojiCaptureUI()
  {
    AppMethodBeat.i(2884);
    this.TAG = "MicroMsg.EmojiCaptureUI";
    this.scene = 2;
    this.lha = new EmojiCaptureReporter();
    this.llh = new EmojiCaptureUI.f(this);
    this.lli = new EmojiCaptureUI.d(this);
    AppMethodBeat.o(2884);
  }

  public final void finish()
  {
    AppMethodBeat.i(2883);
    super.finish();
    overridePendingTransition(-1, 2131034128);
    AppMethodBeat.o(2883);
  }

  public final int getForceOrientation()
  {
    AppMethodBeat.i(2877);
    EmojiCaptureProxy.a locala = EmojiCaptureProxy.lkM;
    int i;
    if (EmojiCaptureProxy.access$getInstance$cp().getEnableAutoRotate())
    {
      i = 7;
      AppMethodBeat.o(2877);
    }
    while (true)
    {
      return i;
      i = 1;
      AppMethodBeat.o(2877);
    }
  }

  public final int getLayoutId()
  {
    return 2130969331;
  }

  public final void onBackPressed()
  {
    AppMethodBeat.i(2881);
    b.a locala = this.llf;
    if ((locala == null) || (locala.Ab() != true))
      EmojiCaptureUI.b.a.a(this.llh, false);
    AppMethodBeat.o(2881);
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(2876);
    ab.i(this.TAG, "onCreate");
    overridePendingTransition(2131034127, -1);
    supportRequestWindowFeature(1);
    Ne(8);
    getWindow().addFlags(67109888);
    super.onCreate(paramBundle);
    VideoGlobalContext.setContext(ah.getContext());
    this.scene = getIntent().getIntExtra("enter_scene", this.scene);
    this.ezZ = getIntent().getLongExtra("key_enter_time", 0L);
    this.lha.scene = this.scene;
    this.lha.ezZ = this.ezZ;
    com.tencent.mm.plugin.mmsight.model.j.bPw();
    g.b.ER();
    int i = getIntent().getIntExtra("key_capture_max_duration", 5);
    String str = getIntent().getStringExtra("key_imitated_md5");
    paramBundle = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    com.tencent.mm.plugin.emojicapture.model.c.uq(i);
    this.lha.lgW = str;
    paramBundle = findViewById(2131823444);
    a.f.b.j.o(paramBundle, "findViewById(R.id.capture_container)");
    this.llc = ((CaptureContainer)paramBundle);
    paramBundle = findViewById(2131823445);
    a.f.b.j.o(paramBundle, "findViewById(R.id.editor_container)");
    this.lld = ((CaptureEditorContainer)paramBundle);
    long l = bo.yz();
    paramBundle = EmojiCaptureProxy.lkM;
    EmojiCaptureProxy.a.bnL();
    paramBundle = EmojiCaptureProxy.lkM;
    paramBundle = EmojiCaptureProxy.access$getInstance$cp().getServerProxy();
    if (paramBundle != null)
      paramBundle.connect((Runnable)new EmojiCaptureUI.e(this, l));
    paramBundle = com.tencent.mm.plugin.emojicapture.model.d.lhz;
    com.tencent.mm.plugin.emojicapture.model.d.bmP();
    paramBundle = VideoMemoryManager.getInstance();
    a.f.b.j.o(paramBundle, "VideoMemoryManager.getInstance()");
    paramBundle.setSampleSize(2);
    AppMethodBeat.o(2876);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(2882);
    com.tencent.mm.sdk.b.a.xxA.d((com.tencent.mm.sdk.b.c)this.lli);
    super.onDestroy();
    Object localObject = this.lle;
    if (localObject != null)
      ((a.a)localObject).destroy();
    localObject = this.llc;
    if (localObject == null)
      a.f.b.j.avw("captureContainer");
    localObject = ((CaptureContainer)localObject).lme.eYL;
    if (localObject != null)
    {
      if (!(localObject instanceof com.tencent.mm.plugin.emojicapture.ui.b.a))
        break label144;
      ((com.tencent.mm.plugin.emojicapture.ui.b.a)localObject).loL.destroy();
    }
    while (true)
    {
      localObject = this.llf;
      if (localObject != null)
        ((b.a)localObject).destroy();
      if (this.llg != null)
        unregisterReceiver((BroadcastReceiver)this.llg);
      localObject = com.tencent.mm.plugin.emojicapture.model.a.c.lhS;
      com.tencent.mm.plugin.emojicapture.model.a.c.destroy();
      localObject = EmojiCaptureProxy.lkM;
      EmojiCaptureProxy.a.bnM();
      localObject = com.tencent.mm.plugin.emojicapture.model.d.lhz;
      com.tencent.mm.plugin.emojicapture.model.d.bmQ();
      AppMethodBeat.o(2882);
      return;
      label144: if ((localObject instanceof f))
        ((f)localObject).loL.destroy();
    }
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(2880);
    if ((q.etc.eqV == 1) && (paramInt == 700))
    {
      CaptureContainer localCaptureContainer = this.llc;
      if (localCaptureContainer == null)
        a.f.b.j.avw("captureContainer");
      if (localCaptureContainer.lms)
      {
        localCaptureContainer = this.llc;
        if (localCaptureContainer == null)
          a.f.b.j.avw("captureContainer");
        localCaptureContainer.Wg();
      }
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(2880);
    return bool;
  }

  public final void onPause()
  {
    AppMethodBeat.i(2878);
    super.onPause();
    Object localObject;
    if (this.state == 0)
    {
      CaptureContainer localCaptureContainer = this.llc;
      if (localCaptureContainer == null)
        a.f.b.j.avw("captureContainer");
      ab.i(localCaptureContainer.TAG, "PauseCapture");
      localObject = localCaptureContainer.getDecoration();
      ((CaptureDecoration)localObject).lmz.pause();
      ((CaptureDecoration)localObject).lmA.pause();
      localCaptureContainer.lmr.stopPreview();
      AppMethodBeat.o(2878);
    }
    while (true)
    {
      return;
      localObject = this.llf;
      if (localObject != null)
      {
        ((b.a)localObject).pause();
        AppMethodBeat.o(2878);
      }
      else
      {
        AppMethodBeat.o(2878);
      }
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(2879);
    super.onResume();
    Object localObject;
    if (this.state == 0)
      if (b.e((Context)this, new String[] { "android.permission.CAMERA", "android.permission.RECORD_AUDIO" }))
      {
        localObject = this.llc;
        if (localObject == null)
          a.f.b.j.avw("captureContainer");
        ((CaptureContainer)localObject).onResume();
        AppMethodBeat.o(2879);
      }
    while (true)
    {
      return;
      ab.i(this.TAG, "initOnCreateAfterConnected: no permission");
      AppMethodBeat.o(2879);
      continue;
      localObject = this.llf;
      if (localObject != null)
      {
        ((b.a)localObject).resume();
        AppMethodBeat.o(2879);
      }
      else
      {
        AppMethodBeat.o(2879);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI
 * JD-Core Version:    0.6.2
 */