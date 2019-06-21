package com.tencent.mm.af;

import android.content.Context;
import android.content.res.Resources;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.p;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class j$b extends f
{
  private static final com.tencent.mm.a.f<Integer, b> emX;
  public String action;
  public String appId;
  public String appName;
  public int axy;
  public String cDt;
  public String cEV;
  public int cKu;
  public String cMg;
  public String cMh;
  public String cMj;
  public String cMk;
  public String cMl;
  public String cMm;
  public String cMn;
  public String canvasPageXml;
  public String color;
  public String content;
  public String csD;
  public String cuZ;
  public String dJv;
  public String desc;
  public String description;
  public String designerName;
  public String designerRediretctUrl;
  public String extInfo;
  public String eyr;
  public int ffZ;
  public String fgA;
  public String fgB;
  public String fgC;
  public String fgD;
  public String fgE;
  public int fgF;
  public int fgG;
  public int fgH;
  public int fgI;
  public int fgJ;
  public String fgK;
  public int fgL;
  public String fgM;
  public String fgN;
  public int fgO;
  public int fgP;
  public String fgQ;
  public String fgR;
  public int fgS;
  public String fgT;
  public String fgU;
  public int fgV;
  public String fgW;
  public String fgX;
  public int fgY;
  public String fgZ;
  public j.b.a fgl;
  public Map<String, String> fgm;
  public String fgn;
  public int fgo;
  public String fgp;
  public String fgq;
  public int fgr;
  public int fgs;
  public int fgt;
  public String fgu;
  public String fgv;
  public int fgw;
  public int fgx;
  public int fgy;
  public String fgz;
  public int fhA;
  public String fhB;
  public String fhC;
  public int fhD;
  public int fhE;
  public int fhF;
  public String fhG;
  public String fhH;
  public String fhI;
  public String fhJ;
  public String fhK;
  public String fhL;
  public String fhM;
  public int fhN;
  public String fhO;
  public String fhP;
  public String fhQ;
  public String fhR;
  public String fhS;
  public String fhT;
  public String fhU;
  public String fhV;
  public String fhW;
  public String fhX;
  public String fhY;
  public String fhZ;
  public String fha;
  public String fhb;
  public String fhc;
  public String fhd;
  public String fhe;
  public String fhf;
  public String fhg;
  public String fhh;
  public String fhi;
  public String fhj;
  public String fhk;
  public String fhl;
  public String fhm;
  public int fhn;
  public int fho;
  public int fhp;
  public String fhq;
  public String fhr;
  public String fhs;
  public String fht;
  public String fhu;
  public int fhv;
  public String fhw;
  public String fhx;
  public String fhy;
  public int fhz;
  public String fiA;
  public String fiB;
  public String fiC;
  public int fiD;
  public String fiE;
  public String fiF;
  public String fiG;
  public int fiH;
  public String fiI;
  public String fiJ;
  public String fiK;
  public String fiL;
  public String fiM;
  public String fiN;
  public String fiO;
  public String fiP;
  public String fiQ;
  public int fiR;
  public String fiS;
  public int fiT;
  public String fiU;
  public String fiV;
  public int fiW;
  public String fiX;
  public int fiY;
  public int fiZ;
  public int fia;
  public String fib;
  public String fic;
  public String fid;
  public int fie;
  public boolean fif;
  public int fig;
  public String fih;
  public int fii;
  public String fij;
  public String fik;
  public String fil;
  public String filemd5;
  public List<String> fim;
  public String fin;
  public List<String> fio;
  public String fip;
  public int fiq;
  public String fir;
  public String fis;
  public String fit;
  public String fiu;
  public String fiv;
  public String fiw;
  public String fix;
  public String fiy;
  public String fiz;
  public int fja;
  public String fjb;
  public String fjc;
  public int fjd;
  private final HashMap<Class<? extends f>, f> fje;
  public Map<String, String> fjf;
  private String fjg;
  private String fjh;
  private String fji;
  public String iconUrl;
  public String mediaTagName;
  public String messageAction;
  public String messageExt;
  public int pageType;
  public int sdkVer;
  public String secondUrl;
  public int showType;
  public String thumburl;
  public int tid;
  public String title;
  public int type;
  public String url;
  public String username;

  static
  {
    AppMethodBeat.i(77787);
    emX = new com.tencent.mm.memory.a.c(100);
    AppMethodBeat.o(77787);
  }

  public j$b()
  {
    AppMethodBeat.i(77771);
    this.fif = false;
    this.fig = 0;
    this.fiH = 0;
    this.fiI = "";
    this.fiJ = "";
    this.fiK = "";
    this.fiL = "";
    this.fiM = "";
    this.fiN = "";
    this.fiW = j.a.fgj.ordinal();
    this.canvasPageXml = "";
    this.fjc = null;
    this.fjd = 0;
    this.fje = new HashMap();
    AppMethodBeat.o(77771);
  }

  public static final b X(String paramString1, String paramString2)
  {
    AppMethodBeat.i(77778);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(77778);
      paramString1 = null;
      return paramString1;
    }
    int i = paramString1.indexOf('<');
    if (i > 0);
    for (Object localObject1 = paramString1.substring(i); ; localObject1 = paramString1)
    {
      i = ((String)localObject1).hashCode();
      Object localObject2 = (b)emX.get(Integer.valueOf(i));
      if (localObject2 != null)
      {
        AppMethodBeat.o(77778);
        paramString1 = (String)localObject2;
        break;
      }
      long l1 = System.currentTimeMillis();
      if (!bo.isNullOrNil(paramString2));
      for (localObject2 = be.amR(paramString2); ; localObject2 = null)
      {
        if (localObject2 == null)
          localObject2 = br.z((String)localObject1, "msg");
        while (true)
        {
          if (localObject2 == null)
          {
            ab.e("MicroMsg.AppMessage", "parse msg failed");
            AppMethodBeat.o(77778);
            paramString1 = null;
            break;
          }
          long l2 = System.currentTimeMillis();
          b localb = new b();
          localb.fjf = ((Map)localObject2);
          localb.fjg = paramString1;
          localb.fjh = ((String)localObject1);
          localb.fji = paramString2;
          try
          {
            localb.a((Map)localObject2, localb);
            localObject1 = j.c.XC().iterator();
            while (((Iterator)localObject1).hasNext())
            {
              paramString1 = (f)((com.tencent.mm.ci.c)((Iterator)localObject1).next()).get();
              paramString1.a((Map)localObject2, localb);
              localb.a(paramString1);
            }
          }
          catch (Exception paramString1)
          {
            ab.e("MicroMsg.AppMessage", "parse amessage xml failed");
            ab.e("MicroMsg.AppMessage", "exception:%s", new Object[] { bo.l(paramString1) });
            AppMethodBeat.o(77778);
            paramString1 = null;
          }
          break;
          paramString1 = j.c.kq(localb.type);
          if (paramString1 != null)
          {
            paramString1.a((Map)localObject2, localb);
            localb.a(paramString1);
          }
          emX.k(Integer.valueOf(i), localb);
          ab.d("MicroMsg.AppMessage", "parseContent, time:%d, %d, %d", new Object[] { Long.valueOf(l2 - l1), Long.valueOf(System.currentTimeMillis() - l1), Integer.valueOf(bo.nullAsNil(paramString2).hashCode()) });
          AppMethodBeat.o(77778);
          paramString1 = localb;
          break;
        }
      }
    }
  }

  private b XB()
  {
    AppMethodBeat.i(77783);
    b localb = new b();
    if (this == null)
      AppMethodBeat.o(77783);
    while (true)
    {
      return localb;
      ab.i("MicroMsg.AppMessage", "summerbig cloneContent srcContent aesKey[%s], filemd5[%s], appid[%s]", new Object[] { bo.anv(this.eyr), this.filemd5, localb.appId });
      localb.action = this.action;
      localb.appId = this.appId;
      localb.appName = this.appName;
      localb.axy = this.axy;
      localb.csD = this.csD;
      localb.fgo = this.fgo;
      localb.content = this.content;
      localb.description = this.description;
      localb.username = this.username;
      localb.extInfo = this.extInfo;
      localb.mediaTagName = this.mediaTagName;
      localb.messageAction = this.messageAction;
      localb.messageExt = this.messageExt;
      localb.fgr = this.fgr;
      localb.fgp = this.fgp;
      localb.cEV = this.cEV;
      localb.fgn = this.fgn;
      localb.sdkVer = this.sdkVer;
      localb.title = this.title;
      localb.type = this.type;
      localb.showType = this.showType;
      localb.ffZ = this.ffZ;
      localb.fgO = this.fgO;
      localb.url = this.url;
      localb.fgq = this.fgq;
      localb.cMg = this.cMg;
      localb.cMh = this.cMh;
      localb.dJv = this.dJv;
      localb.thumburl = this.thumburl;
      localb.fgC = this.fgC;
      localb.fgM = this.fgM;
      localb.fgN = this.fgN;
      localb.fgP = this.fgP;
      localb.fgQ = this.fgQ;
      localb.fgS = this.fgS;
      localb.fgR = this.fgR;
      localb.fgV = this.fgV;
      localb.fgW = this.fgW;
      localb.fgY = this.fgY;
      localb.fgX = this.fgX;
      localb.fgT = this.fgT;
      localb.fgU = this.fgU;
      localb.fhu = this.fhu;
      localb.cDt = this.cDt;
      localb.fhB = this.fhB;
      localb.fhC = this.fhC;
      localb.fhD = this.fhD;
      localb.fhE = this.fhD;
      localb.fhw = this.fhw;
      localb.fhz = this.fhz;
      localb.fhv = this.fhv;
      localb.fhx = this.fhx;
      localb.fhy = this.fhy;
      localb.fhN = this.fhN;
      localb.fhO = this.fhO;
      localb.fhP = this.fhP;
      localb.fgt = this.fgt;
      localb.cMj = this.cMj;
      localb.cMk = this.cMk;
      localb.cMl = this.cMl;
      localb.cMm = this.cMm;
      localb.fiF = this.fiF;
      localb.fiD = this.fiD;
      localb.designerName = this.designerName;
      localb.designerRediretctUrl = this.designerName;
      localb.tid = this.tid;
      localb.fiE = this.fiE;
      localb.desc = this.desc;
      localb.iconUrl = this.iconUrl;
      localb.secondUrl = this.secondUrl;
      localb.pageType = this.pageType;
      localb.fiG = this.fiG;
      localb.fiH = this.fiH;
      localb.fiI = this.fiI;
      localb.fiJ = this.fiJ;
      localb.fiK = this.fiK;
      localb.fiL = this.fiL;
      localb.fiM = this.fiM;
      localb.fiN = this.fiN;
      localb.canvasPageXml = this.canvasPageXml;
      localb.cMn = this.cMn;
      localb.fgD = this.fgD;
      localb.eyr = this.eyr;
      localb.filemd5 = this.filemd5;
      localb.fgs = this.fgs;
      localb.fgl = this.fgl;
      localb.fiO = this.fiO;
      localb.fiP = this.fiP;
      localb.fiR = this.fiR;
      localb.fiS = this.fiS;
      localb.fiZ = this.fiZ;
      localb.fiQ = this.fiQ;
      localb.fja = this.fja;
      localb.fjb = this.fjb;
      localb.fiU = this.fiU;
      localb.fiV = this.fiV;
      localb.fiW = this.fiW;
      localb.fiX = this.fiX;
      localb.fiY = this.fiY;
      localb.fjh = this.fjh;
      localb.fji = this.fji;
      localb.fjg = this.fjg;
      localb.fjf = this.fjf;
      localb.fgu = this.fgu;
      localb.fgv = this.fgv;
      localb.fgw = this.fgw;
      localb.fgx = this.fgx;
      localb.fgy = this.fgy;
      localb.fgz = this.fgz;
      localb.fgA = this.fgA;
      localb.fgB = this.fgB;
      Iterator localIterator = this.fje.entrySet().iterator();
      while (localIterator.hasNext())
      {
        f localf = ((f)((Map.Entry)localIterator.next()).getValue()).Xz();
        if (localf != null)
          localb.a(localf);
      }
      AppMethodBeat.o(77783);
    }
  }

  public static b a(b paramb)
  {
    AppMethodBeat.i(77781);
    if (paramb == null)
    {
      paramb = new b();
      AppMethodBeat.o(77781);
    }
    while (true)
    {
      return paramb;
      paramb = paramb.XB();
      AppMethodBeat.o(77781);
    }
  }

  public static String a(b paramb, String paramString, d paramd)
  {
    AppMethodBeat.i(77779);
    ab.i("MicroMsg.AppMessage", "summersafecdn makeLocalContent aesKey[%s], filemd5[%s]", new Object[] { bo.anv(paramb.eyr), paramb.filemd5 });
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<msg>");
    if ((paramb.fgJ != 0) && (paramb.fgI != 0))
    {
      ab.d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb[%d, %d]", new Object[] { Integer.valueOf(paramb.fgJ), Integer.valueOf(paramb.fgI) });
      localStringBuilder.append(a(paramb, paramString, paramd, paramb.fgJ, paramb.fgI));
    }
    while (true)
    {
      localStringBuilder.append("</msg>");
      emX.k(Integer.valueOf(localStringBuilder.toString().hashCode()), paramb);
      paramb = localStringBuilder.toString();
      AppMethodBeat.o(77779);
      return paramb;
      ab.d("MicroMsg.AppMessage", "summersafecdn makeLocalContent thumb 0");
      localStringBuilder.append(a(paramb, paramString, paramd, 0, 0));
    }
  }

  public static String a(b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77780);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<appmsg appid=\"" + bo.ani(paramb.appId) + "\" sdkver=\"" + paramb.sdkVer + "\">");
    paramb.a(localStringBuilder, paramb, paramString, paramd, paramInt1, paramInt2);
    f localf = j.c.kq(paramb.type);
    if (localf != null)
      localf.a(localStringBuilder, paramb, paramString, paramd, paramInt1, paramInt2);
    localStringBuilder.append("</appmsg>");
    if (2 == paramb.showType)
      localStringBuilder.append("<ShakePageResult>").append(paramb.fgC).append("</ShakePageResult>");
    ab.d("MicroMsg.AppMessage", "summerbig makeContent[%s]", new Object[] { localStringBuilder.toString() });
    paramb = localStringBuilder.toString();
    AppMethodBeat.o(77780);
    return paramb;
  }

  public static final b md(String paramString)
  {
    AppMethodBeat.i(77774);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(77774);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf('<');
      Object localObject = paramString;
      if (i > 0)
        localObject = paramString.substring(i);
      i = "parseImg_".concat(String.valueOf(localObject)).hashCode();
      paramString = (b)emX.get(Integer.valueOf(i));
      if (paramString != null)
      {
        AppMethodBeat.o(77774);
      }
      else
      {
        localObject = br.z((String)localObject, "msg");
        if (localObject == null)
        {
          ab.e("MicroMsg.AppMessage", "parseImg failed");
          AppMethodBeat.o(77774);
          paramString = null;
        }
        else
        {
          paramString = new b();
          paramString.type = 2;
          paramString.appId = ((String)((Map)localObject).get(".msg.appinfo.appid"));
          paramString.axy = bo.getInt((String)((Map)localObject).get(".msg.appinfo.version"), 0);
          paramString.appName = ((String)((Map)localObject).get(".msg.appinfo.appname"));
          paramString.mediaTagName = ((String)((Map)localObject).get(".msg.appinfo.mediatagname"));
          paramString.messageExt = ((String)((Map)localObject).get(".msg.appinfo.messageext"));
          paramString.messageAction = ((String)((Map)localObject).get(".msg.appinfo.messageaction"));
          emX.k(Integer.valueOf(i), paramString);
          AppMethodBeat.o(77774);
        }
      }
    }
  }

  public static final b me(String paramString)
  {
    AppMethodBeat.i(77777);
    paramString = X(paramString, null);
    AppMethodBeat.o(77777);
    return paramString;
  }

  public static String mf(String paramString)
  {
    AppMethodBeat.i(77785);
    paramString = "<![CDATA[" + paramString + "]]>";
    AppMethodBeat.o(77785);
    return paramString;
  }

  public final <T extends f> T X(Class<T> paramClass)
  {
    AppMethodBeat.i(77772);
    paramClass = (f)this.fje.get(paramClass);
    AppMethodBeat.o(77772);
    return paramClass;
  }

  public final void a(f paramf)
  {
    AppMethodBeat.i(77773);
    if (paramf == null)
    {
      ab.printErrStackTrace("MicroMsg.AppMessage", new NullPointerException(""), "piece is null", new Object[0]);
      AppMethodBeat.o(77773);
    }
    while (true)
    {
      return;
      paramf.fge = this;
      this.fje.put(paramf.getClass(), paramf);
      AppMethodBeat.o(77773);
    }
  }

  public final void a(j paramj)
  {
    paramj.field_appId = this.appId;
    paramj.field_title = this.title;
    paramj.field_description = this.description;
    paramj.field_type = this.type;
    paramj.field_source = this.appName;
  }

  public final void a(StringBuilder paramStringBuilder, b paramb, String paramString, d paramd, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77784);
    paramStringBuilder.append("<title>" + bo.ani(paramb.title) + "</title>");
    paramStringBuilder.append("<des>" + bo.ani(paramb.description) + "</des>");
    paramStringBuilder.append("<username>" + bo.ani(paramb.username) + "</username>");
    Object localObject1 = new StringBuilder("<action>");
    Object localObject2;
    if (bo.isNullOrNil(paramb.action))
    {
      localObject2 = "view";
      paramStringBuilder.append((String)localObject2 + "</action>");
      paramStringBuilder.append("<type>" + paramb.type + "</type>");
      paramStringBuilder.append("<showtype>").append(paramb.showType).append("</showtype>");
      paramStringBuilder.append("<content>" + bo.ani(paramb.content) + "</content>");
      paramStringBuilder.append("<url>" + bo.ani(paramb.url) + "</url>");
      paramStringBuilder.append("<lowurl>" + bo.ani(paramb.fgn) + "</lowurl>");
      paramStringBuilder.append("<dataurl>" + bo.ani(paramb.fgM) + "</dataurl>");
      paramStringBuilder.append("<lowdataurl>" + bo.ani(paramb.fgN) + "</lowdataurl>");
      paramStringBuilder.append("<contentattr>").append(paramb.fgt).append("</contentattr>");
      paramStringBuilder.append("<streamvideo>");
      paramStringBuilder.append("<streamvideourl>").append(bo.ani(paramb.fiG)).append("</streamvideourl>");
      paramStringBuilder.append("<streamvideototaltime>").append(paramb.fiH).append("</streamvideototaltime>");
      paramStringBuilder.append("<streamvideotitle>").append(bo.ani(paramb.fiI)).append("</streamvideotitle>");
      paramStringBuilder.append("<streamvideowording>").append(bo.ani(paramb.fiJ)).append("</streamvideowording>");
      paramStringBuilder.append("<streamvideoweburl>").append(bo.ani(paramb.fiK)).append("</streamvideoweburl>");
      paramStringBuilder.append("<streamvideothumburl>").append(bo.ani(paramb.fiL)).append("</streamvideothumburl>");
      paramStringBuilder.append("<streamvideoaduxinfo>").append(bo.ani(paramb.fiM)).append("</streamvideoaduxinfo>");
      paramStringBuilder.append("<streamvideopublishid>").append(bo.ani(paramb.fiN)).append("</streamvideopublishid>");
      paramStringBuilder.append("</streamvideo>");
      paramStringBuilder.append(String.format("<canvasPageItem><canvasPageXml><![CDATA[%s]]></canvasPageXml></canvasPageItem>", new Object[] { paramb.canvasPageXml }));
      switch (paramb.type)
      {
      default:
      case 10:
      case 13:
      case 20:
      case 19:
      case 24:
      case 16:
      case 2000:
      case 2001:
      }
    }
    while (true)
    {
      paramStringBuilder.append("<appattach>");
      if ((paramd != null) && ((!bo.isNullOrNil(paramString)) || (paramInt1 != 0) || (paramInt2 != 0)))
        break label3277;
      paramStringBuilder.append("<totallen>" + paramb.fgo + "</totallen>");
      paramStringBuilder.append("<attachid>" + bo.ani(paramb.csD) + "</attachid>");
      paramStringBuilder.append("<cdnattachurl>" + bo.ani(paramb.fgD) + "</cdnattachurl>");
      paramStringBuilder.append("<emoticonmd5>" + bo.ani(paramb.fgq) + "</emoticonmd5>");
      paramStringBuilder.append("<aeskey>" + bo.ani(paramb.eyr) + "</aeskey>");
      if ((paramInt1 != 0) && (paramInt2 != 0))
      {
        paramStringBuilder.append("<thumbheight>" + paramInt2 + "</thumbheight>");
        paramStringBuilder.append("<thumbwidth>" + paramInt1 + "</thumbwidth>");
      }
      paramStringBuilder.append("<fileext>" + bo.ani(paramb.fgp) + "</fileext>");
      paramStringBuilder.append("<islargefilemsg>" + paramb.fgs + "</islargefilemsg>");
      paramStringBuilder.append("</appattach>");
      paramStringBuilder.append("<extinfo>" + bo.ani(paramb.extInfo) + "</extinfo>");
      paramStringBuilder.append("<androidsource>" + paramb.fgr + "</androidsource>");
      if (!bo.isNullOrNil(paramb.cMg))
      {
        paramStringBuilder.append("<sourceusername>" + bo.ani(paramb.cMg) + "</sourceusername>");
        paramStringBuilder.append("<sourcedisplayname>" + bo.ani(paramb.cMh) + "</sourcedisplayname>");
        paramStringBuilder.append("<commenturl>" + bo.ani(paramb.dJv) + "</commenturl>");
      }
      paramStringBuilder.append("<thumburl>" + bo.ani(paramb.thumburl) + "</thumburl>");
      paramStringBuilder.append("<mediatagname>" + bo.ani(paramb.mediaTagName) + "</mediatagname>");
      paramStringBuilder.append("<messageaction>" + mf(bo.ani(paramb.messageAction)) + "</messageaction>");
      paramStringBuilder.append("<messageext>" + mf(bo.ani(paramb.messageExt)) + "</messageext>");
      paramStringBuilder.append("<emoticongift>");
      paramStringBuilder.append("<packageflag>" + paramb.fgS + "</packageflag>");
      paramStringBuilder.append("<packageid>" + bo.ani(paramb.fgR) + "</packageid>");
      paramStringBuilder.append("</emoticongift>");
      paramStringBuilder.append("<emoticonshared>");
      paramStringBuilder.append("<packageflag>" + paramb.fgY + "</packageflag>");
      paramStringBuilder.append("<packageid>" + bo.ani(paramb.fgX) + "</packageid>");
      paramStringBuilder.append("</emoticonshared>");
      paramStringBuilder.append("<designershared>");
      paramStringBuilder.append("<designeruin>" + paramb.fiD + "</designeruin>");
      paramStringBuilder.append("<designername>" + paramb.designerName + "</designername>");
      paramStringBuilder.append("<designerrediretcturl>" + paramb.designerRediretctUrl + "</designerrediretcturl>");
      paramStringBuilder.append("</designershared>");
      paramStringBuilder.append("<emotionpageshared>");
      paramStringBuilder.append("<tid>" + paramb.tid + "</tid>");
      paramStringBuilder.append("<title>" + paramb.fiE + "</title>");
      paramStringBuilder.append("<desc>" + paramb.desc + "</desc>");
      paramStringBuilder.append("<iconUrl>" + paramb.iconUrl + "</iconUrl>");
      paramStringBuilder.append("<secondUrl>" + paramb.secondUrl + "</secondUrl>");
      paramStringBuilder.append("<pageType>" + paramb.pageType + "</pageType>");
      paramStringBuilder.append("</emotionpageshared>");
      paramStringBuilder.append("<webviewshared>");
      paramStringBuilder.append("<shareUrlOriginal>" + bo.ani(paramb.cMj) + "</shareUrlOriginal>");
      paramStringBuilder.append("<shareUrlOpen>" + bo.ani(paramb.cMk) + "</shareUrlOpen>");
      paramStringBuilder.append("<jsAppId>" + bo.ani(paramb.cMl) + "</jsAppId>");
      paramStringBuilder.append("<publisherId>" + bo.ani(paramb.cMm) + "</publisherId>");
      paramStringBuilder.append("</webviewshared>");
      paramStringBuilder.append("<template_id>" + bo.ani(paramb.fhu) + "</template_id>");
      ab.i("MicroMsg.AppMessage", "summerbig makecontent content md5[%s]", new Object[] { paramb.filemd5 });
      paramStringBuilder.append("<md5>" + bo.ani(paramb.filemd5) + "</md5>");
      Iterator localIterator = j.c.XC().iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (f)((com.tencent.mm.ci.c)localIterator.next()).get();
        localObject1 = paramb.X(localObject2.getClass());
        if (localObject1 != null)
          localObject2 = localObject1;
        ((f)localObject2).a(paramStringBuilder, paramb, paramString, paramd, paramInt1, paramInt2);
      }
      localObject2 = bo.ani(paramb.action);
      break;
      paramStringBuilder.append("<productitem type=\"" + paramb.fgP + "\">");
      paramStringBuilder.append("<productinfo>" + bo.ani(paramb.fgQ) + "</productinfo>");
      paramStringBuilder.append("</productitem>");
      continue;
      paramStringBuilder.append("<mallproductitem type=\"" + paramb.fgV + "\">");
      paramStringBuilder.append("<mallproductinfo>" + bo.ani(paramb.fgW) + "</mallproductinfo>");
      paramStringBuilder.append("</mallproductitem>");
      continue;
      paramStringBuilder.append("<tvinfo>" + bo.ani(paramb.fgT) + "</tvinfo>");
      continue;
      paramStringBuilder.append("<recorditem>" + bo.ani(paramb.fgU) + "</recorditem>");
      continue;
      paramStringBuilder.append("<carditem>" + paramb.fhB + "</carditem>");
      continue;
      paramStringBuilder.append("<wcpayinfo>");
      paramStringBuilder.append("<paysubtype>" + paramb.fhv + "</paysubtype>");
      paramStringBuilder.append("<feedesc>" + paramb.fhw + "</feedesc>");
      paramStringBuilder.append("<transcationid>" + paramb.fhx + "</transcationid>");
      paramStringBuilder.append("<transferid>" + paramb.fhy + "</transferid>");
      paramStringBuilder.append("<invalidtime>" + paramb.fhz + "</invalidtime>");
      paramStringBuilder.append("<pay_memo>" + paramb.fiF + "</pay_memo>");
      paramStringBuilder.append("</wcpayinfo>");
      continue;
      paramStringBuilder.append("<wcpayinfo>");
      paramStringBuilder.append("<iconurl>" + bo.ani(paramb.fhR) + "</iconurl>");
      paramStringBuilder.append("<scenetext>" + bo.ani(paramb.fhW) + "</scenetext>");
      paramStringBuilder.append("<url>" + bo.ani(paramb.fhQ) + "</url>");
      paramStringBuilder.append("<receivertitle>" + bo.ani(paramb.fhS) + "</receivertitle>");
      paramStringBuilder.append("<sendertitle>" + bo.ani(paramb.fhT) + "</sendertitle>");
      paramStringBuilder.append("<receiverdes>" + bo.ani(paramb.fhV) + "</receiverdes>");
      paramStringBuilder.append("<senderdes>" + bo.ani(paramb.fhU) + "</senderdes>");
      paramStringBuilder.append("<templateid>" + bo.ani(paramb.fhX) + "</templateid>");
      paramStringBuilder.append("<sceneid>" + bo.ani(paramb.fhY) + "</sceneid>");
      paramStringBuilder.append("<nativeurl>" + bo.ani(paramb.fhZ) + "</nativeurl>");
      paramStringBuilder.append("<innertype>" + bo.ani(new StringBuilder().append(paramb.showType).toString()) + "</innertype>");
      paramStringBuilder.append("<localtype>" + bo.ani(new StringBuilder().append(paramb.fia).toString()) + "</localtype>");
      paramStringBuilder.append("<paymsgid>" + bo.ani(paramb.fib) + "</paymsgid>");
      paramStringBuilder.append("<imageid>" + bo.ani(paramb.fic) + "</imageid>");
      paramStringBuilder.append("<imageaeskey>" + bo.ani(paramb.fid) + "</imageaeskey>");
      paramStringBuilder.append("<imagelength>" + bo.ani(new StringBuilder().append(paramb.fie).toString()) + "</imagelength>");
      paramStringBuilder.append("<droptips>" + bo.ani(new StringBuilder().append(paramb.fig).toString()) + "</droptips>");
      paramStringBuilder.append("</wcpayinfo>");
    }
    label3277: paramStringBuilder.append("<attachid>" + bo.ani(paramString) + "</attachid>");
    if ((paramd.field_fileLength > 0) && (!bo.isNullOrNil(paramd.field_fileId)))
    {
      paramStringBuilder.append("<cdnattachurl>" + bo.ani(paramd.field_fileId) + "</cdnattachurl>");
      if ((paramb.type == 19) || (paramb.type == 24) || (paramb.type == 4) || (paramb.type == 3) || (paramb.type == 7) || (paramb.type == 27) || (paramb.type == 26))
        break label3709;
      paramStringBuilder.append("<totallen>" + paramd.field_fileLength + "</totallen>");
    }
    while (true)
    {
      if (paramd.field_thumbimgLength > 0)
      {
        paramStringBuilder.append("<cdnthumburl>" + bo.ani(paramd.field_fileId) + "</cdnthumburl>");
        if (!bo.isNullOrNil(paramd.field_thumbfilemd5))
          paramStringBuilder.append("<cdnthumbmd5>" + paramd.field_thumbfilemd5 + "</cdnthumbmd5>");
        paramStringBuilder.append("<cdnthumblength>" + paramd.field_thumbimgLength + "</cdnthumblength>");
        paramStringBuilder.append("<cdnthumbheight>" + paramInt2 + "</cdnthumbheight>");
        paramStringBuilder.append("<cdnthumbwidth>" + paramInt1 + "</cdnthumbwidth>");
        paramStringBuilder.append("<cdnthumbaeskey>" + paramd.field_aesKey + "</cdnthumbaeskey>");
      }
      paramStringBuilder.append("<aeskey>" + bo.ani(paramd.field_aesKey) + "</aeskey>");
      paramStringBuilder.append("<encryver>1</encryver>");
      break;
      label3709: ab.i("MicroMsg.AppMessage", "summersafecdn content.type[%d], len[%d] but not set", new Object[] { Integer.valueOf(paramb.type), Integer.valueOf(paramd.field_fileLength) });
    }
    AppMethodBeat.o(77784);
  }

  public final void a(Map<String, String> paramMap, b paramb)
  {
    AppMethodBeat.i(77782);
    while (true)
    {
      int i;
      int j;
      try
      {
        this.fgm = paramMap;
        this.appId = ((String)paramMap.get(".msg.appmsg.$appid"));
        this.sdkVer = bo.getInt((String)paramMap.get(".msg.appmsg.$sdkver"), 0);
        this.title = bo.amS((String)paramMap.get(".msg.appmsg.title"));
        this.description = ((String)paramMap.get(".msg.appmsg.des"));
        this.username = ((String)paramMap.get(".msg.appmsg.username"));
        this.action = ((String)paramMap.get(".msg.appmsg.action"));
        this.type = bo.getInt((String)paramMap.get(".msg.appmsg.type"), 0);
        this.content = ((String)paramMap.get(".msg.appmsg.content"));
        this.url = ((String)paramMap.get(".msg.appmsg.url"));
        this.fgn = ((String)paramMap.get(".msg.appmsg.lowurl"));
        this.fgu = ((String)paramMap.get(".msg.appmsg.appattach.tpurl"));
        this.fgv = ((String)paramMap.get(".msg.appmsg.appattach.tpthumburl"));
        this.fgw = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.tpthumblength"), 0);
        this.fgx = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.tpthumbheight"), 0);
        this.fgy = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.tpthumbwidth"), 0);
        this.fgz = ((String)paramMap.get(".msg.appmsg.appattach.tpthumbmd5"));
        this.fgA = ((String)paramMap.get(".msg.appmsg.appattach.tpauthkey"));
        this.fgB = ((String)paramMap.get(".msg.appmsg.appattach.tpthumbaeskey"));
        this.fgM = ((String)paramMap.get(".msg.appmsg.dataurl"));
        this.fgN = ((String)paramMap.get(".msg.appmsg.lowdataurl"));
        this.fgo = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.totallen"), 0);
        this.csD = ((String)paramMap.get(".msg.appmsg.appattach.attachid"));
        if (!bo.isNullOrNil(this.fgu))
          this.csD = this.fgu;
        this.fgp = bo.amS((String)paramMap.get(".msg.appmsg.appattach.fileext"));
        this.fgq = ((String)paramMap.get(".msg.appmsg.appattach.emoticonmd5"));
        this.extInfo = ((String)paramMap.get(".msg.appmsg.extinfo"));
        this.fgr = bo.getInt((String)paramMap.get(".msg.appmsg.androidsource"), 0);
        this.cMg = ((String)paramMap.get(".msg.appmsg.sourceusername"));
        this.cMh = ((String)paramMap.get(".msg.appmsg.sourcedisplayname"));
        this.dJv = ((String)paramMap.get(".msg.commenturl"));
        this.thumburl = ((String)paramMap.get(".msg.appmsg.thumburl"));
        this.mediaTagName = ((String)paramMap.get(".msg.appmsg.mediatagname"));
        this.messageAction = ((String)paramMap.get(".msg.appmsg.messageaction"));
        this.messageExt = ((String)paramMap.get(".msg.appmsg.messageext"));
        this.axy = bo.getInt((String)paramMap.get(".msg.appinfo.version"), 0);
        this.appName = ((String)paramMap.get(".msg.appinfo.appname"));
        this.cEV = ((String)paramMap.get(".msg.fromusername"));
        this.fgD = ((String)paramMap.get(".msg.appmsg.appattach.cdnattachurl"));
        this.fgE = ((String)paramMap.get(".msg.appmsg.appattach.cdnthumburl"));
        this.fgF = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.cdnthumblength"), 0);
        this.fgG = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.cdnthumbheight"), 0);
        this.fgH = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.cdnthumbwidth"), 0);
        this.fgI = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.thumbheight"), 0);
        this.fgJ = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.thumbwidth"), 0);
        this.eyr = ((String)paramMap.get(".msg.appmsg.appattach.aeskey"));
        this.fgL = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.encryver"), 1);
        this.fgK = ((String)paramMap.get(".msg.appmsg.appattach.cdnthumbaeskey"));
        this.fgs = bo.getInt((String)paramMap.get(".msg.appmsg.appattach.islargefilemsg"), 0);
        if ((this.fgs == 0) && (this.fgo > 26214400))
        {
          this.fgs = 1;
          ab.i("MicroMsg.AppMessage", "summerbig content.attachlen[%d] set largefilemsg 1", new Object[] { Integer.valueOf(this.fgo) });
        }
        this.fgP = bo.getInt((String)paramMap.get(".msg.appmsg.productitem.$type"), 0);
        this.fgQ = ((String)paramMap.get(".msg.appmsg.productitem.productinfo"));
        this.fgS = bo.getInt((String)paramMap.get(".msg.appmsg.emoticongift.packageflag"), 0);
        this.fgR = ((String)paramMap.get(".msg.appmsg.emoticongift.packageid"));
        this.fgX = ((String)paramMap.get(".msg.appmsg.emoticonshared.packageid"));
        this.fgY = bo.getInt((String)paramMap.get(".msg.appmsg.emoticonshared.packageflag"), 0);
        this.fgT = ((String)paramMap.get(".msg.appmsg.tvinfo"));
        this.fgU = ((String)paramMap.get(".msg.appmsg.recorditem"));
        this.cMj = ((String)paramMap.get(".msg.appmsg.webviewshared.shareUrlOriginal"));
        this.cMk = ((String)paramMap.get(".msg.appmsg.webviewshared.shareUrlOpen"));
        this.cMl = ((String)paramMap.get(".msg.appmsg.webviewshared.jsAppId"));
        this.cMm = ((String)paramMap.get(".msg.appmsg.webviewshared.publisherId"));
        this.fiD = p.cB((String)paramMap.get(".msg.appmsg.designershared.designeruin"));
        this.designerName = ((String)paramMap.get(".msg.appmsg.designershared.designername"));
        this.designerRediretctUrl = ((String)paramMap.get(".msg.appmsg.designershared.designerrediretcturl"));
        this.tid = bo.ank((String)paramMap.get(".msg.appmsg.emotionpageshared.tid"));
        this.fiE = ((String)paramMap.get(".msg.appmsg.emotionpageshared.title"));
        this.desc = ((String)paramMap.get(".msg.appmsg.emotionpageshared.desc"));
        this.iconUrl = ((String)paramMap.get(".msg.appmsg.emotionpageshared.iconUrl"));
        this.secondUrl = bo.bc((String)paramMap.get(".msg.appmsg.emotionpageshared.secondUrl"), "");
        this.pageType = bo.ank((String)paramMap.get(".msg.appmsg.emotionpageshared.pageType"));
        this.fiG = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideourl"), "");
        this.fiH = bo.ank((String)paramMap.get(".msg.appmsg.streamvideo.streamvideototaltime"));
        this.fiI = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideotitle"), "");
        this.fiJ = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideowording"), "");
        this.fiK = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideoweburl"), "");
        this.fiL = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideothumburl"), "");
        this.fiM = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideoaduxinfo"), "");
        this.fiN = bo.bc((String)paramMap.get(".msg.appmsg.streamvideo.streamvideopublishid"), "");
        this.canvasPageXml = bo.bc((String)paramMap.get(".msg.appmsg.canvasPageItem.canvasPageXml"), "");
        this.fiP = ((String)paramMap.get(".msg.appmsg.weappinfo.username"));
        this.fiO = ((String)paramMap.get(".msg.appmsg.weappinfo.pagepath"));
        this.fiQ = ((String)paramMap.get(".msg.appmsg.weappinfo.appid"));
        this.fja = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.version"), 0);
        this.fiR = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.type"), 0);
        this.fiZ = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.pkginfo.type"), 0);
        this.fiS = ((String)paramMap.get(".msg.appmsg.weappinfo.pkginfo.md5"));
        this.fjb = ((String)paramMap.get(".msg.appmsg.weappinfo.weappiconurl"));
        this.fiU = ((String)paramMap.get(".msg.appmsg.weappinfo.shareId"));
        this.fiV = ((String)paramMap.get(".msg.appmsg.weappinfo.sharekey"));
        this.fiW = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.nativeappinfo.type"), j.a.fgj.ordinal());
        this.fiX = bo.bc((String)paramMap.get(".msg.appmsg.weappinfo.nativeappinfo.appnamemultilanguagekey"), "");
        this.fiY = bo.getInt((String)paramMap.get(".msg.appmsg.weappinfo.disableforward"), 0);
        i = paramb.fjg.indexOf("<cache");
        j = paramb.fjg.indexOf("</cache>");
        if (j - i > "<cache".length())
          this.fjc = paramb.fjg.substring(i, "</cache>".length() + j);
        this.fjd = bo.getInt((String)paramMap.get(".msg.appmsg.soundtype"), 0);
        switch (this.type)
        {
        default:
          if (this.type != 21)
            break;
          this.showType = bo.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
          this.cMn = ((String)paramMap.get(".msg.appmsg.statextstr"));
          this.ffZ = bo.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
          if ((this.ffZ == 5) && (bo.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.$count"), 0) > 1))
            this.ffZ = 0;
          this.fgO = bo.getInt((String)paramMap.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
          this.fgZ = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.ranktitle"));
          this.fha = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rankid"));
          if (bo.isNullOrNil(this.fha))
            this.fha = ((String)paramMap.get(".msg.appmsg.hardwareinfo.likeuserlist.userinfo.rankid"));
          this.fhb = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.rank.rankdisplay"));
          this.fhc = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoretitle"));
          this.fhd = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.rankinfo.score.scoredisplay"));
          this.fhe = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.tipdisplay"));
          this.color = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.color"));
          this.fhf = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightcolor"));
          this.fhg = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.linecolor"));
          this.fhi = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.fontcolor"));
          this.fhh = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.highlightlinecolor"));
          this.fhk = ((String)paramMap.get(".msg.appmsg.hardwareinfo.rankview.rankviewtitle"));
          this.fhj = ((String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.championusername"));
          this.fhn = bo.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.hardwareshowtype"), 0);
          this.fhp = bo.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.timestamp"), 0);
          this.fho = bo.getInt((String)paramMap.get(".msg.appmsg.hardwareinfo.devicetype"), 0);
          this.fhl = ((String)paramMap.get(".msg.appmsg.hardwareinfo.rankview.championinfo.motto"));
          this.fhm = ((String)paramMap.get(".msg.appmsg.hardwareinfo.rankview.championinfo.coverimgurl"));
          localObject = (String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.displayusername");
          this.fht = ((String)localObject);
          this.fhr = ((String)localObject);
          localObject = (String)paramMap.get(".msg.appmsg.hardwareinfo.messagenodeinfo.title");
          this.fhs = ((String)localObject);
          this.fhq = ((String)localObject);
          this.fhu = bo.nullAsNil((String)paramMap.get(".msg.appmsg.template_id"));
          this.filemd5 = ((String)paramMap.get(".msg.appmsg.md5"));
          this.fhN = bo.getInt((String)paramMap.get(".msg.appmsg.jumpcontrol.enable"), 0);
          this.fhO = ((String)paramMap.get(".msg.appmsg.jumpcontrol.jumpurl"));
          this.fhP = ((String)paramMap.get(".msg.appmsg.jumpcontrol.pushcontent"));
          paramMap = br.z(paramb.fjh, "msgoperation");
          if ((this != null) && (paramMap != null))
          {
            this.fgl = new j.b.a();
            this.fgl.dJE = ((String)paramMap.get(".msgoperation.expinfo.expidstr"));
            this.fgl.fjj = bo.getInt((String)paramMap.get(".msgoperation.appmsg.usedefaultthumb"), 0);
            this.fgl.fjk = bo.getInt((String)paramMap.get(".msgoperation.appmsg.isupdatetitle"), 0);
            this.fgl.title = ((String)paramMap.get(".msgoperation.appmsg.title"));
            this.fgl.fjl = bo.getInt((String)paramMap.get(".msgoperation.appmsg.isupdatedesc"), 0);
            this.fgl.desc = ((String)paramMap.get(".msgoperation.appmsg.desc"));
            this.fgl.fjm = bo.getInt((String)paramMap.get(".msgoperation.appmsg.ishiddentail"), 0);
          }
          AppMethodBeat.o(77782);
          return;
        case 13:
          this.fgV = bo.getInt((String)paramMap.get(".msg.appmsg.mallproductitem.$type"), 0);
          this.fgW = ((String)paramMap.get(".msg.appmsg.mallproductitem.mallproductinfo"));
          continue;
        case 2000:
        case 2001:
        case 2002:
        case 16:
        case 1:
        case 34:
        }
      }
      catch (Exception paramMap)
      {
        ab.e("MicroMsg.AppMessage", "parse amessage xml failed");
        ab.e("MicroMsg.AppMessage", "exception:%s", new Object[] { bo.l(paramMap) });
        AppMethodBeat.o(77782);
        throw paramMap;
      }
      this.fhv = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.paysubtype"), 0);
      this.fhw = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.feedesc"));
      this.fhx = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.transcationid"));
      this.fhy = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.transferid"));
      this.fhz = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.invalidtime"), 0);
      this.fhA = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.effectivedate"), 3);
      this.cKu = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.total_fee"), 0);
      this.cuZ = bo.bc((String)paramMap.get(".msg.appmsg.wcpayinfo.fee_type"), "ZAR");
      this.fiF = bo.bc((String)paramMap.get(".msg.appmsg.wcpayinfo.pay_memo"), "");
      continue;
      this.fhR = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.iconurl"));
      this.fhW = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.scenetext"));
      this.fhQ = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.url"));
      this.fhS = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.receivertitle"));
      this.fhT = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.sendertitle"));
      this.fhV = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.receiverdes"));
      this.fhU = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.senderdes"));
      this.fhX = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.templateid"));
      this.fhY = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.sceneid"));
      this.fhZ = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.nativeurl"));
      this.fia = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.localtype"), 0);
      this.fib = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.paymsgid"));
      this.fic = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.imageid"));
      this.fid = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.imageaeskey"));
      this.fie = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.imagelength"), 0);
      this.fig = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.droptips"), 0);
      this.fih = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.billno"));
      this.fii = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.newaatype"), 0);
      this.fij = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.receivertitle"));
      this.fik = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.launchertitle"));
      this.fil = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.notinertitle"));
      Object localObject = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.receiverlist"));
      String[] arrayOfString;
      if (!bo.isNullOrNil((String)localObject))
      {
        arrayOfString = ((String)localObject).split("\\|");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          this.fim = ((List)localObject);
          this.fim.addAll(Arrays.asList(arrayOfString));
        }
      }
      this.fin = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.payertitle"));
      localObject = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.payerlist"));
      if (!bo.isNullOrNil((String)localObject))
      {
        arrayOfString = ((String)localObject).split("\\|");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          this.fio = ((List)localObject);
          this.fio.addAll(Arrays.asList(arrayOfString));
        }
      }
      this.fip = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.outtradeno"));
      this.fiq = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.seq"), 0);
      this.fir = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpayinfo.newaa.launcherusername"));
      continue;
      this.fis = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.url"));
      this.fit = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.templateid"));
      this.fiu = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.iconurl"));
      this.fiv = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.miniiconurl"));
      this.fiw = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.backgroundurl"));
      this.fix = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.receivertitle"));
      this.fiy = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.sendertitle"));
      this.fiz = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.scenetext"));
      this.fiA = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.senderdes"));
      this.fiB = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.receiverdes"));
      this.fiC = bo.nullAsNil((String)paramMap.get(".msg.appmsg.wcpaythirdinfo.sceneid"));
      continue;
      this.cDt = paramb.fjg;
      this.fhB = "";
      this.fhD = bo.getInt((String)paramMap.get(".msg.appmsg.carditem.from_scene"), 2);
      this.fhC = ((String)paramMap.get(".msg.appmsg.carditem.brand_name"));
      this.fhE = bo.getInt((String)paramMap.get(".msg.appmsg.carditem.card_type"), -1);
      continue;
      if ((paramMap.get(".msg.alphainfo.url") != null) && (paramMap.get(".msg.alphainfo.md5") != null))
      {
        this.fif = true;
        continue;
        this.fhG = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.order_id"), "");
        this.fhF = p.cB((String)paramMap.get(".msg.appmsg.giftcard_info.biz_uin"));
        this.fhH = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.app_name"), "");
        this.fhI = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.recv_digest"), "");
        this.fhJ = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.send_digest"), "");
        this.fhK = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.background_pic_url"), "");
        this.fhL = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.title_color"), "");
        this.fhM = bo.bc((String)paramMap.get(".msg.appmsg.giftcard_info.des_color"), "");
        continue;
        if (this.type == 2001)
        {
          this.showType = bo.getInt((String)paramMap.get(".msg.appmsg.wcpayinfo.innertype"), 0);
        }
        else
        {
          this.showType = bo.getInt((String)paramMap.get(".msg.appmsg.showtype"), 0);
          switch (this.showType)
          {
          default:
            break;
          case 1:
            if (bo.getInt((String)paramMap.get(".msg.appmsg.mmreader.category.$count"), 0) > 0)
              this.content = be.aS(paramMap);
            break;
          case 2:
            localObject = paramb.fjg.toLowerCase();
            j = ((String)localObject).indexOf("<ShakePageResult>".toLowerCase());
            i = ((String)localObject).indexOf("</ShakePageResult>".toLowerCase());
            this.fgC = paramb.fjg.substring(j + 17, i);
          }
        }
      }
    }
  }

  public final boolean cw(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(77776);
    if (paramBoolean)
    {
      if ((44 != this.type) || (this.fiW < j.a.fgh.ordinal()) || (this.fiW >= j.a.fgj.ordinal()))
        break label94;
      AppMethodBeat.o(77776);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if ((this.fiW >= j.a.fgh.ordinal()) && (this.fiW < j.a.fgj.ordinal()))
      {
        AppMethodBeat.o(77776);
        paramBoolean = bool;
      }
      else
      {
        label94: paramBoolean = false;
        AppMethodBeat.o(77776);
      }
    }
  }

  public final String getDescription()
  {
    if ((this.fgl != null) && (this.fgl.fjl != 0));
    for (String str = this.fgl.desc; ; str = this.description)
      return str;
  }

  public final String getTitle()
  {
    if ((this.fgl != null) && (this.fgl.fjk != 0));
    for (String str = this.fgl.title; ; str = this.title)
      return str;
  }

  public final String p(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(77775);
    String str = "";
    if (cw(true))
    {
      if (bo.isNullOrNil(this.fiX))
        break label174;
      int i = paramContext.getResources().getIdentifier(this.fiX, "string", paramContext.getPackageName());
      ab.d("MicroMsg.AppMessage", "id: %d.", new Object[] { Integer.valueOf(i) });
      if (i <= 0)
        break label147;
      str = paramContext.getResources().getString(i);
    }
    while (true)
    {
      paramContext = str;
      if (paramBoolean)
      {
        paramContext = str;
        if (!str.isEmpty())
          paramContext = "[" + str + "]";
      }
      ab.d("MicroMsg.AppMessage", "txt: %s.", new Object[] { paramContext });
      AppMethodBeat.o(77775);
      return paramContext;
      label147: if (j.a.fgh.ordinal() == this.fiW)
      {
        str = "";
      }
      else
      {
        str = this.cMh;
        continue;
        label174: if (j.a.fgh.ordinal() == this.fiW)
          str = "";
        else
          str = this.cMh;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.j.b
 * JD-Core Version:    0.6.2
 */