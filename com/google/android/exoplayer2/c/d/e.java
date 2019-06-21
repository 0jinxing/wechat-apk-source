package com.google.android.exoplayer2.c.d;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.i.s;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class e
  implements com.google.android.exoplayer2.c.e
{
  public static final com.google.android.exoplayer2.c.h aTh;
  private static final int aXX;
  private static final byte[] aXY;
  private long aOz;
  private com.google.android.exoplayer2.c.g aTn;
  private int aTo;
  private final com.google.android.exoplayer2.i.l aTx;
  private int aUF;
  private int aUG;
  private final j aXZ;
  private final SparseArray<e.b> aYa;
  private final com.google.android.exoplayer2.i.l aYb;
  private final com.google.android.exoplayer2.i.l aYc;
  private final com.google.android.exoplayer2.i.l aYd;
  private final com.google.android.exoplayer2.i.l aYe;
  private final s aYf;
  private final com.google.android.exoplayer2.i.l aYg;
  private final byte[] aYh;
  private final Stack<a.a> aYi;
  private final LinkedList<e.a> aYj;
  private int aYk;
  private long aYl;
  private int aYm;
  private com.google.android.exoplayer2.i.l aYn;
  private long aYo;
  private int aYp;
  private long aYq;
  private e.b aYr;
  private boolean aYs;
  private m aYt;
  private m[] aYu;
  private boolean aYv;
  private final int flags;
  private int sampleSize;

  static
  {
    AppMethodBeat.i(94989);
    aTh = new e.1();
    aXX = v.aT("seig");
    aXY = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
    AppMethodBeat.o(94989);
  }

  public e()
  {
    this(0);
  }

  public e(int paramInt)
  {
    this(paramInt, null);
  }

  public e(int paramInt, s params)
  {
    this(paramInt, params, (byte)0);
  }

  private e(int paramInt, s params, byte paramByte)
  {
    AppMethodBeat.i(94965);
    this.flags = (paramInt | 0x0);
    this.aYf = params;
    this.aXZ = null;
    this.aYg = new com.google.android.exoplayer2.i.l(16);
    this.aTx = new com.google.android.exoplayer2.i.l(com.google.android.exoplayer2.i.j.bqY);
    this.aYb = new com.google.android.exoplayer2.i.l(5);
    this.aYc = new com.google.android.exoplayer2.i.l();
    this.aYd = new com.google.android.exoplayer2.i.l(1);
    this.aYe = new com.google.android.exoplayer2.i.l();
    this.aYh = new byte[16];
    this.aYi = new Stack();
    this.aYj = new LinkedList();
    this.aYa = new SparseArray();
    this.aOz = -9223372036854775807L;
    this.aYq = -9223372036854775807L;
    ri();
    AppMethodBeat.o(94965);
  }

  private void P(long paramLong)
  {
    AppMethodBeat.i(94970);
    while ((!this.aYi.isEmpty()) && (((a.a)this.aYi.peek()).aXw == paramLong))
      c((a.a)this.aYi.pop());
    ri();
    AppMethodBeat.o(94970);
  }

  private static int a(e.b paramb, int paramInt1, long paramLong, int paramInt2, com.google.android.exoplayer2.i.l paraml, int paramInt3)
  {
    AppMethodBeat.i(94984);
    paraml.setPosition(8);
    int i = a.dU(paraml.readInt());
    j localj = paramb.aYy;
    paramb = paramb.aYx;
    c localc = paramb.aZw;
    paramb.aZC[paramInt1] = paraml.tI();
    paramb.aZB[paramInt1] = paramb.aZy;
    long[] arrayOfLong;
    if ((i & 0x1) != 0)
    {
      arrayOfLong = paramb.aZB;
      arrayOfLong[paramInt1] += paraml.readInt();
    }
    int j;
    int k;
    int m;
    label129: int n;
    label141: int i1;
    if ((i & 0x4) != 0)
    {
      j = 1;
      k = localc.flags;
      if (j != 0)
        k = paraml.tI();
      if ((i & 0x100) == 0)
        break label424;
      m = 1;
      if ((i & 0x200) == 0)
        break label430;
      n = 1;
      if ((i & 0x400) == 0)
        break label436;
      i1 = 1;
      label153: if ((i & 0x800) == 0)
        break label442;
      i = 1;
      label165: if ((localj.aZp == null) || (localj.aZp.length != 1) || (localj.aZp[0] != 0L))
        break label525;
    }
    label258: label525: for (long l1 = v.b(localj.aZq[0], 1000L, localj.aZm); ; l1 = 0L)
    {
      int[] arrayOfInt1 = paramb.aZD;
      int[] arrayOfInt2 = paramb.aZE;
      arrayOfLong = paramb.aZF;
      boolean[] arrayOfBoolean = paramb.aZG;
      int i2;
      label285: int i3;
      label304: int i4;
      if ((localj.type == 2) && ((paramInt2 & 0x1) != 0))
      {
        paramInt2 = 1;
        i2 = paramInt3 + paramb.aZC[paramInt1];
        long l2 = localj.aZm;
        if (paramInt1 > 0)
          paramLong = paramb.aZN;
        if (paramInt3 >= i2)
          break label512;
        if (m == 0)
          break label454;
        i3 = paraml.tI();
        if (n == 0)
          break label464;
        i4 = paraml.tI();
        label316: if ((paramInt3 != 0) || (j == 0))
          break label474;
        paramInt1 = k;
        label329: if (i == 0)
          break label497;
        arrayOfInt2[paramInt3] = ((int)(paraml.readInt() * 1000L / l2));
        label353: arrayOfLong[paramInt3] = (v.b(paramLong, 1000L, l2) - l1);
        arrayOfInt1[paramInt3] = i4;
        if (((paramInt1 >> 16 & 0x1) != 0) || ((paramInt2 != 0) && (paramInt3 != 0)))
          break label506;
      }
      label424: label430: label436: label442: label454: label464: label474: label497: label506: for (int i5 = 1; ; i5 = 0)
      {
        arrayOfBoolean[paramInt3] = i5;
        paramLong += i3;
        paramInt3++;
        break label285;
        j = 0;
        break;
        m = 0;
        break label129;
        n = 0;
        break label141;
        i1 = 0;
        break label153;
        i = 0;
        break label165;
        paramInt2 = 0;
        break label258;
        i3 = localc.duration;
        break label304;
        i4 = localc.size;
        break label316;
        if (i1 != 0)
        {
          paramInt1 = paraml.readInt();
          break label329;
        }
        paramInt1 = localc.flags;
        break label329;
        arrayOfInt2[paramInt3] = 0;
        break label353;
      }
      paramb.aZN = paramLong;
      AppMethodBeat.o(94984);
      return i2;
    }
  }

  private static e.b a(com.google.android.exoplayer2.i.l paraml, SparseArray<e.b> paramSparseArray, int paramInt)
  {
    AppMethodBeat.i(94982);
    paraml.setPosition(8);
    int i = a.dU(paraml.readInt());
    int j = paraml.readInt();
    if ((paramInt & 0x10) == 0);
    for (paramInt = j; ; paramInt = 0)
    {
      paramSparseArray = (e.b)paramSparseArray.get(paramInt);
      if (paramSparseArray != null)
        break;
      paraml = null;
      AppMethodBeat.o(94982);
      return paraml;
    }
    if ((i & 0x1) != 0)
    {
      long l = paraml.tK();
      paramSparseArray.aYx.aZy = l;
      paramSparseArray.aYx.aZz = l;
    }
    c localc = paramSparseArray.aYz;
    label113: label126: int k;
    if ((i & 0x2) != 0)
    {
      paramInt = paraml.tI() - 1;
      if ((i & 0x8) == 0)
        break label191;
      j = paraml.tI();
      if ((i & 0x10) == 0)
        break label201;
      k = paraml.tI();
      label139: if ((i & 0x20) == 0)
        break label211;
    }
    label191: label201: label211: for (i = paraml.tI(); ; i = localc.flags)
    {
      paramSparseArray.aYx.aZw = new c(paramInt, j, k, i);
      AppMethodBeat.o(94982);
      paraml = paramSparseArray;
      break;
      paramInt = localc.aXT;
      break label113;
      j = localc.duration;
      break label126;
      k = localc.size;
      break label139;
    }
  }

  private static void a(a.a parama, SparseArray<e.b> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94977);
    int i = parama.aXy.size();
    for (int j = 0; j < i; j++)
    {
      a.a locala = (a.a)parama.aXy.get(j);
      if (locala.type == a.aWs)
        b(locala, paramSparseArray, paramInt, paramArrayOfByte);
    }
    AppMethodBeat.o(94977);
  }

  private static void a(a.a parama, e.b paramb, long paramLong, int paramInt)
  {
    AppMethodBeat.i(94979);
    int i = 0;
    int j = 0;
    parama = parama.aXx;
    int k = parama.size();
    int m = 0;
    Object localObject;
    int n;
    if (m < k)
    {
      localObject = (a.b)parama.get(m);
      if (((a.b)localObject).type != a.aWg)
        break label220;
      localObject = ((a.b)localObject).aXz;
      ((com.google.android.exoplayer2.i.l)localObject).setPosition(12);
      n = ((com.google.android.exoplayer2.i.l)localObject).tI();
      if (n <= 0)
        break label220;
      j = n + j;
      i++;
    }
    label220: 
    while (true)
    {
      m++;
      break;
      paramb.aYC = 0;
      paramb.aYB = 0;
      paramb.aYA = 0;
      paramb.aYx.bd(i, j);
      m = 0;
      i = 0;
      j = 0;
      while (j < k)
      {
        localObject = (a.b)parama.get(j);
        int i1 = m;
        n = i;
        if (((a.b)localObject).type == a.aWg)
        {
          n = a(paramb, m, paramLong, paramInt, ((a.b)localObject).aXz, i);
          i1 = m + 1;
        }
        j++;
        m = i1;
        i = n;
      }
      AppMethodBeat.o(94979);
      return;
    }
  }

  private static void a(k paramk, com.google.android.exoplayer2.i.l paraml, l paraml1)
  {
    boolean bool = true;
    AppMethodBeat.i(94980);
    int i = paramk.aZu;
    paraml.setPosition(8);
    if ((a.dU(paraml.readInt()) & 0x1) == 1)
      paraml.eM(8);
    int j = paraml.readUnsignedByte();
    int k = paraml.tI();
    if (k != paraml1.sampleCount)
    {
      paramk = new o("Length mismatch: " + k + ", " + paraml1.sampleCount);
      AppMethodBeat.o(94980);
      throw paramk;
    }
    int n;
    if (j == 0)
    {
      paramk = paraml1.aZI;
      j = 0;
      int m = 0;
      n = j;
      if (m < k)
      {
        n = paraml.readUnsignedByte();
        if (n > i);
        for (bool = true; ; bool = false)
        {
          paramk[m] = bool;
          m++;
          j += n;
          break;
        }
      }
    }
    else
    {
      if (j <= i)
        break label212;
    }
    while (true)
    {
      n = j * k + 0;
      Arrays.fill(paraml1.aZI, 0, k, bool);
      paraml1.ea(n);
      AppMethodBeat.o(94980);
      return;
      label212: bool = false;
    }
  }

  private static void a(com.google.android.exoplayer2.i.l paraml, int paramInt, l paraml1)
  {
    AppMethodBeat.i(94986);
    paraml.setPosition(paramInt + 8);
    paramInt = a.dU(paraml.readInt());
    if ((paramInt & 0x1) != 0)
    {
      paraml = new o("Overriding TrackEncryptionBox parameters is unsupported.");
      AppMethodBeat.o(94986);
      throw paraml;
    }
    if ((paramInt & 0x2) != 0);
    for (boolean bool = true; ; bool = false)
    {
      paramInt = paraml.tI();
      if (paramInt == paraml1.sampleCount)
        break;
      paraml = new o("Length mismatch: " + paramInt + ", " + paraml1.sampleCount);
      AppMethodBeat.o(94986);
      throw paraml;
    }
    Arrays.fill(paraml1.aZI, 0, paramInt, bool);
    paraml1.ea(paraml.tB());
    paraml1.q(paraml);
    AppMethodBeat.o(94986);
  }

  private static void a(com.google.android.exoplayer2.i.l paraml, l paraml1)
  {
    AppMethodBeat.i(94981);
    paraml.setPosition(8);
    int i = paraml.readInt();
    if ((a.dU(i) & 0x1) == 1)
      paraml.eM(8);
    int j = paraml.tI();
    if (j != 1)
    {
      paraml = new o("Unexpected saio entry count: ".concat(String.valueOf(j)));
      AppMethodBeat.o(94981);
      throw paraml;
    }
    i = a.dT(i);
    long l1 = paraml1.aZz;
    if (i == 0);
    for (long l2 = paraml.cM(); ; l2 = paraml.tK())
    {
      paraml1.aZz = (l2 + l1);
      AppMethodBeat.o(94981);
      return;
    }
  }

  private static void a(com.google.android.exoplayer2.i.l paraml, l paraml1, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94985);
    paraml.setPosition(8);
    paraml.readBytes(paramArrayOfByte, 0, 16);
    if (!Arrays.equals(paramArrayOfByte, aXY))
      AppMethodBeat.o(94985);
    while (true)
    {
      return;
      a(paraml, 16, paraml1);
      AppMethodBeat.o(94985);
    }
  }

  private static void a(com.google.android.exoplayer2.i.l paraml1, com.google.android.exoplayer2.i.l paraml2, String paramString, l paraml)
  {
    AppMethodBeat.i(94987);
    paraml1.setPosition(8);
    int i = paraml1.readInt();
    if (paraml1.readInt() != aXX)
      AppMethodBeat.o(94987);
    while (true)
    {
      return;
      if (a.dT(i) == 1)
        paraml1.eM(4);
      if (paraml1.readInt() != 1)
      {
        paraml1 = new o("Entry count in sbgp != 1 (unsupported).");
        AppMethodBeat.o(94987);
        throw paraml1;
      }
      paraml2.setPosition(8);
      i = paraml2.readInt();
      if (paraml2.readInt() != aXX)
      {
        AppMethodBeat.o(94987);
      }
      else
      {
        i = a.dT(i);
        if (i == 1)
        {
          if (paraml2.cM() == 0L)
          {
            paraml1 = new o("Variable length description in sgpd found (unsupported)");
            AppMethodBeat.o(94987);
            throw paraml1;
          }
        }
        else if (i >= 2)
          paraml2.eM(4);
        if (paraml2.cM() != 1L)
        {
          paraml1 = new o("Entry count in sgpd != 1 (unsupported).");
          AppMethodBeat.o(94987);
          throw paraml1;
        }
        paraml2.eM(1);
        int j = paraml2.readUnsignedByte();
        if (paraml2.readUnsignedByte() == 1);
        for (i = 1; ; i = 0)
        {
          if (i != 0)
            break label229;
          AppMethodBeat.o(94987);
          break;
        }
        label229: i = paraml2.readUnsignedByte();
        byte[] arrayOfByte = new byte[16];
        paraml2.readBytes(arrayOfByte, 0, 16);
        paraml1 = null;
        if (i == 0)
        {
          int k = paraml2.readUnsignedByte();
          paraml1 = new byte[k];
          paraml2.readBytes(paraml1, 0, k);
        }
        paraml.aZH = true;
        paraml.aZJ = new k(true, paramString, i, arrayOfByte, (j & 0xF0) >> 4, j & 0xF, paraml1);
        AppMethodBeat.o(94987);
      }
    }
  }

  private static void b(a.a parama, SparseArray<e.b> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(94978);
    paramSparseArray = a(parama.dW(a.aWe).aXz, paramSparseArray, paramInt);
    if (paramSparseArray == null)
      AppMethodBeat.o(94978);
    while (true)
    {
      return;
      l locall = paramSparseArray.aYx;
      long l1 = locall.aZN;
      paramSparseArray.reset();
      long l2 = l1;
      if (parama.dW(a.aWd) != null)
      {
        l2 = l1;
        if ((paramInt & 0x2) == 0)
          l2 = n(parama.dW(a.aWd).aXz);
      }
      a(parama, paramSparseArray, l2, paramInt);
      paramSparseArray = paramSparseArray.aYy.dZ(locall.aZw.aXT);
      Object localObject1 = parama.dW(a.aWJ);
      if (localObject1 != null)
        a(paramSparseArray, ((a.b)localObject1).aXz, locall);
      localObject1 = parama.dW(a.aWK);
      if (localObject1 != null)
        a(((a.b)localObject1).aXz, locall);
      localObject1 = parama.dW(a.aWO);
      if (localObject1 != null)
        a(((a.b)localObject1).aXz, 0, locall);
      localObject1 = parama.dW(a.aWL);
      Object localObject2 = parama.dW(a.aWM);
      if ((localObject1 != null) && (localObject2 != null))
      {
        localObject1 = ((a.b)localObject1).aXz;
        localObject2 = ((a.b)localObject2).aXz;
        if (paramSparseArray == null)
          break label307;
      }
      label307: for (paramSparseArray = paramSparseArray.aZt; ; paramSparseArray = null)
      {
        a((com.google.android.exoplayer2.i.l)localObject1, (com.google.android.exoplayer2.i.l)localObject2, paramSparseArray, locall);
        int i = parama.aXx.size();
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          paramSparseArray = (a.b)parama.aXx.get(paramInt);
          if (paramSparseArray.type == a.aWN)
            a(paramSparseArray.aXz, locall, paramArrayOfByte);
        }
      }
      AppMethodBeat.o(94978);
    }
  }

  private void c(a.a parama)
  {
    AppMethodBeat.i(94971);
    if (parama.type == a.aWi)
    {
      d(parama);
      AppMethodBeat.o(94971);
    }
    while (true)
    {
      return;
      if (parama.type == a.aWr)
      {
        e(parama);
        AppMethodBeat.o(94971);
      }
      else
      {
        if (!this.aYi.isEmpty())
          ((a.a)this.aYi.peek()).a(parama);
        AppMethodBeat.o(94971);
      }
    }
  }

  private void d(a.a parama)
  {
    boolean bool1 = true;
    int i = 0;
    int j = 0;
    AppMethodBeat.i(94972);
    boolean bool2;
    Object localObject1;
    SparseArray localSparseArray;
    long l;
    label78: Object localObject3;
    if (this.aXZ == null)
    {
      bool2 = true;
      com.google.android.exoplayer2.i.a.checkState(bool2, "Unexpected moov box.");
      localObject1 = u(parama.aXx);
      localObject2 = parama.dX(a.aWt);
      localSparseArray = new SparseArray();
      l = -9223372036854775807L;
      k = ((a.a)localObject2).aXx.size();
      m = 0;
      if (m >= k)
        break label180;
      localObject3 = (a.b)((a.a)localObject2).aXx.get(m);
      if (((a.b)localObject3).type != a.aWf)
        break label156;
      localObject3 = l(((a.b)localObject3).aXz);
      localSparseArray.put(((Integer)((Pair)localObject3).first).intValue(), ((Pair)localObject3).second);
    }
    while (true)
    {
      m++;
      break label78;
      bool2 = false;
      break;
      label156: if (((a.b)localObject3).type == a.aWu)
        l = m(((a.b)localObject3).aXz);
    }
    label180: Object localObject2 = new SparseArray();
    int k = parama.aXy.size();
    int m = 0;
    if (m < k)
    {
      a.a locala = (a.a)parama.aXy.get(m);
      if (locala.type == a.aWk)
      {
        localObject3 = parama.dW(a.aWj);
        if ((this.flags & 0x20) == 0)
          break label298;
      }
      label298: for (bool2 = true; ; bool2 = false)
      {
        localObject3 = b.a(locala, (a.b)localObject3, l, (DrmInitData)localObject1, bool2, false);
        if (localObject3 != null)
          ((SparseArray)localObject2).put(((j)localObject3).id, localObject3);
        m++;
        break;
      }
    }
    k = ((SparseArray)localObject2).size();
    if (this.aYa.size() == 0)
    {
      for (m = j; m < k; m++)
      {
        parama = (j)((SparseArray)localObject2).valueAt(m);
        localObject1 = new e.b(this.aTn.dM(m));
        ((e.b)localObject1).a(parama, (c)localSparseArray.get(parama.id));
        this.aYa.put(parama.id, localObject1);
        this.aOz = Math.max(this.aOz, parama.aOz);
      }
      rj();
      this.aTn.rb();
      AppMethodBeat.o(94972);
    }
    while (true)
    {
      return;
      if (this.aYa.size() == k);
      for (bool2 = bool1; ; bool2 = false)
      {
        com.google.android.exoplayer2.i.a.checkState(bool2);
        for (m = i; m < k; m++)
        {
          parama = (j)((SparseArray)localObject2).valueAt(m);
          ((e.b)this.aYa.get(parama.id)).a(parama, (c)localSparseArray.get(parama.id));
        }
      }
      AppMethodBeat.o(94972);
    }
  }

  private void e(a.a parama)
  {
    AppMethodBeat.i(94973);
    a(parama, this.aYa, this.flags, this.aYh);
    parama = u(parama.aXx);
    if (parama != null)
    {
      int i = this.aYa.size();
      for (int j = 0; j < i; j++)
        ((e.b)this.aYa.valueAt(j)).b(parama);
    }
    AppMethodBeat.o(94973);
  }

  private static Pair<Integer, c> l(com.google.android.exoplayer2.i.l paraml)
  {
    AppMethodBeat.i(94975);
    paraml.setPosition(12);
    paraml = Pair.create(Integer.valueOf(paraml.readInt()), new c(paraml.tI() - 1, paraml.tI(), paraml.tI(), paraml.readInt()));
    AppMethodBeat.o(94975);
    return paraml;
  }

  private static long m(com.google.android.exoplayer2.i.l paraml)
  {
    AppMethodBeat.i(94976);
    paraml.setPosition(8);
    long l;
    if (a.dT(paraml.readInt()) == 0)
    {
      l = paraml.cM();
      AppMethodBeat.o(94976);
    }
    while (true)
    {
      return l;
      l = paraml.tK();
      AppMethodBeat.o(94976);
    }
  }

  private static long n(com.google.android.exoplayer2.i.l paraml)
  {
    AppMethodBeat.i(94983);
    paraml.setPosition(8);
    long l;
    if (a.dT(paraml.readInt()) == 1)
    {
      l = paraml.tK();
      AppMethodBeat.o(94983);
    }
    while (true)
    {
      return l;
      l = paraml.cM();
      AppMethodBeat.o(94983);
    }
  }

  private void ri()
  {
    this.aTo = 0;
    this.aYm = 0;
  }

  private void rj()
  {
    AppMethodBeat.i(94974);
    if (((this.flags & 0x4) != 0) && (this.aYt == null))
    {
      this.aYt = this.aTn.dM(this.aYa.size());
      this.aYt.f(Format.c("application/x-emsg", 9223372036854775807L));
    }
    if (((this.flags & 0x8) != 0) && (this.aYu == null))
    {
      m localm = this.aTn.dM(this.aYa.size() + 1);
      localm.f(Format.as("application/cea-608"));
      this.aYu = new m[] { localm };
    }
    AppMethodBeat.o(94974);
  }

  private static DrmInitData u(List<a.b> paramList)
  {
    AppMethodBeat.i(94988);
    int i = paramList.size();
    int j = 0;
    Object localObject3;
    for (Object localObject1 = null; j < i; localObject1 = localObject3)
    {
      Object localObject2 = (a.b)paramList.get(j);
      localObject3 = localObject1;
      if (((a.b)localObject2).type == a.aWB)
      {
        Object localObject4 = localObject1;
        if (localObject1 == null)
          localObject4 = new ArrayList();
        localObject1 = ((a.b)localObject2).aXz.data;
        localObject2 = h.n((byte[])localObject1);
        localObject3 = localObject4;
        if (localObject2 != null)
        {
          ((ArrayList)localObject4).add(new DrmInitData.SchemeData((UUID)localObject2, "video/mp4", (byte[])localObject1));
          localObject3 = localObject4;
        }
      }
      j++;
    }
    if (localObject1 == null)
    {
      AppMethodBeat.o(94988);
      paramList = null;
    }
    while (true)
    {
      return paramList;
      paramList = new DrmInitData((List)localObject1);
      AppMethodBeat.o(94988);
    }
  }

  public final int a(f paramf, com.google.android.exoplayer2.c.k paramk)
  {
    AppMethodBeat.i(94969);
    Object localObject1;
    Object localObject2;
    long l2;
    label137: 
    do
      switch (this.aTo)
      {
      default:
        if (this.aTo != 3)
          break label2161;
        if (this.aYr != null)
          break;
        localObject1 = this.aYa;
        paramk = null;
        l1 = 9223372036854775807L;
        i = ((SparseArray)localObject1).size();
        for (j = 0; j < i; j++)
        {
          localObject2 = (e.b)((SparseArray)localObject1).valueAt(j);
          if (((e.b)localObject2).aYC == ((e.b)localObject2).aYx.aZA)
            break label3013;
          l2 = localObject2.aYx.aZB[localObject2.aYC];
          if (l2 >= l1)
            break label3013;
          l1 = l2;
          paramk = (com.google.android.exoplayer2.c.k)localObject2;
        }
      case 0:
        if (this.aYm != 0)
          break label226;
        if (paramf.a(this.aYg.data, 0, 8, true))
          break label190;
        j = 0;
      case 1:
      case 2:
      }
    while (j != 0);
    int j = -1;
    AppMethodBeat.o(94969);
    label187: return j;
    label190: this.aYm = 8;
    this.aYg.setPosition(0);
    this.aYl = this.aYg.cM();
    this.aYk = this.aYg.readInt();
    label226: if (this.aYl == 1L)
    {
      paramf.readFully(this.aYg.data, 8, 8);
      this.aYm += 8;
      this.aYl = this.aYg.tK();
    }
    while (this.aYl < this.aYm)
    {
      paramf = new o("Atom size less than header length (unsupported).");
      AppMethodBeat.o(94969);
      throw paramf;
      if (this.aYl == 0L)
      {
        l2 = paramf.getLength();
        l1 = l2;
        if (l2 == -1L)
        {
          l1 = l2;
          if (!this.aYi.isEmpty())
            l1 = ((a.a)this.aYi.peek()).aXw;
        }
        if (l1 != -1L)
          this.aYl = (l1 - paramf.getPosition() + this.aYm);
      }
    }
    long l1 = paramf.getPosition() - this.aYm;
    if (this.aYk == a.aWr)
    {
      i = this.aYa.size();
      for (j = 0; j < i; j++)
      {
        paramk = ((e.b)this.aYa.valueAt(j)).aYx;
        paramk.aZx = l1;
        paramk.aZz = l1;
        paramk.aZy = l1;
      }
    }
    if (this.aYk == a.aVO)
    {
      this.aYr = null;
      this.aYo = (this.aYl + l1);
      if (!this.aYv)
      {
        this.aTn.a(new l.a(this.aOz));
        this.aYv = true;
      }
      this.aTo = 2;
    }
    while (true)
    {
      j = 1;
      break;
      j = this.aYk;
      if ((j == a.aWi) || (j == a.aWk) || (j == a.aWl) || (j == a.aWm) || (j == a.aWn) || (j == a.aWr) || (j == a.aWs) || (j == a.aWt) || (j == a.aWw))
        j = 1;
      while (true)
        if (j != 0)
        {
          l1 = paramf.getPosition() + this.aYl - 8L;
          this.aYi.add(new a.a(this.aYk, l1));
          if (this.aYl == this.aYm)
          {
            P(l1);
            break;
            j = 0;
            continue;
          }
          ri();
          break;
        }
      j = this.aYk;
      if ((j == a.aWz) || (j == a.aWy) || (j == a.aWj) || (j == a.aWh) || (j == a.aWA) || (j == a.aWd) || (j == a.aWe) || (j == a.aWv) || (j == a.aWf) || (j == a.aWg) || (j == a.aWB) || (j == a.aWJ) || (j == a.aWK) || (j == a.aWO) || (j == a.aWN) || (j == a.aWL) || (j == a.aWM) || (j == a.aWx) || (j == a.aWu) || (j == a.aXn))
        j = 1;
      while (true)
      {
        Object localObject3;
        Object localObject4;
        int k;
        if (j != 0)
          if (this.aYm != 8)
          {
            paramf = new o("Leaf atom defines extended atom size (unsupported).");
            AppMethodBeat.o(94969);
            throw paramf;
            j = 0;
          }
          else
          {
            if (this.aYl > 2147483647L)
            {
              paramf = new o("Leaf atom with length > 2147483647 (unsupported).");
              AppMethodBeat.o(94969);
              throw paramf;
            }
            this.aYn = new com.google.android.exoplayer2.i.l((int)this.aYl);
            System.arraycopy(this.aYg.data, 0, this.aYn.data, 0, 8);
            this.aTo = 1;
            break;
          }
      }
      if (this.aYl > 2147483647L)
      {
        paramf = new o("Skipping atom with length > 2147483647 (unsupported).");
        AppMethodBeat.o(94969);
        throw paramf;
      }
      this.aYn = null;
      this.aTo = 1;
    }
    j = (int)this.aYl - this.aYm;
    if (this.aYn != null)
    {
      paramf.readFully(this.aYn.data, 8, j);
      paramk = new a.b(this.aYk, this.aYn);
      l2 = paramf.getPosition();
      if (!this.aYi.isEmpty())
        ((a.a)this.aYi.peek()).a(paramk);
    }
    while (true)
    {
      P(paramf.getPosition());
      break;
      if (paramk.type == a.aWh)
      {
        localObject3 = paramk.aXz;
        ((com.google.android.exoplayer2.i.l)localObject3).setPosition(8);
        j = a.dT(((com.google.android.exoplayer2.i.l)localObject3).readInt());
        ((com.google.android.exoplayer2.i.l)localObject3).eM(4);
        long l3 = ((com.google.android.exoplayer2.i.l)localObject3).cM();
        long l4;
        long l5;
        if (j == 0)
        {
          l1 = ((com.google.android.exoplayer2.i.l)localObject3).cM();
          l2 += ((com.google.android.exoplayer2.i.l)localObject3).cM();
          l4 = v.b(l1, 1000000L, l3);
          ((com.google.android.exoplayer2.i.l)localObject3).eM(2);
          i = ((com.google.android.exoplayer2.i.l)localObject3).readUnsignedShort();
          localObject1 = new int[i];
          localObject4 = new long[i];
          paramk = new long[i];
          localObject2 = new long[i];
          j = 0;
          l5 = l4;
        }
        while (true)
        {
          if (j >= i)
            break label1398;
          k = ((com.google.android.exoplayer2.i.l)localObject3).readInt();
          if ((0x80000000 & k) != 0)
          {
            paramf = new o("Unhandled indirect reference");
            AppMethodBeat.o(94969);
            throw paramf;
            l1 = ((com.google.android.exoplayer2.i.l)localObject3).tK();
            l2 += ((com.google.android.exoplayer2.i.l)localObject3).tK();
            break;
          }
          long l6 = ((com.google.android.exoplayer2.i.l)localObject3).cM();
          localObject1[j] = (k & 0x7FFFFFFF);
          localObject4[j] = l2;
          localObject2[j] = l5;
          l1 += l6;
          l5 = v.b(l1, 1000000L, l3);
          paramk[j] = (l5 - localObject2[j]);
          ((com.google.android.exoplayer2.i.l)localObject3).eM(4);
          l2 += localObject1[j];
          j++;
        }
        label1398: paramk = Pair.create(Long.valueOf(l4), new com.google.android.exoplayer2.c.a((int[])localObject1, (long[])localObject4, paramk, (long[])localObject2));
        this.aYq = ((Long)paramk.first).longValue();
        this.aTn.a((com.google.android.exoplayer2.c.l)paramk.second);
        this.aYv = true;
      }
      else if (paramk.type == a.aXn)
      {
        paramk = paramk.aXz;
        if (this.aYt != null)
        {
          paramk.setPosition(12);
          paramk.tL();
          paramk.tL();
          l1 = paramk.cM();
          l1 = v.b(paramk.cM(), 1000000L, l1);
          paramk.setPosition(12);
          j = paramk.tB();
          this.aYt.a(paramk, j);
          if (this.aYq != -9223372036854775807L)
          {
            this.aYt.a(l1 + this.aYq, 1, j, 0, null);
          }
          else
          {
            this.aYj.addLast(new e.a(l1, j));
            this.aYp += j;
            continue;
            paramf.dG(j);
          }
        }
      }
    }
    paramk = null;
    l1 = 9223372036854775807L;
    int i = this.aYa.size();
    j = 0;
    label1637: if (j < i)
    {
      localObject2 = ((e.b)this.aYa.valueAt(j)).aYx;
      if ((!((l)localObject2).aZM) || (((l)localObject2).aZz >= l1))
        break label3016;
      l1 = ((l)localObject2).aZz;
      paramk = (e.b)this.aYa.valueAt(j);
    }
    label1858: label2118: label2247: label3016: 
    while (true)
    {
      j++;
      break label1637;
      if (paramk == null)
      {
        this.aTo = 3;
        break;
      }
      j = (int)(l1 - paramf.getPosition());
      if (j < 0)
      {
        paramf = new o("Offset to encryption data was negative.");
        AppMethodBeat.o(94969);
        throw paramf;
      }
      paramf.dG(j);
      paramk = paramk.aYx;
      paramf.readFully(paramk.aZL.data, 0, paramk.aZK);
      paramk.aZL.setPosition(0);
      paramk.aZM = false;
      break;
      if (paramk == null)
      {
        j = (int)(this.aYo - paramf.getPosition());
        if (j < 0)
        {
          paramf = new o("Offset to end of mdat was negative.");
          AppMethodBeat.o(94969);
          throw paramf;
        }
        paramf.dG(j);
        ri();
        j = 0;
        if (j == 0)
          break label3008;
        j = 0;
        AppMethodBeat.o(94969);
        break label187;
      }
      i = (int)(paramk.aYx.aZB[paramk.aYC] - paramf.getPosition());
      j = i;
      if (i < 0)
        j = 0;
      paramf.dG(j);
      this.aYr = paramk;
      this.sampleSize = this.aYr.aYx.aZD[this.aYr.aYA];
      label2012: label2043: int n;
      label2161: int i1;
      if (this.aYr.aYx.aZH)
      {
        localObject4 = this.aYr;
        localObject1 = ((e.b)localObject4).aYx;
        j = ((l)localObject1).aZw.aXT;
        if (((l)localObject1).aZJ != null)
        {
          paramk = ((l)localObject1).aZJ;
          if (paramk.aZu == 0)
            break label2402;
          localObject2 = ((l)localObject1).aZL;
          j = paramk.aZu;
          paramk = (com.google.android.exoplayer2.c.k)localObject2;
          m = localObject1.aZI[localObject4.aYA];
          localObject2 = this.aYd.data;
          if (m == 0)
            break label2433;
          i = 128;
          localObject2[0] = ((byte)(byte)(i | j));
          this.aYd.setPosition(0);
          localObject2 = ((e.b)localObject4).aTw;
          ((m)localObject2).a(this.aYd, 1);
          ((m)localObject2).a(paramk, j);
          if (m != 0)
            break label2439;
          j++;
          this.aUG = j;
          this.sampleSize += this.aUG;
          if (this.aYr.aYy.aZo == 1)
          {
            this.sampleSize -= 8;
            paramf.dG(8);
          }
          this.aTo = 4;
          this.aUF = 0;
          localObject2 = this.aYr.aYx;
          localObject4 = this.aYr.aYy;
          localObject1 = this.aYr.aTw;
          n = this.aYr.aYA;
          if (((j)localObject4).aTz == 0)
            break label2690;
          localObject3 = this.aYb.data;
          localObject3[0] = ((byte)0);
          localObject3[1] = ((byte)0);
          localObject3[2] = ((byte)0);
          k = ((j)localObject4).aTz;
          i1 = 4 - ((j)localObject4).aTz;
          if (this.aUG >= this.sampleSize)
            break label2730;
          if (this.aUF != 0)
            break label2501;
          paramf.readFully((byte[])localObject3, i1, k + 1);
          this.aYb.setPosition(0);
          this.aUF = (this.aYb.tI() - 1);
          this.aTx.setPosition(0);
          ((m)localObject1).a(this.aTx, 4);
          ((m)localObject1).a(this.aYb, 1);
          if ((this.aYu == null) || (!com.google.android.exoplayer2.i.j.b(((j)localObject4).aOv.aOd, localObject3[4])))
            break label2495;
        }
      }
      for (int m = 1; ; m = 0)
      {
        this.aYs = m;
        this.aUG += 5;
        this.sampleSize += i1;
        break label2247;
        paramk = ((e.b)localObject4).aYy.dZ(j);
        break;
        label2402: localObject2 = paramk.aZv;
        this.aYe.n((byte[])localObject2, localObject2.length);
        paramk = this.aYe;
        j = localObject2.length;
        break label2012;
        i = 0;
        break label2043;
        paramk = ((l)localObject1).aZL;
        i = paramk.readUnsignedShort();
        paramk.eM(-2);
        i = i * 6 + 2;
        ((m)localObject2).a(paramk, i);
        j = j + 1 + i;
        break label2099;
        this.aUG = 0;
        break label2118;
      }
      if (this.aYs)
      {
        this.aYc.reset(this.aUF);
        paramf.readFully(this.aYc.data, 0, this.aUF);
        ((m)localObject1).a(this.aYc, this.aUF);
        i = this.aUF;
        int i2 = com.google.android.exoplayer2.i.j.j(this.aYc.data, this.aYc.limit);
        paramk = this.aYc;
        if ("video/hevc".equals(((j)localObject4).aOv.aOd))
        {
          j = 1;
          paramk.setPosition(j);
          this.aYc.eL(i2);
          com.google.android.exoplayer2.f.a.g.a(((l)localObject2).eb(n) * 1000L, this.aYc, this.aYu);
        }
      }
      for (j = i; ; j = ((m)localObject1).a(paramf, this.aUF, false))
      {
        this.aUG += j;
        this.aUF -= j;
        break;
        j = 0;
        break label2601;
      }
      while (this.aUG < this.sampleSize)
        this.aUG = (((m)localObject1).a(paramf, this.sampleSize - this.aUG, false) + this.aUG);
      l2 = ((l)localObject2).eb(n) * 1000L;
      l1 = l2;
      if (this.aYf != null)
        l1 = this.aYf.ap(l2);
      if (localObject2.aZG[n] != 0)
      {
        j = 1;
        paramk = null;
        if (!((l)localObject2).aZH)
          break label3010;
        j = 0x40000000 | j;
        if (((l)localObject2).aZJ == null)
          break label2901;
        paramk = ((l)localObject2).aZJ;
        label2811: paramk = paramk.aUO;
      }
      while (true)
      {
        ((m)localObject1).a(l1, j, this.sampleSize, 0, paramk);
        while (true)
          if (!this.aYj.isEmpty())
          {
            paramk = (e.a)this.aYj.removeFirst();
            this.aYp -= paramk.size;
            this.aYt.a(paramk.aYw + l1, 1, paramk.size, this.aYp, null);
            continue;
            j = 0;
            break;
            label2901: paramk = ((j)localObject4).dZ(((l)localObject2).aZw.aXT);
            break label2811;
          }
        paramk = this.aYr;
        paramk.aYA += 1;
        paramk = this.aYr;
        paramk.aYB += 1;
        if (this.aYr.aYB == localObject2.aZC[this.aYr.aYC])
        {
          paramk = this.aYr;
          paramk.aYC += 1;
          this.aYr.aYB = 0;
          this.aYr = null;
        }
        this.aTo = 3;
        j = 1;
        break label1858;
        break;
      }
      break label137;
    }
  }

  public final void a(com.google.android.exoplayer2.c.g paramg)
  {
    AppMethodBeat.i(94967);
    this.aTn = paramg;
    if (this.aXZ != null)
    {
      paramg = new e.b(paramg.dM(0));
      paramg.a(this.aXZ, new c(0, 0, 0, 0));
      this.aYa.put(0, paramg);
      rj();
      this.aTn.rb();
    }
    AppMethodBeat.o(94967);
  }

  public final boolean a(f paramf)
  {
    AppMethodBeat.i(94966);
    boolean bool = i.g(paramf);
    AppMethodBeat.o(94966);
    return bool;
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(94968);
    int i = this.aYa.size();
    for (int j = 0; j < i; j++)
      ((e.b)this.aYa.valueAt(j)).reset();
    this.aYj.clear();
    this.aYp = 0;
    this.aYi.clear();
    ri();
    AppMethodBeat.o(94968);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.e
 * JD-Core Version:    0.6.2
 */