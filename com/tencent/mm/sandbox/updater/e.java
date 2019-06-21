package com.tencent.mm.sandbox.updater;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.i;
import com.tencent.mm.c.i.a;
import com.tencent.mm.protocal.protobuf.bdm;
import com.tencent.mm.protocal.protobuf.bhy;
import com.tencent.mm.protocal.protobuf.bhz;
import com.tencent.mm.protocal.protobuf.bia;
import com.tencent.mm.protocal.protobuf.bsz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
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

  public e(bia parambia)
  {
    AppMethodBeat.i(28894);
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
      AppMethodBeat.o(28894);
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
        localObject = parambia.wLo.iterator();
        while (((Iterator)localObject).hasNext())
        {
          parambia = (bhy)((Iterator)localObject).next();
          if ((parambia != null) && (!bo.isNullOrNil(parambia.key)))
            if (parambia.key.equalsIgnoreCase("newApkMd5"))
              this.nun = parambia.value;
            else if (parambia.key.equalsIgnoreCase("oldApkMd5"))
              this.nuo = parambia.value;
            else if (parambia.key.equalsIgnoreCase("versionCode"))
              this.versionCode = bo.ank(parambia.value);
            else if (parambia.key.equalsIgnoreCase("clientVersion"))
              this.clientVersion = parambia.value;
            else if (parambia.key.equalsIgnoreCase("alphaTitle"))
              this.nup = OI(parambia.value);
            else if (parambia.key.equalsIgnoreCase("alphaContent"))
              this.nuq = OI(parambia.value);
            else if (parambia.key.equalsIgnoreCase("alphaUrl"))
              this.nur = parambia.value;
        }
        AppMethodBeat.o(28894);
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
        AppMethodBeat.o(28894);
      }
    }
  }

  public static boolean OH(String paramString)
  {
    AppMethodBeat.i(28897);
    if ((!bo.isNullOrNil(paramString)) && (paramString.length() == 10));
    while (true)
    {
      try
      {
        int i = Integer.decode(paramString).intValue();
        if (((i & 0xFF) >= 0) && ((i & 0xFF) <= 31))
        {
          bool = true;
          AppMethodBeat.o(28897);
          return bool;
        }
        AppMethodBeat.o(28897);
        bool = false;
        continue;
      }
      catch (Exception paramString)
      {
        ab.printErrStackTrace("Tinker.TinkerSyncResponse", paramString, "checkAplhVersion failed.", new Object[0]);
      }
      AppMethodBeat.o(28897);
      boolean bool = false;
    }
  }

  private static String OI(String paramString)
  {
    AppMethodBeat.i(28898);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = new String(Base64.decode(paramString, 0));
      AppMethodBeat.o(28898);
    }
    while (true)
    {
      return paramString;
      paramString = "";
      AppMethodBeat.o(28898);
    }
  }

  public final String dnp()
  {
    AppMethodBeat.i(28895);
    Object localObject = this.nuk.substring(0, this.nuk.lastIndexOf('/') + 1);
    String str = this.nuk.substring(this.nuk.lastIndexOf('/') + 1);
    localObject = new i((String)localObject, this.versionCode);
    ((i)localObject).a(new i.a(this.nuo, this.nun, this.nul, str, this.fileSize));
    str = ((i)localObject).AM();
    AppMethodBeat.o(28895);
    return str;
  }

  public final String toString()
  {
    AppMethodBeat.i(28896);
    String str = "responseState:" + this.nug + "\ncdnUrl:" + this.nuk + "\nfileMd5:" + this.nul + "\npackageType:" + this.nui + "\nnetworkType:" + this.nuj + "\npatchId:" + this.num;
    AppMethodBeat.o(28896);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.e
 * JD-Core Version:    0.6.2
 */