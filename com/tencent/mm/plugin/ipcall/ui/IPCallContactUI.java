package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.o;
import java.util.ArrayList;
import java.util.HashMap;

public class IPCallContactUI extends MMActivity
{
  private o elS;
  private ak fbD;
  private String gtX;
  private VerticalScrollBar nBA;
  private LinearLayout nBB;
  private int nBC;
  private int nBD;
  private a.a nBE;
  private Runnable nBF;
  private boolean nBG;
  private ListView nBg;
  private Runnable nBn;
  private ProgressDialog nBv;
  private c nBw;
  private RelativeLayout nBx;
  private LinearLayout nBy;
  private IPCallAddressCountView nBz;

  public IPCallContactUI()
  {
    AppMethodBeat.i(22088);
    this.elS = new o((byte)0);
    this.nBv = null;
    this.nBz = null;
    this.nBC = -1;
    this.nBD = -1;
    this.nBE = new a.a()
    {
      public final void aLj()
      {
        AppMethodBeat.i(22081);
        IPCallContactUI.f(IPCallContactUI.this).sendEmptyMessage(1);
        AppMethodBeat.o(22081);
      }
    };
    this.nBn = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(22082);
        com.tencent.mm.plugin.ipcall.a.a.bHb().a(IPCallContactUI.g(IPCallContactUI.this), false);
        AppMethodBeat.o(22082);
      }
    };
    this.nBF = new IPCallContactUI.10(this);
    this.nBG = true;
    this.fbD = new IPCallContactUI.2(this, Looper.getMainLooper());
    AppMethodBeat.o(22088);
  }

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130969883;
  }

  public final void iu(boolean paramBoolean)
  {
    AppMethodBeat.i(22091);
    this.nBG = paramBoolean;
    if (this.nBG)
      this.nBw.notifyDataSetChanged();
    AppMethodBeat.o(22091);
  }

  public void onBackPressed()
  {
    AppMethodBeat.i(22095);
    super.onBackPressed();
    AppMethodBeat.o(22095);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22089);
    super.onCreate(paramBundle);
    setMMTitle(2131300708);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(22071);
        IPCallContactUI.this.finish();
        AppMethodBeat.o(22071);
        return true;
      }
    });
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a(this, "android.permission.READ_CONTACTS", 48, null, null);
    ab.i("MicroMsg.IPCallContactUI", "summerper checkPermission checkContacts[%b],stack[%s]", new Object[] { Boolean.valueOf(bool), bo.dpG() });
    if (bool)
    {
      this.nBx = ((RelativeLayout)findViewById(2131824244));
      this.nBy = ((LinearLayout)findViewById(2131825035));
      this.nBg = ((ListView)findViewById(2131825036));
      this.nBA = ((VerticalScrollBar)findViewById(2131821057));
      this.nBB = ((LinearLayout)findViewById(2131825037));
      this.elS.zHa = new IPCallContactUI.5(this);
      this.elS.zHf = 2131297040;
      a(this.elS);
      this.nBw = new c(this.mController.ylL);
      c.nzw = com.tencent.mm.plugin.ipcall.a.g.b.bHW();
      this.nBz = new IPCallAddressCountView(this.mController.ylL, this.nBw.bIe());
      this.nBg.addFooterView(this.nBz, null, false);
      this.nBg.setAdapter(this.nBw);
      this.nBg.setOnItemClickListener(new IPCallContactUI.6(this));
      this.nBA.setVisibility(0);
      this.nBg.setOnScrollListener(new IPCallContactUI.11(this));
      this.nBA.setOnScrollBarTouchListener(new VerticalScrollBar.a()
      {
        public final void kp(String paramAnonymousString)
        {
          AppMethodBeat.i(22087);
          if ("↑".equals(paramAnonymousString))
          {
            IPCallContactUI.b(IPCallContactUI.this).setSelection(0);
            AppMethodBeat.o(22087);
            return;
          }
          c localc = IPCallContactUI.d(IPCallContactUI.this);
          if (localc.emK.containsKey(paramAnonymousString));
          for (int i = ((Integer)localc.emK.get(paramAnonymousString)).intValue(); ; i = -1)
          {
            if (i != -1)
              IPCallContactUI.b(IPCallContactUI.this).setSelection(i);
            AppMethodBeat.o(22087);
            break;
          }
        }
      });
      if (this.nBw.bIe() <= 0)
      {
        this.nBx.setVisibility(8);
        paramBundle = this.mController.ylL;
        this.mController.ylL.getString(2131297061);
        this.nBv = h.b(paramBundle, this.mController.ylL.getString(2131300729), true, new IPCallContactUI.9(this));
        d.post(this.nBn, "IPCall_LoadSystemAddressBook");
        AppMethodBeat.o(22089);
      }
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.ipcall.a.bGG().bGH();
      AppMethodBeat.o(22089);
    }
  }

  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    AppMethodBeat.i(22094);
    ab.d("MicroMsg.IPCallContactUI", "onCreateOptionsMenu");
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    AppMethodBeat.o(22094);
    return bool;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22092);
    super.onDestroy();
    com.tencent.mm.plugin.ipcall.a.a locala = com.tencent.mm.plugin.ipcall.a.a.bHb();
    a.a locala1 = this.nBE;
    if (locala.nvk.contains(locala1))
      locala.nvk.remove(locala1);
    this.fbD.removeMessages(1);
    AppMethodBeat.o(22092);
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(22096);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0))
    {
      ab.i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", new Object[] { Integer.valueOf(paramInt), Long.valueOf(Thread.currentThread().getId()) });
      AppMethodBeat.o(22096);
      return;
    }
    ab.i("MicroMsg.IPCallContactUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default:
    case 48:
    }
    while (true)
    {
      AppMethodBeat.o(22096);
      break;
      if (paramArrayOfInt[0] != 0)
        h.a(this, getString(2131301922), getString(2131301936), getString(2131300878), getString(2131297773), false, new IPCallContactUI.3(this), new IPCallContactUI.4(this));
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(22093);
    super.onResume();
    supportInvalidateOptionsMenu();
    AppMethodBeat.o(22093);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void vM(String paramString)
  {
    AppMethodBeat.i(22090);
    this.gtX = paramString;
    this.fbD.removeCallbacks(this.nBF);
    this.fbD.postDelayed(this.nBF, 200L);
    AppMethodBeat.o(22090);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI
 * JD-Core Version:    0.6.2
 */