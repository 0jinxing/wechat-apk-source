package com.tencent.liteav.audio.impl.Record;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import java.lang.ref.WeakReference;

public abstract class b
{
  protected int a = 0;
  protected int b = 0;
  protected int c = 0;
  private WeakReference<h> d = null;

  protected void a()
  {
    h localh = null;
    while (true)
    {
      try
      {
        if (this.d != null)
          localh = (h)this.d.get();
        if (localh != null)
        {
          localh.onAudioRecordStart();
          return;
        }
      }
      finally
      {
      }
      TXCLog.e("AudioCenter:TXCAudioBaseRecord", "onRecordStart:no callback");
    }
  }

  public void a(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }

  public void a(h paramh)
  {
    if (paramh == null);
    try
    {
      WeakReference localWeakReference;
      for (this.d = null; ; this.d = localWeakReference)
      {
        return;
        localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramh);
      }
    }
    finally
    {
    }
    throw paramh;
  }

  protected void a(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    h localh = null;
    while (true)
    {
      try
      {
        if (this.d != null)
          localh = (h)this.d.get();
        if (localh != null)
        {
          localh.onAudioRecordPCM(paramArrayOfByte, paramInt, paramLong);
          return;
        }
      }
      finally
      {
      }
      TXCLog.e("AudioCenter:TXCAudioBaseRecord", "onRecordPcmData:no callback");
    }
  }

  protected void b()
  {
    h localh = null;
    while (true)
    {
      try
      {
        if (this.d != null)
          localh = (h)this.d.get();
        if (localh != null)
        {
          localh.onAudioRecordStop();
          return;
        }
      }
      finally
      {
      }
      TXCLog.e("AudioCenter:TXCAudioBaseRecord", "onRecordStop:no callback");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.audio.impl.Record.b
 * JD-Core Version:    0.6.2
 */