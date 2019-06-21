package com.tencent.mm.plugin.downloader.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  public static void a(long paramLong, float paramFloat, int paramInt)
  {
    AppMethodBeat.i(2528);
    ab.d("MicroMsg.FileDownloadSP", "speed = ".concat(String.valueOf(paramFloat)));
    int i = Math.round(100.0F * paramFloat);
    String str = i + "_" + paramInt;
    ab.d("MicroMsg.FileDownloadSP", "speedStr = ".concat(String.valueOf(str)));
    l(paramLong, str);
    AppMethodBeat.o(2528);
  }

  private static void l(long paramLong, String paramString)
  {
    AppMethodBeat.i(2529);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("download_pref", 0);
    if (localSharedPreferences == null)
    {
      AppMethodBeat.o(2529);
      return;
    }
    String str = localSharedPreferences.getString(String.valueOf(paramLong), "");
    if (bo.isNullOrNil(str));
    int i;
    for (paramString = "1_" + paramString + "|"; ; paramString = str + (i + 1) + "_" + paramString + "|")
    {
      ab.d("MicroMsg.FileDownloadSP", "saveDownloadSpeed, speedStr = ".concat(String.valueOf(paramString)));
      localSharedPreferences.edit().putString(String.valueOf(paramLong), paramString).apply();
      AppMethodBeat.o(2529);
      break;
      String[] arrayOfString = str.split("\\|");
      i = bo.getInt(arrayOfString[(arrayOfString.length - 1)].split("_")[0], 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.h.b
 * JD-Core Version:    0.6.2
 */