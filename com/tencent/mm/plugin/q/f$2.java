package com.tencent.mm.plugin.q;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.g.a;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.as;
import com.tencent.mm.model.aw;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;

final class f$2
  implements g.a
{
  f$2(f paramf, d paramd, as paramas)
  {
  }

  public final int a(String paramString, int paramInt, com.tencent.mm.i.c paramc, com.tencent.mm.i.d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(22904);
    ab.d("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdnCallback clientid:%s, startRet:%d proginfo:[%s], res:[%s]", new Object[] { paramString, Integer.valueOf(paramInt), paramc, paramd });
    if (paramInt == -21005)
    {
      ab.d("MicroMsg.MsgSynchronizeServer", "msgSynchronize  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", new Object[] { paramString });
      paramInt = 0;
      AppMethodBeat.o(22904);
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 0)
        break;
      ab.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback startRet failed. clientid:%s, startRet:%d", new Object[] { paramString, Integer.valueOf(paramInt) });
      this.oFL.cancel();
      f.RT(this.oFr.action);
      b.a(0L, 0L, 0L, 0L, 1, this.oFL.cFu, this.oFr.action);
      paramInt = 0;
      AppMethodBeat.o(22904);
    }
    if (paramd != null)
    {
      if (paramd.field_retCode == 0)
        break label258;
      ab.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback failed. sceneResult.retCode[%d], arg[%s], info[%s], clientid[%s], filemd5[%s]", new Object[] { Integer.valueOf(paramd.field_retCode), paramd.field_arg, paramd.field_transInfo, paramString, paramd.field_filemd5 });
      f.RT(this.oFr.action);
      this.oFL.cancel();
      b.a(0L, 0L, 0L, 0L, 1, this.oFL.cFu, this.oFr.action);
    }
    while (true)
    {
      paramInt = 0;
      AppMethodBeat.o(22904);
      break;
      label258: ab.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback success. clientid[%s], filemd5[%s], isHitCacheUpload[%d]", new Object[] { paramString, paramd.field_filemd5, Integer.valueOf(paramd.field_UploadHitCacheType) });
      paramString = new PByteArray();
      if (!MMProtocalJni.rsaPublicEncryptPemkey(paramd.field_aesKey.getBytes(), paramString, this.oFr.oFu))
      {
        ab.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize MMProtocalJni rsaPublicEncryptPemkey failed!");
        paramInt = -1;
        AppMethodBeat.o(22904);
        break;
      }
      paramc = bo.cd(paramString.value);
      d locald = this.oFr;
      paramString = paramd.field_fileId;
      paramInt = paramd.field_fileLength;
      locald.oFA = new String(paramString);
      locald.oFB = new String(paramc);
      locald.oFC = paramInt;
      if (a.jP(g.RN().eIV))
      {
        ab.i("MicroMsg.MsgSynchronizeServer", "sendAppMsg immediately.");
        this.oFL.a(this.oFr, false);
      }
      else
      {
        ab.i("MicroMsg.MsgSynchronizeServer", "wait getOnlineInfoExtDeviceOnlineListener to sendAppMsg.");
        aw.ZK();
        com.tencent.mm.model.c.a(this.oFM);
        this.oFL.oFJ = true;
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.q.f.2
 * JD-Core Version:    0.6.2
 */