package com.facebook;

import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

class GraphRequest$4
  implements GraphRequest.Callback
{
  GraphRequest$4(GraphRequest paramGraphRequest, GraphRequest.Callback paramCallback)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(71643);
    Object localObject1 = paramGraphResponse.getJSONObject();
    JSONArray localJSONArray;
    label32: int i;
    label39: label69: Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = ((JSONObject)localObject1).optJSONObject("__debug__");
      if (localObject1 == null)
        break label184;
      localJSONArray = ((JSONObject)localObject1).optJSONArray("messages");
      if (localJSONArray == null)
        break label206;
      i = 0;
      if (i >= localJSONArray.length())
        break label206;
      localObject2 = localJSONArray.optJSONObject(i);
      if (localObject2 == null)
        break label189;
      localObject1 = ((JSONObject)localObject2).optString("message");
      if (localObject2 == null)
        break label194;
      localObject3 = ((JSONObject)localObject2).optString("type");
      label83: if (localObject2 == null)
        break label200;
    }
    label184: label189: label194: label200: for (Object localObject2 = ((JSONObject)localObject2).optString("link"); ; localObject2 = null)
    {
      if ((localObject1 != null) && (localObject3 != null))
      {
        LoggingBehavior localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_INFO;
        if (((String)localObject3).equals("warning"))
          localLoggingBehavior = LoggingBehavior.GRAPH_API_DEBUG_WARNING;
        localObject3 = localObject1;
        if (!Utility.isNullOrEmpty((String)localObject2))
          localObject3 = (String)localObject1 + " Link: " + (String)localObject2;
        Logger.log(localLoggingBehavior, GraphRequest.TAG, (String)localObject3);
      }
      i++;
      break label39;
      localObject1 = null;
      break;
      localJSONArray = null;
      break label32;
      localObject1 = null;
      break label69;
      localObject3 = null;
      break label83;
    }
    label206: if (this.val$callback != null)
      this.val$callback.onCompleted(paramGraphResponse);
    AppMethodBeat.o(71643);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.GraphRequest.4
 * JD-Core Version:    0.6.2
 */