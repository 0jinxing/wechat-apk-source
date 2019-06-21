package com.tencent.mm.plugin.readerapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.protobuf.bcn;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;

public class ReaderAppSubscribeUI extends MMActivity
{
  private ListView pEX;
  private ReaderAppSubscribeUI.a pEY;

  private void By(int paramInt)
  {
    AppMethodBeat.i(76810);
    g.RP().Ry().set(868518889, Integer.valueOf(paramInt));
    Object localObject = new bcn();
    ((bcn)localObject).wGO = paramInt;
    ((j)g.K(j.class)).XL().c(new j.a(43, (com.tencent.mm.bt.a)localObject));
    localObject = new Intent();
    ((Intent)localObject).putExtra("Contact_User", "newsapp");
    ((Intent)localObject).addFlags(67108864);
    com.tencent.mm.plugin.readerapp.b.a.gkE.c((Intent)localObject, this);
    finish();
    AppMethodBeat.o(76810);
  }

  public final int getLayoutId()
  {
    return 2130970462;
  }

  public final void initView()
  {
    AppMethodBeat.i(76808);
    this.pEY = new ReaderAppSubscribeUI.a(this, bo.h((Integer)g.RP().Ry().get(868518889, null)));
    this.pEX = ((ListView)findViewById(2131826845));
    this.pEX.setAdapter(this.pEY);
    this.pEX.setOnItemClickListener(new ReaderAppSubscribeUI.1(this));
    this.pEY.notifyDataSetChanged();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(76803);
        ReaderAppSubscribeUI.a(ReaderAppSubscribeUI.this, ReaderAppSubscribeUI.a(ReaderAppSubscribeUI.this).pFb);
        AppMethodBeat.o(76803);
        return true;
      }
    });
    new ReaderAppSubscribeUI.3(this);
    AppMethodBeat.o(76808);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(76807);
    super.onCreate(paramBundle);
    g.RP().Ry().set(868518890, "in");
    setMMTitle(2131298636);
    initView();
    AppMethodBeat.o(76807);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(76809);
    boolean bool;
    if (paramInt == 4)
    {
      if (this.pEY != null)
        By(this.pEY.pFb);
      bool = true;
      AppMethodBeat.o(76809);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(76809);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(76811);
    super.onResume();
    this.pEY.notifyDataSetChanged();
    AppMethodBeat.o(76811);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppSubscribeUI
 * JD-Core Version:    0.6.2
 */