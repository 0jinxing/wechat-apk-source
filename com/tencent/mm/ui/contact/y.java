package com.tencent.mm.ui.contact;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class y
{
  public static void Pp(int paramInt)
  {
    AppMethodBeat.i(105264);
    ab.i("MicroMsg.SelectContactReportLogic", "reportCreateChatroomClick %d %d", new Object[] { Integer.valueOf(13941), Integer.valueOf(paramInt) });
    h.pYm.e(13941, new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(105264);
  }

  public static final void q(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(105263);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(105263);
    while (true)
    {
      return;
      paramString = String.format("%s,%d,%d,%d,%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(0) });
      ab.v("MicroMsg.SelectContactReportLogic", "reportClick: %s", new Object[] { paramString });
      h.pYm.X(13234, paramString);
      AppMethodBeat.o(105263);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.y
 * JD-Core Version:    0.6.2
 */