package com.google.android.exoplayer2.c.d;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.i;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.i.c;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class b
{
  private static final int aXA;
  private static final int aXB;
  private static final int aXC;
  private static final int aXD;
  private static final int aXE;
  private static final int aXF;
  private static final int aXG;
  private static final int aXi;

  static
  {
    AppMethodBeat.i(94958);
    aXA = v.aT("vide");
    aXB = v.aT("soun");
    aXC = v.aT("text");
    aXD = v.aT("sbtl");
    aXE = v.aT("subt");
    aXF = v.aT("clcp");
    aXG = v.aT("cenc");
    aXi = v.aT("meta");
    AppMethodBeat.o(94958);
  }

  private static Pair<Integer, k> a(l paraml, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(94954);
    int i = paraml.position;
    int j;
    boolean bool;
    if (i - paramInt1 < paramInt2)
    {
      paraml.setPosition(i);
      j = paraml.readInt();
      if (j > 0)
      {
        bool = true;
        label36: com.google.android.exoplayer2.i.a.checkArgument(bool, "childAtomSize should be positive");
        if (paraml.readInt() != a.aWC)
          break label83;
        Pair localPair = b(paraml, i, j);
        if (localPair == null)
          break label83;
        AppMethodBeat.o(94954);
        paraml = localPair;
      }
    }
    while (true)
    {
      return paraml;
      bool = false;
      break label36;
      label83: i += j;
      break;
      paraml = null;
      AppMethodBeat.o(94954);
    }
  }

  private static b.c a(l paraml, int paramInt1, int paramInt2, String paramString, DrmInitData paramDrmInitData, boolean paramBoolean)
  {
    AppMethodBeat.i(94951);
    paraml.setPosition(12);
    int i = paraml.readInt();
    b.c localc = new b.c(i);
    int j = 0;
    int k;
    int m;
    boolean bool;
    int n;
    int i1;
    int i2;
    int i3;
    float f1;
    int i4;
    Object localObject1;
    Object localObject2;
    label235: label251: Object localObject3;
    if (j < i)
    {
      k = paraml.position;
      m = paraml.readInt();
      if (m > 0)
      {
        bool = true;
        com.google.android.exoplayer2.i.a.checkArgument(bool, "childAtomSize should be positive");
        n = paraml.readInt();
        if ((n != a.aVI) && (n != a.aVJ) && (n != a.aWG) && (n != a.aWS) && (n != a.aVK) && (n != a.aVL) && (n != a.aVM) && (n != a.aXr) && (n != a.aXs))
          break label1298;
        paraml.setPosition(k + 8 + 8);
        paraml.eM(16);
        i1 = paraml.readUnsignedShort();
        i2 = paraml.readUnsignedShort();
        i3 = 0;
        f1 = 1.0F;
        paraml.eM(50);
        i4 = paraml.position;
        if (n != a.aWG)
          break label2755;
        localObject1 = a(paraml, k, m);
        if (localObject1 == null)
          break label2748;
        n = ((Integer)((Pair)localObject1).first).intValue();
        if (paramDrmInitData != null)
          break label496;
        localObject2 = null;
        localc.aXN[j] = ((k)((Pair)localObject1).second);
        paraml.setPosition(i4);
        localObject3 = localObject2;
      }
    }
    for (int i5 = n; ; i5 = n)
    {
      Object localObject4 = null;
      Object localObject5 = null;
      Object localObject6 = null;
      int i6 = -1;
      label277: int i7;
      label330: label359: Object localObject7;
      if (i4 - k < m)
      {
        paraml.setPosition(i4);
        i7 = paraml.position;
        int i8 = paraml.readInt();
        if ((i8 != 0) || (paraml.position - k != m))
        {
          int i9;
          float f2;
          if (i8 > 0)
          {
            bool = true;
            com.google.android.exoplayer2.i.a.checkArgument(bool, "childAtomSize should be positive");
            i9 = paraml.readInt();
            if (i9 != a.aWo)
              break label529;
            if (localObject5 != null)
              break label523;
            bool = true;
            com.google.android.exoplayer2.i.a.checkState(bool);
            localObject4 = "video/avc";
            paraml.setPosition(i7 + 8);
            com.google.android.exoplayer2.video.a locala = com.google.android.exoplayer2.video.a.K(paraml);
            localObject5 = locala.aOf;
            localc.aTz = locala.aTz;
            localObject2 = localObject4;
            localObject1 = localObject5;
            i7 = i3;
            f2 = f1;
            localObject7 = localObject6;
            n = i6;
            if (i3 == 0)
            {
              f2 = locala.brq;
              n = i6;
              localObject7 = localObject6;
              i7 = i3;
              localObject1 = localObject5;
              localObject2 = localObject4;
            }
          }
          while (true)
          {
            i4 += i8;
            localObject5 = localObject2;
            localObject4 = localObject1;
            i3 = i7;
            f1 = f2;
            localObject6 = localObject7;
            i6 = n;
            break label277;
            bool = false;
            break;
            label496: localObject2 = paramDrmInitData.aw(((k)((Pair)localObject1).second).aZt);
            break label235;
            bool = false;
            break label330;
            label523: bool = false;
            break label359;
            label529: if (i9 == a.aWp)
            {
              if (localObject5 == null);
              for (bool = true; ; bool = false)
              {
                com.google.android.exoplayer2.i.a.checkState(bool);
                localObject2 = "video/hevc";
                paraml.setPosition(i7 + 8);
                localObject7 = com.google.android.exoplayer2.video.b.M(paraml);
                localObject1 = ((com.google.android.exoplayer2.video.b)localObject7).aOf;
                localc.aTz = ((com.google.android.exoplayer2.video.b)localObject7).aTz;
                i7 = i3;
                f2 = f1;
                localObject7 = localObject6;
                n = i6;
                break;
              }
            }
            if (i9 == a.aXt)
            {
              if (localObject5 == null);
              for (bool = true; ; bool = false)
              {
                com.google.android.exoplayer2.i.a.checkState(bool);
                if (i5 != a.aXr)
                  break label673;
                localObject2 = "video/x-vnd.on2.vp8";
                localObject1 = localObject4;
                i7 = i3;
                f2 = f1;
                localObject7 = localObject6;
                n = i6;
                break;
              }
              label673: localObject2 = "video/x-vnd.on2.vp9";
              localObject1 = localObject4;
              i7 = i3;
              f2 = f1;
              localObject7 = localObject6;
              n = i6;
            }
            else
            {
              if (i9 == a.aVN)
              {
                if (localObject5 == null);
                for (bool = true; ; bool = false)
                {
                  com.google.android.exoplayer2.i.a.checkState(bool);
                  localObject2 = "video/3gpp";
                  localObject1 = localObject4;
                  i7 = i3;
                  f2 = f1;
                  localObject7 = localObject6;
                  n = i6;
                  break;
                }
              }
              if (i9 == a.aWq)
              {
                if (localObject5 == null);
                for (bool = true; ; bool = false)
                {
                  com.google.android.exoplayer2.i.a.checkState(bool);
                  localObject1 = c(paraml, i7);
                  localObject2 = (String)((Pair)localObject1).first;
                  localObject1 = Collections.singletonList(((Pair)localObject1).second);
                  i7 = i3;
                  f2 = f1;
                  localObject7 = localObject6;
                  n = i6;
                  break;
                }
              }
              if (i9 == a.aWP)
              {
                paraml.setPosition(i7 + 8);
                n = paraml.tI();
                i3 = paraml.tI();
                f2 = n / i3;
                i7 = 1;
                localObject2 = localObject5;
                localObject1 = localObject4;
                localObject7 = localObject6;
                n = i6;
              }
              else if (i9 == a.aXp)
              {
                n = i7 + 8;
                while (true)
                {
                  if (n - i7 >= i8)
                    break label984;
                  paraml.setPosition(n);
                  i9 = paraml.readInt();
                  if (paraml.readInt() == a.aXq)
                  {
                    localObject7 = Arrays.copyOfRange(paraml.data, n, i9 + n);
                    localObject2 = localObject5;
                    localObject1 = localObject4;
                    i7 = i3;
                    f2 = f1;
                    n = i6;
                    break;
                  }
                  n += i9;
                }
                label984: localObject7 = null;
                localObject2 = localObject5;
                localObject1 = localObject4;
                i7 = i3;
                f2 = f1;
                n = i6;
              }
              else
              {
                localObject2 = localObject5;
                localObject1 = localObject4;
                i7 = i3;
                f2 = f1;
                localObject7 = localObject6;
                n = i6;
                if (i9 == a.aXo)
                {
                  i9 = paraml.readUnsignedByte();
                  paraml.eM(3);
                  localObject2 = localObject5;
                  localObject1 = localObject4;
                  i7 = i3;
                  f2 = f1;
                  localObject7 = localObject6;
                  n = i6;
                  if (i9 == 0)
                    switch (paraml.readUnsignedByte())
                    {
                    default:
                      localObject2 = localObject5;
                      localObject1 = localObject4;
                      i7 = i3;
                      f2 = f1;
                      localObject7 = localObject6;
                      n = i6;
                      break;
                    case 0:
                      n = 0;
                      localObject2 = localObject5;
                      localObject1 = localObject4;
                      i7 = i3;
                      f2 = f1;
                      localObject7 = localObject6;
                      break;
                    case 1:
                      n = 1;
                      localObject2 = localObject5;
                      localObject1 = localObject4;
                      i7 = i3;
                      f2 = f1;
                      localObject7 = localObject6;
                      break;
                    case 2:
                      n = 2;
                      localObject2 = localObject5;
                      localObject1 = localObject4;
                      i7 = i3;
                      f2 = f1;
                      localObject7 = localObject6;
                      break;
                    case 3:
                      n = 3;
                      localObject2 = localObject5;
                      localObject1 = localObject4;
                      i7 = i3;
                      f2 = f1;
                      localObject7 = localObject6;
                    }
                }
              }
            }
          }
        }
      }
      if (localObject5 != null)
        localc.aOv = Format.a(Integer.toString(paramInt1), (String)localObject5, -1, i1, i2, (List)localObject4, paramInt2, f1, (byte[])localObject6, i6, null, (DrmInitData)localObject3);
      paraml.setPosition(k + m);
      j++;
      break;
      label1298: if ((n == a.aVP) || (n == a.aWH) || (n == a.aVU) || (n == a.aVW) || (n == a.aVY) || (n == a.aWb) || (n == a.aVZ) || (n == a.aWa) || (n == a.aXf) || (n == a.aXg) || (n == a.aVS) || (n == a.aVT) || (n == a.aVQ) || (n == a.aXv))
      {
        paraml.setPosition(k + 8 + 8);
        if (paramBoolean)
        {
          i5 = paraml.readUnsignedShort();
          paraml.eM(6);
          label1439: if ((i5 != 0) && (i5 != 1))
            break label1872;
          i6 = paraml.readUnsignedShort();
          paraml.eM(6);
          localObject2 = paraml.data;
          i4 = paraml.position;
          paraml.position = (i4 + 1);
          i4 = localObject2[i4];
          localObject2 = paraml.data;
          i3 = paraml.position;
          paraml.position = (i3 + 1);
          i4 = (i4 & 0xFF) << 8 | localObject2[i3] & 0xFF;
          paraml.position += 2;
          if (i5 != 1)
            break label2737;
          paraml.eM(16);
          i5 = i4;
          i4 = i6;
        }
      }
      while (true)
      {
        label1560: i6 = paraml.position;
        if (n == a.aWH)
        {
          localObject1 = a(paraml, k, m);
          if (localObject1 != null)
          {
            n = ((Integer)((Pair)localObject1).first).intValue();
            if (paramDrmInitData == null)
            {
              localObject2 = null;
              label1610: localc.aXN[j] = ((k)((Pair)localObject1).second);
              label1626: paraml.setPosition(i6);
            }
          }
        }
        for (localObject7 = localObject2; ; localObject7 = paramDrmInitData)
        {
          if (n == a.aVU)
            localObject2 = "audio/ac3";
          while (true)
          {
            label1649: localObject1 = null;
            n = i6;
            label1656: if (n - k < m)
            {
              paraml.setPosition(n);
              i7 = paraml.readInt();
              if (i7 > 0)
              {
                bool = true;
                com.google.android.exoplayer2.i.a.checkArgument(bool, "childAtomSize should be positive");
                i2 = paraml.readInt();
                if ((i2 != a.aWq) && ((!paramBoolean) || (i2 != a.aVR)))
                  break label2177;
                if (i2 != a.aWq)
                  break label2099;
                i6 = n;
                if (i6 == -1)
                  break label2714;
                localObject2 = c(paraml, i6);
                localObject3 = (String)((Pair)localObject2).first;
                localObject6 = (byte[])((Pair)localObject2).second;
                localObject2 = localObject3;
                localObject1 = localObject6;
                if ("audio/mp4a-latm".equals(localObject3))
                {
                  localObject2 = c.q((byte[])localObject6);
                  i5 = ((Integer)((Pair)localObject2).first).intValue();
                  i4 = ((Integer)((Pair)localObject2).second).intValue();
                  localObject1 = localObject6;
                  localObject2 = localObject3;
                }
              }
            }
            label1686: label2714: 
            while (true)
            {
              label1732: i6 = i5;
              i3 = i4;
              localObject3 = localObject2;
              while (true)
              {
                n += i7;
                localObject2 = localObject3;
                i4 = i3;
                i5 = i6;
                break label1656;
                paraml.eM(8);
                i5 = 0;
                break label1439;
                label1872: if (i5 != 2)
                  break;
                paraml.eM(16);
                i5 = (int)Math.round(Double.longBitsToDouble(paraml.readLong()));
                i4 = paraml.tI();
                paraml.eM(20);
                break label1560;
                localObject2 = paramDrmInitData.aw(((k)((Pair)localObject1).second).aZt);
                break label1610;
                if (n == a.aVW)
                {
                  localObject2 = "audio/eac3";
                  break label1649;
                }
                if (n == a.aVY)
                {
                  localObject2 = "audio/vnd.dts";
                  break label1649;
                }
                if ((n == a.aVZ) || (n == a.aWa))
                {
                  localObject2 = "audio/vnd.dts.hd";
                  break label1649;
                }
                if (n == a.aWb)
                {
                  localObject2 = "audio/vnd.dts.hd;profile=lbr";
                  break label1649;
                }
                if (n == a.aXf)
                {
                  localObject2 = "audio/3gpp";
                  break label1649;
                }
                if (n == a.aXg)
                {
                  localObject2 = "audio/amr-wb";
                  break label1649;
                }
                if ((n == a.aVS) || (n == a.aVT))
                {
                  localObject2 = "audio/raw";
                  break label1649;
                }
                if (n == a.aVQ)
                {
                  localObject2 = "audio/mpeg";
                  break label1649;
                }
                if (n != a.aXv)
                  break label2717;
                localObject2 = "audio/alac";
                break label1649;
                bool = false;
                break label1686;
                label2099: i6 = paraml.position;
                while (true)
                {
                  if (i6 - n >= i7)
                    break label2171;
                  paraml.setPosition(i6);
                  i3 = paraml.readInt();
                  if (i3 > 0);
                  for (bool = true; ; bool = false)
                  {
                    com.google.android.exoplayer2.i.a.checkArgument(bool, "childAtomSize should be positive");
                    if (paraml.readInt() != a.aWq)
                      break label2161;
                    break;
                  }
                  label2161: i6 += i3;
                }
                label2171: i6 = -1;
                break label1732;
                if (i2 == a.aVV)
                {
                  paraml.setPosition(n + 8);
                  localc.aOv = com.google.android.exoplayer2.a.a.a(paraml, Integer.toString(paramInt1), paramString, (DrmInitData)localObject7);
                  localObject3 = localObject2;
                  i3 = i4;
                  i6 = i5;
                }
                else if (i2 == a.aVX)
                {
                  paraml.setPosition(n + 8);
                  localc.aOv = com.google.android.exoplayer2.a.a.b(paraml, Integer.toString(paramInt1), paramString, (DrmInitData)localObject7);
                  localObject3 = localObject2;
                  i3 = i4;
                  i6 = i5;
                }
                else if (i2 == a.aWc)
                {
                  localc.aOv = Format.a(Integer.toString(paramInt1), (String)localObject2, -1, -1, i4, i5, null, (DrmInitData)localObject7, paramString);
                  localObject3 = localObject2;
                  i3 = i4;
                  i6 = i5;
                }
                else
                {
                  localObject3 = localObject2;
                  i3 = i4;
                  i6 = i5;
                  if (i2 == a.aXv)
                  {
                    localObject1 = new byte[i7];
                    paraml.setPosition(n);
                    paraml.readBytes((byte[])localObject1, 0, i7);
                    localObject3 = localObject2;
                    i3 = i4;
                    i6 = i5;
                  }
                }
              }
              if ((localc.aOv != null) || (localObject2 == null))
                break;
              if ("audio/raw".equals(localObject2))
              {
                n = 2;
                label2403: localObject3 = Integer.toString(paramInt1);
                if (localObject1 != null)
                  break label2452;
              }
              for (localObject1 = null; ; localObject1 = Collections.singletonList(localObject1))
              {
                localc.aOv = Format.a((String)localObject3, (String)localObject2, -1, -1, i4, i5, n, (List)localObject1, (DrmInitData)localObject7, 0, paramString);
                break;
                n = -1;
                break label2403;
              }
              if ((n == a.aWQ) || (n == a.aXb) || (n == a.aXc) || (n == a.aXd) || (n == a.aXe))
              {
                paraml.setPosition(k + 8 + 8);
                localObject1 = null;
                long l = 9223372036854775807L;
                if (n == a.aWQ)
                  localObject2 = "application/ttml+xml";
                while (true)
                {
                  localc.aOv = Format.a(Integer.toString(paramInt1), (String)localObject2, 0, paramString, -1, null, l, (List)localObject1);
                  break;
                  if (n == a.aXb)
                  {
                    localObject2 = "application/x-quicktime-tx3g";
                    n = m - 8 - 8;
                    localObject1 = new byte[n];
                    paraml.readBytes((byte[])localObject1, 0, n);
                    localObject1 = Collections.singletonList(localObject1);
                  }
                  else if (n == a.aXc)
                  {
                    localObject2 = "application/x-mp4-vtt";
                  }
                  else if (n == a.aXd)
                  {
                    localObject2 = "application/ttml+xml";
                    l = 0L;
                  }
                  else
                  {
                    if (n != a.aXe)
                      break label2665;
                    localObject2 = "application/x-mp4-cea-608";
                    localc.aXO = 1;
                  }
                }
                label2665: paraml = new IllegalStateException();
                AppMethodBeat.o(94951);
                throw paraml;
              }
              if (n != a.aXu)
                break;
              localc.aOv = Format.k(Integer.toString(paramInt1), "application/x-camera-motion");
              break;
              AppMethodBeat.o(94951);
              return localc;
            }
            label2177: label2452: label2717: localObject2 = null;
          }
          localObject2 = paramDrmInitData;
          break label1626;
        }
        label2737: i5 = i4;
        i4 = i6;
      }
      label2748: localObject2 = paramDrmInitData;
      break label251;
      label2755: localObject3 = paramDrmInitData;
    }
  }

  public static j a(a.a parama, a.b paramb, long paramLong, DrmInitData paramDrmInitData, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(94948);
    Object localObject1 = parama.dX(a.aWl);
    Object localObject2 = ((a.a)localObject1).dW(a.aWz).aXz;
    ((l)localObject2).setPosition(16);
    int i = ((l)localObject2).readInt();
    if (i == aXB)
      i = 1;
    while (i == -1)
    {
      parama = null;
      AppMethodBeat.o(94948);
      return parama;
      if (i == aXA)
        i = 2;
      else if ((i == aXC) || (i == aXD) || (i == aXE) || (i == aXF))
        i = 3;
      else if (i == aXi)
        i = 4;
      else
        i = -1;
    }
    localObject2 = parama.dW(a.aWv).aXz;
    ((l)localObject2).setPosition(8);
    int j = a.dT(((l)localObject2).readInt());
    int k;
    label179: int n;
    label217: int i2;
    label220: int i3;
    long l1;
    if (j == 0)
    {
      k = 8;
      ((l)localObject2).eM(k);
      int m = ((l)localObject2).readInt();
      ((l)localObject2).eM(4);
      n = 1;
      int i1 = ((l)localObject2).position;
      if (j != 0)
        break label667;
      k = 4;
      i2 = 0;
      i3 = n;
      if (i2 < k)
      {
        if (localObject2.data[(i1 + i2)] == -1)
          break label674;
        i3 = 0;
      }
      if (i3 == 0)
        break label680;
      ((l)localObject2).eM(k);
      l1 = -9223372036854775807L;
      ((l)localObject2).eM(16);
      k = ((l)localObject2).readInt();
      i2 = ((l)localObject2).readInt();
      ((l)localObject2).eM(4);
      i3 = ((l)localObject2).readInt();
      n = ((l)localObject2).readInt();
      if ((k != 0) || (i2 != 65536) || (i3 != -65536) || (n != 0))
        break label721;
      k = 90;
      label337: localObject2 = new f(m, l1, k);
      if (paramLong != -9223372036854775807L)
        break label890;
      paramLong = ((f)localObject2).duration;
    }
    label391: label415: label469: label890: 
    while (true)
    {
      paramb = paramb.aXz;
      paramb.setPosition(8);
      long l2;
      if (a.dT(paramb.readInt()) == 0)
      {
        k = 8;
        paramb.eM(k);
        l2 = paramb.cM();
        if (paramLong != -9223372036854775807L)
          break label802;
        paramLong = -9223372036854775807L;
        paramb = ((a.a)localObject1).dX(a.aWm).dX(a.aWn);
        localObject1 = ((a.a)localObject1).dW(a.aWy).aXz;
        ((l)localObject1).setPosition(8);
        i2 = a.dT(((l)localObject1).readInt());
        if (i2 != 0)
          break label815;
        k = 8;
        ((l)localObject1).eM(k);
        l1 = ((l)localObject1).cM();
        if (i2 != 0)
          break label822;
      }
      b.c localc;
      for (k = 4; ; k = 8)
      {
        ((l)localObject1).eM(k);
        k = ((l)localObject1).readUnsignedShort();
        localObject1 = Pair.create(Long.valueOf(l1), (char)((k >> 10 & 0x1F) + 96) + (char)((k >> 5 & 0x1F) + 96) + (char)((k & 0x1F) + 96));
        localc = a(paramb.dW(a.aWA).aXz, ((f)localObject2).id, ((f)localObject2).aOi, (String)((Pair)localObject1).second, paramDrmInitData, paramBoolean2);
        paramb = null;
        paramDrmInitData = null;
        if (!paramBoolean1)
        {
          parama = b(parama.dX(a.aWw));
          paramb = (long[])parama.first;
          paramDrmInitData = (long[])parama.second;
        }
        if (localc.aOv != null)
          break label829;
        parama = null;
        AppMethodBeat.o(94948);
        break;
        k = 16;
        break label179;
        k = 8;
        break label217;
        i2++;
        break label220;
        if (j == 0);
        for (l2 = ((l)localObject2).cM(); ; l2 = ((l)localObject2).tK())
        {
          l1 = l2;
          if (l2 != 0L)
            break;
          l1 = -9223372036854775807L;
          break;
        }
        if ((k == 0) && (i2 == -65536) && (i3 == 65536) && (n == 0))
        {
          k = 270;
          break label337;
        }
        if ((k == -65536) && (i2 == 0) && (i3 == 0) && (n == -65536))
        {
          k = 180;
          break label337;
        }
        k = 0;
        break label337;
        k = 16;
        break label391;
        paramLong = v.b(paramLong, 1000000L, l2);
        break label415;
        k = 16;
        break label469;
      }
      parama = new j(((f)localObject2).id, i, ((Long)((Pair)localObject1).first).longValue(), l2, paramLong, localc.aOv, localc.aXO, localc.aXN, localc.aTz, paramb, paramDrmInitData);
      AppMethodBeat.o(94948);
      break;
    }
  }

  private static k a(l paraml, int paramInt1, int paramInt2, String paramString)
  {
    Object localObject1 = null;
    boolean bool = true;
    AppMethodBeat.i(94956);
    int i = paramInt1 + 8;
    int j;
    if (i - paramInt1 < paramInt2)
    {
      paraml.setPosition(i);
      j = paraml.readInt();
      if (paraml.readInt() == a.aWF)
      {
        paramInt1 = a.dT(paraml.readInt());
        paraml.eM(1);
        if (paramInt1 == 0)
        {
          paraml.eM(1);
          paramInt1 = 0;
          paramInt2 = 0;
          label74: if (paraml.readUnsignedByte() != 1)
            break label190;
          label82: i = paraml.readUnsignedByte();
          byte[] arrayOfByte = new byte[16];
          paraml.readBytes(arrayOfByte, 0, 16);
          Object localObject2 = localObject1;
          if (bool)
          {
            localObject2 = localObject1;
            if (i == 0)
            {
              j = paraml.readUnsignedByte();
              localObject2 = new byte[j];
              paraml.readBytes((byte[])localObject2, 0, j);
            }
          }
          paraml = new k(bool, paramString, i, arrayOfByte, paramInt2, paramInt1, (byte[])localObject2);
          AppMethodBeat.o(94956);
        }
      }
    }
    while (true)
    {
      return paraml;
      paramInt1 = paraml.readUnsignedByte();
      paramInt2 = (paramInt1 & 0xF0) >> 4;
      paramInt1 &= 15;
      break label74;
      label190: bool = false;
      break label82;
      i += j;
      break;
      AppMethodBeat.o(94956);
      paraml = null;
    }
  }

  public static m a(j paramj, a.a parama, i parami)
  {
    AppMethodBeat.i(94949);
    Object localObject1 = parama.dW(a.aWX);
    if (localObject1 != null);
    int i;
    for (Object localObject2 = new b.d((a.b)localObject1); ; localObject2 = new b.e((a.b)localObject1))
    {
      i = ((b.b)localObject2).getSampleCount();
      if (i != 0)
        break;
      paramj = new m(new long[0], new int[0], 0, new long[0], new int[0]);
      AppMethodBeat.o(94949);
      return paramj;
      localObject1 = parama.dW(a.aWY);
      if (localObject1 == null)
      {
        paramj = new o("Track has no sample table size information");
        AppMethodBeat.o(94949);
        throw paramj;
      }
    }
    boolean bool = false;
    Object localObject3 = parama.dW(a.aWZ);
    localObject1 = localObject3;
    if (localObject3 == null)
    {
      bool = true;
      localObject1 = parama.dW(a.aXa);
    }
    localObject3 = ((a.b)localObject1).aXz;
    Object localObject4 = parama.dW(a.aWW).aXz;
    l locall = parama.dW(a.aWT).aXz;
    localObject1 = parama.dW(a.aWU);
    label210: b.a locala;
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i4;
    int i5;
    if (localObject1 != null)
    {
      localObject1 = ((a.b)localObject1).aXz;
      parama = parama.dW(a.aWV);
      if (parama == null)
        break label474;
      parama = parama.aXz;
      locala = new b.a((l)localObject4, (l)localObject3, bool);
      locall.setPosition(12);
      j = locall.tI() - 1;
      k = locall.tI();
      m = locall.tI();
      n = 0;
      i1 = 0;
      i2 = 0;
      if (parama != null)
      {
        parama.setPosition(12);
        i1 = parama.tI();
      }
      i3 = -1;
      i4 = 0;
      localObject3 = localObject1;
      i5 = i3;
      if (localObject1 != null)
      {
        ((l)localObject1).setPosition(12);
        i4 = ((l)localObject1).tI();
        if (i4 <= 0)
          break label479;
        i5 = ((l)localObject1).tI() - 1;
        localObject3 = localObject1;
      }
      label325: if ((!((b.b)localObject2).rh()) || (!"audio/raw".equals(paramj.aOv.aOd)) || (j != 0) || (i1 != 0) || (i4 != 0))
        break label489;
    }
    int i6;
    long l1;
    Object localObject5;
    Object localObject6;
    long l2;
    int i7;
    int i8;
    int i9;
    label428: label474: label479: label489: for (int i3 = 1; ; i3 = 0)
    {
      i6 = 0;
      l1 = 0L;
      if (i3 != 0)
        break label928;
      localObject1 = new long[i];
      localObject4 = new int[i];
      localObject5 = new long[i];
      localObject6 = new int[i];
      l2 = 0L;
      i3 = 0;
      i7 = 0;
      i8 = i5;
      i9 = i4;
      i4 = i6;
      i5 = i2;
      if (i7 >= i)
        break label727;
      for (i2 = i3; i2 == 0; i2 = locala.aXH)
      {
        com.google.android.exoplayer2.i.a.checkState(locala.rf());
        l2 = locala.xb;
      }
      localObject1 = null;
      break;
      parama = null;
      break label210;
      localObject3 = null;
      i5 = i3;
      break label325;
    }
    if (parama != null)
    {
      while ((n == 0) && (i1 > 0))
      {
        n = parama.tI();
        i5 = parama.readInt();
        i1--;
      }
      n--;
    }
    label588: label1366: 
    while (true)
    {
      localObject1[i7] = l2;
      localObject4[i7] = ((b.b)localObject2).rg();
      i6 = i4;
      if (localObject4[i7] > i4)
        i6 = localObject4[i7];
      localObject5[i7] = (i5 + l1);
      if (localObject3 == null)
      {
        i4 = 1;
        localObject6[i7] = i4;
        i3 = i9;
        i10 = i8;
        if (i7 == i8)
        {
          localObject6[i7] = 1;
          i3 = i9 - 1;
          if (i3 <= 0)
            break label2013;
          i4 = ((l)localObject3).tI();
        }
      }
      label727: label2013: for (int i10 = i4 - 1; ; i10 = i8)
      {
        l1 += m;
        i4 = k - 1;
        if ((i4 == 0) && (j > 0))
        {
          i4 = locall.tI();
          m = locall.tI();
          j--;
        }
        while (true)
        {
          l2 += localObject4[i7];
          i2--;
          i7++;
          k = i4;
          i4 = i6;
          i9 = i3;
          i8 = i10;
          i3 = i2;
          break label428;
          i4 = 0;
          break label588;
          if (n == 0)
          {
            bool = true;
            com.google.android.exoplayer2.i.a.checkArgument(bool);
            label740: if (i1 <= 0)
              break label783;
            if (parama.tI() != 0)
              break label777;
          }
          for (bool = true; ; bool = false)
          {
            com.google.android.exoplayer2.i.a.checkArgument(bool);
            parama.readInt();
            i1--;
            break label740;
            bool = false;
            break;
          }
          if ((i9 != 0) || (k != 0) || (i3 != 0) || (j != 0))
            new StringBuilder("Inconsistent stbl box for track ").append(paramj.id).append(": remainingSynchronizationSamples ").append(i9).append(", remainingSamplesAtTimestampDelta ").append(k).append(", remainingSamplesInChunk ").append(i3).append(", remainingTimestampDeltaChanges ").append(j);
          localObject2 = localObject6;
          localObject3 = localObject5;
          parama = (a.a)localObject4;
          i5 = i4;
          while (true)
          {
            if ((paramj.aZp != null) && (!parami.rc()))
              break label1032;
            v.a((long[])localObject3, paramj.aZm);
            paramj = new m((long[])localObject1, parama, i5, (long[])localObject3, (int[])localObject2);
            AppMethodBeat.o(94949);
            break;
            parama = new long[locala.length];
            localObject1 = new int[locala.length];
            while (locala.rf())
            {
              parama[locala.index] = locala.xb;
              localObject1[locala.index] = locala.aXH;
            }
            localObject2 = d.a(((b.b)localObject2).rg(), parama, (int[])localObject1, m);
            localObject1 = ((d.a)localObject2).offsets;
            parama = ((d.a)localObject2).aSB;
            i5 = ((d.a)localObject2).aXU;
            localObject3 = ((d.a)localObject2).aXV;
            localObject2 = ((d.a)localObject2).aXW;
          }
          long l3;
          if ((paramj.aZp.length == 1) && (paramj.type == 1) && (localObject3.length >= 2))
          {
            l2 = paramj.aZq[0];
            l3 = v.b(paramj.aZp[0], paramj.aZm, paramj.aZn) + l2;
            if ((localObject3[0] <= l2) && (l2 < localObject3[1]) && (localObject3[(localObject3.length - 1)] < l3) && (l3 <= l1))
            {
              l2 = v.b(l2 - localObject3[0], paramj.aOv.sampleRate, paramj.aZm);
              l1 = v.b(l1 - l3, paramj.aOv.sampleRate, paramj.aZm);
              if (((l2 != 0L) || (l1 != 0L)) && (l2 <= 2147483647L) && (l1 <= 2147483647L))
              {
                parami.aOp = ((int)l2);
                parami.aOq = ((int)l1);
                v.a((long[])localObject3, paramj.aZm);
                paramj = new m((long[])localObject1, parama, i5, (long[])localObject3, (int[])localObject2);
                AppMethodBeat.o(94949);
                break;
              }
            }
          }
          if ((paramj.aZp.length == 1) && (paramj.aZp[0] == 0L))
          {
            for (i1 = 0; i1 < localObject3.length; i1++)
              localObject3[i1] = v.b(localObject3[i1] - paramj.aZq[0], 1000000L, paramj.aZm);
            paramj = new m((long[])localObject1, parama, i5, (long[])localObject3, (int[])localObject2);
            AppMethodBeat.o(94949);
            break;
          }
          if (paramj.type == 1)
          {
            bool = true;
            n = 0;
            i4 = 0;
            i1 = 0;
            i3 = 0;
            if (n >= paramj.aZp.length)
              break label1517;
            l2 = paramj.aZq[n];
            if (l2 == -1L)
              break label1991;
            l1 = v.b(paramj.aZp[n], paramj.aZm, paramj.aZn);
            k = v.a((long[])localObject3, l2, true, true);
            j = v.a((long[])localObject3, l1 + l2, bool, false);
            i7 = i4 + (j - k);
            if (i3 == k)
              break label1511;
            i4 = 1;
            i4 = i1 | i4;
            i1 = j;
            i3 = i7;
          }
          while (true)
          {
            n++;
            i7 = i3;
            i3 = i4;
            j = i1;
            i4 = i7;
            i1 = i3;
            i3 = j;
            break label1366;
            bool = false;
            break label1354;
            label1511: i4 = 0;
            break label1460;
            label1517: if (i4 != i)
            {
              i3 = 1;
              label1527: m = i1 | i3;
              if (m == 0)
                break label1826;
              parami = new long[i4];
              if (m == 0)
                break label1831;
              localObject4 = new int[i4];
              if (m == 0)
                break label1837;
              i3 = 0;
              if (m == 0)
                break label1844;
              localObject5 = new int[i4];
              localObject6 = new long[i4];
              l1 = 0L;
              i1 = 0;
              i7 = 0;
              i4 = i3;
              if (i7 >= paramj.aZp.length)
                break label1872;
              l2 = paramj.aZq[i7];
              l3 = paramj.aZp[i7];
              k = i4;
              n = i1;
              if (l2 == -1L)
                break label1851;
              long l4 = v.b(l3, paramj.aZm, paramj.aZn);
              j = v.a((long[])localObject3, l2, true, true);
              i2 = v.a((long[])localObject3, l2 + l4, bool, false);
              if (m != 0)
              {
                i3 = i2 - j;
                System.arraycopy(localObject1, j, parami, i1, i3);
                System.arraycopy(parama, j, localObject4, i1, i3);
                System.arraycopy(localObject2, j, localObject5, i1, i3);
              }
              i3 = i1;
              i1 = i4;
              k = i1;
              n = i3;
              if (j >= i2)
                break label1851;
              l4 = v.b(l1, 1000000L, paramj.aZn);
              localObject6[i3] = (v.b(localObject3[j] - l2, 1000000L, paramj.aZm) + l4);
              if ((m == 0) || (localObject4[i3] <= i1))
                break label1988;
              i1 = parama[j];
            }
            while (true)
            {
              i3++;
              j++;
              break label1735;
              i3 = 0;
              break label1527;
              parami = (i)localObject1;
              break label1544;
              localObject4 = parama;
              break label1555;
              i3 = i5;
              break label1563;
              localObject5 = localObject2;
              break label1574;
              l1 += l3;
              i1 = n;
              i7++;
              i4 = k;
              break label1593;
              i1 = 0;
              i3 = 0;
              if ((i3 < localObject5.length) && (i1 == 0))
              {
                if ((localObject5[i3] & 0x1) != 0);
                for (n = 1; ; n = 0)
                {
                  i1 |= n;
                  i3++;
                  break;
                }
              }
              if (i1 == 0)
              {
                v.a((long[])localObject3, paramj.aZm);
                paramj = new m((long[])localObject1, parama, i5, (long[])localObject3, (int[])localObject2);
                AppMethodBeat.o(94949);
                break;
              }
              paramj = new m(parami, (int[])localObject4, i4, (long[])localObject6, (int[])localObject5);
              AppMethodBeat.o(94949);
              break;
            }
            i7 = i3;
            i3 = i4;
            i4 = i1;
            i1 = i7;
          }
        }
      }
    }
  }

  public static Metadata a(a.b paramb, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(94950);
    if (paramBoolean)
    {
      AppMethodBeat.o(94950);
      paramb = localObject;
    }
    while (true)
    {
      return paramb;
      paramb = paramb.aXz;
      paramb.setPosition(8);
      while (true)
      {
        if (paramb.tB() < 8)
          break label224;
        int i = paramb.position;
        int j = paramb.readInt();
        if (paramb.readInt() == a.aXi)
        {
          paramb.setPosition(i);
          paramb.eM(12);
          while (true)
          {
            if (paramb.position >= i + j)
              break label201;
            int k = paramb.position;
            int m = paramb.readInt();
            if (paramb.readInt() == a.aXj)
            {
              paramb.setPosition(k);
              paramb.eM(8);
              ArrayList localArrayList = new ArrayList();
              while (paramb.position < k + m)
              {
                Metadata.Entry localEntry = f.o(paramb);
                if (localEntry != null)
                  localArrayList.add(localEntry);
              }
              if (localArrayList.isEmpty())
                break label201;
              paramb = new Metadata(localArrayList);
              AppMethodBeat.o(94950);
              break;
            }
            paramb.eM(m - 8);
          }
          label201: AppMethodBeat.o(94950);
          paramb = localObject;
          break;
        }
        paramb.eM(j - 8);
      }
      label224: AppMethodBeat.o(94950);
      paramb = localObject;
    }
  }

  private static Pair<long[], long[]> b(a.a parama)
  {
    AppMethodBeat.i(94952);
    if (parama != null)
    {
      parama = parama.dW(a.aWx);
      if (parama != null);
    }
    else
    {
      parama = Pair.create(null, null);
      AppMethodBeat.o(94952);
    }
    while (true)
    {
      return parama;
      l locall = parama.aXz;
      locall.setPosition(8);
      int i = a.dT(locall.readInt());
      int j = locall.tI();
      long[] arrayOfLong = new long[j];
      parama = new long[j];
      for (int k = 0; k < j; k++)
      {
        if (i == 1)
        {
          l = locall.tK();
          arrayOfLong[k] = l;
          if (i != 1)
            break label212;
        }
        label212: for (long l = locall.readLong(); ; l = locall.readInt())
        {
          parama[k] = l;
          byte[] arrayOfByte = locall.data;
          int m = locall.position;
          locall.position = (m + 1);
          m = arrayOfByte[m];
          arrayOfByte = locall.data;
          int n = locall.position;
          locall.position = (n + 1);
          if ((short)((m & 0xFF) << 8 | arrayOfByte[n] & 0xFF) == 1)
            break label222;
          parama = new IllegalArgumentException("Unsupported media rate.");
          AppMethodBeat.o(94952);
          throw parama;
          l = locall.cM();
          break;
        }
        label222: locall.eM(2);
      }
      parama = Pair.create(arrayOfLong, parama);
      AppMethodBeat.o(94952);
    }
  }

  private static Pair<Integer, k> b(l paraml, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    AppMethodBeat.i(94955);
    int i = paramInt1 + 8;
    Object localObject1 = null;
    Object localObject2 = null;
    int j = 0;
    int k = -1;
    if (i - paramInt1 < paramInt2)
    {
      paraml.setPosition(i);
      int m = paraml.readInt();
      int n = paraml.readInt();
      Object localObject3;
      Object localObject4;
      if (n == a.aWI)
      {
        localObject3 = Integer.valueOf(paraml.readInt());
        localObject4 = localObject2;
      }
      while (true)
      {
        i += m;
        localObject1 = localObject3;
        localObject2 = localObject4;
        break;
        if (n == a.aWD)
        {
          paraml.eM(4);
          localObject4 = paraml.readString(4);
          localObject3 = localObject1;
        }
        else
        {
          localObject3 = localObject1;
          localObject4 = localObject2;
          if (n == a.aWE)
          {
            j = m;
            k = i;
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
        }
      }
    }
    boolean bool2;
    if (("cenc".equals(localObject2)) || ("cbc1".equals(localObject2)) || ("cens".equals(localObject2)) || ("cbcs".equals(localObject2)))
      if (localObject1 != null)
      {
        bool2 = true;
        com.google.android.exoplayer2.i.a.checkArgument(bool2, "frma atom is mandatory");
        if (k == -1)
          break label276;
        bool2 = true;
        label221: com.google.android.exoplayer2.i.a.checkArgument(bool2, "schi atom is mandatory");
        paraml = a(paraml, k, j, localObject2);
        if (paraml == null)
          break label282;
        bool2 = bool1;
        label247: com.google.android.exoplayer2.i.a.checkArgument(bool2, "tenc atom is mandatory");
        paraml = Pair.create(localObject1, paraml);
        AppMethodBeat.o(94955);
      }
    while (true)
    {
      return paraml;
      bool2 = false;
      break;
      label276: bool2 = false;
      break label221;
      label282: bool2 = false;
      break label247;
      AppMethodBeat.o(94955);
      paraml = null;
    }
  }

  private static Pair<String, byte[]> c(l paraml, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(94953);
    paraml.setPosition(paramInt + 8 + 4);
    paraml.eM(1);
    k(paraml);
    paraml.eM(2);
    paramInt = paraml.readUnsignedByte();
    if ((paramInt & 0x80) != 0)
      paraml.eM(2);
    if ((paramInt & 0x40) != 0)
      paraml.eM(paraml.readUnsignedShort());
    if ((paramInt & 0x20) != 0)
      paraml.eM(2);
    paraml.eM(1);
    k(paraml);
    switch (paraml.readUnsignedByte())
    {
    default:
      paraml.eM(12);
      paraml.eM(1);
      paramInt = k(paraml);
      byte[] arrayOfByte = new byte[paramInt];
      paraml.readBytes(arrayOfByte, 0, paramInt);
      paraml = Pair.create(localObject, arrayOfByte);
      AppMethodBeat.o(94953);
    case 96:
    case 97:
    case 32:
    case 33:
    case 35:
    case 107:
    case 64:
    case 102:
    case 103:
    case 104:
    case 165:
    case 166:
    case 169:
    case 172:
    case 170:
    case 171:
    }
    while (true)
    {
      return paraml;
      localObject = "video/mpeg2";
      break;
      localObject = "video/mp4v-es";
      break;
      localObject = "video/avc";
      break;
      localObject = "video/hevc";
      break;
      paraml = Pair.create("audio/mpeg", null);
      AppMethodBeat.o(94953);
      continue;
      localObject = "audio/mp4a-latm";
      break;
      localObject = "audio/ac3";
      break;
      localObject = "audio/eac3";
      break;
      paraml = Pair.create("audio/vnd.dts", null);
      AppMethodBeat.o(94953);
      continue;
      paraml = Pair.create("audio/vnd.dts.hd", null);
      AppMethodBeat.o(94953);
    }
  }

  private static int k(l paraml)
  {
    AppMethodBeat.i(94957);
    int i = paraml.readUnsignedByte();
    for (int j = i & 0x7F; (i & 0x80) == 128; j = j << 7 | i & 0x7F)
      i = paraml.readUnsignedByte();
    AppMethodBeat.o(94957);
    return j;
  }

  static final class f
  {
    final int aOi;
    final long duration;
    final int id;

    public f(int paramInt1, long paramLong, int paramInt2)
    {
      this.id = paramInt1;
      this.duration = paramLong;
      this.aOi = paramInt2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.b
 * JD-Core Version:    0.6.2
 */