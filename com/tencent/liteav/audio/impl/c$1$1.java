package com.tencent.liteav.audio.impl;

import android.telephony.PhoneStateListener;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

class c$1$1 extends PhoneStateListener
{
  c$1$1(c.1 param1)
  {
  }

  public void onCallStateChanged(int paramInt, String paramString)
  {
    AppMethodBeat.i(66544);
    super.onCallStateChanged(paramInt, paramString);
    TXCLog.i("AudioCenter:TXCTelephonyMgr", "onCallStateChanged:".concat(String.valueOf(paramInt)));
    c.a(this.a.a, paramInt);
    AppMethodBeat.o(66544);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.c.1.1
 * JD-Core Version:    0.6.2
 */