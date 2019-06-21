package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class SnsMsgUI$14
  implements MMSlideDelView.f
{
  SnsMsgUI$14(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(39080);
    if (paramObject == null)
    {
      ab.e("MicroMsg.SnsMsgUI", "onItemDel object null");
      AppMethodBeat.o(39080);
    }
    while (true)
    {
      return;
      try
      {
        int i = bo.ank(paramObject.toString());
        SnsMsgUI.a(this.rub, i);
        AppMethodBeat.o(39080);
      }
      catch (Exception paramObject)
      {
        ab.e("MicroMsg.SnsMsgUI", "onItemDel object not int");
        ab.printErrStackTrace("MicroMsg.SnsMsgUI", paramObject, "", new Object[0]);
        AppMethodBeat.o(39080);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.14
 * JD-Core Version:    0.6.2
 */