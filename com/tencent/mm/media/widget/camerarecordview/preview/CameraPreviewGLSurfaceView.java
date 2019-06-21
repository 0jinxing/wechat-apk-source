package com.tencent.mm.media.widget.camerarecordview.preview;

import a.f.b.j;
import a.l;
import a.y;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.GLSurfaceView;
import android.opengl.GLSurfaceView.EGLConfigChooser;
import android.opengl.GLSurfaceView.EGLContextFactory;
import android.opengl.GLSurfaceView.Renderer;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.widget.camerarecordview.preview.a.a.a;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/preview/CameraPreviewGLSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "canPreview", "", "frameRotate", "", "previewCallback", "Lkotlin/Function1;", "Landroid/graphics/SurfaceTexture;", "", "previewController", "Lcom/tencent/mm/media/widget/camerarecordview/preview/controller/AbsPreviewController;", "clearFrame", "getEGLContext", "Landroid/opengl/EGLContext;", "getFrameDataCallback", "Lcom/tencent/mm/plugin/mmsight/model/MMSightCameraFrameDataCallback;", "getPreviewTextureId", "queueEvent", "r", "Lkotlin/Function0;", "release", "setOnDrawListener", "frameAvailableListener", "Lkotlin/ParameterName;", "name", "texture", "setPreviewRenderer", "renderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "cpuCrop", "tryCameraPreview", "callback", "tryStopCameraPreview", "updateCameraConfig", "cameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "Companion", "plugin-mediaeditor_release"})
public final class CameraPreviewGLSurfaceView extends GLSurfaceView
  implements c
{
  public static final CameraPreviewGLSurfaceView.a fch;
  private a.f.a.b<? super SurfaceTexture, y> fcd;
  private com.tencent.mm.media.widget.camerarecordview.preview.a.a fce;
  private int fcf;
  private boolean fcg;

  static
  {
    AppMethodBeat.i(13282);
    fch = new CameraPreviewGLSurfaceView.a((byte)0);
    AppMethodBeat.o(13282);
  }

  public CameraPreviewGLSurfaceView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(13281);
    getHolder().addCallback((SurfaceHolder.Callback)this);
    try
    {
      getHolder().setType(2);
      setEGLContextFactory((GLSurfaceView.EGLContextFactory)new com.tencent.mm.media.h.a.b());
      setEGLContextClientVersion(2);
      setEGLConfigChooser((GLSurfaceView.EGLConfigChooser)new com.tencent.mm.media.h.a.a());
      setPreserveEGLContextOnPause(false);
      setRenderer((GLSurfaceView.Renderer)new GLSurfaceView.Renderer()
      {
        public final void onDrawFrame(GL10 paramAnonymousGL10)
        {
          AppMethodBeat.i(13268);
          Object localObject = CameraPreviewGLSurfaceView.a(this.fci);
          if (localObject != null)
          {
            localObject = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject).eXm;
            if (localObject != null)
            {
              ((com.tencent.mm.media.h.a)localObject).onDrawFrame(paramAnonymousGL10);
              AppMethodBeat.o(13268);
            }
          }
          while (true)
          {
            return;
            AppMethodBeat.o(13268);
            continue;
            AppMethodBeat.o(13268);
          }
        }

        public final void onSurfaceChanged(GL10 paramAnonymousGL10, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          AppMethodBeat.i(13269);
          ab.c("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceChanged width:" + paramAnonymousInt1 + " height:" + paramAnonymousInt2, new Object[0]);
          com.tencent.mm.media.widget.camerarecordview.preview.a.a locala = CameraPreviewGLSurfaceView.a(this.fci);
          if (locala != null)
          {
            int i = CameraPreviewGLSurfaceView.b(this.fci);
            paramAnonymousGL10 = (a.f.a.a)new CameraPreviewGLSurfaceView.1.a(this, paramAnonymousGL10, paramAnonymousInt1, paramAnonymousInt2);
            locala.fcu.c((a.f.a.a)new a.a(locala, paramAnonymousGL10, i));
            AppMethodBeat.o(13269);
          }
          while (true)
          {
            return;
            AppMethodBeat.o(13269);
          }
        }

        public final void onSurfaceCreated(GL10 paramAnonymousGL10, EGLConfig paramAnonymousEGLConfig)
        {
          AppMethodBeat.i(13270);
          ab.c("MicroMsg.CameraPreviewGLSurfaceView", "onSurfaceCreated", new Object[0]);
          Object localObject = CameraPreviewGLSurfaceView.a(this.fci);
          if (localObject != null)
          {
            localObject = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject).eXm;
            if (localObject != null)
            {
              ((com.tencent.mm.media.h.a)localObject).onSurfaceCreated(paramAnonymousGL10, paramAnonymousEGLConfig);
              AppMethodBeat.o(13270);
            }
          }
          while (true)
          {
            return;
            AppMethodBeat.o(13270);
            continue;
            AppMethodBeat.o(13270);
          }
        }
      });
      setRenderMode(0);
      ab.c("MicroMsg.CameraPreviewGLSurfaceView", "init create CameraPreviewGLSurfaceView", new Object[0]);
      AppMethodBeat.o(13281);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
        try
        {
          getHolder().setType(1);
        }
        catch (Exception paramContext)
        {
          try
          {
            getHolder().setType(0);
          }
          catch (Exception paramContext)
          {
          }
        }
    }
  }

  public final void WA()
  {
    AppMethodBeat.i(13275);
    ab.c("MicroMsg.CameraPreviewGLSurfaceView", "tryStopCameraPreview", new Object[0]);
    this.fcg = false;
    this.fcd = null;
    AppMethodBeat.o(13275);
  }

  public final void WB()
  {
    AppMethodBeat.i(13278);
    com.tencent.mm.media.widget.camerarecordview.preview.a.a locala = this.fce;
    if (locala != null)
    {
      locala.WB();
      AppMethodBeat.o(13278);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(13278);
    }
  }

  public final void a(com.tencent.mm.media.h.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(13272);
    j.p(parama, "renderer");
    ab.c("MicroMsg.CameraPreviewGLSurfaceView", "setPreviewRenderer cpuCrop:".concat(String.valueOf(paramBoolean)), new Object[0]);
    com.tencent.mm.media.widget.camerarecordview.preview.a.a locala = this.fce;
    if (locala != null)
      locala.release();
    if (paramBoolean)
    {
      locala = (com.tencent.mm.media.widget.camerarecordview.preview.a.a)new com.tencent.mm.media.widget.camerarecordview.preview.a.b((c)this);
      this.fce = locala;
      locala = this.fce;
      if (locala == null)
        break label106;
      locala.a(parama);
      AppMethodBeat.o(13272);
    }
    while (true)
    {
      return;
      locala = (com.tencent.mm.media.widget.camerarecordview.preview.a.a)new com.tencent.mm.media.widget.camerarecordview.preview.a.c((c)this);
      break;
      label106: AppMethodBeat.o(13272);
    }
  }

  public final void a(com.tencent.mm.media.widget.a.b paramb)
  {
    AppMethodBeat.i(13273);
    j.p(paramb, "cameraConfig");
    ab.c("MicroMsg.CameraPreviewGLSurfaceView", "updateCameraConfig:".concat(String.valueOf(paramb)), new Object[0]);
    com.tencent.mm.media.widget.camerarecordview.preview.a.a locala = this.fce;
    if (locala != null)
    {
      locala.a(paramb);
      AppMethodBeat.o(13273);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(13273);
    }
  }

  public final void b(a.f.a.b<? super SurfaceTexture, y> paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(13274);
    ab.c("MicroMsg.CameraPreviewGLSurfaceView", "tryCameraPreview  canPreview:" + this.fcg, new Object[0]);
    Object localObject3;
    if (this.fcg)
    {
      Object localObject2 = new StringBuilder("callback.invoke  ");
      localObject3 = this.fce;
      if (localObject3 != null)
      {
        localObject3 = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject3).getSurfaceTexture();
        ab.c("MicroMsg.CameraPreviewGLSurfaceView", localObject3, new Object[0]);
        localObject2 = this.fce;
        localObject3 = localObject1;
        if (localObject2 != null)
          localObject3 = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject2).getSurfaceTexture();
        paramb.am(localObject3);
        AppMethodBeat.o(13274);
      }
    }
    while (true)
    {
      return;
      localObject3 = null;
      break;
      this.fcd = paramb;
      AppMethodBeat.o(13274);
    }
  }

  public final void c(a.f.a.a<y> parama)
  {
    AppMethodBeat.i(13280);
    j.p(parama, "r");
    queueEvent((Runnable)new a(parama));
    AppMethodBeat.o(13280);
  }

  public final EGLContext getEGLContext()
  {
    Object localObject = this.fce;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject).fag; ; localObject = null)
      return localObject;
  }

  public final f getFrameDataCallback()
  {
    AppMethodBeat.i(13279);
    Object localObject = this.fce;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject).getFrameDataCallback();
      AppMethodBeat.o(13279);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(13279);
    }
  }

  public final int getPreviewTextureId()
  {
    int i = -1;
    Object localObject = this.fce;
    int j = i;
    if (localObject != null)
    {
      localObject = ((com.tencent.mm.media.widget.camerarecordview.preview.a.a)localObject).eXm;
      j = i;
      if (localObject != null)
        j = ((com.tencent.mm.media.h.a)localObject).eYN;
    }
    return j;
  }

  public final void release()
  {
    AppMethodBeat.i(13277);
    com.tencent.mm.media.widget.camerarecordview.preview.a.a locala = this.fce;
    if (locala != null)
    {
      locala.release();
      AppMethodBeat.o(13277);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(13277);
    }
  }

  public final void setOnDrawListener(a.f.a.b<? super Integer, y> paramb)
  {
    AppMethodBeat.i(13276);
    ab.c("MicroMsg.CameraPreviewGLSurfaceView", "setOnDrawListener", new Object[0]);
    com.tencent.mm.media.widget.camerarecordview.preview.a.a locala = this.fce;
    if (locala != null)
    {
      locala.fct = paramb;
      AppMethodBeat.o(13276);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(13276);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.preview.CameraPreviewGLSurfaceView
 * JD-Core Version:    0.6.2
 */