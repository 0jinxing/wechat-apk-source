package com.tencent.mm.plugin.scanner.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aw.a;
import com.tencent.mm.aw.a.7;
import com.tencent.mm.aw.f;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class ProductUI$4
  implements MusicPreference.a
{
  ProductUI$4(ProductUI paramProductUI)
  {
  }

  public final void d(MusicPreference paramMusicPreference)
  {
    AppMethodBeat.i(81082);
    if (paramMusicPreference == null)
    {
      ab.e("MicroMsg.scanner.ProductUI", "onMusicPrefClick, musicPref == null");
      AppMethodBeat.o(81082);
    }
    String str1;
    while (true)
    {
      return;
      if ((bo.isNullOrNil(paramMusicPreference.pZl)) && (bo.isNullOrNil(paramMusicPreference.pZm)))
      {
        ab.w("MicroMsg.scanner.ProductUI", "wifiurl = null,  wapurl = null");
        if (!bo.isNullOrNil(paramMusicPreference.pZn))
          ProductUI.a(this.qdu, paramMusicPreference.pZn);
        AppMethodBeat.o(81082);
      }
      else
      {
        str1 = String.format("%s_cd_%s", new Object[] { paramMusicPreference.pZl, paramMusicPreference.mKey });
        if (ProductUI.Wm(str1))
          break label364;
        if (paramMusicPreference.getTitle() != null)
          break;
        ab.e("MicroMsg.scanner.ProductUI", "onPlayBtnClick, getTitle() == null");
        AppMethodBeat.o(81082);
      }
    }
    int i = -1;
    label145: ArrayList localArrayList;
    int j;
    label196: String str3;
    if (ProductUI.o(this.qdu) == null)
    {
      str1 = null;
      String str2 = String.format("%s_cd_%s", new Object[] { paramMusicPreference.pZl, paramMusicPreference.mKey });
      localArrayList = new ArrayList();
      Iterator localIterator = ProductUI.p(this.qdu).iterator();
      j = 0;
      if (!localIterator.hasNext())
        break label324;
      paramMusicPreference = (MusicPreference)localIterator.next();
      str3 = String.format("%s_cd_%s", new Object[] { paramMusicPreference.pZl, paramMusicPreference.mKey });
      if (!str2.equals(str3))
        break label385;
      i = j;
    }
    label385: 
    while (true)
    {
      localArrayList.add(f.a(5, str1, paramMusicPreference.getTitle().toString(), "", paramMusicPreference.pZn, paramMusicPreference.pZm, paramMusicPreference.pZl, str3, g.RP().eJM, str1, "", "wx482a4001c37e2b74"));
      j++;
      break label196;
      str1 = ProductUI.o(this.qdu).anJ();
      break label145;
      label324: if (i < 0)
      {
        AppMethodBeat.o(81082);
        break;
      }
      al.d(new a.7(localArrayList, i));
      while (true)
      {
        ProductUI.q(this.qdu);
        AppMethodBeat.o(81082);
        break;
        label364: a.aic();
        ab.d("MicroMsg.scanner.ProductUI", "isTheSameId, playMusicId : [%s]", new Object[] { str1 });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.4
 * JD-Core Version:    0.6.2
 */