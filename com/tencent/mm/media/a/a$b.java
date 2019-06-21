package com.tencent.mm.media.a;

import a.f.b.j;
import a.l;
import a.v;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/os/Message;", "kotlin.jvm.PlatformType", "handleMessage"})
final class a$b
  implements ak.a
{
  a$b(a parama)
  {
  }

  public final boolean handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(12816);
    if (paramMessage.what == 1024)
    {
      paramMessage = paramMessage.obj;
      if (paramMessage == null)
      {
        paramMessage = new v("null cannot be cast to non-null type com.tencent.mm.media.codec.MediaCodecAACCodec.EncoderData");
        AppMethodBeat.o(12816);
        throw paramMessage;
      }
      paramMessage = (a.a)paramMessage;
      ab.i(this.eTd.TAG, "start encode data " + paramMessage.data.length + ", islast: " + paramMessage.eTf);
      com.tencent.mm.media.d.a locala = this.eTd.eSK;
      if (locala == null)
        j.avw("mAudioEncoder");
      locala.b(paramMessage.data, paramMessage.eTe, paramMessage.eTf);
    }
    AppMethodBeat.o(12816);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.a.a.b
 * JD-Core Version:    0.6.2
 */