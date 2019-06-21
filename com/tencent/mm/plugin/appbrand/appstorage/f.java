package com.tencent.mm.plugin.appbrand.appstorage;

import a.f.a.b;
import a.f.b.j;
import a.f.b.u.b;
import a.k.k;
import a.l;
import a.v;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandMMKVStorage;", "Lcom/tencent/mm/plugin/appbrand/appstorage/IAppBrandKVStorage;", "()V", "MMKV", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "NAME", "", "NORMAL_VALUE_TYPE_SEPARATOR", "getter", "Lkotlin/Function1;", "setter", "Lkotlin/Function2;", "", "appendTotalDataSize", "", "storageId", "appId", "size", "clear", "clearAll", "generateValue", "data", "dataType", "get", "", "", "key", "(ILjava/lang/String;Ljava/lang/String;)[Ljava/lang/Object;", "getAllStorageId", "", "getDataSize", "recordKey", "getQuota", "getTotalDataSize", "getTotalDataSizeAll", "info", "(ILjava/lang/String;)[Ljava/lang/Object;", "keys", "block", "keysSize", "remove", "Lcom/tencent/mm/plugin/appbrand/appstorage/IAppBrandKVStorage$ErrorType;", "set", "setTotalDataSize", "splitValue", "Lcom/tencent/mm/plugin/appbrand/appstorage/AppBrandMMKVStorage$StorageInfo;", "str", "willReachQuota", "", "StorageInfo", "luggage-wechat-full-sdk_release"})
public final class f
  implements n
{
  private static final b<String, String> gXb;
  private static final a.f.a.m<String, String, y> gXc;
  private static final as gXu;
  public static final f gXv;

  static
  {
    AppMethodBeat.i(102456);
    gXv = new f();
    as localas = as.amF("AppBrandMMKVStorage");
    j.o(localas, "MultiProcessMMKV.getMMKV(NAME)");
    gXu = localas;
    gXb = (b)f.c.gXx;
    gXc = (a.f.a.m)f.e.gXz;
    AppMethodBeat.o(102456);
  }

  public static void F(int paramInt, String paramString)
  {
    AppMethodBeat.i(102449);
    j.p(paramString, "appId");
    if (paramInt == 0);
    for (String str = paramString + "__"; ; str = String.valueOf(paramInt) + "__" + paramString + "__")
    {
      String[] arrayOfString1 = gXu.allKeys();
      String[] arrayOfString2 = arrayOfString1;
      if (arrayOfString1 == null);
      for (arrayOfString1 : new String[0])
      {
        j.o(arrayOfString1, "key");
        if (a.k.m.jb(arrayOfString1, str))
          gXu.remove(arrayOfString1);
      }
    }
    e(paramInt, paramString, 0);
    r.b(paramString, paramInt, gXb, gXc);
    AppMethodBeat.o(102449);
  }

  public static Object[] G(int paramInt, String paramString)
  {
    AppMethodBeat.i(102451);
    j.p(paramString, "appId");
    List localList = (List)new ArrayList();
    if (paramInt == 0);
    for (String str = paramString + "__"; ; str = String.valueOf(paramInt) + "__" + paramString + "__")
    {
      String[] arrayOfString1 = gXu.allKeys();
      String[] arrayOfString2 = arrayOfString1;
      if (arrayOfString1 == null);
      for (arrayOfString1 : new String[0])
      {
        j.o(arrayOfString1, "key");
        if (a.k.m.jb(arrayOfString1, str))
          localList.add(a.k.m.i(arrayOfString1, str, "", false));
      }
    }
    ??? = H(paramInt, paramString);
    paramInt = r.I(paramInt, paramString);
    AppMethodBeat.o(102451);
    return new Object[] { localList, Integer.valueOf(???), Integer.valueOf(paramInt) };
  }

  private static int H(int paramInt, String paramString)
  {
    AppMethodBeat.i(102452);
    paramString = r.c(paramInt, paramString, "@@@TOTAL@DATA@SIZE@@@", "++");
    paramInt = bo.getInt(gXu.getString(paramString, ""), 0);
    AppMethodBeat.o(102452);
    return paramInt;
  }

  private static void a(String paramString, b<? super String, y> paramb)
  {
    AppMethodBeat.i(102453);
    j.p(paramString, "appId");
    j.p(paramb, "block");
    k localk = new k("^([1-9]\\d*__)?" + paramString + "__.+$");
    paramString = gXu.allKeys();
    if (paramString == null)
      paramString = new String[0];
    while (true)
    {
      int i = paramString.length;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramString[j];
        j.o(localObject, "key");
        if (localk.aq((CharSequence)localObject))
          paramb.am(localObject);
      }
      AppMethodBeat.o(102453);
      return;
    }
  }

  public static n.a b(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(102443);
    j.p(paramString1, "appId");
    j.p(paramString2, "key");
    j.p(paramString4, "dataType");
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = n.a.gXX;
      AppMethodBeat.o(102443);
    }
    while (true)
    {
      return paramString1;
      String str = r.c(paramInt, paramString1, paramString2, "__");
      int i = xU(str);
      int j = r.by(paramString2, paramString3);
      int k = j - i;
      if (H(paramInt, paramString1) + k >= r.I(paramInt, paramString1));
      for (i = 1; ; i = 0)
      {
        if (i == 0)
          break label122;
        paramString1 = n.a.gXZ;
        AppMethodBeat.o(102443);
        break;
      }
      label122: gXu.putString(str, paramString4 + "#" + j + "#" + paramString3);
      f(paramInt, paramString1, k);
      r.a(paramString1, paramInt, gXb, gXc);
      paramString1 = n.a.gXV;
      AppMethodBeat.o(102443);
    }
  }

  private static void e(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(102444);
    paramString = r.c(paramInt1, paramString, "@@@TOTAL@DATA@SIZE@@@", "++");
    gXu.putString(paramString, String.valueOf(paramInt2));
    AppMethodBeat.o(102444);
  }

  private static int f(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(102445);
    paramInt2 = Math.max(0, H(paramInt1, paramString) + paramInt2);
    e(paramInt1, paramString, paramInt2);
    AppMethodBeat.o(102445);
    return paramInt2;
  }

  public static Object[] k(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102442);
    j.p(paramString1, "appId");
    j.p(paramString2, "key");
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = new Object[1];
      paramString1[0] = n.a.gXX;
      AppMethodBeat.o(102442);
    }
    while (true)
    {
      return paramString1;
      paramString1 = r.c(paramInt, paramString1, paramString2, "__");
      paramString2 = gXu.getString(paramString1, "");
      paramString1 = paramString2;
      if (paramString2 == null)
        paramString1 = "";
      paramString2 = yb(paramString1);
      if (((CharSequence)paramString2.data).length() == 0)
      {
        paramInt = 1;
        label101: if (paramInt == 0)
          break label202;
        if (((CharSequence)paramString2.type).length() != 0)
          break label192;
        paramInt = 1;
        label122: if (paramInt == 0)
          break label202;
        if (((CharSequence)paramString2.size).length() != 0)
          break label197;
        paramInt = 1;
        label143: if (paramInt == 0)
          break label202;
      }
      label192: label197: label202: for (paramInt = 1; ; paramInt = 0)
      {
        if (paramInt != 0)
          break label207;
        paramString1 = new Object[3];
        paramString1[0] = n.a.gXV;
        paramString1[1] = paramString2.data;
        paramString1[2] = paramString2.type;
        AppMethodBeat.o(102442);
        break;
        paramInt = 0;
        break label101;
        paramInt = 0;
        break label122;
        paramInt = 0;
        break label143;
      }
      label207: paramString1 = r.gYb;
      AppMethodBeat.o(102442);
    }
  }

  public static n.a l(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(102448);
    j.p(paramString1, "appId");
    j.p(paramString2, "key");
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = n.a.gXX;
      AppMethodBeat.o(102448);
    }
    while (true)
    {
      return paramString1;
      paramString2 = r.c(paramInt, paramString1, paramString2, "__");
      int i = f(paramInt, paramString1, -xU(paramString2));
      gXu.remove(paramString2);
      if (i <= 0)
        r.b(paramString1, paramInt, gXb, gXc);
      paramString1 = n.a.gXV;
      AppMethodBeat.o(102448);
    }
  }

  public static void xR(String paramString)
  {
    AppMethodBeat.i(102450);
    j.p(paramString, "appId");
    j.p(paramString, "appId");
    int[] arrayOfInt = r.a(paramString, gXb, gXc);
    int i = arrayOfInt.length;
    for (int j = 0; j < i; j++)
      e(arrayOfInt[j], paramString, 0);
    a(paramString, (b)f.b.gXw);
    r.b(paramString, gXb, gXc);
    AppMethodBeat.o(102450);
  }

  public static int xT(String paramString)
  {
    AppMethodBeat.i(102455);
    j.p(paramString, "appId");
    int[] arrayOfInt = r.a(paramString, gXb, gXc);
    int i = arrayOfInt.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m + k)
    {
      m = H(arrayOfInt[j], paramString);
      j++;
    }
    AppMethodBeat.o(102455);
    return k;
  }

  private static int xU(String paramString)
  {
    AppMethodBeat.i(102446);
    String str = gXu.getString(paramString, "");
    paramString = str;
    if (str == null)
      paramString = "";
    int i = Integer.parseInt(yb(paramString).size);
    AppMethodBeat.o(102446);
    return i;
  }

  private static f.a yb(String paramString)
  {
    AppMethodBeat.i(102447);
    paramString = (CharSequence)paramString;
    paramString = (Collection)new k("#").r(paramString, 3);
    if (paramString == null)
    {
      paramString = new v("null cannot be cast to non-null type java.util.Collection<T>");
      AppMethodBeat.o(102447);
      throw paramString;
    }
    paramString = paramString.toArray(new String[0]);
    if (paramString == null)
    {
      paramString = new v("null cannot be cast to non-null type kotlin.Array<T>");
      AppMethodBeat.o(102447);
      throw paramString;
    }
    paramString = (String[])paramString;
    if (paramString.length == 3)
    {
      paramString = new f.a(paramString[2], paramString[0], paramString[1]);
      AppMethodBeat.o(102447);
    }
    while (true)
    {
      return paramString;
      paramString = new f.a("", "", "0");
      AppMethodBeat.o(102447);
    }
  }

  public static int yc(String paramString)
  {
    AppMethodBeat.i(102454);
    j.p(paramString, "appId");
    u.b localb = new u.b();
    localb.AVD = 0;
    a(paramString, (b)new f.d(localb));
    int i = localb.AVD;
    AppMethodBeat.o(102454);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.f
 * JD-Core Version:    0.6.2
 */