package com.tencent.mm.modelvoiceaddr;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.ac;

public final class f
  implements com.tencent.mm.ai.f
{
  public static int cri;
  private static final String gaQ;
  private static final String gaR;
  com.tencent.mm.audio.b.c coZ;
  private c.a cpM;
  public int gaL;
  public int gaS;
  int gaT;
  boolean gaU;
  private int gaV;
  public boolean gaW;
  b gaX;
  com.tencent.mm.audio.d.a gaY;
  com.tencent.qqpinyin.voicerecoapi.c gaZ;
  private a gba;
  ak handler;

  static
  {
    AppMethodBeat.i(116703);
    gaQ = ac.eSj + "tmp_voiceaddr.spx";
    gaR = ac.eSj + "tmp_voiceaddr.amr";
    cri = 100;
    AppMethodBeat.o(116703);
  }

  public f(b paramb, int paramInt)
  {
    AppMethodBeat.i(116696);
    this.gaL = 1;
    this.gaS = 0;
    this.gaT = 0;
    this.gaU = false;
    this.gaV = 500000;
    this.gaW = false;
    this.gaX = null;
    this.gaZ = null;
    this.gba = null;
    this.cpM = new f.1(this);
    this.handler = new f.2(this);
    this.gaX = paramb;
    this.gaL = paramInt;
    if (this.gaL == 1);
    for (paramInt = i; ; paramInt = 1500000)
    {
      this.gaV = paramInt;
      AppMethodBeat.o(116696);
      return;
    }
  }

  private void finish()
  {
    AppMethodBeat.i(116698);
    ab.i("MicroMsg.SceneVoiceAddr", "finish");
    ab.c("MicroMsg.SceneVoiceAddr", "finish", new Object[0]);
    if (this.gba != null)
      this.gba.amj();
    this.handler.sendEmptyMessage(2);
    if (!this.gaU)
      this.handler.sendEmptyMessage(3);
    reset();
    AppMethodBeat.o(116698);
  }

  private void reset()
  {
    AppMethodBeat.i(116700);
    ab.i("MicroMsg.SceneVoiceAddr", "reset");
    try
    {
      if (this.coZ != null)
      {
        this.coZ.EB();
        this.coZ = null;
      }
      if (this.gaY != null)
      {
        this.gaY.Fe();
        this.gaY = null;
      }
      if (this.gaZ != null)
        this.gaZ.stop();
      this.gaZ = null;
      if (this.gba != null)
      {
        this.gba.amj();
        this.gba = null;
      }
      this.gaT = 0;
      this.gaU = false;
      return;
    }
    finally
    {
      AppMethodBeat.o(116700);
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(116699);
    this.gaX = null;
    finish();
    AppMethodBeat.o(116699);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(116697);
    long l;
    int i;
    if (this.gaL == 0)
    {
      ab.d("MicroMsg.SceneVoiceAddr", "removeSceneEndListener MMFunc_UploadInputVoice");
      g.Rg().b(349, this);
      paramString = ((a)paramm).amk();
      l = ((a)paramm).aml();
      if (paramString != null)
        break label135;
      i = -1;
      label55: ab.i("MicroMsg.SceneVoiceAddr", "onSceneEnd errType:%d errCode:%d list:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (this.gaX == null)
        break label154;
      if ((paramInt2 == 0) && (paramInt1 == 0))
        break label142;
      this.gaX.amr();
      cancel();
      AppMethodBeat.o(116697);
    }
    while (true)
    {
      return;
      g.Rg().b(206, this);
      break;
      label135: i = paramString.length;
      break label55;
      label142: this.gaX.a(paramString, l);
      label154: AppMethodBeat.o(116697);
    }
  }

  public static abstract interface b
  {
    public abstract void a(String[] paramArrayOfString, long paramLong);

    public abstract void amr();

    public abstract void ams();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.f
 * JD-Core Version:    0.6.2
 */