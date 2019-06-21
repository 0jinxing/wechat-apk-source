package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.c;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.i;

final class e$4
  implements AdapterView.OnItemClickListener
{
  e$4(e parame)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22036);
    if (this.nBc.nAT.wK(paramInt))
      AppMethodBeat.o(22036);
    while (true)
    {
      return;
      if (!(paramAdapterView instanceof ListView))
        break label168;
      paramView = this.nBc.nAT.xt(paramInt - ((ListView)paramAdapterView).getHeaderViewsCount());
      if (paramView != null)
        break;
      AppMethodBeat.o(22036);
    }
    paramAdapterView = null;
    if (paramView.field_addressId > 0L)
      paramAdapterView = i.bHw().iU(paramView.field_addressId);
    Intent localIntent = new Intent(this.nBc.nAV, IPCallUserProfileUI.class);
    if (paramAdapterView != null)
    {
      localIntent.putExtra("IPCallProfileUI_contactid", paramAdapterView.field_contactId);
      localIntent.putExtra("IPCallProfileUI_systemUsername", paramAdapterView.field_systemAddressBookUsername);
      localIntent.putExtra("IPCallProfileUI_wechatUsername", paramAdapterView.field_wechatUsername);
    }
    while (true)
    {
      localIntent.putExtra("IPCallProfileUI_isNeedShowRecord", true);
      this.nBc.nAV.startActivity(localIntent);
      label168: AppMethodBeat.o(22036);
      break;
      localIntent.putExtra("IPCallProfileUI_phonenumber", paramView.field_phonenumber);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.4
 * JD-Core Version:    0.6.2
 */