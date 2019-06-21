package com.bumptech.glide.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
  implements b, c
{
  private final c aHf;
  private b aHg;
  private b aHh;

  public a(c paramc)
  {
    this.aHf = paramc;
  }

  private boolean e(b paramb)
  {
    AppMethodBeat.i(92463);
    boolean bool;
    if ((paramb.equals(this.aHg)) || ((this.aHg.isFailed()) && (paramb.equals(this.aHh))))
    {
      bool = true;
      AppMethodBeat.o(92463);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92463);
    }
  }

  public final void a(b paramb1, b paramb2)
  {
    this.aHg = paramb1;
    this.aHh = paramb2;
  }

  public final boolean a(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(92459);
    if ((paramb instanceof a))
    {
      paramb = (a)paramb;
      if ((this.aHg.a(paramb.aHg)) && (this.aHh.a(paramb.aHh)))
      {
        bool = true;
        AppMethodBeat.o(92459);
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(92459);
      continue;
      AppMethodBeat.o(92459);
    }
  }

  public final boolean b(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(92460);
    int i;
    if ((this.aHf == null) || (this.aHf.b(this)))
    {
      i = 1;
      if ((i == 0) || (!e(paramb)))
        break label53;
      AppMethodBeat.o(92460);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label53: AppMethodBeat.o(92460);
      bool = false;
    }
  }

  public final void begin()
  {
    AppMethodBeat.i(92450);
    if (!this.aHg.isRunning())
      this.aHg.begin();
    AppMethodBeat.o(92450);
  }

  public final boolean c(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(92461);
    int i;
    if ((this.aHf == null) || (this.aHf.c(this)))
    {
      i = 1;
      if ((i == 0) || (!e(paramb)))
        break label53;
      AppMethodBeat.o(92461);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label53: AppMethodBeat.o(92461);
      bool = false;
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(92452);
    this.aHg.clear();
    if (this.aHh.isRunning())
      this.aHh.clear();
    AppMethodBeat.o(92452);
  }

  public final boolean d(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(92462);
    int i;
    if ((this.aHf == null) || (this.aHf.d(this)))
    {
      i = 1;
      if ((i == 0) || (!e(paramb)))
        break label53;
      AppMethodBeat.o(92462);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label53: AppMethodBeat.o(92462);
      bool = false;
    }
  }

  public final void f(b paramb)
  {
    AppMethodBeat.i(92465);
    if (this.aHf != null)
      this.aHf.f(this);
    AppMethodBeat.o(92465);
  }

  public final void g(b paramb)
  {
    AppMethodBeat.i(92466);
    if (!paramb.equals(this.aHh))
    {
      if (!this.aHh.isRunning())
        this.aHh.begin();
      AppMethodBeat.o(92466);
    }
    while (true)
    {
      return;
      if (this.aHf != null)
        this.aHf.g(this);
      AppMethodBeat.o(92466);
    }
  }

  public final boolean isCancelled()
  {
    AppMethodBeat.i(92456);
    boolean bool;
    if (this.aHg.isFailed())
    {
      bool = this.aHh.isCancelled();
      AppMethodBeat.o(92456);
    }
    while (true)
    {
      return bool;
      bool = this.aHg.isCancelled();
      AppMethodBeat.o(92456);
    }
  }

  public final boolean isComplete()
  {
    AppMethodBeat.i(92454);
    boolean bool;
    if (this.aHg.isFailed())
    {
      bool = this.aHh.isComplete();
      AppMethodBeat.o(92454);
    }
    while (true)
    {
      return bool;
      bool = this.aHg.isComplete();
      AppMethodBeat.o(92454);
    }
  }

  public final boolean isFailed()
  {
    AppMethodBeat.i(92457);
    boolean bool;
    if ((this.aHg.isFailed()) && (this.aHh.isFailed()))
    {
      bool = true;
      AppMethodBeat.o(92457);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92457);
    }
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(92453);
    boolean bool;
    if (this.aHg.isFailed())
    {
      bool = this.aHh.isRunning();
      AppMethodBeat.o(92453);
    }
    while (true)
    {
      return bool;
      bool = this.aHg.isRunning();
      AppMethodBeat.o(92453);
    }
  }

  public final boolean nL()
  {
    AppMethodBeat.i(92455);
    boolean bool;
    if (this.aHg.isFailed())
    {
      bool = this.aHh.nL();
      AppMethodBeat.o(92455);
    }
    while (true)
    {
      return bool;
      bool = this.aHg.nL();
      AppMethodBeat.o(92455);
    }
  }

  public final boolean nM()
  {
    boolean bool = false;
    AppMethodBeat.i(92464);
    int i;
    if ((this.aHf != null) && (this.aHf.nM()))
    {
      i = 1;
      if ((i == 0) && (!nL()))
        break label53;
      AppMethodBeat.o(92464);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label53: AppMethodBeat.o(92464);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(92451);
    if (!this.aHg.isFailed())
      this.aHg.pause();
    if (this.aHh.isRunning())
      this.aHh.pause();
    AppMethodBeat.o(92451);
  }

  public final void recycle()
  {
    AppMethodBeat.i(92458);
    this.aHg.recycle();
    this.aHh.recycle();
    AppMethodBeat.o(92458);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.f.a
 * JD-Core Version:    0.6.2
 */