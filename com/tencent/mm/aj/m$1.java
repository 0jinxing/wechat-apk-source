package com.tencent.mm.aj;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class m$1
  implements Runnable
{
  m$1(String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(11420);
    m.a locala = z.afb();
    String str1 = this.fwG;
    String str2 = this.fwH;
    if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
    {
      ab.e("MicroMsg.BrandLogic", "pushing for brand " + str1 + ", url " + str2);
      AppMethodBeat.o(11420);
    }
    while (true)
    {
      return;
      if (bo.fp(bo.h((Integer)locala.fwJ.get(str1))) < 300L)
      {
        ab.i("MicroMsg.BrandLogic", "downloading interval less than 5 mins for ".concat(String.valueOf(str1)));
        AppMethodBeat.o(11420);
      }
      else
      {
        locala.fwJ.put(str1, Integer.valueOf((int)bo.anT()));
        if ((locala.fwL == null) || (locala.fwL.dpg()))
          locala.fwL = new az(1, "brand-logic");
        str2 = m.aB(str1, str2);
        locala.fwL.e(new m.b(str1, str2));
        AppMethodBeat.o(11420);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.m.1
 * JD-Core Version:    0.6.2
 */