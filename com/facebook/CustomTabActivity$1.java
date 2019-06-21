package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class CustomTabActivity$1 extends BroadcastReceiver
{
  CustomTabActivity$1(CustomTabActivity paramCustomTabActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(96576);
    this.this$0.finish();
    AppMethodBeat.o(96576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.CustomTabActivity.1
 * JD-Core Version:    0.6.2
 */