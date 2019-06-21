package com.tencent.mm.audio.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.c.a;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;

public final class j
{
  public static int cri = 100;
  private com.tencent.mm.compatible.util.b cop;
  public b crg;
  public j.a crh;
  String fileName;
  public int status;

  public j()
  {
    AppMethodBeat.i(116530);
    this.fileName = "";
    this.crh = null;
    this.status = 0;
    this.crg = new b(c.a.eoR);
    this.cop = new com.tencent.mm.compatible.util.b(ah.getContext());
    AppMethodBeat.o(116530);
  }

  public final boolean EB()
  {
    boolean bool = true;
    AppMethodBeat.i(116532);
    this.cop.Mm();
    if (this.crg == null)
      AppMethodBeat.o(116532);
    while (true)
    {
      return bool;
      try
      {
        this.crg.EH();
        this.crg.release();
        this.fileName = "";
        this.status = 0;
        AppMethodBeat.o(116532);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.SimpleVoiceRecorder", "StopRecord File[" + this.fileName + "] ErrMsg[" + localException.getMessage() + "]");
        this.status = -1;
        AppMethodBeat.o(116532);
        bool = false;
      }
    }
  }

  public final boolean en(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116531);
    g.a locala = new g.a();
    if (this.fileName.length() > 0)
    {
      ab.e("MicroMsg.SimpleVoiceRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      AppMethodBeat.o(116531);
    }
    while (true)
    {
      return bool;
      this.fileName = paramString;
      try
      {
        this.cop.requestFocus();
        b localb = this.crg;
        paramString = new com/tencent/mm/audio/b/j$1;
        paramString.<init>(this);
        localb.a(paramString);
        this.crg.EE();
        this.crg.EF();
        this.crg.ED();
        this.crg.setOutputFile(this.fileName);
        this.crg.setMaxDuration(3600010);
        this.crg.prepare();
        this.crg.start();
        paramString = new java/lang/StringBuilder;
        paramString.<init>("StartRecord File[");
        ab.d("MicroMsg.SimpleVoiceRecorder", this.fileName + "] start time:" + locala.Mr());
        this.status = 1;
        AppMethodBeat.o(116531);
        bool = true;
      }
      catch (Exception paramString)
      {
        this.cop.Mm();
        ab.e("MicroMsg.SimpleVoiceRecorder", "StartRecord File[" + this.fileName + "] ErrMsg[" + paramString.getMessage() + "]");
        this.status = -1;
        AppMethodBeat.o(116531);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.j
 * JD-Core Version:    0.6.2
 */