package com.tencent.g;

import com.tencent.g.b.a;
import com.tencent.g.b.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
  implements com.tencent.g.b.b
{
  private f AHI;
  d AHJ;
  b AHK;
  a AHL;
  int mReferenceCount = 0;
  int mState;

  public g(f paramf, d paramd)
  {
    this.AHI = paramf;
    this.AHJ = paramd;
  }

  public final void start()
  {
    AppMethodBeat.i(127761);
    this.AHI.a(this);
    AppMethodBeat.o(127761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.g.g
 * JD-Core Version:    0.6.2
 */