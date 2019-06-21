package com.tencent.mm.plugin.collect.model.voice;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.g.a.bx;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.e.n;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public class a
  implements n.b
{
  public static final String hSQ;
  public static boolean kCR;
  public static float kCS;
  public static float kCT;
  public static final String kCU;
  public static final String kCV;
  private static a kDa;
  public d kCW;
  public a.c kCX;
  public a.b kCY;
  private String kCZ;
  public com.tencent.mm.sdk.b.c<bf> kDb;
  public com.tencent.mm.sdk.b.c<ne> kDc;
  private boolean kDd;
  private Object lock;

  static
  {
    AppMethodBeat.i(41024);
    kCR = false;
    kCS = 0.9F;
    kCT = 10.0F;
    hSQ = com.tencent.mm.compatible.util.e.eSi + "files/wxofflinevoice/";
    kCU = hSQ + "libreadMoney.so";
    kCV = hSQ + "woman_putonghua.pos";
    AppMethodBeat.o(41024);
  }

  public a()
  {
    AppMethodBeat.i(41012);
    this.lock = new Object();
    this.kDb = new a.1(this);
    this.kDc = new com.tencent.mm.sdk.b.c()
    {
      private boolean bgP()
      {
        AppMethodBeat.i(41007);
        ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "ReInitVoiceOffLineSynthesizerEvent");
        synchronized (a.a(a.this))
        {
          com.tencent.mm.plugin.collect.a.a.bgv();
          if (com.tencent.mm.plugin.collect.a.a.bgx())
          {
            a.b(a.this);
            AppMethodBeat.o(41007);
            return false;
          }
          ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "ReInitVoiceOffLineSynthesizerEvent isF2fRingToneOpen() == false");
        }
      }
    };
    this.kDd = false;
    AppMethodBeat.o(41012);
  }

  public static a bgJ()
  {
    AppMethodBeat.i(41013);
    try
    {
      if (kDa == null)
      {
        locala = new com/tencent/mm/plugin/collect/model/voice/a;
        locala.<init>();
        kDa = locala;
      }
      a locala = kDa;
      AppMethodBeat.o(41013);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(41013);
    }
  }

  private void bgL()
  {
    AppMethodBeat.i(41016);
    if (bgM())
    {
      kCR = true;
      ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() success!!");
      AppMethodBeat.o(41016);
    }
    while (true)
    {
      return;
      kCR = false;
      ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "reInitSynthesizer() fail!!");
      AppMethodBeat.o(41016);
    }
  }

  private boolean bgM()
  {
    AppMethodBeat.i(41017);
    com.tencent.mm.vfs.e.tf(hSQ);
    int i;
    boolean bool;
    if (com.tencent.mm.vfs.e.ct(kCU))
    {
      i = 1;
      if (i != 0)
        break label161;
      AppMethodBeat.o(41017);
      bool = false;
    }
    while (true)
    {
      return bool;
      b.c.dif();
      Object localObject1 = com.tencent.mm.pluginsdk.g.a.a.b.gM(60, 1);
      bool = com.tencent.mm.vfs.e.ct((String)localObject1);
      ab.d("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "cacheFile:%s", new Object[] { localObject1 });
      ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkSoEnviroment() %s no exist, cacheExist: %s", new Object[] { kCU, Boolean.valueOf(bool) });
      if (bool)
      {
        long l = com.tencent.mm.vfs.e.y((String)localObject1, kCU);
        ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile VOICE_SYNTHESIZER_PATH result == %s", new Object[] { Long.valueOf(l) });
        if (!bo.af(l, -1L))
        {
          i = 1;
          break;
        }
      }
      this.kDb.dnU();
      b.c.dif();
      com.tencent.mm.pluginsdk.g.a.a.b.Ky(60);
      i = 0;
      break;
      label161: localObject1 = (String)g.RP().Ry().get(ac.a.xXa, "0");
      if (bo.isEqual((String)localObject1, "0"))
        if (bgN())
        {
          this.kCZ = "woman_putonghua";
          i = 1;
        }
      Object localObject2;
      while (true)
      {
        if (i != 0)
          break label330;
        AppMethodBeat.o(41017);
        bool = false;
        break;
        this.kCZ = "";
        i = 0;
        continue;
        localObject2 = as.amF("voice_offline_res").getString((String)localObject1, "");
        if ((!bo.isNullOrNil((String)localObject2)) && (com.tencent.mm.vfs.e.ct((String)localObject2)))
        {
          this.kCZ = ((String)localObject1);
          i = 1;
        }
        else
        {
          ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "resPath:%s %s", new Object[] { bo.bc((String)localObject2, "null"), Boolean.valueOf(com.tencent.mm.vfs.e.ct((String)localObject2)) });
          if (bgN())
          {
            this.kCZ = "woman_putonghua";
            i = 1;
          }
          else
          {
            this.kCZ = "";
            i = 0;
          }
        }
      }
      label330: if (this.kCW != null);
      while (true)
      {
        try
        {
          this.kCW.kDp.destroy();
          this.kCW = d.a.kDq;
          localObject1 = this.kCW;
          localObject2 = this.kCY;
          ((d)localObject1).kDp.kDh = ((c)localObject2);
          d locald = this.kCW;
          localObject1 = hSQ;
          localObject2 = this.kCZ;
          String str = kCU;
          i = locald.kDp.I((String)localObject1, (String)localObject2, str);
          if (i >= 0)
            break label596;
          ab.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "init failed by ret = ".concat(String.valueOf(i)));
          if (!bo.gW(i, -201))
            break label551;
          if (!bo.isEqual(this.kCZ, "woman_putonghua"))
          {
            ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "voiceResName:%s fail, setVoiceOfflineLanguageResId(VOICE_DEFAULT_RES_ID)", new Object[] { this.kCZ });
            g.RP().Ry().set(ac.a.xXa, "0");
            com.tencent.mm.sdk.b.a.xxA.m(new ne());
            bgL();
          }
          AppMethodBeat.o(41017);
          bool = false;
        }
        catch (Exception localException)
        {
          ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "synthesizer.destroy() Exception:%s %s", new Object[] { localException.getClass().getSimpleName(), localException.getMessage() });
          AppMethodBeat.o(41017);
          bool = false;
        }
        break;
        label551: if (bo.gW(i, -207))
        {
          bool = com.tencent.mm.vfs.e.deleteFile(kCU);
          ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "ErrorCode.TTS_INIT_SO_ERROR delete %s : %s", new Object[] { kCU, Boolean.valueOf(bool) });
        }
      }
      label596: this.kCW.setVolume(kCT);
      this.kCW.aA(kCS);
      AppMethodBeat.o(41017);
      bool = true;
    }
  }

  private boolean bgN()
  {
    boolean bool1 = true;
    AppMethodBeat.i(41018);
    if (com.tencent.mm.vfs.e.ct(kCV))
      AppMethodBeat.o(41018);
    while (true)
    {
      return bool1;
      b.c.dif();
      String str = com.tencent.mm.pluginsdk.g.a.a.b.gM(60, 2);
      boolean bool2 = com.tencent.mm.vfs.e.ct(str);
      ab.d("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "cacheFile:%s", new Object[] { str });
      ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "checkDefaultResEnviroment() %s no exist, cacheExist: %s", new Object[] { kCV, Boolean.valueOf(bool2) });
      if (bool2)
      {
        long l = com.tencent.mm.vfs.e.y(str, kCV);
        ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "copyFile VOICE_DEFAULT_RES_PATH result == %s", new Object[] { Long.valueOf(l) });
        if (!bo.af(l, -1L))
          AppMethodBeat.o(41018);
      }
      else
      {
        this.kDb.dnU();
        b.c.dif();
        com.tencent.mm.pluginsdk.g.a.a.b.Ky(60);
        AppMethodBeat.o(41018);
        bool1 = false;
      }
    }
  }

  public final void a(int paramInt, n paramn, Object paramObject)
  {
    AppMethodBeat.i(41014);
    ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange()");
    if (this.kDd)
      AppMethodBeat.o(41014);
    while (true)
    {
      return;
      if (bgK())
      {
        ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "onNotifyChange() remove self");
        this.kDd = true;
        g.RP().Ry().b(this);
      }
      AppMethodBeat.o(41014);
    }
  }

  public final void a(bx parambx)
  {
    AppMethodBeat.i(41019);
    parambx = new a.a(this, parambx);
    this.kCY.a(parambx);
    this.kCW.start(parambx.cve);
    ab.d("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "produceVoice() %s", new Object[] { parambx.cve });
    AppMethodBeat.o(41019);
  }

  public final boolean bgK()
  {
    boolean bool = true;
    AppMethodBeat.i(41015);
    while (true)
    {
      synchronized (this.lock)
      {
        if (kCR)
        {
          ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() OFF_LINE == true");
          AppMethodBeat.o(41015);
          return bool;
        }
        com.tencent.mm.plugin.collect.a.a.bgv();
        if (com.tencent.mm.plugin.collect.a.a.bgx())
        {
          this.kDc.dnU();
          if (!bgM())
          {
            ab.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() fail!! ");
            kCR = false;
            AppMethodBeat.o(41015);
            continue;
          }
          ab.e("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "initTTS() success!! ");
          kCR = true;
        }
      }
      ab.i("MicroMsg.OfflineVoice.F2fRcvVoiceOffLineLogic", "isF2fRingToneOpen() == false");
      AppMethodBeat.o(41015);
      bool = false;
    }
  }

  public final String bgO()
  {
    AppMethodBeat.i(41022);
    if (bo.isEqual(this.kCZ, "woman_putonghua"));
    for (String str = "0"; ; str = this.kCZ)
    {
      AppMethodBeat.o(41022);
      return str;
    }
  }

  public final void setSpeed(float paramFloat)
  {
    AppMethodBeat.i(41021);
    if (this.kCW != null)
      this.kCW.aA(paramFloat);
    AppMethodBeat.o(41021);
  }

  public final void setVolume(float paramFloat)
  {
    AppMethodBeat.i(41020);
    if (this.kCW != null)
      this.kCW.setVolume(paramFloat);
    AppMethodBeat.o(41020);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.a
 * JD-Core Version:    0.6.2
 */