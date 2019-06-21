package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.contact.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelectLuckyMoneyContactUI extends MMBaseSelectContactUI
{
  private List<String> elZ;
  private View oiy;

  public final void Kh()
  {
    AppMethodBeat.i(43077);
    super.Kh();
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(s.dIf());
    localHashSet.addAll(s.dIg());
    String str = getIntent().getStringExtra("Select_block_List");
    if (!bo.isNullOrNil(str))
      localHashSet.addAll(bo.P(str.split(",")));
    this.elZ = new ArrayList();
    this.elZ.addAll(localHashSet);
    AppMethodBeat.o(43077);
  }

  public final void a(ListView paramListView, int paramInt)
  {
    AppMethodBeat.i(43082);
    super.a(paramListView, paramInt);
    if (this.oiy == null)
    {
      View localView = View.inflate(this, 2130970587, null);
      this.oiy = localView.findViewById(2131821019);
      ((TextView)localView.findViewById(2131821051)).setText(2131301117);
      paramListView.addHeaderView(localView);
    }
    this.oiy.setVisibility(paramInt);
    AppMethodBeat.o(43082);
  }

  public final m aoA()
  {
    AppMethodBeat.i(43081);
    q localq = new q(this, this.elZ, false, this.scene);
    AppMethodBeat.o(43081);
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
    AppMethodBeat.i(43079);
    String str = getString(2131301184);
    AppMethodBeat.o(43079);
    return str;
  }

  public final o aoz()
  {
    AppMethodBeat.i(43080);
    x localx = new x(this, this.elZ);
    AppMethodBeat.o(43080);
    return localx;
  }

  public final int[] bMP()
  {
    return new int[] { 131072 };
  }

  public final void bMQ()
  {
    AppMethodBeat.i(43083);
    super.bMQ();
    aqX();
    AppMethodBeat.o(43083);
  }

  public final void mO(int paramInt)
  {
    AppMethodBeat.i(43078);
    Object localObject;
    if (paramInt < getContentLV().getHeaderViewsCount())
    {
      ab.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      ab.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
      int i = getIntent().getIntExtra("key_friends_num", 0);
      localObject = new Intent();
      paramInt = s.C(new int[] { 16, 1, 2, 4, 16384, 64, 65536, 131072 });
      ((Intent)localObject).putExtra("list_type", 0);
      ((Intent)localObject).putExtra("list_attr", paramInt);
      ((Intent)localObject).putExtra("max_limit_num", i);
      ((Intent)localObject).putExtra("titile", getString(2131301183, new Object[] { Integer.valueOf(i) }));
      ((Intent)localObject).putExtra("sub_title", getString(2131305637));
      d.b(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
      overridePendingTransition(2131034229, 2131034181);
      AppMethodBeat.o(43078);
    }
    while (true)
    {
      return;
      localObject = (a)getContentLV().getAdapter().getItem(paramInt);
      if (localObject == null)
      {
        AppMethodBeat.o(43078);
      }
      else
      {
        localObject = ((a)localObject).ehM;
        if (localObject == null)
        {
          AppMethodBeat.o(43078);
        }
        else
        {
          String str = ((ap)localObject).field_username;
          ab.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", new Object[] { str });
          Intent localIntent = new Intent();
          localIntent.putExtra("Select_Conv_User", str);
          localObject = null;
          if (t.kH(str))
            localObject = getString(2131305343, new Object[] { Integer.valueOf(n.mA(str)) });
          ((i)g.K(i.class)).a(this.mController, str, getString(2131302497), str, (String)localObject, getString(2131297041), new SelectLuckyMoneyContactUI.1(this, localIntent));
          AppMethodBeat.o(43078);
        }
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(43085);
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
      AppMethodBeat.o(43085);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
      break;
      label155: ab.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = ".concat(String.valueOf(paramInt1)));
      AppMethodBeat.o(43085);
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(43084);
    if (paramInt == 4)
      bMQ();
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(43084);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI
 * JD-Core Version:    0.6.2
 */