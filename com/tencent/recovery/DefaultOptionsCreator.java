package com.tencent.recovery;

import android.content.Context;
import com.tencent.recovery.option.CommonOptions;
import com.tencent.recovery.option.CommonOptions.Builder;
import com.tencent.recovery.option.IOptionsCreator;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.util.Util;
import com.tencent.recovery.wx.WXConstantsRecovery;
import com.tencent.recovery.wx.service.WXRecoveryHandleService;
import com.tencent.recovery.wx.service.WXRecoveryUploadService;
import com.tencent.recovery.wx.util.FileUtil;
import com.tencent.recovery.wx.util.WXUtil;
import java.io.File;

public class DefaultOptionsCreator
  implements IOptionsCreator
{
  private String clientVersion;

  private String getClientVersion()
  {
    if (Util.isNullOrNil(this.clientVersion))
    {
      File localFile = new File(WXConstantsRecovery.ArA, "version.info");
      if (localFile.exists())
        this.clientVersion = FileUtil.ae(localFile);
    }
    if (Util.isNullOrNil(this.clientVersion))
      this.clientVersion = "0x27000435";
    return this.clientVersion;
  }

  public CommonOptions createCommonOptions(Context paramContext)
  {
    CommonOptions.Builder localBuilder = new CommonOptions.Builder();
    localBuilder.Aro = WXRecoveryHandleService.class.getName();
    localBuilder.Arp = WXRecoveryUploadService.class.getName();
    localBuilder.clientVersion = getClientVersion();
    localBuilder.Arl = String.format("http://dldir1.qq.com/weixin/android/recovery-%s.conf", new Object[] { getClientVersion() });
    localBuilder.eCq = WXUtil.iG(paramContext);
    localBuilder.Arq = true;
    localBuilder.Arr = 600000L;
    localBuilder.Ars = 600000L;
    return localBuilder.dQg();
  }

  public ProcessOptions createProcessOptions(String paramString, int paramInt)
  {
    return null;
  }

  public String toString()
  {
    return String.format("Creator: [ClientVersion=%s] ", new Object[] { getClientVersion() });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.recovery.DefaultOptionsCreator
 * JD-Core Version:    0.6.2
 */