package com.tencent.mm.audio.mix.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.a.d;
import java.util.ArrayList;

public class c
{
  private static c ckN;
  private ArrayList<d> ckL;
  private Object sLock;

  private c()
  {
    AppMethodBeat.i(136987);
    this.ckL = new ArrayList();
    this.sLock = new Object();
    AppMethodBeat.o(136987);
  }

  public static c Dk()
  {
    AppMethodBeat.i(136988);
    if (ckN == null);
    try
    {
      if (ckN == null)
      {
        localc = new com/tencent/mm/audio/mix/b/c;
        localc.<init>();
        ckN = localc;
      }
      c localc = ckN;
      AppMethodBeat.o(136988);
      return localc;
    }
    finally
    {
      AppMethodBeat.o(136988);
    }
  }

  public final d Dj()
  {
    AppMethodBeat.i(136989);
    synchronized (this.sLock)
    {
      if (this.ckL.size() > 0)
      {
        locald = (d)this.ckL.remove(this.ckL.size() - 1);
        AppMethodBeat.o(136989);
        return locald;
      }
      d locald = new d();
      AppMethodBeat.o(136989);
    }
  }

  public final long Dl()
  {
    try
    {
      AppMethodBeat.i(136991);
      long l = this.ckL.size() * 3536;
      AppMethodBeat.o(136991);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(136990);
    if ((paramd == null) || (paramd.ckv == null))
      AppMethodBeat.o(136990);
    while (true)
    {
      return;
      paramd.reset();
      synchronized (this.sLock)
      {
        this.ckL.add(0, paramd);
        AppMethodBeat.o(136990);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.c
 * JD-Core Version:    0.6.2
 */