package com.tencent.mm.plugin.ipcall.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f
{
  private static Map<Integer, List<Integer>> nvy;
  public int mCurrentState = -1;

  static
  {
    AppMethodBeat.i(21742);
    nvy = new HashMap();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(3));
    localArrayList.add(Integer.valueOf(2));
    localArrayList.add(Integer.valueOf(8));
    localArrayList.add(Integer.valueOf(12));
    nvy.put(Integer.valueOf(1), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(12));
    localArrayList.add(Integer.valueOf(8));
    nvy.put(Integer.valueOf(2), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(4));
    localArrayList.add(Integer.valueOf(5));
    localArrayList.add(Integer.valueOf(8));
    localArrayList.add(Integer.valueOf(12));
    nvy.put(Integer.valueOf(3), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(5));
    localArrayList.add(Integer.valueOf(8));
    localArrayList.add(Integer.valueOf(12));
    nvy.put(Integer.valueOf(4), localArrayList);
    localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(9));
    localArrayList.add(Integer.valueOf(10));
    localArrayList.add(Integer.valueOf(11));
    nvy.put(Integer.valueOf(5), localArrayList);
    AppMethodBeat.o(21742);
  }

  public static String stateToString(int paramInt)
  {
    AppMethodBeat.i(21741);
    String str;
    switch (paramInt)
    {
    case 0:
    case 6:
    case 7:
    default:
      str = String.valueOf(paramInt);
      AppMethodBeat.o(21741);
    case -1:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 10:
    case 8:
    case 9:
    case 11:
    case 12:
    }
    while (true)
    {
      return str;
      str = "RESET_STATE";
      AppMethodBeat.o(21741);
      continue;
      str = "START_INVITE";
      AppMethodBeat.o(21741);
      continue;
      str = "INVITE_FAILED";
      AppMethodBeat.o(21741);
      continue;
      str = "INVITE_SUCCESS";
      AppMethodBeat.o(21741);
      continue;
      str = "RING_ING";
      AppMethodBeat.o(21741);
      continue;
      str = "USER_ACCEPT";
      AppMethodBeat.o(21741);
      continue;
      str = "OTHER_SIDE_USER_SHUTDOWN";
      AppMethodBeat.o(21741);
      continue;
      str = "USER_CANCEL";
      AppMethodBeat.o(21741);
      continue;
      str = "USER_SELF_SHUTDOWN";
      AppMethodBeat.o(21741);
      continue;
      str = "USER_SELF_SHUTDOWN_BY_ERR";
      AppMethodBeat.o(21741);
      continue;
      str = "CANCEL_BY_ERR";
      AppMethodBeat.o(21741);
    }
  }

  private boolean xh(int paramInt)
  {
    AppMethodBeat.i(21740);
    boolean bool;
    if (this.mCurrentState == -1)
    {
      AppMethodBeat.o(21740);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((nvy.containsKey(Integer.valueOf(this.mCurrentState))) && (((List)nvy.get(Integer.valueOf(this.mCurrentState))).contains(Integer.valueOf(paramInt))))
      {
        AppMethodBeat.o(21740);
        bool = true;
      }
      else
      {
        bool = false;
        AppMethodBeat.o(21740);
      }
    }
  }

  public final boolean bHk()
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (this.mCurrentState != 1)
    {
      bool2 = bool1;
      if (this.mCurrentState != 3)
      {
        bool2 = bool1;
        if (this.mCurrentState != 4)
          if (this.mCurrentState != 5)
            break label44;
      }
    }
    label44: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public final boolean bHl()
  {
    if ((this.mCurrentState == 4) || (this.mCurrentState == 5));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bHm()
  {
    if (this.mCurrentState == 5);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean bHn()
  {
    if (this.mCurrentState == 5);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean xg(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(21739);
    if (xh(paramInt))
    {
      ab.i("MicroMsg.IPCallStateIndicator", "updateState, origin: %s, new: %s", new Object[] { stateToString(this.mCurrentState), stateToString(paramInt) });
      this.mCurrentState = paramInt;
      AppMethodBeat.o(21739);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.IPCallStateIndicator", "transform state error, origin state: %s, new state: %s", new Object[] { stateToString(i.bHu().mCurrentState), stateToString(paramInt) });
      AppMethodBeat.o(21739);
      bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.f
 * JD-Core Version:    0.6.2
 */