package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class al extends BaseFilter
{
  float bMC;
  float bMD;

  public al()
  {
    super(GLSLRender.bKO);
    this.bMC = 0.001F;
    this.bMD = 0.999F;
  }

  public al(float paramFloat)
  {
    super(GLSLRender.bKO);
    AppMethodBeat.i(86490);
    this.bMC = 0.001F;
    this.bMD = 0.999F;
    this.bMC = (0.0F + paramFloat * 0.05F);
    this.bMD = (1.0F - paramFloat * 0.05F);
    AppMethodBeat.o(86490);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86491);
    addParam(new m.f("l_threshold_r", 0.1F));
    addParam(new m.f("h_threshold_r", 0.1F));
    addParam(new m.f("l_threshold_g", 0.1F));
    addParam(new m.f("h_threshold_g", 0.1F));
    addParam(new m.f("l_threshold_b", 0.1F));
    addParam(new m.f("h_threshold_b", 0.1F));
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86491);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86492);
    Object localObject = g.aL(paramInt1, paramInt2, paramInt3);
    int[] arrayOfInt1 = ((QImage)localObject).nativeGetArrayHistogramChannels();
    ((QImage)localObject).Dispose();
    localObject = new int[3];
    int[] arrayOfInt2 = new int[3];
    paramInt3 = 0;
    int i;
    int k;
    int m;
    if (paramInt3 < 3)
    {
      i = paramInt3 * 256;
      paramInt1 = 0;
      for (paramInt2 = 0; paramInt2 < 256; paramInt2++)
        paramInt1 += arrayOfInt1[(i + paramInt2)];
      float f1 = this.bMC;
      float f2 = this.bMD;
      int j = (int)(f1 * paramInt1);
      k = (int)(paramInt1 * f2);
      paramInt2 = 0;
      m = 0;
      paramInt1 = 0;
      label111: if (paramInt1 >= 256)
        break label340;
      paramInt2 += arrayOfInt1[(i + paramInt1)];
      if (paramInt2 >= j)
      {
        j = paramInt1 + 1;
        m = paramInt1;
        paramInt1 = j;
      }
    }
    label145: label340: 
    while (true)
    {
      if (paramInt1 < 256)
      {
        paramInt2 = arrayOfInt1[(i + paramInt1)] + paramInt2;
        if (paramInt2 < k);
      }
      while (true)
      {
        localObject[paramInt3] = m;
        arrayOfInt2[paramInt3] = paramInt1;
        paramInt3++;
        break;
        paramInt1++;
        break label111;
        paramInt1++;
        break label145;
        addParam(new m.f("l_threshold_r", localObject[0] / 255.0F));
        addParam(new m.f("h_threshold_r", arrayOfInt2[0] / 255.0F));
        addParam(new m.f("l_threshold_g", localObject[1] / 255.0F));
        addParam(new m.f("h_threshold_g", arrayOfInt2[1] / 255.0F));
        addParam(new m.f("l_threshold_b", localObject[2] / 255.0F));
        addParam(new m.f("h_threshold_b", arrayOfInt2[2] / 255.0F));
        AppMethodBeat.o(86492);
        return;
        paramInt1 = 0;
      }
    }
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86493);
    boolean bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(86493);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.al
 * JD-Core Version:    0.6.2
 */