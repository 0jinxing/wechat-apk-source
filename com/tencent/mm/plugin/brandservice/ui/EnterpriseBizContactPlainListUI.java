package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.e;
import com.tencent.mm.aj.z;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.n.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b;

public class EnterpriseBizContactPlainListUI extends MMActivity
{
  private String fuO;
  private ListView gGW;
  private EnterpriseBizContactPlainListUI.a jMi;
  private long jMj;
  private AdapterView.OnItemClickListener jMk;
  private int scene;

  public final int getLayoutId()
  {
    return 2130969396;
  }

  public final void initView()
  {
    AppMethodBeat.i(13997);
    this.gGW = ((ListView)findViewById(2131823617));
    if (this.jMi == null)
    {
      this.jMi = new EnterpriseBizContactPlainListUI.a(this, this);
      this.jMk = new EnterpriseBizContactPlainListUI.1(this);
    }
    ab.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "count = %s", new Object[] { Integer.valueOf(this.jMi.getCount()) });
    Object localObject = ((j)g.K(j.class)).XM().aoO(this.fuO);
    if (this.scene == 2)
    {
      setMMTitle(2131299221);
      if ((localObject != null) && (a.jh(((ap)localObject).field_type)) && (this.jMi.getCount() > 0))
        break label215;
      this.gGW.setVisibility(8);
      localObject = (TextView)findViewById(2131823618);
      ((TextView)localObject).setText(2131299227);
      ((TextView)localObject).setVisibility(0);
    }
    while (true)
    {
      setBackBtn(new EnterpriseBizContactPlainListUI.2(this));
      new EnterpriseBizContactPlainListUI.3(this);
      AppMethodBeat.o(13997);
      return;
      if (localObject == null)
        break;
      setMMTitle(((ad)localObject).Oi());
      break;
      label215: this.gGW.setVisibility(0);
      this.gGW.setAdapter(this.jMi);
      this.gGW.setOnItemClickListener(this.jMk);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(14001);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.scene == 4)
      finish();
    AppMethodBeat.o(14001);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13996);
    super.onCreate(paramBundle);
    this.scene = getIntent().getIntExtra("enterprise_scene", 2);
    this.fuO = getIntent().getStringExtra("enterprise_biz_name");
    this.jMj = getIntent().getLongExtra("biz_chat_chat_id", -1L);
    ab.i("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "bizName = %s", new Object[] { this.fuO });
    initView();
    z.aeR().c(this.jMi);
    ((j)g.K(j.class)).XM().a(this.jMi);
    AppMethodBeat.o(13996);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(14000);
    z.aeR().d(this.jMi);
    ((j)g.K(j.class)).XM().b(this.jMi);
    this.jMi.bIf();
    EnterpriseBizContactPlainListUI.a locala = this.jMi;
    if (locala.gvm != null)
    {
      locala.gvm.detach();
      locala.gvm = null;
    }
    super.onDestroy();
    AppMethodBeat.o(14000);
  }

  public void onPause()
  {
    AppMethodBeat.i(13999);
    super.onPause();
    AppMethodBeat.o(13999);
  }

  public void onResume()
  {
    AppMethodBeat.i(13998);
    super.onResume();
    if (!t.mY(this.fuO))
    {
      ab.e("MicroMsg.BrandService.EnterpriseBizContactPlainListUI", "%s !isContact", new Object[] { this.fuO });
      finish();
      AppMethodBeat.o(13998);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(13998);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactPlainListUI
 * JD-Core Version:    0.6.2
 */