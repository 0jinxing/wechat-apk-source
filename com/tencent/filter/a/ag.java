package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.k;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ag extends BaseFilter
{
  public ag()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86484);
    Object localObject = new k();
    ((k)localObject).a(0.0F, -50.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    setNextFilter((BaseFilter)localObject, null);
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bKD);
    localBaseFilter.addParam(new m.o("inputImageTexture2", "sh/glarefashion_curve.png", 33986));
    ((BaseFilter)localObject).setNextFilter(localBaseFilter, null);
    localObject = new BaseFilter(GLSLRender.bMg);
    ((BaseFilter)localObject).addParam(new m.o("inputImageTexture2", "sh/glarefashion_screen.png", 33986));
    ((BaseFilter)localObject).addParam(new m.f("transparency", 0.3F));
    localBaseFilter.setNextFilter((BaseFilter)localObject, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.ag
 * JD-Core Version:    0.6.2
 */