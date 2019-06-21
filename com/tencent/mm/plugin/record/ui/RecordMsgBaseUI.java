package com.tencent.mm.plugin.record.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.plugin.fav.ui.detail.BaseFavDetailReportUI;
import com.tencent.mm.pluginsdk.f;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public abstract class RecordMsgBaseUI extends BaseFavDetailReportUI
{
  protected long cvx = -1L;
  protected ListView gGW = null;
  protected h pKw;

  protected void ceI()
  {
    this.pKw = ceJ();
    this.cvx = getIntent().getLongExtra("message_id", -1L);
    this.gGW = ((ListView)findViewById(2131826913));
    ceQ();
    Object localObject = ceL();
    String str = ceM();
    if ((bo.isNullOrNil((String)localObject)) || (bo.isNullOrNil(str)))
    {
      ab.i("MicroMsg.RecordMsgBaseUI", "subtitle time error!");
      localObject = new View(this.mController.ylL);
      ((View)localObject).setLayoutParams(new AbsListView.LayoutParams(-1, getResources().getDimensionPixelSize(2131427829)));
      this.gGW.addHeaderView((View)localObject, null, false);
      localObject = View.inflate(this.mController.ylL, 2130970487, null);
      this.gGW.setAdapter(this.pKw);
      this.pKw.mListView = this.gGW;
      this.pKw.ceO();
      this.gGW.setOnScrollListener(new RecordMsgBaseUI.1(this));
      setBackBtn(new RecordMsgBaseUI.2(this));
      ceN();
      this.gGW.postDelayed(new RecordMsgBaseUI.3(this, (View)localObject), 100L);
      return;
    }
    localObject = localObject.split(" ")[0];
    str = str.split(" ")[0];
    if (((String)localObject).equals(str));
    for (this.pKw.pKq = false; ; this.pKw.pKq = true)
    {
      setMMSubTitle((String)localObject);
      break;
      localObject = (String)localObject + "~" + str;
    }
  }

  protected abstract h ceJ();

  protected abstract String ceK();

  protected abstract String ceL();

  protected abstract String ceM();

  protected abstract void ceN();

  protected final void ceQ()
  {
    String str1 = ceK();
    String str2 = this.mController.ylL.getString(2131299412);
    String str3 = str1;
    if (str1 != null)
    {
      str3 = str1;
      if (str1.endsWith(str2))
      {
        str3 = str1;
        if (str1.lastIndexOf(str2) > 0)
          str3 = str1.substring(0, str1.lastIndexOf(str2) - 1);
      }
    }
    M(j.b(this.mController.ylL, str3, getResources().getDimensionPixelSize(2131427505)));
  }

  protected abstract void d(int paramInt1, int paramInt2, Intent paramIntent);

  public final int getForceOrientation()
  {
    return 1;
  }

  public final int getLayoutId()
  {
    return 2130970488;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    d(paramInt1, paramInt2, paramIntent);
  }

  public void onCreate(Bundle paramBundle)
  {
    f.m(this);
    super.onCreate(paramBundle);
    ceI();
    f.n(this);
  }

  public void onDestroy()
  {
    super.onDestroy();
    if (this.pKw != null)
      this.pKw.destroy();
  }

  public void onPause()
  {
    super.onPause();
    if (this.pKw != null)
    {
      h localh = this.pKw;
      for (int i = 0; i < localh.pKp.size(); i++)
      {
        localObject = (h.b)localh.pKp.valueAt(i);
        if (localObject != null)
          ((h.b)localObject).pause();
      }
    }
    Object localObject = new tn();
    ((tn)localObject).cPI.type = 1;
    a.xxA.m((b)localObject);
  }

  public void onResume()
  {
    super.onResume();
    tn localtn = new tn();
    if (this.gGW != null)
    {
      localtn.cPI.type = 0;
      localtn.cPI.cPJ = this.gGW.getFirstVisiblePosition();
      localtn.cPI.cPK = this.gGW.getLastVisiblePosition();
      localtn.cPI.cPL = this.gGW.getHeaderViewsCount();
      a.xxA.m(localtn);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgBaseUI
 * JD-Core Version:    0.6.2
 */