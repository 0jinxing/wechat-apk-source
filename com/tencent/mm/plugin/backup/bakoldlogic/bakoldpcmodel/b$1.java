package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.net.DhcpInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class b$1
  implements Runnable
{
  b$1(b paramb, int paramInt, List paramList)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(17807);
    label38: Object localObject;
    int j;
    String str;
    int k;
    switch (this.bVv)
    {
    default:
      AppMethodBeat.o(17807);
    case 1:
      int i;
      label189: ua localua;
      int m;
      while (true)
      {
        return;
        localObject = (WifiManager)ah.getContext().getSystemService("wifi");
        i = ((WifiManager)localObject).getConnectionInfo().getIpAddress();
        localObject = ((WifiManager)localObject).getDhcpInfo();
        if (localObject == null)
        {
          AppMethodBeat.o(17807);
        }
        else
        {
          j = ((DhcpInfo)localObject).netmask;
          str = (i & 0xFF) + "." + (i >> 8 & 0xFF) + "." + (i >> 16 & 0xFF) + "." + (i >> 24 & 0xFF);
          ab.e("MicroMsg.BakOldJavaEngine", "localip:%s, mask:%d", new Object[] { str, Integer.valueOf(j) });
          localObject = null;
          k = 0;
          Iterator localIterator = this.jzh.iterator();
          String[] arrayOfString;
          do
          {
            do
            {
              if (!localIterator.hasNext())
                break;
              localua = (ua)localIterator.next();
              ab.i("MicroMsg.BakOldJavaEngine", "try ip:%s", new Object[] { localua.vYA });
            }
            while (localua.vYA == null);
            arrayOfString = localua.vYA.split("\\.");
          }
          while (arrayOfString.length < 4);
          m = o.A(new byte[] { (byte)(bo.getInt(arrayOfString[0], 0) & 0xFF), (byte)(bo.getInt(arrayOfString[1], 0) & 0xFF), (byte)(bo.getInt(arrayOfString[2], 0) & 0xFF), (byte)(bo.getInt(arrayOfString[3], 0) & 0xFF) });
          if ((j & m) != (j & i))
            break;
          b.a(this.jzi, localua.vYA, ((Integer)localua.wbp.getFirst()).intValue());
          AppMethodBeat.o(17807);
        }
      }
      if ((m & 0xFFFF) == (0xFFFF & i))
      {
        localObject = localua.vYA;
        k = ((Integer)localua.wbp.getFirst()).intValue();
      }
      break;
    case 0:
    }
    while (true)
    {
      break label189;
      if (localObject != null)
      {
        ab.w("MicroMsg.BakOldJavaEngine", "try to connect to secondary:%s, port:%d", new Object[] { localObject, Integer.valueOf(k) });
        b.a(this.jzi, (String)localObject, k);
        AppMethodBeat.o(17807);
        break label38;
      }
      b.a(this.jzi, 10009, String.format("not match ip mask:%d, localip:%s", new Object[] { Integer.valueOf(j), str }).getBytes());
      ab.e("MicroMsg.BakOldJavaEngine", "not match ip mask:%d, localip:%s", new Object[] { Integer.valueOf(j), str });
      AppMethodBeat.o(17807);
      break label38;
      b.a(this.jzi, ((Integer)((ua)this.jzh.get(0)).wbp.getFirst()).intValue());
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.b.1
 * JD-Core Version:    0.6.2
 */