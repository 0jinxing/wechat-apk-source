package com.tencent.mm.plugin.webview.stub;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.g.a.cg;
import com.tencent.mm.g.a.cg.a;
import com.tencent.mm.g.a.cg.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.a;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.di;
import com.tencent.mm.g.a.dj;
import com.tencent.mm.g.a.dj.b;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dq.b;
import com.tencent.mm.g.a.fk;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.g.a.fq;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.gu.b;
import com.tencent.mm.g.a.hh;
import com.tencent.mm.g.a.hv;
import com.tencent.mm.g.a.hv.a;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.g.a.ng.b;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.np.a;
import com.tencent.mm.g.a.og;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.a.sc;
import com.tencent.mm.g.a.sc.b;
import com.tencent.mm.g.a.vr;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.modelstat.a.c.1;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.e.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.websearch.api.s;
import com.tencent.mm.plugin.webview.e.c.a;
import com.tencent.mm.plugin.webview.fts.b.e;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.a.b;
import com.tencent.mm.plugin.webview.model.af.a;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.ao;
import com.tencent.mm.plugin.webview.model.ap;
import com.tencent.mm.plugin.webview.model.ar;
import com.tencent.mm.plugin.webview.model.f.a;
import com.tencent.mm.plugin.webview.model.o;
import com.tencent.mm.plugin.webview.model.x;
import com.tencent.mm.plugin.webview.modelcache.r.5;
import com.tencent.mm.plugin.webview.modeltools.l;
import com.tencent.mm.plugin.webview.modeltools.l.a;
import com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.bag.n.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g.90;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.g.b;
import com.tencent.mm.pluginsdk.ui.tools.t.a;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.bsj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.AssertionFailedError;
import org.json.JSONException;
import org.json.JSONObject;

final class WebViewStubService$1 extends d.a
{
  WebViewStubService$1(WebViewStubService paramWebViewStubService)
  {
  }

  private static int vn(String paramString)
  {
    int i = 1;
    AppMethodBeat.i(7178);
    try
    {
      int j = bo.getInt(com.tencent.mm.m.g.Nu().getValue(paramString), 1);
      i = j;
      AppMethodBeat.o(7178);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.WebViewStubService", "getIntValFromDynamicConfig parseInt failed, val: ".concat(String.valueOf(paramString)));
    }
  }

  public final void IP(int paramInt)
  {
    AppMethodBeat.i(7170);
    if (WebViewStubService.h(this.uqB).size() == 0)
    {
      localObject1 = new fq();
      ((fq)localObject1).czB.czE = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new fk();
      ((fk)localObject1).czf.op = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = new fn();
      ((fn)localObject1).czm.op = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
    ab.d("MicroMsg.MsgHandler", "onWebViewUIDestroy");
    localg.uGm = true;
    if (localg.dcC())
    {
      localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(localg.uGP);
      if (localObject1 != null)
        al.d(new g.90(localg, (WebViewJSSDKFileItem)localObject1));
    }
    Object localObject2;
    if (((localg.cZr() != 8) && (localg.cZr() != -1)) || (localg.bFf() == 27))
      if (((localg.uGk == null) || (localg.uGk.isEmpty())) && ((localg.uGj == null) || (localg.uGj.isEmpty())))
      {
        ab.i("MicroMsg.MsgHandler", "No exdevice connection, just return");
        if (localg.uGl != null)
          ao.a.flu.or(localg.uGl);
        localObject2 = f.a.cXv();
        if (!bo.ek(((com.tencent.mm.plugin.webview.model.f)localObject2).ulR))
          break label1284;
        ab.d("MicroMsg.WebView.JsLogHelper", "not kv stat cached, no need to doReport, skip");
      }
    while (true)
    {
      if (localg.uGh != null)
        localg.uGh.setClassLoader(localg.getClass().getClassLoader());
      if (localg.uGh != null)
      {
        localObject1 = localg.uGh.getParcelable("KSnsAdTag");
        if ((localObject1 != null) && ((localObject1 instanceof SnsAdClick)))
        {
          localObject3 = (SnsAdClick)localObject1;
          localObject1 = new ol();
          ((ol)localObject1).cKM.cKN = 1;
          ((ol)localObject1).cKM.cKz = ((SnsAdClick)localObject3);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        }
      }
      localObject1 = "";
      if (localg.uGh != null)
      {
        localg.uGh.setClassLoader(localg.getClass().getClassLoader());
        localObject1 = localg.uGh.getString("KoriginUrl");
      }
      Object localObject3 = new vr();
      ((vr)localObject3).cSE.clP = ((String)localObject1);
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject3);
      if (localg.uGh != null)
      {
        localObject1 = com.tencent.mm.modelsns.b.n(localg.uGh);
        if (localObject1 != null)
        {
          ((com.tencent.mm.modelsns.b)localObject1).update();
          ((com.tencent.mm.modelsns.b)localObject1).ajK();
        }
      }
      localObject1 = localg.uGO.keySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (String)((Iterator)localObject1).next();
        if (!bo.isNullOrNil((String)localObject3))
        {
          com.tencent.mm.plugin.webview.modeltools.g.cYE();
          aj.yC((String)localObject3);
          localObject3 = (g.b)localg.uGO.get(localObject3);
          if (localObject3 != null)
          {
            if (((g.b)localObject3).uIC != null)
              com.tencent.mm.plugin.webview.modeltools.g.cYE().a(((g.b)localObject3).uIC);
            if (((g.b)localObject3).uGd != null)
              localg.a(((g.b)localObject3).uGd, "uploadVideo:cancel", null, false);
          }
        }
      }
      Object localObject5;
      if ((localg.uGk != null) && (!localg.uGk.isEmpty()))
      {
        localObject1 = localg.uGk.entrySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          localObject3 = (String)((Map.Entry)localObject2).getKey();
          localObject2 = (String)((Map.Entry)localObject2).getValue();
          ab.i("MicroMsg.MsgHandler", "Remove wifi devices, srcUserName(%s), deviceId(%s)", new Object[] { localObject3, localObject2 });
          try
          {
            localObject5 = new com/tencent/mm/g/a/di;
            ((di)localObject5).<init>();
            ((di)localObject5).cwC.cwA = false;
            ((di)localObject5).cwC.cwz = ((String)localObject3);
            ((di)localObject5).cwC.ceI = ((String)localObject2);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
            ab.i("MicroMsg.MsgHandler", "Publish ExDeviceConnectDeviceEvent");
          }
          catch (Exception localException1)
          {
            ab.e("MicroMsg.MsgHandler", "ExDeviceConnectDeviceEvent publish failed");
            ab.printErrStackTrace("MicroMsg.MsgHandler", localException1, "", new Object[0]);
          }
        }
        localg.uGk.clear();
      }
      if ((localg.uGj == null) || (localg.uGj.isEmpty()))
        break;
      localObject1 = localg.uGj.entrySet().iterator();
      boolean bool = com.tencent.mm.plugin.webview.ui.tools.jsapi.g.Ke(localg.dcB());
      ab.i("MicroMsg.MsgHandler", "Is in hard biz(%b)", new Object[] { Boolean.valueOf(bool) });
      if (localObject1 != null)
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          String str1 = (String)((Map.Entry)localObject2).getKey();
          localObject2 = (String)((Map.Entry)localObject2).getValue();
          ab.i("MicroMsg.MsgHandler", "Remove ble devices, srcUserName(%s), deviceId(%s)", new Object[] { str1, localObject2 });
          if (bool)
          {
            localObject5 = new dj();
            ((dj)localObject5).cwE.cwG = str1;
            ((dj)localObject5).cwE.ceI = ((String)localObject2);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
            if (((dj)localObject5).cwF.cwB);
          }
          else
          {
            try
            {
              localObject5 = new com/tencent/mm/g/a/dh;
              ((dh)localObject5).<init>();
              ((dh)localObject5).cwx.cwA = false;
              ((dh)localObject5).cwx.cwz = str1;
              ((dh)localObject5).cwx.ceI = ((String)localObject2);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
              ab.i("MicroMsg.MsgHandler", "Publish ExDeviceConnectDeviceEvent");
            }
            catch (Exception localException2)
            {
              ab.e("MicroMsg.MsgHandler", "ExDeviceConnectDeviceEvent publish failed");
              ab.printErrStackTrace("MicroMsg.MsgHandler", localException2, "", new Object[0]);
            }
          }
        }
      localg.uGj.clear();
      break;
      if (localg.cZr() != 8)
        break;
      if ((localg.uGj == null) || (localg.uGj.isEmpty()))
      {
        ab.i("MicroMsg.MsgHandler", "Not hard biz, or no ble device connection, just return");
        break;
      }
      localObject1 = localg.uGj.entrySet().iterator();
      if (localObject1 != null)
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Map.Entry)((Iterator)localObject1).next();
          String str2 = (String)((Map.Entry)localObject2).getKey();
          localObject2 = (String)((Map.Entry)localObject2).getValue();
          ab.i("MicroMsg.MsgHandler", "Remove ble devices, srcUserName(%s), deviceId(%s)", new Object[] { str2, localObject2 });
          localObject5 = new dj();
          ((dj)localObject5).cwE.cwG = str2;
          ((dj)localObject5).cwE.ceI = ((String)localObject2);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
          if (!((dj)localObject5).cwF.cwB)
            try
            {
              localObject5 = new com/tencent/mm/g/a/dh;
              ((dh)localObject5).<init>();
              ((dh)localObject5).cwx.cwA = false;
              ((dh)localObject5).cwx.cwz = str2;
              ((dh)localObject5).cwx.ceI = ((String)localObject2);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
              ab.i("MicroMsg.MsgHandler", "Publish ExDeviceConnectDeviceEvent");
            }
            catch (Exception localException3)
            {
              ab.e("MicroMsg.MsgHandler", "ExDeviceConnectDeviceEvent publish failed");
              ab.printErrStackTrace("MicroMsg.MsgHandler", localException3, "", new Object[0]);
            }
        }
      localg.uGj.clear();
      break;
      label1284: if (!com.tencent.mm.kernel.g.RK())
      {
        ab.i("MicroMsg.WebView.JsLogHelper", "doReport(), acc not ready, skip");
      }
      else
      {
        ((com.tencent.mm.plugin.webview.model.f)localObject2).ulO = com.tencent.mm.m.g.Nu().getInt("MMUxAdLog2GSendSize", 20480);
        ((com.tencent.mm.plugin.webview.model.f)localObject2).ulP = com.tencent.mm.m.g.Nu().getInt("MMUxAdLog3GSendSize", 30720);
        ((com.tencent.mm.plugin.webview.model.f)localObject2).ulQ = com.tencent.mm.m.g.Nu().getInt("MMUxAdLogWifiSendSize", 51200);
        ab.d("MicroMsg.WebView.JsLogHelper", "readDynamicSendSize, 2g(%d), 3g(%d), wifi(%d)", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.webview.model.f)localObject2).ulO), Integer.valueOf(((com.tencent.mm.plugin.webview.model.f)localObject2).ulP), Integer.valueOf(((com.tencent.mm.plugin.webview.model.f)localObject2).ulQ) });
        localObject1 = ((com.tencent.mm.plugin.webview.model.f)localObject2).ulR;
        if (bo.ek((List)localObject1))
          ab.d("MicroMsg.WebView.JsLogHelper", "no need to split, existings is empty");
        for (localObject1 = null; ; localObject1 = localObject4)
        {
          if (!bo.ek((List)localObject1))
            break label1957;
          ab.d("MicroMsg.WebView.JsLogHelper", "split result empty, skip");
          break;
          ab.d("MicroMsg.WebView.JsLogHelper", "begin split >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
          ab.d("MicroMsg.WebView.JsLogHelper", "before split, given list:");
          localObject5 = new StringBuilder();
          ((StringBuilder)localObject5).setLength(0);
          ((StringBuilder)localObject5).append("{ ");
          localObject4 = ((List)localObject1).iterator();
          while (((Iterator)localObject4).hasNext())
            ((StringBuilder)localObject5).append(((axc)((Iterator)localObject4).next()).wBd).append(", ");
          ((StringBuilder)localObject5).append(" }");
          ab.d("MicroMsg.WebView.JsLogHelper", ((StringBuilder)localObject5).toString());
          Object localObject6;
          int i;
          if ((bo.az(((com.tencent.mm.plugin.webview.model.f)localObject2).ulT) < 100L) && (((com.tencent.mm.plugin.webview.model.f)localObject2).ulS > 0))
          {
            paramInt = ((com.tencent.mm.plugin.webview.model.f)localObject2).ulS;
            localObject6 = new LinkedList();
            ((LinkedList)localObject6).addAll((Collection)localObject1);
            localObject4 = new LinkedList();
            localObject1 = null;
            i = 0;
          }
          while (true)
          {
            if (((LinkedList)localObject6).size() <= 0)
              break label1815;
            axc localaxc;
            if (i <= 0)
            {
              localObject1 = new LinkedList();
              localaxc = (axc)((LinkedList)localObject6).remove();
              i += localaxc.wBe.wR.length;
              ((LinkedList)localObject1).add(localaxc);
              ((List)localObject4).add(localObject1);
              continue;
              ((com.tencent.mm.plugin.webview.model.f)localObject2).ulT = SystemClock.elapsedRealtime();
              if (at.isWifi(ah.getContext()))
              {
                paramInt = ((com.tencent.mm.plugin.webview.model.f)localObject2).ulQ;
                ((com.tencent.mm.plugin.webview.model.f)localObject2).ulS = paramInt;
                break;
              }
              if ((at.is3G(ah.getContext())) || (at.is4G(ah.getContext())))
              {
                paramInt = ((com.tencent.mm.plugin.webview.model.f)localObject2).ulP;
                ((com.tencent.mm.plugin.webview.model.f)localObject2).ulS = paramInt;
                break;
              }
              at.is2G(ah.getContext());
              paramInt = ((com.tencent.mm.plugin.webview.model.f)localObject2).ulO;
              ((com.tencent.mm.plugin.webview.model.f)localObject2).ulS = paramInt;
              break;
            }
            if (((axc)((LinkedList)localObject6).peek()).wBe.wR.length + i >= paramInt)
            {
              i = 0;
            }
            else
            {
              localaxc = (axc)((LinkedList)localObject6).remove();
              i += localaxc.wBe.wR.length;
              ((LinkedList)localObject1).add(localaxc);
            }
          }
          label1815: ab.d("MicroMsg.WebView.JsLogHelper", "split result: ");
          localObject1 = ((List)localObject4).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject6 = (List)((Iterator)localObject1).next();
            ((StringBuilder)localObject5).setLength(0);
            ((StringBuilder)localObject5).append("{ ");
            localObject6 = ((List)localObject6).iterator();
            while (((Iterator)localObject6).hasNext())
              ((StringBuilder)localObject5).append(((axc)((Iterator)localObject6).next()).wBd).append(", ");
            ((StringBuilder)localObject5).append(" }");
            ab.d("MicroMsg.WebView.JsLogHelper", ((StringBuilder)localObject5).toString());
            ab.d("MicroMsg.WebView.JsLogHelper", "---------------------------");
          }
          ab.d("MicroMsg.WebView.JsLogHelper", "end split <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        }
        label1957: localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = (List)((Iterator)localObject1).next();
          if (!bo.ek((List)localObject4))
          {
            ab.d("MicroMsg.WebView.JsLogHelper", "trigger do scene");
            localObject4 = new com.tencent.mm.plugin.webview.model.u((List)localObject4);
            com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject4, 0);
          }
        }
        ((com.tencent.mm.plugin.webview.model.f)localObject2).ulR.clear();
      }
    }
    localg.uGO.clear();
    Object localObject1 = com.tencent.mm.pluginsdk.ui.tools.t.dlE().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (t.a)((Iterator)localObject1).next();
      ab.i("MicroMsg.MsgHandler", "onWebViewUIDestroy, stop plugin = " + ((t.a)localObject4).getName());
      ((t.a)localObject4).dbp();
    }
    com.tencent.mm.pluginsdk.ui.tools.t.clear();
    com.tencent.mm.sdk.b.a.xxA.d(localg.qwg);
    com.tencent.mm.sdk.b.a.xxA.d(localg.qwh);
    com.tencent.mm.sdk.b.a.xxA.d(localg.uGN);
    com.tencent.mm.sdk.b.a.xxA.d(localg.uHa);
    if (localg.uGQ != null)
      com.tencent.mm.sdk.b.a.xxA.d(localg.uGQ);
    if (localg.hwv != null)
      com.tencent.mm.sdk.b.a.xxA.d(localg.hwv);
    if (localg.uGY != null)
      localg.uGY.dead();
    if (com.tencent.mm.kernel.g.RK())
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xMm, Boolean.FALSE);
    localObject1 = ah.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).edit();
    ((SharedPreferences.Editor)localObject1).putBoolean("isNewScanning", false);
    ((SharedPreferences.Editor)localObject1).commit();
    localg.uGe = null;
    localg.uGM = null;
    localg.b(localg.uGd, new int[0]);
    localg.uGp = null;
    localg.uGV.clear();
    localObject1 = com.tencent.mm.plugin.webview.modelcache.r.a.cYq();
    Object localObject4 = localg.uGR;
    if ((y.Me() == 0) || (!com.tencent.mm.kernel.g.RK()) || (bo.ek((List)localObject4)));
    while (true)
    {
      com.tencent.mm.plugin.webview.modelcache.r.a.cYq().IP(localg.cIv);
      localObject1 = localg.uGr;
      com.tencent.mm.kernel.g.Rg().b(1093, (com.tencent.mm.ai.f)localObject1);
      AppMethodBeat.o(7170);
      return;
      localObject4 = new r.5((com.tencent.mm.plugin.webview.modelcache.r)localObject1, (List)localObject4);
      ((com.tencent.mm.plugin.webview.modelcache.r)localObject1).aNS().aa((Runnable)localObject4);
    }
  }

  public final void J(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(7184);
    paramString1 = WebViewJSSDKFileItem.I(paramInt, paramString1, paramString2);
    paramString1.het = false;
    com.tencent.mm.plugin.webview.modeltools.g.cYF().b(paramString1);
    com.tencent.mm.plugin.webview.modeltools.g.cYE().b(null, paramString1.czD, null);
    AppMethodBeat.o(7184);
  }

  public final Bundle Ja(int paramInt)
  {
    AppMethodBeat.i(7139);
    Bundle localBundle = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).dcv();
    AppMethodBeat.o(7139);
    return localBundle;
  }

  public final boolean Jb(int paramInt)
  {
    boolean bool1 = true;
    AppMethodBeat.i(7140);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
    boolean bool2 = localg.eBB;
    int i;
    if (com.tencent.mm.protocal.d.vxr)
    {
      i = 1;
      if (!bool2)
        break label76;
      ab.w("MicroMsg.WebViewStubService", "isBusy(%d), doingFunction = %s", new Object[] { Integer.valueOf(paramInt), localg.uGn });
      label59: AppMethodBeat.o(7140);
      bool1 = bool2;
    }
    while (true)
    {
      return bool1;
      i = 0;
      break;
      label76: if ((i == 0) || (!localg.uGo))
        break label59;
      ab.i("MicroMsg.WebViewStubService", "isBusy(%d), awaiting proxyUI", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(7140);
    }
  }

  public final void Jc(int paramInt)
  {
    AppMethodBeat.i(7149);
    ab.i("MicroMsg.WebViewStubService", "removeCallback, id = %d", new Object[] { Integer.valueOf(paramInt) });
    Iterator localIterator = WebViewStubService.h(this.uqB).iterator();
    while (localIterator.hasNext())
    {
      WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
      if (localWebViewStubCallbackWrapper.id == paramInt)
      {
        WebViewStubService.h(this.uqB).remove(localWebViewStubCallbackWrapper);
        AppMethodBeat.o(7149);
      }
    }
    while (true)
    {
      return;
      WebViewStubService.g(this.uqB).remove(paramInt);
      AppMethodBeat.o(7149);
    }
  }

  public final void Jd(int paramInt)
  {
    AppMethodBeat.i(7179);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
    Object localObject = this.uqB;
    localg.uGm = false;
    Iterator localIterator = com.tencent.mm.pluginsdk.ui.tools.t.dlE().iterator();
    while (localIterator.hasNext())
    {
      t.a locala = (t.a)localIterator.next();
      ab.i("MicroMsg.MsgHandler", "onWebViewUIResume, resume plugin = " + locala.getName());
      locala.ft((Context)localObject);
    }
    localg.uGs = false;
    if (localg.uGh != null)
    {
      localObject = localg.uGh.getParcelable("KSnsAdTag");
      if ((localObject != null) && ((localObject instanceof SnsAdClick)))
      {
        localObject = (SnsAdClick)localObject;
        if (((SnsAdClick)localObject).fQd > 0L)
        {
          ((SnsAdClick)localObject).fQe += bo.az(((SnsAdClick)localObject).fQd);
          ((SnsAdClick)localObject).fQd = 0L;
        }
      }
    }
    AppMethodBeat.o(7179);
  }

  public final void Je(int paramInt)
  {
    AppMethodBeat.i(7180);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
    localg.uGm = true;
    Object localObject = com.tencent.mm.pluginsdk.ui.tools.t.dlE().iterator();
    while (((Iterator)localObject).hasNext())
    {
      t.a locala = (t.a)((Iterator)localObject).next();
      ab.i("MicroMsg.MsgHandler", "onWebViewUIPause, pause plugin = " + locala.getName());
      locala.dbq();
    }
    if (localg.uGh != null)
    {
      localObject = localg.uGh.getParcelable("KSnsAdTag");
      if ((localObject != null) && ((localObject instanceof SnsAdClick)))
        ((SnsAdClick)localObject).fQd = bo.yz();
    }
    AppMethodBeat.o(7180);
  }

  public final void L(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(7141);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).dcv().putString(paramString1, paramString2);
    AppMethodBeat.o(7141);
  }

  public final boolean Mn()
  {
    AppMethodBeat.i(7120);
    boolean bool = com.tencent.mm.compatible.util.f.Mn();
    AppMethodBeat.o(7120);
    return bool;
  }

  public final b Z(Bundle paramBundle)
  {
    AppMethodBeat.i(7123);
    WebViewStubService.a locala = new WebViewStubService.a((byte)0);
    long l = paramBundle.getLong("msg_id", -9223372036854775808L);
    Object localObject1 = paramBundle.getString("sns_local_id");
    int i = paramBundle.getInt("news_svr_id", 0);
    Object localObject2 = paramBundle.getString("news_svr_tweetid");
    cl localcl = new cl();
    boolean bool;
    if (-9223372036854775808L != l)
    {
      localcl.cvA.cvE = paramBundle.getInt("message_index", 0);
      bool = ((com.tencent.mm.plugin.fav.a.ad)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ad.class)).a(localcl, l);
      if (!bool)
        break label487;
      String str = bo.nullAsNil(paramBundle.getString("prePublishId"));
      localObject2 = v.nW(str);
      localObject1 = v.Zp().y((String)localObject2, true);
      ((v.b)localObject1).j("sendAppMsgScene", Integer.valueOf(2));
      ((v.b)localObject1).j("preChatName", paramBundle.getString("preChatName"));
      ((v.b)localObject1).j("preMsgIndex", Integer.valueOf(paramBundle.getInt("preMsgIndex")));
      ((v.b)localObject1).j("prePublishId", str);
      ((v.b)localObject1).j("preUsername", paramBundle.getString("preUsername"));
      ((v.b)localObject1).j("getA8KeyScene", paramBundle.getString("getA8KeyScene"));
      ((v.b)localObject1).j("referUrl", paramBundle.getString("referUrl"));
      paramBundle = paramBundle.getBundle("jsapiargs");
      if (paramBundle != null)
        ((v.b)localObject1).j("adExtStr", paramBundle.getString("key_snsad_statextstr"));
      localcl.cvA.cvF = ((String)localObject2);
      com.tencent.mm.sdk.b.a.xxA.m(localcl);
    }
    while (true)
    {
      locala.ret = localcl.cvB.ret;
      AppMethodBeat.o(7123);
      while (true)
      {
        return locala;
        if (!bo.isNullOrNil((String)localObject1))
        {
          localObject2 = new sc();
          ((sc)localObject2).cNZ.cOc = ((String)localObject1);
          ((sc)localObject2).cNZ.cOd = localcl;
          ((sc)localObject2).cNZ.url = paramBundle.getString("rawUrl");
          ((sc)localObject2).cNZ.cOb = true;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          bool = ((sc)localObject2).cOa.cvi;
          break;
        }
        if (i != 0)
        {
          localObject1 = new ng();
          ((ng)localObject1).cJw.opType = 3;
          ((ng)localObject1).cJw.cJy = localcl;
          ((ng)localObject1).cJw.cJz = i;
          ((ng)localObject1).cJw.cJA = ((String)localObject2);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          bool = ((ng)localObject1).cJx.cvi;
          break;
        }
        locala.uhJ = true;
        AppMethodBeat.o(7123);
      }
      label487: if (localcl.cvA.cvG == 0)
        localcl.cvA.cvG = 2131299630;
      com.tencent.mm.sdk.b.a.xxA.m(localcl);
    }
  }

  public final boolean Ze()
  {
    AppMethodBeat.i(7137);
    boolean bool = com.tencent.mm.model.r.Ze();
    AppMethodBeat.o(7137);
    return bool;
  }

  @Deprecated
  public final void a(int paramInt1, Bundle paramBundle, int paramInt2)
  {
    AppMethodBeat.i(7122);
    ab.i("MicroMsg.WebViewStubService", "edw, invoke, actionCode = %d, binderID = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    WebViewStubService.f(this.uqB).post(new WebViewStubService.1.1(this, paramInt1, paramBundle, paramInt2));
    AppMethodBeat.o(7122);
  }

  public final void a(Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(7186);
    WebViewStubService.g(this.uqB).put(paramInt, paramBundle);
    AppMethodBeat.o(7186);
  }

  public final void a(e parame, int paramInt)
  {
    AppMethodBeat.i(7150);
    ab.i("MicroMsg.WebViewStubService", "addCallback, cb.hash = %d, id = %d", new Object[] { Integer.valueOf(parame.hashCode()), Integer.valueOf(paramInt) });
    WebViewStubService.h(this.uqB).add(new WebViewStubCallbackWrapper(parame, paramInt));
    com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
    AppMethodBeat.o(7150);
  }

  public final void a(String paramString, Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(7143);
    Bundle localBundle = new Bundle();
    JsapiPermissionWrapper localJsapiPermissionWrapper = new JsapiPermissionWrapper();
    localJsapiPermissionWrapper.fromBundle(paramBundle);
    localBundle.putParcelable("proxyui_perm_key", localJsapiPermissionWrapper);
    localBundle.putString("proxyui_username_key", paramString);
    localBundle.putInt("webview_binder_id", paramInt);
    WebViewStubService.a(this.uqB, 4, localBundle, paramInt);
    AppMethodBeat.o(7143);
  }

  public final void a(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, Bundle paramBundle)
  {
    AppMethodBeat.i(7175);
    if (paramString1 == null)
      AppMethodBeat.o(7175);
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.setClass(ah.getContext(), WebviewScanImageActivity.class);
      localIntent.setFlags(872415232);
      localIntent.putExtra("key_string_for_scan", paramString1);
      localIntent.putExtra("key_string_for_url", paramString2);
      localIntent.putExtra("key_string_for_image_url", paramString3);
      localIntent.putExtra("key_codetype_for_scan", paramInt1);
      localIntent.putExtra("key_codeversion_for_scan", paramInt2);
      if (paramBundle != null)
      {
        paramString1 = paramBundle.getString("preUsername");
        paramString3 = paramBundle.getString("preChatName");
        paramBundle = paramBundle.getString("rawUrl");
        String str = v.nW("WebviewQrCode");
        v.b localb = v.Zp().y(str, true);
        localb.j("preUsername", paramString1);
        localb.j("preChatName", paramString3);
        localb.j("url", paramString2);
        localb.j("rawUrl", paramBundle);
        localIntent.putExtra("img_gallery_session_id", str);
      }
      ah.getContext().startActivity(localIntent);
      AppMethodBeat.o(7175);
    }
  }

  public final void a(String paramString, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7173);
    if (WebViewStubService.i(this.uqB) == null)
    {
      WebViewStubService.a(this.uqB, new HashMap());
      com.tencent.mm.sdk.b.a.xxA.c(WebViewStubService.j(this.uqB));
    }
    Object localObject = v.Zp().y("basescanui@datacenter", true);
    ((v.b)localObject).j("key_basescanui_screen_x", Integer.valueOf(paramInt1));
    ((v.b)localObject).j("key_basescanui_screen_y", Integer.valueOf(paramInt2));
    localObject = new np();
    ((np)localObject).cJU.filePath = paramString;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length > 0))
    {
      ((np)localObject).cJU.cJV = new HashSet();
      paramInt2 = paramArrayOfInt.length;
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      {
        int i = paramArrayOfInt[paramInt1];
        ((np)localObject).cJU.cJV.add(Integer.valueOf(i));
      }
    }
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    WebViewStubService.i(this.uqB).put(paramString, Integer.valueOf(1));
    AppMethodBeat.o(7173);
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, Bundle paramBundle1, Bundle paramBundle2, int paramInt)
  {
    AppMethodBeat.i(7142);
    boolean bool = WebViewStubService.afe(paramString2);
    ab.i("MicroMsg.WebViewStubService", "handleMsg, function = " + paramString2 + ", doInActivity = " + bool);
    JsapiPermissionWrapper localJsapiPermissionWrapper = new JsapiPermissionWrapper();
    localJsapiPermissionWrapper.fromBundle(paramBundle1);
    if ("wcPrivacyPolicyResult".equals(paramString2))
    {
      paramBundle1 = (Bundle)WebViewStubService.g(this.uqB).get(paramInt);
      if ((paramBundle1 != null) && (paramBundle1.getBoolean("KInitialParam_Force_wcPrivacyPolicyResult_DoInService", false)))
        bool = false;
    }
    while (true)
    {
      if (bool)
      {
        if (WebViewStubService.a(this.uqB, paramString1, paramString2, paramString3, localJsapiPermissionWrapper, paramBundle2, paramInt))
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).oc(true);
        AppMethodBeat.o(7142);
        bool = true;
        return bool;
      }
      paramBundle1 = new com.tencent.mm.plugin.webview.ui.tools.jsapi.i();
      paramBundle1.type = paramString1;
      paramBundle1.uIJ = paramString2;
      paramBundle1.uIG = paramString3;
      paramBundle1.puc = com.tencent.mm.plugin.webview.ui.tools.jsapi.i.aq(paramBundle2.getBundle("compatParams"));
      label354: 
      while (true)
      {
        try
        {
          paramString1 = new org/json/JSONObject;
          paramString1.<init>(paramBundle2.getString("rawParams"));
          paramBundle1.uIH = paramString1;
          paramString1 = null;
          paramString2 = WebViewStubService.h(this.uqB).iterator();
          if (paramString2.hasNext())
          {
            paramString3 = (WebViewStubCallbackWrapper)paramString2.next();
            if ((paramString3 == null) || (paramString3.id != paramInt))
              break label354;
            paramString1 = paramString3.uuT;
            continue;
          }
        }
        catch (JSONException paramString1)
        {
          ab.e("MicroMsg.WebViewStubService", "get rawParams, e = %s", new Object[] { paramString1 });
          continue;
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).dcu();
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).a(this.uqB, paramString1, paramString1);
          bool = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).a(paramBundle1, localJsapiPermissionWrapper);
          ab.i("MicroMsg.WebViewStubService", "handleRet = ".concat(String.valueOf(bool)));
          AppMethodBeat.o(7142);
        }
        break;
      }
    }
  }

  public final boolean a(String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    AppMethodBeat.i(7133);
    paramBoolean = com.tencent.mm.pluginsdk.r.a.vax.a(this.uqB, paramString, paramBoolean, paramBundle);
    AppMethodBeat.o(7133);
    return paramBoolean;
  }

  public final void aB(Intent paramIntent)
  {
    AppMethodBeat.i(7183);
    Intent localIntent = new Intent(this.uqB, WebViewStubProxyUI.class);
    localIntent.putExtra("proxyui_action_code_key", 9);
    localIntent.putExtra("proxyui_next_intent_key", paramIntent);
    localIntent.setFlags(268435456);
    this.uqB.startActivity(localIntent);
    AppMethodBeat.o(7183);
  }

  public final boolean aa(Bundle paramBundle)
  {
    AppMethodBeat.i(7152);
    cg localcg = new cg();
    localcg.cvt.cvv = paramBundle.getLong("fav_local_id", -1L);
    com.tencent.mm.sdk.b.a.xxA.m(localcg);
    ab.i("MicroMsg.WebViewStubService", "do del fav web url, local id %d, result %B", new Object[] { Long.valueOf(localcg.cvt.cvv), Boolean.valueOf(localcg.cvu.cvi) });
    boolean bool = localcg.cvu.cvi;
    AppMethodBeat.o(7152);
    return bool;
  }

  public final List<String> aeC()
  {
    AppMethodBeat.i(7131);
    Object localObject = com.tencent.mm.aj.f.aeC();
    LinkedList localLinkedList = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      String str = (String)((Iterator)localObject).next();
      if (!com.tencent.mm.aj.f.ra(str))
        localLinkedList.add(str);
    }
    AppMethodBeat.o(7131);
    return localLinkedList;
  }

  public final boolean aeD()
  {
    AppMethodBeat.i(7130);
    boolean bool = com.tencent.mm.aj.f.aeD();
    AppMethodBeat.o(7130);
    return bool;
  }

  public final String aek(String paramString)
  {
    AppMethodBeat.i(7154);
    paramString = ar.aek(paramString);
    AppMethodBeat.o(7154);
    return paramString;
  }

  public final String aff(String paramString)
  {
    AppMethodBeat.i(7124);
    paramString = com.tencent.mm.ah.b.pX(paramString);
    AppMethodBeat.o(7124);
    return paramString;
  }

  public final String afg(String paramString)
  {
    AppMethodBeat.i(7134);
    paramString = ((com.tencent.mm.pluginsdk.q)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.q.class)).x(this.uqB, paramString);
    AppMethodBeat.o(7134);
    return paramString;
  }

  public final void afh(String paramString)
  {
    AppMethodBeat.i(7144);
    Object localObject = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, false);
    if ((localObject != null) && (bo.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.f)localObject).field_openId)))
    {
      ab.i("MicroMsg.WebViewStubService", "initView trigger getappsetting, appId = ".concat(String.valueOf(paramString)));
      localObject = new hh();
      ((hh)localObject).cCd.appId = paramString;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    AppMethodBeat.o(7144);
  }

  public final String afi(String paramString)
  {
    AppMethodBeat.i(7145);
    paramString = com.tencent.mm.pluginsdk.model.app.g.bT(paramString, false);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(7145);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.field_packageName;
      AppMethodBeat.o(7145);
    }
  }

  public final boolean afj(String paramString)
  {
    AppMethodBeat.i(7148);
    boolean bool = com.tencent.mm.bp.d.afj(paramString);
    AppMethodBeat.o(7148);
    return bool;
  }

  public final String afk(String paramString)
  {
    AppMethodBeat.i(7156);
    boolean bool = com.tencent.mm.kernel.g.RK();
    ab.i("MicroMsg.WebViewStubService", "getDynamicConfigValue, accHasReady = ".concat(String.valueOf(bool)));
    if (!bool)
    {
      paramString = (String)new WebViewStubService.1.4(this, paramString).b(WebViewStubService.f(this.uqB));
      AppMethodBeat.o(7156);
    }
    while (true)
    {
      return paramString;
      paramString = com.tencent.mm.m.g.Nu().getValue(paramString);
      AppMethodBeat.o(7156);
    }
  }

  public final void afl(String paramString)
  {
    AppMethodBeat.i(7157);
    boolean bool = com.tencent.mm.kernel.g.RK();
    ab.i("MicroMsg.WebViewStubService", "triggerGetContact, accHasReady = ".concat(String.valueOf(bool)));
    paramString = new WebViewStubService.1.5(this, paramString);
    if (!bool)
    {
      paramString.b(WebViewStubService.f(this.uqB));
      AppMethodBeat.o(7157);
    }
    while (true)
    {
      return;
      paramString.b(null);
      AppMethodBeat.o(7157);
    }
  }

  public final int afm(String paramString)
  {
    AppMethodBeat.i(7159);
    cl localcl = new cl();
    ((com.tencent.mm.plugin.fav.a.ad)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ad.class)).a(localcl, 1, paramString);
    com.tencent.mm.sdk.b.a.xxA.m(localcl);
    int i = localcl.cvB.ret;
    AppMethodBeat.o(7159);
    return i;
  }

  public final void afn(String paramString)
  {
    AppMethodBeat.i(7162);
    Object localObject1;
    if (com.tencent.mm.sdk.platformtools.r.amo(paramString))
    {
      localObject1 = com.tencent.mm.a.g.cz(paramString);
      localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd((String)localObject1);
      if ((localObject1 != null) && (((EmojiInfo)localObject1).duP()))
        break label384;
      localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr();
      ah.getContext();
      localObject1 = ((com.tencent.mm.pluginsdk.a.d)localObject1).Jf(paramString);
      localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd((String)localObject1);
    }
    label384: 
    while (true)
    {
      int i;
      label108: Object localObject2;
      if (localObject1 == null)
      {
        i = 0;
        if (localObject1 != null)
          break label218;
        localObject2 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
        if (((com.tencent.mm.sdk.platformtools.d.decodeFile(paramString, (BitmapFactory.Options)localObject2) == null) || (((BitmapFactory.Options)localObject2).outHeight <= com.tencent.mm.m.b.Na())) && (((BitmapFactory.Options)localObject2).outWidth <= com.tencent.mm.m.b.Na()))
          break label378;
      }
      label218: label378: for (int j = 1; ; j = 0)
      {
        if ((i > com.tencent.mm.m.b.Nb()) || (j != 0))
        {
          com.tencent.mm.ui.base.h.a(ah.getContext(), this.uqB.getString(2131299043), "", this.uqB.getString(2131300601), null);
          AppMethodBeat.o(7162);
        }
        while (true)
        {
          return;
          i = com.tencent.mm.a.e.cs(((EmojiInfo)localObject1).dve());
          break;
          paramString = ((EmojiInfo)localObject1).dve();
          break label108;
          localObject2 = new Intent();
          if (localObject1 == null);
          for (paramString = ""; ; paramString = ((EmojiInfo)localObject1).Aq())
          {
            ((Intent)localObject2).putExtra("Retr_File_Name", paramString);
            ((Intent)localObject2).putExtra("Retr_Msg_Type", 5);
            ((Intent)localObject2).putExtra("Retr_MsgImgScene", 1);
            ((Intent)localObject2).addFlags(268435456);
            com.tencent.mm.plugin.webview.a.a.gkE.k((Intent)localObject2, this.uqB);
            AppMethodBeat.o(7162);
            break;
          }
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("Retr_File_Name", paramString);
          ((Intent)localObject1).putExtra("Retr_Compress_Type", 0);
          ((Intent)localObject1).putExtra("Retr_Msg_Type", 0);
          ((Intent)localObject1).addFlags(268435456);
          com.tencent.mm.plugin.webview.a.a.gkE.k((Intent)localObject1, this.uqB);
          AppMethodBeat.o(7162);
        }
      }
    }
  }

  public final void afo(String paramString)
  {
    AppMethodBeat.i(7174);
    if ((WebViewStubService.i(this.uqB) == null) || (!WebViewStubService.i(this.uqB).containsKey(paramString)))
    {
      ab.e("MicroMsg.WebViewStubService", "%s is not recognizing", new Object[] { paramString });
      AppMethodBeat.o(7174);
    }
    while (true)
    {
      return;
      com.tencent.mm.g.a.an localan = new com.tencent.mm.g.a.an();
      localan.ctC.filePath = paramString;
      com.tencent.mm.sdk.b.a.xxA.m(localan);
      WebViewStubService.i(this.uqB).remove(paramString);
      AppMethodBeat.o(7174);
    }
  }

  public final String afp(String paramString)
  {
    AppMethodBeat.i(7176);
    com.tencent.mm.pluginsdk.e.aiq(paramString);
    AppMethodBeat.o(7176);
    return "";
  }

  public final void ao(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(7147);
    Bundle localBundle = new Bundle();
    localBundle.putInt("proxyui_expired_errtype", paramInt1);
    localBundle.putInt("proxyui_expired_errcode", paramInt2);
    WebViewStubService.a(this.uqB, 6, localBundle, paramInt3);
    AppMethodBeat.o(7147);
  }

  public final String bF(int paramInt, String paramString)
  {
    AppMethodBeat.i(7128);
    paramString = bo.bc((String)com.tencent.mm.kernel.g.RP().Ry().get(paramInt, null), paramString);
    AppMethodBeat.o(7128);
    return paramString;
  }

  public final void bG(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(7136);
    com.tencent.mm.pluginsdk.r.a.vax.a(this.uqB, paramString, paramBoolean);
    AppMethodBeat.o(7136);
  }

  public final boolean cZd()
  {
    AppMethodBeat.i(7121);
    boolean bool = com.tencent.mm.kernel.g.RK();
    AppMethodBeat.o(7121);
    return bool;
  }

  public final String[] cZe()
  {
    AppMethodBeat.i(7151);
    Object localObject = com.tencent.mm.m.g.Nv().O("WebViewConfig", "removeJavascriptInterface");
    if (bo.isNullOrNil((String)localObject))
    {
      localObject = null;
      AppMethodBeat.o(7151);
    }
    while (true)
    {
      return localObject;
      localObject = ((String)localObject).split(";");
      AppMethodBeat.o(7151);
    }
  }

  public final String cZf()
  {
    AppMethodBeat.i(7153);
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(-1535680990, null);
    AppMethodBeat.o(7153);
    return str;
  }

  public final String cZg()
  {
    AppMethodBeat.i(7155);
    String str = com.tencent.mm.sdk.platformtools.aa.g(this.uqB.getSharedPreferences(ah.doA(), 0));
    AppMethodBeat.o(7155);
    return str;
  }

  public final String cZh()
  {
    AppMethodBeat.i(7164);
    Object localObject = new hv();
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((hv)localObject).cCO.url;
    AppMethodBeat.o(7164);
    return localObject;
  }

  public final Map cZi()
  {
    AppMethodBeat.i(7165);
    Object localObject = com.tencent.mm.m.g.Nv().Nf();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(7165);
    }
    while (true)
    {
      return localObject;
      localObject = ((com.tencent.mm.m.d)localObject).evZ;
      AppMethodBeat.o(7165);
    }
  }

  public final int cZj()
  {
    AppMethodBeat.i(7166);
    com.tencent.mm.kernel.g.RN();
    int i = com.tencent.mm.kernel.a.QF();
    AppMethodBeat.o(7166);
    return i;
  }

  public final int cZk()
  {
    AppMethodBeat.i(7167);
    int i = bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12304, null));
    AppMethodBeat.o(7167);
    return i;
  }

  public final void cZl()
  {
    AppMethodBeat.i(7168);
    Intent localIntent = new Intent();
    String str = (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null);
    localIntent.setFlags(268435456);
    localIntent.putExtra("sns_userName", str);
    localIntent.addFlags(67108864);
    localIntent.putExtra("sns_adapter_type", 1);
    int i = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(68389, null), 0);
    com.tencent.mm.kernel.g.RP().Ry().set(68389, Integer.valueOf(i + 1));
    localIntent.setClassName(ah.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI");
    this.uqB.startActivity(localIntent);
    AppMethodBeat.o(7168);
  }

  public final void cZm()
  {
    AppMethodBeat.i(7169);
    if ((com.tencent.mm.model.r.YK() & 0x8000) == 0);
    for (int i = 1; ; i = 0)
    {
      if ((i != 0) && (com.tencent.mm.bp.d.afj("sns")))
      {
        Intent localIntent = new Intent();
        localIntent.setFlags(268435456);
        localIntent.addFlags(67108864);
        localIntent.setClassName(ah.getContext(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
        localIntent.putExtra("sns_timeline_NeedFirstLoadint", true);
        this.uqB.startActivity(localIntent);
      }
      AppMethodBeat.o(7169);
      return;
    }
  }

  public final boolean cZn()
  {
    AppMethodBeat.i(7172);
    boolean bool = com.tencent.mm.model.r.YM();
    AppMethodBeat.o(7172);
    return bool;
  }

  public final boolean cZo()
  {
    boolean bool = true;
    AppMethodBeat.i(7177);
    if (vn("EnableWebviewScanQRCode") == 1)
      AppMethodBeat.o(7177);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(7177);
    }
  }

  public final boolean cZp()
  {
    AppMethodBeat.i(7182);
    com.tencent.mm.kernel.g.RN();
    boolean bool;
    if ((!com.tencent.mm.kernel.a.QX()) || (com.tencent.mm.kernel.a.QT()))
    {
      bool = true;
      AppMethodBeat.o(7182);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(7182);
    }
  }

  public final List<String> cZq()
  {
    AppMethodBeat.i(7185);
    if (com.tencent.mm.kernel.g.RK())
      com.tencent.mm.plugin.webview.modeltools.g.cYz();
    for (Object localObject = com.tencent.mm.plugin.webview.modeltools.g.cYG(); ; localObject = null)
    {
      if (localObject == null)
      {
        localObject = new ArrayList();
        AppMethodBeat.o(7185);
      }
      while (true)
      {
        return localObject;
        localObject = new ArrayList(((com.tencent.mm.plugin.webview.modeltools.m)localObject).cYN());
        AppMethodBeat.o(7185);
      }
    }
  }

  public final int cZr()
  {
    AppMethodBeat.i(7187);
    int i = com.tencent.mm.pluginsdk.wallet.i.cZr();
    AppMethodBeat.o(7187);
    return i;
  }

  public final boolean cZs()
  {
    boolean bool = true;
    AppMethodBeat.i(7188);
    if (vn("WebViewDownLoadFileSwitch") == 1)
      AppMethodBeat.o(7188);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(7188);
    }
  }

  public final String[] cZt()
  {
    AppMethodBeat.i(7189);
    Object localObject = com.tencent.mm.m.g.Nv().O("AsyncCheckUrl", "UrlHost");
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = ((String)localObject).split(";");
      AppMethodBeat.o(7189);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(7189);
    }
  }

  public final void dB(String paramString, int paramInt)
  {
    AppMethodBeat.i(7135);
    new Bundle().putInt("webview_binder_id", paramInt);
    WebViewStubService.a(this.uqB, 5, null, paramInt);
    AppMethodBeat.o(7135);
  }

  public final String dC(String paramString, int paramInt)
  {
    AppMethodBeat.i(7158);
    switch (paramInt)
    {
    default:
      paramString = null;
      AppMethodBeat.o(7158);
    case 1:
    case 2:
    }
    while (true)
    {
      return paramString;
      paramString = ap.aeC(paramString);
      AppMethodBeat.o(7158);
      continue;
      paramString = ap.aeD(paramString);
      AppMethodBeat.o(7158);
    }
  }

  public final void dD(String paramString, int paramInt)
  {
    AppMethodBeat.i(7171);
    Bundle localBundle = new Bundle();
    localBundle.putString("proxyui_phone", paramString);
    WebViewStubService.a(this.uqB, 8, localBundle, paramInt);
    AppMethodBeat.o(7171);
  }

  public final boolean dq(String paramString)
  {
    AppMethodBeat.i(7146);
    boolean bool = ((com.tencent.mm.pluginsdk.q)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.q.class)).dq(paramString);
    AppMethodBeat.o(7146);
    return bool;
  }

  public final void favEditTag()
  {
    AppMethodBeat.i(7160);
    gh localgh = new gh();
    localgh.cAH.type = 35;
    com.tencent.mm.sdk.b.a.xxA.m(localgh);
    AppMethodBeat.o(7160);
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7181);
    Object localObject1 = new Bundle();
    label355: Object localObject3;
    long l1;
    boolean bool;
    label555: int i;
    label657: Object localObject2;
    Object localObject4;
    Object localObject5;
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.WebViewStubService", "unknown action = %d", new Object[] { Integer.valueOf(paramInt) });
    case 14:
    case 15:
    case 16:
    case 17:
    case 4006:
    case 19:
    case 75:
    case 51:
    case 23:
    case 24:
    case 26:
    case 31:
    case 50:
    case 76:
    case 71:
    case 93:
    case 94:
    case 100:
    case 10001:
    case 80:
    case 83:
    case 78:
    case 91:
    case 92:
      while (true)
      {
        AppMethodBeat.o(7181);
        paramBundle = (Bundle)localObject1;
        while (true)
        {
          return paramBundle;
          if (paramBundle == null)
          {
            paramBundle = null;
            AppMethodBeat.o(7181);
          }
          else
          {
            localObject3 = bo.nullAsNil(paramBundle.getString("task_url"));
            paramBundle = paramBundle.getString("task_name");
            ab.i("MicroMsg.WebViewStubService", "add download task, taskurl = %s, taskname = %s", new Object[] { localObject3, paramBundle });
            if (bo.isNullOrNil((String)localObject3))
            {
              ab.e("MicroMsg.WebViewStubService", "download url is null or nil");
              paramBundle = null;
              AppMethodBeat.o(7181);
            }
            else
            {
              localObject1 = new e.a();
              ((e.a)localObject1).It((String)localObject3);
              ((e.a)localObject1).Iv(paramBundle);
              ((e.a)localObject1).ga(true);
              ((e.a)localObject1).tN(1);
              paramBundle = ((e.a)localObject1).kNl;
              l1 = com.tencent.mm.plugin.downloader.model.d.bij().a(paramBundle);
              ab.i("MicroMsg.WebViewStubService", "add download task, downloadId = %d", new Object[] { Long.valueOf(l1) });
              paramBundle = new Bundle();
              paramBundle.putLong("download_id", l1);
              AppMethodBeat.o(7181);
              continue;
              l1 = paramBundle.getLong("download_id", 0L);
              paramBundle = com.tencent.mm.plugin.downloader.model.d.bij().hm(l1);
              if (paramBundle == null)
              {
                bool = true;
                if (paramBundle != null)
                  break label657;
              }
              for (paramInt = 0; ; paramInt = paramBundle.status)
              {
                ab.i("MicroMsg.WebViewStubService", "query download task info, info == null ? %b task state = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramInt) });
                paramInt = 0;
                if (paramBundle != null)
                  paramInt = paramBundle.status;
                ab.i("MicroMsg.WebViewStubService", "query download task, task id = %d, ret = %d", new Object[] { Long.valueOf(l1), Integer.valueOf(paramInt) });
                paramBundle = new Bundle();
                paramBundle.putInt("download_state", paramInt);
                AppMethodBeat.o(7181);
                break;
                bool = false;
                break label555;
              }
              l1 = paramBundle.getLong("download_id", 0L);
              paramInt = com.tencent.mm.plugin.downloader.model.d.bij().hl(l1);
              ab.i("MicroMsg.WebViewStubService", "query download task, task id = %d, ret = %d", new Object[] { Long.valueOf(l1), Integer.valueOf(paramInt) });
              paramBundle = new Bundle();
              if (paramInt > 0);
              for (bool = true; ; bool = false)
              {
                paramBundle.putBoolean("cancel_result", bool);
                AppMethodBeat.o(7181);
                break;
              }
              l1 = paramBundle.getLong("download_id");
              localObject3 = com.tencent.mm.plugin.downloader.model.d.bij().hm(l1);
              paramBundle = new Bundle();
              if (localObject3 == null)
              {
                ab.e("MicroMsg.WebViewStubService", "install download task fail, get download task info failed");
                paramBundle.putBoolean("install_result", false);
                AppMethodBeat.o(7181);
              }
              else if (((FileDownloadTaskInfo)localObject3).status != 3)
              {
                ab.e("MicroMsg.WebViewStubService", "install download task fail, invalid status = " + ((FileDownloadTaskInfo)localObject3).status);
                paramBundle.putBoolean("install_result", false);
                AppMethodBeat.o(7181);
              }
              else if (com.tencent.mm.a.e.ct(((FileDownloadTaskInfo)localObject3).path))
              {
                localObject3 = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject3).path));
                com.tencent.mm.pluginsdk.model.app.q.a(this.uqB, (Uri)localObject3, null);
                paramBundle.putBoolean("install_result", true);
                AppMethodBeat.o(7181);
              }
              else
              {
                ab.e("MicroMsg.WebViewStubService", "file not exists : %s", new Object[] { ((FileDownloadTaskInfo)localObject3).path });
                paramBundle.putBoolean("install_result", false);
                AppMethodBeat.o(7181);
                continue;
                paramBundle = new Bundle();
                localObject3 = ah.doC().getString("nfc_open_url", null);
                ab.i("MicroMsg.WebViewStubService", "nfc url=" + bo.nullAsNil((String)localObject3));
                if ((!bo.isNullOrNil((String)localObject3)) && (!bo.isNullOrNil(((String)localObject3).trim())))
                  paramBundle.putString("debugConfig", (String)localObject3);
                paramBundle.putString("config", String.valueOf(com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xKW, null)));
                AppMethodBeat.o(7181);
                continue;
                paramBundle = new Bundle();
                paramBundle.putBoolean("webview_video_proxy_init", ao.cXP().hasInit);
                AppMethodBeat.o(7181);
                continue;
                paramBundle = ao.cXP();
                if (paramBundle.hasInit)
                {
                  paramBundle.umI = null;
                  ao.umH = null;
                  paramBundle.hasInit = false;
                }
                paramBundle = null;
                AppMethodBeat.o(7181);
                continue;
                try
                {
                  if (Looper.myLooper() == null)
                    Looper.prepare();
                  paramBundle = com.tencent.mm.sdk.g.d.xDG;
                  localObject3 = new com/tencent/mm/plugin/webview/stub/WebViewStubService$1$6;
                  ((WebViewStubService.1.6)localObject3).<init>(this);
                  paramBundle.execute((Runnable)localObject3);
                  paramBundle = null;
                  AppMethodBeat.o(7181);
                }
                catch (Exception paramBundle)
                {
                  while (true)
                    ab.printErrStackTrace("MicroMsg.WebViewStubService", paramBundle, "", new Object[0]);
                }
                bool = com.tencent.mm.kernel.g.RK();
                paramBundle = new WebViewStubService.1.7(this);
                if (!bool);
                for (paramBundle = (String)paramBundle.b(WebViewStubService.f(this.uqB)); ; paramBundle = (String)paramBundle.b(null))
                {
                  localObject3 = new Bundle();
                  ((Bundle)localObject3).putString("config_info_username", paramBundle);
                  AppMethodBeat.o(7181);
                  paramBundle = (Bundle)localObject3;
                  break;
                }
                paramBundle = new Bundle();
                localObject3 = null;
                try
                {
                  localObject1 = com.tencent.mm.model.c.c.abi().ll(com.tencent.mm.plugin.webview.modeltools.c.uoy);
                  localObject3 = localObject1;
                  if ((localObject3 == null) || (!((com.tencent.mm.storage.c)localObject3).isValid()))
                  {
                    ab.i("MicroMsg.WebViewStubService", "WebViewCookiesCleanup: dbItem(%s) invalid", new Object[] { localObject3 });
                    AppMethodBeat.o(7181);
                  }
                }
                catch (AssertionFailedError localAssertionFailedError)
                {
                  while (true)
                    ab.i("MicroMsg.WebViewStubService", "WebViewCookiesCleanup: getHostList, acc stg is null");
                }
                catch (com.tencent.mm.model.b localb)
                {
                  while (true)
                    ab.i("MicroMsg.WebViewStubService", "WebViewCookiesCleanup: getHostList, uin invalid");
                  localObject3 = ((com.tencent.mm.storage.c)localObject3).dru();
                  l1 = bo.getLong((String)((Map)localObject3).get("interval"), 0L);
                  long l2 = bo.anT();
                  long l3 = bo.c((Long)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xMh, null));
                  ab.i("MicroMsg.WebViewStubService", "WebViewCookiesCleanup: nextQuerySeconds(%d), now(%d), interval(%d)", new Object[] { Long.valueOf(l3), Long.valueOf(l2), Long.valueOf(l1) });
                  if (l3 >= l2)
                  {
                    ab.i("MicroMsg.WebViewStubService", "WebViewCookiesCleanup: not exceed interval, skip");
                    AppMethodBeat.o(7181);
                    continue;
                  }
                  com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xMh, Long.valueOf(l1 + l2));
                  i = bo.getInt((String)((Map)localObject3).get("urlCount"), 0);
                  localObject2 = new ArrayList(i);
                  for (paramInt = 0; paramInt < i; paramInt++)
                    ((ArrayList)localObject2).add(((Map)localObject3).get(String.format("url%d", new Object[] { Integer.valueOf(paramInt) })));
                  paramBundle.putStringArrayList("cookies_cleanup_url_list", (ArrayList)localObject2);
                  AppMethodBeat.o(7181);
                }
                continue;
                com.tencent.mm.plugin.webview.modelcache.c.cYl();
                paramBundle = new Bundle(1);
                paramBundle.putBoolean("webview_resource_cache_inWhiteList", false);
                AppMethodBeat.o(7181);
                continue;
                if (!com.tencent.mm.kernel.g.RK())
                {
                  paramBundle = null;
                  AppMethodBeat.o(7181);
                }
                else
                {
                  paramBundle = com.tencent.mm.model.c.c.abi().ll("100036");
                  if (!paramBundle.isValid())
                  {
                    ab.d("MicroMsg.WebViewStubService", "test is valid");
                    paramBundle = null;
                    AppMethodBeat.o(7181);
                  }
                  else
                  {
                    localObject3 = paramBundle.dru();
                    paramBundle = new Bundle();
                    paramInt = bo.getInt((String)((Map)localObject3).get("controlFlag"), 0);
                    paramBundle.putInt("webview_ad_intercept_control_flag", paramInt);
                    if (paramInt == 0)
                    {
                      ab.i("MicroMsg.WebViewStubService", "control flag = 0, ignore get black list and white list");
                      AppMethodBeat.o(7181);
                    }
                    else
                    {
                      i = bo.getInt((String)((Map)localObject3).get("blackListCount"), 0);
                      localObject2 = new ArrayList();
                      for (paramInt = 0; paramInt < i; paramInt++)
                      {
                        localObject4 = (String)((Map)localObject3).get("blackList" + (paramInt + 1));
                        if ((!bo.isNullOrNil((String)localObject4)) && (!((ArrayList)localObject2).contains(localObject4)))
                        {
                          ab.i("MicroMsg.WebViewStubService", "add black list domin = %s", new Object[] { localObject4 });
                          ((ArrayList)localObject2).add(localObject4);
                        }
                      }
                      i = bo.getInt((String)((Map)localObject3).get("whiteListCount"), 0);
                      localObject5 = new ArrayList();
                      for (paramInt = 0; paramInt < i; paramInt++)
                      {
                        localObject4 = (String)((Map)localObject3).get("whiteList" + (paramInt + 1));
                        if ((!bo.isNullOrNil((String)localObject4)) && (!((ArrayList)localObject5).contains(localObject4)))
                        {
                          ab.i("MicroMsg.WebViewStubService", "add white list domin = %s", new Object[] { localObject4 });
                          ((ArrayList)localObject5).add(localObject4);
                        }
                      }
                      paramBundle.putStringArrayList("webview_ad_intercept_blacklist_domins", (ArrayList)localObject2);
                      paramBundle.putStringArrayList("webview_ad_intercept_whitelist_domins", (ArrayList)localObject5);
                      AppMethodBeat.o(7181);
                      continue;
                      if (paramBundle == null)
                      {
                        paramBundle = null;
                        AppMethodBeat.o(7181);
                      }
                      else
                      {
                        localObject3 = paramBundle.getString("data");
                        if (localObject3 == null)
                        {
                          paramBundle = null;
                          AppMethodBeat.o(7181);
                        }
                        else
                        {
                          paramBundle = new Bundle();
                          paramBundle.putInt("key_biz_type", com.tencent.mm.aj.f.qX((String)localObject3).field_type);
                          AppMethodBeat.o(7181);
                          continue;
                          if (paramBundle == null)
                          {
                            paramBundle = Bundle.EMPTY;
                            AppMethodBeat.o(7181);
                          }
                          else
                          {
                            localObject3 = new Bundle();
                            paramInt = paramBundle.getInt("webview_binder_id");
                            paramBundle = bo.nullAsNil(paramBundle.getString("rawUrl"));
                            ((Bundle)localObject3).putString("appId", com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).bK(paramBundle));
                            AppMethodBeat.o(7181);
                            paramBundle = (Bundle)localObject3;
                            continue;
                            if (paramBundle == null)
                            {
                              paramBundle = null;
                              AppMethodBeat.o(7181);
                            }
                            else
                            {
                              localObject3 = paramBundle.getString("enterprise_action");
                              paramBundle = new Bundle();
                              if (((String)localObject3).equals("enterprise_has_connector"))
                              {
                                com.tencent.mm.aj.z.aeR();
                                if (com.tencent.mm.aj.e.aev().size() > 0)
                                {
                                  bool = true;
                                  paramBundle.putBoolean("enterprise_has_connector", bool);
                                }
                              }
                              while (true)
                              {
                                AppMethodBeat.o(7181);
                                break;
                                bool = false;
                                break label2175;
                                if (((String)localObject3).equals("enterprise_connectors"))
                                {
                                  com.tencent.mm.aj.z.aeR();
                                  localObject3 = com.tencent.mm.aj.e.aev();
                                  if (localObject3 != null)
                                    paramBundle.putStringArrayList("enterprise_connectors", new ArrayList((Collection)localObject3));
                                }
                              }
                              paramBundle = new Bundle();
                              paramBundle.putBoolean("is_oauth_native", false);
                              if (!com.tencent.mm.kernel.g.RN().QY())
                              {
                                ab.i("MicroMsg.OauthAuthorizeLogic", "isABTestOauthNative account not ready");
                                AppMethodBeat.o(7181);
                              }
                              else if (!com.tencent.mm.kernel.g.RQ().eKi.eKC)
                              {
                                ab.i("MicroMsg.OauthAuthorizeLogic", "kernel has not startup done");
                                AppMethodBeat.o(7181);
                              }
                              else
                              {
                                localObject3 = com.tencent.mm.model.c.c.abi().ll("100272");
                                if (!((com.tencent.mm.storage.c)localObject3).isValid())
                                {
                                  ab.i("MicroMsg.OauthAuthorizeLogic", "isABTestOauthNative item.isValid is false");
                                  AppMethodBeat.o(7181);
                                }
                                else
                                {
                                  localObject3 = ((com.tencent.mm.storage.c)localObject3).dru();
                                  if (localObject3 == null)
                                  {
                                    ab.i("MicroMsg.OauthAuthorizeLogic", "isABTestOauthNative args == null");
                                    AppMethodBeat.o(7181);
                                  }
                                  else if ((((Map)localObject3).containsKey("isUseNative")) && ("1".equals(((Map)localObject3).get("isUseNative"))))
                                  {
                                    paramBundle.putBoolean("is_oauth_native", true);
                                    AppMethodBeat.o(7181);
                                  }
                                  else
                                  {
                                    ab.i("MicroMsg.OauthAuthorizeLogic", "isABTestOauthNative not contain the isUseNative key or the value is not 1");
                                    AppMethodBeat.o(7181);
                                    continue;
                                    paramBundle = af.a.cXG();
                                    AppMethodBeat.o(7181);
                                    continue;
                                    paramBundle = a.b.cXt();
                                    AppMethodBeat.o(7181);
                                    continue;
                                    paramBundle = new StringBuilder("kwid_");
                                    com.tencent.mm.kernel.g.RN();
                                    com.tencent.mm.modelappbrand.b.fpE = com.tencent.mm.kernel.a.QF() + "_" + bo.anU();
                                    ab.v("MicroMsg.AppBrandReporter", "refreshWeAppSearchKeywordId : %s", new Object[] { com.tencent.mm.modelappbrand.b.fpE });
                                    break;
                                    if (paramBundle == null)
                                    {
                                      paramBundle = null;
                                      AppMethodBeat.o(7181);
                                    }
                                    else
                                    {
                                      localObject4 = paramBundle.getString("KAppId");
                                      localObject3 = paramBundle.getString("shortcut_user_name");
                                      paramInt = paramBundle.getInt("webviewui_binder_id");
                                      if ((bo.isNullOrNil((String)localObject4)) || (bo.isNullOrNil((String)localObject3)))
                                      {
                                        paramBundle = null;
                                        AppMethodBeat.o(7181);
                                      }
                                      else
                                      {
                                        WebViewStubService.a(this.uqB, 10, paramBundle, paramInt);
                                        break;
                                        WebViewStubService.a(this.uqB, paramBundle.getInt("screen_orientation", -1));
                                        break;
                                        ((Bundle)localObject2).putBoolean("isOpenForFaceBook", com.tencent.mm.model.r.YX());
                                        break;
                                        if (paramBundle == null)
                                        {
                                          paramBundle = null;
                                          AppMethodBeat.o(7181);
                                        }
                                        else
                                        {
                                          paramInt = paramBundle.getInt("game_sourceScene");
                                          paramBundle = new gt();
                                          paramBundle.cBv.actionCode = 5;
                                          paramBundle.cBv.scene = paramInt;
                                          com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
                                          break;
                                          if (paramBundle == null)
                                          {
                                            paramBundle = null;
                                            AppMethodBeat.o(7181);
                                          }
                                          else
                                          {
                                            localObject3 = paramBundle.getString("game_hv_menu_appid");
                                            if (!bo.isNullOrNil((String)localObject3))
                                              break label2753;
                                            paramBundle = null;
                                            AppMethodBeat.o(7181);
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
          }
        }
        paramBundle = new gu();
        paramBundle.cBw.Cn = 3;
        paramBundle.cBw.cBy = ((String)localObject3);
        com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
        ((Bundle)localObject2).putString("game_hv_menu_pbcache", paramBundle.cBx.result);
      }
    case 129:
      label2175: paramInt = paramBundle.getInt("webview_instance_id");
      label2753: localObject3 = null;
      localObject4 = WebViewStubService.h(this.uqB).iterator();
      label2828: if (((Iterator)localObject4).hasNext())
      {
        localObject5 = (WebViewStubCallbackWrapper)((Iterator)localObject4).next();
        if ((localObject5 == null) || (((WebViewStubCallbackWrapper)localObject5).id != paramInt))
          break label4334;
        localObject3 = ((WebViewStubCallbackWrapper)localObject5).uuT;
      }
      break;
    case 131:
    case 100000:
    case 96:
    case 250:
    case 251:
    case 106:
    case 108:
    case 109:
    case 102:
    case 103:
    case 104:
    case 105:
    case 204:
    }
    label3103: label3645: label4031: label4334: 
    while (true)
    {
      while (true)
      {
        while (true)
        {
          break label2828;
          com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt).a(this.uqB, (e)localObject3);
          localObject3 = new HashMap();
          ((Map)localObject3).put("scene", Integer.valueOf(paramBundle.getInt("scene")));
          ((Map)localObject3).put("webview_instance_id", Integer.valueOf(paramInt));
          com.tencent.mm.plugin.webview.modeltools.g.cYC().aw((Map)localObject3);
          break;
          localObject4 = new HashMap();
          ((Map)localObject4).put("logString", paramBundle.getString("logString"));
          localObject5 = com.tencent.mm.plugin.webview.modeltools.g.cYC();
          localObject3 = com.tencent.mm.plugin.websearch.api.aa.t((Map)localObject4, "logString");
          HashMap localHashMap = new HashMap();
          if (!((String)localObject3).contains("h5version="))
            localHashMap.put("h5version", Integer.valueOf(com.tencent.mm.plugin.websearch.api.aa.HV(0)));
          paramBundle = (Bundle)localObject3;
          if (localHashMap.keySet().size() > 0)
            if (((String)localObject3).length() <= 0)
              break label3103;
          for (paramBundle = (String)localObject3 + "&" + com.tencent.mm.plugin.websearch.api.aa.an(localHashMap); ; paramBundle = com.tencent.mm.plugin.websearch.api.aa.an(localHashMap))
          {
            ((Map)localObject4).put("logString", paramBundle);
            ((com.tencent.mm.plugin.webview.fts.b)localObject5).ay((Map)localObject4);
            break;
          }
          paramBundle = com.tencent.mm.model.c.c.abi().ll("100248");
          if (!paramBundle.isValid())
          {
            ab.d("MicroMsg.WebViewStubService", "force geta8key abtest is not invaild");
            paramBundle = null;
            AppMethodBeat.o(7181);
            break label355;
          }
          if (bo.getInt((String)paramBundle.dru().get("isForceSync"), 0) != 1)
            break;
          paramBundle = com.tencent.mm.m.g.Nv().O("WebViewConfig", "forceSyncA8KeyHostPath");
          ab.d("MicroMsg.ConfigListDecoder", "host list = %s", new Object[] { paramBundle });
          ((Bundle)localObject2).putString("force_geta8key_host_path", paramBundle);
          break;
          if (paramBundle == null)
          {
            paramBundle = null;
            AppMethodBeat.o(7181);
            break label355;
          }
          localObject4 = paramBundle.keySet();
          if (localObject4 == null)
          {
            paramBundle = null;
            AppMethodBeat.o(7181);
            break label355;
          }
          localObject3 = new JSONObject();
          try
          {
            localObject5 = ((Set)localObject4).iterator();
            while (((Iterator)localObject5).hasNext())
            {
              localObject4 = (String)((Iterator)localObject5).next();
              ((JSONObject)localObject3).put((String)localObject4, paramBundle.get((String)localObject4));
            }
          }
          catch (JSONException paramBundle)
          {
            paramBundle = null;
            AppMethodBeat.o(7181);
          }
          break label355;
          paramBundle = new gu();
          paramBundle.cBw.Cn = 4;
          paramBundle.cBw.cBy = ((JSONObject)localObject3).toString();
          com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
          break;
          if (paramBundle == null)
          {
            paramBundle = null;
            AppMethodBeat.o(7181);
            break label355;
          }
          if (paramBundle == null)
            break;
          try
          {
            localObject3 = new com/tencent/mm/modelstat/a/c$1;
            ((c.1)localObject3).<init>(paramBundle);
            com.tencent.mm.sdk.g.d.post((Runnable)localObject3, "web_call_rpt");
          }
          catch (Exception paramBundle)
          {
            ab.printErrStackTrace("MicroMsg.WebViewStubService", paramBundle, "webview call back mm error", new Object[0]);
          }
        }
        break;
        if (paramBundle == null)
        {
          paramBundle = null;
          AppMethodBeat.o(7181);
          break label355;
        }
        l1 = paramBundle.getLong("key_activity_browse_time", 0L);
        com.tencent.mm.modelstat.f.akh().u(WebViewUI.class.getName(), l1);
        break;
        paramBundle = com.tencent.mm.model.c.c.abi().ll("100484");
        if (!paramBundle.isValid())
        {
          paramBundle = null;
          AppMethodBeat.o(7181);
          break label355;
        }
        if ("1".equals(paramBundle.dru().get("closeDelayInject")))
        {
          paramBundle = new Bundle();
          AppMethodBeat.o(7181);
          break label355;
        }
        paramBundle = null;
        AppMethodBeat.o(7181);
        break label355;
        paramBundle = new bu();
        com.tencent.mm.sdk.b.a.xxA.m(paramBundle);
        paramBundle = null;
        AppMethodBeat.o(7181);
        break label355;
        if (paramBundle == null)
        {
          paramBundle = new Bundle();
          AppMethodBeat.o(7181);
          break label355;
        }
        paramInt = paramBundle.getInt("WebViewShare_BinderID");
        localObject3 = paramBundle.getString("WebViewShare_wv_url", "");
        paramBundle = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
        localObject2 = com.tencent.mm.pluginsdk.ui.tools.u.aef((String)localObject3);
        localObject3 = paramBundle.uGw;
        if ((((com.tencent.mm.plugin.webview.e.c)localObject3).uKV.containsKey(localObject2)) && (((com.tencent.mm.plugin.webview.e.c)localObject3).uKV.get(localObject2) != null))
        {
          paramInt = 1;
          if (paramInt != 0)
            break label3717;
        }
        for (paramBundle = null; ; paramBundle = paramBundle.uGw.agE((String)localObject2))
        {
          localObject3 = new Bundle();
          if (paramBundle != null)
          {
            ((Bundle)localObject3).putInt("key_hao_kan_permission", paramBundle.permission);
            ((Bundle)localObject3).putInt("key_hao_kan_recommand", paramBundle.uKW);
            ((Bundle)localObject3).putString("key_hao_kan_title", paramBundle.title);
          }
          AppMethodBeat.o(7181);
          paramBundle = (Bundle)localObject3;
          break;
          paramInt = 0;
          break label3645;
        }
        if (paramBundle == null)
        {
          paramBundle = null;
          AppMethodBeat.o(7181);
          break label355;
        }
        ((Bundle)localObject2).putBoolean("is_enterprise_username", com.tencent.mm.aj.f.ra(paramBundle.getString("enterprise_biz_username")));
        break;
        paramBundle = n.a.af(paramBundle);
        AppMethodBeat.o(7181);
        break label355;
        localObject3 = new Bundle();
        com.tencent.mm.plugin.webview.modeltools.f.V(paramBundle);
        ((Bundle)localObject3).putBoolean("open_result", false);
        AppMethodBeat.o(7181);
        paramBundle = (Bundle)localObject3;
        break label355;
        if (paramBundle == null)
        {
          paramBundle = new Bundle();
          AppMethodBeat.o(7181);
          break label355;
        }
        paramInt = paramBundle.getInt("WebViewShare_BinderID");
        i = paramBundle.getInt("WebViewShare_type");
        localObject3 = new Bundle();
        localObject2 = paramBundle.getString("WebViewShare_wv_url", "");
        paramBundle = null;
        if (i == 1)
        {
          paramBundle = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
          localObject2 = com.tencent.mm.pluginsdk.ui.tools.u.aef((String)localObject2);
          localObject4 = paramBundle.uGv;
          if ((((l)localObject4).upC.containsKey(localObject2)) && (((l)localObject4).upC.get(localObject2) != null))
          {
            paramInt = 1;
            if (paramInt != 0)
              break label4013;
            paramBundle = null;
            if (paramBundle == null)
              break label4031;
            bool = true;
            ((Bundle)localObject3).putBoolean("WebViewShare_reslut", bool);
          }
        }
        while (i != 2)
          while (true)
          {
            if (paramBundle != null)
            {
              ((Bundle)localObject3).putString("link", paramBundle.link);
              ((Bundle)localObject3).putString("title", paramBundle.title);
              ((Bundle)localObject3).putString("desc", paramBundle.desc);
              ((Bundle)localObject3).putString("img_url", paramBundle.rid);
            }
            AppMethodBeat.o(7181);
            paramBundle = (Bundle)localObject3;
            break;
            paramInt = 0;
            continue;
            paramBundle = (l.a)paramBundle.uGv.upC.get(localObject2);
            continue;
            bool = false;
          }
        paramBundle = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
        localObject4 = com.tencent.mm.pluginsdk.ui.tools.u.aef((String)localObject2);
        localObject2 = paramBundle.uGv;
        if ((((l)localObject2).upD.containsKey(localObject4)) && (((l)localObject2).upD.get(localObject4) != null))
        {
          paramInt = 1;
          label4085: if (paramInt != 0)
            break label4116;
          paramBundle = null;
          label4091: if (paramBundle == null)
            break label4135;
        }
        for (bool = true; ; bool = false)
        {
          ((Bundle)localObject3).putBoolean("WebViewShare_reslut", bool);
          break;
          paramInt = 0;
          break label4085;
          paramBundle = (l.a)paramBundle.uGv.upD.get(localObject4);
          break label4091;
        }
        if (paramBundle == null)
        {
          paramBundle = null;
          AppMethodBeat.o(7181);
          break label355;
        }
        try
        {
          paramBundle.setClassLoader(getClass().getClassLoader());
          if (paramBundle.getStringArrayList("reportAdH5Load") == null)
            break;
          localObject3 = paramBundle.getStringArrayList("reportAdH5Load");
          localObject4 = new com/tencent/mm/g/a/og;
          ((og)localObject4).<init>();
          ((og)localObject4).cKA.cKz = ((SnsAdClick)paramBundle.getParcelable("snsAdClick"));
          ((og)localObject4).cKA.url = com.tencent.mm.compatible.util.q.encode((String)((List)localObject3).get(0), "UTF-8");
          ((og)localObject4).cKA.cKB = bo.ank((String)((List)localObject3).get(1));
          ((og)localObject4).cKA.timestamp = bo.anl((String)((List)localObject3).get(2));
          ((og)localObject4).cKA.errorCode = paramBundle.getInt("errCode", 0);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject4);
        }
        catch (Exception paramBundle)
        {
          ab.e("MicroMsg.WebViewStubService", "report sns ad exception, %s", new Object[] { paramBundle.getMessage() });
        }
      }
      break;
    }
  }

  public final String getLanguage()
  {
    AppMethodBeat.i(7163);
    String str = com.tencent.mm.sdk.platformtools.aa.gw(ah.getContext());
    AppMethodBeat.o(7163);
    return str;
  }

  public final int gw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7126);
    paramInt1 = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(paramInt1, null), paramInt2);
    AppMethodBeat.o(7126);
    return paramInt1;
  }

  public final void gx(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7127);
    WebViewStubService.f(this.uqB).post(new WebViewStubService.1.3(this, paramInt1, paramInt2));
    AppMethodBeat.o(7127);
  }

  public final String hf(String paramString1, String paramString2)
  {
    return "";
  }

  public final void i(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(7138);
    com.tencent.mm.plugin.webview.ui.tools.jsapi.g localg = com.tencent.mm.plugin.webview.ui.tools.jsapi.h.JR(paramInt);
    if (!bo.isNullOrNil(paramString))
    {
      ab.i("MicroMsg.MsgHandler", "addInvokedJsApiFromMenu, functionName = %s, clear isBusy state", new Object[] { paramString });
      localg.eBB = false;
      localg.uGg.add(paramString);
      if (paramBoolean)
        localg.uGf.add(paramString);
    }
    AppMethodBeat.o(7138);
  }

  public final boolean isSDCardAvailable()
  {
    AppMethodBeat.i(7125);
    boolean bool = com.tencent.mm.kernel.g.RP().isSDCardAvailable();
    AppMethodBeat.o(7125);
    return bool;
  }

  public final void j(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7114);
    Object localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYC();
    switch (paramInt)
    {
    case 2:
    case 4:
    default:
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(7114);
      while (true)
      {
        return;
        int i = paramBundle.getInt("webview_id");
        ((com.tencent.mm.plugin.webview.fts.b)localObject1).ufg.remove(Integer.valueOf(i));
        paramBundle = ((com.tencent.mm.plugin.webview.fts.b)localObject1).ufm;
        if (!paramBundle.egk)
        {
          paramInt = 1;
          label93: if ((paramInt == 0) || (bo.isNullOrNil(paramBundle.query)))
            break label230;
          ab.v("MicroMsg.FTS.FTSWebViewLogic", "report isReported:%b query:%s hasResult:%b isClick:%b searchType:%d", new Object[] { Boolean.valueOf(paramBundle.egk), paramBundle.query, Boolean.valueOf(paramBundle.ctn), Boolean.valueOf(paramBundle.sAY), Integer.valueOf(paramBundle.mFl) });
          com.tencent.mm.plugin.websearch.api.an.a(paramBundle.scene, paramBundle.query, paramBundle.sAY, paramBundle.ctn, paramBundle.mFl);
          paramBundle.egk = true;
        }
        while (true)
        {
          ab.i("MicroMsg.FTS.FTSWebViewLogic", "activity destroy %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(7114);
          break;
          paramInt = 0;
          break label93;
          label230: ab.v("MicroMsg.FTS.FTSWebViewLogic", "can not report %s", new Object[] { paramBundle.query });
        }
        if (((com.tencent.mm.plugin.webview.fts.b)localObject1).mEx != null)
          ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(((com.tencent.mm.plugin.webview.fts.b)localObject1).mEx);
        Object localObject2 = new com.tencent.mm.plugin.fts.a.a.i();
        ((com.tencent.mm.plugin.fts.a.a.i)localObject2).query = paramBundle.getString("query");
        ((com.tencent.mm.plugin.fts.a.a.i)localObject2).mEt = paramBundle.getInt("count");
        ((com.tencent.mm.plugin.fts.a.a.i)localObject2).mEw = ((com.tencent.mm.plugin.webview.fts.b)localObject1).plf;
        ((com.tencent.mm.plugin.fts.a.a.i)localObject2).mEu.add("notifymessage");
        ((com.tencent.mm.plugin.webview.fts.b)localObject1).mEx = ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).search(8, (com.tencent.mm.plugin.fts.a.a.i)localObject2);
        ((com.tencent.mm.plugin.webview.fts.b)localObject1).mEx.mDs = Integer.valueOf(paramBundle.getInt("webview_id"));
        localObject2 = new s();
        ((s)localObject2).scene = paramBundle.getInt("scene");
        ((s)localObject2).ctj = paramBundle.getString("query");
        ((s)localObject2).tZw = 1;
        ((s)localObject2).cIv = paramBundle.getInt("webview_id");
        if (((com.tencent.mm.plugin.webview.fts.b)localObject1).ufj != null)
          com.tencent.mm.kernel.g.Rg().c(((com.tencent.mm.plugin.webview.fts.b)localObject1).ufj);
        ((com.tencent.mm.plugin.webview.fts.b)localObject1).ufj = new com.tencent.mm.plugin.webview.fts.e((s)localObject2);
        com.tencent.mm.kernel.g.Rg().a(1161, (com.tencent.mm.ai.f)localObject1);
        com.tencent.mm.kernel.g.Rg().a(((com.tencent.mm.plugin.webview.fts.b)localObject1).ufj, 0);
        AppMethodBeat.o(7114);
        continue;
        paramBundle = paramBundle.getString("history");
        ((com.tencent.mm.plugin.fts.a.n)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.fts.a.n.class)).deleteSOSHistory(paramBundle);
        AppMethodBeat.o(7114);
      }
      paramBundle = paramBundle.getString("reportString");
      ab.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryWebViewVisitTime %s", new Object[] { paramBundle });
      localObject1 = new bsj();
      ((bsj)localObject1).wUu = paramBundle;
      paramBundle = new com.tencent.mm.plugin.websearch.api.w((bsj)localObject1);
      com.tencent.mm.kernel.g.Rg().a(paramBundle, 0);
    }
  }

  public final void k(int paramInt, List<String> paramList)
  {
    AppMethodBeat.i(7132);
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.pYm;
    com.tencent.mm.plugin.report.service.h.g(paramInt, paramList);
    AppMethodBeat.o(7132);
  }

  public final String mJ(String paramString)
  {
    AppMethodBeat.i(7116);
    paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoO(paramString).Oi();
    AppMethodBeat.o(7116);
    return paramString;
  }

  public final boolean mY(String paramString)
  {
    AppMethodBeat.i(7117);
    boolean bool = com.tencent.mm.model.t.mY(paramString);
    AppMethodBeat.o(7117);
    return bool;
  }

  public final boolean mZ(String paramString)
  {
    AppMethodBeat.i(7119);
    boolean bool = com.tencent.mm.kernel.g.RK();
    ab.i("MicroMsg.WebViewStubService", "isBizContact, accHasReady = ".concat(String.valueOf(bool)));
    if (!bool)
    {
      bool = false;
      AppMethodBeat.o(7119);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.model.t.mZ(paramString);
      AppMethodBeat.o(7119);
    }
  }

  public final boolean nI(String paramString)
  {
    AppMethodBeat.i(7118);
    boolean bool = com.tencent.mm.model.t.nI(paramString);
    AppMethodBeat.o(7118);
    return bool;
  }

  public final Bundle p(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7115);
    com.tencent.mm.plugin.webview.modeltools.g.cYC();
    paramBundle = com.tencent.mm.plugin.webview.fts.b.p(paramInt, paramBundle);
    AppMethodBeat.o(7115);
    return paramBundle;
  }

  public final void r(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7113);
    com.tencent.mm.plugin.webview.c.a locala = com.tencent.mm.plugin.webview.modeltools.g.cYA();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramBundle.get(str));
    }
    switch (paramInt)
    {
    default:
      ab.w("MicroMsg.emoji.EmojiStoreWebViewLogic", "unknow action:%d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(7113);
    case 1:
    }
    while (true)
    {
      return;
      locala.ar(localHashMap);
      AppMethodBeat.o(7113);
    }
  }

  public final boolean s(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7129);
    ab.i("MicroMsg.WebViewStubService", "doScene, type = %d", new Object[] { Integer.valueOf(paramInt) });
    boolean bool;
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.WebViewStubService", "doScene fail, invalid type = %d", new Object[] { Integer.valueOf(paramInt) });
      bool = false;
      AppMethodBeat.o(7129);
    case 233:
    case 673:
    case 666:
    case 1254:
    case 1373:
    case 2836:
    case 1295:
    }
    while (true)
    {
      return bool;
      if (!cZd())
      {
        ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
        bool = false;
        AppMethodBeat.o(7129);
      }
      else
      {
        Object localObject = paramBundle.getString("geta8key_data_req_url");
        if (!bo.isNullOrNil(paramBundle.getString("k_share_url")))
          ar.hb((String)localObject, paramBundle.getString("k_share_url"));
        if (!bo.isNullOrNil((String)localObject));
        for (localObject = new com.tencent.mm.modelsimple.h((String)localObject, paramBundle.getString("geta8key_data_username"), paramBundle.getInt("geta8key_data_scene"), paramBundle.getInt("geta8key_data_reason"), paramBundle.getInt("geta8key_data_flag"), paramBundle.getString("geta8key_data_net_type"), paramBundle.getInt("geta8key_session_id", 0), paramBundle.getString("geta8key_data_appid"), paramBundle.getString("key_function_id"), paramBundle.getInt("key_wallet_region", 0), paramBundle.getByteArray("k_a8key_cookie")); ; localObject = new com.tencent.mm.modelsimple.h(paramBundle.getString("geta8key_data_appid"), paramBundle.getString("geta8key_data_scope"), paramBundle.getString("geta8key_data_state"), paramBundle.getInt("geta8key_session_id", 0)))
        {
          ((com.tencent.mm.modelsimple.h)localObject).tag = Integer.valueOf(paramBundle.getInt("webview_binder_id"));
          paramInt = paramBundle.getInt("geta8key_data_subscene", -1);
          if (paramInt > 0)
            ((com.tencent.mm.modelsimple.h)localObject).lV(paramInt);
          paramBundle = paramBundle.getString("geta8key_outer_url");
          if (!bo.isNullOrNil(paramBundle))
            ((com.tencent.mm.modelsimple.h)localObject).tq(paramBundle);
          bool = com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
          AppMethodBeat.o(7129);
          break;
        }
        if (!cZd())
        {
          ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
          bool = false;
          AppMethodBeat.o(7129);
        }
        else
        {
          localObject = new o(paramBundle.getString("reading_mode_data_url"), paramBundle.getString("reading_mode_data_useragent"), paramBundle.getInt("reading_mode_data_width"), paramBundle.getInt("reading_mode_data_height"));
          ((o)localObject).tag = Integer.valueOf(paramBundle.getInt("webview_binder_id"));
          bool = com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
          AppMethodBeat.o(7129);
          continue;
          if (!cZd())
          {
            ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
            bool = false;
            AppMethodBeat.o(7129);
          }
          else
          {
            bool = WebViewStubService.Y(paramBundle);
            AppMethodBeat.o(7129);
            continue;
            if (!cZd())
            {
              ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
              bool = false;
              AppMethodBeat.o(7129);
            }
            else
            {
              localObject = new com.tencent.mm.plugin.webview.model.w(paramBundle.getString("oauth_url"), paramBundle.getString("biz_username"), paramBundle.getInt("scene"));
              ((com.tencent.mm.plugin.webview.model.w)localObject).tag = Integer.valueOf(paramBundle.getInt("webview_binder_id"));
              bool = com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
              AppMethodBeat.o(7129);
              continue;
              if (!cZd())
              {
                ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                bool = false;
                AppMethodBeat.o(7129);
              }
              else
              {
                String str = paramBundle.getString("oauth_url");
                int i = paramBundle.getInt("opt");
                localObject = new LinkedList(paramBundle.getStringArrayList("scopes"));
                StringBuilder localStringBuilder = new StringBuilder();
                for (paramInt = 0; paramInt < ((LinkedList)localObject).size(); paramInt++)
                  localStringBuilder.append((String)((LinkedList)localObject).get(paramInt)).append(",");
                ab.i("MicroMsg.OauthAuthorizeLogic", "doOauthAuthorizeConfirm selectedScopes: %s", new Object[] { localStringBuilder.toString() });
                localObject = new x(str, i, (LinkedList)localObject);
                ((x)localObject).tag = Integer.valueOf(paramBundle.getInt("webview_binder_id"));
                bool = com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject, 0);
                AppMethodBeat.o(7129);
                continue;
                if (!cZd())
                {
                  ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                  bool = false;
                  AppMethodBeat.o(7129);
                }
                else
                {
                  bool = WebViewStubService.a(this.uqB, paramBundle);
                  AppMethodBeat.o(7129);
                  continue;
                  if (!cZd())
                  {
                    ab.w("MicroMsg.WebViewStubService", "doScene, hasSetUin false");
                    bool = false;
                    AppMethodBeat.o(7129);
                  }
                  else if (paramBundle == null)
                  {
                    bool = false;
                    AppMethodBeat.o(7129);
                  }
                  else
                  {
                    paramBundle = paramBundle.getString("ad_report_data_str");
                    ab.d("MicroMsg.WebViewReportUtil", "doReportCgi : %s", new Object[] { paramBundle });
                    ((com.tencent.mm.plugin.sns.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sns.b.a.class)).i(13791, paramBundle, (int)bo.anT());
                    bool = true;
                    AppMethodBeat.o(7129);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final boolean x(long paramLong, String paramString)
  {
    AppMethodBeat.i(7161);
    boolean bool;
    if ((paramLong == -9223372036854775808L) && (paramString == null))
    {
      AppMethodBeat.o(7161);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = new dq();
      if (paramLong != -9223372036854775808L)
        ((dq)localObject).cxc.cvx = paramLong;
      if (paramString != null)
        ((dq)localObject).cxc.cwT = paramString;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      if (((dq)localObject).cxd.cwB)
      {
        bool = true;
        AppMethodBeat.o(7161);
      }
      else if ((com.tencent.mm.kernel.g.RK()) && (paramLong != -9223372036854775808L))
      {
        paramString = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().jf(paramLong);
        if (paramString.getType() == 49)
        {
          bool = com.tencent.mm.model.t.kH(paramString.field_talker);
          localObject = paramString.field_content;
          int i = paramString.field_isSend;
          paramString = (String)localObject;
          if (bool)
          {
            paramString = (String)localObject;
            if (localObject != null)
            {
              paramString = (String)localObject;
              if (i == 0)
                paramString = bf.oz((String)localObject);
            }
          }
          paramString = j.b.me(paramString);
          if (paramString.type == 3)
          {
            bool = com.tencent.mm.pluginsdk.model.app.g.o(ah.getContext(), 16L);
            AppMethodBeat.o(7161);
            continue;
          }
          if (paramString.type == 4)
          {
            bool = com.tencent.mm.pluginsdk.model.app.g.o(ah.getContext(), 8L);
            AppMethodBeat.o(7161);
          }
        }
      }
      else
      {
        AppMethodBeat.o(7161);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubService.1
 * JD-Core Version:    0.6.2
 */