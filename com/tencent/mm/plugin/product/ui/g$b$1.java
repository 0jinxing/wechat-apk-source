package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g$b$1
  implements View.OnClickListener
{
  g$b$1(g.b paramb, g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44069);
    ab.i("MicroMsg.MallProductImageAdapter", "henryyr user: clicked the ImageView");
    if (this.piV.piT.piS != null)
      this.piV.piT.piS.caa();
    AppMethodBeat.o(44069);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.g.b.1
 * JD-Core Version:    0.6.2
 */