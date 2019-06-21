package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends BaseFilter
{
  public a()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86428);
    if (paramBoolean)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86428);
    }
    while (true)
    {
      return;
      BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bMy, GLSLRender.bLJ);
      localBaseFilter.addParam(new m.f("sharpness", 0.2F));
      localBaseFilter.addParam(new m.f("inputH", 1.0F));
      localBaseFilter.addParam(new m.f("inputS", 1.2F));
      localBaseFilter.addParam(new m.f("inputV", 1.0F));
      localBaseFilter.addParam(new m.f("imageWidthFactor", 1.0F / paramFloat1));
      localBaseFilter.addParam(new m.f("imageHeightFactor", 1.0F / paramFloat2));
      setNextFilter(localBaseFilter, null);
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86428);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.a
 * JD-Core Version:    0.6.2
 */