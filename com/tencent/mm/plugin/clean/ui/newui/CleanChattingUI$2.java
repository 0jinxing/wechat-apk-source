package com.tencent.mm.plugin.clean.ui.newui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanChattingUI$2
  implements AdapterView.OnItemClickListener
{
  CleanChattingUI$2(CleanChattingUI paramCleanChattingUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(18875);
    paramAdapterView = new Intent(this.kyP, CleanChattingDetailUI.class);
    paramAdapterView.putExtra("key_position", paramInt);
    this.kyP.startActivityForResult(paramAdapterView, 0);
    AppMethodBeat.o(18875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanChattingUI.2
 * JD-Core Version:    0.6.2
 */