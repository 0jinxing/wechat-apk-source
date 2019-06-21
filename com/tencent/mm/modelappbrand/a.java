package com.tencent.mm.modelappbrand;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static void a(se paramse, j.b paramb)
  {
    paramse.cOf.appId = paramb.fiQ;
    paramse.cOf.userName = paramb.fiP;
    paramse.cOf.cOh = paramb.fiO;
    paramse.cOf.cOi = paramb.fiZ;
    paramse.cOf.cOk = paramb.fiS;
    paramse.cOf.axy = paramb.fja;
    paramse = paramse.cOf;
    if (paramb.fiZ != 0);
    for (boolean bool = true; ; bool = false)
    {
      paramse.cOl = bool;
      return;
    }
  }

  public static void a(String paramString, int paramInt, j.b paramb, Bundle paramBundle)
  {
    AppMethodBeat.i(51127);
    se localse = new se();
    a(localse, paramb);
    b(localse, paramb);
    localse.cOf.scene = paramInt;
    if (paramInt == 1074)
      localse.cOf.cst = paramString;
    localse.cOf.cvs = paramBundle;
    com.tencent.mm.sdk.b.a.xxA.m(localse);
    AppMethodBeat.o(51127);
  }

  public static void a(String paramString1, String paramString2, boolean paramBoolean, j.b paramb, Bundle paramBundle)
  {
    AppMethodBeat.i(51126);
    se localse = new se();
    a(localse, paramb);
    b(localse, paramb);
    se.a locala = localse.cOf;
    int i;
    StringBuilder localStringBuilder;
    if (paramBoolean)
    {
      i = 1008;
      locala.scene = i;
      locala = localse.cOf;
      localStringBuilder = new StringBuilder().append(paramString1);
      if (!paramBoolean)
        break label142;
    }
    label142: for (paramString1 = ":".concat(String.valueOf(paramString2)); ; paramString1 = "")
    {
      locala.cst = (paramString1 + ":" + paramb.fiU);
      localse.cOf.cvs = paramBundle;
      com.tencent.mm.sdk.b.a.xxA.m(localse);
      AppMethodBeat.o(51126);
      return;
      i = 1007;
      break;
    }
  }

  public static boolean abu()
  {
    boolean bool = false;
    AppMethodBeat.i(51130);
    if (!g.RK())
      AppMethodBeat.o(51130);
    while (true)
    {
      return bool;
      com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.abi().ll("100360");
      if ((localc.isValid()) && ("1".equals(localc.dru().get("isOpenFTSSearchMiniGameEntry"))))
      {
        bool = true;
        AppMethodBeat.o(51130);
      }
      else
      {
        AppMethodBeat.o(51130);
      }
    }
  }

  private static void b(se paramse, j.b paramb)
  {
    AppMethodBeat.i(51129);
    if (paramb != null)
    {
      paramb = (com.tencent.mm.af.a)paramb.X(com.tencent.mm.af.a.class);
      if ((paramb != null) && (!bo.isNullOrNil(paramb.ffk)))
        paramse.cOf.cOv = paramb.ffk;
    }
    AppMethodBeat.o(51129);
  }

  public static void b(String paramString1, String paramString2, boolean paramBoolean, j.b paramb, Bundle paramBundle)
  {
    int i = 2;
    AppMethodBeat.i(51128);
    if (TextUtils.isEmpty(paramb.fiV))
    {
      ab.e("MicroMsg.AppBrand.api-message.AppBrandCommonApi", "visitFromPageWithShareTicketAppMessage shareKey isEmpty, transform to normal visit, talkerUsername[%s] msgUsername[%s] groupChat[%b]", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
      a(paramString1, paramString2, paramBoolean, paramb, paramBundle);
      AppMethodBeat.o(51128);
      return;
    }
    se localse = new se();
    a(localse, paramb);
    b(localse, paramb);
    localse.cOf.scene = 1044;
    localse.cOf.cst = paramb.fiU;
    se.a locala = localse.cOf;
    if (paramBoolean);
    while (true)
    {
      locala.cOq = i;
      locala = localse.cOf;
      if (paramBoolean)
        paramString2 = paramString1;
      locala.cOr = paramString2;
      localse.cOf.cOn.bQi = paramb.fiV;
      localse.cOf.cOn.bQh = paramString1;
      localse.cOf.cvs = paramBundle;
      com.tencent.mm.sdk.b.a.xxA.m(localse);
      AppMethodBeat.o(51128);
      break;
      i = 1;
    }
  }

  public static boolean pi(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(51125);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(51125);
    while (true)
    {
      return bool;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        paramString = localJSONObject.optJSONObject("BindWxaInfo");
        if (paramString != null)
        {
          if (paramString.optInt("openWxaByBizQRCode", 0) > 0)
          {
            AppMethodBeat.o(51125);
            bool = true;
            continue;
          }
          AppMethodBeat.o(51125);
        }
      }
      catch (JSONException paramString)
      {
        AppMethodBeat.o(51125);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelappbrand.a
 * JD-Core Version:    0.6.2
 */