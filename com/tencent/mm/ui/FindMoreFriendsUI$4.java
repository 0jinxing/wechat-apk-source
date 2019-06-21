package com.tencent.mm.ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.at.p;
import com.tencent.mm.plugin.websearch.api.am.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.h;

final class FindMoreFriendsUI$4
  implements Runnable
{
  FindMoreFriendsUI$4(FindMoreFriendsUI paramFindMoreFriendsUI, IconPreference paramIconPreference, am.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29210);
    if (this.yhC == null)
      AppMethodBeat.o(29210);
    while (true)
    {
      return;
      if (this.yhD != null)
        break;
      this.yhC.NN(8);
      AppMethodBeat.o(29210);
    }
    if (this.yhD.isValid())
    {
      ab.i("MicroMsg.FindMoreFriendsUI", "show red %s", new Object[] { this.yhC.getTitle() });
      switch (this.yhD.type)
      {
      default:
        ab.e("MicroMsg.FindMoreFriendsUI", "search unknown red type %d", new Object[] { Integer.valueOf(this.yhD.type) });
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      FindMoreFriendsUI.a(this.yhB).notifyDataSetChanged();
      AppMethodBeat.o(29210);
      break;
      this.yhC.NN(0);
      this.yhC.NM(8);
      continue;
      this.yhC.NN(8);
      this.yhC.NM(0);
      this.yhC.av(this.yhD.text, -1, Color.parseColor("#8c8c8c"));
      this.yhC.qh(true);
      this.yhC.NQ(8);
      continue;
      this.yhC.NQ(0);
      this.yhC.NP(0);
      this.yhC.NR(0);
      this.yhC.qh(false);
      o.ahk();
      Bitmap localBitmap = c.kR(this.yhD.cIY);
      if (localBitmap != null)
      {
        FindMoreFriendsUI.a(this.yhB, null);
        this.yhC.ap(localBitmap);
      }
      else
      {
        o.aho().a(this.yhD.cIY, this.yhB.yhA);
        FindMoreFriendsUI.a(this.yhB, this.yhD.cIY);
        continue;
        this.yhC.NQ(0);
        this.yhC.NP(0);
        this.yhC.NR(0);
        this.yhC.NM(0);
        this.yhC.qh(false);
        this.yhC.av(this.yhD.text, -1, Color.parseColor("#8c8c8c"));
        o.ahk();
        localBitmap = c.kR(this.yhD.cIY);
        if (localBitmap != null)
        {
          FindMoreFriendsUI.a(this.yhB, null);
          this.yhC.ap(localBitmap);
        }
        else
        {
          o.aho().a(this.yhD.cIY, this.yhB.yhA);
          FindMoreFriendsUI.a(this.yhB, this.yhD.cIY);
          continue;
          ab.i("MicroMsg.FindMoreFriendsUI", "hide red %s", new Object[] { this.yhC.getTitle() });
          this.yhC.NN(8);
          this.yhC.NM(8);
          this.yhC.NQ(8);
          this.yhC.NW(0);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.4
 * JD-Core Version:    0.6.2
 */