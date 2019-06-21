package com.google.android.exoplayer2.h;

import android.net.Uri;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t<T>
  implements s.c
{
  private final f aSF;
  public final i bib;
  private final t.a<? extends T> bqU;
  private volatile boolean bqV;
  public volatile long bqW;
  public volatile T result;
  public final int type;

  public t(f paramf, Uri paramUri, t.a<? extends T> parama)
  {
    AppMethodBeat.i(95856);
    this.aSF = paramf;
    this.bib = new i(paramUri);
    this.type = 4;
    this.bqU = parama;
    AppMethodBeat.o(95856);
  }

  public final void se()
  {
    this.bqV = true;
  }

  public final boolean sf()
  {
    return this.bqV;
  }

  public final void sg()
  {
    AppMethodBeat.i(95857);
    h localh = new h(this.aSF, this.bib);
    try
    {
      localh.tn();
      this.result = this.bqU.b(this.aSF.getUri(), localh);
      return;
    }
    finally
    {
      this.bqW = localh.bpO;
      v.closeQuietly(localh);
      AppMethodBeat.o(95857);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.t
 * JD-Core Version:    0.6.2
 */