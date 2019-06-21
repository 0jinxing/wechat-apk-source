package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.m;

final class c$24
  implements View.OnClickListener
{
  c$24(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85145);
    m.dTZ().a("tools", WebView.d.ANc);
    m.dTZ().a("toolsmp", WebView.d.ANc);
    m.dTZ().a("appbrand", WebView.d.ANc);
    m.dTZ().a("support", WebView.d.ANc);
    m.dTZ().a("mm", WebView.d.ANc);
    if (WebView.getInstalledTbsCoreVersion(this.ARk.AMr) <= 0)
    {
      this.ARk.cs("已切换x5，但是x5未ready，点任意位置重启进程生效\n", true);
      AppMethodBeat.o(85145);
    }
    while (true)
    {
      return;
      this.ARk.ct("已使用x5，点任意位置重启进程生效\n", true);
      AppMethodBeat.o(85145);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.24
 * JD-Core Version:    0.6.2
 */