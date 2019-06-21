package com.tencent.mm.plugin.subapp.ui.voicereminder;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class RemindDialog$1
  implements ao.d
{
  RemindDialog$1(RemindDialog paramRemindDialog)
  {
  }

  public final void p(String paramString, long paramLong)
  {
    AppMethodBeat.i(25559);
    ab.d("MicroMsg.RemindDialog", "onVoiceRemind ".concat(String.valueOf(paramString)));
    RemindDialog.a(this.svI).add(paramString);
    RemindDialog.b(this.svI);
    AppMethodBeat.o(25559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.1
 * JD-Core Version:    0.6.2
 */