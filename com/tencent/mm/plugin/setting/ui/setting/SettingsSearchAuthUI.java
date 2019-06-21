package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.setting.model.c;
import com.tencent.mm.plugin.setting.model.i;
import com.tencent.mm.protocal.protobuf.bvs;
import com.tencent.mm.protocal.protobuf.cmb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class SettingsSearchAuthUI extends MMActivity
  implements f
{
  private ListView mListView;
  private ProgressDialog nEK;
  private byte[] qjF;
  private boolean qnu;
  private com.tencent.mm.plugin.fts.ui.widget.a qoG;
  private View qoH;
  private TextView qoI;
  private TextView qoJ;
  private List<cmb> qoK;
  private SettingsSearchAuthUI.a qoL;

  public SettingsSearchAuthUI()
  {
    AppMethodBeat.i(127456);
    this.qoK = new ArrayList();
    AppMethodBeat.o(127456);
  }

  private void ciQ()
  {
    AppMethodBeat.i(127461);
    this.mController.removeAllOptionMenu();
    if (!this.qoK.isEmpty())
      if (this.qnu)
      {
        addTextOptionMenu(700, getString(2131296944), new SettingsSearchAuthUI.6(this));
        AppMethodBeat.o(127461);
      }
    while (true)
    {
      return;
      addTextOptionMenu(700, getString(2131296969), new SettingsSearchAuthUI.7(this));
      AppMethodBeat.o(127461);
    }
  }

  public void finish()
  {
    AppMethodBeat.i(127462);
    super.finish();
    overridePendingTransition(2131034221, 2131034130);
    AppMethodBeat.o(127462);
  }

  public final int getLayoutId()
  {
    return 2130970641;
  }

  public final void initView()
  {
    AppMethodBeat.i(127458);
    this.qoG = new com.tencent.mm.plugin.fts.ui.widget.a(this);
    this.mListView = ((ListView)findViewById(2131827394));
    this.qoL = new SettingsSearchAuthUI.a(this, (byte)0);
    this.mListView.setAdapter(this.qoL);
    this.qoH = findViewById(2131827414);
    this.qoI = ((TextView)findViewById(2131827415));
    this.qoJ = ((TextView)findViewById(2131827416));
    ciQ();
    getSupportActionBar().setCustomView(this.qoG);
    this.qoG.setSearchViewListener(new SettingsSearchAuthUI.1(this));
    this.qoG.getFtsEditText().setFtsEditTextListener(new SettingsSearchAuthUI.2(this));
    this.qoI.setOnClickListener(new SettingsSearchAuthUI.3(this));
    this.mListView.setOnItemClickListener(new SettingsSearchAuthUI.4(this));
    this.mListView.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(127445);
        if (paramAnonymousInt1 + paramAnonymousInt2 == paramAnonymousInt3)
        {
          ab.i("MicroMsg.SettingsSearchAuthUI", "scroll to the end");
          if (SettingsSearchAuthUI.h(SettingsSearchAuthUI.this) != null)
          {
            SettingsSearchAuthUI.a(SettingsSearchAuthUI.this, SettingsSearchAuthUI.h(SettingsSearchAuthUI.this));
            SettingsSearchAuthUI.i(SettingsSearchAuthUI.this);
          }
        }
        AppMethodBeat.o(127445);
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
      }
    });
    AppMethodBeat.o(127458);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127457);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127457);
  }

  public void onPause()
  {
    AppMethodBeat.i(127460);
    super.onPause();
    g.Rg().b(1169, this);
    g.Rg().b(1127, this);
    AppMethodBeat.o(127460);
  }

  public void onResume()
  {
    AppMethodBeat.i(127459);
    super.onResume();
    g.Rg().a(1169, this);
    g.Rg().a(1127, this);
    AppMethodBeat.o(127459);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127463);
    ab.i("MicroMsg.SettingsSearchAuthUI", "errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.nEK != null)
      this.nEK.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 1169)
      {
        paramString = (i)paramm;
        if ((paramString.qjI != null) && (paramString.qjI.wtv == 1))
        {
          paramString = paramString.qjI.wtt.toByteArray();
          this.qjF = paramString;
          if (((i)paramm).qjF == null)
            break label235;
          paramInt1 = 1;
          label123: if (paramInt1 == 0)
            this.qoK.clear();
          List localList = this.qoK;
          paramString = (i)paramm;
          if (paramString.qjI == null)
            break label240;
          paramString = paramString.qjI.wtu;
          label163: localList.addAll(paramString);
          if (this.qoK.isEmpty())
            break label247;
          this.qoL.qnw = this.qoK;
          this.qoL.notifyDataSetChanged();
          this.qoH.setVisibility(8);
          this.mListView.setVisibility(0);
          ciQ();
          AppMethodBeat.o(127463);
        }
      }
    while (true)
    {
      return;
      paramString = null;
      break;
      label235: paramInt1 = 0;
      break label123;
      label240: paramString = Collections.emptyList();
      break label163;
      label247: this.qoH.setVisibility(0);
      this.qoI.setVisibility(8);
      this.qoJ.setVisibility(0);
      this.mListView.setVisibility(8);
      this.qoK.clear();
      ciQ();
      AppMethodBeat.o(127463);
      continue;
      if (paramm.getType() == 1127)
      {
        paramm = ((c)paramm).appId;
        if (!bo.isNullOrNil(paramm))
        {
          if (!this.qoK.isEmpty())
          {
            paramString = this.qoK.iterator();
            while (paramString.hasNext())
              if (((cmb)paramString.next()).csB.equals(paramm))
                paramString.remove();
          }
          this.qoL.notifyDataSetChanged();
        }
        AppMethodBeat.o(127463);
        continue;
        h.bQ(this, paramString);
      }
      else
      {
        AppMethodBeat.o(127463);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsSearchAuthUI
 * JD-Core Version:    0.6.2
 */