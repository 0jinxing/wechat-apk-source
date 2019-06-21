package com.tencent.mm.plugin.appbrand.ui.banner;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import org.json.JSONArray;
import org.json.JSONException;

final class b
{
  static boolean L(Intent paramIntent)
  {
    boolean bool = false;
    AppMethodBeat.i(133269);
    if (paramIntent == null)
      AppMethodBeat.o(133269);
    while (true)
    {
      return bool;
      String str1 = paramIntent.getStringExtra(b.a.iKs.wP());
      int i = paramIntent.getIntExtra(b.a.iKt.wP(), 0);
      String str2 = paramIntent.getStringExtra(b.a.iKu.wP());
      String str3 = paramIntent.getStringExtra(b.a.iKv.wP());
      String str4 = paramIntent.getStringExtra(b.a.iKw.wP());
      b.a[] arrayOfa = b.a.values();
      int j = arrayOfa.length;
      for (int k = 0; k < j; k++)
        paramIntent.removeExtra(arrayOfa[k].wP());
      if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
      {
        AppMethodBeat.o(133269);
      }
      else
      {
        a(str1, i, str2, str3, str4);
        bool = true;
        AppMethodBeat.o(133269);
      }
    }
  }

  static void a(Intent paramIntent, String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(133271);
    if (paramIntent == null)
      AppMethodBeat.o(133271);
    while (true)
    {
      return;
      paramIntent.putExtra(b.a.iKs.wP(), paramString1);
      paramIntent.putExtra(b.a.iKt.wP(), paramInt);
      paramIntent.putExtra(b.a.iKu.wP(), paramString2);
      paramIntent.putExtra(b.a.iKv.wP(), paramString3);
      paramIntent.putExtra(b.a.iKw.wP(), paramString4);
      AppMethodBeat.o(133271);
    }
  }

  private static void a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(133272);
    if (!g.RK())
      AppMethodBeat.o(133272);
    while (true)
    {
      return;
      JSONArray localJSONArray = new JSONArray();
      localJSONArray.put(paramString1);
      localJSONArray.put(String.valueOf(paramInt));
      localJSONArray.put(paramString2);
      localJSONArray.put(paramString3);
      localJSONArray.put(bo.nullAsNil(paramString4));
      paramString1 = localJSONArray.toString();
      try
      {
        g.RP().Ry().set(ac.a.xOr, paramString1);
        AppMethodBeat.o(133272);
      }
      finally
      {
        AppMethodBeat.o(133272);
      }
    }
    throw paramString1;
  }

  static boolean a(AppBrandStickyBannerLogic.OperateTask paramOperateTask)
  {
    boolean bool = false;
    AppMethodBeat.i(133270);
    if ((paramOperateTask == null) || (!g.RK()))
      AppMethodBeat.o(133270);
    while (true)
    {
      return bool;
      BannerModel localBannerModel = BannerModel.aMT();
      if (localBannerModel == null)
      {
        AppMethodBeat.o(133270);
      }
      else if ((localBannerModel.appId.equals(paramOperateTask.hQL)) && (localBannerModel.har == paramOperateTask.iKO))
      {
        a(localBannerModel.appId, localBannerModel.har, localBannerModel.appName, localBannerModel.haO, paramOperateTask.iKP);
        bool = true;
        AppMethodBeat.o(133270);
      }
      else
      {
        AppMethodBeat.o(133270);
      }
    }
  }

  private static Object[] aML()
  {
    AppMethodBeat.i(133273);
    Object localObject1;
    if (!g.RK())
    {
      AppMethodBeat.o(133273);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      try
      {
        localObject1 = (String)g.RP().Ry().get(ac.a.xOr, "");
        if (bo.isNullOrNil((String)localObject1))
        {
          AppMethodBeat.o(133273);
          localObject1 = null;
          continue;
        }
      }
      finally
      {
        AppMethodBeat.o(133273);
      }
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(str);
        int i = localJSONArray.length();
        int j = b.a.iKx;
        Object[] arrayOfObject;
        if (i != j)
        {
          AppMethodBeat.o(133273);
          arrayOfObject = null;
        }
        else
        {
          arrayOfObject = new Object[b.a.iKx];
          for (i = 0; i < b.a.iKx; i++)
            arrayOfObject[i] = localJSONArray.optString(i, "");
          arrayOfObject[b.a.iKt.ordinal()] = Integer.valueOf(bo.getInt((String)arrayOfObject[b.a.iKt.ordinal()], 0));
          AppMethodBeat.o(133273);
        }
      }
      catch (JSONException localJSONException)
      {
        AppMethodBeat.o(133273);
        Object localObject2 = null;
      }
    }
  }

  static BannerModel aMM()
  {
    AppMethodBeat.i(133274);
    Object[] arrayOfObject = aML();
    BannerModel localBannerModel;
    if (arrayOfObject == null)
    {
      localBannerModel = null;
      AppMethodBeat.o(133274);
    }
    while (true)
    {
      return localBannerModel;
      localBannerModel = new BannerModel();
      localBannerModel.appId = ((String)arrayOfObject[b.a.iKs.ordinal()]);
      localBannerModel.har = ((Integer)arrayOfObject[b.a.iKt.ordinal()]).intValue();
      localBannerModel.appName = ((String)arrayOfObject[b.a.iKu.ordinal()]);
      localBannerModel.haO = ((String)arrayOfObject[b.a.iKv.ordinal()]);
      localBannerModel.iKV = ((String)arrayOfObject[b.a.iKw.ordinal()]);
      AppMethodBeat.o(133274);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.banner.b
 * JD-Core Version:    0.6.2
 */