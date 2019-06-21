package com.tencent.luggage.d;

import android.os.Bundle;
import android.view.View;
import com.tencent.luggage.webview.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import me.imid.swipebacklayout.lib.SwipeBackLayout;

public class n extends e
  implements b
{
  public View WL;
  public k bPN;
  protected SwipeBackLayout bPO;
  public Bundle bPP;
  private String bPQ;
  private l bPz;

  public n(g paramg, Bundle paramBundle)
  {
    this(paramg, null, paramBundle);
  }

  public n(g paramg, k paramk, Bundle paramBundle)
  {
    super(paramg);
    AppMethodBeat.i(90850);
    this.bPQ = null;
    this.bPz = new n.2(this);
    if (paramBundle != null);
    while (true)
    {
      this.bPP = paramBundle;
      this.bPN = paramk;
      paramk = this.bPN;
      paramg = paramk;
      if (paramk == null)
        paramg = this.bPe.xd();
      paramk = paramg;
      if (paramg == null)
        paramk = new k(this.mContext, this.bPe.xe());
      this.bPN = paramk;
      paramg = this.bPN;
      paramg.a(this.bPe.xj(), this);
      paramg.bPz = this.bPz;
      paramg = wR();
      this.bPO = new SwipeBackLayout(this.mContext);
      this.bPO.setScrimColor(0);
      this.bPO.addView(paramg);
      this.bPO.setContentView(paramg);
      this.bPO.a(new n.1(this, new boolean[] { false }));
      this.WL = this.bPO;
      AppMethodBeat.o(90850);
      return;
      paramBundle = new Bundle();
    }
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(90853);
    if ((parama instanceof n.a))
    {
      this.bPf = parama;
      AppMethodBeat.o(90853);
    }
    while (true)
    {
      return;
      this.bPf = new n.a(parama);
      AppMethodBeat.o(90853);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(90855);
    wZ();
    this.bPN.destroy();
    AppMethodBeat.o(90855);
  }

  public void g(String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(90851);
    this.bPN.loadUrl(paramString);
    AppMethodBeat.o(90851);
  }

  public final View getContentView()
  {
    return this.WL;
  }

  protected View wR()
  {
    AppMethodBeat.i(90852);
    View localView = this.bPN.getView();
    AppMethodBeat.o(90852);
    return localView;
  }

  protected final boolean wY()
  {
    AppMethodBeat.i(90854);
    boolean bool;
    if (this.bPN.bPA.canGoBack())
    {
      this.bPN.bPA.goBack();
      bool = true;
      AppMethodBeat.o(90854);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90854);
    }
  }

  protected String xt()
  {
    return "";
  }

  public final n.a xu()
  {
    return (n.a)this.bPf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.d.n
 * JD-Core Version:    0.6.2
 */