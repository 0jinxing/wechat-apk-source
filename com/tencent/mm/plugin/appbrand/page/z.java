package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.view.View;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.d;

public final class z extends n
{
  private u hTn;
  private String mUrl;

  public z(Context paramContext, q paramq)
  {
    super(paramContext, paramq);
  }

  public final boolean Ay(String paramString)
  {
    AppMethodBeat.i(87306);
    boolean bool = h.bO(this.mUrl).equals(h.bO(paramString));
    AppMethodBeat.o(87306);
    return bool;
  }

  protected final View aAQ()
  {
    AppMethodBeat.i(87304);
    if (this.hTn == null)
    {
      this.hTn = getContainer().getPageViewPrivate();
      this.hTn.k(this);
    }
    View localView = this.hTn.getContentView();
    AppMethodBeat.o(87304);
    return localView;
  }

  protected final void aAR()
  {
    AppMethodBeat.i(87307);
    super.aAR();
    this.hTn.onDestroy();
    AppMethodBeat.o(87307);
  }

  public final void aAS()
  {
    AppMethodBeat.i(87309);
    super.aAS();
    this.hTn.wU();
    AppMethodBeat.o(87309);
  }

  public final void aAT()
  {
    AppMethodBeat.i(87310);
    super.aAT();
    this.hTn.wW();
    AppMethodBeat.o(87310);
  }

  public final void b(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(87311);
    if (!f(paramArrayOfInt, this.hTn.hashCode()))
      AppMethodBeat.o(87311);
    while (true)
    {
      return;
      this.hTn.h(paramString1, paramString2, 0);
      AppMethodBeat.o(87311);
    }
  }

  public final void cleanup()
  {
    AppMethodBeat.i(87308);
    super.cleanup();
    this.hTn.cleanup();
    AppMethodBeat.o(87308);
  }

  public final u getCurrentPageView()
  {
    return this.hTn;
  }

  public final String getCurrentUrl()
  {
    return this.mUrl;
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(87305);
    if (this.mUrl != null)
      AppMethodBeat.o(87305);
    while (true)
    {
      return;
      this.mUrl = paramString;
      this.hTn.AA(paramString);
      AppMethodBeat.o(87305);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.z
 * JD-Core Version:    0.6.2
 */