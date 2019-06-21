package com.tencent.mm.plugin.profile.ui.newbizinfo.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public final class a
  implements com.tencent.mm.pluginsdk.cmd.a
{
  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    AppMethodBeat.i(23932);
    if ("//usenewprofile".equals(paramArrayOfString[0]))
    {
      paramContext = ah.doB();
      if (paramArrayOfString.length <= 1)
      {
        paramContext.edit().putBoolean("use_new_profile", true).commit();
        AppMethodBeat.o(23932);
      }
    }
    while (true)
    {
      return true;
      paramArrayOfString = paramArrayOfString[1];
      int i = -1;
      switch (paramArrayOfString.hashCode())
      {
      default:
        label92: switch (i)
        {
        default:
        case 0:
        case 1:
        }
        break;
      case 3569038:
      case 97196323:
      }
      while (true)
      {
        AppMethodBeat.o(23932);
        break;
        if (!paramArrayOfString.equals("true"))
          break label92;
        i = 0;
        break label92;
        if (!paramArrayOfString.equals("false"))
          break label92;
        i = 1;
        break label92;
        paramContext.edit().putBoolean("use_new_profile", true).commit();
        continue;
        paramContext.edit().putBoolean("use_new_profile", false).commit();
      }
      AppMethodBeat.o(23932);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.a.a
 * JD-Core Version:    0.6.2
 */