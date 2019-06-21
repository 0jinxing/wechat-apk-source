package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.SwipeBackLayout;

public final class q
  implements g
{
  private final MMWebView fow;
  private final MMActivity jiE;

  public q(MMActivity paramMMActivity, MMWebView paramMMWebView)
  {
    this.jiE = paramMMActivity;
    this.fow = paramMMWebView;
  }

  public final void a(g.a parama)
  {
    AppMethodBeat.i(8285);
    if (this.jiE.getSwipeBackLayout() == null)
      AppMethodBeat.o(8285);
    while (true)
    {
      return;
      this.jiE.getSwipeBackLayout().setSwipeBackListener(new q.1(this, parama));
      AppMethodBeat.o(8285);
    }
  }

  public final void a(g.b paramb)
  {
    AppMethodBeat.i(8287);
    b.a(this.jiE, new q.2(this, paramb));
    AppMethodBeat.o(8287);
  }

  public final ViewGroup bSl()
  {
    AppMethodBeat.i(8282);
    ViewGroup localViewGroup = (ViewGroup)this.jiE.getWindow().getDecorView();
    AppMethodBeat.o(8282);
    return localViewGroup;
  }

  public final boolean cXe()
  {
    AppMethodBeat.i(8284);
    boolean bool;
    if (this.jiE.getSwipeBackLayout() != null)
    {
      bool = true;
      AppMethodBeat.o(8284);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8284);
    }
  }

  public final Activity getActivity()
  {
    return this.jiE;
  }

  public final View getContentView()
  {
    AppMethodBeat.i(8283);
    View localView;
    if (this.jiE.getSwipeBackLayout() == null)
    {
      localView = null;
      AppMethodBeat.o(8283);
    }
    while (true)
    {
      return localView;
      localView = this.jiE.getSwipeBackLayout().getTargetContentView();
      AppMethodBeat.o(8283);
    }
  }

  public final Intent getIntent()
  {
    AppMethodBeat.i(8280);
    Intent localIntent = this.jiE.getIntent();
    AppMethodBeat.o(8280);
    return localIntent;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(8281);
    String str = this.fow.getUrl();
    AppMethodBeat.o(8281);
    return str;
  }

  public final void mu(boolean paramBoolean)
  {
    AppMethodBeat.i(8286);
    if (paramBoolean)
    {
      this.jiE.getIntent().putExtra("MMActivity.OverrideExitAnimation", 2131034221);
      this.jiE.getIntent().putExtra("MMActivity.OverrideEnterAnimation", 2131034130);
    }
    while (true)
    {
      this.jiE.finish();
      AppMethodBeat.o(8286);
      return;
      this.jiE.getIntent().putExtra("MMActivity.OverrideExitAnimation", 0);
      this.jiE.getIntent().putExtra("MMActivity.OverrideEnterAnimation", 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.q
 * JD-Core Version:    0.6.2
 */