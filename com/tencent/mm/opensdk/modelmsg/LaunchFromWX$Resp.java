package com.tencent.mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public class LaunchFromWX$Resp extends BaseResp
{
  public LaunchFromWX$Resp()
  {
  }

  public LaunchFromWX$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128262);
    fromBundle(paramBundle);
    AppMethodBeat.o(128262);
  }

  public boolean checkArgs()
  {
    return true;
  }

  public int getType()
  {
    return 6;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelmsg.LaunchFromWX.Resp
 * JD-Core Version:    0.6.2
 */