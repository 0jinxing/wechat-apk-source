package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cg extends BaseFilter
{
  int bJv = 0;

  public cg()
  {
    super(GLSLRender.bJB);
  }

  public cg(byte paramByte)
  {
    super(GLSLRender.bJB);
    this.bJv = 1;
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86540);
    this.glsl_programID = GLSLRender.bJB;
    BaseFilter localBaseFilter1;
    BaseFilter localBaseFilter2;
    if (this.bJv == 0)
    {
      localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
      localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/shishang_sh_curve.png", 33986));
      setNextFilter(localBaseFilter1, null);
      localBaseFilter2 = new BaseFilter(GLSLRender.bKK);
      localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/shishang_sh_blend.jpg", 33986));
      localBaseFilter1.setNextFilter(localBaseFilter2, null);
    }
    while (true)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86540);
      return;
      localBaseFilter1 = new BaseFilter(GLSLRender.bKL);
      localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/fugu_sh_blend.jpg", 33986));
      setNextFilter(localBaseFilter1, null);
      localBaseFilter2 = new BaseFilter(GLSLRender.bJE);
      localBaseFilter2.addParam(new m.f("filterAdjustParam", 0.3F));
      localBaseFilter1.setNextFilter(localBaseFilter2, new int[] { this.srcTextureIndex });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.cg
 * JD-Core Version:    0.6.2
 */