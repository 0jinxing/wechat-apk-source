package com.tencent.mm.audio.mix.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;

public final class c
{
  private static long ckE = 0L;
  private static long ckF = 0L;
  private String appId;
  private long bufferSize;
  public int channels;
  public boolean ckA;
  public boolean ckB;
  private a ckC;
  public String ckD;
  public int cku;
  private ArrayList<d> ckx;
  public boolean cky;
  public String ckz;
  private int count;
  public long duration;
  private int index;
  public int sampleRate;

  public c(String paramString)
  {
    AppMethodBeat.i(136961);
    this.index = 0;
    this.count = 0;
    this.bufferSize = 0L;
    this.ckB = false;
    this.sampleRate = 44100;
    this.channels = 2;
    this.cku = 2;
    this.ckx = new ArrayList();
    this.ckz = paramString;
    AppMethodBeat.o(136961);
  }

  private void Db()
  {
    AppMethodBeat.i(136971);
    this.ckB = false;
    Df();
    AppMethodBeat.o(136971);
  }

  private void Dd()
  {
    try
    {
      AppMethodBeat.i(136973);
      De();
      AppMethodBeat.o(136973);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void De()
  {
    AppMethodBeat.i(136974);
    if (this.ckC == null)
    {
      this.ckC = new a(this.appId, this.ckz);
      if (this.ckC.open())
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "openCacheFile success");
        this.ckC.setLength(Da());
        AppMethodBeat.o(136974);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "openCacheFile fail");
      this.ckB = false;
      Df();
      AppMethodBeat.o(136974);
    }
  }

  private void Df()
  {
    AppMethodBeat.i(136975);
    if (this.ckC != null)
    {
      this.ckC.close();
      this.ckC.CZ();
      this.ckC = null;
    }
    AppMethodBeat.o(136975);
  }

  private int b(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    AppMethodBeat.i(136976);
    if (this.ckC != null)
    {
      paramInt = this.ckC.b(paramArrayOfByte, paramLong, paramInt);
      AppMethodBeat.o(136976);
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      AppMethodBeat.o(136976);
    }
  }

  private void gu(int paramInt)
  {
    AppMethodBeat.i(136965);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "resetProvider src:%s, size:%d, complete:%b, duration:%d, supportMixPlay:%b, bufferSize:%d", new Object[] { this.ckz, Integer.valueOf(paramInt), Boolean.valueOf(this.cky), Long.valueOf(this.duration), Boolean.valueOf(this.ckA), Long.valueOf(this.bufferSize) });
    this.ckx.clear();
    this.cky = false;
    this.duration = 0L;
    this.ckA = false;
    this.index = 0;
    this.bufferSize = 0L;
    Db();
    AppMethodBeat.o(136965);
  }

  private d gw(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(136977);
    Object localObject2;
    if (paramInt >= this.count)
    {
      AppMethodBeat.o(136977);
      localObject2 = localObject1;
    }
    while (true)
    {
      return localObject2;
      if (this.ckC == null)
      {
        AppMethodBeat.o(136977);
        localObject2 = localObject1;
      }
      else
      {
        int i = paramInt * 3536;
        if (i > this.ckC.getLength())
        {
          AppMethodBeat.o(136977);
          localObject2 = localObject1;
        }
        else
        {
          localObject2 = com.tencent.mm.audio.mix.b.b.Di().Dj();
          if (localObject2 == null)
          {
            AppMethodBeat.o(136977);
            localObject2 = localObject1;
          }
          else
          {
            if (((d)localObject2).ckv == null)
              ((d)localObject2).ckv = new byte[3536];
            while (true)
            {
              System.nanoTime();
              if (b(((d)localObject2).ckv, i, ((d)localObject2).ckv.length) > 0)
                break label164;
              com.tencent.mm.audio.mix.b.b.Di().b((d)localObject2);
              AppMethodBeat.o(136977);
              localObject2 = localObject1;
              break;
              Arrays.fill(((d)localObject2).ckv, 0, ((d)localObject2).ckv.length, (byte)0);
            }
            label164: ((d)localObject2).ckD = this.ckD;
            ((d)localObject2).sampleRate = this.sampleRate;
            ((d)localObject2).channels = this.channels;
            ((d)localObject2).cku = this.cku;
            ((d)localObject2).ckG = (paramInt * 20);
            AppMethodBeat.o(136977);
          }
        }
      }
    }
  }

  public final long Da()
  {
    AppMethodBeat.i(136970);
    long l;
    if (this.bufferSize > 0L)
    {
      l = this.bufferSize;
      AppMethodBeat.o(136970);
    }
    while (true)
    {
      return l;
      this.bufferSize = (size() * 3536);
      l = this.bufferSize;
      AppMethodBeat.o(136970);
    }
  }

  public final void Dc()
  {
    try
    {
      AppMethodBeat.i(136972);
      if (this.ckC != null)
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "closeCacheFileWithNoDiscard success");
        this.ckC.close();
        this.ckC = null;
      }
      AppMethodBeat.o(136972);
      return;
    }
    finally
    {
    }
  }

  public final void a(d paramd)
  {
    AppMethodBeat.i(136967);
    this.index += 1;
    paramd.ckG = (this.index * 20);
    if (this.ckx != null)
      this.ckx.add(paramd);
    AppMethodBeat.o(136967);
  }

  public final void complete()
  {
    AppMethodBeat.i(136969);
    this.cky = true;
    this.count = size();
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "src:%s is complete cache", new Object[] { this.ckz });
    AppMethodBeat.o(136969);
  }

  public final boolean du(String paramString)
  {
    try
    {
      AppMethodBeat.i(136964);
      boolean bool;
      if (this.ckB)
      {
        com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "cache to file has finish, file:%s", new Object[] { this.ckz });
        AppMethodBeat.o(136964);
        bool = true;
      }
      while (true)
      {
        return bool;
        this.appId = paramString;
        int i = this.ckx.size();
        if (i > 0)
          De();
        if (this.ckC == null)
        {
          com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.PcmBufferProvider", "cacheFile is null");
          this.ckB = false;
          AppMethodBeat.o(136964);
          bool = false;
        }
        else
        {
          label234: for (int j = 0; ; j++)
          {
            if (j >= i)
              break label240;
            paramString = (d)this.ckx.get(j);
            if (j == 0)
            {
              this.ckD = paramString.ckD;
              this.sampleRate = paramString.sampleRate;
              this.cku = paramString.cku;
              this.channels = paramString.channels;
            }
            if (paramString != null)
            {
              byte[] arrayOfByte = paramString.ckv;
              long l = j * 3536;
              int k = paramString.ckv.length;
              if (this.ckC != null);
              for (bool = this.ckC.c(arrayOfByte, l, k); ; bool = false)
              {
                if (bool)
                  break label234;
                Df();
                com.tencent.mm.audio.mix.h.b.e("MicroMsg.Mix.PcmBufferProvider", "setCacheToFile fail");
                this.ckB = false;
                AppMethodBeat.o(136964);
                bool = false;
                break;
              }
            }
          }
          label240: this.ckB = true;
          for (j = i - 1; j >= 0; j--)
          {
            paramString = (d)this.ckx.remove(j);
            if (paramString != null)
              com.tencent.mm.audio.mix.b.c.Dk().b(paramString);
          }
          com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.PcmBufferProvider", "setCacheToFile finish");
          AppMethodBeat.o(136964);
          bool = true;
        }
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final d gv(int paramInt)
  {
    d locald = null;
    AppMethodBeat.i(136966);
    if ((this.ckB) && (this.ckC != null))
    {
      locald = gw(paramInt);
      AppMethodBeat.o(136966);
    }
    while (true)
    {
      return locald;
      if ((this.ckB) && (this.ckC == null))
      {
        Dd();
        locald = gw(paramInt);
        AppMethodBeat.o(136966);
      }
      else if ((this.ckx == null) || (this.ckx.size() == 0))
      {
        AppMethodBeat.o(136966);
      }
      else if (paramInt >= this.ckx.size())
      {
        AppMethodBeat.o(136966);
      }
      else
      {
        locald = (d)this.ckx.get(paramInt);
        AppMethodBeat.o(136966);
      }
    }
  }

  public final void recycle()
  {
    try
    {
      AppMethodBeat.i(136963);
      int i = this.ckx.size();
      for (int j = i - 1; j >= 0; j--)
      {
        d locald = (d)this.ckx.remove(j);
        if (locald != null)
          com.tencent.mm.audio.mix.b.c.Dk().b(locald);
      }
      gu(i);
      AppMethodBeat.o(136963);
      return;
    }
    finally
    {
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(136962);
      int i = this.ckx.size();
      for (int j = i - 1; j >= 0; j--)
      {
        d locald = (d)this.ckx.remove(j);
        if (locald != null)
        {
          locald.ckD = null;
          locald.ckv = null;
        }
      }
      gu(i);
      AppMethodBeat.o(136962);
      return;
    }
    finally
    {
    }
  }

  public final int size()
  {
    AppMethodBeat.i(136968);
    int i;
    if ((this.count > 0) && (this.cky))
    {
      i = this.count;
      AppMethodBeat.o(136968);
    }
    while (true)
    {
      return i;
      i = this.ckx.size();
      AppMethodBeat.o(136968);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.a.c
 * JD-Core Version:    0.6.2
 */