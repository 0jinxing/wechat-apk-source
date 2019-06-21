package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.n;
import com.tencent.mm.pluginsdk.model.app.o;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.ui.widget.sortlist.DragSortListView;
import java.util.Collections;
import java.util.List;

public class Sort3rdAppUI extends MMActivity
{
  private DragSortListView lar;
  private long wPF;
  private Sort3rdAppUI.a yqn;
  private List<f> yqo;

  protected final int getLayoutId()
  {
    return 2130970834;
  }

  protected final void initView()
  {
    AppMethodBeat.i(29905);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(29897);
        Sort3rdAppUI.this.finish();
        AppMethodBeat.o(29897);
        return true;
      }
    });
    setMMTitle(getString(2131296394));
    this.lar = ((DragSortListView)findViewById(2131821698));
    this.lar.setDropListener(new Sort3rdAppUI.2(this));
    AppMethodBeat.o(29905);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29904);
    super.onCreate(paramBundle);
    this.wPF = getIntent().getLongExtra("KFlag", -1L);
    initView();
    this.yqo = g.b(this, this.wPF, true);
    paramBundle = am.dhO().mb(this.wPF);
    if ((paramBundle != null) && (paramBundle.size() > 0))
      Collections.sort(this.yqo, new Sort3rdAppUI.3(this, paramBundle));
    this.yqn = new Sort3rdAppUI.a(this, this.yqo, this.wPF);
    this.lar.setAdapter(this.yqn);
    AppMethodBeat.o(29904);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(29906);
    super.onDestroy();
    AppMethodBeat.o(29906);
  }

  public void onPause()
  {
    AppMethodBeat.i(29907);
    super.onPause();
    if (this.yqn != null)
    {
      List localList = this.yqn.kSg;
      o localo = am.dhO();
      long l = this.wPF;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("delete from AppSort");
      ((StringBuilder)localObject).append(" where flag = ").append(l).append(" ");
      localObject = ((StringBuilder)localObject).toString();
      localo.bSd.hY("AppSort", (String)localObject);
      if ((localList != null) && (localList.size() > 0))
      {
        aw.ZK();
        l = c.Ru().iV(Thread.currentThread().getId());
        localo = am.dhO();
        for (int i = 0; i < localList.size(); i++)
        {
          localObject = new n();
          ((n)localObject).field_flag = this.wPF;
          ((n)localObject).field_appId = ((f)localList.get(i)).field_appId;
          ((n)localObject).field_sortId = i;
          localo.a((n)localObject);
        }
        aw.ZK();
        c.Ru().mB(l);
      }
    }
    AppMethodBeat.o(29907);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.Sort3rdAppUI
 * JD-Core Version:    0.6.2
 */