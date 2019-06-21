package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class AAQueryListUI$3
  implements AdapterView.OnItemClickListener
{
  AAQueryListUI$3(AAQueryListUI paramAAQueryListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(40730);
    int i;
    if (AAQueryListUI.f(this.gnt) != null)
    {
      if ((paramInt < 0) || (paramInt >= AAQueryListUI.f(this.gnt).getCount()))
      {
        ab.i("MicroMsg.AAQueryListUI", "click out of bound! %s", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(40730);
        return;
      }
      i = paramView.getTop();
      paramView = (k)AAQueryListUI.f(this.gnt).getItem(paramInt);
      if (paramView != null)
      {
        if (bo.isNullOrNil(paramView.vzX))
          break label158;
        paramAdapterView = new Intent();
        paramAdapterView.putExtra("rawUrl", paramView.vzX);
        d.b(this.gnt, "webview", ".ui.tools.WebViewUI", paramAdapterView);
      }
    }
    while (true)
    {
      h.pYm.e(13721, new Object[] { Integer.valueOf(5), Integer.valueOf(3) });
      AppMethodBeat.o(40730);
      break;
      label158: if (!bo.isNullOrNil(paramView.vzL))
      {
        paramAdapterView = null;
        if (paramView.vzW == 2)
          paramAdapterView = r.Yz();
        Intent localIntent = new Intent(this.gnt, PaylistAAUI.class);
        localIntent.putExtra("bill_no", paramView.vzL);
        localIntent.putExtra("launcher_user_name", paramAdapterView);
        localIntent.putExtra("enter_scene", 4);
        localIntent.putExtra("chatroom", paramView.vzM);
        localIntent.putExtra("item_position", paramInt);
        localIntent.putExtra("item_offset", i);
        this.gnt.startActivityForResult(localIntent, 1);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI.3
 * JD-Core Version:    0.6.2
 */