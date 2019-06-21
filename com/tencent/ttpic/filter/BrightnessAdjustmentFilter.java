package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.a;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.FileUtils;
import com.tencent.ttpic.util.VideoGlobalContext;

public class BrightnessAdjustmentFilter extends BaseFilter
{
  private static final String FRAGMENT_SHADER;
  private int counter;
  private int[] lastCurve;
  private boolean lastStable;

  static
  {
    AppMethodBeat.i(82067);
    FRAGMENT_SHADER = FileUtils.loadAssetsString(VideoGlobalContext.getContext(), "camera/camera_video/shader/BrightnessAdjustmentFilter.dat");
    AppMethodBeat.o(82067);
  }

  public BrightnessAdjustmentFilter()
  {
    super(FRAGMENT_SHADER);
    AppMethodBeat.i(82063);
    this.lastCurve = new int[256];
    this.lastStable = true;
    this.counter = 5;
    AppMethodBeat.o(82063);
  }

  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(82064);
    float[] arrayOfFloat = new float[''];
    arrayOfFloat[''] = 1.0F;
    arrayOfFloat[''] = 1.0F;
    for (int i = 0; i < 256; i++)
    {
      this.lastCurve[i] = i;
      if (i % 2 == 0)
        arrayOfFloat[(i / 2)] = (i / 255.0F);
    }
    addParam(new m.a("curve", arrayOfFloat));
    addParam(new m.f("alpha", 1.0F));
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(82064);
  }

  public void setBlendAlpha(float paramFloat)
  {
    AppMethodBeat.i(82066);
    addParam(new m.f("alpha", paramFloat));
    AppMethodBeat.o(82066);
  }

  public void updateCurve(int[] paramArrayOfInt, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    AppMethodBeat.i(82065);
    float[] arrayOfFloat = new float[''];
    arrayOfFloat[''] = 1.0F;
    arrayOfFloat[''] = 1.0F;
    if (paramBoolean)
    {
      this.lastStable = true;
      while (k < 256)
      {
        this.lastCurve[k] = paramArrayOfInt[k];
        if (k % 2 == 0)
          arrayOfFloat[(k / 2)] = (paramArrayOfInt[k] / 255.0F);
        k++;
      }
      addParam(new m.a("curve", arrayOfFloat));
      AppMethodBeat.o(82065);
    }
    while (true)
    {
      return;
      if (paramArrayOfInt[''] == this.lastCurve['']);
      for (paramBoolean = true; ; paramBoolean = false)
      {
        if ((this.lastStable) && (!paramBoolean))
          this.counter = 5;
        this.lastStable = paramBoolean;
        k = j;
        if (paramBoolean)
          break label291;
        this.counter = Math.max(1, this.counter - 1);
        int[] arrayOfInt = new int[256];
        for (k = i; k < 256; k++)
        {
          arrayOfInt[k] = ((paramArrayOfInt[k] - this.lastCurve[k]) / this.counter + this.lastCurve[k]);
          this.lastCurve[k] = arrayOfInt[k];
          if (k % 2 == 0)
            arrayOfFloat[(k / 2)] = (arrayOfInt[k] / 255.0F);
        }
      }
      addParam(new m.a("curve", arrayOfFloat));
      AppMethodBeat.o(82065);
      continue;
      label291: 
      while (k < 256)
      {
        if (k % 2 == 0)
          arrayOfFloat[(k / 2)] = (paramArrayOfInt[k] / 255.0F);
        k++;
      }
      addParam(new m.a("curve", arrayOfFloat));
      AppMethodBeat.o(82065);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.BrightnessAdjustmentFilter
 * JD-Core Version:    0.6.2
 */