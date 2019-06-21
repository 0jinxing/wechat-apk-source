package com.tencent.mm.am;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.ai;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ax;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.bi.d;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class g extends ai
{
  public final String getTag()
  {
    return "MicroMsg.FMessageDataTransfer";
  }

  public final boolean kw(int paramInt)
  {
    if ((paramInt != 0) && (paramInt < 604307701));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void transfer(int paramInt)
  {
    AppMethodBeat.i(16435);
    bi[] arrayOfbi;
    if ((paramInt != 0) && (paramInt < 604307701))
    {
      com.tencent.mm.plugin.report.service.h.pYm.k(336L, 11L, 1L);
      com.tencent.mm.model.aw.ZK();
      arrayOfbi = c.XO().cC("fmessage", 20);
      if (arrayOfbi == null)
      {
        ab.e("MicroMsg.FMessageDataTransfer", "transfer fail, msglist is empty");
        AppMethodBeat.o(16435);
      }
    }
    while (true)
    {
      return;
      d.akP();
      ab.d("MicroMsg.FMessageDataTransfer", "transfer, msgList count = " + arrayOfbi.length);
      int i = arrayOfbi.length;
      paramInt = 0;
      if (paramInt < i)
      {
        localObject1 = arrayOfbi[paramInt];
        if ((localObject1 == null) || (((cy)localObject1).field_msgId == 0L))
          ab.e("MicroMsg.FMessageDataTransfer", "transfer fail, msg is null, skip this msg");
        Object localObject2;
        while (true)
        {
          paramInt++;
          break;
          ab.d("MicroMsg.FMessageDataTransfer", "transfer msg type = " + ((bi)localObject1).getType());
          localObject2 = ((cy)localObject1).field_content;
          if ((localObject2 == null) || (((String)localObject2).length() == 0))
            ab.e("MicroMsg.FMessageDataTransfer", "transfer fail, content is null, skip this msg, id = " + ((cy)localObject1).field_msgId);
          else
            switch (((bi)localObject1).getType())
            {
            case 38:
            case 39:
            default:
              ab.i("MicroMsg.FMessageDataTransfer", "no need to transfer, msgtype = " + ((bi)localObject1).getType());
              break;
            case 40:
              ab.d("MicroMsg.FMessageDataTransfer", "processFMessage, msg content = " + ((cy)localObject1).field_content);
              localObject3 = bi.a.apC(((cy)localObject1).field_content);
              localObject2 = new ax();
              ((ax)localObject2).field_createTime = ((cy)localObject1).field_createTime;
              ((ax)localObject2).field_isSend = 0;
              ((ax)localObject2).field_msgContent = ((cy)localObject1).field_content;
              ((ax)localObject2).field_svrId = ((cy)localObject1).field_msgSvrId;
              ((ax)localObject2).field_talker = ((bi.a)localObject3).svN;
              ((ax)localObject2).field_type = 0;
              d.akO().b((ax)localObject2);
              break;
            case 37:
              ab.d("MicroMsg.FMessageDataTransfer", "processVerifyMsg, msg content = " + ((cy)localObject1).field_content);
              localObject2 = bi.d.apF(((cy)localObject1).field_content);
              if ((ah.isNullOrNil(((bi.d)localObject2).svN)) || ((((bi.d)localObject2).scene != 18) && (!bf.kE(((bi.d)localObject2).scene))))
                break label471;
              ab.i("MicroMsg.FMessageDataTransfer", "processVerifyMsg, skip lbs & shake, scene = " + ((bi.d)localObject2).scene);
            }
        }
        label471: Object localObject3 = new ax();
        ((ax)localObject3).field_createTime = ((cy)localObject1).field_createTime;
        ((ax)localObject3).field_isSend = 0;
        ((ax)localObject3).field_msgContent = ((cy)localObject1).field_content;
        ((ax)localObject3).field_svrId = ((cy)localObject1).field_msgSvrId;
        ((ax)localObject3).field_talker = ((bi.d)localObject2).svN;
        switch (((bi.d)localObject2).cAd)
        {
        case 3:
        case 4:
        default:
          ((ax)localObject3).field_type = 1;
        case 2:
        case 5:
        case 6:
        }
        while (true)
        {
          d.akO().b((ax)localObject3);
          break;
          ((ax)localObject3).field_type = 1;
          continue;
          ((ax)localObject3).field_type = 2;
          continue;
          ((ax)localObject3).field_type = 3;
        }
      }
      com.tencent.mm.model.aw.ZK();
      c.Ry().set(143618, Integer.valueOf(0));
      d.akP().dtc();
      ab.d("MicroMsg.FMessageDataTransfer", "transfer, try to delete fmessage contact & conversation");
      com.tencent.mm.model.aw.ZK();
      c.XM().aoU("fmessage");
      Object localObject1 = new LinkedList();
      ((LinkedList)localObject1).add("fmessage");
      com.tencent.mm.model.aw.ZK();
      c.XR().aF((LinkedList)localObject1);
      AppMethodBeat.o(16435);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.g
 * JD-Core Version:    0.6.2
 */