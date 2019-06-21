package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.scanner.a.a.a;
import com.tencent.mm.plugin.scanner.a.i;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

final class h$b$1
  implements View.OnClickListener
{
  h$b$1(h.b paramb, String paramString, a.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81061);
    paramView = new i(this.kUJ, this.qcO.pZo, this.qcO.type, this.kUJ, this.qcP.getCount(), this.qcO.showType);
    g.Rg().a(paramView, 0);
    if (!bo.isNullOrNil(this.kUJ))
    {
      paramView = new Intent();
      paramView.putExtra("key_Product_ID", this.kUJ);
      d.b(this.qcP.qcN.mContext, "scanner", ".ui.ProductUI", paramView);
    }
    AppMethodBeat.o(81061);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.h.b.1
 * JD-Core Version:    0.6.2
 */