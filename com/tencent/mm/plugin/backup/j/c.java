package com.tencent.mm.plugin.backup.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a;

public final class c
{
  private static String TAG = "MicroMsg.BackupModelFactory";

  public static d rK(int paramInt)
  {
    AppMethodBeat.i(18108);
    Object localObject;
    switch (paramInt)
    {
    case 0:
    default:
      localObject = null;
      AppMethodBeat.o(18108);
    case 1:
    case 2:
    case -1:
    }
    while (true)
    {
      return localObject;
      localObject = com.tencent.mm.plugin.backup.backuppcmodel.b.aTD();
      AppMethodBeat.o(18108);
      continue;
      localObject = com.tencent.mm.plugin.backup.d.b.aSZ();
      AppMethodBeat.o(18108);
      continue;
      localObject = a.aUB();
      AppMethodBeat.o(18108);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.j.c
 * JD-Core Version:    0.6.2
 */