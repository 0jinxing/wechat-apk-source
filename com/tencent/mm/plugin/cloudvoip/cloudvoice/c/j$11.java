package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.telephony.PhoneStateListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$11 extends PhoneStateListener
{
  j$11(j paramj)
  {
  }

  public final void onCallStateChanged(int paramInt, String paramString)
  {
    AppMethodBeat.i(135528);
    super.onCallStateChanged(paramInt, paramString);
    switch (paramInt)
    {
    default:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(135528);
      return;
      this.kAJ.R(new j.11.1(this));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.11
 * JD-Core Version:    0.6.2
 */