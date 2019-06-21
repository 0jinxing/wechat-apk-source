package com.tencent.wework.api.model;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class WWMediaLocation extends WWMediaMessage.WWMediaObject
{
  public double ALG;
  public String fBg;
  public double latitude;
  public double longitude;

  public final boolean checkArgs()
  {
    boolean bool = false;
    AppMethodBeat.i(80503);
    if (!super.checkArgs())
      AppMethodBeat.o(80503);
    while (true)
    {
      return bool;
      if ((this.fBg != null) && (this.fBg.length() != 0) && (this.fBg.length() <= 10240))
      {
        bool = true;
        AppMethodBeat.o(80503);
      }
      else
      {
        AppMethodBeat.o(80503);
      }
    }
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(80504);
    paramBundle.putString("_wwlocobject_address", this.fBg);
    paramBundle.putDouble("_wwlocobject_longitude", this.longitude);
    paramBundle.putDouble("_wwlocobject_latitude", this.latitude);
    paramBundle.putDouble("_wwlocobject_zoom", this.ALG);
    super.toBundle(paramBundle);
    AppMethodBeat.o(80504);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.wework.api.model.WWMediaLocation
 * JD-Core Version:    0.6.2
 */