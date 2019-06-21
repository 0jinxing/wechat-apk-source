package com.tencent.mm.modelvoiceaddr;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class f$2 extends ak
{
  f$2(f paramf)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(116694);
    if (paramMessage.what == 2)
    {
      if (this.gbb.gaX == null)
        break label255;
      this.gbb.gaX.ams();
      AppMethodBeat.o(116694);
    }
    while (true)
    {
      return;
      if (paramMessage.what == 0)
      {
        if (f.b(this.gbb) == 0)
        {
          ab.d("MicroMsg.SceneVoiceAddr", "addSceneEndListener MMFunc_UploadInputVoice");
          g.Rg().a(349, this.gbb);
          label78: if (f.b(this.gbb) != 0)
            break label186;
          if (f.c(this.gbb))
            break label160;
          f.a(this.gbb, new e(f.d(this.gbb), 0));
        }
        while (true)
        {
          g.Rg().a(f.e(this.gbb), 0);
          AppMethodBeat.o(116694);
          break;
          g.Rg().a(206, this.gbb);
          break label78;
          label160: f.a(this.gbb, new e(f.d(this.gbb), 1));
          continue;
          label186: f.a(this.gbb, new d(f.d(this.gbb), f.b(this.gbb)));
        }
      }
      if ((paramMessage.what == 3) && (this.gbb.gaX != null))
        this.gbb.gaX.a(new String[0], -1L);
      label255: AppMethodBeat.o(116694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.f.2
 * JD-Core Version:    0.6.2
 */