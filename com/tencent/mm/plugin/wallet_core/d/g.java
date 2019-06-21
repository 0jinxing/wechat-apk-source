package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import java.util.HashMap;
import java.util.Map;

public final class g extends j<ab>
{
  public static final String[] fnj;
  public static Map<String, ab> gms;
  private e bSd;

  static
  {
    AppMethodBeat.i(47080);
    fnj = new String[] { j.a(ab.ccO, "WalletLuckyMoney") };
    gms = new HashMap();
    AppMethodBeat.o(47080);
  }

  public g(e parame)
  {
    super(parame, ab.ccO, "WalletLuckyMoney", null);
    this.bSd = parame;
  }

  public final boolean a(ab paramab)
  {
    AppMethodBeat.i(47078);
    if ((paramab != null) && (gms.containsKey(paramab.field_mNativeUrl)))
      gms.put(paramab.field_mNativeUrl, paramab);
    boolean bool = super.a(paramab);
    AppMethodBeat.o(47078);
    return bool;
  }

  public final ab acN(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(47077);
    Cursor localCursor = this.bSd.rawQuery("select * from WalletLuckyMoney where mNativeUrl=?", new String[] { paramString });
    if (localCursor == null)
    {
      AppMethodBeat.o(47077);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (localCursor.getCount() == 0)
      {
        localCursor.close();
        AppMethodBeat.o(47077);
        paramString = localObject;
      }
      else
      {
        localCursor.moveToFirst();
        paramString = new ab();
        paramString.d(localCursor);
        localCursor.close();
        AppMethodBeat.o(47077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.g
 * JD-Core Version:    0.6.2
 */