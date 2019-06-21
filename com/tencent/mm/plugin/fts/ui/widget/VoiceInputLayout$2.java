package com.tencent.mm.plugin.fts.ui.widget;

import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvoiceaddr.g.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.List;

final class VoiceInputLayout$2
  implements g.b
{
  VoiceInputLayout$2(VoiceInputLayout paramVoiceInputLayout)
  {
  }

  public final void ams()
  {
    AppMethodBeat.i(62208);
    ab.d("MicroMsg.VoiceInputLayout", "onRecordFin() onRecordFin currentState = %s", new Object[] { Integer.valueOf(this.mNl.currentState) });
    if (VoiceInputLayout.c(this.mNl) != null)
      VoiceInputLayout.c(this.mNl).stopTimer();
    VoiceInputLayout.d(this.mNl).sendEmptyMessage(0);
    AppMethodBeat.o(62208);
  }

  public final void amw()
  {
    AppMethodBeat.i(62209);
    ab.d("MicroMsg.VoiceInputLayout", "onRecognize Finish");
    VoiceInputLayout.a(this.mNl).removeMessages(0);
    VoiceInputLayout.a(this.mNl).removeMessages(1);
    this.mNl.mNf.bBF();
    this.mNl.reset(false);
    AppMethodBeat.o(62209);
  }

  public final void b(String[] paramArrayOfString, List<String> paramList)
  {
    AppMethodBeat.i(138303);
    this.mNl.mNf.c(paramArrayOfString, paramList);
    VoiceInputLayout.a(this.mNl).removeMessages(0);
    VoiceInputLayout.a(this.mNl).sendEmptyMessageDelayed(0, VoiceInputLayout.e(this.mNl));
    AppMethodBeat.o(138303);
  }

  public final void c(int paramInt1, int paramInt2, int paramInt3, long paramLong)
  {
    AppMethodBeat.i(62211);
    VoiceInputLayout.a(this.mNl).removeMessages(0);
    VoiceInputLayout.a(this.mNl).removeMessages(1);
    Message localMessage = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putInt("localCode", paramInt1);
    localBundle.putInt("errType", paramInt2);
    localBundle.putInt("errCode", paramInt3);
    localMessage.setData(localBundle);
    localMessage.what = 1;
    VoiceInputLayout.d(this.mNl).sendMessage(localMessage);
    AppMethodBeat.o(62211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout.2
 * JD-Core Version:    0.6.2
 */