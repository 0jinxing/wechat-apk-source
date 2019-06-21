package com.tencent.mm.ui.base;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import junit.framework.Assert;

final class MMGridPaperGridView$a extends BaseAdapter
{
  private MMGridPaperGridView$a(MMGridPaperGridView paramMMGridPaperGridView)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(106644);
    int i;
    if ((MMGridPaperGridView.c(this.yvk) < 0) || (MMGridPaperGridView.a(this.yvk) == null))
    {
      i = 0;
      AppMethodBeat.o(106644);
    }
    while (true)
    {
      return i;
      i = MMGridPaperGridView.c(this.yvk);
      AppMethodBeat.o(106644);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(106645);
    Object localObject;
    if (MMGridPaperGridView.a(this.yvk) == null)
    {
      localObject = null;
      AppMethodBeat.o(106645);
    }
    while (true)
    {
      return localObject;
      localObject = MMGridPaperGridView.a(this.yvk).getItem(MMGridPaperGridView.b(this.yvk) + paramInt);
      AppMethodBeat.o(106645);
    }
  }

  public final long getItemId(int paramInt)
  {
    AppMethodBeat.i(106646);
    long l;
    if (MMGridPaperGridView.a(this.yvk) == null)
    {
      l = 0L;
      AppMethodBeat.o(106646);
    }
    while (true)
    {
      return l;
      l = MMGridPaperGridView.a(this.yvk).getItemId(MMGridPaperGridView.b(this.yvk) + paramInt);
      AppMethodBeat.o(106646);
    }
  }

  public final int getItemViewType(int paramInt)
  {
    AppMethodBeat.i(106642);
    if (MMGridPaperGridView.a(this.yvk) == null)
      AppMethodBeat.o(106642);
    while (true)
    {
      return 0;
      MMGridPaperGridView.a(this.yvk);
      MMGridPaperGridView.b(this.yvk);
      AppMethodBeat.o(106642);
    }
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(106647);
    long l = bo.yz();
    int i = MMGridPaperGridView.d(this.yvk);
    boolean bool;
    if (paramView == null)
    {
      bool = true;
      ab.v("MicroMsg.MMGridPaperGridView", "getView:index[%d], pos[%d], converrView is null[%B], parent is [%s], mClearMode[%B]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), Boolean.valueOf(bool), paramViewGroup.toString(), Boolean.valueOf(MMGridPaperGridView.e(this.yvk)) });
      if (MMGridPaperGridView.e(this.yvk))
        paramView = null;
      if (MMGridPaperGridView.a(this.yvk) != null)
        break label214;
      paramView = null;
      label104: if (paramView == null)
        break label238;
      bool = true;
      label111: Assert.assertTrue(bool);
      if ((-1 == MMGridPaperGridView.f(this.yvk)) || (MMGridPaperGridView.b(this.yvk) + paramInt != MMGridPaperGridView.f(this.yvk)))
        break label244;
      paramView.setVisibility(4);
    }
    while (true)
    {
      ab.v("MicroMsg.MMGridPaperGridView", "get View ok: use %d ms, hidden index[%d], cur global index[%d]", new Object[] { Long.valueOf(bo.az(l)), Integer.valueOf(MMGridPaperGridView.f(this.yvk)), Integer.valueOf(MMGridPaperGridView.b(this.yvk) + paramInt) });
      AppMethodBeat.o(106647);
      return paramView;
      bool = false;
      break;
      label214: paramView = MMGridPaperGridView.a(this.yvk).d(MMGridPaperGridView.b(this.yvk) + paramInt, paramView);
      break label104;
      label238: bool = false;
      break label111;
      label244: paramView.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    AppMethodBeat.i(106643);
    if (MMGridPaperGridView.a(this.yvk) == null)
      AppMethodBeat.o(106643);
    while (true)
    {
      return 1;
      MMGridPaperGridView.a(this.yvk);
      AppMethodBeat.o(106643);
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(106641);
    boolean bool;
    if (MMGridPaperGridView.a(this.yvk) == null)
    {
      bool = false;
      AppMethodBeat.o(106641);
    }
    while (true)
    {
      return bool;
      MMGridPaperGridView.a(this.yvk);
      MMGridPaperGridView.b(this.yvk);
      bool = true;
      AppMethodBeat.o(106641);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMGridPaperGridView.a
 * JD-Core Version:    0.6.2
 */