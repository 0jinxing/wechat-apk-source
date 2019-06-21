package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.aj;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j extends com.tencent.mm.sdk.e.j<aj>
{
  public static final String[] fnj;
  private e bSd;
  private List<Object> bkF;

  static
  {
    AppMethodBeat.i(47094);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(aj.ccO, "WalletUserInfo") };
    AppMethodBeat.o(47094);
  }

  public j(e parame)
  {
    super(parame, aj.ccO, "WalletUserInfo", null);
    AppMethodBeat.i(47087);
    this.bkF = new LinkedList();
    ab.i("MicroMsg.WalletUserInfoStorage", "already call constructor.");
    this.bSd = parame;
    AppMethodBeat.o(47087);
  }

  public final boolean apM()
  {
    AppMethodBeat.i(47090);
    boolean bool = this.bSd.hY("WalletUserInfo", "delete from WalletUserInfo");
    AppMethodBeat.o(47090);
    return bool;
  }

  public final boolean b(aj paramaj)
  {
    AppMethodBeat.i(47089);
    boolean bool;
    if (super.b(paramaj))
    {
      paramaj = this.bkF.iterator();
      while (paramaj.hasNext())
        paramaj.next();
      bool = true;
      AppMethodBeat.o(47089);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(47089);
    }
  }

  public final aj cRh()
  {
    AppMethodBeat.i(47088);
    aj localaj = new aj();
    Cursor localCursor = this.bSd.a("select * from WalletUserInfo", null, 2);
    localaj.field_is_reg = -1;
    if (localCursor == null)
      AppMethodBeat.o(47088);
    while (true)
    {
      return localaj;
      if (localCursor.moveToNext())
        localaj.d(localCursor);
      localCursor.close();
      AppMethodBeat.o(47088);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.j
 * JD-Core Version:    0.6.2
 */