package com.tencent.mm.plugin.facedetect.service;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.facedetect.e.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends a
{
  long lTH = -1L;
  String mAppId = "";

  public final void S(Intent paramIntent)
  {
    AppMethodBeat.i(352);
    this.lTH = paramIntent.getLongExtra("k_bio_id", -1L);
    this.mAppId = paramIntent.getStringExtra("key_app_id");
    ab.i("MicroMsg.FaceDetectServiceControllerMp", "hy: got bioid: %d, appid: %s", new Object[] { Long.valueOf(this.lTH), this.mAppId });
    ab.i("MicroMsg.FaceDetectServiceControllerMp", "hy: requesting release and send video");
    if ((com.tencent.mm.plugin.facedetect.e.a.btw().lZc) && ((com.tencent.mm.plugin.facedetect.e.a.btw().btz() == a.a.lZJ) || (com.tencent.mm.plugin.facedetect.e.a.btw().btz() == a.a.lZK) || (com.tencent.mm.plugin.facedetect.e.a.btw().btz() == a.a.lZL)))
    {
      long l = bo.yz();
      com.tencent.mm.plugin.facedetect.e.a.btw().a(new b.1(this, l));
      AppMethodBeat.o(352);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.FaceDetectServiceControllerMp", "hy: not recording video");
      AppMethodBeat.o(352);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.service.b
 * JD-Core Version:    0.6.2
 */