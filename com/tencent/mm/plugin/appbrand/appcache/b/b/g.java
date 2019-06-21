package com.tencent.mm.plugin.appbrand.appcache.b.b;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.plugin.appbrand.app.f;
import com.tencent.mm.plugin.appbrand.appcache.b.e.e;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.protocal.protobuf.cxp;
import com.tencent.mm.protocal.protobuf.cxw;
import com.tencent.mm.protocal.protobuf.rg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class g extends a<Boolean, cxw>
{
  private static Boolean a(String paramString1, String paramString2, cxw paramcxw)
  {
    AppMethodBeat.i(129474);
    Object localObject = paramcxw.xto;
    if (bo.isNullOrNil((String)localObject))
    {
      ab.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty base64", new Object[] { paramString1, paramString2 });
      paramString1 = Boolean.FALSE;
      AppMethodBeat.o(129474);
    }
    while (true)
    {
      return paramString1;
      if (!bo.ek(paramcxw.xkP))
        break;
      ab.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], empty sceneList", new Object[] { paramString1, paramString2 });
      paramString1 = Boolean.FALSE;
      AppMethodBeat.o(129474);
    }
    while (true)
    {
      StringBuilder localStringBuilder;
      try
      {
        byte[] arrayOfByte = Base64.decode((String)localObject, 0);
        localObject = new com/tencent/mm/protocal/protobuf/axr;
        ((axr)localObject).<init>();
        ((axr)localObject).parseFrom(arrayOfByte);
        if (((axr)localObject).wBJ.vYw.wR.length == 0)
        {
          ab.e("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s | %s], parse pb, invalid foreground control bytes", new Object[] { paramString1, paramString2 });
          localObject = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramcxw.xsZ.xsX, 105L);
          paramcxw = Boolean.FALSE;
          AppMethodBeat.o(129474);
          paramString1 = paramcxw;
          break;
        }
        localObject = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
        com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(paramcxw.xsZ.xsX, 104L);
        LinkedList localLinkedList = paramcxw.xkP;
        long l1 = paramcxw.xtp & 0xFFFFFFFF;
        long l2 = paramcxw.xtq & 0xFFFFFFFF;
        if (localLinkedList == null)
        {
          localObject = "null";
          ab.i("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", "call[%s| %s] WriteToStorage, sceneList %s, time[%d, %d]", new Object[] { paramString1, paramString2, localObject, Long.valueOf(l1), Long.valueOf(l2) });
          boolean bool = ((e)f.E(e.class)).a(arrayOfByte, paramString2, localLinkedList, l1, l2);
          localObject = com.tencent.mm.plugin.appbrand.appcache.b.c.a.gWl;
          int i = paramcxw.xsZ.xsX;
          if (!bool)
            break label451;
          j = 107;
          com.tencent.mm.plugin.appbrand.appcache.b.c.a.z(i, j);
          paramString1 = Boolean.valueOf(bool);
          AppMethodBeat.o(129474);
          break;
        }
        if (bo.ek(localLinkedList))
        {
          localObject = "{}";
          continue;
        }
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("{");
        localObject = localLinkedList.iterator();
        if (!((Iterator)localObject).hasNext())
          break label434;
        localStringBuilder.append(((Iterator)localObject).next().toString()).append(',');
        continue;
      }
      catch (Exception paramcxw)
      {
        ab.printErrStackTrace("MicroMsg.AppBrand.Predownload.CmdIssueLaunch", paramcxw, "call[%s | %s], decode base64", new Object[] { paramString1, paramString2 });
        paramString1 = Boolean.FALSE;
        AppMethodBeat.o(129474);
      }
      break;
      label434: localStringBuilder.append("}");
      localObject = localStringBuilder.toString();
      continue;
      label451: int j = 108;
    }
  }

  final String awu()
  {
    return "CmdIssueLaunch";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.b.b.g
 * JD-Core Version:    0.6.2
 */