package com.tencent.mm.plugin.appbrand.jsapi.share;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.a;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.g.b.a.cs;
import com.tencent.mm.g.b.a.cs.a;
import com.tencent.mm.g.b.a.cs.b;
import com.tencent.mm.g.b.a.cs.c;
import com.tencent.mm.g.b.a.cs.d;
import com.tencent.mm.g.b.a.cs.e;
import com.tencent.mm.protocal.protobuf.bzj;
import com.tencent.mm.protocal.protobuf.cwm;
import com.tencent.mm.protocal.protobuf.cwu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

final class SendAppMessageTask$1
  implements w.a
{
  SendAppMessageTask$1(SendAppMessageTask paramSendAppMessageTask, LinkedList paramLinkedList, j.b paramb, int paramInt, byte[] paramArrayOfByte, StringBuilder paramStringBuilder)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, b paramb, m paramm)
  {
    AppMethodBeat.i(131460);
    ab.i("MicroMsg.SendAppMessageTask", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = (cwm)paramb.fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0) && (paramString != null) && (!bo.ek(paramString.xsh)))
    {
      paramb = paramString.xsh;
      this.hWZ.hWU = new ArrayList();
      paramInt1 = 0;
      if (paramInt1 < this.hWV.size())
      {
        if (paramInt1 < paramb.size())
        {
          paramString = (cwu)paramb.get(paramInt1);
          label120: this.hWW.fiV = paramString.wYs;
          this.hWZ.hWU.add(new ShareInfo(paramString.wYs, paramString.xsu));
          paramm = (a)this.hWW.X(a.class);
          paramm.ffb = paramString.xsf;
          if ((paramString.xsf) && (paramString.xsv != null))
          {
            paramm.ffc = paramString.xsv.content;
            paramm.ffd = paramString.xsv.wYm;
            paramm.ffe = paramString.xsv.wYn;
            paramm.fff = paramString.xsv.wYo;
            paramm.ffg = paramString.xsv.wYp;
            paramm.ffh = paramString.xsv.wYr;
            paramm.ffj = paramString.xsv.state;
            paramm.ffi = paramString.xsv.wYq;
            paramm = new cs().hE(this.hWZ.appId).hF(this.hWZ.path).hG(paramString.wYs).hH((String)this.hWV.get(paramInt1));
            if (!((String)this.hWV.get(paramInt1)).toLowerCase().endsWith("@chatroom"))
              break label496;
          }
        }
        label496: for (paramString = cs.c.dhV; ; paramString = cs.c.dhW)
        {
          paramm.dhB = paramString;
          paramm.dhC = cs.b.dhP;
          paramm.cVR = this.fwD;
          paramString = paramm.hI(this.hWZ.cst);
          paramString.dhG = cs.a.hp(this.hWZ.fmr + 1000);
          paramString = paramString.Hk();
          paramString.dhE = cs.d.dhZ;
          paramString.dhF = cs.e.did;
          paramString.ajK();
          SendAppMessageTask.a(this.hWZ, this.hWW, this.hWX, (String)this.hWV.get(paramInt1), this.hWY, this.fwD);
          paramInt1++;
          break;
          paramString = new cwu();
          break label120;
        }
      }
    }
    else
    {
      if (this.hWW.fiR == 3)
        this.hWW.fiR = 2;
      paramb = this.hWV.iterator();
      while (paramb.hasNext())
      {
        paramString = (String)paramb.next();
        SendAppMessageTask.a(this.hWZ, this.hWW, this.hWX, paramString, this.hWY, this.fwD);
      }
    }
    SendAppMessageTask.a(this.hWZ);
    AppMethodBeat.o(131460);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.share.SendAppMessageTask.1
 * JD-Core Version:    0.6.2
 */