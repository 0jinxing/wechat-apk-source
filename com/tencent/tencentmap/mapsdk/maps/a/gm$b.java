package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.map.lib.MapLanguage;
import com.tencent.map.lib.listener.MapLanguageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

class gm$b
{
  private List<MapLanguageChangeListener> b;

  public gm$b(gm paramgm)
  {
    AppMethodBeat.i(99290);
    this.b = new CopyOnWriteArrayList();
    AppMethodBeat.o(99290);
  }

  public MapLanguage a()
  {
    AppMethodBeat.i(99291);
    MapLanguage localMapLanguage;
    if (gm.a(this.a) == null)
    {
      localMapLanguage = MapLanguage.LAN_CHINESE;
      AppMethodBeat.o(99291);
    }
    while (true)
    {
      return localMapLanguage;
      if (gm.a(this.a).B() == 1)
      {
        localMapLanguage = MapLanguage.LAN_ENGLISH;
        AppMethodBeat.o(99291);
      }
      else
      {
        localMapLanguage = MapLanguage.LAN_CHINESE;
        AppMethodBeat.o(99291);
      }
    }
  }

  public void a(MapLanguageChangeListener paramMapLanguageChangeListener)
  {
    AppMethodBeat.i(99292);
    if (paramMapLanguageChangeListener == null)
      AppMethodBeat.o(99292);
    while (true)
    {
      return;
      synchronized (this.b)
      {
        if (!this.b.contains(paramMapLanguageChangeListener))
          this.b.add(paramMapLanguageChangeListener);
        AppMethodBeat.o(99292);
      }
    }
  }

  public void b(MapLanguageChangeListener paramMapLanguageChangeListener)
  {
    AppMethodBeat.i(99293);
    if (paramMapLanguageChangeListener == null)
      AppMethodBeat.o(99293);
    while (true)
    {
      return;
      synchronized (this.b)
      {
        if (this.b.contains(paramMapLanguageChangeListener))
          this.b.remove(paramMapLanguageChangeListener);
        AppMethodBeat.o(99293);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.gm.b
 * JD-Core Version:    0.6.2
 */