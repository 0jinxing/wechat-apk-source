package com.tencent.filter.art;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends BaseFilter
{
  int type;

  public b(int paramInt)
  {
    super(GLSLRender.bJB);
    this.type = paramInt;
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86292);
    ClearGLSL();
    if (paramBoolean)
    {
      this.glsl_programID = GLSLRender.bJB;
      setNextFilter(null, null);
    }
    while (true)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86292);
      return;
      this.glsl_programID = GLSLRender.bLb;
      BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bLa);
      setNextFilter(localBaseFilter1, null);
      BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bLc);
      localBaseFilter1.setNextFilter(localBaseFilter2, null);
      localBaseFilter1 = new BaseFilter(GLSLRender.bKV);
      localBaseFilter1.addParam(new m.f("threshold", 0.0F));
      localBaseFilter2.setNextFilter(localBaseFilter1, null);
      localBaseFilter2 = new BaseFilter(GLSLRender.bLf);
      localBaseFilter1.setNextFilter(localBaseFilter2, null);
      localBaseFilter1 = new BaseFilter(GLSLRender.bKW);
      localBaseFilter1.addParam(new m.f("inv_2sigma2", 127.00195F));
      localBaseFilter1.addParam(new m.f("inv_sigma_root_2pi", 0.0008F));
      localBaseFilter2.setNextFilter(localBaseFilter1, new int[] { 2 });
      BaseFilter localBaseFilter3 = new BaseFilter(GLSLRender.bKZ);
      localBaseFilter3.addParam(new m.f("par", 0.15F));
      localBaseFilter1.setNextFilter(localBaseFilter3, new int[] { 4 });
      localBaseFilter2 = new BaseFilter(GLSLRender.bKY);
      localBaseFilter2.addParam(new m.f("par", 0.35F));
      localBaseFilter2.addParam(new m.f("par_b", 0.2F));
      localBaseFilter3.setNextFilter(localBaseFilter2, new int[] { 4, 5 });
      localBaseFilter1 = new BaseFilter(GLSLRender.bKX);
      localBaseFilter1.addParam(new m.f("inv_2sigma", 12.0F));
      localBaseFilter2.setNextFilter(localBaseFilter1, new int[] { 4 });
      if (this.type == 1)
      {
        localBaseFilter2 = new BaseFilter(GLSLRender.bKU);
        localBaseFilter2.addParam(new m.f("inv_2sigma2", 144.5F));
        localBaseFilter2.addParam(new m.f("inv_sigma_root_2pi", 0.02F));
        localBaseFilter1.setNextFilter(localBaseFilter2, new int[] { 5, 4 });
        localBaseFilter1 = new BaseFilter(GLSLRender.bKT);
        localBaseFilter1.addParam(new m.f("inv_2sigma2", 144.5F));
        localBaseFilter1.addParam(new m.f("inv_sigma_root_2pi", 0.02F));
        localBaseFilter2.setNextFilter(localBaseFilter1, new int[] { 4 });
        localBaseFilter1.setNextFilter(new BaseFilter(GLSLRender.bLd), new int[] { 8 });
      }
      else if (this.type == 2)
      {
        localBaseFilter2 = new BaseFilter(GLSLRender.bKU);
        localBaseFilter2.addParam(new m.f("inv_2sigma2", 144.5F));
        localBaseFilter2.addParam(new m.f("inv_sigma_root_2pi", 0.02F));
        localBaseFilter1.setNextFilter(localBaseFilter2, new int[] { 5, 4 });
        localBaseFilter1 = new BaseFilter(GLSLRender.bKT);
        localBaseFilter1.addParam(new m.f("inv_2sigma2", 144.5F));
        localBaseFilter1.addParam(new m.f("inv_sigma_root_2pi", 0.02F));
        localBaseFilter2.setNextFilter(localBaseFilter1, new int[] { 4 });
        localBaseFilter1.setNextFilter(new BaseFilter(GLSLRender.bLe), new int[] { 8 });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.b
 * JD-Core Version:    0.6.2
 */