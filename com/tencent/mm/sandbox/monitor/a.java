package com.tencent.mm.sandbox.monitor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.tencent.mm.a.c;
import com.tencent.mm.a.g;
import com.tencent.mm.a.p;
import com.tencent.mm.a.r;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.sandbox.updater.AppUpdaterUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimerTask;
import java.util.regex.Pattern;

public final class a
{
  static final HashMap<String, Integer> ewT;

  static
  {
    HashMap localHashMap = new HashMap(16);
    ewT = localHashMap;
    localHashMap.put("exception", Integer.valueOf(10001));
    ewT.put("anr", Integer.valueOf(10002));
    ewT.put("handler", Integer.valueOf(10003));
    ewT.put("sql", Integer.valueOf(10004));
    ewT.put("permission", Integer.valueOf(10005));
    ewT.put("main_thread_watch", Integer.valueOf(10006));
  }

  public static int a(String paramString1, String paramString2, b.a parama)
  {
    if (bo.isNullOrNil(parama.toString()));
    for (int i = -1; ; i = hO(paramString1, paramString2))
    {
      return i;
      Object localObject = new File(ac.eSj + "crash/");
      if (!((File)localObject).exists())
        ((File)localObject).mkdir();
      localObject = ac.eSj + "crash/" + paramString1 + "." + paramString2 + ".crashini";
      com.tencent.mm.sdk.e.a.p((String)localObject, "count", bo.c(com.tencent.mm.sdk.e.a.hW((String)localObject, "count")) + 1L);
      if (bo.c(com.tencent.mm.sdk.e.a.hW((String)localObject, "lasttime")) == 0L)
        com.tencent.mm.sdk.e.a.p((String)localObject, "lasttime", bo.anU());
      localObject = ac.eSj + "crash/" + paramString1 + "." + paramString2 + ".crashlog";
      ab.d("MicroMsg.CrashUpload", "crash:[%s] len:[%d]", new Object[] { localObject, Integer.valueOf(parama.toString().length()) });
      a(parama);
      a((String)localObject, parama);
    }
  }

  private static void a(b.a parama)
  {
    if (!parama.xvn);
    while (true)
    {
      return;
      Object localObject = new File(com.tencent.mm.compatible.util.e.eSo);
      if (!((File)localObject).exists())
        ((File)localObject).mkdirs();
      localObject = ((File)localObject).listFiles();
      if (localObject != null)
      {
        int i = localObject.length;
        for (int j = 0; j < i; j++)
        {
          localDate = localObject[j];
          if (bo.gb(localDate.lastModified()) > 604800000L)
          {
            ab.i("MicroMsg.CrashUpload", "dealWithSdcardCrash del old file: %s", new Object[] { localDate.getPath() });
            localDate.delete();
          }
        }
      }
      Date localDate = new Date();
      localObject = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
      localObject = com.tencent.mm.compatible.util.e.eSo + "crash_" + ((SimpleDateFormat)localObject).format(localDate) + ".txt";
      ab.i("MicroMsg.CrashUpload", "dealWithSdcardCrash %s", new Object[] { localObject });
      a((String)localObject, parama);
    }
  }

  private static void a(String paramString, b.a parama)
  {
    int i;
    StringBuilder localStringBuilder;
    Object localObject;
    if (!new File(paramString).exists())
    {
      i = ah.getContext().getSharedPreferences("system_config_prefs", 0).getInt("default_uin", 0);
      localStringBuilder = new StringBuilder();
      if (i != 0)
        break label337;
      localObject = bo.gN(ah.getContext());
      if (bo.isNullOrNil((String)localObject))
        break label263;
      localStringBuilder.append("uin[" + (String)localObject + "] ");
    }
    while (true)
    {
      localStringBuilder.append(ab.getSysInfo());
      localStringBuilder.append(" BRAND:[" + Build.BRAND + "] ");
      localObject = q.LT();
      localStringBuilder.append("c1[" + localObject[0] + "] ");
      localStringBuilder.append("c2[" + localObject[1] + "] ");
      localStringBuilder.append("\n");
      com.tencent.mm.a.e.e(paramString, localStringBuilder.toString().getBytes());
      if (com.tencent.mm.a.e.cs(paramString) > 10485760)
        com.tencent.mm.a.e.deleteFile(paramString);
      com.tencent.mm.a.e.e(paramString, (parama.toString() + "\n").getBytes());
      return;
      label263: localObject = Build.DEVICE + Build.FINGERPRINT + Build.MANUFACTURER + Build.MODEL;
      localStringBuilder.append("uin[" + Integer.toString(((String)localObject).hashCode()) + "] ");
      continue;
      label337: localStringBuilder.append("uin[" + p.getString(i) + "] ");
    }
  }

  private static void az(String paramString1, String paramString2, String paramString3)
  {
    byte[] arrayOfByte = com.tencent.mm.a.e.f(paramString3, 0, -1);
    if (bo.cb(arrayOfByte));
    while (true)
    {
      return;
      int i = arrayOfByte.length;
      paramString3 = g.x(String.format("weixin#$()%d%d", new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.vxo), Integer.valueOf(i) }).getBytes()).toLowerCase();
      arrayOfByte = r.compress(arrayOfByte);
      PByteArray localPByteArray = new PByteArray();
      c.a(localPByteArray, arrayOfByte, paramString3.getBytes());
      com.tencent.mm.sdk.g.d.post(new a.2(i, paramString3, paramString2, paramString1, localPByteArray), "CrashUpload_upload");
    }
  }

  public static int dnc()
  {
    int i = -1;
    Object localObject = new File(ac.eSj + "crash/");
    int j;
    if (!((File)localObject).exists())
    {
      ab.w("MicroMsg.CrashUpload", "dkcrash checkUpload dir never create ?");
      j = i;
    }
    while (true)
    {
      return j;
      if (((File)localObject).isFile())
      {
        ((File)localObject).delete();
        ab.w("MicroMsg.CrashUpload", "dkcrash is the fucking file ??");
        j = i;
      }
      else
      {
        String[] arrayOfString = ((File)localObject).list(new a.1());
        j = i;
        if (arrayOfString != null)
        {
          j = i;
          if (arrayOfString.length != 0)
          {
            Pattern localPattern = Pattern.compile(".");
            i = arrayOfString.length;
            j = 0;
            if (j < i)
            {
              localObject = localPattern.split(arrayOfString[j]);
              String str;
              if ((localObject != null) && (localObject.length > 0))
              {
                str = localObject[0];
                if (localObject.length < 2)
                  break label163;
              }
              label163: for (localObject = localObject[1]; ; localObject = "")
              {
                hO(str, (String)localObject);
                j++;
                break;
              }
            }
            j = 1;
          }
        }
      }
    }
  }

  private static int hO(String paramString1, String paramString2)
  {
    String str1 = ac.eSj + "crash/" + paramString1 + "." + paramString2 + ".crashini";
    long l1 = bo.c(com.tencent.mm.sdk.e.a.hW(str1, "count"));
    long l2 = bo.c(com.tencent.mm.sdk.e.a.hW(str1, "lasttime"));
    long l3 = bo.anU();
    String str2 = ac.eSj + "crash/" + paramString1 + "." + paramString2 + ".crashlog";
    int i = com.tencent.mm.a.e.cs(str2);
    ab.d("MicroMsg.CrashUpload", "dkcrash count:" + l1 + " t:" + (l3 - l2) + " len:" + i);
    if (i < 5242880)
      az(paramString1, paramString2, str2);
    com.tencent.mm.a.e.deleteFile(str2);
    com.tencent.mm.sdk.e.a.hX(str1, "count");
    com.tencent.mm.sdk.e.a.p(str1, "lasttime", bo.anU());
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.monitor.a
 * JD-Core Version:    0.6.2
 */