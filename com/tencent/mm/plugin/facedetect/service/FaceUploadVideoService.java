package com.tencent.mm.plugin.facedetect.service;

import android.content.Intent;
import android.os.IBinder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.ai.m;
import com.tencent.mm.i.a;
import com.tencent.mm.plugin.facedetect.b.r;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.MMService;

public class FaceUploadVideoService extends MMService
  implements com.tencent.mm.ai.f
{
  public final IBinder Iu()
  {
    return null;
  }

  public final String getTag()
  {
    return "MicroMsg.FaceUploadVideoService";
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(355);
    if ((paramm instanceof r))
    {
      paramm = (r)paramm;
      ab.i("MicroMsg.FaceUploadVideoService", "hy: bind video errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      paramString = h.pYm;
      if (paramInt2 != 0)
        break label104;
    }
    label104: for (long l = 25L; ; l = 26L)
    {
      paramString.a(917L, l, 1L, false);
      com.tencent.mm.kernel.g.Rg().b(1197, this);
      e.deleteFile(paramm.mFileName);
      stopSelf();
      AppMethodBeat.o(355);
      return;
    }
  }

  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(354);
    if (paramIntent == null)
    {
      ab.e("MicroMsg.FaceUploadVideoService", "hy: null intent called to FaceUploadVideoService! Stub");
      paramInt1 = super.onStartCommand(null, paramInt1, paramInt2);
      AppMethodBeat.o(354);
    }
    while (true)
    {
      return paramInt1;
      String str1 = paramIntent.getStringExtra("key_video_file_name");
      long l = paramIntent.getLongExtra("k_bio_id", -1L);
      String str2 = paramIntent.getStringExtra("key_app_id");
      ab.i("MicroMsg.FaceUploadVideoService", "hy: start uploading %s", new Object[] { str1 });
      if (bo.isNullOrNil(str1))
      {
        ab.w("MicroMsg.FaceUploadVideoService", "hy: null file name");
        paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
        AppMethodBeat.o(354);
      }
      else if (!new com.tencent.mm.vfs.b(str1).exists())
      {
        ab.w("MicroMsg.FaceUploadVideoService", "hy: file not exist");
        paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
        AppMethodBeat.o(354);
      }
      else if ((l == -1L) && (bo.isNullOrNil(str2)))
      {
        ab.w("MicroMsg.FaceUploadVideoService", "hy: bioId or app id null");
        e.deleteFile(str1);
        paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
        AppMethodBeat.o(354);
      }
      else
      {
        com.tencent.mm.i.g localg = new com.tencent.mm.i.g();
        localg.egl = new FaceUploadVideoService.a(this, l, str2, str1, (byte)0);
        localg.field_mediaId = com.tencent.mm.plugin.facedetect.model.p.Lt(str1);
        localg.field_fullpath = str1;
        localg.field_thumbpath = "";
        localg.field_fileType = a.MediaType_FILE;
        localg.field_talker = "";
        localg.field_priority = a.efC;
        localg.field_needStorage = false;
        localg.field_isStreamMedia = false;
        localg.field_appType = 0;
        localg.field_bzScene = 0;
        localg.field_largesvideo = 0;
        if (!com.tencent.mm.al.f.afx().e(localg))
        {
          ab.e("MicroMsg.FaceUploadVideoService", "hy: video task info failed. clientid:%s", new Object[] { localg.field_mediaId });
          e.deleteFile(str1);
          FaceDetectReporter.i(l, 1, 10086);
        }
        paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
        AppMethodBeat.o(354);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.service.FaceUploadVideoService
 * JD-Core Version:    0.6.2
 */