package com.tencent.mm.plugin.hardcoder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.sdk.platformtools.ab;

final class PluginHardcoder$4$1
  implements Runnable
{
  PluginHardcoder$4$1(PluginHardcoder.4 param4)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(60254);
    long l = Thread.currentThread().getId();
    String str = Thread.currentThread().getName();
    boolean bool;
    if ((WXHardCoderJNI.isCheckEnv()) && (WXHardCoderJNI.isRunning() > 0))
    {
      bool = true;
      ab.i("MicroMsg.PluginHardcoder", "reportHardCoder tid[%d, %s], running[%b]", new Object[] { Long.valueOf(l), str, Boolean.valueOf(bool) });
      WXHardCoderJNI.reportIDKey(true, 0, 1, false);
      WXHardCoderJNI.readServerAddr(true);
      if ((!WXHardCoderJNI.isCheckEnv()) || (WXHardCoderJNI.isRunning() <= 0))
        break label129;
      i = 4;
      label91: WXHardCoderJNI.reportIDKey(true, i, 1, false);
      if (!WXHardCoderJNI.isHCEnable())
        break label135;
    }
    label129: label135: for (int i = 6; ; i = 7)
    {
      WXHardCoderJNI.reportIDKey(true, i, 1, false);
      AppMethodBeat.o(60254);
      return;
      bool = false;
      break;
      i = 5;
      break label91;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hardcoder.PluginHardcoder.4.1
 * JD-Core Version:    0.6.2
 */