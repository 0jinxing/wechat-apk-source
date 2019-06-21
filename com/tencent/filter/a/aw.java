package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.k;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aw extends BaseFilter
{
  public aw()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86504);
    Object localObject1 = new k();
    ((k)localObject1).a(0.0F, 10.0F, 0.0F, 329.0F, 349.0F, 13.0F, 32.0F);
    setNextFilter((BaseFilter)localObject1, null);
    Object localObject2 = new k();
    ((k)localObject2).a(0.0F, -10.0F, -4.0F, 2.0F, 18.0F, 49.0F, 72.0F);
    ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
    localObject1 = new BaseFilter(GLSLRender.bKD);
    ((BaseFilter)localObject1).addParam(new m.o("inputImageTexture2", "sh/lightwhite_curve.png", 33986));
    ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
    localObject2 = new BaseFilter(GLSLRender.bJO);
    ((BaseFilter)localObject2).addParam(new m.f("contrast", 1.05F));
    ((BaseFilter)localObject2).addParam(new m.f("saturation", 1.0F));
    ((BaseFilter)localObject2).addParam(new m.f("brightness", 1.0F));
    ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.aw
 * JD-Core Version:    0.6.2
 */