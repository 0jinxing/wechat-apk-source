package com.tencent.filter.a;

import com.tencent.filter.BaseFilter;
import com.tencent.filter.FilterAlgorithm;
import com.tencent.filter.GLSLRender;
import com.tencent.filter.QImage;
import com.tencent.filter.m.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class k extends BaseFilter
{
  float bMG = 1.0F;
  int paramTEXTRUEID = 0;

  public k(float paramFloat)
  {
    super(GLSLRender.bLL);
    this.bMG = paramFloat;
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86448);
    this.paramTEXTRUEID = g.dSO();
    addParam(new m.f("edge", 0.5F));
    addParam(new m.f("vmin", 0.0F));
    addParam(new m.f("vmax", 1.0F));
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86448);
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86451);
    g.Sk(this.paramTEXTRUEID);
    super.ClearGLSL();
    AppMethodBeat.o(86451);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86449);
    QImage localQImage1 = g.aL(paramInt1, paramInt2, paramInt3);
    QImage localQImage2 = localQImage1.InplaceBlur8bitQImage(1, (int)(80.0F * this.bMG));
    float[] arrayOfFloat = FilterAlgorithm.nativeGetMaxAndMin(localQImage2);
    localQImage1.Dispose();
    addParam(new m.f("edge", (arrayOfFloat[0] + arrayOfFloat[1]) / 510.0F));
    addParam(new m.f("vmin", arrayOfFloat[0] / 255.0F));
    addParam(new m.f("vmax", arrayOfFloat[1] / 255.0F));
    GLSLRender.nativeTextImage(localQImage2, this.paramTEXTRUEID);
    localQImage2.Dispose();
    AppMethodBeat.o(86449);
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86450);
    boolean bool = super.renderTexture(this.paramTEXTRUEID, paramInt2, paramInt3);
    AppMethodBeat.o(86450);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.a.k
 * JD-Core Version:    0.6.2
 */