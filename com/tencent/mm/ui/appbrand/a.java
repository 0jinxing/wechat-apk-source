package com.tencent.mm.ui.appbrand;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import java.io.UnsupportedEncodingException;

public final class a
{
  public String appId;
  Context context;
  public WxaExposedParams iIa;
  com.tencent.mm.ui.widget.a.d irC;
  public boolean jnK;
  public int scene;
  public String username;
  a.h yrj;
  public String yrk;

  public a(Context paramContext)
  {
    AppMethodBeat.i(29945);
    this.iIa = new WxaExposedParams.a().ayP();
    this.appId = "";
    this.yrk = "";
    this.context = paramContext;
    AppMethodBeat.o(29945);
  }

  public static String aE(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(29949);
    String str = "";
    try
    {
      paramString1 = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&&business_appid=%s#wechat_redirect", new Object[] { q.encode(bo.nullAsNil(paramString1), "UTF-8"), q.encode(bo.nullAsNil(paramString2), "UTF-8"), Integer.valueOf(10), q.encode(bo.nullAsNil(paramString3), "UTF-8") });
      AppMethodBeat.o(29949);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandServiceActionSheet", "buildExposeUrl encode fail, invalid arguments");
        AppMethodBeat.o(29949);
        paramString1 = str;
      }
    }
  }

  final String getAppId()
  {
    AppMethodBeat.i(29947);
    Object localObject;
    if (bo.isNullOrNil(this.username))
    {
      localObject = null;
      AppMethodBeat.o(29947);
    }
    while (true)
    {
      return localObject;
      if (bo.isNullOrNil(this.appId))
      {
        localObject = ((com.tencent.mm.plugin.appbrand.service.d)g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(this.username);
        if (localObject != null)
          this.appId = ((WxaAttributes)localObject).field_appId;
      }
      localObject = this.appId;
      AppMethodBeat.o(29947);
    }
  }

  final void he(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(29948);
    if (bo.isNullOrNil(getAppId()))
      AppMethodBeat.o(29948);
    while (true)
    {
      return;
      ab.d("MicroMsg.AppBrandServiceActionSheet", "stev report(%s), appId : %s, scene %s, sceneId %s, action %s", new Object[] { Integer.valueOf(13918), this.appId, Integer.valueOf(paramInt1), this.yrk, Integer.valueOf(paramInt2) });
      h.pYm.e(13918, new Object[] { getAppId(), Integer.valueOf(paramInt1), this.yrk, Integer.valueOf(paramInt2), Long.valueOf(bo.anT()) });
      AppMethodBeat.o(29948);
    }
  }

  public final void show(int paramInt)
  {
    AppMethodBeat.i(29946);
    this.irC = new com.tencent.mm.ui.widget.a.d(this.context, 1, true);
    switch (paramInt)
    {
    default:
      AppMethodBeat.o(29946);
      return;
    case 1:
      this.yrj = new a();
      label83: if (this.yrj == null)
        ab.e("MicroMsg.AppBrandServiceActionSheet", "resetTitleView, state is null");
      break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      this.irC.rBl = new a.2(this);
      this.irC.rBm = new a.1(this);
      this.irC.cpD();
      AppMethodBeat.o(29946);
      break;
      this.yrj = new a.b(this);
      break label83;
      this.yrj = new a.f(this);
      break label83;
      this.yrj = new a.g(this);
      break label83;
      this.yrj = new d();
      break label83;
      this.yrj = new a.e(this);
      break label83;
      View localView = this.yrj.dzm();
      if (localView != null)
        this.irC.F(localView, false);
    }
  }

  public final class a extends a.c
  {
    public a()
    {
      super();
    }

    public final void a(l paraml)
    {
      AppMethodBeat.i(29928);
      super.a(paraml);
      paraml.e(2, a.this.context.getString(2131296831));
      paraml.e(8, a.this.context.getString(2131296829));
      paraml.e(7, a.a(a.this));
      AppMethodBeat.o(29928);
    }

    public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
    {
      AppMethodBeat.i(29929);
      super.onMMMenuItemSelected(paramMenuItem, paramInt);
      AppMethodBeat.o(29929);
    }
  }

  public final class d extends a.c
  {
    public d()
    {
      super();
    }

    public final void a(l paraml)
    {
      AppMethodBeat.i(29935);
      super.a(paraml);
      paraml.e(2, a.this.context.getString(2131296831));
      paraml.e(8, a.this.context.getString(2131296829));
      paraml.e(7, a.a(a.this));
      AppMethodBeat.o(29935);
    }

    public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
    {
      AppMethodBeat.i(29936);
      super.onMMMenuItemSelected(paramMenuItem, paramInt);
      AppMethodBeat.o(29936);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.a
 * JD-Core Version:    0.6.2
 */