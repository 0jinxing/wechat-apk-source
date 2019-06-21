package com.tencent.smtt.export.external.interfaces;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum IX5WebSettings$TextSize
{
  int value;

  static
  {
    AppMethodBeat.i(63812);
    SMALLEST = new TextSize("SMALLEST", 0, 50);
    SMALLER = new TextSize("SMALLER", 1, 75);
    NORMAL = new TextSize("NORMAL", 2, 100);
    LARGER = new TextSize("LARGER", 3, 125);
    LARGEST = new TextSize("LARGEST", 4, 150);
    $VALUES = new TextSize[] { SMALLEST, SMALLER, NORMAL, LARGER, LARGEST };
    AppMethodBeat.o(63812);
  }

  private IX5WebSettings$TextSize(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.export.external.interfaces.IX5WebSettings.TextSize
 * JD-Core Version:    0.6.2
 */