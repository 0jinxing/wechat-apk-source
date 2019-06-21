package com.facebook.share.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public enum LikeView$Style
{
  static Style DEFAULT;
  private int intValue;
  private String stringValue;

  static
  {
    AppMethodBeat.i(97646);
    STANDARD = new Style("STANDARD", 0, "standard", 0);
    BUTTON = new Style("BUTTON", 1, "button", 1);
    BOX_COUNT = new Style("BOX_COUNT", 2, "box_count", 2);
    $VALUES = new Style[] { STANDARD, BUTTON, BOX_COUNT };
    DEFAULT = STANDARD;
    AppMethodBeat.o(97646);
  }

  private LikeView$Style(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  static Style fromInt(int paramInt)
  {
    AppMethodBeat.i(97644);
    Style[] arrayOfStyle = values();
    int i = arrayOfStyle.length;
    int j = 0;
    Style localStyle;
    if (j < i)
    {
      localStyle = arrayOfStyle[j];
      if (localStyle.getValue() == paramInt)
        AppMethodBeat.o(97644);
    }
    while (true)
    {
      return localStyle;
      j++;
      break;
      localStyle = null;
      AppMethodBeat.o(97644);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.share.widget.LikeView.Style
 * JD-Core Version:    0.6.2
 */