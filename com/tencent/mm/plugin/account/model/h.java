package com.tencent.mm.plugin.account.model;

import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.f.a.a;
import com.tencent.mm.ui.f.a.a.1;
import com.tencent.mm.ui.f.a.c;

public final class h
{
  private c gyN;
  h.a gyO;
  ak handler;

  public h(c paramc, h.a parama)
  {
    this.gyN = paramc;
    this.gyO = parama;
  }

  public final void apm()
  {
    AppMethodBeat.i(124693);
    this.handler = new h.1(this);
    Bundle localBundle = new Bundle();
    localBundle.putString("client_id", ah.getContext().getString(2131305891));
    localBundle.putString("client_secret", ah.getContext().getString(2131305892));
    localBundle.putString("grant_type", "fb_exchange_token");
    localBundle.putString("fb_exchange_token", this.gyN.gqE);
    h.2 local2 = new h.2(this);
    d.post(new a.1(new a(this.gyN), "oauth/access_token", localBundle, "GET", local2), "AsyncFacebookRunner_request");
    AppMethodBeat.o(124693);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.model.h
 * JD-Core Version:    0.6.2
 */