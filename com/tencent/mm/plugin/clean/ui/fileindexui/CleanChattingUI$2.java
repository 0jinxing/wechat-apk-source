package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class CleanChattingUI$2
  implements AdapterView.OnItemClickListener
{
  CleanChattingUI$2(CleanChattingUI paramCleanChattingUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18779);
    paramView = CleanChattingUI.a(this.kxM).tu(paramInt);
    if (paramView != null)
    {
      paramAdapterView = new Intent(this.kxM, CleanChattingDetailUI.class);
      paramAdapterView.putExtra("key_username", paramView.username);
      paramAdapterView.putExtra("key_pos", paramInt);
      this.kxM.startActivityForResult(paramAdapterView, 0);
      h.pYm.a(714L, 21L, 1L, false);
    }
    AppMethodBeat.o(18779);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI.2
 * JD-Core Version:    0.6.2
 */