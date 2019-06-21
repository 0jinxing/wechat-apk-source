package com.tencent.mm.plugin.appbrand.report;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.q;

public final class f
{
  public static int h(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(132563);
    if ((paramBundle == null) || (!pK(paramInt)))
    {
      paramInt = 0;
      AppMethodBeat.o(132563);
    }
    while (true)
    {
      return paramInt;
      paramInt = paramBundle.getInt("stat_scene");
      AppMethodBeat.o(132563);
    }
  }

  public static String i(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(132564);
    if ((paramBundle == null) || (!pK(paramInt)))
    {
      paramBundle = "";
      AppMethodBeat.o(132564);
    }
    while (true)
    {
      return paramBundle;
      String str;
      switch (paramBundle.getInt("stat_scene"))
      {
      case 5:
      default:
        paramBundle = "";
        AppMethodBeat.o(132564);
        break;
      case 1:
        paramBundle = paramBundle.getString("stat_send_msg_user");
        AppMethodBeat.o(132564);
        break;
      case 2:
        str = paramBundle.getString("stat_chat_talker_username");
        paramBundle = paramBundle.getString("stat_send_msg_user");
        paramBundle = str + ":" + paramBundle;
        AppMethodBeat.o(132564);
        break;
      case 3:
        str = paramBundle.getString("stat_msg_id");
        paramBundle = paramBundle.getString("stat_send_msg_user");
        paramBundle = str + ":" + paramBundle;
        AppMethodBeat.o(132564);
        break;
      case 4:
        paramBundle = q.encode(paramBundle.getString("stat_url"));
        AppMethodBeat.o(132564);
        break;
      case 6:
        Object localObject = paramBundle.getString("stat_app_id");
        str = paramBundle.getString("stat_url");
        localObject = new StringBuilder().append((String)localObject).append(":");
        paramBundle = str;
        if (str == null)
          paramBundle = "";
        paramBundle = q.encode(paramBundle);
        AppMethodBeat.o(132564);
        break;
      case 7:
        paramBundle = paramBundle.getString("stat_chat_talker_username");
        AppMethodBeat.o(132564);
        break;
      case 8:
        paramBundle = "search:" + paramBundle.getString("stat_search_id");
        AppMethodBeat.o(132564);
        break;
      case 9:
        str = paramBundle.getString("stat_chat_talker_username");
        paramBundle = paramBundle.getString("stat_send_msg_user");
        paramBundle = str + ":" + paramBundle;
        AppMethodBeat.o(132564);
      }
    }
  }

  private static boolean pK(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1007:
    case 1008:
    case 1012:
    case 1024:
    case 1031:
    case 1036:
    case 1044:
    case 1048:
    case 1088:
    case 1124:
    case 1125:
    case 1126:
    }
    for (boolean bool = false; ; bool = true)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.f
 * JD-Core Version:    0.6.2
 */