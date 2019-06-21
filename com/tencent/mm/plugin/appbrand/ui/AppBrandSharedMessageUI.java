package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.ui.MMActivity;

public class AppBrandSharedMessageUI extends MMActivity
{
  private MRecyclerView iIE;
  private ListView mListView;

  public final int getLayoutId()
  {
    return 2130968732;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133097);
    super.onCreate(paramBundle);
    this.mListView = ((ListView)findViewById(2131821366));
    this.iIE = ((MRecyclerView)findViewById(2131821367));
    this.mListView.setAdapter(new AppBrandSharedMessageUI.b(getLayoutInflater()));
    this.mListView.setOnItemClickListener(new AppBrandSharedMessageUI.1(this));
    this.iIE.setLayoutManager(new LinearLayoutManager(1));
    this.iIE.setAdapter(new AppBrandSharedMessageUI.a());
    this.iIE.addHeaderView(getLayoutInflater().inflate(2130968731, null));
    AppMethodBeat.o(133097);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandSharedMessageUI
 * JD-Core Version:    0.6.2
 */