package com.tencent.mm.plugin.shake.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.plugin.shake.d.a.c;
import com.tencent.mm.plugin.shake.d.a.n;
import com.tencent.mm.plugin.shake.d.a.o;
import com.tencent.mm.sdk.e.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ShakeTvHistoryListUI$2$1
  implements DialogInterface.OnClickListener
{
  ShakeTvHistoryListUI$2$1(ShakeTvHistoryListUI.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24893);
    paramDialogInterface = h.pYm;
    Object localObject1 = m.cjU();
    Object localObject2 = new ArrayList();
    localObject1 = ((o)localObject1).cky();
    if (localObject1 != null)
    {
      while (((Cursor)localObject1).moveToNext())
      {
        n localn = new n();
        localn.d((Cursor)localObject1);
        ((List)localObject2).add(localn);
      }
      ((Cursor)localObject1).close();
    }
    localObject1 = new StringBuilder();
    localObject2 = ((List)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      ((StringBuilder)localObject1).append(((n)((Iterator)localObject2).next()).field_username);
      ((StringBuilder)localObject1).append("|");
    }
    paramDialogInterface.e(12662, new Object[] { Integer.valueOf(2), ((StringBuilder)localObject1).toString() });
    m.cjU().bSd.delete("shaketvhistory", null, null);
    paramDialogInterface = new c(2, null);
    aw.Rg().a(paramDialogInterface, 0);
    ShakeTvHistoryListUI.a(this.qwy.qwx).KC();
    this.qwy.qwx.enableOptionMenu(false);
    AppMethodBeat.o(24893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeTvHistoryListUI.2.1
 * JD-Core Version:    0.6.2
 */