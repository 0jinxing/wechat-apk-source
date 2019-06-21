package com.tencent.mm.compatible.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class c
{
  public static c.a KI()
  {
    AppMethodBeat.i(92833);
    Object localObject = ah.getContext().getSharedPreferences(ah.doA(), 0);
    boolean bool;
    if (q.etd.epO == 1)
    {
      bool = false;
      if (!((SharedPreferences)localObject).contains("settings_voicerecorder_mode"))
        ((SharedPreferences)localObject).edit().putBoolean("settings_voicerecorder_mode", bool).commit();
      ab.i("AudioConfig", "getModeByConfig mVoiceRecordMode:%d defValue:%b settings_voicerecorder_mode:%b", new Object[] { Integer.valueOf(q.etd.epO), Boolean.valueOf(bool), Boolean.valueOf(((SharedPreferences)localObject).getBoolean("settings_voicerecorder_mode", bool)) });
      if (!((SharedPreferences)localObject).getBoolean("settings_voicerecorder_mode", bool))
        break label132;
      localObject = c.a.eoQ;
      AppMethodBeat.o(92833);
    }
    while (true)
    {
      return localObject;
      bool = true;
      break;
      label132: localObject = c.a.eoR;
      AppMethodBeat.o(92833);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.b.c
 * JD-Core Version:    0.6.2
 */