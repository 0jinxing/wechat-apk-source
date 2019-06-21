package com.tencent.mm.plugin.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;

final class PluginFTS$8$1 extends a
{
  String mBP = "";

  PluginFTS$8$1(PluginFTS.8 param8)
  {
  }

  public final boolean execute()
  {
    AppMethodBeat.i(136589);
    this.mBP = aa.gw(ah.getContext());
    PluginFTS.access$200(this.mBQ.mBO).K(-3L, this.mBP.hashCode());
    AppMethodBeat.o(136589);
    return true;
  }

  public final String toString()
  {
    AppMethodBeat.i(136590);
    String str = "LanguageUpdate(\"" + this.mBP + "\")";
    AppMethodBeat.o(136590);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.PluginFTS.8.1
 * JD-Core Version:    0.6.2
 */