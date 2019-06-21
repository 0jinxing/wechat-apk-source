package com.tencent.mm.ui;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.c;
import com.tencent.mm.at.o;
import com.tencent.mm.at.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.b;
import com.tencent.mm.plugin.topstory.a.e;
import com.tencent.mm.protocal.protobuf.cht;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.h;
import com.tencent.mm.ui.tools.r;

final class FindMoreFriendsUI$3
  implements Runnable
{
  FindMoreFriendsUI$3(FindMoreFriendsUI paramFindMoreFriendsUI, IconPreference paramIconPreference)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(29209);
    if (this.yhC == null)
    {
      AppMethodBeat.o(29209);
      return;
    }
    boolean bool = ((b)g.M(b.class)).getRedDotMgr().cEN();
    int i = ((b)g.M(b.class)).getRedDotMgr().cEU();
    this.yhC.NN(8);
    this.yhC.NM(8);
    this.yhC.NQ(8);
    this.yhC.NL(8);
    Object localObject;
    if ((i > 0) && (((b)g.M(b.class)).getRedDotMgr().cEO()))
    {
      this.yhC.NL(0);
      localObject = String.valueOf(i);
      if (i > 99)
        localObject = "99+";
      this.yhC.ey((String)localObject, r.ik(this.yhB.getContext()));
      ((b)g.M(b.class)).getRedDotMgr().Fy(i);
    }
    while (true)
    {
      FindMoreFriendsUI.a(this.yhB).notifyDataSetChanged();
      AppMethodBeat.o(29209);
      break;
      if (bool)
      {
        if (LauncherUI.dxE() == 2)
          ((b)g.M(b.class)).getRedDotMgr().cEQ();
        localObject = ((b)g.M(b.class)).getRedDotMgr().cEP();
        Bitmap localBitmap;
        switch (((cht)localObject).type)
        {
        default:
          ab.e("MicroMsg.FindMoreFriendsUI", "search unknown red type %d", new Object[] { Integer.valueOf(((cht)localObject).type) });
          break;
        case 1:
          this.yhC.NN(0);
          break;
        case 2:
          this.yhC.NN(8);
          this.yhC.NM(0);
          this.yhC.av(((cht)localObject).text, -1, Color.parseColor("#8c8c8c"));
          this.yhC.qh(true);
          this.yhC.NQ(8);
          break;
        case 3:
          this.yhC.NN(8);
          this.yhC.NQ(0);
          this.yhC.NP(0);
          this.yhC.NR(0);
          this.yhC.qh(false);
          o.ahk();
          localBitmap = c.kR(((cht)localObject).cIY);
          if (localBitmap != null)
          {
            FindMoreFriendsUI.a(this.yhB, null);
            this.yhC.ap(localBitmap);
          }
          else
          {
            o.aho().a(((cht)localObject).cIY, this.yhB.yhA);
            FindMoreFriendsUI.a(this.yhB, ((cht)localObject).cIY);
          }
          break;
        case 4:
          this.yhC.NN(8);
          this.yhC.NQ(0);
          this.yhC.NP(0);
          this.yhC.NR(0);
          this.yhC.NM(0);
          this.yhC.qh(false);
          this.yhC.av(((cht)localObject).text, -1, Color.parseColor("#8c8c8c"));
          o.ahk();
          localBitmap = c.kR(((cht)localObject).cIY);
          if (localBitmap != null)
          {
            FindMoreFriendsUI.a(this.yhB, null);
            this.yhC.ap(localBitmap);
          }
          else
          {
            o.aho().a(((cht)localObject).cIY, this.yhB.yhA);
            FindMoreFriendsUI.a(this.yhB, ((cht)localObject).cIY);
          }
          break;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FindMoreFriendsUI.3
 * JD-Core Version:    0.6.2
 */