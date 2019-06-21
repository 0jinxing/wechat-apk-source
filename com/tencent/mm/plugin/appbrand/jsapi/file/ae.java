package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public final class ae extends a
{
  public static final int CTRL_INDEX = 51;
  public static final String NAME = "saveFile";

  public static String a(c paramc, File paramFile, String paramString, com.tencent.mm.plugin.appbrand.r.j<String> paramj)
  {
    AppMethodBeat.i(102808);
    if ((paramFile == null) || (!paramFile.exists()))
    {
      paramc = "fail:file not exists";
      AppMethodBeat.o(102808);
    }
    while (true)
    {
      return paramc;
      Object localObject1 = paramc.asE().ye(paramString);
      Object localObject2 = localObject1;
      if (localObject1 != com.tencent.mm.plugin.appbrand.appstorage.j.gXA);
      try
      {
        localObject1 = new com/tencent/mm/plugin/appbrand/r/j;
        ((com.tencent.mm.plugin.appbrand.r.j)localObject1).<init>();
        paramc = paramc.asE().a(paramFile, paramString, (com.tencent.mm.plugin.appbrand.r.j)localObject1);
        localObject2 = paramc;
        if (paramj != null)
        {
          paramj.value = ((com.tencent.mm.plugin.appbrand.r.j)localObject1).value;
          localObject2 = paramc;
        }
        switch (ae.2.hJS[localObject2.ordinal()])
        {
        default:
          paramc = "fail " + ((com.tencent.mm.plugin.appbrand.appstorage.j)localObject2).name();
          AppMethodBeat.o(102808);
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
      }
      catch (Exception paramc)
      {
        paramc = "fail:writeFile exception: " + paramc.toString();
        AppMethodBeat.o(102808);
      }
      continue;
      paramc = String.format("fail permission denied, open \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102808);
      continue;
      paramc = String.format("fail no such file or directory \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102808);
      continue;
      paramc = String.format("fail illegal operation on a directory, open \"%s\"", new Object[] { paramString });
      AppMethodBeat.o(102808);
      continue;
      paramc = "fail the maximum size of the file storage limit is exceeded";
      AppMethodBeat.o(102808);
      continue;
      paramc = "ok";
      AppMethodBeat.o(102808);
    }
  }

  static m.a d(c paramc, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102807);
    Object localObject1 = paramJSONObject.optString("tempFilePath");
    Object localObject2 = paramJSONObject.optString("filePath");
    if (bo.isNullOrNil((String)localObject1))
    {
      ab.e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
      paramc = new m.a("fail", new Object[0]);
      AppMethodBeat.o(102807);
    }
    while (true)
    {
      return paramc;
      localObject1 = paramc.asE().yg((String)localObject1);
      if ((localObject1 == null) || (!((File)localObject1).exists()))
      {
        paramc = new m.a("fail tempFilePath file not exist", new Object[0]);
        AppMethodBeat.o(102807);
      }
      else
      {
        paramJSONObject = new com.tencent.mm.plugin.appbrand.r.j();
        paramc = a(paramc, (File)localObject1, (String)localObject2, paramJSONObject);
        localObject2 = new HashMap();
        if ("ok".equals(paramc))
          ((Map)localObject2).put("savedFilePath", paramJSONObject.value);
        paramc = new m.a(paramc, new Object[0]).v((Map)localObject2);
        AppMethodBeat.o(102807);
      }
    }
  }

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(102806);
    b.hJE.execute(new ae.1(this, paramc, paramJSONObject, paramInt));
    AppMethodBeat.o(102806);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ae
 * JD-Core Version:    0.6.2
 */