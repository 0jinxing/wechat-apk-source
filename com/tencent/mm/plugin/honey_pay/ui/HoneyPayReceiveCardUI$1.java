package com.tencent.mm.plugin.honey_pay.ui;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.e.g;

final class HoneyPayReceiveCardUI$1
  implements g
{
  HoneyPayReceiveCardUI$1(HoneyPayReceiveCardUI paramHoneyPayReceiveCardUI)
  {
  }

  public final Object a(m paramm)
  {
    return null;
  }

  public final Object b(m paramm)
  {
    AppMethodBeat.i(41935);
    if (paramm.type == 1)
    {
      paramm = paramm.data;
      if ((paramm != null) && ((paramm instanceof Bundle)) && (((Bundle)paramm).getBoolean("click_help", false)))
        h.pYm.e(15191, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
    }
    AppMethodBeat.o(41935);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI.1
 * JD-Core Version:    0.6.2
 */