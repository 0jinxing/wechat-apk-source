package com.tencent.mm.app;

import android.app.Application;
import android.content.res.Configuration;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.booter.r;
import com.tencent.mm.compatible.loader.e;
import com.tencent.mm.f.a;
import com.tencent.mm.plugin.report.a.c;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class PatchProfile extends e
{
  public static final String ceo;

  static
  {
    AppMethodBeat.i(15391);
    ceo = ah.getPackageName() + ":patch";
    AppMethodBeat.o(15391);
  }

  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
  }

  public final void onCreate()
  {
    AppMethodBeat.i(15390);
    long l = System.currentTimeMillis();
    Object localObject1 = new r(com.tencent.mm.booter.d.bo(this.app.getBaseContext()));
    ((r)localObject1).jE("PATCH");
    try
    {
      i = Integer.decode(((r)localObject1).getString(".com.tencent.mm.debug.log.setversion")).intValue();
      com.tencent.mm.protocal.d.Lw(i);
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("set up test protocal version = ");
      ((StringBuilder)localObject2).append(Integer.toHexString(i));
    }
    catch (Exception localException4)
    {
      try
      {
        localObject2 = ((r)localObject1).getString(".com.tencent.mm.debug.log.setapilevel");
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
      catch (Exception localException4)
      {
        try
        {
          int i = Integer.decode(((r)localObject1).getString(".com.tencent.mm.debug.log.setuin")).intValue();
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("set up test protocal uin old: ");
          ((StringBuilder)localObject2).append(com.tencent.mm.protocal.d.vxn).append(" new: ").append(i);
          com.tencent.mm.protocal.d.vxn = i;
        }
        catch (Exception localException4)
        {
          try
          {
            while (true)
            {
              boolean bool1 = bo.a(((r)localObject1).jF(".com.tencent.mm.debug.report.debugmodel"), false);
              boolean bool2 = bo.a(((r)localObject1).jF(".com.tencent.mm.debug.report.kvstat"), false);
              boolean bool3 = bo.a(((r)localObject1).jF(".com.tencent.mm.debug.report.clientpref"), false);
              boolean bool4 = bo.a(((r)localObject1).jF(".com.tencent.mm.debug.report.useraction"), false);
              c.a(bool1, bool2, bool3, bool4);
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("try control report : debugModel[");
              ((StringBuilder)localObject1).append(bool1).append("],kv[").append(bool2).append("], clientPref[").append(bool3).append("], useraction[").append(bool4).append("]");
              a.bk(ah.getContext());
              l.cT(ceo);
              q.Bz();
              ab.i("MicroMsg.PatchProfile", "patchsprofile try to init hotpatch plugin");
              ab.i("MicroMsg.PatchProfile", "start time check patchsprofile use time = " + (System.currentTimeMillis() - l));
              AppMethodBeat.o(15390);
              return;
              localException2 = localException2;
              ab.i("MicroMsg.PatchDebugger", "no debugger was got");
              continue;
              localException3 = localException3;
              ab.i("MicroMsg.PatchDebugger", "no debugger was got");
              continue;
              localException4 = localException4;
              ab.i("MicroMsg.PatchDebugger", "no debugger was got");
            }
          }
          catch (Exception localException1)
          {
            while (true)
              ab.i("MicroMsg.PatchDebugger", "no debugger was got");
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.PatchProfile
 * JD-Core Version:    0.6.2
 */