package com.microrapid.lensFlare;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.h;
import com.tencent.filter.m.f;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.util.i;

public class LensFlareHandle
{
  final long bCj;
  private boolean bCk;
  int bCl;
  int bCm;
  boolean hasInit;
  private float strength;

  public LensFlareHandle()
  {
    AppMethodBeat.i(86251);
    this.bCk = false;
    this.hasInit = false;
    this.bCl = 0;
    this.strength = 0.5F;
    this.bCm = 2;
    this.bCj = nativeLensFlare();
    this.bCk = true;
    AppMethodBeat.o(86251);
  }

  static void bn(String paramString)
  {
    AppMethodBeat.i(86254);
    i.j("test", paramString);
    AppMethodBeat.o(86254);
  }

  private native void nativeDispose(long paramLong);

  private native void nativeInitLightSource(long paramLong, QImage paramQImage);

  private native long nativeLensFlare();

  private native void nativeQImageCopy(QImage paramQImage1, QImage paramQImage2);

  private native void nativeUpdateStrength(long paramLong, float paramFloat);

  private static float p(float paramFloat)
  {
    float f;
    if (paramFloat < 0.1F)
      f = 0.1F;
    while (true)
    {
      return f;
      f = paramFloat;
      if (paramFloat > 1.0F)
        f = 1.0F;
    }
  }

  final void a(QImage paramQImage)
  {
    AppMethodBeat.i(86256);
    nativeInitLightSource(this.bCj, paramQImage);
    AppMethodBeat.o(86256);
  }

  final void a(QImage paramQImage, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86255);
    float f = p(this.strength * 0.8F);
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bMx, GLSLRender.bLx);
    localBaseFilter.addParam(new m.i("uSamples", 32));
    localBaseFilter.addParam(new m.f("uDispersal", 0.3F));
    localBaseFilter.addParam(new m.f("uHaloWidth", f));
    localBaseFilter.addParam(new m.f("uDistortion", 2.0F));
    localBaseFilter.addParam(new m.f("px", paramFloat1));
    localBaseFilter.addParam(new m.f("py", paramFloat2));
    localBaseFilter.ApplyGLSLFilter(false, paramQImage.getWidth(), paramQImage.getHeight());
    h localh = new h();
    localBaseFilter.RendProcessImage(paramQImage, localh);
    localBaseFilter.ClearGLSL();
    localh.clear();
    AppMethodBeat.o(86255);
  }

  public final void dispose()
  {
    AppMethodBeat.i(86252);
    if (this.bCk)
    {
      nativeDispose(this.bCj);
      this.hasInit = false;
      this.bCk = false;
    }
    AppMethodBeat.o(86252);
  }

  protected void finalize()
  {
    AppMethodBeat.i(86250);
    dispose();
    super.finalize();
    AppMethodBeat.o(86250);
  }

  native int nativeAttachLightSourceCrossGPUOne(long paramLong, QImage paramQImage, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, float[] paramArrayOfFloat3, float[] paramArrayOfFloat4, float[] paramArrayOfFloat5, float[] paramArrayOfFloat6, float[] paramArrayOfFloat7, float[] paramArrayOfFloat8, float[] paramArrayOfFloat9, float[] paramArrayOfFloat10, float[] paramArrayOfFloat11);

  native void nativeBlurImage(long paramLong, QImage paramQImage);

  native QImage nativeGetPatternImage(long paramLong);

  native void nativeGrayProcess(Bitmap paramBitmap);

  native boolean nativeIsLightSourceExisted(long paramLong, QImage paramQImage);

  native void nativeLightSourceCrossImgSingle(long paramLong, QImage paramQImage);

  native boolean nativeLightSourceCrossImgTotalCPU(long paramLong, QImage paramQImage);

  native QImage nativePostProcessForBg(long paramLong, QImage paramQImage);

  native QImage nativePreProcessLensImgNoLightSource(long paramLong, QImage paramQImage, float[] paramArrayOfFloat);

  native QImage nativePreProcessLensImgWithLightSource(long paramLong, QImage paramQImage, float[] paramArrayOfFloat);

  native void nativeRefineLabelmapEx(long paramLong);

  native void nativeUpdateCrossNumStrength(long paramLong, float paramFloat);

  native void nativeUpdateCrossSizeStrength(long paramLong, float paramFloat);

  native void nativeUpdateOpType(long paramLong, int paramInt);

  native void nativeUpdatePatternImage(long paramLong, QImage paramQImage);

  final void vT()
  {
    AppMethodBeat.i(86253);
    if (!this.bCk)
    {
      RuntimeException localRuntimeException = new RuntimeException("use bad addr");
      AppMethodBeat.o(86253);
      throw localRuntimeException;
    }
    AppMethodBeat.o(86253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.microrapid.lensFlare.LensFlareHandle
 * JD-Core Version:    0.6.2
 */