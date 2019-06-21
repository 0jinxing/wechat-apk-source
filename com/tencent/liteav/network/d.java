package com.tencent.liteav.network;

import com.tencent.liteav.basic.g.a;
import com.tencent.liteav.basic.g.b;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Vector;

public class d
  implements f
{
  private f a = null;
  private d.b b = null;
  private long c = 0L;
  private long d = 0L;
  private d.b e = null;
  private d.a f;
  private long g = 0L;
  private long h = 0L;

  public d(d.a parama)
  {
    this.f = parama;
  }

  long a(long paramLong)
  {
    AppMethodBeat.i(67569);
    if (this.b != null)
      this.b.b(this.c);
    TXCLog.w("TXCMultiStreamDownloader", " stream_switch delay stop begin from " + this.c);
    paramLong = this.c;
    AppMethodBeat.o(67569);
    return paramLong;
  }

  public void a()
  {
    AppMethodBeat.i(67565);
    if (this.b != null)
      this.b.b(0L);
    if (this.e != null)
      this.e.b(0L);
    AppMethodBeat.o(67565);
  }

  public void a(TXIStreamDownloader paramTXIStreamDownloader1, TXIStreamDownloader paramTXIStreamDownloader2, long paramLong1, long paramLong2, String paramString)
  {
    AppMethodBeat.i(67566);
    this.c = paramLong1;
    this.d = paramLong2;
    this.b = new d.b(paramTXIStreamDownloader1, this);
    this.b.a(this);
    Vector localVector = new Vector();
    localVector.add(new e(paramString, false));
    paramTXIStreamDownloader2.setOriginUrl(paramString);
    paramTXIStreamDownloader2.startDownload(localVector, false, false, paramTXIStreamDownloader1.mEnableMessage);
    this.e = new d.b(paramTXIStreamDownloader2, this);
    this.e.a(this.c);
    AppMethodBeat.o(67566);
  }

  void a(TXIStreamDownloader paramTXIStreamDownloader, boolean paramBoolean)
  {
    AppMethodBeat.i(67568);
    if (this.f != null)
      this.f.onSwitchFinish(paramTXIStreamDownloader, paramBoolean);
    AppMethodBeat.o(67568);
  }

  public void a(f paramf)
  {
    this.a = paramf;
  }

  void b()
  {
    AppMethodBeat.i(67567);
    this.b.a(null);
    this.e.a(this);
    this.b = this.e;
    this.e = null;
    StringBuilder localStringBuilder = new StringBuilder(" stream_switch end at ").append(this.c).append(" stop ts ").append(this.h).append(" start ts ").append(this.g).append(" diff ts ");
    if (this.h > this.g);
    for (long l = this.h - this.g; ; l = this.g - this.h)
    {
      TXCLog.w("TXCMultiStreamDownloader", l);
      AppMethodBeat.o(67567);
      return;
    }
  }

  void b(long paramLong)
  {
    this.g = paramLong;
  }

  void c(long paramLong)
  {
    this.h = paramLong;
  }

  public void onPullAudio(a parama)
  {
    AppMethodBeat.i(67570);
    if (this.a != null)
      this.a.onPullAudio(parama);
    AppMethodBeat.o(67570);
  }

  public void onPullNAL(b paramb)
  {
    AppMethodBeat.i(67571);
    this.c = paramb.g;
    if (paramb.b == 0)
      this.d = paramb.g;
    if (this.a != null)
      this.a.onPullNAL(paramb);
    AppMethodBeat.o(67571);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.d
 * JD-Core Version:    0.6.2
 */