package com.tencent.filter.art;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends BaseFilter
{
  private BaseFilter bND = null;
  float strenth = 0.5F;

  public e()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86308);
    this.glsl_programID = GLSLRender.bJB;
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bJB);
    localBaseFilter.scaleFact = Math.min(100.0F / Math.min(paramFloat2, paramFloat1), 1.0F);
    setNextFilter(localBaseFilter, null);
    this.bND = new e.a();
    this.bND.addParam(new m.f("param", this.strenth));
    if (this.strenth >= 0.5F)
      this.bND.addParam(new m.f("scale", 2.0F));
    while (true)
    {
      localBaseFilter.setNextFilter(this.bND, new int[] { this.srcTextureIndex + 1 });
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86308);
      return;
      this.bND.addParam(new m.f("scale", 1.0F));
    }
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86309);
    this.bND = null;
    super.ClearGLSL();
    AppMethodBeat.o(86309);
  }

  public final boolean isAdjustFilter()
  {
    return true;
  }

  public final void setAdjustParam(float paramFloat)
  {
    AppMethodBeat.i(86307);
    this.strenth = paramFloat;
    if (this.bND != null)
      this.bND.addParam(new m.f("param", this.strenth));
    AppMethodBeat.o(86307);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.e
 * JD-Core Version:    0.6.2
 */