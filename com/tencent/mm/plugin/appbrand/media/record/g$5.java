package com.tencent.mm.plugin.appbrand.media.record;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.plugin.appbrand.media.record.a.c.a;
import com.tencent.mm.plugin.appbrand.media.record.record_imp.RecordParam;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;

final class g$5
  implements c.a
{
  g$5(g paramg)
  {
  }

  public final void d(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(105607);
    Object localObject = this.ilC;
    ab.i("MicroMsg.Record.AudioRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrameL:%b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    mb localmb = new mb();
    localmb.cHS.state = "frameRecorded";
    if (((g)localObject).ilo != null)
      localmb.cHS.appId = ((g)localObject).ilo.appId;
    localmb.cHS.action = 5;
    localObject = new byte[paramInt];
    System.arraycopy(paramArrayOfByte, 0, localObject, 0, paramInt);
    localmb.cHS.frameBuffer = ((byte[])localObject);
    localmb.cHS.cHT = paramBoolean;
    a.xxA.a(localmb, Looper.getMainLooper());
    AppMethodBeat.o(105607);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.media.record.g.5
 * JD-Core Version:    0.6.2
 */