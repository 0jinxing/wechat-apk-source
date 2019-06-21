package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class HandleScanResult$Resp extends BaseResp
{
  public HandleScanResult$Resp()
  {
  }

  public HandleScanResult$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128231);
    fromBundle(paramBundle);
    AppMethodBeat.o(128231);
  }

  public boolean checkArgs()
  {
    return true;
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128232);
    super.fromBundle(paramBundle);
    AppMethodBeat.o(128232);
  }

  public int getType()
  {
    return 17;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128233);
    super.toBundle(paramBundle);
    AppMethodBeat.o(128233);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.HandleScanResult.Resp
 * JD-Core Version:    0.6.2
 */