package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class AppAttachFileListUI extends MMActivity
  implements h.a
{
  private AdapterView.OnItemClickListener jMk;
  private int jaQ;
  private AbsListView.OnScrollListener kxp;
  private ArrayList<AppAttachFileListUI.c> yGk;
  private HashSet<Long> yGl;
  private ListView yGm;
  private AppAttachFileListUI.b yGn;
  private boolean yGo;
  private boolean yGp;
  private View yGq;

  public AppAttachFileListUI()
  {
    AppMethodBeat.i(30338);
    this.yGo = true;
    this.yGp = false;
    this.jMk = new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(30331);
        paramAnonymousAdapterView = new Intent();
        paramAnonymousAdapterView.setClassName(AppAttachFileListUI.this, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        paramAnonymousAdapterView.putExtra("app_msg_id", ((AppAttachFileListUI.c)AppAttachFileListUI.a(AppAttachFileListUI.this).get(paramAnonymousInt)).cKd.field_msgId);
        paramAnonymousAdapterView.setFlags(67108864);
        AppAttachFileListUI.this.startActivity(paramAnonymousAdapterView);
        AppMethodBeat.o(30331);
      }
    };
    this.kxp = new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
        AppMethodBeat.i(30332);
        if ((paramAnonymousInt == 0) && (!AppAttachFileListUI.b(AppAttachFileListUI.this)) && (AppAttachFileListUI.c(AppAttachFileListUI.this)) && (paramAnonymousAbsListView.getLastVisiblePosition() == AppAttachFileListUI.d(AppAttachFileListUI.this).getCount()))
        {
          ab.d("MicroMsg.AppAttachFileListUI", "need to add item");
          paramAnonymousInt = AppAttachFileListUI.e(AppAttachFileListUI.this);
          new AppAttachFileListUI.a(AppAttachFileListUI.this, (byte)0).execute(new Integer[] { Integer.valueOf(paramAnonymousInt), Integer.valueOf(20) });
          AppAttachFileListUI.f(AppAttachFileListUI.this);
        }
        AppMethodBeat.o(30332);
      }
    };
    AppMethodBeat.o(30338);
  }

  private AppAttachFileListUI.c at(bi parambi)
  {
    AppMethodBeat.i(30343);
    j.b localb = j.b.me(parambi.field_content);
    if (localb == null)
    {
      parambi = null;
      AppMethodBeat.o(30343);
    }
    while (true)
    {
      return parambi;
      AppAttachFileListUI.c localc = new AppAttachFileListUI.c(this, (byte)0);
      localc.cKd = parambi;
      localc.yGs = localb;
      AppMethodBeat.o(30343);
      parambi = localc;
    }
  }

  private void eO(List<bi> paramList)
  {
    AppMethodBeat.i(30342);
    if (paramList.size() < 20)
    {
      this.yGo = false;
      this.yGm.removeFooterView(this.yGq);
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      bi localbi = (bi)localIterator.next();
      AppAttachFileListUI.c localc = at(localbi);
      if ((localc != null) && (localc.yGs.type == 6) && (this.yGl.add(Long.valueOf(localbi.field_msgId))))
        this.yGk.add(localc);
    }
    ab.d("MicroMsg.AppAttachFileListUI", "append file item list size %d, current total size is %d", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(this.yGk.size()) });
    AppMethodBeat.o(30342);
  }

  public final void a(h paramh, h.c paramc)
  {
    AppMethodBeat.i(30344);
    if ("insert".equals(paramc.oqJ))
    {
      ab.d("MicroMsg.AppAttachFileListUI", "reveive a msg");
      for (int i = paramc.oqK.size() - 1; i >= 0; i--)
      {
        paramh = (bi)paramc.oqK.get(i);
        if (paramh.bAA())
        {
          paramh = at(paramh);
          if ((paramh != null) && (paramh.yGs.type == 6))
            this.yGk.add(0, paramh);
        }
      }
      if (this.yGn != null)
        this.yGn.notifyDataSetChanged();
    }
    AppMethodBeat.o(30344);
  }

  public final int getLayoutId()
  {
    return 2130968652;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30339);
    super.onCreate(paramBundle);
    setMMTitle(2131299790);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(30330);
        AppAttachFileListUI.this.finish();
        AppMethodBeat.o(30330);
        return true;
      }
    });
    this.yGm = ((ListView)findViewById(2131821108));
    this.yGq = getLayoutInflater().inflate(2130968650, null);
    this.yGm.addFooterView(this.yGq);
    this.yGq.setVisibility(8);
    this.yGk = new ArrayList();
    this.yGl = new HashSet();
    paramBundle = r.Yz();
    aw.ZK();
    paramBundle = c.XO().aa(paramBundle, 0, 20);
    this.jaQ += 20;
    eO(paramBundle);
    this.yGn = new AppAttachFileListUI.b(this, (byte)0);
    this.yGm.setAdapter(this.yGn);
    this.yGm.setOnItemClickListener(this.jMk);
    this.yGm.setOnScrollListener(this.kxp);
    aw.ZK();
    c.XO().a(this, getMainLooper());
    AppMethodBeat.o(30339);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30341);
    aw.ZK();
    c.XO().a(this);
    super.onDestroy();
    AppMethodBeat.o(30341);
  }

  public void onResume()
  {
    AppMethodBeat.i(30340);
    super.onResume();
    AppMethodBeat.o(30340);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class d
  {
    public MMImageView yGt;
    public TextView yGu;
    public TextView yGv;
    public TextView yGw;

    private d()
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppAttachFileListUI
 * JD-Core Version:    0.6.2
 */