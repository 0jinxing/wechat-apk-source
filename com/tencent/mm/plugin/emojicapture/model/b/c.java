package com.tencent.mm.plugin.emojicapture.model.b;

import a.l;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.gif.a;
import com.tencent.mm.plugin.gif.g;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiMixGifEncoder;", "", "outputPath", "", "width", "", "height", "frameDurationMs", "", "outputGif", "", "(Ljava/lang/String;IIJZ)V", "TAG", "encoder", "Lcom/tencent/mm/plugin/gif/IAnimFileEncoder;", "gifEncodeThread", "Landroid/os/HandlerThread;", "gifEncoderHandler", "Lcom/tencent/mm/sdk/platformtools/MMHandler;", "saveRgbFrameCount", "startEncodeTick", "encodeFrame", "", "data", "", "finishEncode", "callback", "Lkotlin/Function0;", "Companion", "plugin-emojicapture_release"})
public final class c
{
  public static final c.a lit;
  private final String TAG;
  private final int height;
  private HandlerThread lin;
  ak lio;
  private a lip;
  private long liq;
  private int lir;
  private final String lis;
  private final int width;

  static
  {
    AppMethodBeat.i(2669);
    lit = new c.a((byte)0);
    AppMethodBeat.o(2669);
  }

  public c(String paramString, int paramInt1, int paramInt2, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(2668);
    this.lis = paramString;
    this.width = paramInt1;
    this.height = paramInt2;
    this.TAG = "MicroMsg.EmojiMixGifEncoder";
    paramString = d.anM("EmojiMixer_gifEncode");
    a.f.b.j.o(paramString, "ThreadPool.newFreeHandle…d(\"EmojiMixer_gifEncode\")");
    this.lin = paramString;
    this.lir = 30;
    this.lin.start();
    this.lio = new ak(this.lin.getLooper());
    if (paramBoolean);
    for (paramString = (a)new g(this.lis, this.width, this.height, paramLong); ; paramString = (a)new com.tencent.mm.plugin.gif.j(this.lis, this.width, this.height, paramLong))
    {
      this.lip = paramString;
      this.lio.post((Runnable)new c.1(this, paramBoolean));
      AppMethodBeat.o(2668);
      return;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  static final class b
    implements Runnable
  {
    b(c paramc, byte[] paramArrayOfByte)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(2665);
      long l = bo.yz();
      boolean bool = c.a(this.liu).c(this.eXv, this.liw);
      ab.i(c.b(this.liu), "encodeRgbaFrame used " + bo.az(l) + ", ret:" + bool);
      AppMethodBeat.o(2665);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.c
 * JD-Core Version:    0.6.2
 */