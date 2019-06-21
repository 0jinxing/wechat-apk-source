package com.tencent.mm.view.popview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager.LayoutParams;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.EmojiStatusView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class EmojiPopView extends AbstractPopView
{
  private EmojiStatusView AdR;
  private WindowManager.LayoutParams AdS;
  private String AdT;
  private int offsetY;
  private ProgressBar ppY;

  public EmojiPopView(Context paramContext)
  {
    this(paramContext, null);
  }

  public EmojiPopView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EmojiPopView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(63064);
    inflate(paramContext, 2130969344, this);
    this.AdR = ((EmojiStatusView)findViewById(2131820629));
    this.ppY = ((ProgressBar)findViewById(2131821370));
    setBackgroundResource(2130838538);
    this.AdS = new WindowManager.LayoutParams(2, 264, 1);
    paramInt = paramContext.getResources().getDimensionPixelSize(2131428375);
    this.AdS.width = paramInt;
    this.AdS.height = paramInt;
    this.AdS.gravity = 8388659;
    this.offsetY = paramContext.getResources().getDimensionPixelSize(2131428373);
    AppMethodBeat.o(63064);
  }

  public final void fw(View paramView)
  {
    AppMethodBeat.i(63066);
    int[] arrayOfInt = new int[2];
    paramView.getLocationInWindow(arrayOfInt);
    this.AdS.x = (arrayOfInt[0] - (this.AdS.width - paramView.getMeasuredWidth()) / 2);
    this.AdS.y = (arrayOfInt[1] - this.AdS.height + this.offsetY);
    AppMethodBeat.o(63066);
  }

  public WindowManager.LayoutParams getWindowLayoutParams()
  {
    return this.AdS;
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(63067);
    super.onDetachedFromWindow();
    AppMethodBeat.o(63067);
  }

  public void setEmojiInfo(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63065);
    if (paramEmojiInfo == null)
    {
      this.AdR.setVisibility(4);
      this.ppY.setVisibility(0);
      ab.i("MicroMsg.EmojiPopView", "emoji is null. set null");
      AppMethodBeat.o(63065);
    }
    while (true)
    {
      return;
      if (!paramEmojiInfo.Aq().equals(this.AdT))
      {
        this.AdT = paramEmojiInfo.Aq();
        this.AdR.setStatusListener(new EmojiPopView.1(this));
        this.AdR.setEmojiInfo(paramEmojiInfo);
      }
      AppMethodBeat.o(63065);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.popview.EmojiPopView
 * JD-Core Version:    0.6.2
 */