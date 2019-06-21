package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.y;
import com.tencent.mm.plugin.game.widget.GameSmallAvatarList;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedSocialInfoView extends LinearLayout
{
  private TextView kEq;
  private LinearLayout niL;
  private GameSmallAvatarList niM;
  private TextView niN;
  private LinearLayout niO;

  public GameFeedSocialInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111948);
    super.onFinishInflate();
    this.niL = ((LinearLayout)findViewById(2131824643));
    this.niM = ((GameSmallAvatarList)findViewById(2131824644));
    this.niN = ((TextView)findViewById(2131824645));
    this.niO = ((LinearLayout)findViewById(2131821095));
    this.kEq = ((TextView)findViewById(2131824646));
    AppMethodBeat.o(111948);
  }

  public void setData(y paramy)
  {
    AppMethodBeat.i(111949);
    if ((!bo.ek(paramy.nar)) || (paramy.nas != null))
    {
      this.niL.setVisibility(0);
      this.niM.setData(paramy.nar);
      if (paramy.nas != null)
      {
        this.niN.setText(paramy.nas);
        this.niN.setVisibility(0);
        if (paramy.Desc == null)
          break label123;
        this.niO.setVisibility(0);
        this.kEq.setText(paramy.Desc);
        AppMethodBeat.o(111949);
      }
    }
    while (true)
    {
      return;
      this.niN.setVisibility(8);
      break;
      this.niL.setVisibility(8);
      break;
      label123: this.niO.setVisibility(8);
      AppMethodBeat.o(111949);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedSocialInfoView
 * JD-Core Version:    0.6.2
 */