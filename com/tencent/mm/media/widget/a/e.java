package com.tencent.mm.media.widget.a;

import a.l;
import android.content.Context;
import android.graphics.SurfaceTexture;
import com.tencent.mm.plugin.mmsight.model.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/ICommonCamera;", "", "addFrameDataCallback", "", "callback", "Lcom/tencent/mm/plugin/mmsight/model/MMSightCameraFrameDataCallback;", "calcScrollZoomStep", "recordButtonTopLocation", "", "stepInterval", "generateCameraConfig", "Lcom/tencent/mm/media/widget/camera/CameraConfig;", "initCamera", "", "context", "Landroid/content/Context;", "useBack", "isCameraPreviewing", "postFocusOnTouch", "x", "", "y", "surfaceWidth", "surfaceHeight", "delay", "", "release", "removeFocusOnTouch", "removeFrameDataCallback", "startPreview", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "useCpuCrop", "resolutionLimit", "surface", "Landroid/view/SurfaceHolder;", "switchCamera", "triggerCameraZoom", "zoom", "isScrollZoom", "factor", "Companion", "plugin-mediaeditor_release"})
public abstract interface e
{
  public static final e.a fbp = e.a.fbq;

  public abstract boolean Wg();

  public abstract boolean Wh();

  public abstract void Wp();

  public abstract b Wq();

  public abstract void a(SurfaceTexture paramSurfaceTexture, boolean paramBoolean, int paramInt);

  public abstract void a(f paramf);

  public abstract void a(boolean paramBoolean1, boolean paramBoolean2, int paramInt);

  public abstract void b(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2);

  public abstract void b(f paramf);

  public abstract void kj(int paramInt);

  public abstract boolean o(Context paramContext, boolean paramBoolean);

  public abstract void release();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.e
 * JD-Core Version:    0.6.2
 */