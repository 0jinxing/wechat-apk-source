package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable.Creator;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bt.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.UserAuthItemParcelable;
import com.tencent.mm.plugin.setting.model.c;
import com.tencent.mm.protocal.protobuf.apl;
import com.tencent.mm.protocal.protobuf.cmb;
import com.tencent.mm.protocal.protobuf.cmc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SettingsManageAuthUI extends MMActivity
  implements com.tencent.mm.ai.f
{
  private ListView mListView;
  private View mtk;
  private ProgressDialog nEK;
  private byte[] qjF;
  private SettingsManageAuthUI.a qns;
  private List<cmb> qnt;
  private boolean qnu;

  public SettingsManageAuthUI()
  {
    AppMethodBeat.i(127258);
    this.qnt = new ArrayList();
    AppMethodBeat.o(127258);
  }

  private static void bg(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(127264);
    paramArrayOfByte = new com.tencent.mm.plugin.setting.model.f(paramArrayOfByte);
    g.Rg().a(paramArrayOfByte, 0);
    AppMethodBeat.o(127264);
  }

  private void ciQ()
  {
    AppMethodBeat.i(127261);
    this.mController.removeAllOptionMenu();
    addIconOptionMenu(800, 2131230757, new SettingsManageAuthUI.4(this));
    if (this.qnt.isEmpty())
    {
      this.mtk.setVisibility(0);
      AppMethodBeat.o(127261);
    }
    while (true)
    {
      return;
      this.mtk.setVisibility(8);
      if (this.qnu)
      {
        addTextOptionMenu(700, getString(2131296944), new SettingsManageAuthUI.5(this));
        AppMethodBeat.o(127261);
      }
      else
      {
        addTextOptionMenu(700, getString(2131296969), new SettingsManageAuthUI.6(this));
        AppMethodBeat.o(127261);
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970635;
  }

  public final void initView()
  {
    AppMethodBeat.i(127260);
    this.mListView = ((ListView)findViewById(2131827394));
    this.mtk = findViewById(2131827395);
    this.qns = new SettingsManageAuthUI.a(this, (byte)0);
    this.mListView.setAdapter(this.qns);
    this.mListView.setOnScrollListener(new AbsListView.OnScrollListener()
    {
      public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        AppMethodBeat.i(127246);
        if (paramAnonymousInt1 + paramAnonymousInt2 == paramAnonymousInt3)
        {
          ab.i("MicroMsg.SettingsManageAuthUI", "scroll to the end");
          if (SettingsManageAuthUI.a(SettingsManageAuthUI.this) != null)
          {
            SettingsManageAuthUI.bh(SettingsManageAuthUI.a(SettingsManageAuthUI.this));
            SettingsManageAuthUI.b(SettingsManageAuthUI.this);
          }
        }
        AppMethodBeat.o(127246);
      }

      public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
      {
      }
    });
    this.mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        AppMethodBeat.i(127247);
        if (!SettingsManageAuthUI.c(SettingsManageAuthUI.this))
        {
          paramAnonymousView = SettingsManageAuthUI.d(SettingsManageAuthUI.this).Cm(paramAnonymousInt);
          if (paramAnonymousView != null)
          {
            Intent localIntent = new Intent(SettingsManageAuthUI.this, SettingsModifyUserAuthUI.class);
            UserAuthItemParcelable[] arrayOfUserAuthItemParcelable = (UserAuthItemParcelable[])UserAuthItemParcelable.CREATOR.newArray(paramAnonymousView.xjN.size());
            for (paramAnonymousInt = 0; paramAnonymousInt < paramAnonymousView.xjN.size(); paramAnonymousInt++)
            {
              cmc localcmc = (cmc)paramAnonymousView.xjN.get(paramAnonymousInt);
              paramAnonymousAdapterView = new UserAuthItemParcelable();
              paramAnonymousAdapterView.scope = localcmc.scope;
              paramAnonymousAdapterView.qkh = localcmc.qkh;
              paramAnonymousAdapterView.state = localcmc.state;
              paramAnonymousAdapterView.qki = localcmc.qki;
              arrayOfUserAuthItemParcelable[paramAnonymousInt] = paramAnonymousAdapterView;
            }
            localIntent.putExtra("app_id", paramAnonymousView.csB);
            localIntent.putExtra("app_name", paramAnonymousView.fhH);
            localIntent.putExtra("modify_scene", 1);
            localIntent.putParcelableArrayListExtra("app_auth_items", new ArrayList(Arrays.asList(arrayOfUserAuthItemParcelable)));
            SettingsManageAuthUI.this.startActivity(localIntent);
          }
        }
        AppMethodBeat.o(127247);
      }
    });
    ciQ();
    setMMTitle(2131303040);
    setBackBtn(new SettingsManageAuthUI.3(this));
    AppMethodBeat.o(127260);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127259);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127259);
  }

  public void onPause()
  {
    AppMethodBeat.i(127263);
    super.onPause();
    g.Rg().b(1146, this);
    g.Rg().b(1127, this);
    AppMethodBeat.o(127263);
  }

  public void onResume()
  {
    AppMethodBeat.i(127262);
    super.onResume();
    g.Rg().a(1146, this);
    g.Rg().a(1127, this);
    bg(null);
    AppMethodBeat.o(127262);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(127265);
    ab.i("MicroMsg.SettingsManageAuthUI", "errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if (this.nEK != null)
      this.nEK.dismiss();
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (paramm.getType() == 1146)
      {
        paramString = (com.tencent.mm.plugin.setting.model.f)paramm;
        if ((paramString.qjE != null) && (paramString.qjE.wtv == 1))
        {
          paramString = paramString.qjE.wtt.toByteArray();
          this.qjF = paramString;
          if (((com.tencent.mm.plugin.setting.model.f)paramm).qjF == null)
            break label202;
          paramInt1 = 1;
          label120: if (paramInt1 == 0)
            this.qnt.clear();
          List localList = this.qnt;
          paramString = (com.tencent.mm.plugin.setting.model.f)paramm;
          if (paramString.qjE == null)
            break label207;
          paramString = paramString.qjE.wtu;
          label160: localList.addAll(paramString);
          this.qns.qnw = this.qnt;
          this.qns.notifyDataSetChanged();
          ciQ();
          AppMethodBeat.o(127265);
        }
      }
    while (true)
    {
      return;
      paramString = null;
      break;
      label202: paramInt1 = 0;
      break label120;
      label207: paramString = Collections.emptyList();
      break label160;
      if (paramm.getType() == 1127)
      {
        paramm = ((c)paramm).appId;
        if (!bo.isNullOrNil(paramm))
        {
          if (!this.qnt.isEmpty())
          {
            paramString = this.qnt.iterator();
            while (paramString.hasNext())
              if (((cmb)paramString.next()).csB.equals(paramm))
                paramString.remove();
          }
          this.qns.notifyDataSetChanged();
        }
        AppMethodBeat.o(127265);
        continue;
        h.bQ(this, paramString);
      }
      else
      {
        AppMethodBeat.o(127265);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsManageAuthUI
 * JD-Core Version:    0.6.2
 */