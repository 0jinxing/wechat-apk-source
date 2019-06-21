package com.tencent.mm.plugin.websearch.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.ah;
import com.tencent.mm.sdk.platformtools.ab;

final class a$2$2$14 extends ah
{
  a$2$2$14(a.2.2 param2)
  {
  }

  public final void pz(String paramString)
  {
    AppMethodBeat.i(91390);
    ab.v("FTSSearchWidgetMgr", "on widget call %s ", new Object[] { "onOpenApp" });
    a.a(this.ucN.ucM.ucJ, paramString, this.ucN.ucM.ucL);
    AppMethodBeat.o(91390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.a.2.2.14
 * JD-Core Version:    0.6.2
 */