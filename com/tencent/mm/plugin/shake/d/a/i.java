package com.tencent.mm.plugin.shake.d.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.e;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.shake.d.b.a;
import com.tencent.mm.protocal.protobuf.byq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.j;
import java.io.IOException;

public final class i
{
  public static String ckx()
  {
    String str = null;
    AppMethodBeat.i(24636);
    if (!aw.RK())
    {
      ab.w("MicroMsg.ShakeMusicLogic", "getSaveDirPath: acc stg has not set uin");
      AppMethodBeat.o(24636);
    }
    while (true)
    {
      return str;
      Object localObject = new StringBuilder();
      aw.ZK();
      localObject = new b(c.getAccPath() + "shakemusic/");
      if ((!((b)localObject).exists()) || (!((b)localObject).isDirectory()))
      {
        ab.w("MicroMsg.ShakeMusicLogic", "storage dir[%s] not perpare, try to create it", new Object[] { j.w(((b)localObject).dMD()) });
        ((b)localObject).mkdirs();
      }
      b localb = new b((b)localObject, ".nomedia");
      if (!localb.exists())
        ab.w("MicroMsg.ShakeMusicLogic", "no media file[%s] not exists, try to create it", new Object[] { j.w(((b)localObject).dMD()) });
      try
      {
        localb.createNewFile();
        if (!((b)localObject).exists())
        {
          ab.w("MicroMsg.ShakeMusicLogic", "create storage dir fail");
          AppMethodBeat.o(24636);
        }
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.ShakeMusicLogic", localIOException, "", new Object[0]);
        str = j.w(((b)localObject).dMD()) + "/";
        AppMethodBeat.o(24636);
      }
    }
  }

  public static e d(byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(24637);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      AppMethodBeat.o(24637);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        byq localbyq = new com/tencent/mm/protocal/protobuf/byq;
        localbyq.<init>();
        localbyq = (byq)localbyq.parseFrom(paramArrayOfByte);
        paramArrayOfByte = new com/tencent/mm/aw/e;
        paramArrayOfByte.<init>();
        paramArrayOfByte.fJS = 4;
        paramArrayOfByte.fJU = String.valueOf(localbyq.wXR);
        paramArrayOfByte.fJV = localbyq.fJV;
        paramArrayOfByte.fJY = aa.b(localbyq.wrD);
        paramArrayOfByte.fJZ = aa.b(localbyq.wrE);
        paramArrayOfByte.fKe = a.UK(paramArrayOfByte.fJZ);
        paramArrayOfByte.fJT = localbyq.fJT;
        paramArrayOfByte.fKd = aa.b(localbyq.wrC);
        paramArrayOfByte.fJW = aa.b(localbyq.wXS);
        paramArrayOfByte.fJX = aa.b(localbyq.wXT);
        paramArrayOfByte.fKc = aa.b(localbyq.wXW);
        paramArrayOfByte.fKa = aa.b(localbyq.wXU);
        paramArrayOfByte.fKb = aa.b(localbyq.wXV);
        paramArrayOfByte.fKn = paramLong;
        AppMethodBeat.o(24637);
      }
      catch (Exception paramArrayOfByte)
      {
        ab.printErrStackTrace("MicroMsg.ShakeMusicLogic", paramArrayOfByte, "", new Object[0]);
        ab.w("MicroMsg.ShakeMusicLogic", "get music wrapper bytes fail");
        AppMethodBeat.o(24637);
        paramArrayOfByte = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.a.i
 * JD-Core Version:    0.6.2
 */