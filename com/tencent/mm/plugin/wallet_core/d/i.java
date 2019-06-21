package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.protocal.protobuf.bjg;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;

public final class i extends j<ag>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(47086);
    fnj = new String[] { j.a(ag.ccO, "WalletRegionGreyAreaList") };
    AppMethodBeat.o(47086);
  }

  public i(e parame)
  {
    super(parame, ag.ccO, "WalletRegionGreyAreaList", null);
    this.bSd = parame;
  }

  public final ag Ht(int paramInt)
  {
    AppMethodBeat.i(47085);
    Object localObject = "select * from WalletRegionGreyAreaList where wallet_region = ".concat(String.valueOf(paramInt));
    Cursor localCursor = this.bSd.a((String)localObject, null, 2);
    ab.i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem ".concat(String.valueOf(localObject)));
    if (localCursor == null)
    {
      localObject = new ag();
      AppMethodBeat.o(47085);
    }
    while (true)
    {
      return localObject;
      localObject = new ag();
      if (localCursor.moveToNext())
      {
        localObject = new ag();
        ((ag)localObject).d(localCursor);
      }
      ab.i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
      localCursor.close();
      AppMethodBeat.o(47085);
    }
  }

  public final void a(int paramInt, bjg parambjg)
  {
    AppMethodBeat.i(47084);
    ag localag = new ag();
    localag.field_wallet_region = paramInt;
    try
    {
      localag.field_wallet_grey_item_buf = parambjg.toByteArray();
      super.a(localag);
      AppMethodBeat.o(47084);
      return;
    }
    catch (Exception parambjg)
    {
      while (true)
        ab.e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + parambjg.getMessage());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.d.i
 * JD-Core Version:    0.6.2
 */