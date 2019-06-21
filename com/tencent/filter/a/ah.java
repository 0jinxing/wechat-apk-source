package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ah extends BaseFilter
{
  public ah()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86485);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/glarefonddream_curve.png", 33986));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bMg);
    localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/glarefonddream_screen0.png", 33986));
    localBaseFilter2.addParam(new m.f("transparency", 0.6F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bMg);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/glarefonddream_screen1.png", 33986));
    localBaseFilter1.addParam(new m.f("transparency", 0.7F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bMg);
    localBaseFilter2.addParam(new m.o("inputImageTexture2", "sh/glarefonddream_screen2.png", 33986));
    localBaseFilter2.addParam(new m.f("transparency", 0.4F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86485);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.ah
 * JD-Core Version:    0.6.2
 */