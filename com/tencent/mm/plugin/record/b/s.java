package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.ai.i;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
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

public final class s
  implements h.a, h.b, SensorController.a
{
  public static SensorController mfW;
  private int cAO;
  public List<s.a> callbacks;
  public h mfO;
  private boolean mfP;
  private boolean mfQ;
  private boolean mfR;
  private bf mfS;
  long mfT;
  public String path;

  public s()
  {
    AppMethodBeat.i(24180);
    this.mfP = true;
    this.mfR = false;
    this.mfT = -1L;
    this.callbacks = new LinkedList();
    this.mfO = ((i)com.tencent.mm.kernel.g.K(i.class)).BT();
    aw.ZK();
    Boolean localBoolean = (Boolean)c.Ry().get(26, Boolean.FALSE);
    this.mfQ = localBoolean.booleanValue();
    boolean bool;
    if (!localBoolean.booleanValue())
    {
      bool = true;
      this.mfP = bool;
      if (this.mfO == null)
        break label219;
      this.mfO.a(this);
      this.mfO.a(this);
      if ((!com.tencent.mm.compatible.b.g.KK().KV()) && (!com.tencent.mm.compatible.b.g.KK().KP()))
        break label203;
      this.mfO.bo(false);
    }
    while (true)
    {
      if (mfW == null)
        mfW = new SensorController(ah.getContext());
      if (this.mfS == null)
        this.mfS = new bf(ah.getContext());
      AppMethodBeat.o(24180);
      return;
      bool = false;
      break;
      label203: this.mfO.bo(this.mfP);
      continue;
      label219: ab.w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
    }
  }

  public final void EA()
  {
    AppMethodBeat.i(24185);
    ab.d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
    stopPlay();
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      ((s.a)localIterator.next()).onFinish();
    AppMethodBeat.o(24185);
  }

  public final boolean buH()
  {
    AppMethodBeat.i(24182);
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
      bool = false;
      AppMethodBeat.o(24182);
    }
    while (true)
    {
      return bool;
      bool = this.mfO.isPlaying();
      AppMethodBeat.o(24182);
    }
  }

  public final void buK()
  {
    AppMethodBeat.i(24186);
    if (mfW != null)
      mfW.dps();
    if (this.mfS != null)
      this.mfS.dpt();
    AppMethodBeat.o(24186);
  }

  public final void he(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(24187);
    if (bo.isNullOrNil(this.path))
      AppMethodBeat.o(24187);
    while (true)
    {
      return;
      if (this.mfR)
      {
        if (!paramBoolean);
        for (paramBoolean = bool; ; paramBoolean = false)
        {
          this.mfR = paramBoolean;
          AppMethodBeat.o(24187);
          break;
        }
      }
      if ((!paramBoolean) && (this.mfT != -1L) && (bo.az(this.mfT) > 400L))
      {
        this.mfR = true;
        AppMethodBeat.o(24187);
      }
      else
      {
        this.mfR = false;
        if ((this.mfO != null) && (this.mfO.Ex()))
        {
          AppMethodBeat.o(24187);
        }
        else if (this.mfQ)
        {
          if (this.mfO != null)
            this.mfO.bo(false);
          this.mfP = false;
          AppMethodBeat.o(24187);
        }
        else if ((this.mfO != null) && (!this.mfO.isPlaying()))
        {
          this.mfO.bo(true);
          this.mfP = true;
          AppMethodBeat.o(24187);
        }
        else
        {
          if (this.mfO != null)
            this.mfO.bo(paramBoolean);
          this.mfP = paramBoolean;
          if (!paramBoolean)
            startPlay(this.path, this.cAO);
          AppMethodBeat.o(24187);
        }
      }
    }
  }

  public final void onError()
  {
    AppMethodBeat.i(24184);
    ab.d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
    stopPlay();
    Iterator localIterator = this.callbacks.iterator();
    while (localIterator.hasNext())
      ((s.a)localIterator.next()).onFinish();
    AppMethodBeat.o(24184);
  }

  public final boolean startPlay(String paramString, int paramInt)
  {
    AppMethodBeat.i(24181);
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(24181);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.mfO.stop();
      Object localObject = this.callbacks.iterator();
      while (((Iterator)localObject).hasNext())
        ((s.a)((Iterator)localObject).next()).VJ(paramString);
      if ((mfW != null) && (!mfW.aGA))
      {
        mfW.a(this);
        localObject = new s.1(this);
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
        AppMethodBeat.o(24181);
        bool = true;
        break;
      }
      label207: AppMethodBeat.o(24181);
      bool = false;
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(24183);
    ab.d("MicroMsg.RecordVoiceHelper", "stop play");
    aj.amB("keep_app_silent");
    if (this.mfO != null)
      this.mfO.stop();
    buK();
    AppMethodBeat.o(24183);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.s
 * JD-Core Version:    0.6.2
 */