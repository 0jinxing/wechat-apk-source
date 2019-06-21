package com.tencent.mm.plugin.emojicapture.api;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class c
{
  public static void an(Context paramContext, String paramString)
  {
    AppMethodBeat.i(57469);
    if (bo.isNullOrNil(paramString));
    for (int i = 2; ; i = 1)
    {
      h(paramContext, paramString, i);
      AppMethodBeat.o(57469);
      return;
    }
  }

  public static void h(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(57470);
    long l1 = System.currentTimeMillis();
    int i;
    if (!bo.isNullOrNil(paramString))
      i = 1;
    while (true)
    {
      if (paramInt == 1)
        h.pYm.e(15982, new Object[] { Integer.valueOf(2), Long.valueOf(l1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
      try
      {
        while (true)
        {
          Intent localIntent = new android/content/Intent;
          localIntent.<init>(paramContext, Class.forName("com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI"));
          localIntent.putExtra("key_video_params", d.afF().afG());
          localIntent.putExtra("key_enter_time", l1);
          localIntent.putExtra("enter_scene", paramInt);
          localIntent.putExtra("key_capture_max_duration", com.tencent.mm.m.g.Nu().getInt("EmoticonCameraCaptureMaxDuration", 5));
          if (i != 0)
            localIntent.putExtra("key_imitated_md5", paramString);
          ((b)com.tencent.mm.kernel.g.M(b.class)).preCheck(paramContext, paramInt, new c.1(paramContext, localIntent));
          AppMethodBeat.o(57470);
          return;
          i = 0;
          break;
          if (paramInt == 2)
          {
            long l2 = System.currentTimeMillis();
            long l3 = com.tencent.mm.kernel.g.RP().Ry().a(ac.a.xVB, l2);
            h.pYm.e(15982, new Object[] { Integer.valueOf(1), Long.valueOf(l1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Long.valueOf(l2 - l3) });
          }
        }
      }
      catch (ClassNotFoundException paramContext)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.TakeEmojiCapture", paramContext, "takeEmojiCapture failed", new Object[0]);
          AppMethodBeat.o(57470);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.api.c
 * JD-Core Version:    0.6.2
 */