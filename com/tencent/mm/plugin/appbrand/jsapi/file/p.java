package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class p extends a
{
  private static final int CTRL_INDEX = 116;
  private static final String NAME = "getSavedFileInfo";

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(102788);
    Object localObject = paramJSONObject.optString("filePath", "");
    if (bo.isNullOrNil((String)localObject))
    {
      paramc.M(paramInt, j("fail:invalid data", null));
      AppMethodBeat.o(102788);
    }
    while (true)
    {
      return;
      paramJSONObject = paramc.asE().yg((String)localObject);
      if (paramJSONObject == null)
      {
        paramc.M(paramInt, j(String.format(Locale.US, "fail no such file \"%s\"", new Object[] { localObject }), null));
        AppMethodBeat.o(102788);
      }
      else
      {
        localObject = new HashMap(3);
        ((Map)localObject).put("size", Long.valueOf(paramJSONObject.length()));
        ((Map)localObject).put("createTime", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(paramJSONObject.lastModified())));
        paramc.M(paramInt, j("ok", (Map)localObject));
        AppMethodBeat.o(102788);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.p
 * JD-Core Version:    0.6.2
 */