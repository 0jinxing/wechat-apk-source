package com.tencent.mm.plugin.websearch.api;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;

public final class ap
{
  private static ap ubl;
  private SharedPreferences ubh;
  private volatile boolean ubi;
  private long ubj;
  private boolean ubk;
  private long ubm;

  static
  {
    AppMethodBeat.i(124257);
    ubl = new ap();
    AppMethodBeat.o(124257);
  }

  public ap()
  {
    AppMethodBeat.i(124252);
    this.ubh = ar.s(ah.getContext(), "com.tencent.mm.plugin.websearch.WebSearchXWeb", 4);
    this.ubi = this.ubh.getBoolean("isUseSysWebview", false);
    this.ubk = false;
    cVE();
    AppMethodBeat.o(124252);
  }

  private void cVE()
  {
    AppMethodBeat.i(124253);
    if (System.currentTimeMillis() - this.ubm < 7200000L)
      AppMethodBeat.o(124253);
    while (true)
    {
      return;
      this.ubm = System.currentTimeMillis();
      com.tencent.mm.sdk.g.d.post(new ap.1(this), "WebSearchXWeb-getSwitch");
      AppMethodBeat.o(124253);
    }
  }

  public static ap cVF()
  {
    return ubl;
  }

  private void cVH()
  {
    AppMethodBeat.i(124255);
    com.tencent.mm.sdk.g.d.post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(124251);
        try
        {
          if (WebView.getTbsCoreVersion(ah.getContext()) == 0)
          {
            h.pYm.e(15367, new Object[] { Integer.valueOf(1) });
            AppMethodBeat.o(124251);
          }
          while (true)
          {
            return;
            if (com.tencent.xweb.x5.sdk.d.canOpenWebPlus(ah.getContext()))
              break;
            h.pYm.e(15367, new Object[] { Integer.valueOf(1) });
            AppMethodBeat.o(124251);
          }
          ab.i("WebSearchXWeb", "begin check use sys webview");
          if (ap.a(this.ubp) > ap.a(this.ubq))
          {
            h.pYm.e(15367, new Object[] { Integer.valueOf(2) });
            ap.b(ap.this, true);
          }
          while (true)
          {
            ab.i("WebSearchXWeb", "end  check use sys webview, isUseSysWebview %b", new Object[] { Boolean.valueOf(ap.a(ap.this)) });
            ap.b(ap.this).edit().putBoolean("isUseSysWebview", ap.a(ap.this)).commit();
            AppMethodBeat.o(124251);
            break;
            h.pYm.e(15367, new Object[] { Integer.valueOf(3) });
            ap.b(ap.this, false);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("WebSearchXWeb", "", new Object[] { localException });
            AppMethodBeat.o(124251);
          }
        }
      }
    }
    , "WebSearchXWeb.check");
    AppMethodBeat.o(124255);
  }

  public final boolean cVG()
  {
    boolean bool = false;
    AppMethodBeat.i(124254);
    cVE();
    String str = Build.BRAND;
    if (TextUtils.isEmpty(str))
    {
      ab.i("WebSearchXWeb", "brand is empty");
      AppMethodBeat.o(124254);
    }
    while (true)
    {
      return bool;
      if ((str.contains("huawei")) || (str.contains("honor")))
      {
        ab.i("WebSearchXWeb", "huawei not support sys webview");
        AppMethodBeat.o(124254);
      }
      else if (!this.ubk)
      {
        ab.i("WebSearchXWeb", "check use sys webview switch close");
        AppMethodBeat.o(124254);
      }
      else
      {
        if (this.ubj == 0L)
          this.ubj = this.ubh.getLong("lastCheckTimestamp", 0L);
        if (System.currentTimeMillis() - this.ubj > 86400000L)
        {
          cVH();
          this.ubj = System.currentTimeMillis();
          this.ubh.edit().putLong("lastCheckTimestamp", this.ubj).commit();
        }
        bool = this.ubi;
        AppMethodBeat.o(124254);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ap
 * JD-Core Version:    0.6.2
 */