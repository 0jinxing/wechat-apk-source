package com.tencent.mm.storage.emotion;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xwalk.core.Log;

public final class u extends k
{
  public HashMap<String, t> ybh;

  public final void axQ()
  {
    AppMethodBeat.i(62894);
    g.RP().Ry().set(ac.a.xVt, null);
    this.ybh = new HashMap();
    AppMethodBeat.o(62894);
  }

  public final List<t> bjY()
  {
    AppMethodBeat.i(62893);
    if (this.ybh == null)
      dvl();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.ybh.values().iterator();
    while (localIterator.hasNext())
    {
      t localt = (t)localIterator.next();
      if ((localt.position >= 0) && (localt.position < com.tencent.mm.cb.e.dqK().aRt()))
        localArrayList.add(localt);
    }
    Collections.sort(localArrayList, new u.1(this));
    AppMethodBeat.o(62893);
    return localArrayList;
  }

  public final void dvl()
  {
    AppMethodBeat.i(62892);
    Object localObject = (String)g.RP().Ry().get(ac.a.xVt, "");
    this.ybh = new HashMap();
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>((String)localObject);
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        t localt = new com/tencent/mm/storage/emotion/t;
        localt.<init>();
        localObject = localJSONArray.getJSONObject(i);
        localt.key = ((JSONObject)localObject).optString("key", "");
        localt.position = ((JSONObject)localObject).optInt("position", 0);
        localt.ybg = ((JSONObject)localObject).optInt("use_count", 0);
        localt.eRt = ((JSONObject)localObject).optLong("last_time", 0L);
        this.ybh.put(localt.key, localt);
      }
      AppMethodBeat.o(62892);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        Log.w("SmileyUsageInfoStorage", "data error clear all");
        axQ();
        AppMethodBeat.o(62892);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.emotion.u
 * JD-Core Version:    0.6.2
 */