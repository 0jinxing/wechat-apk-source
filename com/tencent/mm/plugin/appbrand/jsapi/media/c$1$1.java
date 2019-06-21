package com.tencent.mm.plugin.appbrand.jsapi.media;

import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.choosemsgfile.compat.MsgFile;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class c$1$1
  implements Runnable
{
  c$1$1(c.1 param1, ArrayList paramArrayList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131214);
    JSONArray localJSONArray = new JSONArray();
    Object localObject1 = this.hPA.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      MsgFile localMsgFile = (MsgFile)((Iterator)localObject1).next();
      Object localObject2;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        if ((bo.isNullOrNil(localMsgFile.filePath)) || (!e.ct(localMsgFile.filePath)))
          break label242;
        localObject2 = new java/io/File;
        ((File)localObject2).<init>(localMsgFile.filePath);
        com.tencent.mm.plugin.appbrand.r.j localj = new com/tencent/mm/plugin/appbrand/r/j;
        localj.<init>();
        localObject2 = this.hPB.hIt.asE().a((File)localObject2, localMsgFile.eov, false, localj);
        if (localObject2 != com.tencent.mm.plugin.appbrand.appstorage.j.gXA)
          break label219;
        localJSONObject.put("path", localj.value);
        localJSONObject.put("name", localMsgFile.fileName);
        localJSONObject.put("size", localMsgFile.fileSize);
        localJSONObject.put("type", localMsgFile.type);
        localJSONObject.put("time", localMsgFile.timeStamp);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException2)
      {
        d.printErrStackTrace("MicroMsg.JsApiChooseMessageFile", localJSONException2, "", new Object[0]);
      }
      continue;
      label219: d.e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s result:%s", new Object[] { localMsgFile, localObject2 });
      continue;
      label242: d.e("MicroMsg.JsApiChooseMessageFile", "msgFile:%s is not exist", new Object[] { localMsgFile.filePath });
    }
    localObject1 = new JSONObject();
    try
    {
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      ((JSONObject)localObject1).put("errMsg", this.hPB.hPz.getName() + ":ok");
      ((JSONObject)localObject1).put("tempFiles", localJSONArray);
      d.i("MicroMsg.JsApiChooseMessageFile", "chooseMessageFile:%s", new Object[] { ((JSONObject)localObject1).toString() });
      this.hPB.hIt.M(this.hPB.eIl, ((JSONObject)localObject1).toString());
      AppMethodBeat.o(131214);
      return;
    }
    catch (JSONException localJSONException1)
    {
      while (true)
        d.printErrStackTrace("MicroMsg.JsApiChooseMessageFile", localJSONException1, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.media.c.1.1
 * JD-Core Version:    0.6.2
 */