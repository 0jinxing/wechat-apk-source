package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import java.net.URLEncoder;

public class HandleScanResult$Req extends BaseReq
{
  private static final int MAX_URL_LENGHT = 10240;
  public String scanResult;

  public boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(128236);
    if ((this.scanResult == null) || (this.scanResult.length() < 0))
      AppMethodBeat.o(128236);
    while (true)
    {
      return bool;
      if (this.scanResult.length() > 10240)
      {
        AppMethodBeat.o(128236);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(128236);
      }
    }
  }

  public int getType()
  {
    return 17;
  }

  public void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128237);
    super.toBundle(paramBundle);
    paramBundle.putString("_wxapi_scan_qrcode_result", URLEncoder.encode(this.scanResult));
    AppMethodBeat.o(128237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.HandleScanResult.Req
 * JD-Core Version:    0.6.2
 */