package com.tencent.mm.sandbox.updater;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.File;

final class c$2
  implements Runnable
{
  c$2(c paramc, btd parambtd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(28857);
    ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "updateByPatch start");
    Message localMessage = Message.obtain();
    localMessage.what = 1;
    localMessage.obj = this.xwd;
    long l = System.currentTimeMillis();
    int i = i.g(ah.getContext(), this.xwc.alN(), this.xwc.dne(), c.c(this.xwc));
    ab.i("MicroMsg.NetSceneGetUpdatePackFromCDN", "gen new apk finish, time cost = " + (System.currentTimeMillis() - Long.valueOf(l).longValue()));
    if (i == 0)
    {
      ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "updateByPatch ok");
      localMessage.arg1 = 0;
      c.d(this.xwc).sendMessage(localMessage);
      AppMethodBeat.o(28857);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.NetSceneGetUpdatePackFromCDN", "updateByPatch error in genNewAPKInNewThread()");
      File localFile = new File(this.xwc.dne());
      if (localFile.exists())
        localFile.delete();
      if (i == -1)
      {
        ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "RET_GEN_APK_ERR");
        localMessage.arg1 = 3;
        c.d(this.xwc).sendMessage(localMessage);
        AppMethodBeat.o(28857);
      }
      else if (i == -2)
      {
        ab.d("MicroMsg.NetSceneGetUpdatePackFromCDN", "RET_APK_MD5_ERR");
        localMessage.arg1 = 4;
        c.d(this.xwc).sendMessage(localMessage);
        AppMethodBeat.o(28857);
      }
      else
      {
        AppMethodBeat.o(28857);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.c.2
 * JD-Core Version:    0.6.2
 */