package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$Process;", "", "processName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getProcessName$plugin_brandservice_release", "()Ljava/lang/String;", "setProcessName$plugin_brandservice_release", "(Ljava/lang/String;)V", "MM", "Tool", "ToolMP", "UNKNOW", "plugin-brandservice_release"})
public enum PreloadLogic$i
{
  String processName;

  static
  {
    AppMethodBeat.i(14877);
    i locali1 = new i("MM", 0, "com.tencent.mm");
    jTf = locali1;
    i locali2 = new i("Tool", 1, "com.tencent.mm:tools");
    jTg = locali2;
    i locali3 = new i("ToolMP", 2, "com.tencent.mm:toolsmp");
    jTh = locali3;
    i locali4 = new i("UNKNOW", 3, "com.tencent.mm:tools");
    jTi = locali4;
    jTj = new i[] { locali1, locali2, locali3, locali4 };
    AppMethodBeat.o(14877);
  }

  private PreloadLogic$i(String paramString)
  {
    AppMethodBeat.i(14878);
    this.processName = paramString;
    AppMethodBeat.o(14878);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.i
 * JD-Core Version:    0.6.2
 */