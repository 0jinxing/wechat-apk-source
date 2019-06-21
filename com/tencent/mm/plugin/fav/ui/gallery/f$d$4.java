package com.tencent.mm.plugin.fav.ui.gallery;

import android.view.View;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.b.a;

final class f$d$4
  implements View.OnLongClickListener
{
  f$d$4(f.d paramd)
  {
  }

  private void s(View paramView, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(74576);
    int i = ((Integer)paramView.getTag(2131820604)).intValue();
    f.c localc = this.mor.moe.vG(i);
    if (localc == null)
      AppMethodBeat.o(74576);
    while (true)
    {
      return;
      a locala = new a(this.mor.moe.mContext);
      this.mor.mom.setVisibility(0);
      locala.zHM = new f.d.4.1(this);
      locala.a(paramView, new f.d.4.2(this, localc), new f.d.4.3(this, localc, i), paramInt1, paramInt2);
      AppMethodBeat.o(74576);
    }
  }

  public final boolean onLongClick(View paramView)
  {
    AppMethodBeat.i(74575);
    boolean bool;
    if (this.mor.moe.mod)
    {
      AppMethodBeat.o(74575);
      bool = false;
      return bool;
    }
    if ((paramView.getTag(2131820679) instanceof int[]))
    {
      int[] arrayOfInt = (int[])paramView.getTag(2131820679);
      s(paramView, arrayOfInt[0], arrayOfInt[1]);
    }
    while (true)
    {
      AppMethodBeat.o(74575);
      bool = true;
      break;
      s(paramView, 0, 0);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.d.4
 * JD-Core Version:    0.6.2
 */