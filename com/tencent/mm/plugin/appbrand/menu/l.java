package com.tencent.mm.plugin.appbrand.menu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.method.ScrollingMovementMethod;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.an;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.appbrand.report.g;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.ui.widget.a.c;
import java.util.Locale;

final class l extends com.tencent.mm.plugin.appbrand.menu.a.a
{
  l()
  {
    super(o.imR.ordinal());
    AppMethodBeat.i(132248);
    AppMethodBeat.o(132248);
  }

  public final void a(Context paramContext, u paramu, com.tencent.mm.ui.base.l paraml, String paramString)
  {
    AppMethodBeat.i(132249);
    if (bp.dpL())
      paraml.e(this.inj, paramContext.getString(2131296842));
    AppMethodBeat.o(132249);
  }

  @SuppressLint({"DefaultLocale", "RtlHardcoded"})
  public final void a(Context paramContext, u paramu, String paramString, n paramn)
  {
    AppMethodBeat.i(132250);
    com.tencent.mm.plugin.appbrand.config.h localh = paramu.getRuntime().ye();
    paramn = new StringBuilder("!PKG_INFO!\n");
    WxaPkgWrappingInfo localWxaPkgWrappingInfo = WxaCommLibRuntimeReader.avQ();
    paramn.append("\n[lib.src    ] ");
    if (localWxaPkgWrappingInfo.gVw)
      if (an.avU())
      {
        paramString = "local(force)";
        paramn.append(paramString);
        label62: paramn.append("\n[lib.ver_cli] ").append(localWxaPkgWrappingInfo.gVu);
        paramn.append("\n[lib.ver_sdk] ").append(WxaCommLibRuntimeReader.avP().avl());
        if (localWxaPkgWrappingInfo.gVt != 0)
        {
          StringBuilder localStringBuilder = paramn.append("  ");
          if (localWxaPkgWrappingInfo.gVt != 0)
            break label520;
          paramString = "";
          label125: localStringBuilder.append(paramString);
        }
        paramString = localh.hhd;
        paramn.append('\n');
        paramn.append("\n[app.version] ").append(paramString.gVu);
        if (localh.hhd.gVt != 0)
          paramn.append("  ").append(bo.mx(paramString.gVv));
        if (bo.ek(paramString.gVx))
          break label532;
      }
    label520: label532: for (boolean bool = true; ; bool = false)
    {
      paramn.append("\n[app.module ] ").append(String.valueOf(bool));
      if (bool)
      {
        paramString = ((com.tencent.mm.plugin.appbrand.j.h)paramu.getRuntime().gNO).CE(paramu.getURL());
        paramn.append(String.format(Locale.US, "  (%s)", new Object[] { paramString.name }));
        if (paramString.cta)
          paramn.append(" (independent)");
      }
      if (!com.tencent.mm.plugin.appbrand.p.b(paramu))
        paramn.append("\n[app.page.url] ").append(paramu.getURL());
      paramn.append('\n');
      paramn.append("\n[js_runtime] ").append(com.tencent.mm.plugin.appbrand.report.a.e(paramu.xT().aBx()));
      if (!com.tencent.mm.plugin.appbrand.p.b(paramu))
        paramn.append("\n[webview] ").append(g.aLe());
      paramString = p.inf;
      p.a(paramn, paramu.xT());
      paramn.append('\n');
      paramn.append("\n[isolate_context] ").append(((s)paramu.xT()).aut());
      paramu = new TextView(paramContext);
      paramu.setText(paramn);
      paramu.setGravity(19);
      paramu.setTextSize(1, 10.0F);
      paramu.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      paramu.setTextColor(-16777216);
      paramu.setTypeface(Typeface.MONOSPACE);
      int i = paramContext.getResources().getDimensionPixelSize(2131427776);
      paramu.setPadding(i, i, i, i);
      paramu.setMovementMethod(ScrollingMovementMethod.getInstance());
      com.tencent.mm.ui.base.h.a(paramContext, null, paramu, null).setCanceledOnTouchOutside(false);
      AppMethodBeat.o(132250);
      return;
      paramString = "local";
      break;
      paramn.append("network");
      break label62;
      paramString = bo.mx(localWxaPkgWrappingInfo.gVv);
      break label125;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.l
 * JD-Core Version:    0.6.2
 */