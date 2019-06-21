package com.tencent.mm.plugin.card.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.card.ui.CardNewMsgUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.no;
import com.tencent.mm.protocal.protobuf.tm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

public final class b
{
  public static void a(MMActivity paramMMActivity, float paramFloat1, float paramFloat2, String paramString)
  {
    AppMethodBeat.i(88816);
    Intent localIntent = new Intent();
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kwebmap_slat", paramFloat1);
    localIntent.putExtra("kwebmap_lng", paramFloat2);
    localIntent.putExtra("Kwebmap_locaion", paramString);
    d.b(paramMMActivity, "location", ".ui.RedirectUI", localIntent);
    AppMethodBeat.o(88816);
  }

  public static void a(MMActivity paramMMActivity, int paramInt, MMActivity.a parama)
  {
    AppMethodBeat.i(88817);
    Intent localIntent = new Intent();
    localIntent.putExtra("select_is_ret", false);
    localIntent.putExtra("Select_Conv_Type", 3);
    d.a(paramMMActivity, ".ui.transmit.SelectConversationUI", localIntent, paramInt, parama);
    AppMethodBeat.o(88817);
  }

  public static void a(MMActivity paramMMActivity, int paramInt, String paramString, boolean paramBoolean, com.tencent.mm.plugin.card.base.b paramb)
  {
    AppMethodBeat.i(88819);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_from_scene", 3);
    localIntent.putExtra("key_expire_time", paramInt);
    localIntent.putExtra("key_begin_time", System.currentTimeMillis());
    localIntent.putExtra("key_card_tips", paramString);
    localIntent.putExtra("key_is_mark", paramBoolean);
    localIntent.putExtra("key_card_id", paramb.baa());
    localIntent.putExtra("key_user_card_id", paramb.aZZ());
    localIntent.putExtra("key_card_code", paramb.aZW().code);
    d.b(paramMMActivity, "offline", ".ui.WalletOfflineEntranceUI", localIntent);
    h.pYm.e(11850, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
    AppMethodBeat.o(88819);
  }

  public static void a(MMActivity paramMMActivity, String paramString)
  {
    AppMethodBeat.i(138537);
    a(paramMMActivity, paramString, 0);
    AppMethodBeat.o(138537);
  }

  public static void a(MMActivity paramMMActivity, String paramString, int paramInt)
  {
    AppMethodBeat.i(88815);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("stastic_scene", paramInt);
    d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(88815);
  }

  public static void a(MMActivity paramMMActivity, String paramString1, String paramString2)
  {
    AppMethodBeat.i(88814);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("stastic_scene", 0);
    localIntent.putExtra("rawUrl", paramString1);
    localIntent.putExtra("title", paramString2);
    d.b(paramMMActivity, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(88814);
  }

  public static void a(MMActivity paramMMActivity, boolean paramBoolean)
  {
    AppMethodBeat.i(88809);
    Intent localIntent = new Intent(paramMMActivity, CardNewMsgUI.class);
    localIntent.putExtra("from_menu", paramBoolean);
    paramMMActivity.startActivity(localIntent);
    ab.v("MicroMsg.CardActivityHelper", "start CardNewMsgUI");
    h.pYm.e(11324, new Object[] { "CardMsgCenterView", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), "" });
    AppMethodBeat.o(88809);
  }

  public static boolean a(String paramString, tm paramtm, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(88820);
    boolean bool;
    if (paramtm == null)
    {
      ab.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField is null");
      bool = false;
      AppMethodBeat.o(88820);
    }
    while (true)
    {
      return bool;
      bool = d(paramString, paramtm.vTL, paramtm.vTM, paramInt1, paramInt2);
      AppMethodBeat.o(88820);
    }
  }

  public static void ae(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88810);
    if (TextUtils.isEmpty(paramString))
    {
      ab.v("MicroMsg.CardActivityHelper", "username is null");
      AppMethodBeat.o(88810);
    }
    while (true)
    {
      return;
      if (paramContext == null)
      {
        ab.e("MicroMsg.CardActivityHelper", "context is null, err");
        AppMethodBeat.o(88810);
      }
      else
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("Contact_User", paramString);
        localIntent.putExtra("force_get_contact", true);
        d.b(paramContext, "profile", ".ui.ContactInfoUI", localIntent);
        AppMethodBeat.o(88810);
      }
    }
  }

  public static void af(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88811);
    if (TextUtils.isEmpty(paramString))
    {
      ab.v("MicroMsg.CardActivityHelper", "username is null");
      AppMethodBeat.o(88811);
    }
    while (true)
    {
      return;
      if (t.mY(paramString))
      {
        ag(paramContext, paramString);
        AppMethodBeat.o(88811);
      }
      else
      {
        ae(paramContext, paramString);
        AppMethodBeat.o(88811);
      }
    }
  }

  private static void ag(Context paramContext, String paramString)
  {
    AppMethodBeat.i(88812);
    if (TextUtils.isEmpty(paramString))
    {
      ab.v("MicroMsg.CardActivityHelper", "username is null");
      AppMethodBeat.o(88812);
    }
    while (true)
    {
      return;
      Intent localIntent = new Intent();
      localIntent.putExtra("Chat_User", paramString);
      localIntent.putExtra("finish_direct", true);
      d.f(paramContext, ".ui.chatting.ChattingUI", localIntent);
      AppMethodBeat.o(88812);
    }
  }

  public static void b(MMActivity paramMMActivity, String paramString)
  {
    AppMethodBeat.i(88818);
    Intent localIntent = new Intent();
    localIntent.putExtra("KEY_BRAND_NAME", paramString);
    d.b(paramMMActivity, "card", ".ui.CardShowWaringTransparentUI", localIntent);
    AppMethodBeat.o(88818);
  }

  public static boolean d(String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(88821);
    if (bo.isNullOrNil(paramString2))
    {
      ab.i("MicroMsg.CardActivityHelper", "gotoAppBrand commField.app_brand_user_name is null");
      AppMethodBeat.o(88821);
      return bool;
    }
    se localse = new se();
    localse.cOf.userName = paramString2;
    localse.cOf.cOh = bo.bc(paramString3, "");
    localse.cOf.cOi = paramInt2;
    if (paramInt1 == 26);
    for (localse.cOf.scene = 1029; ; localse.cOf.scene = 1028)
    {
      localse.cOf.cst = paramString1;
      localse.cOf.cOl = true;
      a.xxA.m(localse);
      ab.i("MicroMsg.CardActivityHelper", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d", new Object[] { localse.cOf.userName, localse.cOf.cOh, Integer.valueOf(localse.cOf.scene), Integer.valueOf(localse.cOf.cOi) });
      AppMethodBeat.o(88821);
      bool = true;
      break;
    }
  }

  public static void t(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(88822);
    se localse = new se();
    localse.cOf.userName = paramString1;
    localse.cOf.cOh = bo.bc(paramString2, "");
    if (paramInt > 0)
      localse.cOf.axy = paramInt;
    localse.cOf.scene = 1028;
    a.xxA.m(localse);
    AppMethodBeat.o(88822);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.d.b
 * JD-Core Version:    0.6.2
 */