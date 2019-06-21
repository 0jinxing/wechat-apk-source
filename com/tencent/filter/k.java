package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k extends BaseFilter
{
  float bMH = 0.5F;
  float bMI = 0.5F;
  float bMJ = 0.5F;
  float bMK = -1.0F;
  float bML = -1.0F;
  float bMM = -1.0F;
  float bMN = -1.0F;
  int bMO = -1;

  public k()
  {
    super(GLSLRender.bMe);
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86384);
    switch (this.bMO)
    {
    default:
      this.glsl_programID = GLSLRender.bMe;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      addParam(new m.f("fh", this.bMH));
      addParam(new m.f("fs", this.bMI));
      addParam(new m.f("fv", this.bMJ));
      addParam(new m.f("flb", this.bMK));
      addParam(new m.f("fld", this.bML));
      addParam(new m.f("frd", this.bMM));
      addParam(new m.f("frb", this.bMN));
      addParam(new m.i("channelflag", this.bMO));
      super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
      AppMethodBeat.o(86384);
      return;
      this.glsl_programID = GLSLRender.bMa;
      continue;
      this.glsl_programID = GLSLRender.bMb;
      continue;
      this.glsl_programID = GLSLRender.bMc;
      continue;
      this.glsl_programID = GLSLRender.bMd;
    }
  }

  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
  {
    AppMethodBeat.i(86383);
    this.bMK = (paramFloat4 / 360.0F);
    this.bML = (paramFloat5 / 360.0F);
    this.bMM = (paramFloat6 / 360.0F);
    this.bMN = (paramFloat7 / 360.0F);
    this.bMH = (paramFloat1 / 180.0F * 0.5F);
    this.bMI = (paramFloat2 / 100.0F);
    this.bMJ = (paramFloat3 / 100.0F);
    double d1 = paramFloat4;
    double d2 = paramFloat5;
    double d3 = paramFloat6;
    double d4 = paramFloat7;
    int i;
    if ((d1 < d2) && (d2 < d3) && (d3 < d4))
      i = 0;
    while (true)
    {
      this.bMO = i;
      addParam(new m.f("fh", this.bMH));
      addParam(new m.f("fs", this.bMI));
      addParam(new m.f("fv", this.bMJ));
      addParam(new m.f("flb", this.bMK));
      addParam(new m.f("fld", this.bML));
      addParam(new m.f("frd", this.bMM));
      addParam(new m.f("frb", this.bMN));
      addParam(new m.i("channelflag", this.bMO));
      this.glsl_programID = GLSLRender.bMe;
      AppMethodBeat.o(86383);
      return;
      if ((d1 < d2) && (d3 < d4) && (d1 > d4))
        i = 1;
      else if ((d1 > d4) && (d2 < d3) && (d3 < d4))
        i = 2;
      else if ((d1 < d2) && (d2 < d3) && (d1 > d4) && ((d1 != 303.0D) || (d2 != 323.0D)))
        i = 3;
      else
        i = -1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.filter.k
 * JD-Core Version:    0.6.2
 */