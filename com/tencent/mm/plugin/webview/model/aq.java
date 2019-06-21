package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.b.i;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.plugin.webview.ui.tools.b;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public final class aq
{
  private static int umY = 0;
  private static int umZ = 0;
  public aq.o umJ;
  public aq.m umK;
  public aq.n umL;
  public aq.l umM;
  private aq.a umN;
  public aq.h umO;
  public c umP;
  public aq.i umQ;
  public aq.e umR;
  private f umS;
  private aq.k umT;
  private aq.j umU;
  private d umV;
  public aq.b umW;
  private aq.g umX;

  public static void V(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1)
    {
      umY = 1;
      if (!paramBoolean2)
        break label24;
    }
    label24: for (umZ = 1; ; umZ = 0)
    {
      return;
      umY = 0;
      break;
    }
  }

  private static void a(d paramd, String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(6794);
    if (paramd == null)
      AppMethodBeat.o(6794);
    while (true)
    {
      return;
      com.tencent.mm.plugin.webview.ui.tools.g.a(paramd, 11215, paramArrayOfObject);
      if ((paramString != null) && (paramString.startsWith("official_mall")))
        com.tencent.mm.plugin.webview.ui.tools.g.a(paramd, 14919, paramArrayOfObject);
      AppMethodBeat.o(6794);
    }
  }

  public static int aEn()
  {
    AppMethodBeat.i(6774);
    int i;
    if (at.is4G(ah.getContext()))
    {
      i = 5;
      AppMethodBeat.o(6774);
    }
    while (true)
    {
      return i;
      switch (at.getNetType(ah.getContext()))
      {
      default:
        i = 6;
        AppMethodBeat.o(6774);
        break;
      case -1:
        i = 255;
        AppMethodBeat.o(6774);
        break;
      case 0:
        i = 1;
        AppMethodBeat.o(6774);
        break;
      case 3:
      case 4:
        i = 4;
        AppMethodBeat.o(6774);
        break;
      case 2:
      case 5:
      case 7:
        i = 2;
        AppMethodBeat.o(6774);
        break;
      case 1:
      case 6:
      case 8:
        i = 3;
        AppMethodBeat.o(6774);
      }
    }
  }

  public static String cXS()
  {
    AppMethodBeat.i(6775);
    Object localObject = (ConnectivityManager)ah.getContext().getSystemService("connectivity");
    if (localObject == null)
    {
      localObject = "no";
      AppMethodBeat.o(6775);
    }
    while (true)
    {
      return localObject;
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject == null)
      {
        localObject = "no";
        AppMethodBeat.o(6775);
      }
      else if (((NetworkInfo)localObject).getType() == 1)
      {
        localObject = "WIFI";
        AppMethodBeat.o(6775);
      }
      else
      {
        ab.d("MicroMsg.WebviewReporter", "activeNetInfo extra=%s, type=%d, %s", new Object[] { ((NetworkInfo)localObject).getExtraInfo(), Integer.valueOf(((NetworkInfo)localObject).getType()), ((NetworkInfo)localObject).getExtraInfo() });
        if (((NetworkInfo)localObject).getExtraInfo() != null)
        {
          localObject = ((NetworkInfo)localObject).getExtraInfo().toLowerCase();
          AppMethodBeat.o(6775);
        }
        else
        {
          localObject = "no";
          AppMethodBeat.o(6775);
        }
      }
    }
  }

  public static void lP(long paramLong)
  {
    AppMethodBeat.i(6793);
    if (paramLong <= 0L)
      AppMethodBeat.o(6793);
    while (true)
    {
      return;
      int i = (int)(System.currentTimeMillis() - paramLong);
      if ((i >= 0) && (i < 20000))
        h.pYm.e(16269, new Object[] { Integer.valueOf(i), Integer.valueOf((int)(paramLong / 1000L)) });
      AppMethodBeat.o(6793);
    }
  }

  public final void aeG(String paramString)
  {
    AppMethodBeat.i(6791);
    if (this.umW != null);
    while (true)
    {
      aq.b localb;
      try
      {
        localb = this.umW;
        boolean bool = localb.mqu.containsKey(paramString);
        if (!bool)
          break label76;
        try
        {
          localb.putValue(paramString, Integer.valueOf(localb.mqu.getInt(paramString) + 1));
          AppMethodBeat.o(6791);
          return;
        }
        catch (Exception paramString)
        {
          AppMethodBeat.o(6791);
          continue;
        }
      }
      catch (Exception paramString)
      {
      }
      AppMethodBeat.o(6791);
      continue;
      label76: localb.putValue(paramString, Integer.valueOf(1));
      AppMethodBeat.o(6791);
    }
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(6792);
    Object localObject1 = cXV();
    int i;
    Object localObject2;
    Object localObject3;
    Object localObject5;
    long l1;
    if (paramd != null)
    {
      i = aEn();
      localObject2 = ((aq.n)localObject1).unv.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (Map.Entry)((Iterator)localObject2).next();
        localObject5 = (String)((Map.Entry)localObject3).getKey();
        l1 = ((Long)((Map.Entry)localObject3).getValue()).longValue();
        h.pYm.a(32L, 0L, 1L, true);
        if ((l1 >= 0L) && (l1 <= 180000L))
        {
          localObject6 = ((aq.n)localObject1).uni;
          if (localObject5 == null);
          for (localObject3 = localObject5; ; localObject3 = ((String)localObject5).replace(",", "!"))
          {
            a(paramd, (String)localObject6, new Object[] { Integer.valueOf(3), Long.valueOf(l1), Integer.valueOf(i), localObject3, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(umY), Integer.valueOf(umZ), Integer.valueOf(((aq.n)localObject1).cSQ), ((aq.n)localObject1).uni });
            h.pYm.a(160L, 0L, 1L, false);
            if (-1 != b.lS(l1))
              h.pYm.a(160L, b.lS(l1), 1L, false);
            h.pYm.a(32L, 3L, 1L, true);
            h.pYm.a(32L, 7L, l1, true);
            if (umZ == 1)
            {
              h.pYm.a(32L, 16L, 1L, true);
              h.pYm.a(32L, 17L, l1, true);
            }
            ab.i("MicroMsg.WebviewReporter", "WebviewOpenUrlReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { localObject5, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(umY), Integer.valueOf(umZ), Integer.valueOf(((aq.n)localObject1).cSQ), ((aq.n)localObject1).uni });
            break;
          }
        }
      }
    }
    Object localObject6 = cXX();
    if (!bo.isNullOrNil(((aq.l)localObject6).unm))
      ab.d("MicroMsg.WebviewReporter", "WebViewVisitReporter report viewID = %s", new Object[] { ((aq.l)localObject6).unm });
    if (paramd != null)
      localObject3 = "";
    try
    {
      localObject5 = new android/os/Bundle;
      ((Bundle)localObject5).<init>(0);
      localObject5 = paramd.g(23, (Bundle)localObject5);
      if (localObject5 != null)
        localObject3 = ((Bundle)localObject5).getString("config_info_username");
      localPString = new PString();
      str2 = ((i)com.tencent.mm.kernel.g.K(i.class)).a(((aq.l)localObject6).rjC, localPString);
      ab.d("MicroMsg.WebviewReporter", "report 10643(%s), username : %s, msgId : %s, msgIndex : %s, scene : %s, enterTime : %s, stayTime : %s, rawUrl : %s, publisher : %s, viewId : %s, publishId : %s,appId : %s, newMsgId : %s, preUsername : %s, curUsername : %s, referUrl : %s, statExtStr:%s(%s), chatType:%d, title:%s, expidstr[chatting_exp]:%s, sourceAppId:%s, allStayTime %d", new Object[] { Integer.valueOf(10643), ((aq.l)localObject6).username, Long.valueOf(((aq.l)localObject6).unn), Integer.valueOf(((aq.l)localObject6).uno), Integer.valueOf(((aq.l)localObject6).scene), Long.valueOf(((aq.l)localObject6).edh), Long.valueOf(((aq.l)localObject6).iBA), ((aq.l)localObject6).cOG, ((aq.l)localObject6).unl, ((aq.l)localObject6).unm, ((aq.l)localObject6).fjS, ((aq.l)localObject6).appId, ((aq.l)localObject6).unp, ((aq.l)localObject6).unq, localObject3, ((aq.l)localObject6).unr, ((aq.l)localObject6).rjC, str2, Integer.valueOf(((aq.l)localObject6).uns), ((aq.l)localObject6).title, ((aq.l)localObject6).dJE, localPString.value, Long.valueOf(System.currentTimeMillis() - ((aq.l)localObject6).edh) });
      localObject5 = ((aq.l)localObject6).title;
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        PString localPString;
        String str2;
        localObject2 = URLEncoder.encode(((aq.l)localObject6).title, "UTF-8");
        localObject5 = localObject2;
        String str3 = ((aq.l)localObject6).username;
        l1 = ((aq.l)localObject6).unn;
        int j = ((aq.l)localObject6).uno;
        i = ((aq.l)localObject6).scene;
        long l2 = ((aq.l)localObject6).edh;
        long l3 = ((aq.l)localObject6).iBA;
        if (((aq.l)localObject6).cOG == null)
        {
          localObject2 = ((aq.l)localObject6).cOG;
          String str4 = ((aq.l)localObject6).unl;
          String str5 = ((aq.l)localObject6).unm;
          String str6 = ((aq.l)localObject6).fjS;
          String str7 = ((aq.l)localObject6).appId;
          String str8 = ((aq.l)localObject6).unp;
          String str9 = ((aq.l)localObject6).unq;
          if (((aq.l)localObject6).unr != null)
            break label1300;
          localObject1 = ((aq.l)localObject6).unr;
          com.tencent.mm.plugin.webview.ui.tools.g.a(paramd, 10643, new Object[] { str3, Long.valueOf(l1), Integer.valueOf(j), Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l3), localObject2, str4, str5, str6, str7, str8, str9, localObject3, localObject1, str2, Integer.valueOf(((aq.l)localObject6).uns), localObject5, ((aq.l)localObject6).dJE, localPString.value, "", "", "", Long.valueOf(System.currentTimeMillis() - ((aq.l)localObject6).edh), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(((aq.l)localObject6).unt) });
          localObject5 = cXY();
          if ((!bo.isNullOrNil(((aq.a)localObject5).fjS)) && (((aq.a)localObject5).fjS.startsWith("wrd")))
            break label1318;
          cXU().b(paramd);
          cXW().b(paramd);
          localObject3 = cYa();
          if (paramd == null)
            break label1644;
          i = aEn();
          if (!((c)localObject3).unc)
            break label1604;
          if (!((c)localObject3).loadFinished)
            break label1555;
          com.tencent.mm.plugin.webview.ui.tools.g.a(paramd, 11575, new Object[] { ((c)localObject3).cOG, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(i) });
          AppMethodBeat.o(6792);
          return;
          localRemoteException = localRemoteException;
          ab.w("MicroMsg.WebviewReporter", "invokeAsResult error, %s", new Object[] { localRemoteException });
          localObject4 = "";
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WebviewReporter", localException1, "", new Object[0]);
          continue;
          String str1 = ((aq.l)localObject6).cOG.replace(",", "!");
          continue;
          label1300: localObject1 = ((aq.l)localObject6).unr.replace(",", "!");
          continue;
          label1318: Object localObject4 = new StringBuffer();
          ((StringBuffer)localObject4).append("iswebviewreadtime=1");
          ((StringBuffer)localObject4).append("&publishid=");
          ((StringBuffer)localObject4).append(((aq.a)localObject5).fjS);
          ((StringBuffer)localObject4).append("&staytime=");
          ((StringBuffer)localObject4).append(((aq.a)localObject5).iBA);
          ((StringBuffer)localObject4).append("&allstaytime=");
          ((StringBuffer)localObject4).append(System.currentTimeMillis() - ((aq.a)localObject5).edh);
          ((StringBuffer)localObject4).append("&maxscrolly=");
          ((StringBuffer)localObject4).append(((aq.a)localObject5).una);
          ((StringBuffer)localObject4).append("&totalscrolly=");
          ((StringBuffer)localObject4).append(((aq.a)localObject5).rCb);
          ((StringBuffer)localObject4).append("&scene=");
          ((StringBuffer)localObject4).append(((aq.a)localObject5).scene);
          ((StringBuffer)localObject4).append("&entertime=");
          ((StringBuffer)localObject4).append(((aq.a)localObject5).edh);
          ((StringBuffer)localObject4).append("&screenheight=");
          ((StringBuffer)localObject4).append(a.ge(ah.getContext()));
          localObject5 = new Bundle();
          ((Bundle)localObject5).putString("reportString", ((StringBuffer)localObject4).toString());
          try
          {
            paramd.j(6, (Bundle)localObject5);
          }
          catch (Exception localException2)
          {
            ab.printErrStackTrace("MicroMsg.WebviewReporter", localException2, "TopStory report", new Object[0]);
          }
          continue;
          label1555: com.tencent.mm.plugin.webview.ui.tools.g.a(paramd, 11575, new Object[] { localException2.cOG, Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(i) });
          AppMethodBeat.o(6792);
          continue;
          label1604: com.tencent.mm.plugin.webview.ui.tools.g.a(paramd, 11575, new Object[] { localException2.cOG, Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(i) });
          label1644: AppMethodBeat.o(6792);
        }
      }
    }
  }

  public final aq.o cXT()
  {
    AppMethodBeat.i(6776);
    if (this.umJ == null)
      this.umJ = new aq.o(this);
    aq.o localo = this.umJ;
    AppMethodBeat.o(6776);
    return localo;
  }

  public final aq.m cXU()
  {
    AppMethodBeat.i(6777);
    if (this.umK == null)
      this.umK = new aq.m(this);
    aq.m localm = this.umK;
    AppMethodBeat.o(6777);
    return localm;
  }

  public final aq.n cXV()
  {
    AppMethodBeat.i(6778);
    if (this.umL == null)
      this.umL = new aq.n(this);
    aq.n localn = this.umL;
    AppMethodBeat.o(6778);
    return localn;
  }

  public final f cXW()
  {
    AppMethodBeat.i(6779);
    if (this.umS == null)
      this.umS = new f();
    f localf = this.umS;
    AppMethodBeat.o(6779);
    return localf;
  }

  public final aq.l cXX()
  {
    AppMethodBeat.i(6780);
    if (this.umM == null)
      this.umM = new aq.l();
    aq.l locall = this.umM;
    AppMethodBeat.o(6780);
    return locall;
  }

  public final aq.a cXY()
  {
    AppMethodBeat.i(6781);
    if (this.umN == null)
      this.umN = new aq.a();
    aq.a locala = this.umN;
    AppMethodBeat.o(6781);
    return locala;
  }

  public final aq.h cXZ()
  {
    AppMethodBeat.i(6782);
    if (this.umO == null)
      this.umO = new aq.h(this);
    aq.h localh = this.umO;
    AppMethodBeat.o(6782);
    return localh;
  }

  public final c cYa()
  {
    AppMethodBeat.i(6783);
    if (this.umP == null)
      this.umP = new c();
    c localc = this.umP;
    AppMethodBeat.o(6783);
    return localc;
  }

  public final aq.i cYb()
  {
    AppMethodBeat.i(6784);
    if (this.umQ == null)
      this.umQ = new aq.i();
    aq.i locali = this.umQ;
    AppMethodBeat.o(6784);
    return locali;
  }

  public final aq.e cYc()
  {
    AppMethodBeat.i(6785);
    if (this.umR == null)
      this.umR = new aq.e();
    aq.e locale = this.umR;
    AppMethodBeat.o(6785);
    return locale;
  }

  public final aq.k cYd()
  {
    AppMethodBeat.i(6786);
    if (this.umT == null)
      this.umT = new aq.k();
    aq.k localk = this.umT;
    AppMethodBeat.o(6786);
    return localk;
  }

  public final aq.j cYe()
  {
    AppMethodBeat.i(6787);
    if (this.umU == null)
      this.umU = new aq.j();
    aq.j localj = this.umU;
    AppMethodBeat.o(6787);
    return localj;
  }

  public final d cYf()
  {
    AppMethodBeat.i(6788);
    if (this.umV == null)
      this.umV = new d();
    d locald = this.umV;
    AppMethodBeat.o(6788);
    return locald;
  }

  public final aq.g cYg()
  {
    AppMethodBeat.i(6789);
    if (this.umX == null)
      this.umX = new aq.g();
    aq.g localg = this.umX;
    AppMethodBeat.o(6789);
    return localg;
  }

  public final void q(String paramString, Object paramObject)
  {
    AppMethodBeat.i(6790);
    if (this.umW != null);
    while (true)
    {
      try
      {
        this.umW.putValue(paramString, paramObject);
        AppMethodBeat.o(6790);
        return;
      }
      catch (Exception paramString)
      {
      }
      AppMethodBeat.o(6790);
    }
  }

  public static final class c
  {
    public String cOG;
    public boolean loadFinished = false;
    public boolean unc = false;
  }

  public static final class d
  {
    public boolean mlA = false;
    public boolean und = false;
  }

  public final class f
  {
    public int cSQ;
    public String iCz;
    public HashMap<String, Long> unf;
    public HashMap<String, Long> ung;
    public boolean unh;
    public String uni;

    public f()
    {
      AppMethodBeat.i(6762);
      this.iCz = "";
      this.unh = true;
      this.unf = new HashMap();
      this.ung = new HashMap();
      AppMethodBeat.o(6762);
    }

    public final void b(d paramd)
    {
      AppMethodBeat.i(6763);
      int i;
      Iterator localIterator;
      Object localObject;
      String str;
      long l;
      if (paramd != null)
      {
        i = aq.aEn();
        localIterator = this.unf.entrySet().iterator();
        if (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          str = (String)((Map.Entry)localObject).getKey();
          l = ((Long)((Map.Entry)localObject).getValue()).longValue();
          if ((l < 0L) || (l > 180000L))
            AppMethodBeat.o(6763);
        }
      }
      while (true)
      {
        return;
        localObject = this.uni;
        if (str == null);
        while (true)
        {
          aq.b(paramd, (String)localObject, new Object[] { Integer.valueOf(5), Long.valueOf(l), Integer.valueOf(i), str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(this.cSQ), this.uni });
          if (aq.access$000() == 1)
          {
            h.pYm.a(32L, 18L, 1L, true);
            h.pYm.a(32L, 19L, l, true);
          }
          h.pYm.a(32L, 8L, 1L, true);
          h.pYm.a(32L, 9L, l, true);
          ab.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report DomReady cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(this.cSQ), this.uni });
          break;
          str = str.replace(",", "!");
        }
        localIterator = this.ung.entrySet().iterator();
        if (localIterator.hasNext())
        {
          localObject = (Map.Entry)localIterator.next();
          str = (String)((Map.Entry)localObject).getKey();
          l = ((Long)((Map.Entry)localObject).getValue()).longValue();
          if ((l < 0L) || (l > 180000L))
          {
            AppMethodBeat.o(6763);
          }
          else
          {
            localObject = this.uni;
            if (str == null);
            while (true)
            {
              aq.b(paramd, (String)localObject, new Object[] { Integer.valueOf(6), Long.valueOf(l), Integer.valueOf(i), str, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(this.cSQ), this.uni });
              if (aq.access$000() == 1)
              {
                h.pYm.a(32L, 20L, 1L, true);
                h.pYm.a(32L, 21L, l, true);
              }
              h.pYm.a(32L, 10L, 1L, true);
              h.pYm.a(32L, 11L, l, true);
              ab.i("MicroMsg.WebviewReporter", "WebViewRenderReporter.report Render cost time : %d, netType : %d, coreType %d, httpType %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(this.cSQ), this.uni });
              break;
              str = str.replace(",", "!");
            }
          }
        }
        else
        {
          AppMethodBeat.o(6763);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aq
 * JD-Core Version:    0.6.2
 */