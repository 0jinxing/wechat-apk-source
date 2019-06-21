package com.tencent.mm.plugin.multitalk.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.multitalk.model.f;
import com.tencent.mm.plugin.multitalk.model.j;
import com.tencent.mm.plugin.multitalk.model.p;
import com.tencent.mm.plugin.multitalk.ui.widget.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

final class MultiTalkSelectContactUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MultiTalkSelectContactUI$1(MultiTalkSelectContactUI paramMultiTalkSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(54158);
    if (!at.isNetworkConnected(ah.getContext()))
      com.tencent.mm.bg.e.a(this.oHX, 2131304445, null);
    while (true)
    {
      this.oHX.aqX();
      AppMethodBeat.o(54158);
      return true;
      paramMenuItem = new LinkedList();
      paramMenuItem.addAll(MultiTalkSelectContactUI.a(this.oHX));
      paramMenuItem.add(r.Yz());
      paramMenuItem = bo.c(paramMenuItem, ",");
      if (MultiTalkSelectContactUI.b(this.oHX))
      {
        com.tencent.mm.plugin.multitalk.model.e.a(MultiTalkSelectContactUI.a(this.oHX).size(), MultiTalkSelectContactUI.c(this.oHX), 1, "", MultiTalkSelectContactUI.d(this.oHX).oIB);
        p.bSf().b(this.oHX, paramMenuItem, MultiTalkSelectContactUI.e(this.oHX));
      }
      else
      {
        com.tencent.mm.plugin.multitalk.model.e.a(MultiTalkSelectContactUI.a(this.oHX).size(), MultiTalkSelectContactUI.c(this.oHX), 2, j.bRU(), 0);
        this.oHX.setResult(-1, this.oHX.getIntent().putExtra("Select_Contact", paramMenuItem));
        this.oHX.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.ui.MultiTalkSelectContactUI.1
 * JD-Core Version:    0.6.2
 */