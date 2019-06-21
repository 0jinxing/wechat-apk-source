package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ai extends BaseFilter
{
  public ai()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86486);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/purpleyellow_nuan_curve.png", 33986));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bMh);
    if (this.needFlipBlend);
    for (int i = 1; ; i = 0)
    {
      localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/gradient_purpleyellow_rgb.png", i, (byte)0));
      localBaseFilter2.addParam(new m.f("ralpha", 0.6F));
      localBaseFilter2.addParam(new m.f("galpha", 0.6F));
      localBaseFilter2.addParam(new m.f("balpha", 0.6F));
      localBaseFilter1.setNextFilter(localBaseFilter2, null);
      localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
      localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/purpleyellow_anticmos_curve.png", 33986));
      localBaseFilter2.setNextFilter(localBaseFilter1, null);
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86486);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.ai
 * JD-Core Version:    0.6.2
 */