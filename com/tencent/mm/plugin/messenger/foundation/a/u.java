package com.tencent.mm.plugin.messenger.foundation.a;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.ci.c;

public final class u
{
  private static SparseArray<u.a> oqA;
  private static c<t> oqB;

  static
  {
    AppMethodBeat.i(60015);
    oqA = new SparseArray();
    AppMethodBeat.o(60015);
  }

  public static <T extends a> void a(int paramInt, s<T> params)
  {
    try
    {
      AppMethodBeat.i(60011);
      u.a locala1 = (u.a)oqA.get(paramInt);
      u.a locala2 = locala1;
      if (locala1 == null)
      {
        locala2 = new com/tencent/mm/plugin/messenger/foundation/a/u$a;
        locala2.<init>((byte)0);
        oqA.put(paramInt, locala2);
      }
      locala2.aD(params);
      AppMethodBeat.o(60011);
      return;
    }
    finally
    {
    }
    throw params;
  }

  public static void a(s params)
  {
    try
    {
      AppMethodBeat.i(60012);
      u.a locala = (u.a)oqA.get(5);
      if (locala != null)
      {
        locala.remove(params);
        if (locala.size() == 0)
          oqA.remove(5);
      }
      AppMethodBeat.o(60012);
      return;
    }
    finally
    {
    }
    throw params;
  }

  public static <T extends a> void b(int paramInt, T paramT)
  {
    try
    {
      AppMethodBeat.i(60014);
      u.a locala = (u.a)oqA.get(paramInt);
      if (locala != null)
        locala.e(paramT);
      AppMethodBeat.o(60014);
      return;
    }
    finally
    {
    }
    throw paramT;
  }

  public static final void b(c<t> paramc)
  {
    oqB = paramc;
  }

  public static final c<t> bOt()
  {
    return oqB;
  }

  public static <T extends a> void h(T paramT)
  {
    try
    {
      AppMethodBeat.i(60013);
      u.a locala = (u.a)oqA.get(5);
      if (locala != null)
        locala.f(paramT);
      AppMethodBeat.o(60013);
      return;
    }
    finally
    {
    }
    throw paramT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a.u
 * JD-Core Version:    0.6.2
 */