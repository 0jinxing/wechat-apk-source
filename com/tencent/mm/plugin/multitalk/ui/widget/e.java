package com.tencent.mm.plugin.multitalk.ui.widget;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum e
{
  static
  {
    AppMethodBeat.i(54199);
    oIC = new e("Init", 0);
    oID = new e("Inviting", 1);
    oIE = new e("Creating", 2);
    oIF = new e("Starting", 3);
    oIG = new e("Talking", 4);
    oIH = new e[] { oIC, oID, oIE, oIF, oIG };
    AppMethodBeat.o(54199);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.widget.e
 * JD-Core Version:    0.6.2
 */