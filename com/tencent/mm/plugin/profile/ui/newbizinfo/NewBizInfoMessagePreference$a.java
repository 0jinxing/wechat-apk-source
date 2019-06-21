package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.List;

public final class NewBizInfoMessagePreference$a extends RecyclerView.a<NewBizInfoMessagePreference.a.a>
{
  private static final int IMAGE_WIDTH;
  private static int pqg;
  private static int pqh;
  private static int pqi;
  private static int pqj;
  private static int pqk;
  private static int pql;
  private MMActivity crP;
  private ad ehM;
  private List<b> pqf;

  static
  {
    AppMethodBeat.i(23889);
    pqg = a.fromDPToPix(ah.getContext(), 6);
    IMAGE_WIDTH = ah.getResources().getDimensionPixelSize(2131427862);
    pqh = a.fromDPToPix(ah.getContext(), 4);
    pqi = 13;
    pqj = a.fromDPToPix(ah.getContext(), 1);
    pqk = a.fromDPToPix(ah.getContext(), 8);
    pql = 13;
    AppMethodBeat.o(23889);
  }

  public NewBizInfoMessagePreference$a(MMActivity paramMMActivity, List<b> paramList, ad paramad)
  {
    AppMethodBeat.i(23885);
    this.pqf = new ArrayList();
    this.crP = paramMMActivity;
    this.pqf = paramList;
    this.ehM = paramad;
    AppMethodBeat.o(23885);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(23886);
    int i;
    if (this.pqf == null)
    {
      i = 0;
      AppMethodBeat.o(23886);
    }
    while (true)
    {
      return i;
      i = this.pqf.size();
      AppMethodBeat.o(23886);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMessagePreference.a
 * JD-Core Version:    0.6.2
 */