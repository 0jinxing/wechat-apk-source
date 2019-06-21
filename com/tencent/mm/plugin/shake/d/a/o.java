package com.tencent.mm.plugin.shake.d.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class o extends j<n>
{
  public static final String[] diI;
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(24679);
    diI = new String[0];
    fnj = new String[] { j.a(n.ccO, "shaketvhistory") };
    AppMethodBeat.o(24679);
  }

  public o(e parame)
  {
    super(parame, n.ccO, "shaketvhistory", fnj);
    this.bSd = parame;
  }

  public final Cursor cky()
  {
    AppMethodBeat.i(24678);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("SELECT * FROM shaketvhistory ORDER BY createtime DESC");
    localObject = ((StringBuilder)localObject).toString();
    localObject = this.bSd.rawQuery((String)localObject, null);
    AppMethodBeat.o(24678);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.o
 * JD-Core Version:    0.6.2
 */