package com.tencent.mrs.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.matrix.d.c;
import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.matrix.mrs.core.MatrixUploadDataSlice;
import com.tencent.matrix.mrs.core.MatrixUploadIssue;
import com.tencent.matrix.mrs.core.MrsCallback;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class a
  implements MrsCallback
{
  private HashMap<String, Boolean> AiZ = new HashMap();

  public final String getCryptKey(MatrixUploadDataSlice paramMatrixUploadDataSlice)
  {
    return com.tencent.mm.a.g.x(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(d.vxo), Long.valueOf(paramMatrixUploadDataSlice.getDataSize()) }).getBytes()).toLowerCase();
  }

  public final String getHost(MatrixUploadDataSlice paramMatrixUploadDataSlice)
  {
    return "support.weixin.qq.com";
  }

  public final String getPublicSharePath()
  {
    try
    {
      Object localObject = ah.getContext().getFilesDir();
      if (!((File)localObject).exists())
        ((File)localObject).createNewFile();
      localObject = ((File)localObject).toString();
      c.i("Matrix.MrsCallbackImp", "[TEST-PATH] getPublicSharePath, path: %s", new Object[] { localObject });
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject = (String)localObject + "/mrs/";
      return localObject;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("Matrix.MrsCallbackImp", localException.toString());
        String str = "";
      }
    }
  }

  public final String getUrl(MatrixUploadDataSlice paramMatrixUploadDataSlice)
  {
    String str = com.tencent.mm.a.g.x(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(d.vxo), Long.valueOf(paramMatrixUploadDataSlice.getDataSize()) }).getBytes()).toLowerCase();
    StringBuilder localStringBuilder = new StringBuilder(512).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(d.vxo)).append("&devicetype=").append("android-" + Build.VERSION.SDK_INT).append("&filelength=").append(paramMatrixUploadDataSlice.getDataSize()).append("&sum=").append(str);
    long l;
    if ((ah.bqo()) && (com.tencent.mm.kernel.g.RK()))
    {
      str = r.Yz();
      if ((str != null) && (str.length() != 0))
        localStringBuilder.append("&username=").append(str);
      if (1 != paramMatrixUploadDataSlice.getUploadIssue().getDataType())
        break label272;
      if (paramMatrixUploadDataSlice.getUploadIssue().getId() >= 0L)
        break label260;
      l = -1L * paramMatrixUploadDataSlice.getUploadIssue().getId();
      label184: str = l + '.' + paramMatrixUploadDataSlice.getPackageIndex() + '.' + paramMatrixUploadDataSlice.getTotalPackage();
      localStringBuilder.append("&reporttype=19860829&reportvalue=").append(str).append("&rtxname=").append(paramMatrixUploadDataSlice.getUploadIssue().getTag());
    }
    while (true)
    {
      return localStringBuilder.toString();
      str = null;
      break;
      label260: l = paramMatrixUploadDataSlice.getUploadIssue().getId();
      break label184;
      label272: localStringBuilder.append("&reporttype=1&NewReportType=111");
    }
  }

  public final boolean onRequestGetMrsStrategy(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    try
    {
      if (!com.tencent.mm.kernel.g.RK())
        ab.e("Matrix.MrsCallbackImp", "onRequestGetMrsStrategy, account not ready");
      while (true)
      {
        return bool;
        try
        {
          if (b.isRunning())
          {
            ab.i("Matrix.MrsCallbackImp", "NetSceneGetMrsStrategy is already running, just return");
            continue;
          }
        }
        finally
        {
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.e("Matrix.MrsCallbackImp", "error: " + paramArrayOfByte.getMessage());
        continue;
        ab.i("Matrix.MrsCallbackImp", "onRequestGetMrsStrategy, try to request mrs strategy");
        b localb = new com/tencent/mrs/a/b;
        localb.<init>(paramArrayOfByte);
        com.tencent.mm.kernel.g.RO().eJo.a(localb, 0);
        bool = true;
      }
    }
  }

  public final void onStrategyNotify(String paramString, boolean paramBoolean)
  {
    c.i("Matrix.MrsCallbackImp", "onStrategyNotify, strategy: %s, isReportProcess; %b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (!com.tencent.matrix.a.isInstalled());
    label264: label329: 
    while (true)
    {
      return;
      if (MatrixReport.isInstalled())
      {
        if (MatrixReport.with().isDebug())
          c.i("Matrix.MrsCallbackImp", "onStrategyNotify, matrix will report all for debug mode", new Object[0]);
      }
      else
      {
        continue;
        this.AiZ.clear();
        Object localObject = this.AiZ;
        if ((TextUtils.isEmpty(paramString)) || (localObject == null))
        {
          c.e("Matrix.MatrixUtil", "changeStrategyToMap, input params is illegal", new Object[0]);
          localObject = com.tencent.matrix.a.yK().bUC.iterator();
        }
        while (true)
        {
          if (!((Iterator)localObject).hasNext())
            break label329;
          com.tencent.matrix.b.b localb = (com.tencent.matrix.b.b)((Iterator)localObject).next();
          paramString = localb.getTag();
          if (this.AiZ.containsKey(paramString))
          {
            paramBoolean = ((Boolean)this.AiZ.get(paramString)).booleanValue();
            if ((paramBoolean) && (localb.isPluginStoped()))
            {
              c.w("Matrix.MrsCallbackImp", "matrix strategy change, try to turn on plugin %s", new Object[] { paramString });
              localb.start();
              continue;
              paramString = paramString.split(";");
              int i = paramString.length;
              int j = 0;
              label209: String[] arrayOfString;
              if (j < i)
              {
                localb = paramString[j];
                arrayOfString = localb.split(",", 2);
                if (arrayOfString.length == 2)
                  break label264;
                c.e("Matrix.MatrixUtil", "changeStrategyToMap, strategy format is illegal, value: %s", new Object[] { localb });
              }
              while (true)
              {
                j++;
                break label209;
                break;
                ((HashMap)localObject).put(arrayOfString[0].trim(), Boolean.valueOf(arrayOfString[1].trim().equals("1")));
              }
            }
            else if ((!paramBoolean) && (localb.isPluginStarted()))
            {
              c.w("Matrix.MrsCallbackImp", "matrix strategy change, try to turn off plugin %s", new Object[] { paramString });
              localb.stop();
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.a.a
 * JD-Core Version:    0.6.2
 */