package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.topstory.a.c.j;
import com.tencent.mm.protocal.protobuf.cve;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class n$1$1
  implements Runnable
{
  n$1$1(n.1 param1, j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1756);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(this.sFf.cFt().vOy);
      localObject = ((JSONObject)localObject).optJSONArray("data");
      if ((localObject != null) && (((JSONArray)localObject).length() > 0))
      {
        List localList = n.b(this.sFg.sFe.sDo.cGb(), (JSONArray)localObject);
        localObject = new com/tencent/mm/plugin/topstory/ui/video/n$1$1$1;
        ((n.1.1.1)localObject).<init>(this, localList);
        al.d((Runnable)localObject);
        AppMethodBeat.o(1756);
      }
      while (true)
      {
        return;
        ab.i("MicroMsg.TopStory.TopStoryVideoDataMgr", "Fail insert. code=json data error");
        AppMethodBeat.o(1756);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.TopStory.TopStoryVideoDataMgr", "Fail insert. code=" + localException.getMessage());
        AppMethodBeat.o(1756);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.n.1.1
 * JD-Core Version:    0.6.2
 */