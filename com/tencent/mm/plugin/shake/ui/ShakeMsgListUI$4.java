package com.tencent.mm.plugin.shake.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.b.f;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ShakeMsgListUI$4
  implements AdapterView.OnItemClickListener
{
  ShakeMsgListUI$4(ShakeMsgListUI paramShakeMsgListUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24755);
    paramView = (f)ShakeMsgListUI.b(this.quR).getItem(paramInt);
    if (!bo.isNullOrNil(paramView.field_tag))
    {
      h.pYm.X(11316, ShakeMsgListUI.g(this.quR) + "," + paramView.field_tag);
      paramAdapterView = new Intent();
      paramAdapterView.putExtra("rawUrl", paramView.field_tag);
      com.tencent.mm.bp.d.b(this.quR.mController.ylL, "webview", ".ui.tools.WebViewUI", paramAdapterView);
    }
    AppMethodBeat.o(24755);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeMsgListUI.4
 * JD-Core Version:    0.6.2
 */