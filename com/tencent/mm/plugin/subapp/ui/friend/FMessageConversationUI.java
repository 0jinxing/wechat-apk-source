package com.tencent.mm.plugin.subapp.ui.friend;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.an;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.p.a;
import com.tencent.mm.ui.q;

public class FMessageConversationUI extends MMActivity
{
  private n.d jKa;
  private String ptj;
  private ListView stL;
  private a stM;
  private View stN;
  private View stO;
  private TextView stP;
  private long stQ;
  private b stw;

  public FMessageConversationUI()
  {
    AppMethodBeat.i(25365);
    this.jKa = new FMessageConversationUI.7(this);
    AppMethodBeat.o(25365);
  }

  private void aMk()
  {
    AppMethodBeat.i(25371);
    if (this.stw.getCount() > 0)
    {
      this.stN.findViewById(2131823137).setVisibility(0);
      this.stO.findViewById(2131824099).setVisibility(8);
      enableOptionMenu(0, true);
      AppMethodBeat.o(25371);
    }
    while (true)
    {
      return;
      this.stN.findViewById(2131823137).setVisibility(8);
      this.stO.findViewById(2131824099).setVisibility(0);
      enableOptionMenu(0, false);
      AppMethodBeat.o(25371);
    }
  }

  public final int getLayoutId()
  {
    return 2130969577;
  }

  public final void initView()
  {
    AppMethodBeat.i(25370);
    if (com.tencent.mm.model.a.g.aaK().oP("1") != null)
    {
      localObject = com.tencent.mm.model.a.g.aaK().oP("1").value;
      if (!((String)localObject).equals("0"))
        ((String)localObject).equals("1");
      f.oT("1");
    }
    this.stw = new b(this.mController.ylL);
    d.akP().c(this.stw);
    this.stw.a(new p.a()
    {
      public final void apt()
      {
        AppMethodBeat.i(25358);
        FMessageConversationUI.a(FMessageConversationUI.this);
        AppMethodBeat.o(25358);
      }
    });
    this.stL = ((ListView)findViewById(2131824096));
    this.stN = LayoutInflater.from(this.mController.ylL).inflate(2130969582, null);
    this.stN.findViewById(2131823137).setOnClickListener(new FMessageConversationUI.2(this));
    this.stL.addHeaderView(this.stN);
    this.stO = LayoutInflater.from(this.mController.ylL).inflate(2130969578, null);
    this.stO.findViewById(2131824100).setOnClickListener(new FMessageConversationUI.3(this));
    this.stL.addHeaderView(this.stO);
    this.stL.setAdapter(this.stw);
    aMk();
    Object localObject = new com.tencent.mm.ui.tools.j(this);
    this.stL.setOnItemLongClickListener(new FMessageConversationUI.4(this, (com.tencent.mm.ui.tools.j)localObject));
    localObject = this.mController.ylL;
    b localb = this.stw;
    if (this.stL.getHeaderViewsCount() > 0);
    for (boolean bool = true; ; bool = false)
    {
      this.stM = new a((Context)localObject, localb, bool);
      this.stL.setOnItemClickListener(this.stM);
      addTextOptionMenu(0, getString(2131301424), new FMessageConversationUI.5(this));
      setBackBtn(new FMessageConversationUI.6(this));
      AppMethodBeat.o(25370);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25366);
    super.onCreate(paramBundle);
    setMMTitle(2131299905);
    try
    {
      com.tencent.mm.model.aw.getNotification().IH();
      if (!com.tencent.mm.model.aw.RK())
      {
        finish();
        AppMethodBeat.o(25366);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.FMessageConversationUI", paramBundle, "try cancel notification fail", new Object[0]);
        continue;
        initView();
        AppMethodBeat.o(25366);
      }
    }
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(25372);
    paramContextMenuInfo = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    paramView = (av)this.stw.getItem(paramContextMenuInfo.position);
    if (paramView == null)
    {
      ab.e("MicroMsg.FMessageConversationUI", "onItemLongClick, item is null, pos = " + paramContextMenuInfo.position);
      AppMethodBeat.o(25372);
    }
    while (true)
    {
      return;
      if (!bo.isNullOrNil(paramView.field_displayName))
        paramContextMenu.setHeaderTitle(com.tencent.mm.pluginsdk.ui.e.j.b(this, paramView.field_displayName));
      paramContextMenu.add(0, 0, 0, 2131296881);
      this.stQ = paramView.field_fmsgSysRowId;
      this.ptj = paramView.field_talker;
      AppMethodBeat.o(25372);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25369);
    super.onDestroy();
    if (this.stw != null)
      d.akP().d(this.stw);
    if (!com.tencent.mm.kernel.g.RN().QY())
    {
      ab.w("MicroMsg.FMessageConversationUI", "account not init.");
      AppMethodBeat.o(25369);
    }
    while (true)
    {
      return;
      f.oU("1");
      d.akP().dtc();
      AppMethodBeat.o(25369);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(25367);
    super.onPause();
    com.tencent.mm.model.aw.ZK();
    com.tencent.mm.model.c.Ry().set(143618, Integer.valueOf(0));
    AppMethodBeat.o(25367);
  }

  public void onResume()
  {
    AppMethodBeat.i(25368);
    super.onResume();
    if (!com.tencent.mm.model.aw.RK())
    {
      finish();
      AppMethodBeat.o(25368);
    }
    while (true)
    {
      return;
      if ((this.stP != null) && (bo.gT(this)))
        this.stP.setText(2131299911);
      AppMethodBeat.o(25368);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.friend.FMessageConversationUI
 * JD-Core Version:    0.6.2
 */