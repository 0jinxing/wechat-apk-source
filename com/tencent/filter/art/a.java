package com.tencent.filter.art;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class a extends BaseFilter
{
  int bMY;
  String bMZ;
  float bNa;
  float bNb;
  float bNc;
  float bNd;
  float intensity;

  public a(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(86282);
    this.bMZ = null;
    this.bMZ = null;
    this.bMY = paramInt;
    this.bNa = 0.3F;
    this.intensity = 0.5F;
    this.bNb = 0.0F;
    this.bNc = 0.12F;
    this.bNd = 0.02F;
    if ((this.bMZ != null) || (this.bMY != GLSLRender.bJB))
    {
      addParam(new m.o("inputImageTexture2", this.bMZ, 33986));
      addParam(new m.f("inputH", 0.0F));
      addParam(new m.f("inputS", 0.12F));
      addParam(new m.f("inputV", 0.02F));
    }
    AppMethodBeat.o(86282);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86283);
    if (IsFilterInvalute())
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86283);
      return;
    }
    if (paramBoolean)
      if ((this.bMZ != null) || (this.bMY != GLSLRender.bJB))
      {
        this.glsl_programID = this.bMY;
        addParam(new m.o("inputImageTexture2", this.bMZ, 33986));
        addParam(new m.f("inputH", this.bNb));
        addParam(new m.f("inputS", this.bNc));
        addParam(new m.f("inputV", this.bNd));
      }
    while (true)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86283);
      break;
      this.glsl_programID = GLSLRender.bJB;
      BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKR);
      localBaseFilter1.addParam(new m.f("blurSize", this.bNa));
      setNextFilter(localBaseFilter1, null);
      BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKS);
      localBaseFilter2.addParam(new m.f("blurSize", this.bNa));
      localBaseFilter2.addParam(new m.f("intensity", this.intensity * 3.5F));
      localBaseFilter1.setNextFilter(localBaseFilter2, new int[] { this.srcTextureIndex + 1 });
      if ((this.bMZ != null) || (this.bMY != GLSLRender.bJB))
      {
        localBaseFilter1 = new BaseFilter(this.bMY);
        localBaseFilter1.addParam(new m.o("inputImageTexture2", this.bMZ, 33986));
        localBaseFilter1.addParam(new m.f("inputH", this.bNb));
        localBaseFilter1.addParam(new m.f("inputS", this.bNc));
        localBaseFilter1.addParam(new m.f("inputV", this.bNd));
        localBaseFilter2.setNextFilter(localBaseFilter1, null);
      }
    }
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86281);
    if (paramMap.containsKey("intensity"))
      this.intensity = ((Float)paramMap.get("intensity")).floatValue();
    if ((getmNextFilter() != null) && (getmNextFilter().getmNextFilter() != null))
      getmNextFilter().getmNextFilter().addParam(new m.f("intensity", this.intensity * 3.5F));
    AppMethodBeat.o(86281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.a
 * JD-Core Version:    0.6.2
 */