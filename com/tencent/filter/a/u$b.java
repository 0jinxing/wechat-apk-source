package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class u$b extends BaseFilter
{
  int bNT;
  private final String[] bNV;
  private final float[] bNW;
  int quality;

  public u$b(u paramu, int paramInt1, int paramInt2)
  {
    super(GLSLRender.bLu);
    AppMethodBeat.i(86467);
    this.bNV = new String[] { "error.file", "yijian_ziran", "yijian_hongrun", "yijian_baixi", "yijian_tianmei", "yijian_menghuan", "yijian_yangguang", "yijian_rounen" };
    this.bNW = new float[] { 1.0F, 1.0F, 0.95F, 0.9F };
    this.quality = 2;
    this.bNT = 0;
    this.bNT = paramInt1;
    this.quality = paramInt2;
    new StringBuilder("value = ").append(this.bNT);
    AppMethodBeat.o(86467);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86468);
    new StringBuilder("value = ").append(this.bNT);
    String str = "yijian/" + this.bNV[this.bNT] + "_" + this.quality + ".jpg";
    float f1 = this.bNW[this.quality];
    float f2 = f1;
    if (this.bNT == 5)
    {
      if (this.quality == 1)
        f2 = 0.912F;
    }
    else
    {
      f1 = f2;
      if (this.bNT == 4)
      {
        if (this.quality != 3)
          break label272;
        f1 = 1.1F;
      }
    }
    while (true)
    {
      this.glsl_programID = GLSLRender.bLu;
      addParam(new m.o("inputImageTexture2", str, 33986));
      addParam(new m.f("quality", f1));
      addParam(new m.f("add_red", 0.0F));
      addParam(new m.f("red_m", 0.0F));
      addParam(new m.f("green_m", 0.0F));
      addParam(new m.f("blue_m", 0.0F));
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86468);
      return;
      if (this.quality == 2)
      {
        f2 = 0.95F;
        break;
      }
      f2 = f1;
      if (this.quality != 3)
        break;
      f2 = 0.88F;
      break;
      label272: f1 = f2;
      if (this.quality == 2)
        f1 = 1.0F;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.u.b
 * JD-Core Version:    0.6.2
 */