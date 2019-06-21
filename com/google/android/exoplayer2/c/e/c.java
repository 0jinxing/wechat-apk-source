package com.google.android.exoplayer2.c.e;

import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
  implements com.google.android.exoplayer2.c.e
{
  public static final com.google.android.exoplayer2.c.h aTh;
  private h aZR;
  private com.google.android.exoplayer2.c.g baf;
  private boolean bag;

  static
  {
    AppMethodBeat.i(95038);
    aTh = new com.google.android.exoplayer2.c.h()
    {
      public final com.google.android.exoplayer2.c.e[] ra()
      {
        AppMethodBeat.i(95033);
        c localc = new c();
        AppMethodBeat.o(95033);
        return new com.google.android.exoplayer2.c.e[] { localc };
      }
    };
    AppMethodBeat.o(95038);
  }

  private boolean j(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(95037);
    Object localObject = new e();
    if ((!((e)localObject).c(paramf, true)) || ((((e)localObject).type & 0x2) != 2))
      AppMethodBeat.o(95037);
    while (true)
    {
      return bool;
      int i = Math.min(((e)localObject).bar, 8);
      localObject = new l(i);
      paramf.b(((l)localObject).data, 0, i);
      ((l)localObject).setPosition(0);
      if (b.r((l)localObject))
        this.aZR = new b();
      while (true)
      {
        AppMethodBeat.o(95037);
        bool = true;
        break;
        ((l)localObject).setPosition(0);
        if (j.r((l)localObject))
        {
          this.aZR = new j();
        }
        else
        {
          ((l)localObject).setPosition(0);
          if (!g.r((l)localObject))
            break label160;
          this.aZR = new g();
        }
      }
      label160: AppMethodBeat.o(95037);
    }
  }

  public final int a(f paramf, k paramk)
  {
    int i = 0;
    AppMethodBeat.i(95036);
    if (this.aZR == null)
    {
      if (!j(paramf))
      {
        paramf = new o("Failed to determine bitstream type");
        AppMethodBeat.o(95036);
        throw paramf;
      }
      paramf.qY();
    }
    if (!this.bag)
    {
      localObject = this.baf.dM(0);
      this.baf.rb();
      this.aZR.a(this.baf, (m)localObject);
      this.bag = true;
    }
    Object localObject = this.aZR;
    switch (((h)localObject).state)
    {
    default:
      paramf = new IllegalStateException();
      AppMethodBeat.o(95036);
      throw paramf;
    case 0:
      i = ((h)localObject).l(paramf);
      AppMethodBeat.o(95036);
    case 1:
    case 2:
    }
    while (true)
    {
      return i;
      paramf.dG((int)((h)localObject).bay);
      ((h)localObject).state = 2;
      AppMethodBeat.o(95036);
      continue;
      i = ((h)localObject).b(paramf, paramk);
      AppMethodBeat.o(95036);
    }
  }

  public final void a(com.google.android.exoplayer2.c.g paramg)
  {
    this.baf = paramg;
  }

  public final boolean a(f paramf)
  {
    AppMethodBeat.i(95034);
    try
    {
      bool = j(paramf);
      AppMethodBeat.o(95034);
      return bool;
    }
    catch (o paramf)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(95034);
      }
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95035);
    if (this.aZR != null)
      this.aZR.g(paramLong1, paramLong2);
    AppMethodBeat.o(95035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.e.c
 * JD-Core Version:    0.6.2
 */