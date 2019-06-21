package com.tencent.mm.ui.contact;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import java.util.ArrayList;
import java.util.List;

public class SnsTagContactListUI extends MMActivity
{
  private ListView nIv;
  private SnsTagContactListUI.a zps;
  private List<Long> zpt;

  public SnsTagContactListUI()
  {
    AppMethodBeat.i(33962);
    this.zpt = new ArrayList();
    AppMethodBeat.o(33962);
  }

  public final int getLayoutId()
  {
    return 2130968638;
  }

  public final void initView()
  {
    AppMethodBeat.i(33964);
    setMMTitle(2131303810);
    findViewById(2131828206).setVisibility(8);
    this.nIv = ((ListView)findViewById(2131821054));
    long[] arrayOfLong = getIntent().getLongArrayExtra("sns_tag_list");
    if (arrayOfLong == null)
    {
      finish();
      AppMethodBeat.o(33964);
    }
    while (true)
    {
      return;
      for (int i = 0; i < arrayOfLong.length; i++)
        this.zpt.add(Long.valueOf(arrayOfLong[i]));
      ((TextView)findViewById(2131821056)).setVisibility(8);
      findViewById(2131821057).setVisibility(8);
      this.nIv.setBackgroundColor(getResources().getColor(2131690691));
      ((View)this.nIv.getParent()).setBackgroundColor(getResources().getColor(2131690691));
      this.zps = new SnsTagContactListUI.a(this, this.zpt);
      this.nIv.setAdapter(this.zps);
      this.nIv.setVisibility(0);
      this.nIv.setOnItemClickListener(new SnsTagContactListUI.1(this));
      setBackBtn(new SnsTagContactListUI.2(this));
      showOptionMenu(false);
      AppMethodBeat.o(33964);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(33963);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(33963);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(33966);
    super.onDestroy();
    AppMethodBeat.o(33966);
  }

  public void onResume()
  {
    AppMethodBeat.i(33965);
    super.onResume();
    if (this.zps != null)
      this.zps.notifyDataSetChanged();
    AppMethodBeat.o(33965);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static final class b
  {
    MaskLayout emP;
    TextView emg;
    TextView nBN;
    TextView zpr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.SnsTagContactListUI
 * JD-Core Version:    0.6.2
 */