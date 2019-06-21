package com.tencent.mm.plugin.mmsight.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

public class MMSightRecordView extends FrameLayout
{
  public static MMSightRecordView.b osZ;
  public MMSightRecordView.e osY;

  public MMSightRecordView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(60284);
    init(paramContext);
    AppMethodBeat.o(60284);
  }

  public MMSightRecordView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(60283);
    init(paramContext);
    AppMethodBeat.o(60283);
  }

  public MMSightRecordView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(60282);
    init(paramContext);
    AppMethodBeat.o(60282);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(60285);
    this.osY = osZ.asn();
    this.osY.b(paramContext, this);
    AppMethodBeat.o(60285);
  }

  public final void a(MMSightRecordView.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(60294);
    this.osY.a(paramg, paramBoolean);
    AppMethodBeat.o(60294);
  }

  public final void a(MMSightRecordView.h paramh)
  {
    AppMethodBeat.i(60293);
    this.osY.a(paramh);
    AppMethodBeat.o(60293);
  }

  public final void a(ByteBuffer paramByteBuffer, MMSightRecordView.f paramf)
  {
    AppMethodBeat.i(60310);
    this.osY.a(paramByteBuffer, paramf);
    AppMethodBeat.o(60310);
  }

  public int getCameraRotation()
  {
    AppMethodBeat.i(60301);
    int i = this.osY.getCameraRotation();
    AppMethodBeat.o(60301);
    return i;
  }

  public Bitmap getCurrentFramePicture()
  {
    AppMethodBeat.i(60309);
    Bitmap localBitmap = this.osY.getCurrentFramePicture();
    AppMethodBeat.o(60309);
    return localBitmap;
  }

  public Point getDrawSizePoint()
  {
    AppMethodBeat.i(60299);
    Point localPoint = this.osY.getDrawSizePoint();
    AppMethodBeat.o(60299);
    return localPoint;
  }

  public int getFlashMode()
  {
    AppMethodBeat.i(60305);
    int i = this.osY.getFlashMode();
    AppMethodBeat.o(60305);
    return i;
  }

  public Point getPictureSize()
  {
    AppMethodBeat.i(60296);
    Point localPoint = this.osY.getPictureSize();
    AppMethodBeat.o(60296);
    return localPoint;
  }

  public Point getPreviewSize()
  {
    AppMethodBeat.i(60298);
    Point localPoint = this.osY.getPreviewSize();
    AppMethodBeat.o(60298);
    return localPoint;
  }

  public String getVideoFilePath()
  {
    AppMethodBeat.i(60292);
    String str = this.osY.getVideoFilePath();
    AppMethodBeat.o(60292);
    return str;
  }

  public Point getVideoSize()
  {
    AppMethodBeat.i(60297);
    Point localPoint = this.osY.getVideoSize();
    AppMethodBeat.o(60297);
    return localPoint;
  }

  public void setClipPictureSize(boolean paramBoolean)
  {
    AppMethodBeat.i(60303);
    this.osY.setClipPictureSize(paramBoolean);
    AppMethodBeat.o(60303);
  }

  public void setClipVideoSize(boolean paramBoolean)
  {
    AppMethodBeat.i(60302);
    this.osY.setClipVideoSize(paramBoolean);
    AppMethodBeat.o(60302);
  }

  public void setDisplayRatio(float paramFloat)
  {
    AppMethodBeat.i(60288);
    this.osY.setDisplayRatio(paramFloat);
    AppMethodBeat.o(60288);
  }

  public void setEnableDragZoom(boolean paramBoolean)
  {
    AppMethodBeat.i(60306);
    this.osY.setEnableDragZoom(paramBoolean);
    AppMethodBeat.o(60306);
  }

  public void setEnableTouchFocus(boolean paramBoolean)
  {
    AppMethodBeat.i(60307);
    this.osY.setEnableTouchFocus(paramBoolean);
    AppMethodBeat.o(60307);
  }

  public void setFlashMode(int paramInt)
  {
    AppMethodBeat.i(60304);
    this.osY.setFlashMode(paramInt);
    AppMethodBeat.o(60304);
  }

  public void setFrameDataCallback(MMSightRecordView.a parama)
  {
    AppMethodBeat.i(60300);
    this.osY.setFrameDataCallback(parama);
    AppMethodBeat.o(60300);
  }

  public void setInitDoneCallback(MMSightRecordView.c paramc)
  {
    AppMethodBeat.i(60287);
    this.osY.setInitDoneCallback(paramc);
    AppMethodBeat.o(60287);
  }

  public void setInitErrorCallback(MMSightRecordView.d paramd)
  {
    AppMethodBeat.i(60286);
    this.osY.setInitErrorCallback(paramd);
    AppMethodBeat.o(60286);
  }

  public void setPreviewSizeLimit(int paramInt)
  {
    AppMethodBeat.i(60289);
    this.osY.setPreviewSizeLimit(paramInt);
    AppMethodBeat.o(60289);
  }

  public void setRGBSizeLimit(int paramInt)
  {
    AppMethodBeat.i(60308);
    this.osY.setRGBSizeLimit(paramInt);
    AppMethodBeat.o(60308);
  }

  public void setUseBackCamera(boolean paramBoolean)
  {
    AppMethodBeat.i(60295);
    this.osY.setUseBackCamera(paramBoolean);
    AppMethodBeat.o(60295);
  }

  public void setVideoFilePath(String paramString)
  {
    AppMethodBeat.i(60291);
    this.osY.setVideoFilePath(paramString);
    AppMethodBeat.o(60291);
  }

  public final void setVideoPara$2e715812(int paramInt)
  {
    AppMethodBeat.i(60290);
    this.osY.setVideoPara$2e715812(paramInt);
    AppMethodBeat.o(60290);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.api.MMSightRecordView
 * JD-Core Version:    0.6.2
 */