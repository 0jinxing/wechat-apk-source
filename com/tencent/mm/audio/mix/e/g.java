package com.tencent.mm.audio.mix.e;

import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.h.a;
import com.tencent.mm.audio.mix.h.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public final class g
{
  private static Object cli;
  private static g cnf;
  private boolean bZi;
  private String clf;
  private boolean cng;
  private FileOutputStream outputStream;

  static
  {
    AppMethodBeat.i(137127);
    cli = new Object();
    AppMethodBeat.o(137127);
  }

  private g()
  {
    AppMethodBeat.i(137126);
    this.bZi = false;
    this.cng = true;
    if (!this.bZi)
    {
      this.bZi = true;
      this.clf = Ef();
      b.i("MicroMsg.Mix.ExportMixAudioPcmFile", "outFile:%s", new Object[] { this.clf });
      new File(this.clf).delete();
    }
    while (true)
    {
      try
      {
        FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
        localFileOutputStream.<init>(a.ei(this.clf));
        this.outputStream = localFileOutputStream;
        AppMethodBeat.o(137126);
        return;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        b.printErrStackTrace("MicroMsg.Mix.ExportMixAudioPcmFile", localFileNotFoundException, "new FileOutputStream", new Object[0]);
        AppMethodBeat.o(137126);
        continue;
      }
      catch (Exception localException)
      {
        b.printErrStackTrace("MicroMsg.Mix.ExportMixAudioPcmFile", localException, "new FileOutputStream", new Object[0]);
      }
      AppMethodBeat.o(137126);
    }
  }

  private static g Ee()
  {
    AppMethodBeat.i(137123);
    if (cnf == null);
    synchronized (cli)
    {
      if (cnf == null)
      {
        g localg = new com/tencent/mm/audio/mix/e/g;
        localg.<init>();
        cnf = localg;
      }
      ??? = cnf;
      AppMethodBeat.o(137123);
      return ???;
    }
  }

  private static String Ef()
  {
    AppMethodBeat.i(137124);
    Object localObject = new File(Environment.getExternalStorageDirectory().getAbsolutePath());
    if (!((File)localObject).exists())
      ((File)localObject).mkdirs();
    localObject = localObject + File.separator + "mix_audio_pcm.pcm";
    AppMethodBeat.o(137124);
    return localObject;
  }

  public static void Eg()
  {
    AppMethodBeat.i(137125);
    new File(Ef()).delete();
    g localg = Ee();
    if (localg.bZi)
      b.i("MicroMsg.Mix.ExportMixAudioPcmFile", "finishProcess");
    try
    {
      if (localg.outputStream != null)
      {
        localg.outputStream.flush();
        localg.outputStream.close();
        localg.outputStream = null;
      }
      localg.bZi = false;
      AppMethodBeat.o(137125);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        b.printErrStackTrace("MicroMsg.Mix.ExportMixAudioPcmFile", localException, "finishProcess", new Object[0]);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.e.g
 * JD-Core Version:    0.6.2
 */