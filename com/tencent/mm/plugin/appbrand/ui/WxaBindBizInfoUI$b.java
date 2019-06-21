package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class WxaBindBizInfoUI$b extends RecyclerView.v
{
  TextView gne;
  View goc;
  ImageView iyo;

  public WxaBindBizInfoUI$b(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(133200);
    this.iyo = ((ImageView)paramView.findViewById(2131820915));
    this.gne = ((TextView)paramView.findViewById(2131820649));
    this.goc = paramView.findViewById(2131821128);
    AppMethodBeat.o(133200);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.WxaBindBizInfoUI.b
 * JD-Core Version:    0.6.2
 */