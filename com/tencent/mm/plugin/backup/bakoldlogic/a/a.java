package com.tencent.mm.plugin.backup.bakoldlogic.a;

import android.os.StatFs;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.bt.b;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.btt;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private static List<String> elZ = null;

  public static String Fb(String paramString)
  {
    AppMethodBeat.i(17739);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(17739);
    }
    while (true)
    {
      return paramString;
      String str1 = g.x(paramString.getBytes());
      paramString = "";
      String str2 = "";
      if (str1.length() > 0)
        paramString = str1.charAt(0) + "/";
      if (str1.length() >= 2)
        str2 = str1.charAt(1) + "/";
      paramString = paramString + str2;
      AppMethodBeat.o(17739);
    }
  }

  public static boolean Fd(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(17743);
    if (paramString == null)
      AppMethodBeat.o(17743);
    while (true)
    {
      return bool;
      int i = paramString.indexOf('<');
      String str = paramString;
      if (i > 0)
        str = paramString.substring(i);
      if (br.z(str, "msg") != null)
      {
        bool = true;
        AppMethodBeat.o(17743);
      }
      else
      {
        AppMethodBeat.o(17743);
      }
    }
  }

  public static void Fo(String paramString)
  {
    AppMethodBeat.i(17741);
    e.tf(paramString);
    e.tf(paramString + "backupItem/");
    e.tf(paramString + "backupMeida/");
    AppMethodBeat.o(17741);
  }

  public static String Fp(String paramString)
  {
    AppMethodBeat.i(17744);
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = "";
      AppMethodBeat.o(17744);
    }
    while (true)
    {
      return paramString;
      paramString = aUy() + "backupMeida/" + Fb(paramString) + paramString;
      AppMethodBeat.o(17744);
    }
  }

  public static List<String> Ko()
  {
    AppMethodBeat.i(17738);
    Object localObject1;
    if (elZ != null)
    {
      localObject1 = elZ;
      AppMethodBeat.o(17738);
    }
    while (true)
    {
      return localObject1;
      elZ = new LinkedList();
      for (Object localObject2 : t.fkY)
        elZ.add(localObject2);
      elZ.add("weixin");
      elZ.add("weibo");
      elZ.add("qqmail");
      elZ.add("fmessage");
      elZ.add("tmessage");
      elZ.add("qmessage");
      elZ.add("qqsync");
      elZ.add("floatbottle");
      elZ.add("lbsapp");
      elZ.add("shakeapp");
      elZ.add("medianote");
      elZ.add("qqfriend");
      elZ.add("readerapp");
      elZ.add("newsapp");
      elZ.add("blogapp");
      elZ.add("facebookapp");
      elZ.add("masssendapp");
      elZ.add("meishiapp");
      elZ.add("feedsapp");
      elZ.add("voipapp");
      elZ.add("officialaccounts");
      elZ.add("helper_entry");
      elZ.add("pc_share");
      elZ.add("cardpackage");
      elZ.add("voicevoipapp");
      elZ.add("voiceinputapp");
      elZ.add("linkedinplugin");
      elZ.add("appbrandcustomerservicemsg");
      localObject1 = elZ;
      AppMethodBeat.o(17738);
    }
  }

  public static String a(gu paramgu, int paramInt)
  {
    AppMethodBeat.i(17747);
    paramgu = a(paramgu, paramInt, null);
    AppMethodBeat.o(17747);
    return paramgu;
  }

  public static String a(gu paramgu, int paramInt, String paramString)
  {
    AppMethodBeat.i(17746);
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      paramgu = g.x(paramgu.vJd.getBuffer().wR);
      AppMethodBeat.o(17746);
    }
    while (true)
    {
      return paramgu;
      if ((paramgu.vJc != null) && (paramgu.vJb != null))
      {
        Iterator localIterator = paramgu.vJc.iterator();
        int i = 0;
        while (true)
        {
          if (!localIterator.hasNext())
            break label177;
          if (((btt)localIterator.next()).wVK == paramInt)
          {
            String str = ((bts)paramgu.vJb.get(i)).wVI;
            if ((!bo.isNullOrNil(paramString)) && (!str.endsWith(paramString)))
            {
              i = i + 1 + 1;
              continue;
            }
            if (e.ct(Fp(str)))
            {
              AppMethodBeat.o(17746);
              paramgu = str;
              break;
            }
            AppMethodBeat.o(17746);
            paramgu = null;
            break;
          }
          i++;
        }
      }
      label177: AppMethodBeat.o(17746);
      paramgu = null;
    }
  }

  public static boolean a(long paramLong, PLong paramPLong1, PLong paramPLong2, String paramString)
  {
    AppMethodBeat.i(17742);
    Object localObject = new StatFs(h.getExternalStorageDirectory().getPath());
    long l1 = ((StatFs)localObject).getBlockSize();
    paramPLong1.value = (((StatFs)localObject).getAvailableBlocks() * l1);
    localObject = h.getDataDirectory();
    StatFs localStatFs = new StatFs(((File)localObject).getPath());
    long l2 = localStatFs.getBlockCount();
    l1 = localStatFs.getAvailableBlocks();
    paramPLong2.value = (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks());
    ab.i("MicroMsg.BakUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", new Object[] { Long.valueOf(paramPLong1.value), Long.valueOf(paramPLong2.value), Long.valueOf(paramLong) });
    boolean bool;
    if (l2 <= 0L)
    {
      bool = false;
      AppMethodBeat.o(17742);
    }
    while (true)
    {
      return bool;
      if (l2 - l1 < 0L)
      {
        bool = false;
        AppMethodBeat.o(17742);
      }
      else
      {
        if ((paramPLong1.value == paramPLong2.value) || (paramString.startsWith(((File)localObject).getPath())))
          paramPLong1.value = 0L;
        if (paramLong > paramPLong2.value)
        {
          bool = false;
          AppMethodBeat.o(17742);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(17742);
        }
      }
    }
  }

  public static String aUy()
  {
    AppMethodBeat.i(17740);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = c.getAccPath() + "backup/";
    AppMethodBeat.o(17740);
    return localObject;
  }

  public static boolean b(gu paramgu, int paramInt, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(17749);
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      paramgu = paramgu.vJd.getBuffer().wR;
      if (paramgu.length <= 0)
        AppMethodBeat.o(17749);
    }
    while (true)
    {
      return bool;
      e.b(paramString, paramgu, paramgu.length);
      AppMethodBeat.o(17749);
      bool = true;
      continue;
      paramgu = a(paramgu, paramInt, null);
      if (!bo.isNullOrNil(paramgu))
      {
        e.y(Fp(paramgu), paramString);
        AppMethodBeat.o(17749);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(17749);
      }
    }
  }

  public static byte[] b(gu paramgu, int paramInt)
  {
    AppMethodBeat.i(17748);
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      paramgu = paramgu.vJd.getBuffer().wR;
      AppMethodBeat.o(17748);
    }
    while (true)
    {
      return paramgu;
      if ((paramgu.vJc != null) && (paramgu.vJb != null))
      {
        Iterator localIterator = paramgu.vJc.iterator();
        for (int i = 0; ; i++)
        {
          if (!localIterator.hasNext())
            break label166;
          if (((btt)localIterator.next()).wVK == paramInt)
          {
            paramgu = Fp(((bts)paramgu.vJb.get(i)).wVI);
            paramInt = (int)e.asZ(paramgu);
            if ((paramInt == 0) || (paramInt > 1048576))
            {
              ab.e("MicroMsg.BakUtil", "thumb not exist or  too big!");
              AppMethodBeat.o(17748);
              paramgu = null;
              break;
            }
            paramgu = e.e(paramgu, 0, -1);
            AppMethodBeat.o(17748);
            break;
          }
        }
      }
      label166: AppMethodBeat.o(17748);
      paramgu = null;
    }
  }

  public static int bC(String paramString, int paramInt)
  {
    AppMethodBeat.i(17750);
    int i = paramInt;
    if (!bo.isNullOrNil(paramString));
    try
    {
      i = Integer.valueOf(paramString).intValue();
      AppMethodBeat.o(17750);
      return i;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.BakUtil", paramString, "", new Object[0]);
        i = paramInt;
      }
    }
  }

  public static int c(gu paramgu, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(17745);
    if (paramgu.vJf == paramInt)
      if (paramgu.vJd == null)
      {
        AppMethodBeat.o(17745);
        paramInt = i;
      }
    while (true)
    {
      return paramInt;
      paramInt = paramgu.vJd.getBuffer().wR.length;
      AppMethodBeat.o(17745);
      continue;
      if ((paramgu.vJc != null) && (paramgu.vJb != null))
      {
        Iterator localIterator = paramgu.vJc.iterator();
        for (int j = 0; ; j++)
        {
          if (!localIterator.hasNext())
            break label142;
          if (((btt)localIterator.next()).wVK == paramInt)
          {
            paramInt = (int)e.asZ(Fp(((bts)paramgu.vJb.get(j)).wVI));
            AppMethodBeat.o(17745);
            break;
          }
        }
      }
      label142: AppMethodBeat.o(17745);
      paramInt = i;
    }
  }

  public static boolean d(gu paramgu, int paramInt)
  {
    AppMethodBeat.i(17751);
    boolean bool;
    if ((paramgu.vJf == paramInt) && (paramgu.vJd != null))
    {
      AppMethodBeat.o(17751);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramgu = paramgu.vJc.iterator();
      while (true)
        if (paramgu.hasNext())
          if (((btt)paramgu.next()).wVK == paramInt)
          {
            AppMethodBeat.o(17751);
            bool = true;
            break;
          }
      bool = false;
      AppMethodBeat.o(17751);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.a.a
 * JD-Core Version:    0.6.2
 */