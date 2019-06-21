package com.tencent.mm.plugin.appbrand.weishi;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.actionbar.b.a;
import com.tencent.mm.svg.a.a;

final class b$1
  implements b.a
{
  b$1(b paramb)
  {
  }

  public final void a(ImageView paramImageView, View paramView)
  {
    AppMethodBeat.i(133623);
    if (paramImageView != null)
    {
      paramImageView.clearColorFilter();
      paramImageView.setImageDrawable(a.f(this.iTR.getContext().getResources(), 2131230905));
    }
    if (paramView != null)
      paramView.setBackground(null);
    AppMethodBeat.o(133623);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.b.1
 * JD-Core Version:    0.6.2
 */