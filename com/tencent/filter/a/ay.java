package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.k;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ay extends BaseFilter
{
  public ay()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86506);
    Object localObject = new BaseFilter(GLSLRender.bKM);
    ((BaseFilter)localObject).addParam(new m.g("color2", new float[] { 0.9333333F, 0.6705883F, 0.8941177F, 1.0F }));
    ((BaseFilter)localObject).addParam(new m.f("transparency", 0.3F));
    setNextFilter((BaseFilter)localObject, null);
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bLZ);
    localBaseFilter.addParam(new m.g("color2", new float[] { 0.8941177F, 0.6352941F, 0.2235294F, 1.0F }));
    localBaseFilter.addParam(new m.f("transparency", 0.1F));
    ((BaseFilter)localObject).setNextFilter(localBaseFilter, null);
    k localk = new k();
    ((k)localk).a(0.0F, 5.0F, 1.0F, 310.0F, 340.0F, 10.0F, 40.0F);
    localBaseFilter.setNextFilter(localk, null);
    localObject = new k();
    ((k)localObject).a(0.0F, -22.0F, 15.0F, 355.0F, 18.0F, 58.0F, 79.0F);
    localk.setNextFilter((BaseFilter)localObject, null);
    localBaseFilter = new BaseFilter(GLSLRender.bKG);
    localBaseFilter.addParam(new m.g("shadowsShift", new float[] { -0.02745098F, -0.05490196F, 0.0F }));
    localBaseFilter.addParam(new m.g("midtonesShift", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter.addParam(new m.g("highlightsShift", new float[] { 0.0F, -0.04705882F, -0.04705882F }));
    ((BaseFilter)localObject).setNextFilter(localBaseFilter, null);
    localObject = new BaseFilter(GLSLRender.bKD);
    ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/maplered_curve.png", 33986));
    localBaseFilter.setNextFilter((BaseFilter)localObject, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86506);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.ay
 * JD-Core Version:    0.6.2
 */