package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.k;
import com.tencent.filter.m.g;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cc extends BaseFilter
{
  public cc()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86536);
    Object localObject1 = new k();
    ((k)localObject1).a(0.0F, 13.0F, 0.0F, 340.0F, 352.0F, 10.0F, 20.0F);
    setNextFilter((BaseFilter)localObject1, null);
    Object localObject2 = new k();
    ((k)localObject2).a(0.0F, -18.0F, 15.0F, 352.0F, 15.0F, 45.0F, 70.0F);
    ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
    localObject1 = new BaseFilter(GLSLRender.bKD);
    ((BaseFilter)localObject1).addParam(new m.o("inputImageTexture2", "sh/richred_curve.png", 33986));
    ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
    localObject2 = new BaseFilter(GLSLRender.bKG);
    ((BaseFilter)localObject2).addParam(new m.g("shadowsShift", new float[] { 0.0F, 0.007843138F, 0.007843138F }));
    ((BaseFilter)localObject2).addParam(new m.g("midtonesShift", new float[] { -0.02352941F, 0.01176471F, 0.04313726F }));
    ((BaseFilter)localObject2).addParam(new m.g("highlightsShift", new float[] { -0.007843138F, 0.0F, 0.0F }));
    ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.cc
 * JD-Core Version:    0.6.2
 */