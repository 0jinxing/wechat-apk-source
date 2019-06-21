package com.tencent.mm.ui.voicesearch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class SearchConversationResultUI extends MMActivity
{
  private TextView kxK;
  private String username;
  private ListView zLr;
  private a zLs;
  private String zLt = null;

  private void asw(String paramString)
  {
    AppMethodBeat.i(35322);
    this.kxK.setVisibility(8);
    if (this.zLs != null)
      this.zLs.vM(paramString);
    AppMethodBeat.o(35322);
  }

  private void dHz()
  {
    AppMethodBeat.i(35323);
    if (this.zLs != null)
      this.zLs.fl(new LinkedList());
    AppMethodBeat.o(35323);
  }

  public final int getLayoutId()
  {
    return 2130971023;
  }

  public final void initView()
  {
    AppMethodBeat.i(35319);
    this.zLr = ((ListView)findViewById(2131828473));
    this.kxK = ((TextView)findViewById(2131821055));
    this.zLs = new a(getApplicationContext(), new SearchConversationResultUI.1(this));
    dHz();
    this.zLr.setAdapter(this.zLs);
    this.kxK.setVisibility(8);
    this.username = getIntent().getStringExtra("SearchConversationResult_User");
    this.zLt = getIntent().getStringExtra("SearchConversationResult_Error");
    setMMTitle(getString(2131304324));
    setBackBtn(new SearchConversationResultUI.2(this));
    this.zLr.setOnItemClickListener(new SearchConversationResultUI.3(this));
    asw(this.username);
    AppMethodBeat.o(35319);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35318);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(35318);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(35320);
    super.onDestroy();
    this.zLs.bIf();
    AppMethodBeat.o(35320);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(35321);
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    AppMethodBeat.o(35321);
    return bool;
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.SearchConversationResultUI
 * JD-Core Version:    0.6.2
 */