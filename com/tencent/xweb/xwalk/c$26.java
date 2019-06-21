package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.m;
import org.xwalk.core.XWalkEnvironment;

final class c$26
  implements View.OnClickListener
{
  c$26(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85147);
    XWalkEnvironment.setGrayValueForTest(0);
    XWalkEnvironment.setTestDownLoadUrl(this.ARk.AMr, "");
    m.dTZ().a("tools", WebView.d.ANa);
    m.dTZ().a("toolsmp", WebView.d.ANa);
    m.dTZ().a("appbrand", WebView.d.ANa);
    m.dTZ().a("support", WebView.d.ANa);
    m.dTZ().a("mm", WebView.d.ANa);
    this.ARk.ct("已使用AUTO，点任意位置重启进程生效\n", true);
    AppMethodBeat.o(85147);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.26
 * JD-Core Version:    0.6.2
 */