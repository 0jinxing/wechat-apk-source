package com.facebook.share.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public enum LikeView$HorizontalAlignment
{
  static HorizontalAlignment DEFAULT;
  private int intValue;
  private String stringValue;

  static
  {
    AppMethodBeat.i(97635);
    CENTER = new HorizontalAlignment("CENTER", 0, "center", 0);
    LEFT = new HorizontalAlignment("LEFT", 1, "left", 1);
    RIGHT = new HorizontalAlignment("RIGHT", 2, "right", 2);
    $VALUES = new HorizontalAlignment[] { CENTER, LEFT, RIGHT };
    DEFAULT = CENTER;
    AppMethodBeat.o(97635);
  }

  private LikeView$HorizontalAlignment(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  static HorizontalAlignment fromInt(int paramInt)
  {
    AppMethodBeat.i(97633);
    HorizontalAlignment[] arrayOfHorizontalAlignment = values();
    int i = arrayOfHorizontalAlignment.length;
    int j = 0;
    HorizontalAlignment localHorizontalAlignment;
    if (j < i)
    {
      localHorizontalAlignment = arrayOfHorizontalAlignment[j];
      if (localHorizontalAlignment.getValue() == paramInt)
        AppMethodBeat.o(97633);
    }
    while (true)
    {
      return localHorizontalAlignment;
      j++;
      break;
      localHorizontalAlignment = null;
      AppMethodBeat.o(97633);
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
 * Qualified Name:     com.facebook.share.widget.LikeView.HorizontalAlignment
 * JD-Core Version:    0.6.2
 */