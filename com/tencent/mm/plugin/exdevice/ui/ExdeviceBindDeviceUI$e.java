package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

 enum ExdeviceBindDeviceUI$e
{
  static
  {
    AppMethodBeat.i(19855);
    lzt = new e("SCAN_ALL", 0);
    lzu = new e("SCAN_MY_DEVICE", 1);
    lzv = new e("SCAN_CATALOG", 2);
    lzw = new e[] { lzt, lzu, lzv };
    AppMethodBeat.o(19855);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.e
 * JD-Core Version:    0.6.2
 */