package com.tencent.mmkv;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum c
{
  static
  {
    AppMethodBeat.i(124051);
    AiN = new c("OnErrorDiscard", 0);
    AiO = new c("OnErrorRecover", 1);
    AiP = new c[] { AiN, AiO };
    AppMethodBeat.o(124051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mmkv.c
 * JD-Core Version:    0.6.2
 */