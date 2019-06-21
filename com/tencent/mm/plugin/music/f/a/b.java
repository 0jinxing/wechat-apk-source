package com.tencent.mm.plugin.music.f.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.sdk.platformtools.al;

public abstract class b
{
  protected e oLt;
  protected f oNQ;
  public g oNR = new g();

  public final void J(e parame)
  {
    this.oLt = parame;
  }

  public abstract void Tr(String paramString);

  public final void a(f paramf)
  {
    this.oNQ = paramf;
  }

  public abstract int bUA();

  public abstract String bUB();

  public abstract boolean bUz();

  public abstract int getDuration();

  public abstract boolean isPlaying();

  public void jy(boolean paramBoolean)
  {
    if (this.oNQ != null)
      al.d(new b.1(this, paramBoolean));
  }

  public void jz(boolean paramBoolean)
  {
    if (this.oNQ != null)
      al.d(new b.4(this, paramBoolean));
  }

  public final void onStart()
  {
    if (this.oNQ != null)
      al.d(new b.2(this));
  }

  public abstract void pause();

  public abstract void play();

  public abstract void seek(long paramLong);

  public abstract void stop();

  public final void zR(final int paramInt)
  {
    if (this.oNQ != null)
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(137651);
          if (b.this.bUz())
            b.this.oNQ.I(b.this.oLt);
          AppMethodBeat.o(137651);
        }
      });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.music.f.a.b
 * JD-Core Version:    0.6.2
 */