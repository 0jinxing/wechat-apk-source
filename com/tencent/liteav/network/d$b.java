package com.tencent.liteav.network;

import android.os.Bundle;
import com.tencent.liteav.basic.g.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

class d$b
  implements com.tencent.liteav.basic.d.a, f
{
  private final int a;
  private long b;
  private long c;
  private int d;
  private boolean e;
  private long f;
  private long g;
  private long h;
  private ArrayList<b> i;
  private ArrayList<com.tencent.liteav.basic.g.a> j;
  private TXIStreamDownloader k;
  private WeakReference<d> l;
  private f m;

  public d$b(TXIStreamDownloader paramTXIStreamDownloader, d paramd)
  {
    AppMethodBeat.i(67584);
    this.a = 2;
    this.b = 0L;
    this.c = 0L;
    this.d = 0;
    this.e = false;
    this.f = 0L;
    this.g = 0L;
    this.h = 0L;
    this.i = new ArrayList();
    this.j = new ArrayList();
    this.k = null;
    this.l = new WeakReference(paramd);
    this.k = paramTXIStreamDownloader;
    this.k.setListener(this);
    AppMethodBeat.o(67584);
  }

  private void a(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(67589);
    if (parama == null)
      AppMethodBeat.o(67589);
    while (true)
    {
      return;
      if ((parama.e < this.c) || (parama.e < this.b))
      {
        AppMethodBeat.o(67589);
      }
      else if ((this.m != null) && (this.c > 0L) && (parama.e >= this.c))
      {
        this.m.onPullAudio(parama);
        AppMethodBeat.o(67589);
      }
      else
      {
        this.j.add(parama);
        AppMethodBeat.o(67589);
      }
    }
  }

  private void a(b paramb)
  {
    AppMethodBeat.i(67591);
    d locald = (d)this.l.get();
    if ((paramb.b == 0) && (!this.e))
    {
      this.d += 1;
      if ((locald != null) && ((d.a(locald) <= paramb.g) || (this.d == 2)))
      {
        this.b = locald.a(paramb.g);
        this.e = true;
      }
      if (locald != null)
        TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start begin gop " + this.d + " last iframe ts " + d.a(locald) + " pts " + paramb.g + " from " + this.b + " type " + paramb.b);
    }
    if (!this.e)
      AppMethodBeat.o(67591);
    while (true)
    {
      return;
      if (locald != null)
        locald.b(paramb.g);
      if (paramb.g >= this.b)
      {
        if ((paramb.b == 0) && (this.c == 0L))
        {
          this.c = paramb.g;
          TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start end " + paramb.g + " from " + this.b + " type " + paramb.b);
        }
        if (this.c > 0L)
        {
          if (this.m != null)
          {
            Iterator localIterator;
            Object localObject;
            if (!this.j.isEmpty())
            {
              localIterator = this.j.iterator();
              while (localIterator.hasNext())
              {
                localObject = (com.tencent.liteav.basic.g.a)localIterator.next();
                if (((com.tencent.liteav.basic.g.a)localObject).e >= this.c)
                {
                  TXCLog.i("TXCMultiStreamDownloader", " stream_switch pre start cache audio pts " + ((com.tencent.liteav.basic.g.a)localObject).e + " from " + this.c);
                  this.m.onPullAudio((com.tencent.liteav.basic.g.a)localObject);
                }
              }
              TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start end audio cache  " + this.j.size());
              this.j.clear();
            }
            if (!this.i.isEmpty())
            {
              TXCLog.w("TXCMultiStreamDownloader", " stream_switch pre start end video cache  " + this.i.size());
              localIterator = this.i.iterator();
              while (localIterator.hasNext())
              {
                localObject = (b)localIterator.next();
                this.m.onPullNAL((b)localObject);
              }
              this.i.clear();
            }
            this.m.onPullNAL(paramb);
            this.m = null;
            if (locald != null)
              locald.a(this.k, true);
            this.k.setNotifyListener(null);
            AppMethodBeat.o(67591);
            continue;
          }
          TXCLog.i("TXCMultiStreamDownloader", " stream_switch pre start cache video pts " + paramb.g + " from " + this.c + " type " + paramb.b);
          this.i.add(paramb);
        }
      }
      else
      {
        AppMethodBeat.o(67591);
      }
    }
  }

  private void b(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(67590);
    if (this.h > 0L)
      AppMethodBeat.o(67590);
    while (true)
    {
      return;
      if ((this.g > 0L) && (parama != null) && (parama.e >= this.g))
      {
        this.h = parama.e;
        AppMethodBeat.o(67590);
      }
      else
      {
        if (this.m != null)
          this.m.onPullAudio(parama);
        AppMethodBeat.o(67590);
      }
    }
  }

  private void b(b paramb)
  {
    AppMethodBeat.i(67592);
    d locald = (d)this.l.get();
    if (locald != null)
      locald.c(paramb.g);
    if (paramb.g >= this.f)
    {
      if (paramb.b == 0)
        this.g = paramb.g;
      if (this.g > 0L)
        if (this.h > 0L)
        {
          TXCLog.w("TXCMultiStreamDownloader", " stream_switch delay stop end video pts " + this.g + " audio ts " + this.h + " from " + this.f);
          if (locald != null)
            locald.b();
          this.m = null;
          this.k.setListener(null);
          this.k.stopDownload();
          AppMethodBeat.o(67592);
        }
    }
    while (true)
    {
      return;
      TXCLog.w("TXCMultiStreamDownloader", " stream_switch delay stop video end wait audio end video pts " + paramb.g + " from " + this.f + " type " + paramb.b);
      AppMethodBeat.o(67592);
      continue;
      if (this.m != null)
      {
        this.m.onPullNAL(paramb);
        AppMethodBeat.o(67592);
        continue;
        if (this.m != null)
          this.m.onPullNAL(paramb);
      }
      else
      {
        AppMethodBeat.o(67592);
      }
    }
  }

  public void a(long paramLong)
  {
    AppMethodBeat.i(67585);
    this.d = 0;
    this.b = paramLong;
    this.k.setListener(this);
    this.k.setNotifyListener(this);
    AppMethodBeat.o(67585);
  }

  public void a(f paramf)
  {
    this.m = paramf;
  }

  public void b(long paramLong)
  {
    AppMethodBeat.i(67586);
    this.b = 0L;
    this.f = paramLong;
    this.h = 0L;
    this.g = 0L;
    if ((this.k != null) && (this.f == 0L))
    {
      this.k.stopDownload();
      this.k = null;
    }
    AppMethodBeat.o(67586);
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(67593);
    if ((paramInt == 12012) || (paramInt == 12011))
    {
      paramBundle = (d)this.l.get();
      if (paramBundle != null)
        paramBundle.a(this.k, false);
      this.k.setNotifyListener(null);
    }
    AppMethodBeat.o(67593);
  }

  public void onPullAudio(com.tencent.liteav.basic.g.a parama)
  {
    AppMethodBeat.i(67587);
    if (this.b > 0L)
    {
      a(parama);
      AppMethodBeat.o(67587);
    }
    while (true)
    {
      return;
      if (this.f > 0L)
      {
        b(parama);
        AppMethodBeat.o(67587);
      }
      else
      {
        if (this.m != null)
          this.m.onPullAudio(parama);
        AppMethodBeat.o(67587);
      }
    }
  }

  public void onPullNAL(b paramb)
  {
    AppMethodBeat.i(67588);
    if (paramb == null)
      AppMethodBeat.o(67588);
    while (true)
    {
      return;
      if (this.b > 0L)
      {
        a(paramb);
        AppMethodBeat.o(67588);
      }
      else if (this.f > 0L)
      {
        b(paramb);
        AppMethodBeat.o(67588);
      }
      else
      {
        if (this.m != null)
          this.m.onPullNAL(paramb);
        AppMethodBeat.o(67588);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.d.b
 * JD-Core Version:    0.6.2
 */