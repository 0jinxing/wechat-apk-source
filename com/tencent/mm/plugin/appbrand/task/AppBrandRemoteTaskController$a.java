package com.tencent.mm.plugin.appbrand.task;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum AppBrandRemoteTaskController$a
{
  static
  {
    AppMethodBeat.i(132829);
    iES = new a("NONE", 0);
    iET = new a("REGISTER", 1);
    iEU = new a("UPDATE", 2);
    iEV = new a("REMOVE", 3);
    iEW = new a("KILL", 4);
    iEX = new a("KILL_ALL", 5);
    iEY = new a("ASSERT", 6);
    iEZ = new a("CHECK_ALIVE", 7);
    iFa = new a("NETWORK_CHANGE", 8);
    iFb = new a("CLEAR_DUPLICATED", 9);
    iFc = new a("PRELOAD", 10);
    iFd = new a("NOTIFY_PAUSE", 11);
    iFe = new a[] { iES, iET, iEU, iEV, iEW, iEX, iEY, iEZ, iFa, iFb, iFc, iFd };
    AppMethodBeat.o(132829);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.task.AppBrandRemoteTaskController.a
 * JD-Core Version:    0.6.2
 */