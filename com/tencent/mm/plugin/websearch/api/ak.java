package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.AssetManager;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.xweb.WebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class ak
  implements l
{
  String TAG;
  private com.tencent.mm.sdk.platformtools.al fPG;
  private boolean gQm;
  private HashSet<Object> iEl;
  int uaJ;
  boolean uaK;
  List<al> uaL;
  long uaM;

  public ak(int paramInt)
  {
    AppMethodBeat.i(124200);
    this.TAG = "MicroMsg.WebSearch.WebSearchPreloadMgr";
    this.gQm = false;
    this.iEl = new HashSet();
    this.uaL = new LinkedList();
    this.uaJ = paramInt;
    this.TAG = (this.TAG + "_" + paramInt);
    this.fPG = new com.tencent.mm.sdk.platformtools.al();
    AppMethodBeat.o(124200);
  }

  final MMWebView aXX()
  {
    AppMethodBeat.i(124203);
    try
    {
      Object localObject1 = new android/content/MutableContextWrapper;
      ((MutableContextWrapper)localObject1).<init>(ah.getContext());
      if (this.uaJ == 2)
      {
        localObject1 = MMWebView.a.in((Context)localObject1);
        AppMethodBeat.o(124203);
      }
      while (true)
      {
        return localObject1;
        if (!ap.cVF().cVG())
          break;
        localObject1 = MMWebView.a.im((Context)localObject1);
        AppMethodBeat.o(124203);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(124203);
        continue;
        localObject2 = MMWebView.a.in((Context)localObject2);
        AppMethodBeat.o(124203);
      }
    }
  }

  public final void adF(final String paramString)
  {
    AppMethodBeat.i(124201);
    if (!ah.doF())
    {
      ab.w(this.TAG, "preload please call from tools proc");
      AppMethodBeat.o(124201);
    }
    while (true)
    {
      return;
      if ((this.uaJ != 2) && (ap.cVF().cVG()))
      {
        ab.i(this.TAG, "use sys webview");
        ab.i(this.TAG, "use sys webview 2");
      }
      label131: 
      while (true)
      {
        int i = 0;
        if (i == 0)
          break label133;
        ab.w(this.TAG, " preload forbidden");
        AppMethodBeat.o(124201);
        break;
        Context localContext = ah.getContext();
        if ((!WebView.isXWalk()) && (WebView.getUsingTbsCoreVersion(localContext) == 0))
          ab.i("XWebUtil", "can not preload without x5 or xwalk");
        for (i = 0; ; i = 1)
        {
          if (i != 0)
            break label131;
          ab.i(this.TAG, "isOpenRecommendPreload webview not support");
          i = 1;
          break;
        }
      }
      label133: if (!ah.doF())
      {
        ab.w(this.TAG, "preload please call from tools proc");
        AppMethodBeat.o(124201);
      }
      else if (!com.tencent.mm.sdk.platformtools.al.isMainThread())
      {
        ab.w(this.TAG, "preload please call from main thread");
        AppMethodBeat.o(124201);
      }
      else
      {
        if (!this.gQm)
        {
          this.gQm = true;
          ab.i(this.TAG, "preloading %s ", new Object[] { paramString });
          this.fPG.aa(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(124189);
              ab.i(ak.this.TAG, "preload start");
              ak.7 local7 = new ak.7(ak.this, paramString);
              if (Looper.getMainLooper().getThread() == Thread.currentThread())
              {
                local7.run();
                AppMethodBeat.o(124189);
              }
              while (true)
              {
                return;
                com.tencent.mm.sdk.platformtools.al.d(local7);
                AppMethodBeat.o(124189);
              }
            }
          });
        }
        AppMethodBeat.o(124201);
      }
    }
  }

  final boolean b(MMWebView paramMMWebView)
  {
    boolean bool = false;
    AppMethodBeat.i(124202);
    ab.i(this.TAG, "begin jsapi init,wv %s", new Object[] { paramMMWebView.toString() });
    try
    {
      String str = bo.convertStreamToString(paramMMWebView.getContext().getAssets().open("jsapi/wxjs.js"));
      if (str == null)
      {
        ab.e(this.TAG, "loadJavaScript fail, jsContent is null");
        AppMethodBeat.o(124202);
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace(this.TAG, localException, "", new Object[0]);
        Object localObject = null;
        continue;
        if (paramMMWebView == null)
        {
          ab.e(this.TAG, "loadJavaScript, viewWV is null");
          AppMethodBeat.o(124202);
        }
        else
        {
          paramMMWebView.evaluateJavascript("javascript:".concat(String.valueOf(localObject)), new ak.3(this, paramMMWebView));
          StringBuilder localStringBuilder = new StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
          localObject = new HashMap();
          ((Map)localObject).put("webview_type", "1");
          ((Map)localObject).put("init_url", paramMMWebView.getUrl());
          ((Map)localObject).put("init_font_size", "1");
          paramMMWebView.getRandomStr();
          paramMMWebView.evaluateJavascript(ak.a.i("event", "sys:init", (Map)localObject) + ")", new ak.4(this, paramMMWebView));
          localObject = new StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
          paramMMWebView.getRandomStr();
          paramMMWebView.evaluateJavascript(ak.a.i("event", "sys:bridged", null) + ")", new ak.5(this, paramMMWebView));
          localStringBuilder = new StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
          localObject = new HashMap();
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add("menu:share:timeline");
          localLinkedList.add("menu:share:appmessage");
          localLinkedList.add("menu:share:weiboApp");
          localLinkedList.add("menu:share:QZone");
          localLinkedList.add("menu:share:qq");
          localLinkedList.add("onVoiceRecordEnd");
          localLinkedList.add("onVoicePlayBegin");
          localLinkedList.add("onVoicePlayEnd");
          localLinkedList.add("onLocalImageUploadProgress");
          localLinkedList.add("onImageDownloadProgress");
          localLinkedList.add("onVoiceUploadProgress");
          localLinkedList.add("onVoiceDownloadProgress");
          localLinkedList.add("onVideoUploadProgress");
          localLinkedList.add("onMediaFileUploadProgress");
          localLinkedList.add("menu:setfont");
          localLinkedList.add("menu:share:weibo");
          localLinkedList.add("menu:share:email");
          localLinkedList.add("wxdownload:state_change");
          localLinkedList.add("wxdownload:progress_change");
          localLinkedList.add("hdOnDeviceStateChanged");
          localLinkedList.add("activity:state_change");
          localLinkedList.add("onWXDeviceBluetoothStateChange");
          localLinkedList.add("onWXDeviceLanStateChange");
          localLinkedList.add("onWXDeviceBindStateChange");
          localLinkedList.add("onReceiveDataFromWXDevice");
          localLinkedList.add("onScanWXDeviceResult");
          localLinkedList.add("onWXDeviceStateChange");
          localLinkedList.add("onNfcTouch");
          localLinkedList.add("onBeaconMonitoring");
          localLinkedList.add("onBeaconsInRange");
          localLinkedList.add("menu:custom");
          localLinkedList.add("onSearchWAWidgetOpenApp");
          localLinkedList.add("onSearchDataReady");
          localLinkedList.add("onSearchHistoryReady");
          localLinkedList.add("onSearchWAWidgetOnTapCallback");
          localLinkedList.add("onSearchImageListReady");
          localLinkedList.add("onTeachSearchDataReady");
          localLinkedList.add("onSearchGuideDataReady");
          localLinkedList.add("onSearchInputChange");
          localLinkedList.add("onSearchInputConfirm");
          localLinkedList.add("onSearchSuggestionDataReady");
          localLinkedList.add("onMusicStatusChanged");
          localLinkedList.add("switchToTabSearch");
          localLinkedList.add("onVideoPlayerCallback");
          localLinkedList.add("onSelectContact");
          localLinkedList.add("onSearchWAWidgetAttrChanged");
          localLinkedList.add("onSearchWAWidgetReloadData");
          localLinkedList.add("onSearchWAWidgetReloadDataFinish");
          localLinkedList.add("onSearchWAWidgetStateChange");
          localLinkedList.add("onSearchWAWidgetDataPush");
          localLinkedList.add("onPullDownRefresh");
          localLinkedList.add("onPageStateChange");
          localLinkedList.add("onGetKeyboardHeight");
          localLinkedList.add("onGetSmiley");
          localLinkedList.add("onAddShortcutStatus");
          localLinkedList.add("onFocusSearchInput");
          localLinkedList.add("onGetA8KeyUrl");
          localLinkedList.add("deleteAccountSuccess");
          localLinkedList.add("onGetMsgProofItems");
          localLinkedList.add("WNJSHandlerInsert");
          localLinkedList.add("WNJSHandlerMultiInsert");
          localLinkedList.add("WNJSHandlerExportData");
          localLinkedList.add("WNJSHandlerHeaderAndFooterChange");
          localLinkedList.add("WNJSHandlerEditableChange");
          localLinkedList.add("WNJSHandlerEditingChange");
          localLinkedList.add("WNJSHandlerSaveSelectionRange");
          localLinkedList.add("WNJSHandlerLoadSelectionRange");
          localLinkedList.add("onCustomGameMenuClicked");
          localLinkedList.add("showLoading");
          localLinkedList.add("getSearchEmotionDataCallBack");
          localLinkedList.add("onNavigationBarRightButtonClick");
          localLinkedList.add("onSearchActionSheetClick");
          localLinkedList.add("onGetMatchContactList");
          localLinkedList.add("onUiInit");
          localLinkedList.add("onNetWorkChange");
          localLinkedList.add("onBackgroundAudioStateChange");
          if (!bo.ek(null))
            localLinkedList.addAll(null);
          ((Map)localObject).put("__runOn3rd_apis", new JSONArray(localLinkedList));
          paramMMWebView.getRandomStr();
          paramMMWebView.evaluateJavascript(ak.a.i("event", "sys:attach_runOn3rd_apis", (Map)localObject) + ")", new ak.6(this, paramMMWebView));
          ab.i(this.TAG, "jsapi init done");
          AppMethodBeat.o(124202);
          bool = true;
        }
      }
    }
  }

  final void done()
  {
    try
    {
      AppMethodBeat.i(124205);
      ab.i(this.TAG, "preInit finished");
      this.gQm = false;
      Iterator localIterator = this.iEl.iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    finally
    {
    }
    this.iEl.clear();
    AppMethodBeat.o(124205);
  }

  public final Object fn(Context paramContext)
  {
    AppMethodBeat.i(124204);
    if (!ah.doF())
    {
      ab.w(this.TAG, "getWebView please call from tools proc");
      AppMethodBeat.o(124204);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      ab.i(this.TAG, "getWebView cached webview size %d", new Object[] { Integer.valueOf(this.uaL.size()) });
      if (this.uaL.size() <= 0)
      {
        AppMethodBeat.o(124204);
        paramContext = null;
      }
      else if (!this.uaK)
      {
        ab.i(this.TAG, "preload unfinished");
        AppMethodBeat.o(124204);
        paramContext = null;
      }
      else
      {
        al localal = (al)this.uaL.get(0);
        if (localal == null)
        {
          this.uaL.remove(0);
          AppMethodBeat.o(124204);
          paramContext = null;
        }
        else
        {
          MMWebView localMMWebView = (MMWebView)localal.uaQ;
          if ((localMMWebView.getContext() instanceof MutableContextWrapper))
            ((MutableContextWrapper)localMMWebView.getContext()).setBaseContext(paramContext);
          this.uaL.remove(localal);
          this.uaK = false;
          AppMethodBeat.o(124204);
          paramContext = localal;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.api.ak
 * JD-Core Version:    0.6.2
 */