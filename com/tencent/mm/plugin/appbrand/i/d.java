package com.tencent.mm.plugin.appbrand.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.o;
import com.tencent.mm.plugin.appbrand.widget.h.b;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class d
  implements e.b
{
  public final CharSequence a(Map<String, String> paramMap, String paramString, Bundle paramBundle, WeakReference<Context> paramWeakReference)
  {
    AppMethodBeat.i(132276);
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      ab.w("MicroMsg.WxaSysTemplateMsgHandler", "values map is null or nil");
      paramMap = null;
      AppMethodBeat.o(132276);
    }
    Context localContext;
    int j;
    while (true)
    {
      return paramMap;
      localContext = (Context)paramWeakReference.get();
      if (localContext == null)
      {
        ab.w("MicroMsg.WxaSysTemplateMsgHandler", "context is null");
        paramMap = null;
        AppMethodBeat.o(132276);
      }
      else
      {
        String str1 = (String)paramMap.get(paramString + ".title");
        String str2 = (String)paramMap.get(paramString + ".username");
        int i = bo.getInt((String)paramMap.get(paramString + ".type"), 0);
        j = bo.getInt((String)paramMap.get(paramString + ".wxaapp_type"), 0);
        String str3 = (String)paramMap.get(paramString + ".path");
        label263: label274: int m;
        label286: long l;
        if (bo.getInt((String)paramMap.get(paramString + ".forbids"), 0) == 1)
        {
          k = 1;
          if (paramBundle == null)
            break label340;
          paramMap = paramBundle.getString("conv_talker_username");
          if (paramBundle == null)
            break label346;
          m = paramBundle.getInt("scene");
          if (paramBundle == null)
            break label352;
          l = paramBundle.getLong("msg_sever_id");
          label298: if (paramBundle == null)
            break label358;
        }
        label340: label346: label352: label358: for (paramString = paramBundle.getString("send_msg_username"); ; paramString = "")
        {
          if (!bo.isNullOrNil(str1))
            break label364;
          ab.w("MicroMsg.WxaSysTemplateMsgHandler", "link title is null or nil");
          paramMap = null;
          AppMethodBeat.o(132276);
          break;
          k = 0;
          break label263;
          paramMap = "";
          break label274;
          m = 0;
          break label286;
          l = 0L;
          break label298;
        }
        label364: paramBundle = new SpannableString(str1);
        paramBundle.setSpan(new d.1(this, str1, str2, str3, paramMap, paramWeakReference, m, l, paramString, i), 0, str1.length(), 17);
        ab.d("MicroMsg.WxaSysTemplateMsgHandler", "handleTemplate(title : %s, username : %s, path : %s, talker : %s)", new Object[] { str1, str2, str3, paramMap });
        if (k == 0)
          break;
        AppMethodBeat.o(132276);
        paramMap = paramBundle;
      }
    }
    int k = 2131232001;
    switch (j)
    {
    default:
    case 1:
    }
    while (true)
    {
      paramMap = localContext.getResources().getDrawable(k);
      paramMap.setBounds(0, 0, o.aNT(), o.aNT());
      paramString = new b(paramMap);
      paramMap = new SpannableString("@ ");
      paramMap.setSpan(paramString, 0, 1, 33);
      paramMap = TextUtils.concat(new CharSequence[] { paramMap, paramBundle });
      AppMethodBeat.o(132276);
      break;
      k = 2131232002;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.d
 * JD-Core Version:    0.6.2
 */