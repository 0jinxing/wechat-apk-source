package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.i;
import java.util.HashMap;

final class h$1
  implements View.OnClickListener
{
  h$1(h paramh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22238);
    int i;
    if ((paramView.getTag() instanceof Integer))
    {
      i = ((Integer)paramView.getTag()).intValue();
      if (!com.tencent.mm.plugin.ipcall.b.c.eo(h.a(this.nEb)))
        AppMethodBeat.o(22238);
    }
    while (true)
    {
      return;
      k localk = this.nEb.xt(i);
      View localView = null;
      if (localk.field_addressId > 0L)
        if (!h.b(this.nEb).containsKey(Long.valueOf(localk.field_addressId)))
          break label289;
      label289: for (paramView = (com.tencent.mm.plugin.ipcall.a.g.c)h.b(this.nEb).get(Long.valueOf(localk.field_addressId)); ; paramView = i.bHw().iU(localk.field_addressId))
      {
        localView = paramView;
        if (paramView != null)
        {
          h.b(this.nEb).put(Long.valueOf(localk.field_addressId), paramView);
          localView = paramView;
        }
        if (localView == null)
          break label303;
        paramView = new Intent(h.c(this.nEb), IPCallTalkUI.class);
        paramView.putExtra("IPCallTalkUI_phoneNumber", localk.field_phonenumber);
        paramView.putExtra("IPCallTalkUI_contactId", localView.field_contactId);
        paramView.putExtra("IPCallTalkUI_nickname", localView.field_systemAddressBookUsername);
        paramView.putExtra("IPCallTalkUI_toWechatUsername", localView.field_wechatUsername);
        paramView.putExtra("IPCallTalkUI_dialScene", 3);
        com.tencent.mm.plugin.report.service.h.pYm.e(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
        ((FragmentActivity)h.d(this.nEb)).startActivityForResult(paramView, 1001);
        AppMethodBeat.o(22238);
        break;
      }
      label303: paramView = new Intent(h.e(this.nEb), IPCallTalkUI.class);
      paramView.putExtra("IPCallTalkUI_phoneNumber", localk.field_phonenumber);
      paramView.putExtra("IPCallTalkUI_dialScene", 3);
      com.tencent.mm.plugin.report.service.h.pYm.e(12059, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3) });
      ((FragmentActivity)h.f(this.nEb)).startActivityForResult(paramView, 1001);
      AppMethodBeat.o(22238);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.h.1
 * JD-Core Version:    0.6.2
 */