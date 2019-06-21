package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.plugin.appbrand.widget.input.d.e;
import java.lang.ref.WeakReference;

final class i$1
  implements View.OnFocusChangeListener
{
  i$1(i parami)
  {
  }

  public final void onFocusChange(View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(123627);
    if (paramBoolean)
      o.b((u)this.jeg.jdT.get(), this.jeg);
    i.a(this.jeg, paramBoolean);
    if ((paramBoolean) && ((!this.jeg.jdS.jjl) || (n.ct(this.jeg.jdV))));
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (this.jeg.jdV != null) && (this.jeg.jdW != null))
      {
        this.jeg.jdV.requestFocus();
        this.jeg.jdW.show();
      }
      AppMethodBeat.o(123627);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.i.1
 * JD-Core Version:    0.6.2
 */