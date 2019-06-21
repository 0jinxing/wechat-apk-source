package com.tencent.mm.plugin.voip;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.d;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.an;
import com.tencent.mm.model.at;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.voip.model.o;
import com.tencent.mm.plugin.voip.model.r;
import com.tencent.mm.plugin.voip.video.a.c;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.view.raw.FilterRawGet;
import com.tencent.ytcommon.util.YTCommonInterface;
import java.util.HashMap;

public class b
  implements at
{
  private static int sNe;
  private r sMZ;
  private o sNa;
  private com.tencent.mm.plugin.voip.ui.d sNb;
  private d sNc;
  private b.a sNd;

  static
  {
    AppMethodBeat.i(4317);
    c.checkLibraryInit();
    sNe = 0;
    AppMethodBeat.o(4317);
  }

  public b()
  {
    AppMethodBeat.i(4311);
    this.sMZ = null;
    this.sNa = new o();
    this.sNc = new d();
    this.sNd = new b.a(this);
    AppMethodBeat.o(4311);
  }

  private static b cIi()
  {
    AppMethodBeat.i(4312);
    b localb = (b)q.Y(b.class);
    AppMethodBeat.o(4312);
    return localb;
  }

  public static r cIj()
  {
    AppMethodBeat.i(4313);
    if (!g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(4313);
      throw ((Throwable)localObject);
    }
    if (cIi().sMZ == null)
      cIi().sMZ = new r();
    Object localObject = cIi().sMZ;
    AppMethodBeat.o(4313);
    return localObject;
  }

  public static com.tencent.mm.plugin.voip.ui.d cIk()
  {
    AppMethodBeat.i(4314);
    if (!g.RK())
    {
      localObject = new com.tencent.mm.model.b();
      AppMethodBeat.o(4314);
      throw ((Throwable)localObject);
    }
    if (cIi().sNb == null)
      cIi().sNb = new com.tencent.mm.plugin.voip.ui.d();
    Object localObject = cIi().sNb;
    AppMethodBeat.o(4314);
    return localObject;
  }

  public static int cIl()
  {
    return sNe;
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return null;
  }

  public final void bA(boolean paramBoolean)
  {
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(4316);
    e.d.a(Integer.valueOf(50), this.sNa);
    cIj();
    com.tencent.mm.sdk.b.a.xxA.c(this.sNc);
    com.tencent.mm.sdk.b.a.xxA.c(this.sNd);
    ((com.tencent.mm.plugin.notification.b.a)g.M(com.tencent.mm.plugin.notification.b.a.class)).getNotification().cancel(40);
    paramBoolean = ((Boolean)g.RP().Ry().get(73217, Boolean.TRUE)).booleanValue();
    boolean bool1 = ((Boolean)g.RP().Ry().get(73218, Boolean.TRUE)).booleanValue();
    boolean bool2 = com.tencent.mm.m.a.MG();
    boolean bool3 = ((Boolean)g.RP().Ry().get(ac.a.xVc, Boolean.FALSE)).booleanValue();
    ab.i("MicroMsg.SubCoreVoip", "voipSound: %s, voipAudioSound: %s, msgSound: %s, hasReport: %s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3) });
    if (!bool3)
    {
      if ((!paramBoolean) && (!bool1))
        break label420;
      paramBoolean = true;
    }
    while (true)
    {
      label215: com.tencent.mm.bu.a locala;
      if (paramBoolean != bool2)
      {
        if ((paramBoolean) && (!bool2))
          h.pYm.a(500L, 13L, 1L, false);
      }
      else
      {
        g.RP().Ry().set(ac.a.xVc, Boolean.TRUE);
        au.kB(1);
        ab.i("MicroMsg.SubCoreVoip", "start init beauty download");
        locala = com.tencent.mm.bu.a.xtM;
        ab.i("MicroMsg.BeautyDownloadLogic", "init, downloadSoPath: %s, downloadResPath: %s", new Object[] { com.tencent.mm.bu.a.xtJ, com.tencent.mm.bu.a.xtK });
        com.tencent.mm.sdk.b.a.xxA.b(locala.fAP);
        b.c.dif();
        com.tencent.mm.pluginsdk.g.a.a.b.Ky(56);
        if (!com.tencent.mm.bu.a.agb())
          break label450;
        ab.i("MicroMsg.BeautyDownloadLogic", "init check local has resource");
        com.tencent.mm.bu.a.xtL = true;
        h.pYm.e(15861, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
        h.pYm.k(914L, 0L, 1L);
      }
      try
      {
        while (true)
        {
          int i = YTCommonInterface.initAuth(ah.getContext(), "rel_wechat.lic", 0, true);
          sNe = i;
          ab.i("MicroMsg.SubCoreVoip", "init VideoModule initAuth: %s", new Object[] { Integer.valueOf(i) });
          if (i != 0)
            h.pYm.k(914L, 12L, 1L);
          FilterRawGet.setGetInputStream(new b.2(this));
          AppMethodBeat.o(4316);
          return;
          label420: paramBoolean = false;
          break;
          if ((paramBoolean) || (!bool2))
            break label215;
          h.pYm.a(500L, 14L, 1L, false);
          break label215;
          label450: h.pYm.k(914L, 1L, 1L);
          b.c.dif();
          String str = com.tencent.mm.pluginsdk.g.a.a.b.gM(56, 1);
          if (com.tencent.mm.vfs.e.ct(str))
          {
            ab.i("MicroMsg.BeautyDownloadLogic", "init, cache file %s exist, try unzip", new Object[] { str });
            h.pYm.k(914L, 2L, 1L);
            locala.e(str, 56, 1, 1);
          }
          else
          {
            ab.i("MicroMsg.BeautyDownloadLogic", "init cannot find beauty resource");
            h.pYm.e(15861, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
          }
        }
      }
      catch (Throwable localThrowable)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.SubCoreVoip", localThrowable, "init youtu sdk failed: %s", new Object[] { localThrowable.getMessage() });
          sNe = -1;
          h.pYm.k(914L, 12L, 1L);
        }
      }
    }
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(4315);
    if (this.sNb != null)
      al.d(new b.1(this));
    e.d.b(Integer.valueOf(50), this.sNa);
    cIj();
    com.tencent.mm.sdk.b.a.xxA.d(this.sNc);
    com.tencent.mm.sdk.b.a.xxA.d(this.sNd);
    com.tencent.mm.bu.a locala = com.tencent.mm.bu.a.xtM;
    ab.i("MicroMsg.BeautyDownloadLogic", "unInit");
    com.tencent.mm.sdk.b.a.xxA.d(locala.fAP);
    AppMethodBeat.o(4315);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.b
 * JD-Core Version:    0.6.2
 */