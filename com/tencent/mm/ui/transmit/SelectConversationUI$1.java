package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.base.stub.d.a;
import com.tencent.mm.sdk.platformtools.ab;

final class SelectConversationUI$1
  implements d.a
{
  SelectConversationUI$1(SelectConversationUI paramSelectConversationUI)
  {
  }

  public final void ft(boolean paramBoolean)
  {
    AppMethodBeat.i(35124);
    boolean bool = this.zKj.isFinishing();
    ab.i("MicroMsg.SelectConversationUI", "onCheckEnd, isPass = " + paramBoolean + ", isFinishing = " + bool);
    if ((!paramBoolean) && (!bool))
      this.zKj.finish();
    AppMethodBeat.o(35124);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.1
 * JD-Core Version:    0.6.2
 */