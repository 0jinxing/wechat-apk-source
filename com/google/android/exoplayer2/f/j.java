package com.google.android.exoplayer2.f;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.k;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

public final class j extends com.google.android.exoplayer2.a
  implements Handler.Callback
{
  private boolean beE;
  private boolean beF;
  private final k bef;
  private final Handler bfa;
  private final j.a blf;
  private final g blg;
  private int blh;
  private Format bli;
  private e blj;
  private h blk;
  private i bll;
  private i blm;
  private int bln;

  public j(j.a parama, Looper paramLooper)
  {
    this(parama, paramLooper, g.bld);
  }

  private j(j.a parama, Looper paramLooper, g paramg)
  {
    super(3);
    AppMethodBeat.i(95657);
    this.blf = ((j.a)com.google.android.exoplayer2.i.a.checkNotNull(parama));
    if (paramLooper == null);
    for (parama = null; ; parama = new Handler(paramLooper, this))
    {
      this.bfa = parama;
      this.blg = paramg;
      this.bef = new k();
      AppMethodBeat.o(95657);
      return;
    }
  }

  private void sH()
  {
    AppMethodBeat.i(95663);
    this.blk = null;
    this.bln = -1;
    if (this.bll != null)
    {
      this.bll.release();
      this.bll = null;
    }
    if (this.blm != null)
    {
      this.blm.release();
      this.blm = null;
    }
    AppMethodBeat.o(95663);
  }

  private void sI()
  {
    AppMethodBeat.i(95664);
    sH();
    this.blj.release();
    this.blj = null;
    this.blh = 0;
    AppMethodBeat.o(95664);
  }

  private void sJ()
  {
    AppMethodBeat.i(95665);
    sI();
    this.blj = this.blg.k(this.bli);
    AppMethodBeat.o(95665);
  }

  private long sK()
  {
    AppMethodBeat.i(95666);
    long l;
    if ((this.bln == -1) || (this.bln >= this.bll.sG()))
    {
      l = 9223372036854775807L;
      AppMethodBeat.o(95666);
    }
    while (true)
    {
      return l;
      l = this.bll.et(this.bln);
      AppMethodBeat.o(95666);
    }
  }

  private void x(List<a> paramList)
  {
    AppMethodBeat.i(95667);
    if (this.bfa != null)
    {
      this.bfa.obtainMessage(0, paramList).sendToTarget();
      AppMethodBeat.o(95667);
    }
    while (true)
    {
      return;
      y(paramList);
      AppMethodBeat.o(95667);
    }
  }

  private void y(List<a> paramList)
  {
    AppMethodBeat.i(95669);
    this.blf.t(paramList);
    AppMethodBeat.o(95669);
  }

  public final void a(Format[] paramArrayOfFormat, long paramLong)
  {
    AppMethodBeat.i(95659);
    this.bli = paramArrayOfFormat[0];
    if (this.blj != null)
    {
      this.blh = 1;
      AppMethodBeat.o(95659);
    }
    while (true)
    {
      return;
      this.blj = this.blg.k(this.bli);
      AppMethodBeat.o(95659);
    }
  }

  public final int b(Format paramFormat)
  {
    AppMethodBeat.i(95658);
    int i;
    if (this.blg.g(paramFormat))
    {
      i = 4;
      AppMethodBeat.o(95658);
    }
    while (true)
    {
      return i;
      if (com.google.android.exoplayer2.i.i.aJ(paramFormat.aOd))
      {
        i = 1;
        AppMethodBeat.o(95658);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(95658);
      }
    }
  }

  public final void b(long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(95660);
    x(Collections.emptyList());
    this.beE = false;
    this.beF = false;
    if (this.blh != 0)
    {
      sJ();
      AppMethodBeat.o(95660);
    }
    while (true)
    {
      return;
      sH();
      this.blj.flush();
      AppMethodBeat.o(95660);
    }
  }

  public final void f(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95661);
    if (this.beF)
      AppMethodBeat.o(95661);
    while (true)
    {
      return;
      if (this.blm == null)
        this.blj.ai(paramLong1);
      Object localObject;
      try
      {
        this.blm = ((i)this.blj.qJ());
        if (this.state != 2)
          AppMethodBeat.o(95661);
      }
      catch (f localf1)
      {
        localObject = com.google.android.exoplayer2.e.b(localf1, this.index);
        AppMethodBeat.o(95661);
        throw ((Throwable)localObject);
      }
      if (this.bll != null)
      {
        paramLong2 = sK();
        for (i = 0; paramLong2 <= paramLong1; i = 1)
        {
          this.bln += 1;
          paramLong2 = sK();
        }
      }
      int i = 0;
      int j = i;
      if (this.blm != null)
      {
        if (!this.blm.qG())
          break label243;
        j = i;
        if (i == 0)
        {
          j = i;
          if (sK() == 9223372036854775807L)
          {
            if (this.blh != 2)
              break label227;
            sJ();
            j = i;
          }
        }
      }
      while (true)
      {
        if (j != 0)
          x(this.bll.ak(paramLong1));
        if (this.blh != 2)
          break label359;
        AppMethodBeat.o(95661);
        break;
        label227: sH();
        this.beF = true;
        j = i;
        continue;
        label243: j = i;
        if (this.blm.aSk <= paramLong1)
        {
          if (this.bll != null)
            this.bll.release();
          this.bll = this.blm;
          this.blm = null;
          this.bln = this.bll.aj(paramLong1);
          j = 1;
        }
      }
      label304: label359: 
      do
        try
        {
          i = a(this.bef, this.blk, false);
          if (i == -4)
          {
            if (this.blk.qG())
              this.beE = true;
            while (true)
            {
              this.blj.ad(this.blk);
              this.blk = null;
              if (this.beE)
                break label518;
              if (this.blk == null)
              {
                this.blk = ((h)this.blj.qI());
                localObject = this.blk;
                if (localObject == null)
                {
                  AppMethodBeat.o(95661);
                  break;
                }
              }
              if (this.blh != 1)
                break label304;
              this.blk.flags = 4;
              this.blj.ad(this.blk);
              this.blk = null;
              this.blh = 2;
              AppMethodBeat.o(95661);
              break;
              this.blk.aOr = this.bef.aOv.aOr;
              this.blk.qL();
            }
          }
        }
        catch (f localf2)
        {
          com.google.android.exoplayer2.e locale = com.google.android.exoplayer2.e.b(localf2, this.index);
          AppMethodBeat.o(95661);
          throw locale;
        }
      while (i != -3);
      AppMethodBeat.o(95661);
      continue;
      label518: AppMethodBeat.o(95661);
    }
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(95668);
    switch (paramMessage.what)
    {
    default:
      paramMessage = new IllegalStateException();
      AppMethodBeat.o(95668);
      throw paramMessage;
    case 0:
    }
    y((List)paramMessage.obj);
    AppMethodBeat.o(95668);
    return true;
  }

  public final boolean isReady()
  {
    return true;
  }

  public final void pK()
  {
    AppMethodBeat.i(95662);
    this.bli = null;
    x(Collections.emptyList());
    sI();
    AppMethodBeat.o(95662);
  }

  public final boolean qf()
  {
    return this.beF;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.f.j
 * JD-Core Version:    0.6.2
 */