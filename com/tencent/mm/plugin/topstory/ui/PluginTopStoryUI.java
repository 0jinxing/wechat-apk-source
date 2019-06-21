package com.tencent.mm.plugin.topstory.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.i;
import com.tencent.mm.g.a.im;
import com.tencent.mm.g.a.im.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.websearch.api.an;
import com.tencent.mm.pluginsdk.f.h;
import com.tencent.mm.protocal.protobuf.cho;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.HashMap;

public class PluginTopStoryUI extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, a
{
  private int sBd;
  private b sBe;
  private com.tencent.mm.plugin.topstory.ui.home.d sBf;
  private a.a sBg;
  private com.tencent.mm.sdk.b.c<im> sBh;

  public PluginTopStoryUI()
  {
    AppMethodBeat.i(1524);
    this.sBd = 2;
    this.sBh = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(im paramAnonymousim)
      {
        AppMethodBeat.i(1522);
        boolean bool;
        if (paramAnonymousim.cDD == null)
        {
          AppMethodBeat.o(1522);
          bool = false;
        }
        while (true)
        {
          return bool;
          ab.i("MicroMsg.TopStory.PluginTopStoryUI", "recv HaoKanActionEvent, serverData:%s, clientData:%s", new Object[] { paramAnonymousim.cDD.cDE, paramAnonymousim.cDD.cDF });
          if ((!bo.isNullOrNil(paramAnonymousim.cDD.cDE)) && (PluginTopStoryUI.this.sBg != null))
            PluginTopStoryUI.this.sBg.abA(paramAnonymousim.cDD.cDE);
          if (!bo.isNullOrNil(paramAnonymousim.cDD.cDF));
          try
          {
            i locali = new com/tencent/mm/aa/i;
            locali.<init>(paramAnonymousim.cDD.cDF);
            paramAnonymousim = locali.getString("action");
            locali = locali.lB("params");
            if (paramAnonymousim.equals("updateNumReddot"))
            {
              locali.optString("msgId");
              int i = locali.getInt("latestTimeStamp");
              int j = locali.getInt("seq");
              ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getRedDotMgr().i(i, j, true);
            }
            while (true)
            {
              AppMethodBeat.o(1522);
              bool = true;
              break;
              if (!paramAnonymousim.equals("openProfile"))
                break label249;
              c.abC(locali.getString("openId"));
            }
          }
          catch (Exception paramAnonymousim)
          {
            while (true)
            {
              ab.e("MicroMsg.TopStory.PluginTopStoryUI", "HaoKanActionEvent error");
              ab.printErrStackTrace("MicroMsg.TopStory.PluginTopStoryUI", paramAnonymousim, "", new Object[0]);
              continue;
              label249: if (paramAnonymousim.equals("openWowColikeSetting"))
                c.eZ(ah.getContext());
            }
          }
        }
      }
    };
    AppMethodBeat.o(1524);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public int getFirstLoadWebView()
  {
    return this.sBd;
  }

  public b getTopStoryCommand()
  {
    return this.sBe;
  }

  public com.tencent.mm.plugin.topstory.ui.home.d getWebViewMgr()
  {
    return this.sBf;
  }

  public void onAccountInitialized(e.c paramc)
  {
    int i = 1;
    AppMethodBeat.i(1525);
    this.sBf = new com.tencent.mm.plugin.topstory.ui.home.d();
    this.sBe = new b();
    com.tencent.mm.pluginsdk.cmd.b.a(this.sBe, new String[] { "//topstory" });
    this.sBh.dnU();
    long l = com.tencent.mm.kernel.g.RP().Ry().a(ac.a.xVs, 0L);
    if (System.currentTimeMillis() - l <= 259200000L)
    {
      ab.i("MicroMsg.TopStory.PluginTopStoryUI", "Use TopStory In Three Days %s", new Object[] { h.formatTime("yyyy-MM-dd HH:mm:ss", l / 1000L) });
      an.Il(23);
    }
    while (true)
    {
      if (i != 0)
        tryToCreateTopStoryWebView();
      com.tencent.mm.sdk.g.d.post(new PluginTopStoryUI.1(this), "TopStory.DeleteTopStoryConversation");
      com.tencent.mm.sdk.g.d.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(1519);
          com.tencent.mm.plugin.topstory.ui.home.d locald = PluginTopStoryUI.this.sBf;
          File localFile = new File(com.tencent.mm.plugin.topstory.a.g.cFn());
          if (localFile.exists())
          {
            File[] arrayOfFile = localFile.listFiles();
            if ((arrayOfFile != null) && (arrayOfFile.length > 0))
            {
              int i = arrayOfFile.length;
              int j = 0;
              if (j < i)
              {
                localFile = arrayOfFile[j];
                int k = bo.getInt(localFile.getName(), -1);
                cho localcho;
                if (k > 0)
                  localcho = new cho();
                while (true)
                {
                  try
                  {
                    byte[] arrayOfByte = com.tencent.mm.vfs.e.e(localFile.getAbsolutePath(), 0, -1);
                    localcho.parseFrom(arrayOfByte);
                    locald.sDg.put(Integer.valueOf(k), localcho);
                    ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "put home data cache key:%d size:%d", new Object[] { Integer.valueOf(k), Integer.valueOf(arrayOfByte.length) });
                    j++;
                  }
                  catch (Exception localException)
                  {
                    ab.printErrStackTrace("MicroMsg.TopStory.TopStoryWebViewMgr", localException, "loadHomeDataCache %s", new Object[] { localFile.getAbsoluteFile() });
                    continue;
                  }
                  ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Decode Key Error %s", new Object[] { localFile.getAbsolutePath() });
                }
              }
            }
            else
            {
              ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Files %s", new Object[] { localFile.getAbsolutePath() });
            }
          }
          while (true)
          {
            PluginTopStoryUI.this.sBf.cFM();
            AppMethodBeat.o(1519);
            return;
            ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "loadHomeDataCache Folder Not Exist %s", new Object[] { localFile.getAbsolutePath() });
          }
        }
      }
      , "TopStory.LoadHomeCacheData");
      AppMethodBeat.o(1525);
      return;
      i = 0;
    }
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(1526);
    this.sBf = null;
    this.sBe = null;
    this.sBh.dead();
    com.tencent.mm.pluginsdk.cmd.b.N(new String[] { "//topstory" });
    AppMethodBeat.o(1526);
  }

  public void parallelsDependency()
  {
  }

  public void setFirstLoadWebView(int paramInt)
  {
    this.sBd = paramInt;
  }

  public void setHaokanEventListener(a.a parama)
  {
    this.sBg = parama;
  }

  public void tryToCreateTopStoryWebView()
  {
    AppMethodBeat.i(1527);
    al.n(new PluginTopStoryUI.3(this), 5000L);
    AppMethodBeat.o(1527);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.PluginTopStoryUI
 * JD-Core Version:    0.6.2
 */