package com.tencent.mm.plugin.sns.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.e;

public final class aq
{
  public static String D(bau parambau)
  {
    AppMethodBeat.i(36638);
    if (parambau == null)
    {
      parambau = null;
      AppMethodBeat.o(36638);
    }
    while (true)
    {
      return parambau;
      parambau = an.fZ(af.getAccSnsPath(), parambau.Id) + i.j(parambau);
      ab.i("MicroMsg.SnsVideoLogic", "get sns video path %s", new Object[] { parambau });
      AppMethodBeat.o(36638);
    }
  }

  public static String Yf(String paramString)
  {
    AppMethodBeat.i(36636);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(36636);
    }
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("SNS_");
      if (i < 0)
      {
        paramString = "";
        AppMethodBeat.o(36636);
        continue;
      }
      String str = "";
      try
      {
        paramString = paramString.substring(i + 4);
        AppMethodBeat.o(36636);
      }
      catch (Exception paramString)
      {
        while (true)
          paramString = str;
      }
    }
  }

  public static String Yg(String paramString)
  {
    AppMethodBeat.i(36637);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(36637);
    }
    while (true)
    {
      return paramString;
      String str = an.fZ(af.getAccSnsPath(), paramString);
      ab.i("MicroMsg.SnsVideoLogic", "get sns video dir %s mediaId %s", new Object[] { str, paramString });
      AppMethodBeat.o(36637);
      paramString = str;
    }
  }

  public static s Yh(String paramString)
  {
    AppMethodBeat.i(36643);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(36643);
    }
    while (true)
    {
      return paramString;
      paramString = u.ut(ug(paramString));
      AppMethodBeat.o(36643);
    }
  }

  public static String a(String paramString, bau parambau)
  {
    Object localObject1 = null;
    AppMethodBeat.i(36639);
    Object localObject2;
    if (parambau == null)
    {
      localObject2 = null;
      if (!e.ct((String)localObject2))
        break label97;
      ab.i("MicroMsg.SnsVideoLogic", "it needn't download video[%s] because of the video is self. %s", new Object[] { paramString, localObject2 });
      AppMethodBeat.o(36639);
      paramString = (String)localObject2;
    }
    while (true)
    {
      return paramString;
      localObject2 = an.fZ(af.getAccSnsPath(), parambau.Id) + i.p(parambau);
      ab.i("MicroMsg.SnsVideoLogic", "get sns video tmp path %s", new Object[] { localObject2 });
      break;
      label97: parambau = D(parambau);
      boolean bool = e.ct(parambau);
      localObject2 = Yh(paramString);
      if (localObject2 == null)
      {
        if (bool)
        {
          ab.i("MicroMsg.SnsVideoLogic", "it old version already download video[%s]. path :%s", new Object[] { paramString, parambau });
          AppMethodBeat.o(36639);
          paramString = parambau;
        }
        else
        {
          ab.i("MicroMsg.SnsVideoLogic", "video info is null and file is no exists, return null.[%s]", new Object[] { paramString });
          AppMethodBeat.o(36639);
          paramString = localObject1;
        }
      }
      else if ((bool) && (((s)localObject2).alz()))
      {
        ab.i("MicroMsg.SnsVideoLogic", "it had download sns video[%s] finish. %s", new Object[] { paramString, parambau });
        AppMethodBeat.o(36639);
        paramString = parambau;
      }
      else
      {
        ab.i("MicroMsg.SnsVideoLogic", "it don't download video[%s] finish. file[%b] status[%d], return null.", new Object[] { paramString, Boolean.valueOf(bool), Integer.valueOf(((s)localObject2).status) });
        AppMethodBeat.o(36639);
        paramString = localObject1;
      }
    }
  }

  public static String be(int paramInt, String paramString)
  {
    AppMethodBeat.i(36634);
    paramString = c.a("snsvideo", paramInt, "sns", paramString);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(36634);
    }
    while (true)
    {
      return paramString;
      AppMethodBeat.o(36634);
    }
  }

  public static boolean c(s params, int paramInt)
  {
    AppMethodBeat.i(36641);
    params.status = 130;
    params.egF = paramInt;
    params.bJt = 268435712;
    boolean bool = o.all().c(params);
    ab.i("MicroMsg.SnsVideoLogic", "update sns Record filename %s, update %b", new Object[] { params.getFileName(), Boolean.valueOf(bool) });
    AppMethodBeat.o(36641);
    return bool;
  }

  public static boolean dd(String paramString, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(36640);
    if (bo.isNullOrNil(paramString))
    {
      ab.w("MicroMsg.SnsVideoLogic", "init sns record, but snsLocalId is null");
      AppMethodBeat.o(36640);
    }
    while (true)
    {
      return bool;
      String str = ug(paramString);
      paramString = new s();
      paramString.fileName = str;
      paramString.createTime = bo.anT();
      paramString.status = 130;
      paramString.egF = paramInt;
      bool = o.all().b(paramString);
      ab.i("MicroMsg.SnsVideoLogic", "init sns Record filename %s, insert %b", new Object[] { str, Boolean.valueOf(bool) });
      AppMethodBeat.o(36640);
    }
  }

  public static boolean gb(String paramString1, String paramString2)
  {
    AppMethodBeat.i(36642);
    s locals = Yh(paramString1);
    if (locals == null)
    {
      locals = new s();
      locals.fileName = ug(paramString1);
    }
    for (int i = 1; ; i = 0)
    {
      locals.createTime = bo.anT();
      locals.cMW = paramString2;
      locals.status = 199;
      if (i != 0);
      for (boolean bool = o.all().b(locals); ; bool = o.all().c(locals))
      {
        ab.i("MicroMsg.SnsVideoLogic", "post sns video snsLocalId %s, md5 %s ret %b", new Object[] { paramString1, paramString2, Boolean.valueOf(bool) });
        AppMethodBeat.o(36642);
        return bool;
        locals.bJt = 33555200;
      }
    }
  }

  public static String ug(String paramString)
  {
    AppMethodBeat.i(36635);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(36635);
    }
    while (true)
    {
      return paramString;
      String str = "SNS_".concat(String.valueOf(paramString));
      ab.d("MicroMsg.SnsVideoLogic", "gen sns[%s] video file name [%s]", new Object[] { paramString, str });
      AppMethodBeat.o(36635);
      paramString = str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.aq
 * JD-Core Version:    0.6.2
 */