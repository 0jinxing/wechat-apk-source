package com.tencent.mm.media.widget.camerarecordview;

import a.f.b.j;
import a.f.b.k;
import a.l;
import a.y;
import android.content.Context;
import android.opengl.EGLContext;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.a.e;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/CameraPreviewContainer;", "", "process", "Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;", "(Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;)V", "audioRecorder", "Lcom/tencent/mm/plugin/mmsight/model/encode/IMMSightAACRecorder;", "camera", "Lcom/tencent/mm/media/widget/camera/ICommonCamera;", "cameraCountNumber", "", "context", "Landroid/content/Context;", "currentState", "initRecorderRet", "", "isRecording", "lastFlipCameraStamp", "", "mediaRecorder", "Lcom/tencent/mm/media/widget/recorder/IMediaRecorder;", "orientationFit", "Lcom/tencent/mm/media/widget/camerarecordview/orientationfit/PreviewOrientationFit;", "getProcess", "()Lcom/tencent/mm/media/widget/camerarecordview/process/ICameraContainerProcess;", "setProcess", "recordMiniTime", "startRecordTimeStamp", "uiHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "useBackGroundCamera", "createRecorder", "getCameraCount", "initRecorder", "", "cameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "onPause", "onResume", "postFocusOnTouch", "x", "", "y", "surfaceWidth", "surfaceHeight", "delay", "prepareCameraZoom", "baseTopLocation", "release", "removeFocusOnTouch", "setRecordMiniTime", "time", "setRender", "startPreview", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "success", "startRecord", "stopPreview", "stopRecord", "Lcom/tencent/mm/media/widget/camerarecordview/data/CameraCaptureInfo;", "capture", "switchCamera", "triggerCameraZoom", "zoom", "isScrollZoom", "factor", "Companion", "plugin-mediaeditor_release"})
public final class a
{
  public static final a.a fbL;
  private Context context;
  private int currentState;
  private final e fbA;
  public com.tencent.mm.media.widget.b.b fbB;
  private com.tencent.mm.plugin.mmsight.model.a.c fbC;
  private final ak fbD;
  private boolean fbE;
  private long fbF;
  private long fbG;
  private boolean fbH;
  public long fbI;
  public com.tencent.mm.media.widget.camerarecordview.b.a fbJ;
  public com.tencent.mm.media.widget.camerarecordview.c.a fbK;
  public final int fbz;
  public boolean isRecording;

  static
  {
    AppMethodBeat.i(13246);
    fbL = new a.a((byte)0);
    AppMethodBeat.o(13246);
  }

  public a(com.tencent.mm.media.widget.camerarecordview.c.a parama)
  {
    AppMethodBeat.i(13245);
    this.fbK = parama;
    this.fbz = com.tencent.mm.compatible.e.d.getNumberOfCameras();
    this.fbD = new ak(Looper.getMainLooper());
    this.fbE = true;
    this.currentState = 1;
    this.fbI = 2000L;
    com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", this.fbK.toString(), new Object[0]);
    com.tencent.mm.media.widget.camerarecordview.preview.c localc = this.fbK.getCameraPreviewView();
    if (this.fbK.getPreviewRenderer() != null)
    {
      parama = this.fbK.getPreviewRenderer();
      if (parama == null)
        j.dWJ();
      localc.a(parama, this.fbK.WD());
    }
    while (true)
    {
      this.fbA = ((e)new com.tencent.mm.media.widget.a.d(this.fbK.getContext()));
      this.fbG = bo.yz();
      this.context = this.fbK.getContext();
      this.fbJ = new com.tencent.mm.media.widget.camerarecordview.b.a(this.context, this.fbK);
      AppMethodBeat.o(13245);
      return;
      localc.a((com.tencent.mm.media.h.a)new a.c(this), this.fbK.WD());
    }
  }

  private final boolean Wt()
  {
    AppMethodBeat.i(13240);
    Object localObject = this.fbB;
    if (localObject != null)
    {
      ((com.tencent.mm.media.widget.b.b)localObject).cancel();
      ((com.tencent.mm.media.widget.b.b)localObject).clear();
    }
    com.tencent.mm.media.widget.camerarecordview.a.b localb = this.fbK.getEncodeConfig();
    boolean bool;
    if (this.fbK.getCameraPreviewView().getEGLContext() == null)
    {
      bool = false;
      AppMethodBeat.o(13240);
      return bool;
    }
    if (this.fbK.getRecorder() != null)
      localObject = this.fbK.getRecorder();
    while (true)
    {
      this.fbB = ((com.tencent.mm.media.widget.b.b)localObject);
      localObject = this.fbB;
      if (localObject != null)
        ((com.tencent.mm.media.widget.b.b)localObject).setMute(this.fbK.DX());
      if ((localb.getSampleRate() > 0) && (localb.Wx() > 0))
      {
        localObject = b.fbR;
        this.fbC = b.cl(localb.getSampleRate(), localb.Wx());
      }
      this.fbK.getCameraPreviewView().setOnDrawListener((a.f.a.b)new b(this));
      bool = true;
      AppMethodBeat.o(13240);
      break;
      if (this.fbK.WD())
      {
        localObject = b.fbR;
        localObject = b.a(localb.Ww(), this.fbK.getVideoTransPara(), this.fbA, this.fbK.getRecordRenderer());
      }
      else
      {
        localObject = b.fbR;
        int i = localb.Ww();
        localObject = this.fbK.getVideoTransPara();
        e locale = this.fbA;
        EGLContext localEGLContext = this.fbK.getCameraPreviewView().getEGLContext();
        if (localEGLContext == null)
          j.dWJ();
        localObject = b.a(i, (VideoTransPara)localObject, locale, localEGLContext, this.fbK.getCameraPreviewView(), this.fbK.WD(), this.fbK.getRecordRenderer());
      }
    }
  }

  private final void Wu()
  {
    Object localObject1 = null;
    AppMethodBeat.i(13241);
    com.tencent.mm.media.widget.b.b localb = this.fbB;
    if (localb != null)
      localb.s(com.tencent.mm.media.widget.a.b.getPreviewWidth(), com.tencent.mm.media.widget.a.b.getPreviewHeight(), com.tencent.mm.media.widget.a.b.Wj(), com.tencent.mm.media.widget.a.b.Wk());
    if (localb != null)
      localb.setFilePath(this.fbK.getEncodeConfig().getFilePath());
    if (localb != null)
      localb.mb(this.fbK.getEncodeConfig().Wy());
    StringBuilder localStringBuilder = new StringBuilder("filePath : ");
    Object localObject2;
    if (localb != null)
    {
      localObject2 = localb.getFilePath();
      localStringBuilder = localStringBuilder.append((String)localObject2).append("   thumbPath : ");
      localObject2 = localObject1;
      if (localb != null)
        localObject2 = localb.Wy();
      com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", (String)localObject2, new Object[0]);
      localObject2 = this.fbB;
      if (localObject2 == null)
        break label219;
    }
    label219: for (boolean bool = ((com.tencent.mm.media.widget.b.b)localObject2).ko(com.tencent.mm.media.widget.a.b.Wi()); ; bool = false)
    {
      if (!bool)
        com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "init recorder ret:".concat(String.valueOf(bool)), new Object[0]);
      this.fbH = bool;
      AppMethodBeat.o(13241);
      return;
      localObject2 = null;
      break;
    }
  }

  public final boolean EL()
  {
    AppMethodBeat.i(13233);
    com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "startRecord", new Object[0]);
    boolean bool;
    if ((this.fbA.Wq() != null) && (this.fbB != null))
      if (!this.fbH)
      {
        com.tencent.luggage.g.d.i("MicroMsg.CameraPreviewContainer", "startRecord, initRecorder failed");
        AppMethodBeat.o(13233);
        bool = false;
      }
    while (true)
    {
      return bool;
      Object localObject = this.fbB;
      if (localObject != null)
      {
        localObject = Integer.valueOf(((com.tencent.mm.media.widget.b.b)localObject).b(com.tencent.mm.media.widget.a.b.Wi(), false, 0));
        label86: com.tencent.luggage.g.d.i("MicroMsg.CameraPreviewContainer", "start record ret:".concat(String.valueOf(localObject)));
        if (localObject != null)
          break label121;
      }
      label121: 
      while (((Integer)localObject).intValue() != 0)
      {
        AppMethodBeat.o(13233);
        bool = false;
        break;
        localObject = null;
        break label86;
      }
      this.fbF = bo.yz();
      this.isRecording = true;
      AppMethodBeat.o(13233);
      bool = true;
      continue;
      com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "cameraConfig is null", new Object[0]);
      AppMethodBeat.o(13233);
      bool = false;
    }
  }

  public final boolean Wg()
  {
    AppMethodBeat.i(13239);
    com.tencent.luggage.g.d.i("MicroMsg.CameraPreviewContainer", "flipCamera time space:" + bo.az(this.fbG));
    if (bo.az(this.fbG) < 1000L)
    {
      bool = this.fbE;
      AppMethodBeat.o(13239);
      return bool;
    }
    this.fbG = bo.yz();
    this.fbK.getCameraPreviewView().WB();
    this.fbE = this.fbA.Wg();
    com.tencent.mm.media.widget.a.b localb = this.fbA.Wq();
    Object localObject = this.fbJ;
    if ((!this.fbE) && (this.fbK.WE()));
    for (boolean bool = true; ; bool = false)
    {
      ((com.tencent.mm.media.widget.camerarecordview.b.a)localObject).a(bool, localb);
      if (localb != null)
      {
        this.fbK.getCameraPreviewView().a(localb);
        localObject = b.fbR;
        localObject = b.getRenderer();
        if (localObject != null)
          ((com.tencent.mm.media.h.a)localObject).ch(com.tencent.mm.media.widget.a.b.getPreviewWidth(), com.tencent.mm.media.widget.a.b.getPreviewHeight());
        localObject = b.fbR;
        localObject = b.getRenderer();
        if (localObject != null)
          ((com.tencent.mm.media.h.a)localObject).ka(com.tencent.mm.media.widget.a.b.Wi());
        localObject = b.fbR;
        localObject = b.getRenderer();
        if (localObject != null)
          ((com.tencent.mm.media.h.a)localObject).ct(com.tencent.mm.media.widget.a.b.Wl());
      }
      bool = this.fbE;
      AppMethodBeat.o(13239);
      break;
    }
  }

  public final void Wp()
  {
    AppMethodBeat.i(13236);
    if (this.currentState == 0)
      this.fbA.Wp();
    AppMethodBeat.o(13236);
  }

  public final void a(boolean paramBoolean, a.f.a.b<? super Boolean, y> paramb)
  {
    AppMethodBeat.i(13242);
    if (this.currentState == 0)
      AppMethodBeat.o(13242);
    while (true)
    {
      return;
      this.currentState = 0;
      com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "startPreview process.useCpuCrop():" + this.fbK.WD(), new Object[0]);
      this.fbE = paramBoolean;
      this.fbA.o(this.fbK.getContext(), paramBoolean);
      if (this.fbK.WD())
        this.fbA.a(this.fbK.getCameraPreviewView().getFrameDataCallback());
      this.fbK.getCameraPreviewView().b((a.f.a.b)new a.d(this, paramBoolean, paramb));
      AppMethodBeat.o(13242);
    }
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    AppMethodBeat.i(13238);
    if (this.currentState == 0)
      this.fbA.a(paramBoolean1, paramBoolean2, paramInt);
    AppMethodBeat.o(13238);
  }

  public final boolean a(a.f.a.b<? super com.tencent.mm.media.widget.camerarecordview.a.a, y> paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(13234);
    if (!this.isRecording)
    {
      AppMethodBeat.o(13234);
      bool = true;
    }
    while (true)
    {
      return bool;
      this.isRecording = false;
      if (bo.az(this.fbF) < this.fbI)
      {
        com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "stopRecord " + bo.az(this.fbF), new Object[0]);
        paramb = this.fbB;
        if (paramb != null)
          paramb.cancel();
        paramb = this.fbB;
        if (paramb != null)
          paramb.clear();
        Wt();
        if (this.fbA.Wq() == null)
        {
          AppMethodBeat.o(13234);
        }
        else
        {
          Wu();
          AppMethodBeat.o(13234);
        }
      }
      else
      {
        com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "stopRecord start", new Object[0]);
        com.tencent.mm.media.i.a locala = new com.tencent.mm.media.i.a("stopRecord");
        com.tencent.mm.media.widget.b.b localb = this.fbB;
        if (localb != null)
          localb.v((Runnable)new a.e(this, locala, paramb));
        AppMethodBeat.o(13234);
        bool = true;
      }
    }
  }

  public final void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(13235);
    if (this.currentState == 0)
      this.fbA.b(paramFloat1, paramFloat2, paramInt1, paramInt2);
    AppMethodBeat.o(13235);
  }

  public final void km(int paramInt)
  {
    AppMethodBeat.i(13237);
    if (this.currentState == 0)
      this.fbA.kj(paramInt);
    AppMethodBeat.o(13237);
  }

  public final void stopPreview()
  {
    AppMethodBeat.i(13244);
    if (this.currentState == 1)
      AppMethodBeat.o(13244);
    while (true)
    {
      return;
      this.currentState = 1;
      com.tencent.luggage.g.d.c("MicroMsg.CameraPreviewContainer", "stopPreview", new Object[0]);
      try
      {
        this.fbA.release();
        this.fbA.b(this.fbK.getCameraPreviewView().getFrameDataCallback());
        this.fbK.getCameraPreviewView().WA();
        this.fbJ.a(false, null);
        AppMethodBeat.o(13244);
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.CameraPreviewContainer", (Throwable)localException, "camera relase error:" + localException.getMessage(), new Object[0]);
      }
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "", "invoke"})
  static final class b extends k
    implements a.f.a.b<Integer, y>
  {
    b(a parama)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.a
 * JD-Core Version:    0.6.2
 */