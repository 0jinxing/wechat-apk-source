package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;

final class j extends h
{
  private j.a baH;
  private int baI;
  private boolean baJ;
  private k.d baK;
  private k.b baL;

  public static boolean r(l paraml)
  {
    AppMethodBeat.i(95056);
    try
    {
      bool = k.a(1, paraml, true);
      AppMethodBeat.o(95056);
      return bool;
    }
    catch (o paraml)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(95056);
      }
    }
  }

  protected final void V(long paramLong)
  {
    int i = 0;
    AppMethodBeat.i(95058);
    super.V(paramLong);
    if (paramLong != 0L);
    for (boolean bool = true; ; bool = false)
    {
      this.baJ = bool;
      if (this.baK != null)
        i = this.baK.bbd;
      this.baI = i;
      AppMethodBeat.o(95058);
      return;
    }
  }

  protected final boolean a(l paraml, long paramLong, h.a parama)
  {
    AppMethodBeat.i(95060);
    boolean bool1;
    if (this.baH != null)
    {
      bool1 = false;
      AppMethodBeat.o(95060);
    }
    while (true)
    {
      return bool1;
      int i;
      long l;
      int j;
      int k;
      int m;
      int n;
      int i1;
      if (this.baK == null)
      {
        k.a(1, paraml, false);
        paramLong = paraml.tE();
        i = paraml.readUnsignedByte();
        l = paraml.tE();
        j = paraml.tF();
        k = paraml.tF();
        m = paraml.tF();
        n = paraml.readUnsignedByte();
        i1 = (int)Math.pow(2.0D, n & 0xF);
        n = (int)Math.pow(2.0D, (n & 0xF0) >> 4);
        if ((paraml.readUnsignedByte() & 0x1) > 0)
        {
          bool1 = true;
          label123: this.baK = new k.d(paramLong, i, l, j, k, m, i1, n, bool1, Arrays.copyOf(paraml.data, paraml.limit));
          paraml = null;
        }
      }
      while (true)
      {
        this.baH = paraml;
        if (this.baH != null)
          break label946;
        bool1 = true;
        AppMethodBeat.o(95060);
        break;
        bool1 = false;
        break label123;
        Object localObject1;
        Object localObject2;
        if (this.baL == null)
        {
          k.a(3, paraml, false);
          localObject1 = paraml.readString((int)paraml.tE());
          m = ((String)localObject1).length();
          paramLong = paraml.tE();
          localObject2 = new String[(int)paramLong];
          i1 = m + 11 + 4;
          for (m = 0; m < paramLong; m++)
          {
            localObject2[m] = paraml.readString((int)paraml.tE());
            i1 = i1 + 4 + localObject2[m].length();
          }
          if ((paraml.readUnsignedByte() & 0x1) == 0)
          {
            paraml = new o("framing bit expected to be set");
            AppMethodBeat.o(95060);
            throw paraml;
          }
          this.baL = new k.b((String)localObject1, (String[])localObject2, i1 + 1);
          paraml = null;
        }
        else
        {
          localObject2 = new byte[paraml.limit];
          System.arraycopy(paraml.data, 0, localObject2, 0, paraml.limit);
          i = this.baK.channels;
          k.a(5, paraml, false);
          n = paraml.readUnsignedByte();
          localObject1 = new i(paraml.data);
          ((i)localObject1).ee(paraml.position * 8);
          m = 0;
          if (m < n + 1)
          {
            if (((i)localObject1).ed(24) != 5653314)
            {
              paraml = new o("expected code book to start with [0x56, 0x43, 0x42] at " + (((i)localObject1).baF * 8 + ((i)localObject1).baG));
              AppMethodBeat.o(95060);
              throw paraml;
            }
            int i2 = ((i)localObject1).ed(16);
            int i3 = ((i)localObject1).ed(24);
            paraml = new long[i3];
            bool1 = ((i)localObject1).rl();
            if (!bool1)
            {
              boolean bool2 = ((i)localObject1).rl();
              i1 = 0;
              if (i1 < paraml.length)
              {
                if ((bool2) && (!((i)localObject1).rl()))
                  paraml[i1] = 0L;
                while (true)
                {
                  i1++;
                  break;
                  paraml[i1] = (((i)localObject1).ed(5) + 1);
                }
              }
            }
            else
            {
              i1 = ((i)localObject1).ed(5) + 1;
              k = 0;
              while (k < paraml.length)
              {
                int i4 = ((i)localObject1).ed(k.ef(i3 - k));
                for (j = 0; (j < i4) && (k < paraml.length); j++)
                {
                  paraml[k] = i1;
                  k++;
                }
                i1++;
              }
            }
            k = ((i)localObject1).ed(4);
            if (k > 2)
            {
              paraml = new o("lookup type greater than 2 not decodable: ".concat(String.valueOf(k)));
              AppMethodBeat.o(95060);
              throw paraml;
            }
            if ((k == 1) || (k == 2))
            {
              ((i)localObject1).ee(32);
              ((i)localObject1).ee(32);
              i1 = ((i)localObject1).ed(4);
              ((i)localObject1).ee(1);
              if (k != 1)
                break label801;
              if (i2 == 0)
                break label796;
              paramLong = i3;
              l = i2;
              paramLong = ()Math.floor(Math.pow(paramLong, 1.0D / l));
            }
            while (true)
            {
              ((i)localObject1).ee((int)(paramLong * (i1 + 1)));
              new k.a(i2, i3, paraml, k, bool1);
              m++;
              break;
              label796: paramLong = 0L;
              continue;
              label801: paramLong = i3 * i2;
            }
          }
          i1 = ((i)localObject1).ed(6);
          for (m = 0; m < i1 + 1; m++)
            if (((i)localObject1).ed(16) != 0)
            {
              paraml = new o("placeholder of time domain transforms not zeroed out");
              AppMethodBeat.o(95060);
              throw paraml;
            }
          k.c((i)localObject1);
          k.b((i)localObject1);
          k.a(i, (i)localObject1);
          paraml = k.a((i)localObject1);
          if (!((i)localObject1).rl())
          {
            paraml = new o("framing bit after modes not set as expected");
            AppMethodBeat.o(95060);
            throw paraml;
          }
          m = k.ef(paraml.length - 1);
          paraml = new j.a(this.baK, this.baL, (byte[])localObject2, paraml, m);
        }
      }
      label946: paraml = new ArrayList();
      paraml.add(this.baH.baM.data);
      paraml.add(this.baH.baN);
      parama.aOv = Format.a(null, "audio/vorbis", this.baH.baM.bbb, -1, this.baH.baM.channels, (int)this.baH.baM.sampleRate, paraml, null, null);
      bool1 = true;
      AppMethodBeat.o(95060);
    }
  }

  protected final void reset(boolean paramBoolean)
  {
    AppMethodBeat.i(95057);
    super.reset(paramBoolean);
    if (paramBoolean)
    {
      this.baH = null;
      this.baK = null;
      this.baL = null;
    }
    this.baI = 0;
    this.baJ = false;
    AppMethodBeat.o(95057);
  }

  protected final long s(l paraml)
  {
    int i = 0;
    AppMethodBeat.i(95059);
    long l;
    if ((paraml.data[0] & 0x1) == 1)
    {
      l = -1L;
      AppMethodBeat.o(95059);
      return l;
    }
    int j = paraml.data[0];
    j.a locala = this.baH;
    int k = locala.baP;
    if (!locala.baO[(j >> 1 & 255 >>> 8 - k)].baW);
    for (k = locala.baM.bbd; ; k = locala.baM.bbe)
    {
      if (this.baJ)
        i = (this.baI + k) / 4;
      l = i;
      paraml.eL(paraml.limit + 4);
      paraml.data[(paraml.limit - 4)] = ((byte)(byte)(int)(l & 0xFF));
      paraml.data[(paraml.limit - 3)] = ((byte)(byte)(int)(l >>> 8 & 0xFF));
      paraml.data[(paraml.limit - 2)] = ((byte)(byte)(int)(l >>> 16 & 0xFF));
      paraml.data[(paraml.limit - 1)] = ((byte)(byte)(int)(l >>> 24 & 0xFF));
      this.baJ = true;
      this.baI = k;
      l = i;
      AppMethodBeat.o(95059);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.j
 * JD-Core Version:    0.6.2
 */