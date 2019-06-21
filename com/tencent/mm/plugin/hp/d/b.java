package com.tencent.mm.plugin.hp.d;

import android.content.Context;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bdm;
import com.tencent.mm.protocal.protobuf.bhy;
import com.tencent.mm.protocal.protobuf.bhz;
import com.tencent.mm.protocal.protobuf.bia;
import com.tencent.mm.protocal.protobuf.bsz;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public String clientVersion;
  public final int fileSize;
  public final Integer nug;
  public HashMap<Integer, LinkedList<bdm>> nuh;
  public final Integer nui;
  public final Integer nuj;
  public final String nuk;
  public final String nul;
  public final String num;
  public String nun;
  public String nuo;
  public String nup;
  public String nuq;
  public String nur;
  public int versionCode;

  public b(bia parambia)
  {
    AppMethodBeat.i(90674);
    this.nuh = new HashMap();
    if (parambia == null)
    {
      this.nug = Integer.valueOf(1);
      this.nuk = "";
      this.nul = "";
      this.nui = Integer.valueOf(-1);
      this.nuj = Integer.valueOf(-1);
      this.num = "";
      this.fileSize = 0;
      this.nun = "";
      this.nuo = "";
      this.versionCode = 0;
      this.clientVersion = "";
      this.nup = "";
      this.nuq = "";
      this.nur = "";
      AppMethodBeat.o(90674);
    }
    while (true)
    {
      return;
      if (parambia.wLm != null)
      {
        this.nul = parambia.wLm.wdO;
        this.nuk = parambia.wLm.Url;
      }
      Object localObject;
      for (this.fileSize = parambia.wLm.FileSize; ; this.fileSize = 0)
      {
        this.nug = Integer.valueOf(parambia.state);
        this.nuj = Integer.valueOf(parambia.wLl);
        if ((parambia.wLj == null) || (parambia.wLj.isEmpty()))
          break;
        int i = parambia.wLj.size();
        for (int j = 0; j < i; j++)
        {
          localObject = (bhz)parambia.wLj.get(j);
          if ((((bhz)localObject).wLi != null) && (!((bhz)localObject).wLi.isEmpty()))
            this.nuh.put(Integer.valueOf(((bhz)localObject).type), ((bhz)localObject).wLi);
        }
        this.nul = "";
        this.nuk = "";
      }
      this.nui = Integer.valueOf(parambia.wLk);
      this.num = parambia.pdA;
      if ((parambia.wLo != null) && (!parambia.wLo.isEmpty()))
      {
        parambia = parambia.wLo.iterator();
        while (parambia.hasNext())
        {
          localObject = (bhy)parambia.next();
          if ((localObject != null) && (!bo.isNullOrNil(((bhy)localObject).key)))
            if (((bhy)localObject).key.equalsIgnoreCase("newApkMd5"))
              this.nun = ((bhy)localObject).value;
            else if (((bhy)localObject).key.equalsIgnoreCase("oldApkMd5"))
              this.nuo = ((bhy)localObject).value;
            else if (((bhy)localObject).key.equalsIgnoreCase("versionCode"))
              this.versionCode = bo.ank(((bhy)localObject).value);
            else if (((bhy)localObject).key.equalsIgnoreCase("clientVersion"))
              this.clientVersion = ((bhy)localObject).value;
            else if (((bhy)localObject).key.equalsIgnoreCase("alphaTitle"))
              this.nup = c.OI(((bhy)localObject).value);
            else if (((bhy)localObject).key.equalsIgnoreCase("alphaContent"))
              this.nuq = c.OI(((bhy)localObject).value);
            else if (((bhy)localObject).key.equalsIgnoreCase("alphaUrl"))
              this.nur = ((bhy)localObject).value;
        }
        AppMethodBeat.o(90674);
      }
      else
      {
        this.nun = "";
        this.nuo = "";
        this.versionCode = 0;
        this.clientVersion = "";
        this.nup = "";
        this.nuq = "";
        this.nur = "";
        AppMethodBeat.o(90674);
      }
    }
  }

  public static String a(HashMap<Integer, LinkedList<bdm>> paramHashMap, int paramInt)
  {
    AppMethodBeat.i(90678);
    if ((paramHashMap == null) || (paramHashMap.isEmpty()))
    {
      localObject = "";
      AppMethodBeat.o(90678);
      return localObject;
    }
    String str = "";
    LinkedList localLinkedList = (LinkedList)paramHashMap.get(Integer.valueOf(paramInt));
    Object localObject = str;
    if (localLinkedList != null)
    {
      localObject = str;
      if (!localLinkedList.isEmpty())
      {
        int i = localLinkedList.size();
        paramInt = 0;
        paramHashMap = str;
        label70: localObject = paramHashMap;
        if (paramInt < i)
        {
          localObject = (bdm)localLinkedList.get(paramInt);
          if (((bdm)localObject).lang.equalsIgnoreCase("default"))
            paramHashMap = new String(Base64.decode(((bdm)localObject).content, 0));
        }
      }
    }
    while (true)
    {
      paramInt++;
      break label70;
      if (((bdm)localObject).lang.equalsIgnoreCase(aa.dor()))
      {
        localObject = new String(Base64.decode(((bdm)localObject).content, 0));
        AppMethodBeat.o(90678);
        break;
        AppMethodBeat.o(90678);
        break;
      }
    }
  }

  public final boolean bGu()
  {
    boolean bool = true;
    AppMethodBeat.i(90675);
    Context localContext = ah.getContext();
    if (!at.isConnected(localContext))
    {
      bool = false;
      AppMethodBeat.o(90675);
    }
    while (true)
    {
      return bool;
      if (this.nuj.intValue() == 1)
      {
        AppMethodBeat.o(90675);
      }
      else if (this.nuj.intValue() == 3)
      {
        bool = at.isWifi(localContext);
        AppMethodBeat.o(90675);
      }
      else
      {
        AppMethodBeat.o(90675);
      }
    }
  }

  public final boolean bGv()
  {
    AppMethodBeat.i(90676);
    boolean bool;
    if ((this.nug.intValue() == 2) || (this.nug.intValue() == 4))
    {
      bool = true;
      AppMethodBeat.o(90676);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90676);
    }
  }

  public final boolean bGw()
  {
    AppMethodBeat.i(90677);
    boolean bool;
    if ((this.nuh != null) && (!this.nuh.isEmpty()) && (this.nuh.containsKey(Integer.valueOf(4))))
    {
      bool = true;
      AppMethodBeat.o(90677);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(90677);
    }
  }

  public final String bGx()
  {
    AppMethodBeat.i(90679);
    String str;
    if (bGw())
    {
      str = a(this.nuh, 4);
      AppMethodBeat.o(90679);
    }
    while (true)
    {
      return str;
      str = "";
      AppMethodBeat.o(90679);
    }
  }

  public final boolean bGy()
  {
    AppMethodBeat.i(90681);
    String str;
    if (this.clientVersion == null)
    {
      str = "";
      ab.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", new Object[] { str, f.CLIENT_VERSION });
      if (bo.isNullOrNil(this.clientVersion))
        break label130;
    }
    while (true)
    {
      try
      {
        int i = Integer.decode(this.clientVersion).intValue();
        int j = Integer.decode(f.CLIENT_VERSION).intValue();
        if ((i & 0xFFFFFF00) < (j & 0xFFFFFF00))
        {
          AppMethodBeat.o(90681);
          bool = true;
          return bool;
          str = this.clientVersion;
          break;
        }
        AppMethodBeat.o(90681);
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("Tinker.TinkerSyncResponse", localException, "isLowerClientVersion", new Object[0]);
      }
      label130: AppMethodBeat.o(90681);
      boolean bool = false;
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(90680);
    String str = "responseState:" + this.nug + "\ncdnUrl:" + this.nuk + "\nfileMd5:" + this.nul + "\npackageType:" + this.nui + "\nnetworkType:" + this.nuj + "\npatchId:" + this.num;
    AppMethodBeat.o(90680);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.hp.d.b
 * JD-Core Version:    0.6.2
 */