package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.h.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract interface i
{
  public abstract h a(b paramb, b paramb1);

  public abstract void a(f paramf, i.a parama);

  public abstract void b(h paramh);

  public abstract void rX();

  public abstract void rY();

  public static final class b
  {
    public static final b bhp;
    public final int bhq;
    public final int bhr;
    public final int bhs;

    static
    {
      AppMethodBeat.i(95514);
      bhp = new b(-1, -1, -1);
      AppMethodBeat.o(95514);
    }

    public b(int paramInt)
    {
      this(paramInt, -1, -1);
    }

    public b(int paramInt1, int paramInt2, int paramInt3)
    {
      this.bhq = paramInt1;
      this.bhr = paramInt2;
      this.bhs = paramInt3;
    }

    public final b em(int paramInt)
    {
      AppMethodBeat.i(95512);
      b localb;
      if (this.bhq == paramInt)
      {
        AppMethodBeat.o(95512);
        localb = this;
      }
      while (true)
      {
        return localb;
        localb = new b(paramInt, this.bhr, this.bhs);
        AppMethodBeat.o(95512);
      }
    }

    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      AppMethodBeat.i(95513);
      if (this == paramObject)
        AppMethodBeat.o(95513);
      while (true)
      {
        return bool;
        if ((paramObject == null) || (getClass() != paramObject.getClass()))
        {
          AppMethodBeat.o(95513);
          bool = false;
        }
        else
        {
          paramObject = (b)paramObject;
          if ((this.bhq == paramObject.bhq) && (this.bhr == paramObject.bhr) && (this.bhs == paramObject.bhs))
          {
            AppMethodBeat.o(95513);
          }
          else
          {
            AppMethodBeat.o(95513);
            bool = false;
          }
        }
      }
    }

    public final int hashCode()
    {
      return ((this.bhq + 527) * 31 + this.bhr) * 31 + this.bhs;
    }

    public final boolean sh()
    {
      if (this.bhr != -1);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.i
 * JD-Core Version:    0.6.2
 */