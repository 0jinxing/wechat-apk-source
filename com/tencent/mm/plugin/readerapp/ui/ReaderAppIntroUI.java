package com.tencent.mm.plugin.readerapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class ReaderAppIntroUI extends MMActivity
{
  private int cJB = 0;

  public final int getLayoutId()
  {
    return 2130970460;
  }

  public final void initView()
  {
    AppMethodBeat.i(76801);
    ImageView localImageView = (ImageView)findViewById(2131826841);
    TextView localTextView = (TextView)findViewById(2131826842);
    this.cJB = getIntent().getIntExtra("type", 0);
    if (this.cJB == 20)
    {
      setMMTitle(2131300497);
      localImageView.setImageResource(2130839990);
      localTextView.setText(2131298638);
    }
    setBackBtn(new ReaderAppIntroUI.1(this));
    addIconOptionMenu(0, 2131230758, new ReaderAppIntroUI.2(this));
    AppMethodBeat.o(76801);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(76800);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(76800);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.ui.ReaderAppIntroUI
 * JD-Core Version:    0.6.2
 */