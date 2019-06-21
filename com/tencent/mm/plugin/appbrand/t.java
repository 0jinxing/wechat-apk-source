package com.tencent.mm.plugin.appbrand;

import android.content.Intent;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.modelappbrand.b.a;
import com.tencent.mm.plugin.base.model.c;
import com.tencent.mm.sdk.platformtools.bo;

public final class t
  implements a
{
  public static t auu()
  {
    return t.a.gQg;
  }

  public final Intent a(String paramString1, int paramInt1, String paramString2, String paramString3, String[] paramArrayOfString, String paramString4, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(129116);
    String str = c.Fv(paramString2);
    if (bo.isNullOrNil(str))
    {
      paramString1 = null;
      AppMethodBeat.o(129116);
    }
    while (true)
    {
      return paramString1;
      if (TextUtils.isEmpty(paramString3));
      while (true)
      {
        paramString3 = new StringBuilder();
        int i = paramArrayOfString.length;
        for (int j = 0; j < i; j++)
          paramString3.append(paramArrayOfString[j]);
        paramString2 = paramString3;
      }
      paramString3 = g.x((paramString2 + paramString3.toString()).getBytes());
      paramString2 = new Intent("com.tencent.mm.action.WX_SHORTCUT");
      paramString2.putExtra("type", paramInt3);
      paramString2.putExtra("id", str);
      paramString2.putExtra("ext_info", c.Fv(paramString4));
      paramString2.putExtra("token", c.db(paramString4, String.valueOf(paramInt2)));
      paramString2.putExtra("digest", paramString3);
      paramString2.putExtra("ext_info_1", paramInt1);
      paramString2.setPackage(paramString1);
      paramString2.addFlags(67108864);
      AppMethodBeat.o(129116);
      paramString1 = paramString2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.t
 * JD-Core Version:    0.6.2
 */