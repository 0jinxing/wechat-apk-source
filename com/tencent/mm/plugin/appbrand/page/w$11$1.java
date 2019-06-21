package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b.a;
import com.tencent.mm.svg.a.a;

final class w$11$1
  implements b.a
{
  w$11$1(w.11 param11)
  {
  }

  public final void a(ImageView paramImageView, View paramView)
  {
    AppMethodBeat.i(132394);
    if (paramImageView != null)
    {
      paramImageView.clearColorFilter();
      paramImageView.setImageDrawable(a.f(this.itG.itx.mContext.getResources(), 2131230905));
    }
    if (paramView != null)
      paramView.setBackground(null);
    AppMethodBeat.o(132394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.w.11.1
 * JD-Core Version:    0.6.2
 */