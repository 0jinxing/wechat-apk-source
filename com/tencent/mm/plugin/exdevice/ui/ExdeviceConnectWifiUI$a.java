package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class ExdeviceConnectWifiUI$a
{
  public static String av(int paramInt, String paramString)
  {
    AppMethodBeat.i(19892);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(19892);
    }
    while (true)
    {
      return paramString;
      paramString = paramInt + "@" + paramString.hashCode();
      AppMethodBeat.o(19892);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceConnectWifiUI.a
 * JD-Core Version:    0.6.2
 */