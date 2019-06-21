package com.tencent.mm.plugin.appbrand.media.record.record_imp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public int aOn;
  public c coZ;
  public int cpA;
  public RecordParam imf;
  public long img;
  public a.a imh;
  public c.a imi;
  public int sampleRate;

  public a(RecordParam paramRecordParam)
  {
    AppMethodBeat.i(105658);
    this.coZ = null;
    this.sampleRate = 0;
    this.aOn = 0;
    this.img = 0L;
    this.cpA = -1;
    this.imi = new a.1(this);
    RecordParam localRecordParam = paramRecordParam;
    if (paramRecordParam == null)
      localRecordParam = new RecordParam();
    this.sampleRate = localRecordParam.sampleRate;
    this.aOn = localRecordParam.imk;
    this.cpA = localRecordParam.scene;
    this.imf = localRecordParam;
    AppMethodBeat.o(105658);
  }

  public final boolean EB()
  {
    AppMethodBeat.i(105659);
    ab.i("MicroMsg.Record.AppBrandRecorder", "stopRecord");
    if (this.coZ != null);
    for (boolean bool = this.coZ.EB(); ; bool = false)
    {
      long l = System.currentTimeMillis();
      this.img -= l;
      ab.i("MicroMsg.Record.AppBrandRecorder", "stop time ticket:%d, costTimeInMs:%d", new Object[] { Long.valueOf(l), Long.valueOf(this.img) });
      AppMethodBeat.o(105659);
      return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.record_imp.a
 * JD-Core Version:    0.6.2
 */