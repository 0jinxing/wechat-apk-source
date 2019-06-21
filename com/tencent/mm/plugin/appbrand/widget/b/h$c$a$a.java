package com.tencent.mm.plugin.appbrand.widget.b;

import a.a.j;
import a.f.a.b;
import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class h$c$a$a
  implements View.OnClickListener
{
  h$c$a$a(h.c.a parama, h.b paramb, int paramInt, b paramb1)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(102483);
    paramView = this.jcL;
    boolean bool = this.jcL.jcH;
    h.c.a.a(this.jcK, bool);
    ArrayList localArrayList;
    int i;
    if (!bool)
    {
      bool = true;
      paramView.jcH = bool;
      localArrayList = new ArrayList();
      paramView = ((Iterable)this.jcK.items).iterator();
      i = 0;
    }
    while (true)
    {
      if (!paramView.hasNext())
        break label172;
      Object localObject = paramView.next();
      int j = i + 1;
      if (i < 0)
        j.dWs();
      localObject = (h.b)localObject;
      localArrayList.add(Integer.valueOf(i));
      if (this.exi != i)
      {
        if (localObject == null)
          break label165;
        if (((h.b)localObject).jcH == true)
        {
          ((h.b)localObject).jcH = false;
          localArrayList.add(Integer.valueOf(this.exi));
        }
      }
      i = j;
      continue;
      bool = false;
      break;
      label165: i = j;
    }
    label172: this.jcM.am(localArrayList);
    AppMethodBeat.o(102483);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.h.c.a.a
 * JD-Core Version:    0.6.2
 */