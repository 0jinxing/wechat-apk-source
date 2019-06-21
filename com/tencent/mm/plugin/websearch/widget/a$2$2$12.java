package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.af;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2$2$12 extends af
{
  a$2$2$12(a.2.2 param2)
  {
  }

  public final void b(boolean paramBoolean1, String paramString, boolean paramBoolean2)
  {
    AppMethodBeat.i(91388);
    ab.v("FTSSearchWidgetMgr", "on widget call %s ", new Object[] { "onSearchWAWidgetOnTapCallback" });
    ab.i("FTSSearchWidgetMgr", "on widget call %s , hasHandler %s, eventId %s,res %s", new Object[] { "onSearchWAWidgetOnTapCallback", Boolean.valueOf(paramBoolean1), paramString, Boolean.valueOf(paramBoolean2) });
    r localr;
    if (paramString.equals(a.m(this.ucN.ucM.ucJ)))
    {
      a.b(this.ucN.ucM.ucJ, null);
      localr = a.c(this.ucN.ucM.ucJ);
      if (!paramBoolean1)
        break label134;
    }
    while (true)
    {
      localr.g(paramString, paramBoolean2, this.ucN.ucM.ucL);
      AppMethodBeat.o(91388);
      return;
      label134: paramBoolean2 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2.12
 * JD-Core Version:    0.6.2
 */