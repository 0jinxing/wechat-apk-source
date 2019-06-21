package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public enum a$a
{
  public final int code;

  static
  {
    AppMethodBeat.i(125812);
    vaU = new a("TencentMap", 0, 0);
    vaV = new a("GoogleMap", 1, 1);
    vaW = new a("SogouMap", 2, 2);
    vaX = new a("BaiduMap", 3, 3);
    vaY = new a("AutonaviMap", 4, 4);
    vaZ = new a[] { vaU, vaV, vaW, vaX, vaY };
    AppMethodBeat.o(125812);
  }

  private a$a(int paramInt)
  {
    this.code = paramInt;
  }

  public static a Ko(int paramInt)
  {
    a locala;
    switch (paramInt)
    {
    default:
      locala = vaU;
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return locala;
      locala = vaU;
      continue;
      locala = vaV;
      continue;
      locala = vaW;
      continue;
      locala = vaX;
      continue;
      locala = vaY;
    }
  }

  public final String getPackage()
  {
    AppMethodBeat.i(125811);
    String str;
    switch (a.1.vaT[ordinal()])
    {
    default:
      str = "com.tencent.map";
      AppMethodBeat.o(125811);
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      return str;
      str = "com.tencent.map";
      AppMethodBeat.o(125811);
      continue;
      str = "com.google.android.apps.maps";
      AppMethodBeat.o(125811);
      continue;
      str = "com.sogou.map.android.maps";
      AppMethodBeat.o(125811);
      continue;
      str = "com.baidu.BaiduMap";
      AppMethodBeat.o(125811);
      continue;
      str = "com.autonavi.minimap";
      AppMethodBeat.o(125811);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.a.a
 * JD-Core Version:    0.6.2
 */