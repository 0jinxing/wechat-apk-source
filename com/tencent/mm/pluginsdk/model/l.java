package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.pluginsdk.model.app.x;
import com.tencent.mm.protocal.protobuf.apo;
import com.tencent.mm.protocal.protobuf.app;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class l extends x
{
  public String hzi;

  public l(String paramString, LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(27300);
    ab.i("MicroMsg.NetSceneGetUserInfoInApp", "appID: %s", new Object[] { paramString });
    this.hzi = paramString;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new apo();
    ((b.a)localObject).fsK = new app();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getuserinfoinapp";
    ((b.a)localObject).fsI = 452;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.lty = ((b.a)localObject).acD();
    localObject = (apo)this.lty.fsG.fsP;
    ((apo)localObject).mZr = paramString;
    paramString = new LinkedList();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!bo.isNullOrNil(str))
        paramString.add(aa.vy(str));
    }
    ((apo)localObject).vEg = paramString;
    ((apo)localObject).wnW = paramLinkedList.size();
    AppMethodBeat.o(27300);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27301);
    ab.i("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      ab.e("MicroMsg.NetSceneGetUserInfoInApp", "errType = " + paramInt2 + ", errCode = " + paramInt3);
      AppMethodBeat.o(27301);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(27301);
    }
  }

  public final void bG(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27303);
    if (paramArrayOfByte == null)
    {
      ab.e("MicroMsg.NetSceneGetUserInfoInApp", "buf is null");
      AppMethodBeat.o(27303);
    }
    while (true)
    {
      return;
      b.c localc = this.lty.fsH;
      try
      {
        localc.P(paramArrayOfByte);
        AppMethodBeat.o(27303);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.e("MicroMsg.NetSceneGetUserInfoInApp", paramArrayOfByte.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", paramArrayOfByte, "", new Object[0]);
        AppMethodBeat.o(27303);
      }
    }
  }

  public final byte[] dhj()
  {
    AppMethodBeat.i(27302);
    try
    {
      byte[] arrayOfByte = ((b.b)this.lty.acF()).ZT();
      AppMethodBeat.o(27302);
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneGetUserInfoInApp", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.NetSceneGetUserInfoInApp", localException, "", new Object[0]);
        Object localObject = null;
        AppMethodBeat.o(27302);
      }
    }
  }

  public final app dhk()
  {
    if (this.lty == null);
    for (app localapp = null; ; localapp = (app)this.lty.fsH.fsP)
      return localapp;
  }

  public final int getType()
  {
    return 14;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.l
 * JD-Core Version:    0.6.2
 */