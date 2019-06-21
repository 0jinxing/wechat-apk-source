package com.tencent.mm.plugin.webview.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.webview.stub.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;

public final class aq$g
{
  public int errCode;
  public SnsAdClick pmI;
  private ArrayList<String> unj;

  public aq$g()
  {
    AppMethodBeat.i(6764);
    this.unj = new ArrayList();
    AppMethodBeat.o(6764);
  }

  public final void L(String[] paramArrayOfString)
  {
    AppMethodBeat.i(6765);
    for (int i = 0; i < 3; i++)
    {
      String str = paramArrayOfString[i];
      this.unj.add(str);
    }
    AppMethodBeat.o(6765);
  }

  public final void b(d paramd)
  {
    AppMethodBeat.i(6766);
    try
    {
      if (!this.unj.isEmpty())
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putStringArrayList("reportAdH5Load", this.unj);
        localBundle.putInt("errCode", this.errCode);
        localBundle.putParcelable("snsAdClick", this.pmI);
        paramd.g(204, localBundle);
      }
      this.pmI = null;
      this.unj.clear();
      AppMethodBeat.o(6766);
      return;
    }
    catch (Exception paramd)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WebviewReporter", paramd, "", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.aq.g
 * JD-Core Version:    0.6.2
 */