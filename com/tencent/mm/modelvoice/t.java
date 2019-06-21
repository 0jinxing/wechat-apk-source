package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.audio.b.a;
import com.tencent.mm.audio.b.b;
import com.tencent.mm.audio.b.c;
import com.tencent.mm.compatible.b.c.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class t
  implements a
{
  private static int cri = 100;
  private b crg;
  String fileName;
  private j.a gat;
  private int status;

  public t(c.a parama)
  {
    AppMethodBeat.i(116659);
    this.fileName = "";
    this.gat = null;
    this.status = 0;
    this.crg = new b(parama);
    AppMethodBeat.o(116659);
  }

  public final boolean EB()
  {
    boolean bool = true;
    AppMethodBeat.i(116661);
    if (this.crg == null)
      AppMethodBeat.o(116661);
    while (true)
    {
      return bool;
      try
      {
        this.crg.EH();
        this.crg.release();
        this.fileName = "";
        this.status = 0;
        AppMethodBeat.o(116661);
      }
      catch (Exception localException)
      {
        ab.e("VoiceRecorder", "StopRecord File[" + this.fileName + "] ErrMsg[" + localException.getMessage() + "]");
        this.status = -1;
        AppMethodBeat.o(116661);
        bool = false;
      }
    }
  }

  public final int EC()
  {
    b localb = this.crg;
    if (((localb.cpa == c.a.eoQ) || (localb.cpa == c.a.eoS)) && (localb.coZ != null));
    for (int i = localb.coZ.cpR; ; i = 1)
      return i;
  }

  public final void a(j.a parama)
  {
    this.gat = parama;
  }

  public final boolean el(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116660);
    int i;
    g.a locala;
    if (bo.isNullOrNil(paramString))
    {
      i = 0;
      ab.i("VoiceRecorder", "[startRecord] fileName:%s size:%s", new Object[] { paramString, Integer.valueOf(i) });
      locala = new g.a();
      if (this.fileName.length() <= 0)
        break label79;
      ab.e("VoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      AppMethodBeat.o(116660);
    }
    while (true)
    {
      return bool;
      i = paramString.length();
      break;
      label79: this.fileName = paramString;
      try
      {
        paramString = this.crg;
        t.1 local1 = new com/tencent/mm/modelvoice/t$1;
        local1.<init>(this);
        paramString.a(local1);
        this.crg.EE();
        this.crg.EF();
        this.crg.ED();
        this.crg.setOutputFile(this.fileName);
        this.crg.setMaxDuration(70000);
        this.crg.prepare();
        this.crg.start();
        paramString = new java/lang/StringBuilder;
        paramString.<init>("StartRecord File[");
        ab.d("VoiceRecorder", this.fileName + "] start time:" + locala.Mr());
        this.status = 1;
        AppMethodBeat.o(116660);
        bool = true;
      }
      catch (Exception paramString)
      {
        ab.e("VoiceRecorder", "StartRecord File[" + this.fileName + "] ErrMsg[" + paramString.getMessage() + "]");
        this.status = -1;
        AppMethodBeat.o(116660);
      }
    }
  }

  public final int getMaxAmplitude()
  {
    AppMethodBeat.i(116662);
    int i;
    if (this.status == 1)
    {
      i = this.crg.getMaxAmplitude();
      if (i > cri)
        cri = i;
      i = i * 100 / cri;
      AppMethodBeat.o(116662);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(116662);
    }
  }

  public final int getStatus()
  {
    return this.status;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.t
 * JD-Core Version:    0.6.2
 */