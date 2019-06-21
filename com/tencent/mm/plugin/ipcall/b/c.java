package com.tencent.mm.plugin.ipcall.b;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.g;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.voip.a.d;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.protocal.protobuf.blt;
import com.tencent.mm.protocal.protobuf.coj;
import com.tencent.mm.protocal.protobuf.cok;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class c
{
  public static String PA(String paramString)
  {
    AppMethodBeat.i(22471);
    paramString = paramString.replace("-", "").replace(" ", "").replace("(", "").replace(")", "").trim();
    AppMethodBeat.o(22471);
    return paramString;
  }

  public static void PB(String paramString)
  {
    AppMethodBeat.i(22482);
    ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, paramString));
    AppMethodBeat.o(22482);
  }

  private static int Pz(String paramString)
  {
    AppMethodBeat.i(22469);
    try
    {
      byte[] arrayOfByte = InetAddress.getByName(paramString).getAddress();
      if (arrayOfByte != null)
      {
        int i = 0;
        j = 0;
        while (i < arrayOfByte.length)
        {
          j = j << 8 | arrayOfByte[i] & 0xFF;
          i++;
        }
        ab.d("MicroMsg.IPCallUtil", "ipAddressStrToInt, ip: %s, result: %d", new Object[] { paramString, Integer.valueOf(j) });
        AppMethodBeat.o(22469);
        return j;
      }
    }
    catch (UnknownHostException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.IPCallUtil", paramString, "", new Object[0]);
        AppMethodBeat.o(22469);
        int j = 0;
      }
    }
  }

  public static String aJ(Context paramContext, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(22474);
    String[] arrayOfString = paramContext.getResources().getStringArray(2131755061);
    paramContext = new ArrayList();
    paramContext.add("");
    for (int j = 0; j < arrayOfString.length; j++)
      paramContext.add(arrayOfString[j]);
    try
    {
      j = bo.getInt(paramString, 0);
      if (j >= paramContext.size())
      {
        paramContext = "";
        AppMethodBeat.o(22474);
      }
      while (true)
      {
        return paramContext;
        paramContext = (String)paramContext.get(j);
        AppMethodBeat.o(22474);
      }
    }
    catch (Exception paramString)
    {
      while (true)
        j = i;
    }
  }

  public static cok af(LinkedList<blt> paramLinkedList)
  {
    AppMethodBeat.i(22468);
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0))
    {
      paramLinkedList = null;
      AppMethodBeat.o(22468);
    }
    while (true)
    {
      return paramLinkedList;
      cok localcok = new cok();
      localcok.xlZ = paramLinkedList.size();
      localcok.xma = new LinkedList();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        blt localblt = (blt)paramLinkedList.next();
        coj localcoj = new coj();
        localcoj.xfs = Pz(localblt.wCK);
        localcoj.wOO = localblt.wOO;
        localcok.xma.add(localcoj);
      }
      AppMethodBeat.o(22468);
      paramLinkedList = localcok;
    }
  }

  public static int bIP()
  {
    AppMethodBeat.i(22470);
    Context localContext = ah.getContext();
    int i;
    if (at.is2G(localContext))
    {
      i = 1;
      AppMethodBeat.o(22470);
    }
    while (true)
    {
      return i;
      if (at.is3G(localContext))
      {
        i = 3;
        AppMethodBeat.o(22470);
      }
      else if (at.is4G(localContext))
      {
        i = 5;
        AppMethodBeat.o(22470);
      }
      else if (at.isWifi(localContext))
      {
        i = 4;
        AppMethodBeat.o(22470);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(22470);
      }
    }
  }

  private static long bIQ()
  {
    AppMethodBeat.i(22478);
    Calendar localCalendar = Calendar.getInstance();
    long l1 = localCalendar.getTimeInMillis();
    localCalendar.add(6, 1);
    long l2 = localCalendar.getTimeInMillis();
    AppMethodBeat.o(22478);
    return l2 - l1;
  }

  public static String bIR()
  {
    AppMethodBeat.i(22483);
    String str = ah.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryCode", "");
    if (!bo.isNullOrNil(str))
    {
      str = str.replace("+", "");
      AppMethodBeat.o(22483);
    }
    while (true)
    {
      return str;
      str = a.bIN();
      AppMethodBeat.o(22483);
    }
  }

  public static boolean bIS()
  {
    boolean bool = true;
    AppMethodBeat.i(22484);
    int i;
    if (g.Nu().getInt("WCOSecondPurchaseSwitch", 0) > 0)
    {
      i = 1;
      if (i == 0)
        break label40;
      AppMethodBeat.o(22484);
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label40: AppMethodBeat.o(22484);
      bool = false;
    }
  }

  public static boolean bIT()
  {
    boolean bool = false;
    AppMethodBeat.i(22485);
    if (g.Nu().getInt("WCOClosePurchaseEntranceSwitch", 0) != 0)
    {
      bool = true;
      AppMethodBeat.o(22485);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(22485);
    }
  }

  public static aqq bIU()
  {
    AppMethodBeat.i(22486);
    aw.ZK();
    Object localObject1 = com.tencent.mm.model.c.Ry().get(ac.a.xMD, null);
    aqq localaqq;
    if (localObject1 != null)
    {
      localaqq = new aqq();
      localObject1 = bo.anf(localObject1.toString());
    }
    while (true)
    {
      try
      {
        localaqq.parseFrom((byte[])localObject1);
        ab.i("MicroMsg.IPCallUtil", "[royle]parse success,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,Balance:%s,PVWording:%s,PackageMsg:%s", new Object[] { localaqq.wut, localaqq.nzz, localaqq.Title, localaqq.Desc, localaqq.wuu, localaqq.wuv, localaqq.wuw, localaqq.wux, localaqq.wuE });
        AppMethodBeat.o(22486);
        return localaqq;
      }
      catch (IOException localIOException)
      {
        ab.i("MicroMsg.IPCallUtil", "[royle]parse exception:%s", new Object[] { localIOException.getMessage() });
      }
      AppMethodBeat.o(22486);
      Object localObject2 = null;
    }
  }

  public static boolean eo(Context paramContext)
  {
    int i = 2131300616;
    boolean bool = false;
    AppMethodBeat.i(22481);
    int j;
    if (d.cLx())
    {
      j = 2131300618;
      if (j != 0)
        break label83;
      bool = true;
      AppMethodBeat.o(22481);
    }
    while (true)
    {
      return bool;
      if (d.cLy())
      {
        j = 2131300617;
        break;
      }
      j = i;
      if (com.tencent.mm.bg.e.akK())
        break;
      if (com.tencent.mm.r.a.Oo())
      {
        j = 2131300613;
        break;
      }
      j = i;
      if (com.tencent.mm.bg.e.akJ())
        break;
      j = 0;
      break;
      label83: h.g(paramContext, j, 2131297061);
      AppMethodBeat.o(22481);
    }
  }

  public static CharSequence i(Context paramContext, long paramLong)
  {
    AppMethodBeat.i(22473);
    paramContext = DateFormat.format(paramContext.getString(2131299964), paramLong);
    AppMethodBeat.o(22473);
    return paramContext;
  }

  public static String iY(long paramLong)
  {
    AppMethodBeat.i(22475);
    Object localObject = ah.getContext();
    if (iZ(paramLong))
    {
      localObject = new SimpleDateFormat("HH:mm", Locale.US).format(new Date(paramLong));
      AppMethodBeat.o(22475);
    }
    while (true)
    {
      return localObject;
      if (ja(paramLong))
      {
        localObject = ((Context)localObject).getString(2131300717);
        AppMethodBeat.o(22475);
      }
      else
      {
        localObject = new SimpleDateFormat("MM/dd", Locale.US).format(new Date(paramLong));
        AppMethodBeat.o(22475);
      }
    }
  }

  private static boolean iZ(long paramLong)
  {
    AppMethodBeat.i(22476);
    boolean bool;
    if (jb(paramLong) == 0L)
    {
      bool = true;
      AppMethodBeat.o(22476);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22476);
    }
  }

  private static boolean ja(long paramLong)
  {
    AppMethodBeat.i(22477);
    boolean bool;
    if (jb(paramLong) == -1L)
    {
      bool = true;
      AppMethodBeat.o(22477);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22477);
    }
  }

  private static long jb(long paramLong)
  {
    AppMethodBeat.i(22479);
    long l1 = bIQ();
    long l2 = Calendar.getInstance().getTimeInMillis();
    paramLong /= l1;
    l2 /= l1;
    AppMethodBeat.o(22479);
    return paramLong - l2;
  }

  public static String jc(long paramLong)
  {
    AppMethodBeat.i(22480);
    Object localObject = ah.getContext();
    if (paramLong <= 60.0D)
    {
      localObject = ((Context)localObject).getString(2131300726, new Object[] { String.valueOf(paramLong) });
      AppMethodBeat.o(22480);
    }
    while (true)
    {
      return localObject;
      double d = paramLong / 60.0D;
      int i = (int)(paramLong / 60.0D);
      int j = i;
      if (d - i > 0.0D)
        j = i + 1;
      localObject = ((Context)localObject).getString(2131300725, new Object[] { String.valueOf(j) });
      AppMethodBeat.o(22480);
    }
  }

  public static String xy(int paramInt)
  {
    AppMethodBeat.i(22472);
    Object localObject = ah.getContext();
    switch (paramInt)
    {
    case 3:
    case 4:
    case 5:
    default:
      localObject = ((Context)localObject).getString(2131300780);
      AppMethodBeat.o(22472);
    case 1:
    case 2:
    case 6:
    case 7:
    }
    while (true)
    {
      return localObject;
      localObject = ((Context)localObject).getString(2131300780);
      AppMethodBeat.o(22472);
      continue;
      localObject = ((Context)localObject).getString(2131300780);
      AppMethodBeat.o(22472);
      continue;
      localObject = ((Context)localObject).getString(2131300776);
      AppMethodBeat.o(22472);
      continue;
      localObject = ((Context)localObject).getString(2131300777);
      AppMethodBeat.o(22472);
    }
  }

  public static String xz(int paramInt)
  {
    AppMethodBeat.i(22487);
    Object localObject = ah.getContext();
    if (((paramInt & 0x1) > 0) && ((paramInt & 0x2) <= 0))
    {
      localObject = ((Context)localObject).getString(2131300847) + " ";
      AppMethodBeat.o(22487);
    }
    while (true)
    {
      return localObject;
      if ((paramInt & 0x8) > 0)
      {
        localObject = ((Context)localObject).getString(2131300848) + " ";
        AppMethodBeat.o(22487);
      }
      else
      {
        localObject = "";
        AppMethodBeat.o(22487);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.b.c
 * JD-Core Version:    0.6.2
 */