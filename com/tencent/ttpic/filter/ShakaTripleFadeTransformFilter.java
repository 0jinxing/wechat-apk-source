package com.tencent.ttpic.filter;

import com.tencent.filter.m.a;
import com.tencent.filter.m.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.shader.ShaderCreateFactory.PROGRAM_TYPE;
import java.util.Map;

public class ShakaTripleFadeTransformFilter extends ShakaFilterBase
{
  private static final String[] PARAM_KEYS = { "scaleUp", "scaleMid", "scaleDown", "alphaUp", "alphaMid", "alphaDown" };

  public ShakaTripleFadeTransformFilter()
  {
    super(ShaderCreateFactory.PROGRAM_TYPE.SHAKA_TRIPLE_FACE_TRANSFORM);
  }

  private void setParams(int paramInt, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2)
  {
    AppMethodBeat.i(82850);
    addParam(new m.i("layers", paramInt));
    addParam(new m.a("scales", paramArrayOfFloat1));
    addParam(new m.a("alphaRatios", paramArrayOfFloat2));
    AppMethodBeat.o(82850);
  }

  protected float getDefaultParamValue()
  {
    return 1.0F;
  }

  protected String[] getParamKeys()
  {
    return PARAM_KEYS;
  }

  public void initParams()
  {
    AppMethodBeat.i(82849);
    addParam(new m.i("layers", 1));
    addParam(new m.a("scales", new float[] { 1.0F, 0.0F, 0.0F, 0.0F }));
    addParam(new m.a("alphaRatios", new float[] { 1.0F, 0.0F, 0.0F, 0.0F }));
    AppMethodBeat.o(82849);
  }

  public void setParameterDic(Map<String, Float> paramMap)
  {
    AppMethodBeat.i(82851);
    float f1 = ((Float)paramMap.get("scaleUp")).floatValue();
    float f2 = ((Float)paramMap.get("scaleMid")).floatValue();
    float f3 = ((Float)paramMap.get("scaleDown")).floatValue();
    float[] arrayOfFloat = new float[3];
    arrayOfFloat[0] = ((Float)paramMap.get("alphaUp")).floatValue();
    arrayOfFloat[1] = ((Float)paramMap.get("alphaMid")).floatValue();
    arrayOfFloat[2] = ((Float)paramMap.get("alphaDown")).floatValue();
    float f4 = 0.0F;
    for (int i = 0; i < 3; i++)
      f4 += arrayOfFloat[i];
    for (i = 0; i < 3; i++)
      arrayOfFloat[i] /= f4;
    setParams(3, new float[] { f1, f2, f3 }, arrayOfFloat);
    AppMethodBeat.o(82851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.ShakaTripleFadeTransformFilter
 * JD-Core Version:    0.6.2
 */