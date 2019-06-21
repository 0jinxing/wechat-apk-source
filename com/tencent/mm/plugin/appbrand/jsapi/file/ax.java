package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.l;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.json.JSONObject;

final class ax extends d
{
  final f.a a(c paramc, String paramString, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102840);
    String str = paramJSONObject.optString("targetDirectory", "");
    paramJSONObject = paramc.asE().ye(str);
    Object localObject;
    switch (1.hJS[paramJSONObject.ordinal()])
    {
    default:
      paramJSONObject = paramc.asE().yg(paramString);
      if ((paramJSONObject == null) || (!paramJSONObject.exists()))
      {
        if (paramc.asE().yd(paramString) != com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
          break label658;
        localObject = paramc.asE().yh(URLEncoder.encode(paramString));
        if (localObject == null)
          break label658;
        paramJSONObject = new com.tencent.mm.plugin.appbrand.r.j();
        paramc.asE().b(paramString, paramJSONObject);
      }
      break;
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      int i;
      try
      {
        Channels.newChannel(e.q((b)localObject)).write((ByteBuffer)paramJSONObject.value);
        paramJSONObject = new java/io/File;
        paramJSONObject.<init>(com.tencent.mm.vfs.j.w(((b)localObject).dMD()));
        i = 1;
        localObject = paramJSONObject;
        if (paramJSONObject != null)
          break label326;
        paramc = new f.a("fail no such file \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102840);
        return paramc;
        paramc = new f.a(String.format("fail permission denied, open \"%s\"", new Object[] { str }), new Object[0]);
        AppMethodBeat.o(102840);
        continue;
      }
      catch (IOException paramJSONObject)
      {
        ab.e("MicroMsg.AppBrand.FileSystem.UnitUnzip", "copy ByteBuffer failed e = %s", new Object[] { paramJSONObject });
        paramJSONObject = null;
        i = 0;
        continue;
      }
      if ((paramJSONObject.isDirectory()) || (l.F(paramJSONObject)))
      {
        paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
        AppMethodBeat.o(102840);
      }
      else
      {
        i = 0;
        localObject = paramJSONObject;
        try
        {
          label326: paramJSONObject = paramc.asE().b(str, (File)localObject);
          if (i != 0)
            e.deleteFile(((File)localObject).getAbsolutePath());
          switch (1.hJS[paramJSONObject.ordinal()])
          {
          case 2:
          case 3:
          default:
            paramc = new com/tencent/mm/plugin/appbrand/jsapi/file/f$a;
            paramString = new java/lang/StringBuilder;
            paramString.<init>("fail ");
            paramc.<init>(paramJSONObject.name(), new Object[0]);
            AppMethodBeat.o(102840);
            break;
          case 4:
            paramc = new f.a("fail no such file or directory, open \"%s\"", new Object[] { paramString });
            AppMethodBeat.o(102840);
            break;
          case 5:
            paramc = new f.a("fail illegal operation on a filePath, open \"%s\"", new Object[] { paramString });
            AppMethodBeat.o(102840);
            break;
          case 1:
            paramc = new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
            AppMethodBeat.o(102840);
            break;
          case 6:
            paramc = new f.a("fail the maximum size of the file storage limit is exceeded", new Object[0]);
            AppMethodBeat.o(102840);
            break;
          case 7:
            paramc = new f.a("fail read zip data", new Object[0]);
            AppMethodBeat.o(102840);
            break;
          case 8:
            paramc = new f.a("fail write entry", new Object[0]);
            AppMethodBeat.o(102840);
            break;
          case 9:
            paramc = new f.a("ok", new Object[0]);
            AppMethodBeat.o(102840);
          }
        }
        catch (Exception paramc)
        {
          ab.printErrStackTrace("MicroMsg.AppBrand.FileSystem.UnitUnzip", paramc, "write zip stream", new Object[0]);
          paramc = new f.a("fail read zip data", new Object[0]);
          AppMethodBeat.o(102840);
        }
        continue;
        label658: i = 0;
      }
    }
  }

  protected final String y(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(102841);
    paramJSONObject = paramJSONObject.optString("zipFilePath");
    AppMethodBeat.o(102841);
    return paramJSONObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.ax
 * JD-Core Version:    0.6.2
 */