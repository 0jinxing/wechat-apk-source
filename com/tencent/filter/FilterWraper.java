package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class FilterWraper extends BaseFilter
{
  protected long bCj = 0L;
  private boolean bCk = false;
  protected String bJx = "";

  public FilterWraper(String paramString)
  {
    super(GLSLRender.bJB);
    this.bJx = paramString;
  }

  private static native void nativeDispose(long paramLong);

  private static native int nativeGetOutputText(long paramLong);

  private static native long nativeInitialWithString(String paramString);

  private static native void nativeRenderContext(long paramLong, int paramInt1, int paramInt2, int paramInt3);

  public void ApplyGLSLFilter(boolean paramBoolean, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(86358);
    if (this.bCk)
      nativeDispose(this.bCj);
    this.bCj = nativeInitialWithString(this.bJx);
    this.bCk = true;
    super.ApplyGLSLFilter(paramBoolean, paramFloat1, paramFloat2);
    AppMethodBeat.o(86358);
  }

  public void ClearGLSL()
  {
    AppMethodBeat.i(86361);
    if (this.bCk)
    {
      nativeDispose(this.bCj);
      this.bCk = false;
    }
    super.ClearGLSL();
    AppMethodBeat.o(86361);
  }

  public void beforeRender(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86359);
    if (this.bCk)
      nativeRenderContext(this.bCj, paramInt1, paramInt2, paramInt3);
    super.beforeRender(paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(86359);
  }

  public boolean renderTexture(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(86360);
    boolean bool;
    if (this.bCk)
    {
      bool = super.renderTexture(nativeGetOutputText(this.bCj), paramInt2, paramInt3);
      AppMethodBeat.o(86360);
    }
    while (true)
    {
      return bool;
      bool = super.renderTexture(paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(86360);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.filter.FilterWraper
 * JD-Core Version:    0.6.2
 */