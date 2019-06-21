package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class ShowMessageFromWX$Resp extends BaseResp
{
  public ShowMessageFromWX$Resp()
  {
  }

  public ShowMessageFromWX$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128257);
    fromBundle(paramBundle);
    AppMethodBeat.o(128257);
  }

  public boolean checkArgs()
  {
    return true;
  }

  public int getType()
  {
    return 4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX.Resp
 * JD-Core Version:    0.6.2
 */