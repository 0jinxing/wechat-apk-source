package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.asr;
import com.tencent.mm.protocal.protobuf.bbv;

final class ExdeviceBindDeviceUI$f
{
  public String lyG;
  public ExdeviceBindDeviceUI.d lzA;
  public asq lzB;
  public asr lzC;
  public int lzD;
  public bbv lzE;
  public String lzF;
  public boolean lzx = false;
  public ExdeviceBindDeviceUI.b lzy = ExdeviceBindDeviceUI.b.lzp;
  public ExdeviceBindDeviceUI.c lzz;

  private ExdeviceBindDeviceUI$f(ExdeviceBindDeviceUI paramExdeviceBindDeviceUI)
  {
  }

  public final String bpF()
  {
    String str;
    if (this.lzy == ExdeviceBindDeviceUI.b.lzp)
      if (this.lzC == null)
        str = null;
    while (true)
    {
      return str;
      str = this.lzC.vKF;
      continue;
      str = this.lzz.cbq;
    }
  }

  public final String getKey()
  {
    AppMethodBeat.i(19856);
    String str;
    if (this.lzy == ExdeviceBindDeviceUI.b.lzp)
    {
      str = this.lzA.lxI + this.lzA.lsu;
      AppMethodBeat.o(19856);
    }
    while (true)
    {
      return str;
      str = this.lzz.cbq;
      AppMethodBeat.o(19856);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceBindDeviceUI.f
 * JD-Core Version:    0.6.2
 */