package com.tencent.mm.wallet_core.ui.formview;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.picker.CustomDatePicker;
import com.tencent.mm.ui.widget.picker.a;
import com.tencent.mm.ui.widget.picker.a.a;
import java.text.DecimalFormat;
import java.util.Locale;

final class b$1$1
  implements a.a
{
  b$1$1(b.1 param1, a parama)
  {
  }

  public final void b(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(49401);
    this.tGk.hide();
    Object localObject;
    if (paramBoolean)
    {
      localObject = this.tGk;
      if (((a)localObject).zSi == null)
        break label536;
      localObject = ((a)localObject).zSi;
      if (((CustomDatePicker)localObject).jkv)
        localObject = String.format(Locale.US, "%04d-%02d-%02d", new Object[] { Integer.valueOf(((CustomDatePicker)localObject).getYear()), Integer.valueOf(((CustomDatePicker)localObject).getMonth()), Integer.valueOf(((CustomDatePicker)localObject).getDayOfMonth()) });
    }
    while (true)
    {
      if (bo.isNullOrNil((String)localObject))
        AppMethodBeat.o(49401);
      while (true)
      {
        return;
        if (((CustomDatePicker)localObject).jku)
        {
          localObject = String.format(Locale.US, "%04d-%02d", new Object[] { Integer.valueOf(((CustomDatePicker)localObject).getYear()), Integer.valueOf(((CustomDatePicker)localObject).getMonth()) });
          break;
        }
        localObject = String.format(Locale.US, "%04d", new Object[] { Integer.valueOf(((CustomDatePicker)localObject).getYear()) });
        break;
        String[] arrayOfString = ((String)localObject).split("-");
        if (arrayOfString.length < 2)
        {
          AppMethodBeat.o(49401);
        }
        else
        {
          ab.d("MicroMsg.FormatViewUtil", "result: %s", new Object[] { localObject });
          paramInt1 = bo.ank(arrayOfString[0]);
          this.Aif.Aie = (bo.ank(arrayOfString[1]) - 1);
          ab.d("MicroMsg.FormatViewUtil", "year: %s, month: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(this.Aif.Aie) });
          if ((paramInt1 >= b.access$000()) || (this.Aif.Aie >= b.access$100()))
            break label367;
          h.b(this.Aif.lvu, this.Aif.lvu.getString(2131304788), null, true);
          if (this.Aif.AhR.getInputValidChangeListener() != null)
            this.Aif.AhR.getInputValidChangeListener().hY(this.Aif.AhR.asa());
          AppMethodBeat.o(49401);
        }
      }
      label367: localObject = new DecimalFormat("00");
      if (r.YM())
        this.Aif.AhR.setTag(((DecimalFormat)localObject).format(this.Aif.Aie + 1) + paramInt1);
      while (true)
      {
        this.Aif.AhR.setText(((DecimalFormat)localObject).format(this.Aif.Aie + 1) + ((DecimalFormat)localObject).format(paramInt1).substring(2));
        break;
        this.Aif.AhR.setTag(((DecimalFormat)localObject).format(paramInt1).substring(2) + ((DecimalFormat)localObject).format(this.Aif.Aie + 1));
      }
      label536: localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.formview.b.1.1
 * JD-Core Version:    0.6.2
 */