package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.ai;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2$2$3 extends ai
{
  a$2$2$3(a.2.2 param2)
  {
  }

  public final void pA(String paramString)
  {
    AppMethodBeat.i(91381);
    ab.v("FTSSearchWidgetMgr", "on widget reload data, widgetId[%s]", new Object[] { paramString });
    paramString = a.c(this.ucN.ucM.ucJ, paramString);
    if (!bo.isNullOrNil(paramString))
    {
      a.c(this.ucN.ucM.ucJ).adG(paramString);
      AppMethodBeat.o(91381);
    }
    while (true)
    {
      return;
      ab.e("FTSSearchWidgetMgr", "onWidgetReloadData widget cache key not found!");
      AppMethodBeat.o(91381);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2.3
 * JD-Core Version:    0.6.2
 */