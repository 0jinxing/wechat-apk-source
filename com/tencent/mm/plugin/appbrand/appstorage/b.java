package com.tencent.mm.plugin.appbrand.appstorage;

import a.f.a.m;
import a.y;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

public final class b extends j<a>
  implements n
{
  public static final String[] fnj;
  private e gTC;
  private a.f.a.b<String, String> gXb;
  private m<String, String, y> gXc;

  static
  {
    AppMethodBeat.i(101779);
    fnj = new String[] { j.a(a.ccO, "AppBrandKVData"), "DROP TABLE IF EXISTS AppBrandStorageKVData;" };
    AppMethodBeat.o(101779);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "AppBrandKVData", null);
    AppMethodBeat.i(101763);
    this.gXb = new b.1(this);
    this.gXc = new b.2(this);
    this.gTC = parame;
    AppMethodBeat.o(101763);
  }

  private int H(int paramInt, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(101772);
    a locala = new a();
    locala.field_key = r.m(paramInt, paramString, "@@@TOTAL@DATA@SIZE@@@");
    if (super.b(locala, new String[0]))
    {
      paramInt = bo.getInt(locala.field_data, 0);
      AppMethodBeat.o(101772);
    }
    while (true)
    {
      return paramInt;
      AppMethodBeat.o(101772);
      paramInt = i;
    }
  }

  private void aA(String paramString, int paramInt)
  {
    AppMethodBeat.i(101770);
    r.b(paramString, paramInt, this.gXb, this.gXc);
    AppMethodBeat.o(101770);
  }

  private void e(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(101774);
    a locala = new a();
    locala.field_key = r.m(paramInt1, paramString, "@@@TOTAL@DATA@SIZE@@@");
    locala.field_data = String.valueOf(paramInt2);
    super.a(locala);
    AppMethodBeat.o(101774);
  }

  private int f(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(101775);
    paramInt2 = Math.max(0, H(paramInt1, paramString) + paramInt2);
    e(paramInt1, paramString, paramInt2);
    AppMethodBeat.o(101775);
    return paramInt2;
  }

  private int xU(String paramString)
  {
    AppMethodBeat.i(101776);
    paramString = this.gTC.a("AppBrandKVData", new String[] { "size" }, "key = ?", new String[] { paramString }, null, null, null, 2);
    int i;
    if (paramString.moveToFirst())
    {
      i = paramString.getInt(0);
      paramString.close();
      AppMethodBeat.o(101776);
    }
    while (true)
    {
      return i;
      paramString.close();
      AppMethodBeat.o(101776);
      i = 0;
    }
  }

  public final void F(int paramInt, String paramString)
  {
    AppMethodBeat.i(101767);
    if (paramInt == 0);
    for (String str = paramString + "__"; ; str = paramInt + "__" + paramString + "__")
    {
      aA(paramString, paramInt);
      this.gTC.delete("AppBrandKVData", String.format("%s like ? escape ? OR %s=?", new Object[] { "key", "key" }), new String[] { str.replace("_", "\\_") + "%", "\\", r.m(paramInt, paramString, "@@@TOTAL@DATA@SIZE@@@") });
      AppMethodBeat.o(101767);
      return;
    }
  }

  public final Object[] G(int paramInt, String paramString)
  {
    AppMethodBeat.i(101771);
    if (paramInt == 0);
    Object localObject1;
    Object localObject2;
    for (String str = paramString + "__"; ; str = paramInt + "__" + paramString + "__")
    {
      localObject1 = this.gTC;
      localObject2 = str.replace("_", "\\_") + "%";
      localObject1 = ((e)localObject1).a("AppBrandKVData", new String[] { "key" }, "key like ? escape ?", new String[] { localObject2, "\\" }, null, null, null, 2);
      localObject2 = new ArrayList();
      while (((Cursor)localObject1).moveToNext())
        ((ArrayList)localObject2).add(((Cursor)localObject1).getString(0).replace(str, ""));
    }
    ((Cursor)localObject1).close();
    int i = H(paramInt, paramString);
    paramInt = r.I(paramInt, paramString);
    AppMethodBeat.o(101771);
    return new Object[] { localObject2, Integer.valueOf(i), Integer.valueOf(paramInt) };
  }

  public final n.a b(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(101765);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = n.a.gXX;
      AppMethodBeat.o(101765);
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
          break label106;
        paramString1 = n.a.gXZ;
        AppMethodBeat.o(101765);
        break;
      }
      label106: paramString2 = new a();
      paramString2.field_key = str;
      paramString2.field_data = paramString3;
      paramString2.field_dataType = paramString4;
      paramString2.field_size = j;
      if (super.a(paramString2))
      {
        r.a(paramString1, paramInt, this.gXb, this.gXc);
        f(paramInt, paramString1, k);
        paramString1 = n.a.gXV;
        AppMethodBeat.o(101765);
      }
      else
      {
        paramString1 = n.a.gXW;
        AppMethodBeat.o(101765);
      }
    }
  }

  public final Object[] k(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(101764);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = new Object[1];
      paramString1[0] = n.a.gXX;
      AppMethodBeat.o(101764);
    }
    while (true)
    {
      return paramString1;
      a locala = new a();
      locala.field_key = r.c(paramInt, paramString1, paramString2, "__");
      if (super.b(locala, new String[0]))
      {
        paramString1 = new Object[3];
        paramString1[0] = n.a.gXV;
        paramString1[1] = locala.field_data;
        paramString1[2] = locala.field_dataType;
        AppMethodBeat.o(101764);
      }
      else
      {
        paramString1 = r.gYb;
        AppMethodBeat.o(101764);
      }
    }
  }

  public final n.a l(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(101766);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      paramString1 = n.a.gXX;
      AppMethodBeat.o(101766);
    }
    while (true)
    {
      return paramString1;
      paramString2 = r.c(paramInt, paramString1, paramString2, "__");
      int i = f(paramInt, paramString1, -xU(paramString2));
      a locala = new a();
      locala.field_key = paramString2;
      super.a(locala, new String[0]);
      if (i <= 0)
        aA(paramString1, paramInt);
      paramString1 = n.a.gXV;
      AppMethodBeat.o(101766);
    }
  }

  public final void xR(String paramString)
  {
    AppMethodBeat.i(101768);
    for (int i = 0; i <= 1; i++)
      F(i, paramString);
    AppMethodBeat.o(101768);
  }

  public final int[] xS(String paramString)
  {
    AppMethodBeat.i(101769);
    paramString = r.a(paramString, this.gXb, this.gXc);
    AppMethodBeat.o(101769);
    return paramString;
  }

  public final int xT(String paramString)
  {
    AppMethodBeat.i(101773);
    int[] arrayOfInt = xS(paramString);
    int i = arrayOfInt.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m + k)
    {
      m = H(arrayOfInt[j], paramString);
      j++;
    }
    AppMethodBeat.o(101773);
    return k;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appstorage.b
 * JD-Core Version:    0.6.2
 */