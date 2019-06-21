package com.tencent.mm.ui.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.az.h.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.List;
import org.b.a.a.c.a;
import org.b.e.b;

@SuppressLint({"HandlerLeak"})
public final class a
  implements b.a
{
  Context context;
  ak rgT;
  b zKT;
  public org.b.d.i zKU;
  org.b.d.i zKV;
  private boolean zKW;
  boolean zKX;
  public a.b zKY;
  public a.a zKZ;

  public a()
  {
    AppMethodBeat.i(80350);
    this.zKT = null;
    this.zKU = null;
    this.zKV = null;
    this.zKW = false;
    this.zKX = false;
    this.zKY = null;
    this.zKZ = null;
    this.context = null;
    this.rgT = new a.1(this);
    Object localObject = new org.b.a.a();
    ((org.b.a.a)localObject).BYH = org.b.a.a.bg(c.a.class);
    org.b.g.d.jn("XMr2y8FEVEqZBcZ1TU3gLA", "Invalid Api key");
    ((org.b.a.a)localObject).BYE = "XMr2y8FEVEqZBcZ1TU3gLA";
    org.b.g.d.jn("kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo", "Invalid Api secret");
    ((org.b.a.a)localObject).BYF = "kyWwA5vbB6H1NDQFufR9hD5vWGStxhweIbatclCo";
    org.b.g.d.r("wechatapp://sign-in-twitter.wechatapp.com/", "Callback can't be null");
    ((org.b.a.a)localObject).BYG = "wechatapp://sign-in-twitter.wechatapp.com/";
    org.b.g.d.r(((org.b.a.a)localObject).BYH, "You must specify a valid api through the provider() method");
    org.b.g.d.jn(((org.b.a.a)localObject).BYE, "You must provide an api key");
    org.b.g.d.jn(((org.b.a.a)localObject).BYF, "You must provide an api secret");
    this.zKT = ((org.b.a.a)localObject).BYH.a(new org.b.d.a(((org.b.a.a)localObject).BYE, ((org.b.a.a)localObject).BYF, ((org.b.a.a)localObject).BYG, ((org.b.a.a)localObject).BYI, ((org.b.a.a)localObject).scope, ((org.b.a.a)localObject).BYJ));
    String str;
    if (g.RN().QY())
    {
      localObject = (String)g.RP().Ry().get(69377, null);
      str = (String)g.RP().Ry().get(69378, null);
      if ((bo.isNullOrNil((String)localObject)) || (bo.isNullOrNil(str)))
        localObject = null;
    }
    while (true)
    {
      this.zKU = ((org.b.d.i)localObject);
      AppMethodBeat.o(80350);
      return;
      localObject = new org.b.d.i((String)localObject, str);
      continue;
      ab.e("Twitter", "acchas not ready for restoreTwitterAccessToken");
      localObject = null;
    }
  }

  static void a(org.b.d.i parami)
  {
    AppMethodBeat.i(80353);
    ah.getContext().getSharedPreferences(ah.doA(), 0);
    if (parami == null)
    {
      g.RP().Ry().set(69377, "");
      g.RP().Ry().set(69378, "");
      AppMethodBeat.o(80353);
    }
    while (true)
    {
      return;
      g.RP().Ry().set(69377, parami.token);
      g.RP().Ry().set(69378, parami.wFn);
      AppMethodBeat.o(80353);
    }
  }

  static void qT(boolean paramBoolean)
  {
    AppMethodBeat.i(80358);
    ArrayList localArrayList = new ArrayList();
    if (paramBoolean);
    for (String str = "1"; ; str = "2")
    {
      localArrayList.add(new h.a(10251, str));
      ((j)g.K(j.class)).XL().c(new com.tencent.mm.az.h(localArrayList));
      AppMethodBeat.o(80358);
      return;
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(80352);
    if (this.zKX)
      AppMethodBeat.o(80352);
    while (true)
    {
      return;
      this.zKZ = parama;
      this.zKX = true;
      com.tencent.mm.sdk.g.d.post(new a.3(this), "Twitter_validationAccessToken");
      AppMethodBeat.o(80352);
    }
  }

  public final void a(a.b paramb, Context paramContext)
  {
    AppMethodBeat.i(80351);
    if (this.zKW)
      AppMethodBeat.o(80351);
    while (true)
    {
      return;
      com.tencent.mm.plugin.report.service.h.pYm.a(583L, 0L, 1L, false);
      this.zKY = paramb;
      this.context = paramContext;
      this.zKW = true;
      com.tencent.mm.sdk.g.d.post(new a.2(this), "Twitter_doOAuth");
      AppMethodBeat.o(80351);
    }
  }

  final void c(a.c paramc)
  {
    AppMethodBeat.i(80354);
    this.zKW = false;
    this.zKV = null;
    if (this.zKY != null)
      this.zKY.a(paramc);
    AppMethodBeat.o(80354);
  }

  public final boolean dKv()
  {
    if (this.zKU != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void dKw()
  {
    AppMethodBeat.i(80356);
    qT(false);
    c(a.c.zLe);
    com.tencent.mm.plugin.report.service.h.pYm.a(583L, 2L, 1L, false);
    AppMethodBeat.o(80356);
  }

  public final void onCancel()
  {
    AppMethodBeat.i(80357);
    qT(false);
    c(a.c.zLf);
    com.tencent.mm.plugin.report.service.h.pYm.a(583L, 3L, 1L, false);
    AppMethodBeat.o(80357);
  }

  public final void p(Bundle paramBundle)
  {
    AppMethodBeat.i(80355);
    g.RS().aa(new a.4(this, paramBundle));
    AppMethodBeat.o(80355);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.i.a
 * JD-Core Version:    0.6.2
 */