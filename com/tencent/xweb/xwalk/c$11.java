package com.tencent.xweb.xwalk;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.xwalk.core.XWalkEnvironment;

final class c$11
  implements View.OnClickListener
{
  c$11(c paramc, Button paramButton)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(85132);
    if (XWalkEnvironment.hasPluginTestConfigUrl())
      if (XWalkEnvironment.setPluginTestConfigUrl(""))
      {
        this.ARp.setText("切换插件config，当前使用正式版");
        AppMethodBeat.o(85132);
      }
    while (true)
    {
      return;
      this.ARk.cs("切换失败", true);
      AppMethodBeat.o(85132);
      continue;
      if (XWalkEnvironment.setPluginTestConfigUrl("http://dldir1.qq.com/weixin/android/wxweb/plugin/pluginUpdateConfig_test.xml"))
      {
        this.ARp.setText("切换插件config，当前使用测试版");
        AppMethodBeat.o(85132);
      }
      else
      {
        this.ARk.cs("切换失败", true);
        AppMethodBeat.o(85132);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.11
 * JD-Core Version:    0.6.2
 */