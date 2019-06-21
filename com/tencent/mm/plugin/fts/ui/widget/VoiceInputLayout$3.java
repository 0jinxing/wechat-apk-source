package com.tencent.mm.plugin.fts.ui.widget;

import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

final class VoiceInputLayout$3 extends ak
{
  VoiceInputLayout$3(VoiceInputLayout paramVoiceInputLayout)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(62212);
    switch (paramMessage.what)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(62212);
      while (true)
      {
        return;
        this.mNl.bBQ();
        AppMethodBeat.o(62212);
      }
      paramMessage = paramMessage.getData();
      this.mNl.V(paramMessage.getInt("localCode"), paramMessage.getInt("errType"), paramMessage.getInt("errCode"));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout.3
 * JD-Core Version:    0.6.2
 */