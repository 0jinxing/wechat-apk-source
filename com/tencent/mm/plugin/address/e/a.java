package com.tencent.mm.plugin.address.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.d.b;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static Intent b(b paramb)
  {
    AppMethodBeat.i(17010);
    if (paramb == null)
    {
      ab.e("MicroMsg.AddrUtil", "addressObj == null");
      paramb = null;
      AppMethodBeat.o(17010);
    }
    while (true)
    {
      return paramb;
      Intent localIntent = new Intent();
      localIntent.putExtra("nationalCode", paramb.gJh);
      localIntent.putExtra("userName", paramb.gJf);
      localIntent.putExtra("telNumber", paramb.gJg);
      localIntent.putExtra("addressPostalCode", paramb.gJd);
      localIntent.putExtra("proviceFirstStageName", paramb.gJa);
      localIntent.putExtra("addressCitySecondStageName", paramb.gJb);
      localIntent.putExtra("addressCountiesThirdStageName", paramb.gJc);
      localIntent.putExtra("addressDetailInfo", paramb.gJe);
      AppMethodBeat.o(17010);
      paramb = localIntent;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.e.a
 * JD-Core Version:    0.6.2
 */