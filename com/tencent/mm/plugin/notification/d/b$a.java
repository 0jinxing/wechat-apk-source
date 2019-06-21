package com.tencent.mm.plugin.notification.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.notification.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b$a
{
  public b oVT;
  public int oVU;
  public ArrayList<Long> oVV;
  public ArrayList<Long> oVW;

  public b$a()
  {
    AppMethodBeat.i(23120);
    this.oVT = new b();
    this.oVV = new ArrayList();
    this.oVW = new ArrayList();
    AppMethodBeat.o(23120);
  }

  public b$a(b paramb, int paramInt, ArrayList<Long> paramArrayList1, ArrayList<Long> paramArrayList2)
  {
    AppMethodBeat.i(23121);
    this.oVT = new b();
    this.oVV = new ArrayList();
    this.oVW = new ArrayList();
    this.oVT = paramb;
    this.oVU = paramInt;
    this.oVV = paramArrayList1;
    this.oVW = paramArrayList2;
    AppMethodBeat.o(23121);
  }

  public final void TT(String paramString)
  {
    AppMethodBeat.i(23123);
    ab.d("MicroMsg.FailMsgFileCache", "CacheObj, createFromFileContent");
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.FailMsgFileCache", "[createFromFileContent] content is null! stack:%s", new Object[] { bo.dpG() });
      AppMethodBeat.o(23123);
    }
    while (true)
    {
      return;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(paramString);
        JSONArray localJSONArray1 = localJSONObject.getJSONArray("msg_list");
        JSONArray localJSONArray2 = localJSONObject.getJSONArray("fail_msg_list");
        JSONArray localJSONArray3 = localJSONObject.getJSONArray("success_msg_list");
        int i = localJSONObject.getInt("current_send_index");
        ab.d("MicroMsg.FailMsgFileCache", "createFromFileContent, msgArray.size:%d, failArray.size:%d, successArray.size:%d, index:%d", new Object[] { Integer.valueOf(localJSONArray1.length()), Integer.valueOf(localJSONArray2.length()), Integer.valueOf(localJSONArray3.length()), Integer.valueOf(i) });
        this.oVT.clear();
        this.oVW.clear();
        this.oVV.clear();
        for (int j = 0; j < localJSONArray1.length(); j++)
          this.oVT.js(localJSONArray1.getLong(j));
        for (j = 0; j < localJSONArray2.length(); j++)
          this.oVW.add(Long.valueOf(localJSONArray2.getLong(j)));
        for (j = 0; j < localJSONArray3.length(); j++)
          this.oVV.add(Long.valueOf(localJSONArray3.getLong(j)));
        this.oVU = i;
        AppMethodBeat.o(23123);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.FailMsgFileCache", localException, paramString, new Object[0]);
        AppMethodBeat.o(23123);
      }
    }
  }

  public final String bWO()
  {
    AppMethodBeat.i(23122);
    ab.d("MicroMsg.FailMsgFileCache", "CacheObj, serializeToString");
    Object localObject1;
    Object localObject2;
    String str;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
      for (int i = 0; i < this.oVT.oVR.size(); i++)
        ((JSONArray)localObject1).put(this.oVT.get(i));
      ab.d("MicroMsg.FailMsgFileCache", "serializeToString, msgArray.size:%d", new Object[] { Integer.valueOf(((JSONArray)localObject1).length()) });
      localJSONObject.put("msg_list", localObject1);
      ab.d("MicroMsg.FailMsgFileCache", "serializeToString, currentSendIndex:%d", new Object[] { Integer.valueOf(this.oVU) });
      localJSONObject.put("current_send_index", this.oVU);
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>();
      localObject1 = this.oVV.iterator();
      while (((Iterator)localObject1).hasNext())
        ((JSONArray)localObject2).put((Long)((Iterator)localObject1).next());
    }
    catch (JSONException localJSONException)
    {
      ab.printErrStackTrace("MicroMsg.FailMsgFileCache", localJSONException, "", new Object[0]);
      str = null;
      AppMethodBeat.o(23122);
    }
    while (true)
    {
      return str;
      ab.d("MicroMsg.FailMsgFileCache", "serializeToString, successArray.size:%d", new Object[] { Integer.valueOf(((JSONArray)localObject2).length()) });
      str.put("success_msg_list", localObject2);
      localObject1 = new org/json/JSONArray;
      ((JSONArray)localObject1).<init>();
      localObject2 = this.oVW.iterator();
      while (((Iterator)localObject2).hasNext())
        ((JSONArray)localObject1).put((Long)((Iterator)localObject2).next());
      ab.d("MicroMsg.FailMsgFileCache", "serializeToString, failArray.size:%d", new Object[] { Integer.valueOf(((JSONArray)localObject1).length()) });
      str.put("fail_msg_list", localObject1);
      str = str.toString();
      AppMethodBeat.o(23122);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.notification.d.b.a
 * JD-Core Version:    0.6.2
 */