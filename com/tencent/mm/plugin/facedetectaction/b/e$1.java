package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.facedetect.e.a;
import com.tencent.mm.plugin.facedetect.e.a.4;
import com.tencent.mm.plugin.facedetect.e.a.5;
import com.tencent.mm.sdk.platformtools.al;

final class e$1
  implements Runnable
{
  e$1(e parame, int paramInt, VideoTransPara paramVideoTransPara, byte[][] paramArrayOfByte)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(701);
    Object localObject = a.btw();
    int i = this.hVj;
    ((a)localObject).lYU.aa(new a.4((a)localObject, i));
    localObject = a.btw();
    float f = this.mcF.fps;
    ((a)localObject).lYU.aa(new a.5((a)localObject, f));
    e locale = this.mcH;
    localObject = this.mcG;
    d.mcq.R(new e.2(locale, (byte[][])localObject));
    AppMethodBeat.o(701);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.e.1
 * JD-Core Version:    0.6.2
 */