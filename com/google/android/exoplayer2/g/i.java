package com.google.android.exoplayer2.g;

import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class i
{
  public final p bpG;
  public final g bpH;
  public final t[] bpI;
  public final Object info;

  public i(p paramp, g paramg, Object paramObject, t[] paramArrayOft)
  {
    this.bpG = paramp;
    this.bpH = paramg;
    this.info = paramObject;
    this.bpI = paramArrayOft;
  }

  public final boolean a(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(95785);
    if (parami == null)
      AppMethodBeat.o(95785);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= this.bpH.length)
          break label54;
        if (!a(parami, i))
        {
          AppMethodBeat.o(95785);
          break;
        }
      }
      label54: bool = true;
      AppMethodBeat.o(95785);
    }
  }

  public final boolean a(i parami, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(95786);
    if (parami == null)
      AppMethodBeat.o(95786);
    while (true)
    {
      return bool;
      if ((v.j(this.bpH.bpE[paramInt], parami.bpH.bpE[paramInt])) && (v.j(this.bpI[paramInt], parami.bpI[paramInt])))
      {
        bool = true;
        AppMethodBeat.o(95786);
      }
      else
      {
        AppMethodBeat.o(95786);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.i
 * JD-Core Version:    0.6.2
 */