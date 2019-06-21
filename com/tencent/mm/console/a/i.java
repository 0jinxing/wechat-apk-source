package com.tencent.mm.console.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelstat.WatchDogPushReceiver;
import com.tencent.mm.pluginsdk.cmd.a;
import com.tencent.mm.pluginsdk.cmd.b;
import com.tencent.mm.protocal.MMProtocalJni;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

public final class i
  implements a
{
  static
  {
    AppMethodBeat.i(16141);
    b.a(new i(), new String[] { "//assert", "//netassert", "//jniassert", "//jnipushassert", "//pushassert" });
    AppMethodBeat.o(16141);
  }

  public static void init()
  {
  }

  public final boolean a(Context paramContext, String[] paramArrayOfString, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(16140);
    paramContext = paramArrayOfString[0];
    int i;
    switch (paramContext.hashCode())
    {
    default:
      i = -1;
      switch (i)
      {
      default:
        label71: AppMethodBeat.o(16140);
        bool = false;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
      break;
    case 1957466406:
    case -2061874877:
    case -1794206389:
    case -1869906331:
    case 918688960:
    }
    while (true)
    {
      return bool;
      if (!paramContext.equals("//assert"))
        break;
      i = 0;
      break label71;
      if (!paramContext.equals("//netassert"))
        break;
      i = 1;
      break label71;
      if (!paramContext.equals("//jniassert"))
        break;
      i = 2;
      break label71;
      if (!paramContext.equals("//jnipushassert"))
        break;
      i = 3;
      break label71;
      if (!paramContext.equals("//pushassert"))
        break;
      i = 4;
      break label71;
      Assert.assertTrue("test errlog " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
      AppMethodBeat.o(16140);
      continue;
      Assert.assertTrue("NetsceneQueue forbid in ", false);
      AppMethodBeat.o(16140);
      continue;
      MMProtocalJni.setClientPackVersion(-1);
      AppMethodBeat.o(16140);
      continue;
      WatchDogPushReceiver.mj(2);
      AppMethodBeat.o(16140);
      continue;
      WatchDogPushReceiver.mj(1);
      AppMethodBeat.o(16140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.a.i
 * JD-Core Version:    0.6.2
 */