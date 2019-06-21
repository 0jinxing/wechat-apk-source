package com.tencent.mm.plugin.facedetect.service;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.facedetect.e.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class b$1
  implements a.b
{
  b$1(b paramb, long paramLong)
  {
  }

  public final void Lu(String paramString)
  {
    AppMethodBeat.i(351);
    ab.i("MicroMsg.FaceDetectServiceControllerMp", "hy: video release done. using: %d ms. file path: %s", new Object[] { Long.valueOf(bo.az(this.lWa)), paramString });
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(351);
    while (true)
    {
      return;
      Intent localIntent = new Intent(ah.getContext(), FaceUploadVideoService.class);
      localIntent.putExtra("key_video_file_name", paramString);
      localIntent.putExtra("k_bio_id", this.lWb.lTH);
      localIntent.putExtra("key_app_id", this.lWb.mAppId);
      d.aH(localIntent);
      AppMethodBeat.o(351);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.service.b.1
 * JD-Core Version:    0.6.2
 */