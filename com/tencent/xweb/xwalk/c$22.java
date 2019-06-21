package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.m;
import org.xwalk.core.XWalkEnvironment;

final class c$22
  implements View.OnClickListener
{
  c$22(c paramc)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85143);
    XWalkEnvironment.setGrayValueForTest(1);
    if (!XWalkEnvironment.hasAvailableVersion())
      if (XWalkEnvironment.isIaDevice())
      {
        this.ARk.avh("http://debugxweb.qq.com/?set_web_config=WV_KIND_CW&set_appbrand_config=WV_KIND_CW&set_config_url=https://dldir1.qq.com/weixin/android/wxweb/updateConfig_x86_test.xml&check_xwalk_update");
        AppMethodBeat.o(85143);
      }
    while (true)
    {
      return;
      this.ARk.avh("http://debugxweb.qq.com/?set_web_config=WV_KIND_CW&set_appbrand_config=WV_KIND_CW&set_config_url=https://dldir1.qq.com/weixin/android/wxweb/updateConfig_test.xml&check_xwalk_update");
      AppMethodBeat.o(85143);
      continue;
      m.dTZ().a("tools", WebView.d.ANb);
      m.dTZ().a("toolsmp", WebView.d.ANb);
      m.dTZ().a("appbrand", WebView.d.ANb);
      m.dTZ().a("support", WebView.d.ANb);
      m.dTZ().a("mm", WebView.d.ANb);
      this.ARk.ct("已使用XWeb，点任意位置重启进程生效\n", true);
      AppMethodBeat.o(85143);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.22
 * JD-Core Version:    0.6.2
 */