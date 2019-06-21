package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.f.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class e extends i
{
  private final d bmz;

  public e(d paramd)
  {
    this.bmz = paramd;
  }

  public final void release()
  {
    AppMethodBeat.i(95616);
    d locald = this.bmz;
    clear();
    locald.bmw.add(this);
    AppMethodBeat.o(95616);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.a.e
 * JD-Core Version:    0.6.2
 */