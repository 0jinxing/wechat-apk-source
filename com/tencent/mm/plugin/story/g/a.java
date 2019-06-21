package com.tencent.mm.plugin.story.g;

import a.f.b.j;
import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONArray;
import org.json.JSONObject;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryBehaviorTraceData;", "", "()V", "traceJsonArray", "Lorg/json/JSONArray;", "addTrace", "", "aid", "", "checkLength", "", "trace", "Lorg/json/JSONObject;", "getTraceString", "", "plugin-story_release"})
public final class a
{
  private JSONArray sbg;

  public a()
  {
    AppMethodBeat.i(109763);
    this.sbg = new JSONArray();
    AppMethodBeat.o(109763);
  }

  public final void EU(int paramInt)
  {
    AppMethodBeat.i(109761);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("aid", paramInt);
    localJSONObject.put("td", this.sbg.length() + 1);
    if (this.sbg.toString().length() + localJSONObject.toString().length() > 1000);
    for (paramInt = 0; ; paramInt = 1)
    {
      if (paramInt != 0)
        this.sbg.put(localJSONObject);
      AppMethodBeat.o(109761);
      return;
    }
  }

  public final String czP()
  {
    AppMethodBeat.i(109762);
    String str = this.sbg.toString();
    j.o(str, "traceJsonArray.toString()");
    str = m.i(str, ",", ";", false);
    this.sbg = new JSONArray();
    AppMethodBeat.o(109762);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.a
 * JD-Core Version:    0.6.2
 */