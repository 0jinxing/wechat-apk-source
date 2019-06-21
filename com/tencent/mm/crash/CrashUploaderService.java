package com.tencent.mm.crash;

import android.content.Intent;
import android.os.Build;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.c;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.a.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import com.tencent.mm.service.MMIntentService;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import junit.framework.Assert;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class CrashUploaderService extends MMIntentService
{
  static final HashMap<String, Integer> ewT;

  static
  {
    AppMethodBeat.i(126234);
    HashMap localHashMap = new HashMap(16);
    ewT = localHashMap;
    localHashMap.put("exception", Integer.valueOf(10001));
    ewT.put("anr", Integer.valueOf(10002));
    ewT.put("handler", Integer.valueOf(10003));
    ewT.put("sql", Integer.valueOf(10004));
    ewT.put("permission", Integer.valueOf(10005));
    AppMethodBeat.o(126234);
  }

  public CrashUploaderService()
  {
    super("CrashUploaderService");
    AppMethodBeat.i(126230);
    if (f.DEBUG)
    {
      ab.e("MicroMsg.CrashUploaderService", "CrashUploaderService Name : %s", new Object[] { CrashUploaderService.class.getName() });
      Assert.assertTrue("CrashUploaderService name mismatch!!!", ".crash.CrashUploaderService".equals(CrashUploaderService.class.getName()));
    }
    AppMethodBeat.o(126230);
  }

  private static boolean a(String paramString1, byte[] paramArrayOfByte, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(126233);
    int i = paramArrayOfByte.length;
    String str = g.x(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }).getBytes()).toLowerCase();
    byte[] arrayOfByte = r.compress(paramArrayOfByte);
    paramArrayOfByte = new PByteArray();
    c.a(paramArrayOfByte, arrayOfByte, str.getBytes());
    paramString2 = new StringBuilder().append(paramString3).append("/cgi-bin/mmsupport-bin/stackreport?version=").append(Integer.toHexString(paramInt)).append("&devicetype=").append(paramString2).append("&filelength=").append(i).append("&sum=").append(str).append("&reporttype=1&NewReportType=").append(bo.h((Integer)ewT.get(paramString4)));
    if ((paramString1 != null) && (!paramString1.equals("")))
      paramString2.append("&username=").append(paramString1);
    try
    {
      paramString3 = new org/apache/http/impl/client/DefaultHttpClient;
      paramString3.<init>();
      paramString1 = new org/apache/http/client/methods/HttpPost;
      paramString1.<init>(paramString2.toString());
      paramString2 = new org/apache/http/entity/ByteArrayEntity;
      paramString2.<init>(paramArrayOfByte.value);
      paramString2.setContentType("binary/octet-stream");
      paramString1.setEntity(paramString2);
      ab.i("MicroMsg.CrashUploaderService", bo.convertStreamToString(paramString3.execute(paramString1).getEntity().getContent()));
      AppMethodBeat.o(126233);
      bool = true;
      return bool;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CrashUploaderService", paramString1, "", new Object[0]);
        AppMethodBeat.o(126233);
        boolean bool = false;
      }
    }
  }

  private static void l(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(126232);
    StringBuilder localStringBuilder;
    if (!new File(paramString1).exists())
    {
      localStringBuilder = new StringBuilder();
      if ((!bo.isNullOrNil(paramString3)) && (!paramString3.equals("0")))
        break label204;
      paramString3 = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL;
      localStringBuilder.append("uin[" + Integer.toString(paramString3.hashCode()) + "] ");
    }
    while (true)
    {
      localStringBuilder.append(ab.getSysInfo());
      localStringBuilder.append(" BRAND:[" + Build.BRAND + "] ");
      localStringBuilder.append("\n");
      e.e(paramString1, localStringBuilder.toString().getBytes());
      e.e(paramString1, (paramString2 + "\n").getBytes());
      AppMethodBeat.o(126232);
      return;
      label204: localStringBuilder.append("uin[" + paramString3 + "] ");
    }
  }

  public final String getTag()
  {
    return "MicroMsg.CrashUploaderService";
  }

  public final void onHandleIntent(Intent paramIntent)
  {
    AppMethodBeat.i(126231);
    if (paramIntent == null)
      AppMethodBeat.o(126231);
    while (true)
    {
      return;
      Object localObject1 = paramIntent.getStringExtra("INTENT_EXTRA_EXCEPTION_MSG");
      String str1 = paramIntent.getStringExtra("INTENT_EXTRA_USER_NAME");
      Object localObject2 = paramIntent.getStringExtra("INTENT_EXTRA_SDCARD_PATH");
      Object localObject3 = paramIntent.getStringExtra("INTENT_EXTRA_DATA_PATH");
      String str2 = paramIntent.getStringExtra("INTENT_EXTRA_UIN");
      int i = 0;
      try
      {
        int j = Integer.decode(paramIntent.getStringExtra("INTENT_EXTRA_CLIENT_VERSION")).intValue();
        i = j;
        label82: String str3 = paramIntent.getStringExtra("INTENT_EXTRA_DEVICE_TYPE");
        String str4 = paramIntent.getStringExtra("INTENT_EXTRA_HOST");
        Object localObject4 = paramIntent.getStringExtra("INTENT_EXTRA_TAG");
        if (localObject4 != null)
        {
          paramIntent = (Intent)localObject4;
          if (((String)localObject4).length() != 0);
        }
        else
        {
          paramIntent = "exception";
        }
        localObject4 = str1 + "," + str3 + "_" + i + "_" + Build.CPU_ABI + ",";
        localObject4 = (String)localObject4 + "exception,time_" + bo.anT() + ",error_" + (String)localObject1;
        try
        {
          localObject1 = new java/io/File;
          ((File)localObject1).<init>((String)localObject2);
          if (!((File)localObject1).exists())
            ((File)localObject1).mkdirs();
          while (true)
          {
            Date localDate = new java/util/Date;
            localDate.<init>();
            SimpleDateFormat localSimpleDateFormat = new java/text/SimpleDateFormat;
            localSimpleDateFormat.<init>("yyyyMMdd", Locale.getDefault());
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            l((String)localObject2 + "crash_" + localSimpleDateFormat.format(localDate) + ".txt", (String)localObject4, str2);
            label317: localObject2 = new File((String)localObject3);
            if (!((File)localObject2).exists())
              ((File)localObject2).mkdir();
            localObject2 = (String)localObject3 + str2;
            localObject3 = new File((String)localObject2);
            if (((File)localObject3).length() > 262144L)
              ((File)localObject3).delete();
            l((String)localObject2, (String)localObject4, str2);
            localObject4 = e.f((String)localObject2, 0, -1);
            if (!bo.cb((byte[])localObject4))
              break label484;
            AppMethodBeat.o(126231);
            break;
            localObject1 = ((File)localObject1).listFiles();
            if (localObject1 != null)
            {
              int k = localObject1.length;
              for (j = 0; j < k; j++)
              {
                localDate = localObject1[j];
                if (bo.gb(localDate.lastModified()) > 2592000000L)
                  localDate.delete();
              }
            }
          }
          label484: if (a(str1, (byte[])localObject4, i, str3, str4, paramIntent))
            ((File)localObject3).delete();
          AppMethodBeat.o(126231);
        }
        catch (Exception localException)
        {
          break label317;
        }
      }
      catch (Error localError)
      {
        break label82;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.crash.CrashUploaderService
 * JD-Core Version:    0.6.2
 */