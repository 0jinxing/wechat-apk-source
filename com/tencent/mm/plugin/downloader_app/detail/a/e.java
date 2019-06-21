package com.tencent.mm.plugin.downloader_app.detail.a;

import android.content.Context;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc;
import com.tencent.mm.plugin.webview.luggage.jsapi.bc.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class e extends bc
{
  private static void a(FileDownloadTaskInfo paramFileDownloadTaskInfo, bc.a parama)
  {
    AppMethodBeat.i(136075);
    JSONObject localJSONObject = new JSONObject();
    String str;
    switch (paramFileDownloadTaskInfo.status)
    {
    case 0:
    default:
      str = "default";
    case -1:
    case 1:
    case 3:
    case 2:
    case 4:
    }
    try
    {
      while (true)
      {
        localJSONObject.put("download_id", paramFileDownloadTaskInfo.id);
        localJSONObject.put("state", str);
        if ((str == "downloading") && (paramFileDownloadTaskInfo.jrb != 0L))
          localJSONObject.put("progress", paramFileDownloadTaskInfo.kNr / paramFileDownloadTaskInfo.jrb * 100L);
        parama.d(null, localJSONObject);
        AppMethodBeat.o(136075);
        return;
        str = "api_not_support";
        continue;
        str = "downloading";
        continue;
        if (com.tencent.mm.a.e.ct(paramFileDownloadTaskInfo.path))
        {
          str = "download_succ";
        }
        else
        {
          str = "default";
          continue;
          if ((paramFileDownloadTaskInfo.kNt) && (!at.isWifi(ah.getContext())))
          {
            str = "download_wait_for_wifi";
          }
          else
          {
            str = "download_pause";
            continue;
            str = "download_fail";
          }
        }
      }
    }
    catch (Exception paramFileDownloadTaskInfo)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiQueryDownloadTask", paramFileDownloadTaskInfo.getMessage());
        AppMethodBeat.o(136075);
      }
    }
  }

  private static void a(JSONArray paramJSONArray, bc.a parama)
  {
    AppMethodBeat.i(136076);
    JSONObject localJSONObject1 = new JSONObject();
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; i < paramJSONArray.length(); i++)
      localLinkedList.add(paramJSONArray.optString(i));
    d.bij();
    paramJSONArray = d.M(localLinkedList);
    if (paramJSONArray.size() > 0)
    {
      Iterator localIterator = paramJSONArray.iterator();
      if (localIterator.hasNext())
      {
        FileDownloadTaskInfo localFileDownloadTaskInfo = (FileDownloadTaskInfo)localIterator.next();
        JSONObject localJSONObject2 = new JSONObject();
        switch (localFileDownloadTaskInfo.status)
        {
        case 0:
        default:
          paramJSONArray = "default";
        case -1:
        case 1:
        case 3:
        case 2:
        case 4:
        }
        while (true)
        {
          try
          {
            localJSONObject2.put("download_id", localFileDownloadTaskInfo.id);
            localJSONObject2.put("state", paramJSONArray);
            if ((paramJSONArray == "downloading") && (localFileDownloadTaskInfo.jrb != 0L))
              localJSONObject2.put("progress", localFileDownloadTaskInfo.kNr / localFileDownloadTaskInfo.jrb * 100L);
            localJSONObject1.put(localFileDownloadTaskInfo.appId, localJSONObject2);
            localLinkedList.remove(localFileDownloadTaskInfo.appId);
          }
          catch (Exception paramJSONArray)
          {
            ab.e("MicroMsg.JsApiQueryDownloadTask", paramJSONArray.getMessage());
          }
          break;
          paramJSONArray = "api_not_support";
          continue;
          paramJSONArray = "downloading";
          continue;
          if (com.tencent.mm.a.e.ct(localFileDownloadTaskInfo.path))
          {
            paramJSONArray = "download_succ";
          }
          else
          {
            paramJSONArray = "default";
            continue;
            if ((localFileDownloadTaskInfo.kNt) && (!at.isWifi(ah.getContext())))
            {
              paramJSONArray = "download_wait_for_wifi";
            }
            else
            {
              paramJSONArray = "download_pause";
              continue;
              paramJSONArray = "download_fail";
            }
          }
        }
      }
      a(localJSONObject1, localLinkedList);
      paramJSONArray = new JSONObject();
    }
    try
    {
      paramJSONArray.put("result", localJSONObject1.toString());
      label344: parama.d(null, paramJSONArray);
      AppMethodBeat.o(136076);
      while (true)
      {
        return;
        ab.e("MicroMsg.JsApiQueryDownloadTask", "taskInfos is null");
        a(localJSONObject1, localLinkedList);
        paramJSONArray = new JSONObject();
        try
        {
          paramJSONArray.put("result", localJSONObject1.toString());
          label387: parama.d(null, paramJSONArray);
          AppMethodBeat.o(136076);
        }
        catch (JSONException localJSONException1)
        {
          break label387;
        }
      }
    }
    catch (JSONException localJSONException2)
    {
      break label344;
    }
  }

  private static void a(JSONObject paramJSONObject, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(136077);
    if (bo.ek(paramLinkedList))
      AppMethodBeat.o(136077);
    while (true)
    {
      return;
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        String str = (String)paramLinkedList.next();
        JSONObject localJSONObject = new JSONObject();
        try
        {
          localJSONObject.put("download_id", -1);
          localJSONObject.put("state", "default");
          paramJSONObject.put(str, localJSONObject);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.JsApiQueryDownloadTask", localException.getMessage());
        }
      }
      AppMethodBeat.o(136077);
    }
  }

  public final void a(Context paramContext, String paramString, bc.a parama)
  {
    AppMethodBeat.i(136074);
    ab.i("MicroMsg.JsApiQueryDownloadTask", "invokeInMM");
    try
    {
      paramContext = new org/json/JSONObject;
      paramContext.<init>(paramString);
      paramString = paramContext.optJSONArray("appIdArray");
      if ((paramString != null) && (paramString.length() > 0))
      {
        a(paramString, parama);
        AppMethodBeat.o(136074);
        return;
      }
    }
    catch (JSONException paramContext)
    {
      while (true)
      {
        ab.e("MicroMsg.JsApiQueryDownloadTask", "paras data error: " + paramContext.getMessage());
        parama.d("fail", null);
        AppMethodBeat.o(136074);
        continue;
        long l = paramContext.optLong("download_id", -1L);
        paramContext = paramContext.optString("appid");
        if (l > 0L)
        {
          paramString = d.bij().hm(l);
          paramContext = paramString;
          if (paramString == null)
            paramContext = new FileDownloadTaskInfo();
          a(paramContext, parama);
          AppMethodBeat.o(136074);
        }
        else if (!bo.isNullOrNil(paramContext))
        {
          paramString = d.bij().Ir(paramContext);
          paramContext = paramString;
          if (paramString == null)
            paramContext = new FileDownloadTaskInfo();
          a(paramContext, parama);
          AppMethodBeat.o(136074);
        }
        else
        {
          parama.d("fail", null);
          AppMethodBeat.o(136074);
        }
      }
    }
  }

  public final void b(a.a parama)
  {
  }

  public final int biG()
  {
    return 1;
  }

  public final String name()
  {
    return "queryDownloadTask";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.detail.a.e
 * JD-Core Version:    0.6.2
 */