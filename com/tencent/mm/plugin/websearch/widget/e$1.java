package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.wx_extension.a.a;
import com.tencent.mm.ipcinvoker.wx_extension.a.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.c;
import java.util.Map;

final class e$1
  implements Runnable
{
  e$1(e parame)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(91444);
    Object localObject = a.b.eGM;
    c localc = a.ll("100458");
    if (localc == null)
    {
      ab.i("WidgetSafeModeProxyImpl", "ABTEST_LAYERID_SEARCH_WIDGET_SAFE_MODE_SWITCH item is null");
      AppMethodBeat.o(91444);
      return;
    }
    localObject = this.udq;
    if ((localc.isValid()) && ("1".equals(localc.dru().get("isOpen"))));
    for (boolean bool = true; ; bool = false)
    {
      e.a((e)localObject, bool);
      AppMethodBeat.o(91444);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.e.1
 * JD-Core Version:    0.6.2
 */