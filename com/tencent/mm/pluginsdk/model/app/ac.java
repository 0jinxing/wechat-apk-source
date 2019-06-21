package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.s.a;
import com.tencent.mm.protocal.protobuf.aej;
import com.tencent.mm.protocal.protobuf.aek;
import com.tencent.mm.protocal.protobuf.ez;
import com.tencent.mm.protocal.protobuf.fa;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ac extends x
{
  List<String> vcs;

  public ac(List<String> paramList)
  {
    AppMethodBeat.i(79377);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aej();
    ((b.a)localObject).fsK = new aek();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getappsetting";
    ((b.a)localObject).fsI = 395;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    this.vcs = paramList;
    ab.d("MicroMsg.NetSceneGetAppSetting", "<init>, appIdList size = " + paramList.size());
    localObject = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str != null) && (str.length() > 0))
      {
        paramList = new fa();
        paramList.mZr = str;
        ((LinkedList)localObject).add(paramList);
      }
    }
    if (((LinkedList)localObject).size() == 0)
      ab.e("MicroMsg.NetSceneGetAppSetting", "doScene fail, reqList is empty");
    paramList = (aej)this.lty.fsG.fsP;
    paramList.wmn = ((LinkedList)localObject);
    paramList.wmm = ((LinkedList)localObject).size();
    AppMethodBeat.o(79377);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79378);
    ab.d("MicroMsg.NetSceneGetAppSetting", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, errType = " + paramInt2 + ", errCode = " + paramInt3);
      AppMethodBeat.o(79378);
    }
    while (true)
    {
      return;
      paramString = (aek)this.lty.fsH.fsP;
      ab.d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, resp appCount = " + paramString.wmm);
      paramq = paramString.wmo;
      if ((paramq == null) || (paramq.size() == 0))
      {
        ab.e("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, settingList is empty");
        AppMethodBeat.o(79378);
      }
      else
      {
        paramString = a.bYJ();
        Iterator localIterator = paramq.iterator();
        while (localIterator.hasNext())
        {
          paramq = (ez)localIterator.next();
          paramArrayOfByte = g.bT(paramq.mZr, false);
          if (paramArrayOfByte != null)
          {
            paramArrayOfByte.field_authFlag = paramq.vGY;
            paramArrayOfByte.field_openId = paramq.nbm;
            boolean bool = paramString.a(paramArrayOfByte, new String[0]);
            ab.d("MicroMsg.NetSceneGetAppSetting", "onGYNetEnd, update ret = " + bool + ", appId = " + paramq.mZr);
          }
        }
        AppMethodBeat.o(79378);
      }
    }
  }

  public final void bG(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(79380);
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.NetSceneGetAppSetting", "buf is null");
      AppMethodBeat.o(79380);
    }
    while (true)
    {
      return;
      try
      {
        this.lty.fsH.P(paramArrayOfByte);
        AppMethodBeat.o(79380);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.NetSceneGetAppSetting", "bufToResp error: " + paramArrayOfByte.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(79380);
      }
    }
  }

  public final byte[] dhj()
  {
    AppMethodBeat.i(79379);
    try
    {
      byte[] arrayOfByte = ((b.b)this.lty.acF()).ZT();
      AppMethodBeat.o(79379);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneGetAppSetting", "toProtBuf error: " + localException.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneGetAppSetting", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(79379);
      }
    }
  }

  public final int getType()
  {
    return 1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ac
 * JD-Core Version:    0.6.2
 */