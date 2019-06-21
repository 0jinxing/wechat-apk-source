package com.facebook.login.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum LoginButton$ToolTipMode
{
  public static ToolTipMode DEFAULT;
  private int intValue;
  private String stringValue;

  static
  {
    AppMethodBeat.i(92646);
    AUTOMATIC = new ToolTipMode("AUTOMATIC", 0, "automatic", 0);
    DISPLAY_ALWAYS = new ToolTipMode("DISPLAY_ALWAYS", 1, "display_always", 1);
    NEVER_DISPLAY = new ToolTipMode("NEVER_DISPLAY", 2, "never_display", 2);
    $VALUES = new ToolTipMode[] { AUTOMATIC, DISPLAY_ALWAYS, NEVER_DISPLAY };
    DEFAULT = AUTOMATIC;
    AppMethodBeat.o(92646);
  }

  private LoginButton$ToolTipMode(String paramString, int paramInt)
  {
    this.stringValue = paramString;
    this.intValue = paramInt;
  }

  public static ToolTipMode fromInt(int paramInt)
  {
    AppMethodBeat.i(92645);
    ToolTipMode[] arrayOfToolTipMode = values();
    int i = arrayOfToolTipMode.length;
    int j = 0;
    ToolTipMode localToolTipMode;
    if (j < i)
    {
      localToolTipMode = arrayOfToolTipMode[j];
      if (localToolTipMode.getValue() == paramInt)
        AppMethodBeat.o(92645);
    }
    while (true)
    {
      return localToolTipMode;
      j++;
      break;
      localToolTipMode = null;
      AppMethodBeat.o(92645);
    }
  }

  public final int getValue()
  {
    return this.intValue;
  }

  public final String toString()
  {
    return this.stringValue;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.login.widget.LoginButton.ToolTipMode
 * JD-Core Version:    0.6.2
 */