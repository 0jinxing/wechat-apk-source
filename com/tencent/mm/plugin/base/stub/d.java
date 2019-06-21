package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public class d
{
  protected String appId;
  protected Context context;
  protected d.a jDq;
  protected String openId;

  public d(Context paramContext, String paramString1, String paramString2, d.a parama)
  {
    this.context = paramContext;
    this.appId = paramString1;
    this.openId = paramString2;
    this.jDq = parama;
  }

  protected void aVh()
  {
    AppMethodBeat.i(18125);
    h.b(this.context, 2131301887, new d.1(this), new d.2(this));
    AppMethodBeat.o(18125);
  }

  public final void aVi()
  {
    AppMethodBeat.i(18124);
    if ((this.openId == null) || (this.openId.length() == 0))
    {
      ab.w("MicroMsg.OpenIdChecker", "doCheck, openId is null");
      this.jDq.ft(true);
      AppMethodBeat.o(18124);
    }
    while (true)
    {
      return;
      f localf = g.bT(this.appId, false);
      if (localf == null)
      {
        ab.e("MicroMsg.OpenIdChecker", "doCheck fail, local app is null, appId = " + this.appId);
        this.jDq.ft(true);
        AppMethodBeat.o(18124);
      }
      else if (ah.isNullOrNil(localf.field_openId))
      {
        ab.w("MicroMsg.OpenIdChecker", "doCheck fail, local openId is null, appId = " + this.appId);
        ab.d("MicroMsg.OpenIdChecker", "doCheck, trigger getappsetting, appId = " + this.appId);
        am.bYL().wy(this.appId);
        this.jDq.ft(true);
        AppMethodBeat.o(18124);
      }
      else if (this.openId.equalsIgnoreCase(localf.field_openId))
      {
        ab.d("MicroMsg.OpenIdChecker", "doCheck succ, appId = " + this.appId);
        this.jDq.ft(true);
        AppMethodBeat.o(18124);
      }
      else
      {
        ab.w("MicroMsg.OpenIdChecker", "doCheck fail, appId = " + this.appId + ", openId = " + this.openId + ", localOpenId = " + localf.field_openId);
        aVh();
        AppMethodBeat.o(18124);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.d
 * JD-Core Version:    0.6.2
 */