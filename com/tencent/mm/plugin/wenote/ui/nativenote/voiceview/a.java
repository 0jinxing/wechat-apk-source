package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.h;
import com.tencent.mm.ai.h.a;
import com.tencent.mm.ai.h.b;
import com.tencent.mm.ai.i;
import com.tencent.mm.kernel.g;
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

public class a
  implements h.a, h.b, SensorController.a
{
  public static volatile a uVh = null;
  private int cAO;
  public List<a.a> callbacks;
  public h mfO;
  private boolean mfP;
  private boolean mfQ;
  private boolean mfR;
  public bf mfS;
  private long mfT;
  public SensorController mfW;
  public String path;

  private a()
  {
    AppMethodBeat.i(27198);
    this.mfP = true;
    this.mfR = false;
    this.mfT = -1L;
    this.callbacks = new LinkedList();
    this.mfO = ((i)g.K(i.class)).BT();
    aw.ZK();
    Boolean localBoolean = (Boolean)c.Ry().get(26, Boolean.FALSE);
    this.mfQ = localBoolean.booleanValue();
    boolean bool;
    if (!localBoolean.booleanValue())
    {
      bool = true;
      this.mfP = bool;
      if (this.mfO == null)
        break label190;
      this.mfO.a(this);
      this.mfO.a(this);
      this.mfO.bo(this.mfP);
    }
    while (true)
    {
      if (this.mfW == null)
        this.mfW = new SensorController(ah.getContext());
      if (this.mfS == null)
        this.mfS = new bf(ah.getContext());
      AppMethodBeat.o(27198);
      return;
      bool = false;
      break;
      label190: ab.w("MicroMsg.RecordVoiceHelper", "get voice player fail, it is null");
    }
  }

  private void bJs()
  {
    AppMethodBeat.i(27201);
    if ((this.mfW != null) && (!this.mfW.aGA))
    {
      this.mfW.a(this);
      a.1 local1 = new a.1(this);
      if (this.mfS.aj(local1))
      {
        this.mfT = 0L;
        AppMethodBeat.o(27201);
      }
    }
    while (true)
    {
      return;
      this.mfT = -1L;
      AppMethodBeat.o(27201);
    }
  }

  private void buK()
  {
    AppMethodBeat.i(27202);
    if (this.mfW != null)
      this.mfW.dps();
    if (this.mfS != null)
      this.mfS.dpt();
    AppMethodBeat.o(27202);
  }

  public static a dfY()
  {
    AppMethodBeat.i(27199);
    if (uVh == null);
    try
    {
      if (uVh == null)
      {
        locala = new com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/a;
        locala.<init>();
        uVh = locala;
      }
      a locala = uVh;
      AppMethodBeat.o(27199);
      return locala;
    }
    finally
    {
      AppMethodBeat.o(27199);
    }
  }

  public final void EA()
  {
    AppMethodBeat.i(27208);
    ab.d("MicroMsg.RecordVoiceHelper", "on completion, do stop play");
    stopPlay();
    AppMethodBeat.o(27208);
  }

  public final double Ez()
  {
    AppMethodBeat.i(27206);
    double d;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
      d = 0.0D;
      AppMethodBeat.o(27206);
    }
    while (true)
    {
      return d;
      d = this.mfO.Ez();
      AppMethodBeat.o(27206);
    }
  }

  public final void a(a.a parama)
  {
    AppMethodBeat.i(27200);
    if (parama == null)
      AppMethodBeat.o(27200);
    while (true)
    {
      return;
      Iterator localIterator = this.callbacks.iterator();
      while (true)
        if (localIterator.hasNext())
          if (parama == (a.a)localIterator.next())
          {
            AppMethodBeat.o(27200);
            break;
          }
      this.callbacks.add(parama);
      AppMethodBeat.o(27200);
    }
  }

  public final boolean buH()
  {
    AppMethodBeat.i(27205);
    boolean bool;
    if (this.mfO == null)
    {
      ab.w("MicroMsg.RecordVoiceHelper", "check is play, but player is null");
      bool = false;
      AppMethodBeat.o(27205);
    }
    while (true)
    {
      return bool;
      bool = this.mfO.isPlaying();
      AppMethodBeat.o(27205);
    }
  }

  public final void he(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(27209);
    if (bo.isNullOrNil(this.path))
      AppMethodBeat.o(27209);
    while (true)
    {
      return;
      if (this.mfR)
      {
        if (!paramBoolean);
        for (paramBoolean = bool; ; paramBoolean = false)
        {
          this.mfR = paramBoolean;
          AppMethodBeat.o(27209);
          break;
        }
      }
      if ((!paramBoolean) && (this.mfT != -1L) && (bo.az(this.mfT) > 400L))
      {
        this.mfR = true;
        AppMethodBeat.o(27209);
      }
      else
      {
        this.mfR = false;
        if ((this.mfO != null) && (this.mfO.Ex()))
        {
          AppMethodBeat.o(27209);
        }
        else if (this.mfQ)
        {
          if (this.mfO != null)
            this.mfO.bo(false);
          this.mfP = false;
          AppMethodBeat.o(27209);
        }
        else if ((this.mfO != null) && (!this.mfO.isPlaying()))
        {
          this.mfO.bo(true);
          this.mfP = true;
          AppMethodBeat.o(27209);
        }
        else
        {
          if (this.mfO != null)
            this.mfO.bo(paramBoolean);
          this.mfP = paramBoolean;
          if (!paramBoolean)
            startPlay(this.path, this.cAO);
          AppMethodBeat.o(27209);
        }
      }
    }
  }

  public final void onError()
  {
    AppMethodBeat.i(27207);
    ab.d("MicroMsg.RecordVoiceHelper", "on error, do stop play");
    stopPlay();
    AppMethodBeat.o(27207);
  }

  public final boolean startPlay(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(27203);
    if (this.mfO == null)
    {
      ab.w("MicroMsg.RecordVoiceHelper", "start play error, path %s, voiceType %d, player is null", new Object[] { paramString, Integer.valueOf(paramInt) });
      AppMethodBeat.o(27203);
    }
    while (true)
    {
      return bool;
      this.mfO.stop();
      bJs();
      this.path = paramString;
      this.cAO = paramInt;
      if ((!bo.isNullOrNil(paramString)) && (this.mfO.a(paramString, this.mfP, true, paramInt)))
      {
        aj.amA("keep_app_silent");
        Iterator localIterator = this.callbacks.iterator();
        while (localIterator.hasNext())
        {
          a.a locala = (a.a)localIterator.next();
          if (locala != null)
            locala.ahs(paramString);
        }
        AppMethodBeat.o(27203);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(27203);
      }
    }
  }

  public final void stopPlay()
  {
    AppMethodBeat.i(27204);
    ab.i("MicroMsg.RecordVoiceHelper", "stop play");
    aj.amB("keep_app_silent");
    if (this.mfO != null)
    {
      this.mfO.stop();
      Iterator localIterator = this.callbacks.iterator();
      while (localIterator.hasNext())
      {
        a.a locala = (a.a)localIterator.next();
        if (locala != null)
          locala.dfX();
      }
    }
    buK();
    AppMethodBeat.o(27204);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.a
 * JD-Core Version:    0.6.2
 */