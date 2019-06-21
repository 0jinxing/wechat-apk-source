package com.tencent.liteav.muxer;

import android.content.Context;
import android.media.MediaFormat;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class c
  implements a
{
  private int a;
  private a b;

  public c(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(67111);
    this.a = 0;
    switch (paramInt)
    {
    default:
      if (a(paramContext))
      {
        this.a = 0;
        this.b = new d();
        TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
        AppMethodBeat.o(67111);
      }
      break;
    case 0:
    case 1:
    }
    while (true)
    {
      return;
      this.a = 0;
      this.b = new d();
      TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use sw model ");
      AppMethodBeat.o(67111);
      continue;
      this.a = 1;
      this.b = new b();
      TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
      AppMethodBeat.o(67111);
      continue;
      this.a = 1;
      this.b = new b();
      TXCLog.i("TXCMP4Muxer", "TXCMP4Muxer: use hw model ");
      AppMethodBeat.o(67111);
    }
  }

  public static boolean a(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(67112);
    com.tencent.liteav.basic.f.b.a().a(paramContext);
    if (com.tencent.liteav.basic.f.b.a().e() == 1)
      AppMethodBeat.o(67112);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(67112);
    }
  }

  public int a()
  {
    AppMethodBeat.i(67118);
    int i = this.b.a();
    AppMethodBeat.o(67118);
    return i;
  }

  public void a(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(67113);
    this.b.a(paramMediaFormat);
    AppMethodBeat.o(67113);
  }

  public void a(String paramString)
  {
    AppMethodBeat.i(67115);
    this.b.a(paramString);
    AppMethodBeat.o(67115);
  }

  public void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    AppMethodBeat.i(67116);
    this.b.a(paramArrayOfByte, paramInt1, paramInt2, paramLong, paramInt3);
    AppMethodBeat.o(67116);
  }

  public int b()
  {
    AppMethodBeat.i(67119);
    int i = this.b.b();
    AppMethodBeat.o(67119);
    return i;
  }

  public void b(MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(67114);
    this.b.b(paramMediaFormat);
    AppMethodBeat.o(67114);
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    AppMethodBeat.i(67117);
    this.b.b(paramArrayOfByte, paramInt1, paramInt2, paramLong, paramInt3);
    AppMethodBeat.o(67117);
  }

  public boolean c()
  {
    AppMethodBeat.i(67120);
    boolean bool = this.b.c();
    AppMethodBeat.o(67120);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.muxer.c
 * JD-Core Version:    0.6.2
 */