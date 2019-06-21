package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;

class AudioRecordVoIPInterruptListener$StopInterruptEventListenTask extends MainProcessTask
{
  public static final Parcelable.Creator<StopInterruptEventListenTask> CREATOR;

  static
  {
    AppMethodBeat.i(132186);
    CREATOR = new Parcelable.Creator()
    {
    };
    AppMethodBeat.o(132186);
  }

  public AudioRecordVoIPInterruptListener$StopInterruptEventListenTask()
  {
  }

  public AudioRecordVoIPInterruptListener$StopInterruptEventListenTask(Parcel paramParcel)
  {
    AppMethodBeat.i(132184);
    g(paramParcel);
    AppMethodBeat.o(132184);
  }

  public final void asP()
  {
    AppMethodBeat.i(132185);
    ab.i("MicroMsg.Record.AudioRecordVoIPInterruptListener", "removeListener");
    AudioRecordVoIPInterruptListener.a locala = AudioRecordVoIPInterruptListener.a.aIs();
    try
    {
      Iterator localIterator = locala.ilQ.iterator();
      while (localIterator.hasNext())
      {
        c localc = (c)localIterator.next();
        a.xxA.d(localc);
      }
    }
    finally
    {
      AppMethodBeat.o(132185);
    }
    localObject.ilQ.clear();
    AppMethodBeat.o(132185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.AudioRecordVoIPInterruptListener.StopInterruptEventListenTask
 * JD-Core Version:    0.6.2
 */