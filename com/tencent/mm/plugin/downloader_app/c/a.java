package com.tencent.mm.plugin.downloader_app.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(136160);
    ab.d("MicroMsg.DownloadReporter", "kv16099, sceneId = %d, areaId = %d, positionId = %d, actionId = %d, appId = %s,noticeId = %s, extInfo = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString1, paramString2, paramString3 });
    h.pYm.e(16099, new Object[] { Integer.valueOf(azq()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString1, paramString2, paramString3 });
    AppMethodBeat.o(136160);
  }

  public static int azq()
  {
    AppMethodBeat.i(136161);
    int i;
    if (at.isWifi(ah.getContext()))
    {
      i = 0;
      AppMethodBeat.o(136161);
    }
    while (true)
    {
      return i;
      if (at.is4G(ah.getContext()))
      {
        i = 4;
        AppMethodBeat.o(136161);
      }
      else if (at.is3G(ah.getContext()))
      {
        i = 3;
        AppMethodBeat.o(136161);
      }
      else if (at.is2G(ah.getContext()))
      {
        i = 2;
        AppMethodBeat.o(136161);
      }
      else
      {
        i = 1;
        AppMethodBeat.o(136161);
      }
    }
  }

  public static String dD(String paramString1, String paramString2)
  {
    AppMethodBeat.i(136162);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put(paramString1, paramString2);
      paramString1 = "";
    }
    catch (JSONException paramString1)
    {
      try
      {
        paramString2 = URLEncoder.encode(localJSONObject.toString(), "utf-8");
        paramString1 = paramString2;
        label35: AppMethodBeat.o(136162);
        return paramString1;
        paramString1 = paramString1;
      }
      catch (UnsupportedEncodingException paramString2)
      {
        break label35;
      }
    }
  }

  public static int tQ(int paramInt)
  {
    int i = 0;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case 3:
    case 5:
    case 2:
    case 4:
    case 6:
    }
    while (true)
    {
      return j;
      j = 1002;
      continue;
      j = 1003;
      continue;
      j = 1004;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.c.a
 * JD-Core Version:    0.6.2
 */