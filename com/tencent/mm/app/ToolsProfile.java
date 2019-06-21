package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.mars.app.AppLogic;
import com.tencent.mars.mm.AppCallBack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.p;
import com.tencent.mm.booter.u;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.g.a.vz;
import com.tencent.mm.kernel.b.h;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.tinker.entry.ApplicationLike;
import com.tencent.xweb.WebView.c;
import java.util.Locale;
import junit.framework.Assert;
import org.xwalk.core.XWalkEnvironment;

public final class ToolsProfile extends com.tencent.mm.compatible.loader.e
{
  private static final String TAG;
  public static final String ceo;
  private static Locale locale;
  private final ap cfq;
  private int cfr;

  static
  {
    AppMethodBeat.i(15423);
    ceo = ah.getProcessName();
    TAG = "MicroMsg." + com.tencent.mm.cj.a.dOY() + "Profile";
    AppMethodBeat.o(15423);
  }

  public ToolsProfile()
  {
    AppMethodBeat.i(15420);
    this.cfq = new ap(new ToolsProfile.3(this), true);
    this.cfr = 0;
    AppMethodBeat.o(15420);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(15422);
    paramConfiguration = MMActivity.initLanguage(this.app.getBaseContext());
    ab.d(TAG, "onConfigurationChanged, locale = " + locale.toString() + ", n = " + paramConfiguration.toString());
    if (!paramConfiguration.equals(locale))
    {
      ab.w(TAG, "language changed, restart process");
      System.exit(-1);
    }
    AppMethodBeat.o(15422);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15421);
    long l = System.currentTimeMillis();
    Object localObject1 = ToolsProfile.class.getClassLoader();
    com.tencent.mm.f.a.bk(ah.getContext());
    l.a(new ToolsProfile.1(this));
    l.cT(ceo);
    AppLogic.setCallBack(new AppCallBack(ah.getContext()));
    u localu = new u(com.tencent.mm.booter.d.bo(this.app.getBaseContext()));
    localu.jE("TOOL");
    ae.ghN = bo.a(localu.jF(".com.tencent.mm.debug.test.display_errcode"), false);
    ae.ghO = bo.a(localu.jF(".com.tencent.mm.debug.test.display_msgstate"), false);
    ae.ghP = bo.a(localu.jF(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ae.ghQ = bo.a(localu.jF(".com.tencent.mm.debug.test.network.force_touch"), false);
    ae.ghR = bo.a(localu.jF(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ae.ghS = bo.a(localu.jF(".com.tencent.mm.debug.test.crashIsExit"), false);
    ae.ghW = bo.a(localu.jF(".com.tencent.mm.debug.test.album_show_info"), false);
    ae.ghX = bo.a(localu.jF(".com.tencent.mm.debug.test.location_help"), false);
    ae.gia = bo.a(localu.jF(".com.tencent.mm.debug.test.force_soso"), false);
    ae.gib = bo.a(localu.jF(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ae.gic = bo.a(localu.jF(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ae.gid = bo.a(localu.jF(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ae.gig = bo.a(localu.jF(".com.tencent.mm.debug.test.filterfpnp"), false);
    ae.gih = bo.a(localu.jF(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bo.a(localu.getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ae.gie = i;
    if ((i != 4) && (ae.gie > 0))
    {
      com.tencent.mm.storage.ab.xIC = ae.gie;
      ab.e("MicroMsg.ToolDebugger", "cdn thread num " + ae.gie);
    }
    ae.gif = bo.a(localu.jF(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      i = Integer.decode(localu.getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.Lw(i);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("set up test protocal version = ");
      ((StringBuilder)localObject2).append(Integer.toHexString(i));
    }
    catch (Exception localException4)
    {
      try
      {
        localObject2 = localu.getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bo.isNullOrNil((String)localObject2))
        {
          com.tencent.mm.protocal.d.eSg = "android-".concat(String.valueOf(localObject2));
          com.tencent.mm.protocal.d.vxk = "android-".concat(String.valueOf(localObject2));
          com.tencent.mm.protocal.d.vxm = String.valueOf(localObject2);
          com.tencent.mm.sdk.a.b.amf((String)localObject2);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("set up test protocal apilevel = ");
          ((StringBuilder)localObject2).append(com.tencent.mm.protocal.d.eSg).append(" ").append(com.tencent.mm.sdk.a.b.dnP());
        }
      }
      catch (Exception localException4)
      {
        try
        {
          i = Integer.decode(localu.getString(".com.tencent.mm.debug.log.setuin")).intValue();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("set up test protocal uin old: ");
          ((StringBuilder)localObject2).append(com.tencent.mm.protocal.d.vxn).append(" new: ").append(i);
          com.tencent.mm.protocal.d.vxn = i;
        }
        catch (Exception localException4)
        {
          try
          {
            i = Integer.decode(localu.getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            localu.ecL.ebO = i;
          }
          catch (Exception localException4)
          {
            try
            {
              while (true)
              {
                boolean bool1 = bo.a(localu.jF(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bo.a(localu.jF(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bo.a(localu.jF(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bo.a(localu.jF(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                Object localObject2 = new java/lang/StringBuilder;
                ((StringBuilder)localObject2).<init>("try control report : debugModel[");
                ((StringBuilder)localObject2).append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                ae.giu = bo.bc(localu.getString(".com.tencent.mm.debug.jsapi.permission"), "");
                ab.d("MicroMsg.ToolDebugger", "Test.jsapiPermission = " + ae.giu);
                ae.giv = bo.bc(localu.getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
                ab.d("MicroMsg.ToolDebugger", "Test.generalCtrl = " + ae.giv);
                ae.giw = bo.a(localu.jF(".com.tencent.mm.debug.skiploadurlcheck"), false);
                ab.d("MicroMsg.ToolDebugger", "Test.skipLoadUrlCheck = " + ae.giw);
                ae.gix = bo.a(localu.jF(".com.tencent.mm.debug.forcex5webview"), false);
                ab.d("MicroMsg.ToolDebugger", "Test.forceX5WebView = " + ae.gix);
                d.aT(((h)com.tencent.mm.kernel.g.RM().Rn()).cc);
                a.cP(ceo);
                k.a("wcdb", (ClassLoader)localObject1);
                k.a("commonimgdec", (ClassLoader)localObject1);
                k.a("wechatcommon", (ClassLoader)localObject1);
                k.a(com.tencent.mm.sdk.a.xxo, (ClassLoader)localObject1);
                k.a("FFmpeg", (ClassLoader)localObject1);
                k.a("wechatpack", (ClassLoader)localObject1);
                i = com.tencent.mm.compatible.e.m.Lw();
                if ((i & 0x400) == 0)
                  break label1229;
                ab.i(TAG, "load wechatsight_v7a, core number: %d ", new Object[] { Integer.valueOf(i >> 12) });
                k.a("wechatsight_v7a", (ClassLoader)localObject1);
                if (i >> 12 < 4)
                  break;
                com.tencent.mm.plugin.sight.base.b.qwW = 3;
                com.tencent.mm.plugin.sight.base.b.qwY = 3;
                com.tencent.mm.plugin.sight.base.b.qwZ = 544000;
                SightVideoJNI.registerALL();
                locale = MMActivity.initLanguage(this.app.getBaseContext());
                q.Bz();
                if ((com.tencent.mm.compatible.util.d.iW(14)) && (b.cdV != null))
                  b.cdV.getApplication().registerActivityLifecycleCallbacks(new ToolsProfile.4(this));
                ab.i(TAG, "start time check toolsprofile use time = " + (System.currentTimeMillis() - l));
                v.a.fH(ah.getContext());
                com.tencent.mm.pluginsdk.ui.e.b.a.vrC = com.tencent.mm.app.plugin.e.Cl();
                localObject1 = new WebView.c()
                {
                  public final void BH()
                  {
                    AppMethodBeat.i(15407);
                    ab.i(ToolsProfile.TAG, "onCoreInitFailed");
                    vz localvz = new vz();
                    localvz.cTk.success = false;
                    com.tencent.mm.sdk.b.a.xxA.m(localvz);
                    AppMethodBeat.o(15407);
                  }

                  public final void onCoreInitFinished()
                  {
                    AppMethodBeat.i(15406);
                    ab.i(ToolsProfile.TAG, "onCoreInitFinished");
                    vz localvz = new vz();
                    localvz.cTk.success = true;
                    com.tencent.mm.sdk.b.a.xxA.m(localvz);
                    AppMethodBeat.o(15406);
                  }
                };
                com.tencent.mm.cj.c.a(MMWebView.zNq, (WebView.c)localObject1);
                com.tencent.xweb.b.d.a(com.tencent.mm.plugin.cdndownloader.i.a.bfd());
                XWalkEnvironment.setIsForbidDownloadCode(com.tencent.mm.sdk.platformtools.g.dnY());
                com.tencent.mm.sdk.b.a.xxA.c(new m(22, 32));
                v.a.dho();
                AppMethodBeat.o(15421);
                return;
                localException1 = localException1;
                ab.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                localException2 = localException2;
                ab.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                ab.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                ab.i("MicroMsg.ToolDebugger", "no debugger was got");
              }
            }
            catch (Exception localException5)
            {
              while (true)
              {
                ab.i("MicroMsg.ToolDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.qwW = 1;
                com.tencent.mm.plugin.sight.base.b.qwY = 1;
                com.tencent.mm.plugin.sight.base.b.qwZ = 640000;
                continue;
                label1229: ab.i(TAG, "load wechatsight");
                k.a("wechatsight", (ClassLoader)localObject1);
                Assert.assertTrue("Can't remove libwechatsight.so yet.", false);
                com.tencent.mm.plugin.sight.base.b.qwW = 1;
                com.tencent.mm.plugin.sight.base.b.qwY = 1;
                com.tencent.mm.plugin.sight.base.b.qwZ = 640000;
              }
            }
          }
        }
      }
    }
  }

  public final String toString()
  {
    return ceo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ToolsProfile
 * JD-Core Version:    0.6.2
 */