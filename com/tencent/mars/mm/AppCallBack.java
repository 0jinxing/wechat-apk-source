package com.tencent.mars.mm;

import android.content.Context;
import com.tencent.mars.app.AppLogic.AccountInfo;
import com.tencent.mars.app.AppLogic.DeviceInfo;
import com.tencent.mars.app.AppLogic.ICallBack;
import com.tencent.mm.network.a;
import com.tencent.mm.network.t;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;

public class AppCallBack
  implements AppLogic.ICallBack
{
  private static final String TAG = "AppCallBack";
  private Context context = null;
  AppLogic.DeviceInfo info = new AppLogic.DeviceInfo(d.DEVICE_NAME, d.eSg);

  public AppCallBack(Context paramContext)
  {
    this.context = paramContext;
  }

  private static String exception2String(Exception paramException)
  {
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    return localStringWriter.toString();
  }

  public AppLogic.AccountInfo getAccountInfo()
  {
    AppLogic.AccountInfo localAccountInfo = new AppLogic.AccountInfo();
    if ((com.tencent.mm.network.aa.ano() == null) || (com.tencent.mm.network.aa.ano().gcU == null));
    while (true)
    {
      return localAccountInfo;
      try
      {
        localAccountInfo.uin = com.tencent.mm.network.aa.ano().gcU.QF();
        localAccountInfo.userName = com.tencent.mm.network.aa.ano().gcU.adD();
        if (bo.isNullOrNil(localAccountInfo.userName))
          localAccountInfo.userName = com.tencent.mm.network.aa.ano().gcU.getUsername();
      }
      catch (Exception localException)
      {
      }
    }
  }

  public String getAppFilePath()
  {
    Object localObject;
    if (this.context == null)
    {
      Assert.assertTrue(false);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      try
      {
        localObject = this.context.getFilesDir();
        if (!((File)localObject).exists())
          ((File)localObject).createNewFile();
        localObject = ((File)localObject).toString();
      }
      catch (Exception localException)
      {
        ab.e("AppCallBack", exception2String(localException));
        Assert.assertTrue(localException.getClass().getSimpleName() + ":" + localException.getStackTrace()[0] + ", " + localException.getStackTrace()[1], false);
        String str = "";
      }
    }
  }

  public int getClientVersion()
  {
    return d.vxo;
  }

  public String getCurLanguage()
  {
    return com.tencent.mm.sdk.platformtools.aa.dor();
  }

  public AppLogic.DeviceInfo getDeviceType()
  {
    return this.info;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mars.mm.AppCallBack
 * JD-Core Version:    0.6.2
 */