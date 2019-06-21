package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aa extends BaseFilter
{
  public aa()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86476);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKF);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.1529412F, 0.09411765F, 0.09803922F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 1.0F));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/fuguhuang.png", 33986));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter1.addParam(new m.g("shadowsShift", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter1.addParam(new m.g("midtonesShift", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter1.addParam(new m.g("highlightsShift", new float[] { 0.0F, 0.0F, -0.12549F }));
    localBaseFilter1.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bKJ);
    localBaseFilter2.addParam(new m.f("inputH", 1.0F));
    localBaseFilter2.addParam(new m.f("inputS", 1.0F));
    localBaseFilter2.addParam(new m.f("inputV", 0.974F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bKM);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.9490196F, 0.9098039F, 0.8039216F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 0.5F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86476);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.aa
 * JD-Core Version:    0.6.2
 */