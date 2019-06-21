package com.tencent.mm.ui.chatting.viewitems;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.ui.widget.MMNeat7extView.b;
import java.util.HashMap;
import java.util.Map;

final class al$c
  implements MMNeat7extView.b
{
  public final void a(Exception paramException, String paramString1, String paramString2)
  {
    AppMethodBeat.i(33318);
    if (!d.vxp)
    {
      HashMap localHashMap = new HashMap(2);
      localHashMap.put("Content", paramString1);
      localHashMap.put("Exception", paramException.toString());
      localHashMap.put("Stack", paramException.getStackTrace());
      h.pYm.g("NeatTextView", paramString2, localHashMap);
    }
    AppMethodBeat.o(33318);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.c
 * JD-Core Version:    0.6.2
 */