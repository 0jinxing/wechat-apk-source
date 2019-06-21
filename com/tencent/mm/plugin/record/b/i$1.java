package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.c;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.a.a;
import com.tencent.mm.plugin.record.a.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class i$1
  implements g.a
{
  i$1(i parami)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(135670);
    ab.v("MicroMsg.RecordMsgCDNService", "cdn transfer callback, startRet[%d], mediaId[%s]", new Object[] { Integer.valueOf(paramInt), paramString });
    if (paramc != null)
      ab.v("MicroMsg.RecordMsgCDNService", "cdn transfer callback, mediaid[%s], totallen[%d], offset[%d]", new Object[] { paramc.cHr, Integer.valueOf(paramc.field_toltalLength), Integer.valueOf(paramc.field_finishedLength) });
    if ((paramInt == -21006) || (paramInt == -21005))
    {
      this.pJF.ceG();
      AppMethodBeat.o(135670);
    }
    com.tencent.mm.plugin.record.a.i locali;
    while (true)
    {
      return 0;
      locali = ((a)g.M(a.class)).getRecordMsgCDNStorage().VH(paramString);
      if (locali != null)
        break;
      ab.w("MicroMsg.RecordMsgCDNService", "onCdnCallback info null, mediaId[%s]", new Object[] { paramString });
      this.pJF.ceG();
      AppMethodBeat.o(135670);
    }
    if (paramInt != 0)
    {
      ab.w("MicroMsg.RecordMsgCDNService", "[record] tran fail, startRet[%d], mediaId[%s], type[%d]", new Object[] { Integer.valueOf(paramInt), paramString, Integer.valueOf(locali.field_type) });
      if (-5103059 == paramInt)
      {
        locali.field_status = 4;
        label202: locali.field_errCode = paramInt;
        ((a)g.M(a.class)).getRecordMsgCDNStorage().b(locali, new String[] { "localId" });
      }
    }
    while (true)
    {
      this.pJF.ceG();
      label323: 
      do
        while (true)
        {
          AppMethodBeat.o(135670);
          break;
          locali.field_status = 3;
          break label202;
          if (paramc == null)
            break label323;
          locali.field_offset = paramc.field_finishedLength;
          locali.field_totalLen = paramc.field_toltalLength;
          locali.field_status = 1;
          ((a)g.M(a.class)).getRecordMsgCDNStorage().b(locali, new String[] { "localId" });
        }
      while (paramd == null);
      int i = paramd.field_retCode;
      paramInt = paramd.field_UploadHitCacheType;
      boolean bool1 = paramd.field_exist_whencheck;
      String str = bo.anv(paramd.field_aesKey);
      paramc = paramd.field_filemd5;
      boolean bool2;
      if (1 == locali.field_type)
      {
        bool2 = true;
        label376: ab.i("MicroMsg.RecordMsgCDNService", "[record] summersafecdn cdnCallback upload attach by cdn, retCode:%d isHitCacheUpload: %d, onlyCheckExist[%b], exist[%b], aesKey[%s], md5[%s], mediaId:%s, isDownload:%b", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean), Boolean.valueOf(bool1), str, paramc, paramString, Boolean.valueOf(bool2) });
        if (paramd.field_retCode < 0)
          break label864;
        locali.field_status = 2;
        if (1 != locali.field_type)
          break label619;
        paramString = locali.field_path + ".temp";
        paramd = locali.field_path;
        if ((!bo.isNullOrNil(paramString)) && (!bo.isNullOrNil(paramd)))
          break label557;
        ab.w("MicroMsg.RecordMsgCDNService", "do rename and copy file, but path error");
      }
      while (true)
      {
        ((a)g.M(a.class)).getRecordMsgCDNStorage().a(locali, new String[] { "localId" });
        break;
        bool2 = false;
        break label376;
        label557: paramc = new File(paramString);
        paramd = new File(paramd);
        if (paramc.exists())
          ab.v("MicroMsg.RecordMsgCDNService", "rename file suc:%b, old:%s, new:%s", new Object[] { Boolean.valueOf(paramc.renameTo(paramd)), paramString, paramd });
      }
      label619: ab.i("MicroMsg.RecordMsgCDNService", "transfer done, mediaid=%s, md5=%s", new Object[] { paramd.cHr, paramString });
      ab.d("MicroMsg.RecordMsgCDNService", "transfer done, completeInfo=%s", new Object[] { paramd });
      ab.d("MicroMsg.RecordMsgCDNService", "summersafecdn cdnCallback upload field_aesKey[%s], field_fileId[%s]", new Object[] { paramd.field_aesKey, paramd.field_fileId });
      if (paramd.Jm())
      {
        ab.i("MicroMsg.RecordMsgCDNService", "summersafecdn isUploadBySafeCDNWithMD5 field_upload_by_safecdn[%b], field_UploadHitCacheType[%d], crc[%d], aeskey[%s], newmd5[%s]", new Object[] { Boolean.valueOf(paramd.field_upload_by_safecdn), Integer.valueOf(paramd.field_UploadHitCacheType), Integer.valueOf(paramd.field_filecrc), paramd.field_aesKey, paramd.field_mp4identifymd5 });
        g.RO().eJo.a(new d(paramd.field_fileId, paramd.field_filemd5, paramd.field_mp4identifymd5, paramd.field_filecrc, new i.1.1(this, locali, paramd)), 0);
        AppMethodBeat.o(135670);
        break;
      }
      locali.field_cdnKey = paramd.field_aesKey;
      locali.field_cdnUrl = paramd.field_fileId;
      ((a)g.M(a.class)).getRecordMsgCDNStorage().b(locali, new String[] { "localId" });
    }
    label864: ab.e("MicroMsg.RecordMsgCDNService", "transfer error, mediaid=%s, retCode:%d", new Object[] { paramd.cHr, Integer.valueOf(paramd.field_retCode) });
    if (-5103059 == paramd.field_retCode);
    for (locali.field_status = 4; ; locali.field_status = 3)
    {
      locali.field_errCode = paramd.field_retCode;
      ((a)g.M(a.class)).getRecordMsgCDNStorage().b(locali, new String[] { "localId" });
      break;
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.i.1
 * JD-Core Version:    0.6.2
 */