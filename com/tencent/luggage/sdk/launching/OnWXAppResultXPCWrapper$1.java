package com.tencent.luggage.sdk.launching;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.luggage.g.d;
import com.tencent.matrix.trace.core.AppMethodBeat;

class OnWXAppResultXPCWrapper$1 extends ResultReceiver
{
  OnWXAppResultXPCWrapper$1(OnWXAppResultXPCWrapper paramOnWXAppResultXPCWrapper, Handler paramHandler, b paramb)
  {
    super(paramHandler);
  }

  protected void onReceiveResult(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(101669);
    if (paramBundle == null)
    {
      this.bRg.a(null);
      AppMethodBeat.o(101669);
    }
    while (true)
    {
      return;
      paramBundle.setClassLoader(OnWXAppResultXPCWrapper.SafeParcelableWrapper.class.getClassLoader());
      try
      {
        this.bRg.a(OnWXAppResultXPCWrapper.SafeParcelableWrapper.a((OnWXAppResultXPCWrapper.SafeParcelableWrapper)paramBundle.getParcelable("parcel")));
        AppMethodBeat.o(101669);
      }
      catch (NullPointerException paramBundle)
      {
        d.e("Luggage.WxaSDK.OnWXAppResultXPCWrapper", "onReceiveResult, e = %s", new Object[] { paramBundle });
        this.bRg.a(null);
        AppMethodBeat.o(101669);
      }
      catch (ClassCastException paramBundle)
      {
        label64: break label64;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.luggage.sdk.launching.OnWXAppResultXPCWrapper.1
 * JD-Core Version:    0.6.2
 */