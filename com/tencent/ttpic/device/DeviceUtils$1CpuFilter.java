package com.tencent.ttpic.device;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

class DeviceUtils$1CpuFilter
  implements FileFilter
{
  public boolean accept(File paramFile)
  {
    AppMethodBeat.i(49868);
    boolean bool;
    if (Pattern.matches("cpu[0-9]", paramFile.getName()))
    {
      bool = true;
      AppMethodBeat.o(49868);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49868);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceUtils.1CpuFilter
 * JD-Core Version:    0.6.2
 */