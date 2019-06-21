package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.n;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;

public final class a extends j<n>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(47049);
    fnj = new String[] { j.a(n.ccO, "LoanEntryInfo") };
    AppMethodBeat.o(47049);
  }

  public a(e parame)
  {
    super(parame, n.ccO, "LoanEntryInfo", null);
    this.bSd = parame;
  }

  public final boolean apM()
  {
    AppMethodBeat.i(47048);
    boolean bool = this.bSd.hY("LoanEntryInfo", "delete from LoanEntryInfo");
    AppMethodBeat.o(47048);
    return bool;
  }

  public final n cQZ()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(47047);
    Cursor localCursor = this.bSd.a("select * from LoanEntryInfo", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(47047);
    while (true)
    {
      return localObject2;
      localObject2 = localObject1;
      if (localCursor.moveToFirst())
      {
        localObject2 = new n();
        ((n)localObject2).d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(47047);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.a
 * JD-Core Version:    0.6.2
 */