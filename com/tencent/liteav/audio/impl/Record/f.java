package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import com.tencent.liteav.audio.TXEAudioDef;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

public class f
  implements Runnable
{
  private static final String a;
  private static f b;
  private Context c;
  private int d = 48000;
  private int e = 1;
  private int f = 16;
  private int g = TXEAudioDef.TXE_AEC_NONE;
  private AudioRecord h;
  private byte[] i = null;
  private WeakReference<h> j;
  private Thread k = null;
  private boolean l = false;

  static
  {
    AppMethodBeat.i(66662);
    a = "AudioCenter:" + f.class.getSimpleName();
    b = null;
    AppMethodBeat.o(66662);
  }

  public static f a()
  {
    AppMethodBeat.i(66651);
    if (b == null);
    try
    {
      if (b == null)
      {
        localf = new com/tencent/liteav/audio/impl/Record/f;
        localf.<init>();
        b = localf;
      }
      f localf = b;
      AppMethodBeat.o(66651);
      return localf;
    }
    finally
    {
      AppMethodBeat.o(66651);
    }
  }

  private void a(int paramInt, String paramString)
  {
    AppMethodBeat.i(66658);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.j != null)
          localh = (h)this.j.get();
        if (localh != null)
        {
          localh.onAudioRecordError(paramInt, paramString);
          AppMethodBeat.o(66658);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66658);
      }
      TXCLog.e(a, "onRecordError:no callback");
      AppMethodBeat.o(66658);
    }
  }

  private void a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    AppMethodBeat.i(66657);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.j != null)
          localh = (h)this.j.get();
        if (localh != null)
        {
          localh.onAudioRecordPCM(paramArrayOfByte, paramInt, paramLong);
          AppMethodBeat.o(66657);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66657);
      }
      TXCLog.e(a, "onRecordPcmData:no callback");
      AppMethodBeat.o(66657);
    }
  }

  private void d()
  {
    AppMethodBeat.i(66655);
    int m = this.d;
    int n = this.e;
    int i1 = this.f;
    int i2 = this.g;
    TXCLog.i(a, String.format("audio record sampleRate = %d, channels = %d, bits = %d, aectype = %d", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i2) }));
    int i3 = 12;
    if (n == 1)
      i3 = 16;
    if (i1 == 8);
    for (int i4 = 3; ; i4 = 2)
    {
      int i5 = AudioRecord.getMinBufferSize(m, i3, i4);
      try
      {
        AudioRecord localAudioRecord;
        if (i2 == TXEAudioDef.TXE_AEC_SYSTEM)
        {
          TXCLog.i(a, "audio record type: system aec");
          if (this.c != null)
            ((AudioManager)this.c.getSystemService("audio")).setMode(3);
          localAudioRecord = new android/media/AudioRecord;
          localAudioRecord.<init>(7, m, i3, i4, i5 * 2);
          this.h = localAudioRecord;
          if (this.c != null)
            ((AudioManager)this.c.getSystemService("audio")).setMode(0);
        }
        while ((this.h == null) || (this.h.getState() != 1))
        {
          TXCLog.e(a, "audio record: initialize the mic failed.");
          e();
          a(TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT, "open mic failed!");
          AppMethodBeat.o(66655);
          return;
          TXCLog.i(a, "audio record type: system normal");
          localAudioRecord = new android/media/AudioRecord;
          localAudioRecord.<init>(1, m, i3, i4, i5 * 2);
          this.h = localAudioRecord;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        while (true)
        {
          continue;
          i3 = n * 1024 * i1 / 8;
          if (i3 > i5)
          {
            this.i = new byte[i5];
            TXCLog.i(a, String.format("audio record: mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d", new Object[] { Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), Integer.valueOf(i5), Integer.valueOf(this.i.length), Integer.valueOf(this.h.getState()) }));
            if (this.h == null);
          }
          else
          {
            try
            {
              this.h.startRecording();
              AppMethodBeat.o(66655);
              continue;
              this.i = new byte[i3];
            }
            catch (Exception localException)
            {
              TXCLog.e(a, "mic startRecording failed.");
              a(TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT, "start recording failed!");
              AppMethodBeat.o(66655);
            }
            continue;
          }
          AppMethodBeat.o(66655);
        }
      }
    }
  }

  private void e()
  {
    AppMethodBeat.i(66656);
    if (this.h != null)
      TXCLog.i(a, "stop mic");
    try
    {
      this.h.setRecordPositionUpdateListener(null);
      this.h.stop();
      this.h.release();
      label42: this.h = null;
      this.i = null;
      AppMethodBeat.o(66656);
      return;
    }
    catch (Exception localException)
    {
      break label42;
    }
  }

  private void f()
  {
    AppMethodBeat.i(66659);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.j != null)
          localh = (h)this.j.get();
        if (localh != null)
        {
          localh.onAudioRecordStart();
          AppMethodBeat.o(66659);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66659);
      }
      TXCLog.e(a, "onRecordStart:no callback");
      AppMethodBeat.o(66659);
    }
  }

  private void g()
  {
    AppMethodBeat.i(66660);
    h localh = null;
    while (true)
    {
      try
      {
        if (this.j != null)
          localh = (h)this.j.get();
        if (localh != null)
        {
          localh.onAudioRecordStop();
          AppMethodBeat.o(66660);
          return;
        }
      }
      finally
      {
        AppMethodBeat.o(66660);
      }
      TXCLog.e(a, "onRecordStop:no callback");
      AppMethodBeat.o(66660);
    }
  }

  public void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(66653);
    b();
    this.c = paramContext;
    this.d = paramInt1;
    this.e = paramInt2;
    this.f = paramInt3;
    this.g = paramInt4;
    this.l = true;
    this.k = new Thread(this, "AudioSysRecord Thread");
    this.k.start();
    AppMethodBeat.o(66653);
  }

  public void a(h paramh)
  {
    try
    {
      AppMethodBeat.i(66652);
      if (paramh == null)
      {
        this.j = null;
        AppMethodBeat.o(66652);
      }
      while (true)
      {
        return;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramh);
        this.j = localWeakReference;
        AppMethodBeat.o(66652);
      }
    }
    finally
    {
    }
    throw paramh;
  }

  public void b()
  {
    AppMethodBeat.i(66654);
    this.l = false;
    long l1 = System.currentTimeMillis();
    if ((this.k != null) && (this.k.isAlive()) && (Thread.currentThread().getId() != this.k.getId()));
    try
    {
      this.k.join();
      TXCLog.i(a, "stop record cost time(MS): " + (System.currentTimeMillis() - l1));
      this.k = null;
      AppMethodBeat.o(66654);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        TXCLog.e(a, "record stop Exception: " + localException.getMessage());
    }
  }

  public boolean c()
  {
    try
    {
      boolean bool = this.l;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void run()
  {
    AppMethodBeat.i(66661);
    if (!this.l)
    {
      TXCLog.w(a, "audio record: abandom start audio sys record thread!");
      AppMethodBeat.o(66661);
    }
    while (true)
    {
      return;
      f();
      d();
      int m = 0;
      int n = 0;
      while ((this.l) && (!Thread.interrupted()) && (this.h != null) && (n <= 5))
      {
        System.currentTimeMillis();
        int i1 = this.h.read(this.i, m, this.i.length - m);
        if (i1 != this.i.length - m)
        {
          if (i1 <= 0)
          {
            TXCLog.e(a, "read pcm eror, len =".concat(String.valueOf(i1)));
            n++;
          }
          else
          {
            m += i1;
          }
        }
        else
        {
          a(this.i, this.i.length, TXCTimeUtil.getTimeTick());
          m = 0;
          n = 0;
        }
      }
      e();
      if (n > 5)
      {
        a(TXEAudioDef.TXE_AUDIO_RECORD_ERR_NO_MIC_PERMIT, "read data failed!");
        AppMethodBeat.o(66661);
      }
      else
      {
        g();
        AppMethodBeat.o(66661);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.f
 * JD-Core Version:    0.6.2
 */