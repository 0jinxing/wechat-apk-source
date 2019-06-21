package com.tencent.mm.plugin.game.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.luggage.GameFloatLayerInfo;
import com.tencent.mm.plugin.game.luggage.GameWebViewLaunchParams;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public final class l
{
  public static String a(String paramString, n paramn)
  {
    AppMethodBeat.i(111278);
    Object localObject = paramString;
    String str;
    if (paramn != null)
    {
      paramn.bEl();
      str = paramString;
      if (!bo.isNullOrNil(paramn.mWG.url))
      {
        cb(paramn.mWG.mXh);
        str = ey(paramString, "h5FloatLayer=1");
        ab.i("MicroMsg.GameEntranceChecker", "after checking float, url = %s", new Object[] { str });
      }
      localObject = str;
      if (!bo.isNullOrNil(paramn.mWX.mXi))
        cb(paramn.mWX.mXh);
    }
    try
    {
      paramString = new java/lang/StringBuilder;
      paramString.<init>("h5BannerId=");
      paramString = ey(str, com.tencent.mm.compatible.util.q.encode(paramn.mWX.mXi, "UTF-8"));
      str = paramString;
      label123: ab.i("MicroMsg.GameEntranceChecker", "after checking banner, url = %s", new Object[] { str });
      localObject = str;
      AppMethodBeat.o(111278);
      return localObject;
    }
    catch (UnsupportedEncodingException paramString)
    {
      break label123;
    }
  }

  public static void a(Activity paramActivity, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(111273);
    if ((bo.isNullOrNil(paramString)) || (paramIntent == null))
      AppMethodBeat.o(111273);
    while (true)
    {
      return;
      boolean bool = paramIntent.getBooleanExtra("from_find_more_friend", false);
      int i = paramIntent.getIntExtra("game_report_from_scene", 0);
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      n localn1 = q.bEo();
      n localn2 = localn1;
      if (localn1 == null)
      {
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        localn2 = q.bEs();
      }
      paramIntent.putExtra("rawUrl", a(paramString, localn2));
      if (bool)
      {
        a(paramActivity, paramIntent, "game_center_entrance", true, localn2, i);
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        q.bEt();
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        q.bEn();
        AppMethodBeat.o(111273);
      }
      else
      {
        a(paramActivity, paramIntent, "game_center_entrance", false, localn2, i);
        AppMethodBeat.o(111273);
      }
    }
  }

  private static void a(Context paramContext, Intent paramIntent, String paramString, boolean paramBoolean, n paramn, int paramInt)
  {
    AppMethodBeat.i(111276);
    paramIntent.putExtra("geta8key_scene", 32);
    paramIntent.putExtra("KPublisherId", paramString);
    paramIntent.putExtra("game_check_float", paramBoolean);
    if ((paramBoolean) && (paramn != null))
    {
      paramn.bEl();
      if (paramn.mWG.mXg)
        paramIntent.putExtra("game_transparent_float_url", paramn.mWG.url);
      paramIntent.putExtra("game_sourceScene", paramInt);
      paramIntent.putExtra("game_float_layer_url", paramn.mWG.url);
    }
    com.tencent.mm.plugin.game.f.c.w(paramIntent, paramContext);
    AppMethodBeat.o(111276);
  }

  public static void a(n paramn, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111275);
    n localn = paramn;
    if (paramn == null)
    {
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      paramn = q.bEo();
      localn = paramn;
      if (paramn == null)
      {
        AppMethodBeat.o(111275);
        return;
      }
    }
    localn.bEl();
    ab.i("MicroMsg.GameEntranceChecker", "float layer report");
    if (!bo.isNullOrNil(localn.mWG.url))
    {
      int i = localn.field_msgType;
      if (localn.field_msgType == 100)
        i = localn.mXb;
      com.tencent.mm.plugin.game.e.b.a(ah.getContext(), 10, 1006, 1, 1, 0, localn.field_appId, paramInt1, i, localn.field_gameMsgId, localn.mXc, null);
      if (paramInt2 != 1)
        break label187;
      h.pYm.a(858L, 16L, 1L, false);
    }
    while (true)
    {
      localn.field_isRead = true;
      ((com.tencent.mm.plugin.game.a.c)g.K(com.tencent.mm.plugin.game.a.c.class)).bCY().c(localn, new String[0]);
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      q.bEp();
      AppMethodBeat.o(111275);
      break;
      label187: if (paramInt2 == 2)
        h.pYm.a(858L, 17L, 1L, false);
    }
  }

  public static void b(Activity paramActivity, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(111274);
    if ((bo.isNullOrNil(paramString)) || (paramIntent == null))
      AppMethodBeat.o(111274);
    while (true)
    {
      return;
      boolean bool = paramIntent.getBooleanExtra("from_find_more_friend", false);
      int i = paramIntent.getIntExtra("game_report_from_scene", 0);
      ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
      n localn1 = q.bEo();
      n localn2 = localn1;
      if (localn1 == null)
      {
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        localn2 = q.bEs();
      }
      paramIntent.putExtra("rawUrl", a(paramString, localn2));
      if (bool)
      {
        b(paramActivity, paramIntent, "game_center_entrance", true, localn2, i);
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        q.bEt();
        ((com.tencent.mm.plugin.game.a.b)g.K(com.tencent.mm.plugin.game.a.b.class)).bCX();
        q.bEn();
        AppMethodBeat.o(111274);
      }
      else
      {
        b(paramActivity, paramIntent, "game_center_entrance", false, localn2, i);
        AppMethodBeat.o(111274);
      }
    }
  }

  private static void b(Context paramContext, Intent paramIntent, String paramString, boolean paramBoolean, n paramn, int paramInt)
  {
    AppMethodBeat.i(111277);
    paramIntent.putExtra("geta8key_scene", 32);
    paramIntent.putExtra("KPublisherId", paramString);
    paramIntent.putExtra("game_check_float", paramBoolean);
    int i;
    if ((paramBoolean) && (paramn != null))
    {
      paramn.bEl();
      if ((paramn.mWG != null) && (!bo.isNullOrNil(paramn.mWG.url)))
      {
        paramString = new GameFloatLayerInfo();
        paramString.url = paramn.mWG.url;
        paramString.mTC = paramn.mWG.mTC;
        i = -1;
        switch (paramn.mWG.orientation)
        {
        default:
        case 1:
        case 3:
        case 2:
        case 4:
        }
      }
    }
    while (true)
    {
      paramString.orientation = i;
      GameWebViewLaunchParams localGameWebViewLaunchParams = new GameWebViewLaunchParams();
      localGameWebViewLaunchParams.mTF = paramString;
      paramIntent.putExtra("launchParams", localGameWebViewLaunchParams);
      paramIntent.putExtra("game_float_layer_url", paramn.mWG.url);
      com.tencent.mm.plugin.game.f.c.x(paramIntent, paramContext);
      a(paramn, paramInt, 1);
      AppMethodBeat.o(111277);
      return;
      i = 0;
      continue;
      i = 1;
    }
  }

  private static void cb(List paramList)
  {
    AppMethodBeat.i(111279);
    if (bo.ek(paramList))
      AppMethodBeat.o(111279);
    while (true)
    {
      return;
      vv localvv = new vv();
      localvv.cSX.cuy = 8;
      localvv.cSX.scene = 1;
      localvv.cSX.cTc = paramList;
      a.xxA.m(localvv);
      AppMethodBeat.o(111279);
    }
  }

  private static String ey(String paramString1, String paramString2)
  {
    AppMethodBeat.i(111280);
    Uri localUri = Uri.parse(paramString1);
    Object localObject = localUri.getQuery();
    if (localObject != null)
      paramString2 = (String)localObject + "&" + paramString2;
    try
    {
      while (true)
      {
        localObject = new java/net/URI;
        ((URI)localObject).<init>(localUri.getScheme(), localUri.getAuthority(), localUri.getPath(), paramString2, localUri.getFragment());
        paramString2 = ((URI)localObject).toString();
        paramString1 = paramString2;
        AppMethodBeat.o(111280);
        return paramString1;
      }
    }
    catch (URISyntaxException paramString2)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.GameEntranceChecker", paramString2, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.l
 * JD-Core Version:    0.6.2
 */