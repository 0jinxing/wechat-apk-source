package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JsApiQueryDownloadTask$QueryDownloadTask extends MainProcessTask
{
  public static final Parcelable.Creator<QueryDownloadTask> CREATOR;
  private int bOs;
  private q gNC;
  private m hxE;
  private boolean hxM;
  private String hxN;
  private long hxO;
  private JSONArray hzO;
  private JSONArray hzP;
  private JSONArray hzQ;
  private String hzR;
  private long hzS;

  static
  {
    AppMethodBeat.i(130709);
    CREATOR = new JsApiQueryDownloadTask.QueryDownloadTask.1();
    AppMethodBeat.o(130709);
  }

  public JsApiQueryDownloadTask$QueryDownloadTask(Parcel paramParcel)
  {
    AppMethodBeat.i(130701);
    g(paramParcel);
    AppMethodBeat.o(130701);
  }

  public JsApiQueryDownloadTask$QueryDownloadTask(m paramm, q paramq, int paramInt, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(130700);
    aBV();
    this.hxE = paramm;
    this.gNC = paramq;
    this.bOs = paramInt;
    this.hxO = paramJSONObject.optLong("downloadId");
    this.hzO = paramJSONObject.optJSONArray("downloadIdArray");
    this.hzP = paramJSONObject.optJSONArray("appIdArray");
    this.hxM = true;
    AppMethodBeat.o(130700);
  }

  private JSONObject a(long paramLong, FileDownloadTaskInfo paramFileDownloadTaskInfo)
  {
    AppMethodBeat.i(130703);
    JSONObject localJSONObject = a(paramFileDownloadTaskInfo);
    if (paramFileDownloadTaskInfo != null);
    try
    {
      localJSONObject.put("downloadId", paramLong);
      AppMethodBeat.o(130703);
      return localJSONObject;
    }
    catch (JSONException paramFileDownloadTaskInfo)
    {
      while (true)
        ab.e("MicroMsg.JsApiQueryDownloadTask", paramFileDownloadTaskInfo.getMessage());
    }
  }

  private JSONObject a(FileDownloadTaskInfo paramFileDownloadTaskInfo)
  {
    long l1 = 0L;
    AppMethodBeat.i(130705);
    JSONObject localJSONObject = new JSONObject();
    String str1;
    switch (paramFileDownloadTaskInfo.status)
    {
    case 0:
    default:
      str1 = "default";
    case -1:
    case 1:
    case 3:
    case 2:
    case 4:
    }
    while (true)
    {
      ab.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", new Object[] { str1 });
      String str2 = str1;
      if (paramFileDownloadTaskInfo.kNt)
      {
        str2 = str1;
        if (!at.isWifi(ah.getContext()))
        {
          str2 = str1;
          if (paramFileDownloadTaskInfo.status != 3)
          {
            str2 = str1;
            if (paramFileDownloadTaskInfo.status != 1)
              str2 = "download_wait_wifi";
          }
        }
      }
      long l2;
      if (str2 != "downloading")
      {
        l2 = l1;
        if (str2 != "download_pause");
      }
      else
      {
        l2 = l1;
        if (paramFileDownloadTaskInfo.jrb != 0L)
          l2 = ()((float)paramFileDownloadTaskInfo.kNr / (float)paramFileDownloadTaskInfo.jrb * 100.0F);
      }
      try
      {
        localJSONObject.put("appId", paramFileDownloadTaskInfo.appId);
        localJSONObject.put("downloadId", paramFileDownloadTaskInfo.id);
        localJSONObject.put("state", str2);
        localJSONObject.put("progress", l2);
        AppMethodBeat.o(130705);
        while (true)
        {
          return localJSONObject;
          this.hxN = "fail_apilevel_too_low";
          AppMethodBeat.o(130705);
        }
        str1 = "downloading";
        continue;
        if (e.ct(paramFileDownloadTaskInfo.path))
        {
          str1 = "download_succ";
          continue;
        }
        str1 = "default";
        continue;
        str1 = "download_pause";
        continue;
        str1 = "download_fail";
      }
      catch (JSONException paramFileDownloadTaskInfo)
      {
        while (true)
          ab.e("MicroMsg.JsApiQueryDownloadTask", paramFileDownloadTaskInfo.getMessage());
      }
    }
  }

  private JSONObject a(String paramString, FileDownloadTaskInfo paramFileDownloadTaskInfo)
  {
    AppMethodBeat.i(130704);
    paramFileDownloadTaskInfo = a(paramFileDownloadTaskInfo);
    try
    {
      paramFileDownloadTaskInfo.put("appId", paramString);
      AppMethodBeat.o(130704);
      return paramFileDownloadTaskInfo;
    }
    catch (JSONException paramString)
    {
      while (true)
        ab.e("MicroMsg.JsApiQueryDownloadTask", paramString.getMessage());
    }
  }

  public final void asP()
  {
    AppMethodBeat.i(130702);
    ab.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, downloadId = %d", new Object[] { Long.valueOf(this.hxO) });
    int i;
    if ((this.hzO != null) && (this.hzO.length() > 0))
    {
      this.hzQ = new JSONArray();
      for (i = 0; i < this.hzO.length(); i++)
      {
        long l = this.hzO.optLong(i);
        localObject = d.bij().hm(l);
        this.hzQ.put(a(l, (FileDownloadTaskInfo)localObject));
      }
      this.hxM = false;
    }
    while (true)
    {
      aCb();
      AppMethodBeat.o(130702);
      return;
      if ((this.hzP != null) && (this.hzP.length() > 0))
      {
        this.hzQ = new JSONArray();
        for (i = 0; i < this.hzP.length(); i++)
        {
          localObject = this.hzP.optString(i);
          FileDownloadTaskInfo localFileDownloadTaskInfo = d.bij().Ir((String)localObject);
          this.hzQ.put(a((String)localObject, localFileDownloadTaskInfo));
        }
        this.hxM = false;
      }
      else
      {
        if (this.hxO > 0L)
          break;
        this.hxN = "downloadId invalid";
      }
    }
    Object localObject = d.bij().hm(this.hxO);
    if ((((FileDownloadTaskInfo)localObject).kNt) && (((FileDownloadTaskInfo)localObject).status != 1) && (((FileDownloadTaskInfo)localObject).status != 3))
      this.hzR = "download_wait_wifi";
    switch (((FileDownloadTaskInfo)localObject).status)
    {
    case 0:
    default:
      this.hzR = "default";
    case -1:
    case 1:
    case 3:
    case 2:
    case 4:
    }
    while (true)
    {
      ab.i("MicroMsg.JsApiQueryDownloadTask", "doQueryDownloadTask, state = %s", new Object[] { this.hzR });
      if (((this.hzR == "downloading") || (this.hzR == "download_pause")) && (((FileDownloadTaskInfo)localObject).jrb != 0L))
        this.hzS = (()((float)((FileDownloadTaskInfo)localObject).kNr / (float)((FileDownloadTaskInfo)localObject).jrb * 100.0F));
      if ((((FileDownloadTaskInfo)localObject).kNt) && (!at.isWifi(ah.getContext())) && (((FileDownloadTaskInfo)localObject).status != 3) && (((FileDownloadTaskInfo)localObject).status != 1))
        this.hzR = "download_wait_wifi";
      this.hxM = false;
      break;
      this.hxN = "fail_apilevel_too_low";
      break;
      this.hzR = "downloading";
      continue;
      if (e.ct(((FileDownloadTaskInfo)localObject).path))
      {
        this.hzR = "download_succ";
      }
      else
      {
        this.hzR = "default";
        continue;
        this.hzR = "download_pause";
        continue;
        this.hzR = "download_fail";
      }
    }
  }

  public final void asQ()
  {
    AppMethodBeat.i(130706);
    aBW();
    boolean bool;
    if (this.gNC == null)
    {
      bool = true;
      ab.d("MicroMsg.JsApiQueryDownloadTask", "callback, service is null: %b", new Object[] { Boolean.valueOf(bool) });
      if (!this.hxM)
        break label109;
      if (!bo.isNullOrNil(this.hxN))
        break label88;
    }
    label88: for (Object localObject = "fail"; ; localObject = String.format("fail:%s", new Object[] { this.hxN }))
    {
      this.gNC.M(this.bOs, this.hxE.j((String)localObject, null));
      AppMethodBeat.o(130706);
      return;
      bool = false;
      break;
    }
    label109: localObject = new HashMap();
    if (this.hzQ != null)
      ((Map)localObject).put("result", this.hzQ);
    while (true)
    {
      this.gNC.M(this.bOs, this.hxE.j("ok", (Map)localObject));
      AppMethodBeat.o(130706);
      break;
      ((Map)localObject).put("downloadId", Long.valueOf(this.hxO));
      ((Map)localObject).put("state", this.hzR);
      ((Map)localObject).put("progress", Long.valueOf(this.hzS));
    }
  }

  public final void g(Parcel paramParcel)
  {
    boolean bool = true;
    AppMethodBeat.i(130707);
    this.hxO = paramParcel.readLong();
    if (paramParcel.readInt() == 1);
    while (true)
    {
      this.hxM = bool;
      this.hxN = paramParcel.readString();
      this.hzR = paramParcel.readString();
      this.hzS = paramParcel.readLong();
      Object localObject1 = paramParcel.readString();
      Object localObject2 = paramParcel.readString();
      paramParcel = paramParcel.readString();
      if (localObject1 != null);
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject1);
        this.hzO = localJSONArray;
        if (localObject2 != null)
        {
          localObject1 = new org/json/JSONArray;
          ((JSONArray)localObject1).<init>((String)localObject2);
          this.hzP = ((JSONArray)localObject1);
        }
        if (paramParcel != null)
        {
          localObject2 = new org/json/JSONArray;
          ((JSONArray)localObject2).<init>(paramParcel);
          this.hzQ = ((JSONArray)localObject2);
        }
        AppMethodBeat.o(130707);
        return;
        bool = false;
      }
      catch (JSONException paramParcel)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.JsApiQueryDownloadTask", paramParcel, "", new Object[0]);
          AppMethodBeat.o(130707);
        }
      }
    }
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(130708);
    paramParcel.writeLong(this.hxO);
    if (this.hxM)
    {
      paramInt = 1;
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.hxN);
      paramParcel.writeString(this.hzR);
      paramParcel.writeLong(this.hzS);
      if (this.hzO == null)
        break label135;
      localObject2 = this.hzO.toString();
      label70: paramParcel.writeString((String)localObject2);
      if (this.hzP == null)
        break label141;
    }
    label135: label141: for (Object localObject2 = this.hzP.toString(); ; localObject2 = null)
    {
      paramParcel.writeString((String)localObject2);
      localObject2 = localObject1;
      if (this.hzQ != null)
        localObject2 = this.hzQ.toString();
      paramParcel.writeString((String)localObject2);
      AppMethodBeat.o(130708);
      return;
      paramInt = 0;
      break;
      localObject2 = null;
      break label70;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask.QueryDownloadTask
 * JD-Core Version:    0.6.2
 */