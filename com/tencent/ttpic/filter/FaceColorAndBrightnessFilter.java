package com.tencent.ttpic.filter;

import android.graphics.Bitmap;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.a;
import com.tencent.filter.m.f;
import com.tencent.filter.m.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.factory.TTPicFilterFactoryLocal;
import com.tencent.ttpic.util.VideoGlobalContext;
import java.io.File;

public class FaceColorAndBrightnessFilter extends BaseFilter
{
  private static final String FOLDER = "assets://realtimeBeauty";
  private static final String FRAGMENT_SHADER;
  private float alpha;
  private float blendAlpha;
  private float colorMinBase;
  private float colorRangeInv;
  private int counter;
  private int[] lastCurve;
  private boolean lastStable;

  static
  {
    AppMethodBeat.i(82330);
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/FaceColorAndBrightnessFragmentShader.dat");
    AppMethodBeat.o(82330);
  }

  public FaceColorAndBrightnessFilter()
  {
    super(FRAGMENT_SHADER);
    AppMethodBeat.i(82322);
    this.alpha = 0.7F;
    this.colorMinBase = 0.0F;
    this.colorRangeInv = 1.0F;
    this.blendAlpha = 1.0F;
    this.lastCurve = new int[256];
    this.lastStable = true;
    this.counter = 5;
    AppMethodBeat.o(82322);
  }

  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(82323);
    Object localObject = new float[''];
    localObject[''] = 255.0F;
    localObject[''] = 255.0F;
    for (int i = 0; i < 256; i++)
    {
      this.lastCurve[i] = i;
      if (i % 2 == 0)
        localObject[(i / 2)] = i;
    }
    addParam(new m.a("curve", (float[])localObject));
    addParam(new m.f("brightnessAlpha", 1.0F));
    Bitmap localBitmap1 = TTPicFilterFactoryLocal.getBitmapFromEncryptedFile("assets://realtimeBeauty" + File.separator + "lookup_table.png");
    localObject = TTPicFilterFactoryLocal.getBitmapFromEncryptedFile("assets://realtimeBeauty" + File.separator + "lookup_table_gray.png");
    Bitmap localBitmap2 = TTPicFilterFactoryLocal.getBitmapFromEncryptedFile("assets://realtimeBeauty" + File.separator + "lookup_table_origin.png");
    addParam(new m.k("inputImageTexture2", (Bitmap)localObject, 33986, true));
    addParam(new m.k("inputImageTexture3", localBitmap1, 33987, true));
    addParam(new m.k("inputImageTexture4", localBitmap2, 33988, true));
    addParam(new m.f("colorRangeInv", this.colorRangeInv));
    addParam(new m.f("colorMinBase", this.colorMinBase));
    addParam(new m.f("alpha", this.alpha));
    addParam(new m.f("blendAlpha", this.blendAlpha));
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(82323);
  }

  public void setAlpha(float paramFloat)
  {
    AppMethodBeat.i(82324);
    this.alpha = paramFloat;
    addParam(new m.f("alpha", paramFloat));
    AppMethodBeat.o(82324);
  }

  public void setBlendAlpha(float paramFloat)
  {
    AppMethodBeat.i(82327);
    this.blendAlpha = paramFloat;
    addParam(new m.f("blendAlpha", paramFloat));
    AppMethodBeat.o(82327);
  }

  public void setBrightnessAlpha(float paramFloat)
  {
    AppMethodBeat.i(82329);
    addParam(new m.f("brightnessAlpha", paramFloat));
    AppMethodBeat.o(82329);
  }

  public void setColorMinBase(float paramFloat)
  {
    AppMethodBeat.i(82325);
    this.colorMinBase = paramFloat;
    addParam(new m.f("colorMinBase", paramFloat));
    AppMethodBeat.o(82325);
  }

  public void setColorRangeInv(float paramFloat)
  {
    AppMethodBeat.i(82326);
    this.colorRangeInv = paramFloat;
    addParam(new m.f("colorRangeInv", paramFloat));
    AppMethodBeat.o(82326);
  }

  public void updateCurve(int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(82328);
    if (paramArrayOfInt == null)
      AppMethodBeat.o(82328);
    while (true)
    {
      return;
      float[] arrayOfFloat = new float[''];
      arrayOfFloat[''] = 255.0F;
      arrayOfFloat[''] = 255.0F;
      if (paramBoolean)
      {
        this.lastStable = true;
        while (k < 256)
        {
          this.lastCurve[k] = paramArrayOfInt[k];
          if (k % 2 == 0)
            arrayOfFloat[(k / 2)] = paramArrayOfInt[k];
          k++;
        }
        addParam(new m.a("curve", arrayOfFloat));
        AppMethodBeat.o(82328);
      }
      else
      {
        if (paramArrayOfInt[''] == this.lastCurve['']);
        for (paramBoolean = true; ; paramBoolean = false)
        {
          if ((this.lastStable) && (!paramBoolean))
            this.counter = 5;
          this.lastStable = paramBoolean;
          k = j;
          if (paramBoolean)
            break label299;
          this.counter = Math.max(1, this.counter - 1);
          int[] arrayOfInt = new int[256];
          for (k = i; k < 256; k++)
          {
            arrayOfInt[k] = ((paramArrayOfInt[k] - this.lastCurve[k]) / this.counter + this.lastCurve[k]);
            this.lastCurve[k] = arrayOfInt[k];
            if (k % 2 == 0)
              arrayOfFloat[(k / 2)] = arrayOfInt[k];
          }
        }
        addParam(new m.a("curve", arrayOfFloat));
        AppMethodBeat.o(82328);
        continue;
        label299: 
        while (k < 256)
        {
          if (k % 2 == 0)
            arrayOfFloat[(k / 2)] = paramArrayOfInt[k];
          k++;
        }
        addParam(new m.a("curve", arrayOfFloat));
        AppMethodBeat.o(82328);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.FaceColorAndBrightnessFilter
 * JD-Core Version:    0.6.2
 */