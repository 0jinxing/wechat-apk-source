package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bq extends BaseFilter
{
  public bq()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86524);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/linjia_curve.png", 33986));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter2.addParam(new m.g("shadowsShift", new float[] { 0.0F, -0.02745098F, 0.05098039F }));
    localBaseFilter2.addParam(new m.g("midtonesShift", new float[] { 0.0F, -0.04313726F, 0.0F }));
    localBaseFilter2.addParam(new m.g("highlightsShift", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter2.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bKI);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.9921569F, 0.8470588F, 0.6392157F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 0.4F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86524);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.bq
 * JD-Core Version:    0.6.2
 */