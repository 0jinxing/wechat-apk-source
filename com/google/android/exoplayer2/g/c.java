package com.google.android.exoplayer2.g;

import android.graphics.Point;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public final class c extends e
{
  private static final int[] bpg = new int[0];
  private final f.a bph;
  private final AtomicReference<c.b> bpi;

  public c()
  {
    this(null);
  }

  public c(f.a parama)
  {
    AppMethodBeat.i(95765);
    this.bph = parama;
    this.bpi = new AtomicReference(new c.b());
    AppMethodBeat.o(95765);
  }

  private static int a(o paramo, int[] paramArrayOfInt, int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, List<Integer> paramList)
  {
    AppMethodBeat.i(95767);
    int i = 0;
    int j = 0;
    if (i < paramList.size())
    {
      int k = ((Integer)paramList.get(i)).intValue();
      if (!a(paramo.bhv[k], paramString, paramArrayOfInt[k], paramInt1, paramInt2, paramInt3, paramInt4))
        break label82;
      j++;
    }
    label82: 
    while (true)
    {
      i++;
      break;
      AppMethodBeat.o(95767);
      return j;
    }
  }

  private static int a(o paramo, int[] paramArrayOfInt, c.a parama)
  {
    AppMethodBeat.i(95772);
    int i = 0;
    int j = 0;
    if (i < paramo.length)
    {
      if (!a(paramo.bhv[i], paramArrayOfInt[i], parama))
        break label51;
      j++;
    }
    label51: 
    while (true)
    {
      i++;
      break;
      AppMethodBeat.o(95772);
      return j;
    }
  }

  private static Point a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    AppMethodBeat.i(95778);
    int j;
    if (paramBoolean)
      if (paramInt3 > paramInt4)
      {
        j = 1;
        if (paramInt1 <= paramInt2)
          break label75;
        label26: if (j == i)
          break label107;
      }
    while (true)
    {
      Point localPoint;
      if (paramInt3 * paramInt1 >= paramInt4 * paramInt2)
      {
        localPoint = new Point(paramInt2, v.bi(paramInt2 * paramInt4, paramInt3));
        AppMethodBeat.o(95778);
      }
      while (true)
      {
        return localPoint;
        j = 0;
        break;
        label75: i = 0;
        break label26;
        localPoint = new Point(v.bi(paramInt1 * paramInt3, paramInt4), paramInt1);
        AppMethodBeat.o(95778);
      }
      label107: j = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = j;
    }
  }

  private static f a(p paramp, int[][] paramArrayOfInt, c.b paramb)
  {
    AppMethodBeat.i(95770);
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    int k = -1;
    int m = -1;
    for (int n = 0; n < paramp.length; n++)
    {
      o localo = paramp.bia[n];
      List localList = a(localo, paramb.viewportWidth, paramb.viewportHeight, paramb.bpp);
      int[] arrayOfInt = paramArrayOfInt[n];
      int i1 = 0;
      if (i1 < localo.length)
      {
        int i2 = m;
        int i3 = k;
        int i4 = j;
        int i5 = i;
        Object localObject2 = localObject1;
        Format localFormat;
        int i6;
        label203: int i7;
        label242: int i8;
        if (s(arrayOfInt[i1], paramb.bpt))
        {
          localFormat = localo.bhv[i1];
          if ((!localList.contains(Integer.valueOf(i1))) || ((localFormat.width != -1) && (localFormat.width > paramb.bpl)) || ((localFormat.height != -1) && (localFormat.height > paramb.bpm)) || ((localFormat.bitrate != -1) && (localFormat.bitrate > paramb.bpn)))
            break label402;
          i6 = 1;
          if (i6 == 0)
          {
            i2 = m;
            i3 = k;
            i4 = j;
            i5 = i;
            localObject2 = localObject1;
            if (!paramb.bpo);
          }
          else
          {
            if (i6 == 0)
              break label408;
            i7 = 2;
            boolean bool = s(arrayOfInt[i1], false);
            i8 = i7;
            if (bool)
              i8 = i7 + 1000;
            if (i8 <= j)
              break label414;
            i7 = 1;
            label280: if (i8 == j)
            {
              if (localFormat.qb() == m)
                break label420;
              i7 = bg(localFormat.qb(), m);
              label309: if ((!bool) || (i6 == 0))
                break label441;
              if (i7 <= 0)
                break label435;
              i7 = 1;
            }
          }
        }
        while (true)
        {
          i2 = m;
          i3 = k;
          i4 = j;
          i5 = i;
          localObject2 = localObject1;
          if (i7 != 0)
          {
            i3 = localFormat.bitrate;
            i2 = localFormat.qb();
            i5 = i1;
            localObject2 = localo;
            i4 = i8;
          }
          i1++;
          m = i2;
          k = i3;
          j = i4;
          i = i5;
          localObject1 = localObject2;
          break;
          label402: i6 = 0;
          break label203;
          label408: i7 = 1;
          break label242;
          label414: i7 = 0;
          break label280;
          label420: i7 = bg(localFormat.bitrate, k);
          break label309;
          label435: i7 = 0;
          continue;
          label441: if (i7 < 0)
            i7 = 1;
          else
            i7 = 0;
        }
      }
    }
    if (localObject1 == null)
    {
      paramp = null;
      AppMethodBeat.o(95770);
    }
    while (true)
    {
      return paramp;
      paramp = new d(localObject1, i);
      AppMethodBeat.o(95770);
    }
  }

  private static f a(p paramp, int[][] paramArrayOfInt, c.b paramb, f.a parama)
  {
    AppMethodBeat.i(95771);
    int i = -1;
    int j = -1;
    int k = 0;
    int m = 0;
    Object localObject1;
    int n;
    int i4;
    while (m < paramp.length)
    {
      localObject1 = paramp.bia[m];
      int[] arrayOfInt = paramArrayOfInt[m];
      n = 0;
      int i1 = j;
      if (n < ((o)localObject1).length)
      {
        int i2 = k;
        int i3 = i1;
        i4 = i;
        if (s(arrayOfInt[n], paramb.bpt))
        {
          localObject2 = localObject1.bhv[n];
          i3 = arrayOfInt[n];
          String str = paramb.bpj;
          if ((((Format)localObject2).aOs & 0x1) == 0)
            break label209;
          i4 = 1;
          label121: if (!a((Format)localObject2, str))
            break label221;
          if (i4 == 0)
            break label215;
          i4 = 4;
        }
        while (true)
        {
          j = i4;
          if (s(i3, false))
            j = i4 + 1000;
          i2 = k;
          i3 = i1;
          i4 = i;
          if (j > k)
          {
            i3 = n;
            i4 = m;
            i2 = j;
          }
          n++;
          k = i2;
          i1 = i3;
          i = i4;
          break;
          label209: i4 = 0;
          break label121;
          label215: i4 = 3;
          continue;
          label221: if (i4 != 0)
            i4 = 2;
          else
            i4 = 1;
        }
      }
      m++;
      j = i1;
    }
    if (i == -1)
    {
      paramp = null;
      AppMethodBeat.o(95771);
      return paramp;
    }
    Object localObject2 = paramp.bia[i];
    if (parama != null)
    {
      localObject1 = paramArrayOfInt[i];
      boolean bool = paramb.bpq;
      i4 = 0;
      paramp = null;
      paramb = new HashSet();
      m = 0;
      label304: if (m < ((o)localObject2).length)
      {
        paramArrayOfInt = localObject2.bhv[m];
        i = paramArrayOfInt.aOn;
        n = paramArrayOfInt.sampleRate;
        if (bool)
        {
          paramArrayOfInt = null;
          label342: paramArrayOfInt = new c.a(i, n, paramArrayOfInt);
          if (!paramb.add(paramArrayOfInt))
            break label525;
          n = a((o)localObject2, (int[])localObject1, paramArrayOfInt);
          if (n <= i4)
            break label525;
          i4 = n;
          paramp = paramArrayOfInt;
        }
      }
    }
    label525: 
    while (true)
    {
      m++;
      break label304;
      paramArrayOfInt = paramArrayOfInt.aOd;
      break label342;
      if (i4 > 1)
      {
        paramArrayOfInt = new int[i4];
        n = 0;
        m = 0;
        while (m < ((o)localObject2).length)
        {
          i4 = n;
          if (a(localObject2.bhv[m], localObject1[m], paramp))
          {
            paramArrayOfInt[n] = m;
            i4 = n + 1;
          }
          m++;
          n = i4;
        }
      }
      for (paramp = paramArrayOfInt; ; paramp = bpg)
      {
        if (paramp.length <= 0)
          break label505;
        paramp = parama.a((o)localObject2, paramp);
        AppMethodBeat.o(95771);
        break;
      }
      label505: paramp = new d((o)localObject2, j);
      AppMethodBeat.o(95771);
      break;
    }
  }

  private static List<Integer> a(o paramo, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i = 0;
    AppMethodBeat.i(95777);
    ArrayList localArrayList = new ArrayList(paramo.length);
    for (int j = 0; j < paramo.length; j++)
      localArrayList.add(Integer.valueOf(j));
    if ((paramInt1 == 2147483647) || (paramInt2 == 2147483647))
    {
      AppMethodBeat.o(95777);
      return localArrayList;
    }
    j = 2147483647;
    label74: if (i < paramo.length)
    {
      Format localFormat = paramo.bhv[i];
      if ((localFormat.width <= 0) || (localFormat.height <= 0))
        break label266;
      Point localPoint = a(paramBoolean, paramInt1, paramInt2, localFormat.width, localFormat.height);
      int k = localFormat.width * localFormat.height;
      if ((localFormat.width < (int)(localPoint.x * 0.98F)) || (localFormat.height < (int)(localPoint.y * 0.98F)) || (k >= j))
        break label266;
      j = k;
    }
    label266: 
    while (true)
    {
      i++;
      break label74;
      if (j != 2147483647)
        for (paramInt1 = localArrayList.size() - 1; paramInt1 >= 0; paramInt1--)
        {
          paramInt2 = ((Integer)localArrayList.get(paramInt1)).intValue();
          paramInt2 = paramo.bhv[paramInt2].qb();
          if ((paramInt2 == -1) || (paramInt2 > j))
            localArrayList.remove(paramInt1);
        }
      AppMethodBeat.o(95777);
      break;
    }
  }

  private static boolean a(Format paramFormat, int paramInt, c.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(95773);
    if ((s(paramInt, false)) && (paramFormat.aOn == parama.aOn) && (paramFormat.sampleRate == parama.sampleRate) && ((parama.mimeType == null) || (TextUtils.equals(parama.mimeType, paramFormat.aOd))))
    {
      bool = true;
      AppMethodBeat.o(95773);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(95773);
    }
  }

  private static boolean a(Format paramFormat, String paramString)
  {
    AppMethodBeat.i(95776);
    boolean bool;
    if ((paramString != null) && (TextUtils.equals(paramString, v.aP(paramFormat.aOt))))
    {
      bool = true;
      AppMethodBeat.o(95776);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95776);
    }
  }

  private static boolean a(Format paramFormat, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool = false;
    AppMethodBeat.i(95769);
    if ((s(paramInt1, false)) && ((paramInt1 & paramInt2) != 0) && ((paramString == null) || (v.j(paramFormat.aOd, paramString))) && ((paramFormat.width == -1) || (paramFormat.width <= paramInt3)) && ((paramFormat.height == -1) || (paramFormat.height <= paramInt4)) && ((paramFormat.bitrate == -1) || (paramFormat.bitrate <= paramInt5)))
    {
      bool = true;
      AppMethodBeat.o(95769);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(95769);
    }
  }

  private static f b(p paramp, int[][] paramArrayOfInt, c.b paramb)
  {
    AppMethodBeat.i(95774);
    Object localObject1 = null;
    int i = 0;
    int j = 0;
    for (int k = 0; k < paramp.length; k++)
    {
      o localo = paramp.bia[k];
      int[] arrayOfInt = paramArrayOfInt[k];
      int m = 0;
      if (m < localo.length)
      {
        int n = j;
        int i1 = i;
        Object localObject2 = localObject1;
        Format localFormat;
        label103: int i2;
        if (s(arrayOfInt[m], paramb.bpt))
        {
          localFormat = localo.bhv[m];
          if ((localFormat.aOs & 0x1) == 0)
            break label208;
          i1 = 1;
          if ((localFormat.aOs & 0x2) == 0)
            break label214;
          i2 = 1;
          label116: if (!a(localFormat, paramb.bpk))
            break label237;
          if (i1 == 0)
            break label220;
          i1 = 6;
        }
        while (true)
        {
          label137: i2 = i1;
          if (s(arrayOfInt[m], false))
            i2 = i1 + 1000;
          n = j;
          i1 = i;
          localObject2 = localObject1;
          if (i2 > j)
          {
            i1 = m;
            localObject2 = localo;
            n = i2;
          }
          label208: label214: label220: label237: 
          do
          {
            m++;
            j = n;
            i = i1;
            localObject1 = localObject2;
            break;
            i1 = 0;
            break label103;
            i2 = 0;
            break label116;
            if (i2 == 0)
            {
              i1 = 5;
              break label137;
            }
            i1 = 4;
            break label137;
            if (i1 != 0)
            {
              i1 = 3;
              break label137;
            }
            n = j;
            i1 = i;
            localObject2 = localObject1;
          }
          while (i2 == 0);
          if (a(localFormat, paramb.bpj))
            i1 = 2;
          else
            i1 = 1;
        }
      }
    }
    if (localObject1 == null)
    {
      paramp = null;
      AppMethodBeat.o(95774);
    }
    while (true)
    {
      return paramp;
      paramp = new d(localObject1, i);
      AppMethodBeat.o(95774);
    }
  }

  private static void b(o paramo, int[] paramArrayOfInt, int paramInt1, String paramString, int paramInt2, int paramInt3, int paramInt4, List<Integer> paramList)
  {
    AppMethodBeat.i(95768);
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      int j = ((Integer)paramList.get(i)).intValue();
      if (!a(paramo.bhv[j], paramString, paramArrayOfInt[j], paramInt1, paramInt2, paramInt3, paramInt4))
        paramList.remove(i);
    }
    AppMethodBeat.o(95768);
  }

  private static int bg(int paramInt1, int paramInt2)
  {
    int i = -1;
    if (paramInt1 == -1)
    {
      paramInt1 = i;
      if (paramInt2 == -1)
        paramInt1 = 0;
    }
    while (true)
    {
      return paramInt1;
      if (paramInt2 == -1)
        paramInt1 = 1;
      else
        paramInt1 -= paramInt2;
    }
  }

  private static f c(p paramp, int[][] paramArrayOfInt, c.b paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(95775);
    int i = 0;
    int j = 0;
    int k = 0;
    Object localObject2 = null;
    int m;
    label47: int n;
    label91: int i1;
    if (i < paramp.length)
    {
      o localo = paramp.bia[i];
      int[] arrayOfInt = paramArrayOfInt[i];
      m = 0;
      if (m < localo.length)
      {
        if (!s(arrayOfInt[m], paramb.bpt))
          break label202;
        if ((localo.bhv[m].aOs & 0x1) != 0)
        {
          n = 1;
          if (n == 0)
            break label154;
          i1 = 2;
          label99: n = i1;
          if (s(arrayOfInt[m], false))
            n = i1 + 1000;
          if (n <= j)
            break label202;
          k = m;
          localObject2 = localo;
        }
      }
    }
    while (true)
    {
      m++;
      j = n;
      break label47;
      n = 0;
      break label91;
      label154: i1 = 1;
      break label99;
      i++;
      break;
      if (localObject2 == null)
      {
        AppMethodBeat.o(95775);
        paramp = localObject1;
      }
      while (true)
      {
        return paramp;
        paramp = new d(localObject2, k);
        AppMethodBeat.o(95775);
      }
      label202: n = j;
    }
  }

  private static boolean s(int paramInt, boolean paramBoolean)
  {
    paramInt &= 7;
    if ((paramInt == 4) || ((paramBoolean) && (paramInt == 3)));
    for (paramBoolean = true; ; paramBoolean = false)
      return paramBoolean;
  }

  protected final f[] a(s[] paramArrayOfs, p[] paramArrayOfp, int[][][] paramArrayOfInt)
  {
    AppMethodBeat.i(95766);
    int i = paramArrayOfs.length;
    f[] arrayOff = new f[i];
    c.b localb = (c.b)this.bpi.get();
    int j = 0;
    int k = 0;
    int m = 0;
    int n;
    Object localObject1;
    p localp;
    Object localObject2;
    label111: int i1;
    label135: int i2;
    o localo;
    int[] arrayOfInt1;
    int i3;
    int i4;
    int i5;
    int i6;
    boolean bool;
    if (m < i)
    {
      if (2 != paramArrayOfs[m].getTrackType())
        break label799;
      n = k;
      if (k == 0)
      {
        localObject1 = paramArrayOfs[m];
        localp = paramArrayOfp[m];
        int[][] arrayOfInt = paramArrayOfInt[m];
        f.a locala = this.bph;
        localObject2 = null;
        if (locala != null)
        {
          if (localb.bpr)
          {
            k = 24;
            if ((!localb.bpq) || ((((s)localObject1).pJ() & k) == 0))
              break label315;
            i1 = 1;
            i2 = 0;
            if (i2 >= localp.length)
              break label524;
            localo = localp.bia[i2];
            arrayOfInt1 = arrayOfInt[i2];
            i3 = localb.bpl;
            i4 = localb.bpm;
            i5 = localb.bpn;
            i6 = localb.viewportWidth;
            n = localb.viewportHeight;
            bool = localb.bpp;
            if (localo.length >= 2)
              break label321;
            localObject2 = bpg;
            label221: if (localObject2.length <= 0)
              break label518;
            localObject2 = locala.a(localo, (int[])localObject2);
          }
        }
        else
        {
          label240: localObject1 = localObject2;
          if (localObject2 == null)
            localObject1 = a(localp, arrayOfInt, localb);
          arrayOff[m] = localObject1;
          if (arrayOff[m] == null)
            break label530;
          n = 1;
        }
      }
      else
      {
        label278: if (paramArrayOfp[m].length <= 0)
          break label536;
        k = 1;
        label291: j = k | j;
      }
    }
    while (true)
    {
      m++;
      k = n;
      break;
      k = 16;
      break label111;
      label315: i1 = 0;
      break label135;
      label321: List localList = a(localo, i6, n, bool);
      if (localList.size() < 2)
      {
        localObject2 = bpg;
        break label221;
      }
      localObject2 = null;
      if (i1 == 0)
      {
        HashSet localHashSet = new HashSet();
        n = 0;
        label464: for (i6 = 0; i6 < localList.size(); i6++)
        {
          int i7 = ((Integer)localList.get(i6)).intValue();
          localObject1 = localo.bhv[i7].aOd;
          if (!localHashSet.add(localObject1))
            break label790;
          i7 = a(localo, arrayOfInt1, k, (String)localObject1, i3, i4, i5, localList);
          if (i7 <= n)
            break label790;
          n = i7;
          localObject2 = localObject1;
        }
      }
      while (true)
      {
        b(localo, arrayOfInt1, k, (String)localObject2, i3, i4, i5, localList);
        if (localList.size() < 2)
        {
          localObject2 = bpg;
          break label221;
        }
        localObject2 = v.z(localList);
        break label221;
        label518: i2++;
        break;
        label524: localObject2 = null;
        break label240;
        label530: n = 0;
        break label278;
        label536: k = 0;
        break label291;
        i1 = 0;
        m = 0;
        k = 0;
        if (k < i)
        {
          n = i1;
          i2 = m;
          switch (paramArrayOfs[k].getTrackType())
          {
          default:
            arrayOff[k] = c(paramArrayOfp[k], paramArrayOfInt[k], localb);
            i2 = m;
            n = i1;
          case 2:
          case 1:
          case 3:
          }
          label673: label716: 
          do
          {
            do
            {
              k++;
              i1 = n;
              m = i2;
              break;
              n = i1;
              i2 = m;
            }
            while (i1 != 0);
            localp = paramArrayOfp[k];
            localObject1 = paramArrayOfInt[k];
            if (j != 0)
            {
              localObject2 = null;
              arrayOff[k] = a(localp, (int[][])localObject1, localb, (f.a)localObject2);
              if (arrayOff[k] == null)
                break label716;
            }
            for (n = 1; ; n = 0)
            {
              i2 = m;
              break;
              localObject2 = this.bph;
              break label673;
            }
            n = i1;
            i2 = m;
          }
          while (m != 0);
          arrayOff[k] = b(paramArrayOfp[k], paramArrayOfInt[k], localb);
          if (arrayOff[k] != null);
          for (n = 1; ; n = 0)
          {
            i2 = n;
            n = i1;
            break;
          }
        }
        AppMethodBeat.o(95766);
        return arrayOff;
        label790: break label464;
        localObject2 = null;
      }
      label799: n = k;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.c
 * JD-Core Version:    0.6.2
 */