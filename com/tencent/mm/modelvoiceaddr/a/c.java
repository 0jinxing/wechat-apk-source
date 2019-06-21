package com.tencent.mm.modelvoiceaddr.a;

import android.content.SharedPreferences;
import android.os.Looper;
import android.os.Message;
import com.qq.wx.voice.vad.EVadNative;
import com.qq.wx.voice.vad.MMVoipVadNative;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.d;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Map;

public class c
{
  private static final String TAG;
  public static SharedPreferences ehZ;
  private boolean aAP;
  private boolean gbH;
  private int gbI;
  private boolean gbJ;
  private boolean gbK;
  private long gbL;
  private int gbM;
  private a gbN;
  private com.qq.wx.voice.vad.a gbO;
  public c.a gbP;
  private short[] gbQ;
  private ak handler;

  static
  {
    AppMethodBeat.i(116763);
    TAG = c.class.getSimpleName();
    ehZ = ah.doB();
    AppMethodBeat.o(116763);
  }

  public c()
  {
    this(3500, ehZ.getInt("sil_time", 1000), ehZ.getFloat("s_n_ration", 2.5F), ehZ.getInt("s_window", 500), ehZ.getInt("s_length", 350), ehZ.getInt("s_delay_time", 550), true, true);
    AppMethodBeat.i(116759);
    AppMethodBeat.o(116759);
  }

  public c(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(116760);
    this.gbH = true;
    this.gbI = 3;
    this.gbJ = false;
    this.gbK = false;
    this.gbL = 0L;
    this.gbM = 3500;
    this.aAP = false;
    this.handler = new ak(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(116757);
        if (paramAnonymousMessage.what != 0)
          AppMethodBeat.o(116757);
        while (true)
        {
          return;
          if (c.a(c.this) != null)
            c.a(c.this).CV();
          AppMethodBeat.o(116757);
        }
      }
    };
    this.gbN = null;
    this.gbO = null;
    this.gbM = paramInt1;
    this.gbO = new com.qq.wx.voice.vad.a();
    int i = 0;
    int j = i;
    Object localObject;
    if (ah.bqo())
    {
      localObject = com.tencent.mm.model.c.c.abi().ll("100235");
      j = i;
      if (((com.tencent.mm.storage.c)localObject).isValid())
        j = bo.getInt((String)((com.tencent.mm.storage.c)localObject).dru().get("MMVoipVadOn"), 0);
    }
    ab.i(TAG, "VoiceSilentDetectAPI: abTestFlag = [%s]", new Object[] { Integer.valueOf(j) });
    if (j == 0)
    {
      com.qq.wx.voice.vad.a.aU(false);
      localObject = this.gbO;
      if (!com.qq.wx.voice.vad.a.bCE)
        break label304;
      ((com.qq.wx.voice.vad.a)localObject).handle = ((com.qq.wx.voice.vad.a)localObject).bCD.Init(16000, paramInt2, paramFloat, paramInt3, paramInt4);
      label206: if (com.qq.wx.voice.vad.a.DEBUG)
        System.out.println("EVad Init handle = " + ((com.qq.wx.voice.vad.a)localObject).handle);
      if (((com.qq.wx.voice.vad.a)localObject).handle != 0L)
        break label329;
      paramInt2 = 1;
      label250: if (paramInt2 != 1)
      {
        localObject = this.gbO;
        if (((com.qq.wx.voice.vad.a)localObject).handle != 0L)
          break label334;
        paramInt2 = 1;
      }
    }
    while (true)
    {
      if (paramInt2 != 1)
        break label406;
      localObject = new b("Init ERROR");
      AppMethodBeat.o(116760);
      throw ((Throwable)localObject);
      com.qq.wx.voice.vad.a.aU(true);
      break;
      label304: ((com.qq.wx.voice.vad.a)localObject).handle = ((com.qq.wx.voice.vad.a)localObject).bCC.Init(16000, paramInt2, paramFloat, paramInt3, paramInt4);
      break label206;
      label329: paramInt2 = 0;
      break label250;
      label334: if (com.qq.wx.voice.vad.a.DEBUG)
        System.out.println("EVad Reset handle = " + ((com.qq.wx.voice.vad.a)localObject).handle);
      if (com.qq.wx.voice.vad.a.bCE)
        paramInt2 = ((com.qq.wx.voice.vad.a)localObject).bCD.Reset(((com.qq.wx.voice.vad.a)localObject).handle);
      else
        paramInt2 = ((com.qq.wx.voice.vad.a)localObject).bCC.Reset(((com.qq.wx.voice.vad.a)localObject).handle);
    }
    label406: this.gbN = new a(paramInt5 * 16);
    this.gbQ = new short[4000];
    this.handler.removeMessages(0);
    this.handler.sendEmptyMessageDelayed(0, paramInt1);
    this.gbJ = paramBoolean1;
    this.gbK = paramBoolean2;
    AppMethodBeat.o(116760);
  }

  public static String amz()
  {
    AppMethodBeat.i(116758);
    String str = String.format(Locale.CHINA, "%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %s", new Object[] { "sil_time", Integer.valueOf(ehZ.getInt("sil_time", 500)), "s_n_ration", Float.valueOf(ehZ.getFloat("s_n_ration", 2.5F)), "s_window", Integer.valueOf(ehZ.getInt("s_window", 500)), "s_length", Integer.valueOf(ehZ.getInt("s_length", 350)), "s_delay_time", Integer.valueOf(ehZ.getInt("s_delay_time", 550)) });
    AppMethodBeat.o(116758);
    return str;
  }

  public final void f(short[] paramArrayOfShort, int paramInt)
  {
    AppMethodBeat.i(116761);
    ab.d(TAG, "input() called with: voice = [%s], length = [%s]", new Object[] { paramArrayOfShort, Integer.valueOf(paramInt) });
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0) || (paramInt <= 0) || (paramInt > paramArrayOfShort.length))
      AppMethodBeat.o(116761);
    int i;
    long l;
    while (true)
    {
      return;
      if (this.aAP)
      {
        ab.i(TAG, "VoiceSilentDetectAPI is released.");
        AppMethodBeat.o(116761);
      }
      else if (this.gbN == null)
      {
        ab.i(TAG, "input, circleBuffer is null.");
        AppMethodBeat.o(116761);
      }
      else
      {
        i = this.gbO.b(paramArrayOfShort, paramInt);
        ab.d(TAG, "currState = %s,prevState = %s,directFirstStart = %s,directTempState = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(this.gbI), Boolean.valueOf(this.gbJ), Boolean.valueOf(this.gbK) });
        if (!this.gbJ)
          break label418;
        if (!this.gbK)
          break label362;
        l = System.currentTimeMillis();
        if (this.gbP != null)
          this.gbP.amv();
        this.gbL = l;
        if (!this.aAP)
          break;
        AppMethodBeat.o(116761);
      }
    }
    int j = this.gbN.gbF;
    int k = this.gbQ.length;
    label239: if (j > 0)
      if (k <= j)
        break label830;
    label418: label823: label830: for (int m = j; ; m = k)
    {
      this.gbN.d(this.gbQ, m);
      int n = j - m;
      j = n;
      if (this.gbP == null)
        break label239;
      this.gbP.c(this.gbQ, m);
      j = n;
      break label239;
      this.gbK = false;
      this.handler.removeMessages(0);
      this.handler.sendEmptyMessageDelayed(0, this.gbM);
      while (true)
      {
        this.gbH = false;
        this.gbI = i;
        label346: if (!this.aAP)
          break label747;
        AppMethodBeat.o(116761);
        break;
        label362: if ((this.gbI == 3) && (i == 2))
          this.gbJ = false;
        if ((this.gbI != 3) || (i != 3))
        {
          this.handler.removeMessages(0);
          this.handler.sendEmptyMessageDelayed(0, this.gbM);
        }
      }
      if ((this.gbI == 3) && (i == 2))
      {
        this.gbI = i;
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.gbM);
        l = System.currentTimeMillis();
        if (this.gbP != null)
          this.gbP.amv();
        this.gbL = l;
        if (this.aAP)
        {
          AppMethodBeat.o(116761);
          break;
        }
        j = this.gbN.gbF;
        k = this.gbQ.length;
        if (j > 0)
          if (k <= j)
            break label823;
      }
      for (m = j; ; m = k)
      {
        this.gbN.d(this.gbQ, m);
        n = j - m;
        j = n;
        if (this.gbP == null)
          break label517;
        this.gbP.c(this.gbQ, m);
        j = n;
        break label517;
        this.gbH = false;
        break label346;
        if ((this.gbI == 2) && (i == 3))
        {
          this.gbI = i;
          this.gbH = true;
          this.handler.removeMessages(0);
          this.handler.sendEmptyMessageDelayed(0, this.gbM);
          l = System.currentTimeMillis();
          if (this.gbP != null)
            this.gbP.amu();
          this.gbL = l;
          if (!this.aAP)
            break label346;
          AppMethodBeat.o(116761);
          break;
        }
        if ((this.gbI == 3) && (i == 3))
        {
          this.gbH = true;
          break label346;
        }
        if ((this.gbI != 2) || (i != 2))
          break label346;
        this.gbH = false;
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.gbM);
        break label346;
        label747: this.gbN.e(paramArrayOfShort, paramInt);
        ab.d(TAG, "isSilent %s", new Object[] { Boolean.valueOf(this.gbH) });
        if (this.gbH)
        {
          AppMethodBeat.o(116761);
          break;
        }
        if (this.gbP != null)
          this.gbP.c(paramArrayOfShort, paramInt);
        AppMethodBeat.o(116761);
        break;
      }
    }
  }

  public final void release()
  {
    AppMethodBeat.i(116762);
    ab.d(TAG, "released");
    this.aAP = true;
    this.gbJ = false;
    this.gbK = false;
    if (this.gbO != null)
    {
      if (this.gbO.vU() == 1)
      {
        b localb = new b();
        AppMethodBeat.o(116762);
        throw localb;
      }
      this.gbO = null;
    }
    this.gbN = null;
    this.gbQ = null;
    if (this.handler != null)
    {
      this.handler.removeMessages(0);
      this.handler = null;
    }
    this.gbP = null;
    AppMethodBeat.o(116762);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.a.c
 * JD-Core Version:    0.6.2
 */