package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class ResourcesExceedUI extends MMActivity
{
  private int type = 0;
  private TextView yLY;

  public final int getLayoutId()
  {
    return 2130970524;
  }

  public final void initView()
  {
    AppMethodBeat.i(30986);
    setBackBtn(new ResourcesExceedUI.1(this));
    this.yLY = ((TextView)findViewById(2131823352));
    switch (this.type)
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(30986);
      while (true)
      {
        return;
        this.yLY.setText(2131304251);
        AppMethodBeat.o(30986);
        continue;
        this.yLY.setText(2131299789);
        AppMethodBeat.o(30986);
      }
      this.yLY.setText(2131300610);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30985);
    super.onCreate(paramBundle);
    this.type = getIntent().getIntExtra("clean_view_type", 0);
    setMMTitle("");
    initView();
    AppMethodBeat.o(30985);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(30987);
    super.onDestroy();
    AppMethodBeat.o(30987);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ResourcesExceedUI
 * JD-Core Version:    0.6.2
 */