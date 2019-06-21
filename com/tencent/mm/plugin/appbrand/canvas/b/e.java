package com.tencent.mm.plugin.appbrand.canvas.b;

import android.graphics.Path;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg;
import com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArgWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
{
  public Map<String, a> hdS;

  public e()
  {
    AppMethodBeat.i(103677);
    this.hdS = new HashMap();
    a(new h());
    a(new f());
    a(new g());
    a(new i());
    a(new d());
    a(new b());
    a(new c());
    a(new j());
    AppMethodBeat.o(103677);
  }

  private void a(a parama)
  {
    AppMethodBeat.i(103682);
    this.hdS.put(parama.getMethod(), parama);
    AppMethodBeat.o(103682);
  }

  private boolean a(Path paramPath, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(103681);
    Object localObject = paramJSONObject.optString("method");
    paramJSONObject = paramJSONObject.optJSONArray("data");
    localObject = (a)this.hdS.get(localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      AppMethodBeat.o(103681);
    }
    while (true)
    {
      return bool;
      bool = ((a)localObject).a(paramPath, paramJSONObject);
      AppMethodBeat.o(103681);
    }
  }

  private boolean b(Path paramPath, BasePathActionArg paramBasePathActionArg)
  {
    AppMethodBeat.i(103679);
    Object localObject = paramBasePathActionArg.method;
    localObject = (a)this.hdS.get(localObject);
    boolean bool;
    if (localObject == null)
    {
      bool = false;
      AppMethodBeat.o(103679);
    }
    while (true)
    {
      return bool;
      bool = ((a)localObject).a(paramPath, paramBasePathActionArg);
      AppMethodBeat.o(103679);
    }
  }

  public final Path a(PathActionArgWrapper paramPathActionArgWrapper)
  {
    AppMethodBeat.i(103678);
    Path localPath = new Path();
    paramPathActionArgWrapper = paramPathActionArgWrapper.hdv;
    if ((paramPathActionArgWrapper == null) || (paramPathActionArgWrapper.size() == 0))
      AppMethodBeat.o(103678);
    while (true)
    {
      return localPath;
      Iterator localIterator = paramPathActionArgWrapper.iterator();
      while (localIterator.hasNext())
      {
        paramPathActionArgWrapper = (BasePathActionArg)localIterator.next();
        if (paramPathActionArgWrapper != null)
          b(localPath, paramPathActionArgWrapper);
      }
      AppMethodBeat.o(103678);
    }
  }

  public final Path g(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(103680);
    Path localPath = new Path();
    if ((paramJSONArray == null) || (paramJSONArray.length() == 0))
      AppMethodBeat.o(103680);
    while (true)
    {
      return localPath;
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        JSONObject localJSONObject = paramJSONArray.optJSONObject(i);
        if (localJSONObject != null)
          a(localPath, localJSONObject);
      }
      AppMethodBeat.o(103680);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.e
 * JD-Core Version:    0.6.2
 */