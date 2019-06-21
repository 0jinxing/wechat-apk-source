package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.f;
import com.tencent.mm.i.a;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.facedetect.e.a.b;
import com.tencent.mm.plugin.facedetect.model.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class e$2$1
  implements a.b
{
  e$2$1(e.2 param2)
  {
  }

  public final void Lu(String paramString)
  {
    AppMethodBeat.i(702);
    ab.i("MicroMsg.FaceCheckVideoRecordMgr", "onStop filePath: %s", new Object[] { paramString });
    h.pYm.a(917L, 46L, 1L, false);
    e locale = this.mcI.mcH;
    try
    {
      ab.i("MicroMsg.FaceCheckVideoRecordMgr", "encryptAndUploadVideoFile: %s", new Object[] { paramString });
      if ((!bo.isNullOrNil(paramString)) && (FileOp.ct(paramString)))
      {
        ab.i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", new Object[] { paramString, com.tencent.mm.a.g.cz(paramString) });
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = paramString + "_encrypt";
        ab.i("MicroMsg.FaceCheckVideoRecordMgr", "encrypt video file, personId: %s", new Object[] { locale.mct });
        e.R(locale.mct, paramString, (String)localObject);
        ab.i("MicroMsg.FaceCheckVideoRecordMgr", "%s MD5: %s", new Object[] { localObject, com.tencent.mm.a.g.cz((String)localObject) });
        FileOp.deleteFile(paramString);
        ab.i("MicroMsg.FaceCheckVideoRecordMgr", "doUploadVideoFile: %s", new Object[] { localObject });
        String str = locale.mct;
        com.tencent.mm.i.g localg = new com/tencent/mm/i/g;
        localg.<init>();
        paramString = new com/tencent/mm/plugin/facedetectaction/b/e$b;
        paramString.<init>(locale, (String)localObject, str, (byte)0);
        localg.egl = paramString;
        localg.field_mediaId = p.Lt((String)localObject);
        localg.field_fullpath = ((String)localObject);
        localg.field_thumbpath = "";
        localg.field_fileType = a.MediaType_FILE;
        localg.field_talker = "";
        localg.field_priority = a.efC;
        localg.field_needStorage = false;
        localg.field_isStreamMedia = false;
        localg.field_appType = 0;
        localg.field_bzScene = 0;
        localg.field_largesvideo = 0;
        if (!f.afx().e(localg))
        {
          ab.e("MicroMsg.FaceCheckVideoRecordMgr", "hy: video task info failed. clientid:%s", new Object[] { localg.field_mediaId });
          com.tencent.mm.a.e.deleteFile((String)localObject);
          if (locale.mcE != null)
            locale.mcE.onError();
        }
      }
      AppMethodBeat.o(702);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FaceCheckVideoRecordMgr", paramString, "encryptAndUploadVideoFile error", new Object[0]);
        if (locale.mcE != null)
          locale.mcE.onError();
        AppMethodBeat.o(702);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.e.2.1
 * JD-Core Version:    0.6.2
 */