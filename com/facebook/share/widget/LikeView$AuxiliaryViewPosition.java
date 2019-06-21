package com.facebook.share.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public enum LikeView$AuxiliaryViewPosition
{
  static AuxiliaryViewPosition DEFAULT;
  private int intValue;
  private String stringValue;

  static
  {
    AppMethodBeat.i(97630);
    BOTTOM = new AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
    INLINE = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
    TOP = new AuxiliaryViewPosition("TOP", 2, "top", 2);
    $VALUES = new AuxiliaryViewPosition[] { BOTTOM, INLINE, TOP };
    DEFAULT = BOTTOM;
    AppMethodBeat.o(97630);
  }

  private LikeView$AuxiliaryViewPosition(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  static AuxiliaryViewPosition fromInt(int paramInt)
  {
    AppMethodBeat.i(97628);
    AuxiliaryViewPosition[] arrayOfAuxiliaryViewPosition = values();
    int i = arrayOfAuxiliaryViewPosition.length;
    int j = 0;
    AuxiliaryViewPosition localAuxiliaryViewPosition;
    if (j < i)
    {
      localAuxiliaryViewPosition = arrayOfAuxiliaryViewPosition[j];
      if (localAuxiliaryViewPosition.getValue() == paramInt)
        AppMethodBeat.o(97628);
    }
    while (true)
    {
      return localAuxiliaryViewPosition;
      j++;
      break;
      localAuxiliaryViewPosition = null;
      AppMethodBeat.o(97628);
    }
  }

  private int getValue()
  {
    return this.intValue;
  }

  public final String toString()
  {
    return this.stringValue;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.LikeView.AuxiliaryViewPosition
 * JD-Core Version:    0.6.2
 */