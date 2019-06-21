package com.tencent.weui.base.preference;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.BaseActivity;

public abstract class WeUIPreference extends BaseActivity
{
  private b ALu;
  private boolean dirty = false;
  private SharedPreferences ehZ;
  private ListView nDp;
  private boolean szZ = false;
  protected RelativeLayout yCx;
  protected TextView yCy;
  protected ImageView yCz;

  public abstract int JC();

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.ALu = new b(this, this.ehZ);
    this.nDp = ((ListView)findViewById(16908298));
    this.yCx = ((RelativeLayout)findViewById(2131826070));
    this.yCy = ((TextView)findViewById(2131826072));
    this.yCz = ((ImageView)findViewById(2131826071));
    paramBundle = this.ALu;
    paramBundle.ALy = new WeUIPreference.1(this);
    paramBundle.notifyDataSetChanged();
    int i = JC();
    b localb;
    c localc;
    if (i != -1)
    {
      localb = this.ALu;
      localb.ALx = true;
      localc = localb.ALw;
      paramBundle = localc.mContext.getResources().getXml(i);
      if (paramBundle == null);
    }
    try
    {
      localc.a(paramBundle, localb);
      paramBundle.close();
      localb.ALx = false;
      localb.notifyDataSetChanged();
      this.nDp.setAdapter(this.ALu);
      this.nDp.setOnItemClickListener(new WeUIPreference.2(this));
      this.nDp.setOnItemLongClickListener(new WeUIPreference.3(this));
      this.nDp.setOnScrollListener(new WeUIPreference.4(this));
      return;
    }
    finally
    {
      paramBundle.close();
    }
  }

  public void onResume()
  {
    this.ALu.notifyDataSetChanged();
    super.onResume();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.WeUIPreference
 * JD-Core Version:    0.6.2
 */