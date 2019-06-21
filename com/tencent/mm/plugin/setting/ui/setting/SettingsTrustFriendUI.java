package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.protocal.protobuf.apd;
import com.tencent.mm.protocal.protobuf.ciu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.contact.s;
import com.tencent.mm.ui.e.j;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SettingsTrustFriendUI extends MMActivity
  implements f
{
  private static int qpn = 5;
  private View jyC;
  private com.tencent.mm.ui.base.p lRg;
  private GridView mPe;
  private TextView nml;
  private boolean qnu;
  private List<String> qpl;
  private SettingsTrustFriendUI.a qpm;

  private void cjh()
  {
    AppMethodBeat.i(127554);
    String str = (String)g.RP().Ry().get(352277, null);
    ArrayList localArrayList = new ArrayList();
    if (!bo.isNullOrNil(str))
      localArrayList = bo.P(str.split(","));
    while (true)
    {
      if ((this.qpl.size() == localArrayList.size()) && (this.qpl.containsAll(localArrayList)))
      {
        finish();
        AppMethodBeat.o(127554);
      }
      while (true)
      {
        return;
        h.a(this, getString(2131302710), getString(2131297061), getString(2131297038), getString(2131296991), true, new SettingsTrustFriendUI.3(this), new SettingsTrustFriendUI.4(this));
        AppMethodBeat.o(127554);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970646;
  }

  public final void initView()
  {
    AppMethodBeat.i(127551);
    setMMTitle(2131303313);
    this.mPe = ((GridView)findViewById(2131827447));
    this.qpm = new SettingsTrustFriendUI.a(this, (byte)0);
    int i = getResources().getDimensionPixelSize(2131427806);
    this.mPe.setColumnWidth(i);
    this.mPe.setNumColumns(-1);
    this.mPe.setStretchMode(1);
    this.mPe.setHorizontalSpacing(getResources().getDimensionPixelSize(2131428431) * 2);
    this.mPe.setVerticalSpacing(getResources().getDimensionPixelSize(2131428432));
    this.mPe.setAdapter(this.qpm);
    ((ViewGroup)this.mPe.getParent()).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(127537);
        if (SettingsTrustFriendUI.b(SettingsTrustFriendUI.this))
        {
          SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, false);
          SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).notifyDataSetChanged();
        }
        AppMethodBeat.o(127537);
      }
    });
    this.mPe.setOnTouchListener(new SettingsTrustFriendUI.7(this));
    this.mPe.setHorizontalScrollBarEnabled(false);
    this.mPe.setVerticalScrollBarEnabled(false);
    this.mPe.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(127539);
        if (SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItemViewType(paramAnonymousInt) == 1)
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousAdapterView.putExtra("list_type", 12);
          paramAnonymousAdapterView.putExtra("titile", SettingsTrustFriendUI.this.getString(2131296486));
          paramAnonymousAdapterView.putExtra("scene", 2);
          paramAnonymousAdapterView.putExtra("max_limit_num", SettingsTrustFriendUI.AN());
          paramAnonymousAdapterView.putExtra("stay_in_wechat", true);
          paramAnonymousAdapterView.putExtra("already_select_contact", bo.c(SettingsTrustFriendUI.e(SettingsTrustFriendUI.this), ","));
          paramAnonymousAdapterView.putExtra("block_contact", r.Yz());
          paramAnonymousAdapterView.putExtra("list_attr", s.hs(s.znK, 256));
          paramAnonymousAdapterView.putExtra("too_many_member_tip_string", SettingsTrustFriendUI.this.getString(2131303315, new Object[] { Integer.valueOf(SettingsTrustFriendUI.AN()) }));
          d.b(SettingsTrustFriendUI.this, ".ui.contact.SelectContactUI", paramAnonymousAdapterView, 1);
          AppMethodBeat.o(127539);
          return;
        }
        if (SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItemViewType(paramAnonymousInt) == 2)
          if (!SettingsTrustFriendUI.b(SettingsTrustFriendUI.this))
            SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, true);
        while (true)
        {
          SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).notifyDataSetChanged();
          do
          {
            AppMethodBeat.o(127539);
            break;
          }
          while ((SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItemViewType(paramAnonymousInt) != 0) || (!SettingsTrustFriendUI.b(SettingsTrustFriendUI.this)));
          SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).remove(SettingsTrustFriendUI.c(SettingsTrustFriendUI.this).getItem(paramAnonymousInt));
          if (SettingsTrustFriendUI.e(SettingsTrustFriendUI.this).size() == 0)
            SettingsTrustFriendUI.a(SettingsTrustFriendUI.this, false);
        }
      }
    });
    this.nml = ((TextView)findViewById(2131827445));
    String str = getIntent().getStringExtra(e.j.ygc);
    if (!bo.isNullOrNil(str))
      this.nml.setText(str);
    while (true)
    {
      this.jyC = findViewById(2131827443);
      this.jyC.setVisibility(8);
      ((TextView)this.jyC.findViewById(2131827444)).setText(getString(2131303316, new Object[] { Integer.valueOf(3) }));
      this.jyC.findViewById(2131822694).setOnClickListener(new SettingsTrustFriendUI.9(this));
      findViewById(2131827446).setOnClickListener(new SettingsTrustFriendUI.10(this));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(127542);
          SettingsTrustFriendUI.g(SettingsTrustFriendUI.this);
          AppMethodBeat.o(127542);
          return true;
        }
      });
      a(1, getString(2131296944), new SettingsTrustFriendUI.12(this), q.b.ymu);
      showOptionMenu(true);
      AppMethodBeat.o(127551);
      return;
      this.nml.setText(getResources().getString(2131303317, new Object[] { Integer.valueOf(3) }));
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(127552);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 1) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      if (!bo.isNullOrNil(paramIntent))
      {
        this.qpl.clear();
        this.qpl.addAll(bo.P(paramIntent.split(",")));
        this.qpm.notifyDataSetChanged();
      }
    }
    AppMethodBeat.o(127552);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127548);
    super.onCreate(paramBundle);
    paramBundle = (String)g.RP().Ry().get(352277, null);
    if (!bo.isNullOrNil(paramBundle))
      this.qpl = bo.P(paramBundle.split(","));
    if (this.qpl == null)
      this.qpl = new ArrayList();
    this.mController.contentView.post(new SettingsTrustFriendUI.1(this));
    initView();
    AppMethodBeat.o(127548);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127555);
    boolean bool;
    if (paramInt == 4)
    {
      cjh();
      bool = true;
      AppMethodBeat.o(127555);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(127555);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127553);
    ab.d("MicroMsg.SettingsTrustFriendUI", "errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.lRg != null)
      this.lRg.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 869)
      {
        paramString = (apd)((b)paramm.ftl).fsH.fsP;
        qpn = paramString.wte;
        paramm = paramString.vET;
        if (paramm.size() == this.qpl.size())
          if (paramm.size() == 0)
            paramInt1 = 0;
        while (paramInt1 != 0)
        {
          this.qpl.clear();
          paramm = paramm.iterator();
          while (true)
            if (paramm.hasNext())
            {
              paramString = (ciu)paramm.next();
              this.qpl.add(paramString.jBB);
              continue;
              paramString = paramm.iterator();
              while (true)
                if (paramString.hasNext())
                {
                  ciu localciu = (ciu)paramString.next();
                  if (!this.qpl.contains(localciu.jBB))
                  {
                    paramInt1 = 1;
                    break;
                  }
                }
              paramInt1 = 0;
              break;
            }
          this.qpm.notifyDataSetChanged();
        }
        if ((this.qpl.size() > 0) && (this.qpl.size() < 3))
          this.jyC.setVisibility(0);
        g.RP().Ry().set(352277, bo.c(this.qpl, ","));
        AppMethodBeat.o(127553);
      }
    while (true)
    {
      return;
      if (paramm.getType() == 583)
      {
        g.RP().Ry().set(352277, bo.c(this.qpl, ","));
        finish();
        AppMethodBeat.o(127553);
        continue;
        if (!bo.isNullOrNil(paramString))
          h.bQ(this, paramString);
      }
      else
      {
        AppMethodBeat.o(127553);
      }
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(127549);
    super.onStart();
    g.Rg().a(869, this);
    g.Rg().a(583, this);
    AppMethodBeat.o(127549);
  }

  public void onStop()
  {
    AppMethodBeat.i(127550);
    super.onStop();
    g.Rg().b(869, this);
    g.Rg().b(583, this);
    AppMethodBeat.o(127550);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a$a
  {
    TextView jAJ;
    ImageView qgZ;
    ImageView qpr;

    private a$a()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI
 * JD-Core Version:    0.6.2
 */