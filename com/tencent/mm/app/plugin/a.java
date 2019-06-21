package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.pluginsdk.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.JSAPIUploadLogHelperUI;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.contact.VoipAddressUI;

public final class a
  implements com.tencent.mm.pluginsdk.r
{
  private boolean a(Context paramContext, String paramString, boolean paramBoolean, v paramv, Bundle paramBundle)
  {
    boolean bool = false;
    AppMethodBeat.i(15613);
    if (paramContext == null)
    {
      ab.e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal, context is null!");
      AppMethodBeat.o(15613);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (paramString == null)
      {
        ab.e("MicroMsg.MMURIJumpHandler", "jumpToUIInternal url is null");
        AppMethodBeat.o(15613);
        paramBoolean = bool;
      }
      else if (paramString.startsWith("weixin://openSpecificView/"))
      {
        paramBoolean = c(paramContext, paramString, new Object[0]);
        AppMethodBeat.o(15613);
      }
      else
      {
        paramBoolean = e.Cl().b(paramContext, paramString, paramBoolean, paramv, paramBundle);
        AppMethodBeat.o(15613);
      }
    }
  }

  private static void w(Context paramContext, String paramString)
  {
    AppMethodBeat.i(15614);
    paramString = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    paramString.addFlags(268435456);
    try
    {
      paramContext.startActivity(paramString);
      AppMethodBeat.o(15614);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.MMURIJumpHandler", "openLinkInBrowser fail:%s", new Object[] { paramContext.getMessage() });
        AppMethodBeat.o(15614);
      }
    }
  }

  public final boolean a(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(15609);
    paramBoolean = a(paramContext, paramString, paramBoolean, null);
    AppMethodBeat.o(15609);
    return paramBoolean;
  }

  public final boolean a(Context paramContext, String paramString, boolean paramBoolean, Bundle paramBundle)
  {
    AppMethodBeat.i(15611);
    paramBoolean = a(paramContext, paramString, paramBoolean, null, paramBundle);
    AppMethodBeat.o(15611);
    return paramBoolean;
  }

  public final boolean a(Context paramContext, String paramString, boolean paramBoolean, v paramv)
  {
    boolean bool = false;
    AppMethodBeat.i(15610);
    if (paramContext == null)
    {
      ab.e("MicroMsg.MMURIJumpHandler", "jumpToURLWithCallback, context is null!");
      AppMethodBeat.o(15610);
      paramBoolean = bool;
    }
    while (true)
    {
      return paramBoolean;
      if (paramString.startsWith("http"))
      {
        w(paramContext, paramString);
        AppMethodBeat.o(15610);
        paramBoolean = true;
      }
      else if (!b(paramContext, paramString, paramBoolean, paramv))
      {
        ab.w("MicroMsg.MMURIJumpHandler", "jumpToUI failed, uri:%s", new Object[] { paramString });
        AppMethodBeat.o(15610);
        paramBoolean = bool;
      }
      else
      {
        AppMethodBeat.o(15610);
        paramBoolean = bool;
      }
    }
  }

  public final boolean b(Context paramContext, String paramString, boolean paramBoolean, v paramv)
  {
    AppMethodBeat.i(15612);
    paramBoolean = a(paramContext, paramString, paramBoolean, paramv, null);
    AppMethodBeat.o(15612);
    return paramBoolean;
  }

  public final boolean c(Context paramContext, String paramString, Object[] paramArrayOfObject)
  {
    boolean bool = false;
    AppMethodBeat.i(15615);
    if (paramString == null)
    {
      ab.d("MicroMsg.MMURIJumpHandler", "openSpecificUI uri is null");
      AppMethodBeat.o(15615);
    }
    while (true)
    {
      return bool;
      if (paramContext != null)
        break;
      ab.e("MicroMsg.MMURIJumpHandler", "openSpecificUI, context is null");
      AppMethodBeat.o(15615);
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    String str1 = paramString.replace("weixin://openSpecificView/", "");
    String str2 = null;
    paramString = str2;
    if (paramArrayOfObject != null)
    {
      paramString = str2;
      if (paramArrayOfObject.length > 0)
        paramString = (Bundle)paramArrayOfObject[0];
    }
    if (str1.equalsIgnoreCase("contacts"))
    {
      localIntent.addFlags(67108864);
      localIntent.putExtra("preferred_tab", 2);
      paramContext.startActivity(localIntent.setClass(paramContext, LauncherUI.class));
    }
    while (true)
    {
      label140: AppMethodBeat.o(15615);
      bool = true;
      break;
      if (str1.equalsIgnoreCase("newfriend"))
      {
        d.b(paramContext, "subapp", ".ui.friend.FMessageConversationUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("addfriend"))
      {
        d.b(paramContext, "subapp", ".ui.pluginapp.AddMoreFriendsUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("searchbrand"))
      {
        paramString = new Intent();
        paramString.putExtra("Contact_Scene", 39);
        d.b(paramContext, "brandservice", ".ui.SearchOrRecommendBizUI", paramString);
      }
      else if (str1.equalsIgnoreCase("discover"))
      {
        localIntent.addFlags(67108864);
        localIntent.putExtra("preferred_tab", 1);
        paramContext.startActivity(localIntent.setClass(paramContext, LauncherUI.class));
      }
      else if (str1.equalsIgnoreCase("timeline"))
      {
        d.b(paramContext, "sns", ".ui.SnsTimeLineUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("scan"))
      {
        d.b(paramContext, "scanner", ".ui.BaseScanUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("myprofile"))
      {
        d.b(paramContext, "setting", ".ui.setting.SettingsPersonalInfoUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("myaccount"))
      {
        d.b(paramContext, "setting", ".ui.setting.SettingsAccountInfoUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("bindphone"))
      {
        MMWizardActivity.J(paramContext, localIntent.setClass(paramContext, BindMContactIntroUI.class));
      }
      else if (str1.equalsIgnoreCase("privacy"))
      {
        d.b(paramContext, "setting", ".ui.setting.SettingsPrivacyUI", localIntent);
      }
      else if (str1.equalsIgnoreCase("general"))
      {
        d.b(paramContext, "setting", ".ui.setting.SettingsAboutSystemUI", localIntent);
      }
      else
      {
        if (!str1.equalsIgnoreCase("invitevoip"))
          break label459;
        VoipAddressUI.hX(paramContext);
      }
    }
    label459: if (str1.equalsIgnoreCase("expose"))
      if (paramString == null)
        break label821;
    label800: label815: label821: for (paramString = paramString.getString("url"); ; paramString = "")
    {
      localIntent.putExtra("k_expose_url", paramString);
      localIntent.putExtra("k_username", com.tencent.mm.model.r.Yz());
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(34) }));
      d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      break label140;
      if (str1.equalsIgnoreCase("shakecard"))
        if (paramString == null)
          break label815;
      for (paramString = paramString.getString("extinfo"); ; paramString = "")
      {
        localIntent.putExtra("key_shake_card_from_scene", 3);
        localIntent.putExtra("shake_card", true);
        localIntent.putExtra("key_shake_card_ext_info", paramString);
        d.b(paramContext, "shake", ".ui.ShakeReportUI", localIntent);
        break label140;
        if (str1.equalsIgnoreCase("cardlistview"))
        {
          ab.i("MicroMsg.MMURIJumpHandler", "enter to cardhome");
          paramString = new ik();
          paramString.cDz.context = paramContext;
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
          break label140;
        }
        if (str1.equalsIgnoreCase("uploadlog"))
        {
          str2 = com.tencent.mm.model.r.Yz();
          paramArrayOfObject = str2;
          if (bo.isNullOrNil(str2))
            paramArrayOfObject = "weixin";
          if (paramString != null);
          while (true)
          {
            try
            {
              i = bo.getInt(paramString.getString("extinfo"), 0);
              if ((!aw.RK()) || (aw.QT()))
                break label800;
              bool = true;
              ab.i("MicroMsg.MMURIJumpHandler", "upload log from jsapi, before upload, is-login:%b, time:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
              paramString = new Intent(paramContext, JSAPIUploadLogHelperUI.class);
              paramString.putExtra("key_user", paramArrayOfObject);
              paramString.putExtra("key_time", i);
              paramContext.startActivity(paramString);
            }
            catch (Exception paramString)
            {
            }
            int i = 0;
            continue;
            bool = false;
          }
        }
        AppMethodBeat.o(15615);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.plugin.a
 * JD-Core Version:    0.6.2
 */