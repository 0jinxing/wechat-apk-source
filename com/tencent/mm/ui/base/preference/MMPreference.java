package com.tencent.mm.ui.base.preference;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;

public abstract class MMPreference extends MMActivity
{
  private boolean dirty = false;
  public SharedPreferences ehZ;
  public ListView nDp;
  private boolean szZ = false;
  public h yCw;
  protected RelativeLayout yCx;
  protected TextView yCy;
  protected ImageView yCz;

  public abstract int JC();

  public h a(SharedPreferences paramSharedPreferences)
  {
    return new h(this, this.nDp, paramSharedPreferences);
  }

  public abstract boolean a(f paramf, Preference paramPreference);

  public int aWi()
  {
    return -1;
  }

  public View aWz()
  {
    return null;
  }

  protected boolean aqT()
  {
    return true;
  }

  public View ciC()
  {
    return null;
  }

  public int getLayoutId()
  {
    return 2130970193;
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.nDp = ((ListView)findViewById(16908298));
    this.yCw = a(this.ehZ);
    this.yCx = ((RelativeLayout)findViewById(2131826070));
    this.yCy = ((TextView)findViewById(2131826072));
    this.yCz = ((ImageView)findViewById(2131826071));
    int i = aWi();
    if (i != -1)
    {
      paramBundle = getLayoutInflater().inflate(i, null);
      this.nDp.addHeaderView(paramBundle);
    }
    paramBundle = aWz();
    if (paramBundle != null)
    {
      if (paramBundle.getLayoutParams() == null)
        break label286;
      paramBundle.setLayoutParams(new AbsListView.LayoutParams(paramBundle.getLayoutParams()));
    }
    while (true)
    {
      this.nDp.addFooterView(paramBundle);
      View localView = ciC();
      if (localView != null)
      {
        paramBundle = (FrameLayout)findViewById(2131826073);
        paramBundle.addView(localView);
        paramBundle.setVisibility(0);
      }
      this.yCw.b(new MMPreference.1(this));
      i = JC();
      if (i != -1)
        this.yCw.addPreferencesFromResource(i);
      this.nDp.setAdapter(this.yCw);
      this.nDp.setOnItemClickListener(new MMPreference.2(this));
      this.nDp.setOnItemLongClickListener(new MMPreference.3(this));
      this.nDp.setOnScrollListener(new MMPreference.4(this));
      return;
      label286: ab.e("MicroMsg.mmui.MMPreference", "[arthurdan.mmpreference] Notice!!! footer.getLayoutParams() is null!!!\n");
    }
  }

  public void onResume()
  {
    if (aqT())
      this.yCw.notifyDataSetChanged();
    super.onResume();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  public final void setSelection(int paramInt)
  {
    this.nDp.setSelection(paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference
 * JD-Core Version:    0.6.2
 */