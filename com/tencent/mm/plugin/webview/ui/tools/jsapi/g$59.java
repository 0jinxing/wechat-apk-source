package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.picker.a.a;
import java.util.HashMap;
import java.util.Map;

final class g$59
  implements a.a
{
  g$59(g paramg, i parami)
  {
  }

  public final void b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(9119);
    ab.i("MicroMsg.MsgHandler", "date set: %d, %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (paramBoolean)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("selectTime", String.format("%d-%d-%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) }));
      g.a(this.uHd, this.uqf, "showDatePickerView:ok", localHashMap);
      AppMethodBeat.o(9119);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.MsgHandler", "cancel date set");
      g.a(this.uHd, this.uqf, "showDatePickerView:cancel", null);
      AppMethodBeat.o(9119);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.59
 * JD-Core Version:    0.6.2
 */