package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.axg;
import com.tencent.mm.protocal.protobuf.cfz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class aa
{
  private static Map<Integer, Long> bO(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58880);
    if (bo.cb(paramArrayOfByte))
    {
      AppMethodBeat.o(58880);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      cfz localcfz;
      try
      {
        localcfz = new com/tencent/mm/protocal/protobuf/cfz;
        localcfz.<init>();
        localcfz = (cfz)localcfz.parseFrom(paramArrayOfByte);
        if (localcfz != null)
          break label63;
        AppMethodBeat.o(58880);
        paramArrayOfByte = null;
      }
      catch (Exception paramArrayOfByte)
      {
        AppMethodBeat.o(58880);
        paramArrayOfByte = null;
      }
      continue;
      label63: ab.d("MicroMsg.SyncKeyUtil", "dkpush : keyCount:" + localcfz.wYL);
      LinkedList localLinkedList = localcfz.wYM;
      if (localLinkedList.size() != localcfz.wYL)
      {
        AppMethodBeat.o(58880);
        paramArrayOfByte = null;
      }
      else
      {
        paramArrayOfByte = new HashMap();
        for (int i = 0; i < localcfz.wYL; i++)
          paramArrayOfByte.put(Integer.valueOf(((axg)localLinkedList.get(i)).pXC), Long.valueOf(0xFFFFFFFF & ((axg)localLinkedList.get(i)).wBo));
        if (paramArrayOfByte.size() != localcfz.wYL)
        {
          AppMethodBeat.o(58880);
          paramArrayOfByte = null;
        }
        else
        {
          AppMethodBeat.o(58880);
        }
      }
    }
  }

  public static String bP(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58881);
    if (bo.cb(paramArrayOfByte))
    {
      paramArrayOfByte = "";
      AppMethodBeat.o(58881);
    }
    while (true)
    {
      return paramArrayOfByte;
      Map localMap = bO(paramArrayOfByte);
      if ((localMap == null) || (localMap.size() <= 0))
      {
        paramArrayOfByte = "";
        AppMethodBeat.o(58881);
      }
      else
      {
        paramArrayOfByte = new StringBuffer();
        paramArrayOfByte.append(" MsgKey:" + localMap.get(Integer.valueOf(2)));
        paramArrayOfByte.append(" profile:" + localMap.get(Integer.valueOf(1)));
        paramArrayOfByte.append(" contact:" + localMap.get(Integer.valueOf(3)));
        paramArrayOfByte.append(" chatroom:" + localMap.get(Integer.valueOf(11)));
        paramArrayOfByte.append(" Bottle:" + localMap.get(Integer.valueOf(7)));
        paramArrayOfByte.append(" QContact:" + localMap.get(Integer.valueOf(5)));
        paramArrayOfByte = paramArrayOfByte.toString();
        AppMethodBeat.o(58881);
      }
    }
  }

  public static byte[] j(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(58879);
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte1.length <= 0))
    {
      ab.d("MicroMsg.SyncKeyUtil", "empty old key, use new key");
      AppMethodBeat.o(58879);
    }
    while (true)
    {
      return paramArrayOfByte2;
      if ((paramArrayOfByte2 == null) || (paramArrayOfByte2.length <= 0))
      {
        ab.e("MicroMsg.SyncKeyUtil", "newKey is null");
        AppMethodBeat.o(58879);
        paramArrayOfByte2 = null;
      }
      else
      {
        PByteArray localPByteArray = new PByteArray();
        try
        {
          if (!MMProtocalJni.mergeSyncKey(paramArrayOfByte1, paramArrayOfByte2, localPByteArray))
          {
            ab.e("MicroMsg.SyncKeyUtil", "merge key failed");
            AppMethodBeat.o(58879);
            paramArrayOfByte2 = null;
          }
        }
        catch (IncompatibleClassChangeError paramArrayOfByte1)
        {
          ab.printErrStackTrace("MicroMsg.Crash", paramArrayOfByte1, "NoSuchMethod MMProtocalJni.mergeSyncKey", new Object[0]);
          paramArrayOfByte1 = (IncompatibleClassChangeError)new IncompatibleClassChangeError("NoSuchMethod MMProtocalJni.mergeSyncKey").initCause(paramArrayOfByte1);
          AppMethodBeat.o(58879);
          throw paramArrayOfByte1;
        }
        paramArrayOfByte2 = localPByteArray.value;
        AppMethodBeat.o(58879);
      }
    }
  }

  public static boolean k(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    AppMethodBeat.i(58882);
    paramArrayOfByte1 = bO(paramArrayOfByte1);
    boolean bool;
    if (paramArrayOfByte1 == null)
    {
      ab.d("MicroMsg.SyncKeyUtil", "dkpush local sync key failed");
      AppMethodBeat.o(58882);
      bool = true;
    }
    while (true)
    {
      return bool;
      Map localMap = bO(paramArrayOfByte2);
      if (localMap == null)
      {
        ab.e("MicroMsg.SyncKeyUtil", "dkpush svr sync key failed");
        AppMethodBeat.o(58882);
        bool = false;
      }
      else
      {
        paramArrayOfByte2 = localMap.keySet().iterator();
        while (true)
          if (paramArrayOfByte2.hasNext())
          {
            Integer localInteger = (Integer)paramArrayOfByte2.next();
            Long localLong1 = (Long)paramArrayOfByte1.get(localInteger);
            Long localLong2 = (Long)localMap.get(localInteger);
            if (localLong1 == null)
            {
              ab.d("MicroMsg.SyncKeyUtil", "dkpush local key null :".concat(String.valueOf(localInteger)));
              AppMethodBeat.o(58882);
              bool = true;
              break;
            }
            ab.d("MicroMsg.SyncKeyUtil", "dkpush local key:" + localInteger + " sv:" + localLong2 + " lv:" + localLong1);
            if (localLong2.longValue() > localLong1.longValue())
            {
              AppMethodBeat.o(58882);
              bool = true;
              break;
            }
          }
        ab.d("MicroMsg.SyncKeyUtil", "dkpush two sync key is the same");
        AppMethodBeat.o(58882);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.aa
 * JD-Core Version:    0.6.2
 */