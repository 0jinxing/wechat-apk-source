package com.tencent.mm.plugin.profile.ui.newbizinfo.b;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static int Bk(int paramInt)
  {
    int i = 0;
    switch (paramInt)
    {
    default:
      paramInt = i;
    case 42:
    case 43:
    case 57:
    case 17:
    case 41:
    case 39:
    case 87:
    case 89:
    case 30:
    case 45:
    }
    while (true)
    {
      return paramInt;
      paramInt = 1;
      continue;
      paramInt = 2;
      continue;
      paramInt = 3;
      continue;
      paramInt = 4;
    }
  }

  public static void a(e parame, Context paramContext, String paramString)
  {
    AppMethodBeat.i(23936);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", parame.value);
    localIntent.putExtra("geta8key_username", paramString);
    localIntent.putExtra("geta8key_scene", 59);
    com.tencent.mm.bp.d.b(paramContext, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(23936);
  }

  public static int aW(int paramInt, String paramString)
  {
    AppMethodBeat.i(23938);
    if ((paramString != null) && (t.mZ(paramString)))
    {
      AppMethodBeat.o(23938);
      paramInt = 3;
    }
    while (true)
    {
      return paramInt;
      switch (paramInt)
      {
      case 3:
      case 4:
      case 5:
      case 8:
      case 10:
      default:
        paramInt = 0;
        AppMethodBeat.o(23938);
        break;
      case 1:
      case 2:
        AppMethodBeat.o(23938);
        break;
      case 6:
      case 7:
      case 9:
      case 11:
      case 12:
      case 13:
        AppMethodBeat.o(23938);
        paramInt = 3;
      }
    }
  }

  public static void b(e parame, Context paramContext, String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(23937);
    if (bo.isNullOrNil(parame.value))
    {
      ab.d("MicroMsg.NewBizInfoUtil", "jumpToWeApp serviceInfo.id:%s value is null", new Object[] { parame.id });
      AppMethodBeat.o(23937);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NewBizInfoUtil", "jumpToWeApp value:%s", new Object[] { parame.value });
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(parame.value);
        parame = f.qX(paramString);
        AppBrandStatObject localAppBrandStatObject = new com/tencent/mm/plugin/appbrand/report/AppBrandStatObject;
        localAppBrandStatObject.<init>();
        localAppBrandStatObject.scene = 1102;
        localAppBrandStatObject.cst = paramString;
        com.tencent.mm.plugin.appbrand.service.e locale = (com.tencent.mm.plugin.appbrand.service.e)g.K(com.tencent.mm.plugin.appbrand.service.e.class);
        paramString = ((JSONObject)localObject2).optString("userName");
        localObject2 = ((JSONObject)localObject2).optString("pagePath");
        if (parame == null);
        for (parame = localObject1; ; parame = parame.field_appId)
        {
          locale.a(paramContext, paramString, null, 0, 0, (String)localObject2, localAppBrandStatObject, parame);
          AppMethodBeat.o(23937);
          break;
        }
      }
      catch (JSONException parame)
      {
        AppMethodBeat.o(23937);
      }
    }
  }

  public static List<e> cD(List<e> paramList)
  {
    AppMethodBeat.i(23935);
    ArrayList localArrayList = new ArrayList();
    if (paramList == null)
    {
      ab.e("MicroMsg.NewBizInfoUtil", "serviceInfoList is null, err");
      AppMethodBeat.o(23935);
    }
    while (true)
    {
      return localArrayList;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        e locale = (e)paramList.next();
        if (locale.type == 0)
        {
          Object localObject = locale.pqE;
          locale.pqE = new ArrayList();
          Iterator localIterator = ((List)localObject).iterator();
          while (localIterator.hasNext())
          {
            localObject = (e)localIterator.next();
            if ((((e)localObject).type == 2) || (((e)localObject).type == 5))
              locale.pqE.add(localObject);
          }
          if (locale.pqE.size() > 0)
            localArrayList.add(locale);
        }
        else if (locale.type == 2)
        {
          localArrayList.add(locale);
        }
        else if (locale.type == 5)
        {
          localArrayList.add(locale);
        }
      }
      AppMethodBeat.o(23935);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.b.c
 * JD-Core Version:    0.6.2
 */