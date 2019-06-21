package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.filter.m.g;
import com.tencent.filter.m.i;
import com.tencent.filter.m.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ci extends BaseFilter
{
  public ci()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86542);
    BaseFilter localBaseFilter1 = new BaseFilter(GLSLRender.bKD);
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/snow_curve.png", 33986));
    setNextFilter(localBaseFilter1, null);
    BaseFilter localBaseFilter2 = new BaseFilter(GLSLRender.bKG);
    localBaseFilter2.addParam(new m.g("shadowsShift", new float[] { -0.09411765F, 0.0F, 0.0F }));
    localBaseFilter2.addParam(new m.g("midtonesShift", new float[] { -0.09803922F, 0.0F, 0.0F }));
    localBaseFilter2.addParam(new m.g("highlightsShift", new float[] { -0.0588235F, 0.0F, 0.0F }));
    localBaseFilter2.addParam(new m.i("preserveLuminosity", 1));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter(GLSLRender.bKE);
    localBaseFilter1.addParam(new m.f("scaleC", -0.354F));
    localBaseFilter1.addParam(new m.f("scaleT", 0.0F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    localBaseFilter2 = new BaseFilter(GLSLRender.bLF);
    localBaseFilter2.addParam(new m.f("inputH", 1.0F));
    localBaseFilter2.addParam(new m.f("inputS", 1.0F));
    localBaseFilter2.addParam(new m.f("inputV", 1.05F));
    localBaseFilter1.setNextFilter(localBaseFilter2, null);
    localBaseFilter1 = new BaseFilter("precision highp float;\n varying vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2;\n uniform float param;\n void main(void)\n {\n     vec4 color  = texture2D(inputImageTexture, textureCoordinate);\n     vec4 color2 = texture2D(inputImageTexture2, textureCoordinate);\n     vec3 ret=color.rgb+color2.rgb*param;\n     gl_FragColor = vec4(ret.rgb,1.0);\n }\n");
    localBaseFilter1.addParam(new m.o("inputImageTexture2", "sh/snow.png", paramFloat1 / paramFloat2));
    localBaseFilter1.addParam(new m.f("param", 0.35F));
    localBaseFilter2.setNextFilter(localBaseFilter1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86542);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.ci
 * JD-Core Version:    0.6.2
 */