package com.google.android.exoplayer2.source.b;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.f.g.h;
import com.google.android.exoplayer2.i.s;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class l
  implements e
{
  private static final Pattern bjB;
  private static final Pattern bjC;
  private final String aOt;
  private final s aYf;
  private g baf;
  private final com.google.android.exoplayer2.i.l bjD;
  private byte[] bjE;
  private int sampleSize;

  static
  {
    AppMethodBeat.i(126008);
    bjB = Pattern.compile("LOCAL:([^,]+)");
    bjC = Pattern.compile("MPEGTS:(\\d+)");
    AppMethodBeat.o(126008);
  }

  public l(String paramString, s params)
  {
    AppMethodBeat.i(126002);
    this.aOt = paramString;
    this.aYf = params;
    this.bjD = new com.google.android.exoplayer2.i.l();
    this.bjE = new byte[1024];
    AppMethodBeat.o(126002);
  }

  private m ah(long paramLong)
  {
    AppMethodBeat.i(126007);
    m localm = this.baf.dM(0);
    localm.f(Format.a("text/vtt", this.aOt, paramLong));
    this.baf.rb();
    AppMethodBeat.o(126007);
    return localm;
  }

  public final int a(com.google.android.exoplayer2.c.f paramf, k paramk)
  {
    AppMethodBeat.i(126006);
    int i = (int)paramf.getLength();
    if (this.sampleSize == this.bjE.length)
    {
      paramk = this.bjE;
      if (i == -1)
        break label119;
    }
    label119: for (int j = i; ; j = this.bjE.length)
    {
      this.bjE = Arrays.copyOf(paramk, j * 3 / 2);
      j = paramf.read(this.bjE, this.sampleSize, this.bjE.length - this.sampleSize);
      if (j == -1)
        break;
      this.sampleSize = (j + this.sampleSize);
      if ((i != -1) && (this.sampleSize == i))
        break;
      j = 0;
      AppMethodBeat.o(126006);
      return j;
    }
    paramk = new com.google.android.exoplayer2.i.l(this.bjE);
    long l1;
    long l2;
    while (true)
    {
      Matcher localMatcher1;
      try
      {
        h.I(paramk);
        l1 = 0L;
        l2 = 0L;
        paramf = paramk.readLine();
        if (TextUtils.isEmpty(paramf))
          break;
        if (!paramf.startsWith("X-TIMESTAMP-MAP"))
          continue;
        localMatcher1 = bjB.matcher(paramf);
        if (!localMatcher1.find())
        {
          paramf = new o("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(String.valueOf(paramf)));
          AppMethodBeat.o(126006);
          throw paramf;
        }
      }
      catch (com.google.android.exoplayer2.f.f paramf)
      {
        paramf = new o(paramf);
        AppMethodBeat.o(126006);
        throw paramf;
      }
      Matcher localMatcher2 = bjC.matcher(paramf);
      if (!localMatcher2.find())
      {
        paramf = new o("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(String.valueOf(paramf)));
        AppMethodBeat.o(126006);
        throw paramf;
      }
      l1 = h.aD(localMatcher1.group(1));
      l2 = s.aq(Long.parseLong(localMatcher2.group(1)));
    }
    paramf = h.J(paramk);
    if (paramf == null)
      ah(0L);
    while (true)
    {
      j = -1;
      AppMethodBeat.o(126006);
      break;
      long l3 = h.aD(paramf.group(1));
      l1 = this.aYf.ao(s.ar(l2 + l3 - l1));
      paramf = ah(l1 - l3);
      this.bjD.n(this.bjE, this.sampleSize);
      paramf.a(this.bjD, this.sampleSize);
      paramf.a(l1, 1, this.sampleSize, 0, null);
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(126004);
    this.baf = paramg;
    paramg.a(new l.a(-9223372036854775807L));
    AppMethodBeat.o(126004);
  }

  public final boolean a(com.google.android.exoplayer2.c.f paramf)
  {
    AppMethodBeat.i(126003);
    paramf = new IllegalStateException();
    AppMethodBeat.o(126003);
    throw paramf;
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(126005);
    IllegalStateException localIllegalStateException = new IllegalStateException();
    AppMethodBeat.o(126005);
    throw localIllegalStateException;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.l
 * JD-Core Version:    0.6.2
 */