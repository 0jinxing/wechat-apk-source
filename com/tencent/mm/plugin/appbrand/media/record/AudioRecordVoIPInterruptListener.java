package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class AudioRecordVoIPInterruptListener
  implements f
{
  private boolean cFy = false;
  private e ilB;
  private AudioRecordVoIPInterruptListener.CheckInterruptTask ilM;
  private StartInterruptEventListenTask ilN;
  private AudioRecordVoIPInterruptListener.StopInterruptEventListenTask ilO;

  public final void a(e parame)
  {
    this.ilB = parame;
  }

  public final boolean aIj()
  {
    boolean bool = false;
    AppMethodBeat.i(132187);
    if (this.ilB == null)
    {
      ab.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
      AppMethodBeat.o(132187);
    }
    while (true)
    {
      return bool;
      if (this.ilM == null)
        this.ilM = new AudioRecordVoIPInterruptListener.CheckInterruptTask(this.ilB);
      AppBrandMainProcessService.b(this.ilM);
      ab.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "isInterrupted:%b", new Object[] { Boolean.valueOf(AudioRecordVoIPInterruptListener.CheckInterruptTask.a(this.ilM)) });
      bool = AudioRecordVoIPInterruptListener.CheckInterruptTask.a(this.ilM);
      AppMethodBeat.o(132187);
    }
  }

  public final void aIk()
  {
    AppMethodBeat.i(132188);
    if (this.ilB == null)
    {
      ab.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "callback is invalid");
      AppMethodBeat.o(132188);
    }
    while (true)
    {
      return;
      if (this.ilN == null)
        this.ilN = new StartInterruptEventListenTask(this.ilB);
      this.cFy = true;
      AppBrandMainProcessService.a(this.ilN);
      AppMethodBeat.o(132188);
    }
  }

  public final void aIl()
  {
    AppMethodBeat.i(132189);
    if (!this.cFy)
    {
      ab.e("MicroMsg.Record.AudioRecordVoIPInterruptListener", "not start listen");
      AppMethodBeat.o(132189);
    }
    while (true)
    {
      return;
      this.cFy = false;
      if (this.ilO == null)
        this.ilO = new AudioRecordVoIPInterruptListener.StopInterruptEventListenTask();
      AppBrandMainProcessService.b(this.ilO);
      AppMethodBeat.o(132189);
    }
  }

  static class StartInterruptEventListenTask extends MainProcessTask
  {
    public static final Parcelable.Creator<StartInterruptEventListenTask> CREATOR;
    private e ilB;
    private int ilR;
    private final c ilS;
    private final c ilT;

    static
    {
      AppMethodBeat.i(132182);
      CREATOR = new AudioRecordVoIPInterruptListener.StartInterruptEventListenTask.1();
      AppMethodBeat.o(132182);
    }

    public StartInterruptEventListenTask(Parcel paramParcel)
    {
      AppMethodBeat.i(132174);
      this.ilR = -1;
      this.ilS = new AudioRecordVoIPInterruptListener.StartInterruptEventListenTask.2(this);
      this.ilT = new AudioRecordVoIPInterruptListener.StartInterruptEventListenTask.3(this);
      g(paramParcel);
      AppMethodBeat.o(132174);
    }

    public StartInterruptEventListenTask(e parame)
    {
      AppMethodBeat.i(132173);
      this.ilR = -1;
      this.ilS = new AudioRecordVoIPInterruptListener.StartInterruptEventListenTask.2(this);
      this.ilT = new AudioRecordVoIPInterruptListener.StartInterruptEventListenTask.3(this);
      this.ilB = parame;
      AppMethodBeat.o(132173);
    }

    public final void asP()
    {
      AppMethodBeat.i(132175);
      ab.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "addListener");
      if (!a.xxA.e(this.ilS))
      {
        a.xxA.c(this.ilS);
        AudioRecordVoIPInterruptListener.a.aIs();
        AudioRecordVoIPInterruptListener.a.a(this.ilS);
      }
      if (!a.xxA.e(this.ilT))
      {
        a.xxA.c(this.ilT);
        AudioRecordVoIPInterruptListener.a.aIs();
        AudioRecordVoIPInterruptListener.a.a(this.ilT);
      }
      AppMethodBeat.o(132175);
    }

    public final void asQ()
    {
      AppMethodBeat.i(132176);
      if (this.ilB != null)
      {
        if (this.ilR != 11)
          break label48;
        ab.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptEnd");
        this.ilB.aIi();
      }
      while (true)
      {
        this.ilR = -1;
        AppMethodBeat.o(132176);
        return;
        label48: if (this.ilR == 3)
        {
          ab.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "onInterruptBegin");
          this.ilB.aIh();
        }
      }
    }

    public final void g(Parcel paramParcel)
    {
      AppMethodBeat.i(132177);
      this.ilR = paramParcel.readInt();
      AppMethodBeat.o(132177);
    }

    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      AppMethodBeat.i(132178);
      paramParcel.writeInt(this.ilR);
      AppMethodBeat.o(132178);
    }
  }

  static class a
  {
    private static a ilP;
    LinkedList<c<b>> ilQ;

    private a()
    {
      AppMethodBeat.i(132165);
      this.ilQ = new LinkedList();
      AppMethodBeat.o(132165);
    }

    public static void a(c<b> paramc)
    {
      AppMethodBeat.i(132167);
      try
      {
        aIs().ilQ.add(paramc);
        return;
      }
      finally
      {
        AppMethodBeat.o(132167);
      }
      throw paramc;
    }

    public static a aIs()
    {
      AppMethodBeat.i(132166);
      if (ilP == null);
      try
      {
        if (ilP == null)
        {
          locala = new com/tencent/mm/plugin/appbrand/media/record/AudioRecordVoIPInterruptListener$a;
          locala.<init>();
          ilP = locala;
        }
        a locala = ilP;
        AppMethodBeat.o(132166);
        return locala;
      }
      finally
      {
        AppMethodBeat.o(132166);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener
 * JD-Core Version:    0.6.2
 */