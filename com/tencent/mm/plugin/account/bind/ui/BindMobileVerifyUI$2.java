package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.hy;
import com.tencent.mm.g.a.hy.b;
import com.tencent.mm.g.a.hz;
import com.tencent.mm.g.a.hz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.ui.base.h;

final class BindMobileVerifyUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BindMobileVerifyUI$2(BindMobileVerifyUI paramBindMobileVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13530);
    paramMenuItem = BindMobileVerifyUI.a(this.gst).getText().toString().trim();
    if (paramMenuItem.equals(""))
    {
      h.g(this.gst, 2131297590, 2131297061);
      AppMethodBeat.o(13530);
    }
    while (true)
    {
      return true;
      this.gst.aqX();
      Object localObject1 = new hy();
      ((hy)localObject1).cCS.context = this.gst;
      a.xxA.m((b)localObject1);
      localObject1 = ((hy)localObject1).cCT.cCU;
      Object localObject2 = new hz();
      a.xxA.m((b)localObject2);
      localObject2 = ((hz)localObject2).cCV.cCW;
      localObject2 = new x(BindMobileVerifyUI.b(this.gst), 2, paramMenuItem, "", (String)localObject1, (String)localObject2);
      g.Rg().a((m)localObject2, 0);
      localObject1 = this.gst;
      paramMenuItem = this.gst;
      this.gst.getString(2131297061);
      BindMobileVerifyUI.a((BindMobileVerifyUI)localObject1, h.b(paramMenuItem, this.gst.getString(2131297578), true, new BindMobileVerifyUI.2.1(this, (x)localObject2)));
      AppMethodBeat.o(13530);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.2
 * JD-Core Version:    0.6.2
 */