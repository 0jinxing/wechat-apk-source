package com.tencent.mm.plugin.account.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum MobileVerifyUI$a
{
  static
  {
    AppMethodBeat.i(125281);
    gFt = new a("GoBack", 0);
    gFu = new a("GoNext", 1);
    gFv = new a("DoSend", 2);
    gFw = new a("DoProcessSMS", 3);
    gFx = new a[] { gFt, gFu, gFv, gFw };
    AppMethodBeat.o(125281);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileVerifyUI.a
 * JD-Core Version:    0.6.2
 */