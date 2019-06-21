package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import a.v;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.b.a.al;
import com.tencent.mm.g.b.a.at;
import com.tencent.mm.kernel.e;
import com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.ui.CameraFrontSightView;
import com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView;
import com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView.a;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.b;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.c;
import com.tencent.mm.plugin.mmsight.ui.MMSightRecordButton.d;
import com.tencent.mm.plugin.story.c.a.b.a;
import com.tencent.mm.plugin.story.c.a.c.a;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.ui.StoryCaptureUI.b;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.ah;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CaptureView;", "Landroid/widget/RelativeLayout;", "Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "albumView", "Landroid/widget/ImageView;", "cameraContainer", "Lcom/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer;", "cameraPreviewView", "Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "captureButton", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightRecordButton;", "captureFocus", "Lcom/tencent/mm/plugin/mmsight/ui/CameraFrontSightView;", "captureHint", "Landroid/widget/TextView;", "captureTouchView", "Lcom/tencent/mm/plugin/mmsight/ui/MMSightCaptureTouchView;", "closeView", "guideView", "Lcom/tencent/mm/plugin/story/ui/view/UserGuideView;", "hideHintRunnable", "Ljava/lang/Runnable;", "recordStartTime", "", "startTimeStamp", "uiHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "uiNavigation", "Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;", "getUiNavigation", "()Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;", "setUiNavigation", "(Lcom/tencent/mm/plugin/story/ui/StoryCaptureUI$UINavigation;)V", "useBackGroundCamera", "", "destroy", "", "enableCameraOrientationFit", "getCameraPreviewView", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "getEncodeConfig", "Lcom/tencent/mm/media/widget/camerarecordview/data/IEncodeConfig;", "getResolutionLimit", "getVideoTransPara", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "gotoEditor", "capture", "Lcom/tencent/mm/media/widget/camerarecordview/data/CameraCaptureInfo;", "hideGuideView", "hideHint", "initCaptureButton", "onBack", "onClick", "v", "Landroid/view/View;", "pause", "resume", "setVisibility", "visibility", "showHint", "strRes", "useCpuCrop", "Companion", "plugin-story_release"})
public final class CaptureView extends RelativeLayout
  implements View.OnClickListener, com.tencent.mm.media.widget.camerarecordview.c.a
{
  public static final CaptureView.b sii;
  private final ak fbD;
  private boolean fbE;
  private long ljM;
  private final CameraFrontSightView lml;
  private final MMSightCaptureTouchView lmm;
  private final TextView lmn;
  private final Runnable lmq;
  public com.tencent.mm.media.widget.camerarecordview.a lmr;
  private StoryCaptureUI.b rYv;
  private final CameraPreviewGLSurfaceView sic;
  private final MMSightRecordButton sie;
  private final ImageView sif;
  private final ImageView sig;
  public g sih;
  private long startTimeStamp;

  static
  {
    AppMethodBeat.i(110326);
    sii = new CaptureView.b((byte)0);
    AppMethodBeat.o(110326);
  }

  public CaptureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110325);
    AppMethodBeat.o(110325);
  }

  public CaptureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110324);
    this.startTimeStamp = bo.yz();
    this.fbE = true;
    this.fbD = new ak(Looper.getMainLooper());
    View.inflate(paramContext, 2130970864, (ViewGroup)this);
    paramAttributeSet = findViewById(2131821706);
    j.o(paramAttributeSet, "findViewById(R.id.draw_preview_surface)");
    this.sic = ((CameraPreviewGLSurfaceView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828048);
    j.o(paramAttributeSet, "findViewById(R.id.story_capture_button)");
    this.sie = ((MMSightRecordButton)paramAttributeSet);
    paramAttributeSet = findViewById(2131823420);
    j.o(paramAttributeSet, "findViewById(R.id.capture_focus_frame)");
    this.lml = ((CameraFrontSightView)paramAttributeSet);
    paramAttributeSet = findViewById(2131823421);
    j.o(paramAttributeSet, "findViewById(R.id.capture_touch_view)");
    this.lmm = ((MMSightCaptureTouchView)paramAttributeSet);
    paramAttributeSet = findViewById(2131828049);
    j.o(paramAttributeSet, "findViewById(R.id.story_capture_hint)");
    this.lmn = ((TextView)paramAttributeSet);
    paramInt = com.tencent.mm.bz.a.fromDPToPix(paramContext, 120);
    this.lml.ez(paramInt, paramInt);
    paramAttributeSet = findViewById(2131828046);
    j.o(paramAttributeSet, "findViewById<ImageView>(R.id.story_capture_close)");
    this.sif = ((ImageView)paramAttributeSet);
    this.sif.setImageDrawable(ah.f(paramContext, 2131231124, -1));
    this.sif.setOnClickListener((com.tencent.mm.media.widget.camerarecordview.c.a)this);
    paramAttributeSet = findViewById(2131828047);
    j.o(paramAttributeSet, "findViewById<ImageView>(….story_choose_from_album)");
    this.sig = ((ImageView)paramAttributeSet);
    this.sig.setImageDrawable(ah.f(paramContext, 2131231397, -1));
    this.sig.setOnClickListener((com.tencent.mm.media.widget.camerarecordview.c.a)this);
    paramAttributeSet = (ImageView)findViewById(2131828045);
    paramAttributeSet.setImageDrawable(ah.f(paramContext, 2131231404, -1));
    paramAttributeSet.setOnClickListener((com.tencent.mm.media.widget.camerarecordview.c.a)this);
    this.lmr = new com.tencent.mm.media.widget.camerarecordview.a((com.tencent.mm.media.widget.camerarecordview.c.a)this);
    this.lmm.setTouchCallback((MMSightCaptureTouchView.a)new CaptureView.1(this));
    paramAttributeSet = com.tencent.mm.kernel.g.RP();
    j.o(paramAttributeSet, "storage()");
    if (!paramAttributeSet.Ry().getBoolean(ac.a.xWD, false))
    {
      this.sih = new g(paramContext);
      paramContext = this.sih;
      if (paramContext != null)
      {
        paramAttributeSet = new ViewGroup.LayoutParams(-1, -1);
        addView((View)paramContext, paramAttributeSet);
        paramContext.setClickListener((a.f.a.a)new CaptureView.a(this));
      }
    }
    this.startTimeStamp = bo.yz();
    this.sie.setSimpleTapCallback((MMSightRecordButton.d)new CaptureView.h(this));
    this.sie.setLongPressCallback((MMSightRecordButton.b)new CaptureView.i(this));
    this.sie.setLongPressScrollCallback((MMSightRecordButton.c)new CaptureView.j(this));
    this.lmq = ((Runnable)new CaptureView.g(this));
    AppMethodBeat.o(110324);
  }

  public final boolean DX()
  {
    return false;
  }

  public final boolean WD()
  {
    AppMethodBeat.i(110319);
    boolean bool = ((b.a)com.tencent.mm.plugin.story.c.a.b.rRj.Uw()).fau;
    AppMethodBeat.o(110319);
    return bool;
  }

  public final boolean WE()
  {
    return q.etc.erC;
  }

  public final void cCl()
  {
    AppMethodBeat.i(110318);
    Object localObject = this.sih;
    if (localObject != null)
      ((g)localObject).animate().alpha(0.0F).withEndAction((Runnable)new CaptureView.e((g)localObject, this)).start();
    localObject = com.tencent.mm.kernel.g.RP();
    j.o(localObject, "storage()");
    ((e)localObject).Ry().set(ac.a.xWD, Boolean.TRUE);
    AppMethodBeat.o(110318);
  }

  public final com.tencent.mm.media.widget.camerarecordview.preview.c getCameraPreviewView()
  {
    return (com.tencent.mm.media.widget.camerarecordview.preview.c)this.sic;
  }

  public final com.tencent.mm.media.widget.camerarecordview.a.b getEncodeConfig()
  {
    AppMethodBeat.i(110321);
    com.tencent.mm.media.widget.camerarecordview.a.b localb = (com.tencent.mm.media.widget.camerarecordview.a.b)new CaptureView.c();
    AppMethodBeat.o(110321);
    return localb;
  }

  public final com.tencent.mm.media.h.a getPreviewRenderer()
  {
    return null;
  }

  public final com.tencent.mm.media.h.a getRecordRenderer()
  {
    return null;
  }

  public final com.tencent.mm.media.widget.b.b getRecorder()
  {
    return null;
  }

  public final int getResolutionLimit()
  {
    AppMethodBeat.i(110320);
    int i = ((b.a)com.tencent.mm.plugin.story.c.a.b.rRj.Uw()).lhd;
    AppMethodBeat.o(110320);
    return i;
  }

  public final StoryCaptureUI.b getUiNavigation()
  {
    return this.rYv;
  }

  public final VideoTransPara getVideoTransPara()
  {
    AppMethodBeat.i(110322);
    VideoTransPara localVideoTransPara = ((c.a)com.tencent.mm.plugin.story.c.a.c.rRk.Uw()).rRl;
    AppMethodBeat.o(110322);
    return localVideoTransPara;
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(110323);
    if (paramView != null)
    {
      paramView = Integer.valueOf(paramView.getId());
      if (paramView != null)
        break label42;
      label22: if (paramView != null)
        break label100;
      label26: if (paramView != null)
        break label240;
      AppMethodBeat.o(110323);
    }
    while (true)
    {
      return;
      paramView = null;
      break;
      label42: if (paramView.intValue() != 2131828046)
        break label22;
      if (!this.lmr.isRecording)
      {
        paramView = this.rYv;
        if (paramView != null)
          paramView.exit();
        paramView = h.scu;
        h.EU(3);
        paramView = h.scu;
        h.cAr();
        AppMethodBeat.o(110323);
        continue;
        label100: if (paramView.intValue() != 2131828047)
          break label26;
        if (this.lmr.isRecording)
        {
          AppMethodBeat.o(110323);
          continue;
        }
        Intent localIntent = new Intent();
        localIntent.putExtra("key_edit_video_max_time_length", 10);
        localIntent.putExtra("key_edit_text_color", "#0E9CE6");
        paramView = getContext();
        if (paramView == null)
        {
          paramView = new v("null cannot be cast to non-null type android.app.Activity");
          AppMethodBeat.o(110323);
          throw paramView;
        }
        n.a((Activity)paramView, 1002, 1, 14, 2, localIntent);
        paramView = h.scu;
        h.cAm().bd(0L);
        paramView = h.scu;
        h.EU(4);
        paramView = h.scu;
        h.cAq().FW();
        AppMethodBeat.o(110323);
        continue;
        label240: if (paramView.intValue() == 2131828045)
        {
          paramView = h.scu;
          h.EU(1);
          this.fbE = this.lmr.Wg();
        }
      }
      AppMethodBeat.o(110323);
    }
  }

  public final void setUiNavigation(StoryCaptureUI.b paramb)
  {
    this.rYv = paramb;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(110317);
    super.setVisibility(paramInt);
    this.sic.setVisibility(paramInt);
    if (paramInt == 0)
      this.sie.bQt();
    AppMethodBeat.o(110317);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.CaptureView
 * JD-Core Version:    0.6.2
 */