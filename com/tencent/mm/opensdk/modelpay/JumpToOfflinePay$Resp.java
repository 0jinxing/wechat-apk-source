package com.tencent.mm.opensdk.modelpay;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class JumpToOfflinePay$Resp extends BaseResp
{
  public JumpToOfflinePay$Resp()
  {
  }

  public JumpToOfflinePay$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128145);
    fromBundle(paramBundle);
    AppMethodBeat.o(128145);
  }

  public boolean checkArgs()
  {
    return true;
  }

  public void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128147);
    super.fromBundle(paramBundle);
    AppMethodBeat.o(128147);
  }

  public int getType()
  {
    return 24;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128146);
    super.toBundle(paramBundle);
    AppMethodBeat.o(128146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelpay.JumpToOfflinePay.Resp
 * JD-Core Version:    0.6.2
 */