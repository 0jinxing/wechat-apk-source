package com.tencent.mm.model.gdpr;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;

class MPGdprPolicyUtil$1$1 extends ResultReceiver
{
  MPGdprPolicyUtil$1$1(c.1 param1, Handler paramHandler)
  {
    super(paramHandler);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(1488);
    paramBundle = this.fos.foq;
    if (paramInt > 0);
    for (paramInt = 0; ; paramInt = 1)
    {
      paramBundle.kL(paramInt);
      AppMethodBeat.o(1488);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.MPGdprPolicyUtil.1.1
 * JD-Core Version:    0.6.2
 */