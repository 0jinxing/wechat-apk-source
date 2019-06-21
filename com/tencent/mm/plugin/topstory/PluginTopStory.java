package com.tencent.mm.plugin.topstory;

import android.os.Build;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.bz;
import com.tencent.mm.plugin.messenger.foundation.a.p;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView.d;
import java.io.File;
import java.util.Map;

public class PluginTopStory extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.topstory.a.b
{
  private c sAg;
  private b sAh;
  private a sAi;
  private WebView.d sAj = WebView.d.ANd;

  private void preInitXWebView()
  {
    AppMethodBeat.i(65448);
    String str1 = Build.BRAND;
    Object localObject = "";
    String str2 = str1;
    boolean bool1;
    if (!bo.isNullOrNil(str1))
    {
      str1 = str1.toLowerCase();
      if (str1.contains("xiaomi"))
      {
        localObject = new File("/data/system/theme/fonts/", "Roboto-Regular.ttf");
        bool1 = ((File)localObject).exists();
        localObject = ((File)localObject).getAbsolutePath();
        str2 = str1;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.TopStory.TopStoryApiLogic", "checkNeedXWeb %s %b %s", new Object[] { str2, Boolean.valueOf(bool1), localObject });
      if (bool1)
      {
        e.pXa.a(649L, 25L, 1L, false);
        this.sAj = WebView.d.ANb;
      }
      com.tencent.mm.cj.c.a(this.sAj, new PluginTopStory.1(this));
      ab.i("MicroMsg.TopStory.PluginTopStory", "Start To Load WebView %s", new Object[] { this.sAj.name() });
      AppMethodBeat.o(65448);
      return;
      if ((str1.contains("huawei")) || (str1.contains("honor")))
      {
        if (com.tencent.mm.compatible.util.d.iW(26))
        {
          bool1 = true;
          str2 = str1;
        }
        else
        {
          localObject = new File("/data/skin/fonts/", "DroidSansChinese.ttf");
          bool1 = ((File)localObject).exists();
          localObject = ((File)localObject).getAbsolutePath();
          str2 = str1;
        }
      }
      else if (str1.contains("samsung"))
      {
        localObject = new File("/data/app_fonts/0/", "sans.loc");
        boolean bool2 = com.tencent.mm.plugin.topstory.a.g.T((File)localObject);
        localObject = ((File)localObject).getAbsolutePath();
        bool1 = bool2;
        str2 = str1;
        if (!bool2)
        {
          localObject = new File("/data/user/0/com.android.settings/app_fonts/", "sans.loc");
          bool1 = com.tencent.mm.plugin.topstory.a.g.T((File)localObject);
          localObject = ((File)localObject).getAbsolutePath();
          str2 = str1;
        }
      }
      else
      {
        str2 = str1;
        if (str1.contains("meizu"))
        {
          localObject = new File("/data/data/com.meizu.customizecenter/font/", "flymeFont.ttf");
          bool1 = ((File)localObject).exists();
          localObject = ((File)localObject).getAbsolutePath();
          str2 = str1;
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public a getPerformTracer()
  {
    return this.sAi;
  }

  public b getRedDotMgr()
  {
    return this.sAh;
  }

  public c getReporter()
  {
    return this.sAg;
  }

  public WebView.d getWebViewType()
  {
    return this.sAj;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(65446);
    this.sAg = new c();
    this.sAh = new b();
    this.sAi = new a();
    com.tencent.mm.sdk.g.d.post(new PluginTopStory.a(this, (byte)0), "TopStory.InitTopStoryCacheFolderTask");
    preInitXWebView();
    AppMethodBeat.o(65446);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(65447);
    Object localObject;
    if (this.sAg != null)
    {
      localObject = this.sAg;
      ((c)localObject).sAv.removeCallbacksAndMessages(null);
      ((c)localObject).sAv.getLooper().quit();
      this.sAg = null;
    }
    if (this.sAh != null)
    {
      localObject = this.sAh;
      ((p)com.tencent.mm.kernel.g.M(p.class)).getSysCmdMsgExtension().b("mmsearch_reddot_new", ((b)localObject).sAp);
      com.tencent.mm.sdk.b.a.xxA.d(((b)localObject).sAt);
      this.sAh = null;
    }
    if (this.sAi != null)
    {
      this.sAi.sAl.clear();
      this.sAi = null;
    }
    AppMethodBeat.o(65447);
  }

  public void onVideoListUICreate()
  {
  }

  public void onVideoListUIDestroy(chv paramchv)
  {
  }

  public void onVideoListUIPause()
  {
  }

  public void onVideoListUIResume()
  {
  }

  public void parallelsDependency()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.PluginTopStory
 * JD-Core Version:    0.6.2
 */