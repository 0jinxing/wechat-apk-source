package com.tencent.mm.audio.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.ai.h.c;
import com.tencent.mm.ai.h.d;
import com.tencent.mm.audio.b.g.b;
import com.tencent.mm.compatible.b.g;
import com.tencent.mm.compatible.b.g.a;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b.a;
import com.tencent.mm.modelvoice.d.b;
import com.tencent.mm.modelvoice.i;
import com.tencent.mm.modelvoice.j;
import com.tencent.mm.modelvoice.o;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.s;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.vfs.e;
import junit.framework.Assert;

public final class a
  implements h, g.a
{
  private static String cox = null;
  private boolean coA;
  private b.a coB;
  public h.b coC;
  public h.a coD;
  private com.tencent.mm.modelvoice.d col;
  private boolean com;
  private boolean con;
  private Context context;
  private boolean coo;
  private b cop;
  private int coq;
  private boolean cor;
  private boolean cos;
  private boolean cot;
  private h.c cou;
  private h.d cov;
  private String cow;
  private boolean coy;
  private boolean coz;

  public a(Context paramContext)
  {
    this(paramContext, 0);
  }

  public a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(116456);
    this.col = null;
    this.context = null;
    this.com = false;
    this.con = false;
    this.coo = false;
    this.coq = 0;
    this.cor = false;
    this.cos = false;
    this.cot = true;
    this.cow = null;
    this.coy = true;
    this.coz = true;
    this.coA = false;
    this.coB = new a.1(this);
    this.coC = null;
    this.context = paramContext;
    this.cop = new b(paramContext);
    this.coq = paramInt;
    new g.b();
    AppMethodBeat.o(116456);
  }

  private void Ey()
  {
    AppMethodBeat.i(116468);
    a.4 local4 = new a.4(this);
    if (this.col != null)
      this.col.a(local4);
    AppMethodBeat.o(116468);
  }

  private void setError()
  {
    AppMethodBeat.i(116467);
    d.b local3 = new d.b()
    {
      public final void onError()
      {
        AppMethodBeat.i(116451);
        g.KK().b(a.this);
        if (a.b(a.this))
        {
          g.KK().KN();
          a.c(a.this);
        }
        g.KK().setMode(0);
        ab.i("MicroMsg.SceneVoicePlayer", "setError abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s", new Object[] { Boolean.valueOf(a.d(a.this)), Boolean.valueOf(a.e(a.this)) });
        if (a.e(a.this))
        {
          a.f(a.this).Mm();
          a.g(a.this);
        }
        if (a.h(a.this) != null)
          al.d(new a.3.1(this));
        AppMethodBeat.o(116451);
      }
    };
    if (this.col != null)
      this.col.a(local3);
    AppMethodBeat.o(116467);
  }

  public final boolean DA()
  {
    boolean bool = false;
    AppMethodBeat.i(116471);
    if (this.col == null)
      AppMethodBeat.o(116471);
    while (true)
    {
      return bool;
      if (this.col.getStatus() == 2)
      {
        bool = true;
        AppMethodBeat.o(116471);
      }
      else
      {
        AppMethodBeat.o(116471);
      }
    }
  }

  public final boolean Ew()
  {
    boolean bool = false;
    AppMethodBeat.i(116462);
    if (this.col == null)
      AppMethodBeat.o(116462);
    while (true)
    {
      return bool;
      ab.i("MicroMsg.SceneVoicePlayer", "resume");
      bool = this.col.Ew();
      if (bool)
      {
        g.KK().KM();
        this.cos = true;
        if (g.KK().KP())
          this.com = false;
        g.KK().f(this.com, false, false);
      }
      ab.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", new Object[] { Boolean.valueOf(this.coy), Boolean.valueOf(this.coA) });
      if (this.coA)
      {
        this.cop.requestFocus();
        this.coA = false;
      }
      AppMethodBeat.o(116462);
    }
  }

  public final boolean Ex()
  {
    return this.con;
  }

  public final double Ez()
  {
    AppMethodBeat.i(116469);
    double d;
    if (this.col == null)
    {
      d = 0.0D;
      AppMethodBeat.o(116469);
    }
    while (true)
    {
      return d;
      d = this.col.Ez();
      AppMethodBeat.o(116469);
    }
  }

  public final void a(h.a parama)
  {
    this.coD = parama;
  }

  public final void a(h.b paramb)
  {
    this.coC = paramb;
  }

  public final void a(h.c paramc)
  {
    this.cou = paramc;
  }

  public final void a(h.d paramd)
  {
    this.cov = paramd;
  }

  public final boolean a(String paramString, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    AppMethodBeat.i(116459);
    ab.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean), Boolean.TRUE, Integer.valueOf(paramInt1), Integer.valueOf(this.coq) });
    boolean bool2;
    if (paramString.length() > 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      if (e.ct(paramString))
        break label110;
      ab.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", new Object[] { paramString, paramString });
      AppMethodBeat.o(116459);
      paramBoolean = bool1;
    }
    while (true)
    {
      return paramBoolean;
      bool2 = false;
      break;
      label110: int i = paramInt1;
      if (paramInt1 == -1)
        i = o.g(paramString, this.coq, true);
      if (i == 0)
        if (this.context != null)
          this.col = new s(this.context);
      while (true)
      {
        if (this.col != null)
        {
          this.col.b(this.coB);
          this.cop.a(this.coB);
          this.col.alP();
        }
        this.com = paramBoolean;
        this.cor = paramBoolean;
        if ((g.KK().KV()) || (g.KK().KP()))
        {
          ab.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(g.KK().KV()), Boolean.valueOf(g.KK().KP()) });
          this.com = false;
        }
        g.KK().f(this.com, false, false);
        Ey();
        setError();
        g.KK().a(this);
        if (!g.KK().KV())
        {
          g.KK().KM();
          this.cos = true;
        }
        if (this.col.c(paramString, this.com, paramInt2))
          break label497;
        ab.i("MicroMsg.SceneVoicePlayer", "start play fileName[" + paramString + "], [" + paramBoolean + "]");
        g.KK().KN();
        this.cos = false;
        AppMethodBeat.o(116459);
        paramBoolean = bool1;
        break;
        this.col = new s();
        continue;
        if (i == 1)
        {
          if (this.context != null)
            this.col = new j(this.context);
          else
            this.col = new j();
        }
        else if (i == 2)
          if (this.context != null)
            this.col = new i(this.context);
          else
            this.col = new i();
      }
      label497: ab.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s", new Object[] { Boolean.valueOf(this.coy) });
      if (this.coy)
      {
        this.cop.requestFocus();
        this.coA = true;
      }
      this.coz = true;
      AppMethodBeat.o(116459);
      paramBoolean = true;
    }
  }

  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    boolean bool1 = false;
    AppMethodBeat.i(116458);
    ab.i("MicroMsg.SceneVoicePlayer", "start file name:[%s] speakerOn:[%b], isFullPath: %s, type: %s, userType: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramInt), Integer.valueOf(this.coq) });
    boolean bool2;
    String str;
    if (paramString.length() > 0)
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      cox = this.cow;
      this.cow = paramString;
      if (!paramBoolean2)
        break label142;
      str = paramString;
      label90: if (e.ct(str))
        break label160;
      if (!paramBoolean2)
        break label151;
      str = paramString;
      label105: ab.e("MicroMsg.SceneVoicePlayer", "start, file %s not exist!, fullPath: %s", new Object[] { paramString, str });
      AppMethodBeat.o(116458);
      paramBoolean1 = bool1;
    }
    while (true)
    {
      return paramBoolean1;
      bool2 = false;
      break;
      label142: str = q.getFullPath(paramString);
      break label90;
      label151: str = q.getFullPath(paramString);
      break label105;
      label160: int i = paramInt;
      if (paramInt == -1)
        i = o.g(paramString, this.coq, paramBoolean2);
      if (i == 0)
        if (this.context != null)
        {
          this.col = new s(this.context);
          label208: if (this.col != null)
          {
            this.col.b(this.coB);
            this.cop.a(this.coB);
            this.col.alP();
          }
          this.com = paramBoolean1;
          this.cor = paramBoolean1;
          if ((g.KK().KV()) || (g.KK().KP()))
          {
            ab.i("MicroMsg.SceneVoicePlayer", "headset plugged: %b, bluetoothon: %b", new Object[] { Boolean.valueOf(g.KK().KV()), Boolean.valueOf(g.KK().KP()) });
            this.com = false;
          }
          g.KK().f(this.com, false, false);
          Ey();
          setError();
          str = null;
          if (!paramBoolean2)
            break label559;
          str = paramString;
        }
      while (true)
      {
        g.KK().a(this);
        if (!g.KK().KV())
        {
          g.KK().KM();
          this.cos = true;
        }
        if (this.col.S(str, this.com))
          break label575;
        ab.i("MicroMsg.SceneVoicePlayer", "start play error fileName[" + paramString + "], [" + paramBoolean1 + "]");
        g.KK().KN();
        this.cos = false;
        AppMethodBeat.o(116458);
        paramBoolean1 = bool1;
        break;
        this.col = new s();
        break label208;
        if (i == 1)
        {
          if (this.context != null)
          {
            this.col = new j(this.context);
            break label208;
          }
          this.col = new j();
          break label208;
        }
        if (i != 2)
          break label208;
        if (this.context != null)
        {
          this.col = new i(this.context);
          break label208;
        }
        this.col = new i();
        break label208;
        label559: if (this.coq == 0)
          str = q.getFullPath(paramString);
      }
      label575: ab.i("MicroMsg.SceneVoicePlayer", "jacks Player requestFocus focus helper, needFocusOnPlay: %s", new Object[] { Boolean.valueOf(this.coy) });
      if (this.coy)
      {
        this.cop.requestFocus();
        this.coA = true;
      }
      this.coz = true;
      AppMethodBeat.o(116458);
      paramBoolean1 = true;
    }
  }

  public final void bl(boolean paramBoolean)
  {
    this.coy = paramBoolean;
  }

  public final void bm(boolean paramBoolean)
  {
    this.coz = paramBoolean;
  }

  public final boolean bn(boolean paramBoolean)
  {
    boolean bool = false;
    AppMethodBeat.i(116461);
    if (this.col == null)
    {
      AppMethodBeat.o(116461);
      paramBoolean = bool;
      return paramBoolean;
    }
    ab.i("MicroMsg.SceneVoicePlayer", "pause");
    if (this.col.isPlaying());
    for (bool = this.col.bn(paramBoolean); ; bool = false)
    {
      if (bool)
      {
        if (this.cos)
        {
          g.KK().KN();
          this.cos = false;
        }
        if (this.cou != null)
          this.cou.cC(paramBoolean);
      }
      g.KK().setMode(0);
      ab.i("MicroMsg.SceneVoicePlayer", "jacks Player abandonFocus focus helper, needFocusOnPlay: %s, hasAudioFocus: %s", new Object[] { Boolean.valueOf(this.coy), Boolean.valueOf(this.coA) });
      if (this.coA)
      {
        this.cop.Mm();
        this.coA = false;
      }
      AppMethodBeat.o(116461);
      paramBoolean = bool;
      break;
    }
  }

  public final void bo(boolean paramBoolean)
  {
    AppMethodBeat.i(116466);
    if (this.com == paramBoolean)
      AppMethodBeat.o(116466);
    while (true)
    {
      return;
      this.com = paramBoolean;
      if ((this.col != null) && (this.col.isPlaying()))
        this.col.bo(paramBoolean);
      com.tencent.mm.sdk.g.d.post(new a.2(this, paramBoolean), "SceneVoicePlayer_shiftSpeaker");
      AppMethodBeat.o(116466);
    }
  }

  public final void bp(boolean paramBoolean)
  {
    AppMethodBeat.i(116470);
    ab.i("MicroMsg.SceneVoicePlayer", "setContinuousPlay() continuousPlay:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.coo = paramBoolean;
    AppMethodBeat.o(116470);
  }

  public final void gE(int paramInt)
  {
    AppMethodBeat.i(116472);
    ab.i("MicroMsg.SceneVoicePlayer", "onBluetoothHeadsetStateChange, status: %d, currentSpeaker: %b, bluetoothResumeSpeaker: %b, isRequestStartBluetooth: %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(this.com), Boolean.valueOf(this.cor), Boolean.valueOf(this.cos) });
    switch (paramInt)
    {
    case 3:
    default:
    case 1:
    case 2:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(116472);
      while (true)
      {
        return;
        bo(false);
        AppMethodBeat.o(116472);
        continue;
        bo(this.cor);
        if (!this.cos)
          break;
        g.KK().KN();
        this.cos = false;
        AppMethodBeat.o(116472);
        continue;
        g.KK().KM();
        AppMethodBeat.o(116472);
        continue;
        bo(this.cor);
        if ((this.col == null) || (!this.col.isPlaying()))
          break;
        g.KK().KM();
        this.cos = true;
        AppMethodBeat.o(116472);
      }
      if ((this.col != null) && (this.col.isPlaying()))
      {
        g.KK().KM();
        this.cos = true;
      }
    }
  }

  public final boolean isPlaying()
  {
    AppMethodBeat.i(116457);
    boolean bool;
    if (this.col == null)
    {
      bool = false;
      AppMethodBeat.o(116457);
    }
    while (true)
    {
      return bool;
      bool = this.col.isPlaying();
      AppMethodBeat.o(116457);
    }
  }

  public final boolean m(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(116463);
    paramBoolean = a(paramString, paramBoolean, false, -1);
    AppMethodBeat.o(116463);
    return paramBoolean;
  }

  public final boolean pause()
  {
    AppMethodBeat.i(138572);
    boolean bool = bn(true);
    AppMethodBeat.o(138572);
    return bool;
  }

  public final void stop()
  {
    AppMethodBeat.i(138573);
    stop(false);
    AppMethodBeat.o(138573);
  }

  public final void stop(boolean paramBoolean)
  {
    AppMethodBeat.i(116465);
    if (this.col == null)
      AppMethodBeat.o(116465);
    while (true)
    {
      return;
      ab.i("MicroMsg.SceneVoicePlayer", "stop, isRequestStartBluetooth: %b, player.isPlaying: %b, fromStart: %b", new Object[] { Boolean.valueOf(this.cos), Boolean.valueOf(this.col.isPlaying()), Boolean.valueOf(paramBoolean) });
      this.col.EH();
      ab.i("MicroMsg.SceneVoicePlayer", "stop player abandon focus, needFocusOnPlay: %s, hasAudioFocus: %s, abandonFocusOnStop: %s", new Object[] { Boolean.valueOf(this.coy), Boolean.valueOf(this.coA), Boolean.valueOf(this.coz) });
      if ((this.coA) && (this.coz))
      {
        this.cop.Mm();
        this.coA = false;
      }
      g.KK().b(this);
      if ((this.cos) && (!paramBoolean))
      {
        g.KK().KN();
        this.cos = false;
      }
      if ((!paramBoolean) && (this.cov != null))
        this.cov.onStop();
      try
      {
        g.KK().setMode(0);
        AppMethodBeat.o(116465);
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.SceneVoicePlayer", localException, "stop reset speaker error: %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(116465);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.a.a
 * JD-Core Version:    0.6.2
 */