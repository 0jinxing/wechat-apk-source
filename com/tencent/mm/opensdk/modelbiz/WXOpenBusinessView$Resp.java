package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.opensdk.modelbase.BaseResp;

public final class WXOpenBusinessView$Resp extends BaseResp
{
  public String businessType;
  public String extMsg;

  public WXOpenBusinessView$Resp()
  {
  }

  public WXOpenBusinessView$Resp(Bundle paramBundle)
  {
    AppMethodBeat.i(128206);
    fromBundle(paramBundle);
    AppMethodBeat.o(128206);
  }

  public final boolean checkArgs()
  {
    return true;
  }

  public final void fromBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128207);
    super.fromBundle(paramBundle);
    this.extMsg = paramBundle.getString("_openbusinessview_ext_msg");
    this.businessType = paramBundle.getString("_openbusinessview_business_type");
    AppMethodBeat.o(128207);
  }

  public final int getType()
  {
    return 26;
  }

  public final void toBundle(Bundle paramBundle)
  {
    AppMethodBeat.i(128208);
    super.toBundle(paramBundle);
    paramBundle.putString("_openbusinessview_ext_msg", this.extMsg);
    paramBundle.putString("_openbusinessview_business_type", this.businessType);
    AppMethodBeat.o(128208);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Resp
 * JD-Core Version:    0.6.2
 */