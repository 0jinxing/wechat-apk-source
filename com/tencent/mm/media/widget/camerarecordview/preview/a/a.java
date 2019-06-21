package com.tencent.mm.media.widget.camerarecordview.preview.a;

import a.f.b.j;
import a.l;
import a.y;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import com.tencent.mm.media.widget.camerarecordview.preview.c;
import com.tencent.mm.plugin.mmsight.model.f;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/preview/controller/AbsPreviewController;", "", "view", "Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "(Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;)V", "eglContext", "Landroid/opengl/EGLContext;", "frameDrawCallback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "texture", "", "renderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "getRenderer", "()Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "setRenderer", "(Lcom/tencent/mm/media/render/AbsSurfaceRenderer;)V", "getView", "()Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "setView", "clearFrame", "drawFrame", "data", "", "getEGLContext", "getFrameDataCallback", "Lcom/tencent/mm/plugin/mmsight/model/MMSightCameraFrameDataCallback;", "getSurfaceTexture", "Landroid/graphics/SurfaceTexture;", "getTextureId", "initRender", "createSurfaceTexture", "", "frameRotate", "afterInitRender", "Lkotlin/Function0;", "onDrawFrame", "gl", "Ljavax/microedition/khronos/opengles/GL10;", "onSurfaceChanged", "width", "height", "onSurfaceCreated", "config", "Ljavax/microedition/khronos/egl/EGLConfig;", "release", "setOnDrawListener", "frameAvailableListener", "setRender", "updateCameraConfig", "cameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "plugin-mediaeditor_release"})
public abstract class a
{
  public com.tencent.mm.media.h.a eXm;
  public EGLContext fag;
  public a.f.a.b<? super Integer, y> fct;
  public c fcu;

  public a(c paramc)
  {
    this.fcu = paramc;
  }

  public final void WB()
  {
    com.tencent.mm.media.h.a locala = this.eXm;
    if (locala != null)
      locala.eYO = true;
  }

  public void a(com.tencent.mm.media.h.a parama)
  {
    j.p(parama, "renderer");
    this.eXm = parama;
    com.tencent.mm.media.h.a locala = this.eXm;
    if (locala != null)
      locala.eYU = ((a.f.a.a)new a.c(this, parama));
  }

  public final void a(com.tencent.mm.media.widget.a.b paramb)
  {
    j.p(paramb, "cameraConfig");
    ab.c("MicroMsg.CameraPreviewGLSurfaceView", "updateCameraConfig: ".concat(String.valueOf(paramb)), new Object[0]);
    paramb = com.tencent.mm.media.widget.a.b.Wm();
    com.tencent.mm.media.h.a locala = this.eXm;
    if (locala != null)
      locala.ch(paramb.x, paramb.y);
    paramb = this.eXm;
    if (paramb != null)
      paramb.ka(com.tencent.mm.media.widget.a.b.Wi());
    paramb = this.eXm;
    if (paramb != null)
      paramb.ct(com.tencent.mm.media.widget.a.b.Wl());
  }

  public f getFrameDataCallback()
  {
    return null;
  }

  public final SurfaceTexture getSurfaceTexture()
  {
    Object localObject = this.eXm;
    if (localObject != null);
    for (localObject = ((com.tencent.mm.media.h.a)localObject).bsb; ; localObject = null)
      return localObject;
  }

  public final void release()
  {
    this.fcu.c((a.f.a.a)new a.b(this));
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.preview.a.a
 * JD-Core Version:    0.6.2
 */