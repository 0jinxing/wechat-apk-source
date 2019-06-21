package com.tencent.mm.plugin.zero.tasks;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.d;

class LoadProtocolJNITask$1
  implements Runnable
{
  LoadProtocolJNITask$1(LoadProtocolJNITask paramLoadProtocolJNITask)
  {
  }

  public void run()
  {
    AppMethodBeat.i(58781);
    MMProtocalJni.setClientPackVersion(d.vxo);
    AppMethodBeat.o(58781);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.zero.tasks.LoadProtocolJNITask.1
 * JD-Core Version:    0.6.2
 */