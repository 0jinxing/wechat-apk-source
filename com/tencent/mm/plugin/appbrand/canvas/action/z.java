package com.tencent.mm.plugin.appbrand.canvas.action;

import android.graphics.Canvas;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg;
import com.tencent.mm.plugin.appbrand.r.g;
import org.json.JSONArray;
import org.json.JSONException;

@Deprecated
public final class z
  implements d
{
  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, DrawActionArg paramDrawActionArg)
  {
    return false;
  }

  public final boolean a(com.tencent.mm.plugin.appbrand.canvas.d paramd, Canvas paramCanvas, JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103266);
    if (paramJSONArray.length() == 0)
      AppMethodBeat.o(103266);
    while (true)
    {
      return false;
      try
      {
        g.o(paramJSONArray);
        AppMethodBeat.o(103266);
      }
      catch (JSONException paramd)
      {
        while (true)
          com.tencent.luggage.g.d.i("MicroMsg.SetLineHeight", "get 'lineHeight' error");
      }
    }
  }

  public final BaseDrawActionArg ayf()
  {
    return null;
  }

  public final String getMethod()
  {
    return "setLineHeight";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.action.z
 * JD-Core Version:    0.6.2
 */