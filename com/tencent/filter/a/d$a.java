package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.GLSLRender;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d$a extends BaseFilter
{
  int aIV;
  int aIW;
  boolean bNL;
  public boolean bNM = true;
  float radius = 0.5F;

  public d$a(boolean paramBoolean)
  {
    super(GLSLRender.bJB);
    this.bNL = paramBoolean;
  }

  private void wG()
  {
    AppMethodBeat.i(86431);
    float f = Math.round(this.radius * 10.0F / 720.0F * this.aIV);
    int i;
    if (f >= 1.0F)
    {
      i = (int)Math.floor(Math.sqrt(-2.0D * Math.pow(f, 2.0D) * Math.log(0.00390625D * Math.sqrt(6.283185307179586D * Math.pow(f, 2.0D)))));
      i += i % 2;
    }
    while (true)
    {
      updateFragmentShader(aj.b(i, f, this.bNL, this.bNL));
      clearGLSLSelf();
      ApplyGLSLFilter();
      this.bNM = false;
      AppMethodBeat.o(86431);
      return;
      i = 0;
    }
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86432);
    this.aIV = ((int)paramFloat1);
    this.aIW = ((int)paramFloat2);
    wG();
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86432);
  }

  public final void X(float paramFloat)
  {
    this.radius = paramFloat;
    this.bNM = true;
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86433);
    if ((this.bNM) || (this.aIV != paramInt2) || (this.aIW != paramInt3));
    for (boolean bool = true; ; bool = false)
    {
      this.bNM = bool;
      if (this.bNM)
      {
        this.aIV = paramInt2;
        this.aIW = paramInt3;
        wG();
      }
      AppMethodBeat.o(86433);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.d.a
 * JD-Core Version:    0.6.2
 */