package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class f extends BaseFilter
{
  float scaleFact = 1.0F;

  public f()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86357);
    this.glsl_programID = GLSLRender.bJB;
    BaseFilter localBaseFilter = new BaseFilter(GLSLRender.bJB);
    localBaseFilter.scaleFact = this.scaleFact;
    setNextFilter(localBaseFilter, null);
    localBaseFilter.setNextFilter(new BaseFilter(GLSLRender.bJB), null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86357);
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86356);
    if (paramMap.containsKey("scalefact"))
      this.scaleFact = ((Float)paramMap.get("scalefact")).floatValue();
    AppMethodBeat.o(86356);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.f
 * JD-Core Version:    0.6.2
 */