package com.tencent.mm.plugin.topstory.ui.home;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import org.json.JSONArray;

final class d$1
  implements Runnable
{
  d$1(d paramd, int paramInt, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(1700);
    try
    {
      Object localObject = (String)this.sDk.sDh.get(Integer.valueOf(this.sDi));
      if (bo.isNullOrNil((String)localObject))
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
      }
      while (true)
      {
        ((JSONArray)localObject).put(this.sDj);
        this.sDk.bp(this.sDi, ((JSONArray)localObject).toString());
        ab.i("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId finish: %s, %s", new Object[] { Integer.valueOf(this.sDi), this.sDj });
        AppMethodBeat.o(1700);
        return;
        localObject = new JSONArray((String)localObject);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.TopStory.TopStoryWebViewMgr", "addNegDocId, exception: " + localException.getMessage());
        AppMethodBeat.o(1700);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.home.d.1
 * JD-Core Version:    0.6.2
 */