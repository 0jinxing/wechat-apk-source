package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.o;
import com.tencent.mm.booter.p;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.xweb.WebView.d;
import junit.framework.Assert;

public class AppBrandProfile extends e
{
  protected static String bWa = "";

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15366);
    bWa = ah.getProcessName();
    ClassLoader localClassLoader = AppBrandProfile.class.getClassLoader();
    com.tencent.mm.f.a.bk(ah.getContext());
    l.a(new AppBrandProfile.1(this));
    Object localObject1 = new o(com.tencent.mm.booter.d.bo(this.app.getBaseContext()));
    bWa.replace(ah.getPackageName() + ":appbrand", "");
    ae.ghN = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.display_errcode"), false);
    ae.ghO = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.display_msgstate"), false);
    ae.ghP = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ae.ghQ = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.network.force_touch"), false);
    ae.ghR = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ae.ghS = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.crashIsExit"), false);
    ae.ghW = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.album_show_info"), false);
    ae.ghX = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.location_help"), false);
    ae.gia = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.force_soso"), false);
    ae.gib = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ae.gic = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ae.gid = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ae.gig = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.filterfpnp"), false);
    ae.gih = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bo.a(((o)localObject1).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ae.gie = i;
    if ((i != 4) && (ae.gie > 0))
    {
      com.tencent.mm.storage.ab.xIC = ae.gie;
      ab.e("MicroMsg.AppBDebugger", "cdn thread num " + ae.gie);
    }
    ae.gif = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    ae.gix = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.forcex5webview"), false);
    ae.giu = bo.bc(((o)localObject1).getString(".com.tencent.mm.debug.jsapi.permission"), "");
    ab.d("MicroMsg.AppBDebugger", "Test.jsapiPermission = " + ae.giu);
    try
    {
      i = Integer.decode(((o)localObject1).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.Lw(i);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("set up test protocal version = ");
      ((StringBuilder)localObject2).append(Integer.toHexString(i));
    }
    catch (Exception localException5)
    {
      try
      {
        localObject2 = ((o)localObject1).getString(".com.tencent.mm.debug.log.setapilevel");
        if (!bo.isNullOrNil((String)localObject2))
        {
          com.tencent.mm.protocal.d.eSg = "android-".concat(String.valueOf(localObject2));
          com.tencent.mm.protocal.d.vxk = "android-".concat(String.valueOf(localObject2));
          com.tencent.mm.protocal.d.vxm = String.valueOf(localObject2);
          b.amf((String)localObject2);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("set up test protocal apilevel = ");
          ((StringBuilder)localObject2).append(com.tencent.mm.protocal.d.eSg).append(" ").append(b.dnP());
        }
      }
      catch (Exception localException5)
      {
        try
        {
          i = Integer.decode(((o)localObject1).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("set up test protocal uin old: ");
          ((StringBuilder)localObject2).append(com.tencent.mm.protocal.d.vxn).append(" new: ").append(i);
          com.tencent.mm.protocal.d.vxn = i;
        }
        catch (Exception localException5)
        {
          try
          {
            i = Integer.decode(((o)localObject1).getString(".com.tencent.mm.debug.log.setchannel")).intValue();
            ((p)localObject1).ecL.ebO = i;
          }
          catch (Exception localException5)
          {
            try
            {
              while (true)
              {
                boolean bool1 = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.report.debugmodel"), false);
                boolean bool2 = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.report.kvstat"), false);
                boolean bool3 = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.report.clientpref"), false);
                boolean bool4 = bo.a(((o)localObject1).jF(".com.tencent.mm.debug.report.useraction"), false);
                com.tencent.mm.plugin.report.a.c.a(bool1, bool2, bool3, bool4);
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("try control report : debugModel[");
                ((StringBuilder)localObject1).append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
                d.aT(ah.getContext());
                l.cT(bWa);
                a.cP(bWa);
                k.a("wcdb", localClassLoader);
                k.a("commonimgdec", localClassLoader);
                k.a("wechatcommon", localClassLoader);
                k.a(com.tencent.mm.sdk.a.xxo, localClassLoader);
                k.a("FFmpeg", localClassLoader);
                k.a("wechatpack", localClassLoader);
                i = com.tencent.mm.compatible.e.m.Lw();
                if ((i & 0x400) == 0)
                  break label979;
                ab.i("MicroMsg.AppBrandProfile", "load wechatsight_v7a, core number: %d", new Object[] { Integer.valueOf(i >> 12) });
                k.a("wechatsight_v7a", localClassLoader);
                if (i >> 12 < 4)
                  break;
                com.tencent.mm.plugin.sight.base.b.qwW = 3;
                com.tencent.mm.plugin.sight.base.b.qwY = 3;
                com.tencent.mm.plugin.sight.base.b.qwZ = 544000;
                com.tencent.mm.f.a.bk(ah.getContext());
                q.Bz();
                MMActivity.initLanguage(this.app.getBaseContext());
                com.tencent.mm.plugin.appbrand.a.a.gQJ = bo.anU();
                com.tencent.mm.cj.c.a(WebView.d.ANb);
                com.tencent.mm.plugin.appbrand.a.a.gQK = bo.anU();
                com.tencent.mm.sdk.b.a.xxA.c(new m(42, 52));
                AppMethodBeat.o(15366);
                return;
                localException2 = localException2;
                ab.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException3 = localException3;
                ab.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException4 = localException4;
                ab.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                localException5 = localException5;
                ab.i("MicroMsg.AppBDebugger", "no debugger was got");
              }
            }
            catch (Exception localException1)
            {
              while (true)
              {
                ab.i("MicroMsg.AppBDebugger", "no debugger was got");
                continue;
                com.tencent.mm.plugin.sight.base.b.qwW = 1;
                com.tencent.mm.plugin.sight.base.b.qwY = 1;
                com.tencent.mm.plugin.sight.base.b.qwZ = 640000;
                continue;
                label979: ab.i("MicroMsg.AppBrandProfile", "load wechatsight");
                k.a("wechatsight", localClassLoader);
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

  public final void onTrimMemory(int paramInt)
  {
    AppMethodBeat.i(15367);
    super.onTrimMemory(paramInt);
    ab.v("MicroMsg.AppBrandProfile", "onTrimMemory(l : %d)", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(15367);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.AppBrandProfile
 * JD-Core Version:    0.6.2
 */