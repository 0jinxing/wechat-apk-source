package com.tencent.mm.plugin.sns.g;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.d;

public final class e
{
  public static void YB(String paramString)
  {
    AppMethodBeat.i(36804);
    ab.i("MicroMsg.SnsABTestStrategy", "dump id ".concat(String.valueOf(paramString)));
    paramString = com.tencent.mm.model.c.c.abi().ll(paramString);
    if (!paramString.isValid())
      ab.i("MicroMsg.SnsABTestStrategy", "abtest is invalid");
    if (paramString.dru() != null)
      ab.i("MicroMsg.SnsABTestStrategy", "dump feed abtest " + paramString.field_rawXML);
    AppMethodBeat.o(36804);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.g.e
 * JD-Core Version:    0.6.2
 */