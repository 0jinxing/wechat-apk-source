package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.f.a;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.w.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
  implements f.c, i
{
  private final w.a aMW;
  private final int bgC;
  private final g.a bgD;
  private final String bgG;
  private i.a bgz;
  private final f.a bhk;
  private final com.google.android.exoplayer2.c.h bhl;
  private final int bhm;
  private long bhn;
  private boolean bho;
  private final Handler eventHandler;
  private final Uri uri;

  public g(Uri paramUri, f.a parama, com.google.android.exoplayer2.c.h paramh)
  {
    this(paramUri, parama, paramh, (byte)0);
  }

  private g(Uri paramUri, f.a parama, com.google.android.exoplayer2.c.h paramh, byte paramByte)
  {
    this(paramUri, parama, paramh, '\000');
  }

  private g(Uri paramUri, f.a parama, com.google.android.exoplayer2.c.h paramh, char paramChar)
  {
    AppMethodBeat.i(95506);
    this.uri = paramUri;
    this.bhk = parama;
    this.bhl = paramh;
    this.bgC = -1;
    this.eventHandler = null;
    this.bgD = null;
    this.bgG = null;
    this.bhm = 1048576;
    this.aMW = new w.a();
    AppMethodBeat.o(95506);
  }

  private void f(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95511);
    this.bhn = paramLong;
    this.bho = paramBoolean;
    this.bgz.a(new n(this.bhn, this.bho), null);
    AppMethodBeat.o(95511);
  }

  public final h a(i.b paramb, b paramb1)
  {
    AppMethodBeat.i(95508);
    if (paramb.bhq == 0);
    for (boolean bool = true; ; bool = false)
    {
      a.checkArgument(bool);
      paramb = new f(this.uri, this.bhk.tm(), this.bhl.ra(), this.bgC, this.eventHandler, this.bgD, this, paramb1, this.bgG, this.bhm);
      AppMethodBeat.o(95508);
      return paramb;
    }
  }

  public final void a(com.google.android.exoplayer2.f paramf, i.a parama)
  {
    AppMethodBeat.i(95507);
    this.bgz = parama;
    f(-9223372036854775807L, false);
    AppMethodBeat.o(95507);
  }

  public final void b(h paramh)
  {
    AppMethodBeat.i(95509);
    f localf = (f)paramh;
    boolean bool = localf.bgI.a(localf);
    if ((localf.prepared) && (!bool))
    {
      paramh = localf.bgO;
      int i = paramh.length;
      for (int j = 0; j < i; j++)
        paramh[j].sq();
    }
    localf.handler.removeCallbacksAndMessages(null);
    localf.released = true;
    AppMethodBeat.o(95509);
  }

  public final void e(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95510);
    long l = paramLong;
    if (paramLong == -9223372036854775807L)
      l = this.bhn;
    if (((this.bhn == l) && (this.bho == paramBoolean)) || ((this.bhn != -9223372036854775807L) && (l == -9223372036854775807L)))
      AppMethodBeat.o(95510);
    while (true)
    {
      return;
      f(l, paramBoolean);
      AppMethodBeat.o(95510);
    }
  }

  public final void rX()
  {
  }

  public final void rY()
  {
    this.bgz = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.g
 * JD-Core Version:    0.6.2
 */