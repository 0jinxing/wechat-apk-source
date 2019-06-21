package com.google.android.exoplayer2.source.b;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.h.f.a;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.h.t;
import com.google.android.exoplayer2.h.t.a;
import com.google.android.exoplayer2.source.a.a;
import com.google.android.exoplayer2.source.b.a.b.a;
import com.google.android.exoplayer2.source.b.a.c;
import com.google.android.exoplayer2.source.b.a.e.a;
import com.google.android.exoplayer2.source.b.a.e.e;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.i.a;
import com.google.android.exoplayer2.source.i.b;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.w;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public final class h
  implements e.e, i
{
  private final int bgC;
  private i.a bgz;
  private com.google.android.exoplayer2.source.b.a.e bir;
  private final d bjb;
  private final a.a bjc;
  private final Uri bjj;
  private final t.a<c> bjk;

  static
  {
    AppMethodBeat.i(125936);
    com.google.android.exoplayer2.j.ar("goog.exo.hls");
    AppMethodBeat.o(125936);
  }

  public h(Uri paramUri, f.a parama, Handler paramHandler, com.google.android.exoplayer2.source.a parama1)
  {
    this(paramUri, parama, paramHandler, parama1, (byte)0);
  }

  private h(Uri paramUri, f.a parama, Handler paramHandler, com.google.android.exoplayer2.source.a parama1, byte paramByte)
  {
    this(paramUri, new b(parama), paramHandler, parama1);
    AppMethodBeat.i(125927);
    AppMethodBeat.o(125927);
  }

  private h(Uri paramUri, d paramd, Handler paramHandler, com.google.android.exoplayer2.source.a parama)
  {
    this(paramUri, paramd, paramHandler, parama, new com.google.android.exoplayer2.source.b.a.d());
    AppMethodBeat.i(125928);
    AppMethodBeat.o(125928);
  }

  private h(Uri paramUri, d paramd, Handler paramHandler, com.google.android.exoplayer2.source.a parama, t.a<c> parama1)
  {
    AppMethodBeat.i(125929);
    this.bjj = paramUri;
    this.bjb = paramd;
    this.bgC = 3;
    this.bjk = parama1;
    this.bjc = new a.a(paramHandler, parama);
    AppMethodBeat.o(125929);
  }

  public final com.google.android.exoplayer2.source.h a(i.b paramb, com.google.android.exoplayer2.h.b paramb1)
  {
    AppMethodBeat.i(125932);
    if (paramb.bhq == 0);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkArgument(bool);
      paramb = new g(this.bir, this.bjb, this.bgC, this.bjc, paramb1);
      AppMethodBeat.o(125932);
      return paramb;
    }
  }

  public final void a(f paramf, i.a parama)
  {
    AppMethodBeat.i(125930);
    if (this.bir == null);
    for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkState(bool);
      this.bir = new com.google.android.exoplayer2.source.b.a.e(this.bjj, this.bjb, this.bjc, this.bgC, this, this.bjk);
      this.bgz = parama;
      paramf = this.bir;
      parama = new t(paramf.bjb.st(), paramf.bkA, paramf.bjk);
      paramf.bkG.a(parama, paramf, paramf.bkB);
      AppMethodBeat.o(125930);
      return;
    }
  }

  public final void a(com.google.android.exoplayer2.source.b.a.b paramb)
  {
    AppMethodBeat.i(125935);
    long l1;
    long l2;
    label30: long l3;
    long l4;
    label68: long l5;
    label100: long l6;
    boolean bool;
    if (paramb.bjQ)
    {
      l1 = 0L;
      if (!paramb.bjQ)
        break label188;
      l2 = com.google.android.exoplayer2.b.w(paramb.bif);
      l3 = paramb.bjJ;
      if (!this.bir.bkJ)
        break label241;
      if (!paramb.bjP)
        break label196;
      l4 = paramb.bif;
      l4 = paramb.aOz + l4;
      localObject = paramb.bjS;
      l5 = l3;
      if (l3 == -9223372036854775807L)
      {
        if (!((List)localObject).isEmpty())
          break label204;
        l3 = 0L;
        l5 = l3;
      }
      l6 = paramb.aOz;
      l3 = paramb.bif;
      if (paramb.bjP)
        break label235;
      bool = true;
    }
    label126: for (Object localObject = new n(l1, l2, l4, l6, l3, l5, true, bool); ; localObject = new n(l1, l2, paramb.bif + paramb.aOz, paramb.aOz, paramb.bif, l4, true, false))
    {
      this.bgz.a((w)localObject, new e(this.bir.biH, paramb));
      AppMethodBeat.o(125935);
      return;
      l1 = -9223372036854775807L;
      break;
      l2 = -9223372036854775807L;
      break label30;
      l4 = -9223372036854775807L;
      break label68;
      l3 = ((b.a)((List)localObject).get(Math.max(0, ((List)localObject).size() - 3))).bjU;
      break label100;
      bool = false;
      break label126;
      l4 = l3;
      if (l3 == -9223372036854775807L)
        l4 = 0L;
    }
  }

  public final void b(com.google.android.exoplayer2.source.h paramh)
  {
    AppMethodBeat.i(125933);
    paramh = (g)paramh;
    paramh.bir.bkF.remove(paramh);
    paramh.bje.removeCallbacksAndMessages(null);
    for (paramh : paramh.bjg)
    {
      boolean bool = paramh.bgI.a(paramh);
      if ((paramh.prepared) && (!bool))
      {
        k[] arrayOfk = paramh.bgO;
        int k = arrayOfk.length;
        for (int m = 0; m < k; m++)
          arrayOfk[m].sq();
      }
      paramh.handler.removeCallbacksAndMessages(null);
      paramh.released = true;
    }
    AppMethodBeat.o(125933);
  }

  public final void rX()
  {
    AppMethodBeat.i(125931);
    com.google.android.exoplayer2.source.b.a.e locale = this.bir;
    if (locale.bkH != null)
      locale.d(locale.bkH);
    AppMethodBeat.o(125931);
  }

  public final void rY()
  {
    AppMethodBeat.i(125934);
    if (this.bir != null)
    {
      com.google.android.exoplayer2.source.b.a.e locale = this.bir;
      locale.bkG.a(null);
      Iterator localIterator = locale.bkC.values().iterator();
      while (localIterator.hasNext())
        ((e.a)localIterator.next()).bkL.a(null);
      locale.bkD.removeCallbacksAndMessages(null);
      locale.bkC.clear();
      this.bir = null;
    }
    this.bgz = null;
    AppMethodBeat.o(125934);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.h
 * JD-Core Version:    0.6.2
 */