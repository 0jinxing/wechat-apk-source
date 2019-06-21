package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.widget.MMEditText;

public class LuckyMoneyTextInputView extends LinearLayout
  implements c
{
  private TextView iDT;
  private g nSr;
  private MMEditText nTP;
  LinearLayout ohX;
  ImageView ohY;
  BaseEmojiView ohZ;
  private View.OnClickListener oia;

  public LuckyMoneyTextInputView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(43038);
    paramContext = LayoutInflater.from(paramContext).inflate(2130969998, this, true);
    this.nTP = ((MMEditText)paramContext.findViewById(2131825665));
    this.iDT = ((TextView)paramContext.findViewById(2131825664));
    this.ohX = ((LinearLayout)paramContext.findViewById(2131825666));
    this.ohY = ((ImageView)paramContext.findViewById(2131825667));
    this.ohZ = ((BaseEmojiView)paramContext.findViewById(2131825470));
    this.nTP.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(43036);
        if (LuckyMoneyTextInputView.a(LuckyMoneyTextInputView.this) != null)
        {
          paramAnonymousView = LuckyMoneyTextInputView.a(LuckyMoneyTextInputView.this);
          LuckyMoneyTextInputView.this.getInputViewId();
          paramAnonymousView.bLa();
        }
        AppMethodBeat.o(43036);
      }
    });
    this.ohX.setOnClickListener(new LuckyMoneyTextInputView.2(this));
    this.ohX.setVisibility(8);
    AppMethodBeat.o(43038);
  }

  public final int bKW()
  {
    return 0;
  }

  public String getInput()
  {
    AppMethodBeat.i(43039);
    String str = this.nTP.getText().toString();
    AppMethodBeat.o(43039);
    return str;
  }

  public int getInputViewId()
  {
    AppMethodBeat.i(43044);
    int i = getId();
    AppMethodBeat.o(43044);
    return i;
  }

  public final void iO(boolean paramBoolean)
  {
    AppMethodBeat.i(43042);
    if (paramBoolean)
    {
      this.ohX.setVisibility(8);
      AppMethodBeat.o(43042);
    }
    while (true)
    {
      return;
      this.ohX.setVisibility(0);
      this.ohY.setVisibility(0);
      this.ohZ.setVisibility(8);
      AppMethodBeat.o(43042);
    }
  }

  public final void onError()
  {
  }

  public final void restore()
  {
  }

  public void setHintText(String paramString)
  {
    AppMethodBeat.i(43040);
    this.nTP.setHint(paramString);
    AppMethodBeat.o(43040);
  }

  public void setOnInputValidChangerListener(g paramg)
  {
    this.nSr = paramg;
  }

  public void setTitle(String paramString)
  {
    AppMethodBeat.i(43041);
    this.iDT.setText(paramString);
    AppMethodBeat.o(43041);
  }

  public void setmOnEmojiSelectClickListener(View.OnClickListener paramOnClickListener)
  {
    this.oia = paramOnClickListener;
  }

  public final String xH(int paramInt)
  {
    return null;
  }

  public final void z(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(43043);
    this.ohX.setTag("delete");
    this.ohY.setVisibility(8);
    this.ohZ.setVisibility(0);
    this.ohZ.setEmojiInfo(paramEmojiInfo);
    AppMethodBeat.o(43043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView
 * JD-Core Version:    0.6.2
 */