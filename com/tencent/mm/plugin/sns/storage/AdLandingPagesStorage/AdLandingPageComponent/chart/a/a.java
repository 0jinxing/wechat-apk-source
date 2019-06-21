package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a;

import android.text.Spannable;
import android.view.animation.Interpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class a extends LinkedHashMap<Spannable, Float>
{
  public long duration;
  public b qXF;
  public Interpolator qXG;
  private String qXH;

  public a()
  {
    AppMethodBeat.i(36954);
    this.qXF = new b();
    this.qXG = null;
    this.duration = 0L;
    this.qXH = "";
    AppMethodBeat.o(36954);
  }

  public a(b paramb)
  {
    AppMethodBeat.i(36955);
    this.qXF = new b();
    this.qXG = null;
    this.duration = 0L;
    this.qXH = "";
    this.qXF = paramb;
    AppMethodBeat.o(36955);
  }

  public final boolean a(a parama)
  {
    AppMethodBeat.i(36956);
    boolean bool;
    if (size() != parama.size())
    {
      AppMethodBeat.o(36956);
      bool = false;
    }
    while (true)
    {
      return bool;
      parama = parama.entrySet().iterator();
      while (true)
        if (parama.hasNext())
          if (!containsKey(((Map.Entry)parama.next()).getKey()))
          {
            AppMethodBeat.o(36956);
            bool = false;
            break;
          }
      bool = true;
      AppMethodBeat.o(36956);
    }
  }

  public final Spannable[] cpi()
  {
    AppMethodBeat.i(36957);
    Object localObject = new ArrayList();
    Iterator localIterator = entrySet().iterator();
    while (localIterator.hasNext())
      ((ArrayList)localObject).add(((Map.Entry)localIterator.next()).getKey());
    localObject = (Spannable[])((ArrayList)localObject).toArray(new Spannable[((ArrayList)localObject).size()]);
    AppMethodBeat.o(36957);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.a.a
 * JD-Core Version:    0.6.2
 */