package com.tencent.mm.plugin.sns.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum j$a
{
  private int value = 0;

  static
  {
    AppMethodBeat.i(35767);
    qEK = new a("PlayIcon", 0, 1);
    qEL = new a("EnterFullScreen", 1, 2);
    qEM = new a("EnterCompleteVideo", 2, 3);
    qEN = new a("DetailInVideo", 3, 4);
    qEO = new a("LeavelFullScreen", 4, 5);
    qEP = new a("LeaveCompleteVideo", 5, 6);
    qEQ = new a("SightLoaded", 6, 7);
    qER = new a("DetailTimeline", 7, 8);
    qES = new a[] { qEK, qEL, qEM, qEN, qEO, qEP, qEQ, qER };
    AppMethodBeat.o(35767);
  }

  private j$a(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.a.b.j.a
 * JD-Core Version:    0.6.2
 */