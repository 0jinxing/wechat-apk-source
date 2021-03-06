package com.tencent.mm.console;

import android.content.Intent;
import android.os.Debug;
import android.os.Environment;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bp;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

final class Shell$3
  implements Shell.a
{
  public final void s(Intent paramIntent)
  {
    AppMethodBeat.i(16111);
    if ((!bp.dpL()) && (!bp.dnM()))
    {
      ab.e("MicroMsg.Shell", "not coolassist or monkey env, disable hprof dump cmd.");
      AppMethodBeat.o(16111);
    }
    while (true)
    {
      return;
      paramIntent = paramIntent.getStringExtra("process_suffix");
      if (bo.isNullOrNil(paramIntent))
      {
        if (!ah.bqo())
          AppMethodBeat.o(16111);
      }
      else if (!paramIntent.startsWith(":"))
      {
        ab.e("MicroMsg.Shell", "bad process suffix: %s", new Object[] { paramIntent });
        AppMethodBeat.o(16111);
      }
      else if (!ah.getProcessName().endsWith(paramIntent))
      {
        AppMethodBeat.o(16111);
      }
      else
      {
        paramIntent = new File(Environment.getExternalStorageDirectory(), "tencent/MicroMsg/hprofs");
        if (!paramIntent.exists())
          paramIntent.mkdirs();
        paramIntent = new File(paramIntent, ah.getProcessName().replace(".", "_").replace(":", "_") + "_" + new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()) + ".hprof");
        try
        {
          Debug.dumpHprofData(paramIntent.getAbsolutePath());
          Toast.makeText(ah.getContext(), "Done.", 1).show();
          AppMethodBeat.o(16111);
        }
        catch (IOException paramIntent)
        {
          ab.printErrStackTrace("MicroMsg.Shell", paramIntent, "dump hprof failed.", new Object[0]);
          Toast.makeText(ah.getContext(), "Failure.", 1).show();
          AppMethodBeat.o(16111);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell.3
 * JD-Core Version:    0.6.2
 */