package com.tencent.mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Intent;
import com.tencent.luggage.d.f;
import com.tencent.luggage.d.g;
import com.tencent.luggage.g.e;
import com.tencent.luggage.g.e.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.jsapi.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import java.util.LinkedList;
import java.util.Set;

public class p extends f
{
  private com.tencent.mm.plugin.webview.modeltools.a uju;

  public p(final Activity paramActivity)
  {
    super(paramActivity);
    AppMethodBeat.i(6225);
    this.bPi = com.tencent.mm.plugin.webview.luggage.d.a.class;
    this.bPl.B(be.biH());
    this.uju = new com.tencent.mm.plugin.webview.modeltools.a();
    e locale = this.bPq.xk();
    paramActivity = new e.b()
    {
      public final boolean b(int paramAnonymousInt1, int paramAnonymousInt2, Intent paramAnonymousIntent)
      {
        AppMethodBeat.i(6224);
        boolean bool = com.tencent.mm.plugin.webview.modeltools.a.d(paramActivity, paramAnonymousInt1, paramAnonymousInt2, paramAnonymousIntent);
        AppMethodBeat.o(6224);
        return bool;
      }
    };
    locale.bRE.add(paramActivity);
    AppMethodBeat.o(6225);
  }

  private void cXh()
  {
    AppMethodBeat.i(6227);
    SwipeBackLayout localSwipeBackLayout;
    if ((this.mContext instanceof MMActivity))
    {
      localSwipeBackLayout = ((MMActivity)this.mContext).getSwipeBackLayout();
      if (localSwipeBackLayout != null)
        if (this.bPq.xh().size() <= 1)
        {
          localSwipeBackLayout.setEnableGesture(true);
          AppMethodBeat.o(6227);
        }
    }
    while (true)
    {
      return;
      localSwipeBackLayout.setEnableGesture(false);
      AppMethodBeat.o(6227);
    }
  }

  public final void onResume()
  {
    AppMethodBeat.i(6226);
    super.onResume();
    cXh();
    AppMethodBeat.o(6226);
  }

  public final void xf()
  {
    AppMethodBeat.i(6228);
    ((d)xa()).cWD();
    cXh();
    AppMethodBeat.o(6228);
  }

  public final void xg()
  {
    AppMethodBeat.i(6229);
    cXh();
    AppMethodBeat.o(6229);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.p
 * JD-Core Version:    0.6.2
 */