package com.tencent.mm.modelstat;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.sdk.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;

public final class g
{
  private final String dataPath;
  private g.a fST = null;

  public g(String paramString)
  {
    this.dataPath = paramString;
  }

  public final g.a aki()
  {
    a locala = null;
    AppMethodBeat.i(78734);
    if (this.fST != null)
    {
      localObject1 = this.fST;
      AppMethodBeat.o(78734);
      return localObject1;
    }
    String str = this.dataPath + "mobileinfo.ini";
    Object localObject2 = new File(str);
    if (!((File)localObject2).exists())
    {
      ab.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig file not exist :%s", new Object[] { str });
      localObject1 = null;
    }
    Object localObject3;
    while (true)
    {
      this.fST = ((g.a)localObject1);
      if ((this.fST == null) || (this.fST.fSV))
        break label374;
      ab.v("MicroMsg.MobileInfoStorage ReportDataFlow", "checkInfo mobile info cache Read file succ.");
      localObject1 = this.fST;
      AppMethodBeat.o(78734);
      break;
      localObject3 = new a(str);
      localObject1 = new g.a();
      ((g.a)localObject1).fSU = bo.h(((a)localObject3).anE("ispCode"));
      ((g.a)localObject1).ispName = ((a)localObject3).getValue("ispName");
      ((g.a)localObject1).cuu = bo.h(((a)localObject3).anE("subType"));
      ((g.a)localObject1).extraInfo = ((a)localObject3).getValue("extraInfo");
      long l1 = ((File)localObject2).lastModified();
      long l2 = l1;
      if (10011 == ae.giz)
      {
        l2 = l1;
        if (ae.giA > 0)
        {
          l2 = bo.anU() - ae.giA;
          ab.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig DK_TEST_MOBILEINFOFILE_MODTIME val:%d lm:%d", new Object[] { Integer.valueOf(ae.giA), Long.valueOf(l2) });
          ae.giA = 0;
        }
      }
      if ((l2 > 0L) && (bo.gb(l2) > 259200000L))
      {
        ab.w("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig  diff:%d file:%s cache expired remove!", new Object[] { Long.valueOf(bo.gb(l2)), str });
        ((g.a)localObject1).fSV = true;
      }
      ab.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readConfig MobileInfo subType:%d ispCode:%d ispName:%s extraInfo:%s expired:%b", new Object[] { Integer.valueOf(((g.a)localObject1).cuu), Integer.valueOf(((g.a)localObject1).fSU), ((g.a)localObject1).ispName, ((g.a)localObject1).extraInfo, Boolean.valueOf(((g.a)localObject1).fSV) });
    }
    label374: localObject2 = ah.getContext();
    if (localObject2 == null)
    {
      ab.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem MMApplicationContext is null");
      localObject1 = locala;
    }
    while (true)
    {
      if (localObject1 != null)
        break label580;
      ab.v("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem failed , use old.");
      localObject1 = this.fST;
      AppMethodBeat.o(78734);
      break;
      localObject1 = (ConnectivityManager)((Context)localObject2).getSystemService("connectivity");
      if (localObject1 == null)
      {
        ab.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem ConnectivityManager is null");
        localObject1 = locala;
      }
      else
      {
        localObject3 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
        if (localObject3 == null)
        {
          ab.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem getActiveNetworkInfo is null");
          localObject1 = locala;
        }
        else if (((NetworkInfo)localObject3).getType() == 1)
        {
          ab.e("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem net type is wifi");
          localObject1 = locala;
        }
        else
        {
          localObject1 = new g.a();
          ((g.a)localObject1).cuu = ((NetworkInfo)localObject3).getSubtype();
          ((g.a)localObject1).fSU = at.getISPCode((Context)localObject2);
          ((g.a)localObject1).ispName = at.getISPName((Context)localObject2);
          ((g.a)localObject1).extraInfo = ((NetworkInfo)localObject3).getExtraInfo();
          ab.i("MicroMsg.MobileInfoStorage ReportDataFlow", "readInfoBySystem subType:%d ispCode:%d ispName:%s extraInfo:%s", new Object[] { Integer.valueOf(((g.a)localObject1).cuu), Integer.valueOf(((g.a)localObject1).fSU), ((g.a)localObject1).ispName, ((g.a)localObject1).extraInfo });
        }
      }
    }
    label580: this.fST = ((g.a)localObject1);
    Object localObject1 = this.fST;
    if (localObject1 == null)
      ab.e("MicroMsg.MobileInfoStorage ReportDataFlow", "saveConfig info is null");
    while (true)
    {
      localObject1 = this.fST;
      AppMethodBeat.o(78734);
      break;
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.MobileInfoStorage ReportDataFlow", "saveConfig path is null");
      }
      else
      {
        locala = new a(str);
        locala.ej("ispCode", ((g.a)localObject1).fSU);
        locala.hV("ispName", ((g.a)localObject1).ispName);
        locala.ej("subType", ((g.a)localObject1).cuu);
        locala.hV("extraInfo", ((g.a)localObject1).extraInfo);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.g
 * JD-Core Version:    0.6.2
 */