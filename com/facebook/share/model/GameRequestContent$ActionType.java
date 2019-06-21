package com.facebook.share.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum GameRequestContent$ActionType
{
  static
  {
    AppMethodBeat.i(97379);
    SEND = new ActionType("SEND", 0);
    ASKFOR = new ActionType("ASKFOR", 1);
    TURN = new ActionType("TURN", 2);
    $VALUES = new ActionType[] { SEND, ASKFOR, TURN };
    AppMethodBeat.o(97379);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.share.model.GameRequestContent.ActionType
 * JD-Core Version:    0.6.2
 */