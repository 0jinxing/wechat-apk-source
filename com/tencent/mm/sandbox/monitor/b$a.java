package com.tencent.mm.sandbox.monitor;

import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;

final class b$a
{
  public String bzH;
  public final String platform;
  public String tag;
  public long timestamp;
  public String username;
  public boolean xvn;

  public b$a(String paramString1, String paramString2, long paramLong, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(28784);
    this.platform = (d.eSg + "_" + d.vxo + "_" + Build.CPU_ABI);
    this.username = paramString1;
    this.tag = paramString2;
    this.timestamp = paramLong;
    this.bzH = paramString3;
    this.xvn = false;
    this.xvn = paramBoolean;
    AppMethodBeat.o(28784);
  }

  public final String toString()
  {
    AppMethodBeat.i(28785);
    String str = this.username + "," + this.platform + "," + this.tag + ",time_" + this.timestamp + ",error_" + this.bzH;
    AppMethodBeat.o(28785);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.b.a
 * JD-Core Version:    0.6.2
 */