package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends BaseFilter
{
  public f()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86439);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bJO);
    localBaseFilter1.addParam(new m.f("contrast", 1.0F));
    localBaseFilter1.addParam(new m.f("saturation", 0.0F));
    localBaseFilter1.addParam(new m.f("brightness", 1.0F));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKF);
    localBaseFilter2.addParam(new m.g("color2", new float[] { 0.0627451F, 0.07058824F, 0.09019608F, 1.0F }));
    localBaseFilter2.addParam(new m.f("transparency", 1.0F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bKI);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.9098039F, 0.8705882F, 0.8588235F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 0.55F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86439);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.f
 * JD-Core Version:    0.6.2
 */