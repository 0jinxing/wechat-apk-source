package com.tencent.mm.plugin.appbrand.report.quality;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

public enum i
{
  static
  {
    AppMethodBeat.i(132702);
    iCT = new i("INST");
    iCU = new i[] { iCT };
    AppMethodBeat.o(132702);
  }

  public static i.a aLB()
  {
    AppMethodBeat.i(132701);
    i.a locala = new i.a();
    Object localObject = (ActivityManager)ah.getContext().getSystemService("activity");
    if (localObject != null)
    {
      localObject = ((ActivityManager)localObject).getProcessMemoryInfo(new int[] { Process.myPid() });
      if ((localObject != null) && (localObject.length > 0))
      {
        localObject = localObject[0];
        if (localObject != null)
          break label72;
        AppMethodBeat.o(132701);
      }
    }
    while (true)
    {
      return locala;
      localObject = null;
      break;
      label72: locala.iCV = (((Debug.MemoryInfo)localObject).getTotalPss() / 1024);
      locala.iCW = (((Debug.MemoryInfo)localObject).nativePss / 1024);
      locala.iCX = (((Debug.MemoryInfo)localObject).dalvikPss / 1024);
      locala.iCY = (((Debug.MemoryInfo)localObject).otherPss / 1024);
      AppMethodBeat.o(132701);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.report.quality.i
 * JD-Core Version:    0.6.2
 */