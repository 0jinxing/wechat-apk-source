package com.tencent.mm.plugin.music.b;

import android.os.Looper;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.f.c;
import com.tencent.mm.g.a.u;
import com.tencent.mm.g.a.u.a;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;

final class f$5
  implements com.tencent.mm.audio.mix.f.b
{
  f$5(f paramf)
  {
  }

  public final void b(u paramu)
  {
    AppMethodBeat.i(137274);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137274);
  }

  public final void c(u paramu)
  {
    AppMethodBeat.i(137275);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137275);
  }

  public final void d(u paramu)
  {
    AppMethodBeat.i(137276);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137276);
  }

  public final void e(u paramu)
  {
    AppMethodBeat.i(137277);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137277);
  }

  public final void f(u paramu)
  {
    AppMethodBeat.i(137278);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137278);
  }

  public final void g(u paramu)
  {
    AppMethodBeat.i(137279);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137279);
  }

  public final void h(u paramu)
  {
    AppMethodBeat.i(137280);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137280);
  }

  public final void i(u paramu)
  {
    AppMethodBeat.i(137281);
    a.xxA.a(paramu, Looper.getMainLooper());
    AppMethodBeat.o(137281);
  }

  public final void j(u paramu)
  {
    AppMethodBeat.i(137282);
    int i = paramu.csP.errCode;
    ab.i("MicroMsg.Audio.AudioPlayerMgr", "onError errCode:%d", new Object[] { Integer.valueOf(i) });
    com.tencent.mm.ag.b localb;
    if ((i == 709) || (i == 702) || (i == 703) || (i == 705) || (i == 706))
    {
      ab.e("MicroMsg.Audio.AudioPlayerMgr", "decode mix cache errors, don't callback to JS");
      if (this.oJW.oJL == null)
        break label249;
      localb = (com.tencent.mm.ag.b)this.oJW.oJC.get(paramu.csP.ckD);
      if (localb != null)
        break label127;
      AppMethodBeat.o(137282);
    }
    while (true)
    {
      return;
      a.xxA.a(paramu, Looper.getMainLooper());
      break;
      label127: this.oJW.oJL.zr(paramu.csP.errCode);
      if (!this.oJW.oJP.ee(localb.filePath))
      {
        if (this.oJW.oJO.containsKey(localb.filePath))
        {
          i = ((Integer)this.oJW.oJO.get(localb.filePath)).intValue();
          this.oJW.oJO.put(localb.filePath, Integer.valueOf(i + 1));
          AppMethodBeat.o(137282);
        }
        else
        {
          this.oJW.oJO.put(localb.filePath, Integer.valueOf(1));
        }
      }
      else
        label249: AppMethodBeat.o(137282);
    }
  }

  public final void k(u paramu)
  {
    AppMethodBeat.i(137283);
    com.tencent.mm.ag.b localb;
    if (this.oJW.oJL != null)
    {
      localb = (com.tencent.mm.ag.b)this.oJW.oJC.get(paramu.csP.ckD);
      if (localb == null)
        AppMethodBeat.o(137283);
    }
    while (true)
    {
      return;
      if (localb.fqQ > 1000000L)
        ab.e("MicroMsg.Audio.AudioPlayerMgr", "onRealPlay: %s, invokeCallTime:%d", new Object[] { localb.ckD, Long.valueOf(localb.fqQ) });
      String str1 = paramu.csP.clP;
      paramu = str1;
      if (TextUtils.isEmpty(str1))
        paramu = localb.clP;
      com.tencent.mm.plugin.music.b.a.d locald = this.oJW.oJL;
      String str2 = localb.ckD;
      long l1 = System.currentTimeMillis();
      long l2 = localb.fqO;
      long l3 = localb.fqP;
      long l4 = localb.fqQ;
      str1 = localb.filePath;
      long l5 = this.oJW.oJP.ea(localb.ckD);
      long l6 = localb.fileSize;
      String str3 = localb.filePath;
      locald.a(str2, paramu, l1 - l2, l3, l4, false, str1, l5, l6, com.tencent.mm.audio.mix.b.d.Dm().dy(str3));
      if (this.oJW.oJO.containsKey(localb.filePath))
        this.oJW.oJO.remove(localb.filePath);
      AppMethodBeat.o(137283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.b.f.5
 * JD-Core Version:    0.6.2
 */