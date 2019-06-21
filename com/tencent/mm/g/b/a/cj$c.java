package com.tencent.mm.g.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum cj$c
{
  final int value;

  static
  {
    AppMethodBeat.i(128865);
    dgI = new c("sync", 0, 0);
    dgJ = new c("unsync", 1, 1);
    dgK = new c[] { dgI, dgJ };
    AppMethodBeat.o(128865);
  }

  private cj$c(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.b.a.cj.c
 * JD-Core Version:    0.6.2
 */