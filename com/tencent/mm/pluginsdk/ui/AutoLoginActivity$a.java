package com.tencent.mm.pluginsdk.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum AutoLoginActivity$a
{
  static
  {
    AppMethodBeat.i(73688);
    vgJ = new a("LOGIN_OK", 0);
    vgK = new a("LOGIN_FAIL", 1);
    vgL = new a("LOGIN_CANCEL", 2);
    vgM = new a[] { vgJ, vgK, vgL };
    AppMethodBeat.o(73688);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a
 * JD-Core Version:    0.6.2
 */