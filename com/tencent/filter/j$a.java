package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.view.g;

public final class j$a extends BaseFilter
{
  float bMG = 1.0F;
  float bMz = 25.0F;
  int paramTEXTRUEID = 0;

  public j$a(float paramFloat)
  {
    super(GLSLRender.bKf);
    this.bMG = paramFloat;
  }

  public final void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86373);
    this.paramTEXTRUEID = g.dSO();
    addParam(new m.f("strength", this.bMz));
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86373);
  }

  public final void ClearGLSL()
  {
    AppMethodBeat.i(86376);
    g.Sk(this.paramTEXTRUEID);
    super.ClearGLSL();
    AppMethodBeat.o(86376);
  }

  public final void V(float paramFloat)
  {
    AppMethodBeat.i(86372);
    this.bMz = paramFloat;
    addParam(new m.f("strength", this.bMz));
    AppMethodBeat.o(86372);
  }

  public final void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86374);
    QImage localQImage1 = g.aL(paramInt1, paramInt2, paramInt3);
    QImage localQImage2 = localQImage1.InplaceBlur8bitQImage(1, (int)(80.0F * this.bMG));
    localQImage1.Dispose();
    GLSLRender.nativeTextImage(localQImage2, this.paramTEXTRUEID);
    localQImage2.Dispose();
    AppMethodBeat.o(86374);
  }

  public final boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86375);
    setTextureParam(this.paramTEXTRUEID, 1);
    boolean bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(86375);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.filter.j.a
 * JD-Core Version:    0.6.2
 */