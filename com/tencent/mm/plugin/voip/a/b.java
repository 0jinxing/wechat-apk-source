package com.tencent.mm.plugin.voip.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static Map<Integer, String> sZh;

  static
  {
    AppMethodBeat.i(5003);
    HashMap localHashMap = new HashMap();
    sZh = localHashMap;
    localHashMap.put(Integer.valueOf(0), "CALLING_STATE_VIDEO_INVITING");
    sZh.put(Integer.valueOf(1), "CALLING_STATE_VOICE_INVITING");
    sZh.put(Integer.valueOf(2), "CALLING_STATE_VIDEO_WAITTING_ACCEPT");
    sZh.put(Integer.valueOf(3), "CALLING_STATE_VOICE_WAITTING_ACCEPT");
    sZh.put(Integer.valueOf(4), "CALLING_STATE_VIDEO_CONNECTING");
    sZh.put(Integer.valueOf(5), "CALLING_STATE_VOICE_CONNECTING");
    sZh.put(Integer.valueOf(6), "CALLING_STATE_VIDEO_TALKING");
    sZh.put(Integer.valueOf(7), "CALLING_STATE_VOICE_TALKING");
    sZh.put(Integer.valueOf(8), "CALLING_STATE_FINISH");
    sZh.put(Integer.valueOf(256), "CALLED_STATE_VIDEO_INVITING");
    sZh.put(Integer.valueOf(257), "CALLED_STATE_VOICE_INVITING");
    sZh.put(Integer.valueOf(258), "CALLED_STATE_VIDEO_CONNECTING");
    sZh.put(Integer.valueOf(259), "CALLED_STATE_VOICE_CONNECTING");
    sZh.put(Integer.valueOf(260), "CALLED_STATE_VIDEO_TALKING");
    sZh.put(Integer.valueOf(261), "CALLED_STATE_VOICE_TALKING");
    sZh.put(Integer.valueOf(262), "CALLED_STATE_FINISH");
    sZh.put(Integer.valueOf(4096), "ACTION_NOP");
    sZh.put(Integer.valueOf(4097), "ACTION_INVITE_RESPOND");
    sZh.put(Integer.valueOf(4098), "ACTION_CANCEL_INVITE");
    sZh.put(Integer.valueOf(4099), "ACTION_REJECT_INVITE");
    sZh.put(Integer.valueOf(4100), "ACTION_ACCEPT_INVITE");
    sZh.put(Integer.valueOf(4101), "ACTION_CLOSE_CAMERA");
    sZh.put(Integer.valueOf(4102), "ACTION_CONNECT_SUCC");
    sZh.put(Integer.valueOf(4103), "ACTION_SELF_HANGUP");
    sZh.put(Integer.valueOf(4104), "ACTION_ANOTHER_HANGUP");
    sZh.put(Integer.valueOf(4105), "ACTION_INVITE_TIMEOUT");
    sZh.put(Integer.valueOf(4106), "ACTION_SO_SHUTDOWN");
    sZh.put(Integer.valueOf(4107), "ACTION_PHONE_COMING");
    sZh.put(Integer.valueOf(4108), "ACTION_IGNORE_INVITE");
    sZh.put(Integer.valueOf(4109), "ACTION_ON_ERROR");
    sZh.put(Integer.valueOf(4110), "ACTION_SESSION_CALLED");
    AppMethodBeat.o(5003);
  }

  public static String GK(int paramInt)
  {
    AppMethodBeat.i(5000);
    String str;
    if (sZh.containsKey(Integer.valueOf(paramInt)))
    {
      str = (String)sZh.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(5000);
    }
    while (true)
    {
      return str;
      str = "no found value";
      AppMethodBeat.o(5000);
    }
  }

  public static c GL(int paramInt)
  {
    AppMethodBeat.i(5001);
    c localc = new c(paramInt);
    localc.al(256, 4098, 262);
    localc.al(256, 4099, 262);
    localc.al(256, 4105, 262);
    localc.al(256, 4106, 262);
    localc.al(256, 4107, 262);
    localc.al(256, 4108, 262);
    localc.al(256, 4109, 262);
    localc.al(256, 4100, 258);
    localc.al(256, 4101, 257);
    localc.al(257, 4100, 259);
    localc.al(257, 4098, 262);
    localc.al(257, 4099, 262);
    localc.al(257, 4105, 262);
    localc.al(257, 4106, 262);
    localc.al(257, 4107, 262);
    localc.al(257, 4108, 262);
    localc.al(257, 4109, 262);
    localc.al(258, 4098, 262);
    localc.al(258, 4106, 262);
    localc.al(258, 4107, 262);
    localc.al(258, 4103, 262);
    localc.al(258, 4109, 262);
    localc.al(258, 4102, 260);
    localc.al(259, 4102, 261);
    localc.al(259, 4098, 262);
    localc.al(259, 4106, 262);
    localc.al(259, 4107, 262);
    localc.al(259, 4103, 262);
    localc.al(259, 4109, 262);
    localc.al(260, 4101, 261);
    localc.al(260, 4103, 262);
    localc.al(260, 4104, 262);
    localc.al(260, 4106, 262);
    localc.al(260, 4107, 262);
    localc.al(260, 4109, 262);
    localc.al(261, 4103, 262);
    localc.al(261, 4104, 262);
    localc.al(261, 4106, 262);
    localc.al(261, 4107, 262);
    localc.al(261, 4109, 262);
    AppMethodBeat.o(5001);
    return localc;
  }

  public static c GM(int paramInt)
  {
    AppMethodBeat.i(5002);
    c localc = new c(paramInt);
    localc.al(0, 4098, 8);
    localc.al(0, 4106, 8);
    localc.al(0, 4107, 8);
    localc.al(0, 4109, 8);
    localc.al(0, 4097, 2);
    localc.al(0, 4101, 1);
    localc.al(1, 4097, 3);
    localc.al(1, 4098, 8);
    localc.al(1, 4106, 8);
    localc.al(1, 4107, 8);
    localc.al(1, 4109, 8);
    localc.al(2, 4098, 8);
    localc.al(2, 4099, 8);
    localc.al(2, 4105, 8);
    localc.al(2, 4106, 8);
    localc.al(2, 4107, 8);
    localc.al(2, 4109, 8);
    localc.al(2, 4100, 4);
    localc.al(2, 4101, 3);
    localc.al(3, 4100, 5);
    localc.al(3, 4098, 8);
    localc.al(3, 4099, 8);
    localc.al(3, 4105, 8);
    localc.al(3, 4106, 8);
    localc.al(3, 4107, 8);
    localc.al(3, 4109, 8);
    localc.al(4, 4102, 6);
    localc.al(4, 4101, 5);
    localc.al(5, 4102, 7);
    localc.al(6, 4103, 8);
    localc.al(6, 4104, 8);
    localc.al(6, 4106, 8);
    localc.al(6, 4107, 8);
    localc.al(6, 4109, 8);
    localc.al(6, 4101, 7);
    localc.al(7, 4103, 8);
    localc.al(7, 4104, 8);
    localc.al(7, 4106, 8);
    localc.al(7, 4107, 8);
    localc.al(7, 4109, 8);
    localc.al(4, 4098, 8);
    localc.al(4, 4099, 8);
    localc.al(4, 4106, 8);
    localc.al(4, 4107, 8);
    localc.al(4, 4103, 8);
    localc.al(4, 4109, 8);
    localc.al(5, 4098, 8);
    localc.al(5, 4099, 8);
    localc.al(5, 4106, 8);
    localc.al(5, 4107, 8);
    localc.al(5, 4103, 8);
    localc.al(5, 4109, 8);
    localc.al(0, 4110, 4);
    localc.al(1, 4110, 5);
    AppMethodBeat.o(5002);
    return localc;
  }

  public static boolean GN(int paramInt)
  {
    if ((260 == paramInt) || (261 == paramInt) || (6 == paramInt) || (7 == paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean GO(int paramInt)
  {
    if ((paramInt == 0) || (2 == paramInt) || (4 == paramInt) || (6 == paramInt) || (256 == paramInt) || (258 == paramInt) || (260 == paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean GP(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (1 != paramInt)
    {
      bool2 = bool1;
      if (paramInt != 0)
      {
        bool2 = bool1;
        if (2 != paramInt)
          if (3 != paramInt)
            break label31;
      }
    }
    label31: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public static int T(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    if ((true == paramBoolean1) && (true == paramBoolean2))
      i = 0;
    while (true)
    {
      return i;
      if ((true != paramBoolean1) || (paramBoolean2))
        if ((!paramBoolean1) && (true == paramBoolean2))
          i = 256;
        else
          i = 257;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.a.b
 * JD-Core Version:    0.6.2
 */