package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;

public final class j extends com.tencent.mm.sdk.e.j<i>
{
  public static final String[] fnj;
  private e bSd;

  static
  {
    AppMethodBeat.i(87841);
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(i.ccO, "CardQrCodeConfi") };
    AppMethodBeat.o(87841);
  }

  public j(e parame)
  {
    super(parame, i.ccO, "CardQrCodeConfi", null);
    this.bSd = parame;
  }

  public final i Gv(String paramString)
  {
    AppMethodBeat.i(87840);
    i locali = new i();
    locali.field_card_id = paramString;
    if (b(locali, new String[0]))
    {
      AppMethodBeat.o(87840);
      paramString = locali;
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(87840);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.j
 * JD-Core Version:    0.6.2
 */