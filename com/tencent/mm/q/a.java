package com.tencent.mm.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.StatFs;
import android.preference.PreferenceManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public final class a
{
  public static int ewU = -1;
  public static final long[] ewV = { 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L };
  public static final long[] ewW = { 104857600L, 314572800L, 524288000L, 1073741824L, 1073741824L };

  public static int On()
  {
    AppMethodBeat.i(77693);
    long l1 = 0L;
    long l2 = 0L;
    double d = 0.0D;
    long l3 = l1;
    try
    {
      File localFile = h.getDataDirectory();
      l3 = l1;
      StatFs localStatFs = new android/os/StatFs;
      l3 = l1;
      localStatFs.<init>(localFile.getPath());
      l3 = l1;
      l4 = localStatFs.getAvailableBlocks();
      l3 = l1;
      l1 = localStatFs.getBlockSize() * l4;
      l3 = l1;
      l4 = localStatFs.getBlockCount() * localStatFs.getBlockSize();
      l3 = l1;
      long l5 = localStatFs.getFreeBlocks();
      l3 = l1;
      i = localStatFs.getBlockSize();
      l2 = l5 * i;
      d = l1 / l4;
      l3 = l1;
      if (l4 > 0L)
        if (l3 < 52428800L)
        {
          i = 2;
          ab.i("MicroMsg.DbChecker", "checkRomSparespace[%d] available:%d all:%d freeSize :%d availPercent %f mobileSizeIndex %d", new Object[] { Integer.valueOf(i), Long.valueOf(l3), Long.valueOf(l4), Long.valueOf(l2), Double.valueOf(d), Integer.valueOf(ewU) });
          AppMethodBeat.o(77693);
          return i;
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        long l4 = 0L;
        ab.e("MicroMsg.DbChecker", "get db spare space error");
        continue;
        if (ewU < 0)
          ewU = ewV.length - 1;
        for (int i = 0; ; i++)
          if (i < ewV.length)
          {
            if (l4 < ewV[i])
              ewU = i;
          }
          else
          {
            if (l3 >= ewW[ewU])
              break label293;
            i = 1;
            break;
          }
        label293: i = 0;
      }
    }
  }

  public static void b(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(77694);
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putLong("db_check_tip_time", paramLong).commit();
    AppMethodBeat.o(77694);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.a
 * JD-Core Version:    0.6.2
 */