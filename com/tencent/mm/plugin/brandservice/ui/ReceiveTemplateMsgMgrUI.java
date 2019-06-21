package com.tencent.mm.plugin.brandservice.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.k;
import com.tencent.mm.protocal.protobuf.azo;
import com.tencent.mm.protocal.protobuf.azq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.LinkedList;

public class ReceiveTemplateMsgMgrUI extends MMPreference
  implements com.tencent.mm.ai.f
{
  private static LinkedList<azo> jMt;
  private ProgressDialog ehJ;
  protected com.tencent.mm.ui.base.preference.f iFE;
  private String jMs;
  private boolean jMu = false;

  private void eD(boolean paramBoolean)
  {
    AppMethodBeat.i(14030);
    View localView1 = findViewById(2131826875);
    View localView2 = findViewById(2131826874);
    if (localView1 != null)
      if (paramBoolean)
      {
        ((TextView)localView1).setVisibility(0);
        if (localView2 == null)
          break label71;
        localView2.setVisibility(8);
        AppMethodBeat.o(14030);
      }
    while (true)
    {
      return;
      ((TextView)localView1).setVisibility(8);
      if (localView2 != null)
        localView2.setVisibility(0);
      label71: AppMethodBeat.o(14030);
    }
  }

  public final int JC()
  {
    return 2131165260;
  }

  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(14028);
    if (jMt == null)
    {
      ab.w("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "mRecvOptions == null");
      AppMethodBeat.o(14028);
    }
    String str;
    while (true)
    {
      return false;
      str = paramPreference.mKey;
      if (!bo.isNullOrNil(str))
        break;
      ab.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "key is null");
      AppMethodBeat.o(14028);
    }
    Iterator localIterator = jMt.iterator();
    while (localIterator.hasNext())
    {
      paramf = (azo)localIterator.next();
      if (str.equals(bo.nullAsNil(paramf.wDw)))
      {
        this.jMu = true;
        if (!((CheckBoxPreference)paramPreference).isChecked())
          break label155;
      }
    }
    label155: for (paramf.vEq = 0; ; paramf.vEq = 1)
    {
      if (this.jMu)
      {
        ab.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "option change, do scene");
        al.n(new ReceiveTemplateMsgMgrUI.3(this), 4000L);
      }
      AppMethodBeat.o(14028);
      break;
    }
  }

  public final int aWi()
  {
    return 2130970466;
  }

  public final int getLayoutId()
  {
    return 2130970467;
  }

  public final void initView()
  {
    AppMethodBeat.i(14027);
    setMMTitle(2131298640);
    this.iFE = this.yCw;
    this.jMs = getIntent().getStringExtra("enterprise_biz_name");
    if (bo.isNullOrNil(this.jMs))
    {
      ab.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "bizName is null");
      finish();
      AppMethodBeat.o(14027);
    }
    while (true)
    {
      return;
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AppMethodBeat.i(14021);
          ReceiveTemplateMsgMgrUI.this.finish();
          AppMethodBeat.o(14021);
          return true;
        }
      });
      d locald = new d(this.jMs);
      g.Rg().a(locald, 0);
      getString(2131297061);
      this.ehJ = h.b(this, getString(2131302183), true, new ReceiveTemplateMsgMgrUI.2(this, locald));
      AppMethodBeat.o(14027);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(14024);
    super.onCreate(paramBundle);
    g.Rg().a(1031, this);
    g.Rg().a(1030, this);
    initView();
    AppMethodBeat.o(14024);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(14026);
    g.Rg().b(1031, this);
    g.Rg().b(1030, this);
    super.onDestroy();
    AppMethodBeat.o(14026);
  }

  public void onPause()
  {
    AppMethodBeat.i(14025);
    if (this.jMu)
    {
      ab.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onPause option change");
      this.jMu = false;
      k localk = new k(this.jMs, jMt);
      g.Rg().a(localk, 0);
    }
    super.onPause();
    AppMethodBeat.o(14025);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(14029);
    if (paramm == null)
    {
      ab.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], scene is null", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      AppMethodBeat.o(14029);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "onSceneEnd: [%d], [%d], [%s], sceneType[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.getType()) });
      if (paramm.getType() == 1031)
      {
        if ((this.ehJ != null) && (this.ehJ.isShowing()))
        {
          this.ehJ.dismiss();
          this.ehJ = null;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Toast.makeText(ah.getContext(), ah.getContext().getString(2131302180), 1).show();
          eD(true);
          AppMethodBeat.o(14029);
        }
        else
        {
          paramString = (d)paramm;
          if ((paramString.ehh != null) && (paramString.ehh.fsH.fsP != null));
          for (paramString = (azq)paramString.ehh.fsH.fsP; ; paramString = null)
          {
            jMt = paramString.wDx;
            paramString = jMt;
            this.iFE.removeAll();
            if ((paramString != null) && (paramString.size() > 0))
              break label267;
            ab.e("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "recvOption is empty");
            eD(true);
            AppMethodBeat.o(14029);
            break;
          }
          label267: eD(false);
          ab.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBody options.size = %d", new Object[] { Integer.valueOf(paramString.size()) });
          Iterator localIterator = paramString.iterator();
          if (localIterator.hasNext())
          {
            paramm = (azo)localIterator.next();
            paramString = new CheckBoxPreference(this);
            paramString.yDf = false;
            paramString.setKey(paramm.wDw);
            paramString.setTitle(paramm.Title);
            if (paramm.vEq == 0);
            for (boolean bool = true; ; bool = false)
            {
              paramString.uOT = bool;
              this.iFE.b(paramString);
              break;
            }
          }
          this.iFE.notifyDataSetChanged();
          ab.d("MicroMsg.brandservice.ReceiveTemplateMsgMgrUI", "initBodyView finish");
          AppMethodBeat.o(14029);
        }
      }
      else if ((paramm.getType() == 1030) && ((paramInt1 != 0) || (paramInt2 != 0)))
      {
        Toast.makeText(ah.getContext(), ah.getContext().getString(2131302181), 0).show();
        AppMethodBeat.o(14029);
      }
      else
      {
        AppMethodBeat.o(14029);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.ReceiveTemplateMsgMgrUI
 * JD-Core Version:    0.6.2
 */