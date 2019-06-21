package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.widget.a;
import java.util.Iterator;
import java.util.List;

final class NewBizInfoMenuPreference$2
  implements n.c
{
  NewBizInfoMenuPreference$2(NewBizInfoMenuPreference paramNewBizInfoMenuPreference, e parame)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(23871);
    Iterator localIterator = this.pqc.pqE.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      if (locale.type == 5)
      {
        Object localObject = NewBizInfoMenuPreference.b(this.pqd).getResources().getDrawable(2130837920);
        int i = NewBizInfoMenuPreference.d(this.pqd) * 16 / 17;
        ((Drawable)localObject).setBounds(0, 0, i, i);
        a locala = new a((Drawable)localObject);
        localObject = new SpannableString("@");
        ((SpannableString)localObject).setSpan(locala, 0, 1, 33);
        paraml.e(locale.name.hashCode(), TextUtils.concat(new CharSequence[] { locale.name, "  ", localObject }));
      }
      else
      {
        paraml.e(locale.name.hashCode(), locale.name);
      }
    }
    AppMethodBeat.o(23871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMenuPreference.2
 * JD-Core Version:    0.6.2
 */