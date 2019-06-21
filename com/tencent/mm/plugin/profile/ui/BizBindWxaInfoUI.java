package com.tencent.mm.plugin.profile.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.ArrayList;

public final class BizBindWxaInfoUI extends MMActivity
{
  private TextView pkN;
  private ListView pkO;
  private String pkP;
  private String pkQ;

  public final int getLayoutId()
  {
    return 2130968853;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(134419);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(134419);
      return;
    }
    this.pkP = getIntent().getStringExtra("extra_username");
    this.pkQ = getIntent().getStringExtra("extra_appid");
    setBackBtn(new BizBindWxaInfoUI.1(this));
    setMMTitle(2131298448);
    xE(this.mController.dyj());
    ArrayList localArrayList = getIntent().getParcelableArrayListExtra("extra_wxa_entry_info_list");
    View localView = getLayoutInflater().inflate(2130968852, null);
    this.pkN = ((TextView)localView.findViewById(2131821314));
    paramBundle = this.pkN;
    if (localArrayList != null);
    for (int i = localArrayList.size(); ; i = 0)
    {
      paramBundle.setText(getString(2131297639, new Object[] { Integer.valueOf(i) }));
      this.pkO = ((ListView)findViewById(2131821796));
      this.pkO.addHeaderView(localView);
      this.pkO.setAdapter(new BizBindWxaInfoUI.a(getLayoutInflater(), localArrayList));
      this.pkO.setOnItemClickListener(new BizBindWxaInfoUI.2(this));
      this.mController.contentView.setBackgroundResource(2131690439);
      AppMethodBeat.o(134419);
      break;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizBindWxaInfoUI
 * JD-Core Version:    0.6.2
 */