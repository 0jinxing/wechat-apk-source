package com.tencent.mm.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.widget.listview.PullDownListView;

final class MoreTabUI$3
  implements View.OnClickListener
{
  MoreTabUI$3(MoreTabUI paramMoreTabUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(29691);
    ab.i("MicroMsg.MoreTabUI", "onClick: mActionBarRoot");
    if (MoreTabUI.g(this.yoD))
    {
      t.makeText(this.yoD.getContext(), this.yoD.getResources().getString(2131303947), 0).show();
      AppMethodBeat.o(29691);
    }
    while (true)
    {
      return;
      if ((MoreTabUI.h(this.yoD) != null) && (MoreTabUI.h(this.yoD).isVisible))
        MoreTabUI.h(this.yoD).dLg();
      AppMethodBeat.o(29691);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MoreTabUI.3
 * JD-Core Version:    0.6.2
 */