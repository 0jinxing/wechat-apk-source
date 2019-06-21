package com.bumptech.glide.f;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class h
  implements b, c
{
  private b aHO;
  private b aHP;
  private final c aHf;
  private boolean isRunning;

  h()
  {
    this(null);
  }

  public h(c paramc)
  {
    this.aHf = paramc;
  }

  private boolean of()
  {
    AppMethodBeat.i(92524);
    boolean bool;
    if ((this.aHf != null) && (this.aHf.nM()))
    {
      bool = true;
      AppMethodBeat.o(92524);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92524);
    }
  }

  public final void a(b paramb1, b paramb2)
  {
    this.aHO = paramb1;
    this.aHP = paramb2;
  }

  public final boolean a(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(92534);
    if ((paramb instanceof h))
    {
      paramb = (h)paramb;
      if (this.aHO == null)
      {
        if (paramb.aHO != null)
          break label72;
        if (this.aHP != null)
          break label80;
        if (paramb.aHP != null)
          break label72;
        label47: bool = true;
        AppMethodBeat.o(92534);
      }
    }
    while (true)
    {
      return bool;
      if (this.aHO.a(paramb.aHO))
        break;
      label72: label80: 
      do
      {
        AppMethodBeat.o(92534);
        break;
      }
      while (!this.aHP.a(paramb.aHP));
      break label47;
      AppMethodBeat.o(92534);
    }
  }

  public final boolean b(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(92518);
    int i;
    if ((this.aHf == null) || (this.aHf.b(this)))
    {
      i = 1;
      if ((i == 0) || ((!paramb.equals(this.aHO)) && (this.aHO.nL())))
        break label68;
      AppMethodBeat.o(92518);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label68: AppMethodBeat.o(92518);
      bool = false;
    }
  }

  public final void begin()
  {
    AppMethodBeat.i(92525);
    this.isRunning = true;
    if ((!this.aHO.isComplete()) && (!this.aHP.isRunning()))
      this.aHP.begin();
    if ((this.isRunning) && (!this.aHO.isRunning()))
      this.aHO.begin();
    AppMethodBeat.o(92525);
  }

  public final boolean c(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(92519);
    int i;
    if ((this.aHf == null) || (this.aHf.c(this)))
    {
      i = 1;
      if ((i == 0) || (!paramb.equals(this.aHO)) || (nM()))
        break label63;
      AppMethodBeat.o(92519);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label63: AppMethodBeat.o(92519);
      bool = false;
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(92527);
    this.isRunning = false;
    this.aHP.clear();
    this.aHO.clear();
    AppMethodBeat.o(92527);
  }

  public final boolean d(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(92520);
    int i;
    if ((this.aHf == null) || (this.aHf.d(this)))
    {
      i = 1;
      if ((i == 0) || (!paramb.equals(this.aHO)))
        break label56;
      AppMethodBeat.o(92520);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label56: AppMethodBeat.o(92520);
      bool = false;
    }
  }

  public final void f(b paramb)
  {
    AppMethodBeat.i(92522);
    if (paramb.equals(this.aHP))
      AppMethodBeat.o(92522);
    while (true)
    {
      return;
      if (this.aHf != null)
        this.aHf.f(this);
      if (!this.aHP.isComplete())
        this.aHP.clear();
      AppMethodBeat.o(92522);
    }
  }

  public final void g(b paramb)
  {
    AppMethodBeat.i(92523);
    if (!paramb.equals(this.aHO))
      AppMethodBeat.o(92523);
    while (true)
    {
      return;
      if (this.aHf != null)
        this.aHf.g(this);
      AppMethodBeat.o(92523);
    }
  }

  public final boolean isCancelled()
  {
    AppMethodBeat.i(92531);
    boolean bool = this.aHO.isCancelled();
    AppMethodBeat.o(92531);
    return bool;
  }

  public final boolean isComplete()
  {
    AppMethodBeat.i(92529);
    boolean bool;
    if ((this.aHO.isComplete()) || (this.aHP.isComplete()))
    {
      bool = true;
      AppMethodBeat.o(92529);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92529);
    }
  }

  public final boolean isFailed()
  {
    AppMethodBeat.i(92532);
    boolean bool = this.aHO.isFailed();
    AppMethodBeat.o(92532);
    return bool;
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(92528);
    boolean bool = this.aHO.isRunning();
    AppMethodBeat.o(92528);
    return bool;
  }

  public final boolean nL()
  {
    AppMethodBeat.i(92530);
    boolean bool;
    if ((this.aHO.nL()) || (this.aHP.nL()))
    {
      bool = true;
      AppMethodBeat.o(92530);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92530);
    }
  }

  public final boolean nM()
  {
    AppMethodBeat.i(92521);
    boolean bool;
    if ((of()) || (nL()))
    {
      bool = true;
      AppMethodBeat.o(92521);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92521);
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(92526);
    this.isRunning = false;
    this.aHO.pause();
    this.aHP.pause();
    AppMethodBeat.o(92526);
  }

  public final void recycle()
  {
    AppMethodBeat.i(92533);
    this.aHO.recycle();
    this.aHP.recycle();
    AppMethodBeat.o(92533);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.f.h
 * JD-Core Version:    0.6.2
 */