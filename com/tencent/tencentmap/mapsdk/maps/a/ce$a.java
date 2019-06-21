package com.tencent.tencentmap.mapsdk.maps.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.zip.Deflater;

public class ce$a
{
  private static String a;

  public static int a(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(98618);
    try
    {
      String str1 = b(paramString, bt.c());
      String str2 = str1;
      if (TextUtils.isEmpty(str1))
        str2 = b(paramString, 0);
      i = Integer.parseInt(str2);
      paramInt1 = eu.a(i, paramInt1, paramInt2, paramInt3);
      AppMethodBeat.o(98618);
      return paramInt1;
    }
    catch (Throwable paramString)
    {
      while (true)
        int i = paramInt3;
    }
  }

  public static int a(String paramString, int paramInt1, int paramInt2, Map<String, String> paramMap)
  {
    int i = 100;
    int j = 1;
    AppMethodBeat.i(98622);
    if (paramInt1 == 2)
    {
      paramInt1 = c(paramString, paramInt2);
      AppMethodBeat.o(98622);
    }
    while (true)
    {
      return paramInt1;
      if (("HLHttpDirect".equals(paramString)) && (paramMap != null) && ("event".equals((String)paramMap.get("B15"))))
      {
        paramInt1 = c(paramString, paramInt2);
        AppMethodBeat.o(98622);
      }
      else
      {
        int k = -1;
        if ("HLConnEvent".equals(paramString))
          if (paramInt2 == 0)
          {
            paramString = "report_conn_succ_denominator_value";
            label95: if (paramInt2 != 0)
              break label177;
            paramInt1 = 100;
            label102: paramInt2 = k;
            label105: if (paramInt2 != -1)
              break label657;
            paramInt2 = a("report_all_events", -1, 1, 0);
            if (paramInt2 != 1)
              break label635;
            paramInt1 = j;
          }
        while (true)
        {
          AppMethodBeat.o(98622);
          break;
          if ((paramInt2 == -4) || (paramInt2 == -3) || (paramInt2 == -288));
          for (paramInt1 = 1; ; paramInt1 = 0)
          {
            if (paramInt1 == 0)
              break label171;
            paramString = "report_conn_nonet_fail_denominator_value";
            break;
          }
          label171: paramString = "report_conn_other_fail_denominator_value";
          break label95;
          label177: if ((paramInt2 == -4) || (paramInt2 == -3) || (paramInt2 == -288));
          for (paramInt1 = 1; ; paramInt1 = 0)
          {
            if (paramInt1 == 0)
              break label213;
            paramInt1 = 100;
            break;
          }
          label213: paramInt1 = 1;
          break label102;
          if ("HLSecurityEvent".equals(paramString))
          {
            if (paramInt2 == 0)
            {
              paramString = "report_security_req_succ_denominator_value";
              label234: if (paramInt2 != 0)
                break label253;
            }
            label253: for (paramInt1 = i; ; paramInt1 = 1)
            {
              paramInt2 = k;
              break;
              paramString = "report_security_req_fail_denominator_value";
              break label234;
            }
          }
          if ("HLDisconnEvent".equals(paramString))
          {
            paramInt1 = 2;
            paramString = "report_disconn_denominator_value";
            paramInt2 = k;
            break label105;
          }
          if (("HLReqRspEvent".equals(paramString)) || ("HLHttpAgent".equals(paramString)) || ("HLHttpDirect".equals(paramString)))
          {
            if ((paramInt2 == 0) && (paramMap != null) && (es.a(paramString, paramInt1, paramMap)))
            {
              paramMap.put("B28", "1");
              paramString = "report_req_ssl_first_denominator_value";
              paramInt1 = i;
              paramInt2 = k;
              break label105;
            }
            if (paramInt2 == 0)
              paramString = "report_req_succ_denominator_value";
            while (true)
            {
              if (paramInt2 != 0)
                break label407;
              paramInt1 = i;
              paramInt2 = k;
              break;
              if ((paramInt2 == -4) || (paramInt2 == -3) || (paramInt2 == -288));
              for (paramInt1 = 1; ; paramInt1 = 0)
              {
                if (paramInt1 == 0)
                  break label401;
                paramString = "report_req_nonet_fail_denominator_value";
                break;
              }
              label401: paramString = "report_req_other_fail_denominator_value";
            }
            label407: if ((paramInt2 == -4) || (paramInt2 == -3) || (paramInt2 == -288));
            for (paramInt2 = 1; ; paramInt2 = 0)
            {
              paramInt1 = i;
              if (paramInt2 != 0)
                break;
              paramInt1 = 1;
              break;
            }
          }
          if ("HLPushEvent".equals(paramString))
          {
            paramInt1 = 10;
            paramString = "report_push_denominator_value";
            paramInt2 = k;
            break label105;
          }
          if ("B_DLSDK_Result".equals(paramString))
          {
            paramInt1 = 1;
            paramString = "report_mass_download_denominator_value";
            paramInt2 = k;
            break label105;
          }
          if ("HLDownTiny".equals(paramString))
          {
            paramInt1 = 10;
            paramString = "report_ease_download_denominator_value";
            paramInt2 = k;
            break label105;
          }
          if ("HLHeartBeat".equals(paramString))
          {
            if (paramInt2 == 0)
            {
              paramString = "report_heartbeat_succ_denominator_value";
              label523: if (paramInt2 != 0)
                break label542;
            }
            label542: for (paramInt1 = 10; ; paramInt1 = 5)
            {
              paramInt2 = k;
              break;
              paramString = "report_heartbeat_fail_denominator_value";
              break label523;
            }
          }
          if ("HLReportEvent".equals(paramString))
          {
            if (paramInt2 == 0);
            for (paramString = "platform_report_quality_succ_denominator_value"; ; paramString = "platform_report_quality_fail_denominator_value")
            {
              paramInt1 = 1;
              paramInt2 = k;
              break;
            }
          }
          if (("HLMsgClickEvent".equals(paramString)) || ("HLMsgProcessEvent".equals(paramString)) || ("HLMsgDispatchEvent".equals(paramString)))
          {
            if (paramInt2 == 0);
            for (paramString = "report_msg_push_succ_denominator_value"; ; paramString = "report_msg_push_fail_denominator_value")
            {
              paramInt1 = 1;
              paramInt2 = k;
              break;
            }
          }
          paramInt1 = 0;
          paramString = "";
          paramInt2 = 0;
          break label105;
          label635: if (paramInt2 == -1)
            paramInt1 = 0;
          else
            paramInt1 = a(paramString, 0, 2147483647, paramInt1);
        }
        label657: AppMethodBeat.o(98622);
        paramInt1 = paramInt2;
      }
    }
  }

  public static Handler a(String paramString, int paramInt)
  {
    AppMethodBeat.i(98620);
    paramString = new HandlerThread("halley_" + bt.c() + "_" + paramString, 10);
    paramString.start();
    paramString = new Handler(paramString.getLooper());
    AppMethodBeat.o(98620);
    return paramString;
  }

  public static String a()
  {
    return a;
  }

  public static void a(String paramString)
  {
    a = paramString;
  }

  public static boolean a(int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(98623);
    boolean bool2 = bool1;
    if (paramInt > 0)
    {
      bool2 = bool1;
      if (paramInt <= 2147483647)
      {
        bool2 = bool1;
        if (new Random().nextInt(paramInt) == 0)
          bool2 = true;
      }
    }
    AppMethodBeat.o(98623);
    return bool2;
  }

  public static boolean a(String paramString, boolean paramBoolean1, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(98621);
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.keySet().iterator();
      while (localIterator.hasNext())
        localIterator.next();
    }
    try
    {
      dg.d().a(paramString, paramBoolean1, paramMap, false, true);
      label54: AppMethodBeat.o(98621);
      return true;
    }
    catch (Throwable paramString)
    {
      break label54;
    }
  }

  public static byte[] a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98625);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(98625);
    while (true)
    {
      return paramArrayOfByte;
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      Deflater localDeflater = new Deflater();
      localDeflater.setInput(paramArrayOfByte);
      localDeflater.finish();
      paramArrayOfByte = new byte[256];
      while (!localDeflater.finished())
        localByteArrayOutputStream.write(paramArrayOfByte, 0, localDeflater.deflate(paramArrayOfByte));
      localDeflater.finish();
      localDeflater.end();
      paramArrayOfByte = localByteArrayOutputStream.toByteArray();
      AppMethodBeat.o(98625);
    }
  }

  private static String b(String paramString, int paramInt)
  {
    AppMethodBeat.i(98619);
    String str1 = ds.a().a(ce.b());
    String str2 = er.a(ce.g());
    paramString = en.d().e().a(paramString, paramInt, bt.f(), bt.a, str1, str2);
    AppMethodBeat.o(98619);
    return paramString;
  }

  private static int c(String paramString, int paramInt)
  {
    AppMethodBeat.i(98624);
    if (paramString.equals("HLDisconnEvent"))
    {
      paramInt = -2;
      AppMethodBeat.o(98624);
      return paramInt;
    }
    int i;
    if (paramInt != 0)
    {
      if ((paramInt == -4) || (paramInt == -3) || (paramInt == -288))
      {
        i = 1;
        label51: if (i == 0)
          break label114;
      }
    }
    else
    {
      paramString = "self_report_succ_denominator_value";
      label59: if (paramInt != 0)
      {
        if ((paramInt != -4) && (paramInt != -3) && (paramInt != -288))
          break label121;
        paramInt = 1;
        label84: if (paramInt == 0)
          break label126;
      }
    }
    label114: label121: label126: for (paramInt = 100; ; paramInt = 2)
    {
      paramInt = a(paramString, 0, 2147483647, paramInt);
      AppMethodBeat.o(98624);
      break;
      i = 0;
      break label51;
      paramString = "self_report_fail_denominator_value";
      break label59;
      paramInt = 0;
      break label84;
    }
  }

  public void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(98617);
    if (paramInt != 0)
    {
      bw.b();
      bw.c();
      bw.a = paramString;
    }
    AppMethodBeat.o(98617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ce.a
 * JD-Core Version:    0.6.2
 */