package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.ipcall.a.g.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class IPCallMsgUI$4
  implements AdapterView.OnItemClickListener
{
  IPCallMsgUI$4(IPCallMsgUI paramIPCallMsgUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(22189);
    paramAdapterView = (g)IPCallMsgUI.b(this.nDt).getItem(paramInt);
    if (!bo.isNullOrNil(paramAdapterView.field_descUrl))
    {
      paramInt = paramAdapterView.field_msgType;
      h.pYm.e(13780, new Object[] { Integer.valueOf(paramInt) });
      paramView = new Intent();
      paramView.putExtra("rawUrl", paramAdapterView.field_descUrl);
      paramView.putExtra("showShare", false);
      d.b(this.nDt, "webview", ".ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(22189);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI.4
 * JD-Core Version:    0.6.2
 */