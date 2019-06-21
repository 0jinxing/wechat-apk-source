package org.xwalk.core;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum XWalkNavigationHistory$Direction
{
  static
  {
    AppMethodBeat.i(85716);
    BACKWARD = new Direction("BACKWARD", 0);
    FORWARD = new Direction("FORWARD", 1);
    $VALUES = new Direction[] { BACKWARD, FORWARD };
    AppMethodBeat.o(85716);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     org.xwalk.core.XWalkNavigationHistory.Direction
 * JD-Core Version:    0.6.2
 */