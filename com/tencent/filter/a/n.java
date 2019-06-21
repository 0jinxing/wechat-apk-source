package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class n extends BaseFilter
{
  public n()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86454);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKH);
    localBaseFilter1.addParam(new m.g("channelparam", new float[] { 0.4F, 0.4F, 0.2F }));
    localBaseFilter1.addParam(new m.g("mixparam", new float[] { 1.0F, 1.0F, 1.0F }));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/coffee_curve.png", 33986));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bLN);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.2235294F, 0.1921569F, 0.1607843F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 1.0F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bLN);
    localBaseFilter2.addParam(new m.g("color2", new float[] { 0.4431373F, 0.3921569F, 0.3607843F, 1.0F }));
    localBaseFilter2.addParam(new m.f("transparency", 1.0F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86454);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.n
 * JD-Core Version:    0.6.2
 */