package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.p;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class a$2
  implements View.OnLongClickListener
{
  a$2(a parama)
  {
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(88090);
    if (paramView.getId() == 2131821958)
    {
      p.wG(this.kgl.kaS.aZW().code);
      h.bQ(this.kgl.jiE, this.kgl.jiE.getString(2131296876));
    }
    AppMethodBeat.o(88090);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.a.2
 * JD-Core Version:    0.6.2
 */