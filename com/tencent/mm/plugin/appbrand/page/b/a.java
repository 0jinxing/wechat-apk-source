package com.tencent.mm.plugin.appbrand.page.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.page.u;
import java.util.concurrent.atomic.AtomicReference;

@TargetApi(21)
public class a extends b
{
  private int ivr = 0;

  protected a(u paramu)
  {
    super(paramu);
  }

  private void aKi()
  {
    AppMethodBeat.i(87366);
    this.ivt.set(c.b.ivu);
    Window localWindow;
    if ((this.ivs.mContext instanceof Activity))
    {
      localWindow = ((Activity)this.ivs.mContext).getWindow();
      if (localWindow == null)
        AppMethodBeat.o(87366);
    }
    while (true)
    {
      return;
      View localView = localWindow.getDecorView();
      localWindow.clearFlags(1024);
      localView.setSystemUiVisibility(localView.getSystemUiVisibility() & 0xFFFFFFFB);
      AppMethodBeat.o(87366);
    }
  }

  public void aAS()
  {
    AppMethodBeat.i(87368);
    super.aAS();
    switch (a.1.hti[((c.b)this.ivt.get()).ordinal()])
    {
    default:
      AppMethodBeat.o(87368);
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      aKi();
      AppMethodBeat.o(87368);
      continue;
      aBs();
      AppMethodBeat.o(87368);
    }
  }

  public void aBr()
  {
    AppMethodBeat.i(87365);
    aKi();
    AppMethodBeat.o(87365);
  }

  public void aBs()
  {
    AppMethodBeat.i(87367);
    this.ivt.set(c.b.ivv);
    Object localObject;
    if ((this.ivs.mContext instanceof Activity))
    {
      localObject = ((Activity)this.ivs.mContext).getWindow();
      if (localObject == null)
        AppMethodBeat.o(87367);
    }
    while (true)
    {
      return;
      ((Window)localObject).addFlags(1024);
      localObject = ((Window)localObject).getDecorView();
      ((View)localObject).setSystemUiVisibility(((View)localObject).getSystemUiVisibility() | 0x4 | 0x100);
      AppMethodBeat.o(87367);
    }
  }

  public void onOrientationChanged(int paramInt)
  {
    AppMethodBeat.i(87369);
    super.onOrientationChanged(paramInt);
    int i;
    if (paramInt != this.ivr)
    {
      i = 1;
      this.ivr = paramInt;
      if (2 != paramInt)
        break label45;
      aBs();
      AppMethodBeat.o(87369);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label45: if ((i != 0) || (this.ivt.get() == c.b.ivu))
        aBr();
      AppMethodBeat.o(87369);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.b.a
 * JD-Core Version:    0.6.2
 */