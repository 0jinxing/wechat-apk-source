package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import org.apache.commons.a.b;
import org.json.JSONObject;

public final class JsApiOpenDocument extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 99;
  private static final String NAME = "openDocument";
  private static long hJO = -1L;

  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131076);
    long l = bo.anU();
    if (l - hJO < 1000L)
    {
      paramc.M(paramInt, j("fail:document viewer already starting", null));
      AppMethodBeat.o(131076);
    }
    while (true)
    {
      return;
      hJO = l;
      Context localContext = paramc.getContext();
      if ((localContext == null) || (!(localContext instanceof Activity)))
      {
        paramc.M(paramInt, j("fail", null));
        AppMethodBeat.o(131076);
      }
      else
      {
        String str = paramJSONObject.optString("filePath");
        if (bo.isNullOrNil(str))
        {
          paramc.M(paramInt, j("fail:invalid data", null));
          AppMethodBeat.o(131076);
        }
        else
        {
          File localFile = paramc.asE().yg(str);
          if (localFile == null)
          {
            paramc.M(paramInt, j("fail:file doesn't exist", null));
            AppMethodBeat.o(131076);
          }
          else
          {
            JsApiOpenDocument.OpenRequest localOpenRequest = new JsApiOpenDocument.OpenRequest();
            localOpenRequest.filePath = localFile.getAbsolutePath();
            localOpenRequest.eov = b.awJ(str);
            paramJSONObject = paramJSONObject.optString("fileType");
            if (!bo.isNullOrNil(paramJSONObject))
              localOpenRequest.eov = paramJSONObject;
            com.tencent.mm.plugin.appbrand.ipc.a.b(localContext, localOpenRequest, new JsApiOpenDocument.1(this, paramc, paramInt));
            AppMethodBeat.o(131076);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument
 * JD-Core Version:    0.6.2
 */