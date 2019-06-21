package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.aa.i;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class e
{
  public static boolean a(Context paramContext, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(18159);
    boolean bool;
    if (paramContext == null)
    {
      ab.e("MicroMsg.WXBizLogic", "context is null");
      bool = false;
      AppMethodBeat.o(18159);
    }
    while (true)
    {
      return bool;
      String str1 = null;
      Object localObject1 = null;
      Object localObject2 = localObject1;
      String str2 = str1;
      if (paramArrayOfString2 != null)
      {
        localObject2 = localObject1;
        str2 = str1;
        if (paramArrayOfString2.length > 0)
        {
          str2 = paramArrayOfString2[0];
          localObject2 = g.x(com.tencent.mm.pluginsdk.model.app.p.bx(paramContext, paramArrayOfString2[0])[0].toByteArray());
        }
      }
      ab.i("MicroMsg.WXBizLogic", "openBusinessWebview packageName = %s, sig = %s", new Object[] { str2, localObject2 });
      if ((paramArrayOfString1 == null) || (paramArrayOfString1.length < 3))
      {
        ab.e("MicroMsg.WXBizLogic", "args is null");
        bool = false;
        AppMethodBeat.o(18159);
        continue;
      }
      str1 = paramArrayOfString1[0];
      if (bo.isNullOrNil(str1))
      {
        ab.e("MicroMsg.WXBizLogic", "appId is null");
        bool = false;
        AppMethodBeat.o(18159);
        continue;
      }
      int i = bo.getInt(paramArrayOfString1[1], 0);
      if (i <= 0)
      {
        ab.e("MicroMsg.WXBizLogic", "businessType(%d) invalid", new Object[] { Integer.valueOf(i) });
        bool = false;
        AppMethodBeat.o(18159);
        continue;
      }
      paramArrayOfString2 = bo.nullAsNil(paramArrayOfString1[2]);
      ab.i("MicroMsg.WXBizLogic", "openBusinessWebview, appid = %s, businessType = %d, queryInfo = %s", new Object[] { str1, Integer.valueOf(i), paramArrayOfString2 });
      paramArrayOfString1 = "";
      try
      {
        paramArrayOfString2 = URLEncoder.encode(bo.nullAsNil(paramArrayOfString2), "UTF-8");
        paramArrayOfString1 = paramArrayOfString2;
        paramArrayOfString1 = String.format("weixin://dl/openbusinesswebview/link?appid=%s&type=%d&query=%s", new Object[] { str1, Integer.valueOf(i), paramArrayOfString1 });
        ab.i("MicroMsg.WXBizLogic", "openBusinessWebview url format = %s", new Object[] { paramArrayOfString1 });
        paramArrayOfString2 = new Intent(paramContext, WXBizEntryActivity.class);
        paramArrayOfString2.setData(Uri.parse(paramArrayOfString1));
        paramArrayOfString2.addFlags(268435456);
        paramArrayOfString2.putExtra("key_package_name", str2);
        paramArrayOfString2.putExtra("key_app_id", str1);
        paramArrayOfString2.putExtra("translate_link_scene", 1);
        paramArrayOfString2.putExtra("key_package_signature", (String)localObject2);
        paramArrayOfString2.putExtra("key_command_id", 25);
        paramContext.startActivity(paramArrayOfString2);
        bool = true;
        AppMethodBeat.o(18159);
      }
      catch (UnsupportedEncodingException paramArrayOfString2)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.WXBizLogic", paramArrayOfString2, "", new Object[0]);
      }
    }
  }

  public static boolean b(Context paramContext, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(18160);
    if (paramContext == null)
    {
      ab.e("MicroMsg.WXBizLogic", "context is null");
      bool = false;
      AppMethodBeat.o(18160);
    }
    String str1;
    String str3;
    String str4;
    String str5;
    while (true)
    {
      return bool;
      str1 = null;
      str2 = null;
      str3 = str2;
      str4 = str1;
      if (paramArrayOfString2 != null)
      {
        str3 = str2;
        str4 = str1;
        if (paramArrayOfString2.length > 0)
        {
          str4 = paramArrayOfString2[0];
          str3 = g.x(com.tencent.mm.pluginsdk.model.app.p.bx(paramContext, paramArrayOfString2[0])[0].toByteArray());
        }
      }
      ab.i("MicroMsg.WXBizLogic", "openBusinessView packageName = %s, sig = %s", new Object[] { str4, str3 });
      if ((paramArrayOfString1 == null) || (paramArrayOfString1.length < 4))
      {
        ab.e("MicroMsg.WXBizLogic", "args is null");
        bool = false;
        AppMethodBeat.o(18160);
      }
      else
      {
        str1 = paramArrayOfString1[0];
        if (bo.isNullOrNil(str1))
        {
          ab.e("MicroMsg.WXBizLogic", "appId is null");
          bool = false;
          AppMethodBeat.o(18160);
        }
        else
        {
          str5 = paramArrayOfString1[1];
          if (!bo.isNullOrNil(str5))
            break;
          ab.e("MicroMsg.WXBizLogic", "businessType isEmpty");
          bool = false;
          AppMethodBeat.o(18160);
        }
      }
    }
    paramArrayOfString2 = bo.nullAsNil(paramArrayOfString1[2]);
    String str2 = bo.nullAsNil(paramArrayOfString1[3]);
    boolean bool = str5.startsWith("native");
    if (bool)
    {
      paramArrayOfString1 = "openNativeView";
      paramArrayOfString1 = String.format("weixin://dl/%s/?appid=%s&businessType=%s", new Object[] { paramArrayOfString1, str1, str5 });
      ab.i("MicroMsg.WXBizLogic", "openBusinessView url format = %s,query=%s,extInfo=%s", new Object[] { paramArrayOfString1, paramArrayOfString2, str2 });
      if ((bool) || (bo.isNullOrNil(str2)))
        break label474;
    }
    while (true)
    {
      try
      {
        Object localObject = new com/tencent/mm/aa/i;
        ((i)localObject).<init>(str2);
        int i = ((i)localObject).optInt("miniProgramType", 0);
        if (i >= 0)
        {
          j = i;
          if (i <= 2);
        }
        else
        {
          j = 0;
        }
        localObject = new Intent(paramContext, WXBizEntryActivity.class);
        ((Intent)localObject).setData(Uri.parse(paramArrayOfString1));
        ((Intent)localObject).addFlags(268435456);
        ((Intent)localObject).putExtra("key_package_name", str4);
        ((Intent)localObject).putExtra("key_app_id", str1);
        ((Intent)localObject).putExtra("key_business_type", str5);
        ((Intent)localObject).putExtra("translate_link_scene", 1);
        ((Intent)localObject).putExtra("key_package_signature", str3);
        ((Intent)localObject).putExtra("key_command_id", 26);
        paramContext.startActivity((Intent)localObject);
        paramContext = v.Zp().y("key_data_center_session_id", true);
        paramContext.j("key_launch_miniprogram_type", Integer.valueOf(j));
        paramContext.j("key_launch_miniprogram_query_info", paramArrayOfString2);
        paramContext.j("key_open_business_view_ext_info", str2);
        bool = true;
        AppMethodBeat.o(18160);
        break;
        paramArrayOfString1 = "jumpFakeWxa";
      }
      catch (Exception localException)
      {
      }
      label474: int j = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.e
 * JD-Core Version:    0.6.2
 */