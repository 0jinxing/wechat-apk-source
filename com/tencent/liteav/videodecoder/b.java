package com.tencent.liteav.videodecoder;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.tencent.liteav.basic.d.a;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCTimeUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

public class b
  implements a, d
{
  boolean a;
  boolean b;
  boolean c;
  boolean d;
  Surface e;
  d f;
  private int g;
  private ByteBuffer h;
  private ByteBuffer i;
  private long j;
  private boolean k;
  private ArrayList<com.tencent.liteav.basic.g.b> l;
  private b.a m;
  private WeakReference<a> n;

  public b()
  {
    AppMethodBeat.i(67769);
    this.k = false;
    this.l = new ArrayList();
    this.b = true;
    this.c = false;
    this.a = true;
    this.d = false;
    AppMethodBeat.o(67769);
  }

  private void b(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67772);
    if (paramb.b == 0);
    for (boolean bool = true; ; bool = false)
    {
      Object localObject = new Bundle();
      ((Bundle)localObject).putBoolean("iframe", bool);
      ((Bundle)localObject).putByteArray("nal", paramb.a);
      ((Bundle)localObject).putLong("pts", paramb.g);
      ((Bundle)localObject).putLong("dts", paramb.h);
      ((Bundle)localObject).putInt("codecId", paramb.i);
      paramb = new Message();
      paramb.what = 101;
      paramb.setData((Bundle)localObject);
      localObject = this.m;
      if (localObject != null)
        ((Handler)localObject).sendMessage(paramb);
      this.g += 1;
      AppMethodBeat.o(67772);
      return;
    }
  }

  public int a(SurfaceTexture paramSurfaceTexture, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean)
  {
    AppMethodBeat.i(67771);
    int i1 = a(new Surface(paramSurfaceTexture), paramByteBuffer1, paramByteBuffer2, paramBoolean);
    AppMethodBeat.o(67771);
    return i1;
  }

  public int a(Surface paramSurface, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, boolean paramBoolean)
  {
    this.e = paramSurface;
    this.h = paramByteBuffer1;
    this.i = paramByteBuffer2;
    this.a = paramBoolean;
    return 0;
  }

  public void a(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(67781);
    if (this.f != null)
      this.f.a(paramInt1, paramInt2);
    AppMethodBeat.o(67781);
  }

  public void a(long paramLong)
  {
    this.j = paramLong;
  }

  public void a(long paramLong1, int paramInt1, int paramInt2, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(67780);
    if (this.f != null)
      this.f.a(paramLong1, paramInt1, paramInt2, paramLong2, paramLong3);
    if (this.g > 0)
      this.g -= 1;
    AppMethodBeat.o(67780);
  }

  public void a(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(67779);
    if (this.f != null)
      this.f.a(paramSurfaceTexture, paramInt1, paramInt2, paramLong1, paramLong2);
    if (this.g > 0)
      this.g -= 1;
    AppMethodBeat.o(67779);
  }

  public void a(a parama)
  {
    AppMethodBeat.i(67770);
    this.n = new WeakReference(parama);
    AppMethodBeat.o(67770);
  }

  public void a(com.tencent.liteav.basic.g.b paramb)
  {
    AppMethodBeat.i(67773);
    try
    {
      if (paramb.b == 0);
      for (i1 = 1; (!this.d) && (i1 == 0); i1 = 0)
      {
        TXCLog.i("TXCVideoDecoder", "play:decode: push nal ignore p frame when not got i frame");
        AppMethodBeat.o(67773);
        return;
      }
      if ((!this.d) && (i1 != 0))
      {
        TXCLog.w("TXCVideoDecoder", "play:decode: push first i frame");
        this.d = true;
      }
      if ((!this.k) && (paramb.i == 1) && (!this.b))
      {
        TXCLog.w("TXCVideoDecoder", "play:decode: hevc decode error  ");
        com.tencent.liteav.basic.util.b.a(this.n, -2304, "h265解码失败");
        this.k = true;
      }
      if (this.m != null)
        if (!this.l.isEmpty())
        {
          Iterator localIterator = this.l.iterator();
          while (localIterator.hasNext())
            b((com.tencent.liteav.basic.g.b)localIterator.next());
        }
    }
    catch (Exception paramb)
    {
      while (true)
      {
        int i1;
        AppMethodBeat.o(67773);
        continue;
        this.l.clear();
        b(paramb);
        AppMethodBeat.o(67773);
        continue;
        if ((i1 != 0) && (!this.l.isEmpty()))
          this.l.clear();
        this.l.add(paramb);
        if (!this.k)
          b();
        AppMethodBeat.o(67773);
      }
    }
  }

  public void a(d paramd)
  {
    this.f = paramd;
  }

  public void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public void a(byte[] paramArrayOfByte, long paramLong, int paramInt)
  {
    AppMethodBeat.i(67777);
    b.a locala = this.m;
    if ((locala != null) && (!locala.d) && (locala.a != null))
      ((TXCVideoFfmpegDecoder)locala.a).loadNativeData(paramArrayOfByte, paramLong, paramInt);
    AppMethodBeat.o(67777);
  }

  public boolean a()
  {
    return this.b;
  }

  public int b()
  {
    int i1 = -1;
    AppMethodBeat.i(67774);
    if ((this.b) && (this.e == null))
    {
      TXCLog.i("TXCVideoDecoder", "play:decode: start decoder error when not setup surface");
      AppMethodBeat.o(67774);
      return i1;
    }
    while (true)
    {
      try
      {
        if (this.m != null)
        {
          TXCLog.e("TXCVideoDecoder", "play:decode: start decoder error when decoder is started");
          AppMethodBeat.o(67774);
          break;
        }
        this.g = 0;
        this.k = false;
        Object localObject1 = new android/os/HandlerThread;
        ((HandlerThread)localObject1).<init>("VDecoder");
        ((HandlerThread)localObject1).start();
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("VDecoder");
        ((HandlerThread)localObject1).setName(((HandlerThread)localObject1).getId());
        localObject3 = new com/tencent/liteav/videodecoder/b$a;
        ((b.a)localObject3).<init>(((HandlerThread)localObject1).getLooper());
        ((b.a)localObject3).a(this.c, this.b, this.e, this.h, this.i, this, this);
        TXCLog.w("TXCVideoDecoder", "play:decode: start decode thread");
        localObject1 = Message.obtain();
        ((Message)localObject1).what = 100;
        ((Message)localObject1).obj = Boolean.valueOf(this.a);
        ((b.a)localObject3).sendMessage((Message)localObject1);
        this.m = ((b.a)localObject3);
        localObject3 = new Bundle();
        ((Bundle)localObject3).putInt("EVT_ID", 2008);
        ((Bundle)localObject3).putLong("EVT_TIME", TXCTimeUtil.getTimeTick());
        if (this.b)
        {
          localObject1 = "启动硬解";
          ((Bundle)localObject3).putCharSequence("EVT_MSG", (CharSequence)localObject1);
          if (!this.b)
            break label296;
          i1 = 1;
          ((Bundle)localObject3).putInt("EVT_PARAM1", i1);
          com.tencent.liteav.basic.util.b.a(this.n, this.j, 2008, (Bundle)localObject3);
          AppMethodBeat.o(67774);
          i1 = 0;
          break;
        }
      }
      finally
      {
        AppMethodBeat.o(67774);
      }
      String str = "启动软解";
      continue;
      label296: i1 = 2;
    }
  }

  public void b(boolean paramBoolean)
  {
    int i1 = 1;
    AppMethodBeat.i(67776);
    try
    {
      this.b = paramBoolean;
      this.l.clear();
      this.d = false;
      this.g = 0;
      Message localMessage = Message.obtain();
      localMessage.what = 103;
      if (this.b)
      {
        i2 = 1;
        localMessage.arg1 = i2;
        if (!this.a)
          break label105;
      }
      label105: for (int i2 = i1; ; i2 = 0)
      {
        localMessage.arg2 = i2;
        if (this.m != null)
          this.m.sendMessage(localMessage);
        return;
        i2 = 0;
        break;
      }
    }
    finally
    {
      AppMethodBeat.o(67776);
    }
  }

  public void c()
  {
    AppMethodBeat.i(67775);
    try
    {
      if (this.m != null)
        this.m.sendEmptyMessage(102);
      this.m = null;
      this.l.clear();
      this.d = false;
      this.g = 0;
      AppMethodBeat.o(67775);
      return;
    }
    finally
    {
      AppMethodBeat.o(67775);
    }
  }

  public int d()
  {
    AppMethodBeat.i(67778);
    int i1 = this.g;
    int i2 = this.l.size();
    AppMethodBeat.o(67778);
    return i1 + i2;
  }

  public boolean e()
  {
    AppMethodBeat.i(67782);
    b.a locala = this.m;
    boolean bool;
    if (locala != null)
    {
      bool = locala.a();
      AppMethodBeat.o(67782);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67782);
    }
  }

  public void onNotifyEvent(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(67768);
    com.tencent.liteav.basic.util.b.a(this.n, this.j, paramInt, paramBundle);
    AppMethodBeat.o(67768);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.videodecoder.b
 * JD-Core Version:    0.6.2
 */