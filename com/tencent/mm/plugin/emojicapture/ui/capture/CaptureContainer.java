package com.tencent.mm.plugin.emojicapture.ui.capture;

import a.l;
import a.y;
import android.content.Context;
import android.opengl.EGLContext;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.plugin.emojicapture.c.a.b;
import com.tencent.mm.plugin.emojicapture.model.c.a;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.mm.plugin.emojicapture.proxy.EmojiCaptureProxy.a;
import com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureGLTextureView;
import com.tencent.mm.plugin.emojicapture.ui.b.g;
import com.tencent.mm.plugin.mmsight.model.o;
import com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView;
import com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView;
import com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView.a;
import com.tencent.mm.plugin.mmsight.ui.MMSightCircularProgressBar.a;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.b;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.c;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureContainer;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IView;", "Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "beautyParaBtn", "Landroid/widget/Button;", "cameraContainer", "Lcom/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer;", "captureCloseView", "Landroid/view/View;", "captureDecoration", "Lcom/tencent/mm/plugin/emojicapture/ui/capture/CaptureDecoration;", "captureFlipCameraView", "captureFocus", "Lcom/tencent/mm/plugin/mmsight/ui/CameraFrontSightView;", "captureHint", "Landroid/widget/TextView;", "captureTouchView", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView;", "emojiCaptureButton", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightRecordButton;", "emojiCaptureView", "Lcom/tencent/mm/plugin/emojicapture/ui/EmojiCaptureGLTextureView;", "emojiCaptureViewLayout", "Landroid/view/ViewGroup;", "hideHintRunnable", "Ljava/lang/Runnable;", "presenter", "Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IPresenter;", "getPresenter", "()Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IPresenter;", "setPresenter", "(Lcom/tencent/mm/plugin/emojicapture/contract/CaptureContract$IPresenter;)V", "renderer", "Lcom/tencent/mm/plugin/emojicapture/ui/gl/EmojiCaptureGLSurfaceTextureRenderer;", "reporter", "Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "getReporter", "()Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;", "setReporter", "(Lcom/tencent/mm/plugin/emojicapture/api/EmojiCaptureReporter;)V", "stickerPanel", "Lcom/tencent/mm/plugin/emojicapture/ui/capture/EditorStickerView;", "useBackgroundCamera", "", "voiceDetectView", "changeSticker", "", "stickerInfo", "Lcom/tencent/mm/plugin/emojicapture/model/capture/EmojiStickerInfo;", "doRecordVideoInfo", "info", "Lcom/tencent/mm/media/widget/camerarecordview/data/CameraCaptureInfo;", "enableCameraOrientationFit", "getCameraPreviewView", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "getDecoration", "getEncodeConfig", "Lcom/tencent/mm/media/widget/camerarecordview/data/IEncodeConfig;", "getPreviewRenderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "getRecordRenderer", "getRecorder", "Lcom/tencent/mm/media/widget/recorder/IMediaRecorder;", "getResolutionLimit", "getVideoTransPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "isMute", "onDestroy", "onPause", "onResume", "recordStop", "legalStop", "setVisibility", "visibility", "setup", "imitateEmoji", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "startRecord", "stopRecord", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "capture", "switchCamera", "toggleFlipCamera", "show", "toggleHint", "resId", "toggleVoiceDetect", "useBackGroundCamera", "useCpuCrop", "plugin-emojicapture_release"})
public final class CaptureContainer extends RelativeLayout
  implements com.tencent.mm.media.widget.camerarecordview.c.a, a.b
{
  public final String TAG;
  private EmojiCaptureReporter lha;
  private final ViewGroup lmc;
  private EmojiCaptureGLTextureView lmd;
  public com.tencent.mm.plugin.emojicapture.ui.b.b lme;
  private final MMSightRecordButton lmf;
  private final View lmg;
  private final View lmh;
  private final EditorStickerView lmi;
  private final View lmj;
  private final CaptureDecoration lmk;
  private final CameraFrontSightView lml;
  private final MMSightCaptureTouchView lmm;
  private final TextView lmn;
  private final Button lmo;
  com.tencent.mm.plugin.emojicapture.c.a.a lmp;
  private final Runnable lmq;
  public com.tencent.mm.media.widget.camerarecordview.a lmr;
  public boolean lms;

  public CaptureContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(2984);
    AppMethodBeat.o(2984);
  }

  public CaptureContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(2983);
    this.TAG = "MicroMsg.CaptureContainer";
    this.lme = new com.tencent.mm.plugin.emojicapture.ui.b.b((byte)0);
    this.lmq = ((Runnable)new CaptureContainer.c(this));
    View.inflate(paramContext, 2130969323, (ViewGroup)this);
    paramAttributeSet = findViewById(2131823418);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_preview_layout)");
    this.lmc = ((ViewGroup)paramAttributeSet);
    paramAttributeSet = findViewById(2131823423);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_button)");
    this.lmf = ((MMSightRecordButton)paramAttributeSet);
    paramAttributeSet = findViewById(2131823427);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.capture_close)");
    this.lmg = paramAttributeSet;
    paramAttributeSet = findViewById(2131823424);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.capture_flip_camera)");
    this.lmh = paramAttributeSet;
    paramAttributeSet = findViewById(2131823425);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.voice_detect_hint)");
    this.lmj = paramAttributeSet;
    paramAttributeSet = findViewById(2131823419);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.capture_decoration)");
    this.lmk = ((CaptureDecoration)paramAttributeSet);
    paramAttributeSet = findViewById(2131823420);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.capture_focus_frame)");
    this.lml = ((CameraFrontSightView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823421);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.capture_touch_view)");
    this.lmm = ((MMSightCaptureTouchView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823426);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_hint)");
    this.lmn = ((TextView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823422);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.emoji_capture_sticker_panel)");
    this.lmi = ((EditorStickerView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823428);
    a.f.b.j.o(paramAttributeSet, "findViewById(R.id.beauty_debug)");
    this.lmo = ((Button)paramAttributeSet);
    paramInt = com.tencent.mm.bz.a.fromDPToPix(paramContext, 120);
    this.lml.ez(paramInt, paramInt);
    this.lmd = new EmojiCaptureGLTextureView(paramContext);
    this.lmr = new com.tencent.mm.media.widget.camerarecordview.a((a.b)this);
    this.lmr.fbI = 600L;
    this.lmc.addView((View)this.lmd);
    this.lmd.setOpaque(false);
    this.lmf.setHighLightOuter(com.tencent.mm.plugin.emojicapture.ui.a.dg(this));
    this.lmf.setLongPressCallback((MMSightRecordButton.b)new MMSightRecordButton.b()
    {
      public final void bnU()
      {
        AppMethodBeat.i(2947);
        ab.i(CaptureContainer.e(this.lmt), "onLongPressFinish");
        CaptureContainer.a(this.lmt, this.lmt.a((a.f.a.b)new CaptureContainer.1.b(this)));
        AppMethodBeat.o(2947);
      }

      public final void bnV()
      {
        AppMethodBeat.i(2949);
        ab.i(CaptureContainer.e(this.lmt), "onPressDown");
        int[] arrayOfInt = new int[2];
        CaptureContainer.f(this.lmt).getLocationOnScreen(arrayOfInt);
        CaptureContainer.c(this.lmt).km(arrayOfInt[1]);
        AppMethodBeat.o(2949);
      }

      public final void jdMethod_if()
      {
        AppMethodBeat.i(2948);
        Object localObject1 = CaptureContainer.f(this.lmt);
        Object localObject2 = com.tencent.mm.plugin.emojicapture.model.c.lhw;
        ((MMSightRecordButton)localObject1).a(com.tencent.mm.plugin.emojicapture.model.c.bmL() * 1000, com.tencent.mm.plugin.emojicapture.ui.a.dg(this.lmt), (MMSightCircularProgressBar.a)new CaptureContainer.1.a(this));
        localObject2 = this.lmt;
        localObject1 = ((CaptureContainer)localObject2).lmp;
        if (localObject1 != null)
          ((com.tencent.mm.plugin.emojicapture.c.a.a)localObject1).aDm();
        if (!((CaptureContainer)localObject2).lmr.EL())
          EmojiCaptureReporter.up(33);
        CaptureContainer.g(this.lmt).setEnabled(false);
        CaptureContainer.g(this.lmt).animate().alpha(0.0F).start();
        CaptureContainer.a(this.lmt, false, 0);
        CaptureContainer.b(this.lmt).setVisibility(8);
        CaptureContainer.d(this.lmt).setShow(false);
        AppMethodBeat.o(2948);
      }
    });
    this.lmf.setSimpleTapCallback((MMSightRecordButton.d)new CaptureContainer.2(this));
    this.lmf.setLongPressScrollCallback((MMSightRecordButton.c)new MMSightRecordButton.c()
    {
      public final void uF(int paramAnonymousInt)
      {
        AppMethodBeat.i(2951);
        CaptureContainer.c(this.lmt).a(true, true, paramAnonymousInt);
        AppMethodBeat.o(2951);
      }

      public final void uG(int paramAnonymousInt)
      {
        AppMethodBeat.i(2952);
        CaptureContainer.c(this.lmt).a(false, true, paramAnonymousInt);
        AppMethodBeat.o(2952);
      }
    });
    this.lmm.setTouchCallback((MMSightCaptureTouchView.a)new CaptureContainer.4(this));
    this.lmg.setOnClickListener((View.OnClickListener)new CaptureContainer.5(this));
    this.lmh.setOnClickListener((View.OnClickListener)new CaptureContainer.6(this));
    if (bp.dpL())
    {
      this.lmo.setVisibility(0);
      this.lmo.setOnClickListener((View.OnClickListener)new CaptureContainer.7(paramContext));
    }
    while (true)
    {
      this.lmi.setCallback((a.f.a.b)new CaptureContainer.8(this));
      this.lmi.setVisibility(8);
      this.lmn.setAlpha(0.0F);
      post((Runnable)new CaptureContainer.9(this));
      AppMethodBeat.o(2983);
      return;
      this.lmo.setVisibility(8);
    }
  }

  private final void r(boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(2971);
    if (paramBoolean)
    {
      removeCallbacks(this.lmq);
      this.lmn.animate().cancel();
      this.lmn.animate().alpha(1.0F).start();
      this.lmn.setText(paramInt);
      postDelayed(this.lmq, 2000L);
      AppMethodBeat.o(2971);
    }
    while (true)
    {
      return;
      this.lmn.animate().cancel();
      this.lmn.animate().alpha(0.0F).start();
      AppMethodBeat.o(2971);
    }
  }

  public final boolean DX()
  {
    return true;
  }

  public final boolean WD()
  {
    AppMethodBeat.i(2976);
    boolean bool = ((com.tencent.mm.plugin.emojicapture.b.a.a)com.tencent.mm.plugin.emojicapture.b.a.lhc.Uw()).fau;
    AppMethodBeat.o(2976);
    return bool;
  }

  public final boolean WE()
  {
    AppMethodBeat.i(2982);
    EmojiCaptureProxy.a locala = EmojiCaptureProxy.lkM;
    boolean bool = EmojiCaptureProxy.access$getInstance$cp().getEnableAutoRotate();
    AppMethodBeat.o(2982);
    return bool;
  }

  public final boolean Wg()
  {
    AppMethodBeat.i(2975);
    this.lms = this.lmr.Wg();
    EmojiCaptureReporter localEmojiCaptureReporter = this.lha;
    long l;
    if (localEmojiCaptureReporter != null)
    {
      l = localEmojiCaptureReporter.ezZ;
      localEmojiCaptureReporter = this.lha;
      if (localEmojiCaptureReporter == null)
        break label80;
    }
    label80: for (int i = localEmojiCaptureReporter.scene; ; i = 0)
    {
      EmojiCaptureReporter.a(5, l, 0L, 0L, 0L, 0L, 0L, 0, 0, i);
      boolean bool = this.lms;
      AppMethodBeat.o(2975);
      return bool;
      l = 0L;
      break;
    }
  }

  public final void a(com.tencent.mm.plugin.emojicapture.model.a.b paramb)
  {
    AppMethodBeat.i(2969);
    this.lmk.setStickerInfo(paramb);
    this.lmd.c((a.f.a.a)new CaptureContainer.a(this, paramb));
    AppMethodBeat.o(2969);
  }

  public final boolean a(a.f.a.b<? super com.tencent.mm.media.widget.camerarecordview.a.a, y> paramb)
  {
    AppMethodBeat.i(2974);
    com.tencent.mm.plugin.emojicapture.c.a.a locala = this.lmp;
    if (locala != null)
      locala.EB();
    boolean bool = this.lmr.a(paramb);
    AppMethodBeat.o(2974);
    return bool;
  }

  public final void gB(boolean paramBoolean)
  {
    AppMethodBeat.i(2970);
    if (paramBoolean)
    {
      this.lmj.setVisibility(0);
      AppMethodBeat.o(2970);
    }
    while (true)
    {
      return;
      this.lmj.setVisibility(8);
      AppMethodBeat.o(2970);
    }
  }

  public final com.tencent.mm.media.widget.camerarecordview.preview.c getCameraPreviewView()
  {
    return (com.tencent.mm.media.widget.camerarecordview.preview.c)this.lmd;
  }

  public final CaptureDecoration getDecoration()
  {
    return this.lmk;
  }

  public final com.tencent.mm.media.widget.camerarecordview.a.b getEncodeConfig()
  {
    AppMethodBeat.i(2978);
    com.tencent.mm.media.widget.camerarecordview.a.b localb = (com.tencent.mm.media.widget.camerarecordview.a.b)new CaptureContainer.b();
    AppMethodBeat.o(2978);
    return localb;
  }

  public final com.tencent.mm.plugin.emojicapture.c.a.a getPresenter()
  {
    return this.lmp;
  }

  public final com.tencent.mm.media.h.a getPreviewRenderer()
  {
    return (com.tencent.mm.media.h.a)this.lme;
  }

  public final com.tencent.mm.media.h.a getRecordRenderer()
  {
    AppMethodBeat.i(2980);
    Object localObject = new g();
    c.a locala = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    com.tencent.mm.plugin.emojicapture.model.c.bmM();
    locala = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    com.tencent.mm.plugin.emojicapture.model.c.bmM();
    localObject = (com.tencent.mm.media.h.a)localObject;
    AppMethodBeat.o(2980);
    return localObject;
  }

  public final com.tencent.mm.media.widget.b.b getRecorder()
  {
    AppMethodBeat.i(2981);
    com.tencent.mm.media.h.a locala = getRecordRenderer();
    Object localObject = getVideoTransPara();
    EGLContext localEGLContext = getCameraPreviewView().getEGLContext();
    if (localEGLContext == null)
      a.f.b.j.dWJ();
    localObject = (com.tencent.mm.media.widget.b.b)new com.tencent.mm.media.widget.b.c((VideoTransPara)localObject, locala, localEGLContext, this.lmd.getPreviewTextureId());
    AppMethodBeat.o(2981);
    return localObject;
  }

  public final EmojiCaptureReporter getReporter()
  {
    return this.lha;
  }

  public final int getResolutionLimit()
  {
    AppMethodBeat.i(2977);
    int i = ((com.tencent.mm.plugin.emojicapture.b.a.a)com.tencent.mm.plugin.emojicapture.b.a.lhc.Uw()).lhd;
    AppMethodBeat.o(2977);
    return i;
  }

  public final VideoTransPara getVideoTransPara()
  {
    AppMethodBeat.i(2979);
    VideoTransPara localVideoTransPara = com.tencent.mm.plugin.mmsight.model.j.ouz.fcY;
    if (localVideoTransPara != null)
      AppMethodBeat.o(2979);
    while (true)
    {
      return localVideoTransPara;
      localVideoTransPara = new VideoTransPara();
      AppMethodBeat.o(2979);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(2973);
    ab.i(this.TAG, "resumeCapture");
    gB(false);
    getDecoration().resume();
    this.lmr.a(this.lms, (a.f.a.b)new CaptureContainer.d(this));
    AppMethodBeat.o(2973);
  }

  public final void setPresenter(com.tencent.mm.plugin.emojicapture.c.a.a parama)
  {
    this.lmp = parama;
  }

  public final void setReporter(EmojiCaptureReporter paramEmojiCaptureReporter)
  {
    this.lha = paramEmojiCaptureReporter;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(2972);
    ab.i(this.TAG, "setVisibility:".concat(String.valueOf(paramInt)));
    super.setVisibility(paramInt);
    this.lmg.setVisibility(paramInt);
    if (paramInt == 0)
    {
      this.lmf.setTouchEnable(true);
      this.lmi.boa();
    }
    if (paramInt == 8)
    {
      this.lmd.setTextureChangeCallback(null);
      this.lmc.removeView((View)this.lmd);
      this.lmd = new EmojiCaptureGLTextureView(getContext());
      this.lmc.addView((View)this.lmd);
      this.lme = new com.tencent.mm.plugin.emojicapture.ui.b.b((byte)0);
      this.lmd.a((com.tencent.mm.media.h.a)this.lme, WD());
      this.lmd.setOpaque(false);
    }
    this.lmd.setVisibility(paramInt);
    AppMethodBeat.o(2972);
  }

  public final void setup(EmojiInfo paramEmojiInfo)
  {
    long l = 0L;
    AppMethodBeat.i(2968);
    Object localObject;
    if (paramEmojiInfo != null)
    {
      this.lmk.setImitateEmoji(paramEmojiInfo);
      EditorStickerView localEditorStickerView = this.lmi;
      localObject = this.lha;
      if (localObject != null)
        l = ((EmojiCaptureReporter)localObject).ezZ;
      localObject = paramEmojiInfo.field_lensId;
      paramEmojiInfo = (EmojiInfo)localObject;
      if (localObject == null)
        paramEmojiInfo = "";
      localEditorStickerView.m(l, paramEmojiInfo);
      AppMethodBeat.o(2968);
    }
    while (true)
    {
      return;
      this.lmk.setImitateEmoji(null);
      paramEmojiInfo = this.lmi;
      localObject = this.lha;
      if (localObject != null)
        l = ((EmojiCaptureReporter)localObject).ezZ;
      paramEmojiInfo.m(l, null);
      AppMethodBeat.o(2968);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer
 * JD-Core Version:    0.6.2
 */