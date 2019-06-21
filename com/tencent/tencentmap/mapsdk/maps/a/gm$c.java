package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.MapLanguage;
import com.tencent.map.lib.basemap.data.GeoPoint;
import com.tencent.map.lib.listener.MapLanguageChangeListener;
import com.tencent.map.lib.mapstructure.MapRouteSectionWithName;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

class gm$c
  implements MapLanguageChangeListener
{
  private List<MapRouteSectionWithName> b;
  private List<GeoPoint> c;

  public gm$c(gm paramgm)
  {
    AppMethodBeat.i(99294);
    paramgm.a(this);
    AppMethodBeat.o(99294);
  }

  public void a()
  {
    AppMethodBeat.i(99295);
    this.a.b(this);
    AppMethodBeat.o(99295);
  }

  public void a(List<MapRouteSectionWithName> paramList, List<GeoPoint> paramList1)
  {
    AppMethodBeat.i(99296);
    this.b = paramList;
    this.c = paramList1;
    gm.a(this.a).a(paramList, paramList1);
    AppMethodBeat.o(99296);
  }

  public void b()
  {
    AppMethodBeat.i(99297);
    gm.a(this.a).A();
    this.b = null;
    this.c = null;
    AppMethodBeat.o(99297);
  }

  public void onLanguageChange(MapLanguage paramMapLanguage)
  {
    AppMethodBeat.i(99298);
    if (paramMapLanguage == MapLanguage.LAN_CHINESE)
    {
      if ((this.b == null) || (this.c == null))
        break label60;
      gm.a(this.a).a(this.b, this.c);
      AppMethodBeat.o(99298);
    }
    while (true)
    {
      return;
      gm.a(this.a).A();
      label60: AppMethodBeat.o(99298);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gm.c
 * JD-Core Version:    0.6.2
 */