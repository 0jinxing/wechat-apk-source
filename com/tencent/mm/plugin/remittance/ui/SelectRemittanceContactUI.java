package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class SelectRemittanceContactUI extends MMBaseSelectContactUI
{
  private List<String> elZ;
  private int fromScene;
  private View oiy;
  private List<String> pUw;

  public final void Kh()
  {
    AppMethodBeat.i(45172);
    super.Kh();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    Object localObject = getIntent().getStringExtra("recent_remittance_contact_list");
    ab.v("MicroMsg.SelectRemittanceContactUI", "recent list:".concat(String.valueOf(localObject)));
    this.pUw = new ArrayList();
    if (!bo.isNullOrNil((String)localObject))
      this.pUw = bo.P(((String)localObject).split(","));
    localObject = new HashSet();
    ((HashSet)localObject).addAll(s.dIf());
    ((HashSet)localObject).addAll(s.dIg());
    String str = getIntent().getStringExtra("Select_block_List");
    if (!bo.isNullOrNil(str))
      ((HashSet)localObject).addAll(bo.P(str.split(",")));
    this.elZ = new ArrayList();
    this.elZ.addAll((Collection)localObject);
    AppMethodBeat.o(45172);
  }

  public final void a(ListView paramListView, int paramInt)
  {
    AppMethodBeat.i(45178);
    super.a(paramListView, paramInt);
    View localView;
    TextView localTextView;
    if (this.oiy == null)
    {
      localView = View.inflate(this, 2130970587, null);
      this.oiy = localView.findViewById(2131821019);
      localTextView = (TextView)localView.findViewById(2131821051);
      if (this.fromScene != 1)
        break label81;
      localTextView.setText(2131305344);
    }
    while (true)
    {
      paramListView.addHeaderView(localView);
      this.oiy.setVisibility(paramInt);
      AppMethodBeat.o(45178);
      return;
      label81: localTextView.setText(2131302432);
    }
  }

  public final m aoA()
  {
    AppMethodBeat.i(45174);
    q localq = new q(this, this.elZ, false, this.scene);
    AppMethodBeat.o(45174);
    return localq;
  }

  public final boolean aow()
  {
    return false;
  }

  public final boolean aox()
  {
    return false;
  }

  public final String aoy()
  {
    AppMethodBeat.i(45177);
    String str;
    if (this.fromScene == 1)
    {
      str = getString(2131305346);
      AppMethodBeat.o(45177);
    }
    while (true)
    {
      return str;
      str = getString(2131302471);
      AppMethodBeat.o(45177);
    }
  }

  public final o aoz()
  {
    AppMethodBeat.i(45173);
    g localg = new g(this, this.pUw, this.elZ, this.fromScene);
    AppMethodBeat.o(45173);
    return localg;
  }

  public final int[] bMP()
  {
    int[] arrayOfInt;
    if (this.fromScene == 1)
    {
      arrayOfInt = new int[2];
      int[] tmp13_12 = arrayOfInt;
      tmp13_12[0] = 131072;
      int[] tmp18_13 = tmp13_12;
      tmp18_13[1] = 131075;
      tmp18_13;
    }
    while (true)
    {
      return arrayOfInt;
      arrayOfInt = new int[1];
      arrayOfInt[0] = 131072;
    }
  }

  public final void bMQ()
  {
    AppMethodBeat.i(45179);
    super.bMQ();
    aqX();
    AppMethodBeat.o(45179);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(45175);
    if (paramInt < getContentLV().getHeaderViewsCount())
    {
      ab.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      ab.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
      localObject = new Intent();
      if (this.fromScene == 1)
      {
        ((Intent)localObject).putExtra("list_attr", s.C(new int[] { s.znD, 16384, 64, 4096, 262144 }));
        ((Intent)localObject).putExtra("min_limit_num", 1);
        ((Intent)localObject).putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
        ((Intent)localObject).putExtra("titile", getString(2131305348));
        ((Intent)localObject).putExtra("without_openim", true);
        d.b(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
        overridePendingTransition(2131034229, 2131034181);
        AppMethodBeat.o(45175);
      }
    }
    while (true)
    {
      return;
      paramInt = s.C(new int[] { 16, 1, 2, 4, 16384 });
      ((Intent)localObject).putExtra("list_type", 0);
      ((Intent)localObject).putExtra("list_attr", paramInt);
      ((Intent)localObject).putExtra("titile", getString(2131302467));
      ((Intent)localObject).putExtra("sub_title", getString(2131305421));
      break;
      localObject = (com.tencent.mm.ui.contact.a.a)getContentLV().getAdapter().getItem(paramInt);
      if (localObject == null)
      {
        AppMethodBeat.o(45175);
      }
      else
      {
        localObject = ((com.tencent.mm.ui.contact.a.a)localObject).ehM;
        if (localObject != null)
          break label292;
        AppMethodBeat.o(45175);
      }
    }
    label292: Object localObject = ((ap)localObject).field_username;
    ab.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", new Object[] { localObject });
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_User", (String)localObject);
    setResult(-1, localIntent);
    finish();
    aqX();
    if ((dHV() instanceof g))
    {
      paramInt -= getContentLV().getHeaderViewsCount();
      localObject = (g)dHV();
      ab.d("MicroMsg.RecentConversationAdapter", "pos: %s", new Object[] { Integer.valueOf(paramInt) });
      if (((g)localObject).pUu < 0)
        break label469;
      if (((g)localObject).pUv >= 0)
        break label448;
      paramInt = 1;
    }
    while (true)
    {
      if (paramInt != 0)
        h.pYm.e(13721, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
      AppMethodBeat.o(45175);
      break;
      label448: if ((paramInt > ((g)localObject).pUu) && (paramInt < ((g)localObject).pUv))
        paramInt = 1;
      else
        label469: paramInt = 0;
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(45176);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null)
    {
      ab.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
      if (paramInt1 != 1)
        break label155;
      if (paramInt2 == -1)
      {
        ab.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
        setResult(-1, paramIntent);
        finish();
      }
      AppMethodBeat.o(45176);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
      break;
      label155: ab.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(45176);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45171);
    super.onCreate(paramBundle);
    AppMethodBeat.o(45171);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45180);
    boolean bool;
    if (paramKeyEvent.getKeyCode() == 4)
    {
      bool = true;
      AppMethodBeat.o(45180);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(45180);
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(45181);
    if (paramInt == 4)
      bMQ();
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(45181);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.SelectRemittanceContactUI
 * JD-Core Version:    0.6.2
 */