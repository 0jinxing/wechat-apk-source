package com.tencent.mm.pluginsdk.e;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

public final class a
{
  public static Bundle aiw(String paramString)
  {
    AppMethodBeat.i(27232);
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_scene", 1);
    paramString = paramString.split("&");
    if ((paramString == null) || (paramString.length == 0))
    {
      ab.e("MicroMsg.MallManager", "getWapPayBundle arrKeys == null || arrKeys.length == 0");
      AppMethodBeat.o(27232);
    }
    while (true)
    {
      return localBundle;
      HashMap localHashMap = new HashMap();
      for (int i = 0; i < paramString.length; i++)
      {
        Object localObject = paramString[i];
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localObject = ((String)localObject).split("=");
          if ((localObject != null) && (localObject.length == 2))
            localHashMap.put(localObject[0], localObject[1]);
        }
      }
      localBundle.putString("_wxapi_payreq_appid", c("appid", localHashMap));
      localBundle.putString("_wxapi_payreq_partnerid", c("partnerid", localHashMap));
      localBundle.putString("_wxapi_payreq_prepayid", c("prepayid", localHashMap));
      localBundle.putString("_wxapi_payreq_noncestr", c("noncestr", localHashMap));
      localBundle.putString("_wxapi_payreq_timestamp", c("timestamp", localHashMap));
      localBundle.putString("_wxapi_payreq_packagevalue", c("package", localHashMap));
      localBundle.putString("_wxapi_payreq_sign", c("sign", localHashMap));
      localBundle.putString("_wxapi_payreq_sign_type", c("signtype", localHashMap));
      localBundle.putString("_wxapi_payreq_extdata", c("extdata", localHashMap));
      localBundle.putString("_wxapi_payoptions_callback_classname", "");
      localBundle.putInt("_wxapi_payoptions_callback_flags", -1);
      AppMethodBeat.o(27232);
    }
  }

  private static String c(String paramString, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(27233);
    paramHashMap = (String)paramHashMap.get(paramString);
    if (TextUtils.isEmpty(paramHashMap))
    {
      ab.e("MicroMsg.MallManager", "getWapPayKey key: " + paramString + " value is empty");
      paramString = "";
      AppMethodBeat.o(27233);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(27233);
      paramString = paramHashMap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.a
 * JD-Core Version:    0.6.2
 */