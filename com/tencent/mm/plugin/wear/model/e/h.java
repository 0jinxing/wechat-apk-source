package com.tencent.mm.plugin.wear.model.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wear.model.d;
import com.tencent.mm.protocal.protobuf.ctu;
import com.tencent.mm.protocal.protobuf.ctv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class h extends a
{
  public final List<Integer> cUA()
  {
    AppMethodBeat.i(26401);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11000));
    localArrayList.add(Integer.valueOf(11003));
    localArrayList.add(Integer.valueOf(11035));
    AppMethodBeat.o(26401);
    return localArrayList;
  }

  public final boolean cUB()
  {
    return false;
  }

  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    int i = 0;
    AppMethodBeat.i(26402);
    String str1;
    if (paramInt == 11000)
    {
      str1 = new String(paramArrayOfByte);
      paramArrayOfByte = "";
      try
      {
        Object localObject = e.cy(str1);
        paramArrayOfByte = (byte[])localObject;
        paramArrayOfByte = paramArrayOfByte.split("​​");
        localObject = new ArrayList();
        for (paramInt = 0; paramInt < paramArrayOfByte.length; paramInt++)
        {
          ((List)localObject).add(paramArrayOfByte[paramInt]);
          if (paramInt % 50 == 9)
          {
            com.tencent.mm.plugin.report.service.h.pYm.q("WearCrash", (List)localObject);
            ((List)localObject).clear();
          }
        }
      }
      catch (IOException localIOException1)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.Wear.HttpLogServer", localIOException1, "handleData", new Object[0]);
        if (localIOException1.size() > 0)
        {
          com.tencent.mm.plugin.report.service.h.pYm.q("WearCrash", localIOException1);
          localIOException1.clear();
        }
        e.deleteFile(str1);
      }
    }
    while (true)
    {
      AppMethodBeat.o(26402);
      return null;
      if (paramInt == 11003)
      {
        str1 = new String(paramArrayOfByte);
        paramArrayOfByte = "";
        try
        {
          String str2 = e.cy(str1);
          paramArrayOfByte = str2;
          paramArrayOfByte = paramArrayOfByte.split("​​");
          int j = paramArrayOfByte.length;
          for (paramInt = i; paramInt < j; paramInt++)
            ab.i("MicroMsg.Wear.LOG", paramArrayOfByte[paramInt]);
        }
        catch (IOException localIOException2)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.Wear.HttpLogServer", localIOException2, "handleData", new Object[0]);
          e.deleteFile(str1);
        }
        continue;
      }
      if (paramInt != 11035)
        continue;
      ctu localctu = new ctu();
      try
      {
        localctu.parseFrom(paramArrayOfByte);
        label277: paramArrayOfByte = com.tencent.mm.plugin.wear.model.a.cUn().tXt.tXK.tYz;
        if (paramArrayOfByte == null)
          continue;
        ab.v("MicroMsg.Wear.HttpLogServer", "report kv id=%d %s %s %s %s data=%s", new Object[] { Integer.valueOf(localctu.ndE), paramArrayOfByte.jBG, paramArrayOfByte.xqs, Integer.valueOf(paramArrayOfByte.vFE), paramArrayOfByte.xqt, localctu.xmI });
        com.tencent.mm.plugin.report.service.h.pYm.e(localctu.ndE, new Object[] { paramArrayOfByte.jBG, paramArrayOfByte.xqs, Integer.valueOf(paramArrayOfByte.vFE), paramArrayOfByte.xqt, localctu.xmI });
      }
      catch (IOException paramArrayOfByte)
      {
        break label277;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.e.h
 * JD-Core Version:    0.6.2
 */