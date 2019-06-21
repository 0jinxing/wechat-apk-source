package com.tencent.mm.pluginsdk.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

@com.tencent.mm.ui.base.a(19)
public class NewFileExplorerUI extends MMActivity
{
  private ListView gGW;
  private int mode;
  private TextView pxy;
  private String toUserName;
  private NewFileExplorerUI.a vuV;
  private TextView vuW;
  private FileSelectorFolderView vuX;
  private g.a vuY;
  private FileSelectorFolderView.a vuZ;

  public NewFileExplorerUI()
  {
    AppMethodBeat.i(28209);
    this.mode = 0;
    this.vuZ = new NewFileExplorerUI.7(this);
    AppMethodBeat.o(28209);
  }

  private void cbv()
  {
    AppMethodBeat.i(28215);
    int i = NewFileExplorerUI.a.a(this.vuV).size();
    if (i > 0)
    {
      if (this.mode == 0)
      {
        updateOptionMenuText(1, getString(2131297041) + "(" + i + "/9)");
        enableOptionMenu(1, true);
      }
      this.pxy.setText(getString(2131299787, new Object[] { bo.ga(this.vuV.cdf()) }));
      this.pxy.setVisibility(0);
      AppMethodBeat.o(28215);
    }
    while (true)
    {
      return;
      if (this.mode == 0)
      {
        updateOptionMenuText(1, getString(2131297041));
        enableOptionMenu(1, false);
      }
      this.pxy.setVisibility(8);
      AppMethodBeat.o(28215);
    }
  }

  private void dlt()
  {
    AppMethodBeat.i(28216);
    if ((NewFileExplorerUI.a.b(this.vuV) != null) && (NewFileExplorerUI.a.c(this.vuV) != null))
    {
      Object localObject1 = NewFileExplorerUI.a.c(this.vuV).getPath().replace(NewFileExplorerUI.a.b(this.vuV).getPath(), "");
      Object localObject2 = localObject1;
      if (((String)localObject1).startsWith("/"))
        localObject2 = ((String)localObject1).substring(1);
      localObject1 = localObject2;
      if (((String)localObject2).length() == 0)
        localObject1 = null;
      setMMSubTitle((String)localObject1);
    }
    AppMethodBeat.o(28216);
  }

  private void oV(boolean paramBoolean)
  {
    AppMethodBeat.i(28214);
    if (this.mode == 0)
      if ((!paramBoolean) && (this.vuV.dlx() != null))
      {
        this.vuV.a(this.vuV.dlx(), null);
        this.vuV.notifyDataSetChanged();
        dlt();
        AppMethodBeat.o(28214);
      }
    while (true)
    {
      return;
      setResult(0);
      finish();
      AppMethodBeat.o(28214);
      continue;
      Intent localIntent = new Intent();
      localIntent.putStringArrayListExtra("selected_file_lst", this.vuV.dlu());
      localIntent.putStringArrayListExtra("key_select_video_list", this.vuV.dlw());
      localIntent.putStringArrayListExtra("CropImage_OutputPath_List", this.vuV.dlv());
      localIntent.putExtra("GalleryUI_ToUser", this.toUserName);
      setResult(-1, localIntent);
      finish();
      AppMethodBeat.o(28214);
    }
  }

  public final int getLayoutId()
  {
    return 2130970301;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(28213);
    if ((paramInt1 == 0) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("selected_file_lst");
      if ((paramIntent != null) && (NewFileExplorerUI.a.a(this.vuV).size() != paramIntent.size()))
      {
        this.vuY.gud.dismiss();
        NewFileExplorerUI.a.a(this.vuV).clear();
        Iterator localIterator = paramIntent.iterator();
        while (localIterator.hasNext())
        {
          paramIntent = (String)localIterator.next();
          NewFileExplorerUI.a.a(this.vuV).add(new File(paramIntent));
        }
        this.vuV.notifyDataSetChanged();
        dlt();
        cbv();
      }
      AppMethodBeat.o(28213);
    }
    while (true)
    {
      return;
      if (paramInt1 == 2)
        a.a(this, paramInt1, paramInt2, paramIntent, true, 2131298926, 2131298927, 1);
      AppMethodBeat.o(28213);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(28210);
    super.onCreate(paramBundle);
    this.toUserName = getIntent().getStringExtra("TO_USER");
    this.gGW = ((ListView)findViewById(2131826342));
    this.vuV = new NewFileExplorerUI.a(this);
    this.pxy = ((TextView)findViewById(2131826347));
    this.mode = getIntent().getIntExtra("explorer_mode", 0);
    if (this.mode == 1)
    {
      setMMTitle(2131299788);
      setMMSubTitle(null);
      this.vuV.a(null, getIntent().getStringArrayListExtra("selected_file_lst"));
      this.gGW.setAdapter(this.vuV);
      this.gGW.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          AppMethodBeat.i(28176);
          paramAnonymousView = NewFileExplorerUI.b(NewFileExplorerUI.this).vue[paramAnonymousInt];
          if (paramAnonymousView.isDirectory())
          {
            NewFileExplorerUI.b(NewFileExplorerUI.this).a(paramAnonymousView, null);
            NewFileExplorerUI.b(NewFileExplorerUI.this).notifyDataSetChanged();
            NewFileExplorerUI.c(NewFileExplorerUI.this);
            AppMethodBeat.o(28176);
          }
          while (true)
          {
            return;
            paramAnonymousAdapterView = com.tencent.mm.a.e.cv(paramAnonymousView.getPath());
            a.a(NewFileExplorerUI.this, paramAnonymousView.getPath(), paramAnonymousAdapterView, 1);
            AppMethodBeat.o(28176);
          }
        }
      });
      this.gGW.setEmptyView(findViewById(2131826343));
      paramBundle = new NewFileExplorerUI.3(this);
      if (this.mode != 0)
        break label416;
    }
    label416: for (int i = 2131230755; ; i = 0)
    {
      setBackBtn(paramBundle, i);
      if (this.mode == 0)
        a(1, getString(2131297041), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            AppMethodBeat.i(28178);
            NewFileExplorerUI.e(NewFileExplorerUI.this);
            AppMethodBeat.o(28178);
            return true;
          }
        }
        , q.b.ymu);
      cbv();
      AppMethodBeat.o(28210);
      return;
      setMMTitle(2131299785);
      setMMSubTitle(null);
      this.vuW = ((TextView)findViewById(2131826346));
      this.vuW.setText(2131299785);
      this.vuV.c(new File(com.tencent.mm.compatible.util.e.euQ), true);
      this.vuV.a(new File(com.tencent.mm.compatible.util.e.euQ), null);
      if (this.vuV.getCount() == 0)
      {
        this.vuV.c(new File(com.tencent.mm.compatible.util.e.eSl), false);
        this.vuV.a(new File(com.tencent.mm.compatible.util.e.eSl), null);
        setMMTitle(2131299786);
        this.vuW.setText(2131299786);
      }
      findViewById(2131826345).setVisibility(0);
      findViewById(2131826345).setOnClickListener(new NewFileExplorerUI.1(this));
      this.vuX = ((FileSelectorFolderView)findViewById(2131826348));
      this.vuX.setListener(this.vuZ);
      break;
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(28211);
    super.onDestroy();
    AppMethodBeat.o(28211);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(28212);
    boolean bool;
    if (paramInt == 4)
    {
      oV(false);
      bool = true;
      AppMethodBeat.o(28212);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(28212);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.NewFileExplorerUI
 * JD-Core Version:    0.6.2
 */