package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$3
  implements View.OnClickListener
{
  e$3(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22035);
    paramView = new Intent(this.nBc.nAV, IPCallDialUI.class);
    paramView.putExtra("IPCallTalkUI_dialScene", 1);
    this.nBc.nAV.startActivityForResult(paramView, 1001);
    AppMethodBeat.o(22035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.3
 * JD-Core Version:    0.6.2
 */