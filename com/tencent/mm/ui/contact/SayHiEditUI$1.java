package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.normsg.a.b;
import com.tencent.mm.pluginsdk.model.m;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.LinkedList;
import java.util.List;

final class SayHiEditUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SayHiEditUI$1(SayHiEditUI paramSayHiEditUI, String paramString1, int paramInt, String paramString2)
  {
  }

  public final boolean onMenuItemClick(final MenuItem paramMenuItem)
  {
    AppMethodBeat.i(33841);
    this.zoy.aqX();
    b.oTO.ae(2, 1, 5);
    Object localObject1 = new LinkedList();
    ((LinkedList)localObject1).add(this.fwC);
    Object localObject2 = new LinkedList();
    ((LinkedList)localObject2).add(Integer.valueOf(this.zow));
    paramMenuItem = new LinkedList();
    if (!ah.isNullOrNil(this.zox))
      paramMenuItem.add(this.zox);
    paramMenuItem = new m(2, (List)localObject1, (List)localObject2, paramMenuItem, SayHiEditUI.a(this.zoy), "", null, null, "");
    aw.Rg().a(paramMenuItem, 0);
    localObject1 = this.zoy;
    localObject2 = this.zoy.mController.ylL;
    this.zoy.getString(2131297061);
    SayHiEditUI.a((SayHiEditUI)localObject1, h.b((Context)localObject2, this.zoy.getString(2131302962), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(33840);
        aw.Rg().c(paramMenuItem);
        AppMethodBeat.o(33840);
      }
    }));
    AppMethodBeat.o(33841);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SayHiEditUI.1
 * JD-Core Version:    0.6.2
 */