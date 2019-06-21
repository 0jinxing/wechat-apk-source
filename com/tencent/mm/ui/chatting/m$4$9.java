package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.base.h;
import java.util.Iterator;
import java.util.List;

final class m$4$9
  implements DialogInterface.OnClickListener
{
  m$4$9(m.4 param4, MenuItem paramMenuItem)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(30602);
    paramDialogInterface = this.yIW.yII;
    if ((paramDialogInterface == null) || (paramDialogInterface.isEmpty()))
    {
      ab.w("MicroMsg.ChattingEditModeLogic", "check contain only invalid send to brand service error, select item empty");
      break label81;
      label34: paramInt = 1;
      label36: if (paramInt == 0)
        break label184;
      ab.w("MicroMsg.ChattingEditModeSendToBrand", "only contain invalid msg, exit long click mode");
      if (this.yIW.yIV != null)
        this.yIW.yIV.dDL();
      AppMethodBeat.o(30602);
    }
    while (true)
    {
      return;
      Iterator localIterator = paramDialogInterface.iterator();
      label81: if (!localIterator.hasNext())
        break label34;
      paramDialogInterface = (bi)localIterator.next();
      if (j.aA(paramDialogInterface))
        break label34;
      if ((paramDialogInterface.drD()) || (j.av(paramDialogInterface)) || (paramDialogInterface.dtw()) || (j.ax(paramDialogInterface)) || (j.ay(paramDialogInterface)) || (paramDialogInterface.getType() == -1879048186) || (j.aF(paramDialogInterface)) || (j.az(paramDialogInterface)) || (j.aE(paramDialogInterface)) || (j.aI(paramDialogInterface)))
        break;
      paramInt = 0;
      break label36;
      label184: paramDialogInterface = this.yIW.val$context;
      this.yIW.val$context.getString(2131297061);
      m.a(h.b(paramDialogInterface, this.yIW.val$context.getString(2131302958), false, null));
      com.tencent.mm.ui.chatting.c.j.yOM.e(new m.b(this.yIW.yIT, this.yIW.val$context, this.yIX.getTitle(), -1L, m.dCc()));
      if (this.yIW.yIV != null)
        this.yIW.yIV.dDL();
      AppMethodBeat.o(30602);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.m.4.9
 * JD-Core Version:    0.6.2
 */