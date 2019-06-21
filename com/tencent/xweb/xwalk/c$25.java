package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.m;

final class c$25
  implements View.OnClickListener
{
  c$25(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85146);
    m.dTZ().a("tools", WebView.d.ANd);
    m.dTZ().a("toolsmp", WebView.d.ANd);
    m.dTZ().a("appbrand", WebView.d.ANd);
    m.dTZ().a("support", WebView.d.ANd);
    m.dTZ().a("mm", WebView.d.ANd);
    this.ARk.ct("已使用system，点任意位置重启进程生效\n", true);
    AppMethodBeat.o(85146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.25
 * JD-Core Version:    0.6.2
 */