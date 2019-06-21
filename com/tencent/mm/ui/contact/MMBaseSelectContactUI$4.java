package com.tencent.mm.ui.contact;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.o;
import com.tencent.mm.ui.base.t;

final class MMBaseSelectContactUI$4
  implements AbsListView.OnScrollListener
{
  MMBaseSelectContactUI$4(MMBaseSelectContactUI paramMMBaseSelectContactUI)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(105218);
    if ((!this.znk.aow()) && (MMBaseSelectContactUI.d(this.znk) != null))
    {
      paramAbsListView = MMBaseSelectContactUI.e(this.znk).getChildAt(MMBaseSelectContactUI.e(this.znk).getFirstVisiblePosition());
      if ((paramAbsListView != null) && (paramAbsListView.getTop() == 0))
        MMBaseSelectContactUI.f(this.znk).setVisibility(8);
    }
    else
    {
      if (paramInt1 >= 2)
        break label94;
      AppMethodBeat.o(105218);
    }
    while (true)
    {
      return;
      MMBaseSelectContactUI.f(this.znk).setVisibility(0);
      break;
      label94: g.RQ();
      if (!bo.e((Boolean)g.RP().Ry().get(12296, null)))
      {
        g.RQ();
        g.RP().Ry().set(12296, Boolean.TRUE);
        if (MMBaseSelectContactUI.g(this.znk) != null)
          MMBaseSelectContactUI.g(this.znk).dismiss();
        MMBaseSelectContactUI.a(this.znk, t.a(this.znk, this.znk.getString(2131301307), 4000L));
      }
      AppMethodBeat.o(105218);
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(105217);
    if (paramInt != 0)
    {
      this.znk.aqX();
      this.znk.dIc();
    }
    AppMethodBeat.o(105217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.MMBaseSelectContactUI.4
 * JD-Core Version:    0.6.2
 */