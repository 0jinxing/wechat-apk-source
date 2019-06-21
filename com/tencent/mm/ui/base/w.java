package com.tencent.mm.ui.base;

import android.util.SparseArray;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w
{
  SparseArray<View>[] yAA;
  int yAB;
  SparseArray<View> yAC;
  View[] yAy;
  int[] yAz;

  public w()
  {
    AppMethodBeat.i(107083);
    this.yAy = new View[0];
    this.yAz = new int[0];
    AppMethodBeat.o(107083);
  }

  static View a(SparseArray<View> paramSparseArray, int paramInt)
  {
    AppMethodBeat.i(107084);
    int i = paramSparseArray.size();
    int j;
    View localView;
    if (i > 0)
    {
      j = 0;
      if (j < i)
      {
        int k = paramSparseArray.keyAt(j);
        localView = (View)paramSparseArray.get(k);
        if (k == paramInt)
        {
          paramSparseArray.remove(k);
          AppMethodBeat.o(107084);
          paramSparseArray = localView;
        }
      }
    }
    while (true)
    {
      return paramSparseArray;
      j++;
      break;
      paramInt = i - 1;
      localView = (View)paramSparseArray.valueAt(paramInt);
      paramSparseArray.remove(paramSparseArray.keyAt(paramInt));
      AppMethodBeat.o(107084);
      paramSparseArray = localView;
      continue;
      paramSparseArray = null;
      AppMethodBeat.o(107084);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.w
 * JD-Core Version:    0.6.2
 */