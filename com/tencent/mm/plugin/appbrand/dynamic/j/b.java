package com.tencent.mm.plugin.appbrand.dynamic.j;

import android.content.ContentValues;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.i;
import com.tencent.mm.plugin.appbrand.widget.e;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public static e Am(String paramString)
  {
    AppMethodBeat.i(10995);
    Bundle localBundle = new Bundle();
    localBundle.putString("id", paramString);
    paramString = a((ContentValues)f.a("com.tencent.mm", localBundle, a.class));
    AppMethodBeat.o(10995);
    return paramString;
  }

  static e a(ContentValues paramContentValues)
  {
    AppMethodBeat.i(10996);
    if (paramContentValues != null)
    {
      e locale = new e();
      locale.field_id = paramContentValues.getAsString("id");
      locale.field_appId = paramContentValues.getAsString("appId");
      locale.field_cacheKey = paramContentValues.getAsString("cacheKey");
      locale.field_updateTime = bo.c(paramContentValues.getAsLong("updateTime"));
      locale.field_interval = bo.h(paramContentValues.getAsInteger("interval"));
      locale.xDa = bo.c(paramContentValues.getAsLong("rowid"));
      AppMethodBeat.o(10996);
      paramContentValues = locale;
    }
    while (true)
    {
      return paramContentValues;
      paramContentValues = null;
      AppMethodBeat.o(10996);
    }
  }

  static class a
    implements i<Bundle, ContentValues>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.j.b
 * JD-Core Version:    0.6.2
 */