package com.tencent.mm.plugin.wepkg.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends j<a>
{
  public static final String[] fnj;
  private static final Object lock;
  private static b uVJ;
  private com.tencent.mm.sdk.e.e gTC;

  static
  {
    AppMethodBeat.i(63390);
    fnj = new String[] { j.a(a.fjX, "WePkgDiffPackage") };
    lock = new Object();
    AppMethodBeat.o(63390);
  }

  private b(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, a.fjX, "WePkgDiffPackage", a.diI);
    this.gTC = parame;
  }

  private boolean ayG()
  {
    if (this.gTC != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static b dgn()
  {
    AppMethodBeat.i(63387);
    if (uVJ == null);
    synchronized (lock)
    {
      if ((uVJ == null) || (!uVJ.ayG()))
      {
        b localb = new com/tencent/mm/plugin/wepkg/b/b;
        localb.<init>(g.RP().eJN);
        uVJ = localb;
      }
      ??? = uVJ;
      AppMethodBeat.o(63387);
      return ???;
    }
  }

  public final a ahC(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(63388);
    if ((!ayG()) || (bo.isNullOrNil(paramString)))
    {
      AppMethodBeat.o(63388);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      Cursor localCursor = rawQuery(String.format("select * from %s where %s=%s", new Object[] { "WePkgDiffPackage", "pkgId", "'" + paramString + "'" }), new String[0]);
      if (localCursor != null)
      {
        if (localCursor.moveToFirst())
        {
          paramString = new a();
          paramString.d(localCursor);
          localCursor.close();
          AppMethodBeat.o(63388);
        }
        else
        {
          localCursor.close();
          AppMethodBeat.o(63388);
          paramString = localObject;
        }
      }
      else
      {
        AppMethodBeat.o(63388);
        paramString = localObject;
      }
    }
  }

  public final boolean pI(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(63389);
    if ((!ayG()) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(63389);
    while (true)
    {
      return bool;
      bool = hY("WePkgDiffPackage", String.format("delete from %s where %s=%s", new Object[] { "WePkgDiffPackage", "pkgId", "'" + paramString + "'" }));
      AppMethodBeat.o(63389);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.b.b
 * JD-Core Version:    0.6.2
 */