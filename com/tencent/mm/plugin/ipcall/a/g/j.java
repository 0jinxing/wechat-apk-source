package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.g;
import com.tencent.mm.cd.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class j extends com.tencent.mm.sdk.e.j<i>
  implements g.a
{
  public static final String[] fnj;
  private e bSd;
  public n gvC;

  static
  {
    AppMethodBeat.i(21941);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(i.ccO, "IPCallPopularCountry") };
    AppMethodBeat.o(21941);
  }

  public j(e parame)
  {
    super(parame, i.ccO, "IPCallPopularCountry", null);
    AppMethodBeat.i(21938);
    this.gvC = new j.1(this);
    this.bSd = parame;
    AppMethodBeat.o(21938);
  }

  public final void O(int paramInt, long paramLong)
  {
    AppMethodBeat.i(21939);
    i locali = new i();
    Cursor localCursor = this.bSd.a("IPCallPopularCountry", null, "countryCode=?", new String[] { Integer.toString(paramInt) }, null, null, null, 2);
    boolean bool;
    if (!localCursor.moveToFirst())
    {
      ab.i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:".concat(String.valueOf(paramInt)));
      localCursor.close();
      locali.field_countryCode = paramInt;
      locali.field_lastCallTime = paramLong;
      locali.field_callTimeCount = 1L;
      bool = b(locali);
    }
    while (true)
    {
      ab.i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:".concat(String.valueOf(bool)));
      AppMethodBeat.o(21939);
      return;
      locali.d(localCursor);
      locali.field_callTimeCount += 1L;
      locali.field_lastCallTime = paramLong;
      bool = super.a(locali);
      localCursor.close();
    }
  }

  public final int a(g paramg)
  {
    this.bSd = paramg;
    return 0;
  }

  public final ArrayList<Integer> bIa()
  {
    AppMethodBeat.i(21940);
    ArrayList localArrayList = new ArrayList();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" ORDER BY IPCallPopularCountry.callTimeCount DESC,IPCallPopularCountry.lastCallTime DESC");
    Cursor localCursor = this.bSd.a("SELECT IPCallPopularCountry.countryCode,IPCallPopularCountry.callTimeCount,IPCallPopularCountry.lastCallTime FROM IPCallPopularCountry  " + ((StringBuilder)localObject).toString(), null, 2);
    if ((localCursor != null) && (localCursor.moveToFirst()))
    {
      new ArrayList();
      do
      {
        localObject = new i();
        ((i)localObject).d(localCursor);
        localArrayList.add(Integer.valueOf(((i)localObject).field_countryCode));
      }
      while (localCursor.moveToNext());
    }
    if (localCursor != null)
      localCursor.close();
    AppMethodBeat.o(21940);
    return localArrayList;
  }

  public final String getTableName()
  {
    return "IPCallPopularCountry";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.g.j
 * JD-Core Version:    0.6.2
 */