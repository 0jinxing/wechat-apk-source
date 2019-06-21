package com.tencent.mm.plugin.topstory.ui;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.e;
import com.tencent.mm.plugin.topstory.PluginTopStory;
import com.tencent.mm.plugin.topstory.ui.webview.TopStoryWebView;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.plugin.zero.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView.d;

final class PluginTopStoryUI$3
  implements Runnable
{
  PluginTopStoryUI$3(PluginTopStoryUI paramPluginTopStoryUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1520);
    Object localObject;
    int i;
    if ((PluginTopStoryUI.access$100(this.sBi) == 2) && (((PluginTopStory)g.M(PluginTopStory.class)).getWebViewType() == WebView.d.ANd))
    {
      localObject = Build.BRAND;
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = ((String)localObject).toLowerCase();
        if ((((String)localObject).contains("huawei")) || (((String)localObject).contains("honor")))
        {
          i = 0;
          if (i == 0)
            break label183;
          i = ((a)g.K(a.class)).Nu().getInt("TopStoryWebViewPreInit", 1);
          if (i != 0)
            break label128;
          ab.i("MicroMsg.TopStory.PluginTopStoryUI", "MXM_DynaCfg_AV_Item_Key_TopStory_WebViewPreInit is %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(1520);
        }
      }
    }
    while (true)
    {
      return;
      i = 1;
      break;
      label128: PluginTopStoryUI.access$102(this.sBi, 1);
      long l = System.currentTimeMillis();
      try
      {
        localObject = new com/tencent/mm/plugin/topstory/ui/webview/TopStoryWebView;
        ((TopStoryWebView)localObject).<init>(ah.getContext());
        ((TopStoryWebView)localObject).destroy();
        label156: an.Il(26);
        ab.i("MicroMsg.TopStory.PluginTopStoryUI", "Create TopStoryWebView Use Time %d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
        label183: AppMethodBeat.o(1520);
      }
      catch (Exception localException)
      {
        break label156;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI.3
 * JD-Core Version:    0.6.2
 */