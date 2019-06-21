package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum WebSettings$LayoutAlgorithm
{
  static
  {
    AppMethodBeat.i(64711);
    NORMAL = new LayoutAlgorithm("NORMAL", 0);
    SINGLE_COLUMN = new LayoutAlgorithm("SINGLE_COLUMN", 1);
    NARROW_COLUMNS = new LayoutAlgorithm("NARROW_COLUMNS", 2);
    $VALUES = new LayoutAlgorithm[] { NORMAL, SINGLE_COLUMN, NARROW_COLUMNS };
    AppMethodBeat.o(64711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.WebSettings.LayoutAlgorithm
 * JD-Core Version:    0.6.2
 */