package com.tencent.xweb.xwalk.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.w;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;

final class f$1
  implements b
{
  public final void a(g.c paramc)
  {
    int i = 0;
    AppMethodBeat.i(85479);
    Object localObject = a.avv(paramc.mFilePath);
    if (localObject == null)
    {
      com.tencent.xweb.util.f.nI(35L);
      com.tencent.xweb.util.f.dVf();
      com.tencent.xweb.util.f.bX(15123, "0,190301," + paramc.ATL + "," + paramc.mNetWorkType + "," + paramc.mRetryTimes + "," + paramc.ATM + "," + paramc.mTotalSize);
      XWalkEnvironment.addXWalkInitializeLog("ConfigParser failed ");
      paramc = w.dUo();
      if (paramc != null)
        paramc.aMA();
      AppMethodBeat.o(85479);
    }
    while (true)
    {
      return;
      try
      {
        com.tencent.xweb.a.a(((a.a)localObject).ATe, ((a.a)localObject).ATc);
        XWalkEnvironment.addXWalkInitializeLog("doFetchUpdateConfigNew onTaskSucceed!!");
        com.tencent.xweb.util.f.nN(paramc.ATM);
        com.tencent.xweb.util.f.bX(15123, ((a.a)localObject).ATc + ",190301," + paramc.ATL + "," + paramc.mNetWorkType + "," + paramc.mRetryTimes + "," + paramc.ATM + "," + paramc.mTotalSize + "," + f.access$000());
        c.dVV();
        if (localObject != null)
        {
          Log.i("Scheduler", "onConfigDownLoaded get config ,config version is " + ((a.a)localObject).ATc);
          if ((XWalkEnvironment.isForbidDownloadCode()) && (!XWalkEnvironment.isInTestMode()))
            XWalkInitializer.addXWalkInitializeLog("it's gp version , dont down load any runtime version");
        }
        else
        {
          paramc = null;
          f.c(paramc);
          AppMethodBeat.o(85479);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          XWalkEnvironment.addXWalkInitializeLog("apply cmds failed , " + localException.getMessage());
          continue;
          c.a locala = c.dWd();
          if ((locala != null) && (locala.ATc != ((a.a)localObject).ATc))
          {
            paramc = new c.a();
            a.e locale = d.a((a.a)localObject);
            label512: int j;
            if ((locale != null) && (locale.ATn > XWalkEnvironment.getInstalledNewstVersion()))
            {
              XWalkInitializer.addXWalkInitializeLog("got matched version");
              paramc.ATc = ((a.a)localObject).ATc;
              paramc.ATb = locale.ATb;
              paramc.ATn = locale.ATn;
              paramc.ATw = locale.ATo.ATp;
              paramc.ATh = locale.ATh;
              paramc.bUseCdn = locale.bUseCdn;
              paramc.bTryUseSharedCore = locale.bTryUseSharedCore;
              localObject = d.a(locale);
              paramc.ATu = locale.ATg;
              if (localObject != null)
              {
                paramc.ATt = true;
                paramc.ATg = ((a.b)localObject).ATg;
                paramc.cdy = ((a.b)localObject).ATb;
                paramc.ATh = ((a.b)localObject).ATh;
                paramc.bUseCdn = ((a.b)localObject).bUseCdn;
                double d = Math.random();
                j = (int)(locale.ATl * d);
                paramc.ATv = (j * 60 * 1000 + System.currentTimeMillis());
                XWalkInitializer.addXWalkInitializeLog("schedul after " + j + " minute to update");
                label574: if (paramc == null)
                  continue;
                j = i;
                if (paramc.ATn == locala.ATn)
                {
                  j = i;
                  if (paramc.ATh == locala.ATh)
                  {
                    j = i;
                    if (paramc.bUseCdn == locala.bUseCdn)
                    {
                      j = i;
                      if (paramc.ATt == locala.ATt)
                      {
                        j = i;
                        if (c.iM(paramc.ATb, locala.ATb))
                        {
                          if (c.iM(paramc.ATu, locala.ATu))
                            break label710;
                          j = i;
                        }
                      }
                    }
                  }
                }
              }
            }
            else
            {
              while (true)
              {
                if (j == 0)
                  break label741;
                XWalkInitializer.addXWalkInitializeLog("got same version to scheduler, abandon it ");
                break;
                paramc.ATt = false;
                paramc.ATg = locale.ATg;
                break label512;
                paramc = null;
                break label574;
                label710: if (paramc.ATt)
                {
                  j = i;
                  if (!c.iM(paramc.cdy, locala.cdy));
                }
                else
                {
                  j = 1;
                }
              }
              label741: if (c.dVX())
                XWalkInitializer.addXWalkInitializeLog("got new scheduler replace current , version is " + paramc.ATn);
              c.a(paramc);
            }
          }
        }
      }
    }
  }

  public final void b(g.c paramc)
  {
    AppMethodBeat.i(85480);
    com.tencent.xweb.xwalk.b localb = w.dUo();
    if (localb != null)
      localb.aMA();
    com.tencent.xweb.util.f.nI(35L);
    com.tencent.xweb.util.f.dVf();
    com.tencent.xweb.util.f.bX(15123, "0,190301," + paramc.ATL + "," + paramc.mNetWorkType + "," + paramc.mRetryTimes + "," + paramc.ATM + "," + paramc.mTotalSize + "," + f.access$000());
    XWalkEnvironment.addXWalkInitializeLog("get config onTaskFailed ");
    AppMethodBeat.o(85480);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.f.1
 * JD-Core Version:    0.6.2
 */