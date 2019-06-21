package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelvoice.e;
import com.tencent.mm.modelvoice.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Map;

final class i$1
  implements Runnable
{
  i$1(i parami, m paramm, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(116517);
    i.Fc();
    String str;
    int i;
    if (this.crb.getType() == 128)
    {
      i.a(this.cre);
      str = ((e)this.crb).fileName;
      i = ((e)this.crb).retCode;
      long l1 = 0L;
      long l2 = l1;
      if (str != null)
      {
        l2 = l1;
        if (this.cre.cqS.get(str) != null)
        {
          l2 = ((g.a)this.cre.cqS.get(str)).Mr();
          this.cre.cqS.remove(str);
        }
      }
      ab.i("MicroMsg.SceneVoiceService", "onSceneEnd SceneType:" + this.crb.getType() + " errtype:" + this.crc + " errCode:" + this.crd + " retCode:" + i + " file:" + str + " time:" + l2);
      if ((this.crc != 3) || (i == 0))
        break label408;
      i.c(this.cre);
      label214: ab.i("MicroMsg.SceneVoiceService", "onSceneEnd  inCnt:" + i.access$000() + " stop:" + i.d(this.cre) + " running:" + i.e(this.cre) + " recving:" + i.f(this.cre) + " sending:" + i.g(this.cre));
      if (i.d(this.cre) <= 0)
        break label427;
      i.h(this.cre);
    }
    while (true)
    {
      i.Fd();
      AppMethodBeat.o(116517);
      while (true)
      {
        return;
        if (this.crb.getType() == 127)
        {
          i.b(this.cre);
          str = ((f)this.crb).fileName;
          i = ((f)this.crb).retCode;
          break;
        }
        ab.e("MicroMsg.SceneVoiceService", "onSceneEnd Error SceneType:" + this.crb.getType());
        i.Fd();
        AppMethodBeat.o(116517);
      }
      label408: if (this.crc == 0)
        break label214;
      i.a(this.cre, 0);
      break label214;
      label427: if ((!i.g(this.cre)) && (!i.f(this.cre)))
      {
        i.i(this.cre);
        ab.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try next delay 3s [%d, %d] [%b]", new Object[] { Integer.valueOf(this.crc), Integer.valueOf(i), Boolean.valueOf(i.cqY) });
        if ((i.cqY) && (this.crc == 4))
          g.RS().m(new i.1.1(this), 10000L);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(116518);
    String str = super.toString() + "|onSceneEnd";
    AppMethodBeat.o(116518);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.i.1
 * JD-Core Version:    0.6.2
 */