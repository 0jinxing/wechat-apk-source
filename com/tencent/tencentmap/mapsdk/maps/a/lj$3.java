package com.tencent.tencentmap.mapsdk.maps.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.bi.a;

class lj$3
  implements View.OnClickListener
{
  lj$3(lj paramlj)
  {
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(100414);
    if (lj.b(this.a) != null)
      lj.b(this.a).a();
    AppMethodBeat.o(100414);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.lj.3
 * JD-Core Version:    0.6.2
 */