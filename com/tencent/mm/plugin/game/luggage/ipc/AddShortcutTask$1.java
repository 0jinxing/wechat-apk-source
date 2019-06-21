package com.tencent.mm.plugin.game.luggage.ipc;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.model.at.a;

final class AddShortcutTask$1
  implements at.a
{
  AddShortcutTask$1(AddShortcutTask paramAddShortcutTask)
  {
  }

  public final void hJ(boolean paramBoolean)
  {
    AppMethodBeat.i(135846);
    this.mTZ.success = paramBoolean;
    AddShortcutTask.a(this.mTZ);
    AppMethodBeat.o(135846);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask.1
 * JD-Core Version:    0.6.2
 */