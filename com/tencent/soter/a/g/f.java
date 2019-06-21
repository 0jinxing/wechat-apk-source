package com.tencent.soter.a.g;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.soter.a.b.e;

public class f
{
  private static volatile f Awu = null;
  static volatile SparseArray<d> Awv = null;
  final Object Aww;

  private f()
  {
    AppMethodBeat.i(10484);
    this.Aww = new Object();
    Awv = new SparseArray(5);
    AppMethodBeat.o(10484);
  }

  public static f dRn()
  {
    AppMethodBeat.i(10485);
    if (Awu == null);
    while (true)
    {
      try
      {
        if (Awu == null)
        {
          localf1 = new com/tencent/soter/a/g/f;
          localf1.<init>();
          Awu = localf1;
        }
        f localf1 = Awu;
        return localf1;
      }
      finally
      {
        AppMethodBeat.o(10485);
      }
      f localf2 = Awu;
      AppMethodBeat.o(10485);
    }
  }

  public final boolean a(d paramd, e parame)
  {
    AppMethodBeat.i(10486);
    int i;
    Object localObject;
    int j;
    if (!paramd.dRl())
    {
      i = paramd.hashCode();
      localObject = this.Aww;
      j = 0;
    }
    while (true)
    {
      try
      {
        if (j < Awv.size())
        {
          int k = Awv.keyAt(j);
          if ((Awv.get(k) != null) && (((d)Awv.get(k)).getClass().getName().equals(paramd.getClass().getName())))
          {
            com.tencent.soter.core.c.d.w("Soter.SoterTaskManager", "soter: already such type of task. abandon add task", new Object[0]);
            parame.errCode = 26;
            parame.aIm = "add SOTER task to queue failed. check the logcat for further information";
            paramd.b(parame);
            AppMethodBeat.o(10486);
            bool = false;
            return bool;
          }
          j++;
          continue;
        }
        Awv.put(i, paramd);
        g.dRq().R(new f.1(this, paramd));
        bool = true;
        AppMethodBeat.o(10486);
        continue;
      }
      finally
      {
        AppMethodBeat.o(10486);
      }
      com.tencent.soter.core.c.d.d("Soter.SoterTaskManager", "soter: prepare eat execute.", new Object[0]);
      AppMethodBeat.o(10486);
      boolean bool = false;
    }
  }

  public final void dRo()
  {
    int i = 0;
    AppMethodBeat.i(10487);
    synchronized (this.Aww)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterTaskManager", "soter: request cancel all", new Object[0]);
      if (Awv.size() != 0)
        while (i < Awv.size())
        {
          int j = Awv.keyAt(i);
          g localg = g.dRq();
          f.2 local2 = new com/tencent/soter/a/g/f$2;
          local2.<init>(this, j);
          localg.R(local2);
          i++;
        }
      Awv.clear();
      AppMethodBeat.o(10487);
      return;
    }
  }

  public final void dRp()
  {
    int i = 0;
    AppMethodBeat.i(10488);
    synchronized (this.Aww)
    {
      com.tencent.soter.core.c.d.i("Soter.SoterTaskManager", "soter: request publish cancellation", new Object[0]);
      if (Awv.size() != 0)
        while (i < Awv.size())
        {
          int j = Awv.keyAt(i);
          g localg = g.dRq();
          Runnable local3 = new com/tencent/soter/a/g/f$3;
          local3.<init>(this, j);
          localg.R(local3);
          i++;
        }
      AppMethodBeat.o(10488);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.g.f
 * JD-Core Version:    0.6.2
 */