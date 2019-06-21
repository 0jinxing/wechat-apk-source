package com.tencent.ttpic.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum SnakeFaceFilter$SHADER_FIELD
{
  public String name;

  static
  {
    AppMethodBeat.i(82941);
    NPOINT = new SHADER_FIELD("NPOINT", 0, "nPoint");
    FSRC = new SHADER_FIELD("FSRC", 1, "fSrc");
    FDST = new SHADER_FIELD("FDST", 2, "fDst");
    $VALUES = new SHADER_FIELD[] { NPOINT, FSRC, FDST };
    AppMethodBeat.o(82941);
  }

  private SnakeFaceFilter$SHADER_FIELD(String paramString)
  {
    this.name = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.SnakeFaceFilter.SHADER_FIELD
 * JD-Core Version:    0.6.2
 */