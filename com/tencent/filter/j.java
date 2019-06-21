package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class j extends BaseFilter
{
  float bMA = 0.3F;
  float bMB = 1.25F;
  float bMC = 0.001F;
  float bMD = 0.999F;
  private BaseFilter bME = null;
  private j.a bMF = null;
  float bMz = 25.0F;

  public j()
  {
    super(GLSLRender.bJB);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86379);
    this.glsl_programID = GLSLRender.bJB;
    float f = Math.min(paramFloat2, paramFloat1);
    this.scaleFact = Math.min(100.0F / f, 1.0F);
    Object localObject1 = new l(this.bMC, this.bMD);
    setNextFilter((BaseFilter)localObject1, new int[] { this.srcTextureIndex });
    Object localObject2 = new BaseFilter(GLSLRender.bKd);
    ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
    localObject1 = new BaseFilter(GLSLRender.bJB);
    ((BaseFilter)localObject1).scaleFact = Math.min(400.0F / f, 1.0F);
    ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
    this.bMF = new j.a(((BaseFilter)localObject1).scaleFact);
    this.bMF.V(this.bMz);
    ((BaseFilter)localObject1).setNextFilter(this.bMF, new int[] { this.srcTextureIndex + 3 });
    localObject2 = this.bMF;
    this.bME = new BaseFilter(GLSLRender.bMn, GLSLRender.bKi);
    this.bME.addParam(new m.f("sharpness", this.bMA));
    ((BaseFilter)localObject2).setNextFilter(this.bME, null);
    localObject1 = this.bME;
    localObject2 = new BaseFilter(GLSLRender.bKe);
    ((BaseFilter)localObject1).setNextFilter((BaseFilter)localObject2, null);
    localObject1 = new BaseFilter(GLSLRender.bKg);
    ((BaseFilter)localObject1).addParam(new m.f("saturation", this.bMB));
    ((BaseFilter)localObject2).setNextFilter((BaseFilter)localObject1, null);
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86379);
  }

  public final boolean isAdjustFilter()
  {
    return true;
  }

  public final void setAdjustParam(float paramFloat)
  {
    AppMethodBeat.i(86377);
    paramFloat = Math.max((float)Math.min(paramFloat, 1.0D), 0.0F);
    this.bMz = (50.0F * paramFloat);
    this.bMA = (paramFloat * 0.6F);
    if (this.bMF != null)
      this.bMF.V(this.bMz);
    if (this.bME != null)
      this.bME.addParam(new m.f("sharpness", this.bMA));
    AppMethodBeat.o(86377);
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86378);
    if (paramMap.containsKey("stretechMag"))
      this.bMz = ((Float)paramMap.get("stretechMag")).floatValue();
    if (paramMap.containsKey("sharpnessMag"))
      this.bMA = ((Float)paramMap.get("sharpnessMag")).floatValue();
    if (paramMap.containsKey("saturationMag"))
      this.bMB = ((Float)paramMap.get("saturationMag")).floatValue();
    if (paramMap.containsKey("percent"))
    {
      this.bMC = ((Float)paramMap.get("percent")).floatValue();
      this.bMD = (1.0F - this.bMC);
    }
    AppMethodBeat.o(86378);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.j
 * JD-Core Version:    0.6.2
 */