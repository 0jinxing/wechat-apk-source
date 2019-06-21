package com.tencent.mm.media.widget.a;

import a.l;
import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/widget/camera/CameraConfig;", "", "()V", "encodeVideoBestSizeHeight", "", "getEncodeVideoBestSizeHeight", "()I", "setEncodeVideoBestSizeHeight", "(I)V", "encodeVideoBestSizeWidth", "getEncodeVideoBestSizeWidth", "setEncodeVideoBestSizeWidth", "isCpuCrop", "", "()Z", "setCpuCrop", "(Z)V", "isFrontCamera", "setFrontCamera", "previewHeight", "getPreviewHeight", "setPreviewHeight", "previewWidth", "getPreviewWidth", "setPreviewWidth", "rotateDegree", "getRotateDegree", "setRotateDegree", "cameraTextureSize", "Landroid/graphics/Point;", "toString", "", "plugin-mediaeditor_release"})
public final class b
{
  private static int aIV;
  private static int aIW;
  private static int eYR;
  private static int faC;
  private static int faD;
  private static boolean faE;
  public static final b faF;
  private static boolean isFrontCamera;

  static
  {
    AppMethodBeat.i(13188);
    faF = new b();
    AppMethodBeat.o(13188);
  }

  public static int Wi()
  {
    return eYR;
  }

  public static int Wj()
  {
    return faC;
  }

  public static int Wk()
  {
    return faD;
  }

  public static boolean Wl()
  {
    return isFrontCamera;
  }

  public static Point Wm()
  {
    AppMethodBeat.i(13187);
    Point localPoint = new Point(aIV, aIW);
    AppMethodBeat.o(13187);
    return localPoint;
  }

  public static void cu(boolean paramBoolean)
  {
    faE = paramBoolean;
  }

  public static int getPreviewHeight()
  {
    return aIW;
  }

  public static int getPreviewWidth()
  {
    return aIV;
  }

  public static void kd(int paramInt)
  {
    aIW = paramInt;
  }

  public static void ke(int paramInt)
  {
    aIV = paramInt;
  }

  public static void kf(int paramInt)
  {
    eYR = paramInt;
  }

  public static void kg(int paramInt)
  {
    faC = paramInt;
  }

  public static void kh(int paramInt)
  {
    faD = paramInt;
  }

  public static void setFrontCamera(boolean paramBoolean)
  {
    isFrontCamera = paramBoolean;
  }

  public final String toString()
  {
    AppMethodBeat.i(13186);
    String str = "previewHeight: " + aIW + " ,previewWidth:" + aIV + " ,rotateDegree: " + eYR + " ,isFrontCamera:" + isFrontCamera + ' ' + " encodeVideoBestSizeWidth : " + faC + " , encodeVideoBestSizeHeight : " + faD + ", isCpuCrop: " + faE + ' ';
    AppMethodBeat.o(13186);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.widget.a.b
 * JD-Core Version:    0.6.2
 */