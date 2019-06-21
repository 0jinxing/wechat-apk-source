package com.tencent.mm.plugin.exdevice.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.protocal.protobuf.atq;
import com.tencent.mm.protocal.protobuf.atr;
import com.tencent.mm.protocal.protobuf.ats;
import com.tencent.mm.protocal.protobuf.atw;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

final class g$2
  implements g.a
{
  g$2(g paramg)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(19250);
    ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] sentToCloud:[%s]", new Object[] { this.lsY.fFa, Integer.valueOf(paramInt), paramc, paramd, Boolean.valueOf(this.lsY.lsE) });
    if (paramc != null);
    label581: 
    while (true)
    {
      try
      {
        paramInt = (int)(paramc.field_finishedLength / paramc.field_toltalLength * 100.0F);
        ab.d("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "sent to cloud progress %d", new Object[] { Integer.valueOf(paramInt) });
        if (paramInt < 100)
          break label581;
        paramInt = 99;
        paramString = this.lsY.lsG.keySet().iterator();
        if (paramString.hasNext())
        {
          paramc = (String)paramString.next();
          g.a(this.lsY, paramc, paramInt);
          continue;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "cdnCallback Exception %s", new Object[] { paramString });
        AppMethodBeat.o(19250);
      }
      while (true)
      {
        return 0;
        if ((paramd != null) && (this.lsY.lsE))
        {
          paramString = new com/tencent/mm/protocal/protobuf/atr;
          paramString.<init>();
          this.lsY.a(paramString, this.lsY.edW);
          this.lsY.lsE = false;
          Object localObject;
          if ((g.hJ(this.lsY.edW).booleanValue()) || (g.hK(this.lsY.edW).booleanValue()))
          {
            paramString.wxK.vRw = paramd.field_aesKey;
            localObject = paramString.wxK;
            paramc = new java/lang/StringBuilder;
            paramc.<init>();
            ((ats)localObject).wxO = this.lsY.lsI;
            paramString.wxK.vRA = paramd.field_fileId;
            paramString.wxK.Url = paramd.field_fileUrl;
            ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "image_msg.url:[%s]", new Object[] { paramString.wxK.Url });
          }
          while (true)
          {
            this.lsY.lsH = paramString;
            Iterator localIterator = this.lsY.lsG.keySet().iterator();
            while (localIterator.hasNext())
            {
              localObject = (String)localIterator.next();
              paramc = (String)this.lsY.lsG.get(localObject);
              paramd = new com/tencent/mm/plugin/exdevice/model/n;
              paramd.<init>(paramString, paramc, (String)localObject, 1);
              aw.Rg().a(paramd, 0);
            }
            if (g.hI(this.lsY.edW).booleanValue())
            {
              paramString.wxL.vRw = paramd.field_aesKey;
              paramString.wxL.vRA = paramd.field_fileId;
              paramString.wxL.Url = paramd.field_fileUrl;
              ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "file_msg.url:[%s]", new Object[] { paramString.wxL.Url });
            }
            else if (g.hL(this.lsY.edW).booleanValue())
            {
              paramString.wxN.Url = paramd.field_fileUrl;
              ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "video_msg.url:[%s]", new Object[] { paramString.wxN.Url });
            }
          }
          this.lsY.lsG.clear();
        }
        AppMethodBeat.o(19250);
      }
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    AppMethodBeat.i(19251);
    ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "getCdnAuthInfo mediaId = ".concat(String.valueOf(paramString)));
    AppMethodBeat.o(19251);
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19252);
    ab.i("MicroMsg.exdevice.ExdeviceSendDataToNetworkDevice", "decodePrepareResponse ");
    AppMethodBeat.o(19252);
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.g.2
 * JD-Core Version:    0.6.2
 */