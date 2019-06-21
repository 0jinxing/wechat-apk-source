package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class a$2
  implements Runnable
{
  a$2(int paramInt, String paramString1, String paramString2, String paramString3, PByteArray paramPByteArray)
  {
  }

  public final void run()
  {
    Object localObject = ah.getContext().getSharedPreferences("system_config_prefs", 0);
    localObject = "http://" + ((SharedPreferences)localObject).getString("support.weixin.qq.com", "support.weixin.qq.com");
    localObject = new StringBuilder().append((String)localObject).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(d.vxo)).append("&devicetype=").append(d.eSg).append("&filelength=").append(this.sIE).append("&sum=").append(this.sIF).append("&reporttype=1&NewReportType=").append(bo.h((Integer)a.ewT.get(this.bVo)));
    if ((this.eiH != null) && (!this.eiH.equals("")))
      ((StringBuilder)localObject).append("&username=").append(this.eiH);
    ab.d("MicroMsg.CrashUpload", "dkcrash sb:" + ((StringBuilder)localObject).toString());
    a.E(((StringBuilder)localObject).toString(), this.sIG.value);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.a.2
 * JD-Core Version:    0.6.2
 */