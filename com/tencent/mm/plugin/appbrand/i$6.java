package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.b;

final class i$6 extends b.b
{
  i$6(i parami, ActivityManager.TaskDescription paramTaskDescription)
  {
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(86656);
    this.gOb.gNy.setTaskDescription(new ActivityManager.TaskDescription(this.gOe.getLabel(), paramBitmap, this.gOe.getPrimaryColor()));
    AppMethodBeat.o(86656);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.i.6
 * JD-Core Version:    0.6.2
 */