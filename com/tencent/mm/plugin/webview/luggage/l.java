package com.tencent.mm.plugin.webview.luggage;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.tencent.luggage.d.e;
import com.tencent.luggage.d.h;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.bag.g.a;
import com.tencent.mm.plugin.webview.ui.tools.bag.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.b;
import java.util.LinkedList;

public final class l
  implements com.tencent.mm.plugin.webview.ui.tools.bag.g
{
  private Intent intent;
  private d uiI;

  public l(d paramd)
  {
    AppMethodBeat.i(6206);
    this.intent = new Intent();
    this.uiI = paramd;
    this.intent.putExtras(this.uiI.bPP);
    AppMethodBeat.o(6206);
  }

  private boolean cXf()
  {
    boolean bool = true;
    AppMethodBeat.i(6214);
    ab.i("MicroMsg.LuggageWebBagAdapter", "useActivityEnv: " + this.uiI.bPe.xh().size());
    if (this.uiI.bPe.xh().size() <= 1)
      AppMethodBeat.o(6214);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(6214);
    }
  }

  public final void a(g.a parama)
  {
    AppMethodBeat.i(6211);
    if (parama == null)
      AppMethodBeat.o(6211);
    while (true)
    {
      return;
      if ((this.uiI.WL == null) || (!(this.uiI.WL instanceof me.imid.swipebacklayout.lib.SwipeBackLayout)))
      {
        AppMethodBeat.o(6211);
      }
      else
      {
        if (!cXf())
          ((me.imid.swipebacklayout.lib.SwipeBackLayout)this.uiI.WL).a(new l.1(this, parama));
        if ((cXf()) && (((MMActivity)getActivity()).getSwipeBackLayout() != null))
          ((MMActivity)getActivity()).getSwipeBackLayout().setSwipeBackListener(new l.2(this, parama));
        AppMethodBeat.o(6211);
      }
    }
  }

  public final void a(g.b paramb)
  {
    AppMethodBeat.i(6213);
    if (cXf())
    {
      b.a(getActivity(), new l.3(this, paramb));
      AppMethodBeat.o(6213);
    }
    while (true)
    {
      return;
      paramb.iH(true);
      AppMethodBeat.o(6213);
    }
  }

  public final ViewGroup bSl()
  {
    AppMethodBeat.i(6209);
    ViewGroup localViewGroup;
    if (cXf())
    {
      localViewGroup = (ViewGroup)getActivity().getWindow().getDecorView();
      AppMethodBeat.o(6209);
    }
    while (true)
    {
      return localViewGroup;
      localViewGroup = (ViewGroup)this.uiI.WL.getParent();
      AppMethodBeat.o(6209);
    }
  }

  public final boolean cXe()
  {
    if (this.uiI.WL != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Activity getActivity()
  {
    return (Activity)this.uiI.mContext;
  }

  public final View getContentView()
  {
    AppMethodBeat.i(6210);
    View localView;
    if (cXf())
      if (((MMActivity)getActivity()).getSwipeBackLayout() != null)
      {
        localView = ((MMActivity)getActivity()).getSwipeBackLayout().getTargetContentView();
        AppMethodBeat.o(6210);
      }
    while (true)
    {
      return localView;
      localView = null;
      AppMethodBeat.o(6210);
      continue;
      localView = ((me.imid.swipebacklayout.lib.SwipeBackLayout)this.uiI.WL).getTargetView();
      AppMethodBeat.o(6210);
    }
  }

  public final Intent getIntent()
  {
    AppMethodBeat.i(6207);
    if (!bo.isNullOrNil(this.uiI.getTitle()))
      this.intent.putExtra("title", this.uiI.getTitle());
    Intent localIntent = this.intent;
    AppMethodBeat.o(6207);
    return localIntent;
  }

  public final String getUrl()
  {
    AppMethodBeat.i(6208);
    String str = this.uiI.getUrl();
    AppMethodBeat.o(6208);
    return str;
  }

  public final void mu(boolean paramBoolean)
  {
    AppMethodBeat.i(6212);
    if (!this.uiI.bPe.xi().aZ(false))
      ((Activity)this.uiI.mContext).finish();
    AppMethodBeat.o(6212);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.l
 * JD-Core Version:    0.6.2
 */