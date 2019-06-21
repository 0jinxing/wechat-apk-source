package com.tencent.filter.art;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Map;

public final class c extends BaseFilter
{
  int bNh;
  float bNi;
  float bNj;
  float bNk;
  int bNl;
  float bNm;
  float bNn;
  float bNo;
  float bNp;
  float bNq;
  float bNr;
  float bNs;
  int radius;
  float tx;
  float ty;
  int type;

  public c()
  {
    super(GLSLRender.bJB);
    AppMethodBeat.i(86293);
    this.bNh = 1;
    this.bNq = 0.5F;
    this.bNi = 0.5F;
    this.bNr = 1.2F;
    this.radius = 8;
    this.bNj = ((float)(1.0D / Math.exp(0.0D)));
    this.bNk = 0.0F;
    this.bNs = 960.0F;
    this.bNl = 1;
    AppMethodBeat.o(86293);
  }

  private void W(float paramFloat)
  {
    this.bNi = (1.0F - paramFloat);
    this.radius = 5;
    if ((this.bNi < 0.8D) && (this.bNi > 0.4F))
      this.radius = 8;
    label122: 
    while (true)
    {
      if (this.bNl == 2)
        this.bNi = (1.0F - 0.6F * paramFloat);
      if (paramFloat < 0.3D);
      for (this.bNr = (3.0F * paramFloat); ; this.bNr = ((paramFloat - 0.3F) * 1.3F + 0.9F))
      {
        return;
        if (this.bNi > 0.4F)
          break label122;
        this.bNi = 0.4F;
        this.radius = ((int)(8.0F + 6.0F * paramFloat));
        break;
      }
    }
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86295);
    if (IsFilterInvalute())
    {
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86295);
      return;
    }
    this.glsl_programID = GLSLRender.bJB;
    Object localObject;
    BaseFilter localBaseFilter;
    label156: int i;
    float f1;
    float f2;
    if (this.type != 0)
    {
      if (this.bNh == 0)
        break label380;
      this.scaleFact = (Math.min(this.bNs / Math.max(paramFloat1, paramFloat2), 1.0F) * this.bNi);
      localObject = new BokehFilter.a(this.radius, this.bNj, this.bNk, this.bNh, this.bNl);
      ((BaseFilter)localObject).addParam(new m.f("lumi_p", this.radius * 1.0F));
      ((BaseFilter)localObject).setScaleFact(this.scaleFact);
      setNextFilter((BaseFilter)localObject, null);
      localBaseFilter = new BaseFilter(GLSLRender.bJB);
      ((BaseFilter)localObject).setNextFilter(localBaseFilter, null);
      i = GLSLRender.bKk;
      f1 = this.bNo;
      f2 = this.bNp;
      switch (this.type)
      {
      default:
      case 1:
      case 2:
      case 3:
      }
    }
    while (true)
    {
      localObject = new BaseFilter(i);
      ((BaseFilter)localObject).addParam(new m.f("ratio", paramFloat2 / paramFloat1));
      ((BaseFilter)localObject).addParam(new m.f("tx", this.tx / paramFloat1));
      ((BaseFilter)localObject).addParam(new m.f("ty", this.ty / paramFloat2));
      ((BaseFilter)localObject).addParam(new m.f("innerRadius", this.bNm / paramFloat1));
      ((BaseFilter)localObject).addParam(new m.f("outerRadius", this.bNn / paramFloat1));
      ((BaseFilter)localObject).addParam(new m.f("theta", f1));
      ((BaseFilter)localObject).addParam(new m.f("eclipseA", f2));
      localBaseFilter.setNextFilter((BaseFilter)localObject, new int[] { 0 });
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86295);
      break;
      label380: localBaseFilter = new BaseFilter(GLSLRender.bKm);
      localBaseFilter.addParam(new m.f("depthr", this.bNr));
      setNextFilter(localBaseFilter, null);
      break label156;
      i = GLSLRender.bKk;
      continue;
      i = GLSLRender.bKl;
      continue;
      f1 = 0.0F;
      i = GLSLRender.bKk;
      f2 = 1.0F;
    }
  }

  public final void setParameterDic(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(86294);
    if (paramMap.containsKey("bokehmode"))
      this.bNl = ((Integer)paramMap.get("bokehmode")).intValue();
    if (paramMap.containsKey("inputradius"))
      W(((Float)paramMap.get("input_radius")).floatValue());
    if (paramMap.containsKey("blurRiness"))
    {
      this.bNq = ((Float)paramMap.get("blurRiness")).floatValue();
      W(this.bNq);
    }
    if (paramMap.containsKey("MethodType"))
      this.type = ((Integer)paramMap.get("MethodType")).intValue();
    if (paramMap.containsKey("bokehType"))
      this.bNh = (((Integer)paramMap.get("bokehType")).intValue() % 6);
    if (paramMap.containsKey("tx"))
      this.tx = ((Float)paramMap.get("tx")).floatValue();
    if (paramMap.containsKey("ty"))
      this.ty = ((Float)paramMap.get("ty")).floatValue();
    if (paramMap.containsKey("innerRadius"))
      this.bNm = ((Float)paramMap.get("innerRadius")).floatValue();
    if (paramMap.containsKey("outerRadius"))
      this.bNn = ((Float)paramMap.get("outerRadius")).floatValue();
    if (paramMap.containsKey("theta"))
      this.bNo = ((Float)paramMap.get("theta")).floatValue();
    if (paramMap.containsKey("eclipseA"))
      this.bNp = ((Float)paramMap.get("eclipseA")).floatValue();
    if (paramMap.containsKey("defaultWidth"))
      this.bNs = ((Float)paramMap.get("defaultWidth")).floatValue();
    if (paramMap.containsKey("lumi_threshold"))
      this.bNk = ((Float)paramMap.get("lumi_threshold")).floatValue();
    if (paramMap.containsKey("lumi_weight"))
      this.bNj = ((float)(1.0D / Math.exp(((Float)paramMap.get("lumi_weight")).floatValue())));
    AppMethodBeat.o(86294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.art.c
 * JD-Core Version:    0.6.2
 */