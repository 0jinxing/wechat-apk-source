package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.aa;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import java.util.ArrayList;

public final class f extends j<aa>
{
  public static final String[] fnj;
  public e bSd;

  static
  {
    AppMethodBeat.i(47076);
    fnj = new String[] { j.a(aa.ccO, "WalletKindInfo") };
    AppMethodBeat.o(47076);
  }

  public f(e parame)
  {
    super(parame, aa.ccO, "WalletKindInfo", null);
    this.bSd = parame;
  }

  public final ArrayList<aa> cRg()
  {
    aa localaa = null;
    Object localObject = null;
    AppMethodBeat.i(47075);
    Cursor localCursor = this.bSd.a("select * from WalletKindInfo", null, 2);
    if (localCursor == null)
      AppMethodBeat.o(47075);
    while (true)
    {
      return localObject;
      localObject = localaa;
      if (localCursor.moveToFirst())
      {
        localObject = new ArrayList();
        do
        {
          localaa = new aa();
          localaa.d(localCursor);
          ((ArrayList)localObject).add(localaa);
        }
        while (localCursor.moveToNext());
      }
      localCursor.close();
      AppMethodBeat.o(47075);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.f
 * JD-Core Version:    0.6.2
 */