package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class l extends BaseFilter
{
  float bMC = 0.001F;
  float bMD = 0.999F;

  public l()
  {
    super(GLSLRender.bKh);
  }

  public l(float paramFloat1, float paramFloat2)
  {
    super(GLSLRender.bKh);
    this.bMC = paramFloat1;
    this.bMD = paramFloat2;
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86380);
    addParam(new m.f("l_threshold", 0.1F));
    addParam(new m.f("h_threshold", 0.1F));
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86380);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86381);
    QImage localQImage = g.aL(paramInt1, paramInt2, paramInt3);
    int[] arrayOfInt = localQImage.nativeGetArrayHistogram();
    localQImage.Dispose();
    paramInt2 = 0;
    for (paramInt1 = 0; paramInt1 < 256; paramInt1++)
      paramInt2 += arrayOfInt[paramInt1];
    float f1 = this.bMC;
    float f2 = this.bMD;
    paramInt3 = (int)(f1 * paramInt2);
    int i = (int)(paramInt2 * f2);
    paramInt2 = 0;
    paramInt1 = 0;
    if (paramInt1 < 256)
    {
      paramInt2 += arrayOfInt[paramInt1];
      if (paramInt2 >= paramInt3)
      {
        int j = paramInt1 + 1;
        paramInt3 = paramInt1;
        paramInt1 = j;
      }
    }
    while (true)
    {
      label109: if (paramInt1 < 256)
      {
        paramInt2 = arrayOfInt[paramInt1] + paramInt2;
        if (paramInt2 < i);
      }
      while (true)
      {
        addParam(new m.f("l_threshold", (float)(paramInt3 / 255.0D)));
        addParam(new m.f("h_threshold", (float)(paramInt1 / 255.0D)));
        AppMethodBeat.o(86381);
        return;
        paramInt1++;
        break;
        paramInt1++;
        break label109;
        paramInt1 = 0;
      }
      paramInt3 = 0;
    }
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86382);
    boolean bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(86382);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.l
 * JD-Core Version:    0.6.2
 */