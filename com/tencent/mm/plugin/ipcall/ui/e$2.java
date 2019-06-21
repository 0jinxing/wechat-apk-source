package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e$2
  implements View.OnClickListener
{
  e$2(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22034);
    paramView = new Intent();
    paramView.setClass(this.nBc.nAV, IPCallContactUI.class);
    this.nBc.nAV.startActivity(paramView);
    AppMethodBeat.o(22034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.e.2
 * JD-Core Version:    0.6.2
 */