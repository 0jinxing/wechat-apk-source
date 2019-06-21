package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.g.a.by;
import com.tencent.mm.g.a.hv;
import com.tencent.mm.g.a.hv.a;
import com.tencent.mm.g.a.ik;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.model.y;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.topstory.ui.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.protobuf.df;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.contact.s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class e
{
  private static boolean van;
  public static String vao;
  private static final Map<String, Long> vap;

  static
  {
    AppMethodBeat.i(11681);
    van = false;
    vao = "";
    HashMap localHashMap = new HashMap();
    vap = localHashMap;
    localHashMap.put("weixin://", Long.valueOf(0L));
    vap.put("weixin://dl/stickers", Long.valueOf(1L));
    vap.put("weixin://dl/games", Long.valueOf(2L));
    vap.put("weixin://dl/moments", Long.valueOf(4L));
    vap.put("weixin://dl/add", Long.valueOf(8L));
    vap.put("weixin://dl/shopping", Long.valueOf(16L));
    vap.put("weixin://dl/groupchat", Long.valueOf(32L));
    vap.put("weixin://dl/scan", Long.valueOf(64L));
    vap.put("weixin://dl/profile", Long.valueOf(128L));
    vap.put("weixin://dl/settings", Long.valueOf(256L));
    vap.put("weixin://dl/general", Long.valueOf(512L));
    vap.put("weixin://dl/help", Long.valueOf(1024L));
    vap.put("weixin://dl/notifications", Long.valueOf(2048L));
    vap.put("weixin://dl/terms", Long.valueOf(4096L));
    vap.put("weixin://dl/chat", Long.valueOf(8192L));
    vap.put("weixin://dl/features", Long.valueOf(16384L));
    vap.put("weixin://dl/clear", Long.valueOf(32768L));
    vap.put("weixin://dl/feedback", Long.valueOf(65536L));
    vap.put("weixin://dl/faq", Long.valueOf(131072L));
    vap.put("weixin://dl/recommendation", Long.valueOf(262144L));
    vap.put("weixin://dl/groups", Long.valueOf(524288L));
    vap.put("weixin://dl/tags", Long.valueOf(1048576L));
    vap.put("weixin://dl/officialaccounts", Long.valueOf(2097152L));
    vap.put("weixin://dl/posts", Long.valueOf(4194304L));
    vap.put("weixin://dl/favorites", Long.valueOf(8388608L));
    vap.put("weixin://dl/privacy", Long.valueOf(16777216L));
    vap.put("weixin://dl/security", Long.valueOf(33554432L));
    vap.put("weixin://dl/wallet", Long.valueOf(67108864L));
    vap.put("weixin://dl/businessPay", Long.valueOf(134217728L));
    vap.put("weixin://dl/businessPay/", Long.valueOf(134217728L));
    vap.put("weixin://dl/wechatout", Long.valueOf(268435456L));
    vap.put("weixin://dl/protection", Long.valueOf(1073741824L));
    vap.put("weixin://dl/card", Long.valueOf(2147483648L));
    vap.put("weixin://dl/about", Long.valueOf(1125899906842624L));
    vap.put("weixin://dl/blacklist", Long.valueOf(4294967296L));
    vap.put("weixin://dl/textsize", Long.valueOf(8589934592L));
    vap.put("weixin://dl/sight", Long.valueOf(17179869184L));
    vap.put("weixin://dl/languages", Long.valueOf(34359738368L));
    vap.put("weixin://dl/chathistory", Long.valueOf(68719476736L));
    vap.put("weixin://dl/bindqq", Long.valueOf(137438953472L));
    vap.put("weixin://dl/bindmobile", Long.valueOf(274877906944L));
    vap.put("weixin://dl/bindemail", Long.valueOf(549755813888L));
    vap.put("weixin://dl/securityassistant", Long.valueOf(1099511627776L));
    vap.put("weixin://dl/broadcastmessage", Long.valueOf(2199023255552L));
    vap.put("weixin://dl/setname", Long.valueOf(4398046511104L));
    vap.put("weixin://dl/myQRcode", Long.valueOf(8796093022208L));
    vap.put("weixin://dl/myaddress", Long.valueOf(17592186044416L));
    vap.put("weixin://dl/hidemoments", Long.valueOf(35184372088832L));
    vap.put("weixin://dl/blockmoments", Long.valueOf(70368744177664L));
    vap.put("weixin://dl/stickersetting", Long.valueOf(140737488355328L));
    vap.put("weixin://dl/log", Long.valueOf(281474976710656L));
    vap.put("weixin://dl/wechatoutcoupon", Long.valueOf(562949953421312L));
    vap.put("weixin://dl/wechatoutshare", Long.valueOf(18014398509481984L));
    vap.put("weixin://dl/personalemoticon", Long.valueOf(4503599627370496L));
    vap.put("weixin://dl/designeremoji", Long.valueOf(9007199254740992L));
    vap.put("weixin://dl/sightdraft", Long.valueOf(576460752303423488L));
    vap.put("weixin://dl/jumpWxa/", Long.valueOf(576460752303423489L));
    vap.put("weixin://dl/offlinepay/", Long.valueOf(576460752303423490L));
    AppMethodBeat.o(11681);
  }

  public static void A(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(11679);
    if (aip(paramString2))
    {
      AppMethodBeat.o(11679);
      return;
    }
    com.tencent.mm.ui.base.p localp = com.tencent.mm.ui.base.h.b(paramContext, "", true, null);
    int i = 6;
    int j = i;
    if (!bo.isNullOrNil(paramString1))
    {
      if (!t.kH(paramString1))
        break label80;
      j = 7;
    }
    while (true)
    {
      a(paramContext, paramString2, j, new e.4(localp, paramContext));
      AppMethodBeat.o(11679);
      break;
      label80: j = i;
      if (t.mZ(paramString1))
        j = 9;
    }
  }

  public static void a(Context paramContext, String paramString, int paramInt, Bundle paramBundle, e.a parama)
  {
    AppMethodBeat.i(11671);
    a(paramContext, paramString, paramInt, paramBundle, parama, null, null);
    AppMethodBeat.o(11671);
  }

  public static void a(Context paramContext, String paramString1, int paramInt, Bundle paramBundle, e.a parama, String paramString2, String paramString3)
  {
    AppMethodBeat.i(11669);
    LinkedList localLinkedList = new LinkedList();
    df localdf = new df();
    if ((!bo.isNullOrNil(paramString2)) && (!bo.isNullOrNil(paramString3)))
    {
      ab.i("MicroMsg.DeepLinkHelper", "package name = %s, package signature = %s", new Object[] { paramString2, paramString3 });
      localdf.kKO = paramString2;
      localdf.signature = paramString3;
      localLinkedList.add(localdf);
    }
    if (aip(paramString1))
      AppMethodBeat.o(11669);
    while (true)
    {
      return;
      paramString2 = new com.tencent.mm.modelsimple.z(paramString1, paramInt, localLinkedList);
      paramContext = new e.2(paramBundle, paramContext, paramInt, paramString1, parama);
      com.tencent.mm.kernel.g.Rg().a(1200, paramContext);
      com.tencent.mm.kernel.g.Rg().a(paramString2, 0);
      AppMethodBeat.o(11669);
    }
  }

  public static void a(Context paramContext, String paramString, int paramInt, e.a parama)
  {
    AppMethodBeat.i(11670);
    a(paramContext, paramString, paramInt, null, parama, null, null);
    AppMethodBeat.o(11670);
  }

  public static void a(Context paramContext, String paramString1, int paramInt, e.a parama, String paramString2, String paramString3)
  {
    AppMethodBeat.i(11668);
    a(paramContext, paramString1, paramInt, null, parama, paramString2, paramString3);
    AppMethodBeat.o(11668);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, e.a parama)
  {
    AppMethodBeat.i(11667);
    if (bo.isNullOrNil(paramString1))
    {
      paramString1 = paramString3;
      if (!aip(paramString1))
        break label33;
      AppMethodBeat.o(11667);
    }
    while (true)
    {
      return;
      break;
      label33: paramString3 = new com.tencent.mm.modelsimple.h(paramString1, paramString2, paramInt, 0, (int)System.currentTimeMillis(), new byte[0]);
      paramContext = new e.1(paramContext, paramInt, paramString2, paramString1, parama);
      com.tencent.mm.kernel.g.Rg().a(233, paramContext);
      com.tencent.mm.kernel.g.Rg().a(paramString3, 0);
      AppMethodBeat.o(11667);
    }
  }

  public static boolean a(Context paramContext, int paramInt, byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(11673);
    boolean bool = a(paramContext, paramString, 0, null, paramInt, paramArrayOfByte, null);
    AppMethodBeat.o(11673);
    return bool;
  }

  private static boolean a(Context paramContext, String paramString1, int paramInt1, Bundle paramBundle, int paramInt2, byte[] paramArrayOfByte, String paramString2)
  {
    AppMethodBeat.i(11675);
    Object localObject1 = air(paramString1);
    boolean bool;
    if (bo.isNullOrNil((String)localObject1))
    {
      bool = false;
      AppMethodBeat.o(11675);
      return bool;
    }
    long l;
    Object localObject2;
    if (vap.containsKey(localObject1))
    {
      l = ((Long)vap.get(localObject1)).longValue();
      ab.i("MicroMsg.DeepLinkHelper", "gotoUri, deepLinkMap contains uri, result = %d", new Object[] { Long.valueOf(l) });
      localObject2 = null;
      localObject1 = new Intent();
      ((Intent)localObject1).setFlags(268435456);
      if (l == 0L)
      {
        paramBundle = "com.tencent.mm.ui.LauncherUI";
        paramString2 = (String)localObject1;
        label120: if (bo.isNullOrNil(paramBundle))
          break label3600;
        paramString2.setClassName(ah.getContext(), paramBundle);
        if (paramContext == null)
          break label3559;
      }
    }
    while (true)
    {
      label1264: int i;
      try
      {
        String str2;
        String str3;
        String str5;
        Object localObject3;
        String str6;
        while (true)
        {
          paramContext.startActivity(paramString2);
          bool = true;
          AppMethodBeat.o(11675);
          break;
          if (l == 1L)
          {
            paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI";
            com.tencent.mm.plugin.report.service.h.pYm.e(12065, new Object[] { Integer.valueOf(7) });
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 2L)
          {
            ((Intent)localObject1).putExtra("from_deeplink", true);
            ((Intent)localObject1).putExtra("game_report_from_scene", 6);
            paramBundle = "com.tencent.mm.plugin.game.ui.GameCenterUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 4L)
          {
            if ((r.YK() & 0x8000) == 0);
            for (paramInt1 = 1; ; paramInt1 = 0)
            {
              paramBundle = (Bundle)localObject2;
              paramString2 = (String)localObject1;
              if (paramInt1 == 0)
                break;
              paramBundle = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI";
              ((Intent)localObject1).putExtra("sns_timeline_NeedFirstLoadint", true);
              paramString2 = (String)localObject1;
              break;
            }
          }
          if (l == 8L)
          {
            paramBundle = "com.tencent.mm.plugin.subapp.ui.pluginapp.AddMoreFriendsUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 16L)
          {
            paramString1 = new hv();
            com.tencent.mm.sdk.b.a.xxA.m(paramString1);
            paramString1 = paramString1.cCO.url;
            paramBundle = (Bundle)localObject2;
            paramString2 = (String)localObject1;
            if (bo.isNullOrNil(paramString1))
              break label120;
            ((Intent)localObject1).putExtra("rawUrl", paramString1);
            ((Intent)localObject1).putExtra("useJs", true);
            ((Intent)localObject1).putExtra("vertical_scroll", true);
            ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
            ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
            paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 32L)
          {
            ((Intent)localObject1).putExtra("titile", ah.getContext().getString(2131296484));
            ((Intent)localObject1).putExtra("list_type", 0);
            ((Intent)localObject1).putExtra("list_attr", s.C(new int[] { s.znG, 256, 512 }));
            paramBundle = "com.tencent.mm.ui.contact.SelectContactUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 64L)
          {
            paramBundle = "com.tencent.mm.plugin.scanner.ui.BaseScanUI";
            ((Intent)localObject1).putExtra("animation_pop_in", true);
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 128L)
          {
            paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 256L)
          {
            paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 512L)
          {
            paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 1024L)
          {
            ac(ah.getContext(), paramInt2);
            paramBundle = (Bundle)localObject2;
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 2048L)
          {
            paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 4096L)
          {
            ((Intent)localObject1).putExtra("title", ah.getContext().getResources().getString(2131302023));
            ((Intent)localObject1).putExtra("rawUrl", ah.getContext().getResources().getString(2131304189));
            ((Intent)localObject1).putExtra("showShare", false);
            ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
            ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
            paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 8192L)
          {
            paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 16384L)
          {
            paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPluginsUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l == 32768L)
          {
            paramBundle = "com.tencent.mm.plugin.clean.ui.CleanUI";
            paramString2 = (String)localObject1;
            break label120;
          }
          if (l != 65536L)
            break label1264;
          try
          {
            paramInt1 = paramString1.indexOf("?");
            if (paramInt1 <= 0)
              break label5529;
            paramString1 = paramString1.substring(paramInt1 + 1);
            com.tencent.mm.kernel.g.RN();
            paramInt1 = com.tencent.mm.kernel.a.QF();
            paramBundle = URLEncoder.encode(com.tencent.mm.protocal.d.DEVICE_NAME, "utf-8");
            paramString2 = new java/lang/StringBuilder;
            paramString2.<init>();
            String str1 = URLEncoder.encode(bo.dpA(), "utf-8");
            str2 = URLEncoder.encode(q.LK(), "utf-8");
            str3 = URLEncoder.encode(com.tencent.mm.protocal.d.vxi, "utf-8");
            String str4 = URLEncoder.encode(com.tencent.mm.protocal.d.vxj, "utf-8");
            str5 = URLEncoder.encode(com.tencent.mm.protocal.d.vxk, "utf-8");
            localObject3 = URLEncoder.encode(com.tencent.mm.kernel.a.Rb(), "utf-8");
            str6 = URLEncoder.encode(bo.gS(ah.getContext()), "utf-8");
            paramString2 = new java/lang/StringBuilder;
            paramString2.<init>("&uin=");
            paramBundle = paramString2.append(paramInt1).append("&deviceName=").append(paramBundle).append("&timeZone=").append(str1).append("&imei=").append(str2).append("&deviceBrand=").append(str3).append("&deviceModel=").append(str4).append("&ostype=").append(str5).append("&clientSeqID=").append((String)localObject3).append("&signature=").append(str6).append("&scene=");
            if (bo.isNullOrNil(paramString1));
            for (paramInt1 = 0; ; paramInt1 = 1)
            {
              paramBundle = paramInt1;
              paramString2 = new java/lang/StringBuilder;
              paramString2.<init>();
              paramString1 = "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=feedback/index" + "&version=" + com.tencent.mm.protocal.d.vxo + "&lang=" + aa.gw(ah.getContext()) + "&" + bo.nullAsNil(paramString1) + paramBundle;
              ((Intent)localObject1).putExtra("showShare", false);
              ((Intent)localObject1).putExtra("rawUrl", paramString1);
              ((Intent)localObject1).putExtra("neverGetA8Key", true);
              ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
              ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
              ((Intent)localObject1).putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
              ((Intent)localObject1).putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
              paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
              paramString2 = (String)localObject1;
              break;
            }
          }
          catch (UnsupportedEncodingException paramString1)
          {
            ab.e("MicroMsg.DeepLinkHelper", "[oneliang]UnsupportedEncodingException:%s", new Object[] { paramString1.getMessage() });
            paramBundle = (Bundle)localObject2;
            paramString2 = (String)localObject1;
          }
        }
        break label120;
        if (l == 131072L)
        {
          com.tencent.mm.kernel.g.RN();
          paramInt1 = com.tencent.mm.kernel.a.QF();
          i = bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(12304, null));
          paramString1 = ah.getContext().getString(2131303297, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(i) });
          ((Intent)localObject1).putExtra("showShare", false);
          ((Intent)localObject1).putExtra("rawUrl", paramString1);
          ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
          ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
          paramBundle = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 262144L)
        {
          paramBundle = "com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 524288L)
        {
          paramBundle = "com.tencent.mm.ui.contact.ChatroomContactUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 1048576L)
        {
          paramBundle = "com.tencent.mm.plugin.label.ui.ContactLabelManagerUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 2097152L)
        {
          paramBundle = "com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 268435456L)
        {
          ((Intent)localObject1).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bp.d.b(ah.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject1);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 4194304L)
        {
          ((Intent)localObject1).putExtra("sns_userName", (String)com.tencent.mm.kernel.g.RP().Ry().get(2, null));
          ((Intent)localObject1).addFlags(67108864);
          ((Intent)localObject1).putExtra("sns_adapter_type", 1);
          paramInt1 = bo.a((Integer)com.tencent.mm.kernel.g.RP().Ry().get(68389, null), 0);
          com.tencent.mm.kernel.g.RP().Ry().set(68389, Integer.valueOf(paramInt1 + 1));
          paramBundle = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 8388608L)
        {
          paramBundle = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 16777216L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 33554432L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 67108864L)
        {
          paramBundle = "com.tencent.mm.plugin.mall.ui.MallIndexUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 134217728L)
        {
          if ((paramContext != null) && (!bo.isNullOrNil(paramString1)) && (paramString1.startsWith("weixin://dl/businessPay")))
          {
            paramBundle = Uri.parse(paramString1);
            if (paramBundle == null)
              continue;
            paramString1 = paramBundle.getQueryParameter("reqkey");
            paramArrayOfByte = paramBundle.getQueryParameter("appid");
            if (!bo.isNullOrNil(paramString1))
            {
              paramBundle = new PayInfo();
              paramBundle.czZ = paramString1;
              paramBundle.appId = paramArrayOfByte;
              paramBundle.cIf = 36;
              paramBundle.mXg = false;
              paramString2 = new Intent();
              paramString2.putExtra("key_pay_info", paramBundle);
              if ((paramContext instanceof Activity))
              {
                paramString2.putExtra("key_context_hashcode", paramContext.hashCode());
                ab.i("MicroMsg.DeepLinkHelper", "startPay context %s %s", new Object[] { paramContext, Integer.valueOf(paramContext.hashCode()) });
              }
              if (r.YM())
              {
                com.tencent.mm.bp.d.b(paramContext, "wallet_payu", ".pay.ui.WalletPayUPayUI", paramString2, 1);
                paramBundle = (Bundle)localObject2;
                break label120;
              }
              com.tencent.mm.bp.d.b(paramContext, "wallet", ".pay.ui.WalletPayUI", paramString2, 1);
              paramBundle = (Bundle)localObject2;
              break label120;
            }
            ab.w("MicroMsg.DeepLinkHelper", "reqkey null");
          }
          paramString2 = null;
          paramBundle = (Bundle)localObject2;
          break label120;
          ab.w("MicroMsg.DeepLinkHelper", "payUri null");
          continue;
        }
        if (l == 1073741824L)
        {
          paramBundle = "com.tencent.mm.plugin.safedevice.ui.MySafeDeviceListUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 2147483648L)
        {
          ab.i("MicroMsg.DeepLinkHelper", "enter to cardhome");
          paramString1 = new ik();
          paramString1.cDz.context = paramContext;
          com.tencent.mm.sdk.b.a.xxA.m(paramString1);
          paramBundle = (Bundle)localObject2;
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 4294967296L)
        {
          ((Intent)localObject1).putExtra("filter_type", com.tencent.mm.model.z.nY(ah.getContext().getString(2131300423)).getType());
          ((Intent)localObject1).putExtra("titile", ah.getContext().getString(2131303224));
          ((Intent)localObject1).putExtra("list_attr", 32768);
          paramBundle = "com.tencent.mm.ui.contact.SelectSpecialContactUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 8589934592L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsFontUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 17179869184L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 34359738368L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsLanguageUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 68719476736L)
        {
          paramBundle = "com.tencent.mm.plugin.backup.backupmoveui.BackupUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 137438953472L)
        {
          ((Intent)localObject1).setClassName(ah.getContext(), "com.tencent.mm.plugin.account.bind.ui.BindQQUI");
          MMWizardActivity.J(paramContext, (Intent)localObject1);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 274877906944L)
        {
          ((Intent)localObject1).setClassName(ah.getContext(), "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
          MMWizardActivity.J(paramContext, (Intent)localObject1);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 549755813888L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 1099511627776L)
        {
          com.tencent.mm.bp.d.b(ah.getContext(), "profile", ".ui.ContactInfoUI", ((Intent)localObject1).putExtra("Contact_User", "qqsync"));
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 2199023255552L)
        {
          paramBundle = "com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 4398046511104L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 8796093022208L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 17592186044416L)
        {
          ((Intent)localObject1).putExtra("launch_from_webview", false);
          com.tencent.mm.bp.d.c(ah.getContext(), "address", ".ui.WalletSelectAddrUI", (Intent)localObject1);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 35184372088832L)
        {
          ((Intent)localObject1).putExtra("k_sns_tag_id", 4L);
          ((Intent)localObject1).putExtra("k_sns_from_settings_about_sns", 1);
          com.tencent.mm.bp.d.b(ah.getContext(), "sns", ".ui.SnsBlackDetailUI", (Intent)localObject1);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 70368744177664L)
        {
          ((Intent)localObject1).putExtra("k_sns_tag_id", 5L);
          ((Intent)localObject1).putExtra("k_sns_from_settings_about_sns", 2);
          ((Intent)localObject1).putExtra("k_tag_detail_sns_block_scene", 8);
          com.tencent.mm.bp.d.b(ah.getContext(), "sns", ".ui.SnsTagDetailUI", (Intent)localObject1);
          paramBundle = (Bundle)localObject2;
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 140737488355328L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.EmojiMineUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 281474976710656L)
        {
          paramContext = new by();
          paramContext.cvf.cvh = "//uplog";
          paramContext.cvf.context = ah.getContext();
          com.tencent.mm.sdk.b.a.xxA.m(paramContext);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 562949953421312L)
        {
          ((Intent)localObject1).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bp.d.b(ah.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject1);
          com.tencent.mm.bp.d.b(ah.getContext(), "ipcall", ".ui.IPCallShareCouponUI", (Intent)localObject1);
          bool = true;
          AppMethodBeat.o(11675);
          break;
        }
        if (l == 18014398509481984L)
        {
          ((Intent)localObject1).putExtra("IPCallAddressUI_KFrom", 1);
          com.tencent.mm.bp.d.b(ah.getContext(), "ipcall", ".ui.IPCallAddressUI", (Intent)localObject1);
          com.tencent.mm.bp.d.b(ah.getContext(), "ipcall", ".ui.IPCallShareCouponUI", (Intent)localObject1);
          com.tencent.mm.bp.d.b(ah.getContext(), "ipcall", ".ui.IPCallShareCouponCardUI", (Intent)localObject1);
          paramBundle = (Bundle)localObject2;
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 576460752303423488L)
        {
          ((Intent)localObject1).putExtra("IPCallAddressUI_KFrom", 1);
          ((Intent)localObject1).setClassName(ah.getContext(), "com.tencent.mm.plugin.sight.draft.ui.SightDraftUI");
          ah.getContext().startActivity((Intent)localObject1);
          paramBundle = (Bundle)localObject2;
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 1125899906842624L)
        {
          paramBundle = "com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 4503599627370496L)
        {
          ((Intent)localObject1).putExtra("emoji_tab", 1);
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI";
          com.tencent.mm.plugin.report.service.h.pYm.e(12065, new Object[] { Integer.valueOf(7) });
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 9007199254740992L)
        {
          paramBundle = "com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI";
          paramString2 = (String)localObject1;
          break label120;
        }
        if (l == 576460752303423489L)
        {
          paramString1 = Uri.parse(paramString1);
          str5 = paramString1.getQueryParameter("appid");
          localObject1 = paramString1.getQueryParameter("userName");
          str2 = paramString1.getQueryParameter("path");
          i = bo.getInt(bo.nullAsNil(paramString1.getQueryParameter("pathType")), 0);
          localObject2 = paramString1.getQueryParameter("invokeData");
          str3 = paramString1.getQueryParameter("runtimeSessionId");
          paramArrayOfByte = paramString1.getQueryParameter("runtimeTicket");
          str6 = paramString1.getQueryParameter("runtimeAppid");
          paramInt2 = 0;
          paramString1 = v.Zp().y("key_data_center_session_id", false);
          if (paramString1 != null)
            paramInt2 = ((Integer)paramString1.get("key_launch_miniprogram_type", Integer.valueOf(0))).intValue();
          ab.i("MicroMsg.DeepLinkHelper", "appid = %s, userName = %s, path = %s, translateLinkScene = %d, type = %d", new Object[] { str5, localObject1, str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          v.Zp().nV("key_data_center_session_id");
          localObject3 = new AppBrandStatObject();
          ((AppBrandStatObject)localObject3).cst = URLEncoder.encode(paramString2);
          if (paramInt1 == 2)
          {
            ((AppBrandStatObject)localObject3).scene = 1065;
            ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, (String)localObject1, null, paramInt2, 0, str2, (AppBrandStatObject)localObject3);
            bool = true;
            AppMethodBeat.o(11675);
            break;
          }
          if (paramInt1 == 1)
          {
            ab.d("MicroMsg.DeepLinkHelper", "pathType:%d invokeData:%s", new Object[] { Integer.valueOf(i), localObject2 });
            if ((i == 1) && (!bo.isNullOrNil((String)localObject2)))
            {
              paramString1 = "";
              try
              {
                paramBundle = new com/tencent/mm/aa/i;
                paramBundle.<init>((String)localObject2);
                paramBundle = paramBundle.optString("name");
                paramString1 = paramBundle;
                ab.i("MicroMsg.DeepLinkHelper", "runtimeSessionId:%s runtimeTicket:%s runtimeAppId:%s functionName:%s", new Object[] { str3, paramArrayOfByte, str6, paramString1 });
                ((AppBrandStatObject)localObject3).scene = 1111;
                ((AppBrandStatObject)localObject3).cst = (str6 + ":" + paramString1);
                ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, (String)localObject1, paramInt2, str2, (AppBrandStatObject)localObject3, str5, (String)localObject2);
              }
              catch (com.tencent.mm.aa.g paramBundle)
              {
                ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramBundle, "", new Object[0]);
                continue;
              }
            }
            ((AppBrandStatObject)localObject3).scene = 1069;
            ((AppBrandStatObject)localObject3).cst = str5;
            ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, (String)localObject1, null, paramInt2, 0, str2, (AppBrandStatObject)localObject3, str5);
            continue;
          }
          if (paramInt1 == 6)
          {
            ((AppBrandStatObject)localObject3).scene = 1007;
            ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, (String)localObject1, null, paramInt2, 0, str2, (AppBrandStatObject)localObject3);
            continue;
          }
          if (paramInt1 == 7)
          {
            ((AppBrandStatObject)localObject3).scene = 1008;
            ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, (String)localObject1, null, paramInt2, 0, str2, (AppBrandStatObject)localObject3);
            continue;
          }
          ((AppBrandStatObject)localObject3).scene = 1000;
          ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, (String)localObject1, null, 0, 0, str2, (AppBrandStatObject)localObject3);
          continue;
        }
        paramBundle = (Bundle)localObject2;
        paramString2 = (String)localObject1;
        if (l != 576460752303423490L)
          break label120;
        paramString1 = Uri.parse(paramString1).getQueryParameter("appid");
        paramBundle = new Intent();
        ab.d("MicroMsg.WalletManager", "start offline from sdk: %s", new Object[] { paramString1 });
        paramBundle.putExtra("key_from_scene", 8);
        paramBundle.putExtra("key_appid", paramString1);
        com.tencent.mm.bp.d.b(paramContext, "offline", ".ui.WalletOfflineEntranceUI", paramBundle, 0);
        paramBundle = (Bundle)localObject2;
        paramString2 = (String)localObject1;
        break label120;
        label3559: ah.getContext().startActivity(paramString2);
        com.tencent.mm.ui.base.b.K(ah.getContext(), paramString2);
        continue;
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
        continue;
      }
      label3600: bool = false;
      AppMethodBeat.o(11675);
      break;
      if (((String)localObject1).startsWith("weixin://dl/businessTempSession/"))
      {
        paramArrayOfByte = new Intent();
        paramArrayOfByte.setFlags(268435456);
        localObject2 = Uri.parse(paramString1);
        if (localObject2 == null)
        {
          ab.e("MicroMsg.DeepLinkHelper", "tempsession uri is null");
          bool = false;
          AppMethodBeat.o(11675);
          break;
        }
        localObject1 = ((Uri)localObject2).getQueryParameter("sessionFrom");
        paramString2 = ((Uri)localObject2).getQueryParameter("showtype");
        paramBundle = ((Uri)localObject2).getQueryParameter("username");
        if (!bo.isNullOrNil(paramBundle))
          break label5526;
        paramBundle = ((Uri)localObject2).getQueryParameter("userName");
      }
      label5526: 
      while (true)
      {
        while (true)
        {
          while (true)
          {
            while (true)
            {
              while (true)
              {
                if (bo.isNullOrNil(paramBundle))
                {
                  ab.e("MicroMsg.DeepLinkHelper", "tempsession user is null");
                  bool = false;
                  AppMethodBeat.o(11675);
                  break;
                }
                i = bo.getInt(bo.nullAsNil(((Uri)localObject2).getQueryParameter("scene")), 0);
                paramInt2 = paramInt1;
                if (i != 0)
                {
                  paramInt2 = paramInt1;
                  if (paramInt1 == 4)
                  {
                    ab.i("MicroMsg.DeepLinkHelper", "Jsapi assign scene to ".concat(String.valueOf(i)));
                    paramInt2 = i;
                  }
                }
                ab.i("MicroMsg.DeepLinkHelper", "tempsession jump, %s, %s, %s, %s, %s.", new Object[] { paramBundle, localObject1, Integer.valueOf(paramInt2), paramString1, paramString2 });
                paramArrayOfByte.setClassName(ah.getContext(), "com.tencent.mm.ui.chatting.ChattingUI");
                paramArrayOfByte.putExtra("Chat_User", paramBundle);
                paramArrayOfByte.putExtra("finish_direct", true);
                paramArrayOfByte.putExtra("key_is_temp_session", true);
                paramArrayOfByte.putExtra("key_temp_session_from", (String)localObject1);
                paramArrayOfByte.putExtra("key_temp_session_scene", paramInt2);
                paramArrayOfByte.putExtra("key_temp_session_show_type", bo.getInt(paramString2, 0));
                paramString1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramBundle);
                if ((paramString1 == null) || ((int)paramString1.ewQ <= 0))
                  ao.a.flu.a(paramBundle, "", new e.3(paramArrayOfByte, paramContext));
                while (true)
                {
                  bool = true;
                  AppMethodBeat.o(11675);
                  break;
                  paramContext.startActivity(paramArrayOfByte);
                }
                if ((!((String)localObject1).startsWith("weixin://dl/businessGame/detail/")) && (!((String)localObject1).startsWith("weixin://dl/businessGame/detail")))
                  break label4167;
                ab.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith GAME_DETAIL");
                paramArrayOfByte = Uri.parse(paramString1);
                paramString1 = null;
                paramBundle = new Intent();
                if (paramArrayOfByte != null)
                {
                  paramArrayOfByte = paramArrayOfByte.getQueryParameter("appid");
                  paramString1 = "com.tencent.mm.plugin.game.ui.GameDetailUI";
                  paramBundle.putExtra("game_app_id", paramArrayOfByte);
                  paramBundle.putExtra("game_report_from_scene", 6);
                }
                if (!bo.isNullOrNil(paramString1))
                {
                  paramBundle.setClassName(ah.getContext(), paramString1);
                  if (paramContext != null);
                  try
                  {
                    paramContext.startActivity(paramBundle);
                    while (true)
                    {
                      bool = true;
                      AppMethodBeat.o(11675);
                      break;
                      ah.getContext().startActivity(paramBundle);
                      com.tencent.mm.ui.base.b.K(ah.getContext(), paramBundle);
                    }
                  }
                  catch (Exception paramContext)
                  {
                    while (true)
                      ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
                  }
                }
              }
              bool = false;
              AppMethodBeat.o(11675);
              break;
              label4167: if ((!((String)localObject1).startsWith("weixin://dl/businessGame/library/")) && (!((String)localObject1).startsWith("weixin://dl/businessGame/library")))
                break label4308;
              ab.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith GAME_LIBRARY");
              paramString1 = new Intent();
              if (!bo.isNullOrNil("com.tencent.mm.plugin.game.ui.GameLibraryUI"))
              {
                paramString1.putExtra("game_report_from_scene", 6);
                paramString1.setClassName(ah.getContext(), "com.tencent.mm.plugin.game.ui.GameLibraryUI");
                if (paramContext != null);
                try
                {
                  paramContext.startActivity(paramString1);
                  while (true)
                  {
                    bool = true;
                    AppMethodBeat.o(11675);
                    break;
                    ah.getContext().startActivity(paramString1);
                    com.tencent.mm.ui.base.b.K(ah.getContext(), paramString1);
                  }
                }
                catch (Exception paramContext)
                {
                  while (true)
                    ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
                }
              }
            }
            bool = false;
            AppMethodBeat.o(11675);
            break;
            label4308: if ((!((String)localObject1).startsWith("weixin://dl/businessWebview/link/")) && (!((String)localObject1).startsWith("weixin://dl/businessWebview/link")))
              break label4787;
            ab.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith H5_LINK");
            paramString2 = Uri.parse(paramString1);
            localObject1 = new Intent();
            paramString1 = null;
            int j;
            if (paramString2 != null)
            {
              paramString1 = paramString2.getQueryParameter("url");
              i = bo.getInt(paramString2.getQueryParameter("type"), 0);
              localObject2 = bo.nullAsNil(paramString2.getQueryParameter("appid"));
              j = bo.getInt(bo.nullAsNil(paramString2.getQueryParameter("outer")), 0);
              ab.i("MicroMsg.DeepLinkHelper", "gotoUri, rawUrl = %s, appId:%s, translateLinkScene: %s, outer:%d", new Object[] { paramString1, localObject2, Integer.valueOf(paramInt1), Integer.valueOf(j) });
              paramString2 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
              ((Intent)localObject1).putExtra("rawUrl", paramString1);
              ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
              ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
              if (paramInt1 != 1)
                break label4682;
              if (j == 1)
              {
                ((Intent)localObject1).putExtra("geta8key_open_webview_appid", (String)localObject2);
                ((Intent)localObject1).putExtra("geta8key_scene", 53);
              }
              ((Intent)localObject1).putExtra("show_openapp_dialog", false);
              ((Intent)localObject1).putExtra("pay_channel", 40);
              com.tencent.mm.pluginsdk.wallet.i.Lt(39);
              label4547: if (i == 5)
              {
                ((Intent)localObject1).putExtra("webview_invoke_launch_app_when_back", true);
                ((Intent)localObject1).putExtra("webview_invoke_launch_app_ext_info_when_back", String.format("%s://opentypewebview?wx_internal_resptype=%d&ret=%d", new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(-2) }));
                ((Intent)localObject1).putExtra("KAppId", (String)localObject2);
              }
              ((Intent)localObject1).putExtra("transaction_for_openapi_openwebview", vao);
              paramString1 = paramString2;
              if (paramBundle != null)
              {
                ((Intent)localObject1).putExtras(paramBundle);
                paramString1 = paramString2;
              }
            }
            if (!bo.isNullOrNil(paramString1))
            {
              ((Intent)localObject1).setClassName(ah.getContext(), paramString1);
              if (paramContext != null);
              try
              {
                paramContext.startActivity((Intent)localObject1);
                while (true)
                {
                  bool = true;
                  AppMethodBeat.o(11675);
                  break;
                  label4682: if (paramInt1 != 2)
                    break label4547;
                  if (j == 1)
                  {
                    ((Intent)localObject1).putExtra("geta8key_open_webview_appid", (String)localObject2);
                    ((Intent)localObject1).putExtra("geta8key_scene", 52);
                  }
                  ((Intent)localObject1).putExtra("pay_channel", 39);
                  com.tencent.mm.pluginsdk.wallet.i.Lt(39);
                  break label4547;
                  ah.getContext().startActivity((Intent)localObject1);
                  com.tencent.mm.ui.base.b.K(ah.getContext(), (Intent)localObject1);
                }
              }
              catch (Exception paramContext)
              {
                while (true)
                  ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
              }
            }
          }
          bool = false;
          AppMethodBeat.o(11675);
          break;
          label4787: if (!((String)localObject1).startsWith("weixin://dl/openbusinesswebview/link/"))
            break label5145;
          ab.i("MicroMsg.DeepLinkHelper", "gotoUri, uri startsWith openbusinesswebview");
          paramString2 = Uri.parse(paramString1);
          localObject1 = new Intent();
          paramString1 = null;
          if (paramString2 != null)
          {
            paramString1 = paramString2.getQueryParameter("url");
            i = bo.getInt(paramString2.getQueryParameter("type"), 0);
            localObject2 = bo.nullAsNil(paramString2.getQueryParameter("appid"));
            ab.i("MicroMsg.DeepLinkHelper", "gotoUri, rawUrl = %s, appId:%s, translateLinkScene: %s", new Object[] { paramString1, localObject2, Integer.valueOf(paramInt1) });
            paramString2 = "com.tencent.mm.plugin.webview.ui.tools.WebViewUI";
            ((Intent)localObject1).putExtra("rawUrl", paramString1);
            ((Intent)localObject1).putExtra("geta8key_session_id", paramInt2);
            ((Intent)localObject1).putExtra("geta8key_cookie", paramArrayOfByte);
            ((Intent)localObject1).putExtra("geta8key_open_webview_appid", (String)localObject2);
            ((Intent)localObject1).putExtra("geta8key_scene", 57);
            ((Intent)localObject1).putExtra("show_openapp_dialog", false);
            ((Intent)localObject1).putExtra("webview_invoke_launch_app_when_back", true);
            ((Intent)localObject1).putExtra("webview_invoke_launch_app_ext_info_when_back", String.format("%s://openbusinesswebview?type=%d&ret=%d", new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(-2) }));
            ((Intent)localObject1).putExtra("KAppId", (String)localObject2);
            ((Intent)localObject1).putExtra("transaction_for_openapi_openwebview", vao);
            paramString1 = paramString2;
            if (paramBundle != null)
            {
              ((Intent)localObject1).putExtras(paramBundle);
              paramString1 = paramString2;
            }
          }
          if (!bo.isNullOrNil(paramString1))
          {
            ((Intent)localObject1).setClassName(ah.getContext(), paramString1);
            if (paramContext != null);
            try
            {
              paramContext.startActivity((Intent)localObject1);
              while (true)
              {
                bool = true;
                AppMethodBeat.o(11675);
                break;
                ah.getContext().startActivity((Intent)localObject1);
                com.tencent.mm.ui.base.b.K(ah.getContext(), (Intent)localObject1);
              }
            }
            catch (Exception paramContext)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.DeepLinkHelper", paramContext, "", new Object[] { "" });
            }
          }
        }
        bool = false;
        AppMethodBeat.o(11675);
        break;
        label5145: if ((((String)localObject1).startsWith("weixin://dl/jumpFakeWxa/")) || (((String)localObject1).startsWith("weixin://dl/openNativeView/")))
        {
          paramString1 = Uri.parse(paramString1);
          paramArrayOfByte = paramString1.getQueryParameter("appid");
          paramString2 = paramString1.getQueryParameter("businessType");
          paramBundle = null;
          paramString1 = null;
          paramInt2 = 0;
          localObject2 = v.Zp().y("key_data_center_session_id", false);
          if (localObject2 != null)
          {
            paramInt2 = ((Integer)((v.b)localObject2).get("key_launch_miniprogram_type", Integer.valueOf(0))).intValue();
            paramBundle = (String)((v.b)localObject2).get("key_launch_miniprogram_query_info", "");
            paramString1 = (String)((v.b)localObject2).get("key_open_business_view_ext_info", "");
          }
          ab.i("MicroMsg.DeepLinkHelper", "appid = %s, translateLinkScene = %d, type = %d", new Object[] { paramArrayOfByte, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
          v.Zp().nV("key_data_center_session_id");
          if (((String)localObject1).startsWith("weixin://dl/jumpFakeWxa/"))
          {
            if (paramInt1 == 1)
            {
              ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(paramContext, paramArrayOfByte, paramString2, paramBundle, paramInt2);
              bool = true;
              AppMethodBeat.o(11675);
              break;
            }
            bool = false;
            AppMethodBeat.o(11675);
            break;
          }
          paramContext = b.vaj;
          if (paramString2 != null);
          switch (paramString2.hashCode())
          {
          default:
            label5408: paramInt1 = 0;
          case -1919727738:
          case 554520581:
          }
          while (true)
          {
            if (paramInt1 == 0)
              break label5498;
            bool = true;
            AppMethodBeat.o(11675);
            break;
            if (!paramString2.equals("nativeEmergencyContact"))
              break label5408;
            a.f.b.j.p(paramString2, "businessType");
            com.tencent.mm.pluginsdk.ui.tools.i.c(paramString2, "testExtMsg", paramArrayOfByte, -3, "testErrMsg");
            paramInt1 = 1;
            continue;
            if (!paramString2.equals("nativeShareToHaokan"))
              break label5408;
            a.f.b.j.p(paramString2, "businessType");
            c.an(paramString2, paramArrayOfByte, paramString1);
            paramInt1 = 1;
          }
          label5498: van = true;
          bool = false;
          AppMethodBeat.o(11675);
          break;
        }
        bool = false;
        AppMethodBeat.o(11675);
        break;
      }
      label5529: paramString1 = "";
    }
  }

  public static boolean a(Context paramContext, String paramString1, int paramInt, Bundle paramBundle, String paramString2)
  {
    AppMethodBeat.i(11674);
    boolean bool = a(paramContext, paramString1, paramInt, paramBundle, (int)System.currentTimeMillis(), new byte[0], paramString2);
    AppMethodBeat.o(11674);
    return bool;
  }

  public static boolean aH(String paramString, long paramLong)
  {
    AppMethodBeat.i(11659);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = air(paramString);
      if (!vap.containsKey(paramString))
        break label86;
    }
    label86: for (long l = ((Long)vap.get(paramString)).longValue(); ; l = -1L)
    {
      if ((l != -1L) && ((l == 0L) || ((l & paramLong) == l)));
      for (boolean bool = true; ; bool = false)
      {
        AppMethodBeat.o(11659);
        return bool;
      }
    }
  }

  private static void ac(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(11677);
    String str;
    if ((!com.tencent.mm.sdk.platformtools.g.xyg) && (aa.dor().equals("zh_CN")))
      str = paramContext.getString(2131305626);
    while (true)
    {
      ab.d("MicroMsg.DeepLinkHelper", "using faq webpage");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("show_feedback", false);
      localIntent.putExtra("KShowFixToolsBtn", true);
      localIntent.putExtra("geta8key_session_id", paramInt);
      com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(11677);
      return;
      if (aa.dor().equals("zh_HK"))
        str = paramContext.getString(2131305627);
      else if (aa.dor().equals("zh_TW"))
        str = paramContext.getString(2131305628);
      else
        str = paramContext.getString(2131305629);
    }
  }

  public static boolean aim(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(11660);
    paramString = air(paramString);
    int i;
    if ((!vap.containsKey(paramString)) && (!ain(paramString)) && (!aio(paramString)))
    {
      if ((!bo.isNullOrNil(paramString)) && ((paramString.startsWith("weixin://dl/jumpFakeWxa/")) || (paramString.startsWith("weixin://dl/openNativeView/"))))
      {
        i = 1;
        if (i == 0)
          break label87;
      }
    }
    else
    {
      AppMethodBeat.o(11660);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label87: AppMethodBeat.o(11660);
    }
  }

  public static boolean ain(String paramString)
  {
    AppMethodBeat.i(11661);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (paramString.startsWith("weixin://dl/business")))
    {
      bool = true;
      AppMethodBeat.o(11661);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11661);
    }
  }

  public static boolean aio(String paramString)
  {
    AppMethodBeat.i(11662);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (paramString.startsWith("weixin://dl/openbusinesswebview")))
    {
      bool = true;
      AppMethodBeat.o(11662);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11662);
    }
  }

  private static boolean aip(String paramString)
  {
    AppMethodBeat.i(11666);
    boolean bool;
    if (((paramString.equals("weixin://dl/wechatout")) || (paramString.equals("weixin://dl/wechatoutcoupon")) || (paramString.equals("weixin://dl/wechatoutshare"))) && (!dgP()))
    {
      paramString = new Intent();
      paramString.setFlags(268435456);
      paramString.setClassName(ah.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
      paramString.putExtra("rawUrl", "https://support.weixin.qq.com/deeplink/noaccess#wechat_redirect");
      ah.getContext().startActivity(paramString);
      bool = true;
      AppMethodBeat.o(11666);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11666);
    }
  }

  public static boolean aiq(String paramString)
  {
    AppMethodBeat.i(11672);
    boolean bool = a(null, paramString, 0, null, (int)System.currentTimeMillis(), new byte[0], null);
    AppMethodBeat.o(11672);
    return bool;
  }

  private static String air(String paramString)
  {
    AppMethodBeat.i(11678);
    String str = null;
    if (!bo.isNullOrNil(paramString))
    {
      paramString = Uri.parse(paramString);
      str = paramString.getScheme() + "://" + paramString.getHost() + paramString.getPath();
    }
    AppMethodBeat.o(11678);
    return str;
  }

  public static void bu(Context paramContext, String paramString)
  {
    AppMethodBeat.i(11680);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url is null. finish");
      AppMethodBeat.o(11680);
    }
    while (true)
    {
      return;
      Object localObject;
      if (paramString.startsWith("weixin://dl/login/phone_view"))
      {
        localObject = Uri.parse(paramString);
        paramString = ((Uri)localObject).getQueryParameter("cc");
        localObject = ((Uri)localObject).getQueryParameter("num");
        ab.d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI cc:%s num:%s", new Object[] { paramString, localObject });
        Intent localIntent = new Intent();
        localIntent.putExtra("couttry_code", paramString);
        localIntent.putExtra("input_mobile_number", (String)localObject);
        localIntent.putExtra("from_deep_link", true);
        localIntent.putExtra("mobile_input_purpose", 1);
        localIntent.addFlags(268435456);
        com.tencent.mm.bp.d.b(paramContext, "account", ".ui.MobileInputUI", localIntent);
        AppMethodBeat.o(11680);
      }
      else if (paramString.startsWith("weixin://dl/login/common_view"))
      {
        localObject = Uri.parse(paramString).getQueryParameter("username");
        ab.d("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI  username:%s", new Object[] { localObject });
        paramString = new Intent();
        paramString.putExtra("login_username", (String)localObject);
        paramString.putExtra("from_deep_link", true);
        paramString.addFlags(268435456);
        com.tencent.mm.bp.d.b(paramContext, "account", ".ui.LoginUI", paramString);
        AppMethodBeat.o(11680);
      }
      else
      {
        ab.e("MicroMsg.DeepLinkHelper", "cpan gotoLoginUI url not Correct:%s", new Object[] { paramString });
        AppMethodBeat.o(11680);
      }
    }
  }

  private static boolean dgP()
  {
    boolean bool = false;
    AppMethodBeat.i(11665);
    if (com.tencent.mm.kernel.g.RK())
      if (com.tencent.mm.m.g.Nu().getInt("WCOEntranceSwitch", 0) > 0)
      {
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLB, Boolean.TRUE);
        bool = true;
        AppMethodBeat.o(11665);
      }
    while (true)
    {
      return bool;
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xLB, Boolean.FALSE);
      AppMethodBeat.o(11665);
      continue;
      AppMethodBeat.o(11665);
    }
  }

  public static void fC(Context paramContext)
  {
    AppMethodBeat.i(11676);
    ac(paramContext, (int)System.currentTimeMillis());
    AppMethodBeat.o(11676);
  }

  public static boolean s(Uri paramUri)
  {
    AppMethodBeat.i(11663);
    boolean bool;
    if (paramUri == null)
    {
      bool = false;
      AppMethodBeat.o(11663);
    }
    while (true)
    {
      return bool;
      if (!bo.isNullOrNil(paramUri.getQueryParameter("ticket")))
      {
        bool = true;
        AppMethodBeat.o(11663);
      }
      else
      {
        bool = t(paramUri);
        AppMethodBeat.o(11663);
      }
    }
  }

  public static boolean t(Uri paramUri)
  {
    boolean bool = false;
    AppMethodBeat.i(11664);
    if (paramUri == null)
      AppMethodBeat.o(11664);
    while (true)
    {
      return bool;
      if ((paramUri.toString().startsWith("weixin://dl/business/tempsession/")) || (paramUri.toString().startsWith("weixin://dl/businessTempSession/")))
      {
        bool = true;
        AppMethodBeat.o(11664);
      }
      else
      {
        AppMethodBeat.o(11664);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e
 * JD-Core Version:    0.6.2
 */