package com.tencent.mm.plugin.subapp.jdbiz;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.m.e;
import com.tencent.mm.model.at;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz;
import com.tencent.mm.pluginsdk.f.f;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Map;

public class c
  implements at, f.b
{
  private com.tencent.mm.sdk.b.c ecA;
  private a ssE;
  private b ssF;
  Map<String, Integer> ssG;

  public c()
  {
    AppMethodBeat.i(25204);
    this.ssE = null;
    this.ssF = null;
    this.ssG = new HashMap();
    this.ecA = new c.1(this);
    ab.i("MicroMsg.SubCoreJdIP6", "new SubCoreJDBiz this: " + hashCode() + " stack: " + bo.dpG());
    AppMethodBeat.o(25204);
  }

  public static void b(b paramb)
  {
    AppMethodBeat.i(25213);
    com.tencent.mm.kernel.g.RN().QU();
    c localc = cDr();
    if (localc.ssF == null)
      localc.ssF = b.cDj();
    ab.i("MicroMsg.SubCoreJdIP6", "updatejdMsgContent old: %s new: %s", new Object[] { localc.ssF.SY(), paramb.SY() });
    if (!paramb.a(localc.ssF))
    {
      ab.i("MicroMsg.SubCoreJdIP6", "fo zu baoyou! the activityid is same");
      AppMethodBeat.o(25213);
      return;
    }
    if ((!bo.isNullOrNil(paramb.ssu)) || (paramb.sst))
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(327939, "1");
    }
    if (paramb.sss)
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(327938, "1");
    }
    while (true)
    {
      localc.ssF = paramb;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(327942, paramb.cJh);
      localc.cDx();
      AppMethodBeat.o(25213);
      break;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(327938, "");
    }
  }

  public static c cDr()
  {
    AppMethodBeat.i(25205);
    c localc1 = (c)f.vdy;
    c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new c();
      f.vdy = localc2;
    }
    AppMethodBeat.o(25205);
    return localc2;
  }

  private void cDx()
  {
    AppMethodBeat.i(25214);
    new ak(Looper.getMainLooper()).post(new c.2(this));
    AppMethodBeat.o(25214);
  }

  public static boolean cDz()
  {
    AppMethodBeat.i(25217);
    String str1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigName");
    String str2 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigIconUrl");
    String str3 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigJumpUrl");
    boolean bool;
    if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)) && (!bo.isNullOrNil(str3)))
    {
      bool = true;
      AppMethodBeat.o(25217);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25217);
    }
  }

  public static String dn(String paramString, int paramInt)
  {
    AppMethodBeat.i(25216);
    String str = paramString;
    if (-1 == paramString.indexOf('#'))
      if (-1 != paramString.indexOf('?'))
        break label60;
    label60: for (str = paramString + "?wc_scene=" + paramInt; ; str = paramString + "&wc_scene=" + paramInt)
    {
      AppMethodBeat.o(25216);
      return str;
    }
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
    AppMethodBeat.i(25206);
    ab.i("MicroMsg.SubCoreJdIP6", "onAccountPostReset");
    if (this.ssE == null)
      this.ssE = new a();
    aw.getSysCmdMsgExtension().a("jd", this.ssE, true);
    com.tencent.mm.sdk.b.a.xxA.c(this.ecA);
    AppMethodBeat.o(25206);
  }

  public final String cDA()
  {
    int i = 1;
    AppMethodBeat.i(25218);
    String str1 = com.tencent.mm.m.g.Nu().getValue("JDEntranceConfigJumpUrl");
    if (bo.isNullOrNil(str1))
    {
      str1 = null;
      AppMethodBeat.o(25218);
      return str1;
    }
    b localb = cDw();
    int j;
    if (cDs())
      if ((!localb.bxX()) && ("3".equals(localb.ssq)) && (!bo.isNullOrNil(localb.jumpUrl)))
      {
        ab.i("MicroMsg.SubCoreJdIP6", "jumpUrl update %s", new Object[] { localb.jumpUrl });
        str1 = localb.jumpUrl;
        j = 6;
      }
    while (true)
    {
      label104: int k = j;
      String str2 = str1;
      if ("2".equals(localb.ssq))
      {
        k = j;
        str2 = str1;
        if (!bo.isNullOrNil(localb.jumpUrl))
        {
          if (localb.ssw >= System.currentTimeMillis() / 1000L)
            break label249;
          m = 1;
          label159: k = j;
          str2 = str1;
          if (m != 0)
            if ((localb.ssx == 0L) || (localb.ssx >= System.currentTimeMillis() / 1000L))
              break label255;
        }
      }
      label249: label255: for (int m = i; ; m = 0)
      {
        k = j;
        str2 = str1;
        if (m == 0)
        {
          str2 = localb.jumpUrl;
          k = 3;
        }
        str1 = dn(str2, k);
        AppMethodBeat.o(25218);
        break;
        if (!localb.sst)
          break label261;
        j = 2;
        break label104;
        m = 0;
        break label159;
      }
      label261: j = 1;
    }
  }

  public final boolean cDs()
  {
    AppMethodBeat.i(25208);
    aw.ZK();
    boolean bool = "1".equals((String)com.tencent.mm.model.c.Ry().get(327939, ""));
    AppMethodBeat.o(25208);
    return bool;
  }

  public final boolean cDt()
  {
    AppMethodBeat.i(25209);
    aw.ZK();
    boolean bool = "1".equals((String)com.tencent.mm.model.c.Ry().get(327938, ""));
    AppMethodBeat.o(25209);
    return bool;
  }

  public final void cDu()
  {
    AppMethodBeat.i(25210);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(327938, "");
    AppMethodBeat.o(25210);
  }

  public final void cDv()
  {
    AppMethodBeat.i(25211);
    aw.ZK();
    com.tencent.mm.model.c.Ry().set(327939, "");
    AppMethodBeat.o(25211);
  }

  public final b cDw()
  {
    AppMethodBeat.i(25212);
    if (this.ssF == null)
      this.ssF = b.cDj();
    b localb = this.ssF;
    AppMethodBeat.o(25212);
    return localb;
  }

  public final void cDy()
  {
    AppMethodBeat.i(25215);
    if ((aw.RK()) && ((cDr().cDs()) || (cDr().cDt())))
    {
      b localb = cDr().cDw();
      if (((!bo.isNullOrNil(localb.ssu)) || (localb.sst)) && (localb.bxX()))
      {
        ab.i("MicroMsg.SubCoreJdIP6", "clear red dot/friend dot");
        cDr().cDu();
        cDr().cDv();
        cDr().cDx();
      }
    }
    AppMethodBeat.o(25215);
  }

  public final void iy(int paramInt)
  {
  }

  public final void onAccountRelease()
  {
    AppMethodBeat.i(25207);
    ab.i("MicroMsg.SubCoreJdIP6", "onAccountRelease");
    if (this.ssE != null)
    {
      a locala = this.ssE;
      com.tencent.mm.sdk.b.a.xxA.d(locala.ssn);
      aw.getSysCmdMsgExtension().b("jd", this.ssE, true);
    }
    this.ssG.clear();
    this.ssE = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.ecA);
    AppMethodBeat.o(25207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.c
 * JD-Core Version:    0.6.2
 */