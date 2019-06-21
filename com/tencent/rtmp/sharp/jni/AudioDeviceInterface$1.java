package com.tencent.rtmp.sharp.jni;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class AudioDeviceInterface$1
  implements TraeAudioSession.a
{
  AudioDeviceInterface$1(AudioDeviceInterface paramAudioDeviceInterface)
  {
  }

  public void a(int paramInt)
  {
  }

  public void a(int paramInt1, int paramInt2)
  {
  }

  public void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(65656);
    if (paramInt == 0)
      AudioDeviceInterface.access$400(this.a, paramString);
    AppMethodBeat.o(65656);
  }

  public void a(int paramInt, String paramString, boolean paramBoolean)
  {
  }

  public void a(int paramInt, boolean paramBoolean)
  {
  }

  public void a(int paramInt, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3)
  {
  }

  public void a(String paramString, long paramLong)
  {
  }

  public void a(String paramString1, String paramString2)
  {
  }

  public void a(boolean paramBoolean)
  {
    AppMethodBeat.i(65654);
    if (!paramBoolean);
    while (true)
    {
      try
      {
        AudioDeviceInterface.access$000(this.a).lock();
        AudioDeviceInterface.access$102(this.a, true);
        if (QLog.isColorLevel())
          QLog.e("TRAE", 2, "onVoicecallPreprocessRes signalAll");
        AudioDeviceInterface.access$200(this.a).signalAll();
        AudioDeviceInterface.access$000(this.a).unlock();
        AppMethodBeat.o(65654);
        return;
      }
      catch (Exception localException)
      {
      }
      AppMethodBeat.o(65654);
    }
  }

  public void a(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(65655);
    if (AudioDeviceInterface.access$300(this.a))
      AudioDeviceInterface.access$400(this.a, paramString1);
    AppMethodBeat.o(65655);
  }

  public void b(int paramInt)
  {
    AppMethodBeat.i(65657);
    try
    {
      AudioDeviceInterface.access$000(this.a).lock();
      AudioDeviceInterface.access$102(this.a, true);
      if (QLog.isColorLevel())
        QLog.e("TRAE", 2, "onVoicecallPreprocessRes signalAll");
      AudioDeviceInterface.access$200(this.a).signalAll();
      AudioDeviceInterface.access$000(this.a).unlock();
      AppMethodBeat.o(65657);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(65657);
    }
  }

  public void b(int paramInt, String paramString)
  {
  }

  public void b(boolean paramBoolean)
  {
  }

  public void c(int paramInt, String paramString)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.rtmp.sharp.jni.AudioDeviceInterface.1
 * JD-Core Version:    0.6.2
 */