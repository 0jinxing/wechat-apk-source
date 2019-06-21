package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum XWalkSettings$LayoutAlgorithm
{
  static
  {
    AppMethodBeat.i(85766);
    NORMAL = new LayoutAlgorithm("NORMAL", 0);
    SINGLE_COLUMN = new LayoutAlgorithm("SINGLE_COLUMN", 1);
    NARROW_COLUMNS = new LayoutAlgorithm("NARROW_COLUMNS", 2);
    TEXT_AUTOSIZING = new LayoutAlgorithm("TEXT_AUTOSIZING", 3);
    $VALUES = new LayoutAlgorithm[] { NORMAL, SINGLE_COLUMN, NARROW_COLUMNS, TEXT_AUTOSIZING };
    AppMethodBeat.o(85766);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkSettings.LayoutAlgorithm
 * JD-Core Version:    0.6.2
 */