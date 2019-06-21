package com.tencent.mm.plugin.game.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class f
{
  static void E(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111520);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(111520);
    while (true)
    {
      return;
      FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
      if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.id > 0L))
      {
        long l = localFileDownloadTaskInfo.id;
        String str = localFileDownloadTaskInfo.url;
        if (localFileDownloadTaskInfo.jrb == 0L);
        for (int i = 0; ; i = (int)(localFileDownloadTaskInfo.kNr * 100L / localFileDownloadTaskInfo.jrb))
        {
          a(paramString, l, str, i, paramInt1, paramInt2, false, false, false, false, false, "");
          AppMethodBeat.o(111520);
          break;
        }
      }
      a(paramString, 0L, "", 0, paramInt1, paramInt2, false, false, false, false, false, "");
      AppMethodBeat.o(111520);
    }
  }

  public static void Oa(String paramString)
  {
    AppMethodBeat.i(111518);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(111518);
    while (true)
    {
      return;
      FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.bij().Ir(paramString);
      Object localObject = ((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().Ob(paramString);
      if ((localFileDownloadTaskInfo != null) && (localFileDownloadTaskInfo.id > 0L))
      {
        if (localObject != null)
        {
          l = localFileDownloadTaskInfo.id;
          String str = localFileDownloadTaskInfo.url;
          if (localFileDownloadTaskInfo.jrb == 0L);
          for (i = 0; ; i = (int)(localFileDownloadTaskInfo.kNr * 100L / localFileDownloadTaskInfo.jrb))
          {
            a(paramString, l, str, i, 3, 0, ((d)localObject).field_noWifi, ((d)localObject).field_noSdcard, ((d)localObject).field_noEnoughSpace, ((d)localObject).field_lowBattery, ((d)localObject).field_continueDelay, "");
            AppMethodBeat.o(111518);
            break;
          }
        }
        long l = localFileDownloadTaskInfo.id;
        localObject = localFileDownloadTaskInfo.url;
        if (localFileDownloadTaskInfo.jrb == 0L);
        for (int i = 0; ; i = (int)(localFileDownloadTaskInfo.kNr * 100L / localFileDownloadTaskInfo.jrb))
        {
          a(paramString, l, (String)localObject, i, 3, 0, false, false, false, false, false, "");
          AppMethodBeat.o(111518);
          break;
        }
      }
      if (localObject != null)
      {
        a(paramString, 0L, "", 0, 3, 0, ((d)localObject).field_noWifi, ((d)localObject).field_noSdcard, ((d)localObject).field_noEnoughSpace, ((d)localObject).field_lowBattery, ((d)localObject).field_continueDelay, "");
        AppMethodBeat.o(111518);
      }
      else
      {
        a(paramString, 0L, "", 0, 3, 0, false, false, false, false, false, "");
        AppMethodBeat.o(111518);
      }
    }
  }

  static void X(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(111519);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(111519);
    while (true)
    {
      return;
      if (((com.tencent.mm.plugin.game.a.c)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.game.a.c.class)).bDa().Ob(paramString) != null)
        E(paramString, paramInt1, paramInt2);
      AppMethodBeat.o(111519);
    }
  }

  private static void a(String paramString1, long paramLong, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString3)
  {
    AppMethodBeat.i(111521);
    ab.i("MicroMsg.GameSilentDownloadReporter", "reportInfo, appId:%s, downloadId:%d, downloadUrl:%s, downloadedPct:%d, finishType:%d, errCode:%d, noWifi:%b, noSdcard:%b, noEnoughSpace:%b, lowBattery:%b, continueDelay:%b", new Object[] { paramString1, Long.valueOf(paramLong), paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean3), Boolean.valueOf(paramBoolean4), Boolean.valueOf(paramBoolean5) });
    try
    {
      if (!bo.isNullOrNil(paramString2))
      {
        str1 = URLEncoder.encode(paramString2, "UTF-8");
        paramString2 = str1;
        str4 = paramString2;
        str1 = paramString3;
      }
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException1)
    {
      while (true)
        try
        {
          String str1;
          if (!bo.isNullOrNil(paramString3))
          {
            str1 = URLEncoder.encode(paramString3, "UTF-8");
            str4 = paramString2;
          }
          int i;
          if (paramBoolean1)
          {
            i = 1;
            if (paramBoolean2)
            {
              j = 1;
              if (!paramBoolean3)
                continue;
              k = 1;
              if (!paramBoolean4)
                continue;
              m = 1;
              if (!paramBoolean5)
                continue;
              n = 1;
              paramString1 = q(new Object[] { paramString1, Long.valueOf(paramLong), str4, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), str1 });
              com.tencent.mm.game.report.api.c.eBG.a(new com.tencent.mm.game.report.api.d(15547, paramString1));
              AppMethodBeat.o(111521);
            }
          }
          else
          {
            i = 0;
            continue;
          }
          int j = 0;
          continue;
          int k = 0;
          continue;
          int m = 0;
          continue;
          int n = 0;
          continue;
          localUnsupportedEncodingException1 = localUnsupportedEncodingException1;
          str4 = paramString2;
          String str2 = paramString3;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException2)
        {
          String str4 = paramString2;
          String str3 = paramString3;
        }
    }
  }

  private static String q(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111522);
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < 11; i++)
      localStringBuilder.append(String.valueOf(paramArrayOfObject[i])).append(',');
    localStringBuilder.append(String.valueOf(paramArrayOfObject[11]));
    paramArrayOfObject = localStringBuilder.toString();
    AppMethodBeat.o(111522);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.a.f
 * JD-Core Version:    0.6.2
 */