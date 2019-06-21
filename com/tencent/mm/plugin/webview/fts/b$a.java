package com.tencent.mm.plugin.webview.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.sns.b.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class b$a
  implements Runnable
{
  public String data;
  public boolean ufy;

  private b$a(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(5681);
    ArrayList localArrayList = new ArrayList();
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(this.data);
      for (int i = 0; i < localJSONArray.length(); i++)
      {
        Object localObject = ((m)com.tencent.mm.kernel.g.K(m.class)).tC(localJSONArray.getString(i));
        com.tencent.mm.kernel.g.RQ();
        localObject = com.tencent.mm.aw.g.a(com.tencent.mm.kernel.g.RP().eJM, (TimeLineObject)localObject, 9);
        if (localObject != null)
          localArrayList.add(localObject);
      }
    }
    catch (Exception localException)
    {
      ab.printErrStackTrace("MicroMsg.FTS.FTSWebViewLogic", localException, "", new Object[0]);
      AppMethodBeat.o(5681);
    }
    while (true)
    {
      return;
      if ((!this.ufy) || (this.ufq.ufn == null))
      {
        this.ufq.ufn = localArrayList;
        AppMethodBeat.o(5681);
      }
      else
      {
        this.ufq.ufn.addAll(localArrayList);
        AppMethodBeat.o(5681);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.b.a
 * JD-Core Version:    0.6.2
 */