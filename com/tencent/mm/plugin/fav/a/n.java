package com.tencent.mm.plugin.fav.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.ai.i;
import com.tencent.mm.kernel.e;
import com.tencent.mm.sdk.platformtools.SensorController;
import com.tencent.mm.sdk.platformtools.SensorController.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class n
  implements h.a, h.b, SensorController.a
{
  static SensorController mfW;
  private int cAO;
  private List<n.a> callbacks;
  public h mfO;
  private boolean mfP;
  private boolean mfQ;
  private boolean mfR;
  bf mfS;
  long mfT;
  boolean mfU;
  private int mfV;
  public String path;

  public n()
  {
    AppMethodBeat.i(102702);
    this.mfP = true;
    this.mfR = false;
    this.mfT = -1L;
    this.callbacks = new LinkedList();
    this.mfO = ((i)com.tencent.mm.kernel.g.K(i.class)).BT();
    Boolean localBoolean = (Boolean)com.tencent.mm.kernel.g.RP().Ry().get(26, Boolean.FALSE);
    this.mfQ = localBoolean.booleanValue();
    boolean bool;
    if (!localBoolean.booleanValue())
    {
      bool = true;
      this.mfP = bool;
      if (this.mfO == null)
        break label185;
      this.mfO.a(this);
      this.mfO.a(this);
      this.mfO.bo(this.mfP);
    }
    while (true)
    {
      if (mfW == null)
        mfW = new SensorController(ah.getContext());
      if (this.mfS == null)
        this.mfS = new bf(ah.getContext());
      AppMethodBeat.o(102702);
      return;
      bool = false;
      break;
      label185: ab.w("MicroMsg.FavVoiceLogic", "get voice player fail, it is null");
    }
  }

  private void buK()
  {
    AppMethodBeat.i(102714);
    if (mfW != null)
      mfW.dps();
    if (this.mfS != null)
      this.mfS.dpt();
    AppMethodBeat.o(102714);
  }

  public final void EA()
  {
    AppMethodBeat.i(102713);
    ab.d("MicroMsg.FavVoiceLogic", "on completion, do stop play");
    stopPlay();
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      ((n.a)localIterator.next()).onFinish();
    AppMethodBeat.o(102713);
  }

  public final boolean T(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(102707);
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt1) });
      AppMethodBeat.o(102707);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.mfO.stop();
      Object localObject = this.callbacks.iterator();
      while (((Iterator)localObject).hasNext())
        ((n.a)((Iterator)localObject).next()).bI(paramString, paramInt2);
      if ((mfW != null) && (!mfW.aGA))
      {
        mfW.a(this);
        localObject = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(102701);
            n.this.mfT = bo.yz();
            AppMethodBeat.o(102701);
          }
        };
        if (!this.mfS.aj((Runnable)localObject))
          break label210;
      }
      label210: for (this.mfT = 0L; ; this.mfT = -1L)
      {
        this.path = paramString;
        this.cAO = paramInt1;
        if ((bo.isNullOrNil(paramString)) || (!this.mfO.a(paramString, this.mfP, paramInt1, paramInt2)))
          break label220;
        aj.amA("keep_app_silent");
        com.tencent.mm.compatible.b.g.KK().f(this.mfP, false, false);
        AppMethodBeat.o(102707);
        bool = true;
        break;
      }
      label220: AppMethodBeat.o(102707);
      bool = false;
    }
  }

  public final void a(n.a parama)
  {
    AppMethodBeat.i(102703);
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      if (parama == (n.a)localIterator.next())
        AppMethodBeat.o(102703);
    while (true)
    {
      return;
      this.callbacks.add(parama);
      AppMethodBeat.o(102703);
    }
  }

  public final boolean buH()
  {
    AppMethodBeat.i(102708);
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.FavVoiceLogic", "check is play, but player is null");
      bool = false;
      AppMethodBeat.o(102708);
    }
    while (true)
    {
      return bool;
      bool = this.mfO.isPlaying();
      AppMethodBeat.o(102708);
    }
  }

  public final boolean buI()
  {
    AppMethodBeat.i(102709);
    ab.i("MicroMsg.FavVoiceLogic", "resume play");
    aj.amA("keep_app_silent");
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.FavVoiceLogic", "resum play error, player is null");
      bool = false;
      AppMethodBeat.o(102709);
    }
    while (true)
    {
      return bool;
      bool = this.mfO.Ew();
      AppMethodBeat.o(102709);
    }
  }

  public final boolean buJ()
  {
    AppMethodBeat.i(102710);
    ab.i("MicroMsg.FavVoiceLogic", "pause play");
    aj.amB("keep_app_silent");
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.FavVoiceLogic", "pause play error, player is null");
      bool = false;
      AppMethodBeat.o(102710);
    }
    while (true)
    {
      return bool;
      bool = this.mfO.pause();
      AppMethodBeat.o(102710);
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(102704);
    pause();
    buK();
    mfW = null;
    this.callbacks.clear();
    AppMethodBeat.o(102704);
  }

  public final void he(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(102715);
    if (bo.isNullOrNil(this.path))
      AppMethodBeat.o(102715);
    while (true)
    {
      return;
      if (this.mfR)
      {
        if (!paramBoolean);
        for (paramBoolean = bool; ; paramBoolean = false)
        {
          this.mfR = paramBoolean;
          AppMethodBeat.o(102715);
          break;
        }
      }
      if ((!paramBoolean) && (this.mfT != -1L) && (bo.az(this.mfT) > 400L))
      {
        this.mfR = true;
        AppMethodBeat.o(102715);
      }
      else
      {
        this.mfR = false;
        if ((this.mfO != null) && (this.mfO.Ex()))
        {
          AppMethodBeat.o(102715);
        }
        else if (this.mfQ)
        {
          if (this.mfO != null)
            this.mfO.bo(false);
          com.tencent.mm.compatible.b.g.KK().f(false, false, false);
          this.mfP = false;
          AppMethodBeat.o(102715);
        }
        else if ((this.mfO != null) && (!this.mfO.isPlaying()) && (!this.mfU))
        {
          this.mfO.bo(true);
          this.mfP = true;
          AppMethodBeat.o(102715);
        }
        else if (com.tencent.mm.compatible.b.g.KK().KP())
        {
          ab.d("MicroMsg.FavVoiceLogic", "onSensorEvent, connecting bluetooth, omit sensor event");
          AppMethodBeat.o(102715);
        }
        else
        {
          if (this.mfO != null)
            this.mfO.bo(paramBoolean);
          this.mfP = paramBoolean;
          if ((this.mfU) && (!paramBoolean))
          {
            T(this.path, this.cAO, this.mfV);
            AppMethodBeat.o(102715);
          }
          else
          {
            if (!paramBoolean)
              startPlay(this.path, this.cAO);
            AppMethodBeat.o(102715);
          }
        }
      }
    }
  }

  public final void onError()
  {
    AppMethodBeat.i(102712);
    ab.d("MicroMsg.FavVoiceLogic", "on error, do stop play");
    stopPlay();
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      ((n.a)localIterator.next()).onFinish();
    AppMethodBeat.o(102712);
  }

  public final void pause()
  {
    AppMethodBeat.i(102705);
    if (this.mfO == null)
    {
      ab.w("MicroMsg.FavVoiceLogic", "do pause, but player is null");
      AppMethodBeat.o(102705);
    }
    while (true)
    {
      return;
      if (this.mfO.isPlaying())
        buJ();
      Iterator localIterator = this.callbacks.iterator();
      while (localIterator.hasNext())
        ((n.a)localIterator.next()).onPause();
      AppMethodBeat.o(102705);
    }
  }

  public final boolean startPlay(String paramString, int paramInt)
  {
    AppMethodBeat.i(102706);
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.FavVoiceLogic", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(102706);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.mfO.stop();
      Object localObject = this.callbacks.iterator();
      while (((Iterator)localObject).hasNext())
        ((n.a)((Iterator)localObject).next()).bI(paramString, 0);
      if ((mfW != null) && (!mfW.aGA))
      {
        mfW.a(this);
        localObject = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(102700);
            n.this.mfT = bo.yz();
            AppMethodBeat.o(102700);
          }
        };
        if (!this.mfS.aj((Runnable)localObject))
          break label197;
      }
      label197: for (this.mfT = 0L; ; this.mfT = -1L)
      {
        this.path = paramString;
        this.cAO = paramInt;
        if ((bo.isNullOrNil(paramString)) || (!this.mfO.a(paramString, this.mfP, true, paramInt)))
          break label207;
        aj.amA("keep_app_silent");
        AppMethodBeat.o(102706);
        bool = true;
        break;
      }
      label207: AppMethodBeat.o(102706);
      bool = false;
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(102711);
    ab.d("MicroMsg.FavVoiceLogic", "stop play");
    aj.amB("keep_app_silent");
    if (this.mfO != null)
      this.mfO.stop();
    buK();
    AppMethodBeat.o(102711);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.a.n
 * JD-Core Version:    0.6.2
 */