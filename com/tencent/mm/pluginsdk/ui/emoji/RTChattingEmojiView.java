package com.tencent.mm.pluginsdk.ui.emoji;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class RTChattingEmojiView extends FrameLayout
{
  private EmojiInfo kZa;
  private int mStatus = -1;
  private boolean ngN = true;
  private TextView sLY;
  private int vpL;
  private int vpM;
  private int vpN;
  private int vpO;
  private int vpP;
  public ChattingEmojiView vpQ;
  private ProgressBar vpR;
  private FrameLayout.LayoutParams vpS;
  private FrameLayout.LayoutParams vpT;

  public RTChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public RTChattingEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private void Ln(int paramInt)
  {
    AppMethodBeat.i(62497);
    this.mStatus = paramInt;
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(62497);
      while (true)
      {
        return;
        this.vpR.setVisibility(0);
        this.sLY.setVisibility(4);
        this.vpQ.setVisibility(4);
        setBackgroundResource(2130840857);
        AppMethodBeat.o(62497);
        continue;
        this.vpR.setVisibility(0);
        this.sLY.setVisibility(4);
        this.vpQ.setVisibility(4);
        setBackgroundResource(2130838277);
        AppMethodBeat.o(62497);
        continue;
        Drawable localDrawable = getResources().getDrawable(2130838563);
        localDrawable.setBounds(0, 0, this.vpN, this.vpN);
        ab.d("MicroMsg.emoji.RTChattingEmojiView", "iconSize:%d hashcode:%d", new Object[] { Integer.valueOf(this.vpN), Integer.valueOf(hashCode()) });
        this.sLY.setCompoundDrawables(null, localDrawable, null, null);
        this.sLY.setText(2131299078);
        this.sLY.setVisibility(0);
        this.vpR.setVisibility(4);
        this.vpQ.setVisibility(4);
        setBackgroundResource(2130838277);
        AppMethodBeat.o(62497);
      }
      this.vpQ.setVisibility(0);
      this.vpR.setVisibility(4);
      this.sLY.setVisibility(4);
      setBackgroundResource(2130840857);
    }
  }

  public final void a(EmojiInfo paramEmojiInfo, long paramLong)
  {
    AppMethodBeat.i(62493);
    a(paramEmojiInfo, paramLong, new ap(""));
    AppMethodBeat.o(62493);
  }

  public final void a(EmojiInfo paramEmojiInfo, long paramLong, ap paramap)
  {
    boolean bool1 = false;
    AppMethodBeat.i(62494);
    ab.i("MicroMsg.emoji.RTChattingEmojiView", "setEmojiInfo %s msgId %s", new Object[] { paramEmojiInfo.field_md5, Long.valueOf(paramLong) });
    this.kZa = paramEmojiInfo;
    boolean bool2;
    if (this.kZa.xy())
    {
      this.vpQ.setStatus(1);
      Ln(2);
      Object localObject = ((j)g.K(j.class)).bOr().jf(paramLong);
      if ((((cy)localObject).field_status == 2) || (((cy)localObject).field_status == 3) || (((cy)localObject).field_status == 5))
      {
        bool2 = true;
        localObject = this.vpQ;
        if (!paramap.fWX)
          bool1 = true;
        ((ChattingEmojiView)localObject).a(bool1, bool2, ((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().o(paramEmojiInfo), ((PluginEmoji)g.M(PluginEmoji.class)).getEmojiMgr().p(paramEmojiInfo), paramEmojiInfo.getName(), String.valueOf(paramLong + paramEmojiInfo.getName()));
        AppMethodBeat.o(62494);
      }
    }
    while (true)
    {
      return;
      bool2 = false;
      break;
      this.ngN = true;
      this.vpQ.setStatusListener(new RTChattingEmojiView.1(this));
      this.vpQ.a(this.kZa, paramLong);
      AppMethodBeat.o(62494);
    }
  }

  public final void dkQ()
  {
    AppMethodBeat.i(62491);
    this.vpT.gravity = 3;
    addView(this.vpQ, this.vpT);
    AppMethodBeat.o(62491);
  }

  public final void dkR()
  {
    AppMethodBeat.i(62492);
    this.vpT.gravity = 5;
    addView(this.vpQ, this.vpT);
    AppMethodBeat.o(62492);
  }

  public void initView()
  {
    AppMethodBeat.i(62490);
    this.vpL = getContext().getResources().getDimensionPixelSize(2131428381);
    this.vpM = getContext().getResources().getDimensionPixelSize(2131428378);
    this.vpO = getContext().getResources().getDimensionPixelSize(2131428384);
    this.vpP = getContext().getResources().getDimensionPixelSize(2131428383);
    this.vpQ = new ChattingEmojiView(getContext());
    this.vpR = new ProgressBar(getContext());
    this.vpR.setIndeterminateDrawable(getResources().getDrawable(2130839888));
    this.sLY = new TextView(getContext());
    this.sLY.setText(2131299078);
    this.sLY.setTextColor(getResources().getColor(2131689978));
    this.vpS = new FrameLayout.LayoutParams(-2, -2);
    this.vpT = new FrameLayout.LayoutParams(-2, -2);
    this.vpS.gravity = 17;
    addView(this.vpR, this.vpS);
    addView(this.sLY, this.vpS);
    AppMethodBeat.o(62490);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(62499);
    super.onAttachedToWindow();
    AppMethodBeat.o(62499);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(62500);
    super.onDetachedFromWindow();
    AppMethodBeat.o(62500);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62498);
    if ((this.mStatus == 0) || (this.mStatus == 1) || (this.mStatus == 3))
      if ((this.kZa != null) && (this.kZa.field_height != 0))
      {
        paramInt1 = (int)(this.kZa.field_height * this.vpQ.getEmojiDensityScale());
        if (paramInt1 >= this.vpM)
        {
          paramInt2 = paramInt1;
          if (paramInt1 > this.vpL)
            paramInt2 = this.vpL;
          this.vpN = this.vpO;
          if ((paramInt2 >= this.vpM) && (paramInt2 < this.vpM + (this.vpO - this.vpP)))
            this.vpN = (this.vpP + (paramInt2 - this.vpM));
          paramInt1 = this.vpL;
          setMeasuredDimension(paramInt1, paramInt2);
          super.onMeasure(View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
          Ln(this.mStatus);
          AppMethodBeat.o(62498);
        }
      }
    while (true)
    {
      return;
      paramInt1 = this.vpM;
      break;
      paramInt1 = this.vpL;
      break;
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(62498);
    }
  }

  public boolean performClick()
  {
    boolean bool = true;
    AppMethodBeat.i(62496);
    ab.i("MicroMsg.emoji.RTChattingEmojiView", "performClick: %s", new Object[] { Integer.valueOf(this.mStatus) });
    if (this.mStatus == 3)
    {
      this.ngN = false;
      this.vpQ.reload();
      AppMethodBeat.o(62496);
    }
    while (true)
    {
      return bool;
      if (this.mStatus == 2)
      {
        bool = super.performClick();
        AppMethodBeat.o(62496);
      }
      else
      {
        ab.d("MicroMsg.emoji.RTChattingEmojiView", "do nothing when loading");
        AppMethodBeat.o(62496);
      }
    }
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(62495);
    Ln(2);
    if ((this.vpQ != null) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      paramBitmap.setDensity(this.vpQ.getEmojiDensity());
      this.vpQ.setImageBitmap(paramBitmap);
    }
    AppMethodBeat.o(62495);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView
 * JD-Core Version:    0.6.2
 */