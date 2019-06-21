package com.tencent.mm.plugin.shake.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.shake.b.d;
import com.tencent.mm.plugin.shake.b.e;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.tools.j;

public class ShakeItemListUI extends MMActivity
{
  private a fGv;
  private ListView gxZ;
  private int id;
  private n.d jKa;
  private View kmS;
  private boolean quA;
  private ShakeItemListUI.a quB;
  public long quz;
  private int showType;

  public ShakeItemListUI()
  {
    AppMethodBeat.i(24738);
    this.quz = 0L;
    this.quA = false;
    this.fGv = null;
    this.jKa = new ShakeItemListUI.8(this);
    AppMethodBeat.o(24738);
  }

  public static int CC(int paramInt)
  {
    int i = 2131303406;
    int j = i;
    switch (paramInt)
    {
    default:
      j = i;
    case -1:
    case 0:
    case 100:
    case -5:
    case 4:
    case -6:
    case 5:
    case -12:
    case 11:
    }
    while (true)
    {
      return j;
      j = 2131303410;
      continue;
      j = 2131303440;
      continue;
      j = 2131303480;
      continue;
      j = 2131303413;
    }
  }

  protected final void CB(int paramInt)
  {
    AppMethodBeat.i(24744);
    this.quB.CB(paramInt);
    switch (paramInt)
    {
    default:
    case 0:
    case 11:
    case -12:
    case -1:
    }
    while (true)
    {
      AppMethodBeat.o(24744);
      while (true)
      {
        return;
        if (this.kmS == null)
          break;
        this.kmS.findViewById(2131827479).setVisibility(8);
        AppMethodBeat.o(24744);
      }
      if (this.kmS != null)
        this.kmS.findViewById(2131827479).setVisibility(0);
    }
  }

  public final int getLayoutId()
  {
    return 2130970651;
  }

  public final void initView()
  {
    AppMethodBeat.i(24740);
    this.fGv = new a(this);
    aw.ZK();
    int i = bo.a((Integer)c.Ry().get(12290, null), 0);
    this.showType = getIntent().getIntExtra("_key_show_type_", 0);
    Object localObject = getIntent().getStringExtra("_key_title_");
    if (!bo.isNullOrNil((String)localObject))
      setMMTitle((String)localObject);
    this.quA = getIntent().getBooleanExtra("_key_show_from_shake_", false);
    addTextOptionMenu(0, getString(2131296871), new ShakeItemListUI.1(this));
    this.gxZ = ((ListView)findViewById(2131826296));
    this.kmS = getLayoutInflater().inflate(2130970653, null);
    this.kmS.findViewById(2131827479).setOnClickListener(new ShakeItemListUI.2(this));
    this.gxZ.addFooterView(this.kmS);
    if (this.showType == -1)
    {
      this.kmS.findViewById(2131827479).setVisibility(0);
      this.quB = new ShakeItemListUI.a(this, this);
      this.quB.CB(this.showType);
      if (this.quB.getCount() > 0)
        break label322;
      this.gxZ.setVisibility(8);
      localObject = (TextView)findViewById(2131826297);
      ((TextView)localObject).setText(CC(this.showType));
      ((TextView)localObject).setVisibility(0);
      enableOptionMenu(false);
    }
    while (true)
    {
      setBackBtn(new ShakeItemListUI.5(this));
      new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          AppMethodBeat.i(24725);
          BackwardSupportUtil.c.a(ShakeItemListUI.c(ShakeItemListUI.this));
          AppMethodBeat.o(24725);
        }
      };
      this.gxZ.setOnTouchListener(new ShakeItemListUI.7(this));
      AppMethodBeat.o(24740);
      return;
      this.kmS.findViewById(2131827479).setVisibility(8);
      break;
      label322: this.gxZ.setAdapter(this.quB);
      this.gxZ.setOnItemClickListener(new ShakeItemListUI.3(this, i));
      localObject = new j(this);
      this.gxZ.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
      {
        public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(24723);
          if (paramAnonymousInt < ShakeItemListUI.c(ShakeItemListUI.this).getHeaderViewsCount())
          {
            ab.w("MicroMsg.ShakeItemListUI", "on header view long click, ignore");
            AppMethodBeat.o(24723);
          }
          while (true)
          {
            return true;
            this.jKd.a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, ShakeItemListUI.this, ShakeItemListUI.e(ShakeItemListUI.this));
            AppMethodBeat.o(24723);
          }
        }
      });
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(24739);
    super.onCreate(paramBundle);
    initView();
    m.cjS().c(this.quB);
    this.quB.KD();
    ab.i("MicroMsg.ShakeItemListUI", "onResume");
    AppMethodBeat.o(24739);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(24741);
    paramView = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    this.id = ((d)this.quB.getItem(paramView.position)).field_shakeItemID;
    paramContextMenu.add(paramView.position, 0, 0, 2131296881);
    AppMethodBeat.o(24741);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(24743);
    this.quB.bIf();
    ShakeItemListUI.a locala = this.quB;
    if (locala.gvm != null)
    {
      locala.gvm.detach();
      locala.gvm = null;
    }
    m.cjS().d(this.quB);
    ab.i("MicroMsg.ShakeItemListUI", "onPause");
    if (this.fGv != null)
      this.fGv.detach();
    super.onDestroy();
    AppMethodBeat.o(24743);
  }

  public void onPause()
  {
    AppMethodBeat.i(24742);
    super.onPause();
    AppMethodBeat.o(24742);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeItemListUI
 * JD-Core Version:    0.6.2
 */