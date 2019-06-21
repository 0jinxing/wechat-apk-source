package com.tencent.mm.plugin.fav.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.h;
import com.tencent.mm.plugin.fav.a.k;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.HashSet;
import java.util.Set;

public class FavSelectUI extends FavBaseUI
{
  private String mjA;
  private com.tencent.mm.plugin.fav.ui.a.b mjB;
  private Set<Integer> mjC;
  private k mjD;
  private View.OnClickListener mjE;
  private String toUser;

  public FavSelectUI()
  {
    AppMethodBeat.i(74108);
    this.mjB = null;
    this.mjC = new HashSet();
    this.mjD = new k();
    this.mjE = new FavSelectUI.5(this);
    AppMethodBeat.o(74108);
  }

  public final com.tencent.mm.plugin.fav.ui.a.a bvu()
  {
    AppMethodBeat.i(74111);
    if (this.mjB == null)
      this.mjB = new com.tencent.mm.plugin.fav.ui.a.b(this.mhy, false);
    com.tencent.mm.plugin.fav.ui.a.b localb = this.mjB;
    AppMethodBeat.o(74111);
    return localb;
  }

  protected final void bvv()
  {
  }

  protected final boolean bvw()
  {
    AppMethodBeat.i(74112);
    boolean bool;
    if (((ae)com.tencent.mm.kernel.g.M(ae.class)).getFavItemInfoStorage().getCount() > 0)
    {
      bool = true;
      AppMethodBeat.o(74112);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(74112);
    }
  }

  protected final void bvx()
  {
    AppMethodBeat.i(74113);
    this.mht.setCompoundDrawablesWithIntrinsicBounds(0, 2130838780, 0, 0);
    this.mht.setCompoundDrawablePadding(com.tencent.mm.bz.a.fromDPToPix(this.mController.ylL, 10));
    this.mht.setText(2131299615);
    AppMethodBeat.o(74113);
  }

  protected final View.OnClickListener bvy()
  {
    return this.mjE;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(74114);
    if ((paramInt1 == 0) && (-1 == paramInt2))
    {
      finish();
      AppMethodBeat.o(74114);
    }
    while (true)
    {
      return;
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      AppMethodBeat.o(74114);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(74109);
    super.onCreate(paramBundle);
    this.toUser = getIntent().getStringExtra("key_to_user");
    this.mjA = getIntent().getStringExtra("key_fav_item_id");
    if (this.mjA != null)
    {
      paramBundle = this.mjA.split(",");
      int i = paramBundle.length;
      for (int j = 0; j < i; j++)
      {
        int k = bo.getInt(paramBundle[j], 2147483647);
        if (2147483647 != k)
          this.mjC.add(Integer.valueOf(k));
      }
    }
    this.mjC.remove(Integer.valueOf(3));
    this.mjB.f(this.mjC);
    this.mjD.mfm = false;
    this.mjB.a(this.mjD);
    this.mcy.post(new FavSelectUI.1(this));
    addIconOptionMenu(0, 2131230741, new FavSelectUI.2(this));
    setMMTitle(2131299731);
    setBackBtn(new FavSelectUI.3(this));
    AppMethodBeat.o(74109);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(74115);
    super.onDestroy();
    if (this.mjB != null)
      this.mjB.finish();
    AppMethodBeat.o(74115);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(74110);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSelectUI", "on item click, holder is null");
      AppMethodBeat.o(74110);
    }
    while (true)
    {
      return;
      if (paramAdapterView.mgf == null)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.FavSelectUI", "on item click, info is null");
        AppMethodBeat.o(74110);
      }
      else
      {
        paramView = paramAdapterView.mgf;
        h.j(paramView.field_localId, 1, 1);
        if (paramView.field_type == 3)
        {
          com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131296321));
          AppMethodBeat.o(74110);
        }
        else if ((paramView.field_type == 8) && (t.mZ(this.toUser)))
        {
          com.tencent.mm.ui.widget.snackbar.b.i(this, getString(2131296319));
          AppMethodBeat.o(74110);
        }
        else
        {
          ((com.tencent.mm.plugin.fav.a.ab)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.fav.a.ab.class)).a(this.mController.ylL, this.toUser, paramAdapterView.mgf, true, new FavSelectUI.4(this, paramAdapterView));
          AppMethodBeat.o(74110);
        }
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.FavSelectUI
 * JD-Core Version:    0.6.2
 */