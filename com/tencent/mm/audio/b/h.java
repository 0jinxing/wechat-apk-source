package com.tencent.mm.audio.b;

import android.content.Context;
import android.media.AudioManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.j;
import com.tencent.mm.ai.j.a;
import com.tencent.mm.ai.j.b;
import com.tencent.mm.compatible.b.c;
import com.tencent.mm.compatible.b.c.a;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvoice.k;
import com.tencent.mm.modelvoice.m;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.t;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public class h
  implements j, g.a
{
  private static boolean cph = false;
  private boolean cqA;
  private boolean cqB;
  private long cqC;
  public int cqD;
  private boolean cqE;
  private boolean cqF;
  private int cqG;
  private c.a cqH;
  protected j.b cqI;
  protected j.a cqJ;
  private boolean cqK;
  private ap cqL;
  private Runnable cqM;
  private a cqw;
  private b cqx;
  private h.a cqy;
  private String cqz;
  private String mFileName;
  private long mRecordStartTime;

  public h(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(116502);
    this.cqw = null;
    this.cqy = null;
    this.mFileName = "";
    this.cqA = false;
    this.cqB = false;
    this.mRecordStartTime = 0L;
    this.cqD = 0;
    this.cqE = false;
    this.cqF = false;
    this.cqG = 0;
    this.cqH = c.a.eoU;
    this.cqJ = null;
    this.cqK = false;
    this.cqL = new ap(new h.1(this), true);
    this.cqx = new b(paramContext);
    this.cqF = paramBoolean;
    ab.i("MicroMsg.SceneVoice.Recorder", "new SceneVoiceRecorder, useSpeex: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(116502);
  }

  private void EU()
  {
    AppMethodBeat.i(116509);
    h.3 local3 = new h.3(this);
    if (this.cqw != null)
      this.cqw.a(local3);
    AppMethodBeat.o(116509);
  }

  private void EW()
  {
    AppMethodBeat.i(116512);
    if (this.cqE)
    {
      ab.i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] return mHasBeginRec is true!");
      AppMethodBeat.o(116512);
      return;
    }
    this.cqE = true;
    if (this.cqF)
      this.cqH = c.a.eoT;
    for (this.cqw = new k(); ; this.cqw = new t(this.cqH))
    {
      EU();
      EX();
      this.cqy = new h.a(this);
      ab.i("MicroMsg.SceneVoice.Recorder", "[startRecordInternal] mRecordStartRunnable has post! threadPool:%s", new Object[] { d.xDG.dqb() });
      d.post(this.cqy, "SceneVoiceRecorder_record");
      this.cqG = 1;
      this.cqL.ae(3000L, 3000L);
      ab.d("MicroMsg.SceneVoice.Recorder", "start end time:" + bo.az(this.cqC));
      AppMethodBeat.o(116512);
      break;
      EZ();
    }
  }

  private void EX()
  {
    AppMethodBeat.i(116513);
    h.4 local4 = new h.4(this);
    this.cqM = local4;
    al.n(local4, 600L);
    AppMethodBeat.o(116513);
  }

  private void EZ()
  {
    AppMethodBeat.i(116514);
    this.cqH = c.KI();
    String str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("VoiceFormat");
    String str2 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("VoiceFormatToQQ");
    if (this.cqH == c.a.eoQ)
    {
      if ((4 == bo.getInt(str1, 4)) && (g.b.ES()))
        this.cqH = c.a.eoS;
      if ((this.cqz != null) && (this.cqz.endsWith("@qqim")))
        this.cqH = c.a.eoR;
    }
    if (this.cqH == c.a.eoQ)
    {
      ab.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode, still in pcm mode, force to amr mode");
      this.cqH = c.a.eoR;
    }
    ab.i("MicroMsg.SceneVoice.Recorder", "refreshRecordMode dynamicFormat:%s dynamicFormatQQ:%s recdMode:%s isSilkSoLoadSuccess:%b", new Object[] { str1, str2, this.cqH, Boolean.valueOf(g.b.ES()) });
    AppMethodBeat.o(116514);
  }

  public boolean EH()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(116508);
    if (this.cqL != null)
    {
      this.cqL.stopTimer();
      this.cqL.removeCallbacksAndMessages(null);
    }
    com.tencent.mm.compatible.b.g.KK().b(this);
    if (this.cqK)
    {
      com.tencent.mm.compatible.b.g.KK().KN();
      this.cqK = false;
    }
    this.cqD = ((int)EV());
    ab.i("MicroMsg.SceneVoice.Recorder", "stop Record : %s, len: %s", new Object[] { this.mFileName, Integer.valueOf(this.cqD) });
    if ((this.cqw != null) && (!bo.isNullOrNil(this.mFileName)) && (!this.cqF))
    {
      com.tencent.mm.compatible.h.a locala = new com.tencent.mm.compatible.h.a();
      locala.euD = this.mFileName;
      locala.euE = this.cqD;
      locala.euF = 2;
      locala.cvG = this.cqw.EC();
      com.tencent.mm.plugin.report.service.h.pYm.X(10513, locala.Mk());
    }
    try
    {
      ab.i("MicroMsg.SceneVoice.Recorder", "stop synchronized Record:%s, recorder:%s, lock[%s] of stop[%s]!", new Object[] { this.mFileName, this.cqw, Long.valueOf(Thread.currentThread().getId()), this });
      if (this.cqw != null)
      {
        this.cqw.EB();
        this.cqx.Mm();
      }
      if (this.cqG != 2)
      {
        q.uS(this.mFileName);
        this.mFileName = null;
        ab.i("MicroMsg.SceneVoice.Recorder", "Stop " + this.mFileName + " by not onPart: " + bo.az(this.cqC));
        this.cqG = -1;
        AppMethodBeat.o(116508);
        return bool2;
      }
    }
    finally
    {
      AppMethodBeat.o(116508);
    }
    if ((this.cqD < 800L) || ((this.cqA) && (this.cqD < 1000L)))
    {
      ab.i("MicroMsg.SceneVoice.Recorder", "Stop " + this.mFileName + " by voiceLen: " + this.cqD);
      q.uS(this.mFileName);
      this.mFileName = "";
    }
    for (bool2 = false; ; bool2 = bool1)
    {
      this.mFileName = "";
      break;
      q.ah(this.mFileName, this.cqD);
      m.amc().run();
      ab.i("MicroMsg.SceneVoice.Recorder", "Stop file success: " + this.mFileName);
    }
  }

  public final int ET()
  {
    return this.cqD;
  }

  public final long EV()
  {
    long l = 0L;
    AppMethodBeat.i(116510);
    if (this.mRecordStartTime == 0L)
      AppMethodBeat.o(116510);
    while (true)
    {
      return l;
      l = bo.az(this.mRecordStartTime);
      AppMethodBeat.o(116510);
    }
  }

  public final int EY()
  {
    int i;
    if (this.cqF)
      i = 1;
    while (true)
    {
      return i;
      if ((this.cqH == c.a.eoQ) || (this.cqH == c.a.eoR))
        i = 0;
      else if (this.cqH == c.a.eoS)
        i = 2;
      else
        i = -1;
    }
  }

  public final void a(j.a parama)
  {
    this.cqJ = parama;
  }

  public final void a(j.b paramb)
  {
    this.cqI = paramb;
  }

  public final boolean cancel()
  {
    AppMethodBeat.i(116507);
    ab.d("MicroMsg.SceneVoice.Recorder", "cancel Record :" + this.mFileName);
    try
    {
      Object localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("lock[%s] of cancel[%s]! stop synchronized Record:");
      ab.i("MicroMsg.SceneVoice.Recorder", this.mFileName, new Object[] { Long.valueOf(Thread.currentThread().getId()), this });
      if (this.cqw != null)
      {
        this.cqw.EB();
        this.cqx.Mm();
      }
      com.tencent.mm.compatible.b.g.KK().b(this);
      if (this.cqK)
      {
        com.tencent.mm.compatible.b.g.KK().KN();
        this.cqK = false;
      }
      q.uQ(this.mFileName);
      m.amc().run();
      if ((this.cqw != null) && (!bo.isNullOrNil(this.mFileName)) && (!this.cqF))
      {
        localObject1 = new com.tencent.mm.compatible.h.a();
        ((com.tencent.mm.compatible.h.a)localObject1).euD = this.mFileName;
        ((com.tencent.mm.compatible.h.a)localObject1).euE = EV();
        ((com.tencent.mm.compatible.h.a)localObject1).euF = 1;
        ((com.tencent.mm.compatible.h.a)localObject1).cvG = this.cqw.EC();
        com.tencent.mm.plugin.report.service.h.pYm.X(10513, ((com.tencent.mm.compatible.h.a)localObject1).Mk());
      }
      this.mFileName = "";
      AppMethodBeat.o(116507);
      return true;
    }
    finally
    {
      AppMethodBeat.o(116507);
    }
  }

  public final boolean em(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(116506);
    ab.i("MicroMsg.SceneVoice.Recorder", "Start Record to  ".concat(String.valueOf(paramString)));
    reset();
    this.cqz = paramString;
    this.cqC = bo.yz();
    if (paramString == null)
    {
      ab.e("MicroMsg.SceneVoice.Recorder", "Start Record toUser null");
      AppMethodBeat.o(116506);
      return bool;
    }
    this.cqA = paramString.equals("_USER_FOR_THROWBOTTLE_");
    if (paramString.equals("medianote"))
    {
      if ((r.YD() & 0x4000) == 0)
        this.cqB = true;
    }
    else
    {
      label95: if (this.cqF)
        break label192;
      if (!this.cqA)
        break label172;
      this.mFileName = u.uY(r.Yz());
    }
    while (true)
    {
      if ((this.mFileName != null) && (this.mFileName.length() > 0))
        break label203;
      ab.e("MicroMsg.SceneVoice.Recorder", "Start Record DBError fileName:%s", new Object[] { this.mFileName });
      AppMethodBeat.o(116506);
      break;
      this.cqB = false;
      break label95;
      label172: if (this.cqB)
        this.mFileName = u.uY("medianote");
      else
        label192: this.mFileName = q.uP(paramString);
    }
    label203: com.tencent.mm.compatible.b.g.KK().a(this);
    this.cqE = false;
    this.cqK = false;
    if ((com.tencent.mm.compatible.b.g.KS()) && (!com.tencent.mm.compatible.b.g.KK().eoY.isBluetoothScoOn()))
    {
      this.cqK = true;
      com.tencent.mm.compatible.b.g.KK().KM();
      al.n(new h.2(this), 1000L);
    }
    while (true)
    {
      AppMethodBeat.o(116506);
      bool = true;
      break;
      EW();
    }
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(116511);
    ab.d("MicroMsg.SceneVoice.Recorder", "dkbt Recorder onBluetoothHeadsetStateChange :".concat(String.valueOf(paramInt)));
    if (paramInt == 1)
      EW();
    AppMethodBeat.o(116511);
  }

  public String getFileName()
  {
    return this.mFileName;
  }

  public final int getMaxAmplitude()
  {
    AppMethodBeat.i(116505);
    int i;
    if (this.cqw == null)
    {
      i = 0;
      AppMethodBeat.o(116505);
    }
    while (true)
    {
      return i;
      i = this.cqw.getMaxAmplitude();
      AppMethodBeat.o(116505);
    }
  }

  public final boolean isRecording()
  {
    boolean bool = false;
    AppMethodBeat.i(116504);
    if (this.cqw == null)
      AppMethodBeat.o(116504);
    while (true)
    {
      return bool;
      if (this.cqw.getStatus() == 1)
      {
        AppMethodBeat.o(116504);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(116504);
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(116503);
    if (this.cqw != null)
    {
      this.cqw.EB();
      this.cqx.Mm();
      ab.e("MicroMsg.SceneVoice.Recorder", "Reset recorder.stopReocrd");
    }
    this.mFileName = "";
    this.cqC = 0L;
    this.cqy = null;
    this.cqH = c.a.eoU;
    this.cqG = 0;
    this.mRecordStartTime = 0L;
    AppMethodBeat.o(116503);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.h
 * JD-Core Version:    0.6.2
 */