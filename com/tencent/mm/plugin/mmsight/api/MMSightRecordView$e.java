package com.tencent.mm.plugin.mmsight.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.ViewGroup;
import java.nio.ByteBuffer;

public abstract class MMSightRecordView$e
{
  public abstract boolean EL();

  public abstract void a(MMSightRecordView.g paramg, boolean paramBoolean);

  public abstract void a(MMSightRecordView.h paramh);

  public abstract void a(ByteBuffer paramByteBuffer, MMSightRecordView.f paramf);

  public abstract void aso();

  public abstract void ast();

  public abstract void asu();

  public abstract void b(Context paramContext, ViewGroup paramViewGroup);

  public abstract int getCameraRotation();

  public abstract Bitmap getCurrentFramePicture();

  public abstract Point getDrawSizePoint();

  public abstract int getFlashMode();

  public abstract Point getPictureSize();

  public abstract Point getPreviewSize();

  public abstract String getVideoFilePath();

  public abstract Point getVideoSize();

  public abstract void release();

  public abstract void setClipPictureSize(boolean paramBoolean);

  public abstract void setClipVideoSize(boolean paramBoolean);

  public abstract void setDisplayRatio(float paramFloat);

  public abstract void setEnableDragZoom(boolean paramBoolean);

  public abstract void setEnableTouchFocus(boolean paramBoolean);

  public abstract void setFlashMode(int paramInt);

  public abstract void setFrameDataCallback(MMSightRecordView.a parama);

  public abstract void setInitDoneCallback(MMSightRecordView.c paramc);

  public abstract void setInitErrorCallback(MMSightRecordView.d paramd);

  public abstract void setPreviewSizeLimit(int paramInt);

  public abstract void setRGBSizeLimit(int paramInt);

  public abstract void setUseBackCamera(boolean paramBoolean);

  public abstract void setVideoFilePath(String paramString);

  public abstract void setVideoPara$2e715812(int paramInt);

  public abstract void startPreview();

  public abstract void switchCamera();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.api.MMSightRecordView.e
 * JD-Core Version:    0.6.2
 */