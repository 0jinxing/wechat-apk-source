package com.tencent.mm.plugin.appbrand.jsapi.m;

import android.widget.NumberPicker;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.AppBrandDatePicker;
import com.tencent.mm.plugin.appbrand.widget.picker.b;

final class a$1
  implements Runnable
{
  a$1(a parama)
  {
  }

  public final void run()
  {
    boolean bool1 = true;
    int i = 0;
    AppMethodBeat.i(126336);
    Object localObject1 = this.hUc;
    Object localObject2 = (AppBrandDatePicker)((a)localObject1).an(AppBrandDatePicker.class);
    if (localObject2 == null)
    {
      ((d)localObject1).l("fail cant init view", null);
      AppMethodBeat.o(126336);
      return;
    }
    com.tencent.mm.plugin.appbrand.widget.picker.a locala = ((b)localObject1).jks;
    locala.setOnResultListener(new a.2((a)localObject1));
    if (((a)localObject1).hTX != null)
      ((AppBrandDatePicker)localObject2).setMinDate(((a)localObject1).hTX.longValue());
    if (((a)localObject1).hTY != null)
      ((AppBrandDatePicker)localObject2).setMaxDate(((a)localObject1).hTY.longValue());
    ((AppBrandDatePicker)localObject2).a(((a)localObject1).hTZ, ((a)localObject1).hUa, ((a)localObject1).hUb, null);
    boolean bool2;
    label137: boolean bool3;
    if (((a)localObject1).hTW.ordinal() >= a.a.hUd.ordinal())
    {
      bool2 = true;
      if (((a)localObject1).hTW.ordinal() < a.a.hUe.ordinal())
        break label325;
      bool3 = true;
      label156: if (((a)localObject1).hTW.ordinal() < a.a.hUf.ordinal())
        break label331;
      label172: ((AppBrandDatePicker)localObject2).jkt = bool2;
      ((AppBrandDatePicker)localObject2).jku = bool3;
      ((AppBrandDatePicker)localObject2).jkv = bool1;
      if (((AppBrandDatePicker)localObject2).jkw != null)
      {
        ((AppBrandDatePicker)localObject2).jkw.setEnabled(bool2);
        localObject1 = ((AppBrandDatePicker)localObject2).jkw;
        if (!bool2)
          break label336;
        j = 0;
        label224: ((NumberPicker)localObject1).setVisibility(j);
      }
      if (((AppBrandDatePicker)localObject2).jkx != null)
      {
        ((AppBrandDatePicker)localObject2).jkx.setEnabled(bool3);
        localObject1 = ((AppBrandDatePicker)localObject2).jkx;
        if (!bool3)
          break label343;
        j = 0;
        label262: ((NumberPicker)localObject1).setVisibility(j);
      }
      if (((AppBrandDatePicker)localObject2).jky != null)
      {
        ((AppBrandDatePicker)localObject2).jky.setEnabled(bool1);
        localObject2 = ((AppBrandDatePicker)localObject2).jky;
        if (!bool1)
          break label350;
      }
    }
    label325: label331: label336: label343: label350: for (int j = i; ; j = 8)
    {
      ((NumberPicker)localObject2).setVisibility(j);
      locala.show();
      AppMethodBeat.o(126336);
      break;
      bool2 = false;
      break label137;
      bool3 = false;
      break label156;
      bool1 = false;
      break label172;
      j = 8;
      break label224;
      j = 8;
      break label262;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.a.1
 * JD-Core Version:    0.6.2
 */