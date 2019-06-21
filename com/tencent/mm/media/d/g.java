package com.tencent.mm.media.d;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/X264TransEncoder;", "", "bufId", "", "width", "height", "(III)V", "curEncodeIndex", "encodeThread", "Ljava/lang/Thread;", "encodeThreadStart", "", "frameCount", "isCancel", "isStop", "startTime", "", "stopLock", "Ljava/lang/Object;", "writeDataThread", "Lcom/tencent/mm/sdk/platformtools/MMHandlerThread;", "encodeThreadLoop", "", "getFrameCount", "getRecordTimes", "start", "stop", "writeRGBData", "data", "", "Companion", "plugin-mediaeditor_release"})
public final class g
{
  public static final a eVW;
  public final int eTa;
  public final Object eTu;
  public Thread eVR;
  public final al eVS;
  public boolean eVT;
  private int eVU;
  public boolean eVV;
  public int frameCount;
  private final int height;
  public boolean isStop;
  public long startTime;
  private final int width;

  static
  {
    AppMethodBeat.i(12968);
    eVW = new a((byte)0);
    AppMethodBeat.o(12968);
  }

  public g(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(12967);
    this.eTa = paramInt1;
    this.width = paramInt2;
    this.height = paramInt3;
    this.eVS = new al("X264TransEncoder_writeDataThread");
    this.eTu = new Object();
    ab.i("MicroMsg.X264TransEncoder", "create X264TransEncoder, width:" + this.width + ", height:" + this.height);
    AppMethodBeat.o(12967);
  }

  public final void stop(boolean paramBoolean)
  {
    AppMethodBeat.i(12966);
    ab.i("MicroMsg.X264TransEncoder", "stop isCancel:".concat(String.valueOf(paramBoolean)));
    long l = bo.yz();
    synchronized (this.eTu)
    {
      this.isStop = true;
      this.eVT = paramBoolean;
      this.eVS.quit();
      Object localObject2 = this.eVR;
      if (localObject2 != null)
        ((Thread)localObject2).join();
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>("stop finish, cost:");
      ab.i("MicroMsg.X264TransEncoder", bo.az(l) + "ms");
      localObject2 = y.AUy;
      AppMethodBeat.o(12966);
      return;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/encoder/X264TransEncoder$Companion;", "", "()V", "TAG", "", "plugin-mediaeditor_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.d.g
 * JD-Core Version:    0.6.2
 */