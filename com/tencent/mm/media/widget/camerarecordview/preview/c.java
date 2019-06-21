package com.tencent.mm.media.widget.camerarecordview.preview;

import a.l;
import a.y;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import com.tencent.mm.plugin.mmsight.model.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camerarecordview/preview/ICameraPreviewView;", "", "clearFrame", "", "getEGLContext", "Landroid/opengl/EGLContext;", "getFrameDataCallback", "Lcom/tencent/mm/plugin/mmsight/model/MMSightCameraFrameDataCallback;", "getPreviewTextureId", "", "queueEvent", "r", "Lkotlin/Function0;", "release", "requestRender", "setOnDrawListener", "frameAvailableListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "texture", "setPreviewRenderer", "renderer", "Lcom/tencent/mm/media/render/AbsSurfaceRenderer;", "cpuCrop", "", "tryCameraPreview", "callback", "Landroid/graphics/SurfaceTexture;", "tryStopCameraPreview", "updateCameraConfig", "cameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "plugin-mediaeditor_release"})
public abstract interface c
{
  public abstract void WA();

  public abstract void WB();

  public abstract void a(com.tencent.mm.media.h.a parama, boolean paramBoolean);

  public abstract void a(com.tencent.mm.media.widget.a.b paramb);

  public abstract void b(a.f.a.b<? super SurfaceTexture, y> paramb);

  public abstract void c(a.f.a.a<y> parama);

  public abstract EGLContext getEGLContext();

  public abstract f getFrameDataCallback();

  public abstract int getPreviewTextureId();

  public abstract void release();

  public abstract void requestRender();

  public abstract void setOnDrawListener(a.f.a.b<? super Integer, y> paramb);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.camerarecordview.preview.c
 * JD-Core Version:    0.6.2
 */