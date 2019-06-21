package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class z extends BaseFilter
{
  public z()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86475);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKF);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.1803922F, 0.1490196F, 0.07450981F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 1.0F));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter2.addParam(new m.g("shadowsShift", new float[] { -0.02352941F, 0.1058824F, 0.0F }));
    localBaseFilter2.addParam(new m.g("midtonesShift", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter2.addParam(new m.g("highlightsShift", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter2.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bLM);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.3960784F, 0.254902F, 0.1843137F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 0.87F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter2.addParam(new m.g("shadowsShift", new float[] { 0.0F, 0.05490196F, 0.0F }));
    localBaseFilter2.addParam(new m.g("midtonesShift", new float[] { 0.0F, 0.05490196F, 0.0F }));
    localBaseFilter2.addParam(new m.g("highlightsShift", new float[] { 0.03137255F, 0.05490196F, -0.2431373F }));
    localBaseFilter2.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bJO);
    localBaseFilter1.addParam(new m.f("contrast", 1.0F));
    localBaseFilter1.addParam(new m.f("saturation", 0.6F));
    localBaseFilter1.addParam(new m.f("brightness", 1.0F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter3 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter3.addParam(new m.o("inputImageTexture2", "sh/fugu_curve.png", 33986));
    localBaseFilter1.setNextFilter(localBaseFilter3, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bKJ);
    localBaseFilter2.addParam(new m.f("inputH", 1.0F));
    localBaseFilter2.addParam(new m.f("inputS", 1.0F));
    localBaseFilter2.addParam(new m.f("inputV", 0.974F));
    localBaseFilter3.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bKM);
    localBaseFilter1.addParam(new m.g("color2", new float[] { 0.9490196F, 0.9098039F, 0.8039216F, 1.0F }));
    localBaseFilter1.addParam(new m.f("transparency", 0.5F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86475);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.z
 * JD-Core Version:    0.6.2
 */