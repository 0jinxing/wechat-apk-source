package com.tencent.mm.plugin.shake.d.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.ui.TVInfoUI;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class k
{
  public static boolean Cz(int paramInt)
  {
    if ((7 == paramInt) || (6 == paramInt) || (8 == paramInt) || (9 == paramInt) || (10 == paramInt) || (12 == paramInt) || (13 == paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static void a(com.tencent.mm.plugin.shake.b.d paramd, Context paramContext)
  {
    AppMethodBeat.i(24652);
    new ak().postDelayed(new k.1(paramd, paramContext), 100L);
    AppMethodBeat.o(24652);
  }

  public static void a(com.tencent.mm.plugin.shake.b.d paramd, Context paramContext, boolean paramBoolean)
  {
    int i = 4;
    AppMethodBeat.i(24653);
    if (paramd == null)
    {
      AppMethodBeat.o(24653);
      return;
    }
    switch (paramd.field_type)
    {
    case 11:
    default:
    case 7:
    case 6:
    case 8:
    case 9:
    case 10:
    case 12:
    case 13:
    }
    while (true)
    {
      AppMethodBeat.o(24653);
      break;
      Object localObject1 = new Intent();
      i = 18;
      if (paramBoolean)
        i = 26;
      ((Intent)localObject1).putExtra("geta8key_scene", i);
      ((Intent)localObject1).putExtra("stastic_scene", 6);
      ((Intent)localObject1).putExtra("KAppId", "wxaf060266bfa9a35c");
      Object localObject2 = new Bundle();
      ((Bundle)localObject2).putString("jsapi_args_appid", "wxaf060266bfa9a35c");
      ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
      ((Intent)localObject1).putExtra("rawUrl", paramd.field_username);
      ((Intent)localObject1).putExtra("srcUsername", paramd.field_distance);
      com.tencent.mm.plugin.shake.a.gkE.i((Intent)localObject1, paramContext);
      AppMethodBeat.o(24653);
      break;
      localObject2 = paramd.field_username;
      aw.ZK();
      ad localad = c.XM().aoO((String)localObject2);
      if (localad != null)
      {
        localObject1 = new Intent();
        if ((com.tencent.mm.n.a.jh(localad.field_type)) && (localad.dsf()))
        {
          z.aeR().qP((String)localObject2);
          if (paramd.field_distance.equals("1"))
          {
            ((Intent)localObject1).putExtra("Chat_User", (String)localObject2);
            ((Intent)localObject1).putExtra("finish_direct", true);
            com.tencent.mm.plugin.shake.a.gkE.d((Intent)localObject1, paramContext);
            AppMethodBeat.o(24653);
            break;
          }
        }
        ((Intent)localObject1).putExtra("Contact_User", (String)localObject2);
        ((Intent)localObject1).putExtra("force_get_contact", true);
        com.tencent.mm.bp.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
        AppMethodBeat.o(24653);
        break;
        localObject1 = new Intent();
        ((Intent)localObject1).setClass(paramContext, TVInfoUI.class);
        ((Intent)localObject1).putExtra("key_TV_xml_bytes", paramd.field_lvbuffer);
        ((Intent)localObject1).putExtra("key_TV_come_from_shake", true);
        paramContext.startActivity((Intent)localObject1);
        AppMethodBeat.o(24653);
        break;
        localObject1 = new he();
        ((he)localObject1).cBW.actionCode = 11;
        ((he)localObject1).cBW.result = paramd.field_username;
        ((he)localObject1).cBW.context = paramContext;
        ((he)localObject1).callback = null;
        com.tencent.mm.sdk.b.a.xxA.a((b)localObject1, Looper.myLooper());
        AppMethodBeat.o(24653);
        break;
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_product_id", paramd.field_username);
        ((Intent)localObject1).putExtra("key_product_scene", 9);
        com.tencent.mm.bp.d.b(paramContext, "product", ".ui.MallProductUI", (Intent)localObject1);
        AppMethodBeat.o(24653);
        break;
        if (paramBoolean);
        while (true)
        {
          a(paramd.field_distance, paramd.field_username, i, paramContext);
          AppMethodBeat.o(24653);
          break;
          i = 3;
        }
        localObject1 = paramd.field_username;
        paramContext = paramd.field_reserved3;
        i = paramd.field_reserved2;
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.i("Micromsg.ShakeTVLogic", "gotoAppBrand commField.app_brand_user_name is null");
          AppMethodBeat.o(24653);
          break;
        }
        paramd = new se();
        paramd.cOf.userName = ((String)localObject1);
        paramd.cOf.cOh = bo.bc(paramContext, "");
        paramd.cOf.cOi = 0;
        paramd.cOf.scene = 1039;
        paramd.cOf.axy = i;
        com.tencent.mm.sdk.b.a.xxA.m(paramd);
        ab.i("Micromsg.ShakeTVLogic", "gotoAppBrand userName:%s, path:%s, scene:%d openType:%d version:%d", new Object[] { paramd.cOf.userName, paramd.cOf.cOh, Integer.valueOf(paramd.cOf.scene), Integer.valueOf(paramd.cOf.cOi), Integer.valueOf(paramd.cOf.axy) });
      }
    }
  }

  public static void a(String paramString1, String paramString2, int paramInt, Context paramContext)
  {
    AppMethodBeat.i(24655);
    if (!bo.isNullOrNil(paramString2))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addCategory("android.intent.category.BROWSABLE");
      localIntent.setData(Uri.parse(paramString2));
      int i = 16;
      if ((paramInt == 3) || (paramInt == 4))
        i = 17;
      localIntent.putExtra("translate_link_scene", i);
      paramContext.startActivity(localIntent);
      ab.i("Micromsg.ShakeTVLogic", "doShakeTvHistoryItemClick start tempsession open deeplink");
      h.pYm.e(12108, new Object[] { bo.nullAsNil(paramString1), Integer.valueOf(paramInt), Integer.valueOf(1) });
      AppMethodBeat.o(24655);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(24655);
    }
  }

  public static boolean cjQ()
  {
    boolean bool = true;
    AppMethodBeat.i(24654);
    if (ae.giq)
      AppMethodBeat.o(24654);
    while (true)
    {
      return bool;
      String str = g.Nu().getValue("ShowShakeTV");
      ab.d("Micromsg.ShakeTVLogic", "DynamicConfig Get ShowShakeTV: %s", new Object[] { str });
      if ((!bo.isNullOrNil(str)) && (str.equals("1")))
      {
        AppMethodBeat.o(24654);
      }
      else
      {
        AppMethodBeat.o(24654);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.k
 * JD-Core Version:    0.6.2
 */