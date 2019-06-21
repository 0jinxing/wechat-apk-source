package com.tencent.mm.cf;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class c
{
  private static boolean ydA = false;
  public static a ydB = null;

  public static void MK(int paramInt)
  {
    AppMethodBeat.i(76900);
    boolean bool1;
    boolean bool2;
    boolean bool3;
    boolean bool4;
    switch (paramInt)
    {
    default:
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
    case 6:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      ab.d("MicroMsg.MemoryDumpOperation", "hprof operate: dump:%b, checkWifi:%b, uploadSingal:%b,uploadAll:%b,", new Object[] { Boolean.valueOf(bool4), Boolean.valueOf(bool3), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      Executors.newSingleThreadExecutor().execute(new c.1(bool4, bool3, bool2, bool1));
      AppMethodBeat.o(76900);
      return;
      ab.i("MicroMsg.MemoryDumpOperation", "GC NOW.");
      System.gc();
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      continue;
      bool1 = false;
      bool2 = true;
      bool3 = false;
      bool4 = true;
      continue;
      bool1 = false;
      bool2 = true;
      bool3 = true;
      bool4 = true;
      continue;
      bool1 = false;
      bool2 = false;
      bool3 = false;
      bool4 = true;
      continue;
      bool1 = true;
      bool2 = false;
      bool3 = false;
      bool4 = false;
      continue;
      bool1 = true;
      bool2 = false;
      bool3 = true;
      bool4 = false;
    }
  }

  static boolean Mn()
  {
    AppMethodBeat.i(76901);
    try
    {
      if (Environment.getExternalStorageState().equals("mounted"))
      {
        File localFile = new java/io/File;
        localFile.<init>(Environment.getExternalStorageDirectory().getAbsolutePath());
        if (localFile.canWrite())
        {
          bool = true;
          AppMethodBeat.o(76901);
        }
      }
      while (true)
      {
        return bool;
        AppMethodBeat.o(76901);
        bool = false;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        AppMethodBeat.o(76901);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.cf.c
 * JD-Core Version:    0.6.2
 */