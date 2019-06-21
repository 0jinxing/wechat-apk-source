package com.tencent.xweb.xwalk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.util.f;
import com.tencent.xweb.xwalk.b.a;
import com.tencent.xweb.xwalk.b.a.c;
import com.tencent.xweb.xwalk.b.a.d;
import com.tencent.xweb.xwalk.b.b;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xwalk.core.Log;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkLibraryLoader.DownloadListener;
import org.xwalk.core.XWalkLibraryLoader.HttpDownloadTask;
import org.xwalk.core.XWalkLibraryLoader.WXFileDownloaderTask;

final class g$1
  implements b
{
  g$1(g paramg)
  {
  }

  private static com.tencent.xweb.xwalk.b.a.b a(a.d paramd, int paramInt)
  {
    if ((paramd == null) || (paramd.ATm == null) || (paramd.ATm.length == 0))
      paramd = null;
    while (true)
    {
      return paramd;
      com.tencent.xweb.xwalk.b.a.b[] arrayOfb = paramd.ATm;
      int i = arrayOfb.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label64;
        com.tencent.xweb.xwalk.b.a.b localb = arrayOfb[j];
        paramd = localb;
        if (localb.ATf == paramInt)
          break;
      }
      label64: paramd = null;
    }
  }

  private static a.d a(a.c paramc, String paramString, int paramInt)
  {
    AppMethodBeat.i(85424);
    if ((paramc == null) || (paramc.ATi == null) || (paramc.ATi.length == 0) || (paramString == null) || (paramString.isEmpty()))
    {
      Log.e("XWalkPluginUp", "findMatchedPluginInfo params error");
      AppMethodBeat.o(85424);
      paramc = null;
    }
    while (true)
    {
      return paramc;
      a.d[] arrayOfd = paramc.ATi;
      int i = arrayOfd.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label118;
        paramc = arrayOfd[j];
        if ((paramString.equals(paramc.ATj)) && (paramc.ATk > paramInt) && (paramc.AOK.dUw()))
        {
          AppMethodBeat.o(85424);
          break;
        }
      }
      label118: AppMethodBeat.o(85424);
      paramc = null;
    }
  }

  public final void a(com.tencent.xweb.xwalk.b.g.c paramc)
  {
    AppMethodBeat.i(85422);
    f.dVn();
    paramc = paramc.mFilePath;
    if (paramc == null)
    {
      XWalkInitializer.addXWalkInitializeLog("parse plugin config failed ,path is empty");
      paramc = null;
      if (paramc != null)
        break label99;
      XWalkEnvironment.addXWalkInitializeLog("XWalkPluginUp", "parse plugin config failed");
      f.dVp();
      g.a(this.ASW, -6);
      AppMethodBeat.o(85422);
    }
    label732: 
    while (true)
    {
      return;
      paramc = new File(paramc);
      if (!paramc.exists())
      {
        XWalkInitializer.addXWalkInitializeLog("parse plugin config failed ,file not exist");
        paramc = null;
        break;
      }
      paramc = a.k(paramc, a.a(paramc, (int)paramc.length(), "<Plugins>"));
      break;
      label99: if ((paramc.ATi == null) || (paramc.ATi.length == 0))
      {
        XWalkEnvironment.addXWalkInitializeLog("XWalkPluginUp", "plugin config contains no plugin");
        g.a(this.ASW, -7);
        AppMethodBeat.o(85422);
      }
      else
      {
        HashMap localHashMap = new HashMap();
        Iterator localIterator = e.dVQ().iterator();
        while (localIterator.hasNext())
        {
          c localc = (c)localIterator.next();
          if (localc == null)
          {
            XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "process plugin null");
          }
          else if ((g.a(this.ASW)) && (!g.b(this.ASW).equals(localc.dVM())))
          {
            XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "set only update " + g.b(this.ASW) + ", skip " + localc.dVM());
          }
          else if ((XWalkEnvironment.isForbidDownloadCode()) && (!localc.dVN()))
          {
            XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "forbid download code, skip " + localc.dVM());
          }
          else
          {
            int i = localc.ASG;
            if ((!g.a(this.ASW)) && (!localc.dVO()) && (i == -1))
            {
              XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "not installed before, do not need download now, skip " + localc.dVM());
            }
            else
            {
              Object localObject1 = a(paramc, localc.dVM(), i);
              if (localObject1 == null)
              {
                XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "no matched plugin version, skip " + localc.dVM());
              }
              else
              {
                d locald = new d();
                locald.version = ((a.d)localObject1).ATk;
                Object localObject2 = a((a.d)localObject1, i);
                if (localObject2 == null)
                {
                  locald.url = ((a.d)localObject1).ATg;
                  locald.cvZ = ((a.d)localObject1).ATb;
                  locald.path = localc.aM(locald.version, false);
                  locald.ASH = ((a.d)localObject1).ATh;
                  locald.ASI = ((a.d)localObject1).bUseCdn;
                }
                for (locald.isPatch = false; ; locald.isPatch = true)
                {
                  if ((locald.path != null) && (!locald.path.isEmpty()))
                    break label617;
                  XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "download path is empty, skip " + localc.dVM());
                  break;
                  locald.url = ((com.tencent.xweb.xwalk.b.a.b)localObject2).ATg;
                  locald.cvZ = ((com.tencent.xweb.xwalk.b.a.b)localObject2).ATb;
                  locald.path = localc.aM(locald.version, true);
                  locald.ASH = ((com.tencent.xweb.xwalk.b.a.b)localObject2).ATh;
                  locald.ASI = ((com.tencent.xweb.xwalk.b.a.b)localObject2).bUseCdn;
                }
                label617: if (!NetworkUtil.isNetworkAvailable())
                {
                  XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "network is not available, skip " + localc.dVM());
                }
                else if ((!locald.ASH) && (!NetworkUtil.isWifiAvailable()))
                {
                  XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "can not use cellular, skip " + localc.dVM());
                }
                else
                {
                  localObject1 = new g.b();
                  localObject2 = new g.c(this.ASW, localc, locald);
                  if (locald.isPatch)
                  {
                    i = 2;
                    XWalkLibraryLoader.WXFileDownloaderTask localWXFileDownloaderTask = new XWalkLibraryLoader.WXFileDownloaderTask(false, (XWalkLibraryLoader.DownloadListener)localObject2, locald.url, locald.path, i);
                    if ((!locald.ASI) || (!localWXFileDownloaderTask.isValid()))
                      break label848;
                    XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "use wx file downloader, plugin: " + localc.dVM() + "isPatch: " + locald.isPatch);
                    ((g.b)localObject1).fUH = localWXFileDownloaderTask;
                  }
                  for (((g.b)localObject1).type = 2; ; ((g.b)localObject1).type = 1)
                  {
                    localHashMap.put(localc.dVM(), localObject1);
                    break;
                    i = 1;
                    break label732;
                    XWalkInitializer.addXWalkInitializeLog("XWalkPluginUp", "use default file downloader, plugin: " + localc.dVM() + "isPatch: " + locald.isPatch);
                    ((g.b)localObject1).fUH = new XWalkLibraryLoader.HttpDownloadTask(false, (XWalkLibraryLoader.DownloadListener)localObject2, locald.url, locald.path);
                  }
                }
              }
            }
          }
        }
        if (localHashMap.size() == 0)
        {
          XWalkEnvironment.addXWalkInitializeLog("XWalkPluginUp", "no available update, no task");
          g.a(this.ASW, -8);
          AppMethodBeat.o(85422);
        }
        else
        {
          g.a(this.ASW, localHashMap);
          AppMethodBeat.o(85422);
        }
      }
    }
  }

  public final void b(com.tencent.xweb.xwalk.b.g.c paramc)
  {
    AppMethodBeat.i(85423);
    XWalkEnvironment.addXWalkInitializeLog("XWalkPluginUp", "plugin config download failed: " + paramc.ATL);
    f.dVo();
    g.a(this.ASW, -5);
    AppMethodBeat.o(85423);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.a.g.1
 * JD-Core Version:    0.6.2
 */