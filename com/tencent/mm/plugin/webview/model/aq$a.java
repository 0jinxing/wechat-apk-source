package com.tencent.mm.plugin.webview.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;

public final class aq$a
{
  public long edh;
  public String fjS;
  public long iBA;
  public long lastResumeTime;
  public int rCb;
  public int scene;
  public int una;

  public aq$a()
  {
    AppMethodBeat.i(6759);
    this.lastResumeTime = -1L;
    this.edh = System.currentTimeMillis();
    this.una = a.ge(ah.getContext());
    this.rCb = a.ge(ah.getContext());
    AppMethodBeat.o(6759);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aq.a
 * JD-Core Version:    0.6.2
 */