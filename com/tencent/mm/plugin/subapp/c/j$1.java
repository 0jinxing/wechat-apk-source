package com.tencent.mm.plugin.subapp.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelvoice.e;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class j$1
  implements Runnable
{
  j$1(j paramj, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(25307);
    j.Fc();
    String str;
    int i;
    if (this.crb.getType() == 128)
    {
      j.a(this.stp);
      str = ((e)this.crb).fileName;
      i = ((e)this.crb).retCode;
      long l1 = 0L;
      long l2 = l1;
      if (str != null)
      {
        l2 = l1;
        if (this.stp.cqS.get(str) != null)
        {
          l2 = ((g.a)this.stp.cqS.get(str)).Mr();
          this.stp.cqS.remove(str);
        }
      }
      ab.d("MicroMsg.VoiceRemindService", "onSceneEnd SceneType:" + this.crb.getType() + " errtype:" + this.crc + " errCode:" + this.crd + " retCode:" + i + " file:" + str + " time:" + l2);
      if ((this.crc != 3) || (i == 0))
        break label412;
      j.c(this.stp);
      label215: ab.d("MicroMsg.VoiceRemindService", "onSceneEnd  inCnt:" + j.access$000() + " stop:" + j.d(this.stp) + " running:" + j.e(this.stp) + " recving:" + j.f(this.stp) + " sending:" + j.g(this.stp));
      if (j.d(this.stp) <= 0)
        break label431;
      j.h(this.stp);
    }
    while (true)
    {
      j.Fd();
      AppMethodBeat.o(25307);
      while (true)
      {
        return;
        if (this.crb.getType() == 329)
        {
          j.b(this.stp);
          str = ((b)this.crb).fileName;
          i = ((b)this.crb).retCode;
          break;
        }
        ab.e("MicroMsg.VoiceRemindService", "onSceneEnd Error SceneType:" + this.crb.getType());
        j.Fd();
        AppMethodBeat.o(25307);
      }
      label412: if (this.crc == 0)
        break label215;
      j.a(this.stp, 0);
      break label215;
      label431: if ((!j.g(this.stp)) && (!j.f(this.stp)))
        j.i(this.stp);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.j.1
 * JD-Core Version:    0.6.2
 */