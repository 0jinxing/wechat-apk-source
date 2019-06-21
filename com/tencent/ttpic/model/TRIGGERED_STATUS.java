package com.tencent.ttpic.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum TRIGGERED_STATUS
{
  static
  {
    AppMethodBeat.i(83531);
    NOT_TRIGGERED = new TRIGGERED_STATUS("NOT_TRIGGERED", 0);
    TRIGGERED = new TRIGGERED_STATUS("TRIGGERED", 1);
    FIRST_TRIGGERED = new TRIGGERED_STATUS("FIRST_TRIGGERED", 2);
    $VALUES = new TRIGGERED_STATUS[] { NOT_TRIGGERED, TRIGGERED, FIRST_TRIGGERED };
    AppMethodBeat.o(83531);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.model.TRIGGERED_STATUS
 * JD-Core Version:    0.6.2
 */