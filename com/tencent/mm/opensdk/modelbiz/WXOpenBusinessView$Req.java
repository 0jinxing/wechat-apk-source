package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;
import com.tencent.mm.opensdk.utils.d;

public final class WXOpenBusinessView$Req extends BaseReq
{
  private static final String TAG = "MicroMsg.SDK.WXOpenBusinessView.Req";
  public String businessType;
  public String extInfo;
  public String query;

  public final boolean checkArgs()
  {
    AppMethodBeat.i(128178);
    boolean bool;
    if (d.b(this.businessType))
    {
      Log.e("MicroMsg.SDK.WXOpenBusinessView.Req", "businessType is null");
      bool = false;
      AppMethodBeat.o(128178);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(128178);
    }
  }

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128180);
    super.fromBundle(paramBundle);
    this.businessType = paramBundle.getString("_openbusinessview_businessType");
    this.query = paramBundle.getString("_openbusinessview__query_info");
    this.extInfo = paramBundle.getString("_openbusinessview_extInfo");
    AppMethodBeat.o(128180);
  }

  public final int getType()
  {
    return 26;
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128179);
    super.toBundle(paramBundle);
    paramBundle.putString("_openbusinessview_businessType", this.businessType);
    paramBundle.putString("_openbusinessview__query_info", this.query);
    paramBundle.putString("_openbusinessview_extInfo", this.extInfo);
    AppMethodBeat.o(128179);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Req
 * JD-Core Version:    0.6.2
 */