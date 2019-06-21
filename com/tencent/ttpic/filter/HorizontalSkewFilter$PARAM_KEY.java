package com.tencent.ttpic.filter;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum HorizontalSkewFilter$PARAM_KEY
{
  public final String value;

  static
  {
    AppMethodBeat.i(82604);
    ADJUST = new PARAM_KEY("ADJUST", 0, "adjust");
    $VALUES = new PARAM_KEY[] { ADJUST };
    AppMethodBeat.o(82604);
  }

  private HorizontalSkewFilter$PARAM_KEY(String paramString)
  {
    this.value = paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.filter.HorizontalSkewFilter.PARAM_KEY
 * JD-Core Version:    0.6.2
 */