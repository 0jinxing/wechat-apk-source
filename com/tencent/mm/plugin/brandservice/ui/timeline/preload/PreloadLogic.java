package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.c.e;
import a.f.a.q;
import a.f.b.t;
import a.f.b.v;
import a.y;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.ipcinvoker.c;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.protocal.protobuf.bsq;
import com.tencent.mm.protocal.protobuf.chi;
import com.tencent.mm.protocal.protobuf.ef;
import com.tencent.mm.protocal.protobuf.hy;
import com.tencent.mm.protocal.protobuf.hz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.e.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.ac;
import kotlinx.coroutines.ao;
import kotlinx.coroutines.aw;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic;", "", "()V", "DEFAULT_PROCESS", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$Process;", "DELAY_TIME", "", "PROCESS_DEFAULT", "", "PROCESS_MM", "PROCESS_TOOLS", "PROCESS_TOOLSMP", "TAG", "", "caches", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$AppMsgContextCache;", "getCaches", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$AppMsgContextCache;", "cgiCallbackList", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Lkotlin/Function1;", "Landroid/os/Bundle;", "Lkotlin/ParameterName;", "name", "bundle", "", "getCgiCallbackList", "()Ljava/util/concurrent/ConcurrentHashMap;", "cgiCallbackList$delegate", "Lkotlin/Lazy;", "isInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPreloadOpen", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isRunning", "keys", "com/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$keys$1", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$keys$1;", "lastPreloadId", "preloadLimiter", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "getPreloadLimiter", "()Ljava/util/HashSet;", "preloadUrl", "Ljava/util/Queue;", "", "sProcess", "Ljava/lang/Integer;", "stopPreload", "addToPreload", "id", "url", "itemShowType", "openScene", "params", "", "(JLjava/lang/String;II[Ljava/lang/Object;)V", "batchSyncAppMsgContext", "reqList", "Landroid/support/v4/util/Pair;", "strip", "stripType", "canPreloadIn", "checkReportIfNeed", "checkTmplVer", "netType", "clear", "getAppMsgContext", "context", "session", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$PreloadSession;", "callback", "Lkotlin/Function3;", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$MountableCGIResult;", "Lcom/tencent/mm/protocal/protobuf/AppMsgContext;", "tmplType", "getBuilder", "Lcom/tencent/mm/modelbase/CommReqResp$Builder;", "", "getTmplVersion", "initDefaultProcess", "obtainTmplType", "bizTimeLineType", "preloadByIdAndUrls", "items", "preloadByInfoIdAndBuffer", "preloadNextWebView", "preloadWebview", "process", "report", "reportWithRetry", "requestAppMsg", "Lkotlin/Function2;", "Lcom/tencent/mm/protocal/protobuf/BatchGetAppMsgResp;", "run", "runCGI", "runCGICallback", "runInner", "startPreloadWebView", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "result", "Lcom/tencent/mm/plugin/brandservice/api/IBrandService$PreloadWebViewResult;", "rawUrl", "subScene", "openType", "updateWebview", "contentId", "getTmplType", "getUrl", "safeGet", "C", "T", "index", "default", "(Ljava/util/List;ILjava/lang/Object;)Ljava/lang/Object;", "toPreloadScene", "toReportScene", "AppMsgContextCache", "IPCInvoke_CheckReport", "IPCInvoke_CheckTmplVer", "IPCInvoke_PreloadWebview", "IPCInvoke_RUN_CGI", "IPCInvoke_Report", "IPCInvoke_UpdateWebview", "MountableCGIResult", "PreloadSession", "Process", "plugin-brandservice_release"})
public final class PreloadLogic
{
  private static final String TAG = "MicroMsg.PreloadLogic";
  private static final AtomicBoolean cnu;
  private static final HashSet<String> jKh;
  private static PreloadLogic.i jSE;
  private static final AtomicBoolean jSF;
  private static final int jSG = 0;
  private static final int jSH = 1;
  private static final int jSI = 2;
  private static final int jSJ;
  private static Integer jSK;
  private static final PreloadLogic.o jSL;
  private static final HashMap<Integer, Boolean> jSM;
  private static final PreloadLogic.a jSN;
  private static final a.f jSO;
  private static long jSP;
  private static Queue<List<Object>> jSQ;
  private static final boolean jSR = false;
  public static final PreloadLogic jSS;

  static
  {
    AppMethodBeat.i(14913);
    eQB = new a.i.k[] { (a.i.k)v.a(new t(v.aN(PreloadLogic.class), "cgiCallbackList", "getCgiCallbackList()Ljava/util/concurrent/ConcurrentHashMap;")) };
    jSS = new PreloadLogic();
    TAG = "MicroMsg.PreloadLogic";
    cnu = new AtomicBoolean(false);
    jSE = PreloadLogic.i.jTh;
    jSF = new AtomicBoolean(false);
    jSH = 1;
    jSI = 2;
    jSJ = jSG;
    jSL = new PreloadLogic.o();
    jSM = new HashMap();
    jSN = new PreloadLogic.a();
    jSO = a.g.g((a.f.a.a)PreloadLogic.l.jTn);
    jSQ = (Queue)new LinkedList();
    jKh = new HashSet();
    AppMethodBeat.o(14913);
  }

  public static final void FO(String paramString)
  {
    AppMethodBeat.i(14935);
    a.f.b.j.p(paramString, "url");
    Bundle localBundle = new Bundle();
    localBundle.putString("url", paramString);
    com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", (Parcelable)localBundle, PreloadLogic.f.class, null);
    AppMethodBeat.o(14935);
  }

  private static com.tencent.mm.ai.b.a a(Iterable<? extends android.support.v4.f.j<String, Integer>> paramIterable, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(14930);
    hy localhy = new hy();
    localhy.vKt = d.aWX();
    localhy.vKu = l.aXx();
    localhy.vKs = new LinkedList();
    localhy.vKv = paramInt2;
    localhy.vKw = paramInt3;
    Collection localCollection = (Collection)new ArrayList(a.a.j.d(paramIterable));
    Object localObject = paramIterable.iterator();
    while (((Iterator)localObject).hasNext())
    {
      android.support.v4.f.j localj = (android.support.v4.f.j)((Iterator)localObject).next();
      bsq localbsq = new bsq();
      localbsq.Url = a(localj);
      localbsq.vFW = 0;
      localbsq.Scene = paramInt1;
      ef localef = jSN.FP(a(localj));
      if (localef != null)
      {
        localbsq.vFW = localef.vFW;
        if (localef.vFY < com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.sv(b(localj)).Version)
          localbsq.vFW = 0;
      }
      localCollection.add(localbsq);
    }
    localObject = (List)localCollection;
    localhy.vKs.addAll((Collection)localObject);
    ab.i(TAG, "[batchSyncAppMsgContext]urlList ReqInfoList:%d", new Object[] { Integer.valueOf(localhy.vKs.size()) });
    ab.d(TAG, "[batchSyncAppMsgContext]urlList:%s", new Object[] { paramIterable });
    paramIterable = new com.tencent.mm.ai.b.a();
    paramIterable.kU(2594);
    paramIterable.qq("/cgi-bin/mmbiz-bin/batchgetappmsg");
    paramIterable.kV(0);
    paramIterable.kW(0);
    paramIterable.a((com.tencent.mm.bt.a)localhy);
    paramIterable.b((com.tencent.mm.bt.a)new hz());
    switch (paramInt1)
    {
    default:
      paramInt1 = 35;
    case 90:
    case 0:
    }
    while (true)
    {
      com.tencent.mm.plugin.webview.preload.a.gv(paramInt1, localhy.vKs.size());
      AppMethodBeat.o(14930);
      return paramIterable;
      paramInt1 = 34;
      continue;
      paramInt1 = 35;
    }
  }

  private static String a(android.support.v4.f.j<String, Integer> paramj)
  {
    AppMethodBeat.i(14936);
    paramj = paramj.first;
    if (paramj == null)
      a.f.b.j.dWJ();
    paramj = (String)paramj;
    AppMethodBeat.o(14936);
    return paramj;
  }

  public static final void a(long paramLong, String paramString, int paramInt1, int paramInt2, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(14931);
    a.f.b.j.p(paramString, "url");
    a.f.b.j.p(paramArrayOfObject, "params");
    if (jSR)
      AppMethodBeat.o(14931);
    while (true)
    {
      return;
      kotlinx.coroutines.f.a((ac)aw.BQs, (e)ao.elk(), (a.f.a.m)new PreloadLogic.j(paramLong, paramString, paramInt1, paramInt2, paramArrayOfObject, null));
      AppMethodBeat.o(14931);
    }
  }

  private static void a(Bundle paramBundle, a.f.a.b<? super Bundle, y> paramb)
  {
    AppMethodBeat.i(14928);
    long l1 = System.currentTimeMillis();
    long l2 = System.currentTimeMillis() % 100L;
    ArrayList localArrayList = paramBundle.getStringArrayList("urls");
    Object localObject1;
    if ((localArrayList != null) && (localArrayList.size() == 1))
    {
      localObject1 = localArrayList.get(0);
      a.f.b.j.o(localObject1, "urls[0]");
      localObject1 = b.FJ((String)localObject1);
      if (aXq().containsKey(localObject1))
      {
        paramBundle = (ConcurrentLinkedDeque)aXq().get(localObject1);
        if (paramBundle != null)
          paramBundle.add(paramb);
        ab.v(TAG, "terry trace cgi mounted:" + (String)localObject1 + '#' + l2);
        AppMethodBeat.o(14928);
      }
    }
    while (true)
    {
      return;
      localObject1 = paramBundle.getIntegerArrayList("tmplTypes");
      int i = paramBundle.getInt("openScene");
      int j = paramBundle.getInt("strip", 0);
      int k = paramBundle.getInt("stripType", 0);
      paramBundle = new LinkedList();
      int m = localArrayList.size();
      for (int n = 0; n < m; n++)
      {
        paramBundle.add(new android.support.v4.f.j(localArrayList.get(n), ((ArrayList)localObject1).get(n)));
        Object localObject2 = localArrayList.get(n);
        a.f.b.j.o(localObject2, "urls[i]");
        localObject2 = b.FJ((String)localObject2);
        ((Map)aXq()).put(localObject2, new ConcurrentLinkedDeque());
        ab.v(TAG, "terry trace cgi send:" + (String)localObject2 + '#' + l2);
      }
      w.a(a((Iterable)paramBundle, i, j, k).acD(), (w.a)new PreloadLogic.u(l1, l2, paramb, localArrayList));
      AppMethodBeat.o(14928);
    }
  }

  private static void a(PreloadLogic.i parami)
  {
    AppMethodBeat.i(14918);
    a.f.b.j.p(parami, "process");
    g.a locala = g.jSD;
    if (!g.a.aXe())
      AppMethodBeat.o(14918);
    while (true)
    {
      return;
      com.tencent.mm.ipcinvoker.f.a(parami.processName, (Parcelable)new IPCInteger(0), d.class, null);
      AppMethodBeat.o(14918);
    }
  }

  private static void a(PreloadLogic.i parami, int paramInt)
  {
    AppMethodBeat.i(14915);
    ab.i(TAG, "start in ".concat(String.valueOf(parami)));
    aj(paramInt, d.aWX());
    a(parami);
    aXs();
    clear();
    AppMethodBeat.o(14915);
  }

  private static void a(List<? extends android.support.v4.f.j<String, Integer>> paramList, int paramInt1, int paramInt2, int paramInt3, a.f.a.m<? super PreloadLogic.h, ? super hz, y> paramm)
  {
    AppMethodBeat.i(14926);
    Bundle localBundle = new Bundle();
    Object localObject1 = (Iterable)paramList;
    Object localObject2 = (Collection)new ArrayList(a.a.j.d((Iterable)localObject1));
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
      ((Collection)localObject2).add(a((android.support.v4.f.j)((Iterator)localObject1).next()));
    localBundle.putStringArrayList("urls", new ArrayList((Collection)localObject2));
    localObject2 = (Iterable)paramList;
    paramList = (Collection)new ArrayList(a.a.j.d((Iterable)localObject2));
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
      paramList.add(Integer.valueOf(b((android.support.v4.f.j)((Iterator)localObject2).next())));
    localBundle.putIntegerArrayList("tmplTypes", new ArrayList((Collection)paramList));
    localBundle.putInt("openScene", paramInt1);
    localBundle.putInt("strip", paramInt2);
    localBundle.putInt("stripType", paramInt3);
    paramList = com.tencent.mm.kernel.g.RM().Rn();
    a.f.b.j.o(paramList, "MMKernel.process().current()");
    if (((com.tencent.mm.kernel.b.h)paramList).SG())
    {
      a(localBundle, (a.f.a.b)new PreloadLogic.r(paramm));
      AppMethodBeat.o(14926);
    }
    while (true)
    {
      return;
      com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", (Parcelable)localBundle, PreloadLogic.e.class, (c)new PreloadLogic.s(paramm));
      AppMethodBeat.o(14926);
    }
  }

  private final boolean a(Context paramContext, PreloadLogic.i parami, Intent paramIntent, PreloadLogic.PreloadSession paramPreloadSession, com.tencent.mm.plugin.brandservice.a.b.a parama)
  {
    AppMethodBeat.i(14922);
    TmplParams localTmplParams = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.sx(paramPreloadSession.jSV);
    boolean bool1;
    if (localTmplParams == null)
    {
      ab.e(TAG, "tmplParams is null");
      parama.success = false;
      parama.message = ("not support tmplType=" + paramPreloadSession + ".tmplType");
      bool1 = false;
      AppMethodBeat.o(14922);
    }
    while (true)
    {
      return bool1;
      bool1 = WXHardCoderJNI.hcBizEnable;
      int i = WXHardCoderJNI.hcBizDelay;
      int j = WXHardCoderJNI.hcBizCPU;
      int k = WXHardCoderJNI.hcBizIO;
      label108: Object localObject1;
      Object localObject2;
      if (WXHardCoderJNI.hcBizThr)
      {
        m = Process.myTid();
        m = WXHardCoderJNI.startPerformance(bool1, i, j, k, m, WXHardCoderJNI.hcBizTimeout, 902, WXHardCoderJNI.hcBizAction, TAG);
        ab.i(TAG, "summer hardcoder biz startPerformance [%s][%s]", new Object[] { Integer.valueOf(902), Integer.valueOf(m) });
        localObject1 = localTmplParams.jSY;
        a.f.b.j.o(localObject1, "tmplParams.uid");
        a.f.b.j.p(localObject1, "<set-?>");
        paramPreloadSession.jSY = ((String)localObject1);
        com.tencent.mm.plugin.webview.preload.a.gu(localTmplParams.upQ, 104);
        localObject1 = bJ(paramPreloadSession.url, paramPreloadSession.jSV);
        if (localObject1 == null)
          break label377;
        localObject2 = ((ef)localObject1).vFV;
        if (localObject2 == null)
          break label377;
        if (a.k.m.ar((CharSequence)localObject2))
          break label371;
      }
      label371: for (int m = 1; ; m = 0)
      {
        if (m != 1)
          break label377;
        parami = new Intent();
        paramIntent = ((ef)localObject1).vFV;
        a.f.b.j.o(paramIntent, "appMsgContext.ForceUrl");
        paramIntent = m.a(paramIntent, paramPreloadSession);
        ab.i(TAG, "appMsgContext forceUrl:%s", new Object[] { paramIntent });
        parami.putExtra("rawUrl", paramIntent);
        com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", parami);
        com.tencent.mm.plugin.webview.preload.a.gu(localTmplParams.upQ, 107);
        parama.success = false;
        parama.message = "has forceUrl=".concat(String.valueOf(paramIntent));
        bool1 = true;
        AppMethodBeat.o(14922);
        break;
        m = 0;
        break label108;
      }
      label377: paramPreloadSession.jSZ = true;
      parama = com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.sv(localTmplParams.jSV);
      paramPreloadSession.jTb = l.d(parama);
      boolean bool2 = a.f.b.j.j(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.getPrefix(), "mptmpl://");
      if ((l.d(parama)) && (bool2))
      {
        bool1 = true;
        label430: paramPreloadSession.jTc = bool1;
        if ((!l.d(parama)) || (bool2))
          break label897;
        bool1 = true;
        label453: paramPreloadSession.jTd = bool1;
        if ((localObject1 == null) || (!b.b((ef)localObject1)))
          break label903;
        paramPreloadSession.jTa = true;
        if (paramPreloadSession.jSV == 0)
        {
          parama = b.a((ef)localObject1);
          localObject2 = paramIntent.getStringExtra("rawUrl");
          a.f.b.j.o(localObject2, "intent.getStringExtra(Co…antsUI.WebViewUI.KRawUrl)");
          String str = m.a((String)localObject2, paramPreloadSession);
          a.f.b.j.p(parama, "contentId");
          a.f.b.j.p(str, "url");
          PreloadLogic.i locali = jSE;
          a.f.b.j.p(locali, "process");
          a.f.b.j.p(parama, "contentId");
          a.f.b.j.p(str, "url");
          localObject2 = new Bundle();
          ((Bundle)localObject2).putInt("tmplType", 0);
          ((Bundle)localObject2).putString("contentId", parama);
          ((Bundle)localObject2).putString("url", str);
          ((Bundle)localObject2).putLong("startLoadPage", System.currentTimeMillis());
          com.tencent.mm.ipcinvoker.f.a(locali.processName, (Parcelable)localObject2, PreloadLogic.g.class, null);
        }
        ab.i(TAG, "set contentId:%s", new Object[] { b.a((ef)localObject1) });
        label652: localObject1 = e.m.ygf;
        parama = g.jSD;
        paramIntent.putExtra((String)localObject1, g.a.aXe());
        paramIntent.putExtra(e.m.ygg, System.currentTimeMillis());
        paramIntent.putExtra(e.m.ygi, paramPreloadSession.url);
        paramIntent.putExtra(e.m.yge, (Parcelable)localTmplParams);
        paramIntent.putExtra(e.m.ygq, (Parcelable)paramPreloadSession);
        paramIntent.putExtra(e.m.ygn, Process.myPid());
      }
      try
      {
        parama = e.m.ygm;
        localObject1 = new com/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$v;
        ((v)localObject1).<init>(parami);
        paramIntent.putExtra(parama, d.a(paramContext, (a.f.a.b)localObject1));
        switch (i.eQZ[parami.ordinal()])
        {
        default:
          parami = "MM";
        case 1:
        case 2:
        case 3:
        }
        while (true)
        {
          parama = new java/lang/StringBuilder;
          parama.<init>(".ui.timeline.preload.ui.TmplWebView");
          com.tencent.mm.bp.d.b(paramContext, "brandservice", parami + "UI", paramIntent);
          com.tencent.mm.plugin.webview.preload.a.gu(localTmplParams.upQ, 106);
          com.tencent.mm.plugin.webview.preload.a.IU(100);
          if (paramPreloadSession.jTb)
          {
            com.tencent.mm.plugin.webview.preload.a.gu(localTmplParams.upQ, 231);
            com.tencent.mm.plugin.webview.preload.a.IU(110);
          }
          bool1 = true;
          AppMethodBeat.o(14922);
          break;
          bool1 = false;
          break label430;
          label897: bool1 = false;
          break label453;
          label903: a(paramContext, paramPreloadSession.url, paramPreloadSession, (q)m.jTo);
          break label652;
          parami = "MM";
          continue;
          parami = "Tool";
          continue;
          parami = "TooLMp";
        }
      }
      catch (Exception paramContext)
      {
        bool1 = false;
        AppMethodBeat.o(14922);
      }
    }
  }

  private static boolean a(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, Intent paramIntent, int paramInt4, com.tencent.mm.plugin.brandservice.a.b.a parama)
  {
    AppMethodBeat.i(14920);
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(paramString, "rawUrl");
    a.f.b.j.p(paramIntent, "intent");
    a.f.b.j.p(parama, "result");
    boolean bool;
    if (a.k.m.ar((CharSequence)paramString))
    {
      parama.success = false;
      parama.message = "invalid url";
      bool = false;
      AppMethodBeat.o(14920);
    }
    while (true)
    {
      return bool;
      if (m.FC(paramString))
        break;
      parama.success = false;
      parama.message = "invalid host";
      bool = false;
      AppMethodBeat.o(14920);
    }
    Object localObject1;
    int i;
    if (paramInt1 == -1)
    {
      localObject1 = jSN.FP(paramString);
      if (localObject1 != null)
        i = ((ef)localObject1).vGc;
    }
    label131: for (int j = i; ; j = paramInt1)
    {
      int k = sl(j);
      if (k == -1)
      {
        parama.success = false;
        parama.message = "invalid itemShowType:".concat(String.valueOf(j));
        bool = false;
        AppMethodBeat.o(14920);
        break;
        i = paramInt1;
        break label131;
      }
      int m = s.getSessionId();
      if (paramInt2 == 90)
      {
        paramString = m.G(m.G(paramString, "scene", String.valueOf(paramInt2)), "subscene", String.valueOf(paramInt3));
        label222: paramIntent.putExtra(e.m.ygo, j);
        paramIntent.putExtra(e.m.ygj, m);
        paramIntent.putExtra(e.m.ygk, paramInt2);
        paramIntent.putExtra(e.m.ygl, paramInt3);
        paramIntent.putExtra(e.m.ygp, paramInt4);
        paramString = new PreloadLogic.PreloadSession(m, paramString, k, paramInt2, paramInt3, paramIntent.getIntExtra("geta8key_scene", 0));
        if (j == paramInt1)
          break label537;
        bool = true;
        label310: paramString.jSa = bool;
        bool = jSS.a(paramContext, jSE, paramIntent, paramString, parama);
        if (bool)
        {
          if ((paramInt4 != -1) && ((paramContext instanceof MMActivity)) && (paramInt4 == 1))
            ((MMActivity)paramContext).overridePendingTransition(2131034229, 2131034228);
          switch (paramInt2)
          {
          default:
            paramInt1 = -1;
          case 2:
          case 90:
          case 0:
          case 1:
          }
        }
      }
      while (true)
      {
        com.tencent.mm.plugin.webview.preload.a.IT(paramInt1);
        AppMethodBeat.o(14920);
        break;
        Object localObject2 = m.dg(paramString, "scene");
        i = paramInt2;
        if (localObject2 != null)
        {
          localObject1 = (CharSequence)localObject2;
          i = paramInt2;
          if (new a.k.k("\\d+").aq((CharSequence)localObject1))
            i = Integer.parseInt((String)localObject2);
        }
        localObject1 = m.dg(paramString, "subscene");
        if (localObject1 != null)
        {
          localObject2 = (CharSequence)localObject1;
          if (new a.k.k("\\d+").aq((CharSequence)localObject2))
            paramInt3 = Integer.parseInt((String)localObject1);
          paramInt2 = i;
          break label222;
        }
        paramInt2 = i;
        break label222;
        label537: bool = false;
        break label310;
        paramInt1 = 0;
        continue;
        paramInt1 = 1;
        continue;
        paramInt1 = 2;
        continue;
        paramInt1 = 3;
      }
    }
  }

  public static final void aXo()
  {
    AppMethodBeat.i(14917);
    a(jSE);
    AppMethodBeat.o(14917);
  }

  public static PreloadLogic.a aXp()
  {
    return jSN;
  }

  public static ConcurrentHashMap<String, ConcurrentLinkedDeque<a.f.a.b<Bundle, y>>> aXq()
  {
    AppMethodBeat.i(14929);
    ConcurrentHashMap localConcurrentHashMap = (ConcurrentHashMap)jSO.getValue();
    AppMethodBeat.o(14929);
    return localConcurrentHashMap;
  }

  public static HashSet<String> aXr()
  {
    return jKh;
  }

  private static void aXs()
  {
    AppMethodBeat.i(14934);
    com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", null, PreloadLogic.b.class, null);
    AppMethodBeat.o(14934);
  }

  private static void aj(int paramInt, String paramString)
  {
    AppMethodBeat.i(14919);
    a.f.b.j.p(paramString, "netType");
    Bundle localBundle = new Bundle();
    localBundle.putInt("openScene", paramInt);
    localBundle.putString("netType", paramString);
    com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", (Parcelable)localBundle, PreloadLogic.c.class, null);
    AppMethodBeat.o(14919);
  }

  private static int b(android.support.v4.f.j<String, Integer> paramj)
  {
    AppMethodBeat.i(14937);
    paramj = paramj.second;
    if (paramj == null)
      a.f.b.j.dWJ();
    int i = ((Number)paramj).intValue();
    AppMethodBeat.o(14937);
    return i;
  }

  private static ef bJ(String paramString, int paramInt)
  {
    AppMethodBeat.i(14924);
    a.f.b.j.p(paramString, "url");
    if (a.k.m.ar((CharSequence)paramString))
    {
      ab.e(TAG, "[findAppMsgContextInCache] url is null, return");
      AppMethodBeat.o(14924);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      if (jSN.bK(paramString, paramInt))
      {
        paramString = jSN.FP(paramString);
        AppMethodBeat.o(14924);
      }
      else
      {
        AppMethodBeat.o(14924);
        paramString = null;
      }
    }
  }

  private static void clear()
  {
    AppMethodBeat.i(14916);
    b.aWP();
    ab.i(TAG, "clear() isOk:true");
    com.tencent.mm.plugin.brandservice.ui.timeline.preload.b.b.aXz();
    AppMethodBeat.o(14916);
  }

  public static final void i(List<? extends List<String>> paramList, int paramInt)
  {
    AppMethodBeat.i(14933);
    a.f.b.j.p(paramList, "items");
    if (jSR)
      AppMethodBeat.o(14933);
    while (true)
    {
      return;
      jSP = 0L;
      jSQ.clear();
      kotlinx.coroutines.f.a((ac)aw.BQs, (e)ao.elk(), (a.f.a.m)new PreloadLogic.p(paramList, paramInt, null));
      AppMethodBeat.o(14933);
    }
  }

  public static final void j(List<String[]> paramList, int paramInt)
  {
    AppMethodBeat.i(14932);
    a.f.b.j.p(paramList, "items");
    if (jSR)
      AppMethodBeat.o(14932);
    while (true)
    {
      return;
      if (!rW(sm(paramInt)))
      {
        AppMethodBeat.o(14932);
      }
      else
      {
        jSP = 0L;
        jSQ.clear();
        kotlinx.coroutines.f.a((ac)aw.BQs, (e)ao.elk(), (a.f.a.m)new PreloadLogic.q(paramInt, paramList, null));
        AppMethodBeat.o(14932);
      }
    }
  }

  public static final void mg(int paramInt)
  {
    AppMethodBeat.i(14914);
    if (jSF.get())
      AppMethodBeat.o(14914);
    while (true)
    {
      return;
      if (paramInt == 10000)
      {
        a(jSE, paramInt);
        jSF.set(false);
        AppMethodBeat.o(14914);
      }
      else
      {
        Looper.myQueue().addIdleHandler((MessageQueue.IdleHandler)new PreloadLogic.t(paramInt));
        AppMethodBeat.o(14914);
      }
    }
  }

  public static final boolean rW(int paramInt)
  {
    AppMethodBeat.i(14923);
    Object localObject;
    boolean bool;
    if (jSM.containsKey(Integer.valueOf(paramInt)))
    {
      localObject = jSM.get(Integer.valueOf(paramInt));
      if (localObject == null)
        a.f.b.j.dWJ();
      bool = ((Boolean)localObject).booleanValue();
      AppMethodBeat.o(14923);
    }
    while (true)
    {
      return bool;
      localObject = g.jSD;
      if ((!g.a.aXm()) && ((com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) || (com.tencent.mm.sdk.platformtools.f.DEBUG)))
      {
        localObject = (Map)jSM;
        g.a locala = g.jSD;
        ((Map)localObject).put(Integer.valueOf(paramInt), Boolean.valueOf(h.aXn().getBoolean("preload_use", true)));
        localObject = jSM.get(Integer.valueOf(paramInt));
        if (localObject == null)
          a.f.b.j.dWJ();
        bool = ((Boolean)localObject).booleanValue();
        AppMethodBeat.o(14923);
      }
      else
      {
        try
        {
          localObject = (Map)jSM;
          switch (paramInt)
          {
          default:
            bool = false;
          case 1:
          case 2:
          case 3:
          case 13:
          case 23:
          case 4:
          case 14:
          case 24:
          case 5:
          case 6:
          case 16:
          case 26:
          case 20:
          case 7:
          case 101:
          }
          while (true)
          {
            ((Map)localObject).put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
            if (!jSM.containsKey(Integer.valueOf(paramInt)))
              break label887;
            localObject = jSM.get(Integer.valueOf(paramInt));
            if (localObject == null)
              a.f.b.j.dWJ();
            a.f.b.j.o(localObject, "isPreloadOpen[openScene]!!");
            bool = ((Boolean)localObject).booleanValue();
            AppMethodBeat.o(14923);
            break;
            if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHM, 0) != 0)
            {
              bool = true;
            }
            else
            {
              bool = false;
              continue;
              if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHN, 0) != 0)
              {
                bool = true;
              }
              else
              {
                bool = false;
                continue;
                if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHO, 0) & 0x1) != 0)
                {
                  bool = true;
                }
                else
                {
                  bool = false;
                  continue;
                  if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHO, 0) & 0x2) != 0)
                  {
                    bool = true;
                  }
                  else
                  {
                    bool = false;
                    continue;
                    if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHO, 0) & 0x4) != 0)
                    {
                      bool = true;
                    }
                    else
                    {
                      bool = false;
                      continue;
                      if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHP, 0) & 0x1) != 0)
                      {
                        bool = true;
                      }
                      else
                      {
                        bool = false;
                        continue;
                        if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHP, 0) & 0x2) != 0)
                        {
                          bool = true;
                        }
                        else
                        {
                          bool = false;
                          continue;
                          if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHP, 0) & 0x4) != 0)
                          {
                            bool = true;
                          }
                          else
                          {
                            bool = false;
                            continue;
                            if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHS, 0) != 0)
                            {
                              bool = true;
                            }
                            else
                            {
                              bool = false;
                              continue;
                              if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHT, 0) & 0x1) != 0)
                              {
                                bool = true;
                              }
                              else
                              {
                                bool = false;
                                continue;
                                if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHT, 0) & 0x2) != 0)
                                {
                                  bool = true;
                                }
                                else
                                {
                                  bool = false;
                                  continue;
                                  if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHT, 0) & 0x4) != 0)
                                  {
                                    bool = true;
                                  }
                                  else
                                  {
                                    bool = false;
                                    continue;
                                    if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHL, 0) != 0)
                                    {
                                      bool = true;
                                    }
                                    else
                                    {
                                      bool = false;
                                      continue;
                                      if ((((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHU, 0) & 0x1) != 0)
                                      {
                                        bool = true;
                                      }
                                      else
                                      {
                                        bool = false;
                                        continue;
                                        int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHV, 0);
                                        if ((i & 0x1) != 0)
                                          bool = true;
                                        else
                                          bool = false;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ((Map)jSM).put(Integer.valueOf(paramInt), Boolean.FALSE);
            ab.printErrStackTrace(TAG, (Throwable)localException, "canPreloadIn", new Object[0]);
          }
          label887: AppMethodBeat.o(14923);
          bool = false;
        }
      }
    }
  }

  private static int sl(int paramInt)
  {
    switch (paramInt)
    {
    case 1:
    case 2:
    case 3:
    case 4:
    case 6:
    default:
      paramInt = -1;
    case 0:
    case 8:
    case 5:
    case 7:
    }
    while (true)
    {
      return paramInt;
      paramInt = 0;
      continue;
      paramInt = 2;
      continue;
      paramInt = 1;
      continue;
      paramInt = 3;
    }
  }

  private static int sm(int paramInt)
  {
    int i = 2;
    switch (paramInt)
    {
    default:
      i = 0;
    case 0:
    case 92:
    case 1:
    case 2:
    case 126:
    }
    while (true)
    {
      return i;
      i = 13;
      continue;
      i = 14;
      continue;
      i = 6;
    }
  }

  public final void a(Object paramObject, String paramString, PreloadLogic.PreloadSession paramPreloadSession, q<? super WeakReference<Object>, ? super PreloadLogic.h, ? super ef, y> paramq)
  {
    AppMethodBeat.i(14925);
    a.f.b.j.p(paramObject, "context");
    a.f.b.j.p(paramString, "url");
    a.f.b.j.p(paramPreloadSession, "session");
    a.f.b.j.p(paramq, "callback");
    paramObject = new WeakReference(paramObject);
    Object localObject1 = new PreloadLogic.h(false, System.currentTimeMillis(), System.currentTimeMillis(), false, (byte)0);
    Object localObject2 = g.jSD;
    if (g.a.aXg())
    {
      ((PreloadLogic.h)localObject1).cxT = true;
      paramq.g(paramObject, localObject1, new ef());
      AppMethodBeat.o(14925);
    }
    while (true)
    {
      return;
      if ((a.k.m.ar((CharSequence)paramString)) || (!m.FC(paramString)))
      {
        paramq.g(paramObject, localObject1, new ef());
        AppMethodBeat.o(14925);
      }
      else
      {
        localObject2 = bJ(paramString, paramPreloadSession.jSV);
        if (localObject2 != null)
        {
          ((PreloadLogic.h)localObject1).cxT = true;
          ((PreloadLogic.h)localObject1).jSU = true;
          paramq.g(paramObject, localObject1, localObject2);
          AppMethodBeat.o(14925);
        }
        else
        {
          paramString = m.a(paramString, paramPreloadSession);
          localObject1 = new LinkedList();
          ((LinkedList)localObject1).add(new android.support.v4.f.j(paramString, Integer.valueOf(paramPreloadSession.jSV)));
          a((List)localObject1, paramPreloadSession.jSV, (a.f.a.m)new PreloadLogic.n(paramString, paramq, paramObject));
          AppMethodBeat.o(14925);
        }
      }
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$IPCInvoke_PreloadWebview;", "Lcom/tencent/mm/ipcinvoker/IPCAsyncInvokeTask;", "Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "()V", "invoke", "", "type", "callback", "Lcom/tencent/mm/ipcinvoker/IPCInvokeCallback;", "plugin-brandservice_release"})
  static final class d
    implements com.tencent.mm.ipcinvoker.a<IPCInteger, IPCVoid>
  {
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "<anonymous parameter 0>", "Ljava/lang/ref/WeakReference;", "", "<anonymous parameter 1>", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/PreloadLogic$MountableCGIResult;", "<anonymous parameter 2>", "Lcom/tencent/mm/protocal/protobuf/AppMsgContext;", "invoke"})
  static final class m extends a.f.b.k
    implements q<WeakReference<Object>, PreloadLogic.h, ef, y>
  {
    public static final m jTo;

    static
    {
      AppMethodBeat.i(14889);
      jTo = new m();
      AppMethodBeat.o(14889);
    }

    m()
    {
      super();
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "invoke"})
  static final class v extends a.f.b.k
    implements a.f.a.b<ActivityManager.RunningAppProcessInfo, Boolean>
  {
    v(PreloadLogic.i parami)
    {
      super();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic
 * JD-Core Version:    0.6.2
 */