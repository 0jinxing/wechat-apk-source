package com.tencent.mm.plugin.zero.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.MMProtocalJni;

class LoadProtocolJNITask$3
  implements Runnable
{
  LoadProtocolJNITask$3(LoadProtocolJNITask paramLoadProtocolJNITask)
  {
  }

  public void run()
  {
    AppMethodBeat.i(58783);
    MMProtocalJni.setIsLite(false);
    AppMethodBeat.o(58783);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.tasks.LoadProtocolJNITask.3
 * JD-Core Version:    0.6.2
 */