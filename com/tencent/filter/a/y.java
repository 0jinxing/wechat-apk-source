package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class y extends BaseFilter
{
  public y()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86473);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bJO);
    localBaseFilter1.addParam(new m.f("contrast", 1.0F));
    localBaseFilter1.addParam(new m.f("saturation", 1.4F));
    localBaseFilter1.addParam(new m.f("brightness", 1.0F));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter2.addParam(new m.g("shadowsShift", new float[] { -0.02745098F, 0.0F, 0.01176471F }));
    localBaseFilter2.addParam(new m.g("midtonesShift", new float[] { -0.02745098F, 0.0F, 0.01176471F }));
    localBaseFilter2.addParam(new m.g("highlightsShift", new float[] { -0.02745098F, 0.0F, 0.01176471F }));
    localBaseFilter2.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bLF);
    localBaseFilter1.addParam(new m.f("inputH", 1.0F));
    localBaseFilter1.addParam(new m.f("inputS", 1.0F));
    localBaseFilter1.addParam(new m.f("inputV", 1.02F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.y
 * JD-Core Version:    0.6.2
 */