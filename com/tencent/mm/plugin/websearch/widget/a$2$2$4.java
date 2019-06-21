package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.ae;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$2$2$4 extends ae
{
  a$2$2$4(a.2.2 param2)
  {
  }

  public final void aq(String paramString1, String paramString2)
  {
    AppMethodBeat.i(91382);
    ab.v("FTSSearchWidgetMgr", "on widget data push, widgetId[%s], respData[%s]", new Object[] { paramString1, paramString2 });
    paramString1 = a.c(this.ucN.ucM.ucJ, paramString1);
    if (!bo.isNullOrNil(paramString1))
    {
      a.c(this.ucN.ucM.ucJ).gS(paramString1, paramString2);
      AppMethodBeat.o(91382);
    }
    while (true)
    {
      return;
      ab.e("FTSSearchWidgetMgr", "onWidgetDataPush widget cache key not found!");
      AppMethodBeat.o(91382);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2.4
 * JD-Core Version:    0.6.2
 */