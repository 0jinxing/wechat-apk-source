package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.n;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GroupCardSelectUI extends MMActivity
{
  private TextView emptyTipTv;
  private List<ad> oov;
  private boolean zmC = true;
  private boolean zmD;
  private boolean zmE = false;
  private List<String> zmF = null;
  private int zmG;
  private ListView zmH;
  private a zmI;
  private HashMap<String, Long> zmJ;

  private void Kt()
  {
    AppMethodBeat.i(33741);
    StringBuilder localStringBuilder;
    if (this.zmE)
    {
      localStringBuilder = new StringBuilder().append(getString(2131296994));
      if (this.zmF.size() <= 0)
        break label85;
    }
    label85: for (String str = String.format("(%s)", new Object[] { Integer.valueOf(this.zmF.size()) }); ; str = "")
    {
      updateOptionMenuText(1, str);
      AppMethodBeat.o(33741);
      return;
    }
  }

  private void a(int paramInt, ad paramad, long paramLong)
  {
    AppMethodBeat.i(33740);
    for (int i = 0; (i < paramInt) && (paramLong <= ((Long)this.zmJ.get(((ad)this.oov.get(i)).field_username)).longValue()); i++);
    this.oov.add(i, paramad);
    AppMethodBeat.o(33740);
  }

  private void dHT()
  {
    AppMethodBeat.i(33739);
    aw.ZK();
    this.zmJ = c.XR().dsK();
    this.oov = new LinkedList();
    List localList = t.Zi();
    if (localList.size() == 0)
    {
      AppMethodBeat.o(33739);
      return;
    }
    Iterator localIterator = localList.iterator();
    int i = 0;
    label60: 
    while (localIterator.hasNext())
    {
      ad localad = (ad)localIterator.next();
      if (!this.zmJ.containsKey(localad.field_username))
      {
        if (!com.tencent.mm.n.a.jh(localad.field_type))
          break label166;
        this.oov.add(localad);
      }
      else
      {
        a(i, localad, ((Long)this.zmJ.get(localad.field_username)).longValue());
        i++;
      }
    }
    label166: 
    while (true)
    {
      break label60;
      localList.clear();
      AppMethodBeat.o(33739);
      break;
    }
  }

  public final int getLayoutId()
  {
    return 2130969810;
  }

  public final void initView()
  {
    AppMethodBeat.i(33738);
    this.zmH = ((ListView)findViewById(2131824699));
    this.zmI = new a();
    this.zmH.setAdapter(this.zmI);
    this.zmH.setOnItemClickListener(new GroupCardSelectUI.1(this));
    this.emptyTipTv = ((TextView)findViewById(2131824700));
    if (this.zmI.getCount() <= 0)
      this.emptyTipTv.setVisibility(0);
    while (true)
    {
      setBackBtn(new GroupCardSelectUI.2(this));
      AppMethodBeat.o(33738);
      return;
      this.emptyTipTv.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33734);
    super.onCreate(paramBundle);
    setMMTitle(getString(2131296477));
    this.zmC = getIntent().getBooleanExtra("group_select_type", true);
    this.zmD = getIntent().getBooleanExtra("group_select_need_result", false);
    this.zmE = getIntent().getBooleanExtra("group_multi_select", false);
    if (this.zmE)
    {
      paramBundle = getIntent().getStringExtra("already_select_contact");
      if (!bo.isNullOrNil(paramBundle))
        break label172;
    }
    label172: for (this.zmF = new LinkedList(); ; this.zmF = ah.j(paramBundle.split(",")))
    {
      this.zmG = getIntent().getIntExtra("max_limit_num", 0);
      dHT();
      initView();
      if (this.zmE)
      {
        a(1, getString(2131296994), new GroupCardSelectUI.3(this), q.b.ymu);
        enableOptionMenu(1, true);
        Kt();
      }
      AppMethodBeat.o(33734);
      return;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33735);
    super.onDestroy();
    AppMethodBeat.o(33735);
  }

  public void onPause()
  {
    AppMethodBeat.i(33737);
    super.onPause();
    AppMethodBeat.o(33737);
  }

  public void onResume()
  {
    AppMethodBeat.i(33736);
    super.onResume();
    AppMethodBeat.o(33736);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends BaseAdapter
  {
    public a()
    {
    }

    public final int getCount()
    {
      AppMethodBeat.i(33732);
      int i = GroupCardSelectUI.c(GroupCardSelectUI.this).size();
      AppMethodBeat.o(33732);
      return i;
    }

    public final Object getItem(int paramInt)
    {
      AppMethodBeat.i(33733);
      Object localObject = GroupCardSelectUI.c(GroupCardSelectUI.this).get(paramInt);
      AppMethodBeat.o(33733);
      return localObject;
    }

    public final long getItemId(int paramInt)
    {
      return 0L;
    }

    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      AppMethodBeat.i(33731);
      ad localad = (ad)GroupCardSelectUI.c(GroupCardSelectUI.this).get(paramInt);
      if (paramView == null)
      {
        paramViewGroup = new GroupCardSelectUI.b(GroupCardSelectUI.this);
        paramView = View.inflate(GroupCardSelectUI.this, 2130969811, null);
        paramViewGroup.nJc = ((TextView)paramView.findViewById(2131824703));
        paramViewGroup.zmL = ((TextView)paramView.findViewById(2131824702));
        paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131824701));
        paramViewGroup.piE = ((CheckBox)paramView.findViewById(2131821593));
        paramView.setTag(paramViewGroup);
        a.b.b(paramViewGroup.gvq, localad.field_username);
        paramViewGroup.zmL.setText(j.b(GroupCardSelectUI.this, s.mJ(localad.field_username), com.tencent.mm.bz.a.al(GroupCardSelectUI.this.mController.ylL, 2131427813)));
        paramViewGroup.nJc.setText("(" + n.mA(localad.field_username) + ")");
        if (!t.mP(localad.field_username))
          break label309;
        Drawable localDrawable = GroupCardSelectUI.this.getResources().getDrawable(2131231778);
        localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
        paramViewGroup.zmL.setCompoundDrawablesWithIntrinsicBounds(null, null, localDrawable, null);
        label245: if (GroupCardSelectUI.d(GroupCardSelectUI.this))
        {
          paramViewGroup.piE.setVisibility(0);
          if (!GroupCardSelectUI.e(GroupCardSelectUI.this).contains(localad.field_username))
            break label323;
          paramViewGroup.piE.setChecked(true);
        }
      }
      while (true)
      {
        AppMethodBeat.o(33731);
        return paramView;
        paramViewGroup = (GroupCardSelectUI.b)paramView.getTag();
        break;
        label309: paramViewGroup.zmL.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
        break label245;
        label323: paramViewGroup.piE.setChecked(false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.GroupCardSelectUI
 * JD-Core Version:    0.6.2
 */