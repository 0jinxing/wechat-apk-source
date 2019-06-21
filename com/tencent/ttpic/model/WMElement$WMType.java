package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum WMElement$WMType
{
  public final int value;

  static
  {
    AppMethodBeat.i(83588);
    TEXT = new WMType("TEXT", 0, 1);
    IMAGE = new WMType("IMAGE", 1, 2);
    $VALUES = new WMType[] { TEXT, IMAGE };
    AppMethodBeat.o(83588);
  }

  private WMElement$WMType(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.WMElement.WMType
 * JD-Core Version:    0.6.2
 */