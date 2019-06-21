package com.tencent.mm.plugin.backup.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.l.a;
import com.tencent.mm.protocal.l.d;
import com.tencent.mm.protocal.z;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class a$1
  implements l.a
{
  a$1(a parama, k.a parama1)
  {
  }

  public final boolean a(PByteArray paramPByteArray, int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2)
  {
    AppMethodBeat.i(17310);
    long l = this.jum.vyb;
    if ((b.dnO()) && (l == 0L))
      l = d.vxn;
    while (true)
    {
      z localz = this.jum.vyj;
      byte[] arrayOfByte1;
      boolean bool;
      if (paramInt1 == 1000)
      {
        arrayOfByte1 = this.jum.vyi;
        if (!localz.dmy())
          arrayOfByte1 = new byte[0];
        if (bo.cb(arrayOfByte1))
        {
          ab.e("MicroMsg.BackupCreateQRCodeOfflineScene", "dksession jType %d session should not null", new Object[] { Integer.valueOf(paramInt1) });
          bool = false;
          AppMethodBeat.o(17310);
        }
      }
      while (true)
      {
        return bool;
        byte[] arrayOfByte2 = this.jum.ZT();
        int i = 0;
        paramInt1 = i;
        if (!bo.cb(paramArrayOfByte2))
        {
          paramInt1 = i;
          if (!bo.cb(arrayOfByte2))
            paramInt1 = MMProtocalJni.genSignature((int)l, paramArrayOfByte2, arrayOfByte2);
        }
        if (MMProtocalJni.pack(arrayOfByte2, paramPByteArray, arrayOfByte1, 0, paramArrayOfByte1, this.jum.vye, (int)l, 1000, localz.ver, localz.vyO.getBytes(), localz.vyP.getBytes(), paramInt1, paramInt2, this.jum.fsO))
        {
          ab.d("MicroMsg.BackupCreateQRCodeOfflineScene", "reqToBuf using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramPByteArray.value.length), Integer.valueOf(paramInt2) });
          bool = true;
          AppMethodBeat.o(17310);
        }
        else
        {
          bool = false;
          AppMethodBeat.o(17310);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.e.a.1
 * JD-Core Version:    0.6.2
 */