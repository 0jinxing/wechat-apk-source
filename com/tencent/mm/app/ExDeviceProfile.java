package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.f.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.a.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public class ExDeviceProfile extends e
{
  public static final String ceo;

  static
  {
    AppMethodBeat.i(15379);
    ceo = ah.getPackageName() + ":exdevice";
    AppMethodBeat.o(15379);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(15378);
    ab.d("MicroMsg.ExDeviceProfile", "onConfigurationChanged:" + toString());
    AppMethodBeat.o(15378);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15377);
    ab.i("MicroMsg.ExDeviceProfile", "exdevice profile oncreate");
    Object localObject1 = com.tencent.mm.booter.d.bo(this.app.getBaseContext());
    a.bk(ah.getContext());
    l.cT(ceo);
    localObject1 = new com.tencent.mm.booter.q((com.tencent.mm.booter.d)localObject1);
    ((com.tencent.mm.booter.q)localObject1).jE("EXDEVICE");
    ae.ghN = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.display_errcode"), false);
    ae.ghO = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.display_msgstate"), false);
    ae.ghP = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.network.simulate_fault"), false);
    ae.ghQ = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.network.force_touch"), false);
    ae.ghR = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.outputToSdCardlog"), false);
    ae.ghS = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.crashIsExit"), false);
    ae.ghW = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.album_show_info"), false);
    ae.ghX = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.location_help"), false);
    ae.gia = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.force_soso"), false);
    ae.gib = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.simulatePostServerError"), false);
    ae.gic = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.simulateUploadServerError"), false);
    ae.gid = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.snsNotwirteThumb"), false);
    ae.gig = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.filterfpnp"), false);
    ae.gih = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.testForPull"), false);
    int i = bo.a(((com.tencent.mm.booter.q)localObject1).getInteger(".com.tencent.mm.debug.test.cdnDownloadThread"), 0);
    ae.gie = i;
    if ((i != 4) && (ae.gie > 0))
    {
      com.tencent.mm.storage.ab.xIC = ae.gie;
      ab.e("MicroMsg.ExdDebugger", "cdn thread num " + ae.gie);
    }
    ae.gif = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.test.logShowSnsItemXml"), false);
    try
    {
      i = Integer.decode(((com.tencent.mm.booter.q)localObject1).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.Lw(i);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("set up test protocal version = ");
      ((StringBuilder)localObject2).append(Integer.toHexString(i));
    }
    catch (Exception localException3)
    {
      try
      {
        localObject2 = ((com.tencent.mm.booter.q)localObject1).getString(".com.tencent.mm.debug.log.setapilevel");
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
      catch (Exception localException3)
      {
        try
        {
          i = Integer.decode(((com.tencent.mm.booter.q)localObject1).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("set up test protocal uin old: ");
          ((StringBuilder)localObject2).append(com.tencent.mm.protocal.d.vxn).append(" new: ").append(i);
          com.tencent.mm.protocal.d.vxn = i;
        }
        catch (Exception localException3)
        {
          try
          {
            while (true)
            {
              boolean bool1 = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.report.debugmodel"), false);
              boolean bool2 = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.report.kvstat"), false);
              boolean bool3 = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.report.clientpref"), false);
              boolean bool4 = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.report.useraction"), false);
              c.a(bool1, bool2, bool3, bool4);
              Object localObject2 = new java/lang/StringBuilder;
              ((StringBuilder)localObject2).<init>("try control report : debugModel[");
              ((StringBuilder)localObject2).append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
              ae.giu = bo.bc(((com.tencent.mm.booter.q)localObject1).getString(".com.tencent.mm.debug.jsapi.permission"), "");
              ab.d("MicroMsg.ExdDebugger", "Test.jsapiPermission = " + ae.giu);
              ae.giv = bo.bc(((com.tencent.mm.booter.q)localObject1).getString(".com.tencent.mm.debug.generalcontrol.permission"), "");
              ab.d("MicroMsg.ExdDebugger", "Test.generalCtrl = " + ae.giv);
              ae.giw = bo.a(((com.tencent.mm.booter.q)localObject1).jF(".com.tencent.mm.debug.skiploadurlcheck"), false);
              ab.d("MicroMsg.ExdDebugger", "Test.skipLoadUrlCheck = " + ae.giw);
              q.Bz();
              AppMethodBeat.o(15377);
              return;
              localException1 = localException1;
              ab.i("MicroMsg.ExdDebugger", "no debugger was got");
              continue;
              localException2 = localException2;
              ab.i("MicroMsg.ExdDebugger", "no debugger was got");
              continue;
              localException3 = localException3;
              ab.i("MicroMsg.ExdDebugger", "no debugger was got");
            }
          }
          catch (Exception localException4)
          {
            while (true)
              ab.i("MicroMsg.ExdDebugger", "no debugger was got");
          }
        }
      }
    }
  }

  public String toString()
  {
    return ceo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ExDeviceProfile
 * JD-Core Version:    0.6.2
 */