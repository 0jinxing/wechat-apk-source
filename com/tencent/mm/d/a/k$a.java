package com.tencent.mm.d.a;

import com.eclipsesource.v8.SharedV8ArrayBuffer;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;

final class k$a
{
  final l chK;
  ByteBuffer chL;
  SharedV8ArrayBuffer chM;
  private final int mCapacity;

  k$a(int paramInt, l paraml)
  {
    AppMethodBeat.i(113829);
    this.chK = paraml;
    this.mCapacity = paramInt;
    this.chL = ByteBuffer.allocateDirect(this.mCapacity);
    this.chM = null;
    AppMethodBeat.o(113829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.d.a.k.a
 * JD-Core Version:    0.6.2
 */