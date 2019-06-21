package com.tencent.mm.plugin.appbrand.config;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.tencent.luggage.wxa.storage.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class s
{
  private static final Uri URI;
  private static final s hiu;

  static
  {
    AppMethodBeat.i(94156);
    URI = Uri.parse("content://" + a.AUTHORITY + "/WxaAttributesTable");
    hiu = new s();
    AppMethodBeat.o(94156);
  }

  public static s ayO()
  {
    return hiu;
  }

  public static WxaAttributes f(String paramString, String[] paramArrayOfString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(94155);
    paramArrayOfString = ah.getContext().getContentResolver().query(URI, null, paramString, paramArrayOfString, null);
    if (paramArrayOfString == null)
    {
      AppMethodBeat.o(94155);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (!paramArrayOfString.isClosed())
      {
        paramString = localObject1;
        if (paramArrayOfString.moveToFirst())
        {
          paramString = new WxaAttributes();
          paramString.d(paramArrayOfString);
        }
      }
      paramArrayOfString.close();
      AppMethodBeat.o(94155);
    }
  }

  public static WxaAttributes zB(String paramString)
  {
    AppMethodBeat.i(94154);
    paramString = f(String.format("%s=?", new Object[] { "appId" }), new String[] { paramString });
    AppMethodBeat.o(94154);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.config.s
 * JD-Core Version:    0.6.2
 */