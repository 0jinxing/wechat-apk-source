package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.kiss.a.b;
import com.tencent.mm.ui.MMFragment;

public abstract class MMPreferenceFragment extends MMFragment
{
  private boolean dirty = false;
  private SharedPreferences ehZ;
  protected ListView nDp;
  private boolean szZ = false;
  private int yCO = 0;
  private int yCP = 0;
  protected boolean yCQ;
  protected h yCw;

  public abstract int JC();

  public abstract boolean a(f paramf, Preference paramPreference);

  public boolean a(f paramf, Preference paramPreference, View paramView)
  {
    return false;
  }

  public final void dAE()
  {
    if (this.yCQ);
    while (true)
    {
      return;
      int i = JC();
      if (i != -1)
      {
        this.yCw.addPreferencesFromResource(i);
        this.yCQ = true;
      }
    }
  }

  public int getLayoutId()
  {
    return 2130970177;
  }

  public View getLayoutView()
  {
    return b.SM().a(getContext(), "R.layout.mm_preference_fragment_list_content", 2130970177);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.yCQ = false;
    this.ehZ = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.nDp = ((ListView)findViewById(16908298));
    this.yCw = new h(getContext(), this.nDp, this.ehZ);
    this.yCw.b(new MMPreferenceFragment.1(this));
    this.nDp.setAdapter(this.yCw);
    this.nDp.setOnItemClickListener(new MMPreferenceFragment.2(this));
    this.nDp.setOnItemLongClickListener(new MMPreferenceFragment.3(this));
    if (this.yCP != 0)
      this.nDp.setSelectionFromTop(0, this.yCP);
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }

  public void onResume()
  {
    super.onResume();
    this.yCw.notifyDataSetChanged();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreferenceFragment
 * JD-Core Version:    0.6.2
 */