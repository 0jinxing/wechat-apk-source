package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.m.d.b;
import com.tencent.mm.plugin.brandservice.a.b.a;
import com.tencent.mm.plugin.webview.model.af.b;
import com.tencent.mm.plugin.webview.model.an;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.stub.e.a;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bd;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.e.m;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.vfs.e;
import com.tencent.qqvideo.proxy.api.FactoryProxyManager;
import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.xweb.WebView.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.XWalkEnvironment;

public final class n extends e.a
{
  private final WeakReference<WebViewUI> uqV;

  public n(WebViewUI paramWebViewUI)
  {
    AppMethodBeat.i(7774);
    this.uqV = new WeakReference(paramWebViewUI);
    AppMethodBeat.o(7774);
  }

  private int afH(String paramString)
  {
    AppMethodBeat.i(7793);
    int i = ((WebViewUI)this.uqV.get()).afH(paramString);
    AppMethodBeat.o(7793);
    return i;
  }

  private Intent getIntent()
  {
    AppMethodBeat.i(7792);
    Intent localIntent = ((WebViewUI)this.uqV.get()).getIntent();
    AppMethodBeat.o(7792);
    return localIntent;
  }

  public final boolean IZ(final int paramInt)
  {
    AppMethodBeat.i(7777);
    al.d(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(7740);
        if ((n.a(n.this).get() == null) || (((WebViewUI)n.a(n.this).get()).isFinishing()))
          AppMethodBeat.o(7740);
        while (true)
        {
          return;
          ((WebViewUI)n.a(n.this).get()).setProgressBarIndeterminateVisibility(false);
          ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "[cpan] set title pb visibility:%d", new Object[] { Integer.valueOf(paramInt) });
          if (paramInt == 0)
          {
            if ((!((WebViewUI)n.a(n.this).get()).uwn) && (!((WebViewUI)n.a(n.this).get()).uwp))
            {
              ((WebViewUI)n.a(n.this).get()).uuX.start();
              AppMethodBeat.o(7740);
            }
          }
          else
          {
            ((WebViewUI)n.a(n.this).get()).uuX.finish();
            AppMethodBeat.o(7740);
          }
        }
      }
    });
    AppMethodBeat.o(7777);
    return true;
  }

  public final void W(Bundle paramBundle)
  {
    AppMethodBeat.i(7786);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7786);
    while (true)
    {
      return;
      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "IUIController, closeWindow");
      if (paramBundle != null)
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("result_data", paramBundle);
        ((WebViewUI)this.uqV.get()).setResult(-1, localIntent);
      }
      ((WebViewUI)this.uqV.get()).finish();
      AppMethodBeat.o(7786);
    }
  }

  public final void X(Bundle paramBundle)
  {
    AppMethodBeat.i(7795);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7795);
    while (true)
    {
      return;
      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "setCustomMenu");
      Object localObject = paramBundle.getStringArrayList("keys");
      ArrayList localArrayList = paramBundle.getStringArrayList("titles");
      int i = ((ArrayList)localObject).size();
      paramBundle = new ArrayList();
      for (int j = 0; j < i; j++)
        paramBundle.add(new d.b((String)((ArrayList)localObject).get(j), (String)localArrayList.get(j)));
      if (((ArrayList)localObject).size() > 0)
      {
        localObject = ((WebViewUI)this.uqV.get()).pzf.getUrl();
        if (((WebViewUI)this.uqV.get()).uwc.containsKey(localObject))
          ((WebViewUI)this.uqV.get()).uwc.remove(localObject);
        ((WebViewUI)this.uqV.get()).uwc.put(localObject, paramBundle);
      }
      AppMethodBeat.o(7795);
    }
  }

  public final boolean a(final com.tencent.mm.plugin.webview.stub.c paramc)
  {
    AppMethodBeat.i(7776);
    boolean bool;
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
    {
      bool = false;
      AppMethodBeat.o(7776);
    }
    while (true)
    {
      return bool;
      if ((((WebViewUI)this.uqV.get()).uvS.daP()) || (((WebViewUI)this.uqV.get()).uvT.daP()) || (((WebViewUI)this.uqV.get()).uvU.daP()) || (((WebViewUI)this.uqV.get()).uxl.cXH()))
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(7739);
            if ((n.a(n.this).get() == null) || (((WebViewUI)n.a(n.this).get()).isFinishing()))
              AppMethodBeat.o(7739);
            while (true)
            {
              return;
              ((WebViewUI)n.a(n.this).get()).b(paramc);
              AppMethodBeat.o(7739);
            }
          }
        });
      bool = true;
      AppMethodBeat.o(7776);
    }
  }

  public final boolean a(final String paramString1, final String paramString2, final Bundle paramBundle, final boolean paramBoolean)
  {
    AppMethodBeat.i(7778);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7778);
    while (true)
    {
      return false;
      if (((WebViewUI)this.uqV.get()).uhz != null)
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(7741);
            if ((n.a(n.this).get() == null) || (((WebViewUI)n.a(n.this).get()).isFinishing()))
              AppMethodBeat.o(7741);
            while (true)
            {
              return;
              ((WebViewUI)n.a(n.this).get()).uhz.a(paramString1, paramString2, com.tencent.mm.plugin.webview.ui.tools.jsapi.i.aq(paramBundle), paramBoolean);
              AppMethodBeat.o(7741);
            }
          }
        });
      AppMethodBeat.o(7778);
    }
  }

  public final void afd(String paramString)
  {
    int i = 0;
    AppMethodBeat.i(7787);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7787);
    while (true)
    {
      return;
      try
      {
        j = bo.getInt(paramString, 0);
        if (((WebViewUI)this.uqV.get()).pzf == null)
        {
          ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb fail, viewWV is null");
          AppMethodBeat.o(7787);
        }
      }
      catch (Exception paramString)
      {
        int j;
        while (true)
        {
          ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "setFontSizeCb, ex = " + paramString.getMessage());
          j = i;
        }
        al.d(new n.32(this, j));
        AppMethodBeat.o(7787);
      }
    }
  }

  public final boolean c(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7775);
    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "callback, actionCode = ".concat(String.valueOf(paramInt)));
    final WebViewUI localWebViewUI = (WebViewUI)this.uqV.get();
    boolean bool;
    if ((localWebViewUI == null) || (localWebViewUI.isFinishing()))
    {
      bool = false;
      AppMethodBeat.o(7775);
      return bool;
    }
    com.tencent.mm.plugin.webview.ui.tools.jsapi.d locald = localWebViewUI.uhz;
    Object localObject1 = localWebViewUI.icz;
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "undefine action code!!!");
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:
    case 34:
    case 35:
    case 36:
    case 37:
    case 38:
    case 39:
    case 40:
    case 41:
    case 42:
    case 43:
    case 44:
    case 45:
    case 46:
    case 1001:
    case 1002:
    case 1003:
    case 1008:
    case 1010:
    case 1011:
    case 1012:
    case 1007:
    case 1004:
    case 2011:
    case 2003:
    case 2100:
    case 13:
    case 2004:
    case 2005:
    case 2006:
    case 2010:
    case 2002:
    case 4007:
    case 2007:
    case 2008:
    case 2009:
    case 1006:
    case 15:
    case 16:
    case 17:
    case 18:
    case 47:
    case 40001:
    case 40002:
    case 60:
    case 61:
    case 62:
    case 119:
    case 120:
    case 121:
    case 122:
    case 123:
    case 124:
    case 125:
    case 126:
    case 127:
    case 128:
    case 130:
    case 133:
    case 134:
    case 135:
    case 136:
    case 137:
    case 138:
    case 142:
    case 143:
    case 144:
    case 145:
    case 147:
    case 148:
    case 149:
    case 150:
    case 100001:
    case 100002:
    case 200000:
    case 200001:
    case 200002:
    case 200003:
    case 80001:
    case 80002:
    case 48:
    case 90:
    case 71:
    case 72:
    case 70:
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(7775);
      break;
      if (!localWebViewUI.isFinishing())
      {
        localWebViewUI.finish();
        continue;
        al.d(new n.1(this, localWebViewUI, locald, (k)localObject1, paramBundle));
        continue;
        al.d(new n.12(this, localWebViewUI, locald, (k)localObject1, paramBundle));
        continue;
        al.d(new n.23(this, localWebViewUI, locald, (k)localObject1, paramBundle));
        continue;
        al.d(new n.34(this, localWebViewUI, locald, (k)localObject1, paramBundle));
        continue;
        al.d(new n.45(this, localWebViewUI, locald, (k)localObject1, paramBundle));
        continue;
        al.d(new n.53(this, localWebViewUI, locald, (k)localObject1, paramBundle));
        continue;
        long l = paramBundle.getLong("download_manager_downloadid");
        paramInt = paramBundle.getInt("download_manager_progress");
        al.d(new n.54(this, localWebViewUI, locald, (k)localObject1, paramBundle.getString("download_manager_appid", ""), l, paramInt));
        continue;
        al.d(new n.55(this, localWebViewUI, locald, (k)localObject1, paramBundle.getString("exdevice_device_id"), paramBundle.getInt("exdevice_on_state_change_state"), Boolean.valueOf(paramBundle.getBoolean("exdevice_inner_call"))));
        continue;
        al.d(new n.56(this, localWebViewUI, locald, paramBundle.getString("webview_jssdk_file_item_local_id"), paramBundle.getInt("webview_jssdk_file_item_progreess")));
        continue;
        al.d(new n.2(this, localWebViewUI, locald, paramBundle.getString("webview_jssdk_file_item_local_id"), paramBundle.getInt("webview_jssdk_file_item_progreess")));
        continue;
        al.d(new n.3(this, localWebViewUI, locald, paramBundle.getString("background_audio_state_player_state"), paramBundle.getInt("background_audio_state_player_duration"), paramBundle.getString("background_audio_state_player_src"), paramBundle.getInt("background_audio_state_player_err_code"), paramBundle.getString("background_audio_state_player_err_msg"), paramBundle.getString("background_audio_state_player_src_id")));
        continue;
        if (paramBundle != null)
        {
          paramBundle.putString("application_language", localWebViewUI.icy.getLanguage());
          localWebViewUI.uwe = WebViewUI.d.ad(paramBundle);
          continue;
          al.d(new n.4(this, localWebViewUI, locald, paramBundle.getString("webview_jssdk_file_item_local_id"), paramBundle.getInt("webview_jssdk_file_item_progreess")));
          continue;
          al.d(new n.5(this, localWebViewUI, locald, paramBundle.getString("webview_jssdk_file_item_local_id"), paramBundle.getInt("webview_jssdk_file_item_progreess")));
          continue;
          al.d(new n.6(this, localWebViewUI, locald, paramBundle.getString("webview_jssdk_file_item_local_id"), paramBundle.getInt("webview_jssdk_file_item_progreess")));
          continue;
          al.d(new n.7(this, localWebViewUI, locald, paramBundle.getString("webview_jssdk_file_item_local_id"), paramBundle.getInt("webview_jssdk_file_item_progreess")));
          continue;
          Object localObject2 = new HashMap();
          ((Map)localObject2).put("err_msg", paramBundle.getString("playResult"));
          ((Map)localObject2).put("localId", paramBundle.getString("localId"));
          al.d(new n.8(this, localWebViewUI, locald, (Map)localObject2));
          continue;
          al.d(new n.9(this, localWebViewUI, locald, paramBundle.getInt("nfc_key_on_touch_errcode", 0)));
          continue;
          al.d(new n.10(this, localWebViewUI));
          continue;
          localObject2 = new HashMap();
          ((Map)localObject2).put("localId", paramBundle.getString("localId"));
          ((Map)localObject2).put("err_msg", paramBundle.getString("recordResult"));
          al.d(new n.11(this, localWebViewUI, locald, (Map)localObject2));
          continue;
          al.d(new n.13(this, localWebViewUI));
          continue;
          if (locald != null)
          {
            al.d(new n.14(this, localWebViewUI, paramBundle, (k)localObject1, locald));
            continue;
            localObject2 = paramBundle.getString("exdevice_device_id");
            bool = paramBundle.getBoolean("exdevice_is_complete");
            al.d(new n.15(this, localWebViewUI, locald, (String)localObject2, paramBundle.getByteArray("exdevice_broadcast_data"), bool, paramBundle.getBoolean("exdevice_is_lan_device"), (k)localObject1));
            continue;
            localObject2 = paramBundle.getString("exdevice_device_id");
            localObject1 = paramBundle.getString("exdevice_brand_name");
            al.d(new n.16(this, localWebViewUI, locald, (String)localObject2, paramBundle.getByteArray("exdevice_data"), (String)localObject1));
            continue;
            al.d(new n.17(this, localWebViewUI, locald, paramBundle.getString("exdevice_device_id"), paramBundle.getBoolean("exdevice_is_bound")));
            continue;
            al.d(new n.18(this, localWebViewUI, locald, paramBundle.getBoolean("exdevice_bt_state")));
            continue;
            al.d(new n.19(this, localWebViewUI, locald, paramBundle.getBoolean("exdevice_lan_state")));
            continue;
            al.d(new n.20(this, localWebViewUI, locald, paramBundle.getString("err_msg")));
            continue;
            al.d(new n.21(this, localWebViewUI, locald, paramBundle.getString("uuid"), paramBundle.getInt("major"), paramBundle.getInt("minor"), paramBundle.getDouble("accuracy"), paramBundle.getDouble("rssi"), paramBundle.getFloat("heading")));
            continue;
            if ((localWebViewUI != null) && (!localWebViewUI.isFinishing()))
            {
              localWebViewUI.j(paramInt, paramBundle);
              continue;
              localWebViewUI.t(paramInt, paramBundle);
              continue;
              String[] arrayOfString1 = paramBundle.getStringArray("msgIds");
              String[] arrayOfString2 = paramBundle.getStringArray("contents");
              localObject1 = paramBundle.getStringArray("senders");
              localObject2 = paramBundle.getIntArray("msgTypes");
              int[] arrayOfInt = paramBundle.getIntArray("msgTimes");
              paramBundle = new JSONArray();
              if (arrayOfString1 == null)
                paramInt = 0;
              while (true)
              {
                int i = 0;
                label1897: if (i < paramInt)
                  try
                  {
                    JSONObject localJSONObject = new org/json/JSONObject;
                    localJSONObject.<init>();
                    localJSONObject.put("newMsgId", arrayOfString1[i]);
                    localJSONObject.put("content", arrayOfString2[i]);
                    localJSONObject.put("sender", localObject1[i]);
                    localJSONObject.put("msgType", localObject2[i]);
                    localJSONObject.put("msgTime", arrayOfInt[i]);
                    paramBundle.put(localJSONObject);
                    i++;
                    break label1897;
                    paramInt = arrayOfString1.length;
                  }
                  catch (JSONException localJSONException)
                  {
                    while (true)
                      ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "GetMsgProofItems exception " + localJSONException.getMessage());
                  }
              }
              al.d(new n.22(this, localWebViewUI, locald, paramBundle));
              continue;
              al.d(new n.24(this, localWebViewUI, locald, paramBundle.getString("webview_network_type")));
              continue;
              al.d(new n.25(this, localWebViewUI, paramBundle));
              continue;
              paramBundle = paramBundle.getString("service_click_tid");
              ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "on service click, update tid = %s", new Object[] { paramBundle });
              localWebViewUI.uwM = paramBundle;
              localWebViewUI.uwN = System.currentTimeMillis();
              al.d(new Runnable()
              {
                public final void run()
                {
                  AppMethodBeat.i(7738);
                  if ((localWebViewUI == null) || (localWebViewUI.isFinishing()))
                    AppMethodBeat.o(7738);
                  while (true)
                  {
                    return;
                    if (localWebViewUI.pzf != null)
                    {
                      com.tencent.mm.plugin.normsg.a.b.oTO.a(localWebViewUI.pzf, qg.class);
                      if (localWebViewUI.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("forceTrigger", false))
                      {
                        ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "on service click, test");
                        com.tencent.mm.sdk.b.a.xxA.m(new qg());
                      }
                    }
                    AppMethodBeat.o(7738);
                  }
                }
              });
            }
          }
        }
      }
    }
  }

  public final String cYY()
  {
    AppMethodBeat.i(7779);
    String str;
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
    {
      str = null;
      AppMethodBeat.o(7779);
    }
    while (true)
    {
      return str;
      str = ((WebViewUI)this.uqV.get()).cOG;
      AppMethodBeat.o(7779);
    }
  }

  public final String cYZ()
  {
    AppMethodBeat.i(7781);
    String str;
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
    {
      str = null;
      AppMethodBeat.o(7781);
    }
    while (true)
    {
      return str;
      str = ((WebViewUI)this.uqV.get()).getIntent().getStringExtra("srcUsername");
      AppMethodBeat.o(7781);
    }
  }

  public final int cZa()
  {
    AppMethodBeat.i(7782);
    int i;
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
    {
      i = 0;
      AppMethodBeat.o(7782);
    }
    while (true)
    {
      return i;
      i = ((WebViewUI)this.uqV.get()).cSQ;
      AppMethodBeat.o(7782);
    }
  }

  public final void cZb()
  {
    AppMethodBeat.i(7785);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7785);
    while (true)
    {
      return;
      if (((WebViewUI)this.uqV.get()).uhz != null)
        ((WebViewUI)this.uqV.get()).uhz.cZb();
      AppMethodBeat.o(7785);
    }
  }

  public final void cZc()
  {
    AppMethodBeat.i(7788);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7788);
    while (true)
    {
      return;
      if (((WebViewUI)this.uqV.get()).uhz != null)
        ((WebViewUI)this.uqV.get()).uhz.cZc();
      AppMethodBeat.o(7788);
    }
  }

  public final Bundle dj(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7798);
    paramString1 = com.tencent.mm.protocal.c.akC(null);
    AppMethodBeat.o(7798);
    return paramString1;
  }

  public final void e(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(7789);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7789);
    while (true)
    {
      return;
      ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "result: ".concat(String.valueOf(paramString2)));
      if ((((WebViewUI)this.uqV.get()).uwH.icE == null) || (paramString1 == null) || (!paramString1.equals(((WebViewUI)this.uqV.get()).uwH.icE.upr)))
      {
        AppMethodBeat.o(7789);
      }
      else
      {
        if (((WebViewUI)this.uqV.get()).uwH.icE != null)
          ((WebViewUI)this.uqV.get()).uwH.icE.cYK();
        ((WebViewUI)this.uqV.get()).uwH.icC = paramInt1;
        ((WebViewUI)this.uqV.get()).uwH.icD = paramInt2;
        if ((paramString2 == null) || (((WebViewUI)this.uqV.get()).icA == null))
        {
          AppMethodBeat.o(7789);
        }
        else
        {
          al.d(new n.33(this, paramString2));
          AppMethodBeat.o(7789);
        }
      }
    }
  }

  public final Bundle g(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7794);
    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "invokeAsResult, actionCode = ".concat(String.valueOf(paramInt)));
    Bundle localBundle = new Bundle();
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
    {
      AppMethodBeat.o(7794);
      return localBundle;
    }
    k localk = ((WebViewUI)this.uqV.get()).icz;
    Object localObject1;
    String str;
    boolean bool2;
    label1460: float f;
    switch (paramInt)
    {
    default:
      ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "undefine action code!!!");
    case 48:
    case 49:
    case 100000:
    case 4001:
    case 4002:
    case 4003:
    case 4004:
    case 4005:
    case 4008:
    case 18:
    case 77:
    case 33:
    case 146:
    case 22:
    case 25:
    case 99:
    case 5001:
    case 5002:
    case 5003:
    case 5004:
    case 5005:
    case 5006:
    case 5007:
    case 38:
    case 34:
    case 36:
    case 47:
    case 35:
    case 39:
    case 37:
    case 79:
    case 43:
    case 44:
    case 45:
    case 107:
    case 11:
    case 12:
    case 6001:
    case 71:
    case 72:
    case 73:
    case 53:
    case 90000:
      while (true)
      {
        AppMethodBeat.o(7794);
        break;
        ((WebViewUI)this.uqV.get()).uwD = true;
        continue;
        localObject1 = new com.tencent.mm.g.a.j();
        ((com.tencent.mm.g.a.j)localObject1).csb.context = ((WebViewUI)this.uqV.get()).mController.ylL;
        ((com.tencent.mm.g.a.j)localObject1).csb.actionCode = paramInt;
        if (4003 == paramInt)
        {
          paramBundle = paramBundle.getString("apdu");
          ((com.tencent.mm.g.a.j)localObject1).csb.csd = paramBundle;
        }
        while (true)
        {
          ((com.tencent.mm.g.a.j)localObject1).callback = new n.37(this, localBundle, (com.tencent.mm.g.a.j)localObject1);
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          break;
          if (4004 == paramInt)
          {
            str = paramBundle.getString("apdus");
            boolean bool1 = paramBundle.getBoolean("breakIfFail", true);
            bool2 = paramBundle.getBoolean("breakIfTrue", false);
            ((com.tencent.mm.g.a.j)localObject1).csb.csd = str;
            ((com.tencent.mm.g.a.j)localObject1).csb.cse = bool1;
            ((com.tencent.mm.g.a.j)localObject1).csb.csf = bool2;
          }
        }
        localBundle.putString("KPublisherId", ((WebViewUI)this.uqV.get()).cMm);
        paramBundle = getIntent();
        if (paramBundle != null)
        {
          paramInt = afH(getIntent().getStringExtra("geta8key_username"));
          localBundle.putString("preChatName", paramBundle.getStringExtra("preChatName"));
          localBundle.putInt("preMsgIndex", paramBundle.getIntExtra("preMsgIndex", 0));
          localBundle.putString("prePublishId", paramBundle.getStringExtra("prePublishId"));
          localBundle.putString("preUsername", paramBundle.getStringExtra("preUsername"));
          localBundle.putInt("getA8KeyScene", paramInt);
          localBundle.putString("referUrl", ((WebViewUI)this.uqV.get()).unr);
          localBundle.putString("url", ((WebViewUI)this.uqV.get()).dae());
          localBundle.putString("rawUrl", ((WebViewUI)this.uqV.get()).cOG);
          localBundle.putInt("preChatTYPE", getIntent().getIntExtra("preChatTYPE", 0));
          paramBundle = (WebViewUI)this.uqV.get();
          if (((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).FC(paramBundle.cWL()))
          {
            localBundle.putInt("_DATA_CENTER_ITEM_SHOW_TYPE", paramBundle.uvq);
            continue;
            localBundle.putString("KSessionId", ((WebViewUI)this.uqV.get()).cvF);
            localBundle.putString("KUserAgent", ((WebViewUI)this.uqV.get()).ium);
            localBundle.putBoolean("KReportPage", ((WebViewUI)this.uqV.get()).uvr);
            localBundle.putString("KUrl", ((WebViewUI)this.uqV.get()).dae());
            paramInt = afH(getIntent().getStringExtra("geta8key_username"));
            if ((paramInt == 7) || (paramInt == 56))
            {
              localBundle.putString("geta8key_username", getIntent().getStringExtra("geta8key_username"));
              continue;
              paramBundle = getIntent();
              if (paramBundle != null)
              {
                localBundle.putString("publishIdPrefix", paramBundle.getStringExtra("publishIdPrefix"));
                localBundle.putString("reportSessionId", paramBundle.getStringExtra("reportSessionId"));
                continue;
                paramBundle = paramBundle.getString("_url");
                if ((!bo.isNullOrNil(paramBundle)) && (((WebViewUI)this.uqV.get()).icz != null) && (localk != null))
                {
                  paramBundle = localk.aei(paramBundle);
                  if (paramBundle != null)
                  {
                    localBundle.putParcelable("_permission_wrapper", paramBundle);
                    continue;
                    localBundle.putInt("pay_channel", getIntent().getIntExtra("pay_channel", -1));
                    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "key value: pay channel(%d)", new Object[] { Integer.valueOf(getIntent().getIntExtra("pay_channel", -1)) });
                    continue;
                    localBundle.putInt("scene", getIntent().getIntExtra("scene", -1));
                    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "Key value: Scene(%d)", new Object[] { Integer.valueOf(getIntent().getIntExtra("scene", 0)) });
                    continue;
                    paramInt = getIntent().getIntExtra("geta8key_scene", 0);
                    localBundle.putInt("geta8key_scene", paramInt);
                    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "Key value: getA8KeyScene(%d)", new Object[] { Integer.valueOf(paramInt) });
                    continue;
                    if (((WebViewUI)this.uqV.get()).icy.isSDCardAvailable())
                    {
                      long l = bd.dpq();
                      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "availableSize = %d", new Object[] { Long.valueOf(l) });
                      if (l < 524288000L)
                      {
                        ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "available size not enough");
                        paramInt = FactoryProxyManager.getPlayManager().init(ah.getContext(), null);
                      }
                    }
                    while (true)
                    {
                      if (paramInt == 0)
                      {
                        if (((WebViewUI)this.uqV.get()).uwJ == null)
                        {
                          ((WebViewUI)this.uqV.get()).uwJ = new h((WebViewUI)this.uqV.get());
                          FactoryProxyManager.getPlayManager().setUtilsObject(((WebViewUI)this.uqV.get()).uwJ);
                        }
                        i = FactoryProxyManager.getPlayManager().getLocalServerPort();
                        ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "webview video init result = %d, local port = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
                        paramBundle = ((WebViewUI)this.uqV.get()).uwP;
                        if ((i <= 0) || (i > 65535))
                          ab.e("MicroMsg.WebViewResourceInterrupter", "err port = %d", new Object[] { Integer.valueOf(i) });
                        if (!paramBundle.umD.contains(Integer.valueOf(i)))
                          paramBundle.umD.add(Integer.valueOf(i));
                      }
                      localBundle.putInt("webview_video_proxy_init", paramInt);
                      break;
                      paramBundle = new File(com.tencent.mm.plugin.webview.a.ueu);
                      bool2 = true;
                      if (!paramBundle.exists())
                      {
                        bool2 = paramBundle.mkdirs();
                        ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "create proxy cache path : %s, %b", new Object[] { paramBundle.getAbsolutePath(), Boolean.valueOf(bool2) });
                      }
                      if (!bool2)
                        break label1460;
                      paramInt = FactoryProxyManager.getPlayManager().init(ah.getContext(), com.tencent.mm.plugin.webview.a.ueu);
                      FactoryProxyManager.getPlayManager().setMaxStorageSize(200L);
                      continue;
                      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "sdcard not available");
                      paramInt = FactoryProxyManager.getPlayManager().init(ah.getContext(), null);
                    }
                    localObject1 = paramBundle.getString("webview_video_proxy_cdn_urls");
                    str = paramBundle.getString("webview_video_proxy_fileId");
                    int j = paramBundle.getInt("webview_video_proxy_file_size");
                    int i = paramBundle.getInt("webview_video_proxy_file_duration");
                    paramInt = paramBundle.getInt("webview_video_proxy_file_type");
                    int k = FactoryProxyManager.getPlayManager().startPlay((String)localObject1, paramInt, str, j, i);
                    paramBundle = FactoryProxyManager.getPlayManager().buildPlayURLMp4(k);
                    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d, playDataId = %d, localUrl = %s", new Object[] { localObject1, str, Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramInt), Integer.valueOf(k), paramBundle });
                    localBundle.putInt("webview_video_proxy_play_data_id", k);
                    localBundle.putString("webview_video_proxy_local_url", paramBundle);
                    continue;
                    paramInt = paramBundle.getInt("webview_video_proxy_play_data_id");
                    ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "webview proxy stop play, play id = %d", new Object[] { Integer.valueOf(paramInt) });
                    if (paramInt > 0)
                    {
                      FactoryProxyManager.getPlayManager().stopPlay(paramInt);
                      continue;
                      paramInt = paramBundle.getInt("webview_video_proxy_play_state");
                      FactoryProxyManager.getPlayManager().setPlayerState(paramInt);
                      continue;
                      paramInt = paramBundle.getInt("webview_video_proxy_net_state");
                      FactoryProxyManager.getPlayManager().setNetWorkState(paramInt);
                      continue;
                      paramInt = paramBundle.getInt("webview_video_proxy_play_data_id");
                      i = paramBundle.getInt("webview_video_proxy_play_remain_time");
                      FactoryProxyManager.getPlayManager().setRemainTime(paramInt, i);
                      continue;
                      paramInt = paramBundle.getInt("webview_video_proxy_play_data_id");
                      i = paramBundle.getInt("webview_video_proxy_preload_duration");
                      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "playid = %d, duration = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
                      localBundle.putInt("webview_video_proxy_pre_load_result", FactoryProxyManager.getPlayManager().preLoad(paramInt, i));
                      continue;
                      if (paramBundle.getInt("webview_disable_bounce_scroll_top", 0) > 0)
                      {
                        al.d(new n.38(this));
                        continue;
                        al.d(new Runnable()
                        {
                          public final void run()
                          {
                            AppMethodBeat.i(7752);
                            if ((n.a(n.this).get() == null) || (((WebViewUI)n.a(n.this).get()).isFinishing()))
                              AppMethodBeat.o(7752);
                            while (true)
                            {
                              return;
                              ((WebViewUI)n.a(n.this).get()).daj();
                              AppMethodBeat.o(7752);
                            }
                          }
                        });
                        continue;
                        al.d(new n.40(this));
                        continue;
                        al.d(new n.41(this));
                        continue;
                        al.d(new n.42(this));
                        continue;
                        al.d(new n.43(this));
                        continue;
                        al.d(new n.44(this, paramBundle.getString("show_kb_placeholder"), paramBundle.getInt("show_kb_max_length")));
                        continue;
                        if ((this.uqV.get() != null) && (!((WebViewUI)this.uqV.get()).isFinishing()))
                        {
                          localBundle.putInt("height", ((WebViewUI)this.uqV.get()).cWF());
                          continue;
                          localObject1 = paramBundle.getString("set_page_title_text");
                          str = paramBundle.getString("set_page_title_color");
                          paramBundle = (WebViewUI)this.uqV.get();
                          if ((com.tencent.mm.compatible.util.d.iW(21)) && (paramBundle.dac()));
                          for (paramInt = -16777216; ; paramInt = paramBundle.getResources().getColor(2131689640))
                          {
                            g.bx(str, paramInt);
                            al.d(new n.46(this, (String)localObject1));
                            break;
                          }
                          str = paramBundle.getString("set_navigation_bar_buttons_text");
                          localObject1 = paramBundle.getString("set_navigation_bar_buttons_icon_data");
                          bool2 = paramBundle.getBoolean("set_navigation_bar_buttons_hide_right_button", false);
                          if (!bo.isNullOrNil((String)localObject1));
                          while (true)
                          {
                            try
                            {
                              localObject1 = g.afz((String)localObject1);
                              paramInt = g.bx(paramBundle.getString("set_navigation_bar_buttons_left_text_color"), -16777216);
                              al.d(new n.47(this, bool2, (Bitmap)localObject1, str, paramBundle.getBoolean("set_navigation_bar_buttons_need_click_event", false), (int)g.afy(paramBundle.getString("set_navigation_bar_buttons_text_color")), paramInt));
                            }
                            catch (Exception localException)
                            {
                              localObject1 = null;
                              ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "setNavigationBarButtons, decode base64 image, exception = %s", new Object[] { localException });
                              continue;
                            }
                            localObject1 = null;
                          }
                          al.d(new n.48(this, paramBundle));
                          continue;
                          if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
                          {
                            localBundle.putBoolean("isFullScreen", false);
                          }
                          else
                          {
                            localBundle.putBoolean("isFullScreen", ((WebViewUI)this.uqV.get()).uvf);
                            continue;
                            al.d(new n.49(this));
                            continue;
                            al.d(new n.50(this));
                            continue;
                            bool2 = paramBundle.getBoolean("clear_webview_cache_clear_cookie", false);
                            ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "includeCookie = %b", new Object[] { Boolean.valueOf(bool2) });
                            paramBundle = new Intent();
                            paramBundle.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
                            paramBundle.putExtra("tools_clean_webview_cache_ignore_cookie", bool2);
                            com.tencent.mm.cj.c.aZ(paramBundle);
                            continue;
                            if (paramBundle.getString("enterprise_action").equals("enterprise_get_context_bizchat"))
                            {
                              localBundle.putString("enterprise_context_biz", getIntent().getStringExtra("enterprise_biz_name"));
                              localBundle.putLong("enterprise_context_bizchatid", getIntent().getLongExtra("biz_chat_chat_id", -1L));
                              continue;
                              paramInt = g.bx(paramBundle.getString("key_set_bounce_background_color"), ((WebViewUI)this.uqV.get()).getResources().getColor(2131690677));
                              ((WebViewUI)this.uqV.get()).uwX.Jp(paramInt);
                              continue;
                              localObject1 = getIntent();
                              if (paramBundle != null)
                              {
                                paramInt = paramBundle.getInt("scene");
                                switch (paramInt)
                                {
                                default:
                                  ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "unknown expose scene: %d", new Object[] { Integer.valueOf(paramInt) });
                                  AppMethodBeat.o(7794);
                                  break;
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 37:
                                case 45:
                                  localBundle.putStringArrayList("proof", ((Intent)localObject1).getStringArrayListExtra("k_outside_expose_proof_item_list"));
                                case 35:
                                case 36:
                                case 38:
                                case 39:
                                case 33:
                                case 34:
                                case 51:
                                  while (true)
                                  {
                                    localBundle.putString("username", ((Intent)localObject1).getStringExtra("k_username"));
                                    break;
                                    localBundle.putString("newMsgId", String.valueOf(((Intent)localObject1).getLongExtra("k_expose_msg_id", 0L)));
                                    continue;
                                    if (!bo.isNullOrNil(((Intent)localObject1).getStringExtra("k_webview_img")))
                                    {
                                      str = ((Intent)localObject1).getStringExtra("k_webview_img");
                                      paramBundle = e.e(str, 0, (int)e.asZ(str));
                                      e.deleteFile(str);
                                      localBundle.putString("webviewImg", Base64.encodeToString(paramBundle, 0));
                                    }
                                    if (((Intent)localObject1).getStringExtra("k_webview_html") != null)
                                      localBundle.putString("webviewHtml", ((Intent)localObject1).getStringExtra("k_webview_html"));
                                    paramBundle = new StringBuilder();
                                    paramBundle.append("<exposecontent>");
                                    paramBundle.append("<weburl>");
                                    if (((Intent)localObject1).getStringExtra("k_expose_url") != null)
                                      paramBundle.append(((Intent)localObject1).getStringExtra("k_expose_url"));
                                    paramBundle.append("</weburl>");
                                    paramBundle.append("<firstJumpUrl>");
                                    if (((Intent)localObject1).getStringExtra("k_expose_url") != null)
                                      paramBundle.append(((Intent)localObject1).getStringExtra("k_expose_url"));
                                    paramBundle.append("</firstJumpUrl>");
                                    paramBundle.append("<webscence>");
                                    paramBundle.append(((Intent)localObject1).getIntExtra("k_expose_web_scene", 0));
                                    paramBundle.append("</webscence>");
                                    paramBundle.append("</exposecontent>");
                                    localBundle.putString("url", paramBundle.toString());
                                    continue;
                                    localBundle.putString("newMsgId", String.valueOf(((Intent)localObject1).getLongExtra("k_expose_msg_id", 0L)));
                                    localBundle.putStringArrayList("proof", ((Intent)localObject1).getStringArrayListExtra("k_outside_expose_proof_item_list"));
                                    localBundle.putInt("msgType", ((Intent)localObject1).getIntExtra("k_expose_msg_type", 0));
                                  }
                                  al.d(new n.51(this, paramBundle));
                                  continue;
                                  localBundle.putStringArray("webview_get_route_url_list", ((WebViewUI)this.uqV.get()).uwG.cYO());
                                  localBundle.putInt("webview_get_route_url_geta8key_scene", afH(getIntent().getStringExtra("geta8key_username")));
                                  localBundle.putString("geta8key_username", getIntent().getStringExtra("geta8key_username"));
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
    case 90001:
      paramBundle = ((WebViewUI)this.uqV.get()).dae();
      localObject1 = com.tencent.xweb.b.dTR().getCookie(paramBundle);
      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "url = %s, cookie = %s", new Object[] { paramBundle, localObject1 });
      localBundle.putString("cookie", (String)localObject1);
      f = com.tencent.mm.ca.a.dmO();
      if ((((WebViewUI)this.uqV.get()).pzf == null) || (((WebViewUI)this.uqV.get()).pzf.getWebCoreType() != WebView.d.ANb) || (!XWalkEnvironment.getUsingCustomContext()))
        break;
    case 81:
    case 101:
    case 90002:
    case 84:
    case 85:
    case 87:
    case 54:
    case 86:
    case 1009:
    case 95:
    case 97:
    case 90003:
    case 90004:
    case 90005:
    case 150:
    case 140:
    case 252:
    case 253:
    case 203:
    case 200:
    }
    for (paramBundle = Float.valueOf(((WebViewUI)this.uqV.get()).pzf.getResources().getDisplayMetrics().density); ; paramBundle = Float.valueOf(f))
    {
      localBundle.putFloat("density", paramBundle.floatValue());
      break;
      localBundle.putBoolean("from_shortcut", ((WebViewUI)this.uqV.get()).uvz);
      break;
      paramBundle.setClassLoader(WebViewUI.class.getClassLoader());
      com.tencent.mm.bp.d.b((Context)this.uqV.get(), paramBundle.getString("open_ui_with_webview_ui_plugin_name"), paramBundle.getString("open_ui_with_webview_ui_plugin_entry"), new Intent().putExtras(paramBundle.getBundle("open_ui_with_webview_ui_extras")).putExtra("KPublisherId", ((WebViewUI)this.uqV.get()).cMm));
      break;
      localObject1 = paramBundle.getString("traceid");
      paramBundle = paramBundle.getString("username");
      m.uuj.hg((String)localObject1, paramBundle);
      break;
      paramBundle = ((WebViewUI)this.uqV.get()).mController.getMMTitle();
      localObject1 = getCurrentUrl();
      localBundle.putString("webview_current_url", (String)localObject1);
      if (paramBundle != null);
      for (paramBundle = paramBundle.toString(); ; paramBundle = "")
      {
        localBundle.putString("webview_current_title", paramBundle);
        localBundle.putString("webview_current_desc", (String)localObject1);
        break;
      }
      paramBundle = ((WebViewUI)this.uqV.get()).mController.getMMTitle();
      str = getCurrentUrl();
      localObject1 = getIntent();
      if (localObject1 != null)
      {
        localBundle.putString("share_report_pre_msg_url", ((Intent)localObject1).getStringExtra("share_report_pre_msg_url"));
        localBundle.putString("share_report_pre_msg_title", ((Intent)localObject1).getStringExtra("share_report_pre_msg_title"));
        localBundle.putString("share_report_pre_msg_desc", ((Intent)localObject1).getStringExtra("share_report_pre_msg_desc"));
        localBundle.putString("share_report_pre_msg_icon_url", ((Intent)localObject1).getStringExtra("share_report_pre_msg_icon_url"));
        localBundle.putString("share_report_pre_msg_appid", ((Intent)localObject1).getStringExtra("share_report_pre_msg_appid"));
        localBundle.putInt("share_report_from_scene", ((Intent)localObject1).getIntExtra("share_report_from_scene", 0));
        localBundle.putString("share_report_biz_username", ((Intent)localObject1).getStringExtra("share_report_biz_username"));
      }
      localBundle.putString("share_report_current_url", str);
      if (paramBundle != null);
      for (paramBundle = paramBundle.toString(); ; paramBundle = "")
      {
        localBundle.putString("share_report_current_title", paramBundle);
        break;
      }
      if (((WebViewUI)this.uqV.get()).uwq)
      {
        localBundle.putString("result", "not_return");
        break;
      }
      localBundle.putString("full_url", bo.nullAsNil(((WebViewUI)this.uqV.get()).jUg));
      if ((((WebViewUI)this.uqV.get()).uws != null) && (((WebViewUI)this.uqV.get()).uws.size() != 0))
      {
        localBundle.putInt("set_cookie", 1);
        com.tencent.xweb.c.jx(ah.getContext());
        paramBundle = com.tencent.xweb.b.dTR();
        localObject1 = ((WebViewUI)this.uqV.get()).uws.keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          str = (String)((Iterator)localObject1).next();
          paramBundle.setCookie(bo.anB(((WebViewUI)this.uqV.get()).jUg), str + "=" + (String)((WebViewUI)this.uqV.get()).uws.get(str));
        }
        paramBundle.setCookie(bo.anB(((WebViewUI)this.uqV.get()).jUg), "httponly");
        com.tencent.xweb.c.dTT();
        com.tencent.xweb.c.sync();
        ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "cookies:%s", new Object[] { paramBundle.getCookie(bo.anB(((WebViewUI)this.uqV.get()).jUg)) });
        break;
      }
      localBundle.putInt("set_cookie", 0);
      break;
      bool2 = paramBundle.getBoolean("add_shortcut_status");
      if (((WebViewUI)this.uqV.get()).uhz == null)
        break;
      ((WebViewUI)this.uqV.get()).uhz.oa(bool2);
      break;
      localBundle.putBoolean("is_from_keep_top", getIntent().getBooleanExtra("is_from_keep_top", false));
      break;
      if (((WebViewUI)this.uqV.get()).uvh != null)
        ((WebViewUI)this.uqV.get()).uvh.disable();
      ((WebViewUI)this.uqV.get()).screenOrientation = paramBundle.getInt("screen_orientation", -1);
      if (((WebViewUI)this.uqV.get()).screenOrientation == 1001)
      {
        ((WebViewUI)this.uqV.get()).screenOrientation = 0;
        if (((WebViewUI)this.uqV.get()).uvh != null)
        {
          ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "OrientationListener, start listen orientation change");
          ((WebViewUI)this.uqV.get()).uvh.enable();
        }
      }
      while (true)
      {
        ((WebViewUI)this.uqV.get()).aBS();
        break;
        if (((WebViewUI)this.uqV.get()).screenOrientation == 1002)
        {
          ((WebViewUI)this.uqV.get()).screenOrientation = 1;
          if (((WebViewUI)this.uqV.get()).uvh != null)
          {
            ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "OrientationListener, start listen orientation change");
            ((WebViewUI)this.uqV.get()).uvh.enable();
          }
        }
      }
      ((WebViewUI)this.uqV.get()).ab(paramBundle);
      break;
      localBundle.putInt("web_page_count", WebViewUI.uwz);
      break;
      localBundle.putString("geta8key_data_req_url", ((WebViewUI)this.uqV.get()).cWL());
      localBundle.putString("geta8key_data_username", getIntent().getStringExtra("geta8key_username"));
      localBundle.putInt("geta8key_data_scene", afH(getIntent().getStringExtra("geta8key_username")));
      localBundle.putInt("geta8key_data_reason", 8);
      if (((WebViewUI)this.uqV.get()).pzf.getIsX5Kernel())
        localBundle.putInt("geta8key_data_flag", 1);
      while (true)
      {
        this.uqV.get();
        localBundle.putString("geta8key_data_net_type", aq.cXS());
        localBundle.putInt("geta8key_session_id", ((WebViewUI)this.uqV.get()).uvB);
        localBundle.putInt("webview_binder_id", ((WebViewUI)this.uqV.get()).hashCode());
        localBundle.putByteArray("k_a8key_cookie", ((WebViewUI)this.uqV.get()).uvD);
        localBundle.putString("geta8key_data_appid", getIntent().getStringExtra("geta8key_open_webview_appid"));
        break;
        localBundle.putInt("geta8key_data_flag", 0);
      }
      localObject1 = paramBundle.getString("geta8key_result_req_url");
      str = paramBundle.getString("geta8key_result_full_url");
      if (!bo.isNullOrNil(str))
      {
        JsapiPermissionWrapper localJsapiPermissionWrapper = new JsapiPermissionWrapper(paramBundle.getByteArray("geta8key_result_jsapi_perm_control_bytes"));
        Object localObject2 = new GeneralControlWrapper(paramBundle.getInt("geta8key_result_general_ctrl_b1"));
        localException.a(str.replaceFirst("http://", "https//"), localJsapiPermissionWrapper, (GeneralControlWrapper)localObject2);
        String[] arrayOfString = paramBundle.getStringArray("geta8key_result_http_header_key_list");
        paramBundle = paramBundle.getStringArray("geta8key_result_http_header_value_list");
        localObject2 = new HashMap();
        if ((arrayOfString != null) && (paramBundle != null) && (arrayOfString.length > 0) && (paramBundle.length > 0) && (arrayOfString.length == paramBundle.length))
          for (paramInt = 0; paramInt < arrayOfString.length; paramInt++)
            ((Map)localObject2).put(arrayOfString[paramInt], paramBundle[paramInt]);
        ((WebViewUI)this.uqV.get()).b((String)localObject1, str, (Map)localObject2);
        break;
      }
      ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "updatePageAuth fail fullUrl is null");
      break;
      paramBundle = paramBundle.getString(e.m.ygh, "");
      ((WebViewUI)this.uqV.get()).FY(paramBundle);
      break;
      localBundle.putString("full_url", ((WebViewUI)this.uqV.get()).jUg);
      localBundle.putString("raw_url", ((WebViewUI)this.uqV.get()).cOG);
      localBundle.putString("page_key", (((WebViewUI)this.uqV.get()).hashCode() & 0x7FFFFFFF) + "_" + (((WebViewUI)this.uqV.get()).cOG.hashCode() & 0x7FFFFFFF));
      if (!(this.uqV.get() instanceof GameWebViewUI))
        break;
      paramBundle = ((GameWebViewUI)this.uqV.get()).uDe;
      if (paramBundle == null)
        break;
      localBundle.putString("comm_js_version", com.tencent.mm.plugin.wepkg.c.dgk());
      localBundle.putString("wepkg_version", paramBundle.dgj());
      localBundle.putBoolean("is_used_wepkg", paramBundle.uVv);
      break;
      localBundle.putString("current_url", ((WebViewUI)this.uqV.get()).dae());
      localBundle.putString("raw_url", ((WebViewUI)this.uqV.get()).cOG);
      break;
      if (!(this.uqV.get() instanceof GameWebViewUI))
        break;
      paramBundle = (GameWebViewUI)this.uqV.get();
      paramBundle.mVc.uDQ = System.currentTimeMillis();
      paramBundle.mUN.eBQ = 1;
      break;
      if (!(this.uqV.get() instanceof GameWebViewUI))
        break;
      ((GameWebViewUI)this.uqV.get()).mVc.uDR = System.currentTimeMillis();
      break;
      ((WebViewUI)this.uqV.get()).uwI.cZK();
      break;
      localObject1 = new b.a();
      localBundle.putBoolean("success", ((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).a((Context)this.uqV.get(), paramBundle.getString("url"), paramBundle.getInt("item_show_type"), paramBundle.getInt("scene"), paramBundle.getInt("openType"), (b.a)localObject1));
      if ((((b.a)localObject1).success) || (((b.a)localObject1).message == null))
        break;
      localBundle.putString("desc", ((b.a)localObject1).message);
      break;
    }
  }

  public final String getCurrentUrl()
  {
    AppMethodBeat.i(7780);
    String str;
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
    {
      str = null;
      AppMethodBeat.o(7780);
    }
    while (true)
    {
      return str;
      str = ((WebViewUI)this.uqV.get()).dae();
      AppMethodBeat.o(7780);
    }
  }

  public final void hd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7791);
    al.d(new n.36(this, paramString1));
    AppMethodBeat.o(7791);
  }

  public final void he(String paramString1, String paramString2)
  {
    AppMethodBeat.i(7797);
    al.d(new n.52(this, paramString1, paramString2));
    AppMethodBeat.o(7797);
  }

  public final void nJ(boolean paramBoolean)
  {
    AppMethodBeat.i(7783);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7783);
    while (true)
    {
      return;
      boolean bool = ((WebViewUI)this.uqV.get()).getIntent().getBooleanExtra("forceHideShare", false);
      ab.d("MicroMsg.WebViewStubCallbackAIDLStub", "[cpan] setShareBtnVisible:%d visible:%b  forceHideShare:%b", new Object[] { Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool) });
      al.d(new n.30(this, bool, paramBoolean));
      AppMethodBeat.o(7783);
    }
  }

  public final void nK(boolean paramBoolean)
  {
    AppMethodBeat.i(7784);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7784);
    while (true)
    {
      return;
      al.d(new n.31(this, paramBoolean));
      AppMethodBeat.o(7784);
    }
  }

  public final void nL(boolean paramBoolean)
  {
    AppMethodBeat.i(7796);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7796);
    while (true)
    {
      return;
      ((WebViewUI)this.uqV.get()).nR(paramBoolean);
      AppMethodBeat.o(7796);
    }
  }

  public final void q(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(7790);
    if ((this.uqV.get() == null) || (((WebViewUI)this.uqV.get()).isFinishing()))
      AppMethodBeat.o(7790);
    while (true)
    {
      return;
      al.d(new n.35(this, paramInt, paramBundle));
      AppMethodBeat.o(7790);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n
 * JD-Core Version:    0.6.2
 */