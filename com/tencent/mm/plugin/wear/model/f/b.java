package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.protobuf.cuc;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.bi;

public abstract class b extends c
{
  protected static String b(String paramString, bi parambi)
  {
    if (t.kH(paramString))
      paramString = c(paramString, parambi);
    for (paramString = String.format(ah.getContext().getString(2131301803), new Object[] { h.adw(paramString), Character.valueOf('​'), h.aj(parambi).ncM }); ; paramString = String.format(ah.getContext().getString(2131301804), new Object[] { h.aj(parambi).ncM }))
      return paramString;
  }

  protected static String c(String paramString, bi parambi)
  {
    Object localObject = paramString;
    if (t.kH(paramString))
    {
      int i = bf.ox(parambi.field_content);
      localObject = paramString;
      if (i != -1)
      {
        parambi = parambi.field_content.substring(0, i).trim();
        localObject = paramString;
        if (parambi != null)
        {
          localObject = paramString;
          if (parambi.length() > 0)
            localObject = parambi;
        }
      }
    }
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.b
 * JD-Core Version:    0.6.2
 */