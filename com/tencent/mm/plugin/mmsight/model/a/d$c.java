package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum d$c
{
  static
  {
    AppMethodBeat.i(60315);
    ovA = new c("WaitStart", 0);
    ovB = new c("Start", 1);
    ovC = new c("PrepareStop", 2);
    ovD = new c("WaitStop", 3);
    ovE = new c("Stop", 4);
    ovF = new c("WaitSend", 5);
    ovG = new c("Sent", 6);
    ovH = new c("Error", 7);
    ovI = new c("Initialized", 8);
    ovJ = new c("Pause", 9);
    ovK = new c[] { ovA, ovB, ovC, ovD, ovE, ovF, ovG, ovH, ovI, ovJ };
    AppMethodBeat.o(60315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.d.c
 * JD-Core Version:    0.6.2
 */