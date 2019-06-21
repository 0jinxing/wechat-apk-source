package com.tencent.mm.chatroom.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.b.c;

final class ModRemarkRoomNameUI$3
  implements MenuItem.OnMenuItemClickListener
{
  ModRemarkRoomNameUI$3(ModRemarkRoomNameUI paramModRemarkRoomNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(104119);
    this.ejJ.aqX();
    paramMenuItem = b.Ne();
    if ((!bo.isNullOrNil(paramMenuItem)) && ("".matches(".*[" + paramMenuItem + "].*")))
    {
      h.b(this.ejJ.mController.ylL, this.ejJ.getString(2131300632, new Object[] { paramMenuItem }), this.ejJ.getString(2131297061), true);
      AppMethodBeat.o(104119);
    }
    while (true)
    {
      return bool;
      c.d(ModRemarkRoomNameUI.a(this.ejJ)).hz(1, 32).a(this.ejJ);
      AppMethodBeat.o(104119);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.ModRemarkRoomNameUI.3
 * JD-Core Version:    0.6.2
 */