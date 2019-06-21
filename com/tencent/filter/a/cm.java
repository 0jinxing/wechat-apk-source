package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.g;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cm extends BaseFilter
{
  public cm()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86545);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bLW);
    localBaseFilter1.addParam(new m.g("levelMinimum", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter1.addParam(new m.g("levelMiddle", new float[] { 0.04F, 1.0F, 1.0F }));
    localBaseFilter1.addParam(new m.g("levelMaximum", new float[] { 1.0F, 1.0F, 1.0F }));
    localBaseFilter1.addParam(new m.g("minOutput", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter1.addParam(new m.g("maxOutput", new float[] { 1.0F, 1.0F, 1.0F }));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bLX);
    localBaseFilter1.setNextFilter(localBaseFilter2, new int[] { this.srcTextureIndex + 1 });
    localBaseFilter1 = new BaseFilter(GLSLRender.bLW);
    localBaseFilter1.addParam(new m.g("levelMinimum", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter1.addParam(new m.g("levelMiddle", new float[] { 1.0F, 0.02F, 1.0F }));
    localBaseFilter1.addParam(new m.g("levelMaximum", new float[] { 1.0F, 1.0F, 1.0F }));
    localBaseFilter1.addParam(new m.g("minOutput", new float[] { 0.0F, 0.0F, 0.0F }));
    localBaseFilter1.addParam(new m.g("maxOutput", new float[] { 1.0F, 1.0F, 1.0F }));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bLY);
    localBaseFilter1.setNextFilter(localBaseFilter2, new int[] { this.srcTextureIndex + 2 });
    localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/3d_curve.png", 33986));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86545);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.cm
 * JD-Core Version:    0.6.2
 */