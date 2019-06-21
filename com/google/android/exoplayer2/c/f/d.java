package com.google.android.exoplayer2.c.f;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.c;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.Collections;

public final class d
  implements h
{
  private static final byte[] bbt = { 73, 68, 51 };
  private final String aOt;
  long aSk;
  private boolean aTf;
  private m aTw;
  private boolean bbA;
  private m bbB;
  private long bbC;
  private int bbo;
  private long bbq;
  private final boolean bbu;
  private final k bbv;
  private final l bbw;
  private String bbx;
  private m bby;
  private int bbz;
  private int sampleSize;
  private int state;

  public d()
  {
    this(true, null);
  }

  public d(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(95088);
    this.bbv = new k(new byte[7]);
    this.bbw = new l(Arrays.copyOf(bbt, 10));
    rq();
    this.bbu = paramBoolean;
    this.aOt = paramString;
    AppMethodBeat.o(95088);
  }

  private void a(m paramm, long paramLong, int paramInt1, int paramInt2)
  {
    this.state = 3;
    this.bbo = paramInt1;
    this.bbB = paramm;
    this.bbC = paramLong;
    this.sampleSize = paramInt2;
  }

  private boolean a(l paraml, byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(95092);
    int i = Math.min(paraml.tB(), paramInt - this.bbo);
    paraml.readBytes(paramArrayOfByte, this.bbo, i);
    this.bbo = (i + this.bbo);
    boolean bool;
    if (this.bbo == paramInt)
    {
      bool = true;
      AppMethodBeat.o(95092);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95092);
    }
  }

  private void rr()
  {
    AppMethodBeat.i(95093);
    this.state = 1;
    this.bbo = bbt.length;
    this.sampleSize = 0;
    this.bbw.setPosition(0);
    AppMethodBeat.o(95093);
  }

  private void rs()
  {
    this.state = 2;
    this.bbo = 0;
  }

  private void rt()
  {
    AppMethodBeat.i(95095);
    this.bby.a(this.bbw, 10);
    this.bbw.setPosition(6);
    a(this.bby, 0L, 10, this.bbw.tH() + 10);
    AppMethodBeat.o(95095);
  }

  private void ru()
  {
    int i = 2;
    AppMethodBeat.i(95096);
    this.bbv.setPosition(0);
    int j;
    if (!this.aTf)
    {
      j = this.bbv.ed(2) + 1;
      if (j == 2)
        break label232;
      new StringBuilder("Detected audio object type: ").append(j).append(", but assuming AAC LC.");
    }
    while (true)
    {
      j = this.bbv.ed(4);
      this.bbv.ee(1);
      Object localObject = c.t(i, j, this.bbv.ed(3));
      Pair localPair = c.q((byte[])localObject);
      localObject = Format.a(this.bbx, "audio/mp4a-latm", -1, -1, ((Integer)localPair.second).intValue(), ((Integer)localPair.first).intValue(), Collections.singletonList(localObject), null, this.aOt);
      this.bbq = (1024000000L / ((Format)localObject).sampleRate);
      this.aTw.f((Format)localObject);
      this.aTf = true;
      while (true)
      {
        this.bbv.ee(4);
        j = this.bbv.ed(13) - 2 - 5;
        i = j;
        if (this.bbA)
          i = j - 2;
        a(this.aTw, this.bbq, 0, i);
        AppMethodBeat.o(95096);
        return;
        this.bbv.ee(10);
      }
      label232: i = j;
    }
  }

  private void v(l paraml)
  {
    AppMethodBeat.i(95094);
    byte[] arrayOfByte = paraml.data;
    int i = paraml.position;
    int j = paraml.limit;
    while (true)
    {
      int k;
      boolean bool;
      if (i < j)
      {
        k = i + 1;
        i = arrayOfByte[i] & 0xFF;
        if ((this.bbz == 512) && (i >= 240) && (i != 255))
          if ((i & 0x1) == 0)
          {
            bool = true;
            label73: this.bbA = bool;
            rs();
            paraml.setPosition(k);
            AppMethodBeat.o(95094);
          }
      }
      while (true)
      {
        return;
        bool = false;
        break label73;
        switch (i | this.bbz)
        {
        default:
          if (this.bbz == 256)
            break label243;
          this.bbz = 256;
          i = k - 1;
          break;
        case 511:
          this.bbz = 512;
          i = k;
          break;
        case 329:
          this.bbz = 768;
          i = k;
          break;
        case 836:
          this.bbz = 1024;
          i = k;
          break;
        case 1075:
          rr();
          paraml.setPosition(k);
          AppMethodBeat.o(95094);
          continue;
          paraml.setPosition(i);
          AppMethodBeat.o(95094);
        }
      }
      label243: i = k;
    }
  }

  private void w(l paraml)
  {
    AppMethodBeat.i(95097);
    int i = Math.min(paraml.tB(), this.sampleSize - this.bbo);
    this.bbB.a(paraml, i);
    this.bbo = (i + this.bbo);
    if (this.bbo == this.sampleSize)
    {
      this.bbB.a(this.aSk, 1, this.sampleSize, 0, null);
      this.aSk += this.bbC;
      rq();
    }
    AppMethodBeat.o(95097);
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95090);
    paramd.rz();
    this.bbx = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    if (this.bbu)
    {
      paramd.rz();
      this.bby = paramg.dM(paramd.rA());
      this.bby.f(Format.k(paramd.rB(), "application/id3"));
      AppMethodBeat.o(95090);
    }
    while (true)
    {
      return;
      this.bby = new com.google.android.exoplayer2.c.d();
      AppMethodBeat.o(95090);
    }
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.aSk = paramLong;
  }

  public final void rn()
  {
    AppMethodBeat.i(138587);
    rq();
    AppMethodBeat.o(138587);
  }

  public final void ro()
  {
  }

  final void rq()
  {
    this.state = 0;
    this.bbo = 0;
    this.bbz = 256;
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95091);
    while (paraml.tB() > 0)
      switch (this.state)
      {
      default:
        break;
      case 0:
        v(paraml);
        break;
      case 1:
        if (a(paraml, this.bbw.data, 10))
          rt();
        break;
      case 2:
        if (this.bbA);
        for (int i = 7; a(paraml, this.bbv.data, i); i = 5)
        {
          ru();
          break;
        }
      case 3:
        w(paraml);
      }
    AppMethodBeat.o(95091);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.d
 * JD-Core Version:    0.6.2
 */