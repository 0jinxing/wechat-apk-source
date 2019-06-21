package com.tencent.mm.plugin.downloader_app.b;

import android.content.pm.PackageInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.downloader.c.a.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public final class f
{
  public com.tencent.mm.plugin.downloader.c.a.a.b kOS;
  private Map<String, i> kOT;
  private LinkedList<i> kOU;
  public com.tencent.mm.plugin.downloader.c.a.a.f kOV;
  private String kOW;

  public f(com.tencent.mm.plugin.downloader.c.a.a.b paramb)
  {
    AppMethodBeat.i(136135);
    this.kOT = new HashMap();
    this.kOU = new LinkedList();
    this.kOW = "";
    if (paramb == null)
    {
      this.kOS = new com.tencent.mm.plugin.downloader.c.a.a.b();
      AppMethodBeat.o(136135);
    }
    while (true)
    {
      return;
      this.kOS = paramb;
      Kh();
      AppMethodBeat.o(136135);
    }
  }

  public f(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(136136);
    this.kOT = new HashMap();
    this.kOU = new LinkedList();
    this.kOW = "";
    this.kOS = new com.tencent.mm.plugin.downloader.c.a.a.b();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
      AppMethodBeat.o(136136);
    while (true)
    {
      return;
      try
      {
        this.kOS.parseFrom(paramArrayOfByte);
        Kh();
        AppMethodBeat.o(136136);
      }
      catch (IOException paramArrayOfByte)
      {
        while (true)
          ab.e("MicroMsg.PBAppInfo", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }

  private void Kh()
  {
    AppMethodBeat.i(136137);
    this.kOV = this.kOS.kKp;
    if (bo.ek(this.kOS.kKo))
      AppMethodBeat.o(136137);
    while (true)
    {
      return;
      Iterator localIterator = this.kOS.kKo.iterator();
      while (localIterator.hasNext())
      {
        d locald = (d)localIterator.next();
        if ((locald.kKr.kLy == null) || (locald.kKr.kLy.kLn == null))
        {
          ab.e("MicroMsg.PBAppInfo", "download info is null, appid:%s", new Object[] { locald.kKr.kLw.csB });
        }
        else
        {
          i locali = new i();
          locali.appId = locald.kKr.kLw.csB;
          locali.appName = locald.kKr.kLw.kKY;
          locali.iconUrl = locald.kKr.kLw.kKZ;
          locali.packageName = locald.kKr.kLy.kLn.kKO;
          locali.kPc = locald.kKr.kLy.kLn;
          Object localObject;
          if (locald.kKt != null)
          {
            localObject = locald.kKt.kKq;
            label212: locali.jumpUrl = ((String)localObject);
            if (!bo.isNullOrNil(locali.jumpUrl))
              this.kOW = locali.jumpUrl;
            locali.kPa = locald.kKr.kLy.kLn.kKW;
            locali.kPe = locald.kKr.kLA;
            if (j.IM(locald.kKr.kLw.csB) != k.UN_INSTALLED)
              break label313;
            locali.type = 2;
          }
          while (true)
          {
            this.kOT.put(locali.appId, locali);
            break;
            localObject = "";
            break label212;
            label313: localObject = com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(ah.getContext(), locald.kKr.kLy.kLn.kKO);
            if ((localObject != null) && (((PackageInfo)localObject).versionCode < locald.kKr.kLy.kLn.kKS))
              locali.type = 4;
            else
              locali.type = 6;
          }
        }
      }
      AppMethodBeat.o(136137);
    }
  }

  public final i IL(String paramString)
  {
    AppMethodBeat.i(136138);
    paramString = (i)this.kOT.get(paramString);
    AppMethodBeat.o(136138);
    return paramString;
  }

  public final LinkedList<i> O(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(136139);
    this.kOU.clear();
    if (!bo.ek(paramLinkedList))
    {
      paramLinkedList = paramLinkedList.iterator();
      int i = 0;
      int j = 0;
      int k = 0;
      if (paramLinkedList.hasNext())
      {
        Object localObject = (String)paramLinkedList.next();
        localObject = (i)this.kOT.get(localObject);
        int m = i;
        int n = j;
        int i1 = k;
        if (localObject != null)
        {
          m = i;
          n = j;
          i1 = k;
          switch (((i)localObject).type)
          {
          default:
            i1 = k;
            n = j;
            m = i;
          case 3:
          case 5:
          case 2:
          case 4:
          case 6:
          }
        }
        while (true)
        {
          this.kOU.add(localObject);
          i = m;
          j = n;
          k = i1;
          break;
          i1 = k + 1;
          ((i)localObject).position = i1;
          m = i;
          n = j;
          continue;
          n = j + 1;
          ((i)localObject).position = n;
          m = i;
          i1 = k;
          continue;
          m = i + 1;
          ((i)localObject).position = m;
          n = j;
          i1 = k;
        }
      }
      paramLinkedList = new i(8);
      paramLinkedList.kPd = this.kOV;
      this.kOU.add(paramLinkedList);
    }
    paramLinkedList = this.kOU;
    AppMethodBeat.o(136139);
    return paramLinkedList;
  }

  public final boolean biL()
  {
    AppMethodBeat.i(136140);
    boolean bool;
    if (this.kOT.size() == 0)
    {
      bool = true;
      AppMethodBeat.o(136140);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(136140);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.b.f
 * JD-Core Version:    0.6.2
 */