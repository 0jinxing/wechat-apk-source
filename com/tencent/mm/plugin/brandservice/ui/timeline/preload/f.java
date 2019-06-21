package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.a.e;
import a.f.b.j;
import a.f.b.t;
import a.f.b.v;
import a.f.b.x;
import a.g;
import a.i.k;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.preload.TmplParams;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/Kv15862;", "", "()V", "MAX_LIMIT", "", "MM_WEBIVEW_PRELOAD_LOAD_TIME", "", "TAG", "", "a8KeyFinishTime", "bindWebViewCostTime", "cacheItemShowType", "", "getCacheItemShowType", "()Z", "setCacheItemShowType", "(Z)V", "clientCachedTime", "getClientCachedTime", "()I", "setClientCachedTime", "(I)V", "clientFirstFinishTime", "contentId", "getContentId", "()Ljava/lang/String;", "contentId$delegate", "Lkotlin/Lazy;", "createWebViewCostTime", "ctWebCompile", "getCtWebCompile", "()J", "setCtWebCompile", "(J)V", "ctWebFirstScreen", "getCtWebFirstScreen", "setCtWebFirstScreen", "dataCachedTime", "getDataCachedTime", "dataCachedTime$delegate", "dataVersion", "getDataVersion", "dataVersion$delegate", "etWebFirstScreen", "getEtWebFirstScreen", "setEtWebFirstScreen", "evalCostTime", "getEvalCostTime", "setEvalCostTime", "evalPageDataCostTime", "getA8KeyCostTime", "getPageDataCostTime", "hasAuth", "getHasAuth", "setHasAuth", "hasInject", "getHasInject", "setHasInject", "injectCostTime", "invalidId", "getInvalidId", "invalidId$delegate", "isInjectSuccess", "setInjectSuccess", "isMounted", "setMounted", "isOnlineWebView", "setOnlineWebView", "isPrefixMP", "setPrefixMP", "isSyncGetPageData", "setSyncGetPageData", "isWebViewCreated", "setWebViewCreated", "isWebViewPreUpdated", "setWebViewPreUpdated", "isWebViewProcessCreated", "setWebViewProcessCreated", "isZip", "setZip", "key", "getKey", "setKey", "(Ljava/lang/String;)V", "openScene", "getOpenScene", "setOpenScene", "pageDataSize", "getPageDataSize", "pageDataSize$delegate", "pageFinishTime", "pageFinishTimeType", "pageFinishTimestamp", "relaunchState", "getRelaunchState", "setRelaunchState", "speedMatrix", "", "getSpeedMatrix", "()[Ljava/lang/Long;", "speedMatrix$delegate", "tmplParams", "Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "getTmplParams", "()Lcom/tencent/mm/plugin/webview/preload/TmplParams;", "setTmplParams", "(Lcom/tencent/mm/plugin/webview/preload/TmplParams;)V", "tsEndAcGetData", "getTsEndAcGetData", "setTsEndAcGetData", "tsEndGetA8Key", "getTsEndGetA8Key", "setTsEndGetA8Key", "tsEndGetData", "getTsEndGetData", "setTsEndGetData", "tsEndInject", "getTsEndInject", "setTsEndInject", "tsEndNotifyPage", "getTsEndNotifyPage", "setTsEndNotifyPage", "tsEndPostBind", "getTsEndPostBind", "setTsEndPostBind", "tsEndProcessInit", "getTsEndProcessInit", "setTsEndProcessInit", "tsEndTmplLoad", "getTsEndTmplLoad", "setTsEndTmplLoad", "tsEndUIInit", "getTsEndUIInit", "setTsEndUIInit", "tsEndWebGetData", "getTsEndWebGetData", "setTsEndWebGetData", "tsEndWebInject", "getTsEndWebInject", "setTsEndWebInject", "tsEndWebViewCreate", "getTsEndWebViewCreate", "setTsEndWebViewCreate", "tsStartAcGetData", "getTsStartAcGetData", "setTsStartAcGetData", "tsStartEndBind", "getTsStartEndBind", "setTsStartEndBind", "tsStartGetA8Key", "getTsStartGetA8Key", "setTsStartGetA8Key", "tsStartGetData", "getTsStartGetData", "setTsStartGetData", "tsStartInject", "getTsStartInject", "setTsStartInject", "tsStartPage", "getTsStartPage", "setTsStartPage", "tsStartPostBind", "getTsStartPostBind", "setTsStartPostBind", "tsStartProcessConfiguration", "getTsStartProcessConfiguration", "setTsStartProcessConfiguration", "tsStartProcessDependency", "getTsStartProcessDependency", "setTsStartProcessDependency", "tsStartProcessExecution", "getTsStartProcessExecution", "setTsStartProcessExecution", "tsStartProcessExtensions", "getTsStartProcessExtensions", "setTsStartProcessExtensions", "tsStartProcessHello", "getTsStartProcessHello", "setTsStartProcessHello", "tsStartProcessInit", "getTsStartProcessInit", "setTsStartProcessInit", "tsStartProcessInstall", "getTsStartProcessInstall", "setTsStartProcessInstall", "tsStartProcessTerminate", "getTsStartProcessTerminate", "setTsStartProcessTerminate", "tsStartTmplLoad", "getTsStartTmplLoad", "setTsStartTmplLoad", "tsStartTryBind", "getTsStartTryBind", "setTsStartTryBind", "tsStartUICreate", "getTsStartUICreate", "setTsStartUICreate", "tsStartUIInit", "getTsStartUIInit", "setTsStartUIInit", "tsStartWebViewCreate", "getTsStartWebViewCreate", "setTsStartWebViewCreate", "tsWebFirstScreen", "getTsWebFirstScreen", "setTsWebFirstScreen", "url", "getUrl", "setUrl", "useLocalJs", "getUseLocalJs", "setUseLocalJs", "webReceivePageDataTime", "webviewKind", "getWebviewKind", "setWebviewKind", "webviewProcess", "getWebviewProcess", "webviewProcess$delegate", "report", "", "toString", "limit", "valid", "verify", "vals", "", "([Ljava/lang/Long;[J)[Ljava/lang/Long;", "Companion", "plugin-brandservice_release"})
public final class f
{
  public static final f.a jSx;
  private final String TAG;
  public long jRA;
  public long jRB;
  public long jRC;
  public long jRD;
  public long jRE;
  public long jRF;
  public long jRG;
  public long jRH;
  public long jRI;
  public long jRJ;
  public long jRK;
  public long jRL;
  public long jRM;
  public long jRN;
  public long jRO;
  public long jRP;
  public long jRQ;
  public long jRR;
  public boolean jRS;
  public boolean jRT;
  public boolean jRU;
  public boolean jRV;
  public boolean jRW;
  public boolean jRX;
  public boolean jRY;
  public boolean jRZ;
  private final int jRa;
  public TmplParams jRb;
  public int jRc;
  private final a.f jRd;
  private final a.f jRe;
  private final a.f jRf;
  private final a.f jRg;
  private final a.f jRh;
  private long jRi;
  public long jRj;
  public long jRk;
  long jRl;
  public long jRm;
  public long jRn;
  public long jRo;
  public long jRp;
  public long jRq;
  public long jRr;
  public long jRs;
  public long jRt;
  public long jRu;
  public long jRv;
  public long jRw;
  public long jRx;
  public long jRy;
  public long jRz;
  public boolean jSa;
  public boolean jSb;
  public int jSc;
  public boolean jSd;
  public boolean jSe;
  private long jSf;
  private int jSg;
  private long jSh;
  private long jSi;
  private long jSj;
  private long jSk;
  private long jSl;
  private long jSm;
  private long jSn;
  private long jSo;
  private long jSp;
  private long jSq;
  public String jSr;
  private final a.f jSs;
  public boolean jSt;
  public int jSu;
  private final a.f jSv;
  private long jSw;
  public String key;
  public String url;

  static
  {
    AppMethodBeat.i(14833);
    eQB = new k[] { (k)v.a(new t(v.aN(f.class), "contentId", "getContentId()Ljava/lang/String;")), (k)v.a(new t(v.aN(f.class), "pageDataSize", "getPageDataSize()I")), (k)v.a(new t(v.aN(f.class), "invalidId", "getInvalidId()Ljava/lang/String;")), (k)v.a(new t(v.aN(f.class), "dataCachedTime", "getDataCachedTime()J")), (k)v.a(new t(v.aN(f.class), "dataVersion", "getDataVersion()I")), (k)v.a(new t(v.aN(f.class), "webviewProcess", "getWebviewProcess()Ljava/lang/String;")), (k)v.a(new t(v.aN(f.class), "speedMatrix", "getSpeedMatrix()[Ljava/lang/Long;")) };
    jSx = new f.a((byte)0);
    AppMethodBeat.o(14833);
  }

  public f()
  {
    AppMethodBeat.i(14842);
    this.TAG = "MicroMsg.Preload.Kv15862";
    this.jRa = 15862;
    this.key = "";
    this.url = "";
    this.jRd = g.g((a.f.a.a)new f.b(this));
    this.jRe = g.g((a.f.a.a)new f.f(this));
    this.jRf = g.g((a.f.a.a)new f.e(this));
    this.jRg = g.g((a.f.a.a)new f.c(this));
    this.jRh = g.g((a.f.a.a)new f.d(this));
    this.jRi = -1L;
    this.jRv = -1L;
    this.jRw = -1L;
    this.jRx = -1L;
    this.jRy = -1L;
    this.jRz = -1L;
    this.jRA = -1L;
    this.jRB = -1L;
    this.jRC = -1L;
    this.jSs = g.g((a.f.a.a)f.p.jSC);
    this.jSu = 10000;
    this.jSv = g.g((a.f.a.a)new f.g(this));
    this.jSw = 3600000L;
    AppMethodBeat.o(14842);
  }

  private final String aWZ()
  {
    AppMethodBeat.i(14835);
    String str = (String)this.jRd.getValue();
    AppMethodBeat.o(14835);
    return str;
  }

  private final int aXa()
  {
    AppMethodBeat.i(14836);
    int i = ((Number)this.jRe.getValue()).intValue();
    AppMethodBeat.o(14836);
    return i;
  }

  private final String aXb()
  {
    AppMethodBeat.i(14837);
    String str = (String)this.jSs.getValue();
    AppMethodBeat.o(14837);
    return str;
  }

  private final Long[] aXc()
  {
    AppMethodBeat.i(14838);
    Long[] arrayOfLong = (Long[])this.jSv.getValue();
    AppMethodBeat.o(14838);
    return arrayOfLong;
  }

  private final long gM(long paramLong)
  {
    AppMethodBeat.i(14840);
    paramLong = Math.min(Math.max(-this.jSw, paramLong), this.jSw);
    AppMethodBeat.o(14840);
    return paramLong;
  }

  public final void IF()
  {
    AppMethodBeat.i(14839);
    if ((!this.jSd) || (!this.jSe))
      AppMethodBeat.o(14839);
    while (true)
    {
      return;
      Object localObject1 = this.jRb;
      if (localObject1 == null)
        j.avw("tmplParams");
      com.tencent.mm.plugin.webview.preload.a.gu(((TmplParams)localObject1).upQ, 132);
      String str1 = d.aWX();
      this.jSf = Math.max(this.jRk, this.jRu);
      int i;
      Object localObject3;
      int j;
      int k;
      long l1;
      long l2;
      long l3;
      long l4;
      long l5;
      long l6;
      long l7;
      long l8;
      long l9;
      long l10;
      Object localObject4;
      int m;
      if (this.jRk < this.jRu)
      {
        i = 1;
        this.jSg = i;
        this.jSh = (this.jSf - this.jRj);
        this.jSn = (this.jRo - this.jRj);
        this.jSm = (this.jRy - this.jRz);
        this.jSo = (this.jRu - this.jRj);
        this.jSp = (this.jRu - this.jRt);
        this.jRl = (this.jRk - this.jRj);
        this.jSi = (this.jRv - this.jRj);
        this.jSj = (this.jRw - this.jRv);
        this.jSl = (this.jRq - this.jRp);
        this.jSk = (this.jRy - this.jRx);
        this.jRi = (this.jRy - this.jRz);
        this.jSq = (this.jSi + this.jSj + this.jSl + this.jSk + this.jRn + this.jRm);
        localObject1 = this.TAG;
        localObject3 = this.jRb;
        if (localObject3 == null)
          j.avw("tmplParams");
        j = ((TmplParams)localObject3).version;
        localObject3 = this.url;
        k = aXa();
        l1 = this.jSh;
        i = this.jSg;
        l2 = this.jRm;
        l3 = this.jSo;
        boolean bool1 = this.jRT;
        l4 = this.jRB;
        l5 = this.jRA;
        boolean bool2 = this.jRS;
        l6 = this.jSl;
        l7 = this.jSp;
        l8 = this.jSn;
        l9 = this.jRn;
        l10 = this.jRm;
        localObject4 = this.jRb;
        if (localObject4 == null)
          j.avw("tmplParams");
        m = ((TmplParams)localObject4).jSV;
        localObject4 = this.jRb;
        if (localObject4 == null)
          j.avw("tmplParams");
        ab.d((String)localObject1, "templateVersion:%d, url:%s, size:%d, networkType:%s, pageFinishTime:%d, pageFinishTimeType:%d, ctWebFirstScreen:%d, a8KeyFinishTime:%d, isWebViewCreated:%b, ctTmplLoad:%d, isSyncGetPageData:%b, getPageDataCostTime:%d, getA8KeyCostTime:%d, webReceivePageDataTime:%d, ctWebCompile:%d, ctWebFirstScreen:%d, tmplType:%d tmplUid:%s webviewKind:%s webviewProcess:%s scene:%d evalPageDataCostTime:%d isWebViewProcessCreated:%b", new Object[] { Integer.valueOf(j), localObject3, Integer.valueOf(k), str1, Long.valueOf(l1), Integer.valueOf(i), Long.valueOf(l2), Long.valueOf(l3), Boolean.valueOf(bool1), Long.valueOf(l4 - l5), Boolean.valueOf(bool2), Long.valueOf(l6), Long.valueOf(l7), Long.valueOf(l8), Long.valueOf(l9), Long.valueOf(l10), Integer.valueOf(m), ((TmplParams)localObject4).jSY, this.jSr, aXb(), Integer.valueOf(this.jSu), Long.valueOf(this.jSm), Boolean.valueOf(this.jSb) });
        if (!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED)
          bool1 = com.tencent.mm.sdk.platformtools.f.DEBUG;
      }
      try
      {
        localObject1 = this.url;
        if (localObject1 == null)
          j.dWJ();
        localObject1 = q.encode((String)localObject1, "UTF-8");
        localObject3 = h.pYm;
        int n = this.jRa;
        localObject4 = this.jRb;
        if (localObject4 == null)
          j.avw("tmplParams");
        int i1 = ((TmplParams)localObject4).version;
        k = aXa();
        l5 = gM(this.jSh);
        int i2 = this.jSg;
        l6 = gM(this.jRl);
        l10 = gM(this.jSo);
        if (this.jRT)
        {
          i = 1;
          l3 = gM(this.jRB - this.jRA);
          if (!this.jRS)
            break label1719;
          j = 1;
          l1 = gM(this.jSl);
          l4 = gM(this.jSp);
          l7 = gM(this.jSn);
          l8 = gM(this.jRn);
          l2 = gM(this.jRm);
          localObject4 = this.jRb;
          if (localObject4 == null)
            j.avw("tmplParams");
          int i3 = ((TmplParams)localObject4).jSV;
          localObject4 = this.jRb;
          if (localObject4 == null)
            j.avw("tmplParams");
          String str2 = ((TmplParams)localObject4).jSY;
          localObject4 = this.jSr;
          String str3 = aXb();
          int i4 = this.jSu;
          l9 = gM(this.jSm);
          if (!this.jSb)
            break label1725;
          m = 1;
          ((h)localObject3).e(n, new Object[] { Integer.valueOf(i1), localObject1, Integer.valueOf(k), str1, Long.valueOf(l5), Integer.valueOf(i2), Long.valueOf(l6), Long.valueOf(l10), Integer.valueOf(i), Long.valueOf(l3), Integer.valueOf(j), Long.valueOf(l1), Long.valueOf(l4), Long.valueOf(l7), Long.valueOf(l8), Long.valueOf(l2), Integer.valueOf(i3), str2, localObject4, str3, Integer.valueOf(i4), Long.valueOf(l9), Integer.valueOf(m), Long.valueOf(gM(this.jSi)), Long.valueOf(gM(this.jSj)), Long.valueOf(gM(this.jSk)) });
          localObject4 = h.pYm;
          localObject3 = new x(19);
          ((x)localObject3).add(localObject1);
          ((x)localObject3).add(Integer.valueOf(this.jSu));
          ((x)localObject3).add(str1);
          ((x)localObject3).add(Integer.valueOf(aXa()));
          localObject1 = this.jRb;
          if (localObject1 == null)
            j.avw("tmplParams");
          ((x)localObject3).add(((TmplParams)localObject1).jSY);
          ((x)localObject3).add(aXb());
          ((x)localObject3).add(this.jSr);
          if (!this.jRS)
            break label1731;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          if (this.jSb)
            break label1736;
          i = 1;
          if (i == 0)
            break label1741;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          if (this.jRT)
            break label1746;
          i = 1;
          if (i == 0)
            break label1751;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          ((x)localObject3).add(Integer.valueOf(this.jSc));
          if (!this.jRW)
            break label1756;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          if (!this.jRV)
            break label1761;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          ((x)localObject3).add(Long.valueOf(this.jSh));
          ((x)localObject3).jdMethod_do(aXc());
          ((x)localObject3).add(this.key);
          if (!this.jRX)
            break label1766;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          if (!this.jRZ)
            break label1771;
          i = 1;
          ((x)localObject3).add(Integer.valueOf(i));
          ((x)localObject3).add(Long.valueOf(this.jRC));
          ((h)localObject4).e(16874, ((x)localObject3).toArray(new Object[((x)localObject3).ckx.size()]));
          com.tencent.mm.plugin.webview.preload.a.IU(0);
          if (this.jRX)
          {
            com.tencent.mm.plugin.webview.preload.a.IU(111);
            localObject1 = this.jRb;
            if (localObject1 == null)
              j.avw("tmplParams");
            com.tencent.mm.plugin.webview.preload.a.gu(((TmplParams)localObject1).upQ, 232);
          }
          if (this.jRZ)
            com.tencent.mm.plugin.webview.preload.a.IU(113);
          com.tencent.mm.plugin.webview.preload.a.ae(1, this.jSh);
          com.tencent.mm.plugin.webview.preload.a.ae(2, this.jRl);
          l3 = this.jRv - this.jRj;
          if (!this.jSb)
            break label1776;
          com.tencent.mm.plugin.webview.preload.a.ae(10, this.jSh);
          com.tencent.mm.plugin.webview.preload.a.ae(11, this.jRl);
          com.tencent.mm.plugin.webview.preload.a.ae(12, l3);
          com.tencent.mm.plugin.webview.preload.a.ae(13, this.jRF - this.jRD);
          com.tencent.mm.plugin.webview.preload.a.ae(14, this.jRB - this.jRA);
          com.tencent.mm.plugin.webview.preload.a.ae(15, this.jRy - this.jRx);
          ab.i(this.TAG, "terry performance report:" + this.jRj + '\n' + e.a(aXc(), null, null, null, 0, null, null, 63));
          AppMethodBeat.o(14839);
          continue;
          i = 2;
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
        {
          ab.printErrStackTrace(this.TAG, (Throwable)localUnsupportedEncodingException, "url:%d", new Object[] { this.url });
          Object localObject2 = null;
          continue;
          i = 0;
          continue;
          label1719: j = 0;
          continue;
          label1725: m = 0;
          continue;
          label1731: i = 0;
          continue;
          label1736: i = 0;
          continue;
          label1741: i = 0;
          continue;
          label1746: i = 0;
          continue;
          label1751: i = 0;
          continue;
          label1756: i = 0;
          continue;
          label1761: i = 0;
          continue;
          label1766: i = 0;
          continue;
          label1771: i = 0;
          continue;
          label1776: com.tencent.mm.plugin.webview.preload.a.ae(20, this.jSh);
          com.tencent.mm.plugin.webview.preload.a.ae(21, this.jRl);
          com.tencent.mm.plugin.webview.preload.a.ae(22, l3);
          com.tencent.mm.plugin.webview.preload.a.ae(23, this.jRF - this.jRD);
          if (!this.jRS)
          {
            com.tencent.mm.plugin.webview.preload.a.ae(24, this.jRs - this.jRr);
            com.tencent.mm.plugin.webview.preload.a.IU(107);
          }
        }
      }
    }
  }

  public final TmplParams aWY()
  {
    AppMethodBeat.i(14834);
    TmplParams localTmplParams = this.jRb;
    if (localTmplParams == null)
      j.avw("tmplParams");
    AppMethodBeat.o(14834);
    return localTmplParams;
  }

  public final String toString()
  {
    AppMethodBeat.i(14841);
    Object localObject1 = f.h.jSA;
    f.i locali = new f.i(this);
    localObject1 = f.j.jSB;
    ab.v(this.TAG, "terry performance log:\n" + this.jSi + ',' + this.jSj + ',' + (this.jRF - this.jRw) + ',' + (Math.max(this.jRF, this.jRB) - this.jRF) + ',' + (this.jRx - Math.max(this.jRF, this.jRB)) + ',' + this.jSk);
    ab.v(this.TAG, "terry performance timestamp:\n " + e.a(aXc(), null, null, null, 0, null, null, 63));
    Object localObject2 = new f.k(this);
    localObject1 = new f.l(this);
    Object localObject3 = new f.m(this);
    f.n localn = new f.n(this);
    Object localObject4 = new f.o(this);
    localObject3 = new StringBuilder("\n            [debug]\n            info: ").append(aWZ()).append("\n            settings: ").append(((f.k)localObject2).aXd()).append("\n\n            [process]\n            process: ").append(aXb()).append("\n            state: ").append(localn.aXd()).append("\n\n            [webview]\n            kind: ").append(this.jSr).append("\n            state: ").append(((f.m)localObject3).aXd()).append("\n\n            [tmpl]\n            uid: ");
    localObject2 = this.jRb;
    if (localObject2 == null)
      j.avw("tmplParams");
    localObject2 = ((StringBuilder)localObject3).append(((TmplParams)localObject2).jSY).append("\n            tmplType: ");
    localObject3 = this.jRb;
    if (localObject3 == null)
      j.avw("tmplParams");
    localObject2 = ((StringBuilder)localObject2).append(((TmplParams)localObject3).jSV).append("\n            version: ");
    localObject3 = this.jRb;
    if (localObject3 == null)
      j.avw("tmplParams");
    localObject3 = ((StringBuilder)localObject2).append(((TmplParams)localObject3).version).append("\n            md5: ");
    localObject2 = this.jRb;
    if (localObject2 == null)
      j.avw("tmplParams");
    localObject2 = ((StringBuilder)localObject3).append(((TmplParams)localObject2).cvZ).append("\n            time: ");
    localObject3 = this.jRb;
    if (localObject3 == null)
      j.avw("tmplParams");
    localObject4 = ((StringBuilder)localObject2).append(f.j.gN(((TmplParams)localObject3).qOg)).append("\n            state: ").append(((f.o)localObject4).aXd()).append("\n\n            [data]\n            dataSize: ").append(f.h.c(aXa() / 1024.0F, 2)).append("Kb\n            dataTime: ").append(this.jSl).append("\n            cached: ").append(f.j.gN(((Number)this.jRg.getValue()).longValue())).append("\n            version: ").append(((Number)this.jRh.getValue()).intValue()).append("\n            expire in: ").append(this.jRc).append("s\n            scene: ").append(this.jSu).append("\n            state: ").append(((f.l)localObject1).aXd()).append("\n\n            [performance](ms)\n            finishType: ").append(this.jSg).append("\n            finishTime: ").append(this.jSh);
    if (this.jSh != Math.max(this.jSo, this.jSq));
    for (localObject1 = "/" + locali.gN(this.jSq); ; localObject1 = "")
    {
      localObject1 = (String)localObject1 + "\n            firstScreenFinish: " + locali.gN(this.jRl) + '/' + locali.gN(this.jSq) + "\n            a8keyFinish: " + this.jSo + "\n\n            client:\n            TmplCostTime: " + (this.jRB - this.jRA) + "\n            WebViewUICostTime: " + (this.jRF - this.jRD) + "\n            NotifyPageCostTime: " + (this.jRC - this.jRy) + "\n\n            1.bindWebViewCostTime: " + this.jSi + "\n            2.createWebViewCostTime: " + this.jSj + "\n            3.getPageDataCostTime: " + this.jSl + "\n            4.injectCostTime: " + locali.gN(this.jSk) + "\n            eval cost: " + this.jRi + "\n\n            js:\n            4.1.onReceivePageData: " + (this.jRz - this.jRo) + "\n            5.ctWebCompile: " + this.jRn + "\n            6.renderTime: " + this.jRm + "\n\n            [js]webReceivePageDataTime: " + this.jSn + "\n            a8KeyFinishTime: " + this.jSo + "\n            getA8KeyCostTime: " + this.jSp + "\n        ";
      j.p(localObject1, "receiver$0");
      localObject1 = m.ja((String)localObject1, "");
      AppMethodBeat.o(14841);
      return localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.f
 * JD-Core Version:    0.6.2
 */