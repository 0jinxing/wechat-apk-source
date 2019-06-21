package com.tencent.mm.plugin.appbrand.appcache.b.e;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class d extends com.tencent.mm.plugin.appbrand.q.c<c>
{
  public static final String[] fjY;
  private final e gTC;

  static
  {
    AppMethodBeat.i(129512);
    fjY = new String[] { j.a(c.fjX, "PredownloadCmdGetCodePersistentInfo") };
    AppMethodBeat.o(129512);
  }

  public d(e parame)
  {
    super(parame, c.fjX, "PredownloadCmdGetCodePersistentInfo", c.diI);
    this.gTC = parame;
  }

  public final List<c> c(String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(129511);
    paramArrayOfString = this.gTC.query("PredownloadCmdGetCodePersistentInfo", null, paramString, paramArrayOfString, null, null, null);
    if ((paramArrayOfString == null) || (paramArrayOfString.isClosed()))
    {
      paramString = Collections.emptyList();
      AppMethodBeat.o(129511);
    }
    while (true)
    {
      return paramString;
      paramString = new LinkedList();
      if (paramArrayOfString.moveToFirst())
        do
        {
          c localc = new c();
          localc.d(paramArrayOfString);
          paramString.add(localc);
        }
        while (paramArrayOfString.moveToNext());
      paramArrayOfString.close();
      AppMethodBeat.o(129511);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.e.d
 * JD-Core Version:    0.6.2
 */