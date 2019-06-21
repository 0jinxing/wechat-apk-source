package com.tencent.mm.plugin.ipcall.b;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.telephony.PhoneNumberUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.aw;
import com.tencent.mm.g.a.aw.a;
import com.tencent.mm.model.bp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class a
{
  public static int nGS;
  public static String nGT;
  public static String nGU;
  public static String nGV;
  private static av nGW;
  private static HashMap<String, b> nGX;
  private static HashMap<String, String> nGY;
  private static HashMap<String, String> nGZ;
  private static HashMap<String, String> nHa;
  private static HashMap<String, String> nHb;

  static
  {
    AppMethodBeat.i(22466);
    nGS = 3;
    nGT = "+";
    nGU = "00";
    nGV = null;
    nGW = new av();
    nGX = new HashMap();
    nGY = new HashMap();
    nGZ = new HashMap();
    nHa = new HashMap();
    nHb = new HashMap();
    AppMethodBeat.o(22466);
  }

  public static String Pn(String paramString)
  {
    AppMethodBeat.i(22446);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(22446);
    }
    while (true)
    {
      return paramString;
      paramString = g.x(c.PA(paramString).getBytes());
      paramString = com.tencent.mm.plugin.account.a.getAddrUploadStg().vY(paramString);
      AppMethodBeat.o(22446);
    }
  }

  public static String Po(String paramString)
  {
    AppMethodBeat.i(22447);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = com.tencent.mm.plugin.account.a.getAddrUploadStg().vZ(paramString);
      AppMethodBeat.o(22447);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(22447);
    }
  }

  public static String Pp(String paramString)
  {
    AppMethodBeat.i(22451);
    if (nGX.size() == 0)
      bIL();
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(22451);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      paramString = (b)nGX.get(paramString);
      if (paramString != null)
      {
        paramString = paramString.nHe;
        AppMethodBeat.o(22451);
      }
      else
      {
        AppMethodBeat.o(22451);
        paramString = null;
      }
    }
  }

  public static String Pq(String paramString)
  {
    AppMethodBeat.i(22452);
    if (nGY.size() == 0)
      bIL();
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(22452);
    }
    while (true)
    {
      return paramString;
      paramString = (String)nGY.get(paramString);
      AppMethodBeat.o(22452);
    }
  }

  public static String Pr(String paramString)
  {
    AppMethodBeat.i(22453);
    if (nHa.size() == 0)
      bIL();
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(22453);
    }
    while (true)
    {
      return paramString;
      paramString = (String)nHa.get(paramString);
      AppMethodBeat.o(22453);
    }
  }

  public static String Ps(String paramString)
  {
    AppMethodBeat.i(22456);
    if (nGY.size() == 0)
      bIL();
    if (Pu(paramString))
    {
      String str = c.PA(Pv(paramString));
      paramString = new ArrayList(nGY.keySet());
      Collections.sort(paramString, Collections.reverseOrder(new a.a((byte)0)));
      Iterator localIterator = paramString.iterator();
      while (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        if (str.startsWith(paramString))
          AppMethodBeat.o(22456);
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(22456);
    }
  }

  public static boolean Pt(String paramString)
  {
    AppMethodBeat.i(22457);
    if (nGY.size() == 0)
      bIL();
    boolean bool;
    if (nGY.containsKey(paramString))
    {
      bool = true;
      AppMethodBeat.o(22457);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22457);
    }
  }

  public static boolean Pu(String paramString)
  {
    AppMethodBeat.i(22458);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && ((paramString.startsWith(nGT)) || (paramString.startsWith(nGU))))
    {
      bool = true;
      AppMethodBeat.o(22458);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(22458);
    }
  }

  public static String Pv(String paramString)
  {
    AppMethodBeat.i(22459);
    if (!bo.isNullOrNil(paramString))
      if (paramString.startsWith(nGT))
      {
        paramString = paramString.substring(nGT.length());
        AppMethodBeat.o(22459);
      }
    while (true)
    {
      return paramString;
      if (paramString.startsWith(nGU))
      {
        paramString = paramString.substring(nGU.length());
        AppMethodBeat.o(22459);
      }
      else
      {
        AppMethodBeat.o(22459);
      }
    }
  }

  public static String Pw(String paramString)
  {
    AppMethodBeat.i(22460);
    String str1 = c.PA(paramString);
    String str2 = c.PA(str1);
    paramString = null;
    if (Pu(str2))
      paramString = Ps(str2);
    if (!bo.isNullOrNil(paramString))
    {
      str1 = Pv(str2).substring(paramString.length());
      str2 = av.formatNumber(paramString, str1);
      if (!bo.isNullOrNil(str2))
        break label188;
      str2 = str1;
    }
    label188: 
    while (true)
    {
      if (!str2.startsWith("+"))
        paramString = "+" + paramString + " " + str2;
      while (true)
      {
        str2 = paramString;
        if (paramString.length() > 25)
          str2 = paramString.substring(0, 25) + "...";
        AppMethodBeat.o(22460);
        return str2;
        paramString = "+" + paramString + " " + str2.replace("+", "");
        continue;
        paramString = av.amM(str1);
      }
    }
  }

  public static String Px(String paramString)
  {
    AppMethodBeat.i(22463);
    if (nGY.size() == 0)
      bIL();
    Object localObject = paramString;
    if (Pu(paramString))
    {
      paramString = c.PA(Pv(paramString));
      localObject = new ArrayList(nGY.keySet());
      Collections.sort((List)localObject, Collections.reverseOrder(new a.a((byte)0)));
      Iterator localIterator = ((List)localObject).iterator();
      do
      {
        localObject = paramString;
        if (!localIterator.hasNext())
          break;
        localObject = (String)localIterator.next();
      }
      while (!paramString.startsWith((String)localObject));
      localObject = paramString.substring(((String)localObject).length());
      AppMethodBeat.o(22463);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(22463);
    }
  }

  public static ArrayList<String> Py(String paramString)
  {
    AppMethodBeat.i(22465);
    ArrayList localArrayList = new ArrayList();
    if (!com.tencent.mm.pluginsdk.permission.b.o(ah.getContext(), "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.IPCallAddressUtil", "no contact permission");
      AppMethodBeat.o(22465);
    }
    while (true)
    {
      return localArrayList;
      paramString = ah.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "data1 LIKE ?", new String[] { "%" + paramString + "%" }, null);
      try
      {
        if (paramString.moveToFirst())
          while (!paramString.isAfterLast())
          {
            localArrayList.add(paramString.getString(paramString.getColumnIndex("contact_id")));
            paramString.moveToNext();
          }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.IPCallAddressUtil", "getQueryPhoneNumberContactIdList error: %s", new Object[] { localException.getMessage() });
        if (paramString != null)
          paramString.close();
        while (true)
        {
          AppMethodBeat.o(22465);
          break;
          if (paramString != null)
            paramString.close();
        }
      }
      finally
      {
        if (paramString != null)
          paramString.close();
        AppMethodBeat.o(22465);
      }
    }
  }

  public static String aE(Context paramContext, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Cursor localCursor = null;
    AppMethodBeat.i(22440);
    if (!com.tencent.mm.pluginsdk.permission.b.o(paramContext, "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.IPCallAddressUtil", "no contact permission");
      AppMethodBeat.o(22440);
      paramString = localCursor;
    }
    while (true)
    {
      return paramString;
      localCursor = paramContext.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] { "contact_id", "data1" }, null, null, null);
      paramContext = localObject1;
      if (localCursor != null)
        paramContext = localObject1;
      try
      {
        if (localCursor.moveToFirst());
        while (true)
        {
          paramContext = localObject1;
          if (!localCursor.isAfterLast())
          {
            if (PhoneNumberUtils.compare(com.tencent.mm.pluginsdk.a.ws(paramString), localCursor.getString(1)))
              paramContext = localCursor.getString(0);
          }
          else
          {
            paramString = paramContext;
            if (localCursor != null)
            {
              localCursor.close();
              paramString = paramContext;
            }
            AppMethodBeat.o(22440);
            break;
          }
          localCursor.moveToNext();
        }
      }
      catch (Exception paramContext)
      {
        while (true)
        {
          ab.d("MicroMsg.IPCallAddressUtil", "getNicknameByPhonenumber, error: %s", new Object[] { paramContext.getMessage() });
          paramString = localObject2;
          if (localCursor != null)
          {
            localCursor.close();
            paramString = localObject2;
          }
        }
      }
      finally
      {
        if (localCursor != null)
          localCursor.close();
        AppMethodBeat.o(22440);
      }
    }
    throw paramContext;
  }

  public static String aF(Context paramContext, String paramString)
  {
    AppMethodBeat.i(22441);
    paramString = aE(paramContext, paramString);
    if (!bo.isNullOrNil(paramString))
    {
      paramContext = com.tencent.mm.pluginsdk.a.i(paramString, paramContext);
      AppMethodBeat.o(22441);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(22441);
    }
  }

  public static String aG(Context paramContext, String paramString)
  {
    AppMethodBeat.i(22442);
    if (!bo.isNullOrNil(paramString))
    {
      paramContext = com.tencent.mm.pluginsdk.a.i(paramString, paramContext);
      AppMethodBeat.o(22442);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(22442);
    }
  }

  public static Bitmap aH(Context paramContext, String paramString)
  {
    AppMethodBeat.i(22443);
    paramContext = g(paramContext, paramString, false);
    AppMethodBeat.o(22443);
    return paramContext;
  }

  public static Bitmap aI(Context paramContext, String paramString)
  {
    AppMethodBeat.i(22445);
    String str = aE(paramContext, paramString);
    Bitmap localBitmap = null;
    if (!bo.isNullOrNil(str))
      localBitmap = g(paramContext, str, true);
    paramContext = localBitmap;
    if (localBitmap == null)
    {
      paramContext = localBitmap;
      if (apV())
      {
        paramString = Pn(paramString);
        ab.d("MicroMsg.IPCallAddressUtil", "getAvatarByPhoneNumber, username: %s", new Object[] { paramString });
        paramContext = localBitmap;
        if (!bo.isNullOrNil(paramString))
          paramContext = com.tencent.mm.ah.b.d(paramString, 320, 320, 4);
      }
    }
    AppMethodBeat.o(22445);
    return paramContext;
  }

  public static boolean apV()
  {
    AppMethodBeat.i(22464);
    aw localaw = new aw();
    com.tencent.mm.sdk.b.a.xxA.m(localaw);
    ab.d("MicroMsg.IPCallAddressUtil", "canSyncAddrBook: %b", new Object[] { Boolean.valueOf(localaw.ctZ.csN) });
    boolean bool = localaw.ctZ.csN;
    AppMethodBeat.o(22464);
    return bool;
  }

  private static void bIL()
  {
    AppMethodBeat.i(22449);
    nGY.clear();
    nGZ.clear();
    nHa.clear();
    nHb.clear();
    nGX.clear();
    Object localObject1 = null;
    String str3;
    for (Object localObject2 = null; ; str3 = "")
      try
      {
        InputStream localInputStream = ah.getContext().getAssets().open("ipcall_country_code.txt");
        localObject2 = localInputStream;
        localObject1 = localInputStream;
        localObject5 = new byte[localInputStream.available()];
        localObject2 = localInputStream;
        localObject1 = localInputStream;
        localInputStream.read((byte[])localObject5);
        localObject2 = localInputStream;
        localObject1 = localInputStream;
        Object localObject6 = new java/lang/String;
        localObject2 = localInputStream;
        localObject1 = localInputStream;
        ((String)localObject6).<init>((byte[])localObject5);
        localObject2 = localObject6;
        if (localInputStream != null);
        try
        {
          localInputStream.close();
          localObject2 = localObject6;
          localObject6 = localObject2.trim().split("\n");
          for (int i = 0; ; i++)
          {
            if (i >= localObject6.length)
              break label451;
            localObject5 = localObject6[i].trim().split(" ");
            if (localObject5.length >= 2)
              break;
            ab.e("MicroMsg.IPCallAddressUtil", "this country item has problem %s", new Object[] { localObject6[i] });
          }
        }
        catch (IOException localIOException2)
        {
          while (true)
          {
            ab.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { bo.l(localIOException2) });
            localObject3 = localObject6;
          }
        }
      }
      catch (IOException localIOException4)
      {
        while (true)
        {
          Object localObject3;
          localObject1 = localObject3;
          ab.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { bo.l(localIOException4) });
          if (localObject3 == null)
            break;
          try
          {
            ((InputStream)localObject3).close();
            localObject3 = "";
          }
          catch (IOException localIOException3)
          {
            ab.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { bo.l(localIOException3) });
            String str2 = "";
          }
        }
      }
      finally
      {
        while (true)
        {
          Object localObject5;
          if (localObject1 != null);
          try
          {
            localObject1.close();
            AppMethodBeat.o(22449);
            throw localObject4;
          }
          catch (IOException localIOException1)
          {
            while (true)
              ab.e("MicroMsg.IPCallAddressUtil", "exception:%s", new Object[] { bo.l(localIOException1) });
          }
          b localb = new b();
          localb.nHc = localObject5[0];
          localb.nHd = localObject5[1];
          RegionCodeDecoder.duj();
          String str1 = RegionCodeDecoder.getLocName(localObject5[0]);
          str3 = str1;
          if (bo.isNullOrNil(str1))
            str3 = new Locale("", localObject5[0]).getDisplayCountry(ah.getResources().getConfiguration().locale);
          localb.nHe = str3;
          nHa.put(localb.nHd, localb.nHc);
          nHb.put(localb.nHc, localb.nHd);
          nGY.put(localb.nHd, localb.nHe);
          nGZ.put(localb.nHe, localb.nHd);
          nGX.put(localb.nHc, localb);
        }
        label451: AppMethodBeat.o(22449);
        return;
      }
  }

  public static HashMap<String, b> bIM()
  {
    AppMethodBeat.i(22450);
    if (nGX.size() == 0)
      bIL();
    HashMap localHashMap = nGX;
    AppMethodBeat.o(22450);
    return localHashMap;
  }

  public static String bIN()
  {
    AppMethodBeat.i(22461);
    if (nGZ.size() == 0)
      bIL();
    String str = bo.gQ(ah.getContext());
    if (!bo.isNullOrNil(str))
    {
      ab.i("MicroMsg.IPCallAddressUtil", "simCountryCode: %s", new Object[] { str });
      str = str.toUpperCase();
      str = (String)nHb.get(str);
      if (!bo.isNullOrNil(str))
      {
        ab.i("MicroMsg.IPCallAddressUtil", "final sim countryCode: %s", new Object[] { str });
        if (bo.isNullOrNil(str))
          break label108;
        AppMethodBeat.o(22461);
      }
    }
    while (true)
    {
      return str;
      str = "";
      break;
      label108: str = bp.aao().countryCode;
      ab.i("MicroMsg.IPCallAddressUtil", "personalInfoCountryCode: %s", new Object[] { str });
      if (!bo.isNullOrNil(str))
      {
        str = (String)nHb.get(str);
        if (!bo.isNullOrNil(str))
        {
          ab.i("MicroMsg.IPCallAddressUtil", "final sim countryCode: %s", new Object[] { str });
          AppMethodBeat.o(22461);
        }
      }
      else
      {
        str = ah.getContext().getString(2131298790);
        ab.i("MicroMsg.IPCallAddressUtil", "fallbackCountryCode: %s", new Object[] { str });
        str = str.replace("+", "");
        AppMethodBeat.o(22461);
      }
    }
  }

  public static void bIO()
  {
    AppMethodBeat.i(22462);
    bIL();
    AppMethodBeat.o(22462);
  }

  public static int eO(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22454);
    int i;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(22454);
      i = -1;
    }
    while (true)
    {
      return i;
      int j = eP(paramString1, paramString2);
      i = j;
      if (j == -1)
      {
        i = j;
        if (paramString2.startsWith("+"))
        {
          String str1 = Ps(paramString2);
          String str2 = paramString2;
          if (!bo.isNullOrNil(str1))
            str2 = paramString2.substring("+".concat(String.valueOf(str1)).length());
          i = eP(paramString1, str2);
        }
      }
      AppMethodBeat.o(22454);
    }
  }

  private static int eP(String paramString1, String paramString2)
  {
    AppMethodBeat.i(22455);
    int i;
    if (!com.tencent.mm.pluginsdk.permission.b.o(ah.getContext(), "android.permission.READ_CONTACTS"))
    {
      ab.e("MicroMsg.IPCallAddressUtil", "no contact permission");
      AppMethodBeat.o(22455);
      i = -1;
    }
    while (true)
    {
      return i;
      paramString1 = ah.getContext().getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new String[] { paramString1 }, null);
      paramString2 = c.PA(paramString2);
      try
      {
        if (paramString1.moveToFirst())
          while (true)
          {
            if (paramString1.isAfterLast())
              break label188;
            i = paramString1.getInt(paramString1.getColumnIndex("data2"));
            boolean bool = c.PA(paramString1.getString(paramString1.getColumnIndex("data1"))).equals(paramString2);
            if (bool)
            {
              paramString1.close();
              AppMethodBeat.o(22455);
              break;
            }
            paramString1.moveToNext();
          }
      }
      catch (Exception paramString2)
      {
        ab.e("MicroMsg.IPCallAddressUtil", "getPhoneTypeByContactIdAndPhoneNumber error: %s", new Object[] { paramString2.getMessage() });
        paramString1.close();
        while (true)
        {
          AppMethodBeat.o(22455);
          i = -1;
          break;
          label188: paramString1.close();
        }
      }
      finally
      {
        paramString1.close();
        AppMethodBeat.o(22455);
      }
    }
    throw paramString2;
  }

  public static Bitmap g(Context paramContext, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(22444);
    if (!bo.isNullOrNil(paramString))
    {
      paramContext = com.tencent.mm.pluginsdk.a.a(paramString, paramContext, paramBoolean);
      AppMethodBeat.o(22444);
    }
    while (true)
    {
      return paramContext;
      paramContext = null;
      AppMethodBeat.o(22444);
    }
  }

  public static String xx(int paramInt)
  {
    AppMethodBeat.i(22448);
    Object localObject = ah.getContext();
    switch (paramInt)
    {
    case 3:
    case 6:
    case 7:
    case 8:
    case 9:
    default:
      localObject = ((Context)localObject).getString(2131301946);
      AppMethodBeat.o(22448);
    case 1:
    case 2:
    case 10:
    case 4:
    case 5:
    }
    while (true)
    {
      return localObject;
      localObject = ((Context)localObject).getString(2131301943);
      AppMethodBeat.o(22448);
      continue;
      localObject = ((Context)localObject).getString(2131301945);
      AppMethodBeat.o(22448);
      continue;
      localObject = ((Context)localObject).getString(2131301941);
      AppMethodBeat.o(22448);
      continue;
      localObject = ((Context)localObject).getString(2131301942);
      AppMethodBeat.o(22448);
      continue;
      localObject = ((Context)localObject).getString(2131301944);
      AppMethodBeat.o(22448);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.b.a
 * JD-Core Version:    0.6.2
 */