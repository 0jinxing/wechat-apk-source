package com.tencent.soter.a.c;

import android.content.SharedPreferences;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class a
{
  private static volatile a AvN = null;
  public SparseArray<String> AvO;
  public SharedPreferences AvP;
  public boolean bZi;
  public boolean cul;

  public a()
  {
    AppMethodBeat.i(10465);
    this.bZi = false;
    this.cul = false;
    this.AvO = new SparseArray(10);
    this.AvP = null;
    AppMethodBeat.o(10465);
  }

  public static a dRe()
  {
    AppMethodBeat.i(10466);
    if (AvN == null);
    while (true)
    {
      try
      {
        if (AvN == null)
        {
          locala1 = new com/tencent/soter/a/c/a;
          locala1.<init>();
          AvN = locala1;
        }
        a locala1 = AvN;
        return locala1;
      }
      finally
      {
        AppMethodBeat.o(10466);
      }
      a locala2 = AvN;
      AppMethodBeat.o(10466);
    }
  }

  public final boolean dRc()
  {
    try
    {
      boolean bool = this.cul;
      return bool;
    }
    finally
    {
    }
  }

  public final void dRf()
  {
    try
    {
      this.bZi = true;
      return;
    }
    finally
    {
    }
  }

  public final SparseArray<String> dRg()
  {
    try
    {
      SparseArray localSparseArray = this.AvO;
      return localSparseArray;
    }
    finally
    {
    }
  }

  public final SharedPreferences dRh()
  {
    try
    {
      SharedPreferences localSharedPreferences = this.AvP;
      return localSharedPreferences;
    }
    finally
    {
    }
  }

  public final boolean isInit()
  {
    try
    {
      boolean bool = this.bZi;
      return bool;
    }
    finally
    {
    }
  }

  public final void rq(boolean paramBoolean)
  {
    try
    {
      this.cul = paramBoolean;
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.soter.a.c.a
 * JD-Core Version:    0.6.2
 */