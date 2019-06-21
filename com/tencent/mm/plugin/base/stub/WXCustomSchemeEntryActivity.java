package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gp;
import com.tencent.mm.model.r;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author=50, fComment="checked", lastDate="20141016", reviewer=50, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXCustomSchemeEntryActivity extends AutoLoginActivity
{
  private List<String> jDZ;

  private String aVm()
  {
    AppMethodBeat.i(18189);
    if (com.tencent.mm.compatible.util.d.iX(21));
    while (true)
    {
      try
      {
        Object localObject = Class.forName("android.app.Activity").getDeclaredField("mReferrer");
        ((Field)localObject).setAccessible(true);
        localObject = (String)((Field)localObject).get(this);
        AppMethodBeat.o(18189);
        return localObject;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.WXCustomSchemeEntryActivity", localException, "", new Object[0]);
        str = "No referrer";
        AppMethodBeat.o(18189);
        continue;
      }
      String str = "";
      AppMethodBeat.o(18189);
    }
  }

  public final boolean O(Intent paramIntent)
  {
    boolean bool = true;
    AppMethodBeat.i(18187);
    try
    {
      paramIntent = getIntent().getData();
      if (paramIntent != null)
        if (e.aim(paramIntent.toString()))
        {
          AppMethodBeat.o(18187);
          return bool;
        }
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        ab.e("MicroMsg.WXCustomSchemeEntryActivity", "get url from intent failed : %s", new Object[] { paramIntent.getMessage() });
        paramIntent = null;
        continue;
        String str1 = paramIntent.getScheme();
        String str2 = paramIntent.getHost();
        String str3 = paramIntent.getQuery();
        ab.i("MicroMsg.WXCustomSchemeEntryActivity", "uri is %s,scheme is %s, host is %s, query is %s", new Object[] { paramIntent.toString(), str1, str2, str3 });
        if ((!bo.isNullOrNil(str2)) && (this.jDZ.contains(str2)))
        {
          ab.i("MicroMsg.WXCustomSchemeEntryActivity", "match the host : %s", new Object[] { str2 });
          if (str2.equals("cardpackage"))
          {
            str1 = paramIntent.getQueryParameter("encrystr");
            ab.i("MicroMsg.WXCustomSchemeEntryActivity", "card encrypt value = %s", new Object[] { str1 });
            if ((!bo.isNullOrNil(str1)) && (str1.length() < 1024))
              AppMethodBeat.o(18187);
          }
          else if (str2.equals("connectToFreeWifi"))
          {
            if ((!bo.isNullOrNil(str3)) && (str3.startsWith("apKey=")) && (str3.length() > 6))
            {
              str3 = str3.substring(6);
              ab.i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", new Object[] { str3 });
              if ((!bo.isNullOrNil(str3)) && (str3.length() < 1024))
                AppMethodBeat.o(18187);
            }
            else if (paramIntent.toString().startsWith("weixin://connectToFreeWifi/friendWifi"))
            {
              AppMethodBeat.o(18187);
            }
          }
          else if ((str2.equals("wap")) && (paramIntent.toString().startsWith("weixin://wap/pay")))
          {
            ab.i("MicroMsg.WXCustomSchemeEntryActivity", "preLogin for WX_WAP_PAY");
            AppMethodBeat.o(18187);
          }
        }
        else
        {
          finish();
          AppMethodBeat.o(18187);
          bool = false;
        }
      }
    }
  }

  public final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    AppMethodBeat.i(18188);
    switch (WXCustomSchemeEntryActivity.5.jDI[parama.ordinal()])
    {
    default:
    case 1:
    }
    label933: label963: 
    while (true)
    {
      finish();
      AppMethodBeat.o(18188);
      return;
      label589: 
      try
      {
        localUri = getIntent().getData();
        if (localUri == null)
          continue;
        if (localUri != null)
        {
          i = 2;
          if (paramIntent != null)
            i = w.a(paramIntent, "translate_link_scene", 2);
          int j = w.a(paramIntent, "pay_channel", -1);
          ab.i("MicroMsg.WXCustomSchemeEntryActivity", "translateLinkScene = %d, payChannel = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          parama = null;
          if (j >= 0)
          {
            ab.i("MicroMsg.WXCustomSchemeEntryActivity", "doTicketsDeepLink put paychannel to extraData: %s", new Object[] { Integer.valueOf(j) });
            parama = new Bundle();
            parama.putInt("pay_channel", j);
          }
          str1 = aVm();
          ab.i("MicroMsg.WXCustomSchemeEntryActivity", "packageName %s", new Object[] { str1 });
          if (parama != null)
            break label1017;
          parama = new Bundle();
          parama.putString("pay_package", str1);
          if (!e.aim(localUri.toString()))
            break label589;
          if (!e.s(localUri))
            break label335;
          boolean bool = e.t(localUri);
          ab.i("MicroMsg.WXCustomSchemeEntryActivity", "isTicketLink uri:%s, %b", new Object[] { localUri.toString(), Boolean.valueOf(bool) });
          if (bool)
          {
            e.a(this, localUri.toString(), i, parama, new WXCustomSchemeEntryActivity.1(this));
            i = 1;
            if (i == 0)
              continue;
            AppMethodBeat.o(18188);
          }
        }
      }
      catch (Exception parama)
      {
        label335: label1015: label1017: 
        while (true)
        {
          int i;
          String str1;
          ab.e("MicroMsg.WXCustomSchemeEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
          Uri localUri = null;
          continue;
          e.a(this, localUri.toString(), i, parama, new WXCustomSchemeEntryActivity.2(this));
          while (true)
          {
            i = 0;
            break;
            String str2;
            if (e.ain(localUri.toString()))
            {
              if (i == 1)
              {
                localObject1 = v.Zp().nU("key_data_center_session_id");
                if (localObject1 == null)
                {
                  ab.e("MicroMsg.WXCustomSchemeEntryActivity", "null keyvalue for opensdk scene");
                  finish();
                  continue;
                }
                str1 = ((v.b)localObject1).getString("key_package_name", "");
                localObject1 = ((v.b)localObject1).getString("key_package_signature", "");
                str2 = paramIntent.getStringExtra("key_package_name");
                localObject2 = paramIntent.getStringExtra("key_package_signature");
                ab.i("MicroMsg.WXCustomSchemeEntryActivity", "pkg = %s, sig = %s, intentpkg = %s, intentsig = %s", new Object[] { str1, localObject1, str2, localObject2 });
                v.Zp().nV("key_data_center_session_id");
                if ((!str1.equals(str2)) || (!((String)localObject1).equals(localObject2)))
                {
                  ab.e("MicroMsg.WXCustomSchemeEntryActivity", "signature or package check failed");
                  finish();
                  continue;
                }
              }
              e.a(this, localUri.toString(), i, parama, new WXCustomSchemeEntryActivity.3(this), paramIntent.getStringExtra("key_package_name"), paramIntent.getStringExtra("key_package_signature"));
              i = 1;
              break;
            }
            parama = r.Yz();
            ab.i("MicroMsg.WXCustomSchemeEntryActivity", "not TicketLink uri:%s", new Object[] { localUri.toString() });
            e.a(this, localUri.toString(), parama, 23, localUri.toString(), new WXCustomSchemeEntryActivity.4(this));
            continue;
            Object localObject2 = localUri.getScheme();
            parama = localUri.getHost();
            Object localObject1 = localUri.getQuery();
            ab.i("MicroMsg.WXCustomSchemeEntryActivity", "scheme is %s, host is %s, query is %s", new Object[] { localObject2, parama, localObject1 });
            if ((!bo.isNullOrNil(parama)) && (this.jDZ.contains(parama)))
            {
              if ((parama.equals("cardpackage")) && (!bo.isNullOrNil(localUri.getQueryParameter("encrystr"))))
              {
                paramIntent.setClassName(this, "com.tencent.mm.ui.CheckSmsCanAddCardUI");
                startActivity(paramIntent);
              }
              if (parama.equals("connectToFreeWifi"))
              {
                if ((bo.isNullOrNil((String)localObject1)) || (!((String)localObject1).startsWith("apKey=")))
                  break label963;
                str2 = localUri.getQueryParameter("apKey");
                ab.i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", new Object[] { str2 });
                localObject2 = localUri.getQueryParameter("ticket");
                if ((!bo.isNullOrNil(str2)) && (str2.length() < 1024))
                {
                  paramIntent = new Intent();
                  paramIntent.putExtra("free_wifi_schema_uri", localUri.toString());
                  paramIntent.putExtra("free_wifi_ap_key", str2);
                  paramIntent.putExtra("free_wifi_source", 5);
                  paramIntent.putExtra("free_wifi_threeone_startup_type", 1);
                  if (!bo.isNullOrNil((String)localObject2))
                    paramIntent.putExtra("free_wifi_schema_ticket", (String)localObject2);
                  if ((!str2.startsWith("_")) && (!bo.isNullOrNil((String)localObject2)))
                    break label933;
                  paramIntent.addFlags(67108864);
                  com.tencent.mm.bp.d.b(this, "freewifi", ".ui.FreeWifiEntryUI", paramIntent);
                }
              }
              while (true)
              {
                if ((!parama.equals("wap")) || (!localUri.toString().startsWith("weixin://wap/pay")))
                  break label1015;
                ab.i("MicroMsg.WXCustomSchemeEntryActivity", "postLogin for WX_WAP_PAY packageNameFrommThird %s", new Object[] { str1 });
                if (TextUtils.isEmpty((CharSequence)localObject1))
                  break;
                h.a(this, com.tencent.mm.pluginsdk.e.a.aiw((String)localObject1), false, str1);
                break;
                localObject2 = new gp();
                ((gp)localObject2).cBm.intent = paramIntent;
                com.tencent.mm.sdk.b.a.xxA.m((b)localObject2);
                continue;
                if (localUri.toString().startsWith("weixin://connectToFreeWifi/friendWifi"))
                {
                  paramIntent = new Intent();
                  paramIntent.putExtra("key_connected_router", localUri.toString());
                  com.tencent.mm.bp.d.b(this, "exdevice", ".ui.ExdeviceConnectedRouterActivateStateUI", paramIntent);
                  ab.i("MicroMsg.WXCustomSchemeEntryActivity", "Jump to ExdeviceConnectedRouterUi.");
                }
              }
            }
          }
        }
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130968856;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18186);
    ab.i("MicroMsg.WXCustomSchemeEntryActivity", "onCreate");
    this.jDZ = new ArrayList();
    this.jDZ.add("cardpackage");
    this.jDZ.add("connectToFreeWifi");
    this.jDZ.add("wap");
    super.onCreate(paramBundle);
    setTitleVisibility(0);
    AppMethodBeat.o(18186);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCustomSchemeEntryActivity
 * JD-Core Version:    0.6.2
 */