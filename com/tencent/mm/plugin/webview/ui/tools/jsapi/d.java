package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.webkit.ValueCallback;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.n;
import com.tencent.mm.bz.a;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.plugin.webview.modeltools.j;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.k;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Map<Ljava.lang.String;Ljava.lang.String;>;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  implements com.tencent.mm.plugin.websearch.api.c, b
{
  private static final int uFn;
  public com.tencent.mm.plugin.webview.stub.d icy;
  public boolean ready;
  private final List<String> uFA;
  volatile String uFB;
  volatile int uFC;
  private JSONObject uFD;
  private JSONArray uFE;
  private List<String> uFF;
  private ap uFG;
  public long uFH;
  public MMWebView uFo;
  private final List<String> uFp;
  private final LinkedList<i> uFq;
  private ak uFr;
  Map<String, Object> uFs;
  public Map<String, Object> uFt;
  private k uFu;
  public boolean uFv;
  public String uFw;
  private Set<d.a> uFx;
  public String uFy;
  public String uFz;
  public String uqT;
  public int uqj;

  static
  {
    AppMethodBeat.i(9017);
    if (com.tencent.mm.compatible.util.d.fP(19));
    for (int i = 200; ; i = 20)
    {
      uFn = i;
      AppMethodBeat.o(9017);
      return;
    }
  }

  public d(MMWebView paramMMWebView, k paramk, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8934);
    this.uFp = new LinkedList();
    this.uFq = new LinkedList();
    this.uFr = null;
    this.ready = false;
    this.uFv = false;
    this.uFw = "";
    this.uFA = new LinkedList();
    this.uFB = null;
    this.uFC = 0;
    this.uFD = new JSONObject();
    this.uFE = new JSONArray();
    this.uFF = new LinkedList();
    this.uFG = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(8890);
        String str = i.a.a("onBeaconsInRange", d.j(d.this), d.k(d.this), d.l(d.this));
        d.d(d.this).evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", null);
        d.m(d.this).clear();
        d.a(d.this, new JSONObject());
        d.a(d.this, new JSONArray());
        AppMethodBeat.o(8890);
        return false;
      }
    }
    , false);
    this.uFH = 0L;
    this.uFo = paramMMWebView;
    this.uFu = paramk;
    this.uFs = paramMap;
    dcg();
    ab.i("MicroMsg.JsApiHandler", "JsApiHandler<init>, webview: %d, this: %d", new Object[] { Integer.valueOf(paramMMWebView.hashCode()), Integer.valueOf(hashCode()) });
    AppMethodBeat.o(8934);
  }

  public d(MMWebView paramMMWebView, k paramk, Map<String, Object> paramMap, com.tencent.mm.plugin.webview.stub.d paramd, int paramInt)
  {
    AppMethodBeat.i(8935);
    this.uFp = new LinkedList();
    this.uFq = new LinkedList();
    this.uFr = null;
    this.ready = false;
    this.uFv = false;
    this.uFw = "";
    this.uFA = new LinkedList();
    this.uFB = null;
    this.uFC = 0;
    this.uFD = new JSONObject();
    this.uFE = new JSONArray();
    this.uFF = new LinkedList();
    this.uFG = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(8890);
        String str = i.a.a("onBeaconsInRange", d.j(d.this), d.k(d.this), d.l(d.this));
        d.d(d.this).evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", null);
        d.m(d.this).clear();
        d.a(d.this, new JSONObject());
        d.a(d.this, new JSONArray());
        AppMethodBeat.o(8890);
        return false;
      }
    }
    , false);
    this.uFH = 0L;
    this.uFo = paramMMWebView;
    this.uFu = paramk;
    this.icy = paramd;
    this.uFs = paramMap;
    this.uqj = paramInt;
    dcg();
    ab.i("MicroMsg.JsApiHandler", "JsApiHandler<init>, webview: %d, this: %d", new Object[] { Integer.valueOf(paramMMWebView.hashCode()), Integer.valueOf(hashCode()) });
    AppMethodBeat.o(8935);
  }

  // ERROR //
  private static boolean A(String paramString, Map<String, Integer> paramMap)
  {
    // Byte code:
    //   0: sipush 9009
    //   3: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   10: ifne +7 -> 17
    //   13: aload_1
    //   14: ifnonnull +20 -> 34
    //   17: ldc 166
    //   19: ldc 205
    //   21: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   24: sipush 9009
    //   27: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: iconst_0
    //   31: istore_2
    //   32: iload_2
    //   33: ireturn
    //   34: new 211	java/io/File
    //   37: dup
    //   38: aload_0
    //   39: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   42: astore_3
    //   43: aload_3
    //   44: invokevirtual 218	java/io/File:exists	()Z
    //   47: ifne +8 -> 55
    //   50: aload_3
    //   51: invokevirtual 221	java/io/File:createNewFile	()Z
    //   54: pop
    //   55: aconst_null
    //   56: astore 4
    //   58: new 223	java/io/BufferedOutputStream
    //   61: astore_3
    //   62: new 225	java/io/FileOutputStream
    //   65: astore 5
    //   67: aload 5
    //   69: aload_0
    //   70: iconst_1
    //   71: invokespecial 228	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   74: aload_3
    //   75: aload 5
    //   77: invokespecial 231	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   80: aload_1
    //   81: invokeinterface 237 1 0
    //   86: invokeinterface 243 1 0
    //   91: astore 5
    //   93: aload 5
    //   95: invokeinterface 248 1 0
    //   100: ifeq +165 -> 265
    //   103: aload 5
    //   105: invokeinterface 252 1 0
    //   110: checkcast 254	java/lang/String
    //   113: astore 4
    //   115: aload_1
    //   116: aload 4
    //   118: invokeinterface 258 2 0
    //   123: checkcast 174	java/lang/Integer
    //   126: invokevirtual 261	java/lang/Integer:intValue	()I
    //   129: istore 6
    //   131: new 263	java/lang/StringBuilder
    //   134: astore 7
    //   136: aload 7
    //   138: invokespecial 264	java/lang/StringBuilder:<init>	()V
    //   141: aload_3
    //   142: aload 7
    //   144: iload 6
    //   146: invokevirtual 268	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   149: ldc_w 270
    //   152: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload 4
    //   157: invokevirtual 273	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 277	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokevirtual 281	java/lang/String:getBytes	()[B
    //   166: invokevirtual 287	java/io/OutputStream:write	([B)V
    //   169: aload_3
    //   170: bipush 13
    //   172: invokevirtual 289	java/io/OutputStream:write	(I)V
    //   175: aload_3
    //   176: bipush 10
    //   178: invokevirtual 289	java/io/OutputStream:write	(I)V
    //   181: goto -88 -> 93
    //   184: astore_1
    //   185: aload_3
    //   186: astore_0
    //   187: ldc 166
    //   189: aload_1
    //   190: ldc 123
    //   192: iconst_0
    //   193: anewarray 4	java/lang/Object
    //   196: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   199: ldc 166
    //   201: ldc_w 295
    //   204: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   207: aload_0
    //   208: ifnull +7 -> 215
    //   211: aload_0
    //   212: invokevirtual 298	java/io/OutputStream:close	()V
    //   215: sipush 9009
    //   218: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: iconst_0
    //   222: istore_2
    //   223: goto -191 -> 32
    //   226: astore_1
    //   227: ldc 166
    //   229: ldc_w 300
    //   232: aload_0
    //   233: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   236: invokevirtual 307	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   239: invokestatic 310	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   242: ldc 166
    //   244: aload_1
    //   245: ldc 123
    //   247: iconst_0
    //   248: anewarray 4	java/lang/Object
    //   251: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   254: sipush 9009
    //   257: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   260: iconst_0
    //   261: istore_2
    //   262: goto -230 -> 32
    //   265: aload_3
    //   266: invokevirtual 313	java/io/OutputStream:flush	()V
    //   269: aload_3
    //   270: invokevirtual 298	java/io/OutputStream:close	()V
    //   273: ldc 166
    //   275: ldc_w 315
    //   278: aload_0
    //   279: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   282: invokevirtual 307	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   285: invokestatic 318	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   288: sipush 9009
    //   291: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   294: iconst_1
    //   295: istore_2
    //   296: goto -264 -> 32
    //   299: astore_1
    //   300: ldc 166
    //   302: aload_1
    //   303: ldc 123
    //   305: iconst_0
    //   306: anewarray 4	java/lang/Object
    //   309: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   312: goto -39 -> 273
    //   315: astore_0
    //   316: ldc 166
    //   318: aload_0
    //   319: ldc 123
    //   321: iconst_0
    //   322: anewarray 4	java/lang/Object
    //   325: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: goto -113 -> 215
    //   331: astore_0
    //   332: aconst_null
    //   333: astore_1
    //   334: aload_1
    //   335: ifnull +7 -> 342
    //   338: aload_1
    //   339: invokevirtual 298	java/io/OutputStream:close	()V
    //   342: sipush 9009
    //   345: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   348: aload_0
    //   349: athrow
    //   350: astore_1
    //   351: ldc 166
    //   353: aload_1
    //   354: ldc 123
    //   356: iconst_0
    //   357: anewarray 4	java/lang/Object
    //   360: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   363: goto -21 -> 342
    //   366: astore_0
    //   367: aload_3
    //   368: astore_1
    //   369: goto -35 -> 334
    //   372: astore_1
    //   373: aload_0
    //   374: astore_3
    //   375: aload_1
    //   376: astore_0
    //   377: aload_3
    //   378: astore_1
    //   379: goto -45 -> 334
    //   382: astore_1
    //   383: aload 4
    //   385: astore_0
    //   386: goto -199 -> 187
    //
    // Exception table:
    //   from	to	target	type
    //   80	93	184	java/lang/Exception
    //   93	181	184	java/lang/Exception
    //   265	269	184	java/lang/Exception
    //   50	55	226	java/io/IOException
    //   269	273	299	java/io/IOException
    //   211	215	315	java/io/IOException
    //   58	80	331	finally
    //   338	342	350	java/io/IOException
    //   80	93	366	finally
    //   93	181	366	finally
    //   265	269	366	finally
    //   187	207	372	finally
    //   58	80	382	java/lang/Exception
  }

  private void a(String paramString1, String paramString2, JSONArray paramJSONArray, int paramInt, String paramString3, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8994);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchInputConfirm fail, not ready");
      AppMethodBeat.o(8994);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchInputConfirm success, ready %s %s %s", new Object[] { paramString1, paramString2, paramJSONArray.toString() });
      JSONObject localJSONObject = new JSONObject();
      if (paramMap != null)
      {
        paramMap = paramMap.entrySet().iterator();
        while (paramMap.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)paramMap.next();
          if (localEntry.getValue() != null)
            try
            {
              String str1 = (String)localEntry.getKey();
              localObject = new org/json/JSONObject;
              ((JSONObject)localObject).<init>(localEntry.getValue().toString());
              localJSONObject.put(str1, localObject);
            }
            catch (JSONException localJSONException2)
            {
              try
              {
                String str2 = (String)localEntry.getKey();
                Object localObject = new org/json/JSONArray;
                ((JSONArray)localObject).<init>(localEntry.getValue().toString());
                localJSONObject.put(str2, localObject);
              }
              catch (JSONException localJSONException3)
              {
                try
                {
                  localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
                }
                catch (JSONException localJSONException1)
                {
                  ab.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException2, "", new Object[0]);
                }
              }
            }
        }
      }
      try
      {
        localJSONObject.put("query", paramString1);
        localJSONObject.put("custom", paramString2);
        localJSONObject.put("tagList", paramJSONArray);
        localJSONObject.put("isBackButtonClick", paramInt);
        localJSONObject.put("sugId", paramString3);
        localJSONObject.put("sugClickType", 0);
        al.d(new d.49(this, i.a.a("onSearchInputConfirm", localJSONObject, this.uFv, this.uFw)));
        AppMethodBeat.o(8994);
      }
      catch (JSONException paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.JsApiHandler", paramString1, "", new Object[0]);
      }
    }
  }

  public static String agr(String paramString)
  {
    AppMethodBeat.i(9001);
    paramString = String.format("javascript:WeixinJSBridge._handleMessageFromWeixin(%s)", new Object[] { bo.nullAsNil(paramString) });
    AppMethodBeat.o(9001);
    return paramString;
  }

  private String agt(String paramString)
  {
    AppMethodBeat.i(9008);
    String str = this.uFo.getUrl();
    try
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = n.getSHA1(str + paramString);
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = e.euU + (String)localObject;
      ab.i("MicroMsg.JsApiHandler", "generate upload file name, url=%s, tag=%s, fullName=%s", new Object[] { str, paramString, localObject });
      AppMethodBeat.o(9008);
      paramString = (String)localObject;
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "generating temp file name failed, url is ".concat(String.valueOf(str)));
        ab.printErrStackTrace("MicroMsg.JsApiHandler", paramString, "", new Object[0]);
        paramString = null;
        AppMethodBeat.o(9008);
      }
    }
  }

  private void dcg()
  {
    AppMethodBeat.i(8936);
    this.uFr = new d.1(this, Looper.getMainLooper());
    AppMethodBeat.o(8936);
  }

  private Map<String, Object> dck()
  {
    AppMethodBeat.i(8948);
    HashMap localHashMap = new HashMap();
    JsapiPermissionWrapper localJsapiPermissionWrapper = this.uFu.cZS();
    LinkedList localLinkedList = new LinkedList();
    if (localJsapiPermissionWrapper != null)
    {
      if (localJsapiPermissionWrapper.jB(88))
        localLinkedList.add("menu:share:timeline");
      if (localJsapiPermissionWrapper.jB(89))
        localLinkedList.add("menu:share:appmessage");
      if (localJsapiPermissionWrapper.jB(94))
        localLinkedList.add("menu:share:qq");
      if (localJsapiPermissionWrapper.jB(109))
        localLinkedList.add("menu:share:weiboApp");
      if (localJsapiPermissionWrapper.jB(134))
        localLinkedList.add("menu:share:QZone");
      if (localJsapiPermissionWrapper.jB(219))
        localLinkedList.add("sys:record");
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
      localLinkedList.add("menu:haokan");
      localLinkedList.add("reportOnLeaveForMP");
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
      localLinkedList.add("onGetPoiInfoReturn");
      localLinkedList.add("onSearchHistoryReady");
      localLinkedList.add("onSearchWAWidgetOnTapCallback");
      localLinkedList.add("onSearchImageListReady");
      localLinkedList.add("onTeachSearchDataReady");
      localLinkedList.add("onSearchGuideDataReady");
      localLinkedList.add("onUxOplogDataReady");
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
      localLinkedList.add("onMiniProgramData");
      localLinkedList.add("onBackgroundAudioStateChange");
      localLinkedList.add("onArticleReadingBtnClicked");
      if (!bo.ek(null))
        localLinkedList.addAll(null);
      localLinkedList.add("onReceivePageData");
      localLinkedList.add("onPageAuthOK");
      localLinkedList.add("onScrollViewDidScroll");
    }
    localHashMap.put("__runOn3rd_apis", new JSONArray(localLinkedList));
    AppMethodBeat.o(8948);
    return localHashMap;
  }

  private void dcl()
  {
    AppMethodBeat.i(8949);
    while (dcm());
    AppMethodBeat.o(8949);
  }

  private boolean dcm()
  {
    boolean bool1 = false;
    AppMethodBeat.i(8950);
    boolean bool2;
    if (bo.ek(this.uFq))
    {
      ab.i("MicroMsg.JsApiHandler", "dealNextMsg stop, msgList is empty");
      AppMethodBeat.o(8950);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        bool2 = this.icy.Jb(this.uqj);
        ab.i("MicroMsg.JsApiHandler", "dealNextMsg isBusy = ".concat(String.valueOf(bool2)));
        if (bool2)
        {
          ab.w("MicroMsg.JsApiHandler", "dealNextMsg fail, msgHandler is busy now");
          AppMethodBeat.o(8950);
          bool2 = bool1;
        }
      }
      catch (Exception localException1)
      {
        while (true)
        {
          ab.w("MicroMsg.JsApiHandler", "isBusy, ex = " + localException1.getMessage());
          bool2 = false;
        }
        if (this.uFq.size() == 0)
        {
          ab.w("MicroMsg.JsApiHandler", "msgList size is 0.");
          AppMethodBeat.o(8950);
          bool2 = bool1;
        }
        else
        {
          i locali = (i)this.uFq.remove(0);
          if (locali == null)
          {
            ab.e("MicroMsg.JsApiHandler", "dealNextMsg fail, msg is null");
            AppMethodBeat.o(8950);
            bool2 = true;
          }
          else if ((locali.uIJ == null) || (locali.puc == null) || (locali.type == null) || (this.uFo == null))
          {
            ab.e("MicroMsg.JsApiHandler", "dealNextMsg fail, can cause nullpointer, function = " + locali.uIJ + ", params = " + locali.puc + ", type = " + locali.type + ", wv = " + this.uFo);
            AppMethodBeat.o(8950);
            bool2 = true;
          }
          else
          {
            if ((this.uFt != null) && (this.uFt.get("srcUsername") != null) && (!bo.isNullOrNil(this.uFt.get("srcUsername").toString())))
              locali.puc.put("src_username", this.uFt.get("srcUsername").toString());
            if ((this.uFt != null) && (this.uFt.get("srcDisplayname") != null) && (!bo.isNullOrNil(this.uFt.get("srcDisplayname").toString())))
              locali.puc.put("src_displayname", this.uFt.get("srcDisplayname").toString());
            if ((this.uFt != null) && (this.uFt.get("KTemplateId") != null) && (!bo.isNullOrNil(this.uFt.get("KTemplateId").toString())))
              locali.puc.put("tempalate_id", this.uFt.get("KTemplateId").toString());
            Object localObject1;
            Object localObject2;
            if (this.uFt != null)
            {
              locali.puc.put("message_id", this.uFt.get("message_id"));
              locali.puc.put("message_index", this.uFt.get("message_index"));
              locali.puc.put("webview_scene", this.uFt.get("scene"));
              locali.puc.put("pay_channel", this.uFt.get("pay_channel"));
              locali.puc.put("pay_scene", this.uFt.get("pay_scene"));
              ab.i("MicroMsg.JsApiHandler", "getPackageName %s", new Object[] { this.uFt.get("pay_package") });
              if (this.uFt.get("pay_package") != null)
                locali.puc.put("pay_packageName", this.uFt.get("pay_package"));
              locali.puc.put("stastic_scene", this.uFt.get("stastic_scene"));
              locali.puc.put("open_from_scene", this.uFt.get("from_scence"));
              localObject1 = locali.puc;
              localObject2 = new Bundle();
              ((Bundle)localObject2).putString("__jsapi_fw_ext_info_key_current_url", this.uFo.getUrl());
              ((Map)localObject1).put("__jsapi_fw_ext_info", localObject2);
            }
            if ((!locali.uIJ.equals("shareWeibo")) && (!locali.uIJ.equals("openUrlByExtBrowser")) && (!locali.uIJ.equals("openUrlWithExtraWebview")) && (!locali.uIJ.equals("openCustomWebview")) && (!locali.uIJ.equals("openGameWebView")) && (!locali.uIJ.equals("addToEmoticon")) && (!locali.uIJ.equals("shareEmoticon")) && (!locali.uIJ.equals("openGameUrlWithExtraWebView")) && (!locali.uIJ.equals("request")))
            {
              locali.puc.put("url", this.uFo.getUrl());
              ab.i("MicroMsg.JsApiHandler", "cuiqi wv.getUrl:" + this.uFo.getUrl());
            }
            if ((locali.uIJ.equalsIgnoreCase("openDesignerEmojiView")) || (locali.uIJ.equalsIgnoreCase("openEmotionDetailViewLocal")) || (locali.uIJ.equalsIgnoreCase("openDesignerEmojiView")) || (locali.uIJ.equalsIgnoreCase("openDesignerEmojiViewLocal")) || (locali.uIJ.equalsIgnoreCase("openDesignerEmojiView")) || (locali.uIJ.equalsIgnoreCase("openDesignerProfile")) || (locali.uIJ.equalsIgnoreCase("openDesignerProfileLocal")) || (locali.uIJ.equalsIgnoreCase("getSearchEmotionData")))
            {
              locali.puc.put("searchID", Long.valueOf(dcp()));
              ab.d("MicroMsg.JsApiHandler", "emoji search id:%d", new Object[] { Long.valueOf(dcp()) });
            }
            if (locali.uIJ.equals("request"))
            {
              locali.puc.put("key_request_full_url_query", this.uFy);
              locali.puc.put("key_request_header", this.uFz);
            }
            try
            {
              localObject2 = this.uFu.cZS();
              localObject1 = new android/os/Bundle;
              ((Bundle)localObject1).<init>();
              if (localObject2 != null)
                ((JsapiPermissionWrapper)localObject2).toBundle((Bundle)localObject1);
              Object localObject3 = i.aP(locali.puc);
              if (!bo.isNullOrNil(this.uqT))
                ((Bundle)localObject3).putString("key_wxapp_id", this.uqT);
              localObject2 = new android/os/Bundle;
              ((Bundle)localObject2).<init>(2);
              ((Bundle)localObject2).putBundle("compatParams", (Bundle)localObject3);
              ((Bundle)localObject2).putString("rawParams", locali.uIH.toString());
              if ((this.icy != null) && (locali != null))
              {
                GeneralControlWrapper localGeneralControlWrapper = this.uFu.cZT();
                int i;
                if ((this.uFo != null) && ((this.uFo.getContext() instanceof WebViewUI)))
                {
                  localObject3 = (WebViewUI)this.uFo.getContext();
                  if ((((WebViewUI)localObject3).uvG) && (!localGeneralControlWrapper.dmj()))
                  {
                    ab.e("MicroMsg.JsApiHandler", "Can not call js api now, forbidJsApiExcuteNow:%b, canCallJsApiBeforeLoaded:%b", new Object[] { Boolean.valueOf(((WebViewUI)localObject3).uvG), Boolean.valueOf(localGeneralControlWrapper.dmj()) });
                    i = 0;
                  }
                }
                while (true)
                {
                  if (i == 0)
                    break label1484;
                  bool2 = this.icy.a(locali.type, locali.uIJ, locali.uIG, (Bundle)localObject1, (Bundle)localObject2, this.uqj);
                  j.cYL();
                  ab.i("MicroMsg.JsApiHandler", "dealNextMsg, %s, handleRet = %s", new Object[] { locali.uIJ, Boolean.valueOf(bool2) });
                  if (bool2)
                    break label1489;
                  AppMethodBeat.o(8950);
                  bool2 = true;
                  break;
                  i = 1;
                  continue;
                  i = 1;
                }
              }
            }
            catch (Exception localException2)
            {
              while (true)
              {
                ab.printErrStackTrace("MicroMsg.JsApiHandler", localException2, "", new Object[0]);
                ab.w("MicroMsg.JsApiHandler", "handleMsg, ex = " + localException2.getMessage());
                label1484: bool2 = false;
              }
              label1489: AppMethodBeat.o(8950);
              bool2 = bool1;
            }
          }
        }
      }
    }
  }

  // ERROR //
  private static boolean hk(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: sipush 9010
    //   5: invokestatic 92	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   12: ifne +10 -> 22
    //   15: aload_1
    //   16: invokestatic 203	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   19: ifeq +18 -> 37
    //   22: ldc 166
    //   24: ldc 205
    //   26: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   29: sipush 9010
    //   32: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   35: iload_2
    //   36: ireturn
    //   37: new 211	java/io/File
    //   40: dup
    //   41: aload_0
    //   42: invokespecial 214	java/io/File:<init>	(Ljava/lang/String;)V
    //   45: astore_3
    //   46: aload_3
    //   47: invokevirtual 218	java/io/File:exists	()Z
    //   50: ifne +8 -> 58
    //   53: aload_3
    //   54: invokevirtual 221	java/io/File:createNewFile	()Z
    //   57: pop
    //   58: aconst_null
    //   59: astore 4
    //   61: aconst_null
    //   62: astore 5
    //   64: aload 5
    //   66: astore 6
    //   68: aload 4
    //   70: astore_3
    //   71: new 223	java/io/BufferedOutputStream
    //   74: astore 7
    //   76: aload 5
    //   78: astore 6
    //   80: aload 4
    //   82: astore_3
    //   83: new 225	java/io/FileOutputStream
    //   86: astore 8
    //   88: aload 5
    //   90: astore 6
    //   92: aload 4
    //   94: astore_3
    //   95: aload 8
    //   97: aload_0
    //   98: iconst_1
    //   99: invokespecial 228	java/io/FileOutputStream:<init>	(Ljava/lang/String;Z)V
    //   102: aload 5
    //   104: astore 6
    //   106: aload 4
    //   108: astore_3
    //   109: aload 7
    //   111: aload 8
    //   113: invokespecial 231	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   116: new 225	java/io/FileOutputStream
    //   119: astore 5
    //   121: aload 5
    //   123: aload_0
    //   124: invokespecial 916	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   127: aload 5
    //   129: astore 6
    //   131: aload 5
    //   133: astore_3
    //   134: aload 5
    //   136: aload_1
    //   137: invokevirtual 281	java/lang/String:getBytes	()[B
    //   140: invokevirtual 287	java/io/OutputStream:write	([B)V
    //   143: aload 5
    //   145: astore 6
    //   147: aload 5
    //   149: astore_3
    //   150: aload 5
    //   152: bipush 13
    //   154: invokevirtual 289	java/io/OutputStream:write	(I)V
    //   157: aload 5
    //   159: astore 6
    //   161: aload 5
    //   163: astore_3
    //   164: aload 5
    //   166: bipush 10
    //   168: invokevirtual 289	java/io/OutputStream:write	(I)V
    //   171: aload 5
    //   173: astore 6
    //   175: aload 5
    //   177: astore_3
    //   178: aload 5
    //   180: invokevirtual 313	java/io/OutputStream:flush	()V
    //   183: aload 5
    //   185: invokevirtual 298	java/io/OutputStream:close	()V
    //   188: ldc 166
    //   190: ldc_w 315
    //   193: aload_0
    //   194: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   197: invokevirtual 307	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   200: invokestatic 318	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   203: sipush 9010
    //   206: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: iconst_1
    //   210: istore_2
    //   211: goto -176 -> 35
    //   214: astore_1
    //   215: ldc 166
    //   217: ldc_w 300
    //   220: aload_0
    //   221: invokestatic 303	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   224: invokevirtual 307	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   227: invokestatic 310	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   230: ldc 166
    //   232: aload_1
    //   233: ldc 123
    //   235: iconst_0
    //   236: anewarray 4	java/lang/Object
    //   239: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   242: sipush 9010
    //   245: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   248: goto -213 -> 35
    //   251: astore_1
    //   252: ldc 166
    //   254: aload_1
    //   255: ldc 123
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: goto -76 -> 188
    //   267: astore_0
    //   268: aload 6
    //   270: astore_3
    //   271: ldc 166
    //   273: aload_0
    //   274: ldc 123
    //   276: iconst_0
    //   277: anewarray 4	java/lang/Object
    //   280: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   283: aload 6
    //   285: astore_3
    //   286: ldc 166
    //   288: ldc_w 295
    //   291: invokestatic 209	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   294: aload 6
    //   296: ifnull +8 -> 304
    //   299: aload 6
    //   301: invokevirtual 298	java/io/OutputStream:close	()V
    //   304: sipush 9010
    //   307: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   310: goto -275 -> 35
    //   313: astore_0
    //   314: ldc 166
    //   316: aload_0
    //   317: ldc 123
    //   319: iconst_0
    //   320: anewarray 4	java/lang/Object
    //   323: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   326: goto -22 -> 304
    //   329: astore_0
    //   330: aload_3
    //   331: ifnull +7 -> 338
    //   334: aload_3
    //   335: invokevirtual 298	java/io/OutputStream:close	()V
    //   338: sipush 9010
    //   341: invokestatic 103	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   344: aload_0
    //   345: athrow
    //   346: astore_1
    //   347: ldc 166
    //   349: aload_1
    //   350: ldc 123
    //   352: iconst_0
    //   353: anewarray 4	java/lang/Object
    //   356: invokestatic 293	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   359: goto -21 -> 338
    //   362: astore_0
    //   363: aload 7
    //   365: astore_3
    //   366: goto -36 -> 330
    //   369: astore_0
    //   370: aload 7
    //   372: astore 6
    //   374: goto -106 -> 268
    //
    // Exception table:
    //   from	to	target	type
    //   53	58	214	java/io/IOException
    //   183	188	251	java/io/IOException
    //   71	76	267	java/lang/Exception
    //   83	88	267	java/lang/Exception
    //   95	102	267	java/lang/Exception
    //   109	116	267	java/lang/Exception
    //   134	143	267	java/lang/Exception
    //   150	157	267	java/lang/Exception
    //   164	171	267	java/lang/Exception
    //   178	183	267	java/lang/Exception
    //   299	304	313	java/io/IOException
    //   71	76	329	finally
    //   83	88	329	finally
    //   95	102	329	finally
    //   109	116	329	finally
    //   134	143	329	finally
    //   150	157	329	finally
    //   164	171	329	finally
    //   178	183	329	finally
    //   271	283	329	finally
    //   286	294	329	finally
    //   334	338	346	java/io/IOException
    //   116	127	362	finally
    //   116	127	369	java/lang/Exception
  }

  private void j(final String paramString1, String paramString2, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8980);
    if ((paramString2 == null) || (paramString2.length() == 0) || (paramString1 == null))
    {
      ab.e("MicroMsg.JsApiHandler", "doCallback, invalid args, ret = ".concat(String.valueOf(paramString2)));
      AppMethodBeat.o(8980);
    }
    while (true)
    {
      return;
      if (!this.ready)
      {
        ab.e("MicroMsg.JsApiHandler", "doCallback fail, not ready");
        AppMethodBeat.o(8980);
      }
      else
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("err_msg", paramString2);
        if ((paramMap != null) && (paramMap.size() > 0))
        {
          ab.i("MicroMsg.JsApiHandler", "doCallback, retValue size = " + paramMap.size());
          localHashMap.putAll(paramMap);
        }
        paramString1 = i.a.a(paramString1, localHashMap, this.uFv, this.uFw);
        ab.i("MicroMsg.JsApiHandler", "doCallback, ret = " + paramString2 + ", cb = " + paramString1);
        if ((paramString1 != null) && (this.uFo != null))
          al.d(new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(8892);
              try
              {
                MMWebView localMMWebView = d.d(d.this);
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
                localMMWebView.evaluateJavascript(paramString1 + ")", null);
                AppMethodBeat.o(8892);
                return;
              }
              catch (Exception localException)
              {
                while (true)
                {
                  ab.w("MicroMsg.JsApiHandler", "doCallback, ex = %s", new Object[] { localException.getMessage() });
                  AppMethodBeat.o(8892);
                }
              }
            }
          });
        AppMethodBeat.o(8980);
      }
    }
  }

  public final void JJ(int paramInt)
  {
    this.uqj = paramInt;
  }

  public final void JK(int paramInt)
  {
    AppMethodBeat.i(8953);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onFontSizeChanged fail, not ready");
      AppMethodBeat.o(8953);
    }
    while (true)
    {
      return;
      Object localObject = new HashMap();
      ((Map)localObject).put("fontSize", String.valueOf(paramInt));
      localObject = i.a.b("menu:setfont", (Map)localObject, this.uFv, this.uFw);
      this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + (String)localObject + ")", null);
      AppMethodBeat.o(8953);
    }
  }

  public final Bundle JL(int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(8956);
    try
    {
      Object localObject2 = this.uFo;
      if (localObject2 == null)
        AppMethodBeat.o(8956);
      while (true)
      {
        return localObject1;
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((Bundle)localObject2).putInt("WebViewShare_type", paramInt);
        ((Bundle)localObject2).putInt("WebViewShare_BinderID", this.uqj);
        ((Bundle)localObject2).putString("WebViewShare_wv_url", this.uFo.getUrl());
        localObject2 = this.icy.g(105, (Bundle)localObject2);
        ((Bundle)localObject2).putBoolean("use_update_jsapi_data", true);
        AppMethodBeat.o(8956);
        localObject1 = localObject2;
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiHandler", "getShareData err %s", new Object[] { localRemoteException.getMessage() });
        AppMethodBeat.o(8956);
      }
    }
  }

  public final void JM(int paramInt)
  {
    AppMethodBeat.i(8971);
    HashMap localHashMap = new HashMap();
    localHashMap.put("height", Integer.valueOf(a.ao(ah.getContext(), paramInt)));
    al.d(new d.21(this, i.a.b("onGetKeyboardHeight", localHashMap, this.uFv, this.uFw)));
    AppMethodBeat.o(8971);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _getAllHosts(final String paramString)
  {
    AppMethodBeat.i(8940);
    if (paramString != null)
      this.uFr.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8930);
          Map localMap = d.M(paramString.split(","));
          String str = d.a(d.this, "hosts");
          if (d.B(str, localMap))
            if ((d.n(d.this) == null) || (d.d(d.this) == null))
              break label123;
          while (true)
          {
            try
            {
              d.n(d.this).J(0, d.d(d.this).getUrl(), str);
              AppMethodBeat.o(8930);
              return;
            }
            catch (RemoteException localRemoteException)
            {
              ab.e("MicroMsg.JsApiHandler", "uploadFileToCDN error ", new Object[] { localRemoteException.getMessage() });
              AppMethodBeat.o(8930);
              continue;
            }
            ab.e("MicroMsg.JsApiHandler", "failed to write Hosts file");
            label123: AppMethodBeat.o(8930);
          }
        }
      });
    AppMethodBeat.o(8940);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final String _getDgtVerifyRandomStr()
  {
    return this.uFw;
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _getHtmlContent(String paramString)
  {
    AppMethodBeat.i(8941);
    if (paramString != null)
      this.uFr.post(new d.67(this, paramString));
    AppMethodBeat.o(8941);
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final boolean _isDgtVerifyEnabled()
  {
    return this.uFv;
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _ready(boolean paramBoolean)
  {
    this.ready = paramBoolean;
  }

  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void _sendMessage(String paramString)
  {
    AppMethodBeat.i(8939);
    if (this.uFr != null)
    {
      Message localMessage = Message.obtain();
      localMessage.what = 1;
      localMessage.obj = paramString;
      this.uFr.sendMessage(localMessage);
    }
    AppMethodBeat.o(8939);
  }

  public final void a(int paramInt, long paramLong, String paramString)
  {
    AppMethodBeat.i(8999);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onUxOplogDataReady fail, not ready");
      AppMethodBeat.o(8999);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onUxOplogDataReady success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("ret", Integer.valueOf(paramInt));
      localHashMap.put("reqId", Long.valueOf(paramLong));
      localHashMap.put("json", paramString);
      al.d(new d.54(this, i.a.b("onUxOplogDataReady", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8999);
    }
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(8946);
    if (this.uFx == null)
      this.uFx = new HashSet();
    this.uFx.add(parama);
    AppMethodBeat.o(8946);
  }

  public final void a(k paramk)
  {
    this.uFu = paramk;
  }

  public final void a(String paramString, int paramInt1, int paramInt2, double paramDouble1, double paramDouble2, float paramFloat)
  {
    int i = 1;
    while (true)
    {
      try
      {
        AppMethodBeat.i(8976);
        if (this.uFG.doT())
          this.uFG.ae(1000L, 1000L);
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        if ((paramDouble1 > 0.0D) && (paramDouble1 < 0.5D))
          try
          {
            Object localObject1 = this.uFF;
            Object localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            if (!((List)localObject1).contains(String.valueOf(paramString) + String.valueOf(paramInt1) + String.valueOf(paramInt2)))
            {
              localObject2 = this.uFF;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              ((List)localObject2).add(String.valueOf(paramString) + String.valueOf(paramInt1) + String.valueOf(paramInt2));
              localJSONObject.put("uuid", String.valueOf(paramString));
              localJSONObject.put("major", String.valueOf(paramInt1));
              localJSONObject.put("minor", String.valueOf(paramInt2));
              localJSONObject.put("accuracy", String.valueOf(paramDouble1));
              localJSONObject.put("rssi", String.valueOf(paramDouble2));
              localJSONObject.put("heading", String.valueOf(paramFloat));
              localJSONObject.put("proximity", String.valueOf(i));
              this.uFE.put(localJSONObject);
              this.uFD.put("beacons", this.uFE);
              this.uFD.put("err_msg", "onBeaconsInRange:ok");
            }
            i.a.a("onBeaconsInRange", this.uFD, this.uFv, this.uFw);
            AppMethodBeat.o(8976);
            return;
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.JsApiHandler", "parse json error in onBeaconsInRange!! ", new Object[] { paramString.getMessage() });
            continue;
          }
      }
      finally
      {
      }
      i = 0;
    }
  }

  public final void a(String paramString1, String paramString2, Map<String, Object> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(8977);
    if (!bo.isNullOrNil(paramString1))
      j(paramString1, paramString2, paramMap);
    if (paramBoolean)
      cZc();
    AppMethodBeat.o(8977);
  }

  public final void a(String paramString1, String paramString2, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(8989);
    HashMap localHashMap = new HashMap();
    localHashMap.put("query", paramString1);
    localHashMap.put("custom", paramString2);
    localHashMap.put("tagList", paramJSONArray);
    a("onSearchInputChange", localHashMap, null);
    AppMethodBeat.o(8989);
  }

  public final void a(String paramString1, String paramString2, JSONArray paramJSONArray, int paramInt)
  {
    AppMethodBeat.i(8988);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchInputChange fail, not ready");
      AppMethodBeat.o(8988);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchInputChange success, ready %s %s %s", new Object[] { paramString1, paramString2, paramJSONArray.toString() });
      HashMap localHashMap = new HashMap();
      localHashMap.put("query", paramString1);
      localHashMap.put("custom", paramString2);
      localHashMap.put("tagList", paramJSONArray);
      localHashMap.put("isCancelButtonClick", Integer.valueOf(paramInt));
      al.d(new d.46(this, i.a.b("onSearchInputChange", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8988);
    }
  }

  public final void a(String paramString1, String paramString2, JSONArray paramJSONArray, int paramInt, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8993);
    a(paramString1, paramString2, paramJSONArray, paramInt, "", paramMap);
    AppMethodBeat.o(8993);
  }

  public final void a(String paramString, Map<String, Object> paramMap, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(8991);
    if ((!this.ready) || ((paramMap == null) && (paramJSONObject == null)))
    {
      ab.e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s", new Object[] { paramString });
      AppMethodBeat.o(8991);
      return;
    }
    String str1;
    label52: String str2;
    if (paramMap == null)
    {
      str1 = "";
      if (paramJSONObject != null)
        break label135;
      str2 = "";
      label60: ab.i("MicroMsg.JsApiHandler", "onSendEventToJSBridge success, event=%s, params=%s, jsonParams=%s", new Object[] { paramString, str1, str2 });
      if (paramMap == null)
        break label144;
    }
    label135: label144: for (paramMap = i.a.b(paramString, paramMap, this.uFv, this.uFw); ; paramMap = i.a.a(paramString, paramJSONObject, this.uFv, this.uFw))
    {
      al.d(new d.47(this, paramMap, paramString));
      AppMethodBeat.o(8991);
      break;
      str1 = paramMap.toString();
      break label52;
      str2 = paramJSONObject.toString();
      break label60;
    }
  }

  public final void a(String paramString1, boolean paramBoolean, String paramString2, String paramString3)
  {
    AppMethodBeat.i(8986);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, not ready");
      AppMethodBeat.o(8986);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("eventId", paramString1);
      localHashMap.put("widgetId", paramString3);
      localHashMap.put("hitTest", Boolean.valueOf(paramBoolean));
      localHashMap.put("err_msg", paramString2);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8902);
          try
          {
            MMWebView localMMWebView = d.d(d.this);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            localMMWebView.evaluateJavascript(this.itc + ")", null);
            AppMethodBeat.o(8902);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetOnTapCallback fail, ex = %s", new Object[] { localException.getMessage() });
              AppMethodBeat.o(8902);
            }
          }
        }
      });
      AppMethodBeat.o(8986);
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, JSONArray paramJSONArray, String paramString8, int paramInt, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8992);
    boolean bool;
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "switchToTabSearch fail, not ready");
      bool = false;
      AppMethodBeat.o(8992);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.JsApiHandler", "switchToTabSearch success, ready %s %s %s %s %s", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5 });
      JSONObject localJSONObject = new JSONObject();
      if (paramMap != null)
      {
        paramMap = paramMap.entrySet().iterator();
        while (paramMap.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)paramMap.next();
          if (localEntry.getValue() != null)
            try
            {
              String str1 = (String)localEntry.getKey();
              localObject = new org/json/JSONObject;
              ((JSONObject)localObject).<init>(localEntry.getValue().toString());
              localJSONObject.put(str1, localObject);
            }
            catch (JSONException localJSONException2)
            {
              try
              {
                String str2 = (String)localEntry.getKey();
                Object localObject = new org/json/JSONArray;
                ((JSONArray)localObject).<init>(localEntry.getValue().toString());
                localJSONObject.put(str2, localObject);
              }
              catch (JSONException localJSONException3)
              {
                try
                {
                  localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
                }
                catch (JSONException localJSONException1)
                {
                  ab.printErrStackTrace("MicroMsg.JsApiHandler", localJSONException2, "", new Object[0]);
                }
              }
            }
        }
      }
      try
      {
        localJSONObject.put("type", paramString1);
        localJSONObject.put("isMostSearchBiz", paramString2);
        localJSONObject.put("isSug", paramString3);
        localJSONObject.put("isLocalSug", paramString5);
        localJSONObject.put("scene", paramString4);
        localJSONObject.put("query", paramString6);
        localJSONObject.put("custom", paramString7);
        localJSONObject.put("tagList", paramJSONArray);
        localJSONObject.put("isBackButtonClick", 0);
        localJSONObject.put("sugId", paramString8);
        localJSONObject.put("sugClickType", paramInt);
        al.d(new d.48(this, i.a.a("switchToTabSearch", localJSONObject, this.uFv, this.uFw)));
        bool = true;
        AppMethodBeat.o(8992);
      }
      catch (JSONException paramString1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.JsApiHandler", paramString1, "", new Object[0]);
      }
    }
  }

  public final boolean a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8990);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      paramMap = paramMap.entrySet().iterator();
      while (paramMap.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramMap.next();
        localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
      }
    }
    catch (Exception paramMap)
    {
      ab.printErrStackTrace("MicroMsg.JsApiHandler", paramMap, "", new Object[0]);
    }
    try
    {
      localJSONObject.put("scene", paramString1);
      localJSONObject.put("type", paramString2);
      localJSONObject.put("isSug", paramString3);
      localJSONObject.put("isLocalSug", paramString4);
      localJSONObject.put("sessionId", paramString5);
      a("switchToTabSearch", null, localJSONObject);
      AppMethodBeat.o(8990);
      return true;
    }
    catch (JSONException paramString1)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.JsApiHandler", paramString1, "", new Object[0]);
    }
  }

  public final void aK(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8944);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onPreloadWebViewInit fail, not ready");
      AppMethodBeat.o(8944);
      return;
    }
    ab.i("MicroMsg.JsApiHandler", "onPreloadWebViewInit success, ready");
    if (paramMap == null);
    for (String str = ""; ; str = paramMap.toString())
    {
      ab.i("MicroMsg.JsApiHandler", "onPreloadWebViewInit,params %s", new Object[] { str });
      al.d(new d.44(this, i.a.b("onUiInit", paramMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8944);
      break;
    }
  }

  public final Bundle aL(Map<String, String> paramMap)
  {
    AppMethodBeat.i(8957);
    Bundle localBundle = new Bundle();
    String str1 = this.uFo.getUrl();
    String str2;
    if (paramMap != null)
    {
      str2 = (String)paramMap.get("share_report_pre_msg_url");
      if (!bo.isNullOrNil(str2))
        break label271;
      str2 = str1;
    }
    label271: 
    while (true)
    {
      Object localObject = (String)paramMap.get("share_report_pre_msg_title");
      if (bo.isNullOrNil((String)localObject))
        localObject = this.uFo.getTitle();
      while (true)
      {
        String str3 = (String)paramMap.get("share_report_pre_msg_desc");
        String str4 = str3;
        if (bo.isNullOrNil(str3))
          str4 = str1;
        localBundle.putString("link", str2);
        localBundle.putString("desc", str4);
        localBundle.putString("img_url", bo.nullAsNil((String)paramMap.get("share_report_pre_msg_icon_url")));
        if (bo.isNullOrNil((String)localObject))
          if (!bo.isNullOrNil(str1))
          {
            localObject = Uri.parse(str1);
            paramMap = str1;
            if (((Uri)localObject).getHost() != null)
              paramMap = ((Uri)localObject).getHost();
          }
        while (true)
        {
          localBundle.putString("title", paramMap);
          localBundle.putBoolean("use_update_jsapi_data", false);
          AppMethodBeat.o(8957);
          return localBundle;
          localObject = this.uFo.getTitle();
          localBundle.putString("link", str1);
          localBundle.putString("desc", str1);
          localBundle.putString("img_url", "");
          break;
          paramMap = ah.getContext().getString(2131305561);
          continue;
          paramMap = (Map<String, String>)localObject;
        }
      }
    }
  }

  public final void aM(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8963);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, not ready");
      AppMethodBeat.o(8963);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onVoicePlayEnd");
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8872);
          try
          {
            MMWebView localMMWebView = d.d(d.this);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            localMMWebView.evaluateJavascript(this.itc + ")", null);
            AppMethodBeat.o(8872);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, ex = %s", new Object[] { localException.getMessage() });
              AppMethodBeat.o(8872);
            }
          }
        }
      });
      AppMethodBeat.o(8963);
    }
  }

  public final void aN(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8964);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, not ready");
      AppMethodBeat.o(8964);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onVoiceRecordEnd");
      paramMap = i.a.b("onVoiceRecordEnd", paramMap, this.uFv, this.uFw);
      ab.i("MicroMsg.JsApiHandler", "onVoiceRecordEnd event : %s", new Object[] { paramMap });
      al.d(new d.10(this, paramMap));
      AppMethodBeat.o(8964);
    }
  }

  public final void aO(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(8981);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSelectContact fail, not ready");
      AppMethodBeat.o(8981);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSelectContact success, ready");
      al.d(new d.30(this, i.a.b("onSelectContact", paramMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8981);
    }
  }

  public final void aP(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(8983);
    al.d(new d.34(this, i.a.a("onGetMatchContactList", paramJSONObject, this.uFv, this.uFw)));
    AppMethodBeat.o(8983);
  }

  public final boolean afM(String paramString)
  {
    AppMethodBeat.i(8943);
    this.uFo.evaluateJavascript("javascript:WeixinJSBridge._fetchQueue()", new d.12(this, paramString));
    AppMethodBeat.o(8943);
    return true;
  }

  public final boolean afS(String paramString)
  {
    AppMethodBeat.i(8942);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      bool = false;
      AppMethodBeat.o(8942);
    }
    while (true)
    {
      return bool;
      bool = u.t(paramString, "weixin://dispatch_message/");
      AppMethodBeat.o(8942);
    }
  }

  public final void agl(String paramString)
  {
    this.uFy = paramString;
  }

  public final void agm(String paramString)
  {
    this.uFz = paramString;
  }

  public final void agn(String paramString)
  {
    AppMethodBeat.i(8962);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onActivityStateChanged fail, not ready");
      AppMethodBeat.o(8962);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onActivityStateChanged, state = ".concat(String.valueOf(paramString)));
      Object localObject = new HashMap();
      ((Map)localObject).put("state", paramString);
      String str = i.a.b("activity:state_change", (Map)localObject, this.uFv, this.uFw);
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        try
        {
          paramString = this.uFo;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
          paramString.evaluateJavascript(str + ")", null);
          AppMethodBeat.o(8962);
        }
        catch (Exception paramString)
        {
          ab.w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", new Object[] { paramString.getMessage() });
          AppMethodBeat.o(8962);
        }
      }
      else
      {
        al.d(new d.8(this, str));
        AppMethodBeat.o(8962);
      }
    }
  }

  public final void ago(String paramString)
  {
    AppMethodBeat.i(8970);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      JsapiPermissionWrapper localJsapiPermissionWrapper = this.uFu.cZS();
      if (localJsapiPermissionWrapper != null)
        localJsapiPermissionWrapper.toBundle(localBundle);
      this.icy.a(paramString, localBundle, this.uqj);
      AppMethodBeat.o(8970);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.JsApiHandler", "doProfile, ex = " + paramString.getMessage());
        AppMethodBeat.o(8970);
      }
    }
  }

  public final void agp(String paramString)
  {
    AppMethodBeat.i(8973);
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_msg", paramString);
    al.d(new d.25(this, i.a.b("onBeaconMonitoring", localHashMap, this.uFv, this.uFw)));
    AppMethodBeat.o(8973);
  }

  public final void agq(String paramString)
  {
    AppMethodBeat.i(8995);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, not ready");
      AppMethodBeat.o(8995);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("json", paramString);
      al.d(new d.50(this, i.a.b("onSearchSuggestionDataReady", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8995);
    }
  }

  public final void ags(String paramString)
  {
    AppMethodBeat.i(9005);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(9005);
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("netType", paramString);
      al.d(new d.62(this, i.a.b("onNetWorkChange", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(9005);
    }
  }

  public final void ap(Bundle paramBundle)
  {
    AppMethodBeat.i(8985);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onGetPoiInfo fail, not ready");
      AppMethodBeat.o(8985);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onGetPoiInfo success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("json", paramBundle.getString("json"));
      localHashMap.put("searchId", paramBundle.getString("searchId"));
      localHashMap.put("poiId", paramBundle.getString("poiId"));
      al.d(new d.37(this, i.a.b("onGetPoiInfoReturn", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8985);
    }
  }

  public final void bG(int paramInt, String paramString)
  {
    AppMethodBeat.i(8954);
    if (!this.ready)
      AppMethodBeat.o(8954);
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("recommend", Integer.valueOf(paramInt));
      localHashMap.put("comment", paramString);
      paramString = i.a.b("menu:haokan", localHashMap, this.uFv, this.uFw);
      this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + paramString + ")", null);
      AppMethodBeat.o(8954);
    }
  }

  public final void bH(int paramInt, String paramString)
  {
    AppMethodBeat.i(8996);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, not ready");
      AppMethodBeat.o(8996);
    }
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("ret", Integer.valueOf(paramInt));
      localHashMap.put("data", paramString);
      al.d(new d.51(this, i.a.b("onSearchImageListReady", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8996);
    }
  }

  public final void bJ(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(8938);
    try
    {
      this.icy.i(paramString, paramBoolean, this.uqj);
      AppMethodBeat.o(8938);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.w("MicroMsg.JsApiHandler", "addInvokedJsApiFromMenu, ex = ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(8938);
      }
    }
  }

  public final void cZb()
  {
    AppMethodBeat.i(8979);
    if (this.uFq != null)
      this.uFq.clear();
    AppMethodBeat.o(8979);
  }

  public final void cZc()
  {
    AppMethodBeat.i(8978);
    if (this.uFr != null)
      this.uFr.post(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8891);
          d.f(d.this);
          AppMethodBeat.o(8891);
        }
      });
    AppMethodBeat.o(8978);
  }

  public final void dG(String paramString, int paramInt)
  {
    AppMethodBeat.i(8961);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onExdeviceStateChange fail, not ready");
      AppMethodBeat.o(8961);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onExdeviceStateChange: device id = %s, state = %s", new Object[] { paramString, Integer.valueOf(paramInt) });
      if (!bo.isNullOrNil(paramString))
        break;
      ab.e("MicroMsg.JsApiHandler", "parameter error!!!");
      AppMethodBeat.o(8961);
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("deviceId", paramString);
    if (paramInt == 2)
      localHashMap.put("state", "connected");
    while (true)
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8866);
          try
          {
            MMWebView localMMWebView = d.d(d.this);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            localMMWebView.evaluateJavascript(this.itc + ")", null);
            AppMethodBeat.o(8866);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.w("MicroMsg.JsApiHandler", "onExdeviceStateChange, %s", new Object[] { localException.getMessage() });
              AppMethodBeat.o(8866);
            }
          }
        }
      });
      AppMethodBeat.o(8961);
      break;
      if (paramInt == 1)
        localHashMap.put("state", "connecting");
      else
        localHashMap.put("state", "disconnected");
    }
  }

  public final void dH(String paramString, int paramInt)
  {
    AppMethodBeat.i(8965);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onImageUploadProgress fail, not ready");
      AppMethodBeat.o(8965);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onImageUploadProgress, local id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      HashMap localHashMap = new HashMap();
      localHashMap.put("localId", paramString);
      localHashMap.put("percent", Integer.valueOf(paramInt));
      al.d(new d.13(this, i.a.b("onImageUploadProgress", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8965);
    }
  }

  public final void dI(String paramString, int paramInt)
  {
    AppMethodBeat.i(8966);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onImageDownloadProgress fail, not ready");
      AppMethodBeat.o(8966);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onImageDownloadProgress, serverId id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      HashMap localHashMap = new HashMap();
      localHashMap.put("serverId", paramString);
      localHashMap.put("percent", Integer.valueOf(paramInt));
      al.d(new d.14(this, i.a.b("onImageDownloadProgress", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8966);
    }
  }

  public final void dJ(String paramString, int paramInt)
  {
    AppMethodBeat.i(8967);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, not ready");
      AppMethodBeat.o(8967);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onVoiceUploadProgress, local id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      HashMap localHashMap = new HashMap();
      localHashMap.put("localId", paramString);
      localHashMap.put("percent", Integer.valueOf(paramInt));
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8878);
          try
          {
            MMWebView localMMWebView = d.d(d.this);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            localMMWebView.evaluateJavascript(this.itc + ")", null);
            AppMethodBeat.o(8878);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, ex = %s", new Object[] { localException.getMessage() });
              AppMethodBeat.o(8878);
            }
          }
        }
      });
      AppMethodBeat.o(8967);
    }
  }

  public final void dK(String paramString, int paramInt)
  {
    AppMethodBeat.i(8968);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, not ready");
      AppMethodBeat.o(8968);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onVoiceDownloadProgress, serverId id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      HashMap localHashMap = new HashMap();
      localHashMap.put("serverId", paramString);
      localHashMap.put("percent", Integer.valueOf(paramInt));
      al.d(new d.16(this, i.a.b("onVoiceDownloadProgress", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8968);
    }
  }

  public final void dL(String paramString, int paramInt)
  {
    AppMethodBeat.i(8969);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, not ready");
      AppMethodBeat.o(8969);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onVideoUploadoadProgress, local id : %s, percent : %d", new Object[] { paramString, Integer.valueOf(paramInt) });
      HashMap localHashMap = new HashMap();
      localHashMap.put("localId", paramString);
      localHashMap.put("percent", Integer.valueOf(paramInt));
      al.d(new d.17(this, i.a.b("onVideoUploadProgress", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8969);
    }
  }

  final String dM(String paramString, int paramInt)
  {
    AppMethodBeat.i(8975);
    HashMap localHashMap = new HashMap(2);
    localHashMap.put("url", paramString);
    localHashMap.put("set_cookie", Integer.valueOf(paramInt));
    paramString = agr(i.a.b("onGetA8KeyUrl", localHashMap, this.uFv, this.uFw));
    AppMethodBeat.o(8975);
    return paramString;
  }

  public final void dN(String paramString, int paramInt)
  {
    AppMethodBeat.i(9000);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, not ready");
      AppMethodBeat.o(9000);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onMusicStatusChanged success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("snsid", paramString);
      localHashMap.put("status", Integer.valueOf(paramInt));
      al.d(new d.56(this, i.a.b("onMusicStatusChanged", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(9000);
    }
  }

  public final void dch()
  {
    AppMethodBeat.i(8937);
    this.uFv = true;
    this.uFw = bo.Mb(16);
    ab.i("MicroMsg.JsApiHandler", "js digest verification randomStr = %s, hashCode: %d", new Object[] { this.uFw, Integer.valueOf(hashCode()) });
    AppMethodBeat.o(8937);
  }

  public final String dci()
  {
    return this.uFw;
  }

  public final void dcj()
  {
    AppMethodBeat.i(8947);
    ab.v("MicroMsg.JsApiHandler", "doAttachRunOn3rdApis, ready(%s).", new Object[] { Boolean.valueOf(this.ready) });
    if ((this.uFo != null) && (this.ready))
      this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.b("sys:attach_runOn3rd_apis", dck(), this.uFv, this.uFw) + ")", new d.55(this));
    AppMethodBeat.o(8947);
  }

  public final void dcn()
  {
    AppMethodBeat.i(9004);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading fail, not ready");
      AppMethodBeat.o(9004);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("needShow", Boolean.TRUE);
      al.d(new d.60(this, i.a.b("showLoading", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(9004);
    }
  }

  public final void dco()
  {
    AppMethodBeat.i(9006);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onNavigationBarRightButtonClick fail, not ready");
      AppMethodBeat.o(9006);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onNavigationBarRightButtonClick success, ready");
      String str = i.a.b("onNavigationBarRightButtonClick", new HashMap(), this.uFv, this.uFw);
      this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", null);
      AppMethodBeat.o(9006);
    }
  }

  public final long dcp()
  {
    AppMethodBeat.i(9007);
    ab.d("MicroMsg.JsApiHandler", "cpan emoji get SearchID:%d", new Object[] { Long.valueOf(this.uFH) });
    long l = this.uFH;
    AppMethodBeat.o(9007);
    return l;
  }

  public final void detach()
  {
    AppMethodBeat.i(8951);
    this.ready = false;
    this.uFq.clear();
    this.uFp.clear();
    this.uFr = null;
    AppMethodBeat.o(8951);
  }

  public final void e(com.tencent.mm.plugin.webview.stub.d paramd)
  {
    this.icy = paramd;
  }

  public final void gA(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8982);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchActionSheetClick fail, not ready");
      AppMethodBeat.o(8982);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchActionSheetClick success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("index", Integer.valueOf(paramInt1));
      localHashMap.put("actionSheetId", Integer.valueOf(paramInt2));
      al.d(new d.31(this, i.a.b("onSearchActionSheetClick", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8982);
    }
  }

  public final void h(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(8958);
    if (paramBundle == null)
    {
      ab.w("MicroMsg.JsApiHandler", "sendDataWithSetData data is null");
      AppMethodBeat.o(8958);
    }
    while (true)
    {
      return;
      if (this.uFr != null)
        this.uFr.post(new d.68(this, paramBundle, paramString));
      AppMethodBeat.o(8958);
    }
  }

  public final void h(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(8984);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchDataReady fail, not ready");
      AppMethodBeat.o(8984);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchDataReady success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("json", paramString1);
      localHashMap.put("newQuery", Boolean.valueOf(paramBoolean));
      localHashMap.put("requestId", paramString2);
      al.d(new d.36(this, i.a.b("onSearchDataReady", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8984);
    }
  }

  public final void hj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(8987);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish fail, not ready");
      AppMethodBeat.o(8987);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("widgetId", paramString1);
      localHashMap.put("data", paramString2);
      al.d(new d.42(this, i.a.b("onSearchWAWidgetReloadDataFinish", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8987);
    }
  }

  public final void i(Bundle paramBundle, String paramString)
  {
    AppMethodBeat.i(8959);
    if ((!this.ready) || (paramBundle == null))
    {
      ab.e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
      AppMethodBeat.o(8959);
    }
    while (true)
    {
      return;
      long l = paramBundle.getLong("download_manager_downloadid");
      String str = paramBundle.getString("download_manager_appid", "");
      int i = paramBundle.getInt("download_manager_errcode");
      ab.i("MicroMsg.JsApiHandler", "onDownloadStateChange, downloadId = " + l + ", state = " + paramString + ", errCode = " + i);
      paramBundle = new HashMap();
      paramBundle.put("appid", str);
      paramBundle.put("download_id", Long.valueOf(l));
      paramBundle.put("err_code", Integer.valueOf(i));
      paramBundle.put("state", paramString);
      al.d(new d.69(this, i.a.b("wxdownload:state_change", paramBundle, this.uFv, this.uFw)));
      AppMethodBeat.o(8959);
    }
  }

  public final void keep_setReturnValue(String paramString1, String paramString2)
  {
    AppMethodBeat.i(8952);
    ab.i("MicroMsg.JsApiHandler", "setResultValue, scene = " + paramString1 + ", resultValue = " + paramString2);
    ab.i("MicroMsg.JsApiHandler", "edw setResultValue = threadId = " + Thread.currentThread().getId() + ", threadName = " + Thread.currentThread().getName());
    Message localMessage;
    if (this.uFr != null)
    {
      localMessage = Message.obtain();
      localMessage.obj = paramString2;
      if (!paramString1.equals("SCENE_FETCHQUEUE"))
        break label127;
      localMessage.what = 1;
    }
    while (true)
    {
      this.uFr.sendMessage(localMessage);
      AppMethodBeat.o(8952);
      return;
      label127: if (paramString1.equals("SCENE_HANDLEMSGFROMWX"))
        localMessage.what = 2;
    }
  }

  public final void m(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(8998);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onSearchGuideDataReady fail, not ready");
      AppMethodBeat.o(8998);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onSearchGuideDataReady success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("json", paramString);
      localHashMap.put("isCacheData", Integer.valueOf(paramInt1));
      localHashMap.put("isExpired", Integer.valueOf(paramInt2));
      localHashMap.put("isPreload", Integer.valueOf(paramInt3));
      al.d(new d.53(this, i.a.b("onSearchGuideDataReady", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8998);
    }
  }

  public final void n(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(8997);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, not ready");
      AppMethodBeat.o(8997);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onTeachSearchDataReady success, ready");
      HashMap localHashMap = new HashMap();
      localHashMap.put("requestType", Integer.valueOf(paramInt1));
      localHashMap.put("json", paramString);
      localHashMap.put("isCacheData", Integer.valueOf(paramInt2));
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8916);
          try
          {
            MMWebView localMMWebView = d.d(d.this);
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>("javascript:WeixinJSBridge._handleMessageFromWeixin(");
            localMMWebView.evaluateJavascript(this.itc + ")", null);
            AppMethodBeat.o(8916);
            return;
          }
          catch (Exception localException)
          {
            while (true)
            {
              ab.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, ex = %s", new Object[] { localException.getMessage() });
              AppMethodBeat.o(8916);
            }
          }
        }
      });
      AppMethodBeat.o(8997);
    }
  }

  public final void n(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(8960);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
      AppMethodBeat.o(8960);
    }
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("appid", paramString);
      localHashMap.put("download_id", Long.valueOf(paramLong));
      localHashMap.put("progress", Integer.valueOf(paramInt));
      al.d(new d.2(this, i.a.b("wxdownload:progress_change", localHashMap, this.uFv, this.uFw)));
      AppMethodBeat.o(8960);
    }
  }

  public final void nN(boolean paramBoolean)
  {
    AppMethodBeat.i(9002);
    if (!this.ready)
    {
      ab.e("MicroMsg.JsApiHandler", "onPageStateChange fail, not ready");
      AppMethodBeat.o(9002);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.JsApiHandler", "onPageStateChange success, ready, active = %b", new Object[] { Boolean.valueOf(paramBoolean) });
      HashMap localHashMap = new HashMap();
      localHashMap.put("active", String.valueOf(paramBoolean));
      al.d(new d.58(this, agr(i.a.b("onPageStateChange", localHashMap, this.uFv, this.uFw))));
      AppMethodBeat.o(9002);
    }
  }

  public final void nZ(boolean paramBoolean)
  {
    AppMethodBeat.i(8945);
    this.ready = paramBoolean;
    if ((paramBoolean) && (this.uFx != null))
    {
      Iterator localIterator = this.uFx.iterator();
      while (localIterator.hasNext())
      {
        d.a locala = (d.a)localIterator.next();
        if (locala != null)
          locala.onReady();
      }
    }
    AppMethodBeat.o(8945);
  }

  public final void oa(boolean paramBoolean)
  {
    AppMethodBeat.i(8972);
    HashMap localHashMap = new HashMap();
    localHashMap.put("success", Boolean.valueOf(paramBoolean));
    al.d(new d.24(this, i.a.b("onAddShortcutStatus", localHashMap, this.uFv, this.uFw)));
    AppMethodBeat.o(8972);
  }

  public final void ob(boolean paramBoolean)
  {
    AppMethodBeat.i(9003);
    ab.i("MicroMsg.JsApiHandler", "getHtmlContent, ready(%s).", new Object[] { Boolean.valueOf(this.ready) });
    if ((this.uFo != null) && (this.icy != null) && (this.ready))
      if (paramBoolean)
      {
        this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.b("sys:get_html_content", new HashMap(), this.uFv, this.uFw) + ")", null);
        AppMethodBeat.o(9003);
      }
    while (true)
    {
      return;
      try
      {
        List localList = this.icy.cZq();
        Uri localUri = Uri.parse(this.uFo.getUrl());
        if (localUri != null)
          ab.d("MicroMsg.JsApiHandler", "wv hijack url host" + localUri.getHost());
        if ((localList != null) && (localUri != null) && (localList.contains(localUri.getHost())))
          this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + i.a.b("sys:get_html_content", new HashMap(), this.uFv, this.uFw) + ")", null);
        AppMethodBeat.o(9003);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.JsApiHandler", localRemoteException, "", new Object[0]);
          Object localObject = null;
        }
      }
    }
  }

  public final void q(HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(8955);
    if (!this.ready)
    {
      ab.w("MicroMsg.JsApiHandler", "onSendToFriend not ready");
      h(aL(paramHashMap), "sendAppMessage");
      AppMethodBeat.o(8955);
    }
    while (true)
    {
      return;
      paramHashMap = JL(1);
      if ((paramHashMap != null) && (paramHashMap.getBoolean("WebViewShare_reslut", false)))
      {
        h(paramHashMap, "sendAppMessage");
        AppMethodBeat.o(8955);
      }
      else
      {
        paramHashMap = new HashMap();
        paramHashMap.put("scene", "friend");
        paramHashMap = i.a.b("menu:share:appmessage", paramHashMap, this.uFv, this.uFw);
        this.uFo.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + paramHashMap + ")", null);
        try
        {
          this.icy.L("scene", "friend", this.uqj);
          AppMethodBeat.o(8955);
        }
        catch (Exception paramHashMap)
        {
          ab.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + paramHashMap.getMessage());
          AppMethodBeat.o(8955);
        }
      }
    }
  }

  public final void z(final String paramString, final Map<String, String> paramMap)
  {
    AppMethodBeat.i(8974);
    ab.d("MicroMsg.JsApiHandler", "onGetA8KeyUrl, fullUrl = %s", new Object[] { paramString });
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(8974);
      return;
    }
    this.uFB = paramString;
    if ((paramMap != null) && (paramMap.size() != 0));
    for (this.uFC = 1; ; this.uFC = 0)
    {
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(8889);
          com.tencent.xweb.b localb;
          try
          {
            if ((paramMap != null) && (paramMap.size() != 0))
            {
              com.tencent.xweb.c.jx(ah.getContext());
              localb = com.tencent.xweb.b.dTR();
              Iterator localIterator = paramMap.keySet().iterator();
              while (localIterator.hasNext())
              {
                String str1 = (String)localIterator.next();
                String str2 = bo.anB(paramString);
                StringBuilder localStringBuilder = new java/lang/StringBuilder;
                localStringBuilder.<init>();
                localb.setCookie(str2, str1 + "=" + (String)paramMap.get(str1));
              }
            }
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.JsApiHandler", "onGetA8KeyUrl fail, ex = %s", new Object[] { localException.getMessage() });
            AppMethodBeat.o(8889);
          }
          while (true)
          {
            return;
            localb.setCookie(bo.anB(paramString), "httponly");
            com.tencent.xweb.c.dTT();
            com.tencent.xweb.c.sync();
            ab.i("MicroMsg.JsApiHandler", "cookies:%s", new Object[] { localb.getCookie(bo.anB(paramString)) });
            d.d(d.this).evaluateJavascript(String.format("javascript:(function(){ window.getA8KeyUrl='%s'; })()", new Object[] { paramString }), null);
            d.d(d.this).evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
            if (d.g(d.this))
            {
              d.d(d.this).evaluateJavascript(this.uFK, null);
              d.h(d.this);
              d.i(d.this);
            }
            AppMethodBeat.o(8889);
          }
        }
      });
      AppMethodBeat.o(8974);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.d
 * JD-Core Version:    0.6.2
 */