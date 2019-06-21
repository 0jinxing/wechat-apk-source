package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends j<ad>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(47083);
    fnj = new String[] { j.a(ad.ccO, "WalletPrefInfo") };
    AppMethodBeat.o(47083);
  }

  public h(e parame)
  {
    super(parame, ad.ccO, "WalletPrefInfo", null);
    this.bSd = parame;
  }

  public final ad acO(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(47081);
    Cursor localCursor;
    if (!bo.isNullOrNil(paramString))
    {
      localCursor = this.bSd.a("select * from WalletPrefInfo where pref_key=?", new String[] { paramString }, 2);
      if (localCursor == null)
      {
        AppMethodBeat.o(47081);
        paramString = localObject2;
      }
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new ad();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(47081);
      continue;
      AppMethodBeat.o(47081);
      paramString = localObject2;
    }
  }

  public final boolean acP(String paramString)
  {
    AppMethodBeat.i(47082);
    boolean bool;
    if (!bo.isNullOrNil(paramString))
    {
      paramString = "delete from WalletPrefInfo where pref_key='" + paramString + "'";
      bool = this.bSd.hY("WalletPrefInfo", paramString);
      AppMethodBeat.o(47082);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(47082);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.h
 * JD-Core Version:    0.6.2
 */