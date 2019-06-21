package com.tencent.mm.plugin.ext;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.g.a.fb;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bw;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.i.a;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.ca;
import com.tencent.mm.storage.z;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import junit.framework.Assert;

public class b
  implements at
{
  private static HashMap<Integer, h.d> eaA;
  private static boolean lPw;
  private final long lPg;
  private z lPh;
  private bp lPi;
  private ca lPj;
  private b.a lPk;
  private b.b lPl;
  private HashMap<String, Integer> lPm;
  private h.a lPn;
  i.a lPo;
  private ak lPp;
  private LinkedList<String> lPq;
  private final long lPr;
  private ak lPs;
  private k.a lPt;
  private boolean lPu;
  private boolean lPv;
  n.b luz;

  static
  {
    AppMethodBeat.i(20290);
    int i = m.Lw();
    try
    {
      if (!Build.CPU_ABI.contains("armeabi"))
        ab.e("hakon SilkCodec", "x86 machines not supported.");
      while (true)
      {
        HashMap localHashMap = new HashMap();
        eaA = localHashMap;
        localHashMap.put(Integer.valueOf("OPENMSGLISTENER_TABLE".hashCode()), new b.1());
        eaA.put(Integer.valueOf("USEROPENIDINAPP_TABLE".hashCode()), new b.3());
        lPw = false;
        AppMethodBeat.o(20290);
        return;
        if ((i & 0x400) == 0)
          break;
        k.a("wechatvoicesilk_v7a", b.class.getClassLoader());
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("hakon SilkCodec", "load library failed!");
        continue;
        if ((i & 0x200) != 0)
        {
          k.a("wechatvoicesilk", b.class.getClassLoader());
          Assert.assertTrue("Can't remove libwechatvoicesilk.so yet.", false);
        }
        else
        {
          ab.e("hakon SilkCodec", "load library failed! silk don't support armv5!!!!");
        }
      }
    }
  }

  public b()
  {
    AppMethodBeat.i(20274);
    this.lPg = 1600L;
    this.lPm = new HashMap();
    this.lPn = new b.5(this);
    this.lPo = new b.6(this);
    this.lPp = new b.7(this, Looper.getMainLooper());
    this.lPq = new LinkedList();
    this.lPr = 60L;
    this.lPs = new b.8(this, Looper.getMainLooper());
    this.lPt = new b.9(this);
    this.luz = new b.10(this);
    this.lPu = true;
    this.lPv = false;
    AppMethodBeat.o(20274);
  }

  public static bp brA()
  {
    AppMethodBeat.i(20277);
    g.RN().QU();
    if (bry().lPi == null)
    {
      localObject = bry();
      aw.ZK();
      ((b)localObject).lPi = new bp(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bry().lPi;
    AppMethodBeat.o(20277);
    return localObject;
  }

  public static ca brB()
  {
    AppMethodBeat.i(20278);
    g.RN().QU();
    if (bry().lPj == null)
    {
      localObject = bry();
      aw.ZK();
      ((b)localObject).lPj = new ca(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bry().lPj;
    AppMethodBeat.o(20278);
    return localObject;
  }

  private static void brC()
  {
    AppMethodBeat.i(20280);
    File localFile = new File(g.RP().eJM);
    if (!localFile.exists())
      localFile.mkdirs();
    localFile = new File(g.RP().eJM + "image/ext/pcm");
    if (!localFile.exists())
      localFile.mkdirs();
    ab.i("MicroMsg.SubCoreExt", "summerpcm accPath[%s] [%s]", new Object[] { g.RP().eJM, bo.dpG() });
    AppMethodBeat.o(20280);
  }

  public static String brD()
  {
    AppMethodBeat.i(20283);
    String str = g.RP().eJM + "image/ext/pcm";
    AppMethodBeat.o(20283);
    return str;
  }

  public static void brE()
  {
    AppMethodBeat.i(20284);
    Object localObject = (String)brz().get(ac.a.xOC, null);
    ab.i("MicroMsg.SubCoreExt", "sendSportBroadcast pkgNames = ".concat(String.valueOf(localObject)));
    if (localObject != null)
      for (String str : ((String)localObject).split(";"))
      {
        Intent localIntent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP");
        localIntent.setPackage(str);
        com.tencent.mm.compatible.a.a.a(12, new b.4(localIntent));
        localIntent.putExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE", "SPORT_MESSAGE");
        ah.getContext().sendBroadcast(localIntent);
      }
    AppMethodBeat.o(20284);
  }

  public static b bry()
  {
    AppMethodBeat.i(20275);
    aw.ZE();
    b localb1 = (b)bw.oJ("plugin.ext");
    b localb2 = localb1;
    if (localb1 == null)
    {
      localb2 = new b();
      aw.ZE().a("plugin.ext", localb2);
    }
    AppMethodBeat.o(20275);
    return localb2;
  }

  public static z brz()
  {
    AppMethodBeat.i(20276);
    g.RN().QU();
    if (bry().lPh == null)
    {
      localObject = bry();
      aw.ZK();
      ((b)localObject).lPh = new z(com.tencent.mm.model.c.Ru());
    }
    Object localObject = bry().lPh;
    AppMethodBeat.o(20276);
    return localObject;
  }

  private void gT(boolean paramBoolean)
  {
    AppMethodBeat.i(20288);
    if (!this.lPu)
      AppMethodBeat.o(20288);
    while (true)
    {
      return;
      if ((paramBoolean) && (this.lPv))
      {
        ab.i("MicroMsg.SubCoreExt", "fromStartApp and already try to init");
        AppMethodBeat.o(20288);
      }
      else if ((!paramBoolean) && (!lPw))
      {
        AppMethodBeat.o(20288);
      }
      else
      {
        ab.i("MicroMsg.SubCoreExt", "initLocalVoiceControl,fromStartApp:%s,hasTryToInit:%s,hasCallApi:%s", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.lPv), Boolean.valueOf(lPw) });
        this.lPu = false;
        aw.RS().m(new b.2(this), 10000L);
        AppMethodBeat.o(20288);
      }
    }
  }

  public static ad ig(long paramLong)
  {
    AppMethodBeat.i(20285);
    ad localad;
    if ((aw.RK()) && (paramLong > 0L))
    {
      aw.ZK();
      localad = com.tencent.mm.model.c.XM().mQ(paramLong);
      AppMethodBeat.o(20285);
    }
    while (true)
    {
      return localad;
      localad = null;
      AppMethodBeat.o(20285);
    }
  }

  public static void ih(long paramLong)
  {
    AppMethodBeat.i(20286);
    if (paramLong <= 0L)
      AppMethodBeat.o(20286);
    while (true)
    {
      return;
      try
      {
        aw.ZK();
        if (!com.tencent.mm.model.c.XO().ji(paramLong))
          break label105;
        aw.ZK();
        h localh = com.tencent.mm.model.c.XO();
        aw.ZK();
        localh.aa(com.tencent.mm.model.c.XO().jf(paramLong));
        AppMethodBeat.o(20286);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.SubCoreExt", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.SubCoreExt", localException, "", new Object[0]);
        AppMethodBeat.o(20286);
      }
      continue;
      label105: ab.e("MicroMsg.SubCoreExt", "msgId is out of range, ".concat(String.valueOf(paramLong)));
      AppMethodBeat.o(20286);
    }
  }

  public final HashMap<Integer, h.d> Jx()
  {
    return eaA;
  }

  public final void bA(boolean paramBoolean)
  {
    AppMethodBeat.i(20279);
    brC();
    AppMethodBeat.o(20279);
  }

  public final void brF()
  {
    AppMethodBeat.i(20287);
    this.lPp.removeMessages(0);
    this.lPp.sendEmptyMessageDelayed(0, 1600L);
    AppMethodBeat.o(20287);
  }

  public final void bz(boolean paramBoolean)
  {
    AppMethodBeat.i(20281);
    Object localObject = new fb();
    ((fb)localObject).cyt.op = 1;
    if (!com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject))
      ab.e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountPostReset");
    com.tencent.mm.pluginsdk.model.i.dgZ().dha();
    aw.ZK();
    com.tencent.mm.model.c.XO().a(this.lPn, null);
    if (this.lPk == null)
      this.lPk = new b.a();
    com.tencent.mm.sdk.b.a.xxA.c(this.lPk);
    if (this.lPl == null)
      this.lPl = new b.b();
    com.tencent.mm.sdk.b.a.xxA.c(this.lPl);
    localObject = am.bYJ();
    if (localObject != null)
      ((com.tencent.mm.pluginsdk.model.app.i)localObject).c(this.lPt);
    localObject = ah.doB();
    this.lPv = ((SharedPreferences)localObject).getBoolean("hasTryToInitVoiceControlData", false);
    lPw = ((SharedPreferences)localObject).getBoolean("hasCallVoiceControlApi", false);
    ab.i("MicroMsg.SubCoreExt", "onAccountPostReset,hasTryToInit:%s,hasCallApi:%s", new Object[] { Boolean.valueOf(this.lPv), Boolean.valueOf(lPw) });
    aw.ZK();
    com.tencent.mm.model.c.XM().a(this.luz);
    gT(true);
    com.tencent.mm.plugin.ext.c.c.brT();
    brC();
    AppMethodBeat.o(20281);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(20282);
    if (this.lPk != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.lPk);
    if (this.lPl != null)
      com.tencent.mm.sdk.b.a.xxA.d(this.lPl);
    Object localObject = am.bYJ();
    if (localObject != null)
      ((com.tencent.mm.pluginsdk.model.app.i)localObject).d(this.lPt);
    aw.ZK();
    com.tencent.mm.model.c.XO().a(this.lPn);
    localObject = new fb();
    ((fb)localObject).cyt.op = 2;
    if (!com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject))
      ab.e("MicroMsg.SubCoreExt", "ExtAgentLifeEvent event fail in onAccountRelease");
    localObject = com.tencent.mm.pluginsdk.model.i.dgZ();
    if (aw.RK())
    {
      com.tencent.mm.pluginsdk.model.i.vbc = false;
      am.bYM().b(14, (t)localObject);
    }
    aw.ZK();
    com.tencent.mm.model.c.XM().b(this.luz);
    com.tencent.mm.plugin.ext.c.c.brU();
    AppMethodBeat.o(20282);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.b
 * JD-Core Version:    0.6.2
 */