package com.tencent.mm.chatroom.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ag;
import com.tencent.mm.plugin.chatroom.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.HashSet;
import java.util.List;

public class SelectMemberUI extends MMActivity
{
  protected u eih;
  protected String ejD;
  private MMEditText elU;
  private SelectMemberScrollBar emA;
  protected SelectMemberUI.b emB;
  protected int emC;
  protected HashSet<String> emD;
  private boolean emE;
  private boolean emF;
  private View emy;
  private View emz;
  private ListView mListView;
  protected String mTitle;

  protected static String a(u paramu, String paramString)
  {
    AppMethodBeat.i(104435);
    if (paramu == null)
    {
      paramu = null;
      AppMethodBeat.o(104435);
    }
    while (true)
    {
      return paramu;
      paramu = paramu.mJ(paramString);
      AppMethodBeat.o(104435);
    }
  }

  public boolean Kl()
  {
    return false;
  }

  protected void Kq()
  {
    AppMethodBeat.i(104430);
    this.ejD = getIntent().getStringExtra("RoomInfo_Id");
    ab.i("MicroMsg.SelectMemberUI", "[getIntentParams] roomId:%s", new Object[] { this.ejD });
    this.eih = ((c)g.K(c.class)).XV().ob(this.ejD);
    this.emC = getIntent().getIntExtra("from_scene", 0);
    this.mTitle = getIntent().getStringExtra("title");
    this.emE = getIntent().getBooleanExtra("is_show_owner", true);
    this.emF = getIntent().getBooleanExtra("is_mulit_select_mode", false);
    this.emD = new HashSet();
    AppMethodBeat.o(104430);
  }

  public boolean Kr()
  {
    return this.emF;
  }

  protected HashSet<String> Ks()
  {
    AppMethodBeat.i(104433);
    HashSet localHashSet = new HashSet();
    AppMethodBeat.o(104433);
    return localHashSet;
  }

  protected HashSet<String> Ku()
  {
    AppMethodBeat.i(104432);
    HashSet localHashSet = new HashSet();
    AppMethodBeat.o(104432);
    return localHashSet;
  }

  protected boolean Kv()
  {
    return true;
  }

  protected BaseAdapter Kw()
  {
    return this.emB;
  }

  protected List<String> Kx()
  {
    AppMethodBeat.i(104434);
    List localList = this.eih.afg();
    AppMethodBeat.o(104434);
    return localList;
  }

  public final u Kz()
  {
    return this.eih;
  }

  protected void a(View paramView, int paramInt, long paramLong)
  {
  }

  public final int getLayoutId()
  {
    return 2130970598;
  }

  public void initView()
  {
    AppMethodBeat.i(104431);
    setMMTitle(bo.nullAsNil(this.mTitle));
    this.mListView = ((ListView)findViewById(2131827317));
    this.emy = findViewById(2131827318);
    this.emz = findViewById(2131827328);
    this.emB = new SelectMemberUI.b(this, this, this.eih, this.ejD, this.eih.field_roomowner);
    this.mListView.setAdapter(Kw());
    this.emA = ((SelectMemberScrollBar)findViewById(2131827327));
    this.emA.setOnScrollBarTouchListener(new SelectMemberUI.1(this));
    if (Kv())
      this.emA.setVisibility(0);
    while (true)
    {
      this.elU = ((MMEditText)findViewById(2131827326));
      this.elU.addTextChangedListener(new SelectMemberUI.2(this));
      SelectMemberUI.b localb = this.emB;
      localb.emG.emz.setVisibility(0);
      g.RS().aa(new SelectMemberUI.b.1(localb));
      setBackBtn(new SelectMemberUI.3(this));
      AppMethodBeat.o(104431);
      return;
      this.emA.setVisibility(8);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(104429);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.SelectMemberUI", "[onCreate]");
    Kq();
    initView();
    AppMethodBeat.o(104429);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  protected void w(int paramInt, boolean paramBoolean)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.SelectMemberUI
 * JD-Core Version:    0.6.2
 */