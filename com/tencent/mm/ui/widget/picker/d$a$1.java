package com.tencent.mm.ui.widget.picker;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.m;
import com.tencent.mm.ui.base.n.d;
import java.util.HashMap;

final class d$a$1
  implements View.OnClickListener
{
  d$a$1(d.a parama, int paramInt, m paramm)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(112842);
    if (this.zSE.zSA.rBm != null)
      this.zSE.zSA.rBm.onMMMenuItemSelected(this.zSE.zSA.rBn.getItem(this.sN), this.sN);
    if (this.zSD.xeS)
    {
      AppMethodBeat.o(112842);
      return;
    }
    if (((Boolean)d.a.a(this.zSE).get(Integer.valueOf(this.sN))).booleanValue())
      d.a.a(this.zSE).put(Integer.valueOf(this.sN), Boolean.FALSE);
    while (true)
    {
      this.zSE.zSB = d.a.a(this.zSE);
      this.zSE.notifyDataSetChanged();
      AppMethodBeat.o(112842);
      break;
      d.a.a(this.zSE).put(Integer.valueOf(this.sN), Boolean.TRUE);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.picker.d.a.1
 * JD-Core Version:    0.6.2
 */