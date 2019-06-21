package com.tencent.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class e extends BaseFilter
{
  float[] bJw;

  public e()
  {
    super(GLSLRender.bJI);
    AppMethodBeat.i(86353);
    this.bJw = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };
    addParam(new m.g("colorMat", this.bJw));
    addParam(new m.g("transMat", new float[] { 1.0F, 1.0F, 0.0F, 0.0F }));
    AppMethodBeat.o(86353);
  }

  public e(String paramString)
  {
    this();
    AppMethodBeat.i(86354);
    addParam(new m.o("inputImageTexture2", paramString, 33986));
    AppMethodBeat.o(86354);
  }

  public final void setMatrix(float[] paramArrayOfFloat)
  {
    AppMethodBeat.i(86355);
    addParam(new m.g("colorMat", paramArrayOfFloat));
    AppMethodBeat.o(86355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.filter.e
 * JD-Core Version:    0.6.2
 */