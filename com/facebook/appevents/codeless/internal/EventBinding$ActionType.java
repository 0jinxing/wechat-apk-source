package com.facebook.appevents.codeless.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum EventBinding$ActionType
{
  static
  {
    AppMethodBeat.i(72093);
    CLICK = new ActionType("CLICK", 0);
    SELECTED = new ActionType("SELECTED", 1);
    TEXT_CHANGED = new ActionType("TEXT_CHANGED", 2);
    $VALUES = new ActionType[] { CLICK, SELECTED, TEXT_CHANGED };
    AppMethodBeat.o(72093);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.internal.EventBinding.ActionType
 * JD-Core Version:    0.6.2
 */