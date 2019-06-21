package com.tencent.mm.plugin.facedetect.d;

import android.content.SharedPreferences;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.d.d;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.util.ArrayList;

public final class a
{
  private static final String lUR;
  public static final String lUW;
  com.tencent.mm.audio.b.c coZ;
  private com.tencent.mm.audio.b.c.a cpM;
  private int gaS;
  int gaT;
  com.tencent.mm.audio.d.a gaY;
  boolean gbH;
  com.tencent.mm.modelvoiceaddr.a.c gbh;
  private com.tencent.mm.modelvoiceaddr.a.c.a gbi;
  a.b lUS;
  boolean lUT;
  String lUU;
  ArrayList<com.tencent.mm.audio.b.c.a> lUV;
  public com.tencent.mm.audio.b.c.a lUX;

  static
  {
    AppMethodBeat.i(295);
    lUR = p.bsO() + "/fdv_v_";
    lUW = h.getExternalStorageDirectory().getAbsolutePath() + "/temp_debug_raw.spx";
    AppMethodBeat.o(295);
  }

  public a()
  {
    AppMethodBeat.i(292);
    this.lUS = null;
    this.gbH = true;
    this.lUT = false;
    this.lUU = "";
    this.lUV = new ArrayList(5);
    this.gaT = 0;
    this.gaS = 0;
    this.lUX = new a.1(this);
    this.cpM = new a.2(this);
    this.gbi = new com.tencent.mm.modelvoiceaddr.a.c.a()
    {
      public final void CV()
      {
        AppMethodBeat.i(290);
        ab.d("MicroMsg.FaceVoiceRecordLogic", "Silent enough to finish");
        if (a.e(a.this) != null)
          a.e(a.this).onError(11);
        AppMethodBeat.o(290);
      }

      public final void amu()
      {
        AppMethodBeat.i(288);
        ab.d("MicroMsg.FaceVoiceRecordLogic", "hy: onSpeakToSilent");
        AppMethodBeat.o(288);
      }

      public final void amv()
      {
        AppMethodBeat.i(289);
        ab.d("MicroMsg.FaceVoiceRecordLogic", "hy: onSilentToSpeak");
        if (a.e(a.this) != null)
          a.e(a.this).bsU();
        AppMethodBeat.o(289);
      }

      public final void c(short[] paramAnonymousArrayOfShort, int paramAnonymousInt)
      {
        AppMethodBeat.i(287);
        ab.d("MicroMsg.FaceVoiceRecordLogic", "onFilteredSpeakVoice data %s size %d", new Object[] { paramAnonymousArrayOfShort, Integer.valueOf(paramAnonymousInt) });
        AppMethodBeat.o(287);
      }
    };
    AppMethodBeat.o(292);
  }

  public final void a(com.tencent.mm.audio.b.c.a parama)
  {
    AppMethodBeat.i(294);
    this.lUV.add(parama);
    AppMethodBeat.o(294);
  }

  public final void bsT()
  {
    AppMethodBeat.i(293);
    e.deleteFile(this.lUU);
    AppMethodBeat.o(293);
  }

  final class a
    implements Runnable
  {
    private Runnable lUZ = null;

    private a(Runnable arg2)
    {
      Object localObject;
      this.lUZ = localObject;
    }

    public final void run()
    {
      AppMethodBeat.i(291);
      while (true)
      {
        Object localObject2;
        synchronized (a.this)
        {
          if (a.a(a.this))
            break label572;
          ab.i("MicroMsg.FaceVoiceRecordLogic", "hy: initDeviceInLock");
          a locala2 = a.this;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          a.a(locala2, a.lUR + bo.yz() + ".spx");
          try
          {
            e.deleteFile(a.b(a.this));
            locala2 = a.this;
            localObject2 = new com/tencent/mm/audio/b/c;
            ((com.tencent.mm.audio.b.c)localObject2).<init>(16000, 1, 3);
            a.a(locala2, (com.tencent.mm.audio.b.c)localObject2);
            a.c(a.this).cpB = -19;
            a.c(a.this).bq(false);
            locala2 = a.this;
            localObject2 = new com/tencent/mm/audio/d/d;
            ((d)localObject2).<init>();
            a.a(locala2, (com.tencent.mm.audio.d.a)localObject2);
            if (!a.d(a.this).eo(a.b(a.this)))
            {
              ab.e("MicroMsg.FaceVoiceRecordLogic", "hy: init speex writer failed");
              a.d(a.this).Fe();
              a.a(a.this, null);
              if (a.e(a.this) != null)
                a.e(a.this).onError(5);
              AppMethodBeat.o(291);
              return;
            }
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", localException, "hy: delete file failed", new Object[0]);
            continue;
          }
        }
        if (q.etn.erW > 0)
        {
          a.c(a.this).v(q.etn.erW, true);
          a.c(a.this).gG(50);
          a.c(a.this).br(false);
        }
        try
        {
          localObject2 = a.this;
          com.tencent.mm.modelvoiceaddr.a.c localc = new com/tencent/mm/modelvoiceaddr/a/c;
          localc.<init>(5000, com.tencent.mm.modelvoiceaddr.a.c.ehZ.getInt("sil_time", 200), com.tencent.mm.modelvoiceaddr.a.c.ehZ.getFloat("s_n_ration", 2.5F), com.tencent.mm.modelvoiceaddr.a.c.ehZ.getInt("s_window", 50), com.tencent.mm.modelvoiceaddr.a.c.ehZ.getInt("s_length", 35), com.tencent.mm.modelvoiceaddr.a.c.ehZ.getInt("s_delay_time", 20), false, false);
          a.a((a)localObject2, localc);
          a.g(a.this).gbP = a.f(a.this);
          a.c(a.this).cpM = a.this.lUX;
          a.this.a(a.h(a.this));
          if (!a.c(a.this).EL())
          {
            ab.e("MicroMsg.FaceVoiceRecordLogic", "hy: start record failed");
            if (a.e(a.this) == null)
              continue;
            a.e(a.this).onError(7);
            continue;
            a.c(a.this).v(5, false);
          }
        }
        catch (Throwable localThrowable)
        {
          while (true)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>("hy: init VoiceDetectAPI failed :");
            ab.e("MicroMsg.FaceVoiceRecordLogic", localThrowable.getMessage());
            if (a.e(a.this) != null)
              a.e(a.this).onError(6);
          }
        }
        if (this.lUZ != null)
        {
          this.lUZ.run();
          continue;
          label572: ab.w("MicroMsg.FaceVoiceRecordLogic", "hy: already called stop. should not start record");
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.d.a
 * JD-Core Version:    0.6.2
 */