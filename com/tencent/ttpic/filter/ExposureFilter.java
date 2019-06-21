package com.tencent.ttpic.filter;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ExposureFilter extends BaseFilter
{
  private static final float EXPOSURE_MAX = 1.5F;
  private static final float EXPOSURE_MIN = -2.0F;
  private static final String FRAG_SHADER = " precision mediump float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform lowp float exposure;\n void main()\n {\n     vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     gl_FragColor = vec4(textureColor.rgb * pow(1.41, exposure), textureColor.a);\n }";
  private float mExposure;

  public ExposureFilter()
  {
    super(" precision mediump float;\n varying highp vec2 textureCoordinate;\n uniform sampler2D inputImageTexture;\n uniform lowp float exposure;\n void main()\n {\n     vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     gl_FragColor = vec4(textureColor.rgb * pow(1.41, exposure), textureColor.a);\n }");
    AppMethodBeat.i(82181);
    this.mExposure = 0.0F;
    setExposureValue(0.0F);
    AppMethodBeat.o(82181);
  }

  private float transLevel2Value(float paramFloat)
  {
    AppMethodBeat.i(82184);
    if (paramFloat < 50.0F)
    {
      paramFloat = (paramFloat - 50.0F) / 50.0F * Math.abs(-2.0F);
      AppMethodBeat.o(82184);
    }
    while (true)
    {
      return paramFloat;
      paramFloat = (paramFloat - 50.0F) / 50.0F * Math.abs(1.5F);
      AppMethodBeat.o(82184);
    }
  }

  public boolean needRender()
  {
    AppMethodBeat.i(82185);
    boolean bool;
    if (Math.abs(this.mExposure) > 0.01F)
    {
      bool = true;
      AppMethodBeat.o(82185);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(82185);
    }
  }

  public void setExposureLevel(float paramFloat)
  {
    AppMethodBeat.i(82183);
    setExposureValue(transLevel2Value(paramFloat));
    AppMethodBeat.o(82183);
  }

  public void setExposureValue(float paramFloat)
  {
    AppMethodBeat.i(82182);
    paramFloat = Math.max(Math.min(paramFloat, 1.5F), -2.0F);
    this.mExposure = paramFloat;
    addParam(new m.f("exposure", paramFloat));
    AppMethodBeat.o(82182);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.ExposureFilter
 * JD-Core Version:    0.6.2
 */