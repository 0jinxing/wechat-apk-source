package com.tencent.mm.plugin.webview.stub;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.network.n.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.downloader.model.k;
import com.tencent.mm.plugin.webview.model.af;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.ar;
import com.tencent.mm.plugin.webview.model.w;
import com.tencent.mm.plugin.webview.model.x;
import com.tencent.mm.plugin.webview.modelcache.r;
import com.tencent.mm.plugin.webview.modelcache.r.a;
import com.tencent.mm.plugin.webview.ui.tools.WebViewStubCallbackWrapper;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.protobuf.adl;
import com.tencent.mm.protocal.protobuf.ado;
import com.tencent.mm.protocal.protobuf.adp;
import com.tencent.mm.protocal.protobuf.anf;
import com.tencent.mm.protocal.protobuf.atp;
import com.tencent.mm.protocal.protobuf.awq;
import com.tencent.mm.protocal.protobuf.beq;
import com.tencent.mm.protocal.protobuf.bes;
import com.tencent.mm.protocal.protobuf.buv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WebViewStubService extends Service
  implements com.tencent.mm.ai.f
{
  private List<WebViewStubCallbackWrapper> cAV;
  private com.tencent.mm.sdk.b.c eFv;
  private ak handler;
  private com.tencent.mm.network.n mwl;
  private Map<String, Integer> uiP;
  private int uqA;
  private final SparseArray<Bundle> uqu;
  private d.a uqv;
  private int uqw;
  private k uqx;
  private com.tencent.mm.plugin.webview.model.d.a uqy;
  private Set<Integer> uqz;

  public WebViewStubService()
  {
    AppMethodBeat.i(7207);
    this.uqu = new SparseArray();
    this.uqv = new WebViewStubService.1(this);
    this.eFv = new WebViewStubService.2(this);
    this.cAV = new ArrayList();
    this.uqw = 0;
    this.uqz = new HashSet();
    this.uqA = -1;
    AppMethodBeat.o(7207);
  }

  public IBinder onBind(Intent paramIntent)
  {
    AppMethodBeat.i(7209);
    ab.i("MicroMsg.WebViewStubService", "WebViewStubService onBind");
    paramIntent = this.uqv;
    AppMethodBeat.o(7209);
    return paramIntent;
  }

  public void onCreate()
  {
    AppMethodBeat.i(7208);
    super.onCreate();
    ab.i("MicroMsg.WebViewStubService", "WebViewStubService onCreate");
    this.handler = new ak();
    this.uqx = new k()
    {
      public final void b(long paramAnonymousLong, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(7196);
        ab.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label169;
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            Object localObject = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if (localObject == null)
              break;
            localObject = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId;
            localBundle.putCharSequence("download_manager_appid", (CharSequence)localObject);
            localBundle.putInt("download_manager_errcode", paramAnonymousInt);
            localWebViewStubCallbackWrapper.uuT.c(1003, localBundle);
          }
        }
        catch (Exception localException)
        {
          ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFailed, ex = " + localException.getMessage());
          AppMethodBeat.o(7196);
        }
        while (true)
        {
          return;
          String str = "";
          break;
          label169: AppMethodBeat.o(7196);
        }
      }

      public final void b(long paramAnonymousLong, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(7195);
        ab.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label153;
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            paramAnonymousString = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if (paramAnonymousString == null)
              break;
            paramAnonymousString = paramAnonymousString.field_appId;
            localBundle.putCharSequence("download_manager_appid", paramAnonymousString);
            localWebViewStubCallbackWrapper.uuT.c(1002, localBundle);
          }
        }
        catch (Exception paramAnonymousString)
        {
          ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskFinished, ex = " + paramAnonymousString.getMessage());
          AppMethodBeat.o(7195);
        }
        while (true)
        {
          return;
          paramAnonymousString = "";
          break;
          label153: AppMethodBeat.o(7195);
        }
      }

      public final void gm(long paramAnonymousLong)
      {
        AppMethodBeat.i(7199);
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (localIterator.hasNext())
          {
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if ((locala == null) || (locala.field_totalSize == 0L))
            {
              ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "loadDownloadProgress failed, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
              AppMethodBeat.o(7199);
              return;
            }
            int i = (int)(locala.field_downloadedSize / locala.field_totalSize * 100.0D);
            int j = i;
            if (i == 0)
              j = 1;
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            localBundle.putInt("download_manager_progress", j);
            localBundle.putString("download_manager_appid", locala.field_appId);
            localWebViewStubCallbackWrapper.uuT.c(1007, localBundle);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskProgressChanged, ex = " + localException.getMessage());
            AppMethodBeat.o(7199);
            continue;
            AppMethodBeat.o(7199);
          }
        }
      }

      public final void gn(long paramAnonymousLong)
      {
      }

      public final void i(long paramAnonymousLong, String paramAnonymousString)
      {
        AppMethodBeat.i(7200);
        ab.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label153;
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            paramAnonymousString = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if (paramAnonymousString == null)
              break;
            paramAnonymousString = paramAnonymousString.field_appId;
            localBundle.putCharSequence("download_manager_appid", paramAnonymousString);
            localWebViewStubCallbackWrapper.uuT.c(1011, localBundle);
          }
        }
        catch (Exception paramAnonymousString)
        {
          ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + paramAnonymousString.getMessage());
          AppMethodBeat.o(7200);
        }
        while (true)
        {
          return;
          paramAnonymousString = "";
          break;
          label153: AppMethodBeat.o(7200);
        }
      }

      public final void onTaskPaused(long paramAnonymousLong)
      {
        AppMethodBeat.i(7198);
        ab.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskPaused, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label158;
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            Object localObject = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if (localObject == null)
              break;
            localObject = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId;
            localBundle.putCharSequence("download_manager_appid", (CharSequence)localObject);
            localWebViewStubCallbackWrapper.uuT.c(1010, localBundle);
          }
        }
        catch (Exception localException)
        {
          ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + localException.getMessage());
          AppMethodBeat.o(7198);
        }
        while (true)
        {
          return;
          String str = "";
          break;
          label158: AppMethodBeat.o(7198);
        }
      }

      public final void onTaskRemoved(long paramAnonymousLong)
      {
        AppMethodBeat.i(7197);
        ab.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label158;
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            Object localObject = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if (localObject == null)
              break;
            localObject = ((com.tencent.mm.plugin.downloader.f.a)localObject).field_appId;
            localBundle.putCharSequence("download_manager_appid", (CharSequence)localObject);
            localWebViewStubCallbackWrapper.uuT.c(1008, localBundle);
          }
        }
        catch (Exception localException)
        {
          ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + localException.getMessage());
          AppMethodBeat.o(7197);
        }
        while (true)
        {
          return;
          String str = "";
          break;
          label158: AppMethodBeat.o(7197);
        }
      }

      public final void onTaskStarted(long paramAnonymousLong, String paramAnonymousString)
      {
        AppMethodBeat.i(7194);
        ab.i("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskResumed, downloadId = ".concat(String.valueOf(paramAnonymousLong)));
        try
        {
          Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
          while (true)
          {
            if (!localIterator.hasNext())
              break label153;
            WebViewStubCallbackWrapper localWebViewStubCallbackWrapper = (WebViewStubCallbackWrapper)localIterator.next();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putLong("download_manager_downloadid", paramAnonymousLong);
            paramAnonymousString = com.tencent.mm.plugin.downloader.model.c.hv(paramAnonymousLong);
            if (paramAnonymousString == null)
              break;
            paramAnonymousString = paramAnonymousString.field_appId;
            localBundle.putCharSequence("download_manager_appid", paramAnonymousString);
            localWebViewStubCallbackWrapper.uuT.c(1012, localBundle);
          }
        }
        catch (Exception paramAnonymousString)
        {
          ab.w("MicroMsg.WebViewUI.IFileDownloadCallback", "onTaskRemoved, ex = " + paramAnonymousString.getMessage());
          AppMethodBeat.o(7194);
        }
        while (true)
        {
          return;
          paramAnonymousString = "";
          break;
          label153: AppMethodBeat.o(7194);
        }
      }
    };
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.a(this.uqx);
    this.uqy = new com.tencent.mm.plugin.webview.model.d.a()
    {
      public final void a(boolean paramAnonymousBoolean, int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString1, String paramAnonymousString2)
      {
        AppMethodBeat.i(7201);
        ab.i("MicroMsg.WebViewStubService", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString1, paramAnonymousString2 });
        if (paramAnonymousBoolean)
          try
          {
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putString("webview_jssdk_file_item_local_id", paramAnonymousString1);
            localBundle.putInt("webview_jssdk_file_item_progreess", paramAnonymousInt2);
            Iterator localIterator = WebViewStubService.h(WebViewStubService.this).iterator();
            while (localIterator.hasNext())
              ((WebViewStubCallbackWrapper)localIterator.next()).uuT.c(2011, localBundle);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.WebViewStubService", "notify upload image failed :%s", new Object[] { localException.getMessage() });
          }
        switch (paramAnonymousInt1)
        {
        case 3:
        default:
          ab.e("MicroMsg.WebViewStubService", "unsupport media type : %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
          AppMethodBeat.o(7201);
        case 1:
        case 2:
        case 4:
        }
        while (true)
        {
          return;
          if (paramAnonymousBoolean)
          {
            try
            {
              paramAnonymousString2 = new android/os/Bundle;
              paramAnonymousString2.<init>();
              paramAnonymousString2.putString("webview_jssdk_file_item_local_id", paramAnonymousString1);
              paramAnonymousString2.putInt("webview_jssdk_file_item_progreess", paramAnonymousInt2);
              paramAnonymousString1 = WebViewStubService.h(WebViewStubService.this).iterator();
              while (paramAnonymousString1.hasNext())
                ((WebViewStubCallbackWrapper)paramAnonymousString1.next()).uuT.c(2003, paramAnonymousString2);
            }
            catch (Exception paramAnonymousString1)
            {
              ab.e("MicroMsg.WebViewStubService", "notify upload image failed :%s", new Object[] { paramAnonymousString1.getMessage() });
              AppMethodBeat.o(7201);
            }
            continue;
            AppMethodBeat.o(7201);
          }
          else
          {
            try
            {
              paramAnonymousString1 = new android/os/Bundle;
              paramAnonymousString1.<init>();
              paramAnonymousString1.putString("webview_jssdk_file_item_server_id", paramAnonymousString2);
              paramAnonymousString1.putInt("webview_jssdk_file_item_progreess", paramAnonymousInt2);
              paramAnonymousString2 = WebViewStubService.h(WebViewStubService.this).iterator();
              while (paramAnonymousString2.hasNext())
                ((WebViewStubCallbackWrapper)paramAnonymousString2.next()).uuT.c(2004, paramAnonymousString1);
            }
            catch (Exception paramAnonymousString1)
            {
              ab.e("MicroMsg.WebViewStubService", "notify download image failed :%s", new Object[] { paramAnonymousString1.getMessage() });
              AppMethodBeat.o(7201);
            }
            continue;
            AppMethodBeat.o(7201);
            continue;
            if (paramAnonymousBoolean)
            {
              try
              {
                paramAnonymousString2 = new android/os/Bundle;
                paramAnonymousString2.<init>();
                paramAnonymousString2.putString("webview_jssdk_file_item_local_id", paramAnonymousString1);
                paramAnonymousString2.putInt("webview_jssdk_file_item_progreess", paramAnonymousInt2);
                paramAnonymousString1 = WebViewStubService.h(WebViewStubService.this).iterator();
                while (paramAnonymousString1.hasNext())
                  ((WebViewStubCallbackWrapper)paramAnonymousString1.next()).uuT.c(2005, paramAnonymousString2);
              }
              catch (Exception paramAnonymousString1)
              {
                ab.e("MicroMsg.WebViewStubService", "notify upload voice failed :%s", new Object[] { paramAnonymousString1.getMessage() });
                AppMethodBeat.o(7201);
              }
              continue;
              AppMethodBeat.o(7201);
            }
            else
            {
              try
              {
                paramAnonymousString1 = new android/os/Bundle;
                paramAnonymousString1.<init>();
                paramAnonymousString1.putString("webview_jssdk_file_item_server_id", paramAnonymousString2);
                paramAnonymousString1.putInt("webview_jssdk_file_item_progreess", paramAnonymousInt2);
                paramAnonymousString2 = WebViewStubService.h(WebViewStubService.this).iterator();
                while (paramAnonymousString2.hasNext())
                  ((WebViewStubCallbackWrapper)paramAnonymousString2.next()).uuT.c(2006, paramAnonymousString1);
              }
              catch (Exception paramAnonymousString1)
              {
                ab.e("MicroMsg.WebViewStubService", "notify download voice failed :%s", new Object[] { paramAnonymousString1.getMessage() });
                AppMethodBeat.o(7201);
              }
              continue;
              AppMethodBeat.o(7201);
              continue;
              if (!paramAnonymousBoolean)
                break;
              try
              {
                paramAnonymousString2 = new android/os/Bundle;
                paramAnonymousString2.<init>();
                paramAnonymousString2.putString("webview_jssdk_file_item_local_id", paramAnonymousString1);
                paramAnonymousString2.putInt("webview_jssdk_file_item_progreess", paramAnonymousInt2);
                paramAnonymousString1 = WebViewStubService.h(WebViewStubService.this).iterator();
                while (paramAnonymousString1.hasNext())
                  ((WebViewStubCallbackWrapper)paramAnonymousString1.next()).uuT.c(2010, paramAnonymousString2);
              }
              catch (Exception paramAnonymousString1)
              {
                ab.e("MicroMsg.WebViewStubService", "notify upload video failed :%s", new Object[] { paramAnonymousString1.getMessage() });
                AppMethodBeat.o(7201);
              }
              continue;
              AppMethodBeat.o(7201);
            }
          }
        }
      }
    };
    this.mwl = new n.a()
    {
      private final byte[] ecf;

      public final void gl(int paramAnonymousInt)
      {
        AppMethodBeat.i(7203);
        synchronized (this.ecf)
        {
          try
          {
            Object localObject1 = u.cXS();
            Bundle localBundle = new android/os/Bundle;
            localBundle.<init>();
            localBundle.putString("webview_network_type", (String)localObject1);
            localObject1 = WebViewStubService.h(WebViewStubService.this).iterator();
            while (((Iterator)localObject1).hasNext())
              ((WebViewStubCallbackWrapper)((Iterator)localObject1).next()).uuT.c(90, localBundle);
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.WebViewStubService", "notify network change failed :%s", new Object[] { localException.getMessage() });
            AppMethodBeat.o(7203);
            return;
          }
        }
      }
    };
    com.tencent.mm.kernel.g.RO().a(this.mwl);
    if (com.tencent.mm.kernel.g.RK())
      com.tencent.mm.plugin.webview.modeltools.g.cYE().a(this.uqy);
    AppMethodBeat.o(7208);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(7211);
    ab.i("MicroMsg.WebViewStubService", "WebViewStubService onDestroy");
    super.onDestroy();
    com.tencent.mm.plugin.downloader.model.d.bij();
    com.tencent.mm.plugin.downloader.model.b.b(this.uqx);
    if (com.tencent.mm.kernel.g.RK())
      com.tencent.mm.plugin.webview.modeltools.g.cYE().b(this.uqy);
    com.tencent.mm.kernel.g.RO().b(this.mwl);
    this.mwl = null;
    this.uqx = null;
    this.cAV.clear();
    AppMethodBeat.o(7211);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(7212);
    int i = paramm.getType();
    ab.i("MicroMsg.WebViewStubService", "onSceneEnd :[%d], errCode = %d, errType = %d, errMsg = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), paramString });
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (i == 106)
    {
      com.tencent.mm.kernel.g.Rg().b(106, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.WebViewStubService", "onSceneEnd, sendcard errType = " + paramInt1 + ", errCode = " + paramInt2);
        AppMethodBeat.o(7212);
      }
      while (true)
      {
        return;
        localObject1 = ((com.tencent.mm.plugin.messenger.a.f)paramm).bOj();
        paramm = aa.a(((buv)localObject1).wcB);
        com.tencent.mm.ah.o.acd().n(paramm, aa.a(((buv)localObject1).vEF));
        localObject2 = new Intent();
        ((com.tencent.mm.api.j)com.tencent.mm.kernel.g.K(com.tencent.mm.api.j.class)).a((Intent)localObject2, (buv)localObject1, 30);
        if (bo.nullAsNil(paramm).length() > 0)
        {
          localObject3 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramm);
          if ((localObject3 != null) && (!com.tencent.mm.n.a.jh(((ap)localObject3).field_type)))
            ((Intent)localObject2).putExtra("Contact_IsLBSFriend", true);
          if ((((buv)localObject1).wBT & 0x8) > 0)
            com.tencent.mm.plugin.report.service.h.pYm.X(10298, paramm + ",30");
          ((Intent)localObject2).addFlags(268435456);
          com.tencent.mm.plugin.webview.a.a.gkE.c((Intent)localObject2, this);
          localObject1 = new Bundle();
          ((Bundle)localObject1).putString("search_contact_result_user", paramm);
          try
          {
            paramm = this.cAV.iterator();
            while (paramm.hasNext())
            {
              localObject2 = (WebViewStubCallbackWrapper)paramm.next();
              localObject3 = new com/tencent/mm/plugin/webview/stub/WebViewStubService$b;
              ((WebViewStubService.b)localObject3).<init>();
              ((WebViewStubService.b)localObject3).type = i;
              ((WebViewStubService.b)localObject3).errType = paramInt1;
              ((WebViewStubService.b)localObject3).errCode = paramInt2;
              ((WebViewStubService.b)localObject3).aIm = paramString;
              ((WebViewStubService.b)localObject3).mqu = ((Bundle)localObject1);
              ((WebViewStubService.b)localObject3).mqu.putInt("scene_end_listener_hash_code", ((WebViewStubCallbackWrapper)localObject2).id);
              ((WebViewStubCallbackWrapper)localObject2).uuT.a((c)localObject3);
            }
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.WebViewStubService", "onSceneEnd searchcontact fail, ex = " + paramString.getMessage());
          }
        }
        else
        {
          AppMethodBeat.o(7212);
          continue;
        }
        AppMethodBeat.o(7212);
      }
    }
    Object localObject4;
    if ((i == 233) && ((paramm instanceof com.tencent.mm.modelsimple.h)))
    {
      localObject2 = (com.tencent.mm.modelsimple.h)paramm;
      localObject3 = new Bundle();
      localObject1 = ((com.tencent.mm.modelsimple.h)localObject2).aiW();
      if ((localObject1 == null) || (localObject1.length <= 0))
        ab.e("MicroMsg.WebViewStubService", "getA8Key controlBytes is null");
      paramm = (m)localObject1;
      if (localObject1 == null)
        paramm = null;
      ((Bundle)localObject3).putByteArray("geta8key_result_jsapi_perm_control_bytes", paramm);
      paramm = ((adp)((com.tencent.mm.modelsimple.h)localObject2).ehh.fsH.fsP).wlB;
      if (paramm == null)
      {
        j = 0;
        ((Bundle)localObject3).putInt("geta8key_result_general_ctrl_b1", j);
        ((Bundle)localObject3).putInt("geta8key_result_reason", ((ado)((com.tencent.mm.modelsimple.h)localObject2).ehh.fsG.fsP).vIw);
        ((Bundle)localObject3).putString("geta8key_result_req_url", ((com.tencent.mm.modelsimple.h)localObject2).aiU());
        ((Bundle)localObject3).putString("geta8key_result_full_url", ((com.tencent.mm.modelsimple.h)localObject2).aiT());
        ((Bundle)localObject3).putString("geta8key_result_title", ((com.tencent.mm.modelsimple.h)localObject2).getTitle());
        ((Bundle)localObject3).putInt("geta8key_result_action_code", ((com.tencent.mm.modelsimple.h)localObject2).aiV());
        ((Bundle)localObject3).putString("geta8key_result_content", ((com.tencent.mm.modelsimple.h)localObject2).getContent());
        ((Bundle)localObject3).putString("geta8key_result_head_img", ((adp)((com.tencent.mm.modelsimple.h)localObject2).ehh.fsH.fsP).wlK);
        ((Bundle)localObject3).putString("geta8key_result_wording", ((adp)((com.tencent.mm.modelsimple.h)localObject2).ehh.fsH.fsP).nzz);
        ((Bundle)localObject3).putLong("geta8key_result_deep_link_bit_set", ((com.tencent.mm.modelsimple.h)localObject2).aiZ());
        ((Bundle)localObject3).putString("geta8key_data_username", ((adp)((com.tencent.mm.modelsimple.h)localObject2).ehh.fsH.fsP).jBB);
        ((Bundle)localObject3).putByteArray("geta8key_result_cookie", ((com.tencent.mm.modelsimple.h)localObject2).ajc());
        ((Bundle)localObject3).putString("geta8key_result_menu_wording", ((adp)((com.tencent.mm.modelsimple.h)localObject2).ehh.fsH.fsP).wlL);
        ab.d("MicroMsg.WebViewStubService", "getA8KeyCookie:%s", new Object[] { bo.cd(((com.tencent.mm.modelsimple.h)localObject2).ajc()) });
        paramm = ((com.tencent.mm.modelsimple.h)localObject2).aja();
        if (bo.ek(paramm))
          break label1062;
        localObject1 = paramm.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject4 = (atp)((Iterator)localObject1).next();
          if ((localObject4 == null) || (bo.isNullOrNil(((atp)localObject4).vMU)) || (bo.isNullOrNil(((atp)localObject4).pXM)))
            ab.e("MicroMsg.WebViewStubService", "http header has null value");
        }
      }
    }
    for (int j = 1; ; j = 0)
    {
      Object localObject6;
      if (j == 0)
      {
        localObject1 = new String[paramm.size()];
        localObject4 = new String[paramm.size()];
        j = 0;
        while (true)
          if (j < paramm.size())
          {
            Object localObject5 = (atp)paramm.get(j);
            localObject6 = ((atp)localObject5).vMU;
            localObject5 = ((atp)localObject5).pXM;
            ab.i("MicroMsg.WebViewStubService", "http header index = %d, key = %s, value = %s", new Object[] { Integer.valueOf(j), localObject6, localObject5 });
            localObject1[j] = localObject6;
            localObject4[j] = localObject5;
            j++;
            continue;
            j = paramm.wli;
            break;
          }
        ((Bundle)localObject3).putStringArray("geta8key_result_http_header_key_list", (String[])localObject1);
        ((Bundle)localObject3).putStringArray("geta8key_result_http_header_value_list", (String[])localObject4);
      }
      label1062: ((Bundle)localObject3).putSerializable("geta8key_result_scope_list", ((com.tencent.mm.modelsimple.h)localObject2).aiY());
      ab.i("MicroMsg.WebViewStubService", "geta8key onscened: share url:[%s], full url:[%s], req url:[%s], has scopeList:[%s]", new Object[] { ((com.tencent.mm.modelsimple.h)localObject2).aiX(), ((com.tencent.mm.modelsimple.h)localObject2).aiT(), ((com.tencent.mm.modelsimple.h)localObject2).aiU(), Boolean.TRUE });
      if (!bo.isNullOrNil(((com.tencent.mm.modelsimple.h)localObject2).aiX()))
        ar.hb(((com.tencent.mm.modelsimple.h)localObject2).aiT(), ((com.tencent.mm.modelsimple.h)localObject2).aiX());
      while (true)
      {
        try
        {
          if (((com.tencent.mm.modelsimple.h)localObject2).tag == null)
            break label2756;
          j = ((Integer)((com.tencent.mm.modelsimple.h)localObject2).tag).intValue();
          localObject1 = this.cAV.iterator();
          if (!((Iterator)localObject1).hasNext())
            break label1384;
          paramm = (WebViewStubCallbackWrapper)((Iterator)localObject1).next();
          if ((j == 0) || (j == paramm.id))
            break label1310;
          ab.d("MicroMsg.WebViewStubService", "geta8key hashcode not equal, this one = %d, that = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramm.id) });
          continue;
        }
        catch (Exception paramString)
        {
          ab.e("MicroMsg.WebViewStubService", "onSceneEnd geta8key fail, ex = " + Log.getStackTraceString(paramString));
          AppMethodBeat.o(7212);
        }
        break;
        ab.e("MicroMsg.WebViewStubService", "null shareUrl, full url:[%s], req url:[%s]", new Object[] { ((com.tencent.mm.modelsimple.h)localObject2).aiT(), ((com.tencent.mm.modelsimple.h)localObject2).aiU() });
        continue;
        label1310: localObject2 = new com/tencent/mm/plugin/webview/stub/WebViewStubService$b;
        ((WebViewStubService.b)localObject2).<init>();
        ((WebViewStubService.b)localObject2).type = i;
        ((WebViewStubService.b)localObject2).errType = paramInt1;
        ((WebViewStubService.b)localObject2).errCode = paramInt2;
        ((WebViewStubService.b)localObject2).aIm = paramString;
        ((WebViewStubService.b)localObject2).mqu = ((Bundle)localObject3);
        ((WebViewStubService.b)localObject2).mqu.putInt("scene_end_listener_hash_code", paramm.id);
        paramm.uuT.a((c)localObject2);
        continue;
        label1384: AppMethodBeat.o(7212);
        break;
        if (i == 673)
        {
          localObject3 = (com.tencent.mm.plugin.webview.model.o)paramm;
          localObject1 = new Bundle();
          if (((com.tencent.mm.plugin.webview.model.o)localObject3).ehh == null)
          {
            paramm = null;
            label1428: ((Bundle)localObject1).putString("reading_mode_result_url", paramm);
          }
        }
        while (true)
        {
          try
          {
            if (((com.tencent.mm.plugin.webview.model.o)localObject3).tag == null)
              break label2750;
            j = ((Integer)((com.tencent.mm.plugin.webview.model.o)localObject3).tag).intValue();
            localObject3 = this.cAV.iterator();
            if (!((Iterator)localObject3).hasNext())
              break label1672;
            localObject2 = (WebViewStubCallbackWrapper)((Iterator)localObject3).next();
            if ((j == 0) || (j == ((WebViewStubCallbackWrapper)localObject2).id))
              break label1598;
            ab.d("MicroMsg.WebViewStubService", " get readingmodeinfo, hashcode not equal, this one = %d, that = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(((WebViewStubCallbackWrapper)localObject2).id) });
            continue;
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.WebViewStubService", "onSceneEnd geta8key fail, ex = " + Log.getStackTraceString(paramString));
            AppMethodBeat.o(7212);
          }
          break;
          paramm = ((anf)((com.tencent.mm.plugin.webview.model.o)localObject3).ehh.fsH.fsP).URL;
          break label1428;
          label1598: paramm = new com/tencent/mm/plugin/webview/stub/WebViewStubService$b;
          paramm.<init>();
          paramm.type = i;
          paramm.errType = paramInt1;
          paramm.errCode = paramInt2;
          paramm.aIm = paramString;
          paramm.mqu = ((Bundle)localObject1);
          paramm.mqu.putInt("scene_end_listener_hash_code", ((WebViewStubCallbackWrapper)localObject2).id);
          ((WebViewStubCallbackWrapper)localObject2).uuT.a(paramm);
          continue;
          label1672: AppMethodBeat.o(7212);
          break;
          if (i == 666)
          {
            localObject1 = (com.tencent.mm.ao.c)paramm;
            paramm = new Bundle();
            paramm.putString("emoji_stroe_product_id", ((com.tencent.mm.ao.c)localObject1).agd().ProductID);
            if ((paramInt1 == 0) && (paramInt2 == 0))
            {
              localObject2 = paramm.getString("emoji_stroe_product_id");
              ab.i("MicroMsg.WebViewStubService", "[cpan] onsceneend url:%s", new Object[] { localObject2 });
              if (!bo.isNullOrNil((String)localObject2))
              {
                localObject3 = new Intent();
                ((Intent)localObject3).putExtra("extra_id", (String)localObject2);
                ((Intent)localObject3).putExtra("preceding_scence", 12);
                ((Intent)localObject3).putExtra("download_entrance_scene", 12);
                com.tencent.mm.bp.d.b(this, "emoji", ".ui.EmojiStoreDetailUI", (Intent)localObject3);
              }
            }
          }
          while (true)
          {
            try
            {
              if (((com.tencent.mm.ao.c)localObject1).tag == null)
                break label2744;
              j = ((Integer)((com.tencent.mm.ao.c)localObject1).tag).intValue();
              localObject2 = this.cAV.iterator();
              if (!((Iterator)localObject2).hasNext())
                break label2030;
              localObject1 = (WebViewStubCallbackWrapper)((Iterator)localObject2).next();
              if ((j == 0) || (j == ((WebViewStubCallbackWrapper)localObject1).id))
                break label1956;
              ab.d("MicroMsg.WebViewStubService", "jumpEmojiDetail, hashcode not equal, this one = %d, that = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(((WebViewStubCallbackWrapper)localObject1).id) });
              continue;
            }
            catch (Exception paramString)
            {
              ab.e("MicroMsg.WebViewStubService", "onSceneEnd MMFunc_JumpEmotionDetail fail, ex = " + paramString.getMessage());
              AppMethodBeat.o(7212);
            }
            break;
            label1956: localObject3 = new com/tencent/mm/plugin/webview/stub/WebViewStubService$b;
            ((WebViewStubService.b)localObject3).<init>();
            ((WebViewStubService.b)localObject3).type = i;
            ((WebViewStubService.b)localObject3).errType = paramInt1;
            ((WebViewStubService.b)localObject3).errCode = paramInt2;
            ((WebViewStubService.b)localObject3).aIm = paramString;
            ((WebViewStubService.b)localObject3).mqu = paramm;
            ((WebViewStubService.b)localObject3).mqu.putInt("scene_end_listener_hash_code", ((WebViewStubCallbackWrapper)localObject1).id);
            ((WebViewStubCallbackWrapper)localObject1).uuT.a((c)localObject3);
            continue;
            label2030: AppMethodBeat.o(7212);
            break;
            if (i == 1254);
            while (true)
            {
              try
              {
                localObject1 = (w)paramm;
                if (((w)localObject1).tag == null)
                  break label2738;
                j = ((Integer)((w)localObject1).tag).intValue();
                localObject2 = this.cAV.iterator();
                if (!((Iterator)localObject2).hasNext())
                  break label2427;
                localObject4 = (WebViewStubCallbackWrapper)((Iterator)localObject2).next();
                if ((j == 0) || (j == ((WebViewStubCallbackWrapper)localObject4).id))
                  break label2192;
                ab.d("MicroMsg.WebViewStubService", "authorize, hashcode not equal, this one = %d, that = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(((WebViewStubCallbackWrapper)localObject4).id) });
                continue;
              }
              catch (Exception paramString)
              {
                ab.e("MicroMsg.WebViewStubService", "onSceneEnd MMFunc_AuthorizeReq fail, ex = " + Log.getStackTraceString(paramString));
                AppMethodBeat.o(7212);
              }
              break;
              label2192: localObject3 = new com/tencent/mm/plugin/webview/stub/WebViewStubService$b;
              ((WebViewStubService.b)localObject3).<init>();
              ((WebViewStubService.b)localObject3).type = i;
              ((WebViewStubService.b)localObject3).errType = paramInt1;
              ((WebViewStubService.b)localObject3).errCode = paramInt2;
              ((WebViewStubService.b)localObject3).aIm = paramString;
              localObject1 = new android/os/Bundle;
              ((Bundle)localObject1).<init>();
              if ((paramInt1 != 0) || (paramInt2 != 0));
              while (true)
              {
                ((WebViewStubService.b)localObject3).mqu = ((Bundle)localObject1);
                ((WebViewStubService.b)localObject3).mqu.putInt("scene_end_listener_hash_code", ((WebViewStubCallbackWrapper)localObject4).id);
                ((WebViewStubCallbackWrapper)localObject4).uuT.a((c)localObject3);
                break;
                if ((paramm instanceof w))
                {
                  localObject6 = (bes)((w)paramm).ehh.fsH.fsP;
                  ((Bundle)localObject1).putString("oauth_url", ((w)paramm).umb);
                  ((Bundle)localObject1).putSerializable("scope_list", af.aA(((bes)localObject6).wIK));
                  ((Bundle)localObject1).putString("appname", ((bes)localObject6).fhH);
                  ((Bundle)localObject1).putString("appicon_url", ((bes)localObject6).wIL);
                  ((Bundle)localObject1).putString("redirect_url", ((bes)localObject6).vGi);
                  ((Bundle)localObject1).putBoolean("is_recent_has_auth", ((bes)localObject6).wIM);
                  ((Bundle)localObject1).putBoolean("is_silence_auth", ((bes)localObject6).wIN);
                  ((Bundle)localObject1).putBoolean("is_call_server_when_confirm", ((bes)localObject6).wIO);
                }
              }
              label2427: AppMethodBeat.o(7212);
              break;
              if (i == 1373);
              while (true)
              {
                try
                {
                  localObject1 = (x)paramm;
                  if (((x)localObject1).tag == null)
                    break label2732;
                  j = ((Integer)((x)localObject1).tag).intValue();
                  localObject4 = this.cAV.iterator();
                  if (!((Iterator)localObject4).hasNext())
                    break label2723;
                  localObject1 = (WebViewStubCallbackWrapper)((Iterator)localObject4).next();
                  if ((j == 0) || (j == ((WebViewStubCallbackWrapper)localObject1).id))
                    break label2589;
                  ab.d("MicroMsg.WebViewStubService", "authorizeconfirm, hashcode not equal, this one = %d, that = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(((WebViewStubCallbackWrapper)localObject1).id) });
                  continue;
                }
                catch (Exception paramString)
                {
                  ab.e("MicroMsg.WebViewStubService", "onSceneEnd MMFunc_AuthorizeConfirmReq fail, ex = " + Log.getStackTraceString(paramString));
                }
                AppMethodBeat.o(7212);
                break;
                label2589: localObject3 = new com/tencent/mm/plugin/webview/stub/WebViewStubService$b;
                ((WebViewStubService.b)localObject3).<init>();
                ((WebViewStubService.b)localObject3).type = i;
                ((WebViewStubService.b)localObject3).errType = paramInt1;
                ((WebViewStubService.b)localObject3).errCode = paramInt2;
                ((WebViewStubService.b)localObject3).aIm = paramString;
                localObject2 = new android/os/Bundle;
                ((Bundle)localObject2).<init>();
                if ((paramInt1 != 0) || (paramInt2 != 0));
                while (true)
                {
                  ((WebViewStubService.b)localObject3).mqu = ((Bundle)localObject2);
                  ((WebViewStubService.b)localObject3).mqu.putInt("scene_end_listener_hash_code", ((WebViewStubCallbackWrapper)localObject1).id);
                  ((WebViewStubCallbackWrapper)localObject1).uuT.a((c)localObject3);
                  break;
                  if ((paramm instanceof x))
                    ((Bundle)localObject2).putString("redirect_url", ((beq)((x)paramm).ehh.fsH.fsP).vGi);
                }
                label2723: AppMethodBeat.o(7212);
                break;
                label2732: j = 0;
              }
              label2738: j = 0;
            }
            label2744: j = 0;
          }
          label2750: j = 0;
        }
        label2756: j = 0;
      }
    }
  }

  public boolean onUnbind(Intent paramIntent)
  {
    AppMethodBeat.i(7210);
    ab.i("MicroMsg.WebViewStubService", "WebViewStubService onUnbind");
    com.tencent.mm.plugin.webview.ui.tools.jsapi.h.detach();
    ar.clear();
    r.a.cYq().release(false);
    boolean bool = super.onUnbind(paramIntent);
    AppMethodBeat.o(7210);
    return bool;
  }

  static final class a extends b.a
  {
    public boolean csN;
    public int ret;
    public int type;
    public boolean uhJ;

    public final boolean cYV()
    {
      return this.uhJ;
    }

    public final boolean getResult()
    {
      return this.csN;
    }

    public final int getRet()
    {
      return this.ret;
    }

    public final int getType()
    {
      return this.type;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.stub.WebViewStubService
 * JD-Core Version:    0.6.2
 */