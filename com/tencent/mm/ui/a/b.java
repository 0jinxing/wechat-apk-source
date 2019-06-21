package com.tencent.mm.ui.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
{
  private final String TAG;
  private List<String> yqZ;

  public b()
  {
    AppMethodBeat.i(106140);
    this.TAG = "MicroMsg.Accessibility.Tool";
    this.yqZ = new ArrayList();
    AppMethodBeat.o(106140);
  }

  public final b aqI(String paramString)
  {
    AppMethodBeat.i(106141);
    this.yqZ.add(paramString);
    AppMethodBeat.o(106141);
    return this;
  }

  public final void eD(View paramView)
  {
    AppMethodBeat.i(106142);
    if ((paramView != null) && (this.yqZ.size() > 0))
    {
      Iterator localIterator = this.yqZ.iterator();
      String str2;
      for (String str1 = ""; localIterator.hasNext(); str1 = str1 + str2 + ",")
        str2 = (String)localIterator.next();
      paramView.setContentDescription(str1);
    }
    AppMethodBeat.o(106142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.a.b
 * JD-Core Version:    0.6.2
 */