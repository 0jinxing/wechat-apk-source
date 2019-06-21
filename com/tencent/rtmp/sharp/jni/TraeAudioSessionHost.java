package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class TraeAudioSessionHost
{
  private ArrayList<TraeAudioSessionHost.a> _sessionInfoList;
  private ReentrantLock mLock;

  public TraeAudioSessionHost()
  {
    AppMethodBeat.i(65669);
    this._sessionInfoList = new ArrayList();
    this.mLock = new ReentrantLock();
    AppMethodBeat.o(65669);
  }

  public void add(long paramLong, Context paramContext)
  {
    AppMethodBeat.i(65671);
    if (find(paramLong) != null)
      AppMethodBeat.o(65671);
    while (true)
    {
      return;
      paramContext = new TraeAudioSessionHost.a(this);
      paramContext.a = paramLong;
      this.mLock.lock();
      this._sessionInfoList.add(paramContext);
      this.mLock.unlock();
      AppMethodBeat.o(65671);
    }
  }

  public TraeAudioSessionHost.a find(long paramLong)
  {
    AppMethodBeat.i(65670);
    this.mLock.lock();
    int i = 0;
    TraeAudioSessionHost.a locala;
    if (i < this._sessionInfoList.size())
    {
      locala = (TraeAudioSessionHost.a)this._sessionInfoList.get(i);
      if (locala.a != paramLong);
    }
    while (true)
    {
      this.mLock.unlock();
      AppMethodBeat.o(65670);
      return locala;
      i++;
      break;
      locala = null;
    }
  }

  public void remove(long paramLong)
  {
    AppMethodBeat.i(65672);
    this.mLock.lock();
    for (int i = 0; ; i++)
      if (i < this._sessionInfoList.size())
      {
        if (((TraeAudioSessionHost.a)this._sessionInfoList.get(i)).a == paramLong)
          this._sessionInfoList.remove(i);
      }
      else
      {
        this.mLock.unlock();
        AppMethodBeat.o(65672);
        return;
      }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.TraeAudioSessionHost
 * JD-Core Version:    0.6.2
 */