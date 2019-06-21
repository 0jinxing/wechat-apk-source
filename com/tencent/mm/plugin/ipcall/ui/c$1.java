package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements View.OnClickListener
{
  c$1(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21995);
    if ((paramView.getTag() instanceof Integer))
    {
      int i = ((Integer)paramView.getTag()).intValue();
      com.tencent.mm.plugin.ipcall.a.g.c localc = this.nAB.xn(i);
      paramView = new Intent(c.a(this.nAB), IPCallUserProfileUI.class);
      paramView.putExtra("IPCallProfileUI_contactid", localc.field_contactId);
      paramView.putExtra("IPCallProfileUI_systemUsername", localc.field_systemAddressBookUsername);
      paramView.putExtra("IPCallProfileUI_wechatUsername", localc.field_wechatUsername);
      c.b(this.nAB).startActivity(paramView);
    }
    AppMethodBeat.o(21995);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.c.1
 * JD-Core Version:    0.6.2
 */