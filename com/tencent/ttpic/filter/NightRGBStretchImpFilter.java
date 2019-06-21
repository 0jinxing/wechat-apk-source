package com.tencent.ttpic.filter;

import android.opengl.GLES20;
import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;
import com.tencent.view.g;

public class NightRGBStretchImpFilter extends BaseFilter
{
  private static final String TAG;
  private int[] mHistogram;
  private float param;
  private int paramTEXTRUEID;
  private float recordParam;

  static
  {
    AppMethodBeat.i(82684);
    TAG = NightRGBStretchImpFilter.class.getSimpleName();
    AppMethodBeat.o(82684);
  }

  public NightRGBStretchImpFilter()
  {
    super(GLSLRender.bLl);
    AppMethodBeat.i(82678);
    this.paramTEXTRUEID = 0;
    this.recordParam = 0.5F;
    initParams();
    AppMethodBeat.o(82678);
  }

  private void initParams()
  {
    AppMethodBeat.i(82679);
    this.param = 0.0F;
    addParam(new m.f("param", 0.5F));
    addParam(new m.f("scale", 2.0F));
    AppMethodBeat.o(82679);
  }

  public void ApplyGLSLFilter()
  {
    AppMethodBeat.i(82680);
    this.paramTEXTRUEID = g.dSO();
    super.ApplyGLSLFilter();
    AppMethodBeat.o(82680);
  }

  public void ClearGLSL()
  {
    AppMethodBeat.i(82683);
    g.Sk(this.paramTEXTRUEID);
    super.ClearGLSL();
    AppMethodBeat.o(82683);
  }

  public void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    AppMethodBeat.i(82681);
    if ((this.mHistogram == null) || (this.mHistogram.length < 256))
      AppMethodBeat.o(82681);
    float f1;
    float f2;
    while (true)
    {
      return;
      if (this.param > 0.5D)
      {
        f1 = this.param;
        f2 = f1;
        if (f1 > 0.6D)
          f2 = 0.6F;
        if (f2 > this.recordParam)
        {
          addParam(new m.f("param", f2));
          LogUtils.e(TAG, "night filter param = ".concat(String.valueOf(f2)));
          this.recordParam = f2;
        }
      }
      paramInt3 = 0;
      paramInt1 = 0;
      paramInt2 = 0;
      while (paramInt3 < 256)
      {
        paramInt1 += this.mHistogram[paramInt3];
        paramInt2 += this.mHistogram[paramInt3] * paramInt3;
        paramInt3++;
      }
      if (paramInt1 != 0)
        break;
      AppMethodBeat.o(82681);
    }
    int j = paramInt2 / paramInt1;
    int k = (int)(paramInt1 * 0.001F);
    int m = (int)(paramInt1 * 0.99F);
    paramInt3 = 0;
    paramInt2 = 0;
    if (paramInt2 < 256)
    {
      paramInt3 += this.mHistogram[paramInt2];
      if (paramInt3 <= k);
    }
    for (paramInt1 = paramInt2; ; paramInt1 = 0)
    {
      paramInt2++;
      label219: if (paramInt2 < 256)
      {
        paramInt3 += this.mHistogram[paramInt2];
        if (paramInt3 <= m);
      }
      while (true)
      {
        f2 = (j - paramInt1) / (paramInt2 - paramInt1);
        f1 = (float)(Math.log(0.5D) / Math.log(f2));
        if (f1 < 0.1D);
        for (f2 = 0.1F; ; f2 = f1)
        {
          if (f1 > 10.0D)
            f2 = 10.0F;
          float[] arrayOfFloat = new float[256];
          paramInt3 = 0;
          while (true)
            if (paramInt3 < paramInt1)
            {
              arrayOfFloat[paramInt3] = 0.0F;
              paramInt3++;
              continue;
              paramInt2++;
              break;
              paramInt2++;
              break label219;
            }
          for (j = paramInt1; ; j++)
          {
            paramInt3 = paramInt2;
            if (j >= paramInt2)
              break;
            arrayOfFloat[j] = ((float)Math.pow((j - paramInt1) / (paramInt2 - paramInt1), f2));
          }
          while (paramInt3 < 256)
          {
            arrayOfFloat[paramInt3] = 1.0F;
            paramInt3++;
          }
          int[] arrayOfInt = new int[256];
          for (paramInt1 = i; paramInt1 < 256; paramInt1++)
            arrayOfInt[paramInt1] = ((int)(arrayOfFloat[paramInt1] * 255.0F));
          GLES20.glActiveTexture(33984);
          GLSLRender.nativeTextCure(arrayOfInt, this.paramTEXTRUEID);
          AppMethodBeat.o(82681);
          break;
        }
        paramInt2 = 255;
      }
    }
  }

  public boolean needRender()
  {
    if (this.param > 0.5D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(82682);
    setTextureParam(this.paramTEXTRUEID, 1);
    boolean bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(82682);
    return bool;
  }

  public void reset()
  {
    this.recordParam = 0.5F;
  }

  public void setHistogram(int[] paramArrayOfInt)
  {
    this.mHistogram = paramArrayOfInt;
    this.param = 0.0F;
    if (this.mHistogram == null)
      return;
    int i = 0;
    int j = 0;
    int k = 0;
    label25: if (i < this.mHistogram.length)
    {
      k += this.mHistogram[i];
      if (i >= 80)
        break label86;
      j = this.mHistogram[i] + j;
    }
    label86: 
    while (true)
    {
      i++;
      break label25;
      if (k == 0)
        break;
      this.param = (j * 1.0F / k);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.NightRGBStretchImpFilter
 * JD-Core Version:    0.6.2
 */