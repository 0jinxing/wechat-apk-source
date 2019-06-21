package com.tencent.mm.plugin.gwallet.a;

import android.content.Intent;
import android.os.RemoteException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import org.json.JSONException;

public final class b$3
  implements Runnable
{
  public b$3(b paramb, String paramString, ak paramak, b.b paramb1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41696);
    c localc1 = new c(0, "Inventory refresh successful.");
    Intent localIntent = new Intent();
    try
    {
      int i = b.a(this.npQ, localIntent, this.npV);
      if (i != 0)
      {
        localc1 = new com/tencent/mm/plugin/gwallet/a/c;
        localc1.<init>(i, "Error refreshing inventory (querying owned items).");
      }
      localIntent.putExtra("RESPONSE_CODE", localc1.bFQ());
      this.mrz.post(new b.3.1(this, localc1, localIntent));
      AppMethodBeat.o(41696);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.IabHelper", localRemoteException, "", new Object[0]);
        c localc2 = new c(-1001, "Remote exception while refreshing inventory.");
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.IabHelper", localJSONException, "", new Object[0]);
        c localc3 = new c(-1002, "Error parsing JSON response while refreshing inventory.");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.a.b.3
 * JD-Core Version:    0.6.2
 */