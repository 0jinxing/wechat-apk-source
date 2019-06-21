package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class g extends BaseFilter
{
  private int type = 0;

  public g()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86363);
    double d = paramFloat1 / paramFloat2;
    this.glsl_programID = GLSLRender.bJP;
    addParam(new m.o("inputImageTexture3", "flares/flares_curve.png", 33987));
    switch (this.type)
    {
    default:
      addParam(new m.o("inputImageTexture2", "flares/flares_light_leak_3.jpg", d));
      addParam(new m.i("flag", 1));
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    }
    while (true)
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86363);
      return;
      addParam(new m.o("inputImageTexture2", "flares/flares_bokeh_basic_1.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_bokeh_basic_2.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_bokeh_basic_3.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_bokeh_heart_1.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_bokeh_heart_2.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_lens_flares_1.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_lens_flares_2.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_lens_flares_3.jpg", d));
      addParam(new m.i("flag", 0));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_light_leak_1.jpg", d));
      addParam(new m.i("flag", 1));
      continue;
      addParam(new m.o("inputImageTexture2", "flares/flares_light_leak_2.jpg", d));
      addParam(new m.i("flag", 1));
    }
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86362);
    if (paramMap.containsKey("effectIndex"))
      this.type = ((Integer)paramMap.get("effectIndex")).intValue();
    AppMethodBeat.o(86362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.g
 * JD-Core Version:    0.6.2
 */