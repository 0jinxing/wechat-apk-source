package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;

public final class o
{
  String iCz;
  MMWebView pzp;
  boolean uxW = false;
  WebViewUI uxX;

  public o(WebViewUI paramWebViewUI)
  {
    this.uxX = paramWebViewUI;
  }

  @SuppressLint({"ResourceType"})
  private void daS()
  {
    AppMethodBeat.i(8137);
    View localView = this.uxX.findViewById(2131824656);
    if (localView != null)
      localView.setBackgroundColor(daW());
    int i = this.uxX.getResources().getColor(2131690680);
    localView = this.uxX.findViewById(2131829179);
    if ((localView != null) && ((localView instanceof TextView)))
      ((TextView)localView).setTextColor(i);
    localView = this.uxX.findViewById(2131829181);
    if ((localView != null) && ((localView instanceof TextView)))
      ((TextView)localView).setTextColor(i);
    localView = this.uxX.findViewById(2131829180);
    if ((localView != null) && ((localView instanceof ImageView)))
      ((ImageView)localView).setImageResource(2131232164);
    AppMethodBeat.o(8137);
  }

  private void daT()
  {
    AppMethodBeat.i(8138);
    int i = daW();
    this.uxX.xE(i);
    this.uxX.dyc();
    AppMethodBeat.o(8138);
  }

  private boolean daV()
  {
    AppMethodBeat.i(8140);
    boolean bool;
    if (this.uxX == null)
    {
      bool = false;
      AppMethodBeat.o(8140);
    }
    while (true)
    {
      return bool;
      String str1 = this.iCz;
      String str2 = str1;
      if (bo.isNullOrNil(str1))
        str2 = this.uxX.cWL();
      bool = e.agG(str2);
      AppMethodBeat.o(8140);
    }
  }

  final boolean daQ()
  {
    boolean bool = true;
    AppMethodBeat.i(8135);
    if (this.uxX.aMj())
      AppMethodBeat.o(8135);
    while (true)
    {
      return bool;
      Intent localIntent = this.uxX.getIntent();
      if (localIntent != null)
      {
        if (localIntent.getBooleanExtra("disable_light_actionbar_style", false))
        {
          ab.i("MicroMsg.WebViewUIStyleHelper", "checkDisableLightActionbarStyle, KDisableLightActionbarStyle is true");
          AppMethodBeat.o(8135);
        }
        else
        {
          String str = localIntent.getStringExtra("status_bar_style");
          if ((!bo.isNullOrNil(str)) && (str.equals("black")))
          {
            ab.i("MicroMsg.WebViewUIStyleHelper", "checkDisableLightActionbarStyle, customized by KStatusBarStyle");
            AppMethodBeat.o(8135);
          }
          else if (localIntent.getIntExtra("customize_status_bar_color", 0) != 0)
          {
            ab.i("MicroMsg.WebViewUIStyleHelper", "checkDisableLightActionbarStyle, customized by KCustomizeStatusBarColor");
            AppMethodBeat.o(8135);
          }
          else if (localIntent.getBooleanExtra("open_custom_style_url", false))
          {
            ab.i("MicroMsg.WebViewUIStyleHelper", "checkDisableLightActionbarStyle, customized by KOpenCustomStyleUrl");
            AppMethodBeat.o(8135);
          }
          else if (localIntent.getBooleanExtra("show_full_screen", false))
          {
            ab.i("MicroMsg.WebViewUIStyleHelper", "checkDisableLightActionbarStyle, webview is fullscreen");
            AppMethodBeat.o(8135);
          }
        }
      }
      else
      {
        AppMethodBeat.o(8135);
        bool = false;
      }
    }
  }

  final void daR()
  {
    AppMethodBeat.i(8136);
    daT();
    daS();
    daU();
    AppMethodBeat.o(8136);
  }

  final void daU()
  {
    AppMethodBeat.i(8139);
    if (!daV())
    {
      this.uxX.dyc();
      AppMethodBeat.o(8139);
    }
    while (true)
    {
      return;
      if ((this.pzp != null) && (this.pzp.getWebScrollY() > 0))
      {
        this.uxX.dyc();
        AppMethodBeat.o(8139);
      }
      else
      {
        this.uxX.dyb();
        AppMethodBeat.o(8139);
      }
    }
  }

  public final int daW()
  {
    AppMethodBeat.i(8141);
    int i;
    if (daV())
    {
      i = this.uxX.getResources().getColor(2131690679);
      AppMethodBeat.o(8141);
    }
    while (true)
    {
      return i;
      i = this.uxX.getResources().getColor(2131690674);
      AppMethodBeat.o(8141);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.o
 * JD-Core Version:    0.6.2
 */