package com.tencent.liteav.videodecoder;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.g.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

class b$a extends Handler
{
  a a;
  d b;
  WeakReference<com.tencent.liteav.basic.d.a> c;
  boolean d;
  boolean e;
  Surface f;
  private ByteBuffer g;
  private ByteBuffer h;

  public b$a(Looper paramLooper)
  {
    super(paramLooper);
  }

  private void a(boolean paramBoolean)
  {
    AppMethodBeat.i(67809);
    if (this.a != null)
    {
      TXCLog.i("TXCVideoDecoder", "play:decode: start decode ignore hwdec: " + this.d);
      AppMethodBeat.o(67809);
      return;
    }
    if (this.d);
    for (this.a = new c(); ; this.a = new TXCVideoFfmpegDecoder())
    {
      this.a.setListener(this.b);
      this.a.setNotifyListener(this.c);
      this.a.config(this.f);
      this.a.start(this.g, this.h, paramBoolean, this.e);
      TXCLog.w("TXCVideoDecoder", "play:decode: start decode hwdec: " + this.d + ", hevc: " + this.e);
      AppMethodBeat.o(67809);
      break;
    }
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(67808);
    this.d = paramBoolean1;
    TXCLog.w("TXCVideoDecoder", "play:decode: restart decode hwdec: " + this.d);
    if (this.a != null)
    {
      this.a.stop();
      this.a.setListener(null);
      this.a.setNotifyListener(null);
      this.a = null;
    }
    a(paramBoolean2);
    AppMethodBeat.o(67808);
  }

  private void a(byte[] paramArrayOfByte, long paramLong1, long paramLong2, int paramInt)
  {
    AppMethodBeat.i(67806);
    b localb = new b();
    localb.a = paramArrayOfByte;
    localb.g = paramLong1;
    localb.h = paramLong2;
    localb.i = paramInt;
    if (this.a != null)
      this.a.decode(localb);
    AppMethodBeat.o(67806);
  }

  private void b()
  {
    AppMethodBeat.i(67807);
    if (this.a != null)
    {
      this.a.stop();
      this.a.setListener(null);
      this.a.setNotifyListener(null);
      this.a = null;
    }
    Looper.myLooper().quit();
    TXCLog.w("TXCVideoDecoder", "play:decode: stop decode hwdec: " + this.d);
    AppMethodBeat.o(67807);
  }

  public void a(boolean paramBoolean1, boolean paramBoolean2, Surface paramSurface, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, d paramd, com.tencent.liteav.basic.d.a parama)
  {
    AppMethodBeat.i(67803);
    this.e = paramBoolean1;
    this.d = paramBoolean2;
    this.f = paramSurface;
    this.g = paramByteBuffer1;
    this.h = paramByteBuffer2;
    this.b = paramd;
    this.c = new WeakReference(parama);
    AppMethodBeat.o(67803);
  }

  public boolean a()
  {
    AppMethodBeat.i(67805);
    boolean bool;
    if (this.a != null)
    {
      bool = this.a.isHevc();
      AppMethodBeat.o(67805);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67805);
    }
  }

  public void handleMessage(Message paramMessage)
  {
    boolean bool1 = true;
    AppMethodBeat.i(67804);
    switch (paramMessage.what)
    {
    default:
      AppMethodBeat.o(67804);
    case 100:
    case 101:
    case 102:
      while (true)
      {
        return;
        a(((Boolean)paramMessage.obj).booleanValue());
        AppMethodBeat.o(67804);
        continue;
        try
        {
          paramMessage = paramMessage.getData();
          a(paramMessage.getByteArray("nal"), paramMessage.getLong("pts"), paramMessage.getLong("dts"), paramMessage.getInt("codecId"));
          AppMethodBeat.o(67804);
        }
        catch (Exception paramMessage)
        {
          AppMethodBeat.o(67804);
        }
        continue;
        b();
        AppMethodBeat.o(67804);
      }
    case 103:
    }
    boolean bool2;
    if (paramMessage.arg1 == 1)
    {
      bool2 = true;
      label140: if (paramMessage.arg2 != 1)
        break label162;
    }
    while (true)
    {
      a(bool2, bool1);
      break;
      bool2 = false;
      break label140;
      label162: bool1 = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videodecoder.b.a
 * JD-Core Version:    0.6.2
 */