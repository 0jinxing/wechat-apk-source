package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class lg extends ListView
{
  private lg.a a;

  public lg(Context paramContext)
  {
    super(paramContext);
  }

  protected void handleDataChanged()
  {
    AppMethodBeat.i(100358);
    super.handleDataChanged();
    if (this.a != null)
      this.a.c();
    AppMethodBeat.o(100358);
  }

  public void setOnDataChangedListener(lg.a parama)
  {
    this.a = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lg
 * JD-Core Version:    0.6.2
 */