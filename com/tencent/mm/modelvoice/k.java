package com.tencent.mm.modelvoice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.audio.b.a;
import com.tencent.mm.audio.b.c;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.audio.b.g.a;
import com.tencent.mm.audio.d.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class k
  implements a
{
  private static int fZW = 100;
  private int coK;
  public c coZ;
  c.a cpM;
  private d fZX;
  private String mFileName;
  public int mStatus;

  public k()
  {
    AppMethodBeat.i(116590);
    this.mFileName = null;
    this.coK = 0;
    this.mStatus = 0;
    this.cpM = new c.a()
    {
      public final void bN(int paramAnonymousInt1, int paramAnonymousInt2)
      {
      }

      public final void u(byte[] paramAnonymousArrayOfByte, int paramAnonymousInt)
      {
        AppMethodBeat.i(116589);
        if (k.a(k.this) != null)
          k.a(k.this).a(new g.a(paramAnonymousArrayOfByte, paramAnonymousInt), 0, false);
        k.a(k.this, paramAnonymousArrayOfByte, paramAnonymousInt);
        AppMethodBeat.o(116589);
      }
    };
    AppMethodBeat.o(116590);
  }

  private void clean()
  {
    AppMethodBeat.i(116593);
    if (this.coZ != null)
    {
      this.coZ.EB();
      this.coZ = null;
    }
    if (this.fZX != null)
    {
      this.fZX.Fe();
      this.fZX = null;
    }
    AppMethodBeat.o(116593);
  }

  public final boolean EB()
  {
    AppMethodBeat.i(116592);
    this.mFileName = null;
    this.mStatus = 0;
    clean();
    AppMethodBeat.o(116592);
    return true;
  }

  public final int EC()
  {
    return this.coZ.cpR;
  }

  public final void a(j.a parama)
  {
  }

  public final boolean el(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116591);
    if (!bo.isNullOrNil(this.mFileName))
    {
      ab.e("MicroMsg.SpeexRecorder", "Duplicate Call startRecord , maybe Stop Fail Before");
      AppMethodBeat.o(116591);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.SpeexRecorder", "[startRecord] fileName:%s", new Object[] { paramString });
      this.mStatus = 1;
      this.coK = 0;
      this.coZ = new c(16000, 1, 0);
      this.coZ.cpB = -19;
      if (q.etn.erW > 0)
        this.coZ.v(q.etn.erW, true);
      while (true)
      {
        this.coZ.bq(false);
        this.coZ.cpM = this.cpM;
        this.fZX = new d();
        if (this.fZX.eo(paramString))
          break label181;
        ab.e("MicroMsg.SpeexRecorder", "init speex writer failed");
        clean();
        this.mStatus = -1;
        AppMethodBeat.o(116591);
        break;
        this.coZ.v(5, false);
      }
      label181: if (!this.coZ.EL())
      {
        ab.e("MicroMsg.SpeexRecorder", "start record failed");
        clean();
        this.mStatus = -1;
        AppMethodBeat.o(116591);
      }
      else
      {
        this.mFileName = paramString;
        AppMethodBeat.o(116591);
        bool = true;
      }
    }
  }

  public final int getMaxAmplitude()
  {
    int i = this.coK;
    this.coK = 0;
    if (i > fZW)
      fZW = i;
    return i * 100 / fZW;
  }

  public final int getStatus()
  {
    return this.mStatus;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.k
 * JD-Core Version:    0.6.2
 */