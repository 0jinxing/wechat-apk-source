package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.ColorStateList;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import junit.framework.Assert;

public final class q
{
  private static q zHV = null;
  private ColorStateList[] yDX;
  private boolean zHW;

  private q(Context paramContext)
  {
    AppMethodBeat.i(107808);
    this.yDX = new ColorStateList[2];
    this.zHW = false;
    this.yDX[0] = a.h(paramContext, 2131690756);
    this.yDX[1] = a.h(paramContext, 2131690757);
    AppMethodBeat.o(107808);
  }

  private static q ih(Context paramContext)
  {
    AppMethodBeat.i(107809);
    if (paramContext != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      if ((zHV == null) || (!zHV.zHW))
        zHV = new q(paramContext);
      paramContext = zHV;
      AppMethodBeat.o(107809);
      return paramContext;
    }
  }

  public static ColorStateList ii(Context paramContext)
  {
    AppMethodBeat.i(107810);
    paramContext = ih(paramContext).yDX[0];
    AppMethodBeat.o(107810);
    return paramContext;
  }

  public static ColorStateList ij(Context paramContext)
  {
    AppMethodBeat.i(107811);
    paramContext = ih(paramContext).yDX[1];
    AppMethodBeat.o(107811);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.q
 * JD-Core Version:    0.6.2
 */