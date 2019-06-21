package com.tencent.mm.ui.f.a;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$2
  implements GraphRequest.Callback
{
  d$2(d paramd, d.a parama)
  {
  }

  public final void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(80313);
    if (paramGraphResponse != null);
    while (true)
    {
      try
      {
        paramGraphResponse = paramGraphResponse.getJSONObject();
        this.zxO.g(paramGraphResponse);
        AppMethodBeat.o(80313);
        return;
      }
      catch (Exception paramGraphResponse)
      {
        this.zxO.onError("Retrieve Failed, Error Format!");
        AppMethodBeat.o(80313);
        continue;
      }
      this.zxO.onError("Retrieve Failed, No response!");
      AppMethodBeat.o(80313);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.d.2
 * JD-Core Version:    0.6.2
 */