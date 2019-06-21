package com.tenpay.bankcard;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum TenpaySegmentEditText$EditState
{
  static
  {
    AppMethodBeat.i(49523);
    DEFAULT = new EditState("DEFAULT", 0);
    BANKCARD = new EditState("BANKCARD", 1);
    BANKCARD_WITH_TAILNUM = new EditState("BANKCARD_WITH_TAILNUM", 2);
    $VALUES = new EditState[] { DEFAULT, BANKCARD, BANKCARD_WITH_TAILNUM };
    AppMethodBeat.o(49523);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tenpay.bankcard.TenpaySegmentEditText.EditState
 * JD-Core Version:    0.6.2
 */