package com.tencent.mm.plugin.traceroute.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

final class a$f$1
  implements Runnable
{
  a$f$1(a.f paramf, int paramInt, String paramString, PByteArray paramPByteArray)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25973);
    Object localObject = ah.getContext().getSharedPreferences("system_config_prefs", 0);
    String str = "http://" + ((SharedPreferences)localObject).getString("support.weixin.qq.com", "support.weixin.qq.com");
    localObject = new StringBuffer();
    ((StringBuffer)localObject).append(str + "/cgi-bin/mmsupport-bin/stackreport?version=");
    ((StringBuffer)localObject).append(Integer.toHexString(d.vxo));
    ((StringBuffer)localObject).append("&devicetype=");
    ((StringBuffer)localObject).append(d.eSg);
    ((StringBuffer)localObject).append("&filelength=");
    ((StringBuffer)localObject).append(this.sIE);
    ((StringBuffer)localObject).append("&sum=");
    ((StringBuffer)localObject).append(this.sIF);
    ((StringBuffer)localObject).append("&reporttype=");
    ((StringBuffer)localObject).append(4);
    if ((this.sIH.sID.userName != null) && (!this.sIH.sID.userName.equals("")))
    {
      ((StringBuffer)localObject).append("&username=");
      ((StringBuffer)localObject).append(this.sIH.sID.userName);
    }
    ab.d("MicroMsg.MMTraceRoute", "traceroute report url:" + ((StringBuffer)localObject).toString());
    a.f.a(this.sIH, ((StringBuffer)localObject).toString(), this.sIG.value);
    AppMethodBeat.o(25973);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.b.a.f.1
 * JD-Core Version:    0.6.2
 */