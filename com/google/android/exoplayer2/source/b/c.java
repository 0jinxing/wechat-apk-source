package com.google.android.exoplayer2.source.b;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.i.s;
import com.google.android.exoplayer2.i.u;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.source.b.a.a.a;
import com.google.android.exoplayer2.source.b.a.b.a;
import com.google.android.exoplayer2.source.b.a.e;
import com.google.android.exoplayer2.source.b.a.e.a;
import com.google.android.exoplayer2.source.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.math.BigInteger;
import java.util.IdentityHashMap;
import java.util.List;

final class c
{
  private byte[] aTc;
  private String biA;
  com.google.android.exoplayer2.g.f biB;
  private byte[] bil;
  private final com.google.android.exoplayer2.h.f bin;
  private final com.google.android.exoplayer2.h.f bio;
  private final k bip;
  private final a.a[] biq;
  private final e bir;
  final o bis;
  private final List<Format> bit;
  boolean biu;
  byte[] biv;
  IOException biw;
  private a.a bix;
  private boolean biy;
  private Uri biz;

  public c(e parame, a.a[] paramArrayOfa, d paramd, k paramk, List<Format> paramList)
  {
    AppMethodBeat.i(125903);
    this.bir = parame;
    this.biq = paramArrayOfa;
    this.bip = paramk;
    this.bit = paramList;
    parame = new Format[paramArrayOfa.length];
    paramk = new int[paramArrayOfa.length];
    for (int i = 0; i < paramArrayOfa.length; i++)
    {
      parame[i] = paramArrayOfa[i].aOv;
      paramk[i] = i;
    }
    this.bin = paramd.st();
    this.bio = paramd.st();
    this.bis = new o(parame);
    this.biB = new c.c(this.bis, paramk);
    AppMethodBeat.o(125903);
  }

  final void a(Uri paramUri, String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(125906);
    Object localObject;
    byte[] arrayOfByte;
    if (v.aR(paramString).startsWith("0x"))
    {
      localObject = paramString.substring(2);
      arrayOfByte = new BigInteger((String)localObject, 16).toByteArray();
      localObject = new byte[16];
      if (arrayOfByte.length <= 16)
        break label119;
    }
    label119: for (int i = arrayOfByte.length - 16; ; i = 0)
    {
      System.arraycopy(arrayOfByte, i, localObject, 16 - arrayOfByte.length + i, arrayOfByte.length - i);
      this.biz = paramUri;
      this.aTc = paramArrayOfByte;
      this.biA = paramString;
      this.bil = ((byte[])localObject);
      AppMethodBeat.o(125906);
      return;
      localObject = paramString;
      break;
    }
  }

  public final void a(f paramf, long paramLong, c.b paramb)
  {
    AppMethodBeat.i(125905);
    int i;
    long l1;
    int k;
    label56: Object localObject1;
    if (paramf == null)
    {
      i = -1;
      this.bix = null;
      if (paramf != null)
        break label206;
      l1 = 0L;
      this.biB.ag(l1);
      j = this.biB.th();
      if (i == j)
        break label241;
      k = 1;
      localObject1 = this.biq[j];
      localObject2 = (e.a)this.bir.bkC.get(localObject1);
      if (((e.a)localObject2).bkN == null)
        break label247;
      long l2 = SystemClock.elapsedRealtime();
      l1 = Math.max(30000L, com.google.android.exoplayer2.b.w(((e.a)localObject2).bkN.aOz));
      if ((!((e.a)localObject2).bkN.bjP) && (((e.a)localObject2).bkN.bjI != 2) && (((e.a)localObject2).bkN.bjI != 1) && (l1 + ((e.a)localObject2).bkO <= l2))
        break label247;
    }
    label206: label241: label247: for (int m = 1; ; m = 0)
    {
      if (m != 0)
        break label253;
      paramb.biF = ((a.a)localObject1);
      this.bix = ((a.a)localObject1);
      AppMethodBeat.o(125905);
      return;
      i = this.bis.j(paramf.bic);
      break;
      if (this.biy);
      for (l1 = paramf.big; ; l1 = paramf.bif)
      {
        l1 = Math.max(0L, l1 - paramLong);
        break;
      }
      k = 0;
      break label56;
    }
    label253: Object localObject2 = this.bir.c((a.a)localObject1);
    this.biy = ((com.google.android.exoplayer2.source.b.a.b)localObject2).bjO;
    Object localObject3;
    label334: boolean bool;
    if ((paramf == null) || (k != 0))
    {
      if (paramf == null);
      while (true)
      {
        if ((((com.google.android.exoplayer2.source.b.a.b)localObject2).bjP) || (paramLong < ((com.google.android.exoplayer2.source.b.a.b)localObject2).sC()))
          break label386;
        i = ((com.google.android.exoplayer2.source.b.a.b)localObject2).bjM + ((com.google.android.exoplayer2.source.b.a.b)localObject2).bjS.size();
        localObject3 = localObject2;
        localObject2 = localObject1;
        localObject1 = localObject3;
        if (i >= ((com.google.android.exoplayer2.source.b.a.b)localObject1).bjM)
          break label537;
        this.biw = new com.google.android.exoplayer2.source.b();
        AppMethodBeat.o(125905);
        break;
        if (this.biy)
          paramLong = paramf.big;
        else
          paramLong = paramf.bif;
      }
      label386: localObject3 = ((com.google.android.exoplayer2.source.b.a.b)localObject2).bjS;
      l1 = ((com.google.android.exoplayer2.source.b.a.b)localObject2).bif;
      if ((!this.bir.bkJ) || (paramf == null))
      {
        bool = true;
        label417: k = v.a((List)localObject3, Long.valueOf(paramLong - l1), bool) + ((com.google.android.exoplayer2.source.b.a.b)localObject2).bjM;
        if ((k >= ((com.google.android.exoplayer2.source.b.a.b)localObject2).bjM) || (paramf == null))
          break label1036;
        localObject1 = this.biq[i];
        localObject2 = this.bir.c((a.a)localObject1);
      }
    }
    for (int j = paramf.bih + 1; ; j = k)
    {
      localObject3 = localObject2;
      localObject2 = localObject1;
      k = i;
      i = j;
      localObject1 = localObject3;
      j = k;
      break label334;
      bool = false;
      break label417;
      i = paramf.bih + 1;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label334;
      label537: k = i - ((com.google.android.exoplayer2.source.b.a.b)localObject1).bjM;
      if (k >= ((com.google.android.exoplayer2.source.b.a.b)localObject1).bjS.size())
      {
        if (((com.google.android.exoplayer2.source.b.a.b)localObject1).bjP)
        {
          paramb.biE = true;
          AppMethodBeat.o(125905);
          break;
        }
        paramb.biF = ((a.a)localObject2);
        this.bix = ((a.a)localObject2);
        AppMethodBeat.o(125905);
        break;
      }
      b.a locala = (b.a)((com.google.android.exoplayer2.source.b.a.b)localObject1).bjS.get(k);
      if (locala.aZs)
      {
        localObject3 = u.m(((com.google.android.exoplayer2.source.b.a.b)localObject1).bjZ, locala.bjV);
        if (!((Uri)localObject3).equals(this.biz))
        {
          localObject1 = locala.bjW;
          i = this.biB.sv();
          paramf = this.biB.sw();
          localObject2 = new i((Uri)localObject3, (byte)0);
          paramb.biD = new c.a(this.bio, (i)localObject2, this.biq[j].aOv, i, paramf, this.biv, (String)localObject1);
          AppMethodBeat.o(125905);
          break;
        }
        if (!v.j(locala.bjW, this.biA))
          a((Uri)localObject3, locala.bjW, this.aTc);
        label772: localObject3 = ((com.google.android.exoplayer2.source.b.a.b)localObject1).bjR;
        if (localObject3 == null)
          break label1030;
      }
      label1030: for (localObject3 = new i(u.m(((com.google.android.exoplayer2.source.b.a.b)localObject1).bjZ, ((b.a)localObject3).url), ((b.a)localObject3).bjX, ((b.a)localObject3).bjY, null); ; localObject3 = null)
      {
        paramLong = ((com.google.android.exoplayer2.source.b.a.b)localObject1).bif + locala.bjU;
        j = ((com.google.android.exoplayer2.source.b.a.b)localObject1).bjL + locala.bjT;
        k localk = this.bip;
        s locals = (s)localk.bjA.get(j);
        if (locals == null)
        {
          locals = new s(9223372036854775807L);
          localk.bjA.put(j, locals);
        }
        while (true)
        {
          localObject1 = new i(u.m(((com.google.android.exoplayer2.source.b.a.b)localObject1).bjZ, locala.url), locala.bjX, locala.bjY, null);
          paramb.biD = new f(this.bin, (i)localObject1, (i)localObject3, (a.a)localObject2, this.bit, this.biB.sv(), this.biB.sw(), paramLong, paramLong + locala.aOz, i, j, this.biu, locals, paramf, this.aTc, this.bil);
          AppMethodBeat.o(125905);
          break;
          this.biz = null;
          this.aTc = null;
          this.biA = null;
          this.bil = null;
          break label772;
        }
      }
      label1036: i = j;
    }
  }

  public final void rW()
  {
    AppMethodBeat.i(125904);
    if (this.biw != null)
    {
      IOException localIOException = this.biw;
      AppMethodBeat.o(125904);
      throw localIOException;
    }
    if (this.bix != null)
      this.bir.d(this.bix);
    AppMethodBeat.o(125904);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.c
 * JD-Core Version:    0.6.2
 */