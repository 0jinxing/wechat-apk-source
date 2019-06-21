package com.tencent.mm.plugin.account.bind.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum GoogleFriendUI$a
{
  static
  {
    AppMethodBeat.i(13657);
    gts = new a("SUCCESS", 0);
    gtt = new a("NO_CONTACT", 1);
    gtu = new a("ACCESS_DEDY", 2);
    gtv = new a("OTHER", 3);
    gtw = new a[] { gts, gtt, gtu, gtv };
    AppMethodBeat.o(13657);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.a
 * JD-Core Version:    0.6.2
 */