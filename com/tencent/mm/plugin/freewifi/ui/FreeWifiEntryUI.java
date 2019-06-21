package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.appbrand.service.f;
import com.tencent.mm.plugin.freewifi.g.c;
import com.tencent.mm.plugin.freewifi.i;
import com.tencent.mm.plugin.freewifi.i.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;

@a(3)
public class FreeWifiEntryUI extends Activity
{
  private boolean myf = true;

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(20954);
    super.onCreate(paramBundle);
    AppMethodBeat.o(20954);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(20956);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(20956);
      return;
    }
    ab.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 77:
    }
    while (true)
    {
      AppMethodBeat.o(20956);
      break;
      if ((paramArrayOfInt.length > 0) && (paramArrayOfInt[0] == -1))
      {
        this.myf = false;
        h.a(this, getString(2131301926), getString(2131301936), getString(2131300878), getString(2131297773), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(20952);
            FreeWifiEntryUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
            FreeWifiEntryUI.this.finish();
            AppMethodBeat.o(20952);
          }
        }
        , new FreeWifiEntryUI.3(this));
      }
    }
  }

  protected void onResume()
  {
    AppMethodBeat.i(20955);
    super.onResume();
    if (!aw.RK())
      finish();
    Object localObject1;
    int i;
    while (true)
    {
      finish();
      AppMethodBeat.o(20955);
      return;
      if (this.myf)
      {
        boolean bool = b.a(this, "android.permission.ACCESS_COARSE_LOCATION", 77, null, null);
        ab.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "summerper checkPermission checkLocation [%b]", new Object[] { Boolean.valueOf(bool) });
        if (!bool);
      }
      else if ((b.o(this, "android.permission.ACCESS_COARSE_LOCATION")) && (!com.tencent.mm.modelgeo.d.agA()))
      {
        h.a(this, getString(2131300421), getString(2131297061), getString(2131300878), getString(2131296868), false, new FreeWifiEntryUI.1(this), null);
      }
      localObject1 = getIntent();
      i = getIntent().getIntExtra("free_wifi_source", 1);
      ab.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "has notified, now scene is : %d", new Object[] { Integer.valueOf(i) });
      Object localObject2;
      switch (i)
      {
      default:
        break;
      case 1:
        if (1 != i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0))
          i.a.byn().ch("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
        m.d((Intent)localObject1, ((Intent)localObject1).getStringExtra("free_wifi_mid"));
        ((Intent)localObject1).setClass(this, FreeWifiNetCheckUI.class);
        startActivity((Intent)localObject1);
        super.overridePendingTransition(2131034265, 2131034262);
        break;
      case 3:
        ((Intent)localObject1).putExtra("free_wifi_auth_type", 2);
        ((Intent)localObject1).setClass(this, FreeWifiMIGNoAuthStateUI.class);
        startActivity((Intent)localObject1);
        break;
      case 2:
        localObject2 = j.byW().ML(com.tencent.mm.plugin.freewifi.model.d.byO());
        if (localObject2 == null)
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiEntryUI", "what the fuck, how could it be???");
        }
        else
        {
          ab.i("MicroMsg.FreeWifi.FreeWifiEntryUI", "banner click, freeWifiInfo.field_action:%d, field_showUrl:%s", new Object[] { Integer.valueOf(((c)localObject2).field_action), ((c)localObject2).field_showUrl });
          if ((((c)localObject2).field_action == 2) && (!bo.isNullOrNil(((c)localObject2).field_showUrl)))
          {
            ((f)g.K(f.class)).b(this, ((c)localObject2).field_showUrl, 1064, null);
          }
          else if ((((c)localObject2).field_action == 1) && (!bo.isNullOrNil(((c)localObject2).field_showUrl)))
          {
            Intent localIntent = new Intent();
            localObject1 = aa.g(getSharedPreferences(ah.doA(), 0));
            localIntent.putExtra("rawUrl", Uri.parse(((c)localObject2).field_showUrl).buildUpon().appendQueryParameter("lang", (String)localObject1).build().toString());
            localIntent.putExtra("show_bottom", false);
            com.tencent.mm.bp.d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
          }
          else
          {
            ((Intent)localObject1).setClass(this, FreeWifiAuthStateUI.class);
            startActivity((Intent)localObject1);
          }
        }
        break;
      case 5:
        if (1 != i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0))
          i.a.byn().ch("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
        localObject2 = ((Intent)localObject1).getStringExtra("free_wifi_ap_key");
        if (!m.isEmpty((String)localObject2))
        {
          getIntent().putExtra("free_wifi_channel_id", 1);
          if ("_p33beta".equalsIgnoreCase((String)localObject2))
          {
            m.U((Intent)localObject1);
            ((Intent)localObject1).putExtra("free_wifi_auth_type", 33);
            ((Intent)localObject1).putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 33);
            ((Intent)localObject1).putExtra("free_wifi_ssid", m.Mx("MicroMsg.FreeWifi.FreeWifiEntryUI"));
            ((Intent)localObject1).putExtra("free_wifi_url", (String)localObject2);
            ((Intent)localObject1).putExtra("free_wifi_ap_key", (String)localObject2);
            ((Intent)localObject1).putExtra("free_wifi_source", 5);
            ((Intent)localObject1).putExtra("free_wifi_channel_id", 1);
            ((Intent)localObject1).setClass(this, FreeWifiFrontPageUI.class);
            startActivity((Intent)localObject1);
            super.overridePendingTransition(2131034265, 2131034262);
          }
          else
          {
            if (!((String)localObject2).startsWith("_"))
              break label725;
            localObject2 = getString(2131300053);
            localObject1 = new Intent();
            ((Intent)localObject1).putExtra("free_wifi_error_ui_error_msg", (String)localObject2);
            ((Intent)localObject1).setClass(this, FreeWifiErrorUI.class);
            startActivity((Intent)localObject1);
            super.overridePendingTransition(2131034265, 2131034262);
          }
        }
        break;
      case 4:
      case 6:
      }
    }
    label725: int j = ((Intent)localObject1).getIntExtra("free_wifi_threeone_startup_type", 0);
    if (2 == j)
      i = 11;
    while (true)
    {
      ((Intent)localObject1).putExtra("free_wifi_channel_id", i);
      ((Intent)localObject1).putExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 31);
      m.d((Intent)localObject1, ((Intent)localObject1).getStringExtra("free_wifi_schema_ticket"));
      if (j == 4)
        ((Intent)localObject1).putExtra("ConstantsFreeWifi.FREE_WIFI_REPORT_WIFI_SERVER_ID", m.V((Intent)localObject1) + "_" + m.X((Intent)localObject1) + "_" + m.Y((Intent)localObject1) + "_" + System.currentTimeMillis());
      ((Intent)localObject1).setClass(this, FreeWifiNetCheckUI.class);
      startActivity((Intent)localObject1);
      super.overridePendingTransition(2131034265, 2131034262);
      break;
      if (3 == j)
      {
        i = 12;
      }
      else
      {
        if (4 == j)
        {
          i = 13;
          continue;
          if (1 != i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0))
            i.a.byn().ch("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
          ((Intent)localObject1).setClass(this, FreeWifiNetCheckUI.class);
          startActivity((Intent)localObject1);
          super.overridePendingTransition(2131034265, 2131034262);
          break;
          if (1 != i.a.byn().getInt("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 0))
            i.a.byn().ch("LOCAL_CONFIG_FEATURES_DEFINE_ONCE_USE_WECHAT_FREEWIFI", 1);
          ((Intent)localObject1).setClass(this, FreeWifiNetCheckUI.class);
          startActivity((Intent)localObject1);
          super.overridePendingTransition(2131034265, 2131034262);
          break;
        }
        i = 1;
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiEntryUI
 * JD-Core Version:    0.6.2
 */