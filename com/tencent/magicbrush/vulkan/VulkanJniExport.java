package com.tencent.magicbrush.vulkan;

import com.tencent.magicbrush.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class VulkanJniExport
{
  static
  {
    AppMethodBeat.i(116016);
    b.loadLibrary("mmvulkan");
    AppMethodBeat.o(116016);
  }

  public static native boolean isSupportVulkan();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.vulkan.VulkanJniExport
 * JD-Core Version:    0.6.2
 */