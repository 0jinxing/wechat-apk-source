package com.tencent.mm.plugin.subapp.jdbiz;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.f.f.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class b
  implements f.a
{
  public String cJh = "";
  public long fRS = 0L;
  public String iconUrl = "";
  public String jumpUrl = "";
  public String ssA = "";
  public String ssB = "";
  public String ssC = "";
  public String ssD = "";
  public String ssq = "";
  public String ssr = "";
  public boolean sss = false;
  public boolean sst = false;
  public String ssu = "";
  public String ssv = "";
  public long ssw;
  public long ssx;
  public long ssy;
  public long ssz;
  public long startTime;
  public String title = "";

  private void af(Map<String, String> paramMap)
  {
    AppMethodBeat.i(25194);
    if (paramMap == null)
      AppMethodBeat.o(25194);
    while (true)
    {
      return;
      this.ssq = bo.bc((String)paramMap.get(".sysmsg.biztype"), "");
      this.ssA = bo.bc((String)paramMap.get(".sysmsg.alert"), "");
      this.ssr = bo.bc((String)paramMap.get(".sysmsg.activityid"), "");
      this.startTime = bo.anl((String)paramMap.get(".sysmsg.starttime"));
      this.fRS = bo.anl((String)paramMap.get(".sysmsg.expiretime"));
      this.title = bo.bc((String)paramMap.get(".sysmsg.content.title"), "");
      this.iconUrl = bo.bc((String)paramMap.get(".sysmsg.content.icon"), "");
      this.jumpUrl = bo.bc((String)paramMap.get(".sysmsg.content.jumpurl"), "");
      this.ssw = bo.anl((String)paramMap.get(".sysmsg.content.urlstarttime"));
      this.ssx = bo.anl((String)paramMap.get(".sysmsg.content.urlexpiretime"));
      this.ssu = bo.bc((String)paramMap.get(".sysmsg.content.jdcelltitle"), "");
      this.ssv = bo.bc((String)paramMap.get(".sysmsg.content.jdcellicon"), "");
      this.ssy = bo.anl((String)paramMap.get(".sysmsg.content.titlestarttime"));
      this.ssz = bo.anl((String)paramMap.get(".sysmsg.content.titleexpiretime"));
      this.sss = "1".equals(paramMap.get(".sysmsg.content.findshowreddot"));
      this.sst = "1".equals(paramMap.get(".sysmsg.content.jdcellshowred"));
      this.ssB = bo.bc((String)paramMap.get(".sysmsg.content.alertviewtitle"), "");
      this.ssC = bo.bc((String)paramMap.get(".sysmsg.content.alertviewconfirm"), "");
      this.ssD = bo.bc((String)paramMap.get(".sysmsg.content.alertviewcancel"), "");
      AppMethodBeat.o(25194);
    }
  }

  public static b cDj()
  {
    AppMethodBeat.i(25192);
    aw.ZK();
    String str = (String)c.Ry().get(327942, "");
    b localb = new b();
    ab.i("MicroMsg.JdMsgContent", " create xml : ".concat(String.valueOf(str)));
    localb.YH(str);
    AppMethodBeat.o(25192);
    return localb;
  }

  private void init()
  {
    this.ssq = "";
    this.ssr = "";
    this.fRS = 0L;
    this.ssu = "";
    this.sss = false;
    this.sst = false;
    this.ssB = "";
    this.ssC = "";
    this.ssD = "";
    this.ssA = "";
    this.jumpUrl = "";
    this.cJh = "";
  }

  public final String SY()
  {
    AppMethodBeat.i(25200);
    String str = bo.bc(this.cJh, "");
    AppMethodBeat.o(25200);
    return str;
  }

  public final void YH(String paramString)
  {
    AppMethodBeat.i(25193);
    init();
    this.cJh = paramString;
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(25193);
    while (true)
    {
      return;
      ab.i("MicroMsg.JdMsgContent", "feed xml %s", new Object[] { paramString });
      af(br.z(paramString, "sysmsg"));
      AppMethodBeat.o(25193);
    }
  }

  public final boolean a(b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(25199);
    if (paramb == null)
      AppMethodBeat.o(25199);
    while (true)
    {
      return bool;
      if (!bo.bc(this.ssr, "").equals(bo.bc(paramb.ssr, "")))
      {
        AppMethodBeat.o(25199);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(25199);
      }
    }
  }

  public final boolean bxX()
  {
    AppMethodBeat.i(25196);
    boolean bool;
    if ((this.fRS != 0L) && (this.fRS < System.currentTimeMillis() / 1000L))
    {
      bool = true;
      AppMethodBeat.o(25196);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25196);
    }
  }

  public final boolean cDk()
  {
    AppMethodBeat.i(25197);
    boolean bool;
    if (this.ssy < System.currentTimeMillis() / 1000L)
    {
      bool = true;
      AppMethodBeat.o(25197);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25197);
    }
  }

  public final boolean cDl()
  {
    AppMethodBeat.i(25198);
    boolean bool;
    if ((this.ssz != 0L) && (this.ssz < System.currentTimeMillis() / 1000L))
    {
      bool = true;
      AppMethodBeat.o(25198);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25198);
    }
  }

  public final String cDm()
  {
    return this.ssr;
  }

  public final String cDn()
  {
    return this.ssu;
  }

  public final boolean cDo()
  {
    return this.sst;
  }

  public final String cDp()
  {
    return this.ssq;
  }

  public final String cDq()
  {
    return this.jumpUrl;
  }

  public final boolean isStart()
  {
    AppMethodBeat.i(25195);
    boolean bool;
    if (this.startTime < System.currentTimeMillis() / 1000L)
    {
      bool = true;
      AppMethodBeat.o(25195);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25195);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.b
 * JD-Core Version:    0.6.2
 */